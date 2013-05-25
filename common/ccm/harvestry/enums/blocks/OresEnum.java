package ccm.harvestry.enums.blocks;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum OresEnum
{
    oreSalt,
    oreAluminum;

    private Icon        icon;

    public final String texture;

    public static void registerIcons(final IconRegister register)
    {
        for (final OresEnum ore : OresEnum.values()){
            ore.icon = register.registerIcon(ore.texture);
        }
    }

    private OresEnum()
    {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE);
    }

    public Icon getIcon()
    {
        return this.icon;
    }
}