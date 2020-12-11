import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ba")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 11273

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILfo;B)Z",
		garbageValue = "104"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 11276
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1846731136"
	)
	static int method1302(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 1971
			if (MilliClock.friendSystem.field1069 == 0) { // L: 1972
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -2;
			} else if (MilliClock.friendSystem.field1069 == 1) { // L: 1973
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MilliClock.friendSystem.friendsList.getSize(); // L: 1974
			}

			return 1; // L: 1975
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1978
				if (MilliClock.friendSystem.method1939() && var3 >= 0 && var3 < MilliClock.friendSystem.friendsList.getSize()) { // L: 1979
					Friend var8 = (Friend)MilliClock.friendSystem.friendsList.get(var3); // L: 1980
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName(); // L: 1981
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 1982
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1985
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1986
				}

				return 1; // L: 1988
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1991
				if (MilliClock.friendSystem.method1939() && var3 >= 0 && var3 < MilliClock.friendSystem.friendsList.getSize()) { // L: 1992
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ((Buddy)MilliClock.friendSystem.friendsList.get(var3)).world; // L: 1993
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1995
				}

				return 1; // L: 1996
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1999
				if (MilliClock.friendSystem.method1939() && var3 >= 0 && var3 < MilliClock.friendSystem.friendsList.getSize()) { // L: 2000
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ((Buddy)MilliClock.friendSystem.friendsList.get(var3)).rank; // L: 2001
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2003
				}

				return 1; // L: 2004
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2007
					int var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2008
					GrandExchangeOfferOwnWorldComparator.method1359(var5, var6); // L: 2009
					return 1; // L: 2010
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2013
					MilliClock.friendSystem.addFriend(var5); // L: 2014
					return 1; // L: 2015
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2018
					MilliClock.friendSystem.removeFriend(var5); // L: 2019
					return 1; // L: 2020
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2023
					MilliClock.friendSystem.addIgnore(var5); // L: 2024
					return 1; // L: 2025
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2028
					MilliClock.friendSystem.removeIgnore(var5); // L: 2029
					return 1; // L: 2030
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2033
					var5 = class22.method220(var5); // L: 2034
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MilliClock.friendSystem.isFriended(new Username(var5, GrandExchangeOfferUnitPriceComparator.loginType), false) ? 1 : 0; // L: 2035
					return 1; // L: 2036
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (WorldMapArea.clanChat != null) { // L: 2039
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapArea.clanChat.name; // L: 2040
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2042
					}

					return 1; // L: 2043
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (WorldMapArea.clanChat != null) { // L: 2046
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapArea.clanChat.getSize(); // L: 2047
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2049
					}

					return 1; // L: 2050
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2053
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize()) { // L: 2054
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapArea.clanChat.get(var3).getUsername().getName(); // L: 2055
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2057
					}

					return 1; // L: 2058
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2061
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize()) { // L: 2062
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ((Buddy)WorldMapArea.clanChat.get(var3)).getWorld(); // L: 2063
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2065
					}

					return 1; // L: 2066
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2069
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize()) { // L: 2070
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ((Buddy)WorldMapArea.clanChat.get(var3)).rank; // L: 2071
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2073
					}

					return 1; // L: 2074
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapArea.clanChat != null ? WorldMapArea.clanChat.minKick : 0; // L: 2077
					return 1; // L: 2078
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2081
					Tiles.clanKickUser(var5); // L: 2082
					return 1; // L: 2083
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapArea.clanChat != null ? WorldMapArea.clanChat.rank * 120160835 * 1015634539 : 0; // L: 2086
					return 1; // L: 2087
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2090
					Varcs.Clan_joinChat(var5); // L: 2091
					return 1; // L: 2092
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					BZip2State.Clan_leaveChat(); // L: 2095
					return 1; // L: 2096
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!MilliClock.friendSystem.method1939()) { // L: 2099
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MilliClock.friendSystem.ignoreList.getSize(); // L: 2100
					}

					return 1; // L: 2101
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2104
					if (MilliClock.friendSystem.method1939() && var3 >= 0 && var3 < MilliClock.friendSystem.ignoreList.getSize()) { // L: 2105
						Ignored var4 = (Ignored)MilliClock.friendSystem.ignoreList.get(var3); // L: 2106
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2107
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2108
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2111
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2112
					}

					return 1; // L: 2114
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2117
					var5 = class22.method220(var5); // L: 2118
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MilliClock.friendSystem.isIgnored(new Username(var5, GrandExchangeOfferUnitPriceComparator.loginType)) ? 1 : 0; // L: 2119
					return 1; // L: 2120
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2123
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize() && WorldMapArea.clanChat.get(var3).getUsername().equals(PlayerAppearance.localPlayer.username)) { // L: 2124
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1; // L: 2125
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2127
					}

					return 1; // L: 2128
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (WorldMapArea.clanChat != null && WorldMapArea.clanChat.owner != null) { // L: 2131
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapArea.clanChat.owner; // L: 2132
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2134
					}

					return 1; // L: 2135
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2138
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize() && ((ClanMate)WorldMapArea.clanChat.get(var3)).isFriend()) { // L: 2139
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1; // L: 2140
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2142
					}

					return 1; // L: 2143
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						MilliClock.friendSystem.friendsList.removeComparator(); // L: 2154
						return 1; // L: 2155
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2158
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2159
							return 1; // L: 2160
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2163
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2164
							return 1; // L: 2165
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2168
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2169
							return 1; // L: 2170
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2173
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2174
							return 1; // L: 2175
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2178
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2179
							return 1; // L: 2180
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2183
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2184
							return 1; // L: 2185
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2188
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2189
							return 1; // L: 2190
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2193
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2194
							return 1; // L: 2195
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2198
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2199
							return 1; // L: 2200
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2203
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2204
							return 1; // L: 2205
						} else if (var0 == 3639) {
							MilliClock.friendSystem.friendsList.sort(); // L: 2208
							return 1; // L: 2209
						} else if (var0 == 3640) {
							MilliClock.friendSystem.ignoreList.removeComparator(); // L: 2212
							return 1; // L: 2213
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2216
							MilliClock.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2217
							return 1; // L: 2218
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2221
							MilliClock.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2222
							return 1; // L: 2223
						} else if (var0 == 3643) {
							MilliClock.friendSystem.ignoreList.sort(); // L: 2226
							return 1; // L: 2227
						} else if (var0 == 3644) {
							if (WorldMapArea.clanChat != null) { // L: 2230
								WorldMapArea.clanChat.removeComparator(); // L: 2231
							}

							return 1; // L: 2233
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2236
							if (WorldMapArea.clanChat != null) { // L: 2237
								WorldMapArea.clanChat.addComparator(new UserComparator1(var7)); // L: 2238
							}

							return 1; // L: 2240
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2243
							if (WorldMapArea.clanChat != null) { // L: 2244
								WorldMapArea.clanChat.addComparator(new UserComparator2(var7)); // L: 2245
							}

							return 1; // L: 2247
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2250
							if (WorldMapArea.clanChat != null) { // L: 2251
								WorldMapArea.clanChat.addComparator(new UserComparator3(var7)); // L: 2252
							}

							return 1; // L: 2254
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2257
							if (WorldMapArea.clanChat != null) { // L: 2258
								WorldMapArea.clanChat.addComparator(new UserComparator4(var7)); // L: 2259
							}

							return 1; // L: 2261
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2264
							if (WorldMapArea.clanChat != null) { // L: 2265
								WorldMapArea.clanChat.addComparator(new UserComparator5(var7)); // L: 2266
							}

							return 1; // L: 2268
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2271
							if (WorldMapArea.clanChat != null) { // L: 2272
								WorldMapArea.clanChat.addComparator(new UserComparator6(var7)); // L: 2273
							}

							return 1; // L: 2275
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2278
							if (WorldMapArea.clanChat != null) { // L: 2279
								WorldMapArea.clanChat.addComparator(new UserComparator7(var7)); // L: 2280
							}

							return 1; // L: 2282
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2285
							if (WorldMapArea.clanChat != null) { // L: 2286
								WorldMapArea.clanChat.addComparator(new UserComparator8(var7)); // L: 2287
							}

							return 1; // L: 2289
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2292
							if (WorldMapArea.clanChat != null) { // L: 2293
								WorldMapArea.clanChat.addComparator(new UserComparator9(var7)); // L: 2294
							}

							return 1; // L: 2296
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2299
							if (WorldMapArea.clanChat != null) { // L: 2300
								WorldMapArea.clanChat.addComparator(new UserComparator10(var7)); // L: 2301
							}

							return 1; // L: 2303
						} else if (var0 == 3655) {
							if (WorldMapArea.clanChat != null) { // L: 2306
								WorldMapArea.clanChat.sort(); // L: 2307
							}

							return 1; // L: 2309
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2312
							MilliClock.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2313
							return 1; // L: 2314
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 2317
							if (WorldMapArea.clanChat != null) { // L: 2318
								WorldMapArea.clanChat.addComparator(new BuddyRankComparator(var7)); // L: 2319
							}

							return 1; // L: 2321
						} else {
							return 2; // L: 2323
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2146
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize() && ((ClanMate)WorldMapArea.clanChat.get(var3)).isIgnored()) { // L: 2147
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1; // L: 2148
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2150
					}

					return 1; // L: 2151
				}
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1035519670"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 7313
		Client.isMenuOpen = false; // L: 7314
		Client.menuActions[0] = "Cancel"; // L: 7316
		Client.menuTargets[0] = ""; // L: 7317
		Client.menuOpcodes[0] = 1006; // L: 7318
		Client.menuShiftClick[0] = false; // L: 7319
		Client.menuOptionsCount = 1; // L: 7320
	} // L: 7321
}
