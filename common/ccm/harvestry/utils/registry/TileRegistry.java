package ccm.harvestry.utils.registry;

import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.harvestry.tileentity.logic.CounterLogic;
import ccm.harvestry.tileentity.logic.GrillLogic;
import ccm.harvestry.tileentity.logic.GrinderLogic;
import ccm.harvestry.tileentity.logic.OvenLogic;
import ccm.harvestry.tileentity.logic.RollerLogic;
import ccm.nucleum_omnium.handler.LogHandler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.helper.enums.EnumHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.InventoryTE;

final class TileRegistry {

	/**
	 * Registers all the {@link TileEntity}s.
	 */
	protected static void registerTileEntities() {
		LogHandler.log(Harvestry.instance, "Registering Tile Entities");

		register(	EnumHelper.getTileID(EnumTEBlock.machineGrinder),
					new ActiveTE().setInventorySize(4).setLogic(GrinderLogic.class));

		register(	EnumHelper.getTileID(EnumTEBlock.machineOven),
					new ActiveTE().setInventorySize(4).setLogic(OvenLogic.class));

		register(EnumHelper.getTileID(EnumTEBlock.machineRoller), new ActiveTE().setInventorySize(4)
																				.setLogic(RollerLogic.class));

		register(	EnumHelper.getTileID(EnumTEBlock.storageCounter),
					new InventoryTE().setInventorySize(21).setLogic(CounterLogic.class));

		register(EnumHelper.getTileID(EnumTEBlock.storageBarrel), new InventoryTE().setInventorySize(40));

		register(EnumHelper.getTileID(EnumTEBlock.storageCabinet), new InventoryTE().setInventorySize(24));

		register(EnumHelper.getTileID(EnumTEBlock.machineGrill), new ActiveTE().setInventorySize(19)
																				.setLogic(GrillLogic.class));
	}

	private static void register(final String tileID, final TileEntity te) {
		TileHandler.registerTileEntity(tileID, te);
	}
}