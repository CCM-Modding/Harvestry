package ccm.harvestry.client.renderer.tileentity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.client.model.ModelGrill;
import ccm.harvestry.enums.blocks.EnumTEBlock;
import ccm.harvestry.tileentity.logic.GrillLogic;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.tileentity.ActiveTE;

@SideOnly(Side.CLIENT)
public class TileEntityGrillRenderer extends TileEntitySpecialRenderer {

    private final ModelGrill modelGrill = new ModelGrill();

    @Override
    public void renderTileEntityAt(final TileEntity tileEntity,
                                   final double x,
                                   final double y,
                                   final double z,
                                   final float tick) {

        if (tileEntity instanceof ActiveTE) {
            if (((ActiveTE) tileEntity).getTileLogic() instanceof GrillLogic) {

                GL11.glPushMatrix();
                GL11.glDisable(GL11.GL_LIGHTING);

                // Scale, Translate, Rotate
                GL11.glScalef(0.8F, 0.8F, 0.8F);

                // GL11.glTranslatef(x, y, z);

                GL11.glRotatef(180F, 0F, 0F, 0F);

                // Bind texture
                FMLClientHandler.instance().getClient().renderEngine.func_110577_a(TextureHandler.getTETexture(EnumTEBlock.machineGrill.name()));

                // Render
                modelGrill.render();

                GL11.glEnable(GL11.GL_LIGHTING);
                GL11.glPopMatrix();
            }
        }
    }
}