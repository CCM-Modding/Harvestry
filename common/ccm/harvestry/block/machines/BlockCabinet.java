package ccm.harvestry.block.machines;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import ccm.harvestry.Harvestry;
import ccm.harvestry.tileentity.TileCabinet;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.GUIHandler;
import ccm.nucleum_omnium.helper.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCabinet extends BaseContainerBlock {
    
    /**
     * @param id
     */
    public BlockCabinet(final int id) {
        super(id, false);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World world) {
        return new TileCabinet();
    }
    
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(final int side, final int metadata) {
        if (side == ForgeDirection.UP.ordinal()) {
            return topIcon;
        } else if (side == ForgeDirection.DOWN.ordinal()) {
            return bottomIcon;
        } else if (side == metadata) {
            return frontIcon;
        } else {
            return blockIcon;
        }
    }
    
    @Override
    public boolean onBlockActivated(final World world,
                                    final int x,
                                    final int y,
                                    final int z,
                                    final EntityPlayer player,
                                    final int wut,
                                    final float clickX,
                                    final float clickY,
                                    final float clockZ) {
        super.onBlockActivated(world, x, y, z, player, wut, clockZ, clockZ, clockZ);
        final TileCabinet cabinet = (TileCabinet) world.getBlockTileEntity(x, y, z);
        if (cabinet != null) {
            GUIHandler.openGui(Harvestry.instance, TileConstants.CABINET_ID, player, world, x, y, z);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister) {
        topIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(getUnlocalizedName2() + "Top", Locations.TEXTURE + "storage/"));
        blockIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(getUnlocalizedName2() + "Side", Locations.TEXTURE + "storage/"));
        bottomIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(getUnlocalizedName2() + "Bottom", Locations.TEXTURE + "storage/"));
        frontIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(getUnlocalizedName2() + "Front", Locations.TEXTURE + "storage/"));
    }
}