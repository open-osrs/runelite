import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kw")
public class class304 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1682823323"
	)
	static int method5528(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2604
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2605
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2606
			return 1; // L: 2607
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2609
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2610
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2611
			return 1; // L: 2612
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2614
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2615
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2616
			return 1; // L: 2617
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2619
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2620
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2621
			return 1; // L: 2622
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2624
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2625
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2626
			return 1; // L: 2627
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2629
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2630
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2631
			return 1; // L: 2632
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2634
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2635
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2636
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2637
				return 1; // L: 2638
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2640
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2641
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2642
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2643
				return 1; // L: 2644
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2646
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2647
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2648
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2649
				return 1; // L: 2650
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2652
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2653
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2654
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2655
				return 1; // L: 2656
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2658
					var12 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2659
					if (BuddyRankComparator.grandExchangeEvents != null) { // L: 2660
						BuddyRankComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2661
					}

					return 1; // L: 2663
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2665
					var12 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2666
					if (BuddyRankComparator.grandExchangeEvents != null) { // L: 2667
						BuddyRankComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2668
					}

					return 1; // L: 2670
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2672
					class44.Interpreter_intStackSize -= 2; // L: 2673
					var12 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] == 1; // L: 2674
					boolean var11 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] == 1; // L: 2675
					if (BuddyRankComparator.grandExchangeEvents != null) { // L: 2676
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2677
						BuddyRankComparator.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2678
					}

					return 1; // L: 2680
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2682
					var12 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2683
					if (BuddyRankComparator.grandExchangeEvents != null) { // L: 2684
						BuddyRankComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2685
					}

					return 1; // L: 2687
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2689
					var12 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 2690
					if (BuddyRankComparator.grandExchangeEvents != null) { // L: 2691
						BuddyRankComparator.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2692
					}

					return 1; // L: 2694
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2696
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = BuddyRankComparator.grandExchangeEvents == null ? 0 : BuddyRankComparator.grandExchangeEvents.events.size(); // L: 2697
					return 1; // L: 2698
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2700
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2701
						var4 = (GrandExchangeEvent)BuddyRankComparator.grandExchangeEvents.events.get(var3); // L: 2702
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.world; // L: 2703
						return 1; // L: 2704
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2706
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2707
						var4 = (GrandExchangeEvent)BuddyRankComparator.grandExchangeEvents.events.get(var3); // L: 2708
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2709
						return 1; // L: 2710
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2712
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2713
						var4 = (GrandExchangeEvent)BuddyRankComparator.grandExchangeEvents.events.get(var3); // L: 2714
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2715
						return 1; // L: 2716
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2718
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2719
						var4 = (GrandExchangeEvent)BuddyRankComparator.grandExchangeEvents.events.get(var3); // L: 2720
						long var5 = ObjectComposition.currentTimeMillis() - Widget.field3099 - var4.age; // L: 2721
						int var7 = (int)(var5 / 3600000L); // L: 2722
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2723
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2724
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2725
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10; // L: 2726
						return 1; // L: 2727
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2729
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2730
						var4 = (GrandExchangeEvent)BuddyRankComparator.grandExchangeEvents.events.get(var3); // L: 2731
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2732
						return 1; // L: 2733
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2735
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2736
						var4 = (GrandExchangeEvent)BuddyRankComparator.grandExchangeEvents.events.get(var3); // L: 2737
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2738
						return 1; // L: 2739
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2741
						var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2742
						var4 = (GrandExchangeEvent)BuddyRankComparator.grandExchangeEvents.events.get(var3); // L: 2743
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2744
						return 1; // L: 2745
					} else {
						return 2; // L: 2747
					}
				}
			}
		}
	}
}
