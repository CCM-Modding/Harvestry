package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileRoller implements IGUITileLogic {
    
    private final RollerRecipes recipe         = RollerRecipes.instance();
    
    /** The number of ticks that the current item has been rolling for */
    public int                  rollerCookTime = 0;
    
    /** The time that the item allows has to be used */
    private static final int    invSize        = 4;
    
    /**
     * Creates a new {@link TileRoller} Instance.
     */
    public TileRoller() {
        super(TileRoller.invSize, TileConstants.ROLLER_UNLOCALIZED);
    }
    
    /**
     * Returns true if the roller can roll an item, i.e. has a source item, destination stack isn't full, etc.
     */
    public boolean canRoll() {
        if (inventory[0] != null) {
            if ((inventory[1] != null) && (inventory[2] != null)) {
                if (recipe.getRollingResult(inventory[0]) != null) {
                    final ItemStack itemstack = recipe.getRollingResult(inventory[0]).getOutput1();
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
    public int getRollProgressScaled(final int scale) {
        return (rollerCookTime * scale) / 200;
    }
    
    /**
     * Turn one item from the roller source stack into the appropriate ground item in the roller result stack
     */
    public void rollItem() {
        if (canRoll()) {
            final ItemStack itemstack = recipe.getRollingResult(inventory[0]).getOutput1();
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
            if (canRoll()) {
                ItemHelper.damageItem(inventory, 1, 3);
                ItemHelper.damageItem(inventory, 2, 3);
                BlockRoller.updateBlockState(true, worldObj, xCoord, yCoord, zCoord);
                ++rollerCookTime;
                if (rollerCookTime == 200) {
                    rollerCookTime = 0;
                    rollItem();
                    onInventoryChanged();
                    BlockRoller.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
                }
            } else {
                rollerCookTime = 0;
                BlockRoller.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
            }
        }
    }
}