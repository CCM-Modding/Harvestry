package ccm.harvestry.configuration;

import java.util.logging.Level;

import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.Archive;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.LogHandler;

public class Config {

	/**
	 * Initializes the AdvConfiguration file.
	 * 
	 * @param event
	 *            The FMLPreInitializationEvent that is used to get the
	 *            ModAdvConfigurationDirectory.
	 */
	public static void init(final AdvConfiguration config) {
		try {
			LogHandler.log(Harvestry.instance, "Loading AdvConfiguration");
			// Loads a pre-existing AdvConfiguration file.
			config.load();
			ConfigItems.configItems(config);
			ConfigFood.configFood(config);
			ConfigUsable.configUsable(config);
			ConfigWorldGen.configWorldGen(config);
			ConfigBlocks.configBlocks(config);
		} catch (final Exception e) {
			LogHandler.log(	Harvestry.instance,
							Level.SEVERE,
							Archive.MOD_NAME + " has had a problem loading its AdvConfiguration/n");
			e.printStackTrace();
		} finally {
			config.save();
		}
	}
}