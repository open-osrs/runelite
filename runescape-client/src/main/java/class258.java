import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ib")
public class class258 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-76"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 144
		int var2 = 0; // L: 145

		for (int var3 = 0; var3 < var1; ++var3) { // L: 146
			var2 = (var2 << 5) - var2 + DirectByteArrayCopier.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 147
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "209273359"
	)
	static int method4787(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3425
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = HitSplatDefinition.getWindowedMode(); // L: 3426
			return 1; // L: 3427
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3429
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3430
				if (var3 == 1 || var3 == 2) { // L: 3431
					class374.setWindowedMode(var3);
				}

				return 1; // L: 3432
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3434
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class12.clientPreferences.windowMode; // L: 3435
				return 1; // L: 3436
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3438
				if (var0 == 5310) { // L: 3446
					--WorldMapCacheName.Interpreter_intStackSize; // L: 3447
					return 1; // L: 3448
				} else if (var0 == 5350) { // L: 3450
					class13.Interpreter_stringStackSize -= 2; // L: 3451
					--WorldMapCacheName.Interpreter_intStackSize; // L: 3452
					return 1; // L: 3453
				} else if (var0 == 5351) { // L: 3455
					--class13.Interpreter_stringStackSize; // L: 3456
					return 1; // L: 3457
				} else {
					return 2; // L: 3459
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3439
				if (var3 == 1 || var3 == 2) { // L: 3440
					class12.clientPreferences.windowMode = var3; // L: 3441
					KeyHandler.savePreferences(); // L: 3442
				}

				return 1; // L: 3444
			}
		}
	}
}
