package ccm.harvestry.core.proxy;

import ccm.harvestry.Harvestry;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.GUIHandler;

public class CommonProxy {
    
    public void registerGUIs() {
        
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.GRINDER_ID, GrinderContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.OVEN_ID, OvenContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.ROLLER_ID, RollerContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.COUNTER_ID, CounterContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.BARREL_ID, BarrelContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.CABINET_ID, CabinetContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.GRILL_ID, GrillContainer.class);
    }
}