/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import ccm.harvestry.Harvestry;
import ccm.harvestry.block.enums.EnumBlocks;
import ccm.harvestry.block.enums.EnumOres;
import ccm.harvestry.item.enums.EnumItem;
import ccm.nucleum.omnium.utils.helper.CCMLogger;
import ccm.nucleum.omnium.utils.helper.enums.EnumToItemStack;

final class OreDictionaryRegistry
{

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary()
    {
        CCMLogger.finest(Harvestry.instance, "Adding Ore Dictionary Entries");

        register("dustWheat", EnumToItemStack.getItemIS(EnumItem.dustFlour));

        register("naturalAluminum", EnumToItemStack.getItemIS(EnumItem.ingotAluminum));

        register("ingotAluminium", EnumToItemStack.getItemIS(EnumItem.ingotAluminum));

        register("ingotAluminum", EnumToItemStack.getItemIS(EnumItem.ingotAluminum));

        register("dustAluminium", EnumToItemStack.getItemIS(EnumItem.dustAluminum));

        register("dustAluminum", EnumToItemStack.getItemIS(EnumItem.dustAluminum));

        register("blockNaturalAluminum", EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));

        register("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));

        register("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));

        register("oreNaturalAluminium", EnumToItemStack.getBlockIS(EnumOres.oreAluminum));

        register("oreAluminium", EnumToItemStack.getBlockIS(EnumOres.oreAluminum));

        register("oreAluminum", EnumToItemStack.getBlockIS(EnumOres.oreAluminum));

        register("oreSalt", EnumToItemStack.getBlockIS(EnumOres.oreSalt));
    }

    private static void register(final String name, final ItemStack ore)
    {
        OreDictionary.registerOre(name, ore);
    }
}