import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kv")
public final class class303 {
	@ObfuscatedName("af")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "64684553"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		VarcInt.sortWorlds(Messages.World_worlds, 0, Messages.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-120515195"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 200
		var1.offset = var0.length - 2; // L: 201
		class396.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 202
		class243.SpriteBuffer_xOffsets = new int[class396.SpriteBuffer_spriteCount]; // L: 203
		class396.SpriteBuffer_yOffsets = new int[class396.SpriteBuffer_spriteCount]; // L: 204
		ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = new int[class396.SpriteBuffer_spriteCount]; // L: 205
		class372.SpriteBuffer_spriteHeights = new int[class396.SpriteBuffer_spriteCount]; // L: 206
		class396.SpriteBuffer_pixels = new byte[class396.SpriteBuffer_spriteCount][]; // L: 207
		var1.offset = var0.length - 7 - class396.SpriteBuffer_spriteCount * 8; // L: 208
		class396.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 209
		class396.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 210
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 211

		int var3;
		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 212
			class243.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 213
			class396.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 214
			ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 215
			class372.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class396.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 216
		AccessFile.SpriteBuffer_spritePalette = new int[var2]; // L: 217

		for (var3 = 1; var3 < var2; ++var3) { // L: 218
			AccessFile.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 219
			if (AccessFile.SpriteBuffer_spritePalette[var3] == 0) { // L: 220
				AccessFile.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 222

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) { // L: 223
			int var4 = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[var3]; // L: 224
			int var5 = class372.SpriteBuffer_spriteHeights[var3]; // L: 225
			int var6 = var4 * var5; // L: 226
			byte[] var7 = new byte[var6]; // L: 227
			class396.SpriteBuffer_pixels[var3] = var7; // L: 228
			int var8 = var1.readUnsignedByte(); // L: 229
			int var9;
			if (var8 == 0) { // L: 230
				for (var9 = 0; var9 < var6; ++var9) { // L: 231
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 233
				for (var9 = 0; var9 < var4; ++var9) { // L: 234
					for (int var10 = 0; var10 < var5; ++var10) { // L: 235
						var7[var9 + var10 * var4] = var1.readByte(); // L: 236
					}
				}
			}
		}

	} // L: 241

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-1352766813"
	)
	static int method5379(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2053
			if (GrandExchangeOfferUnitPriceComparator.friendSystem.field920 == 0) { // L: 2054
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -2;
			} else if (GrandExchangeOfferUnitPriceComparator.friendSystem.field920 == 1) { // L: 2055
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.getSize(); // L: 2056
			}

			return 1; // L: 2057
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2060
				if (GrandExchangeOfferUnitPriceComparator.friendSystem.method1744() && var3 >= 0 && var3 < GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.getSize()) { // L: 2061
					Friend var8 = (Friend)GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.get(var3); // L: 2062
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2063
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2064
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2067
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2068
				}

				return 1; // L: 2070
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2073
				if (GrandExchangeOfferUnitPriceComparator.friendSystem.method1744() && var3 >= 0 && var3 < GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.getSize()) { // L: 2074
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((Buddy)GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.get(var3)).world; // L: 2075
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2077
				}

				return 1; // L: 2078
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2081
				if (GrandExchangeOfferUnitPriceComparator.friendSystem.method1744() && var3 >= 0 && var3 < GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.getSize()) { // L: 2082
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((Buddy)GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.get(var3)).rank; // L: 2083
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2085
				}

				return 1; // L: 2086
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2089
					int var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2090
					ParamComposition.method2825(var5, var6); // L: 2091
					return 1; // L: 2092
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2095
					GrandExchangeOfferUnitPriceComparator.friendSystem.addFriend(var5); // L: 2096
					return 1; // L: 2097
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2100
					GrandExchangeOfferUnitPriceComparator.friendSystem.removeFriend(var5); // L: 2101
					return 1; // L: 2102
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2105
					GrandExchangeOfferUnitPriceComparator.friendSystem.addIgnore(var5); // L: 2106
					return 1; // L: 2107
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2110
					GrandExchangeOfferUnitPriceComparator.friendSystem.removeIgnore(var5); // L: 2111
					return 1; // L: 2112
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2115
					var5 = Canvas.method468(var5); // L: 2116
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.friendSystem.isFriended(new Username(var5, ModeWhere.loginType), false) ? 1 : 0; // L: 2117
					return 1; // L: 2118
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class25.clanChat != null) { // L: 2121
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class25.clanChat.name; // L: 2122
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2124
					}

					return 1; // L: 2125
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class25.clanChat != null) { // L: 2128
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class25.clanChat.getSize(); // L: 2129
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2131
					}

					return 1; // L: 2132
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2135
					if (class25.clanChat != null && var3 < class25.clanChat.getSize()) { // L: 2136
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class25.clanChat.get(var3).getUsername().getName(); // L: 2137
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2139
					}

					return 1; // L: 2140
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2143
					if (class25.clanChat != null && var3 < class25.clanChat.getSize()) { // L: 2144
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((Buddy)class25.clanChat.get(var3)).getWorld(); // L: 2145
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2147
					}

					return 1; // L: 2148
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2151
					if (class25.clanChat != null && var3 < class25.clanChat.getSize()) { // L: 2152
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((Buddy)class25.clanChat.get(var3)).rank; // L: 2153
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2155
					}

