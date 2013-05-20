package ccm.harvestry.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class GrillRecipes
{

    private static final GrillRecipes grillBase = new GrillRecipes();

    /**
     * Used to call methods addOvenRecipe and getOvenResult.
     */
    public static final GrillRecipes grilling()
    {
        return grillBase;
    }

    /** The list of Oven results. */
    private final HashSet<Recipes> recipes = new HashSet<Recipes>();

    private GrillRecipes()
    {}

    /**
     * Adds a Grinding recipe. It natively supports meta data, and passing Items
     * as the first parameter :D
     */
    public void addGrillingRecipe(final Item input, final ItemStack output)
    {
        final ItemStack in = new ItemStack(input);
        this.recipes.add(new Recipes(in, output));
    }

    /**
     * Adds a Grinding recipe. It natively supports meta data, a Second Return,
     * and passing Items as the first parameter :D
     */
    public void addGrillingRecipe(final Item input, final ItemStack output, final ItemStack output2)
    {
        final ItemStack in = new ItemStack(input);
        this.recipes.add(new Recipes(in, output, output2));
    }

    /**
     * Adds a Oven Recipe. It natively supports meta data.
     */
    public void addGrillingRecipe(final ItemStack input, final ItemStack output)
    {
        this.recipes.add(new Recipes(input, output));
    }

    /**
     * Adds a Oven Recipe. It natively supports meta data, and a Second Return.
     */
    public void addGrillingRecipe(final ItemStack input, final ItemStack output, final ItemStack output2)
    {
        this.recipes.add(new Recipes(input, output, output2));
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * 
     * @param item
     *            The Source ItemStack
     * @return The result ItemStack
     */
    public Recipes getGrillingResult(final ItemStack item)
    {
        for (final Recipes r : this.recipes){
            if (r.isInput(item)){
                return r;
            }
        }
        return null;
    }

    public Set<Recipes> getOvenList()
    {
        return this.recipes;
    }
}