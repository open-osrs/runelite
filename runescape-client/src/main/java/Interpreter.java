import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("b")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("k")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("g")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("h")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("n")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("m")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -196314347
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -309937971
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	static class3 field941;
	@ObfuscatedName("z")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("i")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("w")
	static boolean field944;
	@ObfuscatedName("s")
	static boolean field946;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1409766351
	)
	static int field950;
	@ObfuscatedName("ag")
	static final double field934;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 73
		Interpreter_arrays = new int[5][5000]; // L: 74
		Interpreter_intStack = new int[1000]; // L: 75
		Interpreter_stringStack = new String[1000]; // L: 77
		Interpreter_frameDepth = 0; // L: 79
		Interpreter_frames = new ScriptFrame[50]; // L: 80
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 86
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 89
		field944 = false; // L: 92
		field946 = false; // L: 93
		field950 = 0; // L: 94
		field934 = Math.log(2.0D); // L: 98
	}
}
