import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
public class class114 extends class116 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static Bounds field1359;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -3547917971433153133L
	)
	long field1364;
	@ObfuscatedName("w")
	String field1360;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class114(class119 var1) {
		this.this$0 = var1;
		this.field1364 = -1L; // L: 74
		this.field1360 = null; // L: 75
	} // L: 77

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1364 = var1.readLong(); // L: 82
		}

		this.field1360 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2655(this.field1364, this.field1360, 0); // L: 88
	} // L: 89

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-216231156"
	)
	public static String method2545(byte[] var0) {
		return class135.method2795(var0, 0, var0.length); // L: 58
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "64"
	)
	static int method2542(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3317
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3318
			return 1; // L: 3319
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3321
			class14.Interpreter_intStackSize -= 3; // L: 3322
			Client.publicChatMode = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3323
			ApproximateRouteStrategy.privateChatMode = FloorDecoration.method4189(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]); // L: 3324
			if (ApproximateRouteStrategy.privateChatMode == null) { // L: 3325
				ApproximateRouteStrategy.privateChatMode = PrivateChatMode.field4425;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 3326
			PacketBufferNode var13 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2696, Client.packetWriter.isaacCipher); // L: 3328
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3329
			var13.packetBuffer.writeByte(ApproximateRouteStrategy.privateChatMode.field4424); // L: 3330
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3331
			Client.packetWriter.addNode(var13); // L: 3332
			return 1; // L: 3333
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3335
				var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3336
				class14.Interpreter_intStackSize -= 2; // L: 3337
				var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3338
				var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3339
				var6 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher); // L: 3341
				var6.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3342
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3343
				var6.packetBuffer.writeByte(var7 - 1); // L: 3344
				var6.packetBuffer.writeByte(var9); // L: 3345
				Client.packetWriter.addNode(var6); // L: 3346
				return 1; // L: 3347
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3349
					class14.Interpreter_intStackSize -= 2; // L: 3350
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3351
					var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3352
					var5 = class54.Messages_getByChannelAndID(var3, var7); // L: 3353
					if (var5 != null) { // L: 3354
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.count; // L: 3355
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.cycle; // L: 3356
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3357
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3358
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3359
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3360
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3363
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3364
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3365
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3366
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3367
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3368
					}

					return 1; // L: 3370
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3372
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3373
						var4 = class122.Messages_getMessage(var3); // L: 3374
						if (var4 != null) { // L: 3375
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.type; // L: 3376
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.cycle; // L: 3377
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3378
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3379
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3380
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3381
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3384
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3385
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3386
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3387
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3388
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3389
						}

						return 1; // L: 3391
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3393
						if (ApproximateRouteStrategy.privateChatMode == null) { // L: 3394
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.privateChatMode.field4424; // L: 3395
						}

						return 1; // L: 3396
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3398
							var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3399
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3400
							var12 = class383.method6755(var7, var8, MouseHandler.clientLanguage, -1); // L: 3401
							Client.packetWriter.addNode(var12); // L: 3402
							return 1; // L: 3403
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3405
							class295.Interpreter_stringStackSize -= 2; // L: 3406
							var8 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize]; // L: 3407
							String var11 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1]; // L: 3408
							var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2675, Client.packetWriter.isaacCipher); // L: 3410
							var12.packetBuffer.writeShort(0); // L: 3411
							int var10 = var12.packetBuffer.offset; // L: 3412
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3413
							class132.method2769(var12.packetBuffer, var11); // L: 3414
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3415
							Client.packetWriter.addNode(var12); // L: 3416
							return 1; // L: 3417
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3419
							var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3420
							class14.Interpreter_intStackSize -= 2; // L: 3421
							var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3422
							var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3423
							var6 = class383.method6755(var7, var8, MouseHandler.clientLanguage, var9); // L: 3424
							Client.packetWriter.addNode(var6); // L: 3425
							return 1; // L: 3426
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3428
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3435
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3436
								return 1; // L: 3437
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3439
								var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3440
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ObjectSound.Messages_getHistorySize(var3); // L: 3441
								return 1; // L: 3442
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3444
								var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3445
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ClanChannelMember.Messages_getLastChatID(var3); // L: 3446
								return 1; // L: 3447
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3449
								var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3450
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapData_0.method3530(var3); // L: 3451
								return 1; // L: 3452
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3454
								var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3455
								class7.doCheat(var8); // L: 3456
								return 1; // L: 3457
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3459
								Client.field692 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3460
								return 1; // L: 3461
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3463
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = Client.field692; // L: 3464
								return 1; // L: 3465
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3467
								var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 3468
								System.out.println(var8); // L: 3469
								return 1; // L: 3470
							} else if (var0 == 5024) { // L: 3472
								--class14.Interpreter_intStackSize; // L: 3473
								return 1; // L: 3474
							} else if (var0 == 5025) { // L: 3476
								++class14.Interpreter_intStackSize; // L: 3477
								return 1; // L: 3478
							} else if (var0 == 5030) { // L: 3480
								class14.Interpreter_intStackSize -= 2; // L: 3481
								var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3482
								var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3483
								var5 = class54.Messages_getByChannelAndID(var3, var7); // L: 3484
								if (var5 != null) { // L: 3485
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.count; // L: 3486
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.cycle; // L: 3487
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3488
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3489
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3490
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3491
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3492
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3493
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3496
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3497
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3498
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3499
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3500
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3501
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3502
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3503
								}

								return 1; // L: 3505
							} else if (var0 == 5031) { // L: 3507
								var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3508
								var4 = class122.Messages_getMessage(var3); // L: 3509
								if (var4 != null) { // L: 3510
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.type; // L: 3511
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.cycle; // L: 3512
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3513
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3514
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3515
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3516
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3517
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3518
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3521
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3522
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3523
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3524
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3525
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3526
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3527
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3528
								}

								return 1; // L: 3530
							} else {
								return 2; // L: 3532
							}
						} else {
							if (HealthBarDefinition.localPlayer != null && HealthBarDefinition.localPlayer.username != null) { // L: 3430
								var8 = HealthBarDefinition.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3431
							}

							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var8; // L: 3432
							return 1; // L: 3433
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-929518083"
	)
	static final void method2538() {
		Client.field539 = 0; // L: 5600
		int var0 = (HealthBarDefinition.localPlayer.x >> 7) + class19.baseX; // L: 5601
		int var1 = (HealthBarDefinition.localPlayer.y >> 7) + DefaultsGroup.baseY; // L: 5602
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5603
			Client.field539 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5604
			Client.field539 = 1;
		}

		if (Client.field539 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5605
			Client.field539 = 0;
		}

	} // L: 5606

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ljf;III)V",
		garbageValue = "226743151"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10471
			EnumComposition.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10472
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10475
			var3 = class20.Widget_getSpellActionName(var0); // L: 10476
			if (var3 != null) { // L: 10477
				EnumComposition.insertMenuItemNoShift(var3, MouseHandler.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10478
			}
		}

		if (var0.buttonType == 3) { // L: 10482
			EnumComposition.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10483
		}

		if (var0.buttonType == 4) { // L: 10486
			EnumComposition.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10487
		}

		if (var0.buttonType == 5) { // L: 10490
			EnumComposition.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10491
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10494
			EnumComposition.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10495
		}

		int var4;
		int var13;
		if (var0.type == 2) { // L: 10498
			var13 = 0; // L: 10499

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10500
				for (int var15 = 0; var15 < var0.width; ++var15) { // L: 10501
					int var6 = (var0.paddingX + 32) * var15; // L: 10502
					int var7 = (var0.paddingY + 32) * var4; // L: 10503
					if (var13 < 20) { // L: 10504
						var6 += var0.inventoryXOffsets[var13]; // L: 10505
						var7 += var0.inventoryYOffsets[var13]; // L: 10506
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 10508
						Client.dragItemSlotDestination = var13; // L: 10509
						class274.hoveredItemContainer = var0; // L: 10510
						if (var0.itemIds[var13] > 0) { // L: 10511
							ItemComposition var8 = TaskHandler.ItemDefinition_get(var0.itemIds[var13] - 1); // L: 10512
							if (Client.isItemSelected == 1 && Tiles.method2045(PendingSpawn.getWidgetFlags(var0))) { // L: 10513
								if (var0.id != MouseHandler.selectedItemWidget || var13 != ReflectionCheck.selectedItemSlot) { // L: 10514
									EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id); // L: 10515
								}
							} else if (Client.isSpellSelected && Tiles.method2045(PendingSpawn.getWidgetFlags(var0))) { // L: 10519
								if ((class116.selectedSpellFlags & 16) == 16) { // L: 10520
									EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id); // L: 10521
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10526
								int var10 = -1; // L: 10527
								if (Client.shiftClickDrop && UserComparator7.method2466()) { // L: 10528
									var10 = var8.getShiftClickIndex(); // L: 10529
								}

								int var11;
								if (Tiles.method2045(PendingSpawn.getWidgetFlags(var0))) { // L: 10531
									for (var11 = 4; var11 >= 3; --var11) { // L: 10532
										if (var11 != var10) { // L: 10533
											ObjectComposition.addWidgetItemMenuItem(var0, var8, var13, var11, false); // L: 10534
										}
									}
								}

								if (class111.method2514(PendingSpawn.getWidgetFlags(var0))) { // L: 10537
									EnumComposition.insertMenuItemNoShift("Use", MouseHandler.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id); // L: 10538
								}

								if (Tiles.method2045(PendingSpawn.getWidgetFlags(var0))) { // L: 10541
									for (var11 = 2; var11 >= 0; --var11) { // L: 10542
										if (var10 != var11) { // L: 10543
											ObjectComposition.addWidgetItemMenuItem(var0, var8, var13, var11, false); // L: 10544
										}
									}

									if (var10 >= 0) { // L: 10546
										ObjectComposition.addWidgetItemMenuItem(var0, var8, var13, var10, true); // L: 10547
									}
								}

								var9 = var0.itemActions; // L: 10550
								if (var9 != null) { // L: 10551
									for (var11 = 4; var11 >= 0; --var11) { // L: 10552
										if (var9[var11] != null) { // L: 10553
											byte var12 = 0; // L: 10554
											if (var11 == 0) { // L: 10555
												var12 = 39;
											}

											if (var11 == 1) { // L: 10556
												var12 = 40;
											}

											if (var11 == 2) { // L: 10557
												var12 = 41;
											}

											if (var11 == 3) { // L: 10558
												var12 = 42;
											}

											if (var11 == 4) { // L: 10559
												var12 = 43;
											}

											EnumComposition.insertMenuItemNoShift(var9[var11], MouseHandler.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id); // L: 10560
										}
									}
								}

								EnumComposition.insertMenuItemNoShift("Examine", MouseHandler.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id); // L: 10565
							}
						}
					}

					++var13; // L: 10570
				}
			}
		}

		if (var0.isIf3) { // L: 10574
			if (Client.isSpellSelected) { // L: 10575
				if (class19.method279(PendingSpawn.getWidgetFlags(var0)) && (class116.selectedSpellFlags & 32) == 32) { // L: 10576
					EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10577
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) { // L: 10582
					String var14 = SoundSystem.method785(var0, var13); // L: 10583
					if (var14 != null) { // L: 10584
						EnumComposition.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id); // L: 10585
					}
				}

				var3 = class20.Widget_getSpellActionName(var0); // L: 10589
				if (var3 != null) { // L: 10590
					EnumComposition.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10591
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10594
					String var5 = SoundSystem.method785(var0, var4); // L: 10595
					if (var5 != null) { // L: 10596
						ModelData0.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10597
					}
				}

				if (ClientPacket.method4710(PendingSpawn.getWidgetFlags(var0))) { // L: 10601
					EnumComposition.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10602
				}
			}
		}

	} // L: 10607
}
