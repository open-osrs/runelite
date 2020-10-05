import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = 829134311
	)
	static int field609;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive18;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static Task socketTask;
	@ObfuscatedName("z")
	boolean isRunning;
	@ObfuscatedName("k")
	Object lock;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -587598223
	)
	int index;
	@ObfuscatedName("t")
	int[] xs;
	@ObfuscatedName("i")
	int[] ys;
	@ObfuscatedName("o")
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
		for (; this.isRunning; class227.sleepExact(50L)) { // L: 17 26
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

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IIZS)V",
		garbageValue = "338"
	)
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 9242
		int var5 = var0.height; // L: 9243
		if (var0.widthAlignment == 0) { // L: 9244
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 9245
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 9246
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 9247
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 9248
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 9249
		}

		if (var0.widthAlignment == 4) { // L: 9250
			var0.width = var0.height * var0.field2622 / var0.field2623;
		}

		if (var0.heightAlignment == 4) { // L: 9251
			var0.height = var0.field2623 * var0.width / var0.field2622;
		}

		if (var0.contentType == 1337) { // L: 9252
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 9253
			ScriptEvent var6 = new ScriptEvent(); // L: 9254
			var6.widget = var0; // L: 9255
			var6.args = var0.onResize; // L: 9256
			Client.scriptEvents.addFirst(var6); // L: 9257
		}

	} // L: 9259
}
