package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class OvenFuels {

    /**
     * Oven Fuels
     */
    private static HashSet<ItemStack> ovenList = new HashSet<ItemStack>();

    /**
     * Checks if a item is a Heating Element.
     * 
     * @param stack
     *            The stack to check if it is a Heating Element.
     * @return true if it is found in the Oven's List.
     */
    public static boolean isOvenFuel(final ItemStack stack) {
        for (final ItemStack i : OvenFuels.ovenList)
            if (i.itemID == stack.itemID)
                return true;
        return false;
    }

    /**
     * Registers a new Heating Element.
     * 
     * @param stack
     *            The Heating Element to add.
     */
    public static void registerOvenFuel(final ItemStack stack) {
        OvenFuels.ovenList.add(stack);
    }
}