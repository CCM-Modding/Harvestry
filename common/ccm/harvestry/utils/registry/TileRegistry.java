package ccm.harvestry.utils.registry;

import java.util.logging.Level;

import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.tileentity.TileBarrel;
import ccm.harvestry.tileentity.TileCabinet;
import ccm.harvestry.tileentity.TileCounter;
import ccm.harvestry.tileentity.TileGrinder;
import ccm.harvestry.tileentity.TileOven;
import ccm.harvestry.tileentity.TileRoller;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.Handler;
import cpw.mods.fml.common.registry.GameRegistry;

final class TileRegistry
{

    /**
     * Registers all the {@link TileEntity}s.
     */
    protected static void registerTileEntities()
    {
        Handler.log(Level.INFO, "Registering Tile Entities");
        GameRegistry.registerTileEntity(TileGrinder.class, "te." + TileConstants.GRINDER_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileOven.class, "te." + TileConstants.OVEN_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileRoller.class, "te." + TileConstants.ROLLER_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileCounter.class, "te." + TileConstants.COUNTER_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileBarrel.class, "te." + TileConstants.BARREL_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileCabinet.class, "te." + TileConstants.CABINET_UNLOCALIZED);
    }
}