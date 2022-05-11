import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("km")
public enum class309 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3976(-1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3973(0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3974(1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	field3972(2);

	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -965823037
	)
	final int field3975;

	class309(int var3) {
		this.field3975 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3975; // L: 20
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "25"
	)
	static int method5600(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2270
			class12.Interpreter_intStackSize -= 2; // L: 2271
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2272
			var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2273
			EnumComposition var10 = Calendar.getEnum(var3); // L: 2274
			if (var10.outputType != 's') { // L: 2275
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2276
				if (var9 == var10.keys[var6]) { // L: 2277
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2278
					var10 = null; // L: 2279
					break;
				}
			}

			if (var10 != null) { // L: 2283
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2284
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2286
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2312
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2313
				EnumComposition var4 = Calendar.getEnum(var3); // L: 2314
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.size(); // L: 2315
				return 1; // L: 2316
			} else {
				return 2; // L: 2318
			}
		} else {
			class12.Interpreter_intStackSize -= 4; // L: 2287
			var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2288
			var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2289
			int var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 2290
			var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3]; // L: 2291
			EnumComposition var7 = Calendar.getEnum(var5); // L: 2292
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2293
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2298
					if (var6 == var7.keys[var8]) { // L: 2299
						if (var9 == 115) { // L: 2300
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2301
						}

						var7 = null; // L: 2302
						break;
					}
				}

				if (var7 != null) { // L: 2306
					if (var9 == 115) { // L: 2307
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2308
					}
				}

				return 1; // L: 2310
			} else {
				if (var9 == 115) { // L: 2294
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 2295
				}

				return 1; // L: 2296
			}
		}
	}
}
