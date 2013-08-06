/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.core.recipe;

import net.minecraft.item.crafting.FurnaceRecipes;

import ccm.harvestry.block.enums.EnumOres;
import ccm.harvestry.item.enums.EnumItem;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

final class RecipesSmelting
{

    FurnaceRecipes furnace = FurnaceRecipes.smelting();

    public RecipesSmelting()
    {
        furnace.addSmelting(((IBlockEnum) EnumOres.oreAluminum).getBaseBlock().blockID,
                            EnumOres.oreAluminum.ordinal(),
                            EnumToItemStack.getItemIS(EnumItem.ingotAluminum),
                            1.0F);
    }
}