import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jr")
public class class270 {
	@ObfuscatedName("w")
	public static boolean field3218;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2072054162"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 112

		try {
			var0 = UserComparator3.getPreferencesFile("", ApproximateRouteStrategy.field473.name, true); // L: 114
			Buffer var1 = class12.clientPreferences.toBuffer(); // L: 115
			var0.write(var1.array, 0, var1.offset); // L: 116
		} catch (Exception var3) { // L: 118
		}

		try {
			if (var0 != null) { // L: 120
				var0.closeSync(true); // L: 121
			}
		} catch (Exception var2) { // L: 124
		}

	} // L: 125

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "416370156"
	)
	static int method5036(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 1199
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1200
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.itemId; // L: 1201
			return 1; // L: 1202
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1204
			if (var3.itemId != -1) { // L: 1205
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 1206
			}

			return 1; // L: 1207
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1209
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1210
			return 1; // L: 1211
		} else if (var0 == 1707) { // L: 1213
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.method5498() ? 1 : 0; // L: 1214
			return 1; // L: 1215
		} else if (var0 == 1708) { // L: 1217
			return class293.method5430(var3); // L: 1218
		} else {
			return var0 == 1708 ? class20.method269(var3) : 2; // L: 1220 1221 1223
		}
	}
}
