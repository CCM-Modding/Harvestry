package ccm.harvestry.enums.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;


import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum.helper.TextureHelper;
import ccm.nucleum.helper.enums.IBlockEnum;

public enum EnumBush implements IBlockEnum
{
    bushGrape,
    bushGrape_Ripe,
    bushBlueberry,
    bushBlueberry_Ripe,
    bushStrawberry,
    bushStrawberry_Ripe;

    private Icon        fastIcon;

    private Icon        fancyIcon;

    public final String texture;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumBush bush : EnumBush.values()){
            bush.fastIcon = register.registerIcon(bush.texture + "_Fast");
            bush.fancyIcon = register.registerIcon(bush.texture + "_Fancy");
        }
    }

    private EnumBush()
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE);
    }

    @Override
    public Icon getIcon()
    {
        return this.fastIcon;
    }

    public Icon getFancyIcon()
    {
        return this.fancyIcon;
    }

    @Override
    public Block getBaseBlock()
    {
        return ModBlocks.bushes;
    }
}