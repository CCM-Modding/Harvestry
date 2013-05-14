package ccm.harvestry.configuration;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import ccm.harvestry.enums.ModToolEnum;
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
        Handler.log(Level.INFO, "Loading Usable Configs");
        Properties.gStoneID = property.getNextItem(config, ModToolEnum.gStone.name()).getInt();
        Properties.gGrateID = property.getNextItem(config, ModToolEnum.gGrate.name()).getInt();
        Properties.gIronID = property.getNextItem(config, ModToolEnum.gIron.name()).getInt();
        Properties.gObsidianID = property.getNextItem(config, ModToolEnum.gObsidian.name()).getInt();
        Properties.grindStonesID = property.getNextItem(config, ModToolEnum.grindStones.name()).getInt();
        Properties.heWoodID = property.getNextItem(config, ModToolEnum.heWood.name()).getInt();
        Properties.heAluminumID = property.getNextItem(config, ModToolEnum.heAluminum.name()).getInt();
        Properties.heIronID = property.getNextItem(config, ModToolEnum.heIron.name()).getInt();
        Properties.heGoldID = property.getNextItem(config, ModToolEnum.heGold.name()).getInt();
        Properties.heCopperID = property.getNextItem(config, ModToolEnum.heCopper.name()).getInt();
        Properties.toolKnifeAID = property.getNextItem(config, ModToolEnum.toolKnifeA.name()).getInt();
        Properties.toolKnifeIID = property.getNextItem(config, ModToolEnum.toolKnifeI.name()).getInt();
        Properties.toolKnifeGID = property.getNextItem(config, ModToolEnum.toolKnifeG.name()).getInt();
        Properties.toolCuttingBoardID = property.getNextItem(config, ModToolEnum.toolCuttingBoard.name()).getInt();
        Properties.toolGrateID = property.getNextItem(config, ModToolEnum.toolGrate.name()).getInt();
        Properties.toolClippersID = property.getNextItem(config, ModToolEnum.toolClippers.name()).getInt();
        Properties.heBronzeID = property.getNextItem(config, ModToolEnum.heBronze.name()).getInt();
        Properties.heTinID = property.getNextItem(config, ModToolEnum.heTin.name()).getInt();
        Properties.toolKnifeBID = property.getNextItem(config, ModToolEnum.toolKnifeB.name()).getInt();
        Properties.gBronzeID = property.getNextItem(config, ModToolEnum.gBronze.name()).getInt();
    }
}