package ccm.harvestry.utils.registry;

import net.minecraft.item.ItemStack;

import ccm.nucleum_omnium.handler.Handler;

import ccm.harvestry.Harvestry;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.utils.lib.Archive;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_world.WorldGenerator;

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
        Handler.log(Harvestry.instance, "Registering World Generation for Aluminum");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME,
                                       new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreAluminum.ordinal()),
                                       EnumOres.oreAluminum.name(),
                                       Properties.aluSize,
                                       Properties.aluDensity,
                                       Properties.aluMinHeight,
                                       Properties.aluMaxHeight,
                                       Properties.enableWorldGenAluminum);
    }

    private static void registerSlat()
    {
        Handler.log(Harvestry.instance, "Registering World Generation for Salt");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME,
                                       new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSalt.ordinal()),
                                       EnumOres.oreSalt.name(),
                                       Properties.saltSize,
                                       Properties.saltDensity,
                                       Properties.saltMinHeight,
                                       Properties.saltMaxHeight,
                                       Properties.enableWorldGenSalt);
    }
}