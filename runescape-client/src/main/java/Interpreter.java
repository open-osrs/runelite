import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("a")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("e")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("i")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -784806353
	)
	static int field829;
	@ObfuscatedName("w")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1089183027
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("h")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("o")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("n")
	static boolean field828;
	@ObfuscatedName("u")
	static boolean field832;
	@ObfuscatedName("d")
	static ArrayList field830;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1390220385
	)
	static int field818;
	@ObfuscatedName("ah")
	static final double field826;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field828 = false;
		field832 = false;
		field830 = new ArrayList();
		field818 = 0;
		field826 = Math.log(2.0D);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2021156049"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "525192996"
	)
	static int method1868(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class6.method43(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = PacketBufferNode.method4654(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Messages.method2350(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
