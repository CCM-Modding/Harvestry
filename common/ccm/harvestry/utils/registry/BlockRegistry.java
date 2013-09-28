/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry;

import java.util.Arrays;

import net.minecraft.block.material.Material;

import ccm.harvestry.Harvestry;
import ccm.harvestry.block.enums.EnumMachines;
import ccm.harvestry.block.enums.EnumModeled;
import ccm.harvestry.block.enums.EnumPlants;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.omnium.block.loader.texture.ActiveTexture;
import ccm.nucleum.omnium.block.loader.texture.MultyTexture;
import ccm.nucleum.omnium.block.loader.tile.TileInventory;
import ccm.nucleum.omnium.block.loader.tile.TileLogic;
import ccm.nucleum.omnium.block.sub.SubBlock;
import ccm.nucleum.omnium.utils.helper.CCMLogger;
import ccm.nucleum.omnium.utils.helper.enums.EnumHelper;
import ccm.nucleum.omnium.utils.lib.BlockFacings;

final class BlockRegistry
{
    protected static void registerBlocks()
    {
        CCMLogger.finest(Harvestry.instance, "Making Sub Blocks");

        registerCustomBlocks();

        EnumPlants.registerAll();

        EnumModeled.registerAll();
    }

    static void registerCustomBlocks()
    {
        CCMLogger.finest(Harvestry.instance, "Making Sub Blocks, Stage 2");

        String texture = EnumHelper.getTexture(EnumMachines.machineGrinder, Locations.TEXTURE + "machine/");
        SubBlock.setUp(EnumMachines.machineGrinder, new SubBlock(Properties.machineBlockID, EnumMachines.machineGrinder.ordinal(), new ActiveTexture(texture, BlockFacings.Sides,
                Arrays.asList(BlockFacings.Bottom, BlockFacings.Top, BlockFacings.Sides)), new TileLogic()).setTileEntity(EnumHelper.getTile(EnumMachines.machineGrinder))
                .setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setUnlocalizedName(EnumMachines.machineGrinder).setHardness(3.0F));

        texture = EnumHelper.getTexture(EnumMachines.machineOven, Locations.TEXTURE + "machine/");

        SubBlock.setUp(
                EnumMachines.machineOven,
                new SubBlock(Properties.machineBlockID, EnumMachines.machineOven.ordinal(), Material.iron, new ActiveTexture(texture, BlockFacings.Front, Arrays.asList(
                        BlockFacings.Bottom, BlockFacings.Top, BlockFacings.Sides, BlockFacings.Front)), new TileLogic())
                        .setTileEntity(EnumHelper.getTile(EnumMachines.machineOven)).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setUnlocalizedName(EnumMachines.machineOven)
                        .setHardness(3.0F));

        texture = EnumHelper.getTexture(EnumMachines.machineRoller, Locations.TEXTURE + "machine/");

        SubBlock.setUp(
                EnumMachines.machineRoller,
                new SubBlock(Properties.machineBlockID, EnumMachines.machineRoller.ordinal(), Material.iron, new ActiveTexture(texture, BlockFacings.Front, Arrays.asList(
                        BlockFacings.Bottom, BlockFacings.Top, BlockFacings.Sides, BlockFacings.Front)), new TileLogic())
                        .setTileEntity(EnumHelper.getTile(EnumMachines.machineRoller)).setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                        .setUnlocalizedName(EnumMachines.machineRoller).setHardness(3.0F));

        texture = EnumHelper.getTexture(EnumMachines.storageCounter, Locations.TEXTURE + "storage/");

        SubBlock.setUp(
                EnumMachines.storageCounter,
                new SubBlock(Properties.machineBlockID, EnumMachines.storageCounter.ordinal(), new MultyTexture(texture, Arrays.asList(BlockFacings.Bottom, BlockFacings.Top,
                        BlockFacings.Sides, BlockFacings.Front)), new TileLogic()).setTileEntity(EnumHelper.getTile(EnumMachines.storageCounter))
                        .setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setUnlocalizedName(EnumMachines.storageCounter).setHardness(3.0F));

        texture = EnumHelper.getTexture(EnumMachines.storageBarrel, Locations.TEXTURE + "storage/");

        SubBlock.setUp(
                EnumMachines.storageBarrel,
                new SubBlock(Properties.machineBlockID, EnumMachines.storageBarrel.ordinal(), Material.wood, new MultyTexture(texture, Arrays.asList(BlockFacings.Bottom,
                        BlockFacings.Top, BlockFacings.Sides)), new TileInventory()).setTileEntity(EnumHelper.getTile(EnumMachines.storageBarrel))
                        .setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setUnlocalizedName(EnumMachines.storageBarrel).setHardness(3.0F));

        texture = EnumHelper.getTexture(EnumMachines.storageCabinet, Locations.TEXTURE + "storage/");

        SubBlock.setUp(
                EnumMachines.storageCabinet,
                new SubBlock(Properties.machineBlockID, EnumMachines.storageCabinet.ordinal(), Material.wood, new MultyTexture(texture, Arrays.asList(BlockFacings.Bottom,
                        BlockFacings.Top, BlockFacings.Sides, BlockFacings.Front)), new TileInventory()).setTileEntity(EnumHelper.getTile(EnumMachines.storageCabinet))
                        .setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setUnlocalizedName(EnumMachines.storageCabinet).setHardness(3.0F));
    }
}