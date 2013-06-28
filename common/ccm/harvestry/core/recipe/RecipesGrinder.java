package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.GrinderFuels;
import ccm.harvestry.api.recipes.GrinderRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesGrinder {

	public RecipesGrinder() {
		registerFuels();
		registerRecipes();
	}

	private void registerFuels() {
		GrinderFuels.instance().registerFuel(new ItemStack(ModItems.gStone));
		GrinderFuels.instance().registerFuel(new ItemStack(ModItems.gGrate));
		GrinderFuels.instance().registerFuel(new ItemStack(ModItems.gIron));
		GrinderFuels.instance().registerFuel(new ItemStack(ModItems.gObsidian));
	}

	// needs ore dictionary
	private void registerRecipes() {
		GrinderRecipes.instance().addRecipe(Item.wheat, EnumToItemStack.getItemIS(EnumItem.dustFlour));
		GrinderRecipes.instance().addRecipe(new ItemStack(Item.dyePowder, 1, 3),
											EnumToItemStack.getItemIS(EnumItemSixteen.globChocolate));
		GrinderRecipes.instance().addRecipe(Item.reed, new ItemStack(Item.sugar));
		GrinderRecipes.instance().addRecipe(Item.beefRaw, EnumToItemStack.getItemIS(EnumItem.dustBeef, 2));
		GrinderRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.sliceCheese),
											EnumToItemStack.getItemIS(EnumItem.dustCheese));
		GrinderRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumFood.foodCheese),
											EnumToItemStack.getItemIS(EnumItem.dustCheese, 6));
		GrinderRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf),
											EnumToItemStack.getItemIS(EnumItem.dustLettuce));
		// GrinderRecipes.grinding().addGrinding(EHandler.getItem(OresEnum.oreSalt),
		// EHandler.getItem(ItemEnum.dustSalt, 9));
		GrinderRecipes.instance().addRecipe(new ItemStack(Block.wood),
											EnumToItemStack.getItemIS(EnumItem.rawWood, 4));
		GrinderRecipes.instance().addRecipe(new ItemStack(Block.planks),
											EnumToItemStack.getItemIS(EnumItem.rawWood));
		GrinderRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumFood.foodSeedsPeanuts),
											EnumToItemStack.getItemIS(EnumItemSixteen.globPB));
		GrinderRecipes.instance().addRecipe(Item.bone, new ItemStack(Item.dyePowder, 4, 15));
		GrinderRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumFood.foodTomato),
											EnumToItemStack.getItemIS(EnumItemSixteen.globTomato));
		GrinderRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.seedsMustard),
											EnumToItemStack.getItemIS(EnumItemSixteen.rawMustard));

		// log cinnamon will not be in the ore dictionary
		// GrinderRecipes.grinding().addGrinding("logWood",
		// EHandler.getItem(EnumBaseItem.rawWood,
		// 4));
		// GrinderRecipes.grinding().addGrinding(ModBlocks.logCinnamon,
		// EHandler.getItem(EnumBaseItem.dustCinnamon, 4));
	}
}