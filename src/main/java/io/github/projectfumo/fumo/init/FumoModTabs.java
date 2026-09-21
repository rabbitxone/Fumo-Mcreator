package io.github.projectfumo.fumo.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import io.github.projectfumo.fumo.FumoMod;

public class FumoModTabs {
	public static final CreativeModeTab FUMO_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(FumoMod.MODID, "fumo_tab"),
			FabricItemGroup.builder().title(Component.translatable("item_group.fumo.fumo_tab")).icon(() -> new ItemStack(FumoModItems.CREATIVE_TAB_ICON)).displayItems((parameters, tabData) -> {
				tabData.accept(FumoModItems.MARISA_HAT_ITEM);
				tabData.accept(FumoModItems.EIKI_ITEM);
				tabData.accept(FumoModItems.REIMU_ITEM);
				tabData.accept(FumoModItems.MARISA_ITEM);
				tabData.accept(FumoModItems.CIRNO_ITEM);
				tabData.accept(FumoModItems.TAN_CIRNO_ITEM);
				tabData.accept(FumoModItems.CHEN_ITEM);
				tabData.accept(FumoModItems.NEW_REIMU_ITEM);
				tabData.accept(FumoModItems.BLUE_REIMU_ITEM);
				tabData.accept(FumoModItems.KOISHI_ITEM);
				tabData.accept(FumoModItems.FLANDRE_ITEM);
				tabData.accept(FumoModItems.MEILING_ITEM);
				tabData.accept(FumoModItems.YOUMU_ITEM);
				tabData.accept(FumoModItems.YUYUKO_ITEM);
				tabData.accept(FumoModItems.PATCHOULI_ITEM);
				tabData.accept(FumoModItems.NITORI_ITEM);
				tabData.accept(FumoModItems.TEWI_ITEM);
				tabData.accept(FumoModItems.NAZRIN_ITEM);
				tabData.accept(FumoModItems.SUNNY_MILK_ITEM);
				tabData.accept(FumoModItems.ALICE_ITEM);
				tabData.accept(FumoModItems.REMILIA_ITEM);
			}).build());

	public static void init() {
	}
}
