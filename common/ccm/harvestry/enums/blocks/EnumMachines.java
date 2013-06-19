package ccm.harvestry.enums.blocks;

import net.minecraft.block.Block;
import ccm.nucleum_omnium.helper.enums.IBlockEnum;

public enum EnumMachines implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    machineGrinder,
    machineGrinderRunning,
    machineOven,
    machineOvenRunning,
    machineRoller,
    machineRollerRunning,
    machineCounter,
    machineBarrel,
    machineCabinet,
    machineGrill,
    machineGrillRunning;
    
    private static Block mainBlock;
    
    @Override
    public void setBaseBlock(Block base) {
        mainBlock = base;
    }
    
    @Override
    public Block getBaseBlock() {
        return mainBlock;
    }
}