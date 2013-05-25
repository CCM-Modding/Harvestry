package ccm.harvestry.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.blocks.BushEnum;
import ccm.harvestry.enums.items.BerryEnum;
import ccm.harvestry.utils.lib.BushRender;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseBush extends BlockLeavesBase implements IPlantable
{

    Random                     random;

    private static BushEnum[]  bushes = BushEnum.values();

    private static BerryEnum[] berrys = BerryEnum.values();

    public BaseBush(final int id)
    {
        super(id, Material.leaves, false);
        this.setTickRandomly(true);
        this.random = new Random();
        this.setHardness(0.3F);
        this.setStepSound(Block.soundGrassFootstep);
        this.setUnlocalizedName("bush");
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
    }

    /* Berries show up at meta 12-15 */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        BushEnum.registerIcons(iconRegister);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(final int side, final int meta)
    {
        if (this.graphicsLevel){
            this.blockIcon = bushes[meta].getFancyIcon();
            return this.blockIcon;
        }else{
            this.blockIcon = bushes[meta].getFastIcon();
            return this.blockIcon;
        }
    }

    /* Bushes are stored by size then type */
    @Override
    public int damageDropped(final int metadata)
    {
        return metadata;
    }

    /* The following methods define a berry bush's size depending on metadata */
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World world, final int x, final int y, final int z)
    {
        final int l = world.getBlockMetadata(x, y, z);
        if (l < 4){
            return AxisAlignedBB.getBoundingBox(x + 0.25D, y, z + 0.25D, x + 0.75D, y + 0.5D, z + 0.75D);
        }else if (l < 8){
            return AxisAlignedBB.getBoundingBox(x + 0.125D, y, z + 0.125D, x + 0.875D, y + 0.75D, z + 0.875D);
        }else{
            return AxisAlignedBB.getBoundingBox(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D);
        }
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool(final World world, final int x, final int y, final int z)
    {
        final int l = world.getBlockMetadata(x, y, z);
        if (l < 4){
            return AxisAlignedBB.getBoundingBox(x + 0.25D, y, z + 0.25D, x + 0.75D, y + 0.5D, z + 0.75D);
        }else if (l < 8){
            return AxisAlignedBB.getBoundingBox(x + 0.125D, y, z + 0.125D, x + 0.875D, y + 0.75D, z + 0.875D);
        }else{
            return AxisAlignedBB.getBoundingBox(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D);
        }
    }

    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess iblockaccess, final int x, final int y, final int z)
    {
        final int md = iblockaccess.getBlockMetadata(x, y, z);

        float minX;
        final float minY = 0F;
        float minZ;
        float maxX;
        float maxY;
        float maxZ;

        if (md < 4){
            minX = minZ = 0.25F;
            maxX = maxZ = 0.75F;
            maxY = 0.5F;
        }else

        if (md < 8){
            minX = minZ = 0.125F;
            maxX = maxZ = 0.875F;
            maxY = 0.75F;
        }

        else{
            minX = minZ = 0.0F;
            maxX = maxZ = 1.0F;
            maxY = 1.0F;
        }
        this.setBlockBounds(minX, minY, minZ, maxX, maxY, maxZ);
    }

    /* Left-click harvests berries */
    @Override
    public void onBlockClicked(final World world, final int x, final int y, final int z, final EntityPlayer player)
    {
        if (!world.isRemote){
            final int meta = world.getBlockMetadata(x, y, z);
            if (meta >= 12){
                world.setBlock(x, y, z, this.blockID, meta - 4, 3);
                //final EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(NContent.berryItem.itemID, 1));
                //world.spawnEntityInWorld(entityitem);
                //entityitem.onCollideWithPlayer(player);
            }
        }
    }

    /* Right-click harvests berries */
    @Override
    public boolean onBlockActivated(final World world,
                                    final int x,
                                    final int y,
                                    final int z,
                                    final EntityPlayer player,
                                    final int par6,
                                    final float par7,
                                    final float par8,
                                    final float par9)
    {
        final int meta = world.getBlockMetadata(x, y, z);

        if (world.isRemote){
            return false;
        }else{
            world.setBlock(x, y, z, this.blockID, meta - 4, 3);
            // final EntityItem entityitem = new EntityItem(world, player.posX, player.posY - 1.0D,
            // player.posZ, new ItemStack(NContent.berryItem.itemID, 1, meta - 12));
            // world.spawnEntityInWorld(entityitem);
            // entityitem.onCollideWithPlayer(player);
            return true;
        }
    }

    /* Render logic */
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    public void setGraphicsLevel(final boolean flag)
    {
        this.graphicsLevel = flag;
        // this.blockIndexInTexture = this.icon + (flag ? 0 : 32);
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return BushRender.berryModel;
    }

    @Override
    public boolean shouldSideBeRendered(final IBlockAccess iblockaccess, final int i, final int j, final int k, final int l)
    {
        if ((l > 7) || this.graphicsLevel){
            return super.shouldSideBeRendered(iblockaccess, i, j, k, l);
        }else{
            return true;
        }
    }

    /* Bush growth */
    @Override
    public void updateTick(final World world, final int x, final int y, final int z, final Random random1)
    {
        if (world.isRemote){
            return;
        }

        int height;

        for (height = 1; world.getBlockId(x, y - height, z) == this.blockID; ++height){
            ;
        }

        if ((random1.nextInt(20) == 0) && (world.getBlockLightValue(x, y, z) >= 8)){
            final int md = world.getBlockMetadata(x, y, z);
            if (md < 12){
                world.setBlock(x, y, z, this.blockID, md + 4, 3);
            }
            if ((random1.nextInt(3) == 0) && (height < 3) && (world.getBlockId(x, y + 1, z) == 0) && (md >= 8)){
                world.setBlock(x, y + 1, z, this.blockID, md % 4, 3);
            }
        }
    }

    @Override
    public boolean canSustainPlant(final World world, final int x, final int y, final int z, final ForgeDirection direction, final IPlantable plant)
    {
        if (plant instanceof BaseBush){
            return (world.getBlockMetadata(x, y, z) > 7);
        }
        return super.canSustainPlant(world, x, y, z, direction, plant);
    }

    /* Resistance to fire */
    @Override
    public int getFlammability(final IBlockAccess world, final int x, final int y, final int z, final int metadata, final ForgeDirection face)
    {
        return 25;
    }

    @Override
    public boolean isFlammable(final IBlockAccess world, final int x, final int y, final int z, final int metadata, final ForgeDirection face)
    {
        return true;
    }

    @Override
    public int getFireSpreadSpeed(final World world, final int x, final int y, final int z, final int metadata, final ForgeDirection face)
    {
        return 4;
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings(
    { "unchecked", "rawtypes" })
    public void getSubBlocks(final int itemId, final CreativeTabs par2CreativeTabs, final List list)
    {
        for (int i = 0; i < BushEnum.values().length; i++){
            list.add(new ItemStack(itemId, 1, i));
        }
    }

    @Override
    public EnumPlantType getPlantType(final World world, final int x, final int y, final int z)
    {
        return EnumPlantType.Plains;
    }

    @Override
    public int getPlantID(final World world, final int x, final int y, final int z)
    {
        return this.blockID;
    }

    @Override
    public int getPlantMetadata(final World world, final int x, final int y, final int z)
    {
        return world.getBlockMetadata(x, y, z) - 4;
    }
}