package ccm.harvestry.tileentity.logic;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.recipes.CounterRecipes;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.tileentity.logic.BaseLogic;

public class CounterLogic extends BaseLogic {

	private final InventoryTE		te;

	private final CounterRecipes	recipes		= CounterRecipes.instance();

	private final int				inputSlot	= 0;

	private final int				knifeSlot	= 1;

	private final int				boardSlot	= 2;

	private final int				invStart	= 3;

	public CounterLogic(TileEntity te) {
		this.te = (InventoryTE) te;
	}

	@Override
	public void runLogic() {

		if (!te.worldObj.isRemote) {
			if (canRun()) {
				ItemHelper.damageItem(te, knifeSlot, 1);
				ItemHelper.damageItem(te, boardSlot, 1);
				run();
				te.onInventoryChanged();
			}
		}
	}

	@Override
	public boolean canRun() {
		if (hasFuel()) {
			if (recipes.getCuttingResult(te.getStackInSlot(inputSlot)) != null) {

				final ItemStack itemstack = recipes.getCuttingResult(te.getStackInSlot(inputSlot))
													.getOutput1();
				int bestSlot = InventoryHelper.getBestInventory(te, invStart, itemstack);

				if (te.getStackInSlot(bestSlot) == null) {
					return true;
				}
				if (!te.getStackInSlot(bestSlot).isItemEqual(itemstack)) {
					return false;
				}

				final int result = te.getStackInSlot(bestSlot).stackSize + itemstack.stackSize;

				if (recipes.getCuttingResult(te.getStackInSlot(inputSlot)).hasSecondOutput()) {

					final ItemStack itemstack2 = recipes.getCuttingResult(te.getStackInSlot(inputSlot))
														.getOutput2();
					bestSlot = InventoryHelper.getBestInventory(te, invStart, itemstack);

					if (te.getStackInSlot(bestSlot) == null) {
						return true;
					}
					if (!te.getStackInSlot(bestSlot).isItemEqual(itemstack2)) {
						return false;
					}

					final int result2 = te.getStackInSlot(bestSlot).stackSize + itemstack2.stackSize;

					return ((result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize())) && ((result2 <= te.getInventoryStackLimit()) && (result2 <= itemstack2.getMaxStackSize()));
				}

				return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
			}
		}
		return false;
	}

	@Override
	public void run() {
		if (canRun()) {

			ItemStack itemstack = recipes.getCuttingResult(te.getStackInSlot(inputSlot)).getOutput1();
			int bestSlot = InventoryHelper.getBestInventory(te, invStart, itemstack);

			if (te.getStackInSlot(bestSlot) == null) {
				te.setInventorySlotContents(bestSlot, itemstack.copy());
			} else if (te.getStackInSlot(bestSlot).isItemEqual(itemstack)) {
				te.setInventorySlotContents(bestSlot,
											ItemHelper.getUniun(te.getStackInSlot(bestSlot), itemstack));
			}

			if (recipes.getCuttingResult(te.getStackInSlot(inputSlot)).hasSecondOutput()) {

				itemstack = recipes.getCuttingResult(te.getStackInSlot(inputSlot)).getOutput2();
				bestSlot = InventoryHelper.getBestInventory(te, invStart, itemstack);

				if (te.getStackInSlot(bestSlot) == null) {
					te.setInventorySlotContents(bestSlot, itemstack.copy());
				} else if (te.getStackInSlot(bestSlot).isItemEqual(itemstack)) {
					te.setInventorySlotContents(bestSlot,
												ItemHelper.getUniun(te.getStackInSlot(bestSlot), itemstack));
				}
			}
			te.decrStackSize(inputSlot, 1);
			if (te.getStackInSlot(inputSlot).stackSize <= 0) {
				InventoryHelper.setEmty(te, inputSlot);
			}
		}
	}

	/**
	 * @return True if it has fuel
	 */
	private boolean hasFuel() {
		if (te.getStackInSlot(inputSlot) != null) {
			if (te.getStackInSlot(knifeSlot) != null) {
				if (te.getStackInSlot(boardSlot) != null) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean isStackValidForSlot(int slot, ItemStack itemstack) {
		return false;
	}
}