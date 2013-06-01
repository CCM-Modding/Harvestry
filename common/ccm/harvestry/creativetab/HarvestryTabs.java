package ccm.harvestry.creativetab;

import net.minecraft.item.ItemStack;

import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.Archive;
import ccm.harvestry.utils.lib.EnumHandling;
import ccm.nucleum_omnium.creativetab.CreativeTab;

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
     * Contains All the Useable Items
     */
    public static CreativeTab tabHarvestryUsable;

    public static void initTabs()
    {
        tabHarvestryBlocks = new CreativeTab(/* CHANGE THIS IN ORDER TO CHANGE IT'S NAME(IN GAME) */Archive.TAB_HARVESTRY_BLOCK);
        tabHarvestryItems = new CreativeTab(/* CHANGE THIS IN ORDER TO CHANGE IT'S NAME(IN GAME) */Archive.TAB_HARVESTRY_ITEMS);
        tabHarvestryFood = new CreativeTab(/* CHANGE THIS IN ORDER TO CHANGE IT'S NAME(IN GAME) */Archive.TAB_HARVESTRY_FOOD);
        tabHarvestryUsable = new CreativeTab(/* CHANGE THIS IN ORDER TO CHANGE IT'S NAME(IN GAME) */Archive.TAB_HARVESTRY_USABLE);
    }

    public static void initTabIcons()
    {
        tabHarvestryBlocks.init(new ItemStack(ModBlocks.blockAluminum));
        tabHarvestryItems.init(EnumHandling.enumItem.getItemIS(EnumItem.globDough));
        tabHarvestryFood.init(EnumHandling.enumFood.getItemIS(EnumFood.foodPieApple));
        tabHarvestryUsable.init(new ItemStack(ModItems.gGrate));
    }
}