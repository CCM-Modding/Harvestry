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
        registerFuels();
        registerRecipes();
    }
    
    private void registerFuels() {
        OvenFuels.instance().registerFuel(new ItemStack(ModItems.heWood));
        OvenFuels.instance().registerFuel(new ItemStack(ModItems.heAluminum));
        OvenFuels.instance().registerFuel(new ItemStack(ModItems.heIron));
        OvenFuels.instance().registerFuel(new ItemStack(ModItems.heGold));
        OvenFuels.instance().registerFuel(new ItemStack(ModItems.heCopper));
        OvenFuels.instance().registerFuel(new ItemStack(ModItems.heTin));
        OvenFuels.instance().registerFuel(new ItemStack(ModItems.heBronze));
    }
    
    private void registerRecipes() {
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedBread), new ItemStack(Item.bread), EnumToItemStack.getItemIS(EnumItemSixteen.panBread));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPotato), new ItemStack(Item.bakedPotato));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCake),
                                         EnumToItemStack.getItemIS(EnumItemSixteen.cookedCake),
                                         EnumToItemStack.getItemIS(EnumItemSixteen.panCake));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPiePumpkin),
                                         new ItemStack(Item.pumpkinPie),
                                         EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPieApple),
                                         EnumToItemStack.getItemIS(EnumFood.foodPieApple),
                                         EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        // OvenRecipes.cooking().addCookingRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue),
        // EHandler.getItem(FoodEnum.foodBerryBlue),
        // EHandler.getItem(ItemEnumSixteen.panPie));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPieBerryCherry),
                                         EnumToItemStack.getItemIS(EnumFood.foodPieBerryCherry),
                                         EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookies),
                                         EnumToItemStack.getItemIS(EnumFood.foodCookie, 16),
                                         EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookiesSugar),
                                         EnumToItemStack.getItemIS(EnumFood.foodCookieSugar, 16),
                                         EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookiesChocolateChip),
                                         EnumToItemStack.getItemIS(EnumFood.foodCookieChocolateChip, 16),
                                         EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPizzaCheese), EnumToItemStack.getItemIS(EnumFood.foodPizzaCheese));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPizza), EnumToItemStack.getItemIS(EnumFood.foodPizza));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedMeatBall), EnumToItemStack.getItemIS(EnumItemSixteen.cookedMeatBall));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedMeatPatty), EnumToItemStack.getItemIS(EnumItemSixteen.cookedMeatPatty));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedNoodles), EnumToItemStack.getItemIS(EnumItemSixteen.cookedNoodles));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedTortilla), EnumToItemStack.getItemIS(EnumItemSixteen.itemTortilla));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.dustBeef), EnumToItemStack.getItemIS(EnumItemSixteen.cookedDustMeat));
        OvenRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumFood.foodEggs), new ItemStack(Item.egg));
        OvenRecipes.instance().addRecipe(new ItemStack(Block.pumpkin), EnumToItemStack.getItemIS(EnumItem.rawPumpkinMash, 4));
    }
}