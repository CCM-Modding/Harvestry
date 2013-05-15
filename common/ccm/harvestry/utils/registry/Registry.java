package ccm.harvestry.utils.registry;

import ccm.harvestry.Harvestry;
import ccm.harvestry.core.recipe.RecipeHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public final class Registry
{

    /**
     * Registers everything that needs to be Registered.
     */
    public static void register()
    {
        // Registers the GUI Handler
        NetworkRegistry.instance().registerGuiHandler(Harvestry.instance, Harvestry.proxy);
        OreDictionaryRegistry.oreDictionary();
        TileRegistry.registerTileEntities();
        BlockRegistry.registerBlocks();
        WorldRegistry.registerWorld();
        RecipeHandler.init();
    }
}