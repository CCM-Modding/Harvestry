/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.utils.registry.recipe;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.Item;

import ccm.nucleum.omnium.utils.helper.recipe.RecipeRemover;

public final class RecipeHandler
{

    private static List<String> toDelete = Arrays.asList(new String[]
    { Integer.toString(Item.bread.itemID), Integer.toString(Item.cake.itemID), Integer.toString(Item.cookie.itemID), Integer.toString(Item.pumpkinPie.itemID),
            Integer.toString(Item.sugar.itemID) });

    /**
     * Initializes all the methods that handle Recipes.
     */
    public static void init()
    {
        RecipeRemover.delete(toDelete);
        new RecipesCrafting();
        new RecipesSmelting();
        new RecipesOven();
        new RecipesRoller();
        new RecipesGrinder();
        new RecipesCounter();
        new RecipesGrill();
    }
}