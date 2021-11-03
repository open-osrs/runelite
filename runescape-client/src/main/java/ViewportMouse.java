import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("i")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1767898875
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1574858815
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("a")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1627779879
	)
	static int field2582;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 388017149
	)
	static int field2579;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1496218799
	)
	static int field2584;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1501353273
	)
	static int field2590;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1561495595
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("l")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "598393616"
	)
	static int method4622(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 1087
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1088
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.x; // L: 1089
			return 1; // L: 1090
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1092
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.y; // L: 1093
			return 1; // L: 1094
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1096
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.width; // L: 1097
			return 1; // L: 1098
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1100
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.height; // L: 1101
			return 1; // L: 1102
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1104
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1105
			return 1; // L: 1106
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1108
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.parentId; // L: 1109
			return 1; // L: 1110
		} else {
			return 2; // L: 1112
		}
	}
}
