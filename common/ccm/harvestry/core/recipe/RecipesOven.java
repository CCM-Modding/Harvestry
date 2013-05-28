package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.OvenFuels;
import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.handler.enums.EnumHandler;

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
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedBread), new ItemStack(Item.bread), EnumHandler.getItem(EnumItemSixteen.panBread));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPotato), new ItemStack(Item.bakedPotato));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedCake),
                                               EnumHandler.getItem(EnumItemSixteen.cookedCake),
                                               EnumHandler.getItem(EnumItemSixteen.panCake));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPiePumpkin), new ItemStack(Item.pumpkinPie), EnumHandler.getItem(EnumItemSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPieApple),
                                               EnumHandler.getItem(EnumFood.foodPieApple),
                                               EnumHandler.getItem(EnumItemSixteen.panPie));
        // OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue),
        // EHandler.getItem(FoodEnum.foodBerryBlue),
        // EHandler.getItem(ItemEnumSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPieBerryCherry),
                                               EnumHandler.getItem(EnumFood.foodPieBerryCherry),
                                               EnumHandler.getItem(EnumItemSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedCookies),
                                               EnumHandler.getItem(EnumFood.foodCookie, 16),
                                               EnumHandler.getItem(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedCookiesSugar),
                                               EnumHandler.getItem(EnumFood.foodCookieSugar, 16),
                                               EnumHandler.getItem(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedCookiesChocolateChip),
                                               EnumHandler.getItem(EnumFood.foodCookieChocolateChip, 16),
                                               EnumHandler.getItem(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPizzaCheese), EnumHandler.getItem(EnumFood.foodPizzaCheese));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPizza), EnumHandler.getItem(EnumFood.foodPizza));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedMeatBall), EnumHandler.getItem(EnumItemSixteen.cookedMeatBall));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedMeatPatty), EnumHandler.getItem(EnumItemSixteen.cookedMeatPatty));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedNoodles), EnumHandler.getItem(EnumItemSixteen.cookedNoodles));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedTortilla), EnumHandler.getItem(EnumItemSixteen.itemTortilla));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumItem.dustBeef), EnumHandler.getItem(EnumItemSixteen.cookedDustMeat));
        OvenRecipes.cooking().addCookingRecipe(EnumHandler.getItem(EnumFood.foodEggs), new ItemStack(Item.egg));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Block.pumpkin), EnumHandler.getItem(EnumItem.rawPumpkinMash, 4));
    }
}