package ccm.harvestry.item.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import ccm.harvestry.enums.OresEnum;

public class ItemBlockOre extends ItemBlock
{

    private static OresEnum[] ores = OresEnum.values();

    public ItemBlockOre(final int par1)
    {
        super(par1);
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
    public int getMetadata(final int i)
    {
        return i;
    }
}