package ccm.harvestry.client.inventory.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import ccm.harvestry.inventory.container.GrinderContainer;
import ccm.harvestry.tileentity.logic.GrinderLogic;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.LogHandler;
import ccm.nucleum_omnium.helper.LanguageHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import ccm.nucleum_omnium.utils.lib.TileConstant;

public class GUIGrinder extends GuiContainer {

	private final ActiveTE		grinder;

	private final IGUITileLogic	grinderL;

	/**
	 * Creates the Grinder's GUI
	 * 
	 * @param player
	 *            The Player looking at the GUI
	 * @param grinder
	 *            The {@link GrinderLogic} instance that the player is looking at.
	 */
	public GUIGrinder(final InventoryPlayer player, final TileEntity grinder) {
		super(new GrinderContainer(player, grinder));
		this.grinder = (ActiveTE) grinder;
		grinderL = (IGUITileLogic) this.grinder.getTileLogic();
	}

	/**
	 * Draw the Background layer for the GuiContainer (everything in back of the items)
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(TileConstants.GRINDER_GUI);
		final int xStart = (width - xSize) / 2;
		final int yStart = (height - ySize) / 2;
		drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
		int scale;
		if (grinderL.canRun()) {
			scale = grinderL.getProgressScaled(24);
			drawTexturedModalRect(xStart + 79, yStart + 31, 176, 0, 20, scale);
		}
	}

	/**
	 * Draw the Foreground layer for the GuiContainer (everything in front of the items)
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(final int x, final int y) {
		final String containerName;

		if (grinder.isInvNameLocalized()) {
			containerName = grinder.getInvName();
			LogHandler.log(containerName);
		} else {
			containerName = LanguageHelper.getLocalizedString(grinder.getInvName());
			//LogHandler.log(grinder.getInvName());
		}

		fontRenderer.drawString(containerName,
								(xSize / 2) - (fontRenderer.getStringWidth(containerName) / 2),
								3,
								4210752);
		fontRenderer.drawString(StatCollector.translateToLocal(TileConstant.INVENTORY),
								9,
								(ySize - 96) + 3,
								4210752);
	}
}