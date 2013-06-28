package ccm.harvestry.client.inventory.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import ccm.harvestry.inventory.container.CounterContainer;
import ccm.harvestry.tileentity.CounterLogic;
import ccm.harvestry.utils.lib.TileConstants;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.utils.lib.TileConstant;

public class GUICounter extends GuiContainer {

	private final InventoryTE	counter;

	/**
	 * Creates the Counter's GUI
	 * 
	 * @param player
	 *            The Player looking at the GUI
	 * @param roller
	 *            The {@link CounterLogic} instance that the player is looking at.
	 */
	public GUICounter(final InventoryPlayer player, final TileEntity counter) {
		super(new CounterContainer(player, counter));
		this.counter = (InventoryTE) counter;
	}

	/**
	 * Draw the Background layer for the GuiContainer (everything in back of the items)
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(TileConstants.COUNTER_GUI);
		final int xStart = (width - xSize) / 2;
		final int yStart = (height - ySize) / 2;
		drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
	}

	/**
	 * Draw the Foreground layer for the GuiContainer (everything in front of the items)
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(final int x, final int y) {
		final String containerName = counter.isInvNameLocalized()	? counter.getInvName()
																	: StatCollector.translateToLocal(counter.getInvName());
		fontRenderer.drawString(containerName,
								(xSize / 2) - (fontRenderer.getStringWidth(containerName) / 2),
								5,
								4210752);
		fontRenderer.drawString(StatCollector.translateToLocal(TileConstant.INVENTORY),
								6,
								(ySize - 96) + 3,
								4210752);
	}
}