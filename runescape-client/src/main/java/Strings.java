import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bg")
	public static String field2839;
	@ObfuscatedName("cj")
	public static String field3046;
	@ObfuscatedName("jv")
	public static String field3054;
	@ObfuscatedName("js")
	public static String field3055;
	@ObfuscatedName("ja")
	public static String field3056;

	static {
		field2839 = "Please visit the support page for assistance."; // L: 60
		field3046 = "Please visit the support page for assistance."; // L: 99
		field3054 = ""; // L: 275
		field3055 = "Page has opened in a new window."; // L: 276
		field3056 = "(Please check your popup blocker.)"; // L: 277
	} // L: 307

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1467551929"
	)
	@Export("inventoryQuantityFormat")
	static final String inventoryQuantityFormat(int var0) {
		if (var0 < 100000) { // L: 413
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 414 415
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "58"
	)
	static int method4259(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 1165
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1166
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.x; // L: 1167
			return 1; // L: 1168
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1170
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.y; // L: 1171
			return 1; // L: 1172
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1174
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.width; // L: 1175
			return 1; // L: 1176
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1178
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.height; // L: 1179
			return 1; // L: 1180
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1182
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1183
			return 1; // L: 1184
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1186
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.parentId; // L: 1187
			return 1; // L: 1188
		} else {
			return 2; // L: 1190
		}
	}
}
