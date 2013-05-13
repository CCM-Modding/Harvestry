package harvestry.core.recipe;

import harvestry.api.fuels.CounterFuels;
import harvestry.api.recipes.CounterRecipes;
import harvestry.core.handlers.EHandler;
import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseFood;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumUncookedFood;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

final class RecipesCounter {

    public static void init() {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels() {
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeA));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeI));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeG));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeB));
        CounterFuels.registerCounterBoard(new ItemStack(ModItems.toolCuttingBoard));
    }

    private static void registerRecipes() {
        CounterRecipes.cutting().addCutting(Item.bread, EHandler.getItem(EnumBaseItem.sliceBread, 6));
        CounterRecipes.cutting().addCutting(EHandler.getItem(EnumBaseItem.itemOnion), EHandler.getItem(EnumBaseItem.sliceOnion, 3));
        CounterRecipes.cutting().addCutting(EHandler.getItem(EnumBaseFood.foodTomato), EHandler.getItem(EnumBaseItem.sliceTomato, 3));
        CounterRecipes.cutting().addCutting(EHandler.getItem(EnumBaseFood.foodCheese), EHandler.getItem(EnumBaseItem.sliceCheese, 6));
        CounterRecipes.cutting().addCutting(Item.chickenRaw, EHandler.getItem(EnumUncookedFood.uncookedChicken, 3), EHandler.getItem(EnumUncookedFood.uncookedChickenLeg, 2));
    }
}