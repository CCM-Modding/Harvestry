/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.fuels;

import ccm.nucleum.omnium.api.fuels.IFuelRegistry;

public final class RollerFuels extends IFuelRegistry
{
    private static final RollerFuels INSTANCE = new RollerFuels();

    private RollerFuels()
    {}

    public static RollerFuels instance()
    {
        return INSTANCE;
    }
}