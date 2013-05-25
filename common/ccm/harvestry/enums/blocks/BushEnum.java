package ccm.harvestry.enums.blocks;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum BushEnum
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
        for (final BushEnum bush : BushEnum.values()){
            bush.fastIcon = register.registerIcon(bush.texture + "_Fast");
            bush.fancyIcon = register.registerIcon(bush.texture + "_Fancy");
        }
    }

    private BushEnum()
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE);
    }

    public Icon getFastIcon()
    {
        return this.fastIcon;
    }

    public Icon getFancyIcon()
    {
        return this.fancyIcon;
    }
}