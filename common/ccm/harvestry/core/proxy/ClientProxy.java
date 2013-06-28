package ccm.harvestry.core.proxy;

import ccm.harvestry.client.inventory.gui.GUIBarrel;
import ccm.harvestry.client.inventory.gui.GUICabinet;
import ccm.harvestry.client.inventory.gui.GUICounter;
import ccm.harvestry.client.inventory.gui.GUIGrill;
import ccm.harvestry.client.inventory.gui.GUIGrinder;
import ccm.harvestry.client.inventory.gui.GUIOven;
import ccm.harvestry.client.inventory.gui.GUIRoller;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.nucleum_omnium.handler.GUIHandler;
import ccm.nucleum_omnium.helper.enums.EnumHelper;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerGUIs() {

		GUIHandler.registerGuiClient(	EnumHelper.getTileID(EnumTEBlock.machineGrinder),
										GUIGrinder.class,
										GrinderContainer.class);
		GUIHandler.registerGuiClient(	EnumHelper.getTileID(EnumTEBlock.machineOven),
										GUIOven.class,
										OvenContainer.class);
		GUIHandler.registerGuiClient(	EnumHelper.getTileID(EnumTEBlock.machineRoller),
										GUIRoller.class,
										RollerContainer.class);
		GUIHandler.registerGuiClient(	EnumHelper.getTileID(EnumTEBlock.storageCounter),
										GUICounter.class,
										CounterContainer.class);
		GUIHandler.registerGuiClient(	EnumHelper.getTileID(EnumTEBlock.storageBarrel),
										GUIBarrel.class,
										BarrelContainer.class);
		GUIHandler.registerGuiClient(	EnumHelper.getTileID(EnumTEBlock.storageCabinet),
										GUICabinet.class,
										CabinetContainer.class);
		GUIHandler.registerGuiClient(	EnumHelper.getTileID(EnumTEBlock.machineGrill),
										GUIGrill.class,
										GrillContainer.class);
	}
}