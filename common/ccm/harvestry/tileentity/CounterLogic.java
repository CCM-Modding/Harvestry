package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.tileentity.interfaces.ITileLogic;

public class CounterLogic implements ITileLogic {

	private final InventoryTE		te;

	private final CounterRecipes	recipes	= CounterRecipes.instance();

	public CounterLogic(final TileEntity te) {
		this.te = (InventoryTE) te;
	}

	@Override
	public void runLogic() {

		if (!te.worldObj.isRemote) {
			if (canRun()) {
				ItemHelper.damageItem(te.getInventory(), 1, 1);
				ItemHelper.damageItem(te.getInventory(), 2, 1);
				run();
				te.onInventoryChanged();
			}
		}
	}

	/**
	 * Returns true if the grinder can grind an item, i.e. has a source item, destination stack
	 * isn't full, etc.
	 */
	@Override
	public boolean canRun() {
		if (hasFuel()) {
			if (recipes.getCuttingResult(te.getStackInSlot(0)) != null) {
				final ItemStack itemstack = recipes.getCuttingResult(te.getStackInSlot(0)).getOutput1();
				if (te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack)] == null) {
					return true;
				}
				if (!te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack)].isItemEqual(itemstack)) {
					return false;
				}
				final int result = te.getInventory()[InventoryHelper.getBestInventory(	te.getInventory(),
																						3,
																						itemstack)].stackSize + itemstack.stackSize;
				if (recipes.getCuttingResult(te.getStackInSlot(0)).hasSecondOutput()) {
					final ItemStack itemstack2 = recipes.getCuttingResult(te.getStackInSlot(0)).getOutput2();
					if (te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack2)] == null) {
						return true;
					}
					if (!te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack2)].isItemEqual(itemstack2)) {
						return false;
					}
					final int result2 = te.getInventory()[InventoryHelper.getBestInventory(	te.getInventory(),
																							3,
																							itemstack2)].stackSize + itemstack2.stackSize;
					return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize())
							&& (result2 <= te.getInventoryStackLimit())
							&& (result2 <= itemstack2.getMaxStackSize());
				} else {
					return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Turn one item from the grinder source stack into the appropriate ground item in the grinder
	 * result stack
	 */
	@Override
	public void run() {
		if (canRun()) {
			final ItemStack itemstack = recipes.getCuttingResult(te.getStackInSlot(0)).getOutput1();
			if (te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack)] == null) {
				te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack)] = itemstack.copy();
			} else if (te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack)].isItemEqual(itemstack)) {
				te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack)].stackSize += itemstack.stackSize;
			}
			if (recipes.getCuttingResult(te.getStackInSlot(0)).hasSecondOutput()) {
				final ItemStack itemstack2 = recipes.getCuttingResult(te.getStackInSlot(0)).getOutput2();
				if (te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack2)] == null) {
					te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack2)] = itemstack2.copy();
				} else if (te.getInventory()[InventoryHelper.getBestInventory(	te.getInventory(),
																				3,
																				itemstack2)].isItemEqual(itemstack2)) {
					te.getInventory()[InventoryHelper.getBestInventory(te.getInventory(), 3, itemstack2)].stackSize += itemstack2.stackSize;
				}
			}
			--te.getInventory()[0].stackSize;
			if (te.getStackInSlot(0).stackSize <= 0) {
				te.setInventorySlotContents(0, null);
			}
		}
	}

	private boolean hasFuel() {
		if ((te.getStackInSlot(1) != null) && (te.getStackInSlot(2) != null)
			&& (te.getStackInSlot(0) != null)) {
			return true;
		} else {
			return false;
		}
	}
}