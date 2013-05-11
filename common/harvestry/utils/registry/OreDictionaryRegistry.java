package harvestry.utils.registry;

import harvestry.block.ModBlocks;
import harvestry.core.handlers.Handler;
import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseItem;

import java.util.logging.Level;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

final class OreDictionaryRegistry
{

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary()
    {
        Handler.log(Level.INFO, "Adding Ore Dictionary Entries");
        OreDictionary.registerOre("dustWheat", new ItemStack(ModItems.mainItem.itemID, 1, EnumBaseItem.dustFlour.ordinal()));
        OreDictionary.registerOre("naturalAluminum", new ItemStack(ModItems.mainItem.itemID, 1, EnumBaseItem.ingotAluminum.ordinal()));
        OreDictionary.registerOre("ingotAluminium", new ItemStack(ModItems.mainItem.itemID, 1, EnumBaseItem.ingotAluminum.ordinal()));
        OreDictionary.registerOre("ingotAluminum", new ItemStack(ModItems.mainItem.itemID, 1, EnumBaseItem.ingotAluminum.ordinal()));
        OreDictionary.registerOre("dustAluminium", new ItemStack(ModItems.mainItem.itemID, 1, EnumBaseItem.dustAluminum.ordinal()));
        OreDictionary.registerOre("dustAluminum", new ItemStack(ModItems.mainItem.itemID, 1, EnumBaseItem.dustAluminum.ordinal()));
        OreDictionary.registerOre("blockNaturalAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("blockAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("blockAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("oreNaturalAluminium", ModBlocks.oreAluminum);
        OreDictionary.registerOre("oreAluminium", ModBlocks.oreAluminum);
        OreDictionary.registerOre("oreAluminum", ModBlocks.oreAluminum);
        OreDictionary.registerOre("oreSalt", ModBlocks.oreSalt);
    }
}