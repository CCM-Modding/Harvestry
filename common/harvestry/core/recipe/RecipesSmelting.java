package harvestry.core.recipe;

import harvestry.block.ModBlocks;
import harvestry.core.handlers.EHandler;
import harvestry.item.enums.EnumBaseItem;
import net.minecraft.item.crafting.FurnaceRecipes;

final class RecipesSmelting
{

    public static void init()
    {
        FurnaceRecipes.smelting().addSmelting(ModBlocks.oreAluminum.blockID, EHandler.getItem(EnumBaseItem.ingotAluminum), 1.0F);
    }
}