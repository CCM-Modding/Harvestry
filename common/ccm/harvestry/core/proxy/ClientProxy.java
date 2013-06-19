package ccm.harvestry.core.proxy;

import ccm.harvestry.Harvestry;
import ccm.harvestry.client.inventory.gui.GUIBarrel;
import ccm.harvestry.client.inventory.gui.GUICabinet;
import ccm.harvestry.client.inventory.gui.GUICounter;
import ccm.harvestry.client.inventory.gui.GUIGrill;
import ccm.harvestry.client.inventory.gui.GUIGrinder;
import ccm.harvestry.client.inventory.gui.GUIOven;
import ccm.harvestry.client.inventory.gui.GUIRoller;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.GUIHandler;

public class ClientProxy extends CommonProxy {
    
    @Override
    public void registerGUIs() {
        
        GUIHandler.registerGuiClient(Harvestry.instance,
                                     TileConstants.GRINDER_GUID,
                                     GUIGrinder.class,
                                     GrinderContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance,
                                     TileConstants.OVEN_GUID,
                                     GUIOven.class,
                                     OvenContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance,
                                     TileConstants.ROLLER_GUID,
                                     GUIRoller.class,
                                     RollerContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance,
                                     TileConstants.COUNTER_GUID,
                                     GUICounter.class,
                                     CounterContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance,
                                     TileConstants.BARREL_GUID,
                                     GUIBarrel.class,
                                     BarrelContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance,
                                     TileConstants.CABINET_GUID,
                                     GUICabinet.class,
                                     CabinetContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance,
                                     TileConstants.GRILL_GUID,
                                     GUIGrill.class,
                                     GrillContainer.class);
    }
}