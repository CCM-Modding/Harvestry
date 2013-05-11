package harvestry.block;

import harvestry.Harvestry;
import harvestry.configuration.Config;
import harvestry.core.helpers.TextureHelper;
import harvestry.tileentity.TileGrinder;
import harvestry.utils.lib.TileConstants;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrinder extends BaseContainerBlock
{

    public static void updateBlockState(final boolean working, final World world, final int x, final int y, final int z)
    {
        final int blockID = world.getBlockMetadata(x, y, z);
        final TileEntity tileentity = world.getBlockTileEntity(x, y, z);
        keepInventory = true;
        if (working){
            world.setBlock(x, y, z, ModBlocks.blockGrinderRunning.blockID);
        }else{
            world.setBlock(x, y, z, ModBlocks.blockGrinder.blockID);
        }
        keepInventory = false;
        world.setBlockMetadataWithNotify(x, y, z, blockID, 3);
        world.markBlockForRenderUpdate(x, y, z);
        if (tileentity != null){
            tileentity.validate();
            world.setBlockTileEntity(x, y, z, tileentity);
        }
    }

    /**
     * @param id
     */
    public BlockGrinder(final int id,
                        final boolean active)
    {
        super(id, active);
    }

    @Override
    public TileEntity createNewTileEntity(final World world)
    {
        return new TileGrinder();
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture.
     * Args: side, metadata
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(final int side, final int metadata)
    {
        if (side == ForgeDirection.UP.ordinal()){
            return this.topIcon;
        }else if (side == ForgeDirection.DOWN.ordinal()){
            return this.bottomIcon;
        }else{
            return this.blockIcon;
        }
    }

    @Override
    public ItemStack getPickBlock(final MovingObjectPosition target, final World world, final int x, final int y, final int z)
    {
        return new ItemStack(Config.blockGrinderID, 1, 0);
    }

    @Override
    public int idDropped(final int meta, final Random random, final int fortune)
    {
        return Config.blockGrinderID;
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
                                    final float clockZ)
    {
        super.onBlockActivated(world, x, y, z, player, wut, clockZ, clockZ, clockZ);
        final TileGrinder grinder = (TileGrinder) world.getBlockTileEntity(x, y, z);
        if (grinder != null){
            player.openGui(Harvestry.instance, TileConstants.GRINDER_GUID, world, x, y, z);
            return true;
        }else{
            return false;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        this.topIcon = iconRegister.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "Top", "machine/"));
        this.bottomIcon = iconRegister.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "Bottom", "machine/"));
        this.blockIcon = iconRegister.registerIcon(this.isActive ? TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "SideOn", "machine/")
                                                                : TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "SideOff", "machine/"));
    }
}