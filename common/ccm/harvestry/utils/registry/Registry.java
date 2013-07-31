/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry;

import ccm.harvestry.core.recipe.RecipeHandler;

public final class Registry
{

    /**
     * Registers everything that needs to be Registered.
     */
    public static void register()
    {

        BlockRegistry.registerBlocks();

        OreDictionaryRegistry.oreDictionary();

        WorldRegistry.registerWorld();

        RecipeHandler.init();
    }
}