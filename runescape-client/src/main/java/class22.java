import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("s")
public class class22 {
	@ObfuscatedName("ac")
	static String field107;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lbb;I)V",
		garbageValue = "-1301160950"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		AttackOption.runScript(var0, 500000); // L: 99
	} // L: 100

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1990395743"
	)
	static int method221(int var0, Script var1, boolean var2) {
		Widget var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 1186
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1187
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.x; // L: 1188
			return 1; // L: 1189
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1191
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.y; // L: 1192
			return 1; // L: 1193
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1195
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.width; // L: 1196
			return 1; // L: 1197
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1199
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.height; // L: 1200
			return 1; // L: 1201
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1203
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1204
			return 1; // L: 1205
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1207
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.parentId; // L: 1208
			return 1; // L: 1209
		} else {
			return 2; // L: 1211
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1865855416"
	)
	static String method220(String var0) {
		PlayerType[] var1 = class234.PlayerType_values(); // L: 11193

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11194
			PlayerType var3 = var1[var2]; // L: 11195
			if (var3.modIcon != -1 && var0.startsWith(class25.method248(var3.modIcon))) { // L: 11197 11198
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 11199
				break;
			}
		}

		return var0; // L: 11206
	}
}
