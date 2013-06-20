package ccm.harvestry.block.machines;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import ccm.harvestry.Harvestry;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.tileentity.TileCounter;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.GUIHandler;
import ccm.nucleum_omnium.helper.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCounter extends BaseContainerBlock {
    
    public static void updateBlockState(final boolean working, final World world, final int x, final int y, final int z) {
        final int meta = world.getBlockMetadata(x, y, z);
        final TileEntity tileentity = world.getBlockTileEntity(x, y, z);
        BaseContainerBlock.keepInventory = true;
        if (working) {
            world.setBlock(x, y, z, ModBlocks.blockCounter.blockID);
        } else {
            world.setBlock(x, y, z, ModBlocks.blockCounter.blockID);
        }
        BaseContainerBlock.keepInventory = false;
        world.setBlockMetadataWithNotify(x, y, z, meta, 3);
        world.markBlockForRenderUpdate(x, y, z);
        if (tileentity != null) {
            tileentity.validate();
            world.setBlockTileEntity(x, y, z, tileentity);
        }
    }
    
    /**
     * @param id
     */
    public BlockCounter(final int id, final boolean active) {
        super(id, active);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World world) {
        return new TileCounter();
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
    public ItemStack getPickBlock(final MovingObjectPosition target, final World world, final int x, final int y, final int z) {
        return new ItemStack(Properties.blockCounterID, 1, 0);
    }
    
    @Override
    public int idDropped(final int meta, final Random random, final int fortune) {
        return Properties.blockCounterID;
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
        final TileCounter counter = (TileCounter) world.getBlockTileEntity(x, y, z);
        if (counter != null) {
            GUIHandler.openGui(Harvestry.instance, TileConstants.COUNTER_ID, player, world, x, y, z);
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