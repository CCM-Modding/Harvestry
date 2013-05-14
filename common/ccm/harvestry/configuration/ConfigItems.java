package ccm.harvestry.configuration;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigItems extends Config
{

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configItems(final Configuration config)
    {
        Handler.log(Level.INFO, "Loading Item Configs");
        Properties.mainItemID = property.getNextItem(config, "All the Items that Stack up to 64").getInt();
        Properties.nsItemID = property.getNextItem(config, "All the Items that Stack up to 16").getInt();
        Properties.itemHaxID = property.getNextItem(config, "A Creative only Item").getInt();
        Properties.flatShovelID = property.getNextItem(config, "A flatshovel").getInt();
        Properties.flatShovelWoodID = property.getNextItem(config, "A wood flatshovel").getInt();
        Properties.flatShovelStoneID = property.getNextItem(config, "A stone flatshovel").getInt();
        Properties.flatShovelIronID = property.getNextItem(config, "A iron flatshovel").getInt();
        Properties.flatShovelDiamondID = property.getNextItem(config, "A diamond flatshovel").getInt();
        Properties.flatShovelGoldID = property.getNextItem(config, "A gold flatshovel").getInt();
        Properties.axeID = property.getNextItem(config, "A axe").getInt();
        Properties.hoeID = property.getNextItem(config, "A hoe").getInt();
        Properties.pickaxeID = property.getNextItem(config, "A pickaxe").getInt();
        Properties.shovelID = property.getNextItem(config, "A shovel").getInt();
        Properties.swordID = property.getNextItem(config, "A sword").getInt();
    }
}
