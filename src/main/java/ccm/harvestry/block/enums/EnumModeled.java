/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.block.enums;

import net.minecraft.block.Block;

import ccm.harvestry.Harvestry;
import ccm.nucleum.omnium.client.model.AdvancedBaseModel;
import ccm.nucleum.omnium.utils.handler.TextureHandler;
import ccm.nucleum.omnium.utils.helper.enums.IBlockEnum;

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
