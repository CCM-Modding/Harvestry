package ccm.harvestry.utils.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ccm.harvestry.Harvestry;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.ItemEnum;
import ccm.harvestry.enums.OresEnum;
import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.handler.Handler;

final class OreDictionaryRegistry
{

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary()
    {
        Handler.log(Harvestry.instance, "Adding Ore Dictionary Entries");
        OreDictionary.registerOre("dustWheat", new ItemStack(ModItems.mainItem.itemID, 1, ItemEnum.dustFlour.ordinal()));
        OreDictionary.registerOre("naturalAluminum", new ItemStack(ModItems.mainItem.itemID, 1, ItemEnum.ingotAluminum.ordinal()));
        OreDictionary.registerOre("ingotAluminium", new ItemStack(ModItems.mainItem.itemID, 1, ItemEnum.ingotAluminum.ordinal()));
        OreDictionary.registerOre("ingotAluminum", new ItemStack(ModItems.mainItem.itemID, 1, ItemEnum.ingotAluminum.ordinal()));
        OreDictionary.registerOre("dustAluminium", new ItemStack(ModItems.mainItem.itemID, 1, ItemEnum.dustAluminum.ordinal()));
        OreDictionary.registerOre("dustAluminum", new ItemStack(ModItems.mainItem.itemID, 1, ItemEnum.dustAluminum.ordinal()));
        OreDictionary.registerOre("blockNaturalAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("blockAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("blockAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("oreNaturalAluminium", new ItemStack(ModBlocks.ores.blockID, 1, OresEnum.oreAluminum.ordinal()));
        OreDictionary.registerOre("oreAluminium", new ItemStack(ModBlocks.ores.blockID, 1, OresEnum.oreAluminum.ordinal()));
        OreDictionary.registerOre("oreAluminum", new ItemStack(ModBlocks.ores.blockID, 1, OresEnum.oreAluminum.ordinal()));
        OreDictionary.registerOre("oreSalt", new ItemStack(ModBlocks.ores.blockID, 1, OresEnum.oreSalt.ordinal()));
    }
}