package ccm.harvestry.utils.registry;

import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.Harvestry;
import ccm.harvestry.tileentity.TileCounter;
import ccm.harvestry.tileentity.TileGrill;
import ccm.harvestry.tileentity.TileGrinder;
import ccm.harvestry.tileentity.TileOven;
import ccm.harvestry.tileentity.TileRoller;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.tileentity.InventoryTE;

final class TileRegistry {
    
    /**
     * Registers all the {@link TileEntity}s.
     */
    protected static void registerTileEntities() {
        Handler.log(Harvestry.instance, "Registering Tile Entities");
        
        TileHandler th = TileHandler.instance();
        
        th.registerTileEntity(Harvestry.instance, TileConstants.GRINDER_ID, new TileGrinder());
        th.registerTileEntity(Harvestry.instance, TileConstants.OVEN_ID, new TileOven());
        th.registerTileEntity(Harvestry.instance, TileConstants.ROLLER_ID, new TileRoller());
        th.registerTileEntity(Harvestry.instance, TileConstants.COUNTER_ID, new TileCounter());
        th.registerTileEntity(Harvestry.instance, TileConstants.BARREL_ID, new InventoryTE(40, TileConstants.BARREL_UNLOCALIZED));
        th.registerTileEntity(Harvestry.instance, TileConstants.CABINET_ID, new InventoryTE(24, TileConstants.CABINET_UNLOCALIZED));
        th.registerTileEntity(Harvestry.instance, TileConstants.GRILL_ID, new TileGrill());
    }
}