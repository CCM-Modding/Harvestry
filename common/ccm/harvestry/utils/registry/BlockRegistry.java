package ccm.harvestry.utils.registry;

import java.util.Arrays;

import ccm.harvestry.Harvestry;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.blocks.EnumBlocks;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.block.SBActiveMachine;
import ccm.nucleum_omnium.block.SBMutlyTexture;
import ccm.nucleum_omnium.block.SubBlock;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.utils.lib.BlockFacings;

final class BlockRegistry {
    
    protected static void registerBlocks() {
        Handler.log(Harvestry.instance, "Making Sub Blocks");
        
        SubBlock.createAndSetUp(EnumOres.oreAluminum, Properties.oreID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(5.0F);
        
        SubBlock.createAndSetUp(EnumOres.oreSalt, Properties.oreID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(5.0F);
        
        SubBlock.createAndSetUp(EnumBlocks.blockAluminum, Properties.stgBlockID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(3.0F);
        
        SubBlock.createAndSetUp(EnumBlocks.blockButter, Properties.stgBlockID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(1.0F);
        
        SubBlock.createAndSetUp(EnumBlocks.blockCheese, Properties.stgBlockID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(1.0F);
        
        SubBlock.createAndSetUp(EnumBlocks.blockSugar, Properties.stgBlockID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(1.0F);
        
        SubBlock.createAndSetUp(EnumTEBlock.machineGrill, Properties.machineBlockID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(3.0F);
        
        registerCustomBlocks();
        
        registerCustomRenderBlocks();
    }
    
    private static void registerCustomBlocks() {
        Handler.log(Harvestry.instance, "Making Sub Blocks, Stage 2");
        
        TileHandler th = TileHandler.instance();
        
        SubBlock.setUp(EnumTEBlock.machineGrinder,
                       new SBActiveMachine(Properties.machineBlockID,
                                           EnumTEBlock.machineGrinder.ordinal(),
                                           Locations.TEXTURE + "machine/",
                                           Arrays.asList(BlockFacings.Bottom, BlockFacings.Top, BlockFacings.Sides),
                                           false))
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setUnlocalizedName(EnumTEBlock.machineGrinder.name())
                .setHardness(3.0F)
                .setTileEntity(th.getTileEntity(Harvestry.instance, TileConstants.GRINDER_ID));
        
        SubBlock.setUp(EnumTEBlock.machineOven,
                       new SBActiveMachine(Properties.machineBlockID, EnumTEBlock.machineOven.ordinal(), Locations.TEXTURE + "machine/", Arrays.asList(BlockFacings.Bottom,
                                                                                                                                                       BlockFacings.Top,
                                                                                                                                                       BlockFacings.Sides,
                                                                                                                                                       BlockFacings.Front), false))
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setUnlocalizedName(EnumTEBlock.machineOven.name())
                .setHardness(3.0F)
                .setTileEntity(th.getTileEntity(Harvestry.instance, TileConstants.OVEN_ID));
        
        SubBlock.setUp(EnumTEBlock.machineRoller,
                       new SBActiveMachine(Properties.machineBlockID, EnumTEBlock.machineRoller.ordinal(), Locations.TEXTURE + "machine/", Arrays.asList(BlockFacings.Bottom,
                                                                                                                                                         BlockFacings.Top,
                                                                                                                                                         BlockFacings.Sides,
                                                                                                                                                         BlockFacings.Front), false))
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setUnlocalizedName(EnumTEBlock.machineRoller.name())
                .setHardness(3.0F)
                .setTileEntity(th.getTileEntity(Harvestry.instance, TileConstants.ROLLER_ID));
        
        SubBlock.setUp(EnumTEBlock.storageCounter,
                       new SBMutlyTexture(Properties.machineBlockID, EnumTEBlock.storageCounter.ordinal(), Locations.TEXTURE + "storage/", Arrays.asList(BlockFacings.Bottom,
                                                                                                                                                         BlockFacings.Top,
                                                                                                                                                         BlockFacings.Sides,
                                                                                                                                                         BlockFacings.Front)))
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setUnlocalizedName(EnumTEBlock.storageCounter.name())
                .setHardness(3.0F)
                .setTileEntity(th.getTileEntity(Harvestry.instance, TileConstants.COUNTER_ID));
        
        SubBlock.setUp(EnumTEBlock.storageBarrel,
                       new SBMutlyTexture(Properties.machineBlockID, EnumTEBlock.storageBarrel.ordinal(), Locations.TEXTURE + "storage/", Arrays.asList(BlockFacings.Bottom,
                                                                                                                                                        BlockFacings.Top,
                                                                                                                                                        BlockFacings.Sides,
                                                                                                                                                        BlockFacings.Front)))
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setUnlocalizedName(EnumTEBlock.storageBarrel.name())
                .setHardness(3.0F)
                .setTileEntity(th.getTileEntity(Harvestry.instance, TileConstants.BARREL_ID));
        
        SubBlock.setUp(EnumTEBlock.storageCabinet,
                       new SBMutlyTexture(Properties.machineBlockID, EnumTEBlock.storageCabinet.ordinal(), Locations.TEXTURE + "storage/", Arrays.asList(BlockFacings.Bottom,
                                                                                                                                                         BlockFacings.Top,
                                                                                                                                                         BlockFacings.Sides,
                                                                                                                                                         BlockFacings.Front)))
                .setHardness(3.0F)
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setUnlocalizedName(EnumTEBlock.storageCabinet.name())
                .setTileEntity(th.getTileEntity(Harvestry.instance, TileConstants.CABINET_ID));
    }
    
    private static void registerCustomRenderBlocks() {
        Handler.log(Harvestry.instance, "Making Sub Blocks, Stage 3");
    }
}