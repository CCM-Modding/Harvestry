package ccm.harvestry.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemStack;

import ccm.nucleum_omnium.api.recipes.IRecipeContainer;
import ccm.nucleum_omnium.api.recipes.Recipe;

public final class GrillRecipes implements IRecipeContainer {

    /** The list of Grill results. */
    private final Set<Recipe>         recipes;

    private static final GrillRecipes INSTANCE = new GrillRecipes();

    private GrillRecipes() {
        recipes = new HashSet<Recipe>();
    }

    public static final GrillRecipes instance() {
        return INSTANCE;
    }

    @Override
    public void addRecipe(final Recipe recipe) {
        recipes.add(recipe);
    }

    @Override
    public void addRecipe(final ItemStack input, final ItemStack output) {
        recipes.add(new Recipe(input, output));
    }

    @Override
    public void addRecipe(final ItemStack input, final ItemStack output, final ItemStack output2) {
        recipes.add(new Recipe(input, output, output2));
    }

    @Override
    public Recipe getResult(final ItemStack item) {
        for (final Recipe r : recipes) {
            if (r.isInput(item)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public Set<Recipe> getRecipes() {
        return recipes;
    }
}