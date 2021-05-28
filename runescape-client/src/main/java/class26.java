import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ae")
public class class26 extends class14 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("pcmPlayerProvider")
	static PlayerProvider pcmPlayerProvider;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	static ClanSettings field220;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 1552499431731106411L
	)
	long field217;
	@ObfuscatedName("n")
	String field218;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1135955153
	)
	int field219;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class26(class2 var1) {
		this.this$0 = var1;
		this.field217 = -1L; // L: 93
		this.field218 = null; // L: 94
		this.field219 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field217 = var1.readLong(); // L: 102
		}

		this.field218 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field219 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method103(this.field217, this.field218, this.field219); // L: 109
	} // L: 110

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1494621592"
	)
	static final int method272(int var0, int var1) {
		if (var0 == -2) { // L: 855
			return 12345678;
		} else if (var0 == -1) { // L: 856
			if (var1 < 2) {
				var1 = 2; // L: 857
			} else if (var1 > 126) { // L: 858
				var1 = 126;
			}

			return var1; // L: 859
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 861
			if (var1 < 2) { // L: 862
				var1 = 2;
			} else if (var1 > 126) { // L: 863
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 864
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1261558074"
	)
	static int method274(int var0, Script var1, boolean var2) {
		Widget var6;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1211
			int var4;
			if (var0 == 1928) { // L: 1228
				var6 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1229
				var4 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1230
				if (var4 >= 1 && var4 <= 10) { // L: 1231
					class376.widgetDefaultMenuAction(var4, var6.id, var6.childIndex, var6.itemId, ""); // L: 1234
					return 1; // L: 1235
				} else {
					throw new RuntimeException(); // L: 1232
				}
			} else if (var0 == 2928) { // L: 1237
				class44.Interpreter_intStackSize -= 3; // L: 1238
				int var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 1239
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1240
				int var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 1241
				if (var5 >= 1 && var5 <= 10) { // L: 1242
					class376.widgetDefaultMenuAction(var5, var3, var4, Frames.getWidget(var3).itemId, ""); // L: 1245
					return 1; // L: 1246
				} else {
					throw new RuntimeException(); // L: 1243
				}
			} else {
				return 2; // L: 1248
			}
		} else if (Interpreter.field987 >= 10) { // L: 1212
			throw new RuntimeException(); // L: 1213
		} else {
			if (var0 >= 2000) { // L: 1216
				var6 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 1217
			} else {
				var6 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1219
			}

			if (var6.onResize == null) { // L: 1220
				return 0;
			} else {
				ScriptEvent var7 = new ScriptEvent(); // L: 1221
				var7.widget = var6; // L: 1222
				var7.args = var6.onResize; // L: 1223
				var7.field1180 = Interpreter.field987 + 1; // L: 1224
				Client.scriptEvents.addFirst(var7); // L: 1225
				return 1; // L: 1226
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "55"
	)
	static int method273(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2053
			if (NetSocket.friendSystem.field941 == 0) { // L: 2054
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -2;
			} else if (NetSocket.friendSystem.field941 == 1) { // L: 2055
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = NetSocket.friendSystem.friendsList.getSize(); // L: 2056
			}

			return 1; // L: 2057
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2060
				if (NetSocket.friendSystem.method1689() && var3 >= 0 && var3 < NetSocket.friendSystem.friendsList.getSize()) { // L: 2061
					Friend var8 = (Friend)NetSocket.friendSystem.friendsList.get(var3); // L: 2062
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2063
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2064
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2067
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2068
				}

				return 1; // L: 2070
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2073
				if (NetSocket.friendSystem.method1689() && var3 >= 0 && var3 < NetSocket.friendSystem.friendsList.getSize()) { // L: 2074
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((Buddy)NetSocket.friendSystem.friendsList.get(var3)).world; // L: 2075
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2077
				}

				return 1; // L: 2078
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2081
				if (NetSocket.friendSystem.method1689() && var3 >= 0 && var3 < NetSocket.friendSystem.friendsList.getSize()) { // L: 2082
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((Buddy)NetSocket.friendSystem.friendsList.get(var3)).rank; // L: 2083
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2085
				}

				return 1; // L: 2086
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2089
					int var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2090
					VerticalAlignment.method2796(var5, var6); // L: 2091
					return 1; // L: 2092
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2095
					NetSocket.friendSystem.addFriend(var5); // L: 2096
					return 1; // L: 2097
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2100
					NetSocket.friendSystem.removeFriend(var5); // L: 2101
					return 1; // L: 2102
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2105
					NetSocket.friendSystem.addIgnore(var5); // L: 2106
					return 1; // L: 2107
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2110
					NetSocket.friendSystem.removeIgnore(var5); // L: 2111
					return 1; // L: 2112
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2115
					var5 = class15.method189(var5); // L: 2116
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = NetSocket.friendSystem.isFriended(new Username(var5, WorldMapSection0.loginType), false) ? 1 : 0; // L: 2117
					return 1; // L: 2118
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (WorldMapRegion.friendsChat != null) { // L: 2121
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapRegion.friendsChat.name; // L: 2122
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2124
					}

					return 1; // L: 2125
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (WorldMapRegion.friendsChat != null) { // L: 2128
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapRegion.friendsChat.getSize(); // L: 2129
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2131
					}

					return 1; // L: 2132
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2135
					if (WorldMapRegion.friendsChat != null && var3 < WorldMapRegion.friendsChat.getSize()) { // L: 2136
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapRegion.friendsChat.get(var3).getUsername().getName(); // L: 2137
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2139
					}

					return 1; // L: 2140
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2143
					if (WorldMapRegion.friendsChat != null && var3 < WorldMapRegion.friendsChat.getSize()) { // L: 2144
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((Buddy)WorldMapRegion.friendsChat.get(var3)).getWorld(); // L: 2145
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2147
					}

					return 1; // L: 2148
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2151
					if (WorldMapRegion.friendsChat != null && var3 < WorldMapRegion.friendsChat.getSize()) { // L: 2152
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((Buddy)WorldMapRegion.friendsChat.get(var3)).rank; // L: 2153
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2155
					}

					return 1; // L: 2156
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapRegion.friendsChat != null ? WorldMapRegion.friendsChat.minKick : 0; // L: 2159
					return 1; // L: 2160
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2163
					class105.clanKickUser(var5); // L: 2164
					return 1; // L: 2165
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapRegion.friendsChat != null ? WorldMapRegion.friendsChat.rank * -759593825 * -78473377 : 0; // L: 2168
					return 1; // L: 2169
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2172
					NPCComposition.Clan_joinChat(var5); // L: 2173
					return 1; // L: 2174
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					MouseHandler.Clan_leaveChat(); // L: 2177
					return 1; // L: 2178
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!NetSocket.friendSystem.method1689()) { // L: 2181
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = NetSocket.friendSystem.ignoreList.getSize(); // L: 2182
					}

					return 1; // L: 2183
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2186
					if (NetSocket.friendSystem.method1689() && var3 >= 0 && var3 < NetSocket.friendSystem.ignoreList.getSize()) { // L: 2187
						Ignored var4 = (Ignored)NetSocket.friendSystem.ignoreList.get(var3); // L: 2188
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2189
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2190
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2193
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2194
					}

					return 1; // L: 2196
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2199
					var5 = class15.method189(var5); // L: 2200
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = NetSocket.friendSystem.isIgnored(new Username(var5, WorldMapSection0.loginType)) ? 1 : 0; // L: 2201
					return 1; // L: 2202
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2205
					if (WorldMapRegion.friendsChat != null && var3 < WorldMapRegion.friendsChat.getSize() && WorldMapRegion.friendsChat.get(var3).getUsername().equals(class93.localPlayer.username)) { // L: 2206
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 2207
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2209
					}

					return 1; // L: 2210
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (WorldMapRegion.friendsChat != null && WorldMapRegion.friendsChat.owner != null) { // L: 2213
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapRegion.friendsChat.owner; // L: 2214
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2216
					}

					return 1; // L: 2217
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2220
					if (WorldMapRegion.friendsChat != null && var3 < WorldMapRegion.friendsChat.getSize() && ((ClanMate)WorldMapRegion.friendsChat.get(var3)).isFriend()) { // L: 2221
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 2222
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2224
					}

					return 1; // L: 2225
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						NetSocket.friendSystem.friendsList.removeComparator(); // L: 2236
						return 1; // L: 2237
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2240
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2241
							return 1; // L: 2242
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2245
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2246
							return 1; // L: 2247
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2250
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2251
							return 1; // L: 2252
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2255
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2256
							return 1; // L: 2257
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2260
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2261
							return 1; // L: 2262
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2265
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2266
							return 1; // L: 2267
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2270
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2271
							return 1; // L: 2272
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2275
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2276
							return 1; // L: 2277
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2280
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2281
							return 1; // L: 2282
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2285
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2286
							return 1; // L: 2287
						} else if (var0 == 3639) {
							NetSocket.friendSystem.friendsList.sort(); // L: 2290
							return 1; // L: 2291
						} else if (var0 == 3640) {
							NetSocket.friendSystem.ignoreList.removeComparator(); // L: 2294
							return 1; // L: 2295
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2298
							NetSocket.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2299
							return 1; // L: 2300
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2303
							NetSocket.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2304
							return 1; // L: 2305
						} else if (var0 == 3643) {
							NetSocket.friendSystem.ignoreList.sort(); // L: 2308
							return 1; // L: 2309
						} else if (var0 == 3644) {
							if (WorldMapRegion.friendsChat != null) { // L: 2312
								WorldMapRegion.friendsChat.removeComparator(); // L: 2313
							}

							return 1; // L: 2315
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2318
							if (WorldMapRegion.friendsChat != null) { // L: 2319
								WorldMapRegion.friendsChat.addComparator(new UserComparator1(var7)); // L: 2320
							}

							return 1; // L: 2322
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2325
							if (WorldMapRegion.friendsChat != null) { // L: 2326
								WorldMapRegion.friendsChat.addComparator(new UserComparator2(var7)); // L: 2327
							}

							return 1; // L: 2329
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2332
							if (WorldMapRegion.friendsChat != null) { // L: 2333
								WorldMapRegion.friendsChat.addComparator(new UserComparator3(var7)); // L: 2334
							}

							return 1; // L: 2336
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2339
							if (WorldMapRegion.friendsChat != null) { // L: 2340
								WorldMapRegion.friendsChat.addComparator(new UserComparator4(var7)); // L: 2341
							}

							return 1; // L: 2343
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2346
							if (WorldMapRegion.friendsChat != null) { // L: 2347
								WorldMapRegion.friendsChat.addComparator(new UserComparator5(var7)); // L: 2348
							}

							return 1; // L: 2350
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2353
							if (WorldMapRegion.friendsChat != null) { // L: 2354
								WorldMapRegion.friendsChat.addComparator(new UserComparator6(var7)); // L: 2355
							}

							return 1; // L: 2357
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2360
							if (WorldMapRegion.friendsChat != null) { // L: 2361
								WorldMapRegion.friendsChat.addComparator(new UserComparator7(var7)); // L: 2362
							}

							return 1; // L: 2364
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2367
							if (WorldMapRegion.friendsChat != null) { // L: 2368
								WorldMapRegion.friendsChat.addComparator(new UserComparator8(var7)); // L: 2369
							}

							return 1; // L: 2371
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2374
							if (WorldMapRegion.friendsChat != null) { // L: 2375
								WorldMapRegion.friendsChat.addComparator(new UserComparator9(var7)); // L: 2376
							}

							return 1; // L: 2378
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2381
							if (WorldMapRegion.friendsChat != null) { // L: 2382
								WorldMapRegion.friendsChat.addComparator(new UserComparator10(var7)); // L: 2383
							}

							return 1; // L: 2385
						} else if (var0 == 3655) {
							if (WorldMapRegion.friendsChat != null) { // L: 2388
								WorldMapRegion.friendsChat.sort(); // L: 2389
							}

							return 1; // L: 2391
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2394
							NetSocket.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2395
							return 1; // L: 2396
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2399
							if (WorldMapRegion.friendsChat != null) { // L: 2400
								WorldMapRegion.friendsChat.addComparator(new BuddyRankComparator(var7)); // L: 2401
							}

							return 1; // L: 2403
						} else {
							return 2; // L: 2405
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2228
					if (WorldMapRegion.friendsChat != null && var3 < WorldMapRegion.friendsChat.getSize() && ((ClanMate)WorldMapRegion.friendsChat.get(var3)).isIgnored()) { // L: 2229
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 2230
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2232
					}

					return 1; // L: 2233
				}
			}
		}
	}
}
