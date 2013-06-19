package ccm.harvestry;

import java.util.logging.Level;

import lib.org.modstats.ModstatInfo;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.configuration.Config;
import ccm.harvestry.core.proxy.CommonProxy;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.language.HarvestryLanguagePack;
import ccm.harvestry.utils.lib.Archive;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.registry.Registry;
import ccm.nucleum_network.PacketHandler;
import ccm.nucleum_omnium.BaseMod;
import ccm.nucleum_omnium.IMod;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;
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
     certificateFingerprint = Archive.MOD_FIGERPRINT,
     useMetadata = true)
@NetworkMod(clientSideRequired = true,
            serverSideRequired = false,
            channels = Archive.MOD_CHANNEL,
            packetHandler = PacketHandler.class)
@ModstatInfo(prefix = Archive.MOD_PREFIX)
public class Harvestry extends BaseMod implements IMod {
    
    /**
     * The Harvestry Instance
     */
    @Instance(Archive.MOD_ID)
    public static Harvestry        instance;
    
    /**
     * The Harvestry proxy
     */
    @SidedProxy(serverSide = Locations.SERVER_PROXY,
                clientSide = Locations.CLIENT_PROXY)
    public static CommonProxy      proxy;
    
    public static AdvConfiguration config;
    
    @FingerprintWarning
    public void invalidFingerprint(final FMLFingerprintViolationEvent event) {
        /*
         * Report (log) to the user that the version of Harvestry they are using has been changed/tampered with
         */
        Handler.log(this, Level.SEVERE, Archive.INVALID_FINGERPRINT_MSG);
    }
    
    @PreInit
    public void preInit(final FMLPreInitializationEvent evt) {
        if (!Handler.isModLoaded(this)) {
            
            Handler.initLog(this);
            
            config = initializeConfig(evt);
            
            Config.init(config);
            
            HarvestryTabs.initTabs();
            
            ModItems.init();
            
            ModBlocks.init();
            
            HarvestryTabs.initTabIcons();
        }
    }
    
    @Init
    public void init(final FMLInitializationEvent event) {
        
        Harvestry.proxy.registerGUIs();
        
        Registry.register();
        
        new HarvestryLanguagePack().loadLangs();
    }
    
    @PostInit
    public void PostInit(final FMLPostInitializationEvent event) {
        Handler.loadMod(this);
    }
    
    @Override
    public AdvConfiguration getConfigFile() {
        return config;
    }
}