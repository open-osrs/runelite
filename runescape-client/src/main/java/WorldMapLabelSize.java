import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fp")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -1635992925
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 945036671
	)
	final int field1935;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2000938127
	)
	final int field1933;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -514580693
	)
	final int field1932;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field1935 = var1; // L: 19
		this.field1933 = var2; // L: 20
		this.field1932 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "535854948"
	)
	boolean method3215(float var1) {
		return var1 >= (float)this.field1932; // L: 25
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfp;",
		garbageValue = "368638280"
	)
	static WorldMapLabelSize[] method3221() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_large, WorldMapLabelSize_small}; // L: 15
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lfp;",
		garbageValue = "658176697"
	)
	static WorldMapLabelSize method3208(int var0) {
		WorldMapLabelSize[] var1 = method3221(); // L: 30

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 31
			WorldMapLabelSize var3 = var1[var2]; // L: 32
			if (var0 == var3.field1933) { // L: 34
				return var3; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(CLkk;B)I",
		garbageValue = "4"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public static int method3206() {
		return KeyHandler.KeyHandler_idleCycles; // L: 172
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1934362980"
	)
	static void method3218() {
		Login.loginIndex = 24; // L: 1653
		class260.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 1654
	} // L: 1655

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1091146417"
	)
	static int method3217(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2001
			class44.Interpreter_intStackSize -= 2; // L: 2002
			var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2003
			var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2004
			EnumComposition var10 = InterfaceParent.getEnum(var3); // L: 2005
			if (var10.outputType != 's') { // L: 2006
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2007
				if (var9 == var10.keys[var6]) { // L: 2008
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2009
					var10 = null; // L: 2010
					break;
				}
			}

			if (var10 != null) { // L: 2014
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2015
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2017
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2043
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2044
				EnumComposition var4 = InterfaceParent.getEnum(var3); // L: 2045
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.size(); // L: 2046
				return 1; // L: 2047
			} else {
				return 2; // L: 2049
			}
		} else {
			class44.Interpreter_intStackSize -= 4; // L: 2018
			var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2019
			var9 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2020
			int var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2021
			var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3]; // L: 2022
			EnumComposition var7 = InterfaceParent.getEnum(var5); // L: 2023
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2024
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2029
					if (var6 == var7.keys[var8]) { // L: 2030
						if (var9 == 115) { // L: 2031
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2032
						}

						var7 = null; // L: 2033
						break;
					}
				}

				if (var7 != null) { // L: 2037
					if (var9 == 115) { // L: 2038
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2039
					}
				}

				return 1; // L: 2041
			} else {
				if (var9 == 115) { // L: 2025
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2026
				}

				return 1; // L: 2027
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZS)I",
		garbageValue = "-12947"
	)
	static int method3219(int var0, Script var1, boolean var2) {
		if (var0 == 3800) { // L: 2422
			if (NPCComposition.guestClanSettings != null) { // L: 2423
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 2424
				class26.field220 = NPCComposition.guestClanSettings; // L: 2425
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2427
			}

			return 1; // L: 2428
		} else {
			int var3;
			if (var0 == 3801) { // L: 2430
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2431
				if (Client.currentClanSettings[var3] != null) { // L: 2432
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 2433
					class26.field220 = Client.currentClanSettings[var3]; // L: 2434
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2436
				}

				return 1; // L: 2437
			} else if (var0 == 3802) { // L: 2439
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class26.field220.name; // L: 2440
				return 1; // L: 2441
			} else if (var0 == 3803) { // L: 2443
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.allowGuests ? 1 : 0; // L: 2444
				return 1; // L: 2445
			} else if (var0 == 3804) { // L: 2447
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field103; // L: 2448
				return 1; // L: 2449
			} else if (var0 == 3805) { // L: 2451
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field113; // L: 2452
				return 1; // L: 2453
			} else if (var0 == 3806) { // L: 2455
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field98; // L: 2456
				return 1; // L: 2457
			} else if (var0 == 3807) { // L: 2459
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field96; // L: 2460
				return 1; // L: 2461
			} else if (var0 == 3809) { // L: 2463
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.memberCount; // L: 2464
				return 1; // L: 2465
			} else if (var0 == 3810) { // L: 2467
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2468
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class26.field220.memberNames[var3]; // L: 2469
				return 1; // L: 2470
			} else if (var0 == 3811) { // L: 2472
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2473
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.memberRanks[var3]; // L: 2474
				return 1; // L: 2475
			} else if (var0 == 3812) { // L: 2477
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.bannedMemberCount; // L: 2478
				return 1; // L: 2479
			} else if (var0 == 3813) { // L: 2481
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2482
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class26.field220.bannedMemberNames[var3]; // L: 2483
				return 1; // L: 2484
			} else {
				int var5;
				int var6;
				if (var0 == 3814) { // L: 2486
					class44.Interpreter_intStackSize -= 3; // L: 2487
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2488
					var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2489
					var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2490
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.method100(var3, var6, var5); // L: 2491
					return 1; // L: 2492
				} else if (var0 == 3815) { // L: 2494
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.currentOwner; // L: 2495
					return 1; // L: 2496
				} else if (var0 == 3816) { // L: 2498
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field99; // L: 2499
					return 1; // L: 2500
				} else if (var0 == 3817) { // L: 2502
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.method99(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 2503
					return 1; // L: 2504
				} else if (var0 == 3818) { // L: 2506
					Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1] = class26.field220.getSortedMembers()[Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1]]; // L: 2507
					return 1; // L: 2508
				} else if (var0 == 3819) { // L: 2510
					class44.Interpreter_intStackSize -= 2; // L: 2511
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2512
					var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2513
					class305.method5533(var6, var3); // L: 2514
					return 1; // L: 2515
				} else if (var0 == 3820) { // L: 2517
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2518
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field101[var3]; // L: 2519
					return 1; // L: 2520
				} else {
					if (var0 == 3821) { // L: 2522
						class44.Interpreter_intStackSize -= 3; // L: 2523
						var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2524
						boolean var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] == 1; // L: 2525
						var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2526
						class18.method216(var5, var3, var4); // L: 2527
					}

					if (var0 == 3822) { // L: 2529
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2530
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class26.field220.field108[var3] ? 1 : 0; // L: 2531
						return 1; // L: 2532
					} else if (var0 == 3850) { // L: 2534
						if (ApproximateRouteStrategy.guestClanChannel != null) { // L: 2535
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 2536
							ArchiveLoader.field1147 = ApproximateRouteStrategy.guestClanChannel; // L: 2537
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2539
						}

						return 1; // L: 2540
					} else if (var0 == 3851) { // L: 2542
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2543
						if (Client.currentClanChannels[var3] != null) { // L: 2544
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 2545
							ArchiveLoader.field1147 = Client.currentClanChannels[var3]; // L: 2546
							Interpreter.field982 = var3; // L: 2547
						} else {
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2549
						}

						return 1; // L: 2550
					} else if (var0 == 3852) { // L: 2552
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ArchiveLoader.field1147.name; // L: 2553
						return 1; // L: 2554
					} else if (var0 == 3853) { // L: 2556
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.field26; // L: 2557
						return 1; // L: 2558
					} else if (var0 == 3854) { // L: 2560
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.field32; // L: 2561
						return 1; // L: 2562
					} else if (var0 == 3855) { // L: 2564
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.method27(); // L: 2565
						return 1; // L: 2566
					} else if (var0 == 3856) { // L: 2568
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2569
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)ArchiveLoader.field1147.members.get(var3)).name; // L: 2570
						return 1; // L: 2571
					} else if (var0 == 3857) { // L: 2573
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2574
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((ClanChannelMember)ArchiveLoader.field1147.members.get(var3)).rank; // L: 2575
						return 1; // L: 2576
					} else if (var0 == 3858) { // L: 2578
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2579
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((ClanChannelMember)ArchiveLoader.field1147.members.get(var3)).world; // L: 2580
						return 1; // L: 2581
					} else if (var0 == 3859) { // L: 2583
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2584
						class1.method7(Interpreter.field982, var3); // L: 2585
						return 1; // L: 2586
					} else if (var0 == 3860) { // L: 2588
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.method30(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 2589
						return 1; // L: 2590
					} else if (var0 == 3861) { // L: 2592
						Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1] = ArchiveLoader.field1147.getSortedMembers()[Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1]]; // L: 2593
						return 1; // L: 2594
					} else if (var0 == 3890) { // L: 2596
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class34.field254 != null ? 1 : 0; // L: 2597
						return 1; // L: 2598
					} else {
						return 2; // L: 2600
					}
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-41"
	)
	static int method3209(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3120
			var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3121
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class260.ItemDefinition_get(var6).name; // L: 3122
			return 1; // L: 3123
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3125
				class44.Interpreter_intStackSize -= 2; // L: 3126
				var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3127
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3128
				var5 = class260.ItemDefinition_get(var6); // L: 3129
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) { // L: 3130
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3131
				}

				return 1; // L: 3132
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3134
				class44.Interpreter_intStackSize -= 2; // L: 3135
				var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3136
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3137
				var5 = class260.ItemDefinition_get(var6); // L: 3138
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3139
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3140
				}

				return 1; // L: 3141
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3143
				var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3144
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class260.ItemDefinition_get(var6).price; // L: 3145
				return 1; // L: 3146
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3148
				var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3149
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class260.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0; // L: 3150
				return 1; // L: 3151
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3153
					var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3154
					var7 = class260.ItemDefinition_get(var6); // L: 3155
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3156
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6; // L: 3157
					}

					return 1; // L: 3158
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3160
					var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3161
					var7 = class260.ItemDefinition_get(var6); // L: 3162
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3163
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6; // L: 3164
					}

					return 1; // L: 3165
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3167
					var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3168
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class260.ItemDefinition_get(var6).isMembersOnly ? 1 : 0; // L: 3169
					return 1; // L: 3170
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3172
					var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3173
					var7 = class260.ItemDefinition_get(var6); // L: 3174
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3175
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6; // L: 3176
					}

					return 1; // L: 3177
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3179
					var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3180
					var7 = class260.ItemDefinition_get(var6); // L: 3181
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3182
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var6; // L: 3183
					}

					return 1; // L: 3184
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3186
					String var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3187
					var4 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3188
					ObjectComposition.findItemDefinitions(var3, var4 == 1); // L: 3189
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ClanSettings.foundItemIdCount; // L: 3190
					return 1; // L: 3191
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3193
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3198
						Canvas.foundItemIndex = 0; // L: 3199
						return 1; // L: 3200
					} else {
						return 2; // L: 3202
					}
				} else {
					if (Clock.foundItemIds != null && Canvas.foundItemIndex < ClanSettings.foundItemIdCount) { // L: 3194
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Clock.foundItemIds[++Canvas.foundItemIndex - 1] & '\uffff'; // L: 3195
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3196
				}
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2028267498"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 10920
		ObjectComposition.clientPreferences.soundEffectsVolume = var0; // L: 10921
		TileItem.savePreferences(); // L: 10922
	} // L: 10923
}
