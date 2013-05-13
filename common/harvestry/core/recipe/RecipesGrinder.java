package harvestry.core.recipe;

import harvestry.api.fuels.GrinderFuels;
import harvestry.api.recipes.GrinderRecipes;
import harvestry.block.ModBlocks;
import harvestry.core.handlers.EHandler;
import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseFood;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumNonStack;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
        GrinderRecipes.grinding().addGrinding(Item.wheat, EHandler.getItem(EnumBaseItem.dustFlour));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Item.dyePowder, 1, 3), EHandler.getItem(EnumNonStack.globChocolate));
        GrinderRecipes.grinding().addGrinding(Item.reed, new ItemStack(Item.sugar));
        GrinderRecipes.grinding().addGrinding(Item.beefRaw, EHandler.getItem(EnumBaseItem.dustBeef, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumBaseItem.sliceCheese), EHandler.getItem(EnumBaseItem.dustCheese));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumBaseFood.foodCheese), EHandler.getItem(EnumBaseItem.dustCheese, 6));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumNonStack.itemLettuceLeaf), EHandler.getItem(EnumBaseItem.dustLettuce));
        GrinderRecipes.grinding().addGrinding(new ItemStack(ModBlocks.oreSalt), EHandler.getItem(EnumBaseItem.dustSalt, 9));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.wood), EHandler.getItem(EnumBaseItem.rawWood, 4));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.planks), EHandler.getItem(EnumBaseItem.rawWood));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumBaseFood.foodSeedsPeanuts), EHandler.getItem(EnumNonStack.globPB));
        GrinderRecipes.grinding().addGrinding(Item.bone, new ItemStack(Item.dyePowder, 4, 15));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumBaseFood.foodTomato), EHandler.getItem(EnumNonStack.globTomato));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumBaseItem.seedsMustard), EHandler.getItem(EnumNonStack.rawMustard));

        // GrinderRecipes.grinding().addGrinding("logWood", EHandler.getItem(EnumBaseItem.rawWood, 4));
        // GrinderRecipes.grinding().addGrinding("plankWood", EHandler.getItem(EnumBaseItem.rawWood));
        
        // log cinnamon will not be in the ore dictionary
        // GrinderRecipes.grinding().addGrinding(new ItemStack(ModBlocks.logCinnamon), EHandler.getItem(EnumBaseItem.dustCinnamon, 4));
    }
}