package ccm.harvestry.client.model;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import ccm.harvestry.utils.lib.Models;

public class ModelSink {

    private final IModelCustom modelSink;

    public ModelSink() {

        modelSink = AdvancedModelLoader.loadModel(Models.MODEL_SINK);
    }

    public void render() {

        modelSink.renderAll();
    }

    public void renderPart(final String partName) {

        modelSink.renderPart(partName);
    }
}