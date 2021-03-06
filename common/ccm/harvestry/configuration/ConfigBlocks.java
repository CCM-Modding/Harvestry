/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.configuration;

import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.omnium.configuration.ConfigurationWrapper;
import ccm.nucleum.omnium.utils.helper.CCMLogger;

final class ConfigBlocks extends HarvestryConfig
{

    /**
     * Loads or creates the Blocks in the AdvConfiguration file.
     * 
     * @param config
     *            The AdvConfiguration file that is being edited.
     */
    protected static void configBlocks(final ConfigurationWrapper config)
    {
        CCMLogger.finest(Harvestry.instance, "Loading Block Configs");
        int id = Properties.blockID;

        Properties.oreID = config.getBlock("Ores", id++).getInt();

        Properties.stgBlockID = config.getBlock("StorageBlocks", id++).getInt();

        Properties.machineBlockID = config.getBlock("Machines", id++).getInt();

        Properties.modeledBlockID = config.getBlock("ModeledMachines", id++).getInt();
    }
}