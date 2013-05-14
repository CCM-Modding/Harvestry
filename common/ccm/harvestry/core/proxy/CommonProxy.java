package ccm.harvestry.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.tileentity.TileBarrel;
import ccm.harvestry.tileentity.TileCabinet;
import ccm.harvestry.tileentity.TileCounter;
import ccm.harvestry.tileentity.TileGrinder;
import ccm.harvestry.tileentity.TileOven;
import ccm.harvestry.tileentity.TileRoller;
import ccm.harvestry.utils.lib.TileConstants;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler
{

    @Override
    public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z)
    {
        switch (ID) {
            case TileConstants.GRINDER_GUID:
                final TileGrinder grinder = (TileGrinder) world.getBlockTileEntity(x, y, z);
                return new GrinderContainer(player.inventory, grinder);
            case TileConstants.OVEN_GUID:
                final TileOven oven = (TileOven) world.getBlockTileEntity(x, y, z);
                return new OvenContainer(player.inventory, oven);
            case TileConstants.ROLLER_GUID:
                final TileRoller roller = (TileRoller) world.getBlockTileEntity(x, y, z);
                return new RollerContainer(player.inventory, roller);
            case TileConstants.COUNTER_GUID:
                final TileCounter counter = (TileCounter) world.getBlockTileEntity(x, y, z);
                return new CounterContainer(player.inventory, counter);
            case TileConstants.BARREL_GUID:
                final TileBarrel barrel = (TileBarrel) world.getBlockTileEntity(x, y, z);
                return new BarrelContainer(player.inventory, barrel);
            case TileConstants.CABINET_GUID:
                final TileCabinet cabinet = (TileCabinet) world.getBlockTileEntity(x, y, z);
                return new CabinetContainer(player.inventory, cabinet);
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z)
    {
        return null;
    }

    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String player, final String customName)
    {}
}