package harvestry.block;

import harvestry.Harvestry;
import harvestry.configuration.Config;
import harvestry.core.helpers.TextureHelper;
import harvestry.tileentity.TileRoller;
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

public class BlockRoller extends BaseContainerBlock
{

    public static void updateBlockState(final boolean working, final World world, final int x, final int y, final int z)
    {
        final int blockID = world.getBlockMetadata(x, y, z);
        final TileEntity tileentity = world.getBlockTileEntity(x, y, z);
        keepInventory = true;
        if (working){
            world.setBlock(x, y, z, ModBlocks.blockRollerRunning.blockID);
        }else{
            world.setBlock(x, y, z, ModBlocks.blockRoller.blockID);
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
    public BlockRoller(final int id,
                       final boolean active)
    {
        super(id, active);
    }

    @Override
    public TileEntity createNewTileEntity(final World world)
    {
        return new TileRoller();
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
        }else if (side == metadata){
            return this.frontIcon;
        }else{
            return this.blockIcon;
        }
    }

    @Override
    public ItemStack getPickBlock(final MovingObjectPosition target, final World world, final int x, final int y, final int z)
    {
        return new ItemStack(Config.blockRollerID, 1, 0);
    }

    @Override
    public int idDropped(final int meta, final Random random, final int fortune)
    {
        return Config.blockRollerID;
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
        final TileRoller roller = (TileRoller) world.getBlockTileEntity(x, y, z);
        if (roller != null){
            player.openGui(Harvestry.instance, TileConstants.ROLLER_GUID, world, x, y, z);
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
        this.blockIcon = iconRegister.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "Side", "machine/"));
        this.bottomIcon = iconRegister.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "Bottom", "machine/"));
        this.frontIcon = iconRegister.registerIcon(this.isActive ? TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "FrontOn", "machine/")
                                                                : TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "FrontOff", "machine/"));
    }
}