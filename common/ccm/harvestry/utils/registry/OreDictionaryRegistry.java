package ccm.harvestry.utils.registry;

import net.minecraftforge.oredict.OreDictionary;
import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.blocks.EnumBlocks;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.enums.items.EnumItem;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class OreDictionaryRegistry {
    
    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        Handler.log(Harvestry.instance, "Adding Ore Dictionary Entries");
        OreDictionary.registerOre("dustWheat", EnumToItemStack.getItemIS(EnumItem.dustFlour));
        
        OreDictionary.registerOre("naturalAluminum",
                                  EnumToItemStack.getItemIS(EnumItem.ingotAluminum));
        
        OreDictionary.registerOre("ingotAluminium",
                                  EnumToItemStack.getItemIS(EnumItem.ingotAluminum));
        
        OreDictionary.registerOre("ingotAluminum",
                                  EnumToItemStack.getItemIS(EnumItem.ingotAluminum));
        
        OreDictionary
                .registerOre("dustAluminium", EnumToItemStack.getItemIS(EnumItem.dustAluminum));
        
        OreDictionary.registerOre("dustAluminum", EnumToItemStack.getItemIS(EnumItem.dustAluminum));
        
        OreDictionary.registerOre("blockNaturalAluminum",
                                  EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));
        
        OreDictionary.registerOre("blockAluminum",
                                  EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));
        
        OreDictionary.registerOre("blockAluminum",
                                  EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));
        
        OreDictionary.registerOre("oreNaturalAluminium",
                                  EnumToItemStack.getBlockIS(EnumOres.oreAluminum));
        
        OreDictionary.registerOre("oreAluminium", EnumToItemStack.getBlockIS(EnumOres.oreAluminum));
        
        OreDictionary.registerOre("oreAluminum", EnumToItemStack.getBlockIS(EnumOres.oreAluminum));
        
        OreDictionary.registerOre("oreSalt", EnumToItemStack.getBlockIS(EnumOres.oreSalt));
    }
}