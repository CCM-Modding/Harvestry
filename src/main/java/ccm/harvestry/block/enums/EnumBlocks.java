/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.block.enums;

import net.minecraft.block.Block;

import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumBlocks implements IBlockEnum
{
    // Make sure to keep this lower than 16 AT ALL TIMES
    blockSugar, blockAluminum(3), blockCheese, blockButter;

    private EnumBlocks()
    {
        this(1);
    }

    private EnumBlocks(final float hardness)
    {
        SubBlock.createAndSetUp(this, Properties.stgBlockID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(hardness);
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