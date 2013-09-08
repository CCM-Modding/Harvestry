/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.block.enums;

import net.minecraft.block.Block;

import ccm.harvestry.Harvestry;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.omnium.block.sub.SubBlock;
import ccm.nucleum.omnium.block.sub.SubModelled;
import ccm.nucleum.omnium.block.tile.TileLogic;
import ccm.nucleum.omnium.client.model.AdvancedBaseModel;
import ccm.nucleum.omnium.utils.handler.ResourceHandler;
import ccm.nucleum.omnium.utils.helper.enums.EnumHelper;
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

    private final float hardness;

    private EnumModeled(float hardness)
    {
        ResourceHandler.addModel(Harvestry.instance, name());
        model = new AdvancedBaseModel(this);
        this.hardness = hardness;
    }
    
    private EnumModeled()
    {
        this(3);
    }

    public AdvancedBaseModel getModel()
    {
        return model;
    }

    public void register()
    {
        SubBlock.setUp(this,
                new SubModelled(Properties.modeledBlockID, ordinal(), new TileLogic()).setTileEntity(EnumHelper.getTile(this)).setCreativeTab(HarvestryTabs.tabHarvestryBlocks)
                        .setUnlocalizedName(this).setHardness(hardness));
    }

    public static void registerAll()
    {
        for (EnumModeled machine : values())
        {
            machine.register();
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
