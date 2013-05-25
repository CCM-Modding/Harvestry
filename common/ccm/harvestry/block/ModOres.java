package ccm.harvestry.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.MinecraftForge;
import ccm.harvestry.enums.blocks.OresEnum;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModOres extends BaseBlock
{

    private static OresEnum[] ores = OresEnum.values();

    /**
     * Creates a new Block instance capable of being a Ore
     * 
     * @param id
     *            Block Id
     */
    public ModOres(final int id)
    {
        super(id, Material.rock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(Block.soundStoneFootstep);
        MinecraftForge.setBlockHarvestLevel(this, OresEnum.oreSalt.ordinal(), "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(this, OresEnum.oreAluminum.ordinal(), "pickaxe", 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(final int side, final int meta)
    {
        this.blockIcon = ores[meta].getIcon();
        return this.blockIcon;
    }

    // Makes sure pick block works right
    @Override
    public int damageDropped(final int metadata)
    {
        return metadata;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        OresEnum.registerIcons(iconRegister);
    }

    @Override
    @SuppressWarnings(
    { "rawtypes", "unchecked" })
    public void getSubBlocks(final int itemId, final CreativeTabs tab, final List list)
    {
        for (int i = 0; i < OresEnum.values().length; i++){
            list.add(new ItemStack(itemId, 1, i));
        }
    }
}