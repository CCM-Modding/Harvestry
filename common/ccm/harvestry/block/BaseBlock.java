package ccm.harvestry.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.utils.lib.Locations;

public class BaseBlock extends Block
{

    /**
     * Creates a new Block Instance.
     * 
     * @param id
     *            The Block ID
     */
    public BaseBlock(final int id)
    {
        super(id, Material.ground);
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }

    /**
     * Creates a new Block Instance.
     * 
     * @param id
     *            The Block ID
     * @param material
     *            The Material
     */
    public BaseBlock(final int id,
                     final Material material)
    {
        super(id, material);
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
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