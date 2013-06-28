package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.GrillFuels;
import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesGrill {

	public RecipesGrill() {
		registerFuels();
		registerRecipes();
	}

	private void registerFuels() {
		GrillFuels.instance().registerFuel(new ItemStack(Item.coal, 1, 1));
	}

	private void registerRecipes() {
		GrillRecipes.instance().addRecipe(	EnumToItemStack.getItemIS(EnumUncookedFood.uncookedChicken),
											EnumToItemStack.getItemIS(EnumFood.foodChickenGrilled));
		GrillRecipes.instance().addRecipe(	EnumToItemStack.getItemIS(EnumFood.foodSandwichCheese),
											EnumToItemStack.getItemIS(EnumFood.foodSandwichCheeseGrilled));
		GrillRecipes.instance().addRecipe(new ItemStack(Item.porkRaw), new ItemStack(Item.porkCooked));
		GrillRecipes.instance().addRecipe(new ItemStack(Item.beefRaw), new ItemStack(Item.beefCooked));
		GrillRecipes.instance().addRecipe(new ItemStack(Item.fishRaw), new ItemStack(Item.fishCooked));
	}
}