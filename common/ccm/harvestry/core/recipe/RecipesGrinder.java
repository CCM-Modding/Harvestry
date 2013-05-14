package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.GrinderFuels;
import ccm.harvestry.api.recipes.GrinderRecipes;
import ccm.harvestry.core.handlers.EHandler;
import ccm.harvestry.enums.FoodEnum;
import ccm.harvestry.enums.ItemEnum;
import ccm.harvestry.enums.ItemEnumSixteen;
import ccm.harvestry.item.ModItems;

final class RecipesGrinder {

    public static void init() {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels() {
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gStone));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gGrate));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gIron));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    private static void registerRecipes() {
        GrinderRecipes.grinding().addGrinding(Item.wheat, EHandler.getItem(ItemEnum.dustFlour));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Item.dyePowder, 1, 3), EHandler.getItem(ItemEnumSixteen.globChocolate));
        GrinderRecipes.grinding().addGrinding(Item.reed, new ItemStack(Item.sugar));
        GrinderRecipes.grinding().addGrinding(Item.beefRaw, EHandler.getItem(ItemEnum.dustBeef, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(ItemEnum.sliceCheese), EHandler.getItem(ItemEnum.dustCheese));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(FoodEnum.foodCheese), EHandler.getItem(ItemEnum.dustCheese, 6));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(ItemEnumSixteen.itemLettuceLeaf), EHandler.getItem(ItemEnum.dustLettuce));
        // GrinderRecipes.grinding().addGrinding(EHandler.getItem(OresEnum.oreSalt), EHandler.getItem(ItemEnum.dustSalt, 9));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.wood), EHandler.getItem(ItemEnum.rawWood, 4));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.planks), EHandler.getItem(ItemEnum.rawWood));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(FoodEnum.foodSeedsPeanuts), EHandler.getItem(ItemEnumSixteen.globPB));
        GrinderRecipes.grinding().addGrinding(Item.bone, new ItemStack(Item.dyePowder, 4, 15));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(FoodEnum.foodTomato), EHandler.getItem(ItemEnumSixteen.globTomato));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(ItemEnum.seedsMustard), EHandler.getItem(ItemEnumSixteen.rawMustard));

        // log cinnamon will not be in the ore dictionary
        // GrinderRecipes.grinding().addGrinding("logWood",
        // EHandler.getItem(EnumBaseItem.rawWood,
        // 4));
        // GrinderRecipes.grinding().addGrinding(ModBlocks.logCinnamon,
        // EHandler.getItem(EnumBaseItem.dustCinnamon, 4));
    }
}