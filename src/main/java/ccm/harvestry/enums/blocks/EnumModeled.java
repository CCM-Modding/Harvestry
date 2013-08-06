/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.enums.blocks;

import net.minecraft.block.Block;

import ccm.harvestry.Harvestry;
import ccm.nucleum_omnium.client.model.AdvancedBaseModel;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

/**
 * EnumModeled
 * <p>
 * 
 * @author Captain_Shadows
 */
public enum EnumModeled implements IBlockEnum
{
    machineGrill;
    // machineButterChurn,
    // machineJuicer,
    // machineTank,
    // blockSink;

    private final AdvancedBaseModel model;

    /**
     * Adds their Textures and Models
     */
    private EnumModeled()
    {
        TextureHandler.addModel(Harvestry.instance, this);
        TextureHandler.addModelTexture(Harvestry.instance, this);
        model = new AdvancedBaseModel(this);
    }

    public AdvancedBaseModel getModel()
    {
        return model;
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
