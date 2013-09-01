/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.item.classes;

import net.minecraft.client.renderer.texture.IconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum.omnium.utils.helper.TextureHelper;

public class BaseUseableItem extends BaseItemClass
{

    public BaseUseableItem(final int id, final int maxDamage)
    {
        super(id);
        setMaxStackSize(1);
        setHasSubtypes(false);
        setMaxDamage(maxDamage);
        setCreativeTab(HarvestryTabs.tabHarvestryUsable);
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register)
    {
        itemIcon = register.registerIcon(TextureHelper.getTexture(this, Locations.TEXTURE));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }
}