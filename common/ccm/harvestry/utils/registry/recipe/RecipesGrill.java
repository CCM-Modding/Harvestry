/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.harvestry.api.fuels.GrillFuels;
import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.harvestry.item.enums.EnumFood;
import ccm.harvestry.item.enums.EnumUncookedFood;
import ccm.nucleum.omnium.utils.helper.item.WrapperStack;
import ccm.nucleum.omnium.utils.registry.recipe.IRecipeRegistry;

final class RecipesGrill extends IRecipeRegistry
{

    public RecipesGrill()
    {
        fuels = GrillFuels.instance();
        recipes = GrillRecipes.instance();
        register();
    }

    @Override
    protected void registerFuels()
    {
        fuels.registerFuel(new WrapperStack(new ItemStack(Item.coal, 1, 1)));
    }

    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedChicken), new WrapperStack(EnumFood.foodChickenGrilled));
        recipes.addRecipe(new WrapperStack(EnumFood.foodSandwichCheese), new WrapperStack(EnumFood.foodSandwichCheeseGrilled));
        recipes.addRecipe(new WrapperStack(Item.porkRaw), new WrapperStack(Item.porkCooked));
        recipes.addRecipe(new WrapperStack(Item.beefRaw), new WrapperStack(Item.beefCooked));
        recipes.addRecipe(new WrapperStack(Item.fishRaw), new WrapperStack(Item.fishCooked));
    }
}