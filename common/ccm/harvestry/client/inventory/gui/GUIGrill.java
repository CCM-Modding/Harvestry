package ccm.harvestry.client.inventory.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.tileentity.TileGrill;
import ccm.harvestry.utils.lib.TileConstants;

public class GUIGrill extends GuiContainer
{

    private final TileGrill grill;

    /**
     * Creates the Grill's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grill
     *            The {@link TileGrill} instance that the player is looking at.
     */
    public GUIGrill(final InventoryPlayer player,
                    final TileEntity grill)
    {
        super(new GrillContainer(player, grill));
        this.grill = (TileGrill) grill;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(TileConstants.GRILL_GUI);
        final int xStart = (this.width - this.xSize) / 2;
        final int yStart = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, this.xSize, this.ySize);
        int scale;
        if (this.grill.canGrill()){
            scale = 100;
            this.drawTexturedModalRect(xStart + 57, (yStart + 37 + 12) - scale, 176, 12 - scale, 14, scale + 2);
            scale = this.grill.getGrillProgressScaled(24);
            this.drawTexturedModalRect(xStart + 79, yStart + 35, 176, 14, scale, 23);
        }
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of
     * the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y)
    {
        String containerName;
        if (this.grill.isInvNameLocalized()){
            containerName = this.grill.getInvName();
        }else{
            containerName = StatCollector.translateToLocal(this.grill.getInvName());
        }
        this.fontRenderer.drawString(containerName, (this.xSize / 2) - (this.fontRenderer.getStringWidth(containerName) / 2), 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 9, (this.ySize - 96) + 2, 4210752);
    }
}