/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry;

import net.minecraft.item.ItemStack;

import ccm.harvestry.Harvestry;
import ccm.harvestry.block.enums.EnumOres;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.omnium.IMod;
import ccm.nucleum.omnium.utils.handler.LogHandler;
import ccm.nucleum.omnium.utils.helper.enums.IBlockEnum;
import ccm.nucleum.world.WorldGenerator;

final class WorldRegistry
{

    /**
     * Registers all the World Generation.
     */
    protected static void registerWorld()
    {
        if (Properties.enableWorldGenAluminum)
        {
            WorldRegistry.registerAluminum();
        }
        if (Properties.enableWorldGenSalt)
        {
            WorldRegistry.registerSlat();
        }
    }

    private static void registerAluminum()
    {
        LogHandler.finest(Harvestry.instance, "Registering World Generation for Aluminum");

        register(Harvestry.instance, EnumOres.oreAluminum, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenAluminum);
    }

    private static void registerSlat()
    {
        LogHandler.finest(Harvestry.instance, "Registering World Generation for Salt");

        register(Harvestry.instance, EnumOres.oreSalt, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenSalt);
    }

    private static void register(final IMod mod, final Enum<? extends IBlockEnum> enu, final int oreID, final int clusterSize, final int numClusters, final int minY,
            final int maxY, final boolean enable)
    {

        WorldGenerator.addOverworldGen(mod, new ItemStack(oreID, 1, enu.ordinal()), enu.name(), clusterSize, numClusters, minY, maxY, enable);
    }
}