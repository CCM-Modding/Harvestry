/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.api.fuels.GrillFuels;
import ccm.nucleum_omnium.inventory.container.ProgressContainer;
import ccm.nucleum_omnium.inventory.slot.UseSlot;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.tileentity.LogicTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;

public class GrillContainer extends ProgressContainer
{

    /**
     * Creates the Container for the Grill GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileGrill} instance that the player is looking at.
     */
    public GrillContainer(final InventoryPlayer player, final TileEntity tile)
    {
        super((InventoryTE) tile, ((IGUITileLogic) ((LogicTE) tile).getTileLogic()), player, 8, 84);

        final InventoryTE te = (InventoryTE) tile;

        // Right Slot (Heating)
        addSlotToContainer(new UseSlot(te, 0, 8, 43, GrillFuels.instance()));

        drawOutBoxInventory(te, drawBoxInventory(te, 1, 32, 17, 3, 3), 116, 17, 3, 3);
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer player, final int slotIndex)
    {
        return null;
    }
}