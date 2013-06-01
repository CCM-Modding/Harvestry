package ccm.harvestry.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.items.EnumBerry;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.EnumHandling;

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
        { " S ", "S S", " S ", 'S', EnumHandling.enumItem.getItemIS(EnumItem.sheetIron) }));
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
        { " S ", "S S", " S ", 'S', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heTin), new Object[]
        { " S ", "S S", " S ", 'S', EnumHandling.enumItem.getItemIS(EnumItem.sheetTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heCopper), new Object[]
        { " S ", "STS", " S ", 'S', EnumHandling.enumItem.getItemIS(EnumItem.sheetCopper), 'T', new ItemStack(ModItems.heTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heIron), new Object[]
        { " S ", "SAS", " S ", 'S', EnumHandling.enumItem.getItemIS(EnumItem.sheetIron), 'A', new ItemStack(ModItems.heAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heBronze), new Object[]
        { " S ", "SIS", " S ", 'S', EnumHandling.enumItem.getItemIS(EnumItem.sheetBronze), 'I', new ItemStack(ModItems.heIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.heGold), new Object[]
        { " S ", "SIS", " S ", 'S', EnumHandling.enumItem.getItemIS(EnumItem.sheetGold), 'I', new ItemStack(ModItems.heIron) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panBread), new Object[]
        { " T ", "T T", " T ", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panCake), new Object[]
        { "T T", "T T", "TTT", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panPie), new Object[]
        { "T T", "TTT", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panPieCrust), new Object[]
        { "B", "P", 'B', EnumHandling.enumItem.getItemIS(EnumItem.globDough), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panPie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowl), new Object[]
        { "T T", " T ", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.sheetCookie), new Object[]
        { "TTT", "TTT", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum) }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bottle, 5), new Object[]
        { " G ", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 800mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bottleGlass, 4), new Object[]
        { "G G", "G G", 'G', Block.thinGlass })); // Can hold 500mb any juice
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bottleMilk, 3), new Object[]
        { " G ", "G G", " G ", 'G', Block.thinGlass })); // Can hold 800mb only milk
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bottlePitcher, 2), new Object[]
        { "G G", "G G", "GGG", 'G', Block.thinGlass })); // Can hold 1000mb any juice

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.itemKetchup), new Object[]
        { "T", "B", 'T', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globTomato), 'B', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bottle) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.itemMustard), new Object[]
        { "M", "B", 'M', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.rawMustard), 'B', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bottle) }));
        // Uncooked Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedCake), new Object[]
        { "B", "P", 'B', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlBatter), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panCake) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedPotato), new Object[]
        { "P", "F", 'P', Item.potato, 'F', EnumHandling.enumItem.getItemIS(EnumItem.foilAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedBread), new Object[]
        { "D", "P", 'D', EnumHandling.enumItem.getItemIS(EnumItem.globDough), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panBread) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedCookies), new Object[]
        { "C", "P", 'C', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlCookieDough), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedCookiesChocolateChip), new Object[]
        { "C", "P", 'C', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlCookieDoughChocolateChip), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedCookiesSugar), new Object[]
        { "C", "P", 'C', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlCookieDoughSugar), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedPiePumpkin), new Object[]
        { "F", "P", 'F', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlPumpkinFilling), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedPieApple), new Object[]
        { "AAA", " P ", 'A', EnumHandling.enumItem.getItemIS(EnumItem.sliceApple), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedPieBerryBlue), new Object[]
        { "BBB", " P ", 'B', EnumHandling.enumBerry.getItemIS(EnumBerry.berryBlue), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedPieBerryCherry), new Object[]
        { "CCC", " P ", 'C', EnumHandling.enumFood.getItemIS(EnumFood.foodBerryCherry), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedPizzaCheese), new Object[]
        { "C", "P", 'C', EnumHandling.enumItem.getItemIS(EnumItem.dustCheese), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.rawPizzaSauce) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedMeatBall, 4), new Object[]
        { "MM", "MM", 'M', EnumHandling.enumItem.getItemIS(EnumItem.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedMeatPatty, 2), new Object[]
        { "MMM", 'M', EnumHandling.enumItem.getItemIS(EnumItem.dustBeef) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedNoodles, 3), new Object[]
        { "D", "G", 'D', EnumHandling.enumItem.getItemIS(EnumItem.globDough), 'G', ModItems.toolGrate }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.rawPizzaSauce), new Object[]
        { "T", "P", 'T', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globTomato), 'P', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.rawPizza) }));
        // Food
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodSandwichCheese, 4), new Object[]
        { "BBB", "CCC", "BBB", 'B', EnumHandling.enumItem.getItemIS(EnumItem.sliceBread), 'C', EnumHandling.enumItem.getItemIS(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodSandwichHam, 4), new Object[]
                {
                                "BBB",
                                "LHC",
                                "BBB",
                                'B',
                                EnumHandling.enumItem.getItemIS(EnumItem.sliceBread),
                                'C',
                                EnumHandling.enumItem.getItemIS(EnumItem.dustCheese),
                                'H',
                                Item.porkRaw,
                                'L',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodSandwichPB_J, 4), new Object[]
                {
                                "B B",
                                "P J",
                                "B B",
                                'B',
                                EnumHandling.enumItem.getItemIS(EnumItem.sliceBread),
                                'P',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globPB),
                                'J',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globJelly) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodHamburger, 3), new Object[]
                {
                                "TBC",
                                "MPK",
                                "LBO",
                                'B',
                                EnumHandling.enumItem.getItemIS(EnumItem.sliceBread),
                                'C',
                                EnumHandling.enumItem.getItemIS(EnumItem.dustCheese),
                                'O',
                                EnumHandling.enumItem.getItemIS(EnumItem.sliceOnion),
                                'T',
                                EnumHandling.enumItem.getItemIS(EnumItem.sliceTomato),
                                'L',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                                'P',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.cookedMeatPatty),
                                'M',
                                EnumHandling.enumItem.getItemIS(EnumItem.itemMustard),
                                'K',
                                EnumHandling.enumItem.getItemIS(EnumItem.itemKetchup) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodBagOChips, 4), new Object[]
                {
                                "ASA",
                                "CCC",
                                "ACA",
                                'A',
                                EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum),
                                'C',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.friedChips),
                                'S',
                                EnumHandling.enumItem.getItemIS(EnumItem.dustSalt) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodBoxOFries, 4), new Object[]
        { "FSF", "PFP", " P ", 'P', Item.paper, 'F', EnumHandling.enumItem16.getItemIS(EnumItemSixteen.friedFries), 'S', EnumHandling.enumItem.getItemIS(EnumItem.dustSalt) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodTaco, 2), new Object[]
                {
                                "MLC",
                                " T ",
                                'T',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemTaco),
                                'M',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.cookedDustMeat),
                                'L',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                                'C',
                                EnumHandling.enumItem.getItemIS(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodBurito, 2), new Object[]
                {
                                "MLC",
                                " T ",
                                'T',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemTortilla),
                                'M',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.cookedDustMeat),
                                'L',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                                'C',
                                EnumHandling.enumItem.getItemIS(EnumItem.dustCheese) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodSpaghetti, 3), new Object[]
                {
                                "MMM",
                                "SSS",
                                "NNN",
                                'M',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.cookedMeatBall),
                                'N',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.cookedNoodles),
                                'T',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globTomato) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodSandwichChickenFried, 2), new Object[]
                {
                                "BB",
                                "CL",
                                "BB",
                                'B',
                                EnumHandling.enumItem.getItemIS(EnumItem.sliceBread),
                                'C',
                                EnumHandling.enumFood.getItemIS(EnumFood.foodChickenFried),
                                'L',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodSandwichChickenGrilled, 2), new Object[]
                {
                                "BB",
                                "CL",
                                "BB",
                                'B',
                                EnumHandling.enumItem.getItemIS(EnumItem.sliceBread),
                                'C',
                                EnumHandling.enumFood.getItemIS(EnumFood.foodChickenGrilled),
                                'L',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodSalad, 2), new Object[]
                {
                                "TCT",
                                "LLL",
                                "B B",
                                'B',
                                Item.bowlEmpty,
                                'C',
                                EnumHandling.enumItem.getItemIS(EnumItem.dustCheese),
                                'L',
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.itemLettuceLeaf),
                                'T',
                                EnumHandling.enumItem.getItemIS(EnumItem.sliceTomato) }));
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
        { "III", "BAB", "BFB", 'I', Item.ingotIron, 'F', Block.furnaceIdle, 'B', Item.brick, 'A', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum) }));
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
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.ingotSugar), new Object[]
        { "SS", "SS", 'S', Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSugar), new Object[]
        { "SS", "SS", 'S', EnumHandling.enumItem.getItemIS(EnumItem.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockAluminum), new Object[]
        { "III", "III", "III", 'I', EnumHandling.enumItem.getItemIS(EnumItem.ingotAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCheese), new Object[]
        { "III", "III", "III", 'I', EnumHandling.enumFood.getItemIS(EnumFood.foodCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockButter), new Object[]
        { "III", "III", "III", 'I', EnumHandling.enumItem.getItemIS(EnumItem.ingotButter) }));
        // Other
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.paper, 5), new Object[]
        { "WWW", 'W', EnumHandling.enumItem.getItemIS(EnumItem.rawWood) }));
        // Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeA), new Object[]
        { " T", "S ", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeI), new Object[]
        { " T", "S ", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetIron), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeG), new Object[]
        { " T", "S ", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetGold), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeB), new Object[]
        { " T", "S ", 'T', EnumHandling.enumItem.getItemIS(EnumItem.sheetBronze), 'S', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolCuttingBoard), new Object[]
        { "WWW", "WWW", 'W', "plankWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolClippers), new Object[]
        { " I ", "S I", " S ", 'S', "stickWood", 'I', Item.ingotIron }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModItems.toolGrate), new Object[]
        { "S S", " S ", "S S", 'S', EnumHandling.enumItem.getItemIS(EnumItem.sheetAluminum) }));

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
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.dustFlour), new Object[]
        { Item.wheat, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar), new Object[]
        { Item.reed, grindStones }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.dyePowder, 4, 15), new Object[]
        { Item.bone, grindStones }));
        // Uncondensed Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Item.sugar, 4), new Object[]
        { EnumHandling.enumItem.getItemIS(EnumItem.ingotSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.ingotSugar, 4), new Object[]
        { new ItemStack(ModBlocks.blockSugar) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.ingotAluminum, 9), new Object[]
        { new ItemStack(ModBlocks.blockAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumFood.getItemIS(EnumFood.foodCheese, 9), new Object[]
        { new ItemStack(ModBlocks.blockCheese) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.ingotButter, 9), new Object[]
        { new ItemStack(ModBlocks.blockButter) }));
        // Cooking Items
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.itemChocolateChips), new Object[]
        { EnumHandling.enumItem16.getItemIS(EnumItemSixteen.globChocolate), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.globDough), new Object[]
        { Item.bucketWater, "dustWheat", "dustWheat", "dustWheat" }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHandling.enumItem.getItemIS(EnumItem.globDoughCorn), new Object[]
                {
                                Item.bucketWater,
                                "dustWheat",
                                "dustWheat",
                                EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedSeedsCorn),
                                EnumHandling.enumUncooked.getItemIS(EnumUncookedFood.uncookedSeedsCorn) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlBatter), new Object[]
        { EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowl), "dustWheat", "dustWheat", "dustWheat", Item.sugar, Item.egg, Item.bucketMilk }));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlPumpkinFilling), new Object[]
                {
                                EnumHandling.enumItem.getItemIS(EnumItem.rawPumpkinMash),
                                Item.bucketMilk,
                                Item.sugar,
                                EnumHandling.enumItem.getItemIS(EnumItem.rawPumpkinMash),
                                EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlCookieDough), new Object[]
        { Item.sugar, "dustWheat", EnumHandling.enumItem.getItemIS(EnumItem.dustFlour), Item.bucketMilk, Item.egg, EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowl) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlCookieDoughChocolateChip), new Object[]
        { EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlCookieDough), EnumHandling.enumItem.getItemIS(EnumItem.itemChocolateChips), Item.sugar }));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlCookieDoughSugar), new Object[]
        { EnumHandling.enumItem16.getItemIS(EnumItemSixteen.bowlCookieDough), Item.sugar }));
    }
}