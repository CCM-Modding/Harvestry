package ccm.harvestry.block.enums;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.omnium.block.sub.SubBlock;
import ccm.nucleum.omnium.block.sub.SubCrop;
import ccm.nucleum.omnium.block.sub.tick.CropGrowth;
import ccm.nucleum.omnium.utils.helper.TextureHelper;
import ccm.nucleum.omnium.utils.helper.enums.EnumHelper;
import ccm.nucleum.omnium.utils.helper.enums.IBlockEnum;

public enum EnumPlants implements IBlockEnum
{
    cropCorn(1),
    cropLettuce(1),
    cropOnion(1);

    private final int stages;
    private final DropBundle drops;

    private EnumPlants(DropBundle drops, int stages)
    {
        this.stages = stages;
        this.drops = drops;
    }

    public int getStages()
    {
        return stages;
    }

    public DropBundle getDrops()
    {
        return drops;
    }

    public void register()
    {
        SubBlock.setUp(
                this,
                new SubCrop(Properties.cropID, ordinal(), Material.plants, TextureHelper.getTexture(name(), Locations.TEXTURE), stages, drops)
                        .setCreativeTab(HarvestryTabs.tabHarvestryBlocks).addDisplayListener(new CropGrowth()).setTileEntity(EnumHelper.getTile(this)));
    }

    public static void registerAll()
    {
        for (EnumPlants plant : values())
        {
            plant.register();
        }
    }

    private static Block mainBlock;

    @Override
    public void setBaseBlock(final Block base)
    {
        mainBlock = base;
    }

    @Override
    public Block getBaseBlock()
    {
        return mainBlock;
    }
}