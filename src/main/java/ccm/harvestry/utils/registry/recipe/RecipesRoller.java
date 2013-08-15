/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.harvestry.api.fuels.RollerFuels;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.item.enums.EnumItemSixteen;
import ccm.harvestry.item.enums.EnumUncookedFood;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;
import ccm.nucleum_omnium.utils.registry.recipe.IRecipeRegistry;

final class RecipesRoller extends IRecipeRegistry
{

    public RecipesRoller()
    {
        fuels = RollerFuels.instance();
        recipes = RollerRecipes.instance();
        register();
    }

    @Override
    protected void registerFuels()
    {
        fuels.registerFuel(new ItemStack(ModItems.gStone));
        fuels.registerFuel(new ItemStack(ModItems.gIron));
        fuels.registerFuel(new ItemStack(ModItems.gBronze));
        fuels.registerFuel(new ItemStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.sheetAluminum), EnumToItemStack.getItemIS(EnumItem.foilAluminum));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.sheetGold), EnumToItemStack.getItemIS(EnumItem.foilGold));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.ingotAluminum), EnumToItemStack.getItemIS(EnumItem.sheetAluminum));
        // recipes.addRecipe("ingotAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // recipes.addRecipe("ingotAluminium",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // recipes.addRecipe("naturalAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        recipes.addRecipe(new ItemStack(Item.ingotGold), EnumToItemStack.getItemIS(EnumItem.sheetGold));
        recipes.addRecipe(new ItemStack(Item.ingotIron), EnumToItemStack.getItemIS(EnumItem.sheetIron));
        // recipes.addRecipe("ingotTin",
        // EHandler.getItem(EnumBaseItem.sheetTin));
        // recipes.addRecipe("ingotCopper",
        // EHandler.getItem(EnumBaseItem.sheetCopper));
        // recipes.addRecipe("ingotBronze",
        // EHandler.getItem(EnumBaseItem.sheetBronze));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.globDough), EnumToItemStack.getItemIS(EnumItemSixteen.rawPizza));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.globDoughCorn), EnumToItemStack.getItemIS(EnumUncookedFood.uncookedTortilla));
        recipes.addRecipe(new ItemStack(ModItems.toolShovel), new ItemStack(ModItems.toolFlatShovel));
        recipes.addRecipe(new ItemStack(Item.shovelWood), new ItemStack(ModItems.toolFlatShovelWood));
        recipes.addRecipe(new ItemStack(Item.shovelStone), new ItemStack(ModItems.toolFlatShovelStone));
        recipes.addRecipe(new ItemStack(Item.shovelIron), new ItemStack(ModItems.toolFlatShovelIron));
        recipes.addRecipe(new ItemStack(Item.shovelDiamond), new ItemStack(ModItems.toolFlatShovelDiamond));
        recipes.addRecipe(new ItemStack(Item.shovelGold), new ItemStack(ModItems.toolFlatShovelGold));
    }
}