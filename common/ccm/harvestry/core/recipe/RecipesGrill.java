package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


import ccm.harvestry.api.fuels.GrillFuels;
import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.nucleum.helper.enums.EnumHelper;

final class RecipesGrill
{

    public RecipesGrill()
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
        GrillRecipes.grilling().addGrillingRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedChicken), EnumHelper.getItemIS(EnumFood.foodChickenGrilled));
        GrillRecipes.grilling().addGrillingRecipe(EnumHelper.getItemIS(EnumFood.foodSandwichCheese), EnumHelper.getItemIS(EnumFood.foodSandwichCheeseGrilled));
        GrillRecipes.grilling().addGrillingRecipe(new ItemStack(Item.porkRaw), new ItemStack(Item.porkCooked));
        GrillRecipes.grilling().addGrillingRecipe(new ItemStack(Item.beefRaw), new ItemStack(Item.beefCooked));
        GrillRecipes.grilling().addGrillingRecipe(new ItemStack(Item.fishRaw), new ItemStack(Item.fishCooked));
    }
}