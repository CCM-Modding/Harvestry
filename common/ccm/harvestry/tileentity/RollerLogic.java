package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;

public class RollerLogic implements IGUITileLogic {
    
    private ActiveTE             te;
    
    private final RollerRecipes recipes         = RollerRecipes.instance();
    
    /** The number of ticks that the current item has been Rolling for */
    public int                   rollerCookTime = 0;
    
    public RollerLogic(TileEntity te) {
        this.te = (ActiveTE) te;
    }
    
    @Override
    public int getProgressScaled(int scale) {
        return (rollerCookTime * scale) / 200;
    }
    
    @Override
    public int getTimeLeft() {
        return rollerCookTime;
    }
    
    @Override
    public void setTimeLeft(final int time) {
        rollerCookTime = time;
    }
    
    @Override
    public void runLogic() {
        
        if (!this.te.worldObj.isRemote) {
            if (canRun()) {
                ItemHelper.damageItem(te.getInventory(), 1, 3);
                ItemHelper.damageItem(te.getInventory(), 2, 3);
                te.updateIfChanged(true);
                ++rollerCookTime;
                if (rollerCookTime == 200) {
                    rollerCookTime = 0;
                    run();
                    te.onInventoryChanged();
                    te.updateIfChanged(false);
                }
            } else {
                rollerCookTime = 0;
                te.updateIfChanged(false);
            }
        }
    }
    
    /**
     * Returns true if the roller can grind an item, i.e. has a source item, destination stack isn't full, etc.
     */
    public boolean canRun() {
        if (te.getStackInSlot(0) != null) {
            if ((te.getStackInSlot(1) != null) && (te.getStackInSlot(2) != null)) {
                if (recipes.getRollingResult(te.getStackInSlot(0)) != null) {
                    final ItemStack itemstack = recipes.getRollingResult(te.getStackInSlot(0)).getOutput1();
                    if (te.getStackInSlot(3) == null) {
                        return true;
                    }
                    if (!te.getStackInSlot(3).isItemEqual(itemstack)) {
                        return false;
                    }
                    final int result = te.getStackInSlot(3).stackSize + itemstack.stackSize;
                    return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
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
     * Turn one item from the roller source stack into the appropriate ground item in the roller result stack
     */
    public void run() {
        if (canRun()) {
            final ItemStack itemstack = recipes.getRollingResult(te.getStackInSlot(0)).getOutput1();
            if (te.getStackInSlot(3) == null) {
                te.setInventorySlotContents(3, itemstack.copy());
            } else if (te.getStackInSlot(3).isItemEqual(itemstack)) {
                te.getInventory()[3].stackSize += itemstack.stackSize;
            }
            --te.getInventory()[3].stackSize;
            if (te.getStackInSlot(0).stackSize <= 0) {
                te.setInventorySlotContents(0, null);
            }
        }
    }
}