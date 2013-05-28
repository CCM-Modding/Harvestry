package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.CounterFuels;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.EnumHandling;

final class RecipesCounter
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
        CounterRecipes.cutting().addCutting(Item.bread, EnumHandling.enumItem.getItemIS(EnumItem.sliceBread, 6));
        CounterRecipes.cutting().addCutting(EnumHandling.enumItem.getItemIS(EnumItem.itemOnion), EnumHandling.enumItem.getItemIS(EnumItem.sliceOnion, 3));
        CounterRecipes.cutting().addCutting(EnumHandling.enumFood.getItemIS(EnumFood.foodTomato), EnumHandling.enumItem.getItemIS(EnumItem.sliceTomato, 3));
        CounterRecipes.cutting().addCutting(EnumHandling.enumFood.getItemIS(EnumFood.foodCheese), EnumHandling.enumItem.getItemIS(EnumItem.sliceCheese, 6));
        CounterRecipes.cutting().addCutting(Item.chickenRaw, EnumHandling.enumItem.getItemIS(EnumUncookedFood.uncookedChicken, 3), EnumHandling.enumItem.getItemIS(EnumUncookedFood.uncookedChickenLeg, 2));
    }
}