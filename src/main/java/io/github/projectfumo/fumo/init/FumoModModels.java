package io.github.projectfumo.fumo.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

import io.github.projectfumo.fumo.client.model.ModelNitori;
import io.github.projectfumo.fumo.client.model.ModelMarisaHat;
import io.github.projectfumo.fumo.client.model.ModelFumo;
import io.github.projectfumo.fumo.client.model.ModelEiki;

public class FumoModModels {
	public static void init() {
		EntityModelLayerRegistry.registerModelLayer(ModelNitori.LAYER_LOCATION, ModelNitori::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(ModelEiki.LAYER_LOCATION, ModelEiki::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(ModelFumo.LAYER_LOCATION, ModelFumo::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(ModelMarisaHat.LAYER_LOCATION, ModelMarisaHat::createBodyLayer);
	}
}
