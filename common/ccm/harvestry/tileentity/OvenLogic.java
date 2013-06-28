package ccm.harvestry.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.harvestry.api.recipes.OvenRecipes;
import ccm.nucleum_omnium.helper.ItemHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;

public class OvenLogic implements IGUITileLogic {

	private final ActiveTE		te;

	private final OvenRecipes	recipes			= OvenRecipes.instance();

	/** The number of ticks that the current item has been Cooking for */
	public int					ovenCookTime	= 0;

	public OvenLogic(final TileEntity te) {
		this.te = (ActiveTE) te;
	}

	@Override
	public int getProgressScaled(final int scale) {
		return (ovenCookTime * scale) / 200;
	}

	@Override
	public int getTimeLeft() {
		return ovenCookTime;
	}

	@Override
	public void setTimeLeft(final int time) {
		ovenCookTime = time;
	}

	@Override
	public void runLogic() {

		if (!te.worldObj.isRemote) {
			if (canRun()) {
				ItemHelper.damageItem(te.getInventory(), 1, 3);
				ItemHelper.damageItem(te.getInventory(), 2, 3);
				te.updateIfChanged(true);
				++ovenCookTime;
				if (ovenCookTime == 200) {
					ovenCookTime = 0;
					run();
					te.onInventoryChanged();
					te.updateIfChanged(false);
				}
			} else {
				ovenCookTime = 0;
				te.updateIfChanged(false);
			}
		}
	}

	/**
	 * Returns true if the oven can grind an item, i.e. has a source item, destination stack isn't
	 * full, etc.
	 */
	@Override
	public boolean canRun() {
		if (te.getStackInSlot(0) != null) {
			if ((te.getStackInSlot(1) != null) && (te.getStackInSlot(2) != null)) {
				if (recipes.getCookingResult(te.getStackInSlot(0)) != null) {
					final ItemStack itemstack = recipes.getCookingResult(te.getStackInSlot(0)).getOutput1();
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
	 * Turn one item from the oven source stack into the appropriate ground item in the oven result
	 * stack
	 */
	@Override
	public void run() {
		if (canRun()) {
			final ItemStack itemstack = recipes.getCookingResult(te.getStackInSlot(0)).getOutput1();
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
}