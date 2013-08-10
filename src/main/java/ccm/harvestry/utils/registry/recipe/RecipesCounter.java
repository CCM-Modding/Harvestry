/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.harvestry.api.fuels.Boards;
import ccm.harvestry.api.fuels.Knifes;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.item.enums.EnumFood;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.item.enums.EnumUncookedFood;
import ccm.nucleum_omnium.api.fuels.IFuelRegistry;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;
import ccm.nucleum_omnium.utils.registry.recipe.IRecipeRegistry;

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
        fuels.registerFuel(new ItemStack(ModItems.toolKnifeA));
        fuels.registerFuel(new ItemStack(ModItems.toolKnifeI));
        fuels.registerFuel(new ItemStack(ModItems.toolKnifeG));
        fuels.registerFuel(new ItemStack(ModItems.toolKnifeB));
        fuels2.registerFuel(new ItemStack(ModItems.toolCuttingBoard));
    }

    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(new ItemStack(Item.bread), EnumToItemStack.getItemIS(EnumItem.sliceBread, 6));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.itemOnion),
                          EnumToItemStack.getItemIS(EnumItem.sliceOnion, 3));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumFood.foodTomato),
                          EnumToItemStack.getItemIS(EnumItem.sliceTomato, 3));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumFood.foodCheese),
                          EnumToItemStack.getItemIS(EnumItem.sliceCheese, 6));
        recipes.addRecipe(new ItemStack(Item.chickenRaw),
                          EnumToItemStack.getItemIS(EnumUncookedFood.uncookedChicken, 3),
                          EnumToItemStack.getItemIS(EnumUncookedFood.uncookedChickenLeg, 2));
    }
}