import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class293 {
	@ObfuscatedName("v")
	public static final short[] field3308;
	@ObfuscatedName("c")
	public static final short[][] field3309;
	@ObfuscatedName("i")
	public static final short[] field3310;
	@ObfuscatedName("f")
	public static final short[][] field3312;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 763909349
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("World_request")
	static UrlRequest World_request;

	static {
		field3308 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field3309 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field3310 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
		field3312 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(BB)C",
		garbageValue = "105"
	)
	public static char method5600(byte var0) {
		int var1 = var0 & 255; // L: 84
		if (var1 == 0) { // L: 85
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 86
				char var2 = class345.cp1252AsciiExtension[var1 - 128]; // L: 87
				if (var2 == 0) { // L: 88
					var2 = '?';
				}

				var1 = var2; // L: 89
			}

			return (char)var1; // L: 91
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-102"
	)
	static final int method5599(int var0, int var1) {
		int var2 = class12.method117(var0 - 1, var1 - 1) + class12.method117(var0 + 1, var1 - 1) + class12.method117(var0 - 1, 1 + var1) + class12.method117(1 + var0, 1 + var1); // L: 920
		int var3 = class12.method117(var0 - 1, var1) + class12.method117(1 + var0, var1) + class12.method117(var0, var1 - 1) + class12.method117(var0, var1 + 1); // L: 921
		int var4 = class12.method117(var0, var1); // L: 922
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 923
	}
}
