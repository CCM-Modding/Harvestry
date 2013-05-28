package ccm.harvestry.configuration;

import net.minecraftforge.common.Configuration;
import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.items.EnumModTool;
import ccm.harvestry.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigUsable extends Config
{

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final Configuration config)
    {
        Handler.log(Harvestry.instance, "Loading Usable Configs");
        Properties.gStoneID = property.getNextUsableItemID(config, EnumModTool.gStone.name()).getInt();
        Properties.gGrateID = property.getNextUsableItemID(config, EnumModTool.gGrate.name()).getInt();
        Properties.gIronID = property.getNextUsableItemID(config, EnumModTool.gIron.name()).getInt();
        Properties.gObsidianID = property.getNextUsableItemID(config, EnumModTool.gObsidian.name()).getInt();
        Properties.grindStonesID = property.getNextUsableItemID(config, EnumModTool.grindStones.name()).getInt();
        Properties.heWoodID = property.getNextUsableItemID(config, EnumModTool.heWood.name()).getInt();
        Properties.heAluminumID = property.getNextUsableItemID(config, EnumModTool.heAluminum.name()).getInt();
        Properties.heIronID = property.getNextUsableItemID(config, EnumModTool.heIron.name()).getInt();
        Properties.heGoldID = property.getNextUsableItemID(config, EnumModTool.heGold.name()).getInt();
        Properties.heCopperID = property.getNextUsableItemID(config, EnumModTool.heCopper.name()).getInt();
        Properties.toolKnifeAID = property.getNextUsableItemID(config, EnumModTool.toolKnifeA.name()).getInt();
        Properties.toolKnifeIID = property.getNextUsableItemID(config, EnumModTool.toolKnifeI.name()).getInt();
        Properties.toolKnifeGID = property.getNextUsableItemID(config, EnumModTool.toolKnifeG.name()).getInt();
        Properties.toolCuttingBoardID = property.getNextUsableItemID(config, EnumModTool.toolCuttingBoard.name()).getInt();
        Properties.toolGrateID = property.getNextUsableItemID(config, EnumModTool.toolGrate.name()).getInt();
        Properties.toolClippersID = property.getNextUsableItemID(config, EnumModTool.toolClippers.name()).getInt();
        Properties.heBronzeID = property.getNextUsableItemID(config, EnumModTool.heBronze.name()).getInt();
        Properties.heTinID = property.getNextUsableItemID(config, EnumModTool.heTin.name()).getInt();
        Properties.toolKnifeBID = property.getNextUsableItemID(config, EnumModTool.toolKnifeB.name()).getInt();
        Properties.gBronzeID = property.getNextUsableItemID(config, EnumModTool.gBronze.name()).getInt();
    }
}