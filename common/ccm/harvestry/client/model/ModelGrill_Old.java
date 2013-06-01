package ccm.harvestry.client.model;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.utils.lib.Models;

@SideOnly(Side.CLIENT)
public class ModelGrill_Old
{

    private final IModelCustom modelGrill;

    public ModelGrill_Old()
    {

        this.modelGrill = AdvancedModelLoader.loadModel(Models.GRILL);
    }

    public void render()
    {

        this.modelGrill.renderAll();
    }

    public void renderPart(final String partName)
    {

        this.modelGrill.renderPart(partName);
    }
}