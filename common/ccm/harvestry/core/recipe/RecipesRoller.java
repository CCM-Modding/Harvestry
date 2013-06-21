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
        registerFuels();
        registerRecipes();
    }
    
    private void registerFuels() {
        RollerFuels.instance().registerFuel(new ItemStack(ModItems.gStone));
        RollerFuels.instance().registerFuel(new ItemStack(ModItems.gIron));
        RollerFuels.instance().registerFuel(new ItemStack(ModItems.gBronze));
        RollerFuels.instance().registerFuel(new ItemStack(ModItems.gObsidian));
    }
    
    // needs ore dictionary
    private void registerRecipes() {
        RollerRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.sheetAluminum), EnumToItemStack.getItemIS(EnumItem.foilAluminum));
        RollerRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.sheetGold), EnumToItemStack.getItemIS(EnumItem.foilGold));
        RollerRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.ingotAluminum), EnumToItemStack.getItemIS(EnumItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminium",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("naturalAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        RollerRecipes.instance().addRecipe(new ItemStack(Item.ingotGold), EnumToItemStack.getItemIS(EnumItem.sheetGold));
        RollerRecipes.instance().addRecipe(new ItemStack(Item.ingotIron), EnumToItemStack.getItemIS(EnumItem.sheetIron));
        // RollerRecipes.rolling().addRolling("ingotTin",
        // EHandler.getItem(EnumBaseItem.sheetTin));
        // RollerRecipes.rolling().addRolling("ingotCopper",
        // EHandler.getItem(EnumBaseItem.sheetCopper));
        // RollerRecipes.rolling().addRolling("ingotBronze",
        // EHandler.getItem(EnumBaseItem.sheetBronze));
        RollerRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.globDough), EnumToItemStack.getItemIS(EnumItemSixteen.rawPizza));
        RollerRecipes.instance().addRecipe(EnumToItemStack.getItemIS(EnumItem.globDoughCorn), EnumToItemStack.getItemIS(EnumUncookedFood.uncookedTortilla));
        RollerRecipes.instance().addRecipe(new ItemStack(ModItems.toolShovel), new ItemStack(ModItems.toolFlatShovel));
        RollerRecipes.instance().addRecipe(new ItemStack(Item.shovelWood), new ItemStack(ModItems.toolFlatShovelWood));
        RollerRecipes.instance().addRecipe(new ItemStack(Item.shovelStone), new ItemStack(ModItems.toolFlatShovelStone));
        RollerRecipes.instance().addRecipe(new ItemStack(Item.shovelIron), new ItemStack(ModItems.toolFlatShovelIron));
        RollerRecipes.instance().addRecipe(new ItemStack(Item.shovelDiamond), new ItemStack(ModItems.toolFlatShovelDiamond));
        RollerRecipes.instance().addRecipe(new ItemStack(Item.shovelGold), new ItemStack(ModItems.toolFlatShovelGold));
    }
}