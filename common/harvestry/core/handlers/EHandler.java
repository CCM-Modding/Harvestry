package harvestry.core.handlers;

import harvestry.item.ModItems;
import harvestry.item.enums.EnumBaseFood;
import harvestry.item.enums.EnumBaseItem;
import harvestry.item.enums.EnumNonStack;
import harvestry.item.enums.EnumUncookedFood;
import net.minecraft.item.ItemStack;

public final class EHandler
{

    /**
     * @param enumBaseFood
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumBaseFood enumBaseFood)
    {
        return new ItemStack(ModItems.foodItem, 1, enumBaseFood.ordinal());
    }

    /**
     * @param enumBaseFood
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumBaseFood enumBaseFood, final int amount)
    {
        return new ItemStack(ModItems.foodItem, amount, enumBaseFood.ordinal());
    }

    /**
     * @param enumBaseItem
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumBaseItem enumBaseItem)
    {
        return new ItemStack(ModItems.mainItem, 1, enumBaseItem.ordinal());
    }

    /**
     * @param enumBaseItem
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumBaseItem enumBaseItem, final int amount)
    {
        return new ItemStack(ModItems.mainItem, amount, enumBaseItem.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumNonStack enumNonStack)
    {
        return new ItemStack(ModItems.nsItem, 1, enumNonStack.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumUncookedFood enumUncookedStack)
    {
        return new ItemStack(ModItems.uncookedFoodItem, 1, enumUncookedStack.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumUncookedFood enumUncookedStack, final int amount)
    {
        return new ItemStack(ModItems.uncookedFoodItem, amount, enumUncookedStack.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumNonStack enumNonStack, final int amount)
    {
        return new ItemStack(ModItems.nsItem, amount, enumNonStack.ordinal());
    }
}