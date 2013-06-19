package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class CounterFuels {
    
    /**
     * Counter Recipes
     */
    private static HashSet<ItemStack> knifeList = new HashSet<ItemStack>();
    
    private static HashSet<ItemStack> boardList = new HashSet<ItemStack>();
    
    /**
     * Checks if a item is a Knife.
     * 
     * @param stack
     *            The stack to check if it is a Heating Element.
     * @return true if it is found in the Counters's List.
     */
    public static boolean isCounterKnife(final ItemStack stack) {
        for (final ItemStack i : CounterFuels.knifeList) {
            if (i.itemID == stack.itemID) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks if a item is a Board.
     * 
     * @param stack
     *            The stack to check if it is a Heating Element.
     * @return true if it is found in the Counters's List.
     */
    public static boolean isCounterBoard(final ItemStack stack) {
        for (final ItemStack i : CounterFuels.boardList) {
            if (i.itemID == stack.itemID) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Registers a new Knife.
     * 
     * @param stack
     *            The Knife to add.
     */
    public static void registerCounterKnife(final ItemStack stack) {
        CounterFuels.knifeList.add(stack);
    }
    
    /**
     * Registers a new Board.
     * 
     * @param stack
     *            The Board to add.
     */
    public static void registerCounterBoard(final ItemStack stack) {
        CounterFuels.boardList.add(stack);
    }
}