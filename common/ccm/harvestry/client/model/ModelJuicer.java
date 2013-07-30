package ccm.harvestry.client.model;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import ccm.harvestry.utils.lib.Models;

public class ModelJuicer {

    private final IModelCustom modelJuicer;

    public ModelJuicer() {

        modelJuicer = AdvancedModelLoader.loadModel(Models.MODEL_JUICER);
    }

    public void render() {

        modelJuicer.renderAll();
    }

    public void renderPart(final String partName) {

        modelJuicer.renderPart(partName);
    }
}