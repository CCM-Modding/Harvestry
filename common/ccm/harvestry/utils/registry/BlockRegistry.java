package ccm.harvestry.utils.registry;

import ccm.harvestry.Harvestry;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.utils.lib.BlockNames;
import ccm.nucleum_omnium.handler.Handler;
import cpw.mods.fml.common.registry.GameRegistry;

final class BlockRegistry {
    
    /**
     * Registers all the Blocks.
     */
    protected static void registerBlocks() {
        Handler.log(Harvestry.instance, "Registering Blocks");
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
        GameRegistry.registerBlock(ModBlocks.blockGrill, BlockNames.blockGrill);
    }
}