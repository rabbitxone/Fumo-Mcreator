package io.github.projectfumo.fumo.init;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;

import java.util.Optional;

public class FumoModTrades {
	public static void init() {
		TradeOfferHelper.registerWanderingTraderOffers(1,
				factories -> factories.add((trader, random) -> new MerchantOffer(new ItemCost(Items.MUSIC_DISC_13), Optional.of(new ItemCost(Items.MUSIC_DISC_CAT)), new ItemStack(FumoModItems.REIMU_ITEM), 10, 5, 0.05f)));
	}
}
