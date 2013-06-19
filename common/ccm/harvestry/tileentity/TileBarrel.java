package ccm.harvestry.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.tileentity.TileBase;
import ccm.nucleum_omnium.utils.lib.TileConstant;

public class TileBarrel extends TileBase {
    
    /** The time that the item allows has to be used */
    public static final int invSize = 40;
    
    /**
     * Creates a new {@link TileBarrel} Instance.
     */
    public TileBarrel() {
        super(TileBarrel.invSize, TileConstants.BARREL_UNLOCALIZED);
    }
    
    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.setInventory(InventoryHelper.readInventoryFromNBT(nbt
                .getTagList(TileConstant.INVENTORY), TileBarrel.invSize));
    }
    
    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(final NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setTag(TileConstant.INVENTORY, InventoryHelper.writeInventoryToNBT(this.getInventory()));
    }
}
