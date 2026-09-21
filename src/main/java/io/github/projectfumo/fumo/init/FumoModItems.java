package io.github.projectfumo.fumo.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import io.github.projectfumo.fumo.item.*;
import io.github.projectfumo.fumo.FumoMod;

public class FumoModItems {
	public static final Item FUMOITEM = register("fumoitem", new FumoitemItem());
	public static final Item MARISA_HAT_ITEM = register("marisa_hat_item", new MarisaHatItemItem());
	public static final Item EIKI_ITEM = register("eiki_item", new EikiItemItem());
	public static final Item REIMU_ITEM = register("reimu_item", new ReimuItemItem());
	public static final Item MARISA_ITEM = register("marisa_item", new MarisaItemItem());
	public static final Item CIRNO_ITEM = register("cirno_item", new CirnoItemItem());
	public static final Item TAN_CIRNO_ITEM = register("tan_cirno_item", new TanCirnoItemItem());
	public static final Item CHEN_ITEM = register("chen_item", new ChenItemItem());
	public static final Item NEW_REIMU_ITEM = register("new_reimu_item", new NewReimuItemItem());
	public static final Item BLUE_REIMU_ITEM = register("blue_reimu_item", new BlueReimuItemItem());
	public static final Item KOISHI_ITEM = register("koishi_item", new KoishiItemItem());
	public static final Item FLANDRE_ITEM = register("flandre_item", new FlandreItemItem());
	public static final Item CREATIVE_TAB_ICON = register("creative_tab_icon", new CreativeTabIconItem());
	public static final Item MEILING_ITEM = register("meiling_item", new MeilingItemItem());
	public static final Item YOUMU_ITEM = register("youmu_item", new YoumuItemItem());
	public static final Item REIMU_ICON = register("reimu_icon", new ReimuIconItem());
	public static final Item MARISA_ICON = register("marisa_icon", new MarisaIconItem());
	public static final Item CIRNO_ICON = register("cirno_icon", new CirnoIconItem());
	public static final Item EIKI_ICON = register("eiki_icon", new EikiIconItem());
	public static final Item FLAN_ICON = register("flan_icon", new FlanIconItem());
	public static final Item KOISHI_ICON = register("koishi_icon", new KoishiIconItem());
	public static final Item MARISA_HAT_ICON = register("marisa_hat_icon", new MarisaHatIconItem());
	public static final Item MEILING_ICON = register("meiling_icon", new MeilingIconItem());
	public static final Item BOOTLEG_REIMU_ICON = register("bootleg_reimu_icon", new BootlegReimuIconItem());
	public static final Item TAN_CIRNO_ICON = register("tan_cirno_icon", new TanCirnoIconItem());
	public static final Item YOUMU_ICON = register("youmu_icon", new YoumuIconItem());
	public static final Item CHEN_ICON = register("chen_icon", new ChenIconItem());
	public static final Item BLUE_REIMU_ICON = register("blue_reimu_icon", new BlueReimuIconItem());
	public static final Item FUMO_ROTATE_ICON = register("fumo_rotate_icon", new FumoRotateIconItem());
	public static final Item ITEM_SPIN_ICON = register("item_spin_icon", new ItemSpinIconItem());
	public static final Item YUYUKO_ITEM = register("yuyuko_item", new YuyukoItemItem());
	public static final Item YUYUKO_ICON = register("yuyuko_icon", new YuyukoIconItem());
	public static final Item PATCHOULI_ITEM = register("patchouli_item", new PatchouliItemItem());
	public static final Item NITORI_ITEM = register("nitori_item", new NitoriItemItem());
	public static final Item TEWI_ITEM = register("tewi_item", new TewiItemItem());
	public static final Item NAZRIN_ITEM = register("nazrin_item", new NazrinItemItem());
	public static final Item SUNNY_MILK_ITEM = register("sunny_milk_item", new SunnyMilkItemItem());
	public static final Item ALICE_ITEM = register("alice_item", new AliceItemItem());
	public static final Item REMILIA_ITEM = register("remilia_item", new RemiliaItemItem());

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(FumoMod.MODID, registryName), item);
	}

	public static void init() {
	}
}
