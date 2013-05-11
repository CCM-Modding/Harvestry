package harvestry.configuration;

import harvestry.item.enums.EnumUseAble;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import nucleum_omnium.handler.Handler;

final class ConfigUsable
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
        Config.gStoneID = config.getItem(EnumUseAble.gStone.name(), Config.getItemNextID()).getInt();
        Config.gGrateID = config.getItem(EnumUseAble.gGrate.name(), Config.getItemNextID()).getInt();
        Config.gIronID = config.getItem(EnumUseAble.gIron.name(), Config.getItemNextID()).getInt();
        Config.gObsidianID = config.getItem(EnumUseAble.gObsidian.name(), Config.getItemNextID()).getInt();
        Config.grindStonesID = config.getItem(EnumUseAble.grindStones.name(), Config.getItemNextID()).getInt();
        Config.heWoodID = config.getItem(EnumUseAble.heWood.name(), Config.getItemNextID()).getInt();
        Config.heAluminumID = config.getItem(EnumUseAble.heAluminum.name(), Config.getItemNextID()).getInt();
        Config.heIronID = config.getItem(EnumUseAble.heIron.name(), Config.getItemNextID()).getInt();
        Config.heGoldID = config.getItem(EnumUseAble.heGold.name(), Config.getItemNextID()).getInt();
        Config.heCopperID = config.getItem(EnumUseAble.heCopper.name(), Config.getItemNextID()).getInt();
        Config.toolKnifeAID = config.getItem(EnumUseAble.toolKnifeA.name(), Config.getItemNextID()).getInt();
        Config.toolKnifeIID = config.getItem(EnumUseAble.toolKnifeI.name(), Config.getItemNextID()).getInt();
        Config.toolKnifeGID = config.getItem(EnumUseAble.toolKnifeG.name(), Config.getItemNextID()).getInt();
        Config.toolCuttingBoardID = config.getItem(EnumUseAble.toolCuttingBoard.name(), Config.getItemNextID()).getInt();
        Config.toolGrateID = config.getItem(EnumUseAble.toolGrate.name(), Config.getItemNextID()).getInt();
        Config.toolClippersID = config.getItem(EnumUseAble.toolClippers.name(), Config.getItemNextID()).getInt();
        Config.heBronzeID = config.getItem(EnumUseAble.heBronze.name(), Config.getItemNextID()).getInt();
        Config.heTinID = config.getItem(EnumUseAble.heTin.name(), Config.getItemNextID()).getInt();
        Config.toolKnifeBID = config.getItem(EnumUseAble.toolKnifeB.name(), Config.getItemNextID()).getInt();
        Config.gBronzeID = config.getItem(EnumUseAble.gBronze.name(), Config.getItemNextID()).getInt();
    }
}