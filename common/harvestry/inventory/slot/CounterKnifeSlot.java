package harvestry.inventory.slot;

import harvestry.api.fuels.CounterFuels;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class CounterKnifeSlot extends UseSlot
{

    public CounterKnifeSlot(final IInventory inventory,
                            final int index,
                            final int x,
                            final int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(final ItemStack item)
    {
        return CounterFuels.isCounterKnife(item);
    }
}