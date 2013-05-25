package ccm.harvestry.item.classes;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.items.FoodEnum;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseFood extends ItemFood
{

    private static FoodEnum[] currentItems = FoodEnum.values();

    public BaseFood(final int id)
    {
        super(id - 256, 0, 0, false);
        this.setCreativeTab(HarvestryTabs.tabHarvestryFood);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(final int meta)
    {
        return currentItems[meta].getIcon();
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye
     * returns 16 items)
     */
    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings(
    { "rawtypes", "unchecked" })
    public void getSubItems(final int itemID, final CreativeTabs creativeTabs, final List list)
    {
        for (int currentMeta = 0; currentMeta < FoodEnum.values().length; ++currentMeta){
            list.add(new ItemStack(itemID, 1, currentMeta));
        }
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack)
    {
        this.setUnlocalizedName(currentItems[itemStack.getItemDamage()].name());
        return super.getUnlocalizedName();
    }

    /**
     * Registers the Icon for the Food Item
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        FoodEnum.registerIcons(iconRegister);
    }

    @Override
    public ItemStack onEaten(final ItemStack stack, final World world, final EntityPlayer player)
    {
        stack.stackSize--;
        final int damage = stack.getItemDamage();
        player.getFoodStats().addStats(currentItems[damage].heal, currentItems[damage].saturation);
        world.playSoundAtEntity(player, "random.burp", 0.5F, (world.rand.nextFloat() * 0.1F) + 0.9F);
        this.onFoodEaten(stack, world, player);
        return stack;
    }
}