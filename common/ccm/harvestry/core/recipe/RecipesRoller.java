package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.RollerFuels;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesRoller {

    public RecipesRoller() {
        RecipesRoller.registerFuels();
        RecipesRoller.registerRecipes();
    }

    private static void registerFuels() {
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gStone));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gIron));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gBronze));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    private static void registerRecipes() {
        RollerRecipes.rolling().addRolling(EnumToItemStack.getItemIS(EnumItem.sheetAluminum),
                EnumToItemStack.getItemIS(EnumItem.foilAluminum));
        RollerRecipes.rolling().addRolling(EnumToItemStack.getItemIS(EnumItem.sheetGold),
                EnumToItemStack.getItemIS(EnumItem.foilGold));
        RollerRecipes.rolling().addRolling(EnumToItemStack.getItemIS(EnumItem.ingotAluminum),
                EnumToItemStack.getItemIS(EnumItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminium",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("naturalAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.ingotGold),
                EnumToItemStack.getItemIS(EnumItem.sheetGold));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.ingotIron),
                EnumToItemStack.getItemIS(EnumItem.sheetIron));
        // RollerRecipes.rolling().addRolling("ingotTin",
        // EHandler.getItem(EnumBaseItem.sheetTin));
        // RollerRecipes.rolling().addRolling("ingotCopper",
        // EHandler.getItem(EnumBaseItem.sheetCopper));
        // RollerRecipes.rolling().addRolling("ingotBronze",
        // EHandler.getItem(EnumBaseItem.sheetBronze));
        RollerRecipes.rolling().addRolling(EnumToItemStack.getItemIS(EnumItem.globDough),
                EnumToItemStack.getItemIS(EnumItemSixteen.rawPizza));
        RollerRecipes.rolling().addRolling(EnumToItemStack.getItemIS(EnumItem.globDoughCorn),
                EnumToItemStack.getItemIS(EnumUncookedFood.uncookedTortilla));
        RollerRecipes.rolling().addRolling(new ItemStack(ModItems.toolShovel),
                new ItemStack(ModItems.toolFlatShovel));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelWood),
                new ItemStack(ModItems.toolFlatShovelWood));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelStone),
                new ItemStack(ModItems.toolFlatShovelStone));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelIron),
                new ItemStack(ModItems.toolFlatShovelIron));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelDiamond),
                new ItemStack(ModItems.toolFlatShovelDiamond));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelGold),
                new ItemStack(ModItems.toolFlatShovelGold));
    }
}