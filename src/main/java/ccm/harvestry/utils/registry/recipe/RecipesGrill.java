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
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;
import ccm.nucleum_omnium.utils.registry.recipe.IRecipeRegistry;

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
        fuels.registerFuel(new ItemStack(Item.coal, 1, 1));
    }

    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedChicken), EnumToItemStack.getItemIS(EnumFood.foodChickenGrilled));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumFood.foodSandwichCheese), EnumToItemStack.getItemIS(EnumFood.foodSandwichCheeseGrilled));
        recipes.addRecipe(new ItemStack(Item.porkRaw), new ItemStack(Item.porkCooked));
        recipes.addRecipe(new ItemStack(Item.beefRaw), new ItemStack(Item.beefCooked));
        recipes.addRecipe(new ItemStack(Item.fishRaw), new ItemStack(Item.fishCooked));
    }
}