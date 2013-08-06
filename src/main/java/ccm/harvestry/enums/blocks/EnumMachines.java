/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.enums.blocks;

import net.minecraft.block.Block;

import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumMachines implements IBlockEnum
{
    // Make sure to keep this lower than 16 AT ALL TIMES
    machineGrinder,
    machineOven,
    machineRoller,
    storageCounter,
    storageBarrel,
    storageCabinet;

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