package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import ccm.harvestry.inventory.slot.GrillSlot;
import ccm.harvestry.inventory.slot.OutputSlot;
import ccm.harvestry.tileentity.TileGrill;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GrillContainer extends BaseContainer
{

    private final TileGrill grill;

    private int             lastCookTime;

    /**
     * Creates the Container for the Grill GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileGrill} instance that the player is looking at.
     */
    public GrillContainer(final InventoryPlayer player,
                          final TileGrill grill)
    {
        super(player, grill, 8, 84, 142);
        this.grill = grill;
        // Left Hand Slot (Input)
        this.addSlotToContainer(new Slot(grill, 0, 56, 17));
        // Bottom Slot (Heating)
        this.addSlotToContainer(new GrillSlot(grill, 1, 56, 53));
        // Top Slot (Output 1)
        this.addSlotToContainer(new OutputSlot(grill, 2, 116, 25));
        // Right Hand Slot (Output 2)
        this.addSlotToContainer(new OutputSlot(grill, 3, 116, 44));
    }

    @Override
    public void addCraftingToCrafters(final ICrafting crafting)
    {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.grill.grillTime);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();
        if (this.grill.canGrill()){
            for (int i = 0; i < this.crafters.size(); ++i){
                final ICrafting icrafting = (ICrafting) this.crafters.get(i);
                if (this.lastCookTime != this.grill.grillTime){
                    icrafting.sendProgressBarUpdate(this, 0, this.grill.grillTime);
                }
            }
            this.lastCookTime = this.grill.grillTime;
        }else{
            this.lastCookTime = 0;
        }
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer player, final int slotIndex)
    {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int progressIndex, final int progress)
    {
        if (progressIndex == 0){
            this.grill.grillTime = progress;
        }
    }
}