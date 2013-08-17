/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemStack;

import ccm.nucleum.omnium.api.recipes.IRecipeContainer;
import ccm.nucleum.omnium.api.recipes.Recipe;

// needs ore dictionary
public final class GrinderRecipes implements IRecipeContainer
{

    /** The list of grinding results. */
    private final Set<Recipe> recipes;

    private static final GrinderRecipes INSTANCE = new GrinderRecipes();

    private GrinderRecipes()
    {
        recipes = new HashSet<Recipe>();
    }

    /**
     * Used to call methods addGrinding and getGrindingResult.
     */
    public static final GrinderRecipes instance()
    {
        return INSTANCE;
    }

    @Override
    public void addRecipe(final Recipe recipe)
    {
        recipes.add(recipe);
    }

    @Override
    public void addRecipe(final ItemStack input, final ItemStack output)
    {
        recipes.add(new Recipe(input, output));
    }

    @Override
    public void addRecipe(final ItemStack input, final ItemStack output, final ItemStack output2)
    {
        recipes.add(new Recipe(input, output, output2));
    }

    @Override
    public Recipe getResult(final ItemStack item)
    {
        for (final Recipe r : recipes)
        {
            if (r.isInput(item))
            {
                return r;
            }
        }
        return null;
    }

    @Override
    public Set<Recipe> getRecipes()
    {
        return recipes;
    }
}