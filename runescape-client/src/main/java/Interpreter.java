import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("l")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("m")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("z")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("q")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("k")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("u")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1142529175
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	static Widget field1122;
	@ObfuscatedName("p")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("r")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("s")
	static boolean field1130;
	@ObfuscatedName("j")
	static boolean field1128;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -356581693
	)
	static int field1119;
	@ObfuscatedName("g")
	static final double field1129;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -44620435
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 68
		Interpreter_arrays = new int[5][5000]; // L: 69
		Interpreter_intStack = new int[1000]; // L: 70
		Interpreter_stringStack = new String[1000]; // L: 72
		Interpreter_frameDepth = 0; // L: 74
		Interpreter_frames = new ScriptFrame[50]; // L: 75
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 78
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 81
		field1130 = false; // L: 84
		field1128 = false; // L: 85
		field1119 = 0; // L: 86
		field1129 = Math.log(2.0D); // L: 90
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-1431393393"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 106

		for (int var6 = 0; var6 < var5; ++var6) { // L: 107
			char var7 = var0.charAt(var6 + var1); // L: 108
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 109
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 110
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 111
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 112
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 113
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 114
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 115
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 116
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 117
			} else if (var7 == 8240) { // L: 118
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 119
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 120
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 121
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 122
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 123
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 124
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 125
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 126
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 127
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 128
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 129
			} else if (var7 == 732) { // L: 130
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 131
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 132
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 133
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 134
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 135
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 136
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 137
			}
		}

		return var5; // L: 139
	}
}
