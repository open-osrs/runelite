import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ld")
public final class class332 {
	@ObfuscatedName("c")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("b")
	static long[] field4013;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4013 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4013.length; ++var0) { // L: 8
			field4013[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZS)I",
		garbageValue = "7484"
	)
	static int method6184(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2499
			if (class222.guestClanSettings != null) { // L: 2500
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 2501
				Friend.field4084 = class222.guestClanSettings; // L: 2502
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2504
			}

			return 1; // L: 2505
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2507
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2508
				if (Client.currentClanSettings[var3] != null) { // L: 2509
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 2510
					Friend.field4084 = Client.currentClanSettings[var3]; // L: 2511
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2513
				}

				return 1; // L: 2514
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2516
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Friend.field4084.name; // L: 2517
				return 1; // L: 2518
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2520
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.allowGuests ? 1 : 0; // L: 2521
				return 1; // L: 2522
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2524
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1567; // L: 2525
				return 1; // L: 2526
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2528
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1568; // L: 2529
				return 1; // L: 2530
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2532
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1569; // L: 2533
				return 1; // L: 2534
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2536
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1570; // L: 2537
				return 1; // L: 2538
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2540
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.memberCount; // L: 2541
				return 1; // L: 2542
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2544
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2545
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Friend.field4084.memberNames[var3]; // L: 2546
				return 1; // L: 2547
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2549
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2550
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.memberRanks[var3]; // L: 2551
				return 1; // L: 2552
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2554
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.bannedMemberCount; // L: 2555
				return 1; // L: 2556
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2558
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2559
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Friend.field4084.bannedMemberNames[var3]; // L: 2560
				return 1; // L: 2561
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2563
					IsaacCipher.Interpreter_intStackSize -= 3; // L: 2564
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2565
					var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2566
					var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 2567
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.method2847(var3, var6, var5); // L: 2568
					return 1; // L: 2569
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2571
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.currentOwner; // L: 2572
					return 1; // L: 2573
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2575
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1579; // L: 2576
					return 1; // L: 2577
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2579
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.method2881(Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 2580
					return 1; // L: 2581
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2583
					Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.getSortedMembers()[Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]]; // L: 2584
					return 1; // L: 2585
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2587
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 2588
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2589
					var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2590
					class113.method2617(var6, var3); // L: 2591
					return 1; // L: 2592
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2594
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2595
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1582[var3]; // L: 2596
					return 1; // L: 2597
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2599
						IsaacCipher.Interpreter_intStackSize -= 3; // L: 2600
						var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2601
						boolean var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] == 1; // L: 2602
						var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 2603
						class6.method48(var5, var3, var4); // L: 2604
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2606
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2607
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1577[var3] ? 1 : 0; // L: 2608
						return 1; // L: 2609
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2611
						if (UserComparator5.guestClanChannel != null) { // L: 2612
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 2613
							class1.field0 = UserComparator5.guestClanChannel; // L: 2614
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2616
						}

						return 1; // L: 2617
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2619
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2620
						if (Client.currentClanChannels[var3] != null) { // L: 2621
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 2622
							class1.field0 = Client.currentClanChannels[var3]; // L: 2623
							Interpreter.field812 = var3; // L: 2624
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2626
						}

						return 1; // L: 2627
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2629
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class1.field0.name; // L: 2630
						return 1; // L: 2631
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2633
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.field1643; // L: 2634
						return 1; // L: 2635
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2637
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.field1636; // L: 2638
						return 1; // L: 2639
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2641
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.method2990(); // L: 2642
						return 1; // L: 2643
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2645
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2646
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class1.field0.members.get(var3)).username.getName(); // L: 2647
						return 1; // L: 2648
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2650
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2651
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((ClanChannelMember)class1.field0.members.get(var3)).rank; // L: 2652
						return 1; // L: 2653
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2655
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2656
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((ClanChannelMember)class1.field0.members.get(var3)).world; // L: 2657
						return 1; // L: 2658
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2660
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2661
						class135.method2831(Interpreter.field812, var3); // L: 2662
						return 1; // L: 2663
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2665
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.method2991(Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 2666
						return 1; // L: 2667
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2669
						Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.getSortedMembers()[Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]]; // L: 2670
						return 1; // L: 2671
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2673
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = BuddyRankComparator.field1342 != null ? 1 : 0; // L: 2674
						return 1; // L: 2675
					} else {
						return 2; // L: 2677
					}
				}
			}
		}
	}
}
