import java.util.Date;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("m")
public class class19 {
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	static IndexedSprite field96;
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = -436115997
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("v")
	Future field95;
	@ObfuscatedName("o")
	String field94;

	class19(Future var1) {
		this.field95 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method298(var1); // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1411610741"
	)
	void method298(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field94 = var1; // L: 19
		if (this.field95 != null) { // L: 20
			this.field95.cancel(true); // L: 21
			this.field95 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1502014240"
	)
	public final String method299() {
		return this.field94; // L: 27
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	public boolean method316() {
		return this.field94 != null || this.field95 == null; // L: 31
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	public final boolean method303() {
		return this.method316() ? true : this.field95.isDone(); // L: 35 36
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ly;",
		garbageValue = "34"
	)
	public final class21 method301() {
		if (this.method316()) { // L: 40
			return new class21(this.field94);
		} else if (!this.method303()) {
			return null;
		} else {
			try {
				return (class21)this.field95.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method298(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfs;",
		garbageValue = "1"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 45
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpq;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1591862796"
	)
	static String method315(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;III)Lmr;",
		garbageValue = "-757685375"
	)
	public static Font method319(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!GrandExchangeEvent.method6045(var0, var2, var3)) { // L: 60
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3); // L: 62
			Font var4;
			if (var5 == null) { // L: 64
				var4 = null; // L: 65
			} else {
				Font var6 = new Font(var5, class451.SpriteBuffer_xOffsets, class451.SpriteBuffer_yOffsets, class451.SpriteBuffer_spriteWidths, class451.SpriteBuffer_spriteHeights, GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette, class460.SpriteBuffer_pixels); // L: 68
				RouteStrategy.method3872(); // L: 69
				var4 = var6; // L: 70
			}

			return var4; // L: 72
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "-1"
	)
	static int method314(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3267
			var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3268
			var9 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3269
			Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3270
			return 1; // L: 3271
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3273
				ChatChannel.Interpreter_stringStackSize -= 2; // L: 3274
				var3 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize]; // L: 3275
				var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1]; // L: 3276
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3277
				return 1; // L: 3278
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3280
				var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3281
				var9 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3282
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3 + JagexCache.intToString(var9, true); // L: 3283
				return 1; // L: 3284
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3286
				var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3287
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3288
				return 1; // L: 3289
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3291
					var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3292
					long var13 = ((long)var10 + 11745L) * 86400000L; // L: 3293
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3294
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3295
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3296
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3297
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3298
					return 1; // L: 3299
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3301
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3309
						var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3310
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3311
						return 1; // L: 3312
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3314
						ChatChannel.Interpreter_stringStackSize -= 2; // L: 3315
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = UserComparator4.method2566(class118.compareStrings(Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1], FriendSystem.clientLanguage)); // L: 3316
						return 1; // L: 3317
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3319
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3320
							class295.Interpreter_intStackSize -= 2; // L: 3321
							var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3322
							var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3323
							var11 = class4.archive13.takeFile(var5, 0); // L: 3324
							var12 = new Font(var11); // L: 3325
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3326
							return 1; // L: 3327
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3329
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3330
							class295.Interpreter_intStackSize -= 2; // L: 3331
							var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3332
							var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3333
							var11 = class4.archive13.takeFile(var5, 0); // L: 3334
							var12 = new Font(var11); // L: 3335
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3336
							return 1; // L: 3337
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3339
							ChatChannel.Interpreter_stringStackSize -= 2; // L: 3340
							var3 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize]; // L: 3341
							var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1]; // L: 3342
							if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) { // L: 3343
								Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4; // L: 3344
							}

							return 1; // L: 3345
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3347
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3348
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3349
							return 1; // L: 3350
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3352
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3353
							var9 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3354
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3355
							return 1; // L: 3356
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3358
							var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3359
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = RouteStrategy.isCharPrintable((char)var10) ? 1 : 0; // L: 3360
							return 1; // L: 3361
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3363
							var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3364
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = NetFileRequest.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3365
							return 1; // L: 3366
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3368
							var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3369
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class345.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3370
							return 1; // L: 3371
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3373
							var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3374
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class117.isDigit((char)var10) ? 1 : 0; // L: 3375
							return 1; // L: 3376
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3378
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3379
							if (var3 != null) { // L: 3380
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3381
							}

							return 1; // L: 3382
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3384
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3385
							class295.Interpreter_intStackSize -= 2; // L: 3386
							var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3387
							var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3388
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3389
							return 1; // L: 3390
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3392
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3393
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

							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3402
							return 1; // L: 3403
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3405
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3406
							var9 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3407
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3408
							return 1; // L: 3409
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3411
							ChatChannel.Interpreter_stringStackSize -= 2; // L: 3412
							var3 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize]; // L: 3413
							var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1]; // L: 3414
							var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3415
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3416
							return 1; // L: 3417
						} else if (var0 == 4122) { // L: 3419
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3420
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3421
							return 1; // L: 3422
						} else {
							return 2; // L: 3424
						}
					}
				} else {
					ChatChannel.Interpreter_stringStackSize -= 2; // L: 3302
					var3 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize]; // L: 3303
					var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1]; // L: 3304
					if (localPlayer.appearance != null && localPlayer.appearance.isFemale) { // L: 3305
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var3; // L: 3306
					}

					return 1; // L: 3307
				}
			}
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-109"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		GameObject.logOut(); // L: 2559
		switch(var0) { // L: 2560
		case 1:
			StudioGame.method5785(); // L: 2563
			break;
		case 2:
			class150.method3089(24); // L: 2569
			GrandExchangeEvent.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2570
		}

	} // L: 2575

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1974520943"
	)
	static final void method307(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class83.guestClanChannel; // L: 11739
		if (var2 != null && var1 >= 0 && var1 < var2.method3056()) { // L: 11740
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 11741
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 11743
				PacketBufferNode var5 = ItemContainer.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher); // L: 11744
				var5.packetBuffer.writeByte(3 + ItemLayer.stringCp1252NullTerminatedByteSize(var4)); // L: 11745
				var5.packetBuffer.writeByte(var0); // L: 11746
				var5.packetBuffer.writeShort(var1); // L: 11747
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 11748
				Client.packetWriter.addNode(var5); // L: 11749
			}
		}
	} // L: 11742 11750

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-246418962"
	)
	static void method318(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 11779
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 11780
				var1.remove(); // L: 11781
			}
		}

	} // L: 11784
}
