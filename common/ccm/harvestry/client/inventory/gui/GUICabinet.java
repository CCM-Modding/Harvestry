package ccm.harvestry.client.inventory.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import ccm.harvestry.inventory.container.CabinetContainer;
import ccm.harvestry.tileentity.TileCabinet;
import ccm.harvestry.utils.lib.TileConstants;

public class GUICabinet extends GuiContainer
{

    private final TileCabinet cabinet;

    /**
     * Creates the Cabinet's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileCabinet} instance that the player is looking
     *            at.
     */
    public GUICabinet(final InventoryPlayer player,
                      final TileEntity cabinet)
    {
        super(new CabinetContainer(player, cabinet));
        this.cabinet = (TileCabinet) cabinet;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(TileConstants.CABINET_GUI);
        final int xStart = (this.width - this.xSize) / 2;
        final int yStart = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, this.xSize, this.ySize);
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of
     * the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y)
    {
        final String containerName = this.cabinet.isInvNameLocalized() ? this.cabinet.getInvName() : StatCollector.translateToLocal(this.cabinet.getInvName());
        this.fontRenderer.drawString(containerName, (this.xSize / 2) - (this.fontRenderer.getStringWidth(containerName) / 2), 5, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 6, (this.ySize - 96) + 3, 4210752);
    }
}