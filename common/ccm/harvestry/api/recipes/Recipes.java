package ccm.harvestry.api.recipes;

import net.minecraft.item.ItemStack;

public class Recipes {
    
    private final ItemStack input;
    
    private final ItemStack output1;
    
    private ItemStack       output2;
    
    private final boolean   hasSecondOutput;
    
    public Recipes(final ItemStack input, final ItemStack output1) {
        this.input = input;
        this.output1 = output1;
        hasSecondOutput = false;
    }
    
    public Recipes(final ItemStack input, final ItemStack output1, final ItemStack output2) {
        this.input = input;
        this.output1 = output1;
        this.output2 = output2;
        hasSecondOutput = true;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Recipes other = (Recipes) obj;
        if (hasSecondOutput != other.hasSecondOutput) {
            return false;
        }
        if (input == null) {
            if (other.input != null) {
                return false;
            }
        } else if (!input.equals(other.input)) {
            return false;
        }
        if (output1 == null) {
            if (other.output1 != null) {
                return false;
            }
        } else if (!output1.equals(other.output1)) {
            return false;
        }
        if (output2 == null) {
            if (other.output2 != null) {
                return false;
            }
        } else if (!output2.equals(other.output2)) {
            return false;
        }
        return true;
    }
    
    public ItemStack getOutput1() {
        return output1;
    }
    
    public ItemStack getOutput2() {
        return output2;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + (hasSecondOutput ? 1231 : 1237);
        result = (prime * result) + (input == null ? 0 : input.hashCode());
        result = (prime * result) + (output1 == null ? 0 : output1.hashCode());
        result = (prime * result) + (output2 == null ? 0 : output2.hashCode());
        return result;
    }
    
    public boolean hasSecondOutput() {
        return hasSecondOutput;
    }
    
    public boolean isInput(final ItemStack stack) {
        return input.isItemEqual(stack);
    }
}