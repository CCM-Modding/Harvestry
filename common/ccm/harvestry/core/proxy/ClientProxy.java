package ccm.harvestry.core.proxy;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
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
import ccm.harvestry.tileentity.TileBase;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum.handler.GUIHandler;
import cpw.mods.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerGUIs() {

        GUIHandler.registerGuiClient(Harvestry.instance, TileConstants.GRINDER_GUID,
                GUIGrinder.class, GrinderContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance, TileConstants.OVEN_GUID, GUIOven.class,
                OvenContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance, TileConstants.ROLLER_GUID,
                GUIRoller.class, RollerContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance, TileConstants.COUNTER_GUID,
                GUICounter.class, CounterContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance, TileConstants.BARREL_GUID,
                GUIBarrel.class, BarrelContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance, TileConstants.CABINET_GUID,
                GUICabinet.class, CabinetContainer.class);
        GUIHandler.registerGuiClient(Harvestry.instance, TileConstants.GRILL_GUID, GUIGrill.class,
                GrillContainer.class);
    }

    @Override
    public void handleTileEntityPacket(final int x, final int y, final int z,
            final ForgeDirection orientation, final short state, final String owner,
            final String customName) {
        final TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld
                .getBlockTileEntity(x, y, z);
        if (tileEntity != null)
            if (tileEntity instanceof TileBase) {
                ((TileBase) tileEntity).setOrientation(orientation);
                ((TileBase) tileEntity).setState(state);
                ((TileBase) tileEntity).setOwner(owner);
                ((TileBase) tileEntity).setCustomName(customName);
            }
    }
}