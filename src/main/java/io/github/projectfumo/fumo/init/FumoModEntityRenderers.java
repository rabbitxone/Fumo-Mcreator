package io.github.projectfumo.fumo.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import io.github.projectfumo.fumo.client.renderer.*;

public class FumoModEntityRenderers {
	public static void init() {
		EntityRendererRegistry.register(FumoModEntities.REIMU, ReimuRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.MARISA, MarisaRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.MARISA_HAT, MarisaHatRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.EIKI, EikiRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.CIRNO, CirnoRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.TAN_CIRNO, TanCirnoRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.DEBUG_FUMO, DebugFumoRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.CHEN, ChenRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.NEW_REIMU, NewReimuRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.BLUE_REIMU, BlueReimuRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.KOISHI, KoishiRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.FLANDRE, FlandreRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.MEILING, MeilingRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.YOUMU, YoumuRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.YUYUKO, YuyukoRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.PATCHOULI, PatchouliRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.NITORI, NitoriRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.TEWI, TewiRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.NAZRIN, NazrinRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.SUNNY_MILK, SunnyMilkRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.ALICE, AliceRenderer::new);
		EntityRendererRegistry.register(FumoModEntities.REMILIA, RemiliaRenderer::new);
	}
}
