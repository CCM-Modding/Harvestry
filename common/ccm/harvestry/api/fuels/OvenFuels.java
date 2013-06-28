package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class OvenFuels implements IFuelRegistry {

	/**
	 * Oven Fuels
	 */
	private final HashSet<ItemStack>	ovenList	= new HashSet<ItemStack>();

	private static final OvenFuels		INSTANCE	= new OvenFuels();

	public static OvenFuels instance() {
		return INSTANCE;
	}

	/**
	 * Checks if a item is a Heating Element.
	 * 
	 * @param stack
	 *            The stack to check if it is a Heating Element.
	 * @return true if it is found in the Oven's List.
	 */
	@Override
	public boolean isFuel(final ItemStack stack) {
		for (final ItemStack i : ovenList) {
			if (i.itemID == stack.itemID) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Registers a new Heating Element.
	 * 
	 * @param stack
	 *            The Heating Element to add.
	 */
	@Override
	public void registerFuel(final ItemStack stack) {
		ovenList.add(stack);
	}
}