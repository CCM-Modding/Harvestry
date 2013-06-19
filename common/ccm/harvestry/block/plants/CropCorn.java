package ccm.harvestry.block.plants;

import net.minecraft.client.renderer.texture.IconRegister;
import ccm.harvestry.block.ModCrops;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.items.EnumUncookedFood;
import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CropCorn extends ModCrops {
    
    /**
     * Creates a new Block instance capable of being a Crop
     * 
     * @param id
     *            The Block ID.
     */
    public CropCorn(final int id) {
        super(id);
        setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }
    
    /**
     * Generate a crop produce ItemStack for this crop.
     */
    @Override
    protected int getCropItem() {
        return EnumUncookedFood.uncookedCorn.ordinal();
    }
    
    /**
     * Generate a seed ItemStack for this crop.
     */
    @Override
    protected int getSeedItem() {
        return EnumUncookedFood.uncookedSeedsCorn.ordinal();
    }
    
    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(getUnlocalizedName2() + "_0", Locations.TEXTURE + "plant/"));
    }
}