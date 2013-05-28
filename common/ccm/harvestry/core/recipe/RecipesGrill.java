package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.GrillFuels;
import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.harvestry.core.handlers.EHandler;
import ccm.harvestry.enums.items.FoodEnum;
import ccm.harvestry.enums.items.UncookedFoodEnum;

final class RecipesGrill
{

    public static void init()
    {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels()
    {
        GrillFuels.registerGrillFuel(new ItemStack(Item.coal, 1, 1));
    }

    private static void registerRecipes()
    {
        GrillRecipes.grilling().addGrillingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedChicken), EHandler.getItem(FoodEnum.foodChickenGrilled));
        GrillRecipes.grilling().addGrillingRecipe(EHandler.getItem(FoodEnum.foodSandwichCheese), EHandler.getItem(FoodEnum.foodSandwichCheeseGrilled));
        GrillRecipes.grilling().addGrillingRecipe(new ItemStack(Item.porkRaw), new ItemStack(Item.porkCooked));
        GrillRecipes.grilling().addGrillingRecipe(new ItemStack(Item.beefRaw), new ItemStack(Item.beefCooked));
        GrillRecipes.grilling().addGrillingRecipe(new ItemStack(Item.fishRaw), new ItemStack(Item.fishCooked));
    }
}