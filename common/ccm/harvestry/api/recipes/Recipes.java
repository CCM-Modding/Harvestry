package ccm.harvestry.api.recipes;

import net.minecraft.item.ItemStack;

public class Recipes
{

    private final ItemStack input;

    private final ItemStack output1;

    private ItemStack       output2;

    private final boolean   hasSecondOutput;

    public Recipes(final ItemStack input,
                   final ItemStack output1)
    {
        this.input = input;
        this.output1 = output1;
        this.hasSecondOutput = false;
    }

    public Recipes(final ItemStack input,
                   final ItemStack output1,
                   final ItemStack output2)
    {
        this.input = input;
        this.output1 = output1;
        this.output2 = output2;
        this.hasSecondOutput = true;
    }

    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        final Recipes other = (Recipes) obj;
        if (this.hasSecondOutput != other.hasSecondOutput){
            return false;
        }
        if (this.input == null){
            if (other.input != null){
                return false;
            }
        }else if (!this.input.equals(other.input)){
            return false;
        }
        if (this.output1 == null){
            if (other.output1 != null){
                return false;
            }
        }else if (!this.output1.equals(other.output1)){
            return false;
        }
        if (this.output2 == null){
            if (other.output2 != null){
                return false;
            }
        }else if (!this.output2.equals(other.output2)){
            return false;
        }
        return true;
    }

    public ItemStack getOutput1()
    {
        return this.output1;
    }

    public ItemStack getOutput2()
    {
        return this.output2;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + (this.hasSecondOutput ? 1231 : 1237);
        result = (prime * result) + ((this.input == null) ? 0 : this.input.hashCode());
        result = (prime * result) + ((this.output1 == null) ? 0 : this.output1.hashCode());
        result = (prime * result) + ((this.output2 == null) ? 0 : this.output2.hashCode());
        return result;
    }

    public boolean hasSecondOutput()
    {
        return this.hasSecondOutput;
    }

    public boolean isInput(final ItemStack stack)
    {
        return this.input.isItemEqual(stack);
    }
}