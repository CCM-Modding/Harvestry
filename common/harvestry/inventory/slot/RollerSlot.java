package harvestry.inventory.slot;

import harvestry.api.fuels.RollerFuels;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class RollerSlot extends UseSlot
{

    public RollerSlot(final IInventory inventory,
                      final int index,
                      final int x,
                      final int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(final ItemStack item)
    {
        return RollerFuels.isRollerFuel(item);
    }
}
