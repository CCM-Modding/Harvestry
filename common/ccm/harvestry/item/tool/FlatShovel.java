/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.item.tool;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.utils.lib.Locations;
import ccm.nucleum.omnium.utils.helper.TextureHelper;

public class FlatShovel extends ItemTool
{

    private final EnumToolMaterial theToolMaterial;

    /** an array of the blocks this "Shovel" is effective against */
    public static final Block[] blocksEffectiveAgainst = new Block[]
    { Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium };

    public FlatShovel(final int id, final EnumToolMaterial material)
    {
        super(id, 1, material, FlatShovel.blocksEffectiveAgainst);
        theToolMaterial = material;
        maxStackSize = 1;
        setMaxDamage(material.getMaxUses());
        setCreativeTab(CreativeTabs.tabTools);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return True if something happen and false if it don't. This is for
     * ITEMS, not BLOCKS
     */
    @Override
    public boolean onItemUse(final ItemStack item, final EntityPlayer player, final World world, final int x, final int y, final int z, final int weirdThing,
            final float weirdThing1, final float weirdThing2, final float weirdThing3)
    {
        if (!player.canPlayerEdit(x, y, z, weirdThing, item))
        {
            return false;
        } else
        {
            final UseHoeEvent event = new UseHoeEvent(player, item, world, x, y, z);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }
            if (event.getResult() == Result.ALLOW)
            {
                item.damageItem(1, player);
                return true;
            }
            final int currentBlock = world.getBlockId(x, y, z);
            final int blockAbove = world.getBlockId(x, y + 1, z);
            if (((weirdThing == 0) || (blockAbove != 0) || (currentBlock != Block.grass.blockID)) && (currentBlock != Block.dirt.blockID))
            {
                return false;
            } else
            {
                final Block block = Block.tilledField;
                world.playSoundEffect(x + 0.5F, y + 0.5F, z + 0.5F, block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
                if (world.isRemote)
                {
                    return true;
                } else
                {
                    world.setBlock(x, y, z, block.blockID);
                    item.damageItem(1, player);
                    return true;
                }
            }
        }
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Returns the name of the material this tool is made from as it is declared in EnumToolMaterial (meaning diamond would return "EMERALD")
     */
    public String getMaterialName()
    {
        return theToolMaterial.name();
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    @Override
    public boolean canHarvestBlock(final Block block)
    {
        return block == Block.snow ? true : block == Block.blockSnow;
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register)
    {
        itemIcon = register.registerIcon(TextureHelper.getTexture(this.getUnlocalizedName(), Locations.TEXTURE + "tools/"));
    }
}