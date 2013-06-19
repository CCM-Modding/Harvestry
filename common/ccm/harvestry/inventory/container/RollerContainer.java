package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.inventory.slot.OutputSlot;
import ccm.harvestry.inventory.slot.RollerSlot;
import ccm.harvestry.tileentity.TileRoller;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RollerContainer extends BaseContainer {
    
    private final TileRoller roller;
    
    private int              lastRollTime;
    
    /**
     * Creates the Container for the Roller GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileRoller} instance that the player is looking at.
     */
    public RollerContainer(final InventoryPlayer player, final TileEntity roller) {
        super(player, roller, 8, 84, 142);
        this.roller = (TileRoller) roller;
        // Left Hand Slot (Input)
        addSlotToContainer(new Slot(this.roller, 0, 48, 36));
        // Top Slot (Grinding)
        addSlotToContainer(new RollerSlot(this.roller, 1, 48, 14));
        // Bottom Slot (Grinding)
        addSlotToContainer(new RollerSlot(this.roller, 2, 48, 58));
        // Right Hand Slot (Output)
        addSlotToContainer(new OutputSlot(this.roller, 3, 115, 36));
    }
    
    @Override
    public void addCraftingToCrafters(final ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, roller.rollerCookTime);
    }
    
    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        if (roller.canRoll()) {
            for (int i = 0; i < crafters.size(); ++i) {
                final ICrafting icrafting = (ICrafting) crafters.get(i);
                if (lastRollTime != roller.rollerCookTime) {
                    icrafting.sendProgressBarUpdate(this, 0, roller.rollerCookTime);
                }
            }
            lastRollTime = roller.rollerCookTime;
        } else {
            lastRollTime = 0;
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex) {
        return null;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int progressIndex, final int progress) {
        if (progressIndex == 0) {
            roller.rollerCookTime = progress;
        }
    }
}