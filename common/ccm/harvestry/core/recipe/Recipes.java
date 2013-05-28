package ccm.harvestry.core.recipe;

import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.handler.enums.EnumHandler;

abstract class Recipes
{
    protected static EnumHandler enumFood = new EnumHandler(ModItems.class, "foodItem");
    protected static EnumHandler enumItem = new EnumHandler(ModItems.class, "mainItem");
}