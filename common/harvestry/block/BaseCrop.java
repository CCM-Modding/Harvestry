package harvestry.block;

import harvestry.creativetab.HarvestryTabs;
import harvestry.utils.lib.Locations;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseCrop extends BlockCrops
{

    /**
     * Creates a new Block instance capable of being a Crop
     * 
     * @param id
     *            The Block ID.
     */
    public BaseCrop(final int id)
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
        return Item.wheat.itemID;
    }

    /**
     * Generate a seed ItemStack for this crop.
     */
    @Override
    protected int getSeedItem()
    {
        return Item.seeds.itemID;
    }

    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(Locations.TEXTURE + this.getUnlocalizedName2());
    }
}