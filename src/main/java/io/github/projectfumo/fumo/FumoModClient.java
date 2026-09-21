package io.github.projectfumo.fumo;

import net.fabricmc.api.ClientModInitializer;

import io.github.projectfumo.fumo.init.FumoModEntityRenderers;
import io.github.projectfumo.fumo.init.FumoModModels;

public class FumoModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		FumoModModels.init();
		FumoModEntityRenderers.init();
	}
}
