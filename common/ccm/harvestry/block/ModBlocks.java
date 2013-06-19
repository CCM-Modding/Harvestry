package ccm.harvestry.block;

import net.minecraft.block.Block;
import ccm.harvestry.Harvestry;
import ccm.harvestry.block.plants.CropCorn;
import ccm.harvestry.block.plants.CropLettuce;
import ccm.harvestry.block.plants.CropOnion;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.blocks.EnumBlocks;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.enums.blocks.EnumTEBlock;
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
        
        EnumBlockHelper.createBlock(EnumOres.oreAluminum, Properties.oreID, Locations.TEXTURE, HarvestryTabs.tabHarvestryBlocks, 5);
        
        EnumBlockHelper.createBlock(EnumOres.oreSalt, Properties.oreID, Locations.TEXTURE, HarvestryTabs.tabHarvestryBlocks, 5);
        
        EnumBlockHelper.createBlock(EnumBlocks.blockAluminum, Properties.stgBlockID, Locations.TEXTURE, HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumBlocks.blockButter, Properties.stgBlockID, Locations.TEXTURE, HarvestryTabs.tabHarvestryBlocks, 1);
        
        EnumBlockHelper.createBlock(EnumBlocks.blockCheese, Properties.stgBlockID, Locations.TEXTURE, HarvestryTabs.tabHarvestryBlocks, 1);
        
        EnumBlockHelper.createBlock(EnumBlocks.blockSugar, Properties.stgBlockID, Locations.TEXTURE, HarvestryTabs.tabHarvestryBlocks, 1);
        
        EnumBlockHelper.createBlock(EnumTEBlock.machineGrinder, Properties.machineBlockID, Locations.TEXTURE + "machine/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.machineGrinderRunning, Properties.machineBlockID, Locations.TEXTURE + "machine/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.machineOven, Properties.machineBlockID, Locations.TEXTURE + "machine/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.machineOvenRunning, Properties.machineBlockID, Locations.TEXTURE + "machine/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.machineRoller, Properties.machineBlockID, Locations.TEXTURE + "machine/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.machineRollerRunning, Properties.machineBlockID, Locations.TEXTURE + "machine/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.storageCounter, Properties.machineBlockID, Locations.TEXTURE + "storage/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.storageBarrel, Properties.machineBlockID, Locations.TEXTURE + "storage/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.storageCabinet, Properties.machineBlockID, Locations.TEXTURE + "storage/", HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.machineGrill, Properties.machineBlockID, Locations.TEXTURE, HarvestryTabs.tabHarvestryBlocks, 3);
        
        EnumBlockHelper.createBlock(EnumTEBlock.machineGrillRunning, Properties.machineBlockID, Locations.TEXTURE, HarvestryTabs.tabHarvestryBlocks, 3);
        
        ModBlocks.cropOnion = new CropOnion(Properties.cropOnionID).setUnlocalizedName(BlockNames.cropOnion);
        ModBlocks.cropLettuce = new CropLettuce(Properties.cropLettuceID).setUnlocalizedName(BlockNames.cropLettuce);
        ModBlocks.cropCorn = new CropCorn(Properties.cropCornID).setUnlocalizedName(BlockNames.cropCorn);
    }
}