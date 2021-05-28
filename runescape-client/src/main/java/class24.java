import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("q")
public class class24 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("gu")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1944838207
	)
	@Export("menuHeight")
	static int menuHeight;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhl;",
		garbageValue = "603080453"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2780, ServerPacket.field2751, ServerPacket.field2702, ServerPacket.field2703, ServerPacket.field2704, ServerPacket.field2705, ServerPacket.field2706, ServerPacket.field2798, ServerPacket.field2708, ServerPacket.field2785, ServerPacket.field2729, ServerPacket.field2711, ServerPacket.field2748, ServerPacket.field2713, ServerPacket.field2714, ServerPacket.field2760, ServerPacket.field2716, ServerPacket.field2717, ServerPacket.field2746, ServerPacket.field2719, ServerPacket.field2709, ServerPacket.field2721, ServerPacket.field2715, ServerPacket.field2723, ServerPacket.field2724, ServerPacket.field2725, ServerPacket.field2726, ServerPacket.field2775, ServerPacket.field2756, ServerPacket.field2722, ServerPacket.field2764, ServerPacket.field2731, ServerPacket.field2712, ServerPacket.field2795, ServerPacket.field2734, ServerPacket.field2735, ServerPacket.field2700, ServerPacket.field2737, ServerPacket.field2749, ServerPacket.field2739, ServerPacket.field2740, ServerPacket.field2741, ServerPacket.field2742, ServerPacket.field2743, ServerPacket.field2744, ServerPacket.field2745, ServerPacket.field2774, ServerPacket.field2732, ServerPacket.field2773, ServerPacket.field2738, ServerPacket.field2750, ServerPacket.field2747, ServerPacket.field2752, ServerPacket.field2753, ServerPacket.field2754, ServerPacket.field2755, ServerPacket.field2757, ServerPacket.field2789, ServerPacket.field2710, ServerPacket.field2759, ServerPacket.field2793, ServerPacket.field2761, ServerPacket.field2762, ServerPacket.field2763, ServerPacket.field2787, ServerPacket.field2765, ServerPacket.field2784, ServerPacket.field2767, ServerPacket.field2730, ServerPacket.field2769, ServerPacket.field2770, ServerPacket.field2771, ServerPacket.field2772, ServerPacket.field2768, ServerPacket.field2701, ServerPacket.field2718, ServerPacket.field2776, ServerPacket.field2777, ServerPacket.field2778, ServerPacket.field2779, ServerPacket.field2794, ServerPacket.field2781, ServerPacket.field2782, ServerPacket.field2783, ServerPacket.field2727, ServerPacket.field2728, ServerPacket.field2786, ServerPacket.field2707, ServerPacket.field2788, ServerPacket.field2766, ServerPacket.field2790, ServerPacket.field2791, ServerPacket.field2792, ServerPacket.field2720, ServerPacket.field2736}; // L: 104
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-105"
	)
	public static int method260(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 71
			boolean var3 = false; // L: 72
			boolean var4 = false; // L: 73
			int var5 = 0; // L: 74
			int var6 = var0.length(); // L: 75

			for (int var7 = 0; var7 < var6; ++var7) { // L: 76
				char var8 = var0.charAt(var7); // L: 77
				if (var7 == 0) { // L: 78
					if (var8 == '-') { // L: 79
						var3 = true; // L: 80
						continue;
					}

					if (var8 == '+') { // L: 83
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 85
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 86
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 87
						throw new NumberFormatException(); // L: 88
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 89
					throw new NumberFormatException();
				}

				if (var3) { // L: 90
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 91
				if (var9 / var1 != var5) { // L: 92
					throw new NumberFormatException();
				}

				var5 = var9; // L: 93
				var4 = true; // L: 94
			}

			if (!var4) { // L: 96
				throw new NumberFormatException();
			} else {
				return var5; // L: 97
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)[Lop;",
		garbageValue = "-29644"
	)
	static IndexedSprite[] method262() {
		IndexedSprite[] var0 = new IndexedSprite[class396.SpriteBuffer_spriteCount]; // L: 146

		for (int var1 = 0; var1 < class396.SpriteBuffer_spriteCount; ++var1) { // L: 147
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 148
			var2.width = class396.SpriteBuffer_spriteWidth; // L: 149
			var2.height = UserComparator2.SpriteBuffer_spriteHeight; // L: 150
			var2.xOffset = WorldMapDecoration.SpriteBuffer_xOffsets[var1]; // L: 151
			var2.yOffset = Calendar.SpriteBuffer_yOffsets[var1]; // L: 152
			var2.subWidth = class396.SpriteBuffer_spriteWidths[var1]; // L: 153
			var2.subHeight = class302.SpriteBuffer_spriteHeights[var1]; // L: 154
			var2.palette = MilliClock.SpriteBuffer_spritePalette; // L: 155
			var2.pixels = class396.SpriteBuffer_pixels[var1]; // L: 156
		}

		MilliClock.method2587(); // L: 158
		return var0; // L: 159
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-355325275"
	)
	public static void method259() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 404
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 405
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 406
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 407
	} // L: 408

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "5"
	)
	static int method261(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3206
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3207
			return 1; // L: 3208
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3210
			class44.Interpreter_intStackSize -= 3; // L: 3211
			Client.publicChatMode = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3212
			ScriptEvent.privateChatMode = class124.method2498(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]); // L: 3213
			if (ScriptEvent.privateChatMode == null) { // L: 3214
				ScriptEvent.privateChatMode = PrivateChatMode.field3887;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 3215
			PacketBufferNode var13 = class21.getPacketBufferNode(ClientPacket.field2611, Client.packetWriter.isaacCipher); // L: 3217
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3218
			var13.packetBuffer.writeByte(ScriptEvent.privateChatMode.field3890); // L: 3219
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3220
			Client.packetWriter.addNode(var13); // L: 3221
			return 1; // L: 3222
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3224
				var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3225
				class44.Interpreter_intStackSize -= 2; // L: 3226
				var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3227
				var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3228
				var6 = class21.getPacketBufferNode(ClientPacket.field2596, Client.packetWriter.isaacCipher); // L: 3230
				var6.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3231
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3232
				var6.packetBuffer.writeByte(var7 - 1); // L: 3233
				var6.packetBuffer.writeByte(var9); // L: 3234
				Client.packetWriter.addNode(var6); // L: 3235
				return 1; // L: 3236
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3238
					class44.Interpreter_intStackSize -= 2; // L: 3239
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3240
					var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3241
					var5 = ClanChannelMember.Messages_getByChannelAndID(var3, var7); // L: 3242
					if (var5 != null) { // L: 3243
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.count; // L: 3244
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.cycle; // L: 3245
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3246
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3247
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3248
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3249
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3252
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3253
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3254
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3255
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3256
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3257
					}

					return 1; // L: 3259
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3261
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3262
						var4 = class124.Messages_getMessage(var3); // L: 3263
						if (var4 != null) { // L: 3264
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.type; // L: 3265
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.cycle; // L: 3266
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3267
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3268
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3269
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3270
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3273
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3274
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3275
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3276
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3277
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3278
						}

						return 1; // L: 3280
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3282
						if (ScriptEvent.privateChatMode == null) { // L: 3283
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ScriptEvent.privateChatMode.field3890; // L: 3284
						}

						return 1; // L: 3285
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3287
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3288
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3289
							var12 = WorldMapSectionType.method3596(var7, var8, class378.clientLanguage, -1); // L: 3290
							Client.packetWriter.addNode(var12); // L: 3291
							return 1; // L: 3292
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3294
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3295
							var8 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3296
							String var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3297
							var12 = class21.getPacketBufferNode(ClientPacket.field2614, Client.packetWriter.isaacCipher); // L: 3299
							var12.packetBuffer.writeShort(0); // L: 3300
							int var10 = var12.packetBuffer.offset; // L: 3301
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3302
							ParamComposition.method2878(var12.packetBuffer, var11); // L: 3303
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3304
							Client.packetWriter.addNode(var12); // L: 3305
							return 1; // L: 3306
						} else if (var0 == 5010) { // L: 3308
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3309
							class44.Interpreter_intStackSize -= 2; // L: 3310
							var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3311
							var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3312
							var6 = WorldMapSectionType.method3596(var7, var8, class378.clientLanguage, var9); // L: 3313
							Client.packetWriter.addNode(var6); // L: 3314
							return 1; // L: 3315
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3317
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3324
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3325
								return 1; // L: 3326
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3328
								var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3329
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class23.Messages_getHistorySize(var3); // L: 3330
								return 1; // L: 3331
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3333
								var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3334
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class17.Messages_getLastChatID(var3); // L: 3335
								return 1; // L: 3336
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3338
								var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3339
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Timer.method5595(var3); // L: 3340
								return 1; // L: 3341
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3343
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3344
								class302.doCheat(var8); // L: 3345
								return 1; // L: 3346
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3348
								Client.field863 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3349
								return 1; // L: 3350
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3352
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field863; // L: 3353
								return 1; // L: 3354
							} else if (var0 == ScriptOpcodes.DEBUGMES) { // L: 3356
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3357
								System.out.println(var8); // L: 3358
								return 1; // L: 3359
							} else if (var0 == 5024) { // L: 3361
								--class44.Interpreter_intStackSize; // L: 3362
								return 1; // L: 3363
							} else if (var0 == 5025) { // L: 3365
								++class44.Interpreter_intStackSize; // L: 3366
								return 1; // L: 3367
							} else if (var0 == 5030) { // L: 3369
								class44.Interpreter_intStackSize -= 2; // L: 3370
								var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3371
								var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3372
								var5 = ClanChannelMember.Messages_getByChannelAndID(var3, var7); // L: 3373
								if (var5 != null) { // L: 3374
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.count; // L: 3375
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.cycle; // L: 3376
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3377
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3378
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3379
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3380
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3381
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3382
								} else {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3385
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3386
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3387
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3388
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3389
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3390
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3391
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3392
								}

								return 1; // L: 3394
							} else if (var0 == 5031) { // L: 3396
								var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3397
								var4 = class124.Messages_getMessage(var3); // L: 3398
								if (var4 != null) { // L: 3399
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.type; // L: 3400
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.cycle; // L: 3401
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3402
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3403
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3404
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3405
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3406
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3407
								} else {
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3410
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3411
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3412
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3413
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3414
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3415
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3416
									Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3417
								}

								return 1; // L: 3419
							} else {
								return 2; // L: 3421
							}
						} else {
							if (class93.localPlayer != null && class93.localPlayer.username != null) { // L: 3319
								var8 = class93.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3320
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8; // L: 3321
							return 1; // L: 3322
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lio;III)V",
		garbageValue = "-1951037780"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 9806
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 9807
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 9808
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 9809
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 9810
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 9811
		}

		if (var0.yAlignment == 0) { // L: 9812
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 9813
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 9814
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 9815
		} else if (var0.yAlignment == 4) { // L: 9816
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 9817
		}

	} // L: 9818
}
