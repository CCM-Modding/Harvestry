package harvestry.item.tool;

import harvestry.core.helpers.TextureHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DummySword extends ItemSword
{

    public DummySword(final int par1,
                      final EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(CreativeTabs.tabTools);
        // TODO Auto-generated constructor stub
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register)
    {
        this.itemIcon = register.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName(), "tools/"));
    }
}
