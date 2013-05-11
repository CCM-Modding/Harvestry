package harvestry.block;

import java.util.ArrayList;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BaseOre extends BaseBlock
{

    /**
     * Creates a new Block instance capable of being a Ore
     * 
     * @param id
     *            Block Id
     */
    public BaseOre(final int id)
    {
        super(id, Material.rock);
    }

    @Override
    // Makes sure pick block works right
    public int
            damageDropped(final int id)
    {
        return id;
    }

    @Override
    // Specifies the block drop
    public ArrayList<ItemStack>
            getBlockDropped(final World w, final int x, final int y, final int z, final int meta, final int fortune)
    {
        // The list of items
        final ArrayList<ItemStack> list = new ArrayList<ItemStack>();
        return list;
    }
}