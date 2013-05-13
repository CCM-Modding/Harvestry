package harvestry.core.recipe;

import harvestry.block.ModBlocks;
import harvestry.core.handlers.EHandler;
import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseFood;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumNonStack;
import harvestry.item.enums.EnumUncookedFood;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

final class RecipesCrafting {

    private static ItemStack grindStones = new ItemStack(ModItems.grindStones, 1, OreDictionary.WILDCARD_VALUE);

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped() {
        // Grinder Wheels
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gStone), new Object[] { " S ", "SLS", " S ", 'S', Block.stone, 'L', "logWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gGrate), new Object[] { " S ", "S S", " S ", 'S', EHandler.getItem(EnumBaseItem.sheetIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gIron), new Object[] { " S ", "SLS", " S ", 'S', Item.ingotIron, 'L', new ItemStack(ModItems.gStone) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gBronze), new Object[] { " S ", "SLS", " S ", 'S', "ingotBronze", 'L', new ItemStack(ModItems.gStone) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gObsidian), new Object[] { " S ", "SLS", " S ", 'S', Block.obsidian, 'L', new ItemStack(ModItems.gIron) }));
        // Heating Elements
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heWood), new Object[] { "L L", " L ", "L L", 'L', "logWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heAluminum), new Object[] { " S ", "S S", " S ", 'S', EHandler.getItem(EnumBaseItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heTin), new Object[] { " S ", "S S", " S ", 'S', EHandler.getItem(EnumBaseItem.sheetTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heCopper), new Object[] { " S ", "STS", " S ", 'S', EHandler.getItem(EnumBaseItem.sheetCopper), 'T', new ItemStack(ModItems.heTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heIron), new Object[] { " S ", "SAS", " S ", 'S', EHandler.getItem(EnumBaseItem.sheetIron), 'A', new ItemStack(ModItems.heAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heBronze), new Object[] { " S ", "SIS", " S ", 'S', EHandler.getItem(EnumBaseItem.sheetBronze), 'I', new ItemStack(ModItems.heIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heGold), new Object[] { " S ", "SIS", " S ", 'S', EHandler.getItem(EnumBaseItem.sheetGold), 'I', new ItemStack(ModItems.heIron) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.panBread), new Object[] { " T ", "T T", " T ", 'T', EHandler.getItem(EnumBaseItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.panCake), new Object[] { "T T", "T T", "TTT", 'T', EHandler.getItem(EnumBaseItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.panPie), new Object[] { "T T", "TTT", 'T', EHandler.getItem(EnumBaseItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.panPieCrust), new Object[] { "B", "P", 'B', EHandler.getItem(EnumBaseItem.globDough), 'P', EHandler.getItem(EnumNonStack.panPie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.bowl), new Object[] { "T T", " T ", 'T', EHandler.getItem(EnumBaseItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.sheetCookie), new Object[] { "TTT", "TTT", 'T', EHandler.getItem(EnumBaseItem.sheetAluminum) }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.bottle, 5), new Object[] { " G ", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 800mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.bottleGlass, 4), new Object[] { "G G", "G G", 'G', Block.thinGlass })); // Can hold 500mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.bottleMilk, 3), new Object[] { " G ", "G G", " G ", 'G', Block.thinGlass })); // Can hold 800mb only milk
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.bottlePitcher, 2), new Object[] { "G G", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 1000mb any juice

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseItem.itemKetchup), new Object[] { "T", "B", 'T', EHandler.getItem(EnumNonStack.globTomato), 'B', EHandler.getItem(EnumNonStack.bottle) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseItem.itemMustard), new Object[] { "M", "B", 'M', EHandler.getItem(EnumNonStack.rawMustard), 'B', EHandler.getItem(EnumNonStack.bottle) }));
        // Uncooked Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedCake), new Object[] { "B", "P", 'B', EHandler.getItem(EnumNonStack.bowlBatter), 'P', EHandler.getItem(EnumNonStack.panCake) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedPotato), new Object[] { "P", "F", 'P', Item.potato, 'F', EHandler.getItem(EnumBaseItem.foilAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedBread), new Object[] { "D", "P", 'D', EHandler.getItem(EnumBaseItem.globDough), 'P', EHandler.getItem(EnumNonStack.panBread) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedCookies), new Object[] { "C", "P", 'C', EHandler.getItem(EnumNonStack.bowlCookieDough), 'P', EHandler.getItem(EnumNonStack.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedCookiesChocolateChip), new Object[] { "C", "P", 'C', EHandler.getItem(EnumNonStack.bowlCookieDoughChocolateChip), 'P', EHandler.getItem(EnumNonStack.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedCookiesSugar), new Object[] { "C", "P", 'C', EHandler.getItem(EnumNonStack.bowlCookieDoughSugar), 'P', EHandler.getItem(EnumNonStack.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedPiePumpkin), new Object[] { "F", "P", 'F', EHandler.getItem(EnumNonStack.bowlPumpkinFilling), 'P', EHandler.getItem(EnumNonStack.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedPieApple), new Object[] { "AAA", " P ", 'A', EHandler.getItem(EnumBaseItem.sliceApple), 'P', EHandler.getItem(EnumNonStack.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedPieBerryBlue), new Object[] { "BBB", " P ", 'B', EHandler.getItem(EnumBaseFood.foodBerryBlue), 'P', EHandler.getItem(EnumNonStack.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedPieBerryCherry), new Object[] { "CCC", " P ", 'C', EHandler.getItem(EnumBaseFood.foodBerryCherry), 'P', EHandler.getItem(EnumNonStack.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedPizzaCheese), new Object[] { "C", "P", 'C', EHandler.getItem(EnumBaseItem.dustCheese), 'P', EHandler.getItem(EnumNonStack.rawPizzaSauce) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedMeatBall, 4), new Object[] { "MM", "MM", 'M', EHandler.getItem(EnumBaseItem.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedMeatPatty, 2), new Object[] { "MMM", 'M', EHandler.getItem(EnumBaseItem.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumUncookedFood.uncookedNoodles, 3), new Object[] { "D", "G", 'D', EHandler.getItem(EnumBaseItem.globDough), 'G', ModItems.toolGrate }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumNonStack.rawPizzaSauce), new Object[] { "T", "P", 'T', EHandler.getItem(EnumNonStack.globTomato), 'P', EHandler.getItem(EnumNonStack.rawPizza) }));
        // Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodSandwichCheese, 4), new Object[] { "BBB", "CCC", "BBB", 'B', EHandler.getItem(EnumBaseItem.sliceBread), 'C', EHandler.getItem(EnumBaseItem.dustCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodSandwichHam, 4), new Object[] { "BBB", "LHC", "BBB", 'B', EHandler.getItem(EnumBaseItem.sliceBread), 'C', EHandler.getItem(EnumBaseItem.dustCheese), 'H', Item.porkRaw, 'L', EHandler.getItem(EnumNonStack.itemLettuceLeaf) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodSandwichPB_J, 4), new Object[] { "B B", "P J", "B B", 'B', EHandler.getItem(EnumBaseItem.sliceBread), 'P', EHandler.getItem(EnumNonStack.globPB), 'J', EHandler.getItem(EnumNonStack.globJelly) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodHamburger, 3), new Object[] { "TBC", "MPK", "LBO", 'B', EHandler.getItem(EnumBaseItem.sliceBread), 'C', EHandler.getItem(EnumBaseItem.dustCheese), 'O', EHandler.getItem(EnumBaseItem.sliceOnion), 'T', EHandler.getItem(EnumBaseItem.sliceTomato), 'L', EHandler.getItem(EnumNonStack.itemLettuceLeaf), 'P', EHandler.getItem(EnumNonStack.cookedMeatPatty), 'M', EHandler.getItem(EnumBaseItem.itemMustard), 'K', EHandler.getItem(EnumBaseItem.itemKetchup) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodBagOChips, 4), new Object[] { "ASA", "CCC", "ACA", 'A', EHandler.getItem(EnumBaseItem.sheetAluminum), 'C', EHandler.getItem(EnumNonStack.friedChips), 'S', EHandler.getItem(EnumBaseItem.dustSalt) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodBoxOFries, 4), new Object[] { "FSF", "PFP", " P ", 'P', Item.paper, 'F', EHandler.getItem(EnumNonStack.friedFries), 'S', EHandler.getItem(EnumBaseItem.dustSalt) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodTaco, 2), new Object[] { "MLC", " T ", 'T', EHandler.getItem(EnumNonStack.itemTaco), 'M', EHandler.getItem(EnumNonStack.cookedDustMeat), 'L', EHandler.getItem(EnumNonStack.itemLettuceLeaf), 'C', EHandler.getItem(EnumBaseItem.dustCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodBurito, 2), new Object[] { "MLC", " T ", 'T', EHandler.getItem(EnumNonStack.itemTortilla), 'M', EHandler.getItem(EnumNonStack.cookedDustMeat), 'L', EHandler.getItem(EnumNonStack.itemLettuceLeaf), 'C', EHandler.getItem(EnumBaseItem.dustCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodSpaghetti, 3), new Object[] { "MMM", "SSS", "NNN", 'M', EHandler.getItem(EnumNonStack.cookedMeatBall), 'N', EHandler.getItem(EnumNonStack.cookedNoodles), 'T', EHandler.getItem(EnumNonStack.globTomato) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodSandwichChickenFried, 2), new Object[] { "BB", "CL", "BB", 'B', EHandler.getItem(EnumBaseItem.sliceBread), 'C', EHandler.getItem(EnumBaseFood.foodChickenFried), 'L', EHandler.getItem(EnumNonStack.itemLettuceLeaf) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodSandwichChickenGrilled, 2), new Object[] { "BB", "CL", "BB", 'B', EHandler.getItem(EnumBaseItem.sliceBread), 'C', EHandler.getItem(EnumBaseFood.foodChickenGrilled), 'L', EHandler.getItem(EnumNonStack.itemLettuceLeaf) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseFood.foodSalad, 2), new Object[] { "TCT", "LLL", "B B", 'B', Item.bowlEmpty, 'C', EHandler.getItem(EnumBaseItem.dustCheese), 'L', EHandler.getItem(EnumNonStack.itemLettuceLeaf), 'T', EHandler.getItem(EnumBaseItem.sliceTomato) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.cake), new Object[] { "B B", "SSS", " C ", 'C', EHandler.getItem(EnumNonStack.cookedCake), 'B', EHandler.getItem(EnumBaseFood.foodBerryStrawberry), 'S', Item.sugar }));
        // Blocks
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[] { "CIC", " L ", "CIC", 'C', Block.cobblestone, 'I', Item.ingotIron, 'L', "logWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockOven), new Object[] { "III", "BAB", "BFB", 'I', Item.ingotIron, 'F', Block.furnaceIdle, 'B', Item.brick, 'A', EHandler.getItem(EnumBaseItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockRoller), new Object[] { "III", "S S", "III", 'I', Item.ingotIron, 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCounter), new Object[] { "SSS", "PCP", "PPP", 'S', new ItemStack(Block.stoneSingleSlab, 1, 0), 'W', new ItemStack(Block.planks, 1, 1), 'C', Block.chest }));
        // CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockFrier), new Object[] { "I I", "IBI", "INI", 'I', Item.ingotIron, 'B', new ItemStack(Block.planks, 1, 1), 'N', Block.netherrack }));
        // CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrill), new Object[] { "SSS", "INI", "I I", 'I', Item.ingotIron, 'S', EHandler.getItem(EnumBaseItem.sheetAluminum), 'N', Block.netherrack }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCabinet), new Object[] { "PPP", "I I", "PPP", 'I', Item.ingotIron, 'P', new ItemStack(Block.planks, 1, 1) }));
        // CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockKeg), new Object[] { "PPP", "III", "PPP", 'I', Item.ingotIron, 'P', new ItemStack(Block.planks, 1, 1) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBarrel), new Object[] { "PPP", "III", "PPP", 'I', Item.ingotIron, 'P', new ItemStack(Block.planks, 1, 0) }));
        // Condensed Items
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBaseItem.ingotSugar), new Object[] { "SS", "SS", 'S', Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSugar), new Object[] { "SS", "SS", 'S', EHandler.getItem(EnumBaseItem.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockAluminum), new Object[] { "III", "III", "III", 'I', EHandler.getItem(EnumBaseItem.ingotAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCheese), new Object[] { "III", "III", "III", 'I', EHandler.getItem(EnumBaseFood.foodCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockButter), new Object[] { "III", "III", "III", 'I', EHandler.getItem(EnumBaseItem.ingotButter) }));
        // Other
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.paper, 5), new Object[] { "WWW", 'W', EHandler.getItem(EnumBaseItem.rawWood) }));
        // Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeA), new Object[] { " T", "S ", 'T', EHandler.getItem(EnumBaseItem.sheetAluminum), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeI), new Object[] { " T", "S ", 'T', EHandler.getItem(EnumBaseItem.sheetIron), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeG), new Object[] { " T", "S ", 'T', EHandler.getItem(EnumBaseItem.sheetGold), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeB), new Object[] { " T", "S ", 'T', EHandler.getItem(EnumBaseItem.sheetBronze), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolCuttingBoard), new Object[] { "WWW", "WWW", 'W', "plankWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolClippers), new Object[] { " I ", "S I", " S ", 'S', "stickWood", 'I', Item.ingotIron }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolGrate), new Object[] { "S S", " S ", "S S", 'S', EHandler.getItem(EnumBaseItem.sheetAluminum) }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolAxe), new Object[] { "xx", "xy", " y", 'x', "ingotAluminum", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolHoe), new Object[] { "xx", " y", " y", 'x', "ingotAluminum", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolShovel), new Object[] { "x", "y", "y", 'x', "ingotAluminum", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolPickaxe), new Object[] { "xxx", " y ", " y ", 'x', "ingotAluminum", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolSword), new Object[] { "x", "x", "y", 'x', "ingotAluminum", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolAxe), new Object[] { "xx", "xy", " y", 'x', "ingotAluminium", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolHoe), new Object[] { "xx", " y", " y", 'x', "ingotAluminium", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolShovel), new Object[] { "x", "y", "y", 'x', "ingotAluminium", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolPickaxe), new Object[] { "xxx", " y ", " y ", 'x', "ingotAluminium", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolSword), new Object[] { "x", "x", "y", 'x', "ingotAluminium", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolAxe), new Object[] { "xx", "xy", " y", 'x', "naturalAluminum", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolHoe), new Object[] { "xx", " y", " y", 'x', "naturalAluminum", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolShovel), new Object[] { "x", "y", "y", 'x', "naturalAluminum", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolPickaxe), new Object[] { "xxx", " y ", " y ", 'x', "naturalAluminum", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolSword), new Object[] { "x", "x", "y", 'x', "naturalAluminum", 'y', "stickWood" }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless() {
        // Mortar and Pestal
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ModItems.grindStones), new Object[] { new ItemStack(Item.flint), new ItemStack(Item.bowlEmpty) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumBaseItem.dustFlour), new Object[] { Item.wheat, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar), new Object[] { Item.reed, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.dyePowder, 4, 15), new Object[] { Item.bone, grindStones }));
        // Uncondensed Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar, 4), new Object[] { EHandler.getItem(EnumBaseItem.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumBaseItem.ingotSugar, 4), new Object[] { new ItemStack(ModBlocks.blockSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumBaseItem.ingotAluminum, 9), new Object[] { new ItemStack(ModBlocks.blockAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumBaseFood.foodCheese, 9), new Object[] { new ItemStack(ModBlocks.blockCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumBaseItem.ingotButter, 9), new Object[] { new ItemStack(ModBlocks.blockButter) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumBaseItem.itemChocolateChips), new Object[] { EHandler.getItem(EnumNonStack.globChocolate), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumBaseItem.globDough), new Object[] { Item.bucketWater, "dustWheat", "dustWheat", "dustWheat" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumBaseItem.globDoughCorn), new Object[] { Item.bucketWater, "dustWheat", "dustWheat", EHandler.getItem(EnumUncookedFood.uncookedSeedsCorn), EHandler.getItem(EnumUncookedFood.uncookedSeedsCorn) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumNonStack.bowlBatter), new Object[] { EHandler.getItem(EnumNonStack.bowl), "dustWheat", "dustWheat", "dustWheat", Item.sugar, Item.egg, Item.bucketMilk }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumNonStack.bowlPumpkinFilling), new Object[] { EHandler.getItem(EnumBaseItem.rawPumpkinMash), Item.bucketMilk, Item.sugar, EHandler.getItem(EnumBaseItem.rawPumpkinMash), EHandler.getItem(EnumNonStack.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumNonStack.bowlCookieDough), new Object[] { Item.sugar, "dustWheat", EHandler.getItem(EnumBaseItem.dustFlour), Item.bucketMilk, Item.egg, EHandler.getItem(EnumNonStack.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumNonStack.bowlCookieDoughChocolateChip), new Object[] { EHandler.getItem(EnumNonStack.bowlCookieDough), EHandler.getItem(EnumBaseItem.itemChocolateChips), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumNonStack.bowlCookieDoughSugar), new Object[] { EHandler.getItem(EnumNonStack.bowlCookieDough), Item.sugar }));
    }

    public static void init() {
        addShaped();
        addShapeless();
    }
}
