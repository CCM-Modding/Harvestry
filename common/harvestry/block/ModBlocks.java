package harvestry.block;

import harvestry.block.plants.CropCorn;
import harvestry.block.plants.CropLettuce;
import harvestry.block.plants.CropOnion;
import harvestry.configuration.Config;
import harvestry.utils.lib.BlockNames;

import java.util.logging.Level;

import net.minecraft.block.Block;
import nucleum_omnium.handler.Handler;

public final class ModBlocks
{

    public static Block oreAluminum;

    public static Block oreSalt;

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

    public static Block cropOnion;

    public static Block cropLettuce;

    public static Block cropCorn;

    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init()
    {
        Handler.log(Level.INFO, "Loading Blocks");

        oreSalt = new BaseOre(Config.oreSaltID).setUnlocalizedName(BlockNames.oreSalt).setHardness(1.0F);
        oreAluminum = new BaseOre(Config.oreAluminumID).setUnlocalizedName(BlockNames.oreAluminum).setHardness(3.0F);

        blockSugar = new BaseBlock(Config.blockSugarID).setUnlocalizedName(BlockNames.blockSugar).setHardness(1.0F);
        blockAluminum = new BaseBlock(Config.blockAluminumID).setUnlocalizedName(BlockNames.blockAluminum).setHardness(3.0F);
        blockGrinder = new BlockGrinder(Config.blockGrinderID, false).setUnlocalizedName(BlockNames.blockGrinder).setHardness(3.0F);
        blockGrinderRunning = new BlockGrinder(Config.blockGrinderRunningID, true).setUnlocalizedName(BlockNames.blockGrinder).setHardness(3.0F);
        blockOven = new BlockOven(Config.blockOvenID, false).setUnlocalizedName(BlockNames.blockOven).setHardness(3.0F);
        blockOvenRunning = new BlockOven(Config.blockOvenRunningID, true).setUnlocalizedName(BlockNames.blockOven).setHardness(3.0F).setLightValue(0.875F);
        blockRoller = new BlockRoller(Config.blockRollerID, false).setUnlocalizedName(BlockNames.blockRoller).setHardness(3.0F);
        blockRollerRunning = new BlockRoller(Config.blockRollerRunningID, true).setUnlocalizedName(BlockNames.blockRoller).setHardness(3.0F);
        blockCounter = new BlockCounter(Config.blockCounterID, false).setUnlocalizedName(BlockNames.blockCounter).setHardness(3.0F);
        blockCheese = new BaseBlock(Config.blockCheeseID).setUnlocalizedName(BlockNames.blockCheese).setHardness(1.0F);
        blockButter = new BaseBlock(Config.blockButterID).setUnlocalizedName(BlockNames.blockButter).setHardness(1.0F);
        blockBarrel = new BlockBarrel(Config.blockBarrelID).setUnlocalizedName(BlockNames.blockBarrel).setHardness(3.0F);
        blockCabinet = new BlockCabinet(Config.blockCabinetID).setUnlocalizedName(BlockNames.blockCabinet).setHardness(3.0F);

        cropOnion = new CropOnion(Config.cropOnionID).setUnlocalizedName(BlockNames.cropOnion);
        cropLettuce = new CropLettuce(Config.cropLettuceID).setUnlocalizedName(BlockNames.cropLettuce);
        cropCorn = new CropCorn(Config.cropCornID).setUnlocalizedName(BlockNames.cropCorn);
    }
}