/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.core.proxy;

import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.Harvestry;
import ccm.harvestry.block.enums.EnumMachines;
import ccm.harvestry.block.enums.EnumModeled;
import ccm.harvestry.block.enums.EnumPlants;
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
import ccm.nucleum.omnium.tileentity.ActiveTE;
import ccm.nucleum.omnium.tileentity.InventoryTE;
import ccm.nucleum.omnium.tileentity.LogicTE;
import ccm.nucleum.omnium.tileentity.PlantTE;
import ccm.nucleum.omnium.utils.handler.LogHandler;
import ccm.nucleum.omnium.utils.handler.TileHandler;
import ccm.nucleum.omnium.utils.handler.gui.GuiHandler;
import ccm.nucleum.omnium.utils.helper.enums.EnumHelper;

public class CommonProxy
{

    /**
     * Registers all the GUIs
     */
    public void registerGUIs()
    {
        LogHandler.finest(Harvestry.instance, "Registering GUIs");

        registerGUI(EnumMachines.machineGrinder, GrinderContainer.class);
        registerGUI(EnumMachines.machineOven, OvenContainer.class);
        registerGUI(EnumMachines.machineRoller, RollerContainer.class);
        registerGUI(EnumMachines.storageCounter, CounterContainer.class);
        registerGUI(EnumMachines.storageBarrel, BarrelContainer.class);
        registerGUI(EnumMachines.storageCabinet, CabinetContainer.class);
        registerGUI(EnumModeled.machineGrill, GrillContainer.class);
    }

    private static void registerGUI(final Enum<?> enu, final Class<? extends Container> container)
    {
        GuiHandler.registerGuiServer(EnumHelper.getTileID(enu), container);
    }

    /**
     * Registers all the {@link TileEntity}s
     */
    public void registerTEs()
    {
        LogHandler.finest(Harvestry.instance, "Registering Tile Entities");
        // Machines
        registerTE(EnumMachines.machineGrinder, new ActiveTE().setLogic(GrinderLogic.class).setInventorySize(4));
        registerTE(EnumMachines.machineOven, new ActiveTE().setLogic(OvenLogic.class).setInventorySize(4));
        registerTE(EnumMachines.machineRoller, new ActiveTE().setLogic(RollerLogic.class).setInventorySize(4));
        // Storage
        registerTE(EnumMachines.storageCounter, new LogicTE().setLogic(CounterLogic.class).setInventorySize(21));
        registerTE(EnumMachines.storageBarrel, new InventoryTE().setInventorySize(40));
        registerTE(EnumMachines.storageCabinet, new InventoryTE().setInventorySize(24));
        // Modeled Machines
        registerTE(EnumModeled.machineGrill, new ActiveTE().setLogic(GrillLogic.class).setInventorySize(19));
        // Plants
        registerTE(EnumPlants.cropCorn, new PlantTE().setTotalStages(2).setGrowthRate(1));
        registerTE(EnumPlants.cropLettuce, new PlantTE().setTotalStages(2).setGrowthRate(1));
        registerTE(EnumPlants.cropOnion, new PlantTE().setTotalStages(2).setGrowthRate(1));
    }

    private static void registerTE(final Enum<?> enu, final TileEntity te)
    {
        TileHandler.registerTile(EnumHelper.getTileID(enu), te);
    }
}