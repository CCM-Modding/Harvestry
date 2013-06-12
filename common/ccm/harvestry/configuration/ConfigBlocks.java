package ccm.harvestry.configuration;


import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.BlockNames;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.configuration.AdvConfiguration;
import ccm.nucleum.handler.Handler;

final class ConfigBlocks extends Config
{

    /**
     * Loads or creates the Blocks in the AdvConfiguration file.
     * 
     * @param config
     *            The AdvConfiguration file that is being edited.
     */
    protected static void configBlocks(final AdvConfiguration config)
    {
        Handler.log(Harvestry.instance, "Loading Block Configs");
        Properties.blockOvenID = config.getBlock(BlockNames.blockOven, Properties.blockID).getInt();
        Properties.blockOvenRunningID = config.getBlock(BlockNames.blockOven + "Active", Properties.blockID).getInt();
        Properties.blockGrinderID = config.getBlock(BlockNames.blockGrinder, Properties.blockID).getInt();
        Properties.blockGrinderRunningID = config.getBlock(BlockNames.blockGrinder + "Active", Properties.blockID).getInt();
        Properties.blockSugarID = config.getBlock(BlockNames.blockSugar, Properties.blockID).getInt();
        Properties.blockAluminumID = config.getBlock(BlockNames.blockAluminum, Properties.blockID).getInt();
        Properties.blockRollerID = config.getBlock(BlockNames.blockRoller, Properties.blockID).getInt();
        Properties.blockRollerRunningID = config.getBlock(BlockNames.blockRoller + "Active", Properties.blockID).getInt();
        Properties.blockCounterID = config.getBlock(BlockNames.blockCounter, Properties.blockID).getInt();
        Properties.blockCheeseID = config.getBlock(BlockNames.blockCheese, Properties.blockID).getInt();
        Properties.blockButterID = config.getBlock(BlockNames.blockButter, Properties.blockID).getInt();
        Properties.blockBarrelID = config.getBlock(BlockNames.blockBarrel, Properties.blockID).getInt();
        Properties.blockCabinetID = config.getBlock(BlockNames.blockCabinet, Properties.blockID).getInt();
        Properties.blockGrillID = config.getBlock(BlockNames.blockGrill, Properties.blockID).getInt();
        Properties.blockGrillRunningID = config.getBlock(BlockNames.blockGrill + "Active", Properties.blockID).getInt();
        Properties.cropOnionID = config.getBlock(BlockNames.cropOnion, Properties.blockID).getInt();
        Properties.cropLettuceID = config.getBlock(BlockNames.cropLettuce, Properties.blockID).getInt();
        Properties.cropCornID = config.getBlock(BlockNames.cropCorn, Properties.blockID).getInt();
        Properties.oreID = config.getBlock("Ores", Properties.blockID).getInt();
    }
}