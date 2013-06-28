package ccm.harvestry.inventory.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.IFuelRegistry;

public class UseSlot extends Slot {

	private final IFuelRegistry	fuel;

	public UseSlot(	final IInventory inventory,
					final int index,
					final int x,
					final int y,
					final IFuelRegistry fuel) {
		super(inventory, index, x, y);
		this.fuel = fuel;
	}

	/**
	 * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
	 */
	@Override
	public boolean isItemValid(final ItemStack item) {
		return fuel.isFuel(item);
	}
}