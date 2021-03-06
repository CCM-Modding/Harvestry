package ccm.harvestry.block.plants;

import net.minecraft.client.renderer.texture.IconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.block.ModCrops;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.item.enums.EnumItemSixteen;

public class CropLettuce extends ModCrops
{

    /**
     * Creates a new Block instance capable of being a Crop
     * 
     * @param id
     *            The Block ID.
     */
    public CropLettuce(final int id)
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
        return EnumItemSixteen.itemLettuceLeaf.ordinal();
    }

    /**
     * Generate a seed ItemStack for this crop.
     */
    @Override
    protected int getSeedItem()
    {
        return EnumItem.seedsLettuce.ordinal();
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