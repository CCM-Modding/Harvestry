package ccm.harvestry.enums.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IBlockEnum;

import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.utils.lib.Locations;

public enum EnumOres implements IBlockEnum
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

    @Override
    public Block getBaseBlock()
    {
        return ModBlocks.ores;
    }
}