import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jv")
public class class281 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-1059362880"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "0"
	)
	static int method5204(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2637
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2638
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2639
			return 1; // L: 2640
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2642
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2643
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2644
			return 1; // L: 2645
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2647
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2648
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2649
			return 1; // L: 2650
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2652
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2653
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2654
			return 1; // L: 2655
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2657
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2658
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2659
			return 1; // L: 2660
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2662
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2663
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2664
			return 1; // L: 2665
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2667
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2668
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2669
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2670
				return 1; // L: 2671
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2673
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2674
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2675
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2676
				return 1; // L: 2677
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2679
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2680
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2681
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2682
				return 1; // L: 2683
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2685
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2686
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2687
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2688
				return 1; // L: 2689
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2691
					var12 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2692
					if (class267.grandExchangeEvents != null) { // L: 2693
						class267.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2694
					}

					return 1; // L: 2696
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2698
					var12 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2699
					if (class267.grandExchangeEvents != null) { // L: 2700
						class267.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2701
					}

					return 1; // L: 2703
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2705
					ChatChannel.Interpreter_intStackSize -= 2; // L: 2706
					var12 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] == 1; // L: 2707
					boolean var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1; // L: 2708
					if (class267.grandExchangeEvents != null) { // L: 2709
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2710
						class267.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2711
					}

					return 1; // L: 2713
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2715
					var12 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2716
					if (class267.grandExchangeEvents != null) { // L: 2717
						class267.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2718
					}

					return 1; // L: 2720
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2722
					var12 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2723
					if (class267.grandExchangeEvents != null) { // L: 2724
						class267.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2725
					}

					return 1; // L: 2727
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2729
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class267.grandExchangeEvents == null ? 0 : class267.grandExchangeEvents.events.size(); // L: 2730
					return 1; // L: 2731
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2733
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2734
						var4 = (GrandExchangeEvent)class267.grandExchangeEvents.events.get(var3); // L: 2735
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.world; // L: 2736
						return 1; // L: 2737
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2739
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2740
						var4 = (GrandExchangeEvent)class267.grandExchangeEvents.events.get(var3); // L: 2741
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2742
						return 1; // L: 2743
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2745
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2746
						var4 = (GrandExchangeEvent)class267.grandExchangeEvents.events.get(var3); // L: 2747
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2748
						return 1; // L: 2749
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2751
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2752
						var4 = (GrandExchangeEvent)class267.grandExchangeEvents.events.get(var3); // L: 2753
						long var5 = ClientPacket.currentTimeMillis() - WorldMapEvent.field2150 - var4.age; // L: 2754
						int var7 = (int)(var5 / 3600000L); // L: 2755
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2756
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2757
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2758
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var10; // L: 2759
						return 1; // L: 2760
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2762
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2763
						var4 = (GrandExchangeEvent)class267.grandExchangeEvents.events.get(var3); // L: 2764
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2765
						return 1; // L: 2766
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2768
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2769
						var4 = (GrandExchangeEvent)class267.grandExchangeEvents.events.get(var3); // L: 2770
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2771
						return 1; // L: 2772
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2774
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2775
						var4 = (GrandExchangeEvent)class267.grandExchangeEvents.events.get(var3); // L: 2776
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2777
						return 1; // L: 2778
					} else {
						return 2; // L: 2780
					}
				}
			}
		}
	}
}
