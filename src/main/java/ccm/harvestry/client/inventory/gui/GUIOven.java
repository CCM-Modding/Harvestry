/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.client.inventory.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import ccm.harvestry.block.enums.EnumMachines;
import ccm.harvestry.inventory.container.OvenContainer;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.lib.TileConstants;

public class GUIOven extends GuiContainer
{

    private final ActiveTE oven;

    private final IGUITileLogic ovenL;

    /**
     * Creates the Oven's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param oven
     *            The {@link TileOven} instance that the player is looking at.
     */
    public GUIOven(final InventoryPlayer player, final TileEntity oven)
    {
        super(new OvenContainer(player, oven));
        this.oven = (ActiveTE) oven;
        ovenL = (IGUITileLogic) this.oven.getTileLogic();
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.func_110434_K().func_110577_a(TextureHandler.getGUI(EnumMachines.machineOven.name()));
        final int xStart = (width - xSize) / 2;
        final int yStart = (height - ySize) / 2;
        drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
        int scale;
        if (ovenL.canRun())
        {
            scale = 100;
            drawTexturedModalRect(xStart + 57, (yStart + 37 + 12) - scale, 176, 12 - scale, 14, scale + 2);
            scale = ovenL.getProgressScaled(24);
            drawTexturedModalRect(xStart + 79, yStart + 35, 176, 14, scale, 23);
        }
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y)
    {
        final String containerName;
        if (oven.isInvNameLocalized())
        {
            containerName = oven.getInvName();
        } else
        {
            containerName = StatCollector.translateToLocal(oven.getInvName());
        }
        fontRenderer.drawString(containerName, (xSize / 2) - (fontRenderer.getStringWidth(containerName) / 2), 6, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 9, (ySize - 96) + 2, 4210752);
    }
}