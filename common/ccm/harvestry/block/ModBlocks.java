package ccm.harvestry.block;

import net.minecraft.block.Block;
import ccm.harvestry.Harvestry;
import ccm.harvestry.block.plants.CropCorn;
import ccm.harvestry.block.plants.CropLettuce;
import ccm.harvestry.block.plants.CropOnion;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.blocks.EnumBlocks;
import ccm.harvestry.enums.blocks.EnumMachines;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.utils.lib.BlockNames;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.helper.enums.EnumBlockHelper;

public final class ModBlocks {
    
    public static Block cropOnion;
    
    public static Block cropLettuce;
    
    public static Block cropCorn;
    
    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init() {
        Handler.log(Harvestry.instance, "Loading Blocks");
        
        EnumBlockHelper.createBlock(EnumOres.oreAluminum,
                                    Properties.oreID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    5);
        
        EnumBlockHelper.createBlock(EnumOres.oreSalt,
                                    Properties.oreID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    5);
        
        EnumBlockHelper.createBlock(EnumBlocks.blockAluminum,
                                    Properties.stgBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumBlocks.blockButter,
                                    Properties.stgBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    1);
        
        EnumBlockHelper.createBlock(EnumBlocks.blockCheese,
                                    Properties.stgBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    1);
        
        EnumBlockHelper.createBlock(EnumBlocks.blockSugar,
                                    Properties.stgBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    1);
        
        EnumBlockHelper.createBlock(EnumMachines.machineGrinder,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineGrinderRunning,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineOven,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineOvenRunning,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineRoller,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineRollerRunning,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineCounter,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineBarrel,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineCabinet,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineGrill,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        EnumBlockHelper.createBlock(EnumMachines.machineGrillRunning,
                                    Properties.machineBlockID,
                                    Locations.TEXTURE,
                                    HarvestryTabs.tabHarvestryBlocks,
                                    3);
        
        ModBlocks.cropOnion = new CropOnion(Properties.cropOnionID)
                .setUnlocalizedName(BlockNames.cropOnion);
        ModBlocks.cropLettuce = new CropLettuce(Properties.cropLettuceID)
                .setUnlocalizedName(BlockNames.cropLettuce);
        ModBlocks.cropCorn = new CropCorn(Properties.cropCornID)
                .setUnlocalizedName(BlockNames.cropCorn);
    }
}