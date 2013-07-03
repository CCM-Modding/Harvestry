package ccm.harvestry.configuration;

import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.BlockNames;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.LogHandler;

final class ConfigBlocks extends Config {

	/**
	 * Loads or creates the Blocks in the AdvConfiguration file.
	 * 
	 * @param config
	 *            The AdvConfiguration file that is being edited.
	 */
	protected static void configBlocks(final AdvConfiguration config) {
		LogHandler.log(Harvestry.instance, "Loading Block Configs");
		int id = Properties.blockID;

		Properties.oreID = config.getBlock("Ores", id++).getInt();

		Properties.stgBlockID = config.getBlock("StorageBlocks", id++).getInt();

		Properties.machineBlockID = config.getBlock("Machines", id++).getInt();

		Properties.cropOnionID = config.getBlock(BlockNames.cropOnion, id++).getInt();
		Properties.cropLettuceID = config.getBlock(BlockNames.cropLettuce, id++).getInt();
		Properties.cropCornID = config.getBlock(BlockNames.cropCorn, id++).getInt();
	}
}