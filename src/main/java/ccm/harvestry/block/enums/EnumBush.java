/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.block.enums;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumBush implements IBlockEnum
{
    bushGrape, bushGrape_Ripe, bushBlueberry, bushBlueberry_Ripe, bushStrawberry, bushStrawberry_Ripe;

    private Icon fastIcon;

    private Icon fancyIcon;

    public final String texture;

    private Block bushBlock;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumBush bush : EnumBush.values())
        {
            bush.fastIcon = register.registerIcon(bush.texture + "_Fast");
            bush.fancyIcon = register.registerIcon(bush.texture + "_Fancy");
        }
    }

    private EnumBush()
    {
        texture = TextureHandler.getTextureFromName(name(), Locations.TEXTURE);
    }

    public Icon getIcon()
    {
        return fastIcon;
    }

    public Icon getFancyIcon()
    {
        return fancyIcon;
    }

    @Override
    public Block getBaseBlock()
    {
        return bushBlock;
    }

    @Override
    public void setBaseBlock(final Block base)
    {
        bushBlock = base;
    }
}