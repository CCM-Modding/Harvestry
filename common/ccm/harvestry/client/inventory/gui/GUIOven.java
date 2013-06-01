package ccm.harvestry.client.inventory.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import ccm.harvestry.inventory.container.OvenContainer;
import ccm.harvestry.tileentity.TileOven;
import ccm.harvestry.utils.lib.TileConstants;

public class GUIOven extends GuiContainer
{

    private final TileOven oven;

    /**
     * Creates the Oven's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param oven
     *            The {@link TileOven} instance that the player is looking at.
     */
    public GUIOven(final InventoryPlayer player,
                   final TileOven oven)
    {
        super(new OvenContainer(player, oven));
        this.oven = oven;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(TileConstants.OVEN_GUI);
        final int xStart = (this.width - this.xSize) / 2;
        final int yStart = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, this.xSize, this.ySize);
        int scale;
        if (this.oven.canCook()){
            scale = 100;
            this.drawTexturedModalRect(xStart + 57, (yStart + 37 + 12) - scale, 176, 12 - scale, 14, scale + 2);
            scale = this.oven.getCookProgressScaled(24);
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
        if (this.oven.isInvNameLocalized()){
            containerName = this.oven.getInvName();
        }else{
            containerName = StatCollector.translateToLocal(this.oven.getInvName());
        }
        this.fontRenderer.drawString(containerName, (this.xSize / 2) - (this.fontRenderer.getStringWidth(containerName) / 2), 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 9, (this.ySize - 96) + 2, 4210752);
    }
}