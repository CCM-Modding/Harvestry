package ccm.harvestry.configuration;

import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.LogHandler;

final class ConfigItems extends HarvestryConfig {

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configItems(final AdvConfiguration config) {
        LogHandler.finest(Harvestry.instance, "Loading Item Configs");
        int id = Properties.itemID;
        Properties.mainItemID = config.getItem("All the Items that Stack up to 64", id++).getInt();
        Properties.nsItemID = config.getItem("All the Items that Stack up to 16", id++).getInt();
        Properties.flatShovelID = config.getItem("A flatshovel", id++).getInt();
        Properties.flatShovelWoodID = config.getItem("A wood flatshovel", id++).getInt();
        Properties.flatShovelStoneID = config.getItem("A stone flatshovel", id++).getInt();
        Properties.flatShovelIronID = config.getItem("A iron flatshovel", id++).getInt();
        Properties.flatShovelDiamondID = config.getItem("A diamond flatshovel", id++).getInt();
        Properties.flatShovelGoldID = config.getItem("A gold flatshovel", id++).getInt();
        Properties.axeID = config.getItem("A axe", id++).getInt();
        Properties.hoeID = config.getItem("A hoe", id++).getInt();
        Properties.pickaxeID = config.getItem("A pickaxe", id++).getInt();
        Properties.shovelID = config.getItem("A shovel", id++).getInt();
        Properties.swordID = config.getItem("A sword", id++).getInt();
    }
}
