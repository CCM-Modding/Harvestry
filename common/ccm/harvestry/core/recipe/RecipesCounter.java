package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.CounterFuels;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.core.handlers.EHandler;
import ccm.harvestry.enums.FoodEnum;
import ccm.harvestry.enums.ItemEnum;
import ccm.harvestry.enums.UncookedFoodEnum;
import ccm.harvestry.item.ModItems;

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
        CounterRecipes.cutting().addCutting(Item.bread, EHandler.getItem(ItemEnum.sliceBread, 6));
        CounterRecipes.cutting().addCutting(EHandler.getItem(ItemEnum.itemOnion), EHandler.getItem(ItemEnum.sliceOnion, 3));
        CounterRecipes.cutting().addCutting(EHandler.getItem(FoodEnum.foodTomato), EHandler.getItem(ItemEnum.sliceTomato, 3));
        CounterRecipes.cutting().addCutting(EHandler.getItem(FoodEnum.foodCheese), EHandler.getItem(ItemEnum.sliceCheese, 6));
        CounterRecipes.cutting().addCutting(Item.chickenRaw, EHandler.getItem(UncookedFoodEnum.uncookedChicken, 3), EHandler.getItem(UncookedFoodEnum.uncookedChickenLeg, 2));
    }
}