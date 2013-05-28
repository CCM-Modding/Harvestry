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
import ccm.nucleum_omnium.handler.enums.EnumHandler;

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
        GrinderRecipes.grinding().addGrinding(Item.wheat, EnumHandler.getItem(EnumItem.dustFlour));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Item.dyePowder, 1, 3), EnumHandler.getItem(EnumItemSixteen.globChocolate));
        GrinderRecipes.grinding().addGrinding(Item.reed, new ItemStack(Item.sugar));
        GrinderRecipes.grinding().addGrinding(Item.beefRaw, EnumHandler.getItem(EnumItem.dustBeef, 2));
        GrinderRecipes.grinding().addGrinding(EnumHandler.getItem(EnumItem.sliceCheese), EnumHandler.getItem(EnumItem.dustCheese));
        GrinderRecipes.grinding().addGrinding(EnumHandler.getItem(EnumFood.foodCheese), EnumHandler.getItem(EnumItem.dustCheese, 6));
        GrinderRecipes.grinding().addGrinding(EnumHandler.getItem(EnumItemSixteen.itemLettuceLeaf), EnumHandler.getItem(EnumItem.dustLettuce));
        // GrinderRecipes.grinding().addGrinding(EHandler.getItem(OresEnum.oreSalt),
        // EHandler.getItem(ItemEnum.dustSalt, 9));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.wood), EnumHandler.getItem(EnumItem.rawWood, 4));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.planks), EnumHandler.getItem(EnumItem.rawWood));
        GrinderRecipes.grinding().addGrinding(EnumHandler.getItem(EnumFood.foodSeedsPeanuts), EnumHandler.getItem(EnumItemSixteen.globPB));
        GrinderRecipes.grinding().addGrinding(Item.bone, new ItemStack(Item.dyePowder, 4, 15));
        GrinderRecipes.grinding().addGrinding(EnumHandler.getItem(EnumFood.foodTomato), EnumHandler.getItem(EnumItemSixteen.globTomato));
        GrinderRecipes.grinding().addGrinding(EnumHandler.getItem(EnumItem.seedsMustard), EnumHandler.getItem(EnumItemSixteen.rawMustard));

        // log cinnamon will not be in the ore dictionary
        // GrinderRecipes.grinding().addGrinding("logWood",
        // EHandler.getItem(EnumBaseItem.rawWood,
        // 4));
        // GrinderRecipes.grinding().addGrinding(ModBlocks.logCinnamon,
        // EHandler.getItem(EnumBaseItem.dustCinnamon, 4));
    }
}