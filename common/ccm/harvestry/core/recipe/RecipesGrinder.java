package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.harvestry.api.fuels.GrinderFuels;
import ccm.harvestry.api.recipes.GrinderRecipes;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.EnumHandling;

final class RecipesGrinder
{

    public RecipesGrinder()
    {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels()
    {
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gStone));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gGrate));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gIron));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gObsidian));
    }

    // needs ore dictionary
    private static void registerRecipes()
    {
        GrinderRecipes.grinding().addGrinding(Item.wheat, EnumHandling.enumItem.getItemIS(EnumItem.dustFlour));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Item.dyePowder, 1, 3), EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globChocolate));
        GrinderRecipes.grinding().addGrinding(Item.reed, new ItemStack(Item.sugar));
        GrinderRecipes.grinding().addGrinding(Item.beefRaw, EnumHandling.enumItem.getItemIS(EnumItem.dustBeef, 2));
        GrinderRecipes.grinding().addGrinding(EnumHandling.enumItem.getItemIS(EnumItem.sliceCheese), EnumHandling.enumItem.getItemIS(EnumItem.dustCheese));
        GrinderRecipes.grinding().addGrinding(EnumHandling.enumFood.getItemIS(EnumFood.foodCheese), EnumHandling.enumItem.getItemIS(EnumItem.dustCheese, 6));
        GrinderRecipes.grinding().addGrinding(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemLettuceLeaf), EnumHandling.enumItem.getItemIS(EnumItem.dustLettuce));
        // GrinderRecipes.grinding().addGrinding(EHandler.getItem(OresEnum.oreSalt),
        // EHandler.getItem(ItemEnum.dustSalt, 9));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.wood), EnumHandling.enumItem.getItemIS(EnumItem.rawWood, 4));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.planks), EnumHandling.enumItem.getItemIS(EnumItem.rawWood));
        GrinderRecipes.grinding().addGrinding(EnumHandling.enumFood.getItemIS(EnumFood.foodSeedsPeanuts), EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globPB));
        GrinderRecipes.grinding().addGrinding(Item.bone, new ItemStack(Item.dyePowder, 4, 15));
        GrinderRecipes.grinding().addGrinding(EnumHandling.enumFood.getItemIS(EnumFood.foodTomato), EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globTomato));
        GrinderRecipes.grinding().addGrinding(EnumHandling.enumItem.getItemIS(EnumItem.seedsMustard), EnumHandling.enumItem16.getItemIS(EnumItemSixteen.rawMustard));

        // log cinnamon will not be in the ore dictionary
        // GrinderRecipes.grinding().addGrinding("logWood",
        // EHandler.getItem(EnumBaseItem.rawWood,
        // 4));
        // GrinderRecipes.grinding().addGrinding(ModBlocks.logCinnamon,
        // EHandler.getItem(EnumBaseItem.dustCinnamon, 4));
    }
}