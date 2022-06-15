import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1240555931
	)
	static int field846;
	@ObfuscatedName("f")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("e")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("g")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("w")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("i")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 183300013
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2041512145
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 987199293
	)
	static int field838;
	@ObfuscatedName("l")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("a")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("b")
	static boolean field829;
	@ObfuscatedName("n")
	static boolean field842;
	@ObfuscatedName("o")
	static ArrayList field843;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -186588537
	)
	static int field850;
	@ObfuscatedName("al")
	static final double field845;
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 83
		Interpreter_arrays = new int[5][5000]; // L: 84
		Interpreter_intStack = new int[1000]; // L: 85
		Interpreter_stringStack = new String[1000]; // L: 87
		Interpreter_frameDepth = 0; // L: 89
		Interpreter_frames = new ScriptFrame[50]; // L: 90
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 96
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 99
		field829 = false; // L: 102
		field842 = false; // L: 103
		field843 = new ArrayList(); // L: 104
		field850 = 0; // L: 105
		field845 = Math.log(2.0D); // L: 109
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldf;",
		garbageValue = "1105102872"
	)
	static class123[] method1866() {
		return new class123[]{class123.field1535, class123.field1529, class123.field1542, class123.field1531, class123.field1536, class123.field1533, class123.field1534, class123.field1532, class123.field1528}; // L: 113
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1772742726"
	)
	public static void method1868() {
		StructComposition.StructDefinition_cached.clear(); // L: 71
	} // L: 72

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Lbc;",
		garbageValue = "1"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class362.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}
}
