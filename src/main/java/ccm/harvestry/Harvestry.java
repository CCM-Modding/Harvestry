/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry;

import static ccm.harvestry.utils.lib.Archive.INVALID_FINGERPRINT_MSG;
import static ccm.harvestry.utils.lib.Archive.MOD_DEPENDANCIES;
import static ccm.harvestry.utils.lib.Archive.MOD_FIGERPRINT;
import static ccm.harvestry.utils.lib.Archive.MOD_ID;
import static ccm.harvestry.utils.lib.Archive.MOD_NAME;
import static ccm.harvestry.utils.lib.Archive.MOD_PREFIX;
import static ccm.harvestry.utils.lib.Locations.CLIENT_PROXY;
import static ccm.harvestry.utils.lib.Locations.SERVER_PROXY;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import ccm.harvestry.configuration.HarvestryConfig;
import ccm.harvestry.core.proxy.CommonProxy;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.registry.Registry;
import ccm.nucleum_omnium.BaseMod;
import ccm.nucleum_omnium.IMod;
import ccm.nucleum_omnium.utils.handler.LogHandler;
import ccm.nucleum_omnium.utils.handler.ModLoadingHandler;
import ccm.nucleum_omnium.utils.handler.config.ConfigurationHandler;

import lib.org.modstats.ModstatInfo;

@Mod(modid = MOD_ID,
     name = MOD_NAME,
     certificateFingerprint = MOD_FIGERPRINT,
     dependencies = MOD_DEPENDANCIES,
     useMetadata = true)
@NetworkMod(clientSideRequired = true,
            serverSideRequired = false)
@ModstatInfo(prefix = MOD_PREFIX)
public class Harvestry extends BaseMod implements IMod
{

    @Instance(MOD_ID)
    public static Harvestry   instance;

    @SidedProxy(serverSide = SERVER_PROXY,
                clientSide = CLIENT_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void invalidFingerprint(final FMLFingerprintViolationEvent event)
    {
        /*
         * Report (log) to the user that the version of Harvestry they are using has been
         * changed/tampered with
         */
        LogHandler.invalidFP(this, INVALID_FINGERPRINT_MSG);
    }

    @EventHandler
    public void preInit(final FMLPreInitializationEvent evt)
    {
        if (!ModLoadingHandler.isModLoaded(this))
        {

            LogHandler.initLog(this);

            config = initializeConfig(evt);

            ConfigurationHandler.init(this, HarvestryConfig.class);

            HarvestryTabs.initTabs();

            ModItems.init();

            proxy.registerTEs();

            Registry.register();

            HarvestryTabs.initTabIcons();
        }
    }

    @EventHandler
    public void init(final FMLInitializationEvent event)
    {
        proxy.registerGUIs();
    }

    @EventHandler
    public void PostInit(final FMLPostInitializationEvent event)
    {
        ModLoadingHandler.loadMod(this);
    }
}