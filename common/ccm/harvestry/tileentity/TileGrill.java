package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.harvestry.block.machines.BlockGrill;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum.helper.FunctionHelper;
import ccm.nucleum.helper.InventoryHelper;
import ccm.nucleum.helper.ItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileGrill extends TileBase {

    private final GrillRecipes recipe    = GrillRecipes.grilling();

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
     * Returns true if the grill can cook an item, i.e. has a source item,
     * destination stack isn't full, etc.
     */
    public boolean canGrill() {
        if (this.hasFuel()) {
            if (this.recipe.getGrillingResult(this.inventory[0]) != null) {
                final ItemStack itemstack = this.recipe.getGrillingResult(this.inventory[0])
                        .getOutput1();
                if (this.inventory[2] == null)
                    return true;
                if (!this.inventory[2].isItemEqual(itemstack))
                    return false;
                final int result = this.inventory[2].stackSize + itemstack.stackSize;
                if (this.recipe.getGrillingResult(this.inventory[0]).hasSecondOutput()) {
                    final ItemStack itemstack2 = this.recipe.getGrillingResult(this.inventory[0])
                            .getOutput2();
                    if (this.inventory[3] == null)
                        return true;
                    if (!this.inventory[3].isItemEqual(itemstack2))
                        return false;
                    final int result2 = this.inventory[3].stackSize + itemstack2.stackSize;
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
     * Turn one item from the grill source stack into the appropriate cooked
     * item in the furnace result stack
     */
    private void grillItem() {
        if (this.canGrill()) {
            final ItemStack itemstack = this.recipe.getGrillingResult(this.inventory[0])
                    .getOutput1();
            if (this.inventory[2] == null)
                this.inventory[2] = itemstack.copy();
            else if (this.inventory[2].isItemEqual(itemstack))
                this.inventory[2].stackSize += itemstack.stackSize;
            if (this.recipe.getGrillingResult(this.inventory[0]).hasSecondOutput()) {
                final ItemStack itemstack2 = this.recipe.getGrillingResult(this.inventory[0])
                        .getOutput2();
                if (this.inventory[3] == null)
                    this.inventory[3] = itemstack2.copy();
                else if (this.inventory[3].isItemEqual(itemstack2))
                    this.inventory[3].stackSize += itemstack2.stackSize;
            }
            --this.inventory[0].stackSize;
            if (this.inventory[0].stackSize <= 0)
                this.inventory[0] = null;
        }
    }

    /**
     * Returns an integer between 0 and the passed value representing how close
     * the current item is to being completely cooked
     */
    @SideOnly(Side.CLIENT)
    public int getGrillProgressScaled(final int scale) {
        return this.grillTime * scale / 200;
    }

    private boolean hasFuel() {
        if (this.inventory[0] != null && this.inventory[1] != null) {
            if (FunctionHelper.isSunVisible(this.getWorldObj(), this.xCoord, this.yCoord + 1,
                    this.zCoord)
                    || FunctionHelper.isFireBelow(this.getWorldObj(), this.xCoord, this.yCoord - 1,
                            this.zCoord))
                return true;
            else
                return false;
        } else
            return false;
    }

    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.setInventory(InventoryHelper.readInventoryFromNBT(
                nbt.getTagList(TileConstants.INVENTORY), TileGrill.invSize));
    }

    @Override
    public void updateEntity() {
        if (!this.worldObj.isRemote)
            if (this.canGrill()) {
                ItemHelper.damageItem(this.inventory, 1, 3);
                BlockGrill.updateBlockState(true, this.worldObj, this.xCoord, this.yCoord,
                        this.zCoord);
                ++this.grillTime;
                if (this.grillTime == 200) {
                    this.grillTime = 0;
                    this.grillItem();
                    this.onInventoryChanged();
                    BlockGrill.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord,
                            this.zCoord);
                }
            } else {
                this.grillTime = 0;
                BlockGrill.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord,
                        this.zCoord);
            }
    }

    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(final NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setTag(TileConstants.INVENTORY,
                InventoryHelper.writeInventoryToNBT(this.getInventory()));
    }
}