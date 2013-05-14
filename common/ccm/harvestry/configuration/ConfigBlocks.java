package ccm.harvestry.configuration;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import ccm.harvestry.utils.lib.BlockNames;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigBlocks extends Config
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
        Properties.blockOvenID = property.getNextBlock(config, BlockNames.blockOven).getInt();
        Properties.blockOvenRunningID = property.getNextBlock(config, BlockNames.blockOven + "Active").getInt();
        Properties.blockGrinderID = property.getNextBlock(config, BlockNames.blockGrinder).getInt();
        Properties.blockGrinderRunningID = property.getNextBlock(config, BlockNames.blockGrinder + "Active").getInt();
        Properties.blockSugarID = property.getNextBlock(config, BlockNames.blockSugar).getInt();
        Properties.blockAluminumID = property.getNextBlock(config, BlockNames.blockAluminum).getInt();
        Properties.blockRollerID = property.getNextBlock(config, BlockNames.blockRoller).getInt();
        Properties.blockRollerRunningID = property.getNextBlock(config, BlockNames.blockRoller + "Active").getInt();
        Properties.blockCounterID = property.getNextBlock(config, BlockNames.blockCounter).getInt();
        Properties.blockCheeseID = property.getNextBlock(config, BlockNames.blockCheese).getInt();
        Properties.blockButterID = property.getNextBlock(config, BlockNames.blockButter).getInt();
        Properties.blockBarrelID = property.getNextBlock(config, BlockNames.blockBarrel).getInt();
        Properties.blockCabinetID = property.getNextBlock(config, BlockNames.blockCabinet).getInt();
        Properties.cropOnionID = property.getNextBlock(config, BlockNames.cropOnion).getInt();
        Properties.cropLettuceID = property.getNextBlock(config, BlockNames.cropLettuce).getInt();
        Properties.cropCornID = property.getNextBlock(config, BlockNames.cropCorn).getInt();
        Properties.oreID = property.getNextBlock(config, "Ores").getInt();
    }
}