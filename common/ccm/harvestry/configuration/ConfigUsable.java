package ccm.harvestry.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;

import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.items.EnumModTool;
import ccm.harvestry.utils.lib.Properties;

final class ConfigUsable extends Config
{

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final AdvConfiguration config)
    {
        Handler.log(Harvestry.instance, "Loading Usable Configs");
        Properties.gStoneID = config.getItem(EnumModTool.gStone.name(), Properties.itemID).getInt();
        Properties.gGrateID = config.getItem(EnumModTool.gGrate.name(), Properties.itemID).getInt();
        Properties.gIronID = config.getItem(EnumModTool.gIron.name(), Properties.itemID).getInt();
        Properties.gObsidianID = config.getItem(EnumModTool.gObsidian.name(), Properties.itemID).getInt();
        Properties.grindStonesID = config.getItem(EnumModTool.grindStones.name(), Properties.itemID).getInt();
        Properties.heWoodID = config.getItem(EnumModTool.heWood.name(), Properties.itemID).getInt();
        Properties.heAluminumID = config.getItem(EnumModTool.heAluminum.name(), Properties.itemID).getInt();
        Properties.heIronID = config.getItem(EnumModTool.heIron.name(), Properties.itemID).getInt();
        Properties.heGoldID = config.getItem(EnumModTool.heGold.name(), Properties.itemID).getInt();
        Properties.heCopperID = config.getItem(EnumModTool.heCopper.name(), Properties.itemID).getInt();
        Properties.toolKnifeAID = config.getItem(EnumModTool.toolKnifeA.name(), Properties.itemID).getInt();
        Properties.toolKnifeIID = config.getItem(EnumModTool.toolKnifeI.name(), Properties.itemID).getInt();
        Properties.toolKnifeGID = config.getItem(EnumModTool.toolKnifeG.name(), Properties.itemID).getInt();
        Properties.toolCuttingBoardID = config.getItem(EnumModTool.toolCuttingBoard.name(), Properties.itemID).getInt();
        Properties.toolGrateID = config.getItem(EnumModTool.toolGrate.name(), Properties.itemID).getInt();
        Properties.toolClippersID = config.getItem(EnumModTool.toolClippers.name(), Properties.itemID).getInt();
        Properties.heBronzeID = config.getItem(EnumModTool.heBronze.name(), Properties.itemID).getInt();
        Properties.heTinID = config.getItem(EnumModTool.heTin.name(), Properties.itemID).getInt();
        Properties.toolKnifeBID = config.getItem(EnumModTool.toolKnifeB.name(), Properties.itemID).getInt();
        Properties.gBronzeID = config.getItem(EnumModTool.gBronze.name(), Properties.itemID).getInt();
    }
}