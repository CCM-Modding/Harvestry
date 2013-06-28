package ccm.harvestry.client.renderer.item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import ccm.harvestry.client.model.ModelGrill_Old;
import ccm.harvestry.utils.lib.Models;
import cpw.mods.fml.client.FMLClientHandler;

public class ItemGrillRenderer implements IItemRenderer {

	private final ModelGrill_Old	modelGrill;

	public ItemGrillRenderer() {

		modelGrill = new ModelGrill_Old();
	}

	@Override
	public boolean handleRenderType(final ItemStack item, final ItemRenderType type) {

		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(	final ItemRenderType type,
											final ItemStack item,
											final ItemRendererHelper helper) {

		return true;
	}

	@Override
	public void renderItem(final ItemRenderType type, final ItemStack item, final Object... data) {

		switch (type) {
			case ENTITY: {
				renderGrill(-0.5F, 0.0F, 0.5F, 1.0F);
				return;
			}
			case EQUIPPED: {
				renderGrill(0.0F, 0.0F, 1.0F, 1.0F);
				return;
			}
			case EQUIPPED_FIRST_PERSON: {
				renderGrill(0.0F, 0.0F, 1.0F, 1.0F);
				return;
			}
			case INVENTORY: {
				renderGrill(0.0F, -0.1F, 1.0F, 1.0F);
				return;
			}
			default:
				return;
		}
	}

	private void renderGrill(final float x, final float y, final float z, final float scale) {

		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		// Scale, Translate, Rotate
		GL11.glScalef(scale, scale, scale);
		GL11.glTranslatef(x, y, z);
		GL11.glRotatef(-90F, 1F, 0, 0);

		// Bind texture
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(Models.TEXTURE_GRILL);

		// Render
		modelGrill.render();

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}
