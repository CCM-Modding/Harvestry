package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.OvenFuels;
import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.harvestry.core.handlers.EHandler;
import ccm.harvestry.enums.items.FoodEnum;
import ccm.harvestry.enums.items.ItemEnum;
import ccm.harvestry.enums.items.ItemEnumSixteen;
import ccm.harvestry.enums.items.UncookedFoodEnum;
import ccm.harvestry.item.ModItems;

final class RecipesOven
{

    public static void init()
    {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels()
    {
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heWood));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heAluminum));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heIron));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heGold));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heCopper));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heTin));
        OvenFuels.registerOvenFuel(new ItemStack(ModItems.heBronze));
    }

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
        //OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue),
        //                                       EHandler.getItem(FoodEnum.foodBerryBlue),
        //                                       EHandler.getItem(ItemEnumSixteen.panPie));
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
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedTortilla), EHandler.getItem(ItemEnumSixteen.itemTortilla));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(ItemEnum.dustBeef), EHandler.getItem(ItemEnumSixteen.cookedDustMeat));
        OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(FoodEnum.foodEggs), new ItemStack(Item.egg));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Block.pumpkin), EHandler.getItem(ItemEnum.rawPumpkinMash, 4));
    }
}