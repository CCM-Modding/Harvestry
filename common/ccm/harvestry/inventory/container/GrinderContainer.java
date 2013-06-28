package ccm.harvestry.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.fuels.GrinderFuels;
import ccm.harvestry.inventory.slot.OutputSlot;
import ccm.harvestry.inventory.slot.UseSlot;
import ccm.harvestry.tileentity.GrinderLogic;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GrinderContainer extends BaseContainer {

	private final ActiveTE		grinder;

	private final IGUITileLogic	grinderL;

	private int					lastGrindTime;

	/**
	 * Creates the Container for the Grinders GUI
	 * 
	 * @param player
	 *            The Player looking at the GUI
	 * @param grinder
	 *            The {@link GrinderLogic} instance that the player is looking at.
	 */
	public GrinderContainer(final InventoryPlayer player, final TileEntity grinder) {
		super(player, grinder, 8, 84, 142);
		this.grinder = (ActiveTE) grinder;
		grinderL = (IGUITileLogic) this.grinder.getTileLogic();
		// Left Hand Slot (Input)
		addSlotToContainer(new Slot(this.grinder, 0, 80, 13));
		// Top Slot (Grinding)
		addSlotToContainer(new UseSlot(this.grinder, 1, 56, 13, GrinderFuels.instance()));
		// Bottom Slot (Grinding)
		addSlotToContainer(new UseSlot(this.grinder, 2, 104, 13, GrinderFuels.instance()));
		// Right Hand Slot (Output)
		addSlotToContainer(new OutputSlot(this.grinder, 3, 80, 60));
	}

	@Override
	public void addCraftingToCrafters(final ICrafting crafting) {
		super.addCraftingToCrafters(crafting);
		crafting.sendProgressBarUpdate(this, 0, grinderL.getTimeLeft());
	}

	/**
	 * Looks for changes made in the container, sends them to every listener.
	 */
	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		if (grinderL.canRun()) {
			for (int i = 0; i < crafters.size(); ++i) {
				final ICrafting icrafting = (ICrafting) crafters.get(i);
				if (lastGrindTime != grinderL.getTimeLeft()) {
					icrafting.sendProgressBarUpdate(this, 0, grinderL.getTimeLeft());
				}
			}
			lastGrindTime = grinderL.getTimeLeft();
		} else {
			lastGrindTime = 0;
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
			grinderL.setTimeLeft(progress);
		}
	}
}