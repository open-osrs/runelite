import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fq")
public class class167 {
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 2133081727
	)
	static int field1811;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 1655093891
	)
	static int field1813;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "1"
	)
	static int method3269(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2486
			if (var0 == 3702) { // L: 2491
				++IsaacCipher.Interpreter_intStackSize; // L: 2492
				return 1; // L: 2493
			} else {
				return 2; // L: 2495
			}
		} else {
			--IsaacCipher.Interpreter_intStackSize; // L: 2487
			--class13.Interpreter_stringStackSize; // L: 2488
			return 1; // L: 2489
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "553813410"
	)
	static int method3270(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3314
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3315
			return 1; // L: 3316
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3318
			IsaacCipher.Interpreter_intStackSize -= 3; // L: 3319
			Client.publicChatMode = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3320
			Projectile.privateChatMode = WorldMapData_0.method4353(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]); // L: 3321
			if (Projectile.privateChatMode == null) { // L: 3322
				Projectile.privateChatMode = PrivateChatMode.field4596;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 3323
			PacketBufferNode var13 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2855, Client.packetWriter.isaacCipher); // L: 3325
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3326
			var13.packetBuffer.writeByte(Projectile.privateChatMode.field4597); // L: 3327
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3328
			Client.packetWriter.addNode(var13); // L: 3329
			return 1; // L: 3330
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3332
				var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3333
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 3334
				var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3335
				var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3336
				var6 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2851, Client.packetWriter.isaacCipher); // L: 3338
				var6.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3339
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3340
				var6.packetBuffer.writeByte(var7 - 1); // L: 3341
				var6.packetBuffer.writeByte(var9); // L: 3342
				Client.packetWriter.addNode(var6); // L: 3343
				return 1; // L: 3344
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3346
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 3347
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3348
					var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3349
					var5 = ItemComposition.Messages_getByChannelAndID(var3, var7); // L: 3350
					if (var5 != null) { // L: 3351
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.count; // L: 3352
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.cycle; // L: 3353
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3354
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3355
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3356
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3357
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3360
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3361
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3362
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3363
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3364
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3365
					}

					return 1; // L: 3367
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3369
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3370
						var4 = class139.Messages_getMessage(var3); // L: 3371
						if (var4 != null) { // L: 3372
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.type; // L: 3373
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.cycle; // L: 3374
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3375
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3376
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3377
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3378
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3381
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3382
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3383
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3384
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3385
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3386
						}

						return 1; // L: 3388
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3390
						if (Projectile.privateChatMode == null) { // L: 3391
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Projectile.privateChatMode.field4597; // L: 3392
						}

						return 1; // L: 3393
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3395
							var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3396
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3397
							var12 = BufferedSource.method6527(var7, var8, ScriptFrame.clientLanguage, -1); // L: 3398
							Client.packetWriter.addNode(var12); // L: 3399
							return 1; // L: 3400
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3402
							class13.Interpreter_stringStackSize -= 2; // L: 3403
							var8 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize]; // L: 3404
							String var11 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1]; // L: 3405
							var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2849, Client.packetWriter.isaacCipher); // L: 3407
							var12.packetBuffer.writeShort(0); // L: 3408
							int var10 = var12.packetBuffer.offset; // L: 3409
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3410
							class370.method6755(var12.packetBuffer, var11); // L: 3411
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3412
							Client.packetWriter.addNode(var12); // L: 3413
							return 1; // L: 3414
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3416
							var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3417
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 3418
							var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3419
							var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3420
							var6 = BufferedSource.method6527(var7, var8, ScriptFrame.clientLanguage, var9); // L: 3421
							Client.packetWriter.addNode(var6); // L: 3422
							return 1; // L: 3423
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3425
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3432
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3433
								return 1; // L: 3434
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3436
								var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3437
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = PlayerComposition.Messages_getHistorySize(var3); // L: 3438
								return 1; // L: 3439
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3441
								var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3442
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = VertexNormal.Messages_getLastChatID(var3); // L: 3443
								return 1; // L: 3444
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3446
								var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3447
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Actor.method2233(var3); // L: 3448
								return 1; // L: 3449
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3451
								var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3452
								RouteStrategy.doCheat(var8); // L: 3453
								return 1; // L: 3454
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3456
								Client.field645 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3457
								return 1; // L: 3458
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3460
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Client.field645; // L: 3461
								return 1; // L: 3462
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3464
								var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3465
								System.out.println(var8); // L: 3466
								return 1; // L: 3467
							} else if (var0 == 5024) { // L: 3469
								--IsaacCipher.Interpreter_intStackSize; // L: 3470
								return 1; // L: 3471
							} else if (var0 == 5025) { // L: 3473
								++IsaacCipher.Interpreter_intStackSize; // L: 3474
								return 1; // L: 3475
							} else if (var0 == 5030) { // L: 3477
								IsaacCipher.Interpreter_intStackSize -= 2; // L: 3478
								var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3479
								var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3480
								var5 = ItemComposition.Messages_getByChannelAndID(var3, var7); // L: 3481
								if (var5 != null) { // L: 3482
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.count; // L: 3483
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.cycle; // L: 3484
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3485
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3486
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3487
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3488
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3489
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3490
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3493
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3494
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3495
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3496
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3497
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3498
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3499
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3500
								}

								return 1; // L: 3502
							} else if (var0 == 5031) { // L: 3504
								var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3505
								var4 = class139.Messages_getMessage(var3); // L: 3506
								if (var4 != null) { // L: 3507
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.type; // L: 3508
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.cycle; // L: 3509
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3510
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3511
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3512
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3513
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3514
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3515
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3518
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3519
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3520
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3521
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3522
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3523
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3524
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3525
								}

								return 1; // L: 3527
							} else {
								return 2; // L: 3529
							}
						} else {
							if (class340.localPlayer != null && class340.localPlayer.username != null) { // L: 3427
								var8 = class340.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3428
							}

							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8; // L: 3429
							return 1; // L: 3430
						}
					}
				}
			}
		}
	}
}
