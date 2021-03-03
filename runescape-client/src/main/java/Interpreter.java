import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("y")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("z")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("e")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("q")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1775407691
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("s")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1832147507
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1349197587
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lbz;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("x")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("f")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("u")
	static boolean field1120;
	@ObfuscatedName("t")
	static boolean field1122;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 365610695
	)
	static int field1123;
	@ObfuscatedName("j")
	static final double field1124;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = 847561081
	)
	static int field1116;
	@ObfuscatedName("gk")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 70
		Interpreter_arrays = new int[5][5000]; // L: 71
		Interpreter_intStack = new int[1000]; // L: 72
		Interpreter_stringStack = new String[1000]; // L: 74
		Interpreter_frameDepth = 0; // L: 76
		Interpreter_frames = new ScriptFrame[50]; // L: 77
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 80
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 83
		field1120 = false; // L: 86
		field1122 = false; // L: 87
		field1123 = 0; // L: 88
		field1124 = Math.log(2.0D); // L: 92
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1493110038"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 586
			var1 /= 2;
		}

		if (var2 > 192) { // L: 587
			var1 /= 2;
		}

		if (var2 > 217) { // L: 588
			var1 /= 2;
		}

		if (var2 > 243) { // L: 589
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 590
		return var3; // L: 591
	}
}
