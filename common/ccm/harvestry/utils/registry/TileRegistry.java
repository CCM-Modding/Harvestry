package ccm.harvestry.utils.registry;

import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.helper.enums.EnumHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.InventoryTE;

final class TileRegistry {
    
    /**
     * Registers all the {@link TileEntity}s.
     */
    protected static void registerTileEntities() {
        Handler.log(Harvestry.instance, "Registering Tile Entities");
        
        TileHandler th = TileHandler.instance();
        
        th.registerTileEntity(EnumHelper.getTileID(EnumTEBlock.machineGrinder), ActiveTE.class/* .setInventorySize(4).setLogic(GrinderLogic.class) */);
        th.registerTileEntity(EnumHelper.getTileID(EnumTEBlock.machineOven), ActiveTE.class/* .setInventorySize(4).setLogic(OvenLogic.class) */);
        th.registerTileEntity(EnumHelper.getTileID(EnumTEBlock.machineRoller), ActiveTE.class/* .setInventorySize(4).setLogic(RollerLogic.class) */);
        th.registerTileEntity(EnumHelper.getTileID(EnumTEBlock.storageCounter), InventoryTE.class/* .setInventorySize(21).setLogic(CounterLogic.class) */);
        th.registerTileEntity(EnumHelper.getTileID(EnumTEBlock.storageBarrel), InventoryTE.class/* .setInventorySize(40) */);
        th.registerTileEntity(EnumHelper.getTileID(EnumTEBlock.storageCabinet), InventoryTE.class/* .setInventorySize(24) */);
        th.registerTileEntity(EnumHelper.getTileID(EnumTEBlock.machineGrill), ActiveTE.class/* .setInventorySize(19).setLogic(GrillLogic.class) */);
    }
}