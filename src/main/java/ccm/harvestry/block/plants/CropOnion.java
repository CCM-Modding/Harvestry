package ccm.harvestry.block.plants;

import net.minecraft.client.renderer.texture.IconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.block.ModCrops;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.items.EnumItem;

public class CropOnion extends ModCrops
{

    /**
     * Creates a new Block instance capable of being a Crop
     * 
     * @param id
     *            The Block ID.
     */
    public CropOnion(final int id)
    {
        super(id);
        setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    @Override
    protected int getCropItem()
    {
        return EnumItem.itemOnion.ordinal();
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    @Override
    protected int getSeedItem()
    {
        return EnumItem.itemOnion.ordinal();
    }

    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        // blockIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(
        // getUnlocalizedName2() + "_0",
        // Locations.TEXTURE + "plant/"));
    }
}