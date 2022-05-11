import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jh")
public class class282 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CLlq;B)I",
		garbageValue = "1"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1978275561"
	)
	static int method5334(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1449
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1450
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = WorldMapSection1.Widget_unpackTargetMask(UrlRequester.getWidgetFlags(var3)); // L: 1451
			return 1; // L: 1452
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1454
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1461
				if (var3.dataText == null) { // L: 1462
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1463
				}

				return 1; // L: 1464
			} else {
				return 2; // L: 1466
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1455
			--var4; // L: 1456
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1457
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1458
			} else {
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1459
		}
	}
}
