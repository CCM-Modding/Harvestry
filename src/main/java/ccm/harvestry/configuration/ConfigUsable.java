/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.configuration;

import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.items.EnumModTool;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.LogHandler;

final class ConfigUsable extends HarvestryConfig
{

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final AdvConfiguration config)
    {
        LogHandler.finest(Harvestry.instance, "Loading Usable Configs");
        int id = Properties.itemID;
        Properties.gStoneID = config.getItem(EnumModTool.gStone.name(), id++).getInt();
        Properties.gGrateID = config.getItem(EnumModTool.gGrate.name(), id++).getInt();
        Properties.gIronID = config.getItem(EnumModTool.gIron.name(), id++).getInt();
        Properties.gObsidianID = config.getItem(EnumModTool.gObsidian.name(), id++).getInt();
        Properties.grindStonesID = config.getItem(EnumModTool.grindStones.name(), id++).getInt();
        Properties.heWoodID = config.getItem(EnumModTool.heWood.name(), id++).getInt();
        Properties.heAluminumID = config.getItem(EnumModTool.heAluminum.name(), id++).getInt();
        Properties.heIronID = config.getItem(EnumModTool.heIron.name(), id++).getInt();
        Properties.heGoldID = config.getItem(EnumModTool.heGold.name(), id++).getInt();
        Properties.heCopperID = config.getItem(EnumModTool.heCopper.name(), id++).getInt();
        Properties.toolKnifeAID = config.getItem(EnumModTool.toolKnifeA.name(), id++).getInt();
        Properties.toolKnifeIID = config.getItem(EnumModTool.toolKnifeI.name(), id++).getInt();
        Properties.toolKnifeGID = config.getItem(EnumModTool.toolKnifeG.name(), id++).getInt();
        Properties.toolCuttingBoardID = config.getItem(EnumModTool.toolCuttingBoard.name(), Properties.itemID)
                                              .getInt();
        Properties.toolGrateID = config.getItem(EnumModTool.toolGrate.name(), id++).getInt();
        Properties.toolClippersID = config.getItem(EnumModTool.toolClippers.name(), Properties.itemID)
                                          .getInt();
        Properties.heBronzeID = config.getItem(EnumModTool.heBronze.name(), id++).getInt();
        Properties.heTinID = config.getItem(EnumModTool.heTin.name(), id++).getInt();
        Properties.toolKnifeBID = config.getItem(EnumModTool.toolKnifeB.name(), id++).getInt();
        Properties.gBronzeID = config.getItem(EnumModTool.gBronze.name(), id++).getInt();
    }
}