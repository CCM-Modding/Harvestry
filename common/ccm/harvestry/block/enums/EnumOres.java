/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.block.enums;

import net.minecraft.block.Block;

import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.omnium.block.sub.SubBlock;
import ccm.nucleum.omnium.utils.helper.enums.IBlockEnum;

public enum EnumOres implements IBlockEnum
{
    // Make sure to keep this lower than 16 AT ALL TIMES
    oreSalt,
    oreAluminum;

    private EnumOres()
    {
        SubBlock.createAndSetUp(this, Properties.oreID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(5.0F);
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