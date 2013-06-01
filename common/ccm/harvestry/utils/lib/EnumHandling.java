package ccm.harvestry.utils.lib;

import ccm.harvestry.item.ModItems;
import ccm.nucleum_omnium.handler.enums.EnumHandler;

public final class EnumHandling
{

    public static final EnumHandler enumFood     = new EnumHandler(ModItems.class, "foodItem");

    public static final EnumHandler enumItem     = new EnumHandler(ModItems.class, "mainItem");

    public static final EnumHandler enumItem16   = new EnumHandler(ModItems.class, "nsItem");

    public static final EnumHandler enumUncooked = new EnumHandler(ModItems.class, "uncookedFoodItem");

    public static final EnumHandler enumBerry    = new EnumHandler(ModItems.class, "berry");
}