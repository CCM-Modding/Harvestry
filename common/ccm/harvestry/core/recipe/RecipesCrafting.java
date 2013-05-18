package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.core.handlers.EHandler;
import ccm.harvestry.enums.FoodEnum;
import ccm.harvestry.enums.ItemEnum;
import ccm.harvestry.enums.ItemEnumSixteen;
import ccm.harvestry.enums.UncookedFoodEnum;
import ccm.harvestry.item.ModItems;

final class RecipesCrafting
{

    private static ItemStack grindStones = new ItemStack(ModItems.grindStones, 1, OreDictionary.WILDCARD_VALUE);

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped()
    {
        // Grinder Wheels
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gStone), new Object[]
        { " S ", "SLS", " S ", 'S', Block.stone, 'L', "logWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gGrate), new Object[]
        { " S ", "S S", " S ", 'S', EHandler.getItem(ItemEnum.sheetIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gIron), new Object[]
        { " S ", "SLS", " S ", 'S', Item.ingotIron, 'L', new ItemStack(ModItems.gStone) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gBronze), new Object[]
        { " S ", "SLS", " S ", 'S', "ingotBronze", 'L', new ItemStack(ModItems.gStone) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.gObsidian), new Object[]
        { " S ", "SLS", " S ", 'S', Block.obsidian, 'L', new ItemStack(ModItems.gIron) }));
        // Heating Elements
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heWood), new Object[]
        { "L L", " L ", "L L", 'L', "logWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heAluminum), new Object[]
        { " S ", "S S", " S ", 'S', EHandler.getItem(ItemEnum.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heTin), new Object[]
        { " S ", "S S", " S ", 'S', EHandler.getItem(ItemEnum.sheetTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heCopper), new Object[]
        { " S ", "STS", " S ", 'S', EHandler.getItem(ItemEnum.sheetCopper), 'T', new ItemStack(ModItems.heTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heIron), new Object[]
        { " S ", "SAS", " S ", 'S', EHandler.getItem(ItemEnum.sheetIron), 'A', new ItemStack(ModItems.heAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heBronze), new Object[]
        { " S ", "SIS", " S ", 'S', EHandler.getItem(ItemEnum.sheetBronze), 'I', new ItemStack(ModItems.heIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heGold), new Object[]
        { " S ", "SIS", " S ", 'S', EHandler.getItem(ItemEnum.sheetGold), 'I', new ItemStack(ModItems.heIron) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.panBread), new Object[]
        { " T ", "T T", " T ", 'T', EHandler.getItem(ItemEnum.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.panCake), new Object[]
        { "T T", "T T", "TTT", 'T', EHandler.getItem(ItemEnum.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.panPie), new Object[]
        { "T T", "TTT", 'T', EHandler.getItem(ItemEnum.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.panPieCrust), new Object[]
        { "B", "P", 'B', EHandler.getItem(ItemEnum.globDough), 'P', EHandler.getItem(ItemEnumSixteen.panPie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.bowl), new Object[]
        { "T T", " T ", 'T', EHandler.getItem(ItemEnum.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.sheetCookie), new Object[]
        { "TTT", "TTT", 'T', EHandler.getItem(ItemEnum.sheetAluminum) }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.bottle, 5), new Object[]
        { " G ", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 800mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.bottleGlass, 4), new Object[]
        { "G G", "G G", 'G', Block.thinGlass })); // Can hold 500mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.bottleMilk, 3), new Object[]
        { " G ", "G G", " G ", 'G', Block.thinGlass })); // Can hold 800mb only milk
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.bottlePitcher, 2), new Object[]
        { "G G", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 1000mb any juice

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnum.itemKetchup), new Object[]
        { "T", "B", 'T', EHandler.getItem(ItemEnumSixteen.globTomato), 'B', EHandler.getItem(ItemEnumSixteen.bottle) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnum.itemMustard), new Object[]
        { "M", "B", 'M', EHandler.getItem(ItemEnumSixteen.rawMustard), 'B', EHandler.getItem(ItemEnumSixteen.bottle) }));
        // Uncooked Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedCake), new Object[]
        { "B", "P", 'B', EHandler.getItem(ItemEnumSixteen.bowlBatter), 'P', EHandler.getItem(ItemEnumSixteen.panCake) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPotato), new Object[]
        { "P", "F", 'P', Item.potato, 'F', EHandler.getItem(ItemEnum.foilAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedBread), new Object[]
        { "D", "P", 'D', EHandler.getItem(ItemEnum.globDough), 'P', EHandler.getItem(ItemEnumSixteen.panBread) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedCookies), new Object[]
        { "C", "P", 'C', EHandler.getItem(ItemEnumSixteen.bowlCookieDough), 'P', EHandler.getItem(ItemEnumSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedCookiesChocolateChip), new Object[]
        { "C", "P", 'C', EHandler.getItem(ItemEnumSixteen.bowlCookieDoughChocolateChip), 'P', EHandler.getItem(ItemEnumSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedCookiesSugar), new Object[]
        { "C", "P", 'C', EHandler.getItem(ItemEnumSixteen.bowlCookieDoughSugar), 'P', EHandler.getItem(ItemEnumSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPiePumpkin), new Object[]
        { "F", "P", 'F', EHandler.getItem(ItemEnumSixteen.bowlPumpkinFilling), 'P', EHandler.getItem(ItemEnumSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieApple), new Object[]
        { "AAA", " P ", 'A', EHandler.getItem(ItemEnum.sliceApple), 'P', EHandler.getItem(ItemEnumSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue), new Object[]
        { "BBB", " P ", 'B', EHandler.getItem(FoodEnum.foodBerryBlue), 'P', EHandler.getItem(ItemEnumSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryCherry), new Object[]
        { "CCC", " P ", 'C', EHandler.getItem(FoodEnum.foodBerryCherry), 'P', EHandler.getItem(ItemEnumSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPizzaCheese), new Object[]
        { "C", "P", 'C', EHandler.getItem(ItemEnum.dustCheese), 'P', EHandler.getItem(ItemEnumSixteen.rawPizzaSauce) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedMeatBall, 4), new Object[]
        { "MM", "MM", 'M', EHandler.getItem(ItemEnum.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedMeatPatty, 2), new Object[]
        { "MMM", 'M', EHandler.getItem(ItemEnum.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedNoodles, 3), new Object[]
        { "D", "G", 'D', EHandler.getItem(ItemEnum.globDough), 'G', ModItems.toolGrate }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnumSixteen.rawPizzaSauce), new Object[]
        { "T", "P", 'T', EHandler.getItem(ItemEnumSixteen.globTomato), 'P', EHandler.getItem(ItemEnumSixteen.rawPizza) }));
        // Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodSandwichCheese, 4), new Object[]
        { "BBB", "CCC", "BBB", 'B', EHandler.getItem(ItemEnum.sliceBread), 'C', EHandler.getItem(ItemEnum.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodSandwichHam, 4), new Object[]
                {
                                "BBB",
                                "LHC",
                                "BBB",
                                'B',
                                EHandler.getItem(ItemEnum.sliceBread),
                                'C',
                                EHandler.getItem(ItemEnum.dustCheese),
                                'H',
                                Item.porkRaw,
                                'L',
                                EHandler.getItem(ItemEnumSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodSandwichPB_J, 4), new Object[]
        { "B B", "P J", "B B", 'B', EHandler.getItem(ItemEnum.sliceBread), 'P', EHandler.getItem(ItemEnumSixteen.globPB), 'J', EHandler.getItem(ItemEnumSixteen.globJelly) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodHamburger, 3), new Object[]
                {
                                "TBC",
                                "MPK",
                                "LBO",
                                'B',
                                EHandler.getItem(ItemEnum.sliceBread),
                                'C',
                                EHandler.getItem(ItemEnum.dustCheese),
                                'O',
                                EHandler.getItem(ItemEnum.sliceOnion),
                                'T',
                                EHandler.getItem(ItemEnum.sliceTomato),
                                'L',
                                EHandler.getItem(ItemEnumSixteen.itemLettuceLeaf),
                                'P',
                                EHandler.getItem(ItemEnumSixteen.cookedMeatPatty),
                                'M',
                                EHandler.getItem(ItemEnum.itemMustard),
                                'K',
                                EHandler.getItem(ItemEnum.itemKetchup) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodBagOChips, 4), new Object[]
        { "ASA", "CCC", "ACA", 'A', EHandler.getItem(ItemEnum.sheetAluminum), 'C', EHandler.getItem(ItemEnumSixteen.friedChips), 'S', EHandler.getItem(ItemEnum.dustSalt) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodBoxOFries, 4), new Object[]
        { "FSF", "PFP", " P ", 'P', Item.paper, 'F', EHandler.getItem(ItemEnumSixteen.friedFries), 'S', EHandler.getItem(ItemEnum.dustSalt) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodTaco, 2), new Object[]
                {
                                "MLC",
                                " T ",
                                'T',
                                EHandler.getItem(ItemEnumSixteen.itemTaco),
                                'M',
                                EHandler.getItem(ItemEnumSixteen.cookedDustMeat),
                                'L',
                                EHandler.getItem(ItemEnumSixteen.itemLettuceLeaf),
                                'C',
                                EHandler.getItem(ItemEnum.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodBurito, 2), new Object[]
                {
                                "MLC",
                                " T ",
                                'T',
                                EHandler.getItem(ItemEnumSixteen.itemTortilla),
                                'M',
                                EHandler.getItem(ItemEnumSixteen.cookedDustMeat),
                                'L',
                                EHandler.getItem(ItemEnumSixteen.itemLettuceLeaf),
                                'C',
                                EHandler.getItem(ItemEnum.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodSpaghetti, 3), new Object[]
                {
                                "MMM",
                                "SSS",
                                "NNN",
                                'M',
                                EHandler.getItem(ItemEnumSixteen.cookedMeatBall),
                                'N',
                                EHandler.getItem(ItemEnumSixteen.cookedNoodles),
                                'T',
                                EHandler.getItem(ItemEnumSixteen.globTomato) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodSandwichChickenFried, 2), new Object[]
                {
                                "BB",
                                "CL",
                                "BB",
                                'B',
                                EHandler.getItem(ItemEnum.sliceBread),
                                'C',
                                EHandler.getItem(FoodEnum.foodChickenFried),
                                'L',
                                EHandler.getItem(ItemEnumSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodSandwichChickenGrilled, 2), new Object[]
                {
                                "BB",
                                "CL",
                                "BB",
                                'B',
                                EHandler.getItem(ItemEnum.sliceBread),
                                'C',
                                EHandler.getItem(FoodEnum.foodChickenGrilled),
                                'L',
                                EHandler.getItem(ItemEnumSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EHandler.getItem(FoodEnum.foodSalad, 2), new Object[]
                {
                                "TCT",
                                "LLL",
                                "B B",
                                'B',
                                Item.bowlEmpty,
                                'C',
                                EHandler.getItem(ItemEnum.dustCheese),
                                'L',
                                EHandler.getItem(ItemEnumSixteen.itemLettuceLeaf),
                                'T',
                                EHandler.getItem(ItemEnum.sliceTomato) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.cake), new Object[]
        { "B B", "SSS", " C ", 'C', EHandler.getItem(ItemEnumSixteen.cookedCake), 'B', EHandler.getItem(FoodEnum.foodBerryStrawberry), 'S', Item.sugar }));
        // Blocks
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[]
        { "CIC", " L ", "CIC", 'C', Block.cobblestone, 'I', Item.ingotIron, 'L', "logWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockOven), new Object[]
        { "III", "BAB", "BFB", 'I', Item.ingotIron, 'F', Block.furnaceIdle, 'B', Item.brick, 'A', EHandler.getItem(ItemEnum.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockRoller), new Object[]
        { "III", "S S", "III", 'I', Item.ingotIron, 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCounter), new Object[]
        { "SSS", "PCP", "PPP", 'S', new ItemStack(Block.stoneSingleSlab, 1, 0), 'W', new ItemStack(Block.planks, 1, 1), 'C', Block.chest }));
        // CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new
        // ItemStack(ModBlocks.blockFrier), new Object[] { "I I", "IBI", "INI", 'I', Item.ingotIron,
        // 'B', new ItemStack(Block.planks, 1, 1), 'N', Block.netherrack }));
        // CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new
        // ItemStack(ModBlocks.blockGrill), new Object[] { "SSS", "INI", "I I", 'I', Item.ingotIron,
        // 'S', EHandler.getItem(ItemEnum.sheetAluminum), 'N', Block.netherrack }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCabinet), new Object[]
        { "PPP", "I I", "PPP", 'I', Item.ingotIron, 'P', new ItemStack(Block.planks, 1, 1) }));
        // CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new
        // ItemStack(ModBlocks.blockKeg), new Object[] { "PPP", "III", "PPP", 'I', Item.ingotIron,
        // 'P', new ItemStack(Block.planks, 1, 1) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBarrel), new Object[]
        { "PPP", "III", "PPP", 'I', Item.ingotIron, 'P', new ItemStack(Block.planks, 1, 0) }));
        // Condensed Items
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(ItemEnum.ingotSugar), new Object[]
        { "SS", "SS", 'S', Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSugar), new Object[]
        { "SS", "SS", 'S', EHandler.getItem(ItemEnum.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockAluminum), new Object[]
        { "III", "III", "III", 'I', EHandler.getItem(ItemEnum.ingotAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCheese), new Object[]
        { "III", "III", "III", 'I', EHandler.getItem(FoodEnum.foodCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockButter), new Object[]
        { "III", "III", "III", 'I', EHandler.getItem(ItemEnum.ingotButter) }));
        // Other
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.paper, 5), new Object[]
        { "WWW", 'W', EHandler.getItem(ItemEnum.rawWood) }));
        // Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeA), new Object[]
        { " T", "S ", 'T', EHandler.getItem(ItemEnum.sheetAluminum), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeI), new Object[]
        { " T", "S ", 'T', EHandler.getItem(ItemEnum.sheetIron), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeG), new Object[]
        { " T", "S ", 'T', EHandler.getItem(ItemEnum.sheetGold), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeB), new Object[]
        { " T", "S ", 'T', EHandler.getItem(ItemEnum.sheetBronze), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolCuttingBoard), new Object[]
        { "WWW", "WWW", 'W', "plankWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolClippers), new Object[]
        { " I ", "S I", " S ", 'S', "stickWood", 'I', Item.ingotIron }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolGrate), new Object[]
        { "S S", " S ", "S S", 'S', EHandler.getItem(ItemEnum.sheetAluminum) }));

    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless()
    {
        // Mortar and Pestal
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ModItems.grindStones), new Object[]
        { new ItemStack(Item.flint), new ItemStack(Item.bowlEmpty) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnum.dustFlour), new Object[]
        { Item.wheat, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar), new Object[]
        { Item.reed, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.dyePowder, 4, 15), new Object[]
        { Item.bone, grindStones }));
        // Uncondensed Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar, 4), new Object[]
        { EHandler.getItem(ItemEnum.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnum.ingotSugar, 4), new Object[]
        { new ItemStack(ModBlocks.blockSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnum.ingotAluminum, 9), new Object[]
        { new ItemStack(ModBlocks.blockAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(FoodEnum.foodCheese, 9), new Object[]
        { new ItemStack(ModBlocks.blockCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnum.ingotButter, 9), new Object[]
        { new ItemStack(ModBlocks.blockButter) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnum.itemChocolateChips), new Object[]
        { EHandler.getItem(ItemEnumSixteen.globChocolate), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnum.globDough), new Object[]
        { Item.bucketWater, "dustWheat", "dustWheat", "dustWheat" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnum.globDoughCorn), new Object[]
        { Item.bucketWater, "dustWheat", "dustWheat", EHandler.getItem(UncookedFoodEnum.uncookedSeedsCorn), EHandler.getItem(UncookedFoodEnum.uncookedSeedsCorn) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnumSixteen.bowlBatter), new Object[]
        { EHandler.getItem(ItemEnumSixteen.bowl), "dustWheat", "dustWheat", "dustWheat", Item.sugar, Item.egg, Item.bucketMilk }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnumSixteen.bowlPumpkinFilling), new Object[]
        { EHandler.getItem(ItemEnum.rawPumpkinMash), Item.bucketMilk, Item.sugar, EHandler.getItem(ItemEnum.rawPumpkinMash), EHandler.getItem(ItemEnumSixteen.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnumSixteen.bowlCookieDough), new Object[]
        { Item.sugar, "dustWheat", EHandler.getItem(ItemEnum.dustFlour), Item.bucketMilk, Item.egg, EHandler.getItem(ItemEnumSixteen.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnumSixteen.bowlCookieDoughChocolateChip), new Object[]
        { EHandler.getItem(ItemEnumSixteen.bowlCookieDough), EHandler.getItem(ItemEnum.itemChocolateChips), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(ItemEnumSixteen.bowlCookieDoughSugar), new Object[]
        { EHandler.getItem(ItemEnumSixteen.bowlCookieDough), Item.sugar }));
    }

    public static void init()
    {
        addShaped();
        addShapeless();
    }
}
