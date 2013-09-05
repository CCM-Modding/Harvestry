/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.fuels;

import ccm.nucleum.omnium.api.fuels.IFuelRegistry;

public final class GrillFuels extends IFuelRegistry
{
    private static final GrillFuels INSTANCE = new GrillFuels();

    private GrillFuels()
    {}

    public static GrillFuels instance()
    {
        return INSTANCE;
    }
}