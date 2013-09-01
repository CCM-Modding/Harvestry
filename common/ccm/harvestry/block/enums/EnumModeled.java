/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.block.enums;

import net.minecraft.block.Block;

import ccm.harvestry.Harvestry;
import ccm.nucleum.omnium.client.model.AdvancedBaseModel;
import ccm.nucleum.omnium.utils.handler.ResourceHandler;
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
        ResourceHandler.addModel(Harvestry.instance, name());
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
