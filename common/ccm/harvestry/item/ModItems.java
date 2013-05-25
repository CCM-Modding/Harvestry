package ccm.harvestry.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.items.ModToolEnum;
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
        gStone = new BaseUseableItem(Properties.gStoneID, ModToolEnum.gStone.duration).setUnlocalizedName(ModToolEnum.gStone.name());
        gGrate = new BaseUseableItem(Properties.gGrateID, ModToolEnum.gGrate.duration).setUnlocalizedName(ModToolEnum.gGrate.name());
        gIron = new BaseUseableItem(Properties.gIronID, ModToolEnum.gIron.duration).setUnlocalizedName(ModToolEnum.gIron.name());
        gObsidian = new BaseUseableItem(Properties.gObsidianID, ModToolEnum.gObsidian.duration).setUnlocalizedName(ModToolEnum.gObsidian.name());
        grindStones = new BaseUseableItem(Properties.grindStonesID, ModToolEnum.grindStones.duration).setUnlocalizedName(ModToolEnum.grindStones.name());
        heWood = new BaseUseableItem(Properties.heWoodID, ModToolEnum.heWood.duration).setUnlocalizedName(ModToolEnum.heWood.name());
        heAluminum = new BaseUseableItem(Properties.heAluminumID, ModToolEnum.heAluminum.duration).setUnlocalizedName(ModToolEnum.heAluminum.name());
        heIron = new BaseUseableItem(Properties.heIronID, ModToolEnum.heIron.duration).setUnlocalizedName(ModToolEnum.heIron.name());
        heGold = new BaseUseableItem(Properties.heGoldID, ModToolEnum.heGold.duration).setUnlocalizedName(ModToolEnum.heGold.name());
        heCopper = new BaseUseableItem(Properties.heCopperID, ModToolEnum.heCopper.duration).setUnlocalizedName(ModToolEnum.heCopper.name());
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
        toolKnifeA = new BaseUseableItem(Properties.toolKnifeAID, ModToolEnum.toolKnifeA.duration).setUnlocalizedName(ModToolEnum.toolKnifeA.name());
        toolKnifeI = new BaseUseableItem(Properties.toolKnifeIID, ModToolEnum.toolKnifeI.duration).setUnlocalizedName(ModToolEnum.toolKnifeI.name());
        toolKnifeG = new BaseUseableItem(Properties.toolKnifeGID, ModToolEnum.toolKnifeG.duration).setUnlocalizedName(ModToolEnum.toolKnifeG.name());
        toolCuttingBoard = new BaseUseableItem(Properties.toolCuttingBoardID, ModToolEnum.toolCuttingBoard.duration).setUnlocalizedName(ModToolEnum.toolCuttingBoard.name());
        toolGrate = new BaseUseableItem(Properties.toolGrateID, ModToolEnum.toolGrate.duration).setUnlocalizedName(ModToolEnum.toolGrate.name());
        toolClippers = new BaseUseableItem(Properties.toolClippersID, ModToolEnum.toolClippers.duration).setUnlocalizedName(ModToolEnum.toolClippers.name());
        heTin = new BaseUseableItem(Properties.heTinID, ModToolEnum.heTin.duration).setUnlocalizedName(ModToolEnum.heTin.name());
        heBronze = new BaseUseableItem(Properties.heBronzeID, ModToolEnum.heBronze.duration).setUnlocalizedName(ModToolEnum.heBronze.name());
        toolKnifeB = new BaseUseableItem(Properties.toolKnifeBID, ModToolEnum.toolKnifeB.duration).setUnlocalizedName(ModToolEnum.toolKnifeB.name());
        gBronze = new BaseUseableItem(Properties.gBronzeID, ModToolEnum.gBronze.duration).setUnlocalizedName(ModToolEnum.gBronze.name());
    }
}
