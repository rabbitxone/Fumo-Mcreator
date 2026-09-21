package io.github.projectfumo.fumo.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import io.github.projectfumo.fumo.entity.*;
import io.github.projectfumo.fumo.FumoMod;

public class FumoModEntities {
	public static final EntityType<ReimuEntity> REIMU = register("reimu",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, ReimuEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<MarisaEntity> MARISA = register("marisa",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, MarisaEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<MarisaHatEntity> MARISA_HAT = register("marisa_hat",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, MarisaHatEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<EikiEntity> EIKI = register("eiki",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, EikiEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<CirnoEntity> CIRNO = register("cirno",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, CirnoEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<TanCirnoEntity> TAN_CIRNO = register("tan_cirno",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, TanCirnoEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<DebugFumoEntity> DEBUG_FUMO = register("debug_fumo",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, DebugFumoEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<ChenEntity> CHEN = register("chen",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, ChenEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<NewReimuEntity> NEW_REIMU = register("new_reimu",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, NewReimuEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<BlueReimuEntity> BLUE_REIMU = register("blue_reimu",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, BlueReimuEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<KoishiEntity> KOISHI = register("koishi",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, KoishiEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<FlandreEntity> FLANDRE = register("flandre",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, FlandreEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<MeilingEntity> MEILING = register("meiling",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, MeilingEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<YoumuEntity> YOUMU = register("youmu",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, YoumuEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<YuyukoEntity> YUYUKO = register("yuyuko",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, YuyukoEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<PatchouliEntity> PATCHOULI = register("patchouli",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, PatchouliEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<NitoriEntity> NITORI = register("nitori",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, NitoriEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<TewiEntity> TEWI = register("tewi",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, TewiEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<NazrinEntity> NAZRIN = register("nazrin",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, NazrinEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<SunnyMilkEntity> SUNNY_MILK = register("sunny_milk",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, SunnyMilkEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<AliceEntity> ALICE = register("alice",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, AliceEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());
	public static final EntityType<RemiliaEntity> REMILIA = register("remilia",
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, RemiliaEntity::new).dimensions(EntityDimensions.scalable(0.5f, 1f)).trackRangeBlocks(64).trackedUpdateRate(3).forceTrackedVelocityUpdates(true).fireImmune());

	private static <T extends net.minecraft.world.entity.Entity> EntityType<T> register(String registryName, FabricEntityTypeBuilder<T> builder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(FumoMod.MODID, registryName), builder.build());
	}

	public static void init() {
		ReimuEntity.init();
		MarisaEntity.init();
		MarisaHatEntity.init();
		EikiEntity.init();
		CirnoEntity.init();
		TanCirnoEntity.init();
		DebugFumoEntity.init();
		ChenEntity.init();
		NewReimuEntity.init();
		BlueReimuEntity.init();
		KoishiEntity.init();
		FlandreEntity.init();
		MeilingEntity.init();
		YoumuEntity.init();
		YuyukoEntity.init();
		PatchouliEntity.init();
		NitoriEntity.init();
		TewiEntity.init();
		NazrinEntity.init();
		SunnyMilkEntity.init();
		AliceEntity.init();
		RemiliaEntity.init();
	}

	public static void registerAttributes() {
		FabricDefaultAttributeRegistry.register(REIMU, ReimuEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(MARISA, MarisaEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(MARISA_HAT, MarisaHatEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(EIKI, EikiEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(CIRNO, CirnoEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(TAN_CIRNO, TanCirnoEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(DEBUG_FUMO, DebugFumoEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(CHEN, ChenEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(NEW_REIMU, NewReimuEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(BLUE_REIMU, BlueReimuEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(KOISHI, KoishiEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(FLANDRE, FlandreEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(MEILING, MeilingEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(YOUMU, YoumuEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(YUYUKO, YuyukoEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(PATCHOULI, PatchouliEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(NITORI, NitoriEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(TEWI, TewiEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(NAZRIN, NazrinEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(SUNNY_MILK, SunnyMilkEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ALICE, AliceEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(REMILIA, RemiliaEntity.createAttributes());
	}
}
