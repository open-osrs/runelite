import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ea")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1869642923
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1553345215
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -419916701
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 249944423
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1981412121
	)
	@Export("type")
	int type;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -552540519
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -558367511
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 246269295
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 371713265
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1905227411
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1548952897
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -806607637
	)
	int field1918;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1254231211
	)
	int field1920;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1231922825
	)
	int field1909;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1302725109
	)
	int field1922;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 634677509
	)
	int field1919;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -321996029
	)
	int field1923;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1993636743
	)
	int field1924;

	Occluder() {
	} // L: 23

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lcq;",
		garbageValue = "37280546"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return Player.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "809632906"
	)
	static int method3447(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 1972
			if (InterfaceParent.friendSystem.field1084 == 0) { // L: 1973
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (InterfaceParent.friendSystem.field1084 == 1) { // L: 1974
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.friendsList.getSize(); // L: 1975
			}

			return 1; // L: 1976
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1979
				if (InterfaceParent.friendSystem.method1974() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) { // L: 1980
					Friend var8 = (Friend)InterfaceParent.friendSystem.friendsList.get(var3); // L: 1981
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName(); // L: 1982
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 1983
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1986
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1987
				}

				return 1; // L: 1989
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1992
				if (InterfaceParent.friendSystem.method1974() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) { // L: 1993
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).world; // L: 1994
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1996
				}

				return 1; // L: 1997
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2000
				if (InterfaceParent.friendSystem.method1974() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) { // L: 2001
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).rank; // L: 2002
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2004
				}

				return 1; // L: 2005
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2008
					int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2009
					GrandExchangeOfferTotalQuantityComparator.method163(var5, var6); // L: 2010
					return 1; // L: 2011
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2014
					InterfaceParent.friendSystem.addFriend(var5); // L: 2015
					return 1; // L: 2016
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2019
					InterfaceParent.friendSystem.removeFriend(var5); // L: 2020
					return 1; // L: 2021
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2024
					InterfaceParent.friendSystem.addIgnore(var5); // L: 2025
					return 1; // L: 2026
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2029
					InterfaceParent.friendSystem.removeIgnore(var5); // L: 2030
					return 1; // L: 2031
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2034
					var5 = Calendar.method4153(var5); // L: 2035
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isFriended(new Username(var5, Message.loginType), false) ? 1 : 0; // L: 2036
					return 1; // L: 2037
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (WorldMapID.clanChat != null) { // L: 2040
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.clanChat.name; // L: 2041
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2043
					}

					return 1; // L: 2044
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (WorldMapID.clanChat != null) { // L: 2047
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.clanChat.getSize(); // L: 2048
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2050
					}

					return 1; // L: 2051
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2054
					if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize()) { // L: 2055
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.clanChat.get(var3).getUsername().getName(); // L: 2056
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2058
					}

					return 1; // L: 2059
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2062
					if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize()) { // L: 2063
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)WorldMapID.clanChat.get(var3)).getWorld(); // L: 2064
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2066
					}

					return 1; // L: 2067
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2070
					if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize()) { // L: 2071
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)WorldMapID.clanChat.get(var3)).rank; // L: 2072
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2074
					}

					return 1; // L: 2075
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.clanChat != null ? WorldMapID.clanChat.minKick : 0; // L: 2078
					return 1; // L: 2079
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2082
					PacketWriter.clanKickUser(var5); // L: 2083
					return 1; // L: 2084
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.clanChat != null ? WorldMapID.clanChat.rank * 1770422849 * 1364889025 : 0; // L: 2087
					return 1; // L: 2088
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2091
					VarbitComposition.Clan_joinChat(var5); // L: 2092
					return 1; // L: 2093
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Canvas.Clan_leaveChat(); // L: 2096
					return 1; // L: 2097
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!InterfaceParent.friendSystem.method1974()) { // L: 2100
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.ignoreList.getSize(); // L: 2101
					}

					return 1; // L: 2102
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2105
					if (InterfaceParent.friendSystem.method1974() && var3 >= 0 && var3 < InterfaceParent.friendSystem.ignoreList.getSize()) { // L: 2106
						Ignored var4 = (Ignored)InterfaceParent.friendSystem.ignoreList.get(var3); // L: 2107
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2108
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2109
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2112
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2113
					}

					return 1; // L: 2115
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2118
					var5 = Calendar.method4153(var5); // L: 2119
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isIgnored(new Username(var5, Message.loginType)) ? 1 : 0; // L: 2120
					return 1; // L: 2121
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2124
					if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize() && WorldMapID.clanChat.get(var3).getUsername().equals(UserComparator9.localPlayer.username)) { // L: 2125
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2126
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2128
					}

					return 1; // L: 2129
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (WorldMapID.clanChat != null && WorldMapID.clanChat.owner != null) { // L: 2132
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.clanChat.owner; // L: 2133
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2135
					}

					return 1; // L: 2136
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2139
					if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize() && ((ClanMate)WorldMapID.clanChat.get(var3)).isFriend()) { // L: 2140
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2141
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2143
					}

					return 1; // L: 2144
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						InterfaceParent.friendSystem.friendsList.removeComparator(); // L: 2155
						return 1; // L: 2156
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2159
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2160
							return 1; // L: 2161
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2164
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2165
							return 1; // L: 2166
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2169
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2170
							return 1; // L: 2171
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2174
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2175
							return 1; // L: 2176
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2179
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2180
							return 1; // L: 2181
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2184
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2185
							return 1; // L: 2186
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2189
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2190
							return 1; // L: 2191
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2194
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2195
							return 1; // L: 2196
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2199
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2200
							return 1; // L: 2201
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2204
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2205
							return 1; // L: 2206
						} else if (var0 == 3639) {
							InterfaceParent.friendSystem.friendsList.sort(); // L: 2209
							return 1; // L: 2210
						} else if (var0 == 3640) {
							InterfaceParent.friendSystem.ignoreList.removeComparator(); // L: 2213
							return 1; // L: 2214
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2217
							InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2218
							return 1; // L: 2219
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2222
							InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2223
							return 1; // L: 2224
						} else if (var0 == 3643) {
							InterfaceParent.friendSystem.ignoreList.sort(); // L: 2227
							return 1; // L: 2228
						} else if (var0 == 3644) {
							if (WorldMapID.clanChat != null) { // L: 2231
								WorldMapID.clanChat.removeComparator(); // L: 2232
							}

							return 1; // L: 2234
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2237
							if (WorldMapID.clanChat != null) { // L: 2238
								WorldMapID.clanChat.addComparator(new UserComparator1(var7)); // L: 2239
							}

							return 1; // L: 2241
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2244
							if (WorldMapID.clanChat != null) { // L: 2245
								WorldMapID.clanChat.addComparator(new UserComparator2(var7)); // L: 2246
							}

							return 1; // L: 2248
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2251
							if (WorldMapID.clanChat != null) { // L: 2252
								WorldMapID.clanChat.addComparator(new UserComparator3(var7)); // L: 2253
							}

							return 1; // L: 2255
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2258
							if (WorldMapID.clanChat != null) { // L: 2259
								WorldMapID.clanChat.addComparator(new UserComparator4(var7)); // L: 2260
							}

							return 1; // L: 2262
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2265
							if (WorldMapID.clanChat != null) { // L: 2266
								WorldMapID.clanChat.addComparator(new UserComparator5(var7)); // L: 2267
							}

							return 1; // L: 2269
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2272
							if (WorldMapID.clanChat != null) { // L: 2273
								WorldMapID.clanChat.addComparator(new UserComparator6(var7)); // L: 2274
							}

							return 1; // L: 2276
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2279
							if (WorldMapID.clanChat != null) { // L: 2280
								WorldMapID.clanChat.addComparator(new UserComparator7(var7)); // L: 2281
							}

							return 1; // L: 2283
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2286
							if (WorldMapID.clanChat != null) { // L: 2287
								WorldMapID.clanChat.addComparator(new UserComparator8(var7)); // L: 2288
							}

							return 1; // L: 2290
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2293
							if (WorldMapID.clanChat != null) { // L: 2294
								WorldMapID.clanChat.addComparator(new UserComparator9(var7)); // L: 2295
							}

							return 1; // L: 2297
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2300
							if (WorldMapID.clanChat != null) { // L: 2301
								WorldMapID.clanChat.addComparator(new UserComparator10(var7)); // L: 2302
							}

							return 1; // L: 2304
						} else if (var0 == 3655) {
							if (WorldMapID.clanChat != null) { // L: 2307
								WorldMapID.clanChat.sort(); // L: 2308
							}

							return 1; // L: 2310
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2313
							InterfaceParent.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2314
							return 1; // L: 2315
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2318
							if (WorldMapID.clanChat != null) { // L: 2319
								WorldMapID.clanChat.addComparator(new BuddyRankComparator(var7)); // L: 2320
							}

							return 1; // L: 2322
						} else {
							return 2; // L: 2324
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2147
					if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize() && ((ClanMate)WorldMapID.clanChat.get(var3)).isIgnored()) { // L: 2148
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2149
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2151
					}

					return 1; // L: 2152
				}
			}
		}
	}
}
