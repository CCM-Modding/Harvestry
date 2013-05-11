package harvestry.core.proxy;

import harvestry.client.inventory.gui.GUIBarrel;
import harvestry.client.inventory.gui.GUICabinet;
import harvestry.client.inventory.gui.GUICounter;
import harvestry.client.inventory.gui.GUIGrinder;
import harvestry.client.inventory.gui.GUIOven;
import harvestry.client.inventory.gui.GUIRoller;
import harvestry.tileentity.TileBarrel;
import harvestry.tileentity.TileBase;
import harvestry.tileentity.TileCabinet;
import harvestry.tileentity.TileCounter;
import harvestry.tileentity.TileGrinder;
import harvestry.tileentity.TileOven;
import harvestry.tileentity.TileRoller;
import harvestry.utils.lib.Locations;
import harvestry.utils.lib.TileConstants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

import com.jadarstudios.api.developercapesapi.DeveloperCapesAPI;

import cpw.mods.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy
{

    @Override
    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String owner, final String customName)
    {
        final TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getBlockTileEntity(x, y, z);
        if (tileEntity != null){
            if (tileEntity instanceof TileBase){
                ((TileBase) tileEntity).setOrientation(orientation);
                ((TileBase) tileEntity).setState(state);
                ((TileBase) tileEntity).setOwner(owner);
                ((TileBase) tileEntity).setCustomName(customName);
            }
        }
    }

    @Override
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z)
    {
        switch (ID) {
            case TileConstants.GRINDER_GUID:
                final TileGrinder grinder = (TileGrinder) world.getBlockTileEntity(x, y, z);
                return new GUIGrinder(player.inventory, grinder);
            case TileConstants.OVEN_GUID:
                final TileOven oven = (TileOven) world.getBlockTileEntity(x, y, z);
                return new GUIOven(player.inventory, oven);
            case TileConstants.ROLLER_GUID:
                final TileRoller roller = (TileRoller) world.getBlockTileEntity(x, y, z);
                return new GUIRoller(player.inventory, roller);
            case TileConstants.COUNTER_GUID:
                final TileCounter counter = (TileCounter) world.getBlockTileEntity(x, y, z);
                return new GUICounter(player.inventory, counter);
            case TileConstants.BARREL_GUID:
                final TileBarrel barrel = (TileBarrel) world.getBlockTileEntity(x, y, z);
                return new GUIBarrel(player.inventory, barrel);
            case TileConstants.CABINET_GUID:
                final TileCabinet cabinet = (TileCabinet) world.getBlockTileEntity(x, y, z);
                return new GUICabinet(player.inventory, cabinet);
            default:
                return null;
        }
    }

    /**
     * Initializes the Capes. Original code that adds capes is found in this
     * Github repository: https://github.com/jadar/DeveloperCapesAPI
     */
    @Override
    public void initCapes()
    {
        // Link for the file that makes the capes work
        DeveloperCapesAPI.getInstance().init(Locations.CAPES);
    }
}