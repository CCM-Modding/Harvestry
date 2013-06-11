package ccm.harvestry.utils.registry;

import net.minecraft.tileentity.TileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

import ccm.nucleum_omnium.handler.Handler;

import ccm.harvestry.Harvestry;
import ccm.harvestry.tileentity.TileBarrel;
import ccm.harvestry.tileentity.TileCabinet;
import ccm.harvestry.tileentity.TileCounter;
import ccm.harvestry.tileentity.TileGrill;
import ccm.harvestry.tileentity.TileGrinder;
import ccm.harvestry.tileentity.TileOven;
import ccm.harvestry.tileentity.TileRoller;
import ccm.harvestry.utils.lib.TileConstants;

final class TileRegistry
{

    /**
     * Registers all the {@link TileEntity}s.
     */
    protected static void registerTileEntities()
    {
        Handler.log(Harvestry.instance, "Registering Tile Entities");
        GameRegistry.registerTileEntity(TileGrinder.class, TileConstants.GRINDER_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileOven.class, TileConstants.OVEN_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileRoller.class, TileConstants.ROLLER_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileCounter.class, TileConstants.COUNTER_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileBarrel.class, TileConstants.BARREL_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileCabinet.class, TileConstants.CABINET_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileGrill.class, TileConstants.GRILL_UNLOCALIZED);
    }
}