					return 1; // L: 2156
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class25.clanChat != null ? class25.clanChat.minKick : 0; // L: 2159
					return 1; // L: 2160
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2163
					class280.clanKickUser(var5); // L: 2164
					return 1; // L: 2165
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class25.clanChat != null ? class25.clanChat.rank * 1163714437 * 504381773 : 0; // L: 2168
					return 1; // L: 2169
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2172
					Tiles.Clan_joinChat(var5); // L: 2173
					return 1; // L: 2174
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					AbstractSocket.Clan_leaveChat(); // L: 2177
					return 1; // L: 2178
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!GrandExchangeOfferUnitPriceComparator.friendSystem.method1744()) { // L: 2181
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.getSize(); // L: 2182
					}

					return 1; // L: 2183
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2186
					if (GrandExchangeOfferUnitPriceComparator.friendSystem.method1744() && var3 >= 0 && var3 < GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.getSize()) { // L: 2187
						Ignored var4 = (Ignored)GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.get(var3); // L: 2188
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2189
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2190
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2193
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2194
					}

					return 1; // L: 2196
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 2199
					var5 = Canvas.method468(var5); // L: 2200
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var5, ModeWhere.loginType)) ? 1 : 0; // L: 2201
					return 1; // L: 2202
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2205
					if (class25.clanChat != null && var3 < class25.clanChat.getSize() && class25.clanChat.get(var3).getUsername().equals(class35.localPlayer.username)) { // L: 2206
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 2207
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2209
					}

					return 1; // L: 2210
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class25.clanChat != null && class25.clanChat.owner != null) { // L: 2213
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class25.clanChat.owner; // L: 2214
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 2216
					}

					return 1; // L: 2217
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2220
					if (class25.clanChat != null && var3 < class25.clanChat.getSize() && ((ClanMate)class25.clanChat.get(var3)).isFriend()) { // L: 2221
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 2222
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2224
					}

					return 1; // L: 2225
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.removeComparator(); // L: 2236
						return 1; // L: 2237
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2240
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2241
							return 1; // L: 2242
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2245
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2246
							return 1; // L: 2247
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2250
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2251
							return 1; // L: 2252
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2255
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2256
							return 1; // L: 2257
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2260
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2261
							return 1; // L: 2262
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2265
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2266
							return 1; // L: 2267
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2270
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2271
							return 1; // L: 2272
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2275
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2276
							return 1; // L: 2277
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2280
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2281
							return 1; // L: 2282
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2285
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2286
							return 1; // L: 2287
						} else if (var0 == 3639) {
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.sort(); // L: 2290
							return 1; // L: 2291
						} else if (var0 == 3640) {
							GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.removeComparator(); // L: 2294
							return 1; // L: 2295
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2298
							GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2299
							return 1; // L: 2300
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2303
							GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2304
							return 1; // L: 2305
						} else if (var0 == 3643) {
							GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.sort(); // L: 2308
							return 1; // L: 2309
						} else if (var0 == 3644) {
							if (class25.clanChat != null) { // L: 2312
								class25.clanChat.removeComparator(); // L: 2313
							}

							return 1; // L: 2315
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2318
							if (class25.clanChat != null) { // L: 2319
								class25.clanChat.addComparator(new UserComparator1(var7)); // L: 2320
							}

							return 1; // L: 2322
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2325
							if (class25.clanChat != null) { // L: 2326
								class25.clanChat.addComparator(new UserComparator2(var7)); // L: 2327
							}

							return 1; // L: 2329
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2332
							if (class25.clanChat != null) { // L: 2333
								class25.clanChat.addComparator(new UserComparator3(var7)); // L: 2334
							}

							return 1; // L: 2336
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2339
							if (class25.clanChat != null) { // L: 2340
								class25.clanChat.addComparator(new UserComparator4(var7)); // L: 2341
							}

							return 1; // L: 2343
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2346
							if (class25.clanChat != null) { // L: 2347
								class25.clanChat.addComparator(new UserComparator5(var7)); // L: 2348
							}

							return 1; // L: 2350
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2353
							if (class25.clanChat != null) { // L: 2354
								class25.clanChat.addComparator(new UserComparator6(var7)); // L: 2355
							}

							return 1; // L: 2357
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2360
							if (class25.clanChat != null) { // L: 2361
								class25.clanChat.addComparator(new UserComparator7(var7)); // L: 2362
							}

							return 1; // L: 2364
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2367
							if (class25.clanChat != null) { // L: 2368
								class25.clanChat.addComparator(new UserComparator8(var7)); // L: 2369
							}

							return 1; // L: 2371
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2374
							if (class25.clanChat != null) { // L: 2375
								class25.clanChat.addComparator(new UserComparator9(var7)); // L: 2376
							}

							return 1; // L: 2378
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2381
							if (class25.clanChat != null) { // L: 2382
								class25.clanChat.addComparator(new UserComparator10(var7)); // L: 2383
							}

							return 1; // L: 2385
						} else if (var0 == 3655) {
							if (class25.clanChat != null) { // L: 2388
								class25.clanChat.sort(); // L: 2389
							}

							return 1; // L: 2391
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2394
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2395
							return 1; // L: 2396
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 2399
							if (class25.clanChat != null) { // L: 2400
								class25.clanChat.addComparator(new BuddyRankComparator(var7)); // L: 2401
							}

							return 1; // L: 2403
						} else {
							return 2; // L: 2405
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2228
					if (class25.clanChat != null && var3 < class25.clanChat.getSize() && ((ClanMate)class25.clanChat.get(var3)).isIgnored()) { // L: 2229
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 2230
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2232
					}

					return 1; // L: 2233
				}
			}
		}
	}
}
