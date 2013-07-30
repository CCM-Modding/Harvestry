package ccm.harvestry.client.model;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import ccm.harvestry.utils.lib.Models;

public class ModelButterChurn {

    private final IModelCustom modelButterChurn;

    public ModelButterChurn() {

        modelButterChurn = AdvancedModelLoader.loadModel(Models.MODEL_BUTTER_CHURN);
    }

    public void render() {

        modelButterChurn.renderAll();
    }

    public void renderPart(final String partName) {

        modelButterChurn.renderPart(partName);
    }
}