package ccm.harvestry.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class GrinderRecipes {
    
    // needs ore dictionary
    private static final GrinderRecipes grindingBase = new GrinderRecipes();
    
    /**
     * Used to call methods addGrinding and getGrindingResult.
     */
    public static final GrinderRecipes instance() {
        return GrinderRecipes.grindingBase;
    }
    
    /** The list of grinding results. */
    private final HashSet<Recipes> recipes = new HashSet<Recipes>();
    
    private GrinderRecipes() {}
    
    /**
     * Adds a Grinding recipe. It natively supports meta data. And passing Items as the first parameter :D
     */
    public void addRecipe(final Item input, final ItemStack output) {
        final ItemStack in = new ItemStack(input);
        recipes.add(new Recipes(in, output));
    }
    
    /**
     * Adds a Grinding recipe. It natively supports meta data.
     */
    public void addRecipe(final ItemStack input, final ItemStack output) {
        recipes.add(new Recipes(input, output));
    }
    
    public Set<Recipes> getGrindingList() {
        return recipes;
    }
    
    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * 
     * @param item
     *            The Source ItemStack
     * @return The result ItemStack
     */
    public Recipes getGrindingResult(final ItemStack item) {
        for (final Recipes r : recipes) {
            if (r.isInput(item)) {
                return r;
            }
        }
        return null;
    }
}