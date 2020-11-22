import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("c")
	public static short[][] field628;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	static Widget field621;
	@ObfuscatedName("v")
	public static String field617;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static AbstractSocket field615;
	@ObfuscatedName("f")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("b")
	@Export("lock")
	Object lock;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -973723423
	)
	@Export("index")
	int index;
	@ObfuscatedName("m")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("z")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("q")
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
		for (; this.isRunning; WorldMapSection3.sleepExact(50L)) { // L: 17 26
			synchronized(this.lock) { // L: 18
				if (this.index < 500) { // L: 19
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index; // L: 23
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Llb;",
		garbageValue = "-2124586789"
	)
	public static PrivateChatMode method1287(int var0) {
		PrivateChatMode[] var1 = FloorDecoration.method2989(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field3825) {
				return var3; // L: 24
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1737054142"
	)
	public static void method1283() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-500540968"
	)
	static final void method1286() {
		Object var10000 = null; // L: 133
		String var0 = "You can't add yourself to your own friend list";
		DevicePcmPlayerProvider.addGameMessage(30, "", var0); // L: 135
	} // L: 137

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1123050484"
	)
	static final void method1285() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4901 4902 4909
			if (var0.plane == GrandExchangeOfferUnitPriceComparator.Client_plane && !var0.isFinished) { // L: 4903
				if (Client.cycle >= var0.cycleStart) { // L: 4904
					var0.advance(Client.field743); // L: 4905
					if (var0.isFinished) { // L: 4906
						var0.remove();
					} else {
						ModeWhere.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false); // L: 4907
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4911
}
