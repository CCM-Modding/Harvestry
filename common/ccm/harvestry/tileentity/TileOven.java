package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.harvestry.block.machines.BlockOven;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.FunctionHelper;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.TileBase;
import ccm.nucleum_omnium.utils.lib.TileConstant;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileOven extends TileBase {
    
    private final OvenRecipes recipe   = OvenRecipes.cooking();
    
    /** The number of ticks that the current item has been cooking for */
    public int                cookTime = 0;
    
    private static int        invSize  = 4;
    
    /**
     * Creates a new {@link TileOven} Instance.
     */
    public TileOven() {
        super(TileOven.invSize, TileConstants.OVEN_UNLOCALIZED);
    }
    
    /**
     * Returns true if the oven can cook an item, i.e. has a source item, destination stack isn't full, etc.
     */
    public boolean canCook() {
        if (hasFuel()) {
            if (recipe.getCookingResult(inventory[0]) != null) {
                final ItemStack itemstack = recipe.getCookingResult(inventory[0]).getOutput1();
                if (inventory[2] == null) {
                    return true;
                }
                if (!inventory[2].isItemEqual(itemstack)) {
                    return false;
                }
                final int result = inventory[2].stackSize + itemstack.stackSize;
                if (recipe.getCookingResult(inventory[0]).hasSecondOutput()) {
                    final ItemStack itemstack2 = recipe.getCookingResult(inventory[0]).getOutput2();
                    if (inventory[3] == null) {
                        return true;
                    }
                    if (!inventory[3].isItemEqual(itemstack2)) {
                        return false;
                    }
                    final int result2 = inventory[3].stackSize + itemstack2.stackSize;
                    return (result <= getInventoryStackLimit())
                           && (result <= itemstack.getMaxStackSize())
                           && (result2 <= getInventoryStackLimit())
                           && (result2 <= itemstack2.getMaxStackSize());
                } else {
                    return (result <= getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    /**
     * Turn one item from the oven source stack into the appropriate cooked item in the furnace result stack
     */
    private void cookItem() {
        if (canCook()) {
            final ItemStack itemstack = recipe.getCookingResult(inventory[0]).getOutput1();
            if (inventory[2] == null) {
                inventory[2] = itemstack.copy();
            } else if (inventory[2].isItemEqual(itemstack)) {
                inventory[2].stackSize += itemstack.stackSize;
            }
            if (recipe.getCookingResult(inventory[0]).hasSecondOutput()) {
                final ItemStack itemstack2 = recipe.getCookingResult(inventory[0]).getOutput2();
                if (inventory[3] == null) {
                    inventory[3] = itemstack2.copy();
                } else if (inventory[3].isItemEqual(itemstack2)) {
                    inventory[3].stackSize += itemstack2.stackSize;
                }
            }
            --inventory[0].stackSize;
            if (inventory[0].stackSize <= 0) {
                inventory[0] = null;
            }
        }
    }
    
    /**
     * Returns an integer between 0 and the passed value representing how close the current item is to being completely cooked
     */
    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(final int scale) {
        return (cookTime * scale) / 200;
    }
    
    private boolean hasFuel() {
        if ((inventory[0] != null) && (inventory[1] != null)) {
            if (FunctionHelper.isSunVisible(getWorldObj(), xCoord, yCoord + 1, zCoord) || FunctionHelper.isFireBelow(getWorldObj(), xCoord, yCoord - 1, zCoord)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        setInventory(InventoryHelper.readInventoryFromNBT(nbt.getTagList(TileConstant.INVENTORY), TileOven.invSize));
    }
    
    @Override
    public void updateEntity() {
        if (!worldObj.isRemote) {
            if (canCook()) {
                ItemHelper.damageItem(inventory, 1, 3);
                BlockOven.updateBlockState(true, worldObj, xCoord, yCoord, zCoord);
                ++cookTime;
                if (cookTime == 200) {
                    cookTime = 0;
                    cookItem();
                    onInventoryChanged();
                    BlockOven.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
                }
            } else {
                cookTime = 0;
                BlockOven.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
            }
        }
    }
    
    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(final NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setTag(TileConstant.INVENTORY, InventoryHelper.writeInventoryToNBT(getInventory()));
    }
}