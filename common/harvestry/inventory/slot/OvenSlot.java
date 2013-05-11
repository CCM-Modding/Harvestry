package harvestry.inventory.slot;

import harvestry.api.fuels.OvenFuels;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class OvenSlot extends UseSlot
{

    public OvenSlot(final IInventory inventory,
                    final int index,
                    final int x,
                    final int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(final ItemStack item)
    {
        return OvenFuels.isOvenFuel(item);
    }
}