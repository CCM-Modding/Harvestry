package ccm.harvestry.utils.registry;

import ccm.harvestry.utils.lib.Properties;

final class WorldRegistry
{

    /**
     * Registers all the World Generation.
     */
    protected static void registerWorld()
    {
        if (Properties.enableWorldGenAluminum){
            // registerAluminum();
        }
        if (Properties.enableWorldGenSalt){
            // registerSlat();
        }
    }

    /*
     * private static void registerAluminum()
     * {
     * Handler.log(Harvestry.instance, "Registering World Generation for Aluminum");
     * WorldGenHandler.addSurfaceGenerator(new WorldGenMinable(new ItemStack(ModBlocks.ores.blockID,
     * 1, EnumOres.oreAluminum.ordinal()), Properties.aluSize),
     * Properties.aluMinHeight,
     * Properties.aluMaxHeight,
     * Properties.aluDensity,
     * WorldGenHandler.GenType.ORE_1.ordinal());
     * }
     * private static void registerSlat()
     * {
     * Handler.log(Harvestry.instance, "Registering World Generation for Salt");
     * WorldGenHandler.addSurfaceGenerator(new WorldGenMinable(new ItemStack(ModBlocks.ores.blockID,
     * 1, EnumOres.oreSalt.ordinal()), Properties.saltSize),
     * Properties.saltMinHeight,
     * Properties.saltMaxHeight,
     * Properties.saltDensity,
     * WorldGenHandler.GenType.ORE_1.ordinal());
     * }
     */
}