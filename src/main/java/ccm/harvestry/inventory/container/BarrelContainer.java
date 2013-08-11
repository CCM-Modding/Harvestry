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
    public BarrelContainer(final InventoryPlayer player, final TileEntity barrel)
    {
        super((InventoryTE) barrel, player, 8, 103);

        final InventoryTE te = (InventoryTE) barrel;

        inventorySize = te.getSizeInventory();

        drawBoxInventory(te, 0, 17, -1, 5, 8);
    }

    /**
     * Called when a player shift-clicks on a slot.
     */
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int index)
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