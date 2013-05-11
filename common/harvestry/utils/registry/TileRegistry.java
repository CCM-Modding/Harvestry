package harvestry.utils.registry;

import harvestry.tileentity.TileBarrel;
import harvestry.tileentity.TileCabinet;
import harvestry.tileentity.TileCounter;
import harvestry.tileentity.TileGrinder;
import harvestry.tileentity.TileOven;
import harvestry.tileentity.TileRoller;
import harvestry.utils.lib.TileConstants;

import java.util.logging.Level;

import net.minecraft.tileentity.TileEntity;
import nucleum_omnium.handler.Handler;
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