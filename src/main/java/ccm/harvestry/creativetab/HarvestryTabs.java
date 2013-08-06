/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.creativetab;

import net.minecraft.item.ItemStack;

import ccm.harvestry.block.enums.EnumBlocks;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.item.enums.EnumFood;
import ccm.harvestry.item.enums.EnumItem;
import ccm.harvestry.utils.lib.Archive;
import ccm.nucleum_omnium.creativetab.CreativeTab;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

public class HarvestryTabs
{

    /**
     * Tabs that Contains All the blocks
     */
    public static CreativeTab tabHarvestryBlocks;

    /**
     * Contains All the 64 Items
     */
    public static CreativeTab tabHarvestryItems;

    /**
     * Contains All the Food Items
     */
    public static CreativeTab tabHarvestryFood;

    /**
     * Contains All the Usable Items
     */
    public static CreativeTab tabHarvestryUsable;

    public static void initTabs()
    {
        HarvestryTabs.tabHarvestryBlocks = new CreativeTab(Archive.TAB_HARVESTRY_BLOCK);
        HarvestryTabs.tabHarvestryItems = new CreativeTab(Archive.TAB_HARVESTRY_ITEMS);
        HarvestryTabs.tabHarvestryFood = new CreativeTab(Archive.TAB_HARVESTRY_FOOD);
        HarvestryTabs.tabHarvestryUsable = new CreativeTab(Archive.TAB_HARVESTRY_USABLE);
    }

    public static void initTabIcons()
    {
        HarvestryTabs.tabHarvestryBlocks.init(EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));
        HarvestryTabs.tabHarvestryItems.init(EnumToItemStack.getItemIS(EnumItem.globDough));
        HarvestryTabs.tabHarvestryFood.init(EnumToItemStack.getItemIS(EnumFood.foodPieApple));
        HarvestryTabs.tabHarvestryUsable.init(new ItemStack(ModItems.gGrate));
    }
}