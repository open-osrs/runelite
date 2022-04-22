import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ho")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("v")
	@Export("text")
	String text;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -748694571
	)
	@Export("width")
	int width;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 703588799
	)
	@Export("height")
	int height;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILgp;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lfq;",
		garbageValue = "-1327829114"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 27
		if (var1 != null) { // L: 28
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 29
			var1 = new KitDefinition(); // L: 30
			if (var2 != null) { // L: 31
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-1060633923"
	)
	static int method4354(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3267
			var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3268
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3269
			Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3270
			return 1; // L: 3271
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3273
				class122.Interpreter_stringStackSize -= 2; // L: 3274
				var3 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize]; // L: 3275
				var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1]; // L: 3276
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3277
				return 1; // L: 3278
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3280
				var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3281
				var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3282
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3 + ItemLayer.intToString(var9, true); // L: 3283
				return 1; // L: 3284
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3286
				var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3287
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3288
				return 1; // L: 3289
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3291
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3292
					long var13 = (11745L + (long)var10) * 86400000L; // L: 3293
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3294
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3295
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3296
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3297
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3298
					return 1; // L: 3299
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3301
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3309
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3310
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3311
						return 1; // L: 3312
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3314
						class122.Interpreter_stringStackSize -= 2; // L: 3315
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanChannelMember.method2869(PlayerType.compareStrings(Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1], Skills.clientLanguage)); // L: 3316
						return 1; // L: 3317
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3319
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3320
							Interpreter.Interpreter_intStackSize -= 2; // L: 3321
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3322
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3323
							var11 = class166.archive13.takeFile(var5, 0); // L: 3324
							var12 = new Font(var11); // L: 3325
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3326
							return 1; // L: 3327
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3329
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3330
							Interpreter.Interpreter_intStackSize -= 2; // L: 3331
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3332
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3333
							var11 = class166.archive13.takeFile(var5, 0); // L: 3334
							var12 = new Font(var11); // L: 3335
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3336
							return 1; // L: 3337
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3339
							class122.Interpreter_stringStackSize -= 2; // L: 3340
							var3 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize]; // L: 3341
							var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1]; // L: 3342
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3343
								Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4; // L: 3344
							}

							return 1; // L: 3345
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3347
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3348
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3349
							return 1; // L: 3350
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3352
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3353
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3354
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3355
							return 1; // L: 3356
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3358
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3359
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPreferences.isCharPrintable((char)var10) ? 1 : 0; // L: 3360
							return 1; // L: 3361
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3363
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3364
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class131.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3365
							return 1; // L: 3366
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3368
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3369
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundSystem.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3370
							return 1; // L: 3371
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3373
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3374
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapElement.isDigit((char)var10) ? 1 : 0; // L: 3375
							return 1; // L: 3376
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3378
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3379
							if (var3 != null) { // L: 3380
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3381
							}

							return 1; // L: 3382
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3384
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3385
							Interpreter.Interpreter_intStackSize -= 2; // L: 3386
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3387
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3388
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3389
							return 1; // L: 3390
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3392
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3393
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

							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3402
							return 1; // L: 3403
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3405
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3406
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3407
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3408
							return 1; // L: 3409
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3411
							class122.Interpreter_stringStackSize -= 2; // L: 3412
							var3 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize]; // L: 3413
							var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1]; // L: 3414
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3415
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3416
							return 1; // L: 3417
						} else if (var0 == 4122) { // L: 3419
							var3 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3420
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3421
							return 1; // L: 3422
						} else {
							return 2; // L: 3424
						}
					}
				} else {
					class122.Interpreter_stringStackSize -= 2; // L: 3302
					var3 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize]; // L: 3303
					var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1]; // L: 3304
					if (GrandExchangeEvents.localPlayer.appearance != null && GrandExchangeEvents.localPlayer.appearance.isFemale) { // L: 3305
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3; // L: 3306
					}

					return 1; // L: 3307
				}
			}
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-543558308"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5432
		int var4 = var1 >> 7; // L: 5433
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5434
			int var5 = var2; // L: 5435
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5436
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5437
			int var7 = var1 & 127; // L: 5438
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 5439
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5440
			return var7 * var9 + var8 * (128 - var7) >> 7; // L: 5441
		} else {
			return 0;
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1796221797"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class143.method3072(); // L: 12041

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 12043
			if (var1.obj != null) { // L: 12044
				var1.set();
			}
		}

		int var3 = class134.VarpDefinition_get(var0).type; // L: 12047
		if (var3 != 0) { // L: 12048
			int var2 = Varps.Varps_main[var0]; // L: 12049
			if (var3 == 1) { // L: 12050
				if (var2 == 1) { // L: 12051
					KitDefinition.method3453(0.9D);
				}

				if (var2 == 2) { // L: 12052
					KitDefinition.method3453(0.8D);
				}

				if (var2 == 3) { // L: 12053
					KitDefinition.method3453(0.7D);
				}

				if (var2 == 4) { // L: 12054
					KitDefinition.method3453(0.6D);
				}
			}

			if (var3 == 3) { // L: 12056
				if (var2 == 0) { // L: 12057
					class1.method11(255);
				}

				if (var2 == 1) { // L: 12058
					class1.method11(192);
				}

				if (var2 == 2) { // L: 12059
					class1.method11(128);
				}

				if (var2 == 3) { // L: 12060
					class1.method11(64);
				}

				if (var2 == 4) { // L: 12061
					class1.method11(0);
				}
			}

			if (var3 == 4) { // L: 12063
				if (var2 == 0) { // L: 12064
					class126.method2824(127);
				}

				if (var2 == 1) { // L: 12065
					class126.method2824(96);
				}

				if (var2 == 2) { // L: 12066
					class126.method2824(64);
				}

				if (var2 == 3) { // L: 12067
					class126.method2824(32);
				}

				if (var2 == 4) { // L: 12068
					class126.method2824(0);
				}
			}

			if (var3 == 5) { // L: 12070
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) {
				Client.chatEffects = var2; // L: 12071
			}

			if (var3 == 9) { // L: 12072
				Client.field524 = var2;
			}

			if (var3 == 10) { // L: 12073
				if (var2 == 0) { // L: 12074
					class127.method2830(127);
				}

				if (var2 == 1) { // L: 12075
					class127.method2830(96);
				}

				if (var2 == 2) { // L: 12076
					class127.method2830(64);
				}

				if (var2 == 3) { // L: 12077
					class127.method2830(32);
				}

				if (var2 == 4) { // L: 12078
					class127.method2830(0);
				}
			}

			if (var3 == 17) { // L: 12080
				Client.followerIndex = var2 & 65535; // L: 12081
			}

			if (var3 == 18) { // L: 12083
				Client.playerAttackOption = (AttackOption)MusicPatchPcmStream.findEnumerated(FriendSystem.method1743(), var2); // L: 12084
				if (Client.playerAttackOption == null) { // L: 12085
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 12087
				if (var2 == -1) { // L: 12088
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12089
				}
			}

			if (var3 == 22) { // L: 12091
				Client.npcAttackOption = (AttackOption)MusicPatchPcmStream.findEnumerated(FriendSystem.method1743(), var2); // L: 12092
				if (Client.npcAttackOption == null) { // L: 12093
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12095
}
