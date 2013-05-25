package ccm.harvestry.configuration;

import net.minecraftforge.common.Configuration;
import ccm.harvestry.Harvestry;
import ccm.harvestry.enums.items.ModToolEnum;
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
        Properties.gStoneID = property.getNextUsableItemID(config, ModToolEnum.gStone.name()).getInt();
        Properties.gGrateID = property.getNextUsableItemID(config, ModToolEnum.gGrate.name()).getInt();
        Properties.gIronID = property.getNextUsableItemID(config, ModToolEnum.gIron.name()).getInt();
        Properties.gObsidianID = property.getNextUsableItemID(config, ModToolEnum.gObsidian.name()).getInt();
        Properties.grindStonesID = property.getNextUsableItemID(config, ModToolEnum.grindStones.name()).getInt();
        Properties.heWoodID = property.getNextUsableItemID(config, ModToolEnum.heWood.name()).getInt();
        Properties.heAluminumID = property.getNextUsableItemID(config, ModToolEnum.heAluminum.name()).getInt();
        Properties.heIronID = property.getNextUsableItemID(config, ModToolEnum.heIron.name()).getInt();
        Properties.heGoldID = property.getNextUsableItemID(config, ModToolEnum.heGold.name()).getInt();
        Properties.heCopperID = property.getNextUsableItemID(config, ModToolEnum.heCopper.name()).getInt();
        Properties.toolKnifeAID = property.getNextUsableItemID(config, ModToolEnum.toolKnifeA.name()).getInt();
        Properties.toolKnifeIID = property.getNextUsableItemID(config, ModToolEnum.toolKnifeI.name()).getInt();
        Properties.toolKnifeGID = property.getNextUsableItemID(config, ModToolEnum.toolKnifeG.name()).getInt();
        Properties.toolCuttingBoardID = property.getNextUsableItemID(config, ModToolEnum.toolCuttingBoard.name()).getInt();
        Properties.toolGrateID = property.getNextUsableItemID(config, ModToolEnum.toolGrate.name()).getInt();
        Properties.toolClippersID = property.getNextUsableItemID(config, ModToolEnum.toolClippers.name()).getInt();
        Properties.heBronzeID = property.getNextUsableItemID(config, ModToolEnum.heBronze.name()).getInt();
        Properties.heTinID = property.getNextUsableItemID(config, ModToolEnum.heTin.name()).getInt();
        Properties.toolKnifeBID = property.getNextUsableItemID(config, ModToolEnum.toolKnifeB.name()).getInt();
        Properties.gBronzeID = property.getNextUsableItemID(config, ModToolEnum.gBronze.name()).getInt();
    }
}