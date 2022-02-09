import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lf")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 658311943
	)
	static int field3948;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lld;Lld;I)I",
		garbageValue = "-1656511923"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "2040028636"
	)
	static int method5724(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2506
			if (UserComparator7.guestClanSettings != null) { // L: 2507
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2508
				WorldMapSection0.field2713 = UserComparator7.guestClanSettings; // L: 2509
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2511
			}

			return 1; // L: 2512
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2514
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2515
				if (Client.currentClanSettings[var3] != null) { // L: 2516
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2517
					WorldMapSection0.field2713 = Client.currentClanSettings[var3]; // L: 2518
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2520
				}

				return 1; // L: 2521
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2523
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = WorldMapSection0.field2713.name; // L: 2524
				return 1; // L: 2525
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2527
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.allowGuests ? 1 : 0; // L: 2528
				return 1; // L: 2529
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2531
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.field1593; // L: 2532
				return 1; // L: 2533
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2535
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.field1594; // L: 2536
				return 1; // L: 2537
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2539
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.field1595; // L: 2540
				return 1; // L: 2541
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2543
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.field1596; // L: 2544
				return 1; // L: 2545
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2547
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.memberCount; // L: 2548
				return 1; // L: 2549
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2551
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2552
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = WorldMapSection0.field2713.memberNames[var3]; // L: 2553
				return 1; // L: 2554
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2556
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2557
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.memberRanks[var3]; // L: 2558
				return 1; // L: 2559
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2561
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.bannedMemberCount; // L: 2562
				return 1; // L: 2563
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2565
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2566
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = WorldMapSection0.field2713.bannedMemberNames[var3]; // L: 2567
				return 1; // L: 2568
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2570
					Interpreter.Interpreter_intStackSize -= 3; // L: 2571
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2572
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2573
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2574
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.method2849(var3, var6, var5); // L: 2575
					return 1; // L: 2576
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2578
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.currentOwner; // L: 2579
					return 1; // L: 2580
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2582
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.field1591; // L: 2583
					return 1; // L: 2584
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2586
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.method2848(Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]); // L: 2587
					return 1; // L: 2588
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2590
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 2591
					return 1; // L: 2592
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2594
					Interpreter.Interpreter_intStackSize -= 2; // L: 2595
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2596
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2597
					class117.method2654(var6, var3); // L: 2598
					return 1; // L: 2599
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2601
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2602
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.field1602[var3]; // L: 2603
					return 1; // L: 2604
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2606
						Interpreter.Interpreter_intStackSize -= 3; // L: 2607
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2608
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 2609
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2610
						HealthBarDefinition.method3225(var5, var3, var4); // L: 2611
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2613
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2614
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.field2713.field1611[var3] ? 1 : 0; // L: 2615
						return 1; // L: 2616
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2618
						if (InterfaceParent.guestClanChannel != null) { // L: 2619
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2620
							class13.field78 = InterfaceParent.guestClanChannel; // L: 2621
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2623
						}

						return 1; // L: 2624
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2626
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2627
						if (Client.currentClanChannels[var3] != null) { // L: 2628
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2629
							class13.field78 = Client.currentClanChannels[var3]; // L: 2630
							Decimator.field412 = var3; // L: 2631
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2633
						}

						return 1; // L: 2634
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2636
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = class13.field78.name; // L: 2637
						return 1; // L: 2638
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2640
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class13.field78.field1658; // L: 2641
						return 1; // L: 2642
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2644
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class13.field78.field1656; // L: 2645
						return 1; // L: 2646
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2648
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class13.field78.method2982(); // L: 2649
						return 1; // L: 2650
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2652
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2653
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class13.field78.members.get(var3)).username.getName(); // L: 2654
						return 1; // L: 2655
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2657
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2658
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class13.field78.members.get(var3)).rank; // L: 2659
						return 1; // L: 2660
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2662
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2663
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class13.field78.members.get(var3)).world; // L: 2664
						return 1; // L: 2665
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2667
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2668
						StructComposition.method3410(Decimator.field412, var3); // L: 2669
						return 1; // L: 2670
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2672
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class13.field78.method2984(Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]); // L: 2673
						return 1; // L: 2674
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2676
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class13.field78.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 2677
						return 1; // L: 2678
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2680
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class221.field2680 != null ? 1 : 0; // L: 2681
						return 1; // L: 2682
					} else {
						return 2; // L: 2684
					}
				}
			}
		}
	}
}
