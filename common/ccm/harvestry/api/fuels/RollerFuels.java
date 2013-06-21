package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class RollerFuels implements IFuelRegistry {
    
    /**
     * Roller Recipes
     */
    private HashSet<ItemStack>       rollerList = new HashSet<ItemStack>();
    
    private static final RollerFuels INSTANCE   = new RollerFuels();
    
    public static RollerFuels instance() {
        return INSTANCE;
    }
    
    /**
     * Checks if a item is a Roller.
     * 
     * @param stack
     *            The stack to check if it is a Heating Element.
     * @return true if it is found in the Oven's List.
     */
    public boolean isFuel(final ItemStack stack) {
        for (final ItemStack i : rollerList) {
            if (i.itemID == stack.itemID) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Registers a new Roller.
     * 
     * @param stack
     *            The Heating Element to add.
     */
    public void registerFuel(final ItemStack stack) {
        rollerList.add(stack);
    }
}