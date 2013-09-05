/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.fuels;

import ccm.nucleum.omnium.api.fuels.IFuelRegistry;

public final class Knifes extends IFuelRegistry
{
    private static final Knifes INSTANCE = new Knifes();

    private Knifes()
    {}

    public static Knifes instance()
    {
        return INSTANCE;
    }
}