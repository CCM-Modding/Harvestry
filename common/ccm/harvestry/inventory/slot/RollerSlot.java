package ccm.harvestry.inventory.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.RollerFuels;

public class RollerSlot extends UseSlot {
    
    public RollerSlot(final IInventory inventory, final int index, final int x, final int y) {
        super(inventory, index, x, y);
    }
    
    @Override
    public boolean isItemValid(final ItemStack item) {
        return RollerFuels.isRollerFuel(item);
    }
}
