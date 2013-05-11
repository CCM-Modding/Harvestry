package harvestry.block.plants;

import harvestry.block.BaseCrop;
import harvestry.core.helpers.TextureHelper;
import harvestry.creativetab.HarvestryTabs;
import harvestry.item.enums.EnumBaseItem;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CropOnion extends BaseCrop
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
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    @Override
    protected int getCropItem()
    {
        return EnumBaseItem.itemOnion.ordinal();
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    @Override
    protected int getSeedItem()
    {
        return EnumBaseItem.itemOnion.ordinal();
    }

    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "_0", "plant/"));
    }
}