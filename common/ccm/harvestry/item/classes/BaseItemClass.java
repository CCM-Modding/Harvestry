package ccm.harvestry.item.classes;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class BaseItemClass extends Item
{

    public BaseItemClass(final int id)
    {
        super(id - 256);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public abstract void registerIcons(IconRegister iconRergister);
}
