package harvestry.block.plants;

import harvestry.block.BaseCrop;
import harvestry.creativetab.HarvestryTabs;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumNonStack;
import harvestry.utils.lib.Locations;
import net.minecraft.client.renderer.texture.IconRegister;
import nucleum_omnium.helper.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CropLettuce extends BaseCrop
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
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    @Override
    protected int getCropItem()
    {
        return EnumNonStack.itemLettuceLeaf.ordinal();
    }

    /**
     * Generate a seed ItemStack for this crop.
     */
    @Override
    protected int getSeedItem()
    {
        return EnumBaseItem.seedsLettuce.ordinal();
    }

    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(this.getUnlocalizedName2() + "_0", Locations.TEXTURE + "plant/"));
    }
}