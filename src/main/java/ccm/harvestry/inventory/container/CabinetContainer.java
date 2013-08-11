/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.nucleum_omnium.inventory.container.BaseContainer;
import ccm.nucleum_omnium.tileentity.InventoryTE;

public class CabinetContainer extends BaseContainer
{

    private final int inventorySize;

    /**
     * Creates the Container for the Cabinet's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileCabinet} instance that the player is looking at.
     */
    public CabinetContainer(final InventoryPlayer player, final TileEntity cabinet)
    {
        super((InventoryTE) cabinet, player, 8, 84);

        final InventoryTE te = (InventoryTE) cabinet;

        inventorySize = te.getSizeInventory();

        drawBoxInventory(te, 0, 17, 17, 3, 8);
    }

    /**
     * Called when a player shift-clicks on a slot.
     */
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer player, final int index)
    {
        ItemStack itemstack = null;
        final Slot slot = (Slot) inventorySlots.get(index);

        if ((slot != null) && slot.getHasStack())
        {
            final ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < inventorySize)
            {
                if (!mergeItemStack(itemstack1, inventorySize, inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else
                if (!mergeItemStack(itemstack1, 0, inventorySize, false))
                {
                    return null;
                }
            if (itemstack1.stackSize == 0)
            {
                slot.putStack(null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }
        return itemstack;
    }
}