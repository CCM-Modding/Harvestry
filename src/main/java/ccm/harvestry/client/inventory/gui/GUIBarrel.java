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
import ccm.harvestry.inventory.container.BarrelContainer;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.lib.TileConstants;

public class GUIBarrel extends GuiContainer
{

    private final InventoryTE barrel;

    /** The Y size of the inventory window in pixels. */
    private final int         ySize = 204;

    /**
     * Creates the Barrel's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileBarrel} instance that the player is looking at.
     */
    public GUIBarrel(final InventoryPlayer player, final TileEntity barrel)
    {
        super(new BarrelContainer(player, barrel));
        this.barrel = (InventoryTE) barrel;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        // Render Engine.BindTexture
        mc.func_110434_K().func_110577_a(TextureHandler.getGUI(EnumMachines.storageBarrel.name()));
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
        final String containerName = barrel.isInvNameLocalized() ? barrel.getInvName()
                                                                : StatCollector.translateToLocal(barrel.getInvName());

        fontRenderer.drawString(containerName,
                                (xSize / 2) - (fontRenderer.getStringWidth(containerName) / 2),
                                -13,
                                4210752);
        fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY),
                                6,
                                (ySize - 96) + -17,
                                4210752);
    }
}