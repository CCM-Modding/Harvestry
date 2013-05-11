package harvestry.block;

import harvestry.Harvestry;
import harvestry.configuration.Config;
import harvestry.core.helpers.TextureHelper;
import harvestry.tileentity.TileBarrel;
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

public class BlockBarrel extends BaseContainerBlock
{

    /**
     * @param id
     */
    public BlockBarrel(final int id)
    {
        super(id, false);
    }

    @Override
    public TileEntity createNewTileEntity(final World world)
    {
        return new TileBarrel();
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
        return new ItemStack(Config.blockBarrelID, 1, 0);
    }

    @Override
    public int idDropped(final int meta, final Random random, final int fortune)
    {
        return Config.blockBarrelID;
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
        final TileBarrel barrel = (TileBarrel) world.getBlockTileEntity(x, y, z);
        if (barrel != null){
            player.openGui(Harvestry.instance, TileConstants.BARREL_GUID, world, x, y, z);
            return true;
        }else{
            return false;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        this.topIcon = iconRegister.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "TopFull", "storage/"));
        this.bottomIcon = iconRegister.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "Bottom", "storage/"));
        this.blockIcon = iconRegister.registerIcon(TextureHelper.getTextureFromNameInFolder(this.getUnlocalizedName2() + "Side", "storage/"));
    }
}