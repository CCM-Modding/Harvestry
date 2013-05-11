package harvestry.tileentity;

import harvestry.utils.lib.TileConstants;
import net.minecraft.nbt.NBTTagCompound;
import nucleum_omnium.helper.InventoryHelper;

public class TileCabinet extends TileBase
{

    /** The time that the item allows has to be used */
    public static final int invSize = 24;

    /**
     * Creates a new {@link TileCabinet} Instance.
     */
    public TileCabinet()
    {
        super(invSize, TileConstants.CABINET_UNLOCALIZED);
    }

    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        this.setInventory(InventoryHelper.readInventoryFromNBT(nbt.getTagList(TileConstants.INVENTORY), invSize));
    }

    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(final NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        nbt.setTag(TileConstants.INVENTORY, InventoryHelper.writeInventoryToNBT(this.getInventory()));
    }
}
