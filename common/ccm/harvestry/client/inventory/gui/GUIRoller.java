package ccm.harvestry.client.inventory.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import ccm.harvestry.inventory.container.RollerContainer;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import ccm.nucleum_omnium.utils.lib.TileConstant;

public class GUIRoller extends GuiContainer {

	private final ActiveTE		roller;

	private final IGUITileLogic	rollerL;

	/**
	 * Creates the Roller's GUI
	 * 
	 * @param player
	 *            The Player looking at the GUI
	 * @param roller
	 *            The {@link TileRoller} instance that the player is looking at.
	 */
	public GUIRoller(final InventoryPlayer player, final TileEntity roller) {
		super(new RollerContainer(player, roller));
		this.roller = (ActiveTE) roller;
		rollerL = (IGUITileLogic) this.roller.getTileLogic();
	}

	/**
	 * Draw the Background layer for the GuiContainer (everything in back of the items)
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(TileConstants.ROLLER_GUI);
		final int xStart = (width - xSize) / 2;
		final int yStart = (height - ySize) / 2;
		drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
		int scale;
		if (rollerL.canRun()) {
			scale = rollerL.getProgressScaled(30);
			drawTexturedModalRect(xStart + 73, yStart + 36, 176, 1, scale, 18);
		}
	}

	/**
	 * Draw the Foreground layer for the GuiContainer (everything in front of the items)
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(final int x, final int y) {
		final String containerName = roller.isInvNameLocalized() ? roller.getInvName()
																: StatCollector.translateToLocal(roller.getInvName());
		fontRenderer.drawString(containerName,
								(xSize / 2) - (fontRenderer.getStringWidth(containerName) / 2),
								4,
								4210752);
		fontRenderer.drawString(StatCollector.translateToLocal(TileConstant.INVENTORY),
								6,
								(ySize - 96) + 4,
								4210752);
	}
}