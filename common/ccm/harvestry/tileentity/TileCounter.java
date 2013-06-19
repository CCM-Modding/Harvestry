package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.TileBase;
import ccm.nucleum_omnium.utils.lib.TileConstant;

public class TileCounter extends TileBase {
    
    private final CounterRecipes recipe          = CounterRecipes.cutting();
    
    /** The number of ticks that the current item has been cutting for */
    public int                   counterCookTime = 0;
    
    /** The time that the item allows has to be used */
    private static final int     invSize         = 21;
    
    /**
     * Creates a new {@link TileCounter} Instance.
     */
    public TileCounter() {
        super(TileCounter.invSize, TileConstants.COUNTER_UNLOCALIZED);
    }
    
    /**
     * Returns true if the counter can cut an item, i.e. has a source item,
     * destination stack isn't full, etc.
     */
    public boolean canCut() {
        if (this.hasFuel()) {
            if (this.recipe.getCuttingResult(this.inventory[0]) != null) {
                final ItemStack itemstack = this.recipe.getCuttingResult(this.inventory[0])
                        .getOutput1();
                if (this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack)] == null)
                    return true;
                if (!this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack)]
                        .isItemEqual(itemstack))
                    return false;
                final int result = this.inventory[InventoryHelper.getBestInventory(this.inventory,
                                                                                   3,
                                                                                   itemstack)].stackSize
                        + itemstack.stackSize;
                if (this.recipe.getCuttingResult(this.inventory[0]).hasSecondOutput()) {
                    final ItemStack itemstack2 = this.recipe.getCuttingResult(this.inventory[0])
                            .getOutput2();
                    if (this.inventory[InventoryHelper.getBestInventory(this.inventory,
                                                                        3,
                                                                        itemstack2)] == null)
                        return true;
                    if (!this.inventory[InventoryHelper.getBestInventory(this.inventory,
                                                                         3,
                                                                         itemstack2)]
                            .isItemEqual(itemstack2))
                        return false;
                    final int result2 = this.inventory[InventoryHelper
                            .getBestInventory(this.inventory, 3, itemstack2)].stackSize
                            + itemstack2.stackSize;
                    return result <= this.getInventoryStackLimit()
                            && result <= itemstack.getMaxStackSize()
                            && result2 <= this.getInventoryStackLimit()
                            && result2 <= itemstack2.getMaxStackSize();
                } else
                    return result <= this.getInventoryStackLimit()
                            && result <= itemstack.getMaxStackSize();
            } else
                return false;
        } else
            return false;
    }
    
    /**
     * Turn one item from the oven source stack into the appropriate cut item in
     * the counter result stack
     */
    private void cutItem() {
        if (this.canCut()) {
            final ItemStack itemstack = this.recipe.getCuttingResult(this.inventory[0])
                    .getOutput1();
            if (this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack)] == null)
                this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack)] = itemstack
                        .copy();
            else if (this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack)]
                    .isItemEqual(itemstack))
                this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack)].stackSize += itemstack.stackSize;
            if (this.recipe.getCuttingResult(this.inventory[0]).hasSecondOutput()) {
                final ItemStack itemstack2 = this.recipe.getCuttingResult(this.inventory[0])
                        .getOutput2();
                if (this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack2)] == null)
                    this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack2)] = itemstack2
                            .copy();
                else if (this.inventory[InventoryHelper.getBestInventory(this.inventory,
                                                                         3,
                                                                         itemstack2)]
                        .isItemEqual(itemstack2))
                    this.inventory[InventoryHelper.getBestInventory(this.inventory, 3, itemstack2)].stackSize += itemstack2.stackSize;
            }
            --this.inventory[0].stackSize;
            if (this.inventory[0].stackSize <= 0)
                this.inventory[0] = null;
        }
    }
    
    @Override
    public void updateEntity() {
        if (!this.worldObj.isRemote)
            if (this.canCut()) {
                ItemHelper.damageItem(this.inventory, 1, 1);
                ItemHelper.damageItem(this.inventory, 2, 1);
                this.cutItem();
                this.onInventoryChanged();
            }
    }
    
    private boolean hasFuel() {
        if (this.inventory[1] != null && this.inventory[2] != null && this.inventory[0] != null)
            return true;
        else
            return false;
    }
    
    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.setInventory(InventoryHelper.readInventoryFromNBT(nbt
                .getTagList(TileConstant.INVENTORY), TileCounter.invSize));
    }
    
    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(final NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setTag(TileConstant.INVENTORY, InventoryHelper.writeInventoryToNBT(this.getInventory()));
    }
}
