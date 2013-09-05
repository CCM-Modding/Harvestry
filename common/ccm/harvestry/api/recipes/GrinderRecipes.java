/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.recipes;

import ccm.nucleum.omnium.api.recipes.IRecipeContainer;

/**
 * GrinderRecipes
 * <p>
 * Simple Singleton to store all GrinderRecipes
 * 
 * @author Captain_Shadows
 */
public final class GrinderRecipes extends IRecipeContainer
{
    private static final GrinderRecipes INSTANCE = new GrinderRecipes();

    private GrinderRecipes()
    {}

    public static final GrinderRecipes instance()
    {
        return INSTANCE;
    }
}