package ccm.harvestry.utils.registry;

import java.util.logging.Level;

import net.minecraft.item.ItemStack;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.OresEnum;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.worldgen.WorldGenHandler;
import ccm.nucleum_omnium.worldgen.WorldGenMineable;

final class WorldRegistry
{

    /**
     * Registers all the World Generation.
     */
    protected static void registerWorld()
    {
        if (Properties.enableWorldGenAluminum){
            registerAluminum();
        }
        if (Properties.enableWorldGenSalt){
            registerSlat();
        }
    }

    private static void registerAluminum()
    {
        Handler.log(Level.INFO, "Registering World Generation for Aluminum");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, OresEnum.oreAluminum.ordinal()), Properties.aluSize),
                                            Properties.aluMinHeight,
                                            Properties.aluMaxHeight,
                                            Properties.aluDensity,
                                            WorldGenHandler.GenType.ORE_1.ordinal());
    }

    private static void registerSlat()
    {
        Handler.log(Level.INFO, "Registering World Generation for Salt");
        WorldGenHandler.addSurfaceGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, OresEnum.oreSalt.ordinal()), Properties.saltSize),
                                            Properties.saltMinHeight,
                                            Properties.saltMaxHeight,
                                            Properties.saltDensity,
                                            WorldGenHandler.GenType.ORE_1.ordinal());
    }
}