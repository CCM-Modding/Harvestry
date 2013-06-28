package ccm.harvestry.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.items.EnumModTool;
import ccm.harvestry.item.classes.BaseFood;
import ccm.harvestry.item.classes.BaseItem;
import ccm.harvestry.item.classes.BaseUseableItem;
import ccm.harvestry.item.tool.DummyAxe;
import ccm.harvestry.item.tool.DummyHoe;
import ccm.harvestry.item.tool.DummyPickaxe;
import ccm.harvestry.item.tool.DummySpade;
import ccm.harvestry.item.tool.DummySword;
import ccm.harvestry.item.tool.FlatShovel;
import ccm.harvestry.item.tool.ToolMaterials;
import ccm.harvestry.utils.lib.ItemNames;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.LoggerHandler;

public final class ModItems {

	public static Item	mainItem;

	public static Item	foodItem;

	public static Item	uncookedFoodItem;

	public static Item	nsItem;

	public static Item	gStone;

	public static Item	gGrate;

	public static Item	gIron;

	public static Item	gObsidian;

	public static Item	grindStones;

	public static Item	heWood;

	public static Item	heAluminum;

	public static Item	heIron;

	public static Item	heGold;

	public static Item	heCopper;

	public static Item	toolFlatShovel;

	public static Item	toolFlatShovelWood;

	public static Item	toolFlatShovelStone;

	public static Item	toolFlatShovelIron;

	public static Item	toolFlatShovelDiamond;

	public static Item	toolFlatShovelGold;

	public static Item	toolAxe;

	public static Item	toolHoe;

	public static Item	toolPickaxe;

	public static Item	toolShovel;

	public static Item	toolSword;

	public static Item	toolKnifeA;

	public static Item	toolKnifeI;

	public static Item	toolKnifeG;

	public static Item	toolCuttingBoard;

	public static Item	toolGrate;

	public static Item	toolClippers;

	public static Item	heBronze;

	public static Item	heTin;

	public static Item	toolKnifeB;

	public static Item	gBronze;

