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

    private float hardness;

    private EnumOres(float hardness)
    {
        this.hardness = hardness;
    }

    private EnumOres()
    {
        this(5);
    }

    public void register()
    {
        SubBlock.createAndSetUp(this, Properties.oreID, Locations.TEXTURE).setCreativeTab(HarvestryTabs.tabHarvestryBlocks).setHardness(hardness);
    }

    public static void registerAll()
    {
        for (EnumOres ore : values())
        {
            ore.register();
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