/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.fuels;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemStack;

import ccm.nucleum_omnium.api.fuels.IFuelRegistry;
import ccm.nucleum_omnium.utils.helper.ItemHelper;

public final class OvenFuels implements IFuelRegistry
{

    /**
     * Oven Fuels
     */
    private final Set<ItemStack> fuels;

    private static final OvenFuels INSTANCE = new OvenFuels();

    private OvenFuels()
    {
        fuels = new HashSet<ItemStack>();
    }

    public static OvenFuels instance()
    {
        return INSTANCE;
    }

    /**
     * Registers a new Fuel
     * 
     * @param stack
     *            The Fuel to add.
     */
    @Override
    public void registerFuel(final ItemStack stack)
    {
        fuels.add(stack);
    }

    /**
     * @param stack
     *            The stack to check if it is a Fuel
     * @return true if it is found in the Fuel List.
     */
    @Override
    public boolean isFuel(final ItemStack stack)
    {
        for (final ItemStack i : fuels)
        {
            if (ItemHelper.equals(i, stack))
            {
                return true;
            }
        }
        return false;
    }
}