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
import ccm.nucleum_omnium.helper.enums.EnumHelper;

final class RecipesGrinder {

    public RecipesGrinder() {
        RecipesGrinder.registerFuels();
        RecipesGrinder.registerRecipes();
    }

    private static void registerFuels() {
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gStone));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gGrate));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gIron));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    private static void registerRecipes() {
        GrinderRecipes.grinding().addGrinding(Item.wheat, EnumHelper.getItemIS(EnumItem.dustFlour));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Item.dyePowder, 1, 3),
                EnumHelper.getItemIS(EnumItemSixteen.globChocolate));
        GrinderRecipes.grinding().addGrinding(Item.reed, new ItemStack(Item.sugar));
        GrinderRecipes.grinding().addGrinding(Item.beefRaw,
                EnumHelper.getItemIS(EnumItem.dustBeef, 2));
        GrinderRecipes.grinding().addGrinding(EnumHelper.getItemIS(EnumItem.sliceCheese),
                EnumHelper.getItemIS(EnumItem.dustCheese));
        GrinderRecipes.grinding().addGrinding(EnumHelper.getItemIS(EnumFood.foodCheese),
                EnumHelper.getItemIS(EnumItem.dustCheese, 6));
        GrinderRecipes.grinding().addGrinding(
                EnumHelper.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                EnumHelper.getItemIS(EnumItem.dustLettuce));
        // GrinderRecipes.grinding().addGrinding(EHandler.getItem(OresEnum.oreSalt),
        // EHandler.getItem(ItemEnum.dustSalt, 9));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.wood),
                EnumHelper.getItemIS(EnumItem.rawWood, 4));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.planks),
                EnumHelper.getItemIS(EnumItem.rawWood));
        GrinderRecipes.grinding().addGrinding(EnumHelper.getItemIS(EnumFood.foodSeedsPeanuts),
                EnumHelper.getItemIS(EnumItemSixteen.globPB));
        GrinderRecipes.grinding().addGrinding(Item.bone, new ItemStack(Item.dyePowder, 4, 15));
        GrinderRecipes.grinding().addGrinding(EnumHelper.getItemIS(EnumFood.foodTomato),
                EnumHelper.getItemIS(EnumItemSixteen.globTomato));
        GrinderRecipes.grinding().addGrinding(EnumHelper.getItemIS(EnumItem.seedsMustard),
                EnumHelper.getItemIS(EnumItemSixteen.rawMustard));

        // log cinnamon will not be in the ore dictionary
        // GrinderRecipes.grinding().addGrinding("logWood",
        // EHandler.getItem(EnumBaseItem.rawWood,
        // 4));
        // GrinderRecipes.grinding().addGrinding(ModBlocks.logCinnamon,
        // EHandler.getItem(EnumBaseItem.dustCinnamon, 4));
    }
}