package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class GrillFuels implements IFuelRegistry {

	/**
	 * Grill Fuels
	 */
	private final HashSet<ItemStack>	grillList	= new HashSet<ItemStack>();

	private static final GrillFuels		INSTANCE	= new GrillFuels();

	public static GrillFuels instance() {
		return INSTANCE;
	}

	/**
	 * Checks if a item is a Heating Element.
	 * 
	 * @param stack
	 *            The stack to check if it is a Heating Element.
	 * @return true if it is found in the Grill's List.
	 */
	@Override
	public boolean isFuel(final ItemStack stack) {
		for (final ItemStack i : grillList) {
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
		grillList.add(stack);
	}
}