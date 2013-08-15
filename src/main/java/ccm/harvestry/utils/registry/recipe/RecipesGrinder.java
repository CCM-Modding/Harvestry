/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.harvestry.api.fuels.GrinderFuels;
import ccm.harvestry.api.recipes.GrinderRecipes;
import ccm.harvestry.block.enums.EnumOres;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.item.enums.EnumFood;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.item.enums.EnumItemSixteen;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;
import ccm.nucleum_omnium.utils.registry.recipe.IRecipeRegistry;

final class RecipesGrinder extends IRecipeRegistry
{

    public RecipesGrinder()
    {
        fuels = GrinderFuels.instance();
        recipes = GrinderRecipes.instance();
        register();
    }

    @Override
    protected void registerFuels()
    {
        fuels.registerFuel(new ItemStack(ModItems.gStone));
        fuels.registerFuel(new ItemStack(ModItems.gGrate));
        fuels.registerFuel(new ItemStack(ModItems.gIron));
        fuels.registerFuel(new ItemStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(new ItemStack(Item.wheat), EnumToItemStack.getItemIS(EnumItem.dustFlour));
        recipes.addRecipe(new ItemStack(Item.dyePowder, 1, 3), EnumToItemStack.getItemIS(EnumItemSixteen.globChocolate));
        recipes.addRecipe(new ItemStack(Item.reed), new ItemStack(Item.sugar));
        recipes.addRecipe(new ItemStack(Item.beefRaw), EnumToItemStack.getItemIS(EnumItem.dustBeef, 2));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.sliceCheese), EnumToItemStack.getItemIS(EnumItem.dustCheese));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumFood.foodCheese), EnumToItemStack.getItemIS(EnumItem.dustCheese, 6));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf), EnumToItemStack.getItemIS(EnumItem.dustLettuce));
        recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOres.oreSalt), EnumToItemStack.getItemIS(EnumItem.dustSalt, 9));
        recipes.addRecipe(new ItemStack(Block.wood), EnumToItemStack.getItemIS(EnumItem.rawWood, 4));
        recipes.addRecipe(new ItemStack(Block.planks), EnumToItemStack.getItemIS(EnumItem.rawWood));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumFood.foodSeedsPeanuts), EnumToItemStack.getItemIS(EnumItemSixteen.globPB));
        recipes.addRecipe(new ItemStack(Item.bone), new ItemStack(Item.dyePowder, 4, 15));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumFood.foodTomato), EnumToItemStack.getItemIS(EnumItemSixteen.globTomato));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumItem.seedsMustard), EnumToItemStack.getItemIS(EnumItemSixteen.rawMustard));

        // log cinnamon will not be in the ore dictionary
        // recipes.addRecipe("logWood",
        // EnumToItemStack.getBlockIS(EnumBaseItem.rawWood, 4));
        // recipes.addRecipe( ModBlocks.logCinnamon,
        // EnumToItemStack.getItem(EnumBaseItem.dustCinnamon, 4));
    }
}