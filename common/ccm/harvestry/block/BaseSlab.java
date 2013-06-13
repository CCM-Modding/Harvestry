package ccm.harvestry.block;

import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.utils.lib.Locations;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseSlab extends BlockHalfSlab {

    public BaseSlab(final int id, final boolean par2, final Material material) {
        super(id, par2, material);
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }

    public BaseSlab(final int id, final boolean par2) {
        super(id, par2, Material.ground);
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }

    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Locations.TEXTURE + this.getUnlocalizedName2());
    }

    @Override
    public String getFullSlabName(final int i) {
        // TODO Auto-generated method stub
        return null;
    }

}
