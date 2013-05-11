package harvestry.block;

import harvestry.creativetab.HarvestryTabs;
import harvestry.utils.lib.Locations;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseSlab extends BlockHalfSlab
{

    @SuppressWarnings("static-access")
    public BaseSlab(final int id,
                    final boolean par2,
                    final Material Material)
    {
        super(id, par2, Material.ground);
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

    @Override
    public String getFullSlabName(final int i)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
