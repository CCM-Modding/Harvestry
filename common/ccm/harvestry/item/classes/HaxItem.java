package ccm.harvestry.item.classes;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.command.CommandTime;
import net.minecraft.command.CommandWeather;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HaxItem extends BaseItemClass implements ICommandSender
{

    CommandWeather weather;

    CommandTime    time;

    public HaxItem(final int id)
    {
        super(id);
    }

    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings(
    { "rawtypes", "unchecked" })
    public void addInformation(final ItemStack item, final EntityPlayer player, final List list, final boolean par4)
    {
        list.add("This is a Hax Item ONLY found in creative");
        super.addInformation(item, player, list, par4);
    }

    @Override
    public boolean canCommandSenderUseCommand(final int i, final String s)
    {
        return true;
    }

    @Override
    public String getCommandSenderName()
    {
        return null;
    }

    @Override
    public ChunkCoordinates getPlayerCoordinates()
    {
        return this.getPlayerCoordinates();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(final ItemStack item)
    {
        return EnumRarity.epic;
    }

    @Override
    public ItemStack onItemRightClick(final ItemStack item, final World world, final EntityPlayer player)
    {
        if (world.isRemote){
            return null;
        }else{
            final MinecraftServer minecraftserver = MinecraftServer.getServer();
            if (minecraftserver != null){
                // time.processCommand(this, timeC);
                return super.onItemRightClick(item, world, player);
            }else{
                return null;
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRergister)
    {}

    @Override
    public void sendChatToPlayer(final String s)
    {}

    @Override
    public String translateString(final String s, final Object... var2)
    {
        return null;
    }
}