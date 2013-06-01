package ccm.harvestry.client.inventory.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.tileentity.TileRoller;
import ccm.harvestry.utils.lib.TileConstants;

public class GUIRoller extends GuiContainer
{

    private final TileRoller roller;

    /**
     * Creates the Roller's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileRoller} instance that the player is looking
     *            at.
     */
    public GUIRoller(final InventoryPlayer player,
                     final TileRoller roller)
    {
        super(new RollerContainer(player, roller));
        this.roller = roller;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(TileConstants.ROLLER_GUI);
        final int xStart = (this.width - this.xSize) / 2;
        final int yStart = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, this.xSize, this.ySize);
        int scale;
        if (this.roller.canRoll()){
            scale = this.roller.getRollProgressScaled(30);
            this.drawTexturedModalRect(xStart + 73, yStart + 36, 176, 1, scale, 18);
        }
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of
     * the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y)
    {
        final String containerName = this.roller.isInvNameLocalized() ? this.roller.getInvName() : StatCollector.translateToLocal(this.roller.getInvName());
        this.fontRenderer.drawString(containerName, (this.xSize / 2) - (this.fontRenderer.getStringWidth(containerName) / 2), 4, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 6, (this.ySize - 96) + 4, 4210752);
    }
}