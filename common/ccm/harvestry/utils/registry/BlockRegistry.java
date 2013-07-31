/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry;

import java.util.Arrays;

import net.minecraft.block.material.Material;

import ccm.harvestry.Harvestry;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.blocks.EnumBlocks;
import ccm.harvestry.enums.blocks.EnumMachines;
import ccm.harvestry.enums.blocks.EnumModeled;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.block.sub.SubModelled;
import ccm.nucleum_omnium.block.texture.ActiveTexture;
import ccm.nucleum_omnium.block.texture.MultyTexture;
import ccm.nucleum_omnium.block.tile.TileInventory;
import ccm.nucleum_omnium.block.tile.TileLogic;
import ccm.nucleum_omnium.handler.LogHandler;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.handler.TileHandler;
import ccm.nucleum_omnium.utils.lib.BlockFacings;

final class BlockRegistry
{

    protected static void registerBlocks()
    {
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

    static void registerCustomBlocks()
    {
        LogHandler.finest(Harvestry.instance, "Making Sub Blocks, Stage 2");

        String texture = TextureHandler.getTextureFromName(EnumMachines.machineGrinder,
                                                           Locations.TEXTURE + "machine/");
        SubBlock.setUp(EnumMachines.machineGrinder,
                       new SubBlock(Properties.machineBlockID,
                                    EnumMachines.machineGrinder.ordinal(),
                                    new ActiveTexture(texture, Arrays.asList(BlockFacings.Bottom,
                                                                             BlockFacings.Top,
                                                                             BlockFacings.Sides)),
                                    new TileLogic()).setTileEntity(TileHandler.getEnumTE(EnumMachines.machineGrinder))
                                                    .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                    .setUnlocalizedName(EnumMachines.machineGrinder)
                                                    .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumMachines.machineOven, Locations.TEXTURE + "machine/");

        SubBlock.setUp(EnumMachines.machineOven,
                       new SubBlock(Properties.machineBlockID,
                                    EnumMachines.machineOven.ordinal(),
                                    Material.iron,
                                    new ActiveTexture(texture, Arrays.asList(BlockFacings.Bottom,
                                                                             BlockFacings.Top,
                                                                             BlockFacings.Sides,
                                                                             BlockFacings.Front)),
                                    new TileLogic()).setTileEntity(TileHandler.getEnumTE(EnumMachines.machineOven))
                                                    .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                    .setUnlocalizedName(EnumMachines.machineOven)
                                                    .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumMachines.machineRoller,
                                                    Locations.TEXTURE + "machine/");

        SubBlock.setUp(EnumMachines.machineRoller,
                       new SubBlock(Properties.machineBlockID,
                                    EnumMachines.machineRoller.ordinal(),
                                    Material.iron,
                                    new ActiveTexture(texture, Arrays.asList(BlockFacings.Bottom,
                                                                             BlockFacings.Top,
                                                                             BlockFacings.Sides,
                                                                             BlockFacings.Front)),
                                    new TileLogic()).setTileEntity(TileHandler.getEnumTE(EnumMachines.machineRoller))
                                                    .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                    .setUnlocalizedName(EnumMachines.machineRoller)
                                                    .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumMachines.storageCounter,
                                                    Locations.TEXTURE + "storage/");

        SubBlock.setUp(EnumMachines.storageCounter,
                       new SubBlock(Properties.machineBlockID,
                                    EnumMachines.storageCounter.ordinal(),
                                    new MultyTexture(texture, Arrays.asList(BlockFacings.Bottom,
                                                                            BlockFacings.Top,
                                                                            BlockFacings.Sides,
                                                                            BlockFacings.Front)),
                                    new TileLogic()).setTileEntity(TileHandler.getEnumTE(EnumMachines.storageCounter))
                                                    .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                    .setUnlocalizedName(EnumMachines.storageCounter)
                                                    .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumMachines.storageBarrel,
                                                    Locations.TEXTURE + "storage/");

        SubBlock.setUp(EnumMachines.storageBarrel,
                       new SubBlock(Properties.machineBlockID,
                                    EnumMachines.storageBarrel.ordinal(),
                                    Material.wood,
                                    new MultyTexture(texture, Arrays.asList(BlockFacings.Bottom,
                                                                            BlockFacings.Top,
                                                                            BlockFacings.Sides)),
                                    new TileInventory()).setTileEntity(TileHandler.getEnumTE(EnumMachines.storageBarrel))
                                                        .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                        .setUnlocalizedName(EnumMachines.storageBarrel)
                                                        .setHardness(3.0F));

        texture = TextureHandler.getTextureFromName(EnumMachines.storageCabinet,
                                                    Locations.TEXTURE + "storage/");

        SubBlock.setUp(EnumMachines.storageCabinet,
                       new SubBlock(Properties.machineBlockID,
                                    EnumMachines.storageCabinet.ordinal(),
                                    Material.wood,
                                    new MultyTexture(texture, Arrays.asList(BlockFacings.Bottom,
                                                                            BlockFacings.Top,
                                                                            BlockFacings.Sides,
                                                                            BlockFacings.Front)),
                                    new TileInventory()).setTileEntity(TileHandler.getEnumTE(EnumMachines.storageCabinet))
                                                        .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                        .setUnlocalizedName(EnumMachines.storageCabinet)
                                                        .setHardness(3.0F));
    }

    static void registerCustomRenderBlocks()
    {
        LogHandler.finest(Harvestry.instance, "Making Sub Blocks, Stage 3");

        SubBlock.setUp(EnumModeled.machineGrill,
                       new SubModelled(Properties.modeledBlockID,
                                       EnumModeled.machineGrill.ordinal(),
                                       new TileLogic()).setTileEntity(TileHandler.getEnumTE(EnumModeled.machineGrill))
                                                       .setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                                                       .setUnlocalizedName(EnumModeled.machineGrill)
                                                       .setHardness(3.0F));
    }
}