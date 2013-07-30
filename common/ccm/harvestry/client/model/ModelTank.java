package ccm.harvestry.client.model;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import ccm.harvestry.utils.lib.Models;

public class ModelTank {

    private final IModelCustom modelTank;

    public ModelTank() {

        modelTank = AdvancedModelLoader.loadModel(Models.MODEL_TANK);
    }

    public void render() {

        modelTank.renderAll();
    }

    public void renderPart(final String partName) {

        modelTank.renderPart(partName);
    }
}