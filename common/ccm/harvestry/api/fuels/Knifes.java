package ccm.harvestry.api.fuels;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemStack;

import ccm.nucleum_omnium.api.fuels.IFuelRegistry;
import ccm.nucleum_omnium.helper.ItemHelper;

public final class Knifes implements IFuelRegistry {

    /**
     * Counter's Knifes
     */
    private final Set<ItemStack> fuels;

    private static final Knifes  INSTANCE = new Knifes();

    private Knifes() {
        fuels = new HashSet<ItemStack>();
    }

    public static Knifes instance() {
        return INSTANCE;
    }

    /**
     * Registers a new Fuel
     * 
     * @param stack
     *            The Fuel to add.
     */
    @Override
    public void registerFuel(final ItemStack stack) {
        fuels.add(stack);
    }

    /**
     * @param stack
     *            The stack to check if it is a Fuel
     * @return true if it is found in the Fuel List.
     */
    @Override
    public boolean isFuel(final ItemStack stack) {
        for (final ItemStack i : fuels) {
            if (ItemHelper.equals(i, stack)) {
                return true;
            }
        }
        return false;
    }
}