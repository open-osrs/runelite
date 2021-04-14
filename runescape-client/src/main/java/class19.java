import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("x")
public class class19 {
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("sz")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	static class11 field154;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1889962401
	)
	public static int field146;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -5318855028300081739L
	)
	long field153;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 5401092564904583073L
	)
	long field147;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	IterableNodeDeque field152;

	@ObfuscatedSignature(
		descriptor = "(Lnu;)V"
	)
	public class19(Buffer var1) {
		this.field147 = -1L; // L: 9
		this.field152 = new IterableNodeDeque(); // L: 10
		this.method291(var1); // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "-82"
	)
	void method291(Buffer var1) {
		this.field153 = var1.readLong(); // L: 22
		this.field147 = var1.readLong(); // L: 23

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 24 25 35
			Object var3;
			if (var2 == 1) { // L: 27
				var3 = new class12(this);
			} else if (var2 == 4) {
				var3 = new class7(this); // L: 28
			} else if (var2 == 3) { // L: 29
				var3 = new class5(this);
			} else if (var2 == 2) { // L: 30
				var3 = new class20(this);
			} else {
				if (var2 != 5) { // L: 31
					throw new RuntimeException(""); // L: 32
				}

				var3 = new class25(this);
			}

			((class16)var3).vmethod356(var1); // L: 33
			this.field152.addFirst((Node)var3); // L: 34
		}

	} // L: 37

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)V",
		garbageValue = "1921642195"
	)
	public void method286(class3 var1) {
		if (var1.key == this.field153 && var1.field29 == this.field147) { // L: 40
			for (class16 var2 = (class16)this.field152.last(); var2 != null; var2 = (class16)this.field152.previous()) { // L: 41
				var2.vmethod352(var1); // L: 42
			}

			++var1.field29; // L: 44
		} else {
			throw new RuntimeException("");
		}
	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;",
		garbageValue = "1093888475"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "1133701143"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		FaceNormal.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "2001653528"
	)
	static final int method297(long var0, String var2) {
		Random var3 = new Random(); // L: 65
		Buffer var4 = new Buffer(128); // L: 66
		Buffer var5 = new Buffer(128); // L: 67
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0}; // L: 68 69 70 71 72
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) { // L: 74
			var4.writeInt(var3.nextInt()); // L: 75
		}

		var4.writeInt(var6[0]); // L: 77
		var4.writeInt(var6[1]); // L: 78
		var4.writeLong(var0); // L: 79
		var4.writeLong(0L); // L: 80

		for (var7 = 0; var7 < 4; ++var7) { // L: 81
			var4.writeInt(var3.nextInt()); // L: 82
		}

		var4.encryptRsa(class80.field965, class80.field964); // L: 84
		var5.writeByte(10); // L: 85

		for (var7 = 0; var7 < 3; ++var7) { // L: 86
			var5.writeInt(var3.nextInt()); // L: 87
		}

		var5.writeLong(var3.nextLong()); // L: 89
		var5.writeLongMedium(var3.nextLong()); // L: 90
		if (Client.randomDatData != null) { // L: 92
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 93
		} else {
			byte[] var18 = Tile.method3356(); // L: 96
			var5.writeBytes(var18, 0, var18.length); // L: 97
		}

		var5.writeLong(var3.nextLong()); // L: 99
		var5.encryptRsa(class80.field965, class80.field964); // L: 100
		var7 = Friend.stringCp1252NullTerminatedByteSize(var2); // L: 101
		if (var7 % 8 != 0) { // L: 102
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 103
		var8.writeStringCp1252NullTerminated(var2); // L: 104
		var8.offset = var7; // L: 105
		var8.xteaEncryptAll(var6); // L: 106
		Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5); // L: 107
		var9.writeByte(2); // L: 108
		var9.writeByte(var4.offset); // L: 109
		var9.writeBytes(var4.array, 0, var4.offset); // L: 110
		var9.writeByte(var5.offset); // L: 111
		var9.writeBytes(var5.array, 0, var5.offset); // L: 112
		var9.writeShort(var8.offset); // L: 113
		var9.writeBytes(var8.array, 0, var8.offset); // L: 114
		byte[] var11 = var9.array; // L: 116
		String var10 = VarcInt.method4940(var11, 0, var11.length); // L: 118
		String var12 = var10; // L: 120

		try {
			URL var13 = new URL(FontName.method6285("services", false) + "m=accountappeal/login.ws"); // L: 122
			URLConnection var14 = var13.openConnection(); // L: 123
			var14.setDoInput(true); // L: 124
			var14.setDoOutput(true); // L: 125
			var14.setConnectTimeout(5000); // L: 126
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream()); // L: 127
			var15.write("data2=" + class239.method4384(var12) + "&dest=" + class239.method4384("passwordchoice.ws")); // L: 128
			var15.flush(); // L: 129
			InputStream var16 = var14.getInputStream(); // L: 130
			var9 = new Buffer(new byte[1000]); // L: 131

			do {
				int var17 = var16.read(var9.array, var9.offset, 1000 - var9.offset); // L: 133
				if (var17 == -1) { // L: 134
					var15.close(); // L: 140
					var16.close(); // L: 141
					String var19 = new String(var9.array); // L: 142
					if (var19.startsWith("OFFLINE")) { // L: 143
						return 4; // L: 144
					} else if (var19.startsWith("WRONG")) { // L: 146
						return 7; // L: 147
					} else if (var19.startsWith("RELOAD")) { // L: 149
						return 3; // L: 150
					} else if (var19.startsWith("Not permitted for social network accounts.")) { // L: 152
						return 6; // L: 153
					} else {
						var9.xteaDecryptAll(var6); // L: 155

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 156
							--var9.offset; // L: 157
						}

						var19 = new String(var9.array, 0, var9.offset); // L: 159
						if (MusicPatchPcmStream.method4150(var19)) { // L: 160
							class302.openURL(var19, true, false); // L: 161
							return 2; // L: 162
						} else {
							return 5; // L: 164
						}
					}
				}

				var9.offset += var17; // L: 135
			} while(var9.offset < 1000); // L: 136

			return 5; // L: 137
		} catch (Throwable var20) { // L: 166
			var20.printStackTrace(); // L: 167
			return 5; // L: 168
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-210463060"
	)
	public static void method284() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 293

			for (int var0 = 0; var0 < JagexCache.idxCount; ++var0) { // L: 294
				PendingSpawn.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 295
			JagexCache.JagexCache_randomDat.close(); // L: 296
		} catch (Exception var2) { // L: 298
		}

	} // L: 299

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method295(int var0) {
		return WorldMapSection1.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 73
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-631164779"
	)
	static int method285(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3156
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3157
			return 1; // L: 3158
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3160
			class16.Interpreter_intStackSize -= 3; // L: 3161
			Client.publicChatMode = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3162
			Canvas.privateChatMode = MidiPcmStream.method3952(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]); // L: 3163
			if (Canvas.privateChatMode == null) { // L: 3164
				Canvas.privateChatMode = PrivateChatMode.field3891;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 3165
			PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher); // L: 3167
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3168
			var13.packetBuffer.writeByte(Canvas.privateChatMode.field3890); // L: 3169
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3170
			Client.packetWriter.addNode(var13); // L: 3171
			return 1; // L: 3172
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3174
				var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3175
				class16.Interpreter_intStackSize -= 2; // L: 3176
				var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3177
				var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3178
				var6 = ObjectComposition.getPacketBufferNode(ClientPacket.field2224, Client.packetWriter.isaacCipher); // L: 3180
				var6.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3181
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3182
				var6.packetBuffer.writeByte(var7 - 1); // L: 3183
				var6.packetBuffer.writeByte(var9); // L: 3184
				Client.packetWriter.addNode(var6); // L: 3185
				return 1; // L: 3186
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3188
					class16.Interpreter_intStackSize -= 2; // L: 3189
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3190
					var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3191
					var5 = UserComparator5.Messages_getByChannelAndID(var3, var7); // L: 3192
					if (var5 != null) { // L: 3193
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.count; // L: 3194
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.cycle; // L: 3195
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3196
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3197
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3198
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3199
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3202
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3203
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3204
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3205
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3206
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3207
					}

					return 1; // L: 3209
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3211
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3212
						var4 = class301.Messages_getMessage(var3); // L: 3213
						if (var4 != null) { // L: 3214
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.type; // L: 3215
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.cycle; // L: 3216
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3217
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3218
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3219
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3220
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3223
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3224
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3225
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3226
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3227
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3228
						}

						return 1; // L: 3230
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3232
						if (Canvas.privateChatMode == null) { // L: 3233
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Canvas.privateChatMode.field3890; // L: 3234
						}

						return 1; // L: 3235
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3237
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3238
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3239
							var12 = class7.method100(var7, var8, class35.clientLanguage, -1); // L: 3240
							Client.packetWriter.addNode(var12); // L: 3241
							return 1; // L: 3242
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3244
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3245
							var8 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3246
							String var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3247
							var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2283, Client.packetWriter.isaacCipher); // L: 3249
							var12.packetBuffer.writeShort(0); // L: 3250
							int var10 = var12.packetBuffer.offset; // L: 3251
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3252
							class2.method34(var12.packetBuffer, var11); // L: 3253
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3254
							Client.packetWriter.addNode(var12); // L: 3255
							return 1; // L: 3256
						} else if (var0 == 5010) { // L: 3258
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3259
							class16.Interpreter_intStackSize -= 2; // L: 3260
							var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3261
							var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3262
							var6 = class7.method100(var7, var8, class35.clientLanguage, var9); // L: 3263
							Client.packetWriter.addNode(var6); // L: 3264
							return 1; // L: 3265
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3267
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3274
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3275
								return 1; // L: 3276
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3278
								var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3279
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = DirectByteArrayCopier.Messages_getHistorySize(var3); // L: 3280
								return 1; // L: 3281
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3283
								var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3284
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ChatChannel.Messages_getLastChatID(var3); // L: 3285
								return 1; // L: 3286
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3288
								var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3289
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class44.method520(var3); // L: 3290
								return 1; // L: 3291
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3293
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3294
								Messages.doCheat(var8); // L: 3295
								return 1; // L: 3296
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3298
								Client.field824 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3299
								return 1; // L: 3300
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3302
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field824; // L: 3303
								return 1; // L: 3304
							} else if (var0 == ScriptOpcodes.DEBUGMES) { // L: 3306
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3307
								System.out.println(var8); // L: 3308
								return 1; // L: 3309
							} else if (var0 == 5024) { // L: 3311
								--class16.Interpreter_intStackSize; // L: 3312
								return 1; // L: 3313
							} else if (var0 == 5025) { // L: 3315
								++class16.Interpreter_intStackSize; // L: 3316
								return 1; // L: 3317
							} else if (var0 == 5030) { // L: 3319
								class16.Interpreter_intStackSize -= 2; // L: 3320
								var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 3321
								var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 3322
								var5 = UserComparator5.Messages_getByChannelAndID(var3, var7); // L: 3323
								if (var5 != null) { // L: 3324
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.count; // L: 3325
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.cycle; // L: 3326
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3327
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3328
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3329
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3330
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3331
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3332
								} else {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3335
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3336
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3337
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3338
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3339
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3340
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3341
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3342
								}

								return 1; // L: 3344
							} else if (var0 == 5031) { // L: 3346
								var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3347
								var4 = class301.Messages_getMessage(var3); // L: 3348
								if (var4 != null) { // L: 3349
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.type; // L: 3350
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.cycle; // L: 3351
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3352
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3353
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3354
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3355
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3356
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3357
								} else {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1; // L: 3360
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3361
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3362
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3363
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3364
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3365
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3366
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 3367
								}

								return 1; // L: 3369
							} else {
								return 2; // L: 3371
							}
						} else {
							if (Varcs.localPlayer != null && Varcs.localPlayer.username != null) { // L: 3269
								var8 = Varcs.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3270
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8; // L: 3271
							return 1; // L: 3272
						}
					}
				}
			}
		}
	}
}
