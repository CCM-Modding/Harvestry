package ccm.harvestry.core.recipe;

import net.minecraft.item.crafting.FurnaceRecipes;
import ccm.harvestry.enums.blocks.EnumOres;
import ccm.harvestry.enums.items.EnumItem;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;
import ccm.nucleum_omnium.helper.enums.IBlockEnum;

final class RecipesSmelting {
    
    public RecipesSmelting() {
        FurnaceRecipes.smelting().addSmelting(((IBlockEnum) EnumOres.oreAluminum).getBaseBlock().blockID,
                                              EnumOres.oreAluminum.ordinal(),
                                              EnumToItemStack.getItemIS(EnumItem.ingotAluminum),
                                              1.0F);
    }
}