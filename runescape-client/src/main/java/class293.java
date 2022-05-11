import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class293 {
	@ObfuscatedName("o")
	public static final short[] field3375;
	@ObfuscatedName("q")
	public static final short[][] field3371;
	@ObfuscatedName("l")
	public static final short[] field3376;
	@ObfuscatedName("k")
	public static final short[][] field3374;

	static {
		field3375 = new short[]{6798, 8741, 25238, 4626, 4550}; // L: 4
		field3371 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}}; // L: 5
		field3376 = new short[]{-10304, 9104, -1, -1, -1}; // L: 12
		field3374 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]}; // L: 13
	}

	@ObfuscatedName("q")
	public static String method5431(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (var0 % 37L == 0L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 39

				while (var0 != 0L) { // L: 40
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var5.append(class345.base37Table[(int)(var6 - 37L * var0)]); // L: 43
				}

				return var5.reverse().toString(); // L: 45
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1650429787"
	)
	public static int method5429() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 64
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)I",
		garbageValue = "619797497"
	)
	static int method5430(Widget var0) {
		if (var0.type != 11) { // L: 1227
			--class9.Interpreter_stringStackSize; // L: 1228
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 1229
			return 1; // L: 1230
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1232
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var0.method5455(var1); // L: 1233
			return 1; // L: 1234
		}
	}
}
