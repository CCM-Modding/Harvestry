package ccm.harvestry.client.model;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.harvestry.utils.lib.Models;

@SideOnly(Side.CLIENT)
public class ModelGrill {

    private final IModelCustom modelGrill;

    public ModelGrill() {

        modelGrill = AdvancedModelLoader.loadModel(Models.MODEL_GRILL);
    }

    public void render() {

        modelGrill.renderAll();
    }

    public void renderPart(final String partName) {

        modelGrill.renderPart(partName);
    }
}