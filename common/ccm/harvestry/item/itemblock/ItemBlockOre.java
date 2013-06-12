package ccm.harvestry.item.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import ccm.harvestry.enums.blocks.EnumOres;

public class ItemBlockOre extends ItemBlock
{

    private static EnumOres[] ores = EnumOres.values();

    public ItemBlockOre(final int id)
    {
        super(id);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack)
    {
        this.setUnlocalizedName(ores[itemStack.getItemDamage()].name());
        return super.getUnlocalizedName();
    }

    @Override
    public int getMetadata(final int meta)
    {
        return meta;
    }
}