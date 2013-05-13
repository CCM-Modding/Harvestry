package harvestry.core.recipe;

import harvestry.api.fuels.RollerFuels;
import harvestry.api.recipes.RollerRecipes;
import harvestry.core.handlers.EHandler;
import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumNonStack;
import harvestry.item.enums.EnumUncookedFood;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

final class RecipesRoller {

    public static void init() {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels() {
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gStone));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gIron));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gBronze));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    private static void registerRecipes() {
        RollerRecipes.rolling().addRolling(EHandler.getItem(EnumBaseItem.sheetAluminum), EHandler.getItem(EnumBaseItem.foilAluminum));
        RollerRecipes.rolling().addRolling(EHandler.getItem(EnumBaseItem.sheetGold), EHandler.getItem(EnumBaseItem.foilGold));
        RollerRecipes.rolling().addRolling(EHandler.getItem(EnumBaseItem.ingotAluminum), EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminum", EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminium", EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("naturalAluminum", EHandler.getItem(EnumBaseItem.sheetAluminum));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.ingotGold), EHandler.getItem(EnumBaseItem.sheetGold));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.ingotIron), EHandler.getItem(EnumBaseItem.sheetIron));
        // RollerRecipes.rolling().addRolling("ingotTin", EHandler.getItem(EnumBaseItem.sheetTin));
        // RollerRecipes.rolling().addRolling("ingotCopper", EHandler.getItem(EnumBaseItem.sheetCopper));
        // RollerRecipes.rolling().addRolling("ingotBronze", EHandler.getItem(EnumBaseItem.sheetBronze));
        RollerRecipes.rolling().addRolling(EHandler.getItem(EnumBaseItem.globDough), EHandler.getItem(EnumNonStack.rawPizza));
        RollerRecipes.rolling().addRolling(EHandler.getItem(EnumBaseItem.globDoughCorn), EHandler.getItem(EnumUncookedFood.uncookedTortilla));
        RollerRecipes.rolling().addRolling(new ItemStack(ModItems.toolShovel), new ItemStack(ModItems.toolFlatShovel));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelWood), new ItemStack(ModItems.toolFlatShovelWood));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelStone), new ItemStack(ModItems.toolFlatShovelStone));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelIron), new ItemStack(ModItems.toolFlatShovelIron));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelDiamond), new ItemStack(ModItems.toolFlatShovelDiamond));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelGold), new ItemStack(ModItems.toolFlatShovelGold));
    }
}