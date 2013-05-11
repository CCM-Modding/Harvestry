package harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class RollerFuels
{

    /**
     * Roller Recipes
     */
    private static HashSet<ItemStack> rollerList = new HashSet<ItemStack>();

    /**
     * Checks if a item is a Roller.
     * 
     * @param stack
     *            The stack to check if it is a Heating Element.
     * @return true if it is found in the Oven's List.
     */
    public static boolean isRollerFuel(final ItemStack stack)
    {
        for (final ItemStack i : rollerList){
            if (i.itemID == stack.itemID){
                return true;
            }
        }
        return false;
    }

    /**
     * Registers a new Roller.
     * 
     * @param stack
     *            The Heating Element to add.
     */
    public static void registerRollerFuel(final ItemStack stack)
    {
        rollerList.add(stack);
    }
}