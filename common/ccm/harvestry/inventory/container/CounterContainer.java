package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.api.fuels.Boards;
import ccm.harvestry.api.fuels.Knifes;
import ccm.nucleum_omnium.inventory.container.BaseContainer;
import ccm.nucleum_omnium.inventory.slot.UseSlot;
import ccm.nucleum_omnium.tileentity.InventoryTE;

public class CounterContainer extends BaseContainer {

    /**
     * Creates the Container for the Counter GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileCounter} instance that the player is looking at.
     */
    public CounterContainer(final InventoryPlayer player, final TileEntity counter) {
        super((InventoryTE) counter, player, 8, 84);
        final InventoryTE te = (InventoryTE) counter;
        // Left Hand Slot (Input)
        addSlotToContainer(new Slot(te, 0, 17, 35));
        // Top Slot (Knife)
        addSlotToContainer(new UseSlot(te, 1, 17, 17, Knifes.instance()));
        // Bottom Slot (Board)
        addSlotToContainer(new UseSlot(te, 2, 17, 53, Boards.instance()));

        // Add the Counter slots to the container
        drawBoxInventory(te, 3, 53, 17, 3, 6);
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex) {
        return null;
    }
}