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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


import ccm.harvestry.Harvestry;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.tileentity.TileRoller;
import ccm.harvestry.utils.lib.Locations;
import ccm.harvestry.utils.lib.Properties;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum.handler.GUIHandler;
import ccm.nucleum.helper.TextureHelper;

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
        return new ItemStack(Properties.blockRollerID, 1, 0);
    }

    @Override
    public int idDropped(final int meta, final Random random, final int fortune)
    {
        return Properties.blockRollerID;
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
            GUIHandler.openGui(Harvestry.instance, TileConstants.ROLLER_GUID, player, world, x, y, z);
            return true;
        }else{
            return false;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        this.topIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(this.getUnlocalizedName2() + "Top", Locations.TEXTURE + "machine/"));
        this.blockIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(this.getUnlocalizedName2() + "Side", Locations.TEXTURE + "machine/"));
        this.bottomIcon = iconRegister.registerIcon(TextureHelper.getTextureFromName(this.getUnlocalizedName2() + "Bottom", Locations.TEXTURE + "machine/"));
        this.frontIcon = iconRegister.registerIcon(this.isActive ? TextureHelper.getTextureFromName(this.getUnlocalizedName2() + "FrontOn", Locations.TEXTURE + "machine/")
                                                                : TextureHelper.getTextureFromName(this.getUnlocalizedName2() + "FrontOff", Locations.TEXTURE + "machine/"));
    }
}