package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.harvestry.block.machines.BlockRoller;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileRoller extends TileBase {

    private final RollerRecipes recipe         = RollerRecipes.rolling();

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
     * Returns true if the roller can roll an item, i.e. has a source item,
     * destination stack isn't full, etc.
     */
    public boolean canRoll() {
        if (this.inventory[0] != null) {
            if (this.inventory[1] != null && this.inventory[2] != null) {
                if (this.recipe.getRollingResult(this.inventory[0]) != null) {
                    final ItemStack itemstack = this.recipe.getRollingResult(this.inventory[0])
                            .getOutput1();
                    if (this.inventory[3] == null)
                        return true;
                    if (!this.inventory[3].isItemEqual(itemstack))
                        return false;
                    final int result = this.inventory[3].stackSize + itemstack.stackSize;
                    return result <= this.getInventoryStackLimit()
                            && result <= itemstack.getMaxStackSize();
                } else
                    return false;
            } else
                return false;
        } else
            return false;
    }

    /**
     * Returns an integer between 0 and the passed value representing how close
     * the current item is to being completely cooked
     */
    @SideOnly(Side.CLIENT)
    public int getRollProgressScaled(final int scale) {
        return this.rollerCookTime * scale / 200;
    }

    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.setInventory(InventoryHelper.readInventoryFromNBT(
                nbt.getTagList(TileConstants.INVENTORY), TileRoller.invSize));
    }

    /**
     * Turn one item from the roller source stack into the appropriate ground
     * item in the roller result stack
     */
    public void rollItem() {
        if (this.canRoll()) {
            final ItemStack itemstack = this.recipe.getRollingResult(this.inventory[0])
                    .getOutput1();
            if (this.inventory[3] == null)
                this.inventory[3] = itemstack.copy();
            else if (this.inventory[3].isItemEqual(itemstack))
                this.inventory[3].stackSize += itemstack.stackSize;
            --this.inventory[0].stackSize;
            if (this.inventory[0].stackSize <= 0)
                this.inventory[0] = null;
        }
    }

    @Override
    public void updateEntity() {
        if (!this.worldObj.isRemote)
            if (this.canRoll()) {
                ItemHelper.damageItem(this.inventory, 1, 3);
                ItemHelper.damageItem(this.inventory, 2, 3);
                BlockRoller.updateBlockState(true, this.worldObj, this.xCoord, this.yCoord,
                        this.zCoord);
                ++this.rollerCookTime;
                if (this.rollerCookTime == 200) {
                    this.rollerCookTime = 0;
                    this.rollItem();
                    this.onInventoryChanged();
                    BlockRoller.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord,
                            this.zCoord);
                }
            } else {
                this.rollerCookTime = 0;
                BlockRoller.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord,
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
