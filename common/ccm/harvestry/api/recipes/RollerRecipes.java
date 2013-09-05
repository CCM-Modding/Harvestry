/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.recipes;

import ccm.nucleum.omnium.api.recipes.IRecipeContainer;

/**
 * RollerRecipes
 * <p>
 * Simple Singleton to store all RollerRecipes
 * 
 * @author Captain_Shadows
 */
public final class RollerRecipes extends IRecipeContainer
{
    private static final RollerRecipes INSTANCE = new RollerRecipes();

    private RollerRecipes()
    {}

    public static final RollerRecipes instance()
    {
        return INSTANCE;
    }
}