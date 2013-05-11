package harvestry.inventory.slot;

import harvestry.api.fuels.GrinderFuels;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class GrinderSlot extends UseSlot
{

    public GrinderSlot(final IInventory inventory,
                       final int index,
                       final int x,
                       final int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(final ItemStack item)
    {
        return GrinderFuels.isGrinderFuel(item);
    }
}