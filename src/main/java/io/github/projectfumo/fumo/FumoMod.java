package io.github.projectfumo.fumo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import net.minecraft.server.TickTask;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.concurrent.ConcurrentLinkedQueue;

import it.unimi.dsi.fastutil.ints.IntObjectPair;
import it.unimi.dsi.fastutil.ints.IntObjectImmutablePair;

import io.github.projectfumo.fumo.init.FumoModTabs;
import io.github.projectfumo.fumo.init.FumoModItems;
import io.github.projectfumo.fumo.init.FumoModEntities;
import io.github.projectfumo.fumo.init.FumoModTrades;

public class FumoMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger(FumoMod.class);
	public static final String MODID = "fumo";

	@Override
	public void onInitialize() {
		FumoModItems.init();
		FumoModEntities.init();
		FumoModEntities.registerAttributes();
		FumoModTabs.init();
		FumoModTrades.init();

		ServerTickEvents.END_SERVER_TICK.register(this::tick);
	}

	private static final Queue<IntObjectPair<Runnable>> workToBeScheduled = new ConcurrentLinkedQueue<>();
	private static final PriorityQueue<TickTask> workQueue = new PriorityQueue<>(Comparator.comparingInt(TickTask::getTick));

	public static void queueServerWork(int delay, Runnable action) {
		workToBeScheduled.add(new IntObjectImmutablePair<>(delay, action));
	}

	private void tick(net.minecraft.server.MinecraftServer server) {
		int currentTick = server.getTickCount();
		IntObjectPair<Runnable> work;
		while ((work = workToBeScheduled.poll()) != null) {
			workQueue.add(new TickTask(currentTick + work.leftInt(), work.right()));
		}
		while (!workQueue.isEmpty() && currentTick >= workQueue.peek().getTick()) {
			workQueue.poll().run();
		}
	}
}
