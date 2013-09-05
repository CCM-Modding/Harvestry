/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.recipes;

import ccm.nucleum.omnium.api.recipes.IRecipeContainer;

/**
 * OvenRecipes
 * <p>
 * Simple Singleton to store all OvenRecipes
 * 
 * @author Captain_Shadows
 */
public final class OvenRecipes extends IRecipeContainer
{
    private static final OvenRecipes INSTANCE = new OvenRecipes();

    private OvenRecipes()
    {}

    public static final OvenRecipes instance()
    {
        return INSTANCE;
    }
}