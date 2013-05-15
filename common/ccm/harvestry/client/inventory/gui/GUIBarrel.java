package ccm.harvestry.client.inventory.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.harvestry.tileentity.TileBarrel;
import ccm.harvestry.utils.lib.TileConstants;

public class GUIBarrel extends GuiContainer
{

    private final TileBarrel barrel;

    /** The Y size of the inventory window in pixels. */
    private final int        ySize = 204;

    /**
     * Creates the Barrel's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileBarrel} instance that the player is looking
     *            at.
     */
    public GUIBarrel(final InventoryPlayer player,
                     final TileBarrel barrel)
    {
        super(new BarrelContainer(player, barrel));
        this.barrel = barrel;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(TileConstants.BARREL_GUI);
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
        final String containerName = this.barrel.isInvNameLocalized() ? this.barrel.getInvName() : StatCollector.translateToLocal(this.barrel.getInvName());
        this.fontRenderer.drawString(containerName, (this.xSize / 2) - (this.fontRenderer.getStringWidth(containerName) / 2), -13, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 6, (this.ySize - 96) + -17, 4210752);
    }
}