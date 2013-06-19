package ccm.harvestry.block.machines;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.nucleum_omnium.tileentity.TileBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class BaseContainerBlock extends BlockContainer {
    
    @SideOnly(Side.CLIENT)
    protected Icon           topIcon;
    
    @SideOnly(Side.CLIENT)
    protected Icon           bottomIcon;
    
    @SideOnly(Side.CLIENT)
    protected Icon           frontIcon;
    
    protected final boolean  isActive;
    
    protected static boolean keepInventory = false;
    
    /**
     * Is the random generator used by all Containers to drop the inventory
     * contents in random directions.
     */
    protected Random         rand          = new Random();
    
    /**
     * Creates a new Block instance capable of containing a {@link TileEntity}.
     * 
     * @param id
     *            The Block ID.
     */
    public BaseContainerBlock(final int id, final boolean active) {
        super(id, Material.rock);
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
        this.isActive = active;
    }
    
    /**
     * Creates a new Block instance capable of containing a {@link TileEntity}.
     * 
     * @param id
     *            The Block ID.
     * @param material
     *            The Material of the Block.
     */
    public BaseContainerBlock(final int id, final Material material, final boolean active) {
        super(id, material);
        this.setCreativeTab(HarvestryTabs.tabHarvestryBlocks);
        this.isActive = active;
    }
    
    @Override
    public void breakBlock(final World world, final int x, final int y, final int z, final int id,
            final int meta) {
        this.dropInventory(world, x, y, z);
        super.breakBlock(world, x, y, z, id, meta);
    }
    
    @Override
    public abstract TileEntity createNewTileEntity(World world);
    
    /**
     * Drops the Inventory that is contained in the {@link TileEntity}.
     * 
     * @param world
     *            The world in witch to drop the Items in.
     * @param x
     *            The x location
     * @param y
     *            The y location.
     * @param z
     *            The z location.
     */
    private void dropInventory(final World world, final int x, final int y, final int z) {
        if (!keepInventory) {
            final TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if (tileEntity != null) {
                if (!(tileEntity instanceof IInventory))
                    return;
                final IInventory inventory = (IInventory) tileEntity;
                for (int i = 0; i < inventory.getSizeInventory(); i++) {
                    final ItemStack itemStack = inventory.getStackInSlot(i);
                    if (itemStack != null && itemStack.stackSize > 0) {
                        final float dX = this.rand.nextFloat() * 0.8F + 0.1F;
                        final float dY = this.rand.nextFloat() * 0.8F + 0.1F;
                        final float dZ = this.rand.nextFloat() * 0.8F + 0.1F;
                        final EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ,
                                new ItemStack(itemStack.itemID, itemStack.stackSize,
                                        itemStack.getItemDamage()));
                        if (itemStack.hasTagCompound())
                            entityItem.getEntityItem().setTagCompound((NBTTagCompound) itemStack
                                    .getTagCompound().copy());
                        final float factor = 0.05F;
                        entityItem.motionX = this.rand.nextGaussian() * factor;
                        entityItem.motionY = this.rand.nextGaussian() * factor + 0.2F;
                        entityItem.motionZ = this.rand.nextGaussian() * factor;
                        world.spawnEntityInWorld(entityItem);
                        itemStack.stackSize = 0;
                    }
                }
            }
        }
    }
    
    /**
     * From the specified side and block metadata retrieves the blocks texture.
     * Args: side, metadata
     */
    @Override
    @SideOnly(Side.CLIENT)
    public abstract Icon getIcon(int side, int metadata);
    
    @Override
    public abstract ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y,
            int z);
    
    @Override
    public abstract int idDropped(int meta, Random random, int fortune);
    
    @Override
    public boolean onBlockActivated(final World world, final int x, final int y, final int z,
            final EntityPlayer player, final int wut, final float clickX, final float clickY,
            final float clockZ) {
        if (world.isRemote)
            return true;
        if (player.isSneaking())
            return false;
        else
            return true;
    }
    
    @Override
    public void onBlockAdded(final World world, final int x, final int y, final int z) {
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }
    
    /**
     * Sets the direction of the block when placed
     */
    @Override
    public void onBlockPlacedBy(final World world, final int x, final int y, final int z,
            final EntityLiving living, final ItemStack itemStack) {
        int direction = 0;
        final int facing = MathHelper.floor_double(living.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        
        switch (facing) {
            case 0:
                direction = ForgeDirection.NORTH.ordinal();
                world.setBlockMetadataWithNotify(x, y, z, direction, 2);
                break;
            case 1:
                direction = ForgeDirection.EAST.ordinal();
                world.setBlockMetadataWithNotify(x, y, z, direction, 2);
                break;
            case 2:
                direction = ForgeDirection.SOUTH.ordinal();
                world.setBlockMetadataWithNotify(x, y, z, direction, 2);
                break;
            case 3:
                direction = ForgeDirection.WEST.ordinal();
                world.setBlockMetadataWithNotify(x, y, z, direction, 2);
                break;
            default:
                direction = ForgeDirection.NORTH.ordinal();
                world.setBlockMetadataWithNotify(x, y, z, direction, 2);
                break;
        }
        
        world.setBlockMetadataWithNotify(x, y, z, direction, 3);
        if (itemStack.hasDisplayName())
            ((TileBase) world.getBlockTileEntity(x, y, z))
                    .setCustomName(itemStack.getDisplayName());
        ((TileBase) world.getBlockTileEntity(x, y, z)).setOwner(living.getEntityName());
        ((TileBase) world.getBlockTileEntity(x, y, z)).setOrientation(direction);
    }
    
    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public abstract void registerIcons(IconRegister iconRegister);
    
    /**
     * set a blocks direction
     */
    private void setDefaultDirection(final World world, final int x, final int y, final int z) {
        if (!world.isRemote) {
            final int l = world.getBlockId(x, y, z - 1);
            final int i1 = world.getBlockId(x, y, z + 1);
            final int j1 = world.getBlockId(x - 1, y, z);
            final int k1 = world.getBlockId(x + 1, y, z);
            byte b0 = 3;
            if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1])
                b0 = 3;
            if (Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l])
                b0 = 2;
            if (Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1])
                b0 = 5;
            if (Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1])
                b0 = 4;
            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }
}