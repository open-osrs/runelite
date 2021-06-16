import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("a")
public class class25 extends class16 {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1686215047
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1048031623
	)
	int field198;
	@ObfuscatedName("e")
	byte field200;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1621140089
	)
	int field199;
	@ObfuscatedName("y")
	String field197;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class25(class19 var1) {
		this.this$0 = var1;
		this.field198 = -1; // L: 124
	} // L: 129

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		var1.readUnsignedByte(); // L: 132
		this.field198 = var1.readUnsignedShort(); // L: 133
		this.field200 = var1.readByte(); // L: 134
		this.field199 = var1.readUnsignedShort(); // L: 135
		var1.readLong(); // L: 136
		this.field197 = var1.readStringCp1252NullTerminated(); // L: 137
		var1.readUnsignedByte(); // L: 138
	} // L: 139

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field198); // L: 142
		var2.rank = this.field200; // L: 143
		var2.world = this.field199; // L: 144
		var2.name = this.field197; // L: 145
	} // L: 146

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgp;[Lfl;B)V",
		garbageValue = "32"
	)
	static final void method337(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 178
		int var11 = -1; // L: 179

		while (true) {
			int var12 = var10.method6628(); // L: 181
			if (var12 == 0) { // L: 182
				return; // L: 209
			}

			var11 += var12; // L: 183
			int var13 = 0; // L: 184

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 186
				if (var14 == 0) { // L: 187
					break;
				}

				var13 += var14 - 1; // L: 188
				int var15 = var13 & 63; // L: 189
				int var16 = var13 >> 6 & 63; // L: 190
				int var17 = var13 >> 12; // L: 191
				int var18 = var10.readUnsignedByte(); // L: 192
				int var19 = var18 >> 2; // L: 193
				int var20 = var18 & 3; // L: 194
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 195
					ObjectComposition var21 = Tiles.getObjectDefinition(var11); // L: 196
					int var22 = var2 + AbstractWorldMapIcon.method3787(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 197
					int var23 = var3 + FaceNormal.method4253(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 198
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) { // L: 199
						int var24 = var1; // L: 200
						if ((Tiles.Tiles_renderFlags[1][var22][var23] & 2) == 2) { // L: 201
							var24 = var1 - 1;
						}

						CollisionMap var25 = null; // L: 202
						if (var24 >= 0) { // L: 203
							var25 = var9[var24];
						}

						Player.method2258(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25); // L: 204
					}
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-20"
	)
	public static final void method339(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 74
		ViewportMouse.ViewportMouse_y = var1; // L: 75
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 76
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 77
		ViewportMouse.ViewportMouse_false0 = false; // L: 78
	} // L: 79

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Liv;II)V",
		garbageValue = "-709211391"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3035 == null) { // L: 1006
			throw new RuntimeException(); // L: 1007
		} else {
			if (var0.field3104 == null) { // L: 1009
				var0.field3104 = new int[var0.field3035.length]; // L: 1010
			}

			var0.field3104[var1] = Integer.MAX_VALUE; // L: 1012
		}
	} // L: 1013

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1350653396"
	)
	static int method336(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3250
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3251
			return 1; // L: 3252
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3254
			ChatChannel.Interpreter_intStackSize -= 3; // L: 3255
			Client.publicChatMode = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3256
			ClanChannel.privateChatMode = class244.method4812(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]); // L: 3257
			if (ClanChannel.privateChatMode == null) { // L: 3258
				ClanChannel.privateChatMode = PrivateChatMode.field3886;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 3259
			PacketBufferNode var13 = InterfaceParent.getPacketBufferNode(ClientPacket.field2679, Client.packetWriter.isaacCipher); // L: 3261
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3262
			var13.packetBuffer.writeByte(ClanChannel.privateChatMode.field3884); // L: 3263
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3264
			Client.packetWriter.addNode(var13); // L: 3265
			return 1; // L: 3266
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3268
				var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3269
				ChatChannel.Interpreter_intStackSize -= 2; // L: 3270
				var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3271
				var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3272
				var6 = InterfaceParent.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher); // L: 3274
				var6.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3275
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3276
				var6.packetBuffer.writeByte(var7 - 1); // L: 3277
				var6.packetBuffer.writeByte(var9); // L: 3278
				Client.packetWriter.addNode(var6); // L: 3279
				return 1; // L: 3280
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3282
					ChatChannel.Interpreter_intStackSize -= 2; // L: 3283
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3284
					var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3285
					var5 = Client.Messages_getByChannelAndID(var3, var7); // L: 3286
					if (var5 != null) { // L: 3287
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.count; // L: 3288
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.cycle; // L: 3289
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3290
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3291
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3292
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3293
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3296
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3297
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3298
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3299
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3300
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3301
					}

					return 1; // L: 3303
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3305
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3306
						var4 = Client.Messages_getMessage(var3); // L: 3307
						if (var4 != null) { // L: 3308
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.type; // L: 3309
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.cycle; // L: 3310
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3311
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3312
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3313
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3314
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3317
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3318
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3319
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3320
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3321
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3322
						}

						return 1; // L: 3324
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3326
						if (ClanChannel.privateChatMode == null) { // L: 3327
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ClanChannel.privateChatMode.field3884; // L: 3328
						}

						return 1; // L: 3329
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3331
							var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3332
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3333
							var12 = class342.method6068(var7, var8, AbstractArchive.clientLanguage, -1); // L: 3334
							Client.packetWriter.addNode(var12); // L: 3335
							return 1; // L: 3336
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3338
							UserComparator9.Interpreter_stringStackSize -= 2; // L: 3339
							var8 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize]; // L: 3340
							String var11 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1]; // L: 3341
							var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher); // L: 3343
							var12.packetBuffer.writeShort(0); // L: 3344
							int var10 = var12.packetBuffer.offset; // L: 3345
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3346
							ModeWhere.method5292(var12.packetBuffer, var11); // L: 3347
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3348
							Client.packetWriter.addNode(var12); // L: 3349
							return 1; // L: 3350
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3352
							var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3353
							ChatChannel.Interpreter_intStackSize -= 2; // L: 3354
							var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3355
							var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3356
							var6 = class342.method6068(var7, var8, AbstractArchive.clientLanguage, var9); // L: 3357
							Client.packetWriter.addNode(var6); // L: 3358
							return 1; // L: 3359
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3361
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3368
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3369
								return 1; // L: 3370
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3372
								var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3373
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = AbstractArchive.Messages_getHistorySize(var3); // L: 3374
								return 1; // L: 3375
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3377
								var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3378
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class80.Messages_getLastChatID(var3); // L: 3379
								return 1; // L: 3380
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3382
								var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3383
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class22.method306(var3); // L: 3384
								return 1; // L: 3385
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3387
								var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3388
								Canvas.doCheat(var8); // L: 3389
								return 1; // L: 3390
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3392
								Client.field642 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3393
								return 1; // L: 3394
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3396
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = Client.field642; // L: 3397
								return 1; // L: 3398
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3400
								var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3401
								System.out.println(var8); // L: 3402
								return 1; // L: 3403
							} else if (var0 == 5024) { // L: 3405
								--ChatChannel.Interpreter_intStackSize; // L: 3406
								return 1; // L: 3407
							} else if (var0 == 5025) { // L: 3409
								++ChatChannel.Interpreter_intStackSize; // L: 3410
								return 1; // L: 3411
							} else if (var0 == 5030) { // L: 3413
								ChatChannel.Interpreter_intStackSize -= 2; // L: 3414
								var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3415
								var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3416
								var5 = Client.Messages_getByChannelAndID(var3, var7); // L: 3417
								if (var5 != null) { // L: 3418
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.count; // L: 3419
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.cycle; // L: 3420
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3421
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3422
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3423
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3424
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3425
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3426
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3429
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3430
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3431
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3432
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3433
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3434
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3435
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3436
								}

								return 1; // L: 3438
							} else if (var0 == 5031) { // L: 3440
								var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3441
								var4 = Client.Messages_getMessage(var3); // L: 3442
								if (var4 != null) { // L: 3443
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.type; // L: 3444
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.cycle; // L: 3445
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3446
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3447
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3448
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3449
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3450
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3451
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3454
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3455
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3456
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3457
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3458
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3459
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3460
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3461
								}

								return 1; // L: 3463
							} else {
								return 2; // L: 3465
							}
						} else {
							if (class262.localPlayer != null && class262.localPlayer.username != null) { // L: 3363
								var8 = class262.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3364
							}

							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var8; // L: 3365
							return 1; // L: 3366
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1366473716"
	)
	static final void method330(int var0) {
		if (class20.loadInterface(var0)) { // L: 11051
			class246.drawModelComponents(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], -1); // L: 11052
		}
	} // L: 11053
}
