/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.tileentity.logic;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.logic.GUILogic;
import ccm.nucleum_omnium.utils.helper.FunctionHelper;
import ccm.nucleum_omnium.utils.helper.InventoryHelper;
import ccm.nucleum_omnium.utils.helper.ItemHelper;

public class OvenLogic extends GUILogic
{

    private final ActiveTE te;

    private final OvenRecipes recipes = OvenRecipes.instance();

    private final int inputSlot = 0;

    private final int fuelSlot = 1;

    private final int outSlot = 2;

    private final int outSlot2 = 3;

    public OvenLogic(final TileEntity te)
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
                if (progress == getMaxTime(te.getStackInSlot(inputSlot)))
                {
                    progress = 0;
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
        if (hasHeat())
        {
            if (te.getStackInSlot(inputSlot) != null)
            {
                if (te.getStackInSlot(fuelSlot) != null)
                {
                    if (recipes.getResult(te.getStackInSlot(inputSlot)) != null)
                    {

                        final ItemStack itemstack = recipes.getResult(te.getStackInSlot(inputSlot)).getOutput();

                        if (te.getStackInSlot(outSlot) == null)
                        {
                            return true;
                        }
                        if (!te.getStackInSlot(outSlot).isItemEqual(itemstack))
                        {
                            return false;
                        }

                        final int result = te.getStackInSlot(outSlot).stackSize + itemstack.stackSize;

                        if (recipes.getResult(te.getStackInSlot(inputSlot)).hasSecondOutput())
                        {

                            final ItemStack itemstack2 = recipes.getResult(te.getStackInSlot(inputSlot)).getOutput2();
                            if (te.getStackInSlot(outSlot2) == null)
                            {
                                return true;
                            }
                            if (!te.getStackInSlot(outSlot2).isItemEqual(itemstack2))
                            {
                                return false;
                            }

                            final int result2 = te.getStackInSlot(outSlot2).stackSize + itemstack2.stackSize;

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

            ItemStack itemstack = recipes.getResult(te.getStackInSlot(inputSlot)).getOutput();

            if (te.getStackInSlot(outSlot) == null)
            {
                te.setInventorySlotContents(outSlot, itemstack.copy());
            } else if (te.getStackInSlot(outSlot).isItemEqual(itemstack))
            {
                te.setInventorySlotContents(outSlot, ItemHelper.getUniun(te.getStackInSlot(outSlot), itemstack));
            }

            if (recipes.getResult(te.getStackInSlot(inputSlot)).hasSecondOutput())
            {

                itemstack = recipes.getResult(te.getStackInSlot(inputSlot)).getOutput2();

                if (te.getStackInSlot(outSlot2) == null)
                {
                    te.setInventorySlotContents(outSlot2, itemstack.copy());
                } else if (te.getStackInSlot(outSlot2).isItemEqual(itemstack))
                {
                    te.setInventorySlotContents(outSlot2, ItemHelper.getUniun(te.getStackInSlot(outSlot2), itemstack));
                }
            }

            if (te.getStackInSlot(inputSlot).stackSize <= 0)
            {
                InventoryHelper.setEmty(te, inputSlot);
            }

            te.decrStackSize(inputSlot, 1);
        }
    }

    private boolean hasHeat()
    {
        if (FunctionHelper.isFireBelow(te.worldObj, te.xCoord, te.yCoord, te.zCoord))
        {
            return true;
        }
        if (FunctionHelper.isSunVisible(te.worldObj, te.xCoord, te.yCoord, te.zCoord))
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean isStackValidForSlot(final int slot, final ItemStack itemstack)
    {
        return false;
    }
}