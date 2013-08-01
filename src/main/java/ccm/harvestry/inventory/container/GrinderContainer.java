/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.api.fuels.GrinderFuels;
import ccm.harvestry.tileentity.logic.GrinderLogic;
import ccm.nucleum_omnium.inventory.container.ProgressContainer;
import ccm.nucleum_omnium.inventory.slot.OutputSlot;
import ccm.nucleum_omnium.inventory.slot.UseSlot;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.tileentity.LogicTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;

public class GrinderContainer extends ProgressContainer
{

    /**
     * Creates the Container for the Grinders GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param tile
     *            The {@link GrinderLogic} instance that the player is looking at.
     */
    public GrinderContainer(final InventoryPlayer player, final TileEntity tile)
    {
        super((InventoryTE) tile, ((IGUITileLogic) ((LogicTE) tile).getTileLogic()), player, 8, 84);

        final InventoryTE te = (InventoryTE) tile;
        // Left Hand Slot (Input)
        addSlotToContainer(new Slot(te, 0, 80, 13));
        // Top Slot (Grinding)
        addSlotToContainer(new UseSlot(te, 1, 56, 13, GrinderFuels.instance()));
        // Bottom Slot (Grinding)
        addSlotToContainer(new UseSlot(te, 2, 104, 13, GrinderFuels.instance()));
        // Right Hand Slot (Output)
        addSlotToContainer(new OutputSlot(te, 3, 80, 60));
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex)
    {
        return null;
    }
}