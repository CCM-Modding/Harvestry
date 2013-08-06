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
import ccm.harvestry.inventory.container.RollerContainer;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.lib.TileConstants;

public class GUIRoller extends GuiContainer
{

    private final ActiveTE      roller;

    private final IGUITileLogic rollerL;

    /**
     * Creates the Roller's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param roller
     *            The {@link TileRoller} instance that the player is looking at.
     */
    public GUIRoller(final InventoryPlayer player, final TileEntity roller)
    {
        super(new RollerContainer(player, roller));
        this.roller = (ActiveTE) roller;
        rollerL = (IGUITileLogic) this.roller.getTileLogic();
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.func_110434_K().func_110577_a(TextureHandler.getGUI(EnumMachines.machineRoller.name()));
        final int xStart = (width - xSize) / 2;
        final int yStart = (height - ySize) / 2;
        drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
        int scale;
        if (rollerL.canRun())
        {
            scale = rollerL.getProgressScaled(30);
            drawTexturedModalRect(xStart + 73, yStart + 36, 176, 1, scale, 18);
        }
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y)
    {
        final String containerName;

        if (roller.isInvNameLocalized())
        {
            containerName = roller.getInvName();
        }
        else
        {
            containerName = StatCollector.translateToLocal(roller.getInvName());
        }

        fontRenderer.drawString(containerName,
                                (xSize / 2) - (fontRenderer.getStringWidth(containerName) / 2),
                                4,
                                4210752);
        fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY),
                                6,
                                (ySize - 96) + 4,
                                4210752);
    }
}