package ccm.harvestry.enums.blocks;

import net.minecraft.block.Block;
import ccm.nucleum_omnium.helper.enums.IBlockEnum;

public enum EnumOres implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    oreSalt,
    oreAluminum;
    
    private static Block mainBlock;
    
    @Override
    public void setBaseBlock(final Block base) {
        mainBlock = base;
    }
    
    @Override
    public Block getBaseBlock() {
        return mainBlock;
    }
}