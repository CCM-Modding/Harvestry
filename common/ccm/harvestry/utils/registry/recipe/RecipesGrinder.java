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
import ccm.nucleum.omnium.utils.helper.item.WrapperStack;
import ccm.nucleum.omnium.utils.registry.recipe.IRecipeRegistry;

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
        fuels.registerFuel(new WrapperStack(ModItems.gStone));
        fuels.registerFuel(new WrapperStack(ModItems.gGrate));
        fuels.registerFuel(new WrapperStack(ModItems.gIron));
        fuels.registerFuel(new WrapperStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    @Override
    protected void registerRecipes()
    {
        recipes.addRecipe(new WrapperStack(Item.wheat), new WrapperStack(EnumItem.dustFlour));
        recipes.addRecipe(new WrapperStack(new ItemStack(Item.dyePowder, 1, 3)), new WrapperStack(EnumItemSixteen.globChocolate));
        recipes.addRecipe(new WrapperStack(Item.reed), new WrapperStack(Item.sugar));
        recipes.addRecipe(new WrapperStack(Item.beefRaw), new WrapperStack(EnumItem.dustBeef).setStackSize(2));
        recipes.addRecipe(new WrapperStack(EnumItem.sliceCheese), new WrapperStack(EnumItem.dustCheese));
        recipes.addRecipe(new WrapperStack(EnumFood.foodCheese), new WrapperStack(EnumItem.dustCheese).setStackSize(6));
        recipes.addRecipe(new WrapperStack(EnumItemSixteen.itemLettuceLeaf), new WrapperStack(EnumItem.dustLettuce));
        recipes.addRecipe(new WrapperStack(EnumOres.oreSalt), new WrapperStack(EnumItem.dustSalt).setStackSize(9));
        recipes.addRecipe(new WrapperStack(Block.wood), new WrapperStack(EnumItem.rawWood).setStackSize(4));
        recipes.addRecipe(new WrapperStack(Block.planks), new WrapperStack(EnumItem.rawWood));
        recipes.addRecipe(new WrapperStack(EnumFood.foodSeedsPeanuts), new WrapperStack(EnumItemSixteen.globPB));
        recipes.addRecipe(new WrapperStack(Item.bone), new WrapperStack(new ItemStack(Item.dyePowder, 4, 15)));
        recipes.addRecipe(new WrapperStack(EnumFood.foodTomato), new WrapperStack(EnumItemSixteen.globTomato));
        recipes.addRecipe(new WrapperStack(EnumItem.seedsMustard), new WrapperStack(EnumItemSixteen.rawMustard));

        // log cinnamon will not be in the ore dictionary
        recipes.addRecipe(new WrapperStack("logWood"), new WrapperStack(EnumItem.rawWood).setStackSize(4));
        //recipes.addRecipe(EnumBlocks.logCinnamon, EnumToItemStack.getItemWS(EnumItem.dustCinnamon, 4));
    }
}