	/**
	 * Creates all the Item Objects in the Mod.
	 */
	public static void init() {
		LoggerHandler.log(Harvestry.instance, "Loading Items");
		ModItems.mainItem = new BaseItem(Properties.mainItemID, 0);
		ModItems.nsItem = new BaseItem(Properties.nsItemID, 1).setMaxStackSize(16);
		ModItems.foodItem = new BaseFood(Properties.foodItemID);
		ModItems.uncookedFoodItem = new BaseItem(Properties.uncookedFoodItemID, 2);
		ModItems.gStone = new BaseUseableItem(Properties.gStoneID, EnumModTool.gStone.duration).setUnlocalizedName(EnumModTool.gStone.name());
		ModItems.gGrate = new BaseUseableItem(Properties.gGrateID, EnumModTool.gGrate.duration).setUnlocalizedName(EnumModTool.gGrate.name());
		ModItems.gIron = new BaseUseableItem(Properties.gIronID, EnumModTool.gIron.duration).setUnlocalizedName(EnumModTool.gIron.name());
		ModItems.gObsidian = new BaseUseableItem(Properties.gObsidianID, EnumModTool.gObsidian.duration).setUnlocalizedName(EnumModTool.gObsidian.name());
		ModItems.grindStones = new BaseUseableItem(Properties.grindStonesID, EnumModTool.grindStones.duration).setUnlocalizedName(EnumModTool.grindStones.name());
		ModItems.heWood = new BaseUseableItem(Properties.heWoodID, EnumModTool.heWood.duration).setUnlocalizedName(EnumModTool.heWood.name());
		ModItems.heAluminum = new BaseUseableItem(Properties.heAluminumID, EnumModTool.heAluminum.duration).setUnlocalizedName(EnumModTool.heAluminum.name());
		ModItems.heIron = new BaseUseableItem(Properties.heIronID, EnumModTool.heIron.duration).setUnlocalizedName(EnumModTool.heIron.name());
		ModItems.heGold = new BaseUseableItem(Properties.heGoldID, EnumModTool.heGold.duration).setUnlocalizedName(EnumModTool.heGold.name());
		ModItems.heCopper = new BaseUseableItem(Properties.heCopperID, EnumModTool.heCopper.duration).setUnlocalizedName(EnumModTool.heCopper.name());
		ModItems.toolFlatShovel = new FlatShovel(Properties.flatShovelID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolFlatShovel);
		ModItems.toolFlatShovelWood = new FlatShovel(Properties.flatShovelWoodID, EnumToolMaterial.WOOD).setUnlocalizedName(ItemNames.toolFlatShovelWood);
		ModItems.toolFlatShovelStone = new FlatShovel(Properties.flatShovelStoneID, EnumToolMaterial.STONE).setUnlocalizedName(ItemNames.toolFlatShovelStone);
		ModItems.toolFlatShovelIron = new FlatShovel(Properties.flatShovelIronID, EnumToolMaterial.IRON).setUnlocalizedName(ItemNames.toolFlatShovelIron);
		ModItems.toolFlatShovelDiamond = new FlatShovel(Properties.flatShovelDiamondID,
														EnumToolMaterial.EMERALD).setUnlocalizedName(ItemNames.toolFlatShovelDiamond);
		ModItems.toolFlatShovelGold = new FlatShovel(Properties.flatShovelGoldID, EnumToolMaterial.GOLD).setUnlocalizedName(ItemNames.toolFlatShovelGold);
		ModItems.toolAxe = new DummyAxe(Properties.axeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolAxe);
		ModItems.toolHoe = new DummyHoe(Properties.hoeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolHoe);
		ModItems.toolPickaxe = new DummyPickaxe(Properties.pickaxeID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolPickaxe);
		ModItems.toolShovel = new DummySpade(Properties.shovelID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolShovel);
		ModItems.toolSword = new DummySword(Properties.swordID, ToolMaterials.ALUMINUM).setUnlocalizedName(ItemNames.toolSword);
		ModItems.toolKnifeA = new BaseUseableItem(Properties.toolKnifeAID, EnumModTool.toolKnifeA.duration).setUnlocalizedName(EnumModTool.toolKnifeA.name());
		ModItems.toolKnifeI = new BaseUseableItem(Properties.toolKnifeIID, EnumModTool.toolKnifeI.duration).setUnlocalizedName(EnumModTool.toolKnifeI.name());
		ModItems.toolKnifeG = new BaseUseableItem(Properties.toolKnifeGID, EnumModTool.toolKnifeG.duration).setUnlocalizedName(EnumModTool.toolKnifeG.name());
		ModItems.toolCuttingBoard = new BaseUseableItem(Properties.toolCuttingBoardID,
														EnumModTool.toolCuttingBoard.duration).setUnlocalizedName(EnumModTool.toolCuttingBoard.name());
		ModItems.toolGrate = new BaseUseableItem(Properties.toolGrateID, EnumModTool.toolGrate.duration).setUnlocalizedName(EnumModTool.toolGrate.name());
		ModItems.toolClippers = new BaseUseableItem(Properties.toolClippersID,
													EnumModTool.toolClippers.duration).setUnlocalizedName(EnumModTool.toolClippers.name());
		ModItems.heTin = new BaseUseableItem(Properties.heTinID, EnumModTool.heTin.duration).setUnlocalizedName(EnumModTool.heTin.name());
		ModItems.heBronze = new BaseUseableItem(Properties.heBronzeID, EnumModTool.heBronze.duration).setUnlocalizedName(EnumModTool.heBronze.name());
		ModItems.toolKnifeB = new BaseUseableItem(Properties.toolKnifeBID, EnumModTool.toolKnifeB.duration).setUnlocalizedName(EnumModTool.toolKnifeB.name());
		ModItems.gBronze = new BaseUseableItem(Properties.gBronzeID, EnumModTool.gBronze.duration).setUnlocalizedName(EnumModTool.gBronze.name());
	}
}
