package ccm.harvestry.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class GrillFuels
{

    /**
     * Grill Fuels
     */
    private static HashSet<ItemStack> grillList = new HashSet<ItemStack>();

    /**
     * Checks if a item is a Heating Element.
     * 
     * @param stack
     *            The stack to check if it is a Heating Element.
     * @return true if it is found in the Grill's List.
     */
    public static boolean isGrillFuel(final ItemStack stack)
    {
        for (final ItemStack i : grillList){
            if (i.itemID == stack.itemID){
                return true;
            }
        }
        return false;
    }

    /**
     * Registers a new Heating Element.
     * 
     * @param stack
     *            The Heating Element to add.
     */
    public static void registerGrillFuel(final ItemStack stack)
    {
        grillList.add(stack);
    }
}