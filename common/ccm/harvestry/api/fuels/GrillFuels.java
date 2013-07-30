package ccm.harvestry.api.fuels;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemStack;

import ccm.nucleum_omnium.api.fuels.IFuelRegistry;
import ccm.nucleum_omnium.helper.ItemHelper;

public final class GrillFuels implements IFuelRegistry {

    /**
     * Grill Fuels
     */
    private final Set<ItemStack>    fuels;

    private static final GrillFuels INSTANCE = new GrillFuels();

    private GrillFuels() {
        fuels = new HashSet<ItemStack>();
    }

    public static GrillFuels instance() {
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
            if (ItemHelper.equalsMeta(i, stack)) {
                return true;
            }
        }
        return false;
    }
}