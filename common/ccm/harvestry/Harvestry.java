/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry;

import static ccm.harvestry.utils.lib.Archive.MOD_ID;
import static ccm.harvestry.utils.lib.Archive.MOD_NAME;
import static ccm.harvestry.utils.lib.Archive.MOD_PREFIX;
import static ccm.harvestry.utils.lib.Locations.CLIENT_PROXY;
import static ccm.harvestry.utils.lib.Locations.SERVER_PROXY;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import ccm.harvestry.configuration.HarvestryConfig;
import ccm.harvestry.core.proxy.CommonProxy;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.registry.Registry;
import ccm.nucleum.omnium.CCMMod;
import ccm.nucleum.omnium.IMod;
import ccm.nucleum.omnium.utils.handler.ModLoadingHandler;
import ccm.nucleum.omnium.utils.handler.config.ConfigurationHandler;

import lib.org.modstats.ModstatInfo;

@Mod(modid = MOD_ID, name = MOD_NAME, useMetadata = true)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@ModstatInfo(prefix = MOD_PREFIX)
public class Harvestry extends CCMMod implements IMod
{

    @Instance(MOD_ID)
    public static Harvestry instance;

    @SidedProxy(serverSide = SERVER_PROXY, clientSide = CLIENT_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(final FMLPreInitializationEvent evt)
    {
        ModLoadingHandler.loadMod(this);

        initializeConfig(evt);
        ConfigurationHandler.init(this, HarvestryConfig.class);

        HarvestryTabs.initTabs();

        ModItems.init();

        proxy.registerTEs();

        Registry.register();

        HarvestryTabs.initTabIcons();
    }

    @EventHandler
    public void init(final FMLInitializationEvent event)
    {
        proxy.registerGUIs();
    }
}