package ccm.harvestry.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import ccm.harvestry.client.inventory.gui.GUIBarrel;
import ccm.harvestry.client.inventory.gui.GUICabinet;
import ccm.harvestry.client.inventory.gui.GUICounter;
import ccm.harvestry.client.inventory.gui.GUIGrinder;
import ccm.harvestry.client.inventory.gui.GUIOven;
import ccm.harvestry.client.inventory.gui.GUIRoller;
import ccm.harvestry.tileentity.TileBarrel;
import ccm.harvestry.tileentity.TileBase;
import ccm.harvestry.tileentity.TileCabinet;
import ccm.harvestry.tileentity.TileCounter;
import ccm.harvestry.tileentity.TileGrinder;
import ccm.harvestry.tileentity.TileOven;
import ccm.harvestry.tileentity.TileRoller;
import ccm.harvestry.utils.lib.TileConstants;
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
}