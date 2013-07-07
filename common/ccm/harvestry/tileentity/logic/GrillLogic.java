package ccm.harvestry.tileentity.logic;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.recipes.GrillRecipes;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.logic.BaseGUILogic;

public class GrillLogic extends BaseGUILogic {

	private final ActiveTE		te;

	private final GrillRecipes	recipes		= GrillRecipes.instance();

	private final int			inputSlot	= 0;

	private final int			fuelSlot	= 1;

	private final int			outSlot		= 2;

	private final int			outSlot2	= 3;

	public GrillLogic(TileEntity te) {
		this.te = (ActiveTE) te;
	}

	@Override
	public void runLogic() {

		if (!te.worldObj.isRemote) {
			if (canRun()) {
				ItemHelper.damageItem(te, fuelSlot, 3);
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

	@Override
	public boolean canRun() {
		if (te.getStackInSlot(inputSlot) != null) {
			if (te.getStackInSlot(fuelSlot) != null) {
				if (recipes.getGrillingResult(te.getStackInSlot(inputSlot)) != null) {

					final ItemStack itemstack = recipes.getGrillingResult(te.getStackInSlot(inputSlot))
														.getOutput1();

					if (te.getStackInSlot(outSlot) == null) {
						return true;
					}
					if (!te.getStackInSlot(outSlot).isItemEqual(itemstack)) {
						return false;
					}

					final int result = te.getStackInSlot(outSlot).stackSize + itemstack.stackSize;

					if (recipes.getGrillingResult(te.getStackInSlot(inputSlot)).hasSecondOutput()) {

						final ItemStack itemstack2 = recipes.getGrillingResult(te.getStackInSlot(inputSlot))
															.getOutput2();
						if (te.getStackInSlot(outSlot2) == null) {
							return true;
						}
						if (!te.getStackInSlot(outSlot2).isItemEqual(itemstack2)) {
							return false;
						}

						final int result2 = te.getStackInSlot(outSlot2).stackSize + itemstack2.stackSize;

						return ((result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize())) && ((result2 <= te.getInventoryStackLimit()) && (result2 <= itemstack2.getMaxStackSize()));
					}

					return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
				}
			}
		}
		return false;
	}

	@Override
	public void run() {
		if (canRun()) {
			
			ItemStack itemstack = recipes.getGrillingResult(te.getStackInSlot(inputSlot)).getOutput1();

			if (te.getStackInSlot(outSlot) == null) {
				te.setInventorySlotContents(outSlot, itemstack.copy());
			} else if (te.getStackInSlot(outSlot).isItemEqual(itemstack)) {
				te.setInventorySlotContents(outSlot,
											ItemHelper.getUniun(te.getStackInSlot(outSlot), itemstack));
			}

			if (recipes.getGrillingResult(te.getStackInSlot(inputSlot)).hasSecondOutput()) {

				itemstack = recipes.getGrillingResult(te.getStackInSlot(inputSlot)).getOutput2();

				if (te.getStackInSlot(outSlot2) == null) {
					te.setInventorySlotContents(outSlot2, itemstack.copy());
				} else if (te.getStackInSlot(outSlot2).isItemEqual(itemstack)) {
					te.setInventorySlotContents(outSlot2,
												ItemHelper.getUniun(te.getStackInSlot(outSlot2), itemstack));
				}
			}
			te.decrStackSize(inputSlot, 1);
			if (te.getStackInSlot(inputSlot).stackSize <= 0) {
				InventoryHelper.setEmty(te, inputSlot);
			}
		}
	}

	@Override
	public boolean isStackValidForSlot(int slot, ItemStack itemstack) {
		return false;
	}
}