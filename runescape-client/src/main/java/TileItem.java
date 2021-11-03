import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("b")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1808004397
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 86288183
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		return TaskHandler.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "26741"
	)
	public static boolean method2316(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 29
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZS)I",
		garbageValue = "32102"
	)
	static int method2309(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3220
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3221
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = TaskHandler.ItemDefinition_get(var3).name; // L: 3222
			return 1; // L: 3223
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3225
				class14.Interpreter_intStackSize -= 2; // L: 3226
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3227
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3228
				var5 = TaskHandler.ItemDefinition_get(var3); // L: 3229
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3230
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3231
				}

				return 1; // L: 3232
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3234
				class14.Interpreter_intStackSize -= 2; // L: 3235
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3236
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3237
				var5 = TaskHandler.ItemDefinition_get(var3); // L: 3238
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3239
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3240
				}

				return 1; // L: 3241
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3243
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3244
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = TaskHandler.ItemDefinition_get(var3).price; // L: 3245
				return 1; // L: 3246
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3248
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3249
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = TaskHandler.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0; // L: 3250
				return 1; // L: 3251
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3253
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3254
					var7 = TaskHandler.ItemDefinition_get(var3); // L: 3255
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3256
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3; // L: 3257
					}

					return 1; // L: 3258
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3260
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3261
					var7 = TaskHandler.ItemDefinition_get(var3); // L: 3262
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3263
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3; // L: 3264
					}

					return 1; // L: 3265
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3267
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3268
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = TaskHandler.ItemDefinition_get(var3).isMembersOnly ? 1 : 0; // L: 3269
					return 1; // L: 3270
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3272
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3273
					var7 = TaskHandler.ItemDefinition_get(var3); // L: 3274
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3275
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3; // L: 3276
					}

					return 1; // L: 3277
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3279
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3280
					var7 = TaskHandler.ItemDefinition_get(var3); // L: 3281
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3282
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3; // L: 3283
					}

					return 1; // L: 3284
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3286
					String var6 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3287
					var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3288
					KeyHandler.findItemDefinitions(var6, var4 == 1); // L: 3289
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Skeleton.foundItemIdCount; // L: 3290
					return 1; // L: 3291
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3293
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3298
						ClanSettings.foundItemIndex = 0; // L: 3299
						return 1; // L: 3300
					} else if (var0 == 4213) { // L: 3302
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3303
						var4 = TaskHandler.ItemDefinition_get(var3).getShiftClickIndex(); // L: 3304
						if (var4 == -1) { // L: 3305
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4; // L: 3306
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4 + 1; // L: 3309
						}

						return 1; // L: 3311
					} else {
						return 2; // L: 3313
					}
				} else {
					if (Language.foundItemIds != null && ClanSettings.foundItemIndex < Skeleton.foundItemIdCount) { // L: 3294
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Language.foundItemIds[++ClanSettings.foundItemIndex - 1] & '\uffff'; // L: 3295
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3296
				}
			}
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-120"
	)
	static final void method2315() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11776
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11777
			var1.clearIsInFriendsChat(); // L: 11778
		}

	} // L: 11780
}
