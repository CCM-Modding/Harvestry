package ccm.harvestry.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RollerRecipes {

	// needs ore dictionary
	private static final RollerRecipes	RollingBase	= new RollerRecipes();

	/**
	 * Used to call methods addRolling and getRollingResult.
	 */
	public static final RollerRecipes instance() {
		return RollerRecipes.RollingBase;
	}

	/** The list of Rolling results. */
	private final HashSet<Recipes>	recipes	= new HashSet<Recipes>();

	private RollerRecipes() {}

	/**
	 * Adds a Rolling recipe. It natively supports meta data. And passing Items as the first
	 * parameter :D
	 */
	public void addRolling(final Item input, final ItemStack output) {
		final ItemStack in = new ItemStack(input);
		recipes.add(new Recipes(in, output));
	}

	/**
	 * Adds a Rolling recipe. It natively supports meta data.
	 */
	public void addRecipe(final ItemStack input, final ItemStack output) {
		recipes.add(new Recipes(input, output));
	}

	public Set<Recipes> getRollingList() {
		return recipes;
	}

	/**
	 * Used to get the resulting ItemStack form a source ItemStack
	 * 
	 * @param item
	 *            The Source ItemStack
	 * @return The result ItemStack
	 */
	public Recipes getRollingResult(final ItemStack item) {
		for (final Recipes r : recipes) {
			if (r.isInput(item)) {
				return r;
			}
		}
		return null;
	}
}
