package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.tileentity.TileBarrel;

public class BarrelContainer extends BaseContainer
{

    private final int inventorySize;

    /**
     * Creates the Container for the Barrel GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileBarrel} instance that the player is looking at.
     */
    public BarrelContainer(final InventoryPlayer player,
                           final TileEntity barrel)
    {
        super(player, barrel, 8, 103, 161);
        this.inventorySize = TileBarrel.invSize;
        // Add the Barrel slots to the container
        int index = 0;
        for (int chestRowIndex = 0; chestRowIndex < 5; ++chestRowIndex){
            for (int chestColumnIndex = 0; chestColumnIndex < 8; ++chestColumnIndex){
                this.addSlotToContainer(new Slot((TileBarrel) barrel, index, 17 + (chestColumnIndex * 18), -1 + (chestRowIndex * 18)));
                ++index;
            }
        }
    }

    /**
     * Called when a player shift-clicks on a slot.
     */
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int par2)
    {
        ItemStack itemstack = null;
        final Slot slot = (Slot) this.inventorySlots.get(par2);

        if ((slot != null) && slot.getHasStack()){
            final ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 < this.inventorySize){
                if (!this.mergeItemStack(itemstack1, this.inventorySize, this.inventorySlots.size(), true)){
                    return null;
                }
            }else if (!this.mergeItemStack(itemstack1, 0, this.inventorySize, false)){
                return null;
            }
            if (itemstack1.stackSize == 0){
                slot.putStack(null);
            }else{
                slot.onSlotChanged();
            }
        }
        return itemstack;
    }
}