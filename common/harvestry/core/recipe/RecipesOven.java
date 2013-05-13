package harvestry.core.recipe;

import harvestry.api.fuels.OvenFuels;
import harvestry.api.recipes.OvenRecipes;
import harvestry.core.handlers.EHandler;
import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseFood;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumNonStack;
import harvestry.item.enums.EnumUncookedFood;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

final class RecipesOven {

    public static void init() {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels() {
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heWood));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heAluminum));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heIron));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heGold));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heCopper));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heTin));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heBronze));
    }

    private static void registerRecipes() {
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedBread), new ItemStack(Item.bread), EHandler.getItem(EnumNonStack.panBread));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedPotato), new ItemStack(Item.bakedPotato));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedCake), EHandler.getItem(EnumNonStack.cookedCake), EHandler.getItem(EnumNonStack.panCake));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedPiePumpkin), new ItemStack(Item.pumpkinPie), EHandler.getItem(EnumNonStack.panPie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedPieApple), EHandler.getItem(EnumBaseFood.foodPieApple), EHandler.getItem(EnumNonStack.panPie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedPieBerryBlue), EHandler.getItem(EnumBaseFood.foodBerryBlue), EHandler.getItem(EnumNonStack.panPie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedPieBerryCherry), EHandler.getItem(EnumBaseFood.foodPieBerryCherry), EHandler.getItem(EnumNonStack.panPie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedCookies), EHandler.getItem(EnumBaseFood.foodCookie, 16), EHandler.getItem(EnumNonStack.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedCookiesSugar), EHandler.getItem(EnumBaseFood.foodCookieSugar, 16), EHandler.getItem(EnumNonStack.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedCookiesChocolateChip), EHandler.getItem(EnumBaseFood.foodCookieChocolateChip, 16), EHandler.getItem(EnumNonStack.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedPizzaCheese), EHandler.getItem(EnumBaseFood.foodPizzaCheese));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedPizza), EHandler.getItem(EnumBaseFood.foodPizza));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedMeatBall), EHandler.getItem(EnumNonStack.cookedMeatBall));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedMeatPatty), EHandler.getItem(EnumNonStack.cookedMeatPatty));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedNoodles), EHandler.getItem(EnumNonStack.cookedNoodles));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedChicken), EHandler.getItem(EnumBaseFood.foodChickenGrilled));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumUncookedFood.uncookedTortilla), EHandler.getItem(EnumNonStack.itemTortilla));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumBaseItem.dustBeef), EHandler.getItem(EnumNonStack.cookedDustMeat));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumBaseFood.foodSandwichCheese), EHandler.getItem(EnumBaseFood.foodSandwichCheeseGrilled));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(EnumBaseFood.foodEggs), new ItemStack(Item.egg));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Block.pumpkin), EHandler.getItem(EnumBaseItem.rawPumpkinMash, 4));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Item.porkRaw), new ItemStack(Item.porkCooked));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Item.beefRaw), new ItemStack(Item.beefCooked));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Item.fishRaw), new ItemStack(Item.fishCooked));
    }
}