package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.CounterFuels;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;

final class RecipesCounter extends Recipes
{

    public RecipesCounter()
    {
        registerFuels();
        registerRecipes();
    }

    private void registerFuels()
    {
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeA));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeI));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeG));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeB));
        CounterFuels.registerCounterBoard(new ItemStack(ModItems.toolCuttingBoard));
    }

    private void registerRecipes()
    {
        CounterRecipes.cutting().addCutting(Item.bread, enumItem.getItemIS(EnumItem.sliceBread, 6));
        CounterRecipes.cutting().addCutting(enumItem.getItemIS(EnumItem.itemOnion), enumItem.getItemIS(EnumItem.sliceOnion, 3));
        CounterRecipes.cutting().addCutting(enumFood.getItemIS(EnumFood.foodTomato), enumItem.getItemIS(EnumItem.sliceTomato, 3));
        CounterRecipes.cutting().addCutting(enumFood.getItemIS(EnumFood.foodCheese), enumItem.getItemIS(EnumItem.sliceCheese, 6));
        CounterRecipes.cutting().addCutting(Item.chickenRaw, enumItem.getItemIS(EnumUncookedFood.uncookedChicken, 3), enumItem.getItemIS(EnumUncookedFood.uncookedChickenLeg, 2));
    }
}