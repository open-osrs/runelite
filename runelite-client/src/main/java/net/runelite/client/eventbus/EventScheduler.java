package net.runelite.client.eventbus;

import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.schedulers.Schedulers;
import lombok.AllArgsConstructor;

import java.util.function.Supplier;

@AllArgsConstructor
public enum EventScheduler {
	DEFAULT(() -> null),
	COMPUTATION(Schedulers::computation),
	IO(Schedulers::io),
	NEWTHREAD(Schedulers::newThread),
	SINGLE(Schedulers::single),
	TRAMPOLINE(Schedulers::trampoline),
	CLIENT(Schedulers::single);

	private Supplier<Scheduler> scheduler;

	@Nullable
	public Scheduler get() {
		return scheduler.get();
	}
}
