package ccm.harvestry.configuration;

import net.minecraftforge.common.Configuration;
import ccm.harvestry.Harvestry;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigFood extends Config
{

    /**
     * Loads or creates the Food Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configFood(final Configuration config)
    {
        Handler.log(Harvestry.instance, "Loading Food Configs");
        Properties.foodItemID = property.getNextUsableItemID(config, "All the Items that are Foods").getInt();
        Properties.uncookedFoodItemID = property.getNextUsableItemID(config, "All the Items that are Uncooked Foods").getInt();
    }
}