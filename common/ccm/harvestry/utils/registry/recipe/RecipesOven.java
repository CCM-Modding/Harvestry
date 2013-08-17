/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.harvestry.api.fuels.OvenFuels;
import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.item.enums.EnumFood;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.item.enums.EnumItemSixteen;
import ccm.harvestry.item.enums.EnumUncookedFood;
import ccm.nucleum.omnium.utils.helper.enums.EnumToItemStack;
import ccm.nucleum.omnium.utils.registry.recipe.IRecipeRegistry;

final class RecipesOven extends IRecipeRegistry
{

    public RecipesOven()
    {
        fuels = OvenFuels.instance();
        recipes = OvenRecipes.instance();
        register();
    }

    @Override
    protected void registerFuels()
    {
        fuels.registerFuel(new ItemStack(ModItems.heWood));
        fuels.registerFuel(new ItemStack(ModItems.heAluminum));
        fuels.registerFuel(new ItemStack(ModItems.heIron));
        fuels.registerFuel(new ItemStack(ModItems.heGold));
        fuels.registerFuel(new ItemStack(ModItems.heCopper));
        fuels.registerFuel(new ItemStack(ModItems.heTin));
        fuels.registerFuel(new ItemStack(ModItems.heBronze));
    }

    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedBread), new ItemStack(Item.bread), EnumToItemStack.getItemIS(EnumItemSixteen.panBread));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPotato), new ItemStack(Item.bakedPotato));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCake), EnumToItemStack.getItemIS(EnumItemSixteen.cookedCake),
                EnumToItemStack.getItemIS(EnumItemSixteen.panCake));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPiePumpkin), new ItemStack(Item.pumpkinPie), EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPieApple), EnumToItemStack.getItemIS(EnumFood.foodPieApple),
                EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        // recipes.addRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue),
        // EHandler.getItem(FoodEnum.foodBerryBlue),
        // EHandler.getItem(ItemEnumSixteen.panPie));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPieBerryCherry), EnumToItemStack.getItemIS(EnumFood.foodPieBerryCherry),
                EnumToItemStack.getItemIS(EnumItemSixteen.panPie));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookies), EnumToItemStack.getItemIS(EnumFood.foodCookie, 16),
                EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookiesSugar), EnumToItemStack.getItemIS(EnumFood.foodCookieSugar, 16),
                EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookiesChocolateChip), EnumToItemStack.getItemIS(EnumFood.foodCookieChocolateChip, 16),
                EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPizzaCheese), EnumToItemStack.getItemIS(EnumFood.foodPizzaCheese));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPizza), EnumToItemStack.getItemIS(EnumFood.foodPizza));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedMeatBall), EnumToItemStack.getItemIS(EnumItemSixteen.cookedMeatBall));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedMeatPatty), EnumToItemStack.getItemIS(EnumItemSixteen.cookedMeatPatty));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedNoodles), EnumToItemStack.getItemIS(EnumItemSixteen.cookedNoodles));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedTortilla), EnumToItemStack.getItemIS(EnumItemSixteen.itemTortilla));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.dustBeef), EnumToItemStack.getItemIS(EnumItemSixteen.cookedDustMeat));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumFood.foodEggs), new ItemStack(Item.egg));
        recipes.addRecipe(new ItemStack(Block.pumpkin), EnumToItemStack.getItemIS(EnumItem.rawPumpkinMash, 4));
    }
}