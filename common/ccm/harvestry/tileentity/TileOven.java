package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.harvestry.block.machines.BlockOven;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.FunctionHelper;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileOven extends TileBase
{

    private final OvenRecipes recipe   = OvenRecipes.cooking();

    /** The number of ticks that the current item has been cooking for */
    public int                cookTime = 0;

    private static int        invSize  = 4;

    /**
     * Creates a new {@link TileOven} Instance.
     */
    public TileOven()
    {
        super(invSize, TileConstants.OVEN_UNLOCALIZED);
    }

    /**
     * Returns true if the oven can cook an item, i.e. has a source item,
     * destination stack isn't full, etc.
     */
    public boolean canCook()
    {
        if (this.hasFuel()){
            if (this.recipe.getCookingResult(this.inventory[0]) != null){
                final ItemStack itemstack = this.recipe.getCookingResult(this.inventory[0]).getOutput1();
                if (this.inventory[2] == null){
                    return true;
                }
                if (!this.inventory[2].isItemEqual(itemstack)){
                    return false;
                }
                final int result = this.inventory[2].stackSize + itemstack.stackSize;
                if (this.recipe.getCookingResult(this.inventory[0]).hasSecondOutput()){
                    final ItemStack itemstack2 = this.recipe.getCookingResult(this.inventory[0]).getOutput2();
                    if (this.inventory[3] == null){
                        return true;
                    }
                    if (!this.inventory[3].isItemEqual(itemstack2)){
                        return false;
                    }
                    final int result2 = this.inventory[3].stackSize + itemstack2.stackSize;
                    return ((result <= this.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize()))
                           && ((result2 <= this.getInventoryStackLimit()) && (result2 <= itemstack2.getMaxStackSize()));
                }else{
                    return ((result <= this.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize()));
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    /**
     * Turn one item from the oven source stack into the appropriate cooked item
     * in the furnace result stack
     */
    private void cookItem()
    {
        if (this.canCook()){
            final ItemStack itemstack = this.recipe.getCookingResult(this.inventory[0]).getOutput1();
            if (this.inventory[2] == null){
                this.inventory[2] = itemstack.copy();
            }else if (this.inventory[2].isItemEqual(itemstack)){
                this.inventory[2].stackSize += itemstack.stackSize;
            }
            if (this.recipe.getCookingResult(this.inventory[0]).hasSecondOutput()){
                final ItemStack itemstack2 = this.recipe.getCookingResult(this.inventory[0]).getOutput2();
                if (this.inventory[3] == null){
                    this.inventory[3] = itemstack2.copy();
                }else if (this.inventory[3].isItemEqual(itemstack2)){
                    this.inventory[3].stackSize += itemstack2.stackSize;
                }
            }
            --this.inventory[0].stackSize;
            if (this.inventory[0].stackSize <= 0){
                this.inventory[0] = null;
            }
        }
    }

    /**
     * Returns an integer between 0 and the passed value representing how close
     * the current item is to being completely cooked
     */
    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(final int scale)
    {
        return (this.cookTime * scale) / 200;
    }

    private boolean hasFuel()
    {
        if ((this.inventory[0] != null) && (this.inventory[1] != null)){
            if (FunctionHelper.isSunVisible(this.getWorldObj(), this.xCoord, this.yCoord + 1, this.zCoord)
                || FunctionHelper.isFireBelow(this.getWorldObj(), this.xCoord, this.yCoord - 1, this.zCoord)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
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
            if (this.canCook()){
                ItemHelper.damageItem(this.inventory, 1, 3);
                BlockOven.updateBlockState(true, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
                ++this.cookTime;
                if (this.cookTime == 200){
                    this.cookTime = 0;
                    this.cookItem();
                    this.onInventoryChanged();
                    BlockOven.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
                }
            }else{
                this.cookTime = 0;
                BlockOven.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
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