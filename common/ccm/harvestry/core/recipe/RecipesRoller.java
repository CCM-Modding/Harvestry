package ccm.harvestry.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.nucleum_omnium.helper.enums.EnumHelper;

import ccm.harvestry.api.fuels.RollerFuels;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;

final class RecipesRoller
{

    public RecipesRoller()
    {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels()
    {
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gStone));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gIron));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gBronze));
        RollerFuels.registerRollerFuel(new ItemStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    private static void registerRecipes()
    {
        RollerRecipes.rolling().addRolling(EnumHelper.getItemIS(EnumItem.sheetAluminum), EnumHelper.getItemIS(EnumItem.foilAluminum));
        RollerRecipes.rolling().addRolling(EnumHelper.getItemIS(EnumItem.sheetGold), EnumHelper.getItemIS(EnumItem.foilGold));
        RollerRecipes.rolling().addRolling(EnumHelper.getItemIS(EnumItem.ingotAluminum), EnumHelper.getItemIS(EnumItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminium",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("naturalAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.ingotGold), EnumHelper.getItemIS(EnumItem.sheetGold));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.ingotIron), EnumHelper.getItemIS(EnumItem.sheetIron));
        // RollerRecipes.rolling().addRolling("ingotTin",
        // EHandler.getItem(EnumBaseItem.sheetTin));
        // RollerRecipes.rolling().addRolling("ingotCopper",
        // EHandler.getItem(EnumBaseItem.sheetCopper));
        // RollerRecipes.rolling().addRolling("ingotBronze",
        // EHandler.getItem(EnumBaseItem.sheetBronze));
        RollerRecipes.rolling().addRolling(EnumHelper.getItemIS(EnumItem.globDough), EnumHelper.getItemIS(EnumItemSixteen.rawPizza));
        RollerRecipes.rolling().addRolling(EnumHelper.getItemIS(EnumItem.globDoughCorn), EnumHelper.getItemIS(EnumUncookedFood.uncookedTortilla));
        RollerRecipes.rolling().addRolling(new ItemStack(ModItems.toolShovel), new ItemStack(ModItems.toolFlatShovel));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelWood), new ItemStack(ModItems.toolFlatShovelWood));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelStone), new ItemStack(ModItems.toolFlatShovelStone));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelIron), new ItemStack(ModItems.toolFlatShovelIron));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelDiamond), new ItemStack(ModItems.toolFlatShovelDiamond));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelGold), new ItemStack(ModItems.toolFlatShovelGold));
    }
}