package ccm.harvestry.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.items.EnumModTool;
import ccm.harvestry.item.classes.BaseFood;
import ccm.harvestry.item.classes.BaseItem;
import ccm.harvestry.item.classes.BaseUseableItem;
import ccm.harvestry.item.classes.HaxItem;
import ccm.harvestry.item.tool.DummyAxe;
import ccm.harvestry.item.tool.DummyHoe;
import ccm.harvestry.item.tool.DummyPickaxe;
import ccm.harvestry.item.tool.DummySpade;
import ccm.harvestry.item.tool.DummySword;
import ccm.harvestry.item.tool.FlatShovel;
import ccm.harvestry.item.tool.ToolMaterials;
import ccm.harvestry.utils.lib.ItemNames;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

public final class ModItems
{

    public static Item mainItem;

    public static Item foodItem;

    public static Item uncookedFoodItem;

    public static Item nsItem;

    public static Item gStone;

    public static Item gGrate;

    public static Item gIron;

    public static Item gObsidian;

    public static Item grindStones;

    public static Item heWood;

    public static Item heAluminum;

    public static Item heIron;

    public static Item heGold;

    public static Item heCopper;

    public static Item itemHax;

    public static Item toolFlatShovel;

    public static Item toolFlatShovelWood;

    public static Item toolFlatShovelStone;

    public static Item toolFlatShovelIron;

    public static Item toolFlatShovelDiamond;

    public static Item toolFlatShovelGold;

    public static Item toolAxe;

    public static Item toolHoe;

    public static Item toolPickaxe;

    public static Item toolShovel;

    public static Item toolSword;

    public static Item toolKnifeA;

    public static Item toolKnifeI;

    public static Item toolKnifeG;

    public static Item toolCuttingBoard;

    public static Item toolGrate;

    public static Item toolClippers;

    public static Item heBronze;

    public static Item heTin;

    public static Item toolKnifeB;

    public static Item gBronze;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init()
    {
        Handler.log(Harvestry.instance, "Loading Items");
        mainItem = new BaseItem(Properties.mainItemID, 0);
        nsItem = new BaseItem(Properties.nsItemID, 1).setMaxStackSize(16);
        foodItem = new BaseFood(Properties.foodItemID);
        uncookedFoodItem = new BaseItem(Properties.uncookedFoodItemID, 2);
        gStone = new BaseUseableItem(Properties.gStoneID, EnumModTool.gStone.duration).setUnlocalizedName(EnumModTool.gStone.name());
        gGrate = new BaseUseableItem(Properties.gGrateID, EnumModTool.gGrate.duration).setUnlocalizedName(EnumModTool.gGrate.name());
        gIron = new BaseUseableItem(Properties.gIronID, EnumModTool.gIron.duration).setUnlocalizedName(EnumModTool.gIron.name());
        gObsidian = new BaseUseableItem(Properties.gObsidianID, EnumModTool.gObsidian.duration).setUnlocalizedName(EnumModTool.gObsidian.name());
        grindStones = new BaseUseableItem(Properties.grindStonesID, EnumModTool.grindStones.duration).setUnlocalizedName(EnumModTool.grindStones.name());
        heWood = new BaseUseableItem(Properties.heWoodID, EnumModTool.heWood.duration).setUnlocalizedName(EnumModTool.heWood.name());
        heAluminum = new BaseUseableItem(Properties.heAluminumID, EnumModTool.heAluminum.duration).setUnlocalizedName(EnumModTool.heAluminum.name());
        heIron = new BaseUseableItem(Properties.heIronID, EnumModTool.heIron.duration).setUnlocalizedName(EnumModTool.heIron.name());
        heGold = new BaseUseableItem(Properties.heGoldID, EnumModTool.heGold.duration).setUnlocalizedName(EnumModTool.heGold.name());
        heCopper = new BaseUseableItem(Properties.heCopperID, EnumModTool.heCopper.duration).setUnlocalizedName(EnumModTool.heCopper.name());
        itemHax = new HaxItem(Properties.itemHaxID);
        toolFlatShovel = new FlatShovel(Properties.flatShovelID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolFlatShovel);
        toolFlatShovelWood = new FlatShovel(Properties.flatShovelWoodID, EnumToolMaterial.WOOD).setUnlocalizedName(ItemNames.toolFlatShovelWood);
        toolFlatShovelStone = new FlatShovel(Properties.flatShovelStoneID, EnumToolMaterial.STONE).setUnlocalizedName(ItemNames.toolFlatShovelStone);
        toolFlatShovelIron = new FlatShovel(Properties.flatShovelIronID, EnumToolMaterial.IRON).setUnlocalizedName(ItemNames.toolFlatShovelIron);
        toolFlatShovelDiamond = new FlatShovel(Properties.flatShovelDiamondID, EnumToolMaterial.EMERALD).setUnlocalizedName(ItemNames.toolFlatShovelDiamond);
        toolFlatShovelGold = new FlatShovel(Properties.flatShovelGoldID, EnumToolMaterial.GOLD).setUnlocalizedName(ItemNames.toolFlatShovelGold);
        toolAxe = new DummyAxe(Properties.axeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolAxe);
        toolHoe = new DummyHoe(Properties.hoeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolHoe);
        toolPickaxe = new DummyPickaxe(Properties.pickaxeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolPickaxe);
        toolShovel = new DummySpade(Properties.shovelID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolShovel);
        toolSword = new DummySword(Properties.swordID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolSword);
        toolKnifeA = new BaseUseableItem(Properties.toolKnifeAID, EnumModTool.toolKnifeA.duration).setUnlocalizedName(EnumModTool.toolKnifeA.name());
        toolKnifeI = new BaseUseableItem(Properties.toolKnifeIID, EnumModTool.toolKnifeI.duration).setUnlocalizedName(EnumModTool.toolKnifeI.name());
        toolKnifeG = new BaseUseableItem(Properties.toolKnifeGID, EnumModTool.toolKnifeG.duration).setUnlocalizedName(EnumModTool.toolKnifeG.name());
        toolCuttingBoard = new BaseUseableItem(Properties.toolCuttingBoardID, EnumModTool.toolCuttingBoard.duration).setUnlocalizedName(EnumModTool.toolCuttingBoard.name());
        toolGrate = new BaseUseableItem(Properties.toolGrateID, EnumModTool.toolGrate.duration).setUnlocalizedName(EnumModTool.toolGrate.name());
        toolClippers = new BaseUseableItem(Properties.toolClippersID, EnumModTool.toolClippers.duration).setUnlocalizedName(EnumModTool.toolClippers.name());
        heTin = new BaseUseableItem(Properties.heTinID, EnumModTool.heTin.duration).setUnlocalizedName(EnumModTool.heTin.name());
        heBronze = new BaseUseableItem(Properties.heBronzeID, EnumModTool.heBronze.duration).setUnlocalizedName(EnumModTool.heBronze.name());
        toolKnifeB = new BaseUseableItem(Properties.toolKnifeBID, EnumModTool.toolKnifeB.duration).setUnlocalizedName(EnumModTool.toolKnifeB.name());
        gBronze = new BaseUseableItem(Properties.gBronzeID, EnumModTool.gBronze.duration).setUnlocalizedName(EnumModTool.gBronze.name());
    }
}
