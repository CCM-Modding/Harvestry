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
import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.nucleum.omnium.tileentity.InventoryTE;
import ccm.nucleum.omnium.utils.handler.TextureHandler;
import ccm.nucleum.omnium.utils.lib.TileConstants;

public class GUICabinet extends GuiContainer
{

    private final InventoryTE cabinet;

    /**
     * Creates the Cabinet's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileCabinet} instance that the player is looking at.
     */
    public GUICabinet(final InventoryPlayer player, final TileEntity cabinet)
    {
        super(new CabinetContainer(player, cabinet));
        this.cabinet = (InventoryTE) cabinet;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.func_110434_K().func_110577_a(TextureHandler.getGUI(EnumMachines.storageCabinet.name()));
        final int xStart = (width - xSize) / 2;
        final int yStart = (height - ySize) / 2;
        drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y)
    {
        final String containerName;

        if (cabinet.isInvNameLocalized())
        {
            containerName = cabinet.getInvName();
        } else
        {
            containerName = StatCollector.translateToLocal(cabinet.getInvName());
        }

        fontRenderer.drawString(containerName, (xSize / 2) - (fontRenderer.getStringWidth(containerName) / 2), 5, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 6, (ySize - 96) + 3, 4210752);
    }
}