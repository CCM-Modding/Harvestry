package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.fuels.OvenFuels;
import ccm.harvestry.inventory.slot.OutputSlot;
import ccm.harvestry.inventory.slot.UseSlot;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OvenContainer extends BaseContainer {
    
    private final ActiveTE      oven;
    
    private final IGUITileLogic ovenL;
    
    private int                 lastCookTime;
    
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
        this.oven = (ActiveTE) oven;
        ovenL = (IGUITileLogic) this.oven.getTileLogic();
        // Left Hand Slot (Input)
        addSlotToContainer(new Slot(this.oven, 0, 56, 17));
        // Bottom Slot (Heating)
        addSlotToContainer(new UseSlot(this.oven, 1, 56, 53, OvenFuels.instance()));
        // Top Slot (Output 1)
        addSlotToContainer(new OutputSlot(this.oven, 2, 116, 25));
        // Right Hand Slot (Output 2)
        addSlotToContainer(new OutputSlot(this.oven, 3, 116, 44));
    }
    
    @Override
    public void addCraftingToCrafters(final ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, ovenL.getTimeLeft());
    }
    
    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        if (ovenL.canRun()) {
            for (int i = 0; i < crafters.size(); ++i) {
                final ICrafting icrafting = (ICrafting) crafters.get(i);
                if (lastCookTime != ovenL.getTimeLeft()) {
                    icrafting.sendProgressBarUpdate(this, 0, ovenL.getTimeLeft());
                }
            }
            lastCookTime = ovenL.getTimeLeft();
        } else {
            lastCookTime = 0;
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer player, final int slotIndex) {
        return null;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int progressIndex, final int progress) {
        if (progressIndex == 0) {
            ovenL.setTimeLeft(progress);
        }
    }
}