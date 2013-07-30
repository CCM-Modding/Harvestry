package ccm.harvestry.core.proxy;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

import cpw.mods.fml.client.registry.ClientRegistry;

import ccm.harvestry.Harvestry;
import ccm.harvestry.client.inventory.gui.GUIBarrel;
import ccm.harvestry.client.inventory.gui.GUICabinet;
import ccm.harvestry.client.inventory.gui.GUICounter;
import ccm.harvestry.client.inventory.gui.GUIGrill;
import ccm.harvestry.client.inventory.gui.GUIGrinder;
import ccm.harvestry.client.inventory.gui.GUIOven;
import ccm.harvestry.client.inventory.gui.GUIRoller;
import ccm.harvestry.client.renderer.tileentity.TileEntityGrillRenderer;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.nucleum_omnium.handler.GUIHandler;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.helper.enums.EnumHelper;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerGUIs() {

        registerGUI(EnumTEBlock.machineGrinder, GUIGrinder.class, GrinderContainer.class);
        registerGUI(EnumTEBlock.machineOven, GUIOven.class, OvenContainer.class);
        registerGUI(EnumTEBlock.machineRoller, GUIRoller.class, RollerContainer.class);
        registerGUI(EnumTEBlock.storageCounter, GUICounter.class, CounterContainer.class);
        registerGUI(EnumTEBlock.storageBarrel, GUIBarrel.class, BarrelContainer.class);
        registerGUI(EnumTEBlock.storageCabinet, GUICabinet.class, CabinetContainer.class);
        registerGUI(EnumTEBlock.machineGrill, GUIGrill.class, GrillContainer.class);

        addGUITexture(EnumTEBlock.machineGrinder);
        addGUITexture(EnumTEBlock.machineOven);
        addGUITexture(EnumTEBlock.machineRoller);
        addGUITexture(EnumTEBlock.storageCounter);
        addGUITexture(EnumTEBlock.storageBarrel);
        addGUITexture(EnumTEBlock.storageCabinet);
        addGUITexture(EnumTEBlock.machineGrill);
    }

    private static void registerGUI(final Enum<?> enu,
                                    final Class<? extends GuiContainer> gui,
                                    final Class<? extends Container> container) {
        GUIHandler.registerGuiClient(EnumHelper.getTileID(enu), gui, container);
    }

    private void addGUITexture(final Enum<?> enu) {
        TextureHandler.addGUITexture(Harvestry.instance, enu.name());
    }

    @Override
    public void registerTEs() {
        super.registerTEs();

        TextureHandler.addTETexture(Harvestry.instance, EnumTEBlock.machineGrill.name());

        ClientRegistry.bindTileEntitySpecialRenderer(TileHandler.getEnumTE(EnumTEBlock.machineGrill)
                                                                .getClass(), new TileEntityGrillRenderer());
    }
}