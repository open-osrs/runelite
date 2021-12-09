import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("w")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("n")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("r")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("v")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -866718889
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 355212093
	)
	static int field812;
	@ObfuscatedName("l")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("q")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("z")
	static boolean field818;
	@ObfuscatedName("i")
	static boolean field816;
	@ObfuscatedName("y")
	static ArrayList field817;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1880353715
	)
	static int field815;
	@ObfuscatedName("ax")
	static final double field814;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 77
		Interpreter_arrays = new int[5][5000]; // L: 78
		Interpreter_intStack = new int[1000]; // L: 79
		Interpreter_stringStack = new String[1000]; // L: 81
		Interpreter_frameDepth = 0; // L: 83
		Interpreter_frames = new ScriptFrame[50]; // L: 84
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 90
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 93
		field818 = false; // L: 96
		field816 = false; // L: 97
		field817 = new ArrayList(); // L: 98
		field815 = 0; // L: 99
		field814 = Math.log(2.0D); // L: 103
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(CLlf;B)I",
		garbageValue = "-56"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}
}
