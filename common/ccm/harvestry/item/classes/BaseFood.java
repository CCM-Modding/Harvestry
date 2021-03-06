/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.item.classes;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.item.enums.EnumFood;

public class BaseFood extends ItemFood
{

    private static EnumFood[] currentItems = EnumFood.values();

    public BaseFood(final int id)
    {
        super(id - 256, 0, 0, false);
        setCreativeTab(HarvestryTabs.tabHarvestryFood);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(final int meta)
    {
        return BaseFood.currentItems[meta].getIcon();
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(final int itemID, final CreativeTabs creativeTabs, final List list)
    {
        for (int currentMeta = 0; currentMeta < EnumFood.values().length; ++currentMeta)
        {
            list.add(new ItemStack(itemID, 1, currentMeta));
        }
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack)
    {
        setUnlocalizedName(BaseFood.currentItems[itemStack.getItemDamage()].name());
        return super.getUnlocalizedName();
    }

    /**
     * Registers the Icon for the Food Item
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        EnumFood.registerIcons(iconRegister);
    }

    @Override
    public ItemStack onEaten(final ItemStack stack, final World world, final EntityPlayer player)
    {
        stack.stackSize--;
        final int damage = stack.getItemDamage();
        player.getFoodStats().addStats(BaseFood.currentItems[damage].heal, BaseFood.currentItems[damage].saturation);
        world.playSoundAtEntity(player, "random.burp", 0.5F, (world.rand.nextFloat() * 0.1F) + 0.9F);
        onFoodEaten(stack, world, player);
        return stack;
    }
}