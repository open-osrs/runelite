import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class245 {
	@ObfuscatedName("v")
	public static final short[] field2944;
	@ObfuscatedName("n")
	public static final short[][] field2940;
	@ObfuscatedName("f")
	public static final short[] field2941;
	@ObfuscatedName("y")
	public static final short[][] field2942;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;

	static {
		field2944 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field2940 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field2941 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
		field2942 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2146522147"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 176
			return true;
		} else if (var0 >= 160 && var0 <= 255) { // L: 177
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 178
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "1292576632"
	)
	static void method4714(Buffer var0, int var1) {
		KitDefinition.method2687(var0.array, var1); // L: 11464
		if (JagexCache.JagexCache_randomDat != null) { // L: 11466
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 11468
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 11469
			} catch (Exception var3) { // L: 11471
			}
		}

	} // L: 11474
}
