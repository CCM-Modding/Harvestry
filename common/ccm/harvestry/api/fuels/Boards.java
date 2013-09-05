/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.api.fuels;

import ccm.nucleum.omnium.api.fuels.IFuelRegistry;

public final class Boards extends IFuelRegistry
{
    private static final Boards INSTANCE = new Boards();

    private Boards()
    {}

    public static Boards instance()
    {
        return INSTANCE;
    }
}