/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.item.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum.omnium.utils.helper.TextureHelper;
import ccm.nucleum.omnium.utils.helper.enums.IItemEnum;

public enum EnumBerry implements IItemEnum
{
    berryGrape(4, 0.4F),
    berryBlue(5, 0.4F),
    berryStrawberry(4, 0.6F);

    public final String texture;

    public final int heal;

    public final float saturation;

    private Icon icon;

    private EnumBerry(final int heal, final float saturation)
    {
        texture = TextureHelper.getTexture(name(), Locations.TEXTURE + "food/berrys/");
        this.heal = heal;
        this.saturation = saturation;
    }

    @Override
    public Icon getIcon()
    {
        return icon;
    }

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumBerry item : EnumBerry.values())
        {
            item.icon = register.registerIcon(item.texture);
        }
    }

    @Override
    public Item getBaseItem()
    {
        // TODO FIXME
        return null;
    }
}