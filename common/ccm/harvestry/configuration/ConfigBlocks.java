package ccm.harvestry.configuration;

import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.BlockNames;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigBlocks extends Config {
    
    /**
     * Loads or creates the Blocks in the AdvConfiguration file.
     * 
     * @param config
     *            The AdvConfiguration file that is being edited.
     */
    protected static void configBlocks(final AdvConfiguration config) {
        Handler.log(Harvestry.instance, "Loading Block Configs");
        int id = Properties.blockID;
        Properties.blockOvenID = config.getBlock(BlockNames.blockOven, id++).getInt();
        Properties.blockOvenRunningID = config.getBlock(BlockNames.blockOven + "Active",
                                                        Properties.blockID).getInt();
        Properties.blockGrinderID = config.getBlock(BlockNames.blockGrinder, id++).getInt();
        Properties.blockGrinderRunningID = config.getBlock(BlockNames.blockGrinder + "Active",
                                                           Properties.blockID).getInt();
        Properties.blockSugarID = config.getBlock(BlockNames.blockSugar, id++).getInt();
        Properties.blockAluminumID = config.getBlock(BlockNames.blockAluminum, id++).getInt();
        Properties.blockRollerID = config.getBlock(BlockNames.blockRoller, id++).getInt();
        Properties.blockRollerRunningID = config.getBlock(BlockNames.blockRoller + "Active",
                                                          Properties.blockID).getInt();
        Properties.blockCounterID = config.getBlock(BlockNames.blockCounter, id++).getInt();
        Properties.blockCheeseID = config.getBlock(BlockNames.blockCheese, id++).getInt();
        Properties.blockButterID = config.getBlock(BlockNames.blockButter, id++).getInt();
        Properties.blockBarrelID = config.getBlock(BlockNames.blockBarrel, id++).getInt();
        Properties.blockCabinetID = config.getBlock(BlockNames.blockCabinet, id++).getInt();
        Properties.blockGrillID = config.getBlock(BlockNames.blockGrill, id++).getInt();
        Properties.blockGrillRunningID = config.getBlock(BlockNames.blockGrill + "Active",
                                                         Properties.blockID).getInt();
        Properties.cropOnionID = config.getBlock(BlockNames.cropOnion, id++).getInt();
        Properties.cropLettuceID = config.getBlock(BlockNames.cropLettuce, id++).getInt();
        Properties.cropCornID = config.getBlock(BlockNames.cropCorn, id++).getInt();
        Properties.oreID = config.getBlock("Ores", id++).getInt();
    }
}