package harvestry.creativetab;

import harvestry.block.ModBlocks;
import harvestry.core.handlers.EHandler;
import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseFood;
import harvestry.item.enums.EnumBaseItem;
import harvestry.utils.lib.Archive;
import net.minecraft.item.ItemStack;

public class HarvestryTabs
{

    /**
     * Tabs that Contains All the blocks
     */
    public static HarvestryTab tabHarvestryBlocks;

    /**
     * Contains All the 64 Items
     */
    public static HarvestryTab tabHarvestryItems;

    /**
     * Contains All the Food Items
     */
    public static HarvestryTab tabHarvestryFood;

    /**
     * Contains All the Useable Items
     */
    public static HarvestryTab tabHarvestryUsable;

    public static void initTabs()
    {
        tabHarvestryBlocks = new HarvestryTab(Archive.TAB_HARVESTRY);
        tabHarvestryItems = new HarvestryTab(Archive.TAB_HARVESTRY);
        tabHarvestryFood = new HarvestryTab(Archive.TAB_HARVESTRY);
        tabHarvestryUsable = new HarvestryTab(Archive.TAB_HARVESTRY);
    }

    public static void initTabIcons()
    {
        tabHarvestryBlocks.init(new ItemStack(ModBlocks.blockAluminum));
        tabHarvestryItems.init(EHandler.getItem(EnumBaseItem.globDough));
        tabHarvestryFood.init(EHandler.getItem(EnumBaseFood.foodPieApple));
        tabHarvestryUsable.init(new ItemStack(ModItems.gGrate));
    }
}