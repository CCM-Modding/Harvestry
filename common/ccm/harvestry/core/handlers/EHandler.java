package ccm.harvestry.core.handlers;

import net.minecraft.item.ItemStack;
import ccm.harvestry.enums.items.FoodEnum;
import ccm.harvestry.enums.items.ItemEnum;
import ccm.harvestry.enums.items.ItemEnumSixteen;
import ccm.harvestry.enums.items.UncookedFoodEnum;
import ccm.harvestry.item.ModItems;

public final class EHandler
{

    /**
     * @param enumBaseFood
     * @return new ItemStack
     */
    public static ItemStack getItem(final FoodEnum enumBaseFood)
    {
        return new ItemStack(ModItems.foodItem, 1, enumBaseFood.ordinal());
    }

    /**
     * @param enumBaseFood
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final FoodEnum enumBaseFood, final int amount)
    {
        return new ItemStack(ModItems.foodItem, amount, enumBaseFood.ordinal());
    }

    /**
     * @param enumBaseItem
     * @return new ItemStack
     */
    public static ItemStack getItem(final ItemEnum enumBaseItem)
    {
        return new ItemStack(ModItems.mainItem, 1, enumBaseItem.ordinal());
    }

    /**
     * @param enumBaseItem
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final ItemEnum enumBaseItem, final int amount)
    {
        return new ItemStack(ModItems.mainItem, amount, enumBaseItem.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final ItemEnumSixteen enumNonStack)
    {
        return new ItemStack(ModItems.nsItem, 1, enumNonStack.ordinal());
    }
    
    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final ItemEnumSixteen enumNonStack, final int amount)
    {
        return new ItemStack(ModItems.nsItem, amount, enumNonStack.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final UncookedFoodEnum enumUncookedStack)
    {
        return new ItemStack(ModItems.uncookedFoodItem, 1, enumUncookedStack.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final UncookedFoodEnum enumUncookedStack, final int amount)
    {
        return new ItemStack(ModItems.uncookedFoodItem, amount, enumUncookedStack.ordinal());
    }
}