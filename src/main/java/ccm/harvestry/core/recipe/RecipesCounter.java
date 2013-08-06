/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.harvestry.api.fuels.Boards;
import ccm.harvestry.api.fuels.Knifes;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.api.fuels.IFuelRegistry;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesCounter extends RecipeRegistry
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
    void registerFuels()
    {
        fuels.registerFuel(new ItemStack(ModItems.toolKnifeA));
        fuels.registerFuel(new ItemStack(ModItems.toolKnifeI));
        fuels.registerFuel(new ItemStack(ModItems.toolKnifeG));
        fuels.registerFuel(new ItemStack(ModItems.toolKnifeB));
        fuels2.registerFuel(new ItemStack(ModItems.toolCuttingBoard));
    }

    @Override
    void registerRecipes()
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