package ccm.harvestry.item.classes;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import ccm.harvestry.creativetab.HarvestryTabs;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.enums.items.EnumItemSixteen;
import ccm.harvestry.enums.items.EnumUncookedFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseItem extends BaseItemClass {

	private int							enumType;

	private static EnumItem[]			currentBaseItems	= EnumItem.values();

	private static EnumItemSixteen[]	currentNonStack		= EnumItemSixteen.values();

	private static EnumUncookedFood[]	currentUncookedFood	= EnumUncookedFood.values();

	/**
	 * Creates an Item Instance.
	 * 
	 * @param id
	 *            The Item ID
	 */
	public BaseItem(final int id) {
		super(id);
		setHasSubtypes(true);
		setMaxDamage(0);
		setCreativeTab(HarvestryTabs.tabHarvestryItems);
	}

	/**
	 * Creates an Item Instance.
	 * 
	 * @param id
	 *            The Item ID
	 */
	public BaseItem(final int id, final int enumType) {
		super(id);
		setMaxDamage(0);
		setHasSubtypes(true);
		this.enumType = enumType;
		setCreativeTab(HarvestryTabs.tabHarvestryItems);
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Gets an icon index based on an item's damage value
	 */
	public Icon getIconFromDamage(final int meta) {
		switch (enumType) {
			case 0:
				return BaseItem.currentBaseItems[meta].getIcon();
			case 1:
				return BaseItem.currentNonStack[meta].getIcon();
			case 2:
				return BaseItem.currentUncookedFood[meta].getIcon();
			default:
				return null;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "rawtypes", "unchecked" })
	/**
	 * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
	 */
	public void getSubItems(final int itemID, final CreativeTabs creativeTabs, final List list) {
		switch (enumType) {
			case 0:
				for (int currentMeta = 0; currentMeta < EnumItem.values().length; ++currentMeta) {
					list.add(new ItemStack(itemID, 1, currentMeta));
				}
				break;
			case 1:
				for (int currentMeta = 0; currentMeta < EnumItemSixteen.values().length; ++currentMeta) {
					list.add(new ItemStack(itemID, 1, currentMeta));
				}
				break;
			case 2:
				for (int currentMeta = 0; currentMeta < EnumUncookedFood.values().length; ++currentMeta) {
					list.add(new ItemStack(itemID, 1, currentMeta));
				}
				break;
		}
	}

	@Override
	public String getUnlocalizedName(final ItemStack itemStack) {
		switch (enumType) {
			case 0:
				setUnlocalizedName(BaseItem.currentBaseItems[itemStack.getItemDamage()].name());
				return super.getUnlocalizedName();
			case 1:
				setUnlocalizedName(BaseItem.currentNonStack[itemStack.getItemDamage()].name());
				return super.getUnlocalizedName();
			case 2:
				setUnlocalizedName(BaseItem.currentUncookedFood[itemStack.getItemDamage()].name());
				return super.getUnlocalizedName();
			default:
				return null;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(final IconRegister iconRergister) {
		EnumItem.registerIcons(iconRergister);
		EnumItemSixteen.registerIcons(iconRergister);
		EnumUncookedFood.registerIcons(iconRergister);
	}
}