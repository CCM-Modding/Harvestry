package ccm.harvestry.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IItemEnum;

import ccm.harvestry.utils.lib.Locations;

public enum EnumBerry implements IItemEnum
{
    berryGrape(4, 0.4F),
    berryBlue(5, 0.4F),
    berryStrawberry(4, 0.6F);

    public final String texture;

    public final int    heal;

    public final float  saturation;

    private Icon        icon;

    private EnumBerry(final int heal,
                      final float saturation)
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "food/berrys/");
        this.heal = heal;
        this.saturation = saturation;
    }

    @Override
    public Icon getIcon()
    {
        return this.icon;
    }

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumBerry item : EnumBerry.values()){
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