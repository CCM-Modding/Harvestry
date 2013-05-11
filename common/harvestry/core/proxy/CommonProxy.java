package harvestry.core.proxy;

import harvestry.inventory.container.BarrelContainer;
import harvestry.inventory.container.CabinetContainer;
import harvestry.inventory.container.CounterContainer;
import harvestry.inventory.container.GrinderContainer;
import harvestry.inventory.container.OvenContainer;
import harvestry.inventory.container.RollerContainer;
import harvestry.tileentity.TileBarrel;
import harvestry.tileentity.TileCabinet;
import harvestry.tileentity.TileCounter;
import harvestry.tileentity.TileGrinder;
import harvestry.tileentity.TileOven;
import harvestry.tileentity.TileRoller;
import harvestry.utils.lib.TileConstants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
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