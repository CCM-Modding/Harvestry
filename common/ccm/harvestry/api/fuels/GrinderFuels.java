package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class GrinderFuels {

    /**
     * Grinder Fuels
     */
    private static HashSet<ItemStack> grinderList = new HashSet<ItemStack>();

    /**
     * Checks if a item is a Grind Stone.
     * 
     * @param stack
     *            The stack to check if it is a Grind Stone.
     * @return true if it is found in the Grinding List.
     */
    public static boolean isGrinderFuel(final ItemStack stack) {
        for (final ItemStack i : GrinderFuels.grinderList)
            if (i.itemID == stack.itemID)
                return true;
        return false;
    }

    /**
     * Registers a new Grind Stone.
     * 
     * @param stack
     *            The Grind Stone to add.
     */
    public static void registerGrinderFuel(final ItemStack stack) {
        GrinderFuels.grinderList.add(stack);
    }
}