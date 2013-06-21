package ccm.harvestry.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class CounterRecipes {
    
    private static final CounterRecipes CounterBase = new CounterRecipes();
    
    /**
     * Used to call methods addCutting and getCuttingResult.
     */
    public static final CounterRecipes instance() {
        return CounterRecipes.CounterBase;
    }
    
    /** The list of Cutting results. */
    private final HashSet<Recipes> recipes = new HashSet<Recipes>();
    
    private CounterRecipes() {}
    
    /**
     * Adds a Cutting recipe. It natively supports meta data. And passing Items as the first parameter :D
     */
    public void addRecipe(final Item input, final ItemStack output) {
        final ItemStack in = new ItemStack(input);
        recipes.add(new Recipes(in, output));
    }
    
    /**
     * Adds a Cutting recipe. It natively supports meta data, a Second Return, and passing Items as the first parameter :D
     */
    public void addRecipe(final Item input, final ItemStack output, final ItemStack output2) {
        final ItemStack in = new ItemStack(input);
        recipes.add(new Recipes(in, output, output2));
    }
    
    /**
     * Adds a Cutting recipe. It natively supports meta data.
     */
    public void addRecipe(final ItemStack input, final ItemStack output) {
        recipes.add(new Recipes(input, output));
    }
    
    /**
     * Adds a Oven Recipe. It natively supports meta data, and a Second Return.
     */
    public void addCutting(final ItemStack input, final ItemStack output, final ItemStack output2) {
        recipes.add(new Recipes(input, output, output2));
    }
    
    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * 
     * @param item
     *            The Source ItemStack
     * @return The result ItemStack
     */
    public Recipes getCuttingResult(final ItemStack item) {
        for (final Recipes r : recipes) {
            if (r.isInput(item)) {
                return r;
            }
        }
        return null;
    }
    
    public Set<Recipes> getCuttingList() {
        return recipes;
    }
}