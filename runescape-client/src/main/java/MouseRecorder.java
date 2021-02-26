import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bb")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -1626344665
	)
	@Export("port1")
	static int port1;
	@ObfuscatedName("n")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("v")
	@Export("lock")
	Object lock;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1370756697
	)
	@Export("index")
	int index;
	@ObfuscatedName("c")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("y")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("h")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; ApproximateRouteStrategy.sleepExact(50L)) { // L: 17 26
			synchronized(this.lock) { // L: 18
				if (this.index < 500) { // L: 19
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 20
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 21
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 22
					++this.index; // L: 23
				}
			}
		}

	} // L: 28
}
