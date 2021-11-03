import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class244 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "44"
	)
	static int method4727(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4304
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 4305
			return 1; // L: 4306
		} else if (var0 != 6801 && var0 != 6802) { // L: 4308
			if (var0 == 6850) { // L: 4312
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 4313
				return 1; // L: 4314
			} else if (var0 != 6851 && var0 != 6852) { // L: 4316
				if (var0 == 6853) { // L: 4320
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4321
					return 1; // L: 4322
				} else {
					return 2; // L: 4324
				}
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4317
				return 1; // L: 4318
			}
		} else {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4309
			return 1; // L: 4310
		}
	}
}
