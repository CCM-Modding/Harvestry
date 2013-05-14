package ccm.harvestry.utils.lib;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class BushRender implements ISimpleBlockRenderingHandler
{

    public static int berryModel = RenderingRegistry.getNextAvailableRenderId();

    @Override
    public boolean renderWorldBlock(final IBlockAccess world, final int x, final int y, final int z, final Block block, final int modelId, final RenderBlocks renderer)
    {

        if (modelId == berryModel){
            final int md = world.getBlockMetadata(x, y, z);
            if (md < 4){
                renderer.setRenderBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
                renderer.renderStandardBlock(block, x, y, z);
            }else if (md < 8){
                renderer.setRenderBounds(0.125F, 0.0F, 0.125F, 0.875F, 0.75F, 0.875F);
                renderer.renderStandardBlock(block, x, y, z);
            }else{
                renderer.setRenderBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                renderer.renderStandardBlock(block, x, y, z);
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
    @Override
    public void renderInventoryBlock(final Block block, final int metadata, final int modelID, final RenderBlocks renderer)
    {
        if (modelID == berryModel){
            final Tessellator tessellator = Tessellator.instance;
            if (metadata < 4){
                renderer.setRenderBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
                this.renderInvBlock(renderer, block, metadata);
                // renderer.renderBlockAsItem(block, metadata, modelID);
            }else if (metadata < 8){
                renderer.setRenderBounds(0.125F, 0.0F, 0.125F, 0.875F, 0.75F, 0.875F);
                this.renderInvBlock(renderer, block, metadata);
            }else{
                renderer.setRenderBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                this.renderInvBlock(renderer, block, metadata);
            }
        }
    }

    @Override
    public boolean shouldRender3DInInventory()
    {
        return true;
    }

    @Override
    public int getRenderId()
    {
        return berryModel;
    }

    private void renderInvBlock(final RenderBlocks renderblocks, final Block block, final int meta)
    {
        final Tessellator tessellator = Tessellator.instance;
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, -1F, 0.0F);
        renderblocks.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(0, meta));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 1.0F, 0.0F);
        renderblocks.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(1, meta));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 0.0F, -1F);
        renderblocks.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(2, meta));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 0.0F, 1.0F);
        renderblocks.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(3, meta));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(-1F, 0.0F, 0.0F);
        renderblocks.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(4, meta));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(1.0F, 0.0F, 0.0F);
        renderblocks.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(5, meta));
        tessellator.draw();
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
    }
}
