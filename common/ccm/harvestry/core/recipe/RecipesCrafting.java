package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import ccm.nucleum_omnium.helper.enums.EnumHelper;

import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;

final class RecipesCrafting
{

    private static ItemStack grindStones = new ItemStack(ModItems.grindStones, 1, OreDictionary.WILDCARD_VALUE);

    public RecipesCrafting()
    {
        addShaped();
        addShapeless();
    }

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
        { " S ", "S S", " S ", 'S', EnumHelper.getItemIS(EnumItem.sheetIron) }));
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
        { " S ", "S S", " S ", 'S', EnumHelper.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heTin), new Object[]
        { " S ", "S S", " S ", 'S', EnumHelper.getItemIS(EnumItem.sheetTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heCopper), new Object[]
        { " S ", "STS", " S ", 'S', EnumHelper.getItemIS(EnumItem.sheetCopper), 'T', new ItemStack(ModItems.heTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heIron), new Object[]
        { " S ", "SAS", " S ", 'S', EnumHelper.getItemIS(EnumItem.sheetIron), 'A', new ItemStack(ModItems.heAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heBronze), new Object[]
        { " S ", "SIS", " S ", 'S', EnumHelper.getItemIS(EnumItem.sheetBronze), 'I', new ItemStack(ModItems.heIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heGold), new Object[]
        { " S ", "SIS", " S ", 'S', EnumHelper.getItemIS(EnumItem.sheetGold), 'I', new ItemStack(ModItems.heIron) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.panBread), new Object[]
        { " T ", "T T", " T ", 'T', EnumHelper.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.panCake), new Object[]
        { "T T", "T T", "TTT", 'T', EnumHelper.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.panPie), new Object[]
        { "T T", "TTT", 'T', EnumHelper.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.panPieCrust), new Object[]
        { "B", "P", 'B', EnumHelper.getItemIS(EnumItem.globDough), 'P', EnumHelper.getItemIS(EnumItemSixteen.panPie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bowl), new Object[]
        { "T T", " T ", 'T', EnumHelper.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.sheetCookie), new Object[]
        { "TTT", "TTT", 'T', EnumHelper.getItemIS(EnumItem.sheetAluminum) }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bottle, 5), new Object[]
        { " G ", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 800mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bottleGlass, 4), new Object[]
        { "G G", "G G", 'G', Block.thinGlass })); // Can hold 500mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bottleMilk, 3), new Object[]
        { " G ", "G G", " G ", 'G', Block.thinGlass })); // Can hold 800mb only milk
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bottlePitcher, 2), new Object[]
        { "G G", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 1000mb any juice

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItem.itemKetchup), new Object[]
        { "T", "B", 'T', EnumHelper.getItemIS(EnumItemSixteen.globTomato), 'B', EnumHelper.getItemIS(EnumItemSixteen.bottle) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItem.itemMustard), new Object[]
        { "M", "B", 'M', EnumHelper.getItemIS(EnumItemSixteen.rawMustard), 'B', EnumHelper.getItemIS(EnumItemSixteen.bottle) }));
        // Uncooked Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedCake), new Object[]
        { "B", "P", 'B', EnumHelper.getItemIS(EnumItemSixteen.bowlBatter), 'P', EnumHelper.getItemIS(EnumItemSixteen.panCake) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedPotato), new Object[]
        { "P", "F", 'P', Item.potato, 'F', EnumHelper.getItemIS(EnumItem.foilAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedBread), new Object[]
        { "D", "P", 'D', EnumHelper.getItemIS(EnumItem.globDough), 'P', EnumHelper.getItemIS(EnumItemSixteen.panBread) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedCookies), new Object[]
        { "C", "P", 'C', EnumHelper.getItemIS(EnumItemSixteen.bowlCookieDough), 'P', EnumHelper.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedCookiesChocolateChip), new Object[]
        { "C", "P", 'C', EnumHelper.getItemIS(EnumItemSixteen.bowlCookieDoughChocolateChip), 'P', EnumHelper.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedCookiesSugar), new Object[]
        { "C", "P", 'C', EnumHelper.getItemIS(EnumItemSixteen.bowlCookieDoughSugar), 'P', EnumHelper.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedPiePumpkin), new Object[]
        { "F", "P", 'F', EnumHelper.getItemIS(EnumItemSixteen.bowlPumpkinFilling), 'P', EnumHelper.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedPieApple), new Object[]
        { "AAA", " P ", 'A', EnumHelper.getItemIS(EnumItem.sliceApple), 'P', EnumHelper.getItemIS(EnumItemSixteen.panPieCrust) }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedPieBerryBlue), new Object[]
        // { "BBB", " P ", 'B', EnumHelper.getItemIS(EnumBerry.berryBlue), 'P',
        // EnumHelper.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedPieBerryCherry), new Object[]
        { "CCC", " P ", 'C', EnumHelper.getItemIS(EnumFood.foodBerryCherry), 'P', EnumHelper.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedPizzaCheese), new Object[]
        { "C", "P", 'C', EnumHelper.getItemIS(EnumItem.dustCheese), 'P', EnumHelper.getItemIS(EnumItemSixteen.rawPizzaSauce) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedMeatBall, 4), new Object[]
        { "MM", "MM", 'M', EnumHelper.getItemIS(EnumItem.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedMeatPatty, 2), new Object[]
        { "MMM", 'M', EnumHelper.getItemIS(EnumItem.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedNoodles, 3), new Object[]
        { "D", "G", 'D', EnumHelper.getItemIS(EnumItem.globDough), 'G', ModItems.toolGrate }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.rawPizzaSauce), new Object[]
        { "T", "P", 'T', EnumHelper.getItemIS(EnumItemSixteen.globTomato), 'P', EnumHelper.getItemIS(EnumItemSixteen.rawPizza) }));
        // Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodSandwichCheese, 4), new Object[]
        { "BBB", "CCC", "BBB", 'B', EnumHelper.getItemIS(EnumItem.sliceBread), 'C', EnumHelper.getItemIS(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodSandwichHam, 4), new Object[]
                {
                                "BBB",
                                "LHC",
                                "BBB",
                                'B',
                                EnumHelper.getItemIS(EnumItem.sliceBread),
                                'C',
                                EnumHelper.getItemIS(EnumItem.dustCheese),
                                'H',
                                Item.porkRaw,
                                'L',
                                EnumHelper.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodSandwichPB_J, 4), new Object[]
                {
                                "B B",
                                "P J",
                                "B B",
                                'B',
                                EnumHelper.getItemIS(EnumItem.sliceBread),
                                'P',
                                EnumHelper.getItemIS(EnumItemSixteen.globPB),
                                'J',
                                EnumHelper.getItemIS(EnumItemSixteen.globJelly) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodHamburger, 3), new Object[]
                {
                                "TBC",
                                "MPK",
                                "LBO",
                                'B',
                                EnumHelper.getItemIS(EnumItem.sliceBread),
                                'C',
                                EnumHelper.getItemIS(EnumItem.dustCheese),
                                'O',
                                EnumHelper.getItemIS(EnumItem.sliceOnion),
                                'T',
                                EnumHelper.getItemIS(EnumItem.sliceTomato),
                                'L',
                                EnumHelper.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                                'P',
                                EnumHelper.getItemIS(EnumItemSixteen.cookedMeatPatty),
                                'M',
                                EnumHelper.getItemIS(EnumItem.itemMustard),
                                'K',
                                EnumHelper.getItemIS(EnumItem.itemKetchup) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodBagOChips, 4), new Object[]
                {
                                "ASA",
                                "CCC",
                                "ACA",
                                'A',
                                EnumHelper.getItemIS(EnumItem.sheetAluminum),
                                'C',
                                EnumHelper.getItemIS(EnumItemSixteen.friedChips),
                                'S',
                                EnumHelper.getItemIS(EnumItem.dustSalt) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodBoxOFries, 4), new Object[]
        { "FSF", "PFP", " P ", 'P', Item.paper, 'F', EnumHelper.getItemIS(EnumItemSixteen.friedFries), 'S', EnumHelper.getItemIS(EnumItem.dustSalt) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodTaco, 2), new Object[]
                {
                                "MLC",
                                " T ",
                                'T',
                                EnumHelper.getItemIS(EnumItemSixteen.itemTaco),
                                'M',
                                EnumHelper.getItemIS(EnumItemSixteen.cookedDustMeat),
                                'L',
                                EnumHelper.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                                'C',
                                EnumHelper.getItemIS(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodBurito, 2), new Object[]
                {
                                "MLC",
                                " T ",
                                'T',
                                EnumHelper.getItemIS(EnumItemSixteen.itemTortilla),
                                'M',
                                EnumHelper.getItemIS(EnumItemSixteen.cookedDustMeat),
                                'L',
                                EnumHelper.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                                'C',
                                EnumHelper.getItemIS(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodSpaghetti, 3), new Object[]
                {
                                "MMM",
                                "SSS",
                                "NNN",
                                'M',
                                EnumHelper.getItemIS(EnumItemSixteen.cookedMeatBall),
                                'N',
                                EnumHelper.getItemIS(EnumItemSixteen.cookedNoodles),
                                'T',
                                EnumHelper.getItemIS(EnumItemSixteen.globTomato) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodSandwichChickenFried, 2), new Object[]
                {
                                "BB",
                                "CL",
                                "BB",
                                'B',
                                EnumHelper.getItemIS(EnumItem.sliceBread),
                                'C',
                                EnumHelper.getItemIS(EnumFood.foodChickenFried),
                                'L',
                                EnumHelper.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodSandwichChickenGrilled, 2), new Object[]
                {
                                "BB",
                                "CL",
                                "BB",
                                'B',
                                EnumHelper.getItemIS(EnumItem.sliceBread),
                                'C',
                                EnumHelper.getItemIS(EnumFood.foodChickenGrilled),
                                'L',
                                EnumHelper.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumFood.foodSalad, 2), new Object[]
                {
                                "TCT",
                                "LLL",
                                "B B",
                                'B',
                                Item.bowlEmpty,
                                'C',
                                EnumHelper.getItemIS(EnumItem.dustCheese),
                                'L',
                                EnumHelper.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                                'T',
                                EnumHelper.getItemIS(EnumItem.sliceTomato) }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(new
        // ItemStack(Item.cake), new Object[]
        // { "B B", "SSS", " C ", 'C',
        // EHandler.getItem(ItemEnumSixteen.cookedCake), 'B',
        // EHandler.getItem(FoodEnum.foodBerryStrawberry), 'S', Item.sugar }));
        // Blocks
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[]
        { "CIC", " L ", "CIC", 'C', Block.cobblestone, 'I', Item.ingotIron, 'L', "logWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockOven), new Object[]
        { "III", "BAB", "BFB", 'I', Item.ingotIron, 'F', Block.furnaceIdle, 'B', Item.brick, 'A', EnumHelper.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockRoller), new Object[]
        { "III", "S S", "III", 'I', Item.ingotIron, 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCounter), new Object[]
        { "SSS", "PCP", "PPP", 'S', new ItemStack(Block.stoneSingleSlab, 1, 0), 'W', new ItemStack(Block.planks, 1, 1), 'C', Block.chest }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(new
        // ItemStack(ModBlocks.blockFrier), new Object[] { "I I", "IBI", "INI",
        // 'I', Item.ingotIron,
        // 'B', new ItemStack(Block.planks, 1, 1), 'N', Block.netherrack }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(new
        // ItemStack(ModBlocks.blockGrill), new Object[] { "SSS", "INI", "I I",
        // 'I', Item.ingotIron,
        // 'S', EHandler.getItem(ItemEnum.sheetAluminum), 'N', Block.netherrack
        // }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCabinet), new Object[]
        { "PPP", "I I", "PPP", 'I', Item.ingotIron, 'P', new ItemStack(Block.planks, 1, 1) }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(new
        // ItemStack(ModBlocks.blockKeg), new Object[] { "PPP", "III", "PPP",
        // 'I', Item.ingotIron,
        // 'P', new ItemStack(Block.planks, 1, 1) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBarrel), new Object[]
        { "PPP", "III", "PPP", 'I', Item.ingotIron, 'P', new ItemStack(Block.planks, 1, 0) }));
        // Condensed Items
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getItemIS(EnumItem.ingotSugar), new Object[]
        { "SS", "SS", 'S', Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSugar), new Object[]
        { "SS", "SS", 'S', EnumHelper.getItemIS(EnumItem.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockAluminum), new Object[]
        { "III", "III", "III", 'I', EnumHelper.getItemIS(EnumItem.ingotAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCheese), new Object[]
        { "III", "III", "III", 'I', EnumHelper.getItemIS(EnumFood.foodCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockButter), new Object[]
        { "III", "III", "III", 'I', EnumHelper.getItemIS(EnumItem.ingotButter) }));
        // Other
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.paper, 5), new Object[]
        { "WWW", 'W', EnumHelper.getItemIS(EnumItem.rawWood) }));
        // Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeA), new Object[]
        { " T", "S ", 'T', EnumHelper.getItemIS(EnumItem.sheetAluminum), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeI), new Object[]
        { " T", "S ", 'T', EnumHelper.getItemIS(EnumItem.sheetIron), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeG), new Object[]
        { " T", "S ", 'T', EnumHelper.getItemIS(EnumItem.sheetGold), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeB), new Object[]
        { " T", "S ", 'T', EnumHelper.getItemIS(EnumItem.sheetBronze), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolCuttingBoard), new Object[]
        { "WWW", "WWW", 'W', "plankWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolClippers), new Object[]
        { " I ", "S I", " S ", 'S', "stickWood", 'I', Item.ingotIron }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolGrate), new Object[]
        { "S S", " S ", "S S", 'S', EnumHelper.getItemIS(EnumItem.sheetAluminum) }));

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
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItem.dustFlour), new Object[]
        { Item.wheat, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar), new Object[]
        { Item.reed, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.dyePowder, 4, 15), new Object[]
        { Item.bone, grindStones }));
        // Uncondensed Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar, 4), new Object[]
        { EnumHelper.getItemIS(EnumItem.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItem.ingotSugar, 4), new Object[]
        { new ItemStack(ModBlocks.blockSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItem.ingotAluminum, 9), new Object[]
        { new ItemStack(ModBlocks.blockAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumFood.foodCheese, 9), new Object[]
        { new ItemStack(ModBlocks.blockCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItem.ingotButter, 9), new Object[]
        { new ItemStack(ModBlocks.blockButter) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItem.itemChocolateChips), new Object[]
        { EnumHelper.getItemIS(EnumItemSixteen.globChocolate), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItem.globDough), new Object[]
        { Item.bucketWater, "dustWheat", "dustWheat", "dustWheat" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItem.globDoughCorn), new Object[]
        { Item.bucketWater, "dustWheat", "dustWheat", EnumHelper.getItemIS(EnumUncookedFood.uncookedSeedsCorn), EnumHelper.getItemIS(EnumUncookedFood.uncookedSeedsCorn) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bowlBatter), new Object[]
        { EnumHelper.getItemIS(EnumItemSixteen.bowl), "dustWheat", "dustWheat", "dustWheat", Item.sugar, Item.egg, Item.bucketMilk }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bowlPumpkinFilling), new Object[]
        { EnumHelper.getItemIS(EnumItem.rawPumpkinMash), Item.bucketMilk, Item.sugar, EnumHelper.getItemIS(EnumItem.rawPumpkinMash), EnumHelper.getItemIS(EnumItemSixteen.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bowlCookieDough), new Object[]
        { Item.sugar, "dustWheat", EnumHelper.getItemIS(EnumItem.dustFlour), Item.bucketMilk, Item.egg, EnumHelper.getItemIS(EnumItemSixteen.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bowlCookieDoughChocolateChip), new Object[]
        { EnumHelper.getItemIS(EnumItemSixteen.bowlCookieDough), EnumHelper.getItemIS(EnumItem.itemChocolateChips), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumItemSixteen.bowlCookieDoughSugar), new Object[]
        { EnumHelper.getItemIS(EnumItemSixteen.bowlCookieDough), Item.sugar }));
    }
}