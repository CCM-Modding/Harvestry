package ccm.harvestry.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum BerryEnum
{
    berryBlue(5, 0.4F),
    berryCherry(5, 0.4F),
    berryStrawberry(4, 0.6F),
    berryStrawberrySugar(5, 0.4F);

    public final String texture;

    public final int    heal;

    public final float  saturation;

    private Icon        icon;

    private BerryEnum(final int heal,
                      final float saturation)
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "berrys/");
        this.heal = heal;
        this.saturation = saturation;
    }

    public Icon getIcon()
    {
        return this.icon;
    }

    public static void registerIcons(final IconRegister register)
    {
        for (final BerryEnum item : BerryEnum.values()){
            item.icon = register.registerIcon(item.texture);
        }
    }
}