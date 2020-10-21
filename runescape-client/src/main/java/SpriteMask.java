import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ho")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = -1921410783
	)
	static int field2542;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 387841137
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1259434667
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("l")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("m")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 735
		this.height = var2; // L: 736
		this.xWidths = var3; // L: 737
		this.xStarts = var4; // L: 738
	} // L: 739

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "92"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 742
			int var3 = this.xStarts[var2]; // L: 743
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 744
				return true;
			}
		}

		return false; // L: 746
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-239225469"
	)
	static int method4119(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 1913
			if (WorldMapLabelSize.friendSystem.field1097 == 0) { // L: 1914
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -2;
			} else if (WorldMapLabelSize.friendSystem.field1097 == 1) { // L: 1915
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendSystem.friendsList.getSize(); // L: 1916
			}

			return 1; // L: 1917
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1920
				if (WorldMapLabelSize.friendSystem.method1958() && var3 >= 0 && var3 < WorldMapLabelSize.friendSystem.friendsList.getSize()) { // L: 1921
					Friend var8 = (Friend)WorldMapLabelSize.friendSystem.friendsList.get(var3); // L: 1922
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var8.getName(); // L: 1923
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 1924
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1927
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1928
				}

				return 1; // L: 1930
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1933
				if (WorldMapLabelSize.friendSystem.method1958() && var3 >= 0 && var3 < WorldMapLabelSize.friendSystem.friendsList.getSize()) { // L: 1934
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ((Buddy)WorldMapLabelSize.friendSystem.friendsList.get(var3)).world; // L: 1935
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1937
				}

				return 1; // L: 1938
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1941
				if (WorldMapLabelSize.friendSystem.method1958() && var3 >= 0 && var3 < WorldMapLabelSize.friendSystem.friendsList.getSize()) { // L: 1942
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ((Buddy)WorldMapLabelSize.friendSystem.friendsList.get(var3)).rank; // L: 1943
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1945
				}

				return 1; // L: 1946
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1949
					int var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1950
					GameShell.method1138(var5, var6); // L: 1951
					return 1; // L: 1952
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1955
					WorldMapLabelSize.friendSystem.addFriend(var5); // L: 1956
					return 1; // L: 1957
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1960
					WorldMapLabelSize.friendSystem.removeFriend(var5); // L: 1961
					return 1; // L: 1962
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1965
					WorldMapLabelSize.friendSystem.addIgnore(var5); // L: 1966
					return 1; // L: 1967
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1970
					WorldMapLabelSize.friendSystem.removeIgnore(var5); // L: 1971
					return 1; // L: 1972
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 1975
					var5 = GrandExchangeOfferUnitPriceComparator.method218(var5); // L: 1976
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendSystem.isFriended(new Username(var5, UserComparator4.loginType), false) ? 1 : 0; // L: 1977
					return 1; // L: 1978
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (DevicePcmPlayerProvider.clanChat != null) { // L: 1981
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = DevicePcmPlayerProvider.clanChat.name; // L: 1982
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1984
					}

					return 1; // L: 1985
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (DevicePcmPlayerProvider.clanChat != null) { // L: 1988
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.clanChat.getSize(); // L: 1989
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1991
					}

					return 1; // L: 1992
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1995
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize()) { // L: 1996
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = DevicePcmPlayerProvider.clanChat.get(var3).getUsername().getName(); // L: 1997
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 1999
					}

					return 1; // L: 2000
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2003
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize()) { // L: 2004
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.clanChat.get(var3)).getWorld(); // L: 2005
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2007
					}

					return 1; // L: 2008
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2011
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize()) { // L: 2012
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.clanChat.get(var3)).rank; // L: 2013
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2015
					}

					return 1; // L: 2016
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.clanChat != null ? DevicePcmPlayerProvider.clanChat.minKick : 0; // L: 2019
					return 1; // L: 2020
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2023
					ScriptFrame.clanKickUser(var5); // L: 2024
					return 1; // L: 2025
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.clanChat != null ? DevicePcmPlayerProvider.clanChat.rank * 1309828391 * 1444461207 : 0; // L: 2028
					return 1; // L: 2029
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2032
					Message.Clan_joinChat(var5); // L: 2033
					return 1; // L: 2034
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class1.Clan_leaveChat(); // L: 2037
					return 1; // L: 2038
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!WorldMapLabelSize.friendSystem.method1958()) { // L: 2041
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendSystem.ignoreList.getSize(); // L: 2042
					}

					return 1; // L: 2043
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2046
					if (WorldMapLabelSize.friendSystem.method1958() && var3 >= 0 && var3 < WorldMapLabelSize.friendSystem.ignoreList.getSize()) { // L: 2047
						Ignored var4 = (Ignored)WorldMapLabelSize.friendSystem.ignoreList.get(var3); // L: 2048
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2049
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2050
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2053
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2054
					}

					return 1; // L: 2056
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2059
					var5 = GrandExchangeOfferUnitPriceComparator.method218(var5); // L: 2060
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendSystem.isIgnored(new Username(var5, UserComparator4.loginType)) ? 1 : 0; // L: 2061
					return 1; // L: 2062
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2065
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize() && DevicePcmPlayerProvider.clanChat.get(var3).getUsername().equals(PlayerType.localPlayer.username)) { // L: 2066
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1; // L: 2067
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2069
					}

					return 1; // L: 2070
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (DevicePcmPlayerProvider.clanChat != null && DevicePcmPlayerProvider.clanChat.owner != null) { // L: 2073
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = DevicePcmPlayerProvider.clanChat.owner; // L: 2074
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = ""; // L: 2076
					}

					return 1; // L: 2077
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2080
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize() && ((ClanMate)DevicePcmPlayerProvider.clanChat.get(var3)).isFriend()) { // L: 2081
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1; // L: 2082
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2084
					}

					return 1; // L: 2085
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						WorldMapLabelSize.friendSystem.friendsList.removeComparator(); // L: 2096
						return 1; // L: 2097
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2100
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2101
							return 1; // L: 2102
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2105
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2106
							return 1; // L: 2107
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2110
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2111
							return 1; // L: 2112
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2115
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2116
							return 1; // L: 2117
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2120
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2121
							return 1; // L: 2122
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2125
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2126
							return 1; // L: 2127
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2130
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2131
							return 1; // L: 2132
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2135
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2136
							return 1; // L: 2137
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2140
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2141
							return 1; // L: 2142
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2145
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2146
							return 1; // L: 2147
						} else if (var0 == 3639) {
							WorldMapLabelSize.friendSystem.friendsList.sort(); // L: 2150
							return 1; // L: 2151
						} else if (var0 == 3640) {
							WorldMapLabelSize.friendSystem.ignoreList.removeComparator(); // L: 2154
							return 1; // L: 2155
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2158
							WorldMapLabelSize.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2159
							return 1; // L: 2160
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2163
							WorldMapLabelSize.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2164
							return 1; // L: 2165
						} else if (var0 == 3643) {
							WorldMapLabelSize.friendSystem.ignoreList.sort(); // L: 2168
							return 1; // L: 2169
						} else if (var0 == 3644) {
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2172
								DevicePcmPlayerProvider.clanChat.removeComparator(); // L: 2173
							}

							return 1; // L: 2175
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2178
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2179
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator1(var7)); // L: 2180
							}

							return 1; // L: 2182
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2185
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2186
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator2(var7)); // L: 2187
							}

							return 1; // L: 2189
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2192
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2193
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator3(var7)); // L: 2194
							}

							return 1; // L: 2196
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2199
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2200
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator4(var7)); // L: 2201
							}

							return 1; // L: 2203
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2206
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2207
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator5(var7)); // L: 2208
							}

							return 1; // L: 2210
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2213
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2214
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator6(var7)); // L: 2215
							}

							return 1; // L: 2217
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2220
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2221
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator7(var7)); // L: 2222
							}

							return 1; // L: 2224
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2227
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2228
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator8(var7)); // L: 2229
							}

							return 1; // L: 2231
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2234
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2235
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator9(var7)); // L: 2236
							}

							return 1; // L: 2238
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2241
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2242
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator10(var7)); // L: 2243
							}

							return 1; // L: 2245
						} else if (var0 == 3655) {
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2248
								DevicePcmPlayerProvider.clanChat.sort(); // L: 2249
							}

							return 1; // L: 2251
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2254
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2255
							return 1; // L: 2256
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 2259
							if (DevicePcmPlayerProvider.clanChat != null) { // L: 2260
								DevicePcmPlayerProvider.clanChat.addComparator(new BuddyRankComparator(var7)); // L: 2261
							}

							return 1; // L: 2263
						} else {
							return 2; // L: 2265
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2088
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize() && ((ClanMate)DevicePcmPlayerProvider.clanChat.get(var3)).isIgnored()) { // L: 2089
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1; // L: 2090
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2092
					}

					return 1; // L: 2093
				}
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 115
	}
}
