package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.harvestry.block.machines.BlockGrill;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.FunctionHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileGrill extends ActiveTE {
    
    private final GrillRecipes recipe    = GrillRecipes.instance();
    
    /** The number of ticks that the current item has been cooking for */
    public int                 grillTime = 0;
    
    private static int         invSize   = 4;
    
    /**
     * Creates a new {@link TileGrill} Instance.
     */
    public TileGrill() {
        super(TileGrill.invSize, TileConstants.GRILL_UNLOCALIZED);
    }
    
    /**
     * Returns true if the grill can cook an item, i.e. has a source item, destination stack isn't full, etc.
     */
    public boolean canGrill() {
        if (hasFuel()) {
            if (recipe.getGrillingResult(inventory[0]) != null) {
                final ItemStack itemstack = recipe.getGrillingResult(inventory[0]).getOutput1();
                if (inventory[2] == null) {
                    return true;
                }
                if (!inventory[2].isItemEqual(itemstack)) {
                    return false;
                }
                final int result = inventory[2].stackSize + itemstack.stackSize;
                if (recipe.getGrillingResult(inventory[0]).hasSecondOutput()) {
                    final ItemStack itemstack2 = recipe.getGrillingResult(inventory[0]).getOutput2();
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
     * Turn one item from the grill source stack into the appropriate cooked item in the furnace result stack
     */
    private void grillItem() {
        if (canGrill()) {
            final ItemStack itemstack = recipe.getGrillingResult(inventory[0]).getOutput1();
            if (inventory[2] == null) {
                inventory[2] = itemstack.copy();
            } else if (inventory[2].isItemEqual(itemstack)) {
                inventory[2].stackSize += itemstack.stackSize;
            }
            if (recipe.getGrillingResult(inventory[0]).hasSecondOutput()) {
                final ItemStack itemstack2 = recipe.getGrillingResult(inventory[0]).getOutput2();
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
    public int getGrillProgressScaled(final int scale) {
        return (grillTime * scale) / 200;
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
    
    @Override
    public void updateEntity() {
        if (!worldObj.isRemote) {
            if (canGrill()) {
                ItemHelper.damageItem(inventory, 1, 3);
                BlockGrill.updateBlockState(true, worldObj, xCoord, yCoord, zCoord);
                ++grillTime;
                if (grillTime == 200) {
                    grillTime = 0;
                    grillItem();
                    onInventoryChanged();
                    BlockGrill.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
                }
            } else {
                grillTime = 0;
                BlockGrill.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
            }
        }
    }
}