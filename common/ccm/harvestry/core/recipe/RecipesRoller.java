package ccm.harvestry.core.recipe;

<<<<<<< HEAD:common/harvestry/core/recipe/RecipesRoller.java
import harvestry.api.fuels.RollerFuels;
import harvestry.api.recipes.RollerRecipes;
import harvestry.core.handlers.EHandler;
import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumNonStack;
import harvestry.item.enums.EnumUncookedFood;
=======
>>>>>>> Working update:common/ccm/harvestry/core/recipe/RecipesRoller.java
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.harvestry.api.fuels.RollerFuels;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.harvestry.core.handlers.EHandler;
import ccm.harvestry.enums.ItemEnum;
import ccm.harvestry.enums.ItemEnumSixteen;
import ccm.harvestry.item.ModItems;

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
<<<<<<< HEAD:common/harvestry/core/recipe/RecipesRoller.java
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
=======
    private static void registerRecipes()
    {
        RollerRecipes.rolling().addRolling(EHandler.getItem(ItemEnum.sheetAluminum), EHandler.getItem(ItemEnum.foilAluminum));
        RollerRecipes.rolling().addRolling(EHandler.getItem(ItemEnum.sheetGold), EHandler.getItem(ItemEnum.foilGold));
        RollerRecipes.rolling().addRolling(EHandler.getItem(ItemEnum.ingotAluminum), EHandler.getItem(ItemEnum.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("ingotAluminium",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        // RollerRecipes.rolling().addRolling("naturalAluminum",
        // EHandler.getItem(EnumBaseItem.sheetAluminum));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.ingotGold), EHandler.getItem(ItemEnum.sheetGold));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.ingotIron), EHandler.getItem(ItemEnum.sheetIron));
        // RollerRecipes.rolling().addRolling("ingotTin", EHandler.getItem(EnumBaseItem.sheetTin));
        // RollerRecipes.rolling().addRolling("ingotCopper",
        // EHandler.getItem(EnumBaseItem.sheetCopper));
        // RollerRecipes.rolling().addRolling("ingotBronze",
        // EHandler.getItem(EnumBaseItem.sheetBronze));
        RollerRecipes.rolling().addRolling(EHandler.getItem(ItemEnum.globDough), EHandler.getItem(ItemEnumSixteen.rawPizza));
>>>>>>> Working update:common/ccm/harvestry/core/recipe/RecipesRoller.java
        RollerRecipes.rolling().addRolling(new ItemStack(ModItems.toolShovel), new ItemStack(ModItems.toolFlatShovel));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelWood), new ItemStack(ModItems.toolFlatShovelWood));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelStone), new ItemStack(ModItems.toolFlatShovelStone));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelIron), new ItemStack(ModItems.toolFlatShovelIron));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelDiamond), new ItemStack(ModItems.toolFlatShovelDiamond));
        RollerRecipes.rolling().addRolling(new ItemStack(Item.shovelGold), new ItemStack(ModItems.toolFlatShovelGold));
    }
}