package harvestry.inventory.slot;

import harvestry.api.fuels.CounterFuels;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

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