/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.core.recipe;

import ccm.nucleum_omnium.api.fuels.IFuelRegistry;
import ccm.nucleum_omnium.api.recipes.IRecipeContainer;

/**
 * RecipeRegistry.java
 * 
 * @author Captain_Shadows
 */
abstract class RecipeRegistry
{

    protected IFuelRegistry    fuels;
    protected IRecipeContainer recipes;

    public void register()
    {
        registerFuels();
        registerRecipes();
    }

    abstract void registerFuels();

    abstract void registerRecipes();
}