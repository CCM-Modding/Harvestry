package ccm.harvestry.block;

import net.minecraft.block.Block;
import ccm.harvestry.Harvestry;
import ccm.harvestry.block.machines.BlockBarrel;
import ccm.harvestry.block.machines.BlockCabinet;
import ccm.harvestry.block.machines.BlockCounter;
import ccm.harvestry.block.machines.BlockGrill;
import ccm.harvestry.block.machines.BlockGrinder;
import ccm.harvestry.block.machines.BlockOven;
import ccm.harvestry.block.machines.BlockRoller;
import ccm.harvestry.block.plants.CropCorn;
import ccm.harvestry.block.plants.CropLettuce;
import ccm.harvestry.block.plants.CropOnion;
import ccm.harvestry.utils.lib.BlockNames;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.handler.Handler;

public final class ModBlocks {

    // needs ore dictionary recipes
    public static Block blockGrinder;

    public static Block blockGrinderRunning;

    public static Block blockOven;

    public static Block blockOvenRunning;

    public static Block blockSugar;

    public static Block blockAluminum;

    // needs ore dictionary recipes
    public static Block blockRoller;

    public static Block blockRollerRunning;

    public static Block blockCounter;

    public static Block blockCheese;

    public static Block blockButter;

    public static Block blockBarrel;

    public static Block blockCabinet;

    public static Block blockGrill;

    public static Block blockGrillRunning;

    public static Block cropOnion;

    public static Block cropLettuce;

    public static Block cropCorn;

    public static Block bushes;

    public static Block crops;

    public static Block tiles;

    public static Block ores;

    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init() {
        Handler.log(Harvestry.instance, "Loading Blocks");

        ModBlocks.ores = new ModOres(Properties.oreID);

        ModBlocks.cropOnion = new CropOnion(Properties.cropOnionID)
                .setUnlocalizedName(BlockNames.cropOnion);
        ModBlocks.cropLettuce = new CropLettuce(Properties.cropLettuceID)
                .setUnlocalizedName(BlockNames.cropLettuce);
        ModBlocks.cropCorn = new CropCorn(Properties.cropCornID)
                .setUnlocalizedName(BlockNames.cropCorn);

        ModBlocks.blockSugar = new BaseBlock(Properties.blockSugarID).setUnlocalizedName(
                BlockNames.blockSugar).setHardness(1.0F);
        ModBlocks.blockAluminum = new BaseBlock(Properties.blockAluminumID).setUnlocalizedName(
                BlockNames.blockAluminum).setHardness(3.0F);

        ModBlocks.blockGrinder = new BlockGrinder(Properties.blockGrinderID, false)
                .setUnlocalizedName(BlockNames.blockGrinder).setHardness(3.0F);
        ModBlocks.blockGrinderRunning = new BlockGrinder(Properties.blockGrinderRunningID, true)
                .setUnlocalizedName(BlockNames.blockGrinder).setHardness(3.0F);
        ModBlocks.blockOven = new BlockOven(Properties.blockOvenID, false).setUnlocalizedName(
                BlockNames.blockOven).setHardness(3.0F);
        ModBlocks.blockOvenRunning = new BlockOven(Properties.blockOvenRunningID, true)
                .setUnlocalizedName(BlockNames.blockOven).setHardness(3.0F).setLightValue(0.875F);
        ModBlocks.blockRoller = new BlockRoller(Properties.blockRollerID, false)
                .setUnlocalizedName(BlockNames.blockRoller).setHardness(3.0F);
        ModBlocks.blockRollerRunning = new BlockRoller(Properties.blockRollerRunningID, true)
                .setUnlocalizedName(BlockNames.blockRoller).setHardness(3.0F);
        ModBlocks.blockCounter = new BlockCounter(Properties.blockCounterID, false)
                .setUnlocalizedName(BlockNames.blockCounter).setHardness(3.0F);
        ModBlocks.blockCheese = new BaseBlock(Properties.blockCheeseID).setUnlocalizedName(
                BlockNames.blockCheese).setHardness(1.0F);
        ModBlocks.blockButter = new BaseBlock(Properties.blockButterID).setUnlocalizedName(
                BlockNames.blockButter).setHardness(1.0F);
        ModBlocks.blockBarrel = new BlockBarrel(Properties.blockBarrelID).setUnlocalizedName(
                BlockNames.blockBarrel).setHardness(3.0F);
        ModBlocks.blockCabinet = new BlockCabinet(Properties.blockCabinetID).setUnlocalizedName(
                BlockNames.blockCabinet).setHardness(3.0F);
        ModBlocks.blockGrill = new BlockGrill(Properties.blockGrillID, false).setUnlocalizedName(
                BlockNames.blockGrill).setHardness(3.0F);
        ModBlocks.blockGrillRunning = new BlockGrill(Properties.blockGrillRunningID, true)
                .setUnlocalizedName(BlockNames.blockGrill).setHardness(3.0F).setLightValue(0.875F);
    }
}