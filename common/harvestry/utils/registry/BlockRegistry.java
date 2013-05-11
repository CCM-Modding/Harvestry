package harvestry.utils.registry;

import harvestry.block.ModBlocks;
import harvestry.utils.lib.BlockNames;

import java.util.logging.Level;

import nucleum_omnium.handler.Handler;

import cpw.mods.fml.common.registry.GameRegistry;

final class BlockRegistry
{

    /**
     * Registers all the Blocks.
     */
    protected static void registerBlocks()
    {
        Handler.log(Level.INFO, "Registering Blocks");
        GameRegistry.registerBlock(ModBlocks.oreAluminum, BlockNames.oreAluminum);
        GameRegistry.registerBlock(ModBlocks.oreSalt, BlockNames.oreSalt);
        GameRegistry.registerBlock(ModBlocks.blockGrinder, BlockNames.blockGrinder);
        GameRegistry.registerBlock(ModBlocks.blockOven, BlockNames.blockOven);
        GameRegistry.registerBlock(ModBlocks.blockSugar, BlockNames.blockSugar);
        GameRegistry.registerBlock(ModBlocks.blockAluminum, BlockNames.blockAluminum);
        GameRegistry.registerBlock(ModBlocks.blockRoller, BlockNames.blockRoller);
        GameRegistry.registerBlock(ModBlocks.blockCounter, BlockNames.blockCounter);
        GameRegistry.registerBlock(ModBlocks.blockCheese, BlockNames.blockCheese);
        GameRegistry.registerBlock(ModBlocks.blockButter, BlockNames.blockButter);
        GameRegistry.registerBlock(ModBlocks.blockBarrel, BlockNames.blockBarrel);
        GameRegistry.registerBlock(ModBlocks.blockCabinet, BlockNames.blockCabinet);
    }
}