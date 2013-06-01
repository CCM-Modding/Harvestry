package ccm.harvestry.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.creativetab.HarvestryTabs;

public abstract class ModCrops extends BlockCrops
{

    /**
     * Creates a new Block instance capable of being a Crop
     * 
     * @param id
     *            The Block ID.
     */
    public ModCrops(final int id)
    {
        super(id);
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    @Override
    protected abstract int getCropItem();

    /**
     * Generate a seed ItemStack for this crop.
     */
    @Override
    protected abstract int getSeedItem();

    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public abstract void registerIcons(final IconRegister iconRegister);
}