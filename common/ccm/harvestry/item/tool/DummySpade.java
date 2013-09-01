/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.item.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum.omnium.utils.helper.TextureHelper;

public class DummySpade extends ItemSpade
{

    public DummySpade(final int par1, final EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        setCreativeTab(CreativeTabs.tabTools);
        // TODO Auto-generated constructor stub
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register)
    {
        itemIcon = register.registerIcon(TextureHelper.getTexture(this.getUnlocalizedName(), Locations.TEXTURE + "tools/"));
    }
}
