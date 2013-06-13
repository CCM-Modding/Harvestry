package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.inventory.slot.OutputSlot;
import ccm.harvestry.inventory.slot.OvenSlot;
import ccm.harvestry.tileentity.TileOven;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OvenContainer extends BaseContainer {

    private final TileOven oven;

    private int            lastCookTime;

    /**
     * Creates the Container for the Oven GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileOven} instance that the player is looking at.
     */
    public OvenContainer(final InventoryPlayer player, final TileEntity oven) {
        super(player, oven, 8, 84, 142);
        this.oven = (TileOven) oven;
        // Left Hand Slot (Input)
        this.addSlotToContainer(new Slot(this.oven, 0, 56, 17));
        // Bottom Slot (Heating)
        this.addSlotToContainer(new OvenSlot(this.oven, 1, 56, 53));
        // Top Slot (Output 1)
        this.addSlotToContainer(new OutputSlot(this.oven, 2, 116, 25));
        // Right Hand Slot (Output 2)
        this.addSlotToContainer(new OutputSlot(this.oven, 3, 116, 44));
    }

    @Override
    public void addCraftingToCrafters(final ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.oven.cookTime);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        if (this.oven.canCook()) {
            for (int i = 0; i < this.crafters.size(); ++i) {
                final ICrafting icrafting = (ICrafting) this.crafters.get(i);
                if (this.lastCookTime != this.oven.cookTime)
                    icrafting.sendProgressBarUpdate(this, 0, this.oven.cookTime);
            }
            this.lastCookTime = this.oven.cookTime;
        } else
            this.lastCookTime = 0;
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer player, final int slotIndex) {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int progressIndex, final int progress) {
        if (progressIndex == 0)
            this.oven.cookTime = progress;
    }
}