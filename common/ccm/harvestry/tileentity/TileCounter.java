package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.InventoryTE;

public class TileCounter extends InventoryTE {
    
    private final CounterRecipes recipe          = CounterRecipes.cutting();
    
    /** The number of ticks that the current item has been cutting for */
    public int                   counterCookTime = 0;
    
    /** The time that the item allows has to be used */
    private static final int     invSize         = 21;
    
    /**
     * Creates a new {@link TileCounter} Instance.
     */
    public TileCounter() {
        super(invSize, TileConstants.COUNTER_UNLOCALIZED);
    }
    
    @Override
    public void updateEntity() {
        if (!worldObj.isRemote) {
            if (canCut()) {
                ItemHelper.damageItem(inventory, 1, 1);
                ItemHelper.damageItem(inventory, 2, 1);
                cutItem();
                onInventoryChanged();
            }
        }
    }
    
    private boolean hasFuel() {
        if ((inventory[1] != null) && (inventory[2] != null) && (inventory[0] != null)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Turn one item from the oven source stack into the appropriate cut item in the counter result stack
     */
    private void cutItem() {
        if (canCut()) {
            final ItemStack itemstack = recipe.getCuttingResult(inventory[0]).getOutput1();
            if (inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack)] == null) {
                inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack)] = itemstack.copy();
            } else if (inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack)].isItemEqual(itemstack)) {
                inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack)].stackSize += itemstack.stackSize;
            }
            if (recipe.getCuttingResult(inventory[0]).hasSecondOutput()) {
                final ItemStack itemstack2 = recipe.getCuttingResult(inventory[0]).getOutput2();
                if (inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack2)] == null) {
                    inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack2)] = itemstack2.copy();
                } else if (inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack2)].isItemEqual(itemstack2)) {
                    inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack2)].stackSize += itemstack2.stackSize;
                }
            }
            --inventory[0].stackSize;
            if (inventory[0].stackSize <= 0) {
                inventory[0] = null;
            }
        }
    }
    
    /**
     * Returns true if the counter can cut an item, i.e. has a source item, destination stack isn't full, etc.
     */
    public boolean canCut() {
        if (hasFuel()) {
            if (recipe.getCuttingResult(inventory[0]) != null) {
                final ItemStack itemstack = recipe.getCuttingResult(inventory[0]).getOutput1();
                if (inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack)] == null) {
                    return true;
                }
                if (!inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack)].isItemEqual(itemstack)) {
                    return false;
                }
                final int result = inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack)].stackSize + itemstack.stackSize;
                if (recipe.getCuttingResult(inventory[0]).hasSecondOutput()) {
                    final ItemStack itemstack2 = recipe.getCuttingResult(inventory[0]).getOutput2();
                    if (inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack2)] == null) {
                        return true;
                    }
                    if (!inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack2)].isItemEqual(itemstack2)) {
                        return false;
                    }
                    final int result2 = inventory[InventoryHelper.getBestInventory(inventory, 3, itemstack2)].stackSize + itemstack2.stackSize;
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
}