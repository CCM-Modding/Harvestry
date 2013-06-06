package ccm.harvestry.client.inventory.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.tileentity.TileGrinder;
import ccm.harvestry.utils.lib.TileConstants;

public class GUIGrinder extends GuiContainer
{

    private final TileGrinder grinder;

    /**
     * Creates the Grinder's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileGrinder} instance that the player is looking
     *            at.
     */
    public GUIGrinder(final InventoryPlayer player,
                      final TileEntity grinder)
    {
        super(new GrinderContainer(player, grinder));
        this.grinder = (TileGrinder) grinder;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(TileConstants.GRINDER_GUI);
        final int xStart = (this.width - this.xSize) / 2;
        final int yStart = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, this.xSize, this.ySize);
        int scale;
        if (this.grinder.canGrind()){
            scale = this.grinder.getGrindProgressScaled(24);
            this.drawTexturedModalRect(xStart + 79, yStart + 31, 176, 0, 20, scale);
        }
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of
     * the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y)
    {
        final String containerName = this.grinder.isInvNameLocalized() ? this.grinder.getInvName() : StatCollector.translateToLocal(this.grinder.getInvName());
        this.fontRenderer.drawString(containerName, (this.xSize / 2) - (this.fontRenderer.getStringWidth(containerName) / 2), 3, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 9, (this.ySize - 96) + 3, 4210752);
    }
}