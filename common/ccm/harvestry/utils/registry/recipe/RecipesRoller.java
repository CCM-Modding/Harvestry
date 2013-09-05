/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import net.minecraft.item.Item;

import ccm.harvestry.api.fuels.RollerFuels;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.item.enums.EnumItemSixteen;
import ccm.harvestry.item.enums.EnumUncookedFood;
import ccm.nucleum.omnium.utils.helper.item.WrapperStack;
import ccm.nucleum.omnium.utils.registry.recipe.IRecipeRegistry;

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
        fuels.registerFuel(new WrapperStack(ModItems.gStone));
        fuels.registerFuel(new WrapperStack(ModItems.gIron));
        fuels.registerFuel(new WrapperStack(ModItems.gBronze));
        fuels.registerFuel(new WrapperStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(new WrapperStack(EnumItem.sheetAluminum), new WrapperStack(EnumItem.foilAluminum));
        recipes.addRecipe(new WrapperStack(EnumItem.sheetGold), new WrapperStack(EnumItem.foilGold));
        recipes.addRecipe(new WrapperStack(EnumItem.ingotAluminum), new WrapperStack(EnumItem.sheetAluminum));
        // recipes.addRecipe("ingotAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // recipes.addRecipe("ingotAluminium",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // recipes.addRecipe("naturalAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        recipes.addRecipe(new WrapperStack(Item.ingotGold), new WrapperStack(EnumItem.sheetGold));
        recipes.addRecipe(new WrapperStack(Item.ingotIron), new WrapperStack(EnumItem.sheetIron));
        // recipes.addRecipe("ingotTin",
        // EHandler.getItem(EnumBaseItem.sheetTin));
        // recipes.addRecipe("ingotCopper",
        // EHandler.getItem(EnumBaseItem.sheetCopper));
        // recipes.addRecipe("ingotBronze",
        // EHandler.getItem(EnumBaseItem.sheetBronze));
        recipes.addRecipe(new WrapperStack(EnumItem.globDough), new WrapperStack(EnumItemSixteen.rawPizza));
        recipes.addRecipe(new WrapperStack(EnumItem.globDoughCorn), new WrapperStack(EnumUncookedFood.uncookedTortilla));
        recipes.addRecipe(new WrapperStack(ModItems.toolShovel), new WrapperStack(ModItems.toolFlatShovel));
        recipes.addRecipe(new WrapperStack(Item.shovelWood), new WrapperStack(ModItems.toolFlatShovelWood));
        recipes.addRecipe(new WrapperStack(Item.shovelStone), new WrapperStack(ModItems.toolFlatShovelStone));
        recipes.addRecipe(new WrapperStack(Item.shovelIron), new WrapperStack(ModItems.toolFlatShovelIron));
        recipes.addRecipe(new WrapperStack(Item.shovelDiamond), new WrapperStack(ModItems.toolFlatShovelDiamond));
        recipes.addRecipe(new WrapperStack(Item.shovelGold), new WrapperStack(ModItems.toolFlatShovelGold));
    }
}