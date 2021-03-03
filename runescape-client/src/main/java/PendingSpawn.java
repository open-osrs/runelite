import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -67559491
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1512914817
	)
	@Export("type")
	int type;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -333030369
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1122963499
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1919980867
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1123556215
	)
	int field944;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1772002075
	)
	int field945;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2057325195
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1376003913
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -251784439
	)
	int field948;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 6874789
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 738564505
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IB)V",
		garbageValue = "-61"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 191
		if (var2) { // L: 192
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 193
		Player var4 = Client.players[var1]; // L: 194
		if (var3 == 0) { // L: 195
			if (var2) { // L: 196
				var4.field652 = false; // L: 197
			} else if (Client.localPlayerIndex == var1) { // L: 200
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (GrandExchangeOfferNameComparator.baseX + var4.pathX[0] >> 13 << 14) + (NetCache.baseY + var4.pathY[0] >> 13); // L: 201
				if (var4.field981 != -1) { // L: 202
					Players.Players_orientations[var1] = var4.field981;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 203
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 204
				Client.players[var1] = null; // L: 205
				if (var0.readBits(1) != 0) { // L: 206
					World.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 209
				var5 = var0.readBits(3); // L: 210
				var6 = var4.pathX[0]; // L: 211
				var7 = var4.pathY[0]; // L: 212
				if (var5 == 0) { // L: 213
					--var6; // L: 214
					--var7; // L: 215
				} else if (var5 == 1) { // L: 217
					--var7;
				} else if (var5 == 2) { // L: 218
					++var6; // L: 219
					--var7; // L: 220
				} else if (var5 == 3) { // L: 222
					--var6;
				} else if (var5 == 4) { // L: 223
					++var6;
				} else if (var5 == 5) { // L: 224
					--var6; // L: 225
					++var7; // L: 226
				} else if (var5 == 6) { // L: 228
					++var7;
				} else if (var5 == 7) { // L: 229
					++var6; // L: 230
					++var7; // L: 231
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 233
					var4.resetPath(var6, var7); // L: 234
					var4.field652 = false; // L: 235
				} else if (var2) { // L: 237
					var4.field652 = true; // L: 238
					var4.tileX = var6; // L: 239
					var4.tileY = var7; // L: 240
				} else {
					var4.field652 = false; // L: 243
					var4.method1327(var6, var7, Players.field1274[var1]); // L: 244
				}

			} else if (var3 == 2) { // L: 248
				var5 = var0.readBits(4); // L: 249
				var6 = var4.pathX[0]; // L: 250
				var7 = var4.pathY[0]; // L: 251
				if (var5 == 0) { // L: 252
					var6 -= 2; // L: 253
					var7 -= 2; // L: 254
				} else if (var5 == 1) { // L: 256
					--var6; // L: 257
					var7 -= 2; // L: 258
				} else if (var5 == 2) { // L: 260
					var7 -= 2;
				} else if (var5 == 3) { // L: 261
					++var6; // L: 262
					var7 -= 2; // L: 263
				} else if (var5 == 4) { // L: 265
					var6 += 2; // L: 266
					var7 -= 2; // L: 267
				} else if (var5 == 5) { // L: 269
					var6 -= 2; // L: 270
					--var7; // L: 271
				} else if (var5 == 6) { // L: 273
					var6 += 2; // L: 274
					--var7; // L: 275
				} else if (var5 == 7) { // L: 277
					var6 -= 2;
				} else if (var5 == 8) { // L: 278
					var6 += 2;
				} else if (var5 == 9) { // L: 279
					var6 -= 2; // L: 280
					++var7; // L: 281
				} else if (var5 == 10) { // L: 283
					var6 += 2; // L: 284
					++var7; // L: 285
				} else if (var5 == 11) { // L: 287
					var6 -= 2; // L: 288
					var7 += 2; // L: 289
				} else if (var5 == 12) { // L: 291
					--var6; // L: 292
					var7 += 2; // L: 293
				} else if (var5 == 13) { // L: 295
					var7 += 2;
				} else if (var5 == 14) { // L: 296
					++var6; // L: 297
					var7 += 2; // L: 298
				} else if (var5 == 15) { // L: 300
					var6 += 2; // L: 301
					var7 += 2; // L: 302
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 304
					if (var2) { // L: 308
						var4.field652 = true; // L: 309
						var4.tileX = var6; // L: 310
						var4.tileY = var7; // L: 311
					} else {
						var4.field652 = false; // L: 314
						var4.method1327(var6, var7, Players.field1274[var1]); // L: 315
					}
				} else {
					var4.resetPath(var6, var7); // L: 305
					var4.field652 = false; // L: 306
				}

			} else {
				var5 = var0.readBits(1); // L: 319
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 320
					var6 = var0.readBits(12); // L: 321
					var7 = var6 >> 10; // L: 322
					var8 = var6 >> 5 & 31; // L: 323
					if (var8 > 15) { // L: 324
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 325
					if (var9 > 15) { // L: 326
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 327
					var11 = var9 + var4.pathY[0]; // L: 328
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 329
						var4.resetPath(var10, var11); // L: 330
						var4.field652 = false; // L: 331
					} else if (var2) { // L: 333
						var4.field652 = true; // L: 334
						var4.tileX = var10; // L: 335
						var4.tileY = var11; // L: 336
					} else {
						var4.field652 = false; // L: 339
						var4.method1327(var10, var11, Players.field1274[var1]); // L: 340
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 342
					if (Client.localPlayerIndex == var1) { // L: 343
						class90.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 346
					var7 = var6 >> 28; // L: 347
					var8 = var6 >> 14 & 16383; // L: 348
					var9 = var6 & 16383; // L: 349
					var10 = (var8 + GrandExchangeOfferNameComparator.baseX + var4.pathX[0] & 16383) - GrandExchangeOfferNameComparator.baseX; // L: 350
					var11 = (var9 + NetCache.baseY + var4.pathY[0] & 16383) - NetCache.baseY; // L: 351
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 352
						var4.resetPath(var10, var11); // L: 353
						var4.field652 = false; // L: 354
					} else if (var2) { // L: 356
						var4.field652 = true; // L: 357
						var4.tileX = var10; // L: 358
						var4.tileY = var11; // L: 359
					} else {
						var4.field652 = false; // L: 362
						var4.method1327(var10, var11, Players.field1274[var1]); // L: 363
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 365
					if (Client.localPlayerIndex == var1) { // L: 366
						class90.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 198 207 246 317 344 367

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1139571995"
	)
	@Export("Messages_getNextChatID")
	static int Messages_getNextChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 75
		if (var1 == null) { // L: 76
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 77 78
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZB)I",
		garbageValue = "54"
	)
	static int method1845(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1107
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1108
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1109
			return 1; // L: 1110
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1112
			if (var3.itemId != -1) { // L: 1113
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1114
			}

			return 1; // L: 1115
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1117
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1118
			return 1; // L: 1119
		} else {
			return 2; // L: 1121
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-369076606"
	)
	static int method1846(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 2894
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 2895
			return 1; // L: 2896
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 2898
			Interpreter.Interpreter_intStackSize -= 3; // L: 2899
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2900
			ArchiveLoader.privateChatMode = UserComparator5.method3604(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 2901
			if (ArchiveLoader.privateChatMode == null) { // L: 2902
				ArchiveLoader.privateChatMode = PrivateChatMode.field3830;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2903
			PacketBufferNode var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher); // L: 2905
			var18.packetBuffer.writeByte(Client.publicChatMode); // L: 2906
			var18.packetBuffer.writeByte(ArchiveLoader.privateChatMode.field3832); // L: 2907
			var18.packetBuffer.writeByte(Client.tradeChatMode); // L: 2908
			Client.packetWriter.addNode(var18); // L: 2909
			return 1; // L: 2910
		} else {
			String var3;
			int var11;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 2912
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2913
				Interpreter.Interpreter_intStackSize -= 2; // L: 2914
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2915
				int var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2916
				PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2314, Client.packetWriter.isaacCipher); // L: 2918
				var13.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var3) + 2); // L: 2919
				var13.packetBuffer.writeStringCp1252NullTerminated(var3); // L: 2920
				var13.packetBuffer.writeByte(var11 - 1); // L: 2921
				var13.packetBuffer.writeByte(var12); // L: 2922
				Client.packetWriter.addNode(var13); // L: 2923
				return 1; // L: 2924
			} else {
				int var10;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 2926
					Interpreter.Interpreter_intStackSize -= 2; // L: 2927
					var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2928
					var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2929
					Message var16 = class89.Messages_getByChannelAndID(var10, var11); // L: 2930
					if (var16 != null) { // L: 2931
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.count; // L: 2932
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.cycle; // L: 2933
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.sender != null ? var16.sender : ""; // L: 2934
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.prefix != null ? var16.prefix : ""; // L: 2935
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.text != null ? var16.text : ""; // L: 2936
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var16.isFromFriend() ? 1 : (var16.isFromIgnored() ? 2 : 0); // L: 2937
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 2940
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2941
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2942
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2943
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2944
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2945
					}

					return 1; // L: 2947
				} else if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 2949
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2950
					Message var14 = NPC.Messages_getMessage(var10); // L: 2951
					if (var14 != null) { // L: 2952
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.type; // L: 2953
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.cycle; // L: 2954
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.sender != null ? var14.sender : ""; // L: 2955
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.prefix != null ? var14.prefix : ""; // L: 2956
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.text != null ? var14.text : ""; // L: 2957
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.isFromFriend() ? 1 : (var14.isFromIgnored() ? 2 : 0); // L: 2958
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 2961
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2962
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2963
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2964
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2965
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2966
					}

					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 2970
					if (ArchiveLoader.privateChatMode == null) { // L: 2971
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveLoader.privateChatMode.field3832; // L: 2972
					}

					return 1; // L: 2973
				} else if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 2975
					var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2976
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2977
					String var15 = var3.toLowerCase(); // L: 2978
					byte var17 = 0; // L: 2979
					if (var15.startsWith("yellow:")) { // L: 2980
						var17 = 0; // L: 2981
						var3 = var3.substring("yellow:".length()); // L: 2982
					} else if (var15.startsWith("red:")) { // L: 2984
						var17 = 1; // L: 2985
						var3 = var3.substring("red:".length()); // L: 2986
					} else if (var15.startsWith("green:")) { // L: 2988
						var17 = 2; // L: 2989
						var3 = var3.substring("green:".length()); // L: 2990
					} else if (var15.startsWith("cyan:")) { // L: 2992
						var17 = 3; // L: 2993
						var3 = var3.substring("cyan:".length()); // L: 2994
					} else if (var15.startsWith("purple:")) { // L: 2996
						var17 = 4; // L: 2997
						var3 = var3.substring("purple:".length()); // L: 2998
					} else if (var15.startsWith("white:")) { // L: 3000
						var17 = 5; // L: 3001
						var3 = var3.substring("white:".length()); // L: 3002
					} else if (var15.startsWith("flash1:")) { // L: 3004
						var17 = 6; // L: 3005
						var3 = var3.substring("flash1:".length()); // L: 3006
					} else if (var15.startsWith("flash2:")) { // L: 3008
						var17 = 7; // L: 3009
						var3 = var3.substring("flash2:".length()); // L: 3010
					} else if (var15.startsWith("flash3:")) { // L: 3012
						var17 = 8; // L: 3013
						var3 = var3.substring("flash3:".length()); // L: 3014
					} else if (var15.startsWith("glow1:")) { // L: 3016
						var17 = 9; // L: 3017
						var3 = var3.substring("glow1:".length()); // L: 3018
					} else if (var15.startsWith("glow2:")) { // L: 3020
						var17 = 10; // L: 3021
						var3 = var3.substring("glow2:".length()); // L: 3022
					} else if (var15.startsWith("glow3:")) { // L: 3024
						var17 = 11; // L: 3025
						var3 = var3.substring("glow3:".length()); // L: 3026
					} else if (Language.Language_EN != NPCComposition.clientLanguage) { // L: 3028
						if (var15.startsWith("yellow:")) { // L: 3029
							var17 = 0; // L: 3030
							var3 = var3.substring("yellow:".length()); // L: 3031
						} else if (var15.startsWith("red:")) { // L: 3033
							var17 = 1; // L: 3034
							var3 = var3.substring("red:".length()); // L: 3035
						} else if (var15.startsWith("green:")) { // L: 3037
							var17 = 2; // L: 3038
							var3 = var3.substring("green:".length()); // L: 3039
						} else if (var15.startsWith("cyan:")) { // L: 3041
							var17 = 3; // L: 3042
							var3 = var3.substring("cyan:".length()); // L: 3043
						} else if (var15.startsWith("purple:")) { // L: 3045
							var17 = 4; // L: 3046
							var3 = var3.substring("purple:".length()); // L: 3047
						} else if (var15.startsWith("white:")) { // L: 3049
							var17 = 5; // L: 3050
							var3 = var3.substring("white:".length()); // L: 3051
						} else if (var15.startsWith("flash1:")) { // L: 3053
							var17 = 6; // L: 3054
							var3 = var3.substring("flash1:".length()); // L: 3055
						} else if (var15.startsWith("flash2:")) { // L: 3057
							var17 = 7; // L: 3058
							var3 = var3.substring("flash2:".length()); // L: 3059
						} else if (var15.startsWith("flash3:")) { // L: 3061
							var17 = 8; // L: 3062
							var3 = var3.substring("flash3:".length()); // L: 3063
						} else if (var15.startsWith("glow1:")) { // L: 3065
							var17 = 9; // L: 3066
							var3 = var3.substring("glow1:".length()); // L: 3067
						} else if (var15.startsWith("glow2:")) { // L: 3069
							var17 = 10; // L: 3070
							var3 = var3.substring("glow2:".length()); // L: 3071
						} else if (var15.startsWith("glow3:")) { // L: 3073
							var17 = 11; // L: 3074
							var3 = var3.substring("glow3:".length()); // L: 3075
						}
					}

					var15 = var3.toLowerCase(); // L: 3078
					byte var7 = 0; // L: 3079
					if (var15.startsWith("wave:")) { // L: 3080
						var7 = 1; // L: 3081
						var3 = var3.substring("wave:".length()); // L: 3082
					} else if (var15.startsWith("wave2:")) { // L: 3084
						var7 = 2; // L: 3085
						var3 = var3.substring("wave2:".length()); // L: 3086
					} else if (var15.startsWith("shake:")) { // L: 3088
						var7 = 3; // L: 3089
						var3 = var3.substring("shake:".length()); // L: 3090
					} else if (var15.startsWith("scroll:")) { // L: 3092
						var7 = 4; // L: 3093
						var3 = var3.substring("scroll:".length()); // L: 3094
					} else if (var15.startsWith("slide:")) { // L: 3096
						var7 = 5; // L: 3097
						var3 = var3.substring("slide:".length()); // L: 3098
					} else if (NPCComposition.clientLanguage != Language.Language_EN) { // L: 3100
						if (var15.startsWith("wave:")) { // L: 3101
							var7 = 1; // L: 3102
							var3 = var3.substring("wave:".length()); // L: 3103
						} else if (var15.startsWith("wave2:")) { // L: 3105
							var7 = 2; // L: 3106
							var3 = var3.substring("wave2:".length()); // L: 3107
						} else if (var15.startsWith("shake:")) { // L: 3109
							var7 = 3; // L: 3110
							var3 = var3.substring("shake:".length()); // L: 3111
						} else if (var15.startsWith("scroll:")) { // L: 3113
							var7 = 4; // L: 3114
							var3 = var3.substring("scroll:".length()); // L: 3115
						} else if (var15.startsWith("slide:")) { // L: 3117
							var7 = 5; // L: 3118
							var3 = var3.substring("slide:".length()); // L: 3119
						}
					}

					PacketBufferNode var8 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher); // L: 3123
					var8.packetBuffer.writeByte(0); // L: 3124
					int var9 = var8.packetBuffer.offset; // L: 3125
					var8.packetBuffer.writeByte(var11); // L: 3126
					var8.packetBuffer.writeByte(var17); // L: 3127
					var8.packetBuffer.writeByte(var7); // L: 3128
					Clock.method3721(var8.packetBuffer, var3); // L: 3129
					var8.packetBuffer.writeLengthByte(var8.packetBuffer.offset - var9); // L: 3130
					Client.packetWriter.addNode(var8); // L: 3131
					return 1; // L: 3132
				} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3134
					Interpreter.Interpreter_stringStackSize -= 2; // L: 3135
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3136
					String var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3137
					PacketBufferNode var5 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher); // L: 3139
					var5.packetBuffer.writeShort(0); // L: 3140
					int var6 = var5.packetBuffer.offset; // L: 3141
					var5.packetBuffer.writeStringCp1252NullTerminated(var3); // L: 3142
					Clock.method3721(var5.packetBuffer, var4); // L: 3143
					var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6); // L: 3144
					Client.packetWriter.addNode(var5); // L: 3145
					return 1; // L: 3146
				} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3148
					if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3155
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3156
						return 1; // L: 3157
					} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3159
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3160
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MilliClock.Messages_getHistorySize(var10); // L: 3161
						return 1; // L: 3162
					} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3164
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3165
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Messages_getNextChatID(var10); // L: 3166
						return 1; // L: 3167
					} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3169
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3170
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.Messages_getLastChatID(var10); // L: 3171
						return 1; // L: 3172
					} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3174
						var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3175
						WorldMapSection0.doCheat(var3); // L: 3176
						return 1; // L: 3177
					} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3179
						Client.field882 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3180
						return 1; // L: 3181
					} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3183
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field882; // L: 3184
						return 1; // L: 3185
					} else if (var0 == ScriptOpcodes.DEBUGMES) { // L: 3187
						var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3188
						System.out.println(var3); // L: 3189
						return 1; // L: 3190
					} else {
						return 2; // L: 3192
					}
				} else {
					if (UserComparator9.localPlayer != null && UserComparator9.localPlayer.username != null) { // L: 3150
						var3 = UserComparator9.localPlayer.username.getName();
					} else {
						var3 = ""; // L: 3151
					}

					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 3152
					return 1; // L: 3153
				}
			}
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1774948144"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 11557
		short[] var2 = new short[16]; // L: 11558
		int var3 = 0; // L: 11559

		for (int var4 = 0; var4 < class52.ItemDefinition_fileCount; ++var4) { // L: 11560
			ItemComposition var9 = class281.ItemDefinition_get(var4); // L: 11561
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 11562 11563 11564
				if (var3 >= 250) { // L: 11565
					NPC.foundItemIdCount = -1; // L: 11566
					class52.foundItemIds = null; // L: 11567
					return; // L: 11568
				}

				if (var3 >= var2.length) { // L: 11570
					short[] var6 = new short[var2.length * 2]; // L: 11571

					for (int var7 = 0; var7 < var3; ++var7) { // L: 11572
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 11573
				}

				var2[var3++] = (short)var4; // L: 11575
			}
		}

		class52.foundItemIds = var2; // L: 11577
		WorldMapLabelSize.foundItemIndex = 0; // L: 11578
		NPC.foundItemIdCount = var3; // L: 11579
		String[] var8 = new String[NPC.foundItemIdCount]; // L: 11580

		for (int var5 = 0; var5 < NPC.foundItemIdCount; ++var5) { // L: 11581
			var8[var5] = class281.ItemDefinition_get(var2[var5]).name;
		}

		HealthBarUpdate.method1873(var8, class52.foundItemIds); // L: 11582
	} // L: 11583
}
