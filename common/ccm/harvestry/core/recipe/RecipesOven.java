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
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

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
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedBread),
                                               new ItemStack(Item.bread),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.panBread));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPotato), new ItemStack(Item.bakedPotato));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCake),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.cookedCake),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.panCake));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPiePumpkin),
                                               new ItemStack(Item.pumpkinPie),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPieApple),
                                               EnumToItemStack.getItemIS(EnumFood.foodPieApple),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        // OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue),
        // EHandler.getItem(FoodEnum.foodBerryBlue),
        // EHandler.getItem(ItemEnumSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPieBerryCherry),
                                               EnumToItemStack.getItemIS(EnumFood.foodPieBerryCherry),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookies),
                                               EnumToItemStack.getItemIS(EnumFood.foodCookie, 16),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookiesSugar),
                                               EnumToItemStack.getItemIS(EnumFood.foodCookieSugar, 16),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookiesChocolateChip),
                                               EnumToItemStack.getItemIS(EnumFood.foodCookieChocolateChip, 16),
                                               EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPizzaCheese), EnumToItemStack.getItemIS(EnumFood.foodPizzaCheese));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPizza), EnumToItemStack.getItemIS(EnumFood.foodPizza));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedMeatBall), EnumToItemStack.getItemIS(EnumItemSixteen.cookedMeatBall));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedMeatPatty), EnumToItemStack.getItemIS(EnumItemSixteen.cookedMeatPatty));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedNoodles), EnumToItemStack.getItemIS(EnumItemSixteen.cookedNoodles));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedTortilla), EnumToItemStack.getItemIS(EnumItemSixteen.itemTortilla));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumItem.dustBeef), EnumToItemStack.getItemIS(EnumItemSixteen.cookedDustMeat));
        OvenRecipes.cooking().addCookingRecipe(EnumToItemStack.getItemIS(EnumFood.foodEggs), new ItemStack(Item.egg));
        OvenRecipes.cooking().addCookingRecipe(new ItemStack(Block.pumpkin), EnumToItemStack.getItemIS(EnumItem.rawPumpkinMash, 4));
    }
}