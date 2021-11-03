import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nu")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("s")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([Lny;I)Ljava/util/HashMap;",
		garbageValue = "-870343448"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap(); // L: 20
		FontName[] var3 = var1; // L: 22

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 23
			FontName var5 = var3[var4]; // L: 24
			if (this.map.containsKey(var5)) { // L: 26
				var2.put(var5, this.map.get(var5)); // L: 27
			} else {
				Font var6 = UserComparator1.method7234(this.spritesArchive, this.fontsArchive, var5.name, ""); // L: 30
				if (var6 != null) { // L: 31
					this.map.put(var5, var6); // L: 32
					var2.put(var5, var6); // L: 33
				}
			}
		}

		return var2; // L: 39
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "31"
	)
	static int method6687(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2684
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2685
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2686
			return 1; // L: 2687
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2689
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2690
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2691
			return 1; // L: 2692
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2694
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2695
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2696
			return 1; // L: 2697
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2699
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2700
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2701
			return 1; // L: 2702
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2704
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2705
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2706
			return 1; // L: 2707
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2709
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2710
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2711
			return 1; // L: 2712
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2714
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2715
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2716
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2717
				return 1; // L: 2718
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2720
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2721
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2722
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2723
				return 1; // L: 2724
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2726
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2727
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2728
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2729
				return 1; // L: 2730
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2732
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2733
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2734
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2735
				return 1; // L: 2736
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2738
					var12 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2739
					if (JagexCache.grandExchangeEvents != null) { // L: 2740
						JagexCache.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2741
					}

					return 1; // L: 2743
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2745
					var12 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2746
					if (JagexCache.grandExchangeEvents != null) { // L: 2747
						JagexCache.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2748
					}

					return 1; // L: 2750
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2752
					class14.Interpreter_intStackSize -= 2; // L: 2753
					var12 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] == 1; // L: 2754
					boolean var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1; // L: 2755
					if (JagexCache.grandExchangeEvents != null) { // L: 2756
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2757
						JagexCache.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2758
					}

					return 1; // L: 2760
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2762
					var12 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2763
					if (JagexCache.grandExchangeEvents != null) { // L: 2764
						JagexCache.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2765
					}

					return 1; // L: 2767
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2769
					var12 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 2770
					if (JagexCache.grandExchangeEvents != null) { // L: 2771
						JagexCache.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2772
					}

					return 1; // L: 2774
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2776
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = JagexCache.grandExchangeEvents == null ? 0 : JagexCache.grandExchangeEvents.events.size(); // L: 2777
					return 1; // L: 2778
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2780
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2781
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3); // L: 2782
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.world; // L: 2783
						return 1; // L: 2784
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2786
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2787
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3); // L: 2788
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2789
						return 1; // L: 2790
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2792
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2793
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3); // L: 2794
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2795
						return 1; // L: 2796
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2798
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2799
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3); // L: 2800
						long var5 = class111.method2516() - GrandExchangeOfferUnitPriceComparator.field3758 - var4.age; // L: 2801
						int var7 = (int)(var5 / 3600000L); // L: 2802
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2803
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2804
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2805
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var10; // L: 2806
						return 1; // L: 2807
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2809
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2810
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3); // L: 2811
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2812
						return 1; // L: 2813
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2815
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2816
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3); // L: 2817
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2818
						return 1; // L: 2819
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2821
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2822
						var4 = (GrandExchangeEvent)JagexCache.grandExchangeEvents.events.get(var3); // L: 2823
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2824
						return 1; // L: 2825
					} else {
						return 2; // L: 2827
					}
				}
			}
		}
	}
}
