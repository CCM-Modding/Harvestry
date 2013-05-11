package harvestry.item.classes;

import harvestry.creativetab.HarvestryTabs;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumNonStack;
import harvestry.item.enums.EnumUncookedFood;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseItem extends BaseItemClass
{

    private int                       enumType;

    private static EnumBaseItem[]     currentBaseItems    = EnumBaseItem.values();

    private static EnumNonStack[]     currentNonStack     = EnumNonStack.values();

    private static EnumUncookedFood[] currentUncookedFood = EnumUncookedFood.values();

    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public BaseItem(final int id)
    {
        super(id);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(HarvestryTabs.tabHarvestryItems);
    }

    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public BaseItem(final int id,
                    final int enumType)
    {
        super(id);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.enumType = enumType;
        this.setCreativeTab(HarvestryTabs.tabHarvestryItems);
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(final int meta)
    {
        switch (this.enumType) {
            case 0:
                return currentBaseItems[meta].getIcon();
            case 1:
                return currentNonStack[meta].getIcon();
            case 2:
                return currentUncookedFood[meta].getIcon();
            default:
                return null;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings(
    { "rawtypes", "unchecked" })
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(final int itemID, final CreativeTabs creativeTabs, final List list)
    {
        switch (this.enumType) {
            case 0:
                for (int currentMeta = 0; currentMeta < EnumBaseItem.values().length; ++currentMeta){
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 1:
                for (int currentMeta = 0; currentMeta < EnumNonStack.values().length; ++currentMeta){
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 2:
                for (int currentMeta = 0; currentMeta < EnumUncookedFood.values().length; ++currentMeta){
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
        }
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack)
    {
        switch (this.enumType) {
            case 0:
                this.setUnlocalizedName(currentBaseItems[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 1:
                this.setUnlocalizedName(currentNonStack[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 2:
                this.setUnlocalizedName(currentUncookedFood[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            default:
                return null;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRergister)
    {
        EnumBaseItem.registerIcons(iconRergister);
        EnumNonStack.registerIcons(iconRergister);
        EnumUncookedFood.registerIcons(iconRergister);
    }
}