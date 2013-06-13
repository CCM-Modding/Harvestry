package ccm.harvestry.configuration;

import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.configuration.AdvConfiguration;
import ccm.nucleum.handler.Handler;

final class ConfigItems extends Config {

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configItems(final AdvConfiguration config) {
        Handler.log(Harvestry.instance, "Loading Item Configs");
        Properties.mainItemID = config.getItem("All the Items that Stack up to 64",
                Properties.itemID).getInt();
        Properties.nsItemID = config
                .getItem("All the Items that Stack up to 16", Properties.itemID).getInt();
        Properties.flatShovelID = config.getItem("A flatshovel", Properties.itemID).getInt();
        Properties.flatShovelWoodID = config.getItem("A wood flatshovel", Properties.itemID)
                .getInt();
        Properties.flatShovelStoneID = config.getItem("A stone flatshovel", Properties.itemID)
                .getInt();
        Properties.flatShovelIronID = config.getItem("A iron flatshovel", Properties.itemID)
                .getInt();
        Properties.flatShovelDiamondID = config.getItem("A diamond flatshovel", Properties.itemID)
                .getInt();
        Properties.flatShovelGoldID = config.getItem("A gold flatshovel", Properties.itemID)
                .getInt();
        Properties.axeID = config.getItem("A axe", Properties.itemID).getInt();
        Properties.hoeID = config.getItem("A hoe", Properties.itemID).getInt();
        Properties.pickaxeID = config.getItem("A pickaxe", Properties.itemID).getInt();
        Properties.shovelID = config.getItem("A shovel", Properties.itemID).getInt();
        Properties.swordID = config.getItem("A sword", Properties.itemID).getInt();
    }
}
