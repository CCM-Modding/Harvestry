package ccm.harvestry.tileentity.logic;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.recipes.RollerRecipes;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.logic.BaseGUILogic;

public class RollerLogic extends BaseGUILogic {

	private final ActiveTE		te;

	private final RollerRecipes	recipes		= RollerRecipes.instance();

	private final int			inputSlot	= 0;

	private final int			fuelSlot	= 1;

	private final int			fuelSlot2	= 2;

	private final int			outSlot		= 3;

	public RollerLogic(TileEntity te) {
		this.te = (ActiveTE) te;
	}

	@Override
	public void runLogic() {

		if (!te.worldObj.isRemote) {
			if (canRun()) {
				ItemHelper.damageItem(te, fuelSlot, 3);
				ItemHelper.damageItem(te, fuelSlot2, 3);
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
	 * Returns true if the roller can grind an item, i.e. has a source item, destination stack isn't
	 * full, etc.
	 */
	@Override
	public boolean canRun() {
		if (te.getStackInSlot(inputSlot) != null) {
			if ((te.getStackInSlot(fuelSlot) != null) && (te.getStackInSlot(fuelSlot2) != null)) {
				if (recipes.getRollingResult(te.getStackInSlot(inputSlot)) != null) {

					final ItemStack itemstack = recipes.getRollingResult(te.getStackInSlot(inputSlot))
														.getOutput1();

					if (te.getStackInSlot(outSlot) == null) {
						return true;
					}
					if (!te.getStackInSlot(outSlot).isItemEqual(itemstack)) {
						return false;
					}

					final int result = te.getStackInSlot(outSlot).stackSize + itemstack.stackSize;

					return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
				}
			}
		}
		return false;
	}

	/**
	 * Turn one item from the roller source stack into the appropriate ground item in the roller
	 * result stack
	 */
	@Override
	public void run() {
		if (canRun()) {

			final ItemStack itemstack = recipes.getRollingResult(te.getStackInSlot(inputSlot)).getOutput1();

			if (te.getStackInSlot(outSlot) == null) {
				te.setInventorySlotContents(outSlot, itemstack.copy());
			} else if (te.getStackInSlot(outSlot).isItemEqual(itemstack)) {
				te.setInventorySlotContents(outSlot,
											ItemHelper.getUniun(te.getStackInSlot(outSlot), itemstack));
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