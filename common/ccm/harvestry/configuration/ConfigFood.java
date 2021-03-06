/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.configuration;

import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.omnium.configuration.ConfigurationWrapper;
import ccm.nucleum.omnium.utils.helper.CCMLogger;

final class ConfigFood extends HarvestryConfig
{

    /**
     * Loads or creates the Food Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configFood(final ConfigurationWrapper config)
    {
        CCMLogger.finest(Harvestry.instance, "Loading Food Configs");
        int id = Properties.itemID;
        Properties.foodItemID = config.getItem("All the Items that are Foods", id++).getInt();
        Properties.uncookedFoodItemID = config.getItem("All the Items that are Uncooked Foods", id++).getInt();
    }
}