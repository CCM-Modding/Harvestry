package ccm.harvestry.utils.registry;

import java.util.Arrays;

import ccm.harvestry.Harvestry;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.blocks.EnumBlocks;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SBActiveMachine;
import ccm.nucleum_omnium.block.sub.SBWithTile;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.handler.LogHandler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.utils.lib.BlockFacings;

final class BlockRegistry {

	protected static void registerBlocks() {
		LogHandler.log(Harvestry.instance, "Making Sub Blocks");

		SubBlock.createAndSetUp(EnumOres.oreAluminum, Properties.oreID, Locations.TEXTURE)
				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
				.setHardness(5.0F);

		SubBlock.createAndSetUp(EnumOres.oreSalt, Properties.oreID, Locations.TEXTURE)
				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
				.setHardness(5.0F);

		SubBlock.createAndSetUp(EnumBlocks.blockAluminum, Properties.stgBlockID, Locations.TEXTURE)
				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
				.setHardness(3.0F);

		SubBlock.createAndSetUp(EnumBlocks.blockButter, Properties.stgBlockID, Locations.TEXTURE)
				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
				.setHardness(1.0F);

		SubBlock.createAndSetUp(EnumBlocks.blockCheese, Properties.stgBlockID, Locations.TEXTURE)
				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
				.setHardness(1.0F);

		SubBlock.createAndSetUp(EnumBlocks.blockSugar, Properties.stgBlockID, Locations.TEXTURE)
				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
				.setHardness(1.0F);

		SubBlock.createAndSetUp(EnumTEBlock.machineGrill, Properties.machineBlockID, Locations.TEXTURE)
				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
				.setHardness(3.0F);

		registerCustomBlocks();

		registerCustomRenderBlocks();
	}

	private static void registerCustomBlocks() {
		LogHandler.log("Making Sub Blocks, Stage 2");

		final TileHandler th = TileHandler.instance();

		SubBlock.setUp(	EnumTEBlock.machineGrinder,
						new SBActiveMachine(Properties.machineBlockID,
											EnumTEBlock.machineGrinder.ordinal(),
											TextureHelper.getTextureFromName(	EnumTEBlock.machineGrinder,
																				Locations.TEXTURE + "machine/"),
											Arrays.asList(	BlockFacings.Bottom,
															BlockFacings.Top,
															BlockFacings.Sides)).setTileEntity(th.getEnumTE(EnumTEBlock.machineGrinder))
																				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
																				.setUnlocalizedName(EnumTEBlock.machineGrinder)
																				.setHardness(3.0F));

		SubBlock.setUp(	EnumTEBlock.machineOven,
						new SBActiveMachine(Properties.machineBlockID,
											EnumTEBlock.machineOven.ordinal(),
											TextureHelper.getTextureFromName(	EnumTEBlock.machineOven,
																				Locations.TEXTURE + "machine/"),
											Arrays.asList(	BlockFacings.Bottom,
															BlockFacings.Top,
															BlockFacings.Sides,
															BlockFacings.Front)).setTileEntity(th.getEnumTE(EnumTEBlock.machineOven))
																				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
																				.setUnlocalizedName(EnumTEBlock.machineOven)
																				.setHardness(3.0F));
		SubBlock.setUp(	EnumTEBlock.machineRoller,
						new SBActiveMachine(Properties.machineBlockID,
											EnumTEBlock.machineRoller.ordinal(),
											TextureHelper.getTextureFromName(	EnumTEBlock.machineRoller,
																				Locations.TEXTURE + "machine/"),
											Arrays.asList(	BlockFacings.Bottom,
															BlockFacings.Top,
															BlockFacings.Sides,
															BlockFacings.Front)).setTileEntity(th.getEnumTE(EnumTEBlock.machineRoller))
																				.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
																				.setUnlocalizedName(EnumTEBlock.machineRoller)
																				.setHardness(3.0F));

		SubBlock.setUp(	EnumTEBlock.storageCounter,
						new SBWithTile(	Properties.machineBlockID,
										EnumTEBlock.storageCounter.ordinal(),
										TextureHelper.getTextureFromName(	EnumTEBlock.storageCounter,
																			Locations.TEXTURE + "storage/"),
										Arrays.asList(	BlockFacings.Bottom,
														BlockFacings.Top,
														BlockFacings.Sides,
														BlockFacings.Front)).setTileEntity(th.getEnumTE(EnumTEBlock.storageCounter))
																			.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
																			.setUnlocalizedName(EnumTEBlock.storageCounter)
																			.setHardness(3.0F));

		SubBlock.setUp(	EnumTEBlock.storageBarrel,
						new SBWithTile(	Properties.machineBlockID,
										EnumTEBlock.storageBarrel.ordinal(),
										TextureHelper.getTextureFromName(	EnumTEBlock.storageBarrel,
																			Locations.TEXTURE + "storage/"),
										Arrays.asList(	BlockFacings.Bottom,
														BlockFacings.Top,
														BlockFacings.Sides)).setTileEntity(th.getEnumTE(EnumTEBlock.storageBarrel))
																			.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
																			.setUnlocalizedName(EnumTEBlock.storageBarrel)
																			.setHardness(3.0F));

		SubBlock.setUp(	EnumTEBlock.storageCabinet,
						new SBWithTile(	Properties.machineBlockID,
										EnumTEBlock.storageCabinet.ordinal(),
										TextureHelper.getTextureFromName(	EnumTEBlock.storageCabinet,
																			Locations.TEXTURE + "storage/"),
										Arrays.asList(	BlockFacings.Bottom,
														BlockFacings.Top,
														BlockFacings.Sides,
														BlockFacings.Front)).setTileEntity(th.getEnumTE(EnumTEBlock.storageCabinet))
																			.setHardness(3.0F)
																			.setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
																			.setUnlocalizedName(EnumTEBlock.storageCabinet));
	}

	private static void registerCustomRenderBlocks() {
		LogHandler.log(Harvestry.instance, "Making Sub Blocks, Stage 3");
	}
}