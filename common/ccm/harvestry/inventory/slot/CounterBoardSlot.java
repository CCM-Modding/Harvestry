package ccm.harvestry.inventory.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import ccm.harvestry.api.fuels.CounterFuels;

public class CounterBoardSlot extends UseSlot
{

    public CounterBoardSlot(final IInventory inventory,
                            final int index,
                            final int x,
                            final int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(final ItemStack item)
    {
        return CounterFuels.isCounterBoard(item);
    }
}