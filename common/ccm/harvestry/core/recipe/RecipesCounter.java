package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.CounterFuels;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesCounter {
    
    public RecipesCounter() {
        registerFuels();
        registerRecipes();
    }
    
    private void registerFuels() {
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeA));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeI));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeG));
        CounterFuels.registerCounterKnife(new ItemStack(ModItems.toolKnifeB));
        CounterFuels.registerCounterBoard(new ItemStack(ModItems.toolCuttingBoard));
    }
    
    private void registerRecipes() {
        CounterRecipes.cutting().addCutting(Item.bread, EnumToItemStack.getItemIS(EnumItem.sliceBread, 6));
        CounterRecipes.cutting().addCutting(EnumToItemStack.getItemIS(EnumItem.itemOnion), EnumToItemStack.getItemIS(EnumItem.sliceOnion, 3));
        CounterRecipes.cutting().addCutting(EnumToItemStack.getItemIS(EnumFood.foodTomato), EnumToItemStack.getItemIS(EnumItem.sliceTomato, 3));
        CounterRecipes.cutting().addCutting(EnumToItemStack.getItemIS(EnumFood.foodCheese), EnumToItemStack.getItemIS(EnumItem.sliceCheese, 6));
        CounterRecipes.cutting().addCutting(Item.chickenRaw,
                                            EnumToItemStack.getItemIS(EnumUncookedFood.uncookedChicken, 3),
                                            EnumToItemStack.getItemIS(EnumUncookedFood.uncookedChickenLeg, 2));
    }
}