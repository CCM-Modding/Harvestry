package harvestry.core.recipe;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.Item;

public final class RecipeHandler {

    private static List<String> toDelete = Arrays.asList(new String[] { 
            Integer.toString(Item.bread.itemID), 
            Integer.toString(Item.cake.itemID), 
            Integer.toString(Item.cookie.itemID), 
            Integer.toString(Item.pumpkinPie.itemID), 
            Integer.toString(Item.sugar.itemID) });

    /**
     * Initializes all the methods that handle Recipes.
     */
    public static void init() {
        RecipesRemover.delete(toDelete);
        RecipesOven.init();
        RecipesRoller.init();
        RecipesGrinder.init();
        RecipesCrafting.init();
        RecipesSmelting.init();
        RecipesCounter.init();
    }
}