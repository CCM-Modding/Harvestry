/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.recipes;

import ccm.nucleum.omnium.api.recipes.IRecipeContainer;

/**
 * CounterRecipes
 * <p>
 * Simple Singleton to store all CounterRecipes
 * 
 * @author Captain_Shadows
 */
public final class CounterRecipes extends IRecipeContainer
{
    private static final CounterRecipes INSTANCE = new CounterRecipes();

    private CounterRecipes()
    {}

    public static final CounterRecipes instance()
    {
        return INSTANCE;
    }
}