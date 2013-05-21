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
        Properties.blockOvenID = property.getNextUsableBlockID(config, BlockNames.blockOven).getInt();
        Properties.blockOvenRunningID = property.getNextUsableBlockID(config, BlockNames.blockOven + "Active").getInt();
        Properties.blockGrinderID = property.getNextUsableBlockID(config, BlockNames.blockGrinder).getInt();
        Properties.blockGrinderRunningID = property.getNextUsableBlockID(config, BlockNames.blockGrinder + "Active").getInt();
        Properties.blockSugarID = property.getNextUsableBlockID(config, BlockNames.blockSugar).getInt();
        Properties.blockAluminumID = property.getNextUsableBlockID(config, BlockNames.blockAluminum).getInt();
        Properties.blockRollerID = property.getNextUsableBlockID(config, BlockNames.blockRoller).getInt();
        Properties.blockRollerRunningID = property.getNextUsableBlockID(config, BlockNames.blockRoller + "Active").getInt();
        Properties.blockCounterID = property.getNextUsableBlockID(config, BlockNames.blockCounter).getInt();
        Properties.blockCheeseID = property.getNextUsableBlockID(config, BlockNames.blockCheese).getInt();
        Properties.blockButterID = property.getNextUsableBlockID(config, BlockNames.blockButter).getInt();
        Properties.blockBarrelID = property.getNextUsableBlockID(config, BlockNames.blockBarrel).getInt();
        Properties.blockCabinetID = property.getNextUsableBlockID(config, BlockNames.blockCabinet).getInt();
        Properties.blockGrillID = property.getNextUsableBlockID(config, BlockNames.blockGrill).getInt();
        Properties.blockGrillRunningID = property.getNextUsableBlockID(config, BlockNames.blockGrill + "Active").getInt();
        Properties.cropOnionID = property.getNextUsableBlockID(config, BlockNames.cropOnion).getInt();
        Properties.cropLettuceID = property.getNextUsableBlockID(config, BlockNames.cropLettuce).getInt();
        Properties.cropCornID = property.getNextUsableBlockID(config, BlockNames.cropCorn).getInt();
        Properties.oreID = property.getNextUsableBlockID(config, "Ores").getInt();
    }
}