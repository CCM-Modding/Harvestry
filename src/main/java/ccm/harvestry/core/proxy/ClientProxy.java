/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.core.proxy;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraftforge.client.MinecraftForgeClient;

import cpw.mods.fml.client.registry.ClientRegistry;

import ccm.harvestry.Harvestry;
import ccm.harvestry.block.enums.EnumMachines;
import ccm.harvestry.block.enums.EnumModeled;
import ccm.harvestry.client.inventory.gui.GUIBarrel;
import ccm.harvestry.client.inventory.gui.GUICabinet;
import ccm.harvestry.client.inventory.gui.GUICounter;
import ccm.harvestry.client.inventory.gui.GUIGrill;
import ccm.harvestry.client.inventory.gui.GUIGrinder;
import ccm.harvestry.client.inventory.gui.GUIOven;
import ccm.harvestry.client.inventory.gui.GUIRoller;
import ccm.harvestry.client.renderer.item.GrillItemRenderer;
import ccm.harvestry.client.renderer.tileentity.GrillTileRenderer;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.handler.TileHandler;
import ccm.nucleum_omnium.utils.handler.gui.GuiHandler;
import ccm.nucleum_omnium.utils.helper.enums.EnumHelper;

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
    }

    private static void registerGUI(final Enum<?> enu, final Class<? extends GuiContainer> gui, final Class<? extends Container> container)
    {
        GuiHandler.registerGuiClient(EnumHelper.getTileID(enu), gui, container);
        TextureHandler.addGUITexture(Harvestry.instance, enu.name());
    }

    @Override
    public void registerTEs()
    {
        super.registerTEs();

        TextureHandler.addModelTexture(Harvestry.instance, EnumModeled.machineGrill.name());

        MinecraftForgeClient.registerItemRenderer(Properties.modeledBlockID, new GrillItemRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileHandler.getEnumTE(EnumModeled.machineGrill).getClass(), new GrillTileRenderer());
    }
}