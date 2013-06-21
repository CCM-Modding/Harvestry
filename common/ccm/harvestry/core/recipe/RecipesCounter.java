package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.Boards;
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
        Boards.registerKnife(new ItemStack(ModItems.toolKnifeA));
        Boards.registerKnife(new ItemStack(ModItems.toolKnifeI));
        Boards.registerKnife(new ItemStack(ModItems.toolKnifeG));
        Boards.registerKnife(new ItemStack(ModItems.toolKnifeB));
        Boards.registerBoard(new ItemStack(ModItems.toolCuttingBoard));
    }
    
    private void registerRecipes() {
        CounterRecipes.instance().addRecipe(Item.bread, EnumToItemStack.getItemIS(EnumItem.sliceBread, 6));
        CounterRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.itemOnion), EnumToItemStack.getItemIS(EnumItem.sliceOnion, 3));
        CounterRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumFood.foodTomato), EnumToItemStack.getItemIS(EnumItem.sliceTomato, 3));
        CounterRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumFood.foodCheese), EnumToItemStack.getItemIS(EnumItem.sliceCheese, 6));
        CounterRecipes.instance().addRecipe(Item.chickenRaw,
                                            EnumToItemStack.getItemIS(EnumUncookedFood.uncookedChicken, 3),
                                            EnumToItemStack.getItemIS(EnumUncookedFood.uncookedChickenLeg, 2));
    }
}