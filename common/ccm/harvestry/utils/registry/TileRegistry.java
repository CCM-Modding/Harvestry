package ccm.harvestry.utils.registry;

import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.nucleum_omnium.handler.LoggerHandler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.helper.enums.EnumHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.InventoryTE;

final class TileRegistry {

	/**
	 * Registers all the {@link TileEntity}s.
	 */
	protected static void registerTileEntities() {
		LoggerHandler.log(Harvestry.instance, "Registering Tile Entities");

		register(EnumHelper.getTileID(EnumTEBlock.machineGrinder), ActiveTE.class/*
																				 * .setInventorySize(
																				 * 4).setLogic(
																				 * GrinderLogic
																				 * .class)
																				 */);

		register(EnumHelper.getTileID(EnumTEBlock.machineOven), ActiveTE.class/*
																			 * .setInventorySize(4).
																			 * setLogic
																			 * (OvenLogic.class)
																			 */);

		register(EnumHelper.getTileID(EnumTEBlock.machineRoller), ActiveTE.class/*
																				 * .setInventorySize(
																				 * 4).setLogic(
																				 * RollerLogic
																				 * .class)
																				 */);

		register(EnumHelper.getTileID(EnumTEBlock.storageCounter), InventoryTE.class/*
																					 * .setInventorySize
																					 * (
																					 * 21).setLogic(
																					 * CounterLogic
																					 * .class)
																					 */);

		register(EnumHelper.getTileID(EnumTEBlock.storageBarrel), InventoryTE.class/*
																					 * .setInventorySize
																					 * (40)
																					 */);

		register(EnumHelper.getTileID(EnumTEBlock.storageCabinet), InventoryTE.class/*
																					 * .setInventorySize
																					 * (24)
																					 */);

		register(EnumHelper.getTileID(EnumTEBlock.machineGrill), ActiveTE.class/*
																				 * .setInventorySize(
																				 * 19
																				 * ).setLogic(GrillLogic
																				 * .class)
																				 */);
	}

	private static void register(final String tileID, final Class<? extends TileEntity> te) {
		TileHandler.instance().registerTileEntity(tileID, te);
	}
}