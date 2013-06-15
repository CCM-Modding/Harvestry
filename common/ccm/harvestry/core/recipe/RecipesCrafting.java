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
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesCrafting {

    private static ItemStack grindStones = new ItemStack(ModItems.grindStones, 1,
                                                 OreDictionary.WILDCARD_VALUE);

    public RecipesCrafting() {
        RecipesCrafting.addShaped();
        RecipesCrafting.addShapeless();
    }

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped() {
        // Grinder Wheels
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.gStone), new Object[] { " S ",
                        "SLS", " S ", 'S', Block.stone, 'L', "logWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.gGrate), new Object[] { " S ",
                        "S S", " S ", 'S', EnumToItemStack.getItemIS(EnumItem.sheetIron) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.gIron), new Object[] { " S ",
                        "SLS", " S ", 'S', Item.ingotIron, 'L', new ItemStack(ModItems.gStone) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.gBronze), new Object[] { " S ",
                        "SLS", " S ", 'S', "ingotBronze", 'L', new ItemStack(ModItems.gStone) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.gObsidian), new Object[] { " S ",
                        "SLS", " S ", 'S', Block.obsidian, 'L', new ItemStack(ModItems.gIron) }));
        // Heating Elements
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.heWood), new Object[] { "L L",
                        " L ", "L L", 'L', "logWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.heAluminum), new Object[] { " S ",
                        "S S", " S ", 'S', EnumToItemStack.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.heTin), new Object[] { " S ",
                        "S S", " S ", 'S', EnumToItemStack.getItemIS(EnumItem.sheetTin) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.heCopper), new Object[] { " S ",
                        "STS", " S ", 'S', EnumToItemStack.getItemIS(EnumItem.sheetCopper), 'T',
                        new ItemStack(ModItems.heTin) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.heIron), new Object[] { " S ",
                        "SAS", " S ", 'S', EnumToItemStack.getItemIS(EnumItem.sheetIron), 'A',
                        new ItemStack(ModItems.heAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.heBronze), new Object[] { " S ",
                        "SIS", " S ", 'S', EnumToItemStack.getItemIS(EnumItem.sheetBronze), 'I',
                        new ItemStack(ModItems.heIron) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.heGold), new Object[] { " S ",
                        "SIS", " S ", 'S', EnumToItemStack.getItemIS(EnumItem.sheetGold), 'I',
                        new ItemStack(ModItems.heIron) }));
        // Cooking Items
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.panBread),
                        new Object[] { " T ", "T T", " T ", 'T',
                                EnumToItemStack.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.panCake),
                        new Object[] { "T T", "T T", "TTT", 'T',
                                EnumToItemStack.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.panPie),
                        new Object[] { "T T", "TTT", 'T',
                                EnumToItemStack.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.panPieCrust),
                        new Object[] { "B", "P", 'B', EnumToItemStack.getItemIS(EnumItem.globDough),
                                'P', EnumToItemStack.getItemIS(EnumItemSixteen.panPie) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.bowl), new Object[] {
                        "T T", " T ", 'T', EnumToItemStack.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie),
                        new Object[] { "TTT", "TTT", 'T',
                                EnumToItemStack.getItemIS(EnumItem.sheetAluminum) }));

        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.bottle, 5),
                        new Object[] { " G ", "G G", "GGG", 'G', Block.thinGlass })); // Can
                                                                                      // hold
        // 800mb any
        // juice
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.bottleGlass, 4),
                        new Object[] { "G G", "G G", 'G', Block.thinGlass })); // Can
                                                                               // hold
                                                                               // 500mb
                                                                               // any
        // juice
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.bottleMilk, 3),
                        new Object[] { " G ", "G G", " G ", 'G', Block.thinGlass })); // Can
                                                                                      // hold
        // 800mb only
        // milk
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.bottlePitcher, 2),
                        new Object[] { "G G", "G G", "GGG", 'G', Block.thinGlass })); // Can
        // hold
        // 1000mb
        // any
        // juice

        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItem.itemKetchup), new Object[] {
                        "T", "B", 'T', EnumToItemStack.getItemIS(EnumItemSixteen.globTomato), 'B',
                        EnumToItemStack.getItemIS(EnumItemSixteen.bottle) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItem.itemMustard), new Object[] {
                        "M", "B", 'M', EnumToItemStack.getItemIS(EnumItemSixteen.rawMustard), 'B',
                        EnumToItemStack.getItemIS(EnumItemSixteen.bottle) }));
        // Uncooked Food
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCake),
                        new Object[] { "B", "P", 'B',
                                EnumToItemStack.getItemIS(EnumItemSixteen.bowlBatter), 'P',
                                EnumToItemStack.getItemIS(EnumItemSixteen.panCake) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPotato),
                        new Object[] { "P", "F", 'P', Item.potato, 'F',
                                EnumToItemStack.getItemIS(EnumItem.foilAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedBread),
                        new Object[] { "D", "P", 'D', EnumToItemStack.getItemIS(EnumItem.globDough),
                                'P', EnumToItemStack.getItemIS(EnumItemSixteen.panBread) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedCookies),
                        new Object[] { "C", "P", 'C',
                                EnumToItemStack.getItemIS(EnumItemSixteen.bowlCookieDough), 'P',
                                EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack
                        .getItemIS(EnumUncookedFood.uncookedCookiesChocolateChip), new Object[] {
                        "C", "P", 'C',
                        EnumToItemStack.getItemIS(EnumItemSixteen.bowlCookieDoughChocolateChip), 'P',
                        EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack
                        .getItemIS(EnumUncookedFood.uncookedCookiesSugar), new Object[] { "C", "P",
                        'C', EnumToItemStack.getItemIS(EnumItemSixteen.bowlCookieDoughSugar), 'P',
                        EnumToItemStack.getItemIS(EnumItemSixteen.sheetCookie) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPiePumpkin),
                        new Object[] { "F", "P", 'F',
                                EnumToItemStack.getItemIS(EnumItemSixteen.bowlPumpkinFilling), 'P',
                                EnumToItemStack.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPieApple),
                        new Object[] { "AAA", " P ", 'A',
                                EnumToItemStack.getItemIS(EnumItem.sliceApple), 'P',
                                EnumToItemStack.getItemIS(EnumItemSixteen.panPieCrust) }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(EnumHelper.getItemIS(EnumUncookedFood.uncookedPieBerryBlue),
        // new Object[]
        // { "BBB", " P ", 'B', EnumHelper.getItemIS(EnumBerry.berryBlue), 'P',
        // EnumHelper.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack
                        .getItemIS(EnumUncookedFood.uncookedPieBerryCherry), new Object[] { "CCC",
                        " P ", 'C', EnumToItemStack.getItemIS(EnumFood.foodBerryCherry), 'P',
                        EnumToItemStack.getItemIS(EnumItemSixteen.panPieCrust) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(
                        EnumToItemStack.getItemIS(EnumUncookedFood.uncookedPizzaCheese), new Object[] {
                                "C", "P", 'C', EnumToItemStack.getItemIS(EnumItem.dustCheese), 'P',
                                EnumToItemStack.getItemIS(EnumItemSixteen.rawPizzaSauce) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(
                        EnumToItemStack.getItemIS(EnumUncookedFood.uncookedMeatBall, 4), new Object[] {
                                "MM", "MM", 'M', EnumToItemStack.getItemIS(EnumItem.dustBeef) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack
                        .getItemIS(EnumUncookedFood.uncookedMeatPatty, 2), new Object[] { "MMM",
                        'M', EnumToItemStack.getItemIS(EnumItem.dustBeef) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumUncookedFood.uncookedNoodles, 3),
                        new Object[] { "D", "G", 'D', EnumToItemStack.getItemIS(EnumItem.globDough),
                                'G', ModItems.toolGrate }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.rawPizzaSauce),
                        new Object[] { "T", "P", 'T',
                                EnumToItemStack.getItemIS(EnumItemSixteen.globTomato), 'P',
                                EnumToItemStack.getItemIS(EnumItemSixteen.rawPizza) }));
        // Food
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodSandwichCheese, 4),
                        new Object[] { "BBB", "CCC", "BBB", 'B',
                                EnumToItemStack.getItemIS(EnumItem.sliceBread), 'C',
                                EnumToItemStack.getItemIS(EnumItem.dustCheese) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodSandwichHam, 4),
                        new Object[] { "BBB", "LHC", "BBB", 'B',
                                EnumToItemStack.getItemIS(EnumItem.sliceBread), 'C',
                                EnumToItemStack.getItemIS(EnumItem.dustCheese), 'H', Item.porkRaw, 'L',
                                EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodSandwichPB_J, 4),
                        new Object[] { "B B", "P J", "B B", 'B',
                                EnumToItemStack.getItemIS(EnumItem.sliceBread), 'P',
                                EnumToItemStack.getItemIS(EnumItemSixteen.globPB), 'J',
                                EnumToItemStack.getItemIS(EnumItemSixteen.globJelly) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodHamburger, 3),
                        new Object[] { "TBC", "MPK", "LBO", 'B',
                                EnumToItemStack.getItemIS(EnumItem.sliceBread), 'C',
                                EnumToItemStack.getItemIS(EnumItem.dustCheese), 'O',
                                EnumToItemStack.getItemIS(EnumItem.sliceOnion), 'T',
                                EnumToItemStack.getItemIS(EnumItem.sliceTomato), 'L',
                                EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf), 'P',
                                EnumToItemStack.getItemIS(EnumItemSixteen.cookedMeatPatty), 'M',
                                EnumToItemStack.getItemIS(EnumItem.itemMustard), 'K',
                                EnumToItemStack.getItemIS(EnumItem.itemKetchup) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodBagOChips, 4),
                        new Object[] { "ASA", "CCC", "ACA", 'A',
                                EnumToItemStack.getItemIS(EnumItem.sheetAluminum), 'C',
                                EnumToItemStack.getItemIS(EnumItemSixteen.friedChips), 'S',
                                EnumToItemStack.getItemIS(EnumItem.dustSalt) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodBoxOFries, 4),
                        new Object[] { "FSF", "PFP", " P ", 'P', Item.paper, 'F',
                                EnumToItemStack.getItemIS(EnumItemSixteen.friedFries), 'S',
                                EnumToItemStack.getItemIS(EnumItem.dustSalt) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodTaco, 2), new Object[] {
                        "MLC", " T ", 'T', EnumToItemStack.getItemIS(EnumItemSixteen.itemTaco), 'M',
                        EnumToItemStack.getItemIS(EnumItemSixteen.cookedDustMeat), 'L',
                        EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf), 'C',
                        EnumToItemStack.getItemIS(EnumItem.dustCheese) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodBurito, 2),
                        new Object[] { "MLC", " T ", 'T',
                                EnumToItemStack.getItemIS(EnumItemSixteen.itemTortilla), 'M',
                                EnumToItemStack.getItemIS(EnumItemSixteen.cookedDustMeat), 'L',
                                EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf), 'C',
                                EnumToItemStack.getItemIS(EnumItem.dustCheese) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodSpaghetti, 3),
                        new Object[] { "MMM", "SSS", "NNN", 'M',
                                EnumToItemStack.getItemIS(EnumItemSixteen.cookedMeatBall), 'N',
                                EnumToItemStack.getItemIS(EnumItemSixteen.cookedNoodles), 'T',
                                EnumToItemStack.getItemIS(EnumItemSixteen.globTomato) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(
                        EnumToItemStack.getItemIS(EnumFood.foodSandwichChickenFried, 2), new Object[] {
                                "BB", "CL", "BB", 'B', EnumToItemStack.getItemIS(EnumItem.sliceBread),
                                'C', EnumToItemStack.getItemIS(EnumFood.foodChickenFried), 'L',
                                EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodSandwichChickenGrilled,
                        2), new Object[] { "BB", "CL", "BB", 'B',
                        EnumToItemStack.getItemIS(EnumItem.sliceBread), 'C',
                        EnumToItemStack.getItemIS(EnumFood.foodChickenGrilled), 'L',
                        EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodSalad, 2), new Object[] {
                        "TCT", "LLL", "B B", 'B', Item.bowlEmpty, 'C',
                        EnumToItemStack.getItemIS(EnumItem.dustCheese), 'L',
                        EnumToItemStack.getItemIS(EnumItemSixteen.itemLettuceLeaf), 'T',
                        EnumToItemStack.getItemIS(EnumItem.sliceTomato) }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(new
        // ItemStack(Item.cake), new Object[]
        // { "B B", "SSS", " C ", 'C',
        // EHandler.getItem(ItemEnumSixteen.cookedCake), 'B',
        // EHandler.getItem(FoodEnum.foodBerryStrawberry), 'S', Item.sugar }));
        // Blocks
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[] {
                        "CIC", " L ", "CIC", 'C', Block.cobblestone, 'I', Item.ingotIron, 'L',
                        "logWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockOven), new Object[] { "III",
                        "BAB", "BFB", 'I', Item.ingotIron, 'F', Block.furnaceIdle, 'B', Item.brick,
                        'A', EnumToItemStack.getItemIS(EnumItem.sheetAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockRoller), new Object[] {
                        "III", "S S", "III", 'I', Item.ingotIron, 'S', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCounter), new Object[] {
                        "SSS", "PCP", "PPP", 'S', new ItemStack(Block.stoneSingleSlab, 1, 0), 'W',
                        new ItemStack(Block.planks, 1, 1), 'C', Block.chest }));
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
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCabinet), new Object[] {
                        "PPP", "I I", "PPP", 'I', Item.ingotIron, 'P',
                        new ItemStack(Block.planks, 1, 1) }));
        // CraftingManager.getInstance().getRecipeList().add(new
        // ShapedOreRecipe(new
        // ItemStack(ModBlocks.blockKeg), new Object[] { "PPP", "III", "PPP",
        // 'I', Item.ingotIron,
        // 'P', new ItemStack(Block.planks, 1, 1) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBarrel), new Object[] {
                        "PPP", "III", "PPP", 'I', Item.ingotIron, 'P',
                        new ItemStack(Block.planks, 1, 0) }));
        // Condensed Items
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getItemIS(EnumItem.ingotSugar), new Object[] {
                        "SS", "SS", 'S', Item.sugar }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSugar), new Object[] { "SS",
                        "SS", 'S', EnumToItemStack.getItemIS(EnumItem.ingotSugar) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockAluminum), new Object[] {
                        "III", "III", "III", 'I', EnumToItemStack.getItemIS(EnumItem.ingotAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCheese), new Object[] {
                        "III", "III", "III", 'I', EnumToItemStack.getItemIS(EnumFood.foodCheese) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockButter), new Object[] {
                        "III", "III", "III", 'I', EnumToItemStack.getItemIS(EnumItem.ingotButter) }));
        // Other
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(Item.paper, 5), new Object[] { "WWW", 'W',
                        EnumToItemStack.getItemIS(EnumItem.rawWood) }));
        // Tools
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeA), new Object[] { " T",
                        "S ", 'T', EnumToItemStack.getItemIS(EnumItem.sheetAluminum), 'S', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeI), new Object[] { " T",
                        "S ", 'T', EnumToItemStack.getItemIS(EnumItem.sheetIron), 'S', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeG), new Object[] { " T",
                        "S ", 'T', EnumToItemStack.getItemIS(EnumItem.sheetGold), 'S', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.toolKnifeB), new Object[] { " T",
                        "S ", 'T', EnumToItemStack.getItemIS(EnumItem.sheetBronze), 'S', "stickWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.toolCuttingBoard), new Object[] {
                        "WWW", "WWW", 'W', "plankWood" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.toolClippers), new Object[] {
                        " I ", "S I", " S ", 'S', "stickWood", 'I', Item.ingotIron }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModItems.toolGrate), new Object[] { "S S",
                        " S ", "S S", 'S', EnumToItemStack.getItemIS(EnumItem.sheetAluminum) }));

    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless() {
        // Mortar and Pestal
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(new ItemStack(ModItems.grindStones), new Object[] {
                        new ItemStack(Item.flint), new ItemStack(Item.bowlEmpty) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItem.dustFlour), new Object[] {
                        Item.wheat, RecipesCrafting.grindStones }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(new ItemStack(Item.sugar), new Object[] { Item.reed,
                        RecipesCrafting.grindStones }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(new ItemStack(Item.dyePowder, 4, 15), new Object[] {
                        Item.bone, RecipesCrafting.grindStones }));
        // Uncondensed Items
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(new ItemStack(Item.sugar, 4), new Object[] { EnumToItemStack
                        .getItemIS(EnumItem.ingotSugar) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItem.ingotSugar, 4),
                        new Object[] { new ItemStack(ModBlocks.blockSugar) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItem.ingotAluminum, 9),
                        new Object[] { new ItemStack(ModBlocks.blockAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumFood.foodCheese, 9),
                        new Object[] { new ItemStack(ModBlocks.blockCheese) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItem.ingotButter, 9),
                        new Object[] { new ItemStack(ModBlocks.blockButter) }));
        // Cooking Items
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItem.itemChocolateChips),
                        new Object[] { EnumToItemStack.getItemIS(EnumItemSixteen.globChocolate),
                                Item.sugar }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItem.globDough), new Object[] {
                        Item.bucketWater, "dustWheat", "dustWheat", "dustWheat" }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItem.globDoughCorn),
                        new Object[] { Item.bucketWater, "dustWheat", "dustWheat",
                                EnumToItemStack.getItemIS(EnumUncookedFood.uncookedSeedsCorn),
                                EnumToItemStack.getItemIS(EnumUncookedFood.uncookedSeedsCorn) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.bowlBatter),
                        new Object[] { EnumToItemStack.getItemIS(EnumItemSixteen.bowl), "dustWheat",
                                "dustWheat", "dustWheat", Item.sugar, Item.egg, Item.bucketMilk }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack
                        .getItemIS(EnumItemSixteen.bowlPumpkinFilling), new Object[] {
                        EnumToItemStack.getItemIS(EnumItem.rawPumpkinMash), Item.bucketMilk, Item.sugar,
                        EnumToItemStack.getItemIS(EnumItem.rawPumpkinMash),
                        EnumToItemStack.getItemIS(EnumItemSixteen.bowl) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumItemSixteen.bowlCookieDough),
                        new Object[] { Item.sugar, "dustWheat",
                                EnumToItemStack.getItemIS(EnumItem.dustFlour), Item.bucketMilk,
                                Item.egg, EnumToItemStack.getItemIS(EnumItemSixteen.bowl) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack
                        .getItemIS(EnumItemSixteen.bowlCookieDoughChocolateChip), new Object[] {
                        EnumToItemStack.getItemIS(EnumItemSixteen.bowlCookieDough),
                        EnumToItemStack.getItemIS(EnumItem.itemChocolateChips), Item.sugar }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack
                        .getItemIS(EnumItemSixteen.bowlCookieDoughSugar), new Object[] {
                        EnumToItemStack.getItemIS(EnumItemSixteen.bowlCookieDough), Item.sugar }));
    }
}