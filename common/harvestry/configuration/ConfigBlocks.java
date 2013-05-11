package harvestry.configuration;

import harvestry.utils.lib.BlockNames;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import nucleum_omnium.handler.Handler;

final class ConfigBlocks
{

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configBlocks(final Configuration config)
    {
        Handler.log(Level.INFO, "Loading Block Configs");
        Config.blockOvenID = config.getBlock(BlockNames.blockOven, Config.getBlockNextID()).getInt();
        Config.blockOvenRunningID = config.getBlock(BlockNames.blockOven + "Active", Config.getBlockNextID()).getInt();
        Config.blockGrinderID = config.getBlock(BlockNames.blockGrinder, Config.getBlockNextID()).getInt();
        Config.blockGrinderRunningID = config.getBlock(BlockNames.blockGrinder + "Active", Config.getBlockNextID()).getInt();
        Config.blockSugarID = config.getBlock(BlockNames.blockSugar, Config.getBlockNextID()).getInt();
        Config.blockAluminumID = config.getBlock(BlockNames.blockAluminum, Config.getBlockNextID()).getInt();
        Config.blockRollerID = config.getBlock(BlockNames.blockRoller, Config.getBlockNextID()).getInt();
        Config.blockRollerRunningID = config.getBlock(BlockNames.blockRoller + "Active", Config.getBlockNextID()).getInt();
        Config.blockCounterID = config.getBlock(BlockNames.blockCounter, Config.getBlockNextID()).getInt();
        Config.blockCheeseID = config.getBlock(BlockNames.blockCheese, Config.getBlockNextID()).getInt();
        Config.blockButterID = config.getBlock(BlockNames.blockButter, Config.getBlockNextID()).getInt();
        Config.blockBarrelID = config.getBlock(BlockNames.blockBarrel, Config.getBlockNextID()).getInt();
        Config.blockCabinetID = config.getBlock(BlockNames.blockCabinet, Config.getBlockNextID()).getInt();
        Config.cropOnionID = config.getBlock(BlockNames.cropOnion, Config.getBlockNextID()).getInt();
        Config.cropLettuceID = config.getBlock(BlockNames.cropLettuce, Config.getBlockNextID()).getInt();
        Config.cropCornID = config.getBlock(BlockNames.cropCorn, Config.getBlockNextID()).getInt();
    }
}