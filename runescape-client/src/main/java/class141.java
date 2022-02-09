import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
public class class141 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 3417280475220638637L
	)
	long field1633;
	@ObfuscatedName("l")
	String field1634;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 392397209
	)
	int field1632;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class141(class129 var1) {
		this.this$0 = var1;
		this.field1633 = -1L; // L: 93
		this.field1634 = null; // L: 94
		this.field1632 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1633 = var1.readLong(); // L: 102
		}

		this.field1634 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1632 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2859(this.field1633, this.field1634, this.field1632); // L: 109
	} // L: 110

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "810169814"
	)
	static int method2942(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "363387027"
	)
	static int method2944(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2688
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2689
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2690
			return 1; // L: 2691
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2693
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2694
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2695
			return 1; // L: 2696
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2698
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2699
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2700
			return 1; // L: 2701
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2703
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2704
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2705
			return 1; // L: 2706
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2708
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2709
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2710
			return 1; // L: 2711
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2713
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2714
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2715
			return 1; // L: 2716
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2718
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2719
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2720
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2721
				return 1; // L: 2722
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2724
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2725
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2726
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2727
				return 1; // L: 2728
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2730
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2731
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2732
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2733
				return 1; // L: 2734
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2736
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2737
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2738
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2739
				return 1; // L: 2740
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2742
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2743
					if (class135.grandExchangeEvents != null) { // L: 2744
						class135.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2745
					}

					return 1; // L: 2747
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2749
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2750
					if (class135.grandExchangeEvents != null) { // L: 2751
						class135.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2752
					}

					return 1; // L: 2754
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2756
					Interpreter.Interpreter_intStackSize -= 2; // L: 2757
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 2758
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 2759
					if (class135.grandExchangeEvents != null) { // L: 2760
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2761
						class135.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2762
					}

					return 1; // L: 2764
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2766
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2767
					if (class135.grandExchangeEvents != null) { // L: 2768
						class135.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2769
					}

					return 1; // L: 2771
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2773
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2774
					if (class135.grandExchangeEvents != null) { // L: 2775
						class135.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2776
					}

					return 1; // L: 2778
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2780
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class135.grandExchangeEvents == null ? 0 : class135.grandExchangeEvents.events.size(); // L: 2781
					return 1; // L: 2782
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2784
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2785
						var4 = (GrandExchangeEvent)class135.grandExchangeEvents.events.get(var3); // L: 2786
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 2787
						return 1; // L: 2788
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2790
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2791
						var4 = (GrandExchangeEvent)class135.grandExchangeEvents.events.get(var3); // L: 2792
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2793
						return 1; // L: 2794
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2796
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2797
						var4 = (GrandExchangeEvent)class135.grandExchangeEvents.events.get(var3); // L: 2798
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2799
						return 1; // L: 2800
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2802
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2803
						var4 = (GrandExchangeEvent)class135.grandExchangeEvents.events.get(var3); // L: 2804
						long var5 = DirectByteArrayCopier.method5318() - class140.field1626 - var4.age; // L: 2805
						int var7 = (int)(var5 / 3600000L); // L: 2806
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2807
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2808
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2809
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var10; // L: 2810
						return 1; // L: 2811
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2813
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2814
						var4 = (GrandExchangeEvent)class135.grandExchangeEvents.events.get(var3); // L: 2815
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2816
						return 1; // L: 2817
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2819
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2820
						var4 = (GrandExchangeEvent)class135.grandExchangeEvents.events.get(var3); // L: 2821
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2822
						return 1; // L: 2823
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2825
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2826
						var4 = (GrandExchangeEvent)class135.grandExchangeEvents.events.get(var3); // L: 2827
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2828
						return 1; // L: 2829
					} else {
						return 2; // L: 2831
					}
				}
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIZI)V",
		garbageValue = "1099824756"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10331
		int var5 = var0.height; // L: 10332
		if (var0.widthAlignment == 0) { // L: 10333
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10334
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10335
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10336
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10337
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10338
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10339
			var0.width = var0.height * var0.field3281 / var0.field3282;
		}

		if (var0.heightAlignment == 4) { // L: 10340
			var0.height = var0.width * var0.field3282 / var0.field3281;
		}

		if (var0.contentType == 1337) { // L: 10341
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10342
			ScriptEvent var6 = new ScriptEvent(); // L: 10343
			var6.widget = var0; // L: 10344
			var6.args = var0.onResize; // L: 10345
			Client.scriptEvents.addFirst(var6); // L: 10346
		}

	} // L: 10348
}
