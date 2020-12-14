import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jh")
public class class277 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1829984749"
	)
	static int method5005(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? PlayerComposition.field2561 : VarcInt.field3264; // L: 1106
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1107
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.itemId; // L: 1108
			return 1; // L: 1109
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1111
			if (var3.itemId != -1) { // L: 1112
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1113
			}

			return 1; // L: 1114
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1116
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1117
			return 1; // L: 1118
		} else {
			return 2; // L: 1120
		}
	}
}
