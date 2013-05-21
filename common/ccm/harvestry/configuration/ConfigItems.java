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
        Properties.mainItemID = property.getNextUsableItemID(config, "All the Items that Stack up to 64").getInt();
        Properties.nsItemID = property.getNextUsableItemID(config, "All the Items that Stack up to 16").getInt();
        Properties.itemHaxID = property.getNextUsableItemID(config, "A Creative only Item").getInt();
        Properties.flatShovelID = property.getNextUsableItemID(config, "A flatshovel").getInt();
        Properties.flatShovelWoodID = property.getNextUsableItemID(config, "A wood flatshovel").getInt();
        Properties.flatShovelStoneID = property.getNextUsableItemID(config, "A stone flatshovel").getInt();
        Properties.flatShovelIronID = property.getNextUsableItemID(config, "A iron flatshovel").getInt();
        Properties.flatShovelDiamondID = property.getNextUsableItemID(config, "A diamond flatshovel").getInt();
        Properties.flatShovelGoldID = property.getNextUsableItemID(config, "A gold flatshovel").getInt();
        Properties.axeID = property.getNextUsableItemID(config, "A axe").getInt();
        Properties.hoeID = property.getNextUsableItemID(config, "A hoe").getInt();
        Properties.pickaxeID = property.getNextUsableItemID(config, "A pickaxe").getInt();
        Properties.shovelID = property.getNextUsableItemID(config, "A shovel").getInt();
        Properties.swordID = property.getNextUsableItemID(config, "A sword").getInt();
    }
}
