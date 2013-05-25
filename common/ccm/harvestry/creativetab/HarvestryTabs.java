package ccm.harvestry.creativetab;

import net.minecraft.item.ItemStack;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.core.handlers.EHandler;
import ccm.harvestry.enums.FoodEnum;
import ccm.harvestry.enums.ItemEnum;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.Archive;
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
        tabHarvestryBlocks = new CreativeTab(Archive.TAB_HARVESTRY);
        tabHarvestryItems = new CreativeTab(Archive.TAB_HARVESTRY);
        tabHarvestryFood = new CreativeTab(Archive.TAB_HARVESTRY);
        tabHarvestryUsable = new CreativeTab(Archive.TAB_HARVESTRY);
    }

    public static void initTabIcons()
    {
        tabHarvestryBlocks.init(new ItemStack(ModBlocks.blockAluminum));
        tabHarvestryItems.init(EHandler.getItem(ItemEnum.globDough));
        tabHarvestryFood.init(EHandler.getItem(FoodEnum.foodPieApple));
        tabHarvestryUsable.init(new ItemStack(ModItems.gGrate));
    }
}