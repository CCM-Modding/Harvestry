package ccm.harvestry.configuration;

import net.minecraftforge.common.Configuration;
import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigWorldGen extends Config
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
        if (Properties.enableWorldGenAluminum = config.get(gen + alu, "Enable Generation of Aluminum", true).getBoolean(true)){
            Handler.log(Harvestry.instance, "Loading Aluminum Configs");

            Properties.aluMaxHeight = config.get(gen + alu, "Maximum Height", 50).getInt();
            Properties.aluMinHeight = config.get(gen + alu, "Minimum Height", 25).getInt();
            Properties.aluMinHeight = config.get(gen + alu, "Minimum Height", 25).getInt();
            Properties.aluSize = config.get(gen + alu, "Max size of the Vein", 4).getInt();
            Properties.aluDensity = config.get(gen + alu, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Slat World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genSalt(final Configuration config)
    {
        if (Properties.enableWorldGenSalt = config.get(gen + salt, "Enable Generation of Salt", true).getBoolean(true)){
            Handler.log(Harvestry.instance, "Loading Salt Configs");

            Properties.saltMaxHeight = config.get(gen + salt, "Maximum Height", 74).getInt();
            Properties.saltMinHeight = config.get(gen + salt, "Minimum Height", 44).getInt();
            Properties.saltSize = config.get(gen + salt, "Max size of the Vein", 6).getInt();
            Properties.saltDensity = config.get(gen + salt, "Max veins per chunk", 14).getInt();
        }
    }
}