/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.fuels;

import ccm.nucleum.omnium.api.fuels.IFuelRegistry;

public final class OvenFuels extends IFuelRegistry
{
    private static final OvenFuels INSTANCE = new OvenFuels();

    private OvenFuels()
    {}

    public static OvenFuels instance()
    {
        return INSTANCE;
    }
}