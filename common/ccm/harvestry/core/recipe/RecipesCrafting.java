package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.handler.enums.EnumHandler;

final class RecipesCrafting extends Recipes
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
        { " S ", "S S", " S ", 'S', EnumHandler.getItem(EnumItem.sheetIron) }));
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
        { " S ", "S S", " S ", 'S', EnumHandler.getItem(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heTin), new Object[]
        { " S ", "S S", " S ", 'S', EnumHandler.getItem(EnumItem.sheetTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heCopper), new Object[]
        { " S ", "STS", " S ", 'S', EnumHandler.getItem(EnumItem.sheetCopper), 'T', new ItemStack(ModItems.heTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heIron), new Object[]
        { " S ", "SAS", " S ", 'S', EnumHandler.getItem(EnumItem.sheetIron), 'A', new ItemStack(ModItems.heAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heBronze), new Object[]
        { " S ", "SIS", " S ", 'S', EnumHandler.getItem(EnumItem.sheetBronze), 'I', new ItemStack(ModItems.heIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heGold), new Object[]
        { " S ", "SIS", " S ", 'S', EnumHandler.getItem(EnumItem.sheetGold), 'I', new ItemStack(ModItems.heIron) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.panBread), new Object[]
        { " T ", "T T", " T ", 'T', EnumHandler.getItem(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.panCake), new Object[]
        { "T T", "T T", "TTT", 'T', EnumHandler.getItem(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.panPie), new Object[]
        { "T T", "TTT", 'T', EnumHandler.getItem(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.panPieCrust), new Object[]
        { "B", "P", 'B', EnumHandler.getItem(EnumItem.globDough), 'P', EnumHandler.getItem(EnumItemSixteen.panPie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.bowl), new Object[]
        { "T T", " T ", 'T', EnumHandler.getItem(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.sheetCookie), new Object[]
        { "TTT", "TTT", 'T', EnumHandler.getItem(EnumItem.sheetAluminum) }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.bottle, 5), new Object[]
        { " G ", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 800mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.bottleGlass, 4), new Object[]
        { "G G", "G G", 'G', Block.thinGlass })); // Can hold 500mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.bottleMilk, 3), new Object[]
        { " G ", "G G", " G ", 'G', Block.thinGlass })); // Can hold 800mb only milk
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.bottlePitcher, 2), new Object[]
        { "G G", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 1000mb any juice

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItem.itemKetchup), new Object[]
        { "T", "B", 'T', EnumHandler.getItem(EnumItemSixteen.globTomato), 'B', EnumHandler.getItem(EnumItemSixteen.bottle) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItem.itemMustard), new Object[]
        { "M", "B", 'M', EnumHandler.getItem(EnumItemSixteen.rawMustard), 'B', EnumHandler.getItem(EnumItemSixteen.bottle) }));
        // Uncooked Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedCake), new Object[]
        { "B", "P", 'B', EnumHandler.getItem(EnumItemSixteen.bowlBatter), 'P', EnumHandler.getItem(EnumItemSixteen.panCake) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPotato), new Object[]
        { "P", "F", 'P', Item.potato, 'F', EnumHandler.getItem(EnumItem.foilAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedBread), new Object[]
        { "D", "P", 'D', EnumHandler.getItem(EnumItem.globDough), 'P', EnumHandler.getItem(EnumItemSixteen.panBread) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedCookies), new Object[]
        { "C", "P", 'C', EnumHandler.getItem(EnumItemSixteen.bowlCookieDough), 'P', EnumHandler.getItem(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedCookiesChocolateChip), new Object[]
        { "C", "P", 'C', EnumHandler.getItem(EnumItemSixteen.bowlCookieDoughChocolateChip), 'P', EnumHandler.getItem(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedCookiesSugar), new Object[]
        { "C", "P", 'C', EnumHandler.getItem(EnumItemSixteen.bowlCookieDoughSugar), 'P', EnumHandler.getItem(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPiePumpkin), new Object[]
        { "F", "P", 'F', EnumHandler.getItem(EnumItemSixteen.bowlPumpkinFilling), 'P', EnumHandler.getItem(EnumItemSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPieApple), new Object[]
        { "AAA", " P ", 'A', EnumHandler.getItem(EnumItem.sliceApple), 'P', EnumHandler.getItem(EnumItemSixteen.panPieCrust) }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryBlue), new Object[]
        // { "BBB", " P ", 'B', EHandler.getItem(FoodEnum.foodBerryBlue), 'P',
        // EHandler.getItem(ItemEnumSixteen.panPieCrust) }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(EHandler.getItem(UncookedFoodEnum.uncookedPieBerryCherry), new Object[]
        // { "CCC", " P ", 'C', EHandler.getItem(FoodEnum.foodBerryCherry), 'P',
        // EHandler.getItem(ItemEnumSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedPizzaCheese), new Object[]
        { "C", "P", 'C', EnumHandler.getItem(EnumItem.dustCheese), 'P', EnumHandler.getItem(EnumItemSixteen.rawPizzaSauce) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedMeatBall, 4), new Object[]
        { "MM", "MM", 'M', EnumHandler.getItem(EnumItem.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedMeatPatty, 2), new Object[]
        { "MMM", 'M', EnumHandler.getItem(EnumItem.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumUncookedFood.uncookedNoodles, 3), new Object[]
        { "D", "G", 'D', EnumHandler.getItem(EnumItem.globDough), 'G', ModItems.toolGrate }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItemSixteen.rawPizzaSauce), new Object[]
        { "T", "P", 'T', EnumHandler.getItem(EnumItemSixteen.globTomato), 'P', EnumHandler.getItem(EnumItemSixteen.rawPizza) }));
        // Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodSandwichCheese, 4), new Object[]
        { "BBB", "CCC", "BBB", 'B', EnumHandler.getItem(EnumItem.sliceBread), 'C', EnumHandler.getItem(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodSandwichHam, 4), new Object[]
                {
                                "BBB",
                                "LHC",
                                "BBB",
                                'B',
                                EnumHandler.getItem(EnumItem.sliceBread),
                                'C',
                                EnumHandler.getItem(EnumItem.dustCheese),
                                'H',
                                Item.porkRaw,
                                'L',
                                EnumHandler.getItem(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodSandwichPB_J, 4), new Object[]
        { "B B", "P J", "B B", 'B', EnumHandler.getItem(EnumItem.sliceBread), 'P', EnumHandler.getItem(EnumItemSixteen.globPB), 'J', EnumHandler.getItem(EnumItemSixteen.globJelly) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodHamburger, 3), new Object[]
                {
                                "TBC",
                                "MPK",
                                "LBO",
                                'B',
                                EnumHandler.getItem(EnumItem.sliceBread),
                                'C',
                                EnumHandler.getItem(EnumItem.dustCheese),
                                'O',
                                EnumHandler.getItem(EnumItem.sliceOnion),
                                'T',
                                EnumHandler.getItem(EnumItem.sliceTomato),
                                'L',
                                EnumHandler.getItem(EnumItemSixteen.itemLettuceLeaf),
                                'P',
                                EnumHandler.getItem(EnumItemSixteen.cookedMeatPatty),
                                'M',
                                EnumHandler.getItem(EnumItem.itemMustard),
                                'K',
                                EnumHandler.getItem(EnumItem.itemKetchup) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodBagOChips, 4), new Object[]
        { "ASA", "CCC", "ACA", 'A', EnumHandler.getItem(EnumItem.sheetAluminum), 'C', EnumHandler.getItem(EnumItemSixteen.friedChips), 'S', EnumHandler.getItem(EnumItem.dustSalt) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodBoxOFries, 4), new Object[]
        { "FSF", "PFP", " P ", 'P', Item.paper, 'F', EnumHandler.getItem(EnumItemSixteen.friedFries), 'S', EnumHandler.getItem(EnumItem.dustSalt) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodTaco, 2), new Object[]
                {
                                "MLC",
                                " T ",
                                'T',
                                EnumHandler.getItem(EnumItemSixteen.itemTaco),
                                'M',
                                EnumHandler.getItem(EnumItemSixteen.cookedDustMeat),
                                'L',
                                EnumHandler.getItem(EnumItemSixteen.itemLettuceLeaf),
                                'C',
                                EnumHandler.getItem(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodBurito, 2), new Object[]
                {
                                "MLC",
                                " T ",
                                'T',
                                EnumHandler.getItem(EnumItemSixteen.itemTortilla),
                                'M',
                                EnumHandler.getItem(EnumItemSixteen.cookedDustMeat),
                                'L',
                                EnumHandler.getItem(EnumItemSixteen.itemLettuceLeaf),
                                'C',
                                EnumHandler.getItem(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodSpaghetti, 3), new Object[]
                {
                                "MMM",
                                "SSS",
                                "NNN",
                                'M',
                                EnumHandler.getItem(EnumItemSixteen.cookedMeatBall),
                                'N',
                                EnumHandler.getItem(EnumItemSixteen.cookedNoodles),
                                'T',
                                EnumHandler.getItem(EnumItemSixteen.globTomato) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodSandwichChickenFried, 2), new Object[]
                {
                                "BB",
                                "CL",
                                "BB",
                                'B',
                                EnumHandler.getItem(EnumItem.sliceBread),
                                'C',
                                EnumHandler.getItem(EnumFood.foodChickenFried),
                                'L',
                                EnumHandler.getItem(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodSandwichChickenGrilled, 2), new Object[]
                {
                                "BB",
                                "CL",
                                "BB",
                                'B',
                                EnumHandler.getItem(EnumItem.sliceBread),
                                'C',
                                EnumHandler.getItem(EnumFood.foodChickenGrilled),
                                'L',
                                EnumHandler.getItem(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandler.getItem(EnumFood.foodSalad, 2), new Object[]
                {
                                "TCT",
                                "LLL",
                                "B B",
                                'B',
                                Item.bowlEmpty,
                                'C',
                                EnumHandler.getItem(EnumItem.dustCheese),
                                'L',
                                EnumHandler.getItem(EnumItemSixteen.itemLettuceLeaf),
                                'T',
                                EnumHandler.getItem(EnumItem.sliceTomato) }));
        // CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new
        // ItemStack(Item.cake), new Object[]
        // { "B B", "SSS", " C ", 'C', EHandler.getItem(ItemEnumSixteen.cookedCake), 'B',
        // EHandler.getItem(FoodEnum.foodBerryStrawberry), 'S', Item.sugar }));
        // Blocks
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[]
        { "CIC", " L ", "CIC", 'C', Block.cobblestone, 'I', Item.ingotIron, 'L', "logWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockOven), new Object[]
        { "III", "BAB", "BFB", 'I', Item.ingotIron, 'F', Block.furnaceIdle, 'B', Item.brick, 'A', EnumHandler.getItem(EnumItem.sheetAluminum) }));
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
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandler.getItem(EnumItem.ingotSugar), new Object[]
        { "SS", "SS", 'S', Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSugar), new Object[]
        { "SS", "SS", 'S', EnumHandler.getItem(EnumItem.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockAluminum), new Object[]
        { "III", "III", "III", 'I', EnumHandler.getItem(EnumItem.ingotAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCheese), new Object[]
        { "III", "III", "III", 'I', EnumHandler.getItem(EnumFood.foodCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockButter), new Object[]
        { "III", "III", "III", 'I', EnumHandler.getItem(EnumItem.ingotButter) }));
        // Other
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.paper, 5), new Object[]
        { "WWW", 'W', EnumHandler.getItem(EnumItem.rawWood) }));
        // Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeA), new Object[]
        { " T", "S ", 'T', EnumHandler.getItem(EnumItem.sheetAluminum), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeI), new Object[]
        { " T", "S ", 'T', EnumHandler.getItem(EnumItem.sheetIron), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeG), new Object[]
        { " T", "S ", 'T', EnumHandler.getItem(EnumItem.sheetGold), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeB), new Object[]
        { " T", "S ", 'T', EnumHandler.getItem(EnumItem.sheetBronze), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolCuttingBoard), new Object[]
        { "WWW", "WWW", 'W', "plankWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolClippers), new Object[]
        { " I ", "S I", " S ", 'S', "stickWood", 'I', Item.ingotIron }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolGrate), new Object[]
        { "S S", " S ", "S S", 'S', EnumHandler.getItem(EnumItem.sheetAluminum) }));

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
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItem.dustFlour), new Object[]
        { Item.wheat, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar), new Object[]
        { Item.reed, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.dyePowder, 4, 15), new Object[]
        { Item.bone, grindStones }));
        // Uncondensed Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar, 4), new Object[]
        { EnumHandler.getItem(EnumItem.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItem.ingotSugar, 4), new Object[]
        { new ItemStack(ModBlocks.blockSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItem.ingotAluminum, 9), new Object[]
        { new ItemStack(ModBlocks.blockAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumFood.foodCheese, 9), new Object[]
        { new ItemStack(ModBlocks.blockCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItem.ingotButter, 9), new Object[]
        { new ItemStack(ModBlocks.blockButter) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItem.itemChocolateChips), new Object[]
        { EnumHandler.getItem(EnumItemSixteen.globChocolate), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItem.globDough), new Object[]
        { Item.bucketWater, "dustWheat", "dustWheat", "dustWheat" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItem.globDoughCorn), new Object[]
        { Item.bucketWater, "dustWheat", "dustWheat", EnumHandler.getItem(EnumUncookedFood.uncookedSeedsCorn), EnumHandler.getItem(EnumUncookedFood.uncookedSeedsCorn) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItemSixteen.bowlBatter), new Object[]
        { EnumHandler.getItem(EnumItemSixteen.bowl), "dustWheat", "dustWheat", "dustWheat", Item.sugar, Item.egg, Item.bucketMilk }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItemSixteen.bowlPumpkinFilling), new Object[]
        { EnumHandler.getItem(EnumItem.rawPumpkinMash), Item.bucketMilk, Item.sugar, EnumHandler.getItem(EnumItem.rawPumpkinMash), EnumHandler.getItem(EnumItemSixteen.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItemSixteen.bowlCookieDough), new Object[]
        { Item.sugar, "dustWheat", EnumHandler.getItem(EnumItem.dustFlour), Item.bucketMilk, Item.egg, EnumHandler.getItem(EnumItemSixteen.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItemSixteen.bowlCookieDoughChocolateChip), new Object[]
        { EnumHandler.getItem(EnumItemSixteen.bowlCookieDough), EnumHandler.getItem(EnumItem.itemChocolateChips), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandler.getItem(EnumItemSixteen.bowlCookieDoughSugar), new Object[]
        { EnumHandler.getItem(EnumItemSixteen.bowlCookieDough), Item.sugar }));
    }

    public static void init()
    {
        addShaped();
        addShapeless();
    }
}