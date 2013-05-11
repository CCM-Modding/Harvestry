package harvestry.configuration;


import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import nucleum_omnium.handler.Handler;

final class ConfigItems
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
        Config.mainItemID = config.getItem("All the Items that Stack up to 64", Config.getItemNextID()).getInt();
        Config.nsItemID = config.getItem("All the Items that Stack up to 16", Config.getItemNextID()).getInt();
        Config.itemHaxID = config.getItem("A Creative only Item", Config.getItemNextID()).getInt();
        Config.flatShovelID = config.getItem("A flatshovel", Config.getItemNextID()).getInt();
        Config.flatShovelWoodID = config.getItem("A wood flatshovel", Config.getItemNextID()).getInt();
        Config.flatShovelStoneID = config.getItem("A stone flatshovel", Config.getItemNextID()).getInt();
        Config.flatShovelIronID = config.getItem("A iron flatshovel", Config.getItemNextID()).getInt();
        Config.flatShovelDiamondID = config.getItem("A diamond flatshovel", Config.getItemNextID()).getInt();
        Config.flatShovelGoldID = config.getItem("A gold flatshovel", Config.getItemNextID()).getInt();
        Config.axeID = config.getItem("A axe", Config.getItemNextID()).getInt();
        Config.hoeID = config.getItem("A hoe", Config.getItemNextID()).getInt();
        Config.pickaxeID = config.getItem("A pickaxe", Config.getItemNextID()).getInt();
        Config.shovelID = config.getItem("A shovel", Config.getItemNextID()).getInt();
        Config.swordID = config.getItem("A sword", Config.getItemNextID()).getInt();
    }
}
