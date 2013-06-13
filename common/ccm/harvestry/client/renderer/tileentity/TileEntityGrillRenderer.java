package ccm.harvestry.client.renderer.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import ccm.harvestry.client.model.ModelGrill_Old;
import ccm.harvestry.tileentity.TileGrill;
import ccm.harvestry.utils.lib.Models;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntityGrillRenderer extends TileEntitySpecialRenderer {

    private final ModelGrill_Old modelGrill = new ModelGrill_Old();

    @Override
    public void renderTileEntityAt(final TileEntity tileEntity, final double x, final double y,
            final double z, final float tick) {

        if (tileEntity instanceof TileGrill) {

            GL11.glPushMatrix();
            GL11.glDisable(GL11.GL_LIGHTING);

            // Scale, Translate, Rotate
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 1.2F);
            GL11.glRotatef(45F, 0F, 1F, 0F);
            GL11.glRotatef(-90F, 1F, 0F, 0F);

            // Bind texture
            FMLClientHandler.instance().getClient().renderEngine.bindTexture(Models.TEXTURE_GRILL);

            // Render
            this.modelGrill.renderPart("Part... TODO RE WIRTE");

            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glPopMatrix();
        }
    }
}