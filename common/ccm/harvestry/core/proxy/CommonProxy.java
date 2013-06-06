package ccm.harvestry.core.proxy;

import net.minecraftforge.common.ForgeDirection;

import ccm.nucleum_omnium.handler.GUIHandler;

import ccm.harvestry.Harvestry;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.utils.lib.TileConstants;

public class CommonProxy
{

    public void registerGUIs()
    {

        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.GRINDER_GUID, GrinderContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.OVEN_GUID, OvenContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.ROLLER_GUID, RollerContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.COUNTER_GUID, CounterContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.BARREL_GUID, BarrelContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.CABINET_GUID, CabinetContainer.class);
        GUIHandler.registerGuiServer(Harvestry.instance, TileConstants.GRILL_GUID, GrillContainer.class);
    }

    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String player, final String customName)
    {}
}