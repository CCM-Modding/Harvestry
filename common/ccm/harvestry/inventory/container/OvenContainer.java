package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.api.fuels.OvenFuels;
import ccm.nucleum_omnium.inventory.container.ProgressContainer;
import ccm.nucleum_omnium.inventory.slot.OutputSlot;
import ccm.nucleum_omnium.inventory.slot.UseSlot;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.tileentity.LogicTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;

public class OvenContainer extends ProgressContainer {

    /**
     * Creates the Container for the Oven GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileOven} instance that the player is looking at.
     */
    public OvenContainer(final InventoryPlayer player, final TileEntity tile) {
        super((InventoryTE) tile, ((IGUITileLogic) ((LogicTE) tile).getTileLogic()), player, 8, 84);

        final InventoryTE te = (InventoryTE) tile;

        // Left Hand Slot (Input)
        addSlotToContainer(new Slot(te, 0, 56, 17));
        // Bottom Slot (Heating)
        addSlotToContainer(new UseSlot(te, 1, 56, 53, OvenFuels.instance()));
        // Top Slot (Output 1)
        addSlotToContainer(new OutputSlot(te, 2, 116, 25));
        // Right Hand Slot (Output 2)
        addSlotToContainer(new OutputSlot(te, 3, 116, 44));
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer player, final int slotIndex) {
        return null;
    }
}