package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.inventory.slot.GrinderSlot;
import ccm.harvestry.inventory.slot.OutputSlot;
import ccm.harvestry.tileentity.TileGrinder;

public class GrinderContainer extends BaseContainer
{

    private final TileGrinder grinder;

    private int               lastGrindTime;

    /**
     * Creates the Container for the Grinders GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileGrinder} instance that the player is looking
     *            at.
     */
    public GrinderContainer(final InventoryPlayer player,
                            final TileGrinder grinder)
    {
        super(player, grinder, 8, 84, 142);
        this.grinder = grinder;
        // Left Hand Slot (Input)
        this.addSlotToContainer(new Slot(grinder, 0, 80, 13));
        // Top Slot (Grinding)
        this.addSlotToContainer(new GrinderSlot(grinder, 1, 56, 13));
        // Bottom Slot (Grinding)
        this.addSlotToContainer(new GrinderSlot(grinder, 2, 104, 13));
        // Right Hand Slot (Output)
        this.addSlotToContainer(new OutputSlot(grinder, 3, 80, 60));
    }

    @Override
    public void addCraftingToCrafters(final ICrafting crafting)
    {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.grinder.grinderCookTime);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();
        if (this.grinder.canGrind()){
            for (int i = 0; i < this.crafters.size(); ++i){
                final ICrafting icrafting = (ICrafting) this.crafters.get(i);
                if (this.lastGrindTime != this.grinder.grinderCookTime){
                    icrafting.sendProgressBarUpdate(this, 0, this.grinder.grinderCookTime);
                }
            }
            this.lastGrindTime = this.grinder.grinderCookTime;
        }else{
            this.lastGrindTime = 0;
        }
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex)
    {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int progressIndex, final int progress)
    {
        if (progressIndex == 0){
            this.grinder.grinderCookTime = progress;
        }
    }
}