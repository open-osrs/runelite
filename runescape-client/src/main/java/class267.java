import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jb")
public class class267 {
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = -1597128389
	)
	static int field3206;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "-1967428813"
	)
	static int method5027(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3267
			var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3268
			var9 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3269
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3270
			return 1; // L: 3271
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3273
				class9.Interpreter_stringStackSize -= 2; // L: 3274
				var3 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize]; // L: 3275
				var4 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1]; // L: 3276
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3277
				return 1; // L: 3278
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3280
				var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3281
				var9 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3282
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3 + Message.intToString(var9, true); // L: 3283
				return 1; // L: 3284
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3286
				var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3287
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3288
				return 1; // L: 3289
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3291
					var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3292
					long var13 = ((long)var10 + 11745L) * 86400000L; // L: 3293
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3294
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3295
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3296
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3297
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3298
					return 1; // L: 3299
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3301
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3309
						var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3310
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3311
						return 1; // L: 3312
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3314
						class9.Interpreter_stringStackSize -= 2; // L: 3315
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ItemContainer.method2059(HealthBarDefinition.compareStrings(Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1], class263.clientLanguage)); // L: 3316
						return 1; // L: 3317
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3319
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3320
							class12.Interpreter_intStackSize -= 2; // L: 3321
							var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3322
							var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3323
							var11 = class16.archive13.takeFile(var5, 0); // L: 3324
							var12 = new Font(var11); // L: 3325
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3326
							return 1; // L: 3327
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3329
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3330
							class12.Interpreter_intStackSize -= 2; // L: 3331
							var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3332
							var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3333
							var11 = class16.archive13.takeFile(var5, 0); // L: 3334
							var12 = new Font(var11); // L: 3335
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3336
							return 1; // L: 3337
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3339
							class9.Interpreter_stringStackSize -= 2; // L: 3340
							var3 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize]; // L: 3341
							var4 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1]; // L: 3342
							if (Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize] == 1) { // L: 3343
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4; // L: 3344
							}

							return 1; // L: 3345
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3347
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3348
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3349
							return 1; // L: 3350
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3352
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3353
							var9 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3354
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3355
							return 1; // L: 3356
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3358
							var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3359
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class6.isCharPrintable((char)var10) ? 1 : 0; // L: 3360
							return 1; // L: 3361
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3363
							var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3364
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class78.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3365
							return 1; // L: 3366
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3368
							var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3369
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = UserComparator5.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3370
							return 1; // L: 3371
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3373
							var10 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3374
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Coord.isDigit((char)var10) ? 1 : 0; // L: 3375
							return 1; // L: 3376
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3378
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3379
							if (var3 != null) { // L: 3380
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3381
							}

							return 1; // L: 3382
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3384
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3385
							class12.Interpreter_intStackSize -= 2; // L: 3386
							var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3387
							var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3388
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3389
							return 1; // L: 3390
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3392
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3393
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3394
							boolean var16 = false; // L: 3395

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3396
								char var7 = var3.charAt(var6); // L: 3397
								if (var7 == '<') { // L: 3398
									var16 = true;
								} else if (var7 == '>') { // L: 3399
									var16 = false;
								} else if (!var16) { // L: 3400
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3402
							return 1; // L: 3403
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3405
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3406
							var9 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3407
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3408
							return 1; // L: 3409
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3411
							class9.Interpreter_stringStackSize -= 2; // L: 3412
							var3 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize]; // L: 3413
							var4 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1]; // L: 3414
							var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3415
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3416
							return 1; // L: 3417
						} else if (var0 == 4122) { // L: 3419
							var3 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3420
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3421
							return 1; // L: 3422
						} else {
							return 2; // L: 3424
						}
					}
				} else {
					class9.Interpreter_stringStackSize -= 2; // L: 3302
					var3 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize]; // L: 3303
					var4 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1]; // L: 3304
					if (ModelData0.localPlayer.appearance != null && ModelData0.localPlayer.appearance.isFemale) { // L: 3305
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3; // L: 3306
					}

					return 1; // L: 3307
				}
			}
		}
	}
}
