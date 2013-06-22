package ccm.harvestry.utils.registry;

import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.Harvestry;
import ccm.harvestry.tileentity.CounterLogic;
import ccm.harvestry.tileentity.GrinderLogic;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.InventoryTE;

final class TileRegistry {
    
    /**
     * Registers all the {@link TileEntity}s.
     */
    protected static void registerTileEntities() {
        Handler.log(Harvestry.instance, "Registering Tile Entities");
        
        TileHandler th = TileHandler.instance();
        
        th.registerTileEntity(TileConstants.GRINDER_ID, new ActiveTE(4, TileConstants.GRINDER_UNLOCALIZED).setLogic(GrinderLogic.class));
        // th.registerTileEntity(TileConstants.OVEN_ID, new ActiveTE(4, TileConstants.OVEN_UNLOCALIZED).setLogic(OvenLogic.class));
        // th.registerTileEntity(TileConstants.ROLLER_ID, new ActiveTE(4, TileConstants.ROLLER_UNLOCALIZED).setLogic(RollerLogic.class));
        th.registerTileEntity(TileConstants.COUNTER_ID, new InventoryTE(21, TileConstants.COUNTER_UNLOCALIZED).setLogic(CounterLogic.class));
        th.registerTileEntity(TileConstants.BARREL_ID, new InventoryTE(40, TileConstants.BARREL_UNLOCALIZED));
        th.registerTileEntity(TileConstants.CABINET_ID, new InventoryTE(24, TileConstants.CABINET_UNLOCALIZED));
        // th.registerTileEntity(TileConstants.GRILL_ID, new ActiveTE(19, TileConstants.GRILL_UNLOCALIZED).setLogic(GrillLogic.class));
    }
}