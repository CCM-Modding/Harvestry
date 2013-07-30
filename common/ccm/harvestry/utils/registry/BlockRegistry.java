package ccm.harvestry.utils.registry;

import java.util.Arrays;

import net.minecraft.block.material.Material;

import ccm.harvestry.Harvestry;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.blocks.EnumBlocks;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.block.sub.SubModelled;
import ccm.nucleum_omnium.block.texture.MultyTexture;
import ccm.nucleum_omnium.block.tile.TileInventory;
import ccm.nucleum_omnium.block.tile.TileLogic;
import ccm.nucleum_omnium.handler.LogHandler;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.utils.lib.BlockFacings;

final class BlockRegistry {

    protected static void registerBlocks() {
        LogHandler.finest(Harvestry.instance, "Making Sub Blocks");

        SubBlock.createAndSetUp(EnumOres.oreAluminum, Properties.oreID, Locations.TEXTURE)
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setHardness(5.0F);

        SubBlock.createAndSetUp(EnumOres.oreSalt, Properties.oreID, Locations.TEXTURE)
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setHardness(5.0F);

        SubBlock.createAndSetUp(EnumBlocks.blockAluminum, Properties.stgBlockID, Locations.TEXTURE)
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setHardness(3.0F);

        SubBlock.createAndSetUp(EnumBlocks.blockButter, Properties.stgBlockID, Locations.TEXTURE)
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setHardness(1.0F);

        SubBlock.createAndSetUp(EnumBlocks.blockCheese, Properties.stgBlockID, Locations.TEXTURE)
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setHardness(1.0F);

        SubBlock.createAndSetUp(EnumBlocks.blockSugar, Properties.stgBlockID, Locations.TEXTURE)
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                .setHardness(1.0F);

        registerCustomBlocks();

        registerCustomRenderBlocks();
    }

    static void registerCustomBlocks() {
        LogHandler.finest(Harvestry.instance, "Making Sub Blocks, Stage 2");

        String texture = TextureHandler.getTextureFromName(EnumTEBlock.machineGrinder,
                                                           Locations.TEXTURE + "machine/");
        SubBlock.setUp(EnumTEBlock.machineGrinder,
                       new SubBlock(Properties.machineBlockID, EnumTEBlock.machineGrinder.ordinal(), texture).setTexture(new MultyTexture(texture,
                                                                                                                                          Arrays.asList(BlockFacings.Bottom,
                                                                                                                                                        BlockFacings.Top,
                                                                                                                                                        BlockFacings.Sides)))
                                                                                                             .setTile(new TileLogic())
                                                                                                             .setTileEntity(TileHandler.getEnumTE(EnumTEBlock.machineGrinder))
                                                                                                             .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                                                                             .setUnlocalizedName(EnumTEBlock.machineGrinder)
                                                                                                             .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumTEBlock.machineOven, Locations.TEXTURE + "machine/");

        SubBlock.setUp(EnumTEBlock.machineOven,
                       new SubBlock(Properties.machineBlockID,
                                    EnumTEBlock.machineOven.ordinal(),
                                    Material.iron,
                                    texture).setTexture(new MultyTexture(texture,
                                                                         Arrays.asList(BlockFacings.Bottom,
                                                                                       BlockFacings.Top,
                                                                                       BlockFacings.Sides,
                                                                                       BlockFacings.Front)))
                                            .setTile(new TileLogic())
                                            .setTileEntity(TileHandler.getEnumTE(EnumTEBlock.machineOven))
                                            .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                            .setUnlocalizedName(EnumTEBlock.machineOven)
                                            .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumTEBlock.machineRoller, Locations.TEXTURE + "machine/");

        SubBlock.setUp(EnumTEBlock.machineRoller,
                       new SubBlock(Properties.machineBlockID,
                                    EnumTEBlock.machineRoller.ordinal(),
                                    Material.iron,
                                    texture).setTexture(new MultyTexture(texture,
                                                                         Arrays.asList(BlockFacings.Bottom,
                                                                                       BlockFacings.Top,
                                                                                       BlockFacings.Sides,
                                                                                       BlockFacings.Front)))
                                            .setTile(new TileLogic())
                                            .setTileEntity(TileHandler.getEnumTE(EnumTEBlock.machineRoller))
                                            .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                            .setUnlocalizedName(EnumTEBlock.machineRoller)
                                            .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumTEBlock.storageCounter,
                                                    Locations.TEXTURE + "storage/");

        SubBlock.setUp(EnumTEBlock.storageCounter,
                       new SubBlock(Properties.machineBlockID, EnumTEBlock.storageCounter.ordinal(), texture).setTexture(new MultyTexture(texture,
                                                                                                                                          Arrays.asList(BlockFacings.Bottom,
                                                                                                                                                        BlockFacings.Top,
                                                                                                                                                        BlockFacings.Sides,
                                                                                                                                                        BlockFacings.Front)))
                                                                                                             .setTile(new TileLogic())
                                                                                                             .setTileEntity(TileHandler.getEnumTE(EnumTEBlock.storageCounter))
                                                                                                             .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                                                                             .setUnlocalizedName(EnumTEBlock.storageCounter)
                                                                                                             .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumTEBlock.storageBarrel, Locations.TEXTURE + "storage/");

        SubBlock.setUp(EnumTEBlock.storageBarrel,
                       new SubBlock(Properties.machineBlockID,
                                    EnumTEBlock.storageBarrel.ordinal(),
                                    Material.wood,
                                    texture).setTexture(new MultyTexture(texture,
                                                                         Arrays.asList(BlockFacings.Bottom,
                                                                                       BlockFacings.Top,
                                                                                       BlockFacings.Sides)))
                                            .setTile(new TileInventory())
                                            .setTileEntity(TileHandler.getEnumTE(EnumTEBlock.storageBarrel))
                                            .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                            .setUnlocalizedName(EnumTEBlock.storageBarrel)
                                            .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumTEBlock.storageCabinet,
                                                    Locations.TEXTURE + "storage/");

        SubBlock.setUp(EnumTEBlock.storageCabinet,
                       new SubBlock(Properties.machineBlockID,
                                    EnumTEBlock.storageCabinet.ordinal(),
                                    Material.wood,
                                    texture).setTexture(new MultyTexture(texture,
                                                                         Arrays.asList(BlockFacings.Bottom,
                                                                                       BlockFacings.Top,
                                                                                       BlockFacings.Sides,
                                                                                       BlockFacings.Front)))
                                            .setTile(new TileInventory())
                                            .setTileEntity(TileHandler.getEnumTE(EnumTEBlock.storageCabinet))
                                            .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                            .setUnlocalizedName(EnumTEBlock.storageCabinet)
                                            .setHardness(3.0F));
    }

    static void registerCustomRenderBlocks() {
        LogHandler.finest(Harvestry.instance, "Making Sub Blocks, Stage 3");

        SubBlock.setUp(EnumTEBlock.machineGrill,
                       new SubModelled(Properties.machineBlockID, EnumTEBlock.machineGrill.ordinal()).setTile(new TileLogic())
                                                                                                     .setTileEntity(TileHandler.getEnumTE(EnumTEBlock.machineGrill))
                                                                                                     .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                                                                     .setUnlocalizedName(EnumTEBlock.machineGrill)
                                                                                                     .setHardness(3.0F));
    }
}