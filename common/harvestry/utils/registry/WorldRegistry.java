package harvestry.utils.registry;

import harvestry.configuration.Config;
import harvestry.core.handlers.Handler;
import harvestry.core.handlers.WorldGenHandler;

import java.util.logging.Level;

import cpw.mods.fml.common.registry.GameRegistry;

final class WorldRegistry
{

    /**
     * Registers all the World Generation.
     */
    protected static void registerWorld()
    {
        if (Config.enableWorldGenAluminum){
            registerAluminum();
        }
        if (Config.enableWorldGenSalt){
            registerSlat();
        }
    }

    private static void registerAluminum()
    {
        Handler.log(Level.INFO, "Registering World Generation for Aluminum");
        final WorldGenHandler worldGenAlu = new WorldGenHandler(Config.oreAluminumID, Config.aluMaxHeight, Config.aluMinHeight, Config.aluSize, Config.aluDensity);
        GameRegistry.registerWorldGenerator(worldGenAlu);
    }

    private static void registerSlat()
    {
        Handler.log(Level.INFO, "Registering World Generation for Salt");
        final WorldGenHandler worldGenSalt = new WorldGenHandler(Config.oreSaltID, Config.saltMaxHeight, Config.saltMinHeight, Config.saltSize, Config.saltDensity);
        GameRegistry.registerWorldGenerator(worldGenSalt);
    }
}