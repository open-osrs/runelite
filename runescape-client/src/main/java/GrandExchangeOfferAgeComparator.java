import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("d")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ly;Ly;B)I",
		garbageValue = "-94"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "65677327"
	)
	static final void method241(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 126
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		DevicePcmPlayerProvider.addGameMessage(30, "", var1); // L: 128
	} // L: 130

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1203523043"
	)
	public static void method242() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 192
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 193
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 194
	} // L: 195

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-695150363"
	)
	static int method240(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3273
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WallDecoration.loadWorlds() ? 1 : 0; // L: 3274
			return 1; // L: 3275
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3277
				var9 = ModelData0.worldListStart(); // L: 3278
				if (var9 != null) { // L: 3279
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.id; // L: 3280
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.properties; // L: 3281
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var9.activity; // L: 3282
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.location; // L: 3283
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.population; // L: 3284
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var9.host; // L: 3285
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3288
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3289
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3290
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3291
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3292
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3293
				}

				return 1; // L: 3295
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3297
				var9 = FileSystem.getNextWorldListWorld(); // L: 3298
				if (var9 != null) { // L: 3299
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.id; // L: 3300
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.properties; // L: 3301
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var9.activity; // L: 3302
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.location; // L: 3303
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9.population; // L: 3304
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var9.host; // L: 3305
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3308
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3309
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3310
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3311
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3312
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3313
				}

				return 1; // L: 3315
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3317
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3318
					var7 = null; // L: 3319

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3320
						if (var3 == DefaultsGroup.World_worlds[var8].id) { // L: 3321
							var7 = DefaultsGroup.World_worlds[var8]; // L: 3322
							break;
						}
					}

					if (var7 != null) { // L: 3326
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.id; // L: 3327
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.properties; // L: 3328
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var7.activity; // L: 3329
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.location; // L: 3330
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.population; // L: 3331
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var7.host; // L: 3332
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3335
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3336
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3337
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3338
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3339
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3340
					}

					return 1; // L: 3342
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3344
					MilliClock.Interpreter_intStackSize -= 4; // L: 3345
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3346
					boolean var10 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1] == 1; // L: 3347
					var8 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 3348
					boolean var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3] == 1; // L: 3349
					World.sortWorldList(var3, var10, var8, var6); // L: 3350
					return 1; // L: 3351
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) { // L: 3353
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3374
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 3375
						return 1; // L: 3376
					} else {
						int var4;
						ParamDefinition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3378
							MilliClock.Interpreter_intStackSize -= 2; // L: 3379
							var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3380
							var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 3381
							var5 = TileItem.getParamDefinition(var4); // L: 3382
							if (var5.isString()) { // L: 3383
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = Clock.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3384
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Clock.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3387
							}

							return 1; // L: 3389
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3391
							MilliClock.Interpreter_intStackSize -= 2; // L: 3392
							var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3393
							var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 3394
							var5 = TileItem.getParamDefinition(var4); // L: 3395
							if (var5.isString()) { // L: 3396
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ScriptEvent.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3397
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ScriptEvent.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3400
							}

							return 1; // L: 3402
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3404
							MilliClock.Interpreter_intStackSize -= 2; // L: 3405
							var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3406
							var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 3407
							var5 = TileItem.getParamDefinition(var4); // L: 3408
							if (var5.isString()) { // L: 3409
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3410
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3413
							}

							return 1; // L: 3415
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3417
							MilliClock.Interpreter_intStackSize -= 2; // L: 3418
							var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3419
							var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 3420
							var5 = TileItem.getParamDefinition(var4); // L: 3421
							if (var5.isString()) { // L: 3422
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ClientPacket.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3423
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ClientPacket.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3426
							}

							return 1; // L: 3428
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3430
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3431
							return 1; // L: 3432
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3434
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3435
							return 1; // L: 3436
						} else if (var0 == 6520) { // L: 3438
							return 1; // L: 3439
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3441
							return 1; // L: 3442
						} else if (var0 == 6522) { // L: 3444
							--UrlRequester.Interpreter_stringStackSize; // L: 3445
							--MilliClock.Interpreter_intStackSize; // L: 3446
							return 1; // L: 3447
						} else if (var0 == 6523) { // L: 3449
							--UrlRequester.Interpreter_stringStackSize; // L: 3450
							--MilliClock.Interpreter_intStackSize; // L: 3451
							return 1; // L: 3452
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) { // L: 3454
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3455
							return 1; // L: 3456
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) { // L: 3458
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1; // L: 3459
							return 1; // L: 3460
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) { // L: 3462
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1; // L: 3463
							return 1; // L: 3464
						} else {
							return 2; // L: 3466
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 3354
					if (var3 >= 0 && var3 < World.World_count) { // L: 3355
						var7 = DefaultsGroup.World_worlds[var3]; // L: 3356
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.id; // L: 3357
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.properties; // L: 3358
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var7.activity; // L: 3359
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.location; // L: 3360
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.population; // L: 3361
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var7.host; // L: 3362
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3365
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3366
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3367
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3368
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3369
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 3370
					}

					return 1; // L: 3372
				}
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "487407566"
	)
	static final void method243(boolean var0) {
		FriendSystem.playPcmPlayers(); // L: 5656
		++Client.packetWriter.pendingWrites; // L: 5657
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5658
			Client.packetWriter.pendingWrites = 0; // L: 5659
			if (!Client.field730 && Client.packetWriter.getSocket() != null) { // L: 5660
				PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2247, Client.packetWriter.isaacCipher); // L: 5662
				Client.packetWriter.addNode(var1); // L: 5663

				try {
					Client.packetWriter.flush(); // L: 5665
				} catch (IOException var3) { // L: 5667
					Client.field730 = true; // L: 5668
				}
			}

		}
	} // L: 5671
}
