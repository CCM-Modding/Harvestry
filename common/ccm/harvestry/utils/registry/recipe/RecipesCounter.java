/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import net.minecraft.item.Item;

import ccm.harvestry.api.fuels.Boards;
import ccm.harvestry.api.fuels.Knifes;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.item.enums.EnumFood;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.item.enums.EnumUncookedFood;
import ccm.nucleum.omnium.api.fuels.IFuelRegistry;
import ccm.nucleum.omnium.utils.helper.item.WrapperStack;
import ccm.nucleum.omnium.utils.registry.recipe.IRecipeRegistry;

final class RecipesCounter extends IRecipeRegistry
{

    protected IFuelRegistry fuels2;

    public RecipesCounter()
    {
        fuels = Knifes.instance();
        fuels2 = Boards.instance();
        recipes = CounterRecipes.instance();
        register();
    }

    @Override
    protected void registerFuels()
    {
        fuels.registerFuel(new WrapperStack(ModItems.toolKnifeA));
        fuels.registerFuel(new WrapperStack(ModItems.toolKnifeI));
        fuels.registerFuel(new WrapperStack(ModItems.toolKnifeG));
        fuels.registerFuel(new WrapperStack(ModItems.toolKnifeB));
        fuels2.registerFuel(new WrapperStack(ModItems.toolCuttingBoard));
    }

    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(new WrapperStack(Item.bread), new WrapperStack(EnumItem.sliceBread).setStackSize(6));
        recipes.addRecipe(new WrapperStack(EnumItem.itemOnion), new WrapperStack(EnumItem.sliceOnion).setStackSize(3));
        recipes.addRecipe(new WrapperStack(EnumFood.foodTomato), new WrapperStack(EnumItem.sliceTomato).setStackSize(3));
        recipes.addRecipe(new WrapperStack(EnumFood.foodCheese), new WrapperStack(EnumItem.sliceCheese).setStackSize(6));
        recipes.addRecipe(new WrapperStack(Item.chickenRaw), new WrapperStack(EnumUncookedFood.uncookedChicken).setStackSize(3), new WrapperStack(
                EnumUncookedFood.uncookedChickenLeg).setStackSize(2));
    }
}