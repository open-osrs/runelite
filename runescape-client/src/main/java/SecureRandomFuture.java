import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("h")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("c")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1623185181"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1344768115"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Low;",
		garbageValue = "42192399"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 353
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 354
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42); // L: 355
		SpritePixels var8;
		if (!var5) { // L: 357
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 358
			if (var8 != null) { // L: 359
				return var8;
			}
		}

		ItemComposition var9 = Strings.ItemDefinition_get(var0); // L: 361
		if (var1 > 1 && var9.countobj != null) { // L: 362
			int var10 = -1; // L: 363

			for (int var11 = 0; var11 < 10; ++var11) { // L: 364
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 365
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 367
				var9 = Strings.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 369
		if (var19 == null) { // L: 370
			return null;
		} else {
			SpritePixels var20 = null; // L: 371
			if (var9.noteTemplate != -1) { // L: 372
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 373
				if (var20 == null) { // L: 374
					return null;
				}
			} else if (var9.notedId != -1) { // L: 376
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 377
				if (var20 == null) { // L: 378
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 380
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 381
				if (var20 == null) { // L: 382
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 384
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 385
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 386
			int[] var15 = new int[4]; // L: 387
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 388
			var8 = new SpritePixels(36, 32); // L: 389
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 390
			Rasterizer2D.Rasterizer2D_clear(); // L: 391
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 392
			Rasterizer3D.method3818(16, 16); // L: 393
			Rasterizer3D.field2254 = false; // L: 394
			if (var9.placeholderTemplate != -1) { // L: 395
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 396
			if (var5) { // L: 397
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) { // L: 398
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 399
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 400
			var19.calculateBoundsCylinder(); // L: 401
			var19.method4136(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 402
			if (var9.notedId != -1) { // L: 403
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 404
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 405
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 406
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 407
			if (var9.noteTemplate != -1) { // L: 408
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 409
				StudioGame.ItemDefinition_fontPlain11.draw(class261.method4790(var1), 0, 9, 16776960, 1); // L: 410
			}

			if (!var5) { // L: 412
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 413
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 414
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 415
			Rasterizer3D.field2254 = true; // L: 416
			return var8; // L: 417
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "-112"
	)
	static int method2000(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3206
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3207
			return 1; // L: 3208
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3210
			WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 3211
			Client.publicChatMode = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3212
			AbstractArchive.privateChatMode = EnumComposition.method2727(Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]); // L: 3213
			if (AbstractArchive.privateChatMode == null) { // L: 3214
				AbstractArchive.privateChatMode = PrivateChatMode.field3899;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 3215
			PacketBufferNode var13 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2604, Client.packetWriter.isaacCipher); // L: 3217
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3218
			var13.packetBuffer.writeByte(AbstractArchive.privateChatMode.field3898); // L: 3219
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3220
			Client.packetWriter.addNode(var13); // L: 3221
			return 1; // L: 3222
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3224
				var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3225
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3226
				var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3227
				var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3228
				var6 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2599, Client.packetWriter.isaacCipher); // L: 3230
				var6.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3231
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3232
				var6.packetBuffer.writeByte(var7 - 1); // L: 3233
				var6.packetBuffer.writeByte(var9); // L: 3234
				Client.packetWriter.addNode(var6); // L: 3235
				return 1; // L: 3236
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3238
					WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3239
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3240
					var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3241
					var5 = class124.Messages_getByChannelAndID(var3, var7); // L: 3242
					if (var5 != null) { // L: 3243
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.count; // L: 3244
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.cycle; // L: 3245
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3246
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3247
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3248
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3249
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3252
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3253
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3254
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3255
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3256
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3257
					}

					return 1; // L: 3259
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3261
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3262
						var4 = Fonts.Messages_getMessage(var3); // L: 3263
						if (var4 != null) { // L: 3264
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.type; // L: 3265
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.cycle; // L: 3266
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3267
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3268
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3269
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3270
						} else {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3273
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3274
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3275
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3276
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3277
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3278
						}

						return 1; // L: 3280
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3282
						if (AbstractArchive.privateChatMode == null) { // L: 3283
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = AbstractArchive.privateChatMode.field3898; // L: 3284
						}

						return 1; // L: 3285
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3287
							var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3288
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3289
							var12 = UserComparator10.method2486(var7, var8, class7.clientLanguage, -1); // L: 3290
							Client.packetWriter.addNode(var12); // L: 3291
							return 1; // L: 3292
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3294
							class13.Interpreter_stringStackSize -= 2; // L: 3295
							var8 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize]; // L: 3296
							String var11 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1]; // L: 3297
							var12 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2607, Client.packetWriter.isaacCipher); // L: 3299
							var12.packetBuffer.writeShort(0); // L: 3300
							int var10 = var12.packetBuffer.offset; // L: 3301
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3302
							Occluder.method4089(var12.packetBuffer, var11); // L: 3303
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3304
							Client.packetWriter.addNode(var12); // L: 3305
							return 1; // L: 3306
						} else if (var0 == 5010) { // L: 3308
							var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3309
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3310
							var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3311
							var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3312
							var6 = UserComparator10.method2486(var7, var8, class7.clientLanguage, var9); // L: 3313
							Client.packetWriter.addNode(var6); // L: 3314
							return 1; // L: 3315
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3317
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3324
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3325
								return 1; // L: 3326
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3328
								var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3329
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class10.Messages_getHistorySize(var3); // L: 3330
								return 1; // L: 3331
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3333
								var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3334
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = NetCache.Messages_getLastChatID(var3); // L: 3335
								return 1; // L: 3336
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3338
								var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3339
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class105.method2274(var3); // L: 3340
								return 1; // L: 3341
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3343
								var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3344
								class4.doCheat(var8); // L: 3345
								return 1; // L: 3346
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3348
								Client.field843 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3349
								return 1; // L: 3350
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3352
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Client.field843; // L: 3353
								return 1; // L: 3354
							} else if (var0 == ScriptOpcodes.DEBUGMES) { // L: 3356
								var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3357
								System.out.println(var8); // L: 3358
								return 1; // L: 3359
							} else if (var0 == 5024) { // L: 3361
								--WorldMapCacheName.Interpreter_intStackSize; // L: 3362
								return 1; // L: 3363
							} else if (var0 == 5025) { // L: 3365
								++WorldMapCacheName.Interpreter_intStackSize; // L: 3366
								return 1; // L: 3367
							} else if (var0 == 5030) { // L: 3369
								WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3370
								var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3371
								var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3372
								var5 = class124.Messages_getByChannelAndID(var3, var7); // L: 3373
								if (var5 != null) { // L: 3374
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.count; // L: 3375
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.cycle; // L: 3376
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3377
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3378
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3379
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3380
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3381
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3382
								} else {
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3385
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3386
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3387
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3388
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3389
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3390
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3391
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3392
								}

								return 1; // L: 3394
							} else if (var0 == 5031) { // L: 3396
								var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3397
								var4 = Fonts.Messages_getMessage(var3); // L: 3398
								if (var4 != null) { // L: 3399
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.type; // L: 3400
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.cycle; // L: 3401
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3402
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3403
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3404
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3405
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3406
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3407
								} else {
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3410
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3411
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3412
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3413
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3414
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3415
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3416
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3417
								}

								return 1; // L: 3419
							} else {
								return 2; // L: 3421
							}
						} else {
							if (class35.localPlayer != null && class35.localPlayer.username != null) { // L: 3319
								var8 = class35.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3320
							}

							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8; // L: 3321
							return 1; // L: 3322
						}
					}
				}
			}
		}
	}
}
