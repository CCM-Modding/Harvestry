package harvestry.configuration;

import harvestry.core.handlers.Handler;
import harvestry.utils.lib.BlockNames;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

final class ConfigWorldGen
{

    final static String gen  = "World Generation";

    final static String alu  = " of Aluminum";

    final static String salt = " of Salt";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final Configuration config)
    {
        genAluminum(config);
        genSalt(config);
    }

    /**
     * Loads or creates the Aluminum World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genAluminum(final Configuration config)
    {
        Handler.log(Level.INFO, "Loading Aluminum Configs");
        Config.enableWorldGenAluminum = config.get(gen + alu, "Enable Generation of Aluminum", true).getBoolean(true);
        Config.oreAluminumID = config.getBlock(BlockNames.oreAluminum, Config.getBlockNextID()).getInt();
        Config.aluMaxHeight = config.get(gen + alu, "Maximum Height", 50).getInt();
        Config.aluMinHeight = config.get(gen + alu, "Minimum Height", 25).getInt();
        Config.aluMinHeight = config.get(gen + alu, "Minimum Height", 25).getInt();
        Config.aluSize = config.get(gen + alu, "Max size of the Vein", 4).getInt();
        Config.aluDensity = config.get(gen + alu, "Max veins per chunk", 10).getInt();
    }

    /**
     * Loads or creates the Slat World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genSalt(final Configuration config)
    {
        Handler.log(Level.INFO, "Loading Salt Configs");
        Config.enableWorldGenSalt = config.get(gen + salt, "Enable Generation of Salt", true).getBoolean(true);
        Config.oreSaltID = config.getBlock(BlockNames.oreSalt, Config.getBlockNextID()).getInt();
        Config.saltMaxHeight = config.get(gen + salt, "Maximum Height", 74).getInt();
        Config.saltMinHeight = config.get(gen + salt, "Minimum Height", 44).getInt();
        Config.saltSize = config.get(gen + salt, "Max size of the Vein", 6).getInt();
        Config.saltDensity = config.get(gen + salt, "Max veins per chunk", 14).getInt();
    }
}