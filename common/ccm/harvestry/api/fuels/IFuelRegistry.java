package ccm.harvestry.api.fuels;

import net.minecraft.item.ItemStack;

public interface IFuelRegistry {
    /**
     * Checks if a item is a Grind Stone.
     * 
     * @param stack
     *            The stack to check if it is a Grind Stone.
     * @return true if it is found in the Grinding List.
     */
    public boolean isFuel(final ItemStack stack);
    
    /**
     * Registers a new Grind Stone.
     * 
     * @param stack
     *            The Grind Stone to add.
     */
    public void registerFuel(final ItemStack stack);
}