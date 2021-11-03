import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class67 {
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("i")
	static final BigInteger field840;
	@ObfuscatedName("w")
	static final BigInteger field843;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1442166637
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1013200423
	)
	public static int field845;

	static {
		field840 = new BigInteger("10001", 16); // L: 6
		field843 = new BigInteger("933e616091e0666f756e1cf08e3239d7a471aba3ebf0013b32d4a351ebb206e47fdbc3569683ebc86c76a55cceedfdbf0f28f0b42ec697e24c1f322aa60a9d9d013cd2d943b842db981f90c6def19c4d25c86b0e41ae6b731b56da6563244706ef5c098a398b7d43f386072a206378425d78e612b3fcbc4b4be5108da43a0745", 16); // L: 7
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-782668076"
	)
	static int method1914(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4385
			++class14.Interpreter_intStackSize; // L: 4386
			return 1; // L: 4387
		} else if (var0 == 7101) { // L: 4389
			class295.Interpreter_stringStackSize += 2; // L: 4390
			return 1; // L: 4391
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4393
			if (var0 == 7106) { // L: 4397
				++class14.Interpreter_intStackSize; // L: 4398
				return 1; // L: 4399
			} else if (var0 == 7107) { // L: 4401
				++class14.Interpreter_intStackSize; // L: 4402
				return 1; // L: 4403
			} else if (var0 == 7108) { // L: 4405
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Language.method5521() ? 1 : 0; // L: 4406
				return 1; // L: 4407
			} else if (var0 == 7110) { // L: 4409
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4410
				return 1; // L: 4411
			} else if (var0 == 7120) { // L: 4413
				--class14.Interpreter_intStackSize; // L: 4414
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4415
				return 1; // L: 4416
			} else if (var0 == 7121) { // L: 4418
				class14.Interpreter_intStackSize -= 2; // L: 4419
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4420
				return 1; // L: 4421
			} else if (var0 == 7122) { // L: 4423
				class14.Interpreter_intStackSize -= 2; // L: 4424
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4425
				return 1; // L: 4426
			} else {
				return 2; // L: 4428
			}
		} else {
			++class14.Interpreter_intStackSize; // L: 4394
			return 1; // L: 4395
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "621915998"
	)
	static final void method1913(int var0) {
		if (var0 >= 0) { // L: 8261
			int var1 = Client.menuArguments1[var0]; // L: 8262
			int var2 = Client.menuArguments2[var0]; // L: 8263
			int var3 = Client.menuOpcodes[var0]; // L: 8264
			int var4 = Client.menuIdentifiers[var0]; // L: 8265
			String var5 = Client.menuActions[var0]; // L: 8266
			String var6 = Client.menuTargets[var0]; // L: 8267
			class14.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8268
		}
	} // L: 8269
}
