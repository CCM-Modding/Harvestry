/**
 * CCM Modding, Harvestry
 */
package ccm.harvestry.client.renderer.tileentity;

import org.lwjgl.opengl.GL11;

import net.minecraft.tileentity.TileEntity;

import ccm.harvestry.block.enums.EnumModeled;
import ccm.harvestry.tileentity.logic.GrillLogic;
import ccm.nucleum.omnium.client.renderer.tileentity.SimpleTileRenderer;
import ccm.nucleum.omnium.tileentity.ActiveTE;
import ccm.nucleum.omnium.tileentity.LogicTE;

public class GrillTileRenderer extends SimpleTileRenderer
{

    public GrillTileRenderer()
    {
        model = EnumModeled.machineGrill.getModel();
    }

    @Override
    public void render(final TileEntity tile, final double x, final double y, final double z, final float tick)
    {

        if (tile instanceof ActiveTE)
        {
            if (((LogicTE) tile).getTileLogic() instanceof GrillLogic)
            {

                // Translate, Scale
                GL11.glTranslatef((float) x + 0.5F, (float) y, (float) z + 0.5F);
                GL11.glScalef(0.39F, 0.39F, 0.39F);

                // Bind Texture and Render
                model.render();
            }
        }
    }
}