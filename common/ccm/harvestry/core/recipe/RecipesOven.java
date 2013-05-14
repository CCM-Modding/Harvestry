package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.OvenFuels;
import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.harvestry.core.handlers.EHandler;
import ccm.harvestry.enums.FoodEnum;
import ccm.harvestry.enums.ItemEnum;
import ccm.harvestry.enums.ItemEnumSixteen;
import ccm.harvestry.enums.UncookedFoodEnum;
import ccm.harvestry.item.ModItems;

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

<<<<<<< HEAD:common/harvestry/core/recipe/RecipesOven.java
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
=======
    private static void registerRecipes()
    {
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedBread), new ItemStack(Item.bread), EHandler.getItem(ItemEnumSixteen.panBread));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPotato), new ItemStack(Item.bakedPotato));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedCake),
                                               EHandler.getItem(ItemEnumSixteen.cookedCake),
                                               EHandler.getItem(ItemEnumSixteen.panCake));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPiePumpkin), new ItemStack(Item.pumpkinPie), EHandler.getItem(ItemEnumSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieApple),
                                               EHandler.getItem(FoodEnum.foodPieApple),
                                               EHandler.getItem(ItemEnumSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue),
                                               EHandler.getItem(FoodEnum.foodBerryBlue),
                                               EHandler.getItem(ItemEnumSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryCherry),
                                               EHandler.getItem(FoodEnum.foodPieBerryCherry),
                                               EHandler.getItem(ItemEnumSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedCookies),
                                               EHandler.getItem(FoodEnum.foodCookie, 16),
                                               EHandler.getItem(ItemEnumSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedCookiesSugar),
                                               EHandler.getItem(FoodEnum.foodCookieSugar, 16),
                                               EHandler.getItem(ItemEnumSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedCookiesChocolateChip),
                                               EHandler.getItem(FoodEnum.foodCookieChocolateChip, 16),
                                               EHandler.getItem(ItemEnumSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPizzaCheese), EHandler.getItem(FoodEnum.foodPizzaCheese));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPizza), EHandler.getItem(FoodEnum.foodPizza));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedMeatBall), EHandler.getItem(ItemEnumSixteen.cookedMeatBall));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedMeatPatty), EHandler.getItem(ItemEnumSixteen.cookedMeatPatty));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedNoodles), EHandler.getItem(ItemEnumSixteen.cookedNoodles));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedChicken), EHandler.getItem(FoodEnum.foodChickenGrilled));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(ItemEnum.dustBeef), EHandler.getItem(ItemEnumSixteen.cookedDustMeat));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(FoodEnum.foodSandwichCheese), EHandler.getItem(FoodEnum.foodSandwichCheeseGrilled));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(FoodEnum.foodEggs), new ItemStack(Item.egg));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Block.pumpkin), EHandler.getItem(ItemEnum.rawPumpkinMash, 4));
>>>>>>> Working update:common/ccm/harvestry/core/recipe/RecipesOven.java
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Item.porkRaw), new ItemStack(Item.porkCooked));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Item.beefRaw), new ItemStack(Item.beefCooked));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Item.fishRaw), new ItemStack(Item.fishCooked));
    }
}