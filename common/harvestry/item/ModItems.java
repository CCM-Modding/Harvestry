package harvestry.item;

import harvestry.configuration.Config;
import harvestry.core.handlers.Handler;
import harvestry.item.classes.BaseFood;
import harvestry.item.classes.BaseItem;
import harvestry.item.classes.BaseUseableItem;
import harvestry.item.classes.HaxItem;
import harvestry.item.enums.EnumUseAble;
import harvestry.item.tool.DummyAxe;
import harvestry.item.tool.DummyHoe;
import harvestry.item.tool.DummyPickaxe;
import harvestry.item.tool.DummySpade;
import harvestry.item.tool.DummySword;
import harvestry.item.tool.FlatShovel;
import harvestry.item.tool.ToolMaterials;
import harvestry.utils.lib.ItemNames;

import java.util.logging.Level;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

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
        Handler.log(Level.INFO, "Loading Items");
        mainItem = new BaseItem(Config.mainItemID, 0);
        nsItem = new BaseItem(Config.nsItemID, 1).setMaxStackSize(16);
        foodItem = new BaseFood(Config.foodItemID);
        uncookedFoodItem = new BaseItem(Config.uncookedFoodItemID, 2);
        gStone = new BaseUseableItem(Config.gStoneID, EnumUseAble.gStone.duration).setUnlocalizedName(EnumUseAble.gStone.name());
        gGrate = new BaseUseableItem(Config.gGrateID, EnumUseAble.gGrate.duration).setUnlocalizedName(EnumUseAble.gGrate.name());
        gIron = new BaseUseableItem(Config.gIronID, EnumUseAble.gIron.duration).setUnlocalizedName(EnumUseAble.gIron.name());
        gObsidian = new BaseUseableItem(Config.gObsidianID, EnumUseAble.gObsidian.duration).setUnlocalizedName(EnumUseAble.gObsidian.name());
        grindStones = new BaseUseableItem(Config.grindStonesID, EnumUseAble.grindStones.duration).setUnlocalizedName(EnumUseAble.grindStones.name());
        heWood = new BaseUseableItem(Config.heWoodID, EnumUseAble.heWood.duration).setUnlocalizedName(EnumUseAble.heWood.name());
        heAluminum = new BaseUseableItem(Config.heAluminumID, EnumUseAble.heAluminum.duration).setUnlocalizedName(EnumUseAble.heAluminum.name());
        heIron = new BaseUseableItem(Config.heIronID, EnumUseAble.heIron.duration).setUnlocalizedName(EnumUseAble.heIron.name());
        heGold = new BaseUseableItem(Config.heGoldID, EnumUseAble.heGold.duration).setUnlocalizedName(EnumUseAble.heGold.name());
        heCopper = new BaseUseableItem(Config.heCopperID, EnumUseAble.heCopper.duration).setUnlocalizedName(EnumUseAble.heCopper.name());
        itemHax = new HaxItem(Config.itemHaxID);
        toolFlatShovel = new FlatShovel(Config.flatShovelID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolFlatShovel);
        toolFlatShovelWood = new FlatShovel(Config.flatShovelWoodID, EnumToolMaterial.WOOD).setUnlocalizedName(ItemNames.toolFlatShovelWood);
        toolFlatShovelStone = new FlatShovel(Config.flatShovelStoneID, EnumToolMaterial.STONE).setUnlocalizedName(ItemNames.toolFlatShovelStone);
        toolFlatShovelIron = new FlatShovel(Config.flatShovelIronID, EnumToolMaterial.IRON).setUnlocalizedName(ItemNames.toolFlatShovelIron);
        toolFlatShovelDiamond = new FlatShovel(Config.flatShovelDiamondID, EnumToolMaterial.EMERALD).setUnlocalizedName(ItemNames.toolFlatShovelDiamond);
        toolFlatShovelGold = new FlatShovel(Config.flatShovelGoldID, EnumToolMaterial.GOLD).setUnlocalizedName(ItemNames.toolFlatShovelGold);
        toolAxe = new DummyAxe(Config.axeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolAxe);
        toolHoe = new DummyHoe(Config.hoeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolHoe);
        toolPickaxe = new DummyPickaxe(Config.pickaxeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolPickaxe);
        toolShovel = new DummySpade(Config.shovelID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolShovel);
        toolSword = new DummySword(Config.swordID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolSword);
        toolKnifeA = new BaseUseableItem(Config.toolKnifeAID, EnumUseAble.toolKnifeA.duration).setUnlocalizedName(EnumUseAble.toolKnifeA.name());
        toolKnifeI = new BaseUseableItem(Config.toolKnifeIID, EnumUseAble.toolKnifeI.duration).setUnlocalizedName(EnumUseAble.toolKnifeI.name());
        toolKnifeG = new BaseUseableItem(Config.toolKnifeGID, EnumUseAble.toolKnifeG.duration).setUnlocalizedName(EnumUseAble.toolKnifeG.name());
        toolCuttingBoard = new BaseUseableItem(Config.toolCuttingBoardID, EnumUseAble.toolCuttingBoard.duration).setUnlocalizedName(EnumUseAble.toolCuttingBoard.name());
        toolGrate = new BaseUseableItem(Config.toolGrateID, EnumUseAble.toolGrate.duration).setUnlocalizedName(EnumUseAble.toolGrate.name());
        toolClippers = new BaseUseableItem(Config.toolClippersID, EnumUseAble.toolClippers.duration).setUnlocalizedName(EnumUseAble.toolClippers.name());
        heTin = new BaseUseableItem(Config.heTinID, EnumUseAble.heTin.duration).setUnlocalizedName(EnumUseAble.heTin.name());
        heBronze = new BaseUseableItem(Config.heBronzeID, EnumUseAble.heBronze.duration).setUnlocalizedName(EnumUseAble.heBronze.name());
        toolKnifeB = new BaseUseableItem(Config.toolKnifeBID, EnumUseAble.toolKnifeB.duration).setUnlocalizedName(EnumUseAble.toolKnifeB.name());
        gBronze = new BaseUseableItem(Config.gBronzeID, EnumUseAble.gBronze.duration).setUnlocalizedName(EnumUseAble.gBronze.name());
    }
}
