package ccm.harvestry.core.proxy;

import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.tileentity.logic.CounterLogic;
import ccm.harvestry.tileentity.logic.GrillLogic;
import ccm.harvestry.tileentity.logic.GrinderLogic;
import ccm.harvestry.tileentity.logic.OvenLogic;
import ccm.harvestry.tileentity.logic.RollerLogic;
import ccm.nucleum_omnium.handler.GUIHandler;
import ccm.nucleum_omnium.handler.LogHandler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.helper.enums.EnumHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.tileentity.LogicTE;

public class CommonProxy {

    /**
     * Registers all the GUIs
     */
    public void registerGUIs() {
        LogHandler.finest(Harvestry.instance, "Registering GUIs");

        registerGUI(EnumTEBlock.machineGrinder, GrinderContainer.class);
        registerGUI(EnumTEBlock.machineOven, OvenContainer.class);
        registerGUI(EnumTEBlock.machineRoller, RollerContainer.class);
        registerGUI(EnumTEBlock.storageCounter, CounterContainer.class);
        registerGUI(EnumTEBlock.storageBarrel, BarrelContainer.class);
        registerGUI(EnumTEBlock.storageCabinet, CabinetContainer.class);
        registerGUI(EnumTEBlock.machineGrill, GrillContainer.class);
    }

    private static void registerGUI(final Enum<?> enu, final Class<? extends Container> container) {
        GUIHandler.registerGuiServer(EnumHelper.getTileID(enu), container);
    }

    /**
     * Registers all the {@link TileEntity}s
     */
    public void registerTEs() {
        LogHandler.finest(Harvestry.instance, "Registering Tile Entities");

        registerTE(EnumTEBlock.machineGrinder, new ActiveTE().setLogic(GrinderLogic.class)
                                                             .setInventorySize(4));
        registerTE(EnumTEBlock.machineOven, new ActiveTE().setLogic(OvenLogic.class).setInventorySize(4));
        registerTE(EnumTEBlock.machineRoller, new ActiveTE().setLogic(RollerLogic.class).setInventorySize(4));
        registerTE(EnumTEBlock.storageCounter, new LogicTE().setLogic(CounterLogic.class)
                                                            .setInventorySize(21));
        registerTE(EnumTEBlock.storageBarrel, new InventoryTE().setInventorySize(40));
        registerTE(EnumTEBlock.storageCabinet, new InventoryTE().setInventorySize(24));
        registerTE(EnumTEBlock.machineGrill, new ActiveTE().setLogic(GrillLogic.class).setInventorySize(19));
    }

    private static void registerTE(final Enum<?> enu, final TileEntity te) {
        TileHandler.registerTileEntity(EnumHelper.getTileID(enu), te);
    }
}