import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("s")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("i")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("o")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("x")
	static int[] Interpreter_intStack;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1375275397
	)
	static int Interpreter_intStackSize;
	@ObfuscatedName("g")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -800989913
	)
	static int Interpreter_frameDepth;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("q")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("c")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("y")
	static boolean field1131;
	@ObfuscatedName("v")
	static boolean field1132;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -387233075
	)
	static int field1135;
	@ObfuscatedName("b")
	static final double field1120;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 68
		Interpreter_arrays = new int[5][5000]; // L: 69
		Interpreter_intStack = new int[1000]; // L: 70
		Interpreter_stringStack = new String[1000]; // L: 72
		Interpreter_frameDepth = 0; // L: 74
		Interpreter_frames = new ScriptFrame[50]; // L: 75
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 78
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 81
		field1131 = false; // L: 84
		field1132 = false; // L: 85
		field1135 = 0; // L: 86
		field1120 = Math.log(2.0D); // L: 90
	}
}
