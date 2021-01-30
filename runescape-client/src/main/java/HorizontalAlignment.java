import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jt")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	field3490(2, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	field3491(0, 2);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1422973227
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2073239653
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 19
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZB)I",
		garbageValue = "4"
	)
	static int method4729(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3339
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = GrandExchangeEvent.loadWorlds() ? 1 : 0; // L: 3340
			return 1; // L: 3341
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3343
				var9 = class236.worldListStart(); // L: 3344
				if (var9 != null) { // L: 3345
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.id; // L: 3346
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.properties; // L: 3347
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3348
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.location; // L: 3349
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.population; // L: 3350
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3351
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3354
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3355
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3356
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3357
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3358
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3359
				}

				return 1; // L: 3361
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3363
				var9 = GrandExchangeEvents.getNextWorldListWorld(); // L: 3364
				if (var9 != null) { // L: 3365
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.id; // L: 3366
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.properties; // L: 3367
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3368
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.location; // L: 3369
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.population; // L: 3370
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3371
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3374
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3375
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3376
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3377
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3378
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3379
				}

				return 1; // L: 3381
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3383
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3384
					var7 = null; // L: 3385

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3386
						if (var3 == World.World_worlds[var8].id) { // L: 3387
							var7 = World.World_worlds[var8]; // L: 3388
							break;
						}
					}

					if (var7 != null) { // L: 3392
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.id; // L: 3393
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.properties; // L: 3394
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3395
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.location; // L: 3396
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.population; // L: 3397
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3398
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3401
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3402
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3403
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3404
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3405
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3406
					}

					return 1; // L: 3408
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3410
					VarcInt.Interpreter_intStackSize -= 4; // L: 3411
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3412
					boolean var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1; // L: 3413
					var8 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 3414
					boolean var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3] == 1; // L: 3415
					TaskHandler.sortWorldList(var3, var10, var8, var6); // L: 3416
					return 1; // L: 3417
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) { // L: 3419
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3440
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 3441
						return 1; // L: 3442
					} else {
						int var4;
						ParamDefinition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3444
							VarcInt.Interpreter_intStackSize -= 2; // L: 3445
							var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3446
							var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 3447
							var5 = ChatChannel.getParamDefinition(var4); // L: 3448
							if (var5.isString()) { // L: 3449
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapIcon_0.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3450
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapIcon_0.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3453
							}

							return 1; // L: 3455
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3457
							VarcInt.Interpreter_intStackSize -= 2; // L: 3458
							var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3459
							var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 3460
							var5 = ChatChannel.getParamDefinition(var4); // L: 3461
							if (var5.isString()) { // L: 3462
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapDecoration.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3463
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapDecoration.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3466
							}

							return 1; // L: 3468
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3470
							VarcInt.Interpreter_intStackSize -= 2; // L: 3471
							var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3472
							var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 3473
							var5 = ChatChannel.getParamDefinition(var4); // L: 3474
							if (var5.isString()) { // L: 3475
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3476
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = SecureRandomCallable.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3479
							}

							return 1; // L: 3481
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3483
							VarcInt.Interpreter_intStackSize -= 2; // L: 3484
							var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 3485
							var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 3486
							var5 = ChatChannel.getParamDefinition(var4); // L: 3487
							if (var5.isString()) { // L: 3488
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractWorldMapIcon.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3489
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3492
							}

							return 1; // L: 3494
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3496
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3497
							return 1; // L: 3498
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3500
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3501
							return 1; // L: 3502
						} else if (var0 == 6520) { // L: 3504
							return 1; // L: 3505
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3507
							return 1; // L: 3508
						} else if (var0 == 6522) { // L: 3510
							--Interpreter.Interpreter_stringStackSize; // L: 3511
							--VarcInt.Interpreter_intStackSize; // L: 3512
							return 1; // L: 3513
						} else if (var0 == 6523) { // L: 3515
							--Interpreter.Interpreter_stringStackSize; // L: 3516
							--VarcInt.Interpreter_intStackSize; // L: 3517
							return 1; // L: 3518
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) { // L: 3520
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3521
							return 1; // L: 3522
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) { // L: 3524
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1; // L: 3525
							return 1; // L: 3526
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) { // L: 3528
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1; // L: 3529
							return 1; // L: 3530
						} else {
							return 2; // L: 3532
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 3420
					if (var3 >= 0 && var3 < World.World_count) { // L: 3421
						var7 = World.World_worlds[var3]; // L: 3422
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.id; // L: 3423
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.properties; // L: 3424
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3425
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.location; // L: 3426
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.population; // L: 3427
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3428
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1; // L: 3431
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3432
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3433
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3434
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 3435
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3436
					}

					return 1; // L: 3438
				}
			}
		}
	}
}
