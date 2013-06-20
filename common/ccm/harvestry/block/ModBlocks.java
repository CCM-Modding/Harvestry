package ccm.harvestry.block;

import net.minecraft.block.Block;
import ccm.harvestry.block.plants.CropCorn;
import ccm.harvestry.block.plants.CropLettuce;
import ccm.harvestry.block.plants.CropOnion;
import ccm.harvestry.utils.lib.BlockNames;
import ccm.harvestry.utils.lib.Properties;

public final class ModBlocks {
    
    public static Block cropOnion;
    
    public static Block cropLettuce;
    
    public static Block cropCorn;
    
    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init() {
        
        ModBlocks.cropOnion = new CropOnion(Properties.cropOnionID).setUnlocalizedName(BlockNames.cropOnion);
        ModBlocks.cropLettuce = new CropLettuce(Properties.cropLettuceID).setUnlocalizedName(BlockNames.cropLettuce);
        ModBlocks.cropCorn = new CropCorn(Properties.cropCornID).setUnlocalizedName(BlockNames.cropCorn);
    }
}