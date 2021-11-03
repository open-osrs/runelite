import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("el")
public class class139 extends class132 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("i")
	String field1526;
	@ObfuscatedName("w")
	byte field1527;
	@ObfuscatedName("s")
	byte field1528;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class139(class133 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1393452113"
	)
	void vmethod2839(Buffer var1) {
		this.field1526 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1526 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1527 = var1.readByte(); // L: 161
			this.field1528 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1714930149"
	)
	void vmethod2838(ClanChannel var1) {
		var1.name = this.field1526; // L: 167
		if (this.field1526 != null) { // L: 168
			var1.field1516 = this.field1527; // L: 169
			var1.field1511 = this.field1528; // L: 170
		}

	} // L: 172

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-907104971"
	)
	static int method2837(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2133
			if (class112.friendSystem.field765 == 0) { // L: 2134
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -2;
			} else if (class112.friendSystem.field765 == 1) { // L: 2135
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class112.friendSystem.friendsList.getSize(); // L: 2136
			}

			return 1; // L: 2137
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2140
				if (class112.friendSystem.method1757() && var3 >= 0 && var3 < class112.friendSystem.friendsList.getSize()) { // L: 2141
					Friend var8 = (Friend)class112.friendSystem.friendsList.get(var3); // L: 2142
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2143
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2144
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 2147
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 2148
				}

				return 1; // L: 2150
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2153
				if (class112.friendSystem.method1757() && var3 >= 0 && var3 < class112.friendSystem.friendsList.getSize()) { // L: 2154
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((Buddy)class112.friendSystem.friendsList.get(var3)).world; // L: 2155
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2157
				}

				return 1; // L: 2158
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2161
				if (class112.friendSystem.method1757() && var3 >= 0 && var3 < class112.friendSystem.friendsList.getSize()) { // L: 2162
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((Buddy)class112.friendSystem.friendsList.get(var3)).rank; // L: 2163
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2165
				}

				return 1; // L: 2166
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2169
					int var6 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2170
					class11.method107(var5, var6); // L: 2171
					return 1; // L: 2172
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2175
					class112.friendSystem.addFriend(var5); // L: 2176
					return 1; // L: 2177
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2180
					class112.friendSystem.removeFriend(var5); // L: 2181
					return 1; // L: 2182
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2185
					class112.friendSystem.addIgnore(var5); // L: 2186
					return 1; // L: 2187
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2190
					class112.friendSystem.removeIgnore(var5); // L: 2191
					return 1; // L: 2192
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2195
					var5 = WallDecoration.method4643(var5); // L: 2196
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class112.friendSystem.isFriended(new Username(var5, GrandExchangeOfferUnitPriceComparator.loginType), false) ? 1 : 0; // L: 2197
					return 1; // L: 2198
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (AbstractArchive.friendsChat != null) { // L: 2201
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = AbstractArchive.friendsChat.name; // L: 2202
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 2204
					}

					return 1; // L: 2205
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (AbstractArchive.friendsChat != null) { // L: 2208
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = AbstractArchive.friendsChat.getSize(); // L: 2209
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2211
					}

					return 1; // L: 2212
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2215
					if (AbstractArchive.friendsChat != null && var3 < AbstractArchive.friendsChat.getSize()) { // L: 2216
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = AbstractArchive.friendsChat.get(var3).getUsername().getName(); // L: 2217
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 2219
					}

					return 1; // L: 2220
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2223
					if (AbstractArchive.friendsChat != null && var3 < AbstractArchive.friendsChat.getSize()) { // L: 2224
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((Buddy)AbstractArchive.friendsChat.get(var3)).getWorld(); // L: 2225
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2227
					}

					return 1; // L: 2228
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2231
					if (AbstractArchive.friendsChat != null && var3 < AbstractArchive.friendsChat.getSize()) { // L: 2232
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((Buddy)AbstractArchive.friendsChat.get(var3)).rank; // L: 2233
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2235
					}

					return 1; // L: 2236
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = AbstractArchive.friendsChat != null ? AbstractArchive.friendsChat.minKick : 0; // L: 2239
					return 1; // L: 2240
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2243
					Player.clanKickUser(var5); // L: 2244
					return 1; // L: 2245
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = AbstractArchive.friendsChat != null ? AbstractArchive.friendsChat.rank * 1093956825 * 1525992297 : 0; // L: 2248
					return 1; // L: 2249
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2252
					GrandExchangeOfferOwnWorldComparator.Clan_joinChat(var5); // L: 2253
					return 1; // L: 2254
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class21.Clan_leaveChat(); // L: 2257
					return 1; // L: 2258
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class112.friendSystem.method1757()) { // L: 2261
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class112.friendSystem.ignoreList.getSize(); // L: 2262
					}

					return 1; // L: 2263
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2266
					if (class112.friendSystem.method1757() && var3 >= 0 && var3 < class112.friendSystem.ignoreList.getSize()) { // L: 2267
						Ignored var4 = (Ignored)class112.friendSystem.ignoreList.get(var3); // L: 2268
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2269
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2270
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 2273
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 2274
					}

					return 1; // L: 2276
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]; // L: 2279
					var5 = WallDecoration.method4643(var5); // L: 2280
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class112.friendSystem.isIgnored(new Username(var5, GrandExchangeOfferUnitPriceComparator.loginType)) ? 1 : 0; // L: 2281
					return 1; // L: 2282
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2285
					if (AbstractArchive.friendsChat != null && var3 < AbstractArchive.friendsChat.getSize() && AbstractArchive.friendsChat.get(var3).getUsername().equals(HealthBarDefinition.localPlayer.username)) { // L: 2286
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 2287
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2289
					}

					return 1; // L: 2290
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (AbstractArchive.friendsChat != null && AbstractArchive.friendsChat.owner != null) { // L: 2293
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = AbstractArchive.friendsChat.owner; // L: 2294
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 2296
					}

					return 1; // L: 2297
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2300
					if (AbstractArchive.friendsChat != null && var3 < AbstractArchive.friendsChat.getSize() && ((ClanMate)AbstractArchive.friendsChat.get(var3)).isFriend()) { // L: 2301
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 2302
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2304
					}

					return 1; // L: 2305
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class112.friendSystem.friendsList.removeComparator(); // L: 2316
						return 1; // L: 2317
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2320
							class112.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2321
							return 1; // L: 2322
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2325
							class112.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2326
							return 1; // L: 2327
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2330
							class112.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2331
							return 1; // L: 2332
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2335
							class112.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2336
							return 1; // L: 2337
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2340
							class112.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2341
							return 1; // L: 2342
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2345
							class112.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2346
							return 1; // L: 2347
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2350
							class112.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2351
							return 1; // L: 2352
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2355
							class112.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2356
							return 1; // L: 2357
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2360
							class112.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2361
							return 1; // L: 2362
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2365
							class112.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2366
							return 1; // L: 2367
						} else if (var0 == 3639) {
							class112.friendSystem.friendsList.sort(); // L: 2370
							return 1; // L: 2371
						} else if (var0 == 3640) {
							class112.friendSystem.ignoreList.removeComparator(); // L: 2374
							return 1; // L: 2375
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2378
							class112.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2379
							return 1; // L: 2380
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2383
							class112.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2384
							return 1; // L: 2385
						} else if (var0 == 3643) {
							class112.friendSystem.ignoreList.sort(); // L: 2388
							return 1; // L: 2389
						} else if (var0 == 3644) {
							if (AbstractArchive.friendsChat != null) { // L: 2392
								AbstractArchive.friendsChat.removeComparator(); // L: 2393
							}

							return 1; // L: 2395
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2398
							if (AbstractArchive.friendsChat != null) { // L: 2399
								AbstractArchive.friendsChat.addComparator(new UserComparator1(var7)); // L: 2400
							}

							return 1; // L: 2402
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2405
							if (AbstractArchive.friendsChat != null) { // L: 2406
								AbstractArchive.friendsChat.addComparator(new UserComparator2(var7)); // L: 2407
							}

							return 1; // L: 2409
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2412
							if (AbstractArchive.friendsChat != null) { // L: 2413
								AbstractArchive.friendsChat.addComparator(new UserComparator3(var7)); // L: 2414
							}

							return 1; // L: 2416
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2419
							if (AbstractArchive.friendsChat != null) { // L: 2420
								AbstractArchive.friendsChat.addComparator(new UserComparator4(var7)); // L: 2421
							}

							return 1; // L: 2423
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2426
							if (AbstractArchive.friendsChat != null) { // L: 2427
								AbstractArchive.friendsChat.addComparator(new UserComparator5(var7)); // L: 2428
							}

							return 1; // L: 2430
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2433
							if (AbstractArchive.friendsChat != null) { // L: 2434
								AbstractArchive.friendsChat.addComparator(new UserComparator6(var7)); // L: 2435
							}

							return 1; // L: 2437
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2440
							if (AbstractArchive.friendsChat != null) { // L: 2441
								AbstractArchive.friendsChat.addComparator(new UserComparator7(var7)); // L: 2442
							}

							return 1; // L: 2444
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2447
							if (AbstractArchive.friendsChat != null) { // L: 2448
								AbstractArchive.friendsChat.addComparator(new UserComparator8(var7)); // L: 2449
							}

							return 1; // L: 2451
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2454
							if (AbstractArchive.friendsChat != null) { // L: 2455
								AbstractArchive.friendsChat.addComparator(new UserComparator9(var7)); // L: 2456
							}

							return 1; // L: 2458
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2461
							if (AbstractArchive.friendsChat != null) { // L: 2462
								AbstractArchive.friendsChat.addComparator(new UserComparator10(var7)); // L: 2463
							}

							return 1; // L: 2465
						} else if (var0 == 3655) {
							if (AbstractArchive.friendsChat != null) { // L: 2468
								AbstractArchive.friendsChat.sort(); // L: 2469
							}

							return 1; // L: 2471
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2474
							class112.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2475
							return 1; // L: 2476
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2479
							if (AbstractArchive.friendsChat != null) { // L: 2480
								AbstractArchive.friendsChat.addComparator(new BuddyRankComparator(var7)); // L: 2481
							}

							return 1; // L: 2483
						} else {
							return 2; // L: 2485
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2308
					if (AbstractArchive.friendsChat != null && var3 < AbstractArchive.friendsChat.getSize() && ((ClanMate)AbstractArchive.friendsChat.get(var3)).isIgnored()) { // L: 2309
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 2310
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2312
					}

					return 1; // L: 2313
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1892812009"
	)
	static int method2845(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4340
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4344
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4348
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4352
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4356
							if (var0 != 7031 && var0 != 7032) { // L: 4360
								if (var0 == 7033) { // L: 4365
									--class295.Interpreter_stringStackSize; // L: 4366
									return 1; // L: 4367
								} else if (var0 != 7036 && var0 != 7037) { // L: 4369
									if (var0 == 7038) { // L: 4373
										--class14.Interpreter_intStackSize; // L: 4374
										return 1; // L: 4375
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4377
										return 2; // L: 4381
									} else {
										--class14.Interpreter_intStackSize; // L: 4378
										return 1; // L: 4379
									}
								} else {
									class14.Interpreter_intStackSize -= 2; // L: 4370
									return 1; // L: 4371
								}
							} else {
								--class295.Interpreter_stringStackSize; // L: 4361
								--class14.Interpreter_intStackSize; // L: 4362
								return 1; // L: 4363
							}
						} else {
							--class14.Interpreter_intStackSize; // L: 4357
							return 1; // L: 4358
						}
					} else {
						class14.Interpreter_intStackSize -= 2; // L: 4353
						return 1; // L: 4354
					}
				} else {
					class14.Interpreter_intStackSize -= 2; // L: 4349
					return 1; // L: 4350
				}
			} else {
				class14.Interpreter_intStackSize -= 3; // L: 4345
				return 1; // L: 4346
			}
		} else {
			class14.Interpreter_intStackSize -= 5; // L: 4341
			return 1; // L: 4342
		}
	}
}
