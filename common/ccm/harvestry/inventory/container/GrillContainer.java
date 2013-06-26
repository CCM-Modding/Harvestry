package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.fuels.GrillFuels;
import ccm.harvestry.inventory.slot.OutputSlot;
import ccm.harvestry.inventory.slot.UseSlot;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GrillContainer extends BaseContainer {
    
    private final IGUITileLogic grill;
    
    private int                 lastCookTime;
    
    /**
     * Creates the Container for the Grill GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileGrill} instance that the player is looking at.
     */
    public GrillContainer(final InventoryPlayer player, final TileEntity grill) {
        super(player, grill, 8, 84, 142);
        InventoryTE te = (InventoryTE) grill;
        this.grill = (IGUITileLogic) te.getTileLogic();
        // Left Hand Slot (Input)
        addSlotToContainer(new Slot(te, 0, 56, 17));
        // Bottom Slot (Heating)
        addSlotToContainer(new UseSlot(te, 1, 56, 53, GrillFuels.instance()));
        // Top Slot (Output 1)
        addSlotToContainer(new OutputSlot(te, 2, 116, 25));
        // Right Hand Slot (Output 2)
        addSlotToContainer(new OutputSlot(te, 3, 116, 44));
    }
    
    @Override
    public void addCraftingToCrafters(final ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, grill.getTimeLeft());
    }
    
    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        if (grill.canRun()) {
            for (int i = 0; i < crafters.size(); ++i) {
                final ICrafting icrafting = (ICrafting) crafters.get(i);
                if (lastCookTime != grill.getTimeLeft()) {
                    icrafting.sendProgressBarUpdate(this, 0, grill.getTimeLeft());
                }
            }
            lastCookTime = grill.getTimeLeft();
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
            grill.setTimeLeft(progress);
        }
    }
}