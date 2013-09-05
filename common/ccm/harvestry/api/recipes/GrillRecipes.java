/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.recipes;

import ccm.nucleum.omnium.api.recipes.IRecipeContainer;

/**
 * GrillRecipes
 * <p>
 * Simple Singleton to store all GrillRecipes
 * 
 * @author Captain_Shadows
 */
public final class GrillRecipes extends IRecipeContainer
{
    private static final GrillRecipes INSTANCE = new GrillRecipes();

    private GrillRecipes()
    {}

    public static final GrillRecipes instance()
    {
        return INSTANCE;
    }
}