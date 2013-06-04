package ccm.harvestry.enums.blocks;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IEnum;

public enum EnumOres implements IEnum
{
    oreSalt,
    oreAluminum;

    private Icon        icon;

    public final String texture;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumOres ore : EnumOres.values()){
            ore.icon = register.registerIcon(ore.texture);
        }
    }

    private EnumOres()
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE);
    }

    @Override
    public Icon getIcon()
    {
        return this.icon;
    }
}