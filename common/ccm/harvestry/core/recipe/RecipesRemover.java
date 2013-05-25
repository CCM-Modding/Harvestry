package ccm.harvestry.core.recipe;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import ccm.harvestry.Harvestry;
import ccm.nucleum_omnium.handler.Handler;

final class RecipesRemover
{

    public static void delete(final List<String> noCraft)
    {
        Handler.log(Harvestry.instance, "Overwriting Food Stuffs!");
        int id;
        int meta;
        final ArrayList<ItemStack> items = new ArrayList<ItemStack>();
        // Decompose list into (item ID, Meta) pairs.
        for (final String s : noCraft){
            id = meta = 0;
            final String[] tmp = s.split(":");
            if ((tmp != null) && (tmp.length > 0)){
                try{
                    id = Integer.parseInt(tmp[0]);
                    if (tmp.length > 1){
                        try{
                            meta = Integer.parseInt(tmp[1]);
                        }catch(final Exception ex){
                            meta = 0;
                        }
                    }
                }catch(final Exception ex){
                    id = 0;
                }
            }
            if (id != 0){
                items.add(new ItemStack(id, 1, meta));
            }
        }
        /*
         * Iterate over recipe list, and remove a recipe when its output matches
         * one of our ItemStacks.
         */
        @SuppressWarnings("unchecked")
        final List<IRecipe> minecraftRecipes = CraftingManager.getInstance().getRecipeList();
        ItemStack result;
        for (int i = 0; i < minecraftRecipes.size(); ++i){
            final IRecipe tmp = minecraftRecipes.get(i);
            result = tmp.getRecipeOutput();
            if (result != null){
                for (final ItemStack removedItem : items){
                    /*
                     * Remove the item if the ID & meta match, OR if the IDs
                     * match, and banned meta is -1.
                     */
                    if ((result.itemID == removedItem.itemID) && ((removedItem.getItemDamage() == -1) || (result.getItemDamage() == removedItem.getItemDamage()))){
                        minecraftRecipes.remove(i);
                        Handler.log(Harvestry.instance, "Recipes removed for item " + removedItem.itemID + "/n");
                        --i;
                    }
                }
            }
        }
    }
}