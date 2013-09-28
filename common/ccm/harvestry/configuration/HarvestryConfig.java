/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.configuration;

import ccm.nucleum.omnium.utils.handler.configuration.IConfig;

public class HarvestryConfig extends IConfig
{
    @Override
    public void init()
    {

        ConfigItems.configItems(config);
        ConfigFood.configFood(config);
        ConfigUsable.configUsable(config);
        ConfigWorldGen.configWorldGen(config);
        ConfigBlocks.configBlocks(config);
    }
}