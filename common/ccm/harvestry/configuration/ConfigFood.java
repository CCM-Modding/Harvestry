package ccm.harvestry.configuration;


import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum.configuration.AdvConfiguration;
import ccm.nucleum.handler.Handler;

final class ConfigFood extends Config
{

    /**
     * Loads or creates the Food Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configFood(final AdvConfiguration config)
    {
        Handler.log(Harvestry.instance, "Loading Food Configs");
        Properties.foodItemID = config.getItem("All the Items that are Foods", Properties.itemID).getInt();
        Properties.uncookedFoodItemID = config.getItem("All the Items that are Uncooked Foods", Properties.itemID).getInt();
    }
}