/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.core.proxy;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.registry.ClientRegistry;

import ccm.harvestry.Harvestry;
import ccm.harvestry.client.inventory.gui.GUIBarrel;
import ccm.harvestry.client.inventory.gui.GUICabinet;
import ccm.harvestry.client.inventory.gui.GUICounter;
import ccm.harvestry.client.inventory.gui.GUIGrill;
import ccm.harvestry.client.inventory.gui.GUIGrinder;
import ccm.harvestry.client.inventory.gui.GUIOven;
import ccm.harvestry.client.inventory.gui.GUIRoller;
import ccm.harvestry.client.renderer.item.GrillItemRenderer;
import ccm.harvestry.client.renderer.tileentity.GrillTileRenderer;
import ccm.harvestry.enums.blocks.EnumMachines;
import ccm.harvestry.enums.blocks.EnumModeled;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.GUIHandler;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.helper.enums.EnumHelper;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerGUIs()
    {

        registerGUI(EnumMachines.machineGrinder, GUIGrinder.class, GrinderContainer.class);
        registerGUI(EnumMachines.machineOven, GUIOven.class, OvenContainer.class);
        registerGUI(EnumMachines.machineRoller, GUIRoller.class, RollerContainer.class);
        registerGUI(EnumMachines.storageCounter, GUICounter.class, CounterContainer.class);
        registerGUI(EnumMachines.storageBarrel, GUIBarrel.class, BarrelContainer.class);
        registerGUI(EnumMachines.storageCabinet, GUICabinet.class, CabinetContainer.class);
        registerGUI(EnumModeled.machineGrill, GUIGrill.class, GrillContainer.class);

        addGUITexture(EnumMachines.machineGrinder);
        addGUITexture(EnumMachines.machineOven);
        addGUITexture(EnumMachines.machineRoller);
        addGUITexture(EnumMachines.storageCounter);
        addGUITexture(EnumMachines.storageBarrel);
        addGUITexture(EnumMachines.storageCabinet);
        addGUITexture(EnumModeled.machineGrill);
    }

    private static void registerGUI(final Enum<?> enu,
                                    final Class<? extends GuiContainer> gui,
                                    final Class<? extends Container> container)
    {
        GUIHandler.registerGuiClient(EnumHelper.getTileID(enu), gui, container);
    }

    private void addGUITexture(final Enum<?> enu)
    {
        TextureHandler.addGUITexture(Harvestry.instance, enu.name());
    }

    @Override
    public void registerTEs()
    {
        super.registerTEs();

        TextureHandler.addModelTexture(Harvestry.instance, EnumModeled.machineGrill.name());

        MinecraftForgeClient.registerItemRenderer(Properties.modeledBlockID, new GrillItemRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileHandler.getEnumTE(EnumModeled.machineGrill)
                                                                .getClass(), new GrillTileRenderer());
    }
}