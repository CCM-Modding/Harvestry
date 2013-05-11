package harvestry.configuration;

import harvestry.core.handlers.Handler;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

final class ConfigFood
{

    /**
     * Loads or creates the Food Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configFood(final Configuration config)
    {
        Handler.log(Level.INFO, "Loading Food Configs");
        Config.foodItemID = config.getItem("All the Items that are Foods", Config.getItemNextID()).getInt();
        Config.uncookedFoodItemID = config.getItem("All the Items that are Uncooked Foods", Config.getItemNextID()).getInt();
    }
}