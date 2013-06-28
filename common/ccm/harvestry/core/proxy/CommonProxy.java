package ccm.harvestry.core.proxy;

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

public class CommonProxy {

	public void registerGUIs() {

		GUIHandler.registerGuiServer(EnumHelper.getTileID(EnumTEBlock.machineGrinder), GrinderContainer.class);
		GUIHandler.registerGuiServer(EnumHelper.getTileID(EnumTEBlock.machineOven), OvenContainer.class);
		GUIHandler.registerGuiServer(EnumHelper.getTileID(EnumTEBlock.machineRoller), RollerContainer.class);
		GUIHandler.registerGuiServer(EnumHelper.getTileID(EnumTEBlock.storageCounter), CounterContainer.class);
		GUIHandler.registerGuiServer(EnumHelper.getTileID(EnumTEBlock.storageBarrel), BarrelContainer.class);
		GUIHandler.registerGuiServer(EnumHelper.getTileID(EnumTEBlock.storageCabinet), CabinetContainer.class);
		GUIHandler.registerGuiServer(EnumHelper.getTileID(EnumTEBlock.machineGrill), GrillContainer.class);
	}
}