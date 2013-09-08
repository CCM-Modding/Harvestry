/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.core.proxy;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.inventory.Container;
import net.minecraftforge.client.IItemRenderer;
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
import ccm.nucleum.omnium.utils.handler.ResourceHandler;
import ccm.nucleum.omnium.utils.handler.gui.GuiHandler;
import ccm.nucleum.omnium.utils.helper.enums.EnumHelper;
import ccm.nucleum.omnium.utils.helper.enums.IBlockEnum;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerGUIs()
    {

        register(EnumMachines.machineGrinder, GUIGrinder.class, GrinderContainer.class);
        register(EnumMachines.machineOven, GUIOven.class, OvenContainer.class);
        register(EnumMachines.machineRoller, GUIRoller.class, RollerContainer.class);
        register(EnumMachines.storageCounter, GUICounter.class, CounterContainer.class);
        register(EnumMachines.storageBarrel, GUIBarrel.class, BarrelContainer.class);
        register(EnumMachines.storageCabinet, GUICabinet.class, CabinetContainer.class);
        register(EnumModeled.machineGrill, GUIGrill.class, GrillContainer.class);
    }

    private static void register(final Enum<?> enu, final Class<? extends GuiContainer> gui, final Class<? extends Container> container)
    {
        GuiHandler.registerGuiClient(EnumHelper.getTileID(enu), gui, container);
        ResourceHandler.addGUI(Harvestry.instance, enu.name());
    }

    @Override
    public void registerTEs()
    {
        super.registerTEs();

        register(EnumModeled.machineGrill, Properties.modeledBlockID, new GrillTileRenderer(), new GrillItemRenderer());
    }

    private static void register(final Enum<? extends IBlockEnum> enu, int itemID, TileEntitySpecialRenderer specialRenderer, IItemRenderer renderer)
    {
        MinecraftForgeClient.registerItemRenderer(itemID, renderer);

        ClientRegistry.bindTileEntitySpecialRenderer(EnumHelper.getTile(enu).getClass(), specialRenderer);
    }
}