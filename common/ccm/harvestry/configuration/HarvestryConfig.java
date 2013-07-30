package ccm.harvestry.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.config.IConfig;

public class HarvestryConfig implements IConfig {

    private AdvConfiguration config;

    @Override
    public IConfig setConfiguration(final AdvConfiguration config) {
        this.config = config;
        return this;
    }

    @Override
    public AdvConfiguration getConfiguration() {
        return config;
    }

    @Override
    public void init() {

        ConfigItems.configItems(config);
        ConfigFood.configFood(config);
        ConfigUsable.configUsable(config);
        ConfigWorldGen.configWorldGen(config);
        ConfigBlocks.configBlocks(config);
    }
}