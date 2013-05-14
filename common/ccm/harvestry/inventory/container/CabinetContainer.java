package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import ccm.harvestry.tileentity.TileCabinet;

public class CabinetContainer extends BaseContainer
{

    private final int inventorySize;

    /**
     * Creates the Container for the Cabinet's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileCabinet} instance that the player is looking
     *            at.
     */
    public CabinetContainer(final InventoryPlayer player,
                            final TileCabinet cabinet)
    {
        super(player, cabinet, 8, 84, 142);
        this.inventorySize = TileCabinet.invSize;
        // Add the Barrel slots to the container
        int index = 0;
        for (int chestRowIndex = 0; chestRowIndex < 3; ++chestRowIndex){
            for (int chestColumnIndex = 0; chestColumnIndex < 8; ++chestColumnIndex){
                this.addSlotToContainer(new Slot(cabinet, index, 17 + (chestColumnIndex * 18), 17 + (chestRowIndex * 18)));
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