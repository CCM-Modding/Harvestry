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
import ccm.nucleum.helper.enums.EnumHelper;

final class RecipesOven {

    public RecipesOven() {
        RecipesOven.registerFuels();
        RecipesOven.registerRecipes();
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
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedBread), new ItemStack(Item.bread),
                EnumHelper.getItemIS(EnumItemSixteen.panBread));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedPotato),
                new ItemStack(Item.bakedPotato));
        OvenRecipes.cooking().addCookingRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedCake),
                EnumHelper.getItemIS(EnumItemSixteen.cookedCake),
                EnumHelper.getItemIS(EnumItemSixteen.panCake));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedPiePumpkin),
                new ItemStack(Item.pumpkinPie), EnumHelper.getItemIS(EnumItemSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedPieApple),
                EnumHelper.getItemIS(EnumFood.foodPieApple),
                EnumHelper.getItemIS(EnumItemSixteen.panPie));
        // OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue),
        // EHandler.getItem(FoodEnum.foodBerryBlue),
        // EHandler.getItem(ItemEnumSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedPieBerryCherry),
                EnumHelper.getItemIS(EnumFood.foodPieBerryCherry),
                EnumHelper.getItemIS(EnumItemSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedCookies),
                EnumHelper.getItemIS(EnumFood.foodCookie, 16),
                EnumHelper.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedCookiesSugar),
                EnumHelper.getItemIS(EnumFood.foodCookieSugar, 16),
                EnumHelper.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedCookiesChocolateChip),
                EnumHelper.getItemIS(EnumFood.foodCookieChocolateChip, 16),
                EnumHelper.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedPizzaCheese),
                EnumHelper.getItemIS(EnumFood.foodPizzaCheese));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedPizza),
                EnumHelper.getItemIS(EnumFood.foodPizza));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedMeatBall),
                EnumHelper.getItemIS(EnumItemSixteen.cookedMeatBall));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedMeatPatty),
                EnumHelper.getItemIS(EnumItemSixteen.cookedMeatPatty));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedNoodles),
                EnumHelper.getItemIS(EnumItemSixteen.cookedNoodles));
        OvenRecipes.cooking().addCookingRecipe(
                EnumHelper.getItemIS(EnumUncookedFood.uncookedTortilla),
                EnumHelper.getItemIS(EnumItemSixteen.itemTortilla));
        OvenRecipes.cooking().addCookingRecipe(EnumHelper.getItemIS(EnumItem.dustBeef),
                EnumHelper.getItemIS(EnumItemSixteen.cookedDustMeat));
        OvenRecipes.cooking().addCookingRecipe(EnumHelper.getItemIS(EnumFood.foodEggs),
                new ItemStack(Item.egg));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Block.pumpkin),
                EnumHelper.getItemIS(EnumItem.rawPumpkinMash, 4));
    }
}