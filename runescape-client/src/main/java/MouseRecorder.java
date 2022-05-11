import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("o")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("q")
	@Export("lock")
	Object lock;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1556283769
	)
	@Export("index")
	int index;
	@ObfuscatedName("k")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("a")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("m")
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
		for (; this.isRunning; class241.method4815(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-105"
	)
	public static void method2088(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 42
			try {
				Buffer var1 = new Buffer(4); // L: 44
				var1.writeByte(var0 ? 2 : 3); // L: 45
				var1.writeMedium(0); // L: 46
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 47
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 51
				} catch (Exception var3) { // L: 53
				}

				++NetCache.NetCache_ioExceptions; // L: 54
				NetCache.NetCache_socket = null; // L: 55
			}

		}
	} // L: 57
}
