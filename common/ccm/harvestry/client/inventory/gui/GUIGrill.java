package ccm.harvestry.client.inventory.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import ccm.harvestry.inventory.container.GrillContainer;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.LanguageHelper;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import ccm.nucleum_omnium.utils.lib.TileConstant;

public class GUIGrill extends GuiContainer {

	private final ActiveTE		grill;

	private final IGUITileLogic	grillL;

	/**
	 * Creates the Grill's GUI
	 * 
	 * @param player
	 *            The Player looking at the GUI
	 * @param grill
	 *            The {@link TileGrill} instance that the player is looking at.
	 */
	public GUIGrill(final InventoryPlayer player, final TileEntity grill) {
		super(new GrillContainer(player, grill));
		this.grill = (ActiveTE) grill;
		grillL = (IGUITileLogic) this.grill.getTileLogic();
	}

	/**
	 * Draw the Background layer for the GuiContainer (everything in back of the items)
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(TileConstants.GRILL_GUI);
		final int xStart = (width - xSize) / 2;
		final int yStart = (height - ySize) / 2;
		drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
		int scale;
		if (grillL.canRun()) {
			scale = 100;
			drawTexturedModalRect(xStart + 57, (yStart + 37 + 12) - scale, 176, 12 - scale, 14, scale + 2);
			scale = grillL.getProgressScaled(24);
			drawTexturedModalRect(xStart + 79, yStart + 35, 176, 14, scale, 23);
		}
	}

	/**
	 * Draw the Foreground layer for the GuiContainer (everything in front of the items)
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(final int x, final int y) {
		final String containerName;

		if (grill.isInvNameLocalized()) {
			containerName = grill.getInvName();
		} else {
			containerName = LanguageHelper.getLocalizedString(grill.getInvName());
		}

		fontRenderer.drawString(containerName,
								(xSize / 2) - (fontRenderer.getStringWidth(containerName) / 2),
								6,
								4210752);
		fontRenderer.drawString(StatCollector.translateToLocal(TileConstant.INVENTORY),
								9,
								(ySize - 96) + 2,
								4210752);
	}
}