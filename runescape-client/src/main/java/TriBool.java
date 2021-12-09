import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mu")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-1397883931"
	)
	static int method6472(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3217
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3218
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = UserComparator6.ItemDefinition_get(var3).name; // L: 3219
			return 1; // L: 3220
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3222
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 3223
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3224
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3225
				var5 = UserComparator6.ItemDefinition_get(var3); // L: 3226
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3227
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3228
				}

				return 1; // L: 3229
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3231
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 3232
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3233
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3234
				var5 = UserComparator6.ItemDefinition_get(var3); // L: 3235
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3236
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3237
				}

				return 1; // L: 3238
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3240
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3241
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = UserComparator6.ItemDefinition_get(var3).price; // L: 3242
				return 1; // L: 3243
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3245
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3246
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = UserComparator6.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0; // L: 3247
				return 1; // L: 3248
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3250
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3251
					var7 = UserComparator6.ItemDefinition_get(var3); // L: 3252
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3253
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3; // L: 3254
					}

					return 1; // L: 3255
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3257
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3258
					var7 = UserComparator6.ItemDefinition_get(var3); // L: 3259
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3260
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3; // L: 3261
					}

					return 1; // L: 3262
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3264
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3265
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = UserComparator6.ItemDefinition_get(var3).isMembersOnly ? 1 : 0; // L: 3266
					return 1; // L: 3267
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3269
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3270
					var7 = UserComparator6.ItemDefinition_get(var3); // L: 3271
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3272
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3; // L: 3273
					}

					return 1; // L: 3274
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3276
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3277
					var7 = UserComparator6.ItemDefinition_get(var3); // L: 3278
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3279
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3; // L: 3280
					}

					return 1; // L: 3281
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3283
					String var6 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3284
					var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3285
					StructComposition.findItemDefinitions(var6, var4 == 1); // L: 3286
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = GraphicsDefaults.foundItemIdCount; // L: 3287
					return 1; // L: 3288
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3290
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3295
						class336.foundItemIndex = 0; // L: 3296
						return 1; // L: 3297
					} else if (var0 == 4213) { // L: 3299
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3300
						var4 = UserComparator6.ItemDefinition_get(var3).getShiftClickIndex(); // L: 3301
						if (var4 == -1) { // L: 3302
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4; // L: 3303
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4 + 1; // L: 3306
						}

						return 1; // L: 3308
					} else {
						return 2; // L: 3310
					}
				} else {
					if (class113.foundItemIds != null && class336.foundItemIndex < GraphicsDefaults.foundItemIdCount) { // L: 3291
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class113.foundItemIds[++class336.foundItemIndex - 1] & '\uffff'; // L: 3292
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3293
				}
			}
		}
	}
}
