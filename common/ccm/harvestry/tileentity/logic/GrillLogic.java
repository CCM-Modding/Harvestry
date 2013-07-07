package ccm.harvestry.tileentity.logic;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.logic.BaseGUILogic;

public class GrillLogic extends BaseGUILogic {

	private final ActiveTE		te;

	private final GrillRecipes	recipes	= GrillRecipes.instance();

	public GrillLogic(TileEntity te) {
		this.te = (ActiveTE) te;
	}

	@Override
	public void runLogic() {

		if (!te.worldObj.isRemote) {
			if (canRun()) {
				ItemHelper.damageItem(te.getInventory(), 1, 3);
				ItemHelper.damageItem(te.getInventory(), 2, 3);
				te.updateIfChanged(true);
				++progress;
				if (progress == 200) {
					progress = 0;
					run();
					te.onInventoryChanged();
					te.updateIfChanged(false);
				}
			} else {
				progress = 0;
				te.updateIfChanged(false);
			}
		}
	}

	/**
	 * Returns true if the grill can grind an item, i.e. has a source item, destination stack isn't
	 * full, etc.
	 */
	@Override
	public boolean canRun() {
		if (te.getStackInSlot(0) != null) {
			if ((te.getStackInSlot(1) != null) && (te.getStackInSlot(2) != null)) {
				if (recipes.getGrillingResult(te.getStackInSlot(0)) != null) {
					final ItemStack itemstack = recipes.getGrillingResult(te.getStackInSlot(0)).getOutput1();
					if (te.getStackInSlot(3) == null) {
						return true;
					}
					if (!te.getStackInSlot(3).isItemEqual(itemstack)) {
						return false;
					}
					final int result = te.getStackInSlot(3).stackSize + itemstack.stackSize;
					return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Turn one item from the grill source stack into the appropriate ground item in the grill
	 * result stack
	 */
	@Override
	public void run() {
		if (canRun()) {
			final ItemStack itemstack = recipes.getGrillingResult(te.getStackInSlot(0)).getOutput1();
			if (te.getStackInSlot(3) == null) {
				te.setInventorySlotContents(3, itemstack.copy());
			} else if (te.getStackInSlot(3).isItemEqual(itemstack)) {
				te.getInventory()[3].stackSize += itemstack.stackSize;
			}
			--te.getInventory()[3].stackSize;
			if (te.getStackInSlot(0).stackSize <= 0) {
				te.setInventorySlotContents(0, null);
			}
		}
	}

	@Override
	public boolean isStackValidForSlot(int slot, ItemStack itemstack) {
		return false;
	}
}