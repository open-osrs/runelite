import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("rz")
	static boolean field1528;
	@ObfuscatedName("c")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1118667793
	)
	@Export("world")
	public int world;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "8"
	)
	public static int method2770(int var0, int var1, int var2) {
		int var3 = class125.method2741(var2 - var1 + 1); // L: 37
		var3 <<= var1; // L: 38
		return var0 & ~var3; // L: 39
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-623943743"
	)
	static String method2769() {
		String var0 = ""; // L: 80

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = var0 + var2.sender + ':' + var2.text + '\n') { // L: 81 84 86
			var2 = (Message)var1.next(); // L: 82
		}

		return var0; // L: 87
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "-848604287"
	)
	static int method2772(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1221
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1238
				var7 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1239
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1240
				if (var4 >= 1 && var4 <= 10) { // L: 1241
					class92 var8 = new class92(var4, var7.id, var7.childIndex, var7.itemId); // L: 1244
					Interpreter.field832.add(var8); // L: 1245
					return 1; // L: 1246
				} else {
					throw new RuntimeException(); // L: 1242
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1248
				Interpreter.Interpreter_intStackSize -= 3; // L: 1249
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1250
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1251
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1252
				if (var5 >= 1 && var5 <= 10) { // L: 1253
					class92 var6 = new class92(var5, var3, var4, class130.getWidget(var3).itemId); // L: 1256
					Interpreter.field832.add(var6); // L: 1257
					return 1; // L: 1258
				} else {
					throw new RuntimeException(); // L: 1254
				}
			} else {
				return 2; // L: 1260
			}
		} else if (Interpreter.field849 >= 10) { // L: 1222
			throw new RuntimeException(); // L: 1223
		} else {
			if (var0 >= 2000) { // L: 1226
				var7 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1227
			} else {
				var7 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1229
			}

			if (var7.onResize == null) { // L: 1230
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1231
				var9.widget = var7; // L: 1232
				var9.args = var7.onResize; // L: 1233
				var9.field1041 = Interpreter.field849 + 1; // L: 1234
				Client.scriptEvents.addFirst(var9); // L: 1235
				return 1; // L: 1236
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "2131909524"
	)
	static int method2771(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3321
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3322
			return 1; // L: 3323
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3325
			Interpreter.Interpreter_intStackSize -= 3; // L: 3326
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3327
			class65.privateChatMode = class231.method4764(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3328
			if (class65.privateChatMode == null) { // L: 3329
				class65.privateChatMode = PrivateChatMode.field4632;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3330
			PacketBufferNode var13 = class135.getPacketBufferNode(ClientPacket.field2872, Client.packetWriter.isaacCipher); // L: 3332
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3333
			var13.packetBuffer.writeByte(class65.privateChatMode.field4631); // L: 3334
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3335
			Client.packetWriter.addNode(var13); // L: 3336
			return 1; // L: 3337
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3339
				var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3340
				Interpreter.Interpreter_intStackSize -= 2; // L: 3341
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3342
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3343
				var6 = class135.getPacketBufferNode(ClientPacket.field2877, Client.packetWriter.isaacCipher); // L: 3345
				var6.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3346
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3347
				var6.packetBuffer.writeByte(var7 - 1); // L: 3348
				var6.packetBuffer.writeByte(var9); // L: 3349
				Client.packetWriter.addNode(var6); // L: 3350
				return 1; // L: 3351
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3353
					Interpreter.Interpreter_intStackSize -= 2; // L: 3354
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3355
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3356
					var5 = PcmPlayer.Messages_getByChannelAndID(var3, var7); // L: 3357
					if (var5 != null) { // L: 3358
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 3359
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 3360
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3361
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3362
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3363
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3364
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3367
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3368
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3369
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3370
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3371
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3372
					}

					return 1; // L: 3374
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3376
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3377
						var4 = class405.Messages_getMessage(var3); // L: 3378
						if (var4 != null) { // L: 3379
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 3380
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 3381
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3382
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3383
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3384
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3385
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3388
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3389
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3390
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3391
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3392
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3393
						}

						return 1; // L: 3395
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3397
						if (class65.privateChatMode == null) { // L: 3398
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class65.privateChatMode.field4631; // L: 3399
						}

						return 1; // L: 3400
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3402
							var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3403
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3404
							var12 = class78.method2082(var7, var8, class122.clientLanguage, -1); // L: 3405
							Client.packetWriter.addNode(var12); // L: 3406
							return 1; // L: 3407
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3409
							BufferedNetSocket.Interpreter_stringStackSize -= 2; // L: 3410
							var8 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize]; // L: 3411
							String var11 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1]; // L: 3412
							var12 = class135.getPacketBufferNode(ClientPacket.field2875, Client.packetWriter.isaacCipher); // L: 3414
							var12.packetBuffer.writeShort(0); // L: 3415
							int var10 = var12.packetBuffer.offset; // L: 3416
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3417
							WorldMapRectangle.method4757(var12.packetBuffer, var11); // L: 3418
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3419
							Client.packetWriter.addNode(var12); // L: 3420
							return 1; // L: 3421
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3423
							var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3424
							Interpreter.Interpreter_intStackSize -= 2; // L: 3425
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3426
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3427
							var6 = class78.method2082(var7, var8, class122.clientLanguage, var9); // L: 3428
							Client.packetWriter.addNode(var6); // L: 3429
							return 1; // L: 3430
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3432
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3439
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3440
								return 1; // L: 3441
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3443
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3444
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class7.Messages_getHistorySize(var3); // L: 3445
								return 1; // L: 3446
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3448
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3449
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VertexNormal.Messages_getLastChatID(var3); // L: 3450
								return 1; // L: 3451
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3453
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3454
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class140.method2932(var3); // L: 3455
								return 1; // L: 3456
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3458
								var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3459
								doCheat(var8); // L: 3460
								return 1; // L: 3461
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3463
								Client.field726 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3464
								return 1; // L: 3465
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3467
								Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = Client.field726; // L: 3468
								return 1; // L: 3469
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3471
								var8 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3472
								System.out.println(var8); // L: 3473
								return 1; // L: 3474
							} else if (var0 == 5024) { // L: 3476
								--Interpreter.Interpreter_intStackSize; // L: 3477
								return 1; // L: 3478
							} else if (var0 == 5025) { // L: 3480
								++Interpreter.Interpreter_intStackSize; // L: 3481
								return 1; // L: 3482
							} else if (var0 == 5030) { // L: 3484
								Interpreter.Interpreter_intStackSize -= 2; // L: 3485
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3486
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3487
								var5 = PcmPlayer.Messages_getByChannelAndID(var3, var7); // L: 3488
								if (var5 != null) { // L: 3489
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 3490
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 3491
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3492
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3493
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3494
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3495
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3496
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3497
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3500
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3501
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3502
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3503
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3504
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3505
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3506
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3507
								}

								return 1; // L: 3509
							} else if (var0 == 5031) { // L: 3511
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3512
								var4 = class405.Messages_getMessage(var3); // L: 3513
								if (var4 != null) { // L: 3514
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 3515
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 3516
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3517
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3518
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3519
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3520
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3521
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3522
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3525
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3526
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3527
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3528
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3529
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3530
									Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3531
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3532
								}

								return 1; // L: 3534
							} else {
								return 2; // L: 3536
							}
						} else {
							if (WorldMapSprite.localPlayer != null && WorldMapSprite.localPlayer.username != null) { // L: 3434
								var8 = WorldMapSprite.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3435
							}

							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var8; // L: 3436
							return 1; // L: 3437
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1951640050"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3576
			class424.clientPreferences.roofsHidden = !class424.clientPreferences.roofsHidden; // L: 3577
			GameEngine.savePreferences(); // L: 3578
			if (class424.clientPreferences.roofsHidden) { // L: 3579
				LoginScreenAnimation.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				LoginScreenAnimation.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3580
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3582
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf; // L: 3583
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3584
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3585
			if (var0.equalsIgnoreCase("errortest")) { // L: 3586
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3587
				Huffman.worldMap.showCoord = !Huffman.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3588
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false; // L: 3589
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3590
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3591
				class17.method258();
			}
		}

		PacketBufferNode var1 = class135.getPacketBufferNode(ClientPacket.field2854, Client.packetWriter.isaacCipher); // L: 3594
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3595
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3596
		Client.packetWriter.addNode(var1); // L: 3597
	} // L: 3598
}
