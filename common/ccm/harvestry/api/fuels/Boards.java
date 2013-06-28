package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class Boards implements IFuelRegistry {

	/**
	 * Counter's Boards
	 */
	private final HashSet<ItemStack>	boardList	= new HashSet<ItemStack>();

	private static final Boards			INSTANCE	= new Boards();

	public static Boards instance() {
		return INSTANCE;
	}

	/**
	 * Checks if a item is a Knife.
	 * 
	 * @param stack
	 *            The stack to check if it is a Heating Element.
	 * @return true if it is found in the Counters's List.
	 */
	@Override
	public boolean isFuel(final ItemStack stack) {
		for (final ItemStack i : boardList) {
			if (i.itemID == stack.itemID) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Registers a new Knife.
	 * 
	 * @param stack
	 *            The Knife to add.
	 */
	@Override
	public void registerFuel(final ItemStack stack) {
		boardList.add(stack);
	}
}