package harvestry;

import harvestry.block.ModBlocks;
import harvestry.configuration.Config;
import harvestry.core.proxy.CommonProxy;
import harvestry.creativetab.HarvestryTabs;
import harvestry.item.ModItems;
import harvestry.network.PacketHandler;
import harvestry.utils.lib.Archive;
import harvestry.utils.lib.Locations;
import harvestry.utils.registry.Registry;

import java.util.logging.Level;

import nucleum_omnium.handler.Handler;
import nucleum_omnium.handler.LanguageHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.FingerprintWarning;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Archive.MOD_ID,
     name = Archive.MOD_NAME,
     version = Archive.MOD_VERSION,
     useMetadata = true,
     dependencies = Archive.MOD_DEPENDANCIES,
     certificateFingerprint = Archive.MOD_FIGERPRINT)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = Archive.MOD_CHANNEL, packetHandler = PacketHandler.class)
public class Harvestry
{

    /**
     * The Harvestry Instance
     */
    @Instance(Archive.MOD_ID)
    public static Harvestry   instance;

    /**
     * The Harvestry proxy
     */
    @SidedProxy(serverSide = Locations.SERVER_PROXY, clientSide = Locations.CLIENT_PROXY)
    public static CommonProxy proxy;
    
    Handler harvest = new Handler();

    @FingerprintWarning
    public void invalidFingerprint(final FMLFingerprintViolationEvent event)
    {
        /*
         * Report (log) to the user that the version of Harvestry they are using
         * has been changed/tampered with
         */
        Handler.log(Level.SEVERE, Archive.INVALID_FINGERPRINT_MSG);
    }

    @PreInit
    public void preInit(final FMLPreInitializationEvent evt)
    {
        if (!harvest.isModLoaded()){
            harvest.initLog(Archive.MOD_ID);
            Config.init(evt);
            HarvestryTabs.initTabs();
            ModItems.init();
            ModBlocks.init();
            HarvestryTabs.initTabIcons();
            harvest.LoadMod();
        }
    }

    @Init
    public void init(final FMLInitializationEvent event)
    {
        Registry.register();
        LanguageHandler.loadLanguages();
    }

    @PostInit
    public void PostInit(final FMLPostInitializationEvent event)
    {}
}