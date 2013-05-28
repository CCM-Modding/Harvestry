package ccm.harvestry.creativetab;

import net.minecraft.item.ItemStack;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.items.EnumFood;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.Archive;
import ccm.nucleum_omnium.creativetab.CreativeTab;
import ccm.nucleum_omnium.handler.enums.EnumHandler;

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
        tabHarvestryBlocks = new CreativeTab(/* CHANGE THIS IN ORDER TO CHANGE IT'S NAME(IN GAME) */Archive.TAB_HARVESTRY);
        tabHarvestryItems = new CreativeTab(/* CHANGE THIS IN ORDER TO CHANGE IT'S NAME(IN GAME) */Archive.TAB_HARVESTRY);
        tabHarvestryFood = new CreativeTab(/* CHANGE THIS IN ORDER TO CHANGE IT'S NAME(IN GAME) */Archive.TAB_HARVESTRY);
        tabHarvestryUsable = new CreativeTab(/* CHANGE THIS IN ORDER TO CHANGE IT'S NAME(IN GAME) */Archive.TAB_HARVESTRY);
    }

    public static void initTabIcons()
    {
        tabHarvestryBlocks.init(new ItemStack(ModBlocks.blockAluminum));
        tabHarvestryItems.init(EnumHandler.getItem(EnumItem.globDough));
        tabHarvestryFood.init(EnumHandler.getItem(EnumFood.foodPieApple));
        tabHarvestryUsable.init(new ItemStack(ModItems.gGrate));
    }
}