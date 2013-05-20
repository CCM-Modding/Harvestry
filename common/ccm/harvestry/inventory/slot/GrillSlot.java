package ccm.harvestry.inventory.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.GrillFuels;

public class GrillSlot extends UseSlot
{

    public GrillSlot(final IInventory inventory,
                    final int index,
                    final int x,
                    final int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(final ItemStack item)
    {
        return GrillFuels.isGrillFuel(item);
    }
}