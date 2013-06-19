package ccm.harvestry.utils.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ccm.harvestry.Harvestry;
import ccm.harvestry.block.ModBlocks;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.enums.items.EnumItem;
import ccm.harvestry.item.ModItems;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class OreDictionaryRegistry {
    
    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        Handler.log(Harvestry.instance, "Adding Ore Dictionary Entries");
        OreDictionary.registerOre("dustWheat", new ItemStack(ModItems.mainItem.itemID, 1,
                EnumItem.dustFlour.ordinal()));
        OreDictionary.registerOre("naturalAluminum", new ItemStack(ModItems.mainItem.itemID, 1,
                EnumItem.ingotAluminum.ordinal()));
        OreDictionary.registerOre("ingotAluminium", new ItemStack(ModItems.mainItem.itemID, 1,
                EnumItem.ingotAluminum.ordinal()));
        OreDictionary.registerOre("ingotAluminum", new ItemStack(ModItems.mainItem.itemID, 1,
                EnumItem.ingotAluminum.ordinal()));
        OreDictionary.registerOre("dustAluminium", new ItemStack(ModItems.mainItem.itemID, 1,
                EnumItem.dustAluminum.ordinal()));
        OreDictionary.registerOre("dustAluminum", new ItemStack(ModItems.mainItem.itemID, 1,
                EnumItem.dustAluminum.ordinal()));
        OreDictionary.registerOre("blockNaturalAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("blockAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("blockAluminum", ModBlocks.blockAluminum);
        OreDictionary.registerOre("oreNaturalAluminium", new ItemStack(Properties.oreID, 1,
                EnumOres.oreAluminum.ordinal()));
        OreDictionary.registerOre("oreAluminium", new ItemStack(Properties.oreID, 1,
                EnumOres.oreAluminum.ordinal()));
        OreDictionary.registerOre("oreAluminum", new ItemStack(Properties.oreID, 1,
                EnumOres.oreAluminum.ordinal()));
        OreDictionary.registerOre("oreSalt",
                                  new ItemStack(Properties.oreID, 1, EnumOres.oreSalt.ordinal()));
    }
}