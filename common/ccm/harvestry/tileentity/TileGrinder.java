package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import ccm.harvestry.api.recipes.GrinderRecipes;
import ccm.harvestry.block.machines.BlockGrinder;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileGrinder extends ActiveTE {
    
    private final GrinderRecipes recipe          = GrinderRecipes.grinding();
    
    /** The number of ticks that the current item has been grinding for */
    public int                   grinderCookTime = 0;
    
    /** The time that the item allows has to be used */
    private static final int     invSize         = 4;
    
    /**
     * Creates a new {@link TileGrinder} Instance.
     */
    public TileGrinder() {
        super(TileGrinder.invSize, TileConstants.GRINDER_UNLOCALIZED);
    }
    
    /**
     * Returns true if the grinder can grind an item, i.e. has a source item, destination stack isn't full, etc.
     */
    public boolean canGrind() {
        if (inventory[0] != null) {
            if ((inventory[1] != null) && (inventory[2] != null)) {
                if (recipe.getGrindingResult(inventory[0]) != null) {
                    final ItemStack itemstack = recipe.getGrindingResult(inventory[0]).getOutput1();
                    if (inventory[3] == null) {
                        return true;
                    }
                    if (!inventory[3].isItemEqual(itemstack)) {
                        return false;
                    }
                    final int result = inventory[3].stackSize + itemstack.stackSize;
                    return (result <= getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    /**
     * Returns an integer between 0 and the passed value representing how close the current item is to being completely cooked
     */
    @SideOnly(Side.CLIENT)
    public int getGrindProgressScaled(final int scale) {
        return (grinderCookTime * scale) / 200;
    }
    
    /**
     * Turn one item from the grinder source stack into the appropriate ground item in the grinder result stack
     */
    public void grindItem() {
        if (canGrind()) {
            final ItemStack itemstack = recipe.getGrindingResult(inventory[0]).getOutput1();
            if (inventory[3] == null) {
                inventory[3] = itemstack.copy();
            } else if (inventory[3].isItemEqual(itemstack)) {
                inventory[3].stackSize += itemstack.stackSize;
            }
            --inventory[0].stackSize;
            if (inventory[0].stackSize <= 0) {
                inventory[0] = null;
            }
        }
    }
    
    @Override
    public void updateEntity() {
        if (!worldObj.isRemote) {
            if (canGrind()) {
                ItemHelper.damageItem(inventory, 1, 3);
                ItemHelper.damageItem(inventory, 2, 3);
                BlockGrinder.updateBlockState(true, worldObj, xCoord, yCoord, zCoord);
                ++grinderCookTime;
                if (grinderCookTime == 200) {
                    grinderCookTime = 0;
                    grindItem();
                    onInventoryChanged();
                    BlockGrinder.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
                }
            } else {
                grinderCookTime = 0;
                BlockGrinder.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
            }
        }
    }
}