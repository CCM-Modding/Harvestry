package ccm.harvestry.core.proxy;

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
        
        GUIHandler.registerGuiClient(TileConstants.GRINDER_ID, GUIGrinder.class, GrinderContainer.class);
        GUIHandler.registerGuiClient(TileConstants.OVEN_ID, GUIOven.class, OvenContainer.class);
        GUIHandler.registerGuiClient(TileConstants.ROLLER_ID, GUIRoller.class, RollerContainer.class);
        GUIHandler.registerGuiClient(TileConstants.COUNTER_ID, GUICounter.class, CounterContainer.class);
        GUIHandler.registerGuiClient(TileConstants.BARREL_ID, GUIBarrel.class, BarrelContainer.class);
        GUIHandler.registerGuiClient(TileConstants.CABINET_ID, GUICabinet.class, CabinetContainer.class);
        GUIHandler.registerGuiClient(TileConstants.GRILL_ID, GUIGrill.class, GrillContainer.class);
    }
}