import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jf")
public class class263 {
	@ObfuscatedName("f")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("u")
	int[] field3334;
	@ObfuscatedName("p")
	int[] field3335;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1919452297
	)
	int field3336;

	public class263() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3334 = new int[2048]; // L: 12
		this.field3335 = new int[2048]; // L: 13
		this.field3336 = 0; // L: 14
		Renderable.method3629(); // L: 21
	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1364258777"
	)
	void method4654(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double[] var3 = Frames.method3639(0.0D, (double)((float)var1 / 3.0F), var1); // L: 47
		double var4 = var3[var1] * var3[var1]; // L: 48
		int[] var6 = new int[var2 * var2]; // L: 49
		boolean var7 = false; // L: 50

		for (int var8 = 0; var8 < var2; ++var8) { // L: 51
			for (int var9 = 0; var9 < var2; ++var9) { // L: 52
				int var10 = var6[var9 + var8 * var2] = (int)(var3[var9] * var3[var8] / var4 * 256.0D); // L: 53
				if (!var7 && var10 > 0) { // L: 54
					var7 = true; // L: 55
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2); // L: 59
		this.spriteMap.put(var1, var11); // L: 60
	} // L: 61

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;",
		garbageValue = "264389909"
	)
	SpritePixels method4665(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 64
			this.method4654(var1); // L: 65
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 67
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-176265199"
	)
	public final void method4656(int var1, int var2) {
		if (this.field3336 < this.field3334.length) { // L: 71
			this.field3334[this.field3336] = var1; // L: 72
			this.field3335[this.field3336] = var2; // L: 73
			++this.field3336; // L: 74
		}
	} // L: 75

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "50833165"
	)
	public final void method4657() {
		this.field3336 = 0; // L: 78
	} // L: 79

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILoh;FI)V",
		garbageValue = "-1913528659"
	)
	public final void method4658(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 82
		SpritePixels var6 = this.method4665(var5); // L: 83
		int var7 = var5 * 2 + 1; // L: 84
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 85
		Bounds var9 = new Bounds(0, 0); // L: 86
		this.bounds.setHigh(var7, var7); // L: 87
		System.nanoTime(); // L: 88

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3336; ++var10) { // L: 89
			var11 = this.field3334[var10]; // L: 90
			var12 = this.field3335[var10]; // L: 91
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 92
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 93
			this.bounds.setLow(var13, var14); // L: 94
			this.bounds.method5954(var8, var9); // L: 95
			this.method4659(var6, var3, var9); // L: 96
		}

		System.nanoTime(); // L: 98
		System.nanoTime(); // L: 99

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 100
			if (var3.pixels[var10] == 0) { // L: 101
				var3.pixels[var10] = -16777216; // L: 102
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 105
				if (var11 <= 0) { // L: 106
					var3.pixels[var10] = -16777216; // L: 107
				} else {
					if (var11 > HealthBar.field1311.length) { // L: 110
						var11 = HealthBar.field1311.length;
					}

					var12 = HealthBar.field1311[var11 - 1]; // L: 111
					var3.pixels[var10] = -16777216 | var12; // L: 112
				}
			}
		}

		System.nanoTime(); // L: 114
	} // L: 115

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Loh;Loh;Llj;I)V",
		garbageValue = "-1779062903"
	)
	void method4659(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 118
			int var4 = 0; // L: 119
			int var5 = 0; // L: 120
			if (var3.lowX == 0) { // L: 121
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 122
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 123
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 124

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 125
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 126
					int[] var10000 = var2.pixels; // L: 127
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 129
				var7 += var2.subWidth - var3.highX; // L: 130
			}

		}
	} // L: 132

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZB)I",
		garbageValue = "-9"
	)
	static int method4666(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2052
			if (class13.friendSystem.field908 == 0) { // L: 2053
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -2;
			} else if (class13.friendSystem.field908 == 1) { // L: 2054
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class13.friendSystem.friendsList.getSize(); // L: 2055
			}

			return 1; // L: 2056
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2059
				if (class13.friendSystem.method1719() && var3 >= 0 && var3 < class13.friendSystem.friendsList.getSize()) { // L: 2060
					Friend var8 = (Friend)class13.friendSystem.friendsList.get(var3); // L: 2061
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2062
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2063
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2066
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2067
				}

				return 1; // L: 2069
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2072
				if (class13.friendSystem.method1719() && var3 >= 0 && var3 < class13.friendSystem.friendsList.getSize()) { // L: 2073
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((Buddy)class13.friendSystem.friendsList.get(var3)).world; // L: 2074
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2076
				}

				return 1; // L: 2077
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2080
				if (class13.friendSystem.method1719() && var3 >= 0 && var3 < class13.friendSystem.friendsList.getSize()) { // L: 2081
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((Buddy)class13.friendSystem.friendsList.get(var3)).rank; // L: 2082
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2084
				}

				return 1; // L: 2085
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2088
					int var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2089
					KeyHandler.method462(var5, var6); // L: 2090
					return 1; // L: 2091
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2094
					class13.friendSystem.addFriend(var5); // L: 2095
					return 1; // L: 2096
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2099
					class13.friendSystem.removeFriend(var5); // L: 2100
					return 1; // L: 2101
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2104
					class13.friendSystem.addIgnore(var5); // L: 2105
					return 1; // L: 2106
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2109
					class13.friendSystem.removeIgnore(var5); // L: 2110
					return 1; // L: 2111
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2114
					var5 = class1.method24(var5); // L: 2115
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class13.friendSystem.isFriended(new Username(var5, AbstractUserComparator.loginType), false) ? 1 : 0; // L: 2116
					return 1; // L: 2117
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (InterfaceParent.clanChat != null) { // L: 2120
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = InterfaceParent.clanChat.name; // L: 2121
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2123
					}

					return 1; // L: 2124
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (InterfaceParent.clanChat != null) { // L: 2127
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.clanChat.getSize(); // L: 2128
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2130
					}

					return 1; // L: 2131
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2134
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize()) { // L: 2135
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = InterfaceParent.clanChat.get(var3).getUsername().getName(); // L: 2136
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2138
					}

					return 1; // L: 2139
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2142
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize()) { // L: 2143
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.clanChat.get(var3)).getWorld(); // L: 2144
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2146
					}

					return 1; // L: 2147
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2150
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize()) { // L: 2151
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.clanChat.get(var3)).rank; // L: 2152
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2154
					}

					return 1; // L: 2155
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.clanChat != null ? InterfaceParent.clanChat.minKick : 0; // L: 2158
					return 1; // L: 2159
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2162
					MenuAction.clanKickUser(var5); // L: 2163
					return 1; // L: 2164
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.clanChat != null ? InterfaceParent.clanChat.rank * 1749202535 * -610532009 : 0; // L: 2167
					return 1; // L: 2168
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2171
					ArchiveLoader.Clan_joinChat(var5); // L: 2172
					return 1; // L: 2173
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class238.Clan_leaveChat(); // L: 2176
					return 1; // L: 2177
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class13.friendSystem.method1719()) { // L: 2180
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class13.friendSystem.ignoreList.getSize(); // L: 2181
					}

					return 1; // L: 2182
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2185
					if (class13.friendSystem.method1719() && var3 >= 0 && var3 < class13.friendSystem.ignoreList.getSize()) { // L: 2186
						Ignored var4 = (Ignored)class13.friendSystem.ignoreList.get(var3); // L: 2187
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2188
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2189
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2192
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2193
					}

					return 1; // L: 2195
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2198
					var5 = class1.method24(var5); // L: 2199
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class13.friendSystem.isIgnored(new Username(var5, AbstractUserComparator.loginType)) ? 1 : 0; // L: 2200
					return 1; // L: 2201
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2204
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize() && InterfaceParent.clanChat.get(var3).getUsername().equals(Varcs.localPlayer.username)) { // L: 2205
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 2206
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2208
					}

					return 1; // L: 2209
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (InterfaceParent.clanChat != null && InterfaceParent.clanChat.owner != null) { // L: 2212
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = InterfaceParent.clanChat.owner; // L: 2213
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2215
					}

					return 1; // L: 2216
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2219
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize() && ((ClanMate)InterfaceParent.clanChat.get(var3)).isFriend()) { // L: 2220
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 2221
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2223
					}

					return 1; // L: 2224
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class13.friendSystem.friendsList.removeComparator(); // L: 2235
						return 1; // L: 2236
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2239
							class13.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2240
							return 1; // L: 2241
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2244
							class13.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2245
							return 1; // L: 2246
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2249
							class13.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2250
							return 1; // L: 2251
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2254
							class13.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2255
							return 1; // L: 2256
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2259
							class13.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2260
							return 1; // L: 2261
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2264
							class13.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2265
							return 1; // L: 2266
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2269
							class13.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2270
							return 1; // L: 2271
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2274
							class13.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2275
							return 1; // L: 2276
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2279
							class13.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2280
							return 1; // L: 2281
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2284
							class13.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2285
							return 1; // L: 2286
						} else if (var0 == 3639) {
							class13.friendSystem.friendsList.sort(); // L: 2289
							return 1; // L: 2290
						} else if (var0 == 3640) {
							class13.friendSystem.ignoreList.removeComparator(); // L: 2293
							return 1; // L: 2294
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2297
							class13.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2298
							return 1; // L: 2299
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2302
							class13.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2303
							return 1; // L: 2304
						} else if (var0 == 3643) {
							class13.friendSystem.ignoreList.sort(); // L: 2307
							return 1; // L: 2308
						} else if (var0 == 3644) {
							if (InterfaceParent.clanChat != null) { // L: 2311
								InterfaceParent.clanChat.removeComparator(); // L: 2312
							}

							return 1; // L: 2314
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2317
							if (InterfaceParent.clanChat != null) { // L: 2318
								InterfaceParent.clanChat.addComparator(new UserComparator1(var7)); // L: 2319
							}

							return 1; // L: 2321
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2324
							if (InterfaceParent.clanChat != null) { // L: 2325
								InterfaceParent.clanChat.addComparator(new UserComparator2(var7)); // L: 2326
							}

							return 1; // L: 2328
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2331
							if (InterfaceParent.clanChat != null) { // L: 2332
								InterfaceParent.clanChat.addComparator(new UserComparator3(var7)); // L: 2333
							}

							return 1; // L: 2335
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2338
							if (InterfaceParent.clanChat != null) { // L: 2339
								InterfaceParent.clanChat.addComparator(new UserComparator4(var7)); // L: 2340
							}

							return 1; // L: 2342
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2345
							if (InterfaceParent.clanChat != null) { // L: 2346
								InterfaceParent.clanChat.addComparator(new UserComparator5(var7)); // L: 2347
							}

							return 1; // L: 2349
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2352
							if (InterfaceParent.clanChat != null) { // L: 2353
								InterfaceParent.clanChat.addComparator(new UserComparator6(var7)); // L: 2354
							}

							return 1; // L: 2356
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2359
							if (InterfaceParent.clanChat != null) { // L: 2360
								InterfaceParent.clanChat.addComparator(new UserComparator7(var7)); // L: 2361
							}

							return 1; // L: 2363
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2366
							if (InterfaceParent.clanChat != null) { // L: 2367
								InterfaceParent.clanChat.addComparator(new UserComparator8(var7)); // L: 2368
							}

							return 1; // L: 2370
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2373
							if (InterfaceParent.clanChat != null) { // L: 2374
								InterfaceParent.clanChat.addComparator(new UserComparator9(var7)); // L: 2375
							}

							return 1; // L: 2377
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2380
							if (InterfaceParent.clanChat != null) { // L: 2381
								InterfaceParent.clanChat.addComparator(new UserComparator10(var7)); // L: 2382
							}

							return 1; // L: 2384
						} else if (var0 == 3655) {
							if (InterfaceParent.clanChat != null) { // L: 2387
								InterfaceParent.clanChat.sort(); // L: 2388
							}

							return 1; // L: 2390
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2393
							class13.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2394
							return 1; // L: 2395
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1; // L: 2398
							if (InterfaceParent.clanChat != null) { // L: 2399
								InterfaceParent.clanChat.addComparator(new BuddyRankComparator(var7)); // L: 2400
							}

							return 1; // L: 2402
						} else {
							return 2; // L: 2404
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2227
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize() && ((ClanMate)InterfaceParent.clanChat.get(var3)).isIgnored()) { // L: 2228
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 2229
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2231
					}

					return 1; // L: 2232
				}
			}
		}
	}
}
