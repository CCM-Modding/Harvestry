package ccm.harvestry.utils.lib;

import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.handler.enums.EnumHandler;

public final class EnumHandling
{

    public static final EnumHandler enumFood = new EnumHandler(ModItems.class, "foodItem");

    public static final EnumHandler enumItem = new EnumHandler(ModItems.class, "mainItem");
}