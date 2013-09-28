/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import ccm.harvestry.api.fuels.OvenFuels;
import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.item.enums.EnumFood;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.item.enums.EnumItemSixteen;
import ccm.harvestry.item.enums.EnumUncookedFood;
import ccm.nucleum.omnium.utils.helper.item.WrapperStack;
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
        fuels.registerFuel(new WrapperStack(ModItems.heWood));
        fuels.registerFuel(new WrapperStack(ModItems.heAluminum));
        fuels.registerFuel(new WrapperStack(ModItems.heIron));
        fuels.registerFuel(new WrapperStack(ModItems.heGold));
        fuels.registerFuel(new WrapperStack(ModItems.heCopper));
        fuels.registerFuel(new WrapperStack(ModItems.heTin));
        fuels.registerFuel(new WrapperStack(ModItems.heBronze));
    }

    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedBread), new WrapperStack(Item.bread), new WrapperStack(EnumItemSixteen.panBread));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedPotato), new WrapperStack(Item.bakedPotato));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedCake), new WrapperStack(EnumItemSixteen.cookedCake), new WrapperStack(EnumItemSixteen.panCake));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedPiePumpkin), new WrapperStack(Item.pumpkinPie), new WrapperStack(EnumItemSixteen.panPie));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedPieApple), new WrapperStack(EnumFood.foodPieApple), new WrapperStack(EnumItemSixteen.panPie));
        // recipes.addRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue),
        // EHandler.getItem(FoodEnum.foodBerryBlue),
        // EHandler.getItem(ItemEnumSixteen.panPie));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedPieBerryCherry), new WrapperStack(EnumFood.foodPieBerryCherry), new WrapperStack(EnumItemSixteen.panPie));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedCookies), new WrapperStack(EnumFood.foodCookie).setStackSize(16), new WrapperStack(EnumItemSixteen.sheetCookie));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedCookiesSugar), new WrapperStack(EnumFood.foodCookieSugar).setStackSize(16), new WrapperStack(
                EnumItemSixteen.sheetCookie));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedCookiesChocolateChip), new WrapperStack(EnumFood.foodCookieChocolateChip).setStackSize(16), new WrapperStack(
                EnumItemSixteen.sheetCookie));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedPizzaCheese), new WrapperStack(EnumFood.foodPizzaCheese));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedPizza), new WrapperStack(EnumFood.foodPizza));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedMeatBall), new WrapperStack(EnumItemSixteen.cookedMeatBall));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedMeatPatty), new WrapperStack(EnumItemSixteen.cookedMeatPatty));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedNoodles), new WrapperStack(EnumItemSixteen.cookedNoodles));
        recipes.addRecipe(new WrapperStack(EnumUncookedFood.uncookedTortilla), new WrapperStack(EnumItemSixteen.itemTortilla));
        recipes.addRecipe(new WrapperStack(EnumItem.dustBeef), new WrapperStack(EnumItemSixteen.cookedDustMeat));
        recipes.addRecipe(new WrapperStack(EnumFood.foodEggs), new WrapperStack(Item.egg));
        recipes.addRecipe(new WrapperStack(Block.pumpkin), new WrapperStack(EnumItem.rawPumpkinMash).setStackSize(4));
    }
}