/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.tileentity.logic;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.nucleum.omnium.tileentity.ActiveTE;
import ccm.nucleum.omnium.tileentity.logic.GUILogic;
import ccm.nucleum.omnium.utils.helper.item.InventoryHelper;
import ccm.nucleum.omnium.utils.helper.item.ItemHelper;

public class GrillLogic extends GUILogic
{

    private final ActiveTE te;

    private final GrillRecipes recipes = GrillRecipes.instance();

    private final int fuelSlot = 0;

    public GrillLogic(final TileEntity te)
    {
        this.te = (ActiveTE) te;
    }

    @Override
    public void runLogic()
    {

        if (!te.worldObj.isRemote)
        {
            if (canRun())
            {
                ItemHelper.damageItem(te, fuelSlot, 3);
                te.setState(true);
                ++progress;
                if (progress == getMaxTime(te.getStackInSlot(fuelSlot)))
                {
                    progress = 0;

                    final ItemStack tmp = te.getStackInSlot(fuelSlot);
                    --tmp.stackSize;
                    te.setInventorySlotContents(fuelSlot, tmp);

                    run();
                    te.onInventoryChanged();
                    te.setState(false);
                }
            } else
            {
                progress = 0;
                te.setState(false);
            }
        }
    }

    @Override
    public boolean canRun()
    {
        for (int currentInput = 0; currentInput < 9; currentInput++)
        {
            if (te.getStackInSlot(currentInput) != null)
            {
                if (te.getStackInSlot(fuelSlot) != null)
                {
                    if (recipes.getResult(te.getStackInSlot(currentInput)) != null)
                    {

                        final ItemStack itemstack = recipes.getResult(te.getStackInSlot(currentInput)).getOutput().getWrappedStack();
                        int bestSlot = InventoryHelper.getBestSlot(te, 10, 19, itemstack);

                        if (te.getStackInSlot(bestSlot) == null)
                        {
                            return true;
                        }
                        if (!te.getStackInSlot(bestSlot).isItemEqual(itemstack))
                        {
                            return false;
                        }

                        final int result = te.getStackInSlot(bestSlot).stackSize + itemstack.stackSize;

                        if (recipes.getResult(te.getStackInSlot(currentInput)).hasMultipleOutputs())
                        {

                            final ItemStack itemstack2 = recipes.getResult(te.getStackInSlot(currentInput)).getOutputs().get(1).getWrappedStack();
                            bestSlot = InventoryHelper.getBestSlot(te, 10, 19, itemstack2);

                            if (te.getStackInSlot(bestSlot) == null)
                            {
                                return true;
                            }
                            if (!te.getStackInSlot(bestSlot).isItemEqual(itemstack2))
                            {
                                return false;
                            }

                            final int result2 = te.getStackInSlot(bestSlot).stackSize + itemstack2.stackSize;

                            return ((result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize()))
                                    && ((result2 <= te.getInventoryStackLimit()) && (result2 <= itemstack2.getMaxStackSize()));
                        }

                        return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void run()
    {
        if (canRun())
        {
            for (int currentInput = 0; currentInput < 9; currentInput++)
            {

                ItemStack itemstack = recipes.getResult(te.getStackInSlot(currentInput)).getOutput().getWrappedStack();
                int bestSlot = InventoryHelper.getBestSlot(te, 10, 19, itemstack);

                if (te.getStackInSlot(bestSlot) == null)
                {
                    te.setInventorySlotContents(bestSlot, itemstack.copy());
                } else if (te.getStackInSlot(bestSlot).isItemEqual(itemstack))
                {
                    te.setInventorySlotContents(bestSlot, ItemHelper.getUniun(te.getStackInSlot(bestSlot), itemstack));
                }

                if (recipes.getResult(te.getStackInSlot(currentInput)).hasMultipleOutputs())
                {

                    itemstack = recipes.getResult(te.getStackInSlot(currentInput)).getOutputs().get(1).getWrappedStack();
                    bestSlot = InventoryHelper.getBestSlot(te, 10, 19, itemstack);

                    if (te.getStackInSlot(bestSlot) == null)
                    {
                        te.setInventorySlotContents(bestSlot, itemstack.copy());
                    } else if (te.getStackInSlot(bestSlot).isItemEqual(itemstack))
                    {
                        te.setInventorySlotContents(bestSlot, ItemHelper.getUniun(te.getStackInSlot(bestSlot), itemstack));
                    }
                }

                if (te.getStackInSlot(currentInput).stackSize <= 0)
                {
                    InventoryHelper.setEmty(te, currentInput);
                }

                te.decrStackSize(currentInput, 1);
            }
        }
    }

    @Override
    public boolean isStackValidForSlot(final int slot, final ItemStack itemstack)
    {
        return false;
    }
}