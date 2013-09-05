/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.fuels;

import ccm.nucleum.omnium.api.fuels.IFuelRegistry;

public final class GrinderFuels extends IFuelRegistry
{
    private static final GrinderFuels INSTANCE = new GrinderFuels();

    private GrinderFuels()
    {}

    public static GrinderFuels instance()
    {
        return INSTANCE;
    }
}