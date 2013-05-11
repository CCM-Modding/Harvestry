package harvestry.inventory.container;

import harvestry.inventory.slot.CounterBoardSlot;
import harvestry.inventory.slot.CounterKnifeSlot;
import harvestry.tileentity.TileCounter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class CounterContainer extends BaseContainer
{

    /**
     * Creates the Container for the Counter GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileCounter} instance that the player is looking
     *            at.
     */
    public CounterContainer(final InventoryPlayer player,
                            final TileCounter counter)
    {
        super(player, counter, 8, 84, 142);
        // Left Hand Slot (Input)
        this.addSlotToContainer(new Slot(counter, 0, 17, 35));
        // Top Slot (Knife)
        this.addSlotToContainer(new CounterKnifeSlot(counter, 1, 17, 17));
        // Bottom Slot (Board)
        this.addSlotToContainer(new CounterBoardSlot(counter, 2, 17, 53));
        // Add the Counter slots to the container
        int index = 3;
        for (int chestRowIndex = 0; chestRowIndex < 3; ++chestRowIndex){
            for (int chestColumnIndex = 0; chestColumnIndex < 6; ++chestColumnIndex){
                this.addSlotToContainer(new Slot(counter, index, 53 + (chestColumnIndex * 18), 17 + (chestRowIndex * 18)));
                ++index;
            }
        }
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex)
    {
        return null;
    }
}