package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.CounterFuels;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.handler.enums.EnumHandler;

final class RecipesCounter
{
    private static EnumHandler enumFood = new EnumHandler(ModItems.class, "foodItem");

    public static void init()
    {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels()
    {
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeA));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeI));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeG));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeB));
        CounterFuels.registerCounterBoard(new ItemStack(ModItems.toolCuttingBoard));
    }

    private static void registerRecipes()
    {
        CounterRecipes.cutting().addCutting(Item.bread, enumH.getItemIS(EnumItem.sliceBread, 6));
        CounterRecipes.cutting().addCutting(enumH.getItemIS(EnumItem.itemOnion), enumH.getItemIS(EnumItem.sliceOnion, 3));
        CounterRecipes.cutting().addCutting(enumFood.getItemIS(EnumFood.foodTomato), enumH.getItemIS(EnumItem.sliceTomato, 3));
        CounterRecipes.cutting().addCutting(enumFood.getItemIS(EnumFood.foodCheese), enumH.getItemIS(EnumItem.sliceCheese, 6));
        CounterRecipes.cutting().addCutting(Item.chickenRaw, enumH.getItemIS(EnumUncookedFood.uncookedChicken, 3), enumH.getItemIS(EnumUncookedFood.uncookedChickenLeg, 2));
    }
}