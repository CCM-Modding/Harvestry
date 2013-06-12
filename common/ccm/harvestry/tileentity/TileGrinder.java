package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


import ccm.harvestry.api.recipes.GrinderRecipes;
import ccm.harvestry.block.machines.BlockGrinder;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum.helper.InventoryHelper;
import ccm.nucleum.helper.ItemHelper;

public class TileGrinder extends TileBase
{

    private final GrinderRecipes recipe          = GrinderRecipes.grinding();

    /** The number of ticks that the current item has been grinding for */
    public int                   grinderCookTime = 0;

    /** The time that the item allows has to be used */
    private static final int     invSize         = 4;

    /**
     * Creates a new {@link TileGrinder} Instance.
     */
    public TileGrinder()
    {
        super(invSize, TileConstants.GRINDER_UNLOCALIZED);
    }

    /**
     * Returns true if the grinder can grind an item, i.e. has a source item,
     * destination stack isn't full, etc.
     */
    public boolean canGrind()
    {
        if ((this.inventory[0] != null)){
            if ((this.inventory[1] != null) && (this.inventory[2] != null)){
                if (this.recipe.getGrindingResult(this.inventory[0]) != null){
                    final ItemStack itemstack = this.recipe.getGrindingResult(this.inventory[0]).getOutput1();
                    if (this.inventory[3] == null){
                        return true;
                    }
                    if (!this.inventory[3].isItemEqual(itemstack)){
                        return false;
                    }
                    final int result = this.inventory[3].stackSize + itemstack.stackSize;
                    return ((result <= this.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize()));
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    /**
     * Returns an integer between 0 and the passed value representing how close
     * the current item is to being completely cooked
     */
    @SideOnly(Side.CLIENT)
    public int getGrindProgressScaled(final int scale)
    {
        return (this.grinderCookTime * scale) / 200;
    }

    /**
     * Turn one item from the grinder source stack into the appropriate ground
     * item in the grinder result stack
     */
    public void grindItem()
    {
        if (this.canGrind()){
            final ItemStack itemstack = this.recipe.getGrindingResult(this.inventory[0]).getOutput1();
            if (this.inventory[3] == null){
                this.inventory[3] = itemstack.copy();
            }else if (this.inventory[3].isItemEqual(itemstack)){
                this.inventory[3].stackSize += itemstack.stackSize;
            }
            --this.inventory[0].stackSize;
            if (this.inventory[0].stackSize <= 0){
                this.inventory[0] = null;
            }
        }
    }

    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        this.setInventory(InventoryHelper.readInventoryFromNBT(nbt.getTagList(TileConstants.INVENTORY), invSize));
    }

    @Override
    public void updateEntity()
    {
        if (!this.worldObj.isRemote){
            if (this.canGrind()){
                ItemHelper.damageItem(this.inventory, 1, 3);
                ItemHelper.damageItem(this.inventory, 2, 3);
                BlockGrinder.updateBlockState(true, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
                ++this.grinderCookTime;
                if (this.grinderCookTime == 200){
                    this.grinderCookTime = 0;
                    this.grindItem();
                    this.onInventoryChanged();
                    BlockGrinder.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
                }
            }else{
                this.grinderCookTime = 0;
                BlockGrinder.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
    }

    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(final NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        nbt.setTag(TileConstants.INVENTORY, InventoryHelper.writeInventoryToNBT(this.getInventory()));
    }
}