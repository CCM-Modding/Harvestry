package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class GrinderFuels implements IFuelRegistry {
    
    /**
     * Grinder Fuels
     */
    private HashSet<ItemStack>        grinderList = new HashSet<ItemStack>();
    
    private static final GrinderFuels INSTANCE    = new GrinderFuels();
    
    public static GrinderFuels instance() {
        return INSTANCE;
    }
    
    /**
     * Checks if a item is a Grind Stone.
     * 
     * @param stack
     *            The stack to check if it is a Grind Stone.
     * @return true if it is found in the Grinding List.
     */
    public boolean isFuel(final ItemStack stack) {
        for (final ItemStack i : grinderList) {
            if (i.itemID == stack.itemID) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Registers a new Grind Stone.
     * 
     * @param stack
     *            The Grind Stone to add.
     */
    public void registerFuel(final ItemStack stack) {
        grinderList.add(stack);
    }
}