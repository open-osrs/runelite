import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ab")
public class class28 {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1911791095
	)
	static int field168;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-76"
	)
	static int method443(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2681
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2682
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2683
			return 1; // L: 2684
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2686
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2687
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2688
			return 1; // L: 2689
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2691
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2692
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2693
			return 1; // L: 2694
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2696
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2697
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2698
			return 1; // L: 2699
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2701
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2702
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2703
			return 1; // L: 2704
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2706
			var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2707
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2708
			return 1; // L: 2709
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2711
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2712
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2713
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2714
				return 1; // L: 2715
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2717
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2718
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2719
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2720
				return 1; // L: 2721
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2723
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2724
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2725
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2726
				return 1; // L: 2727
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2729
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2730
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2731
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2732
				return 1; // L: 2733
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2735
					var12 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2736
					if (Client.grandExchangeEvents != null) { // L: 2737
						Client.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2738
					}

					return 1; // L: 2740
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2742
					var12 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2743
					if (Client.grandExchangeEvents != null) { // L: 2744
						Client.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2745
					}

					return 1; // L: 2747
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2749
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 2750
					var12 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] == 1; // L: 2751
					boolean var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] == 1; // L: 2752
					if (Client.grandExchangeEvents != null) { // L: 2753
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2754
						Client.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2755
					}

					return 1; // L: 2757
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2759
					var12 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2760
					if (Client.grandExchangeEvents != null) { // L: 2761
						Client.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2762
					}

					return 1; // L: 2764
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2766
					var12 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 2767
					if (Client.grandExchangeEvents != null) { // L: 2768
						Client.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2769
					}

					return 1; // L: 2771
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2773
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.grandExchangeEvents == null ? 0 : Client.grandExchangeEvents.events.size(); // L: 2774
					return 1; // L: 2775
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2777
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2778
						var4 = (GrandExchangeEvent)Client.grandExchangeEvents.events.get(var3); // L: 2779
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.world; // L: 2780
						return 1; // L: 2781
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2783
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2784
						var4 = (GrandExchangeEvent)Client.grandExchangeEvents.events.get(var3); // L: 2785
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2786
						return 1; // L: 2787
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2789
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2790
						var4 = (GrandExchangeEvent)Client.grandExchangeEvents.events.get(var3); // L: 2791
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2792
						return 1; // L: 2793
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2795
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2796
						var4 = (GrandExchangeEvent)Client.grandExchangeEvents.events.get(var3); // L: 2797
						long var5 = Ignored.method6459() - WorldMapSprite.field2727 - var4.age; // L: 2798
						int var7 = (int)(var5 / 3600000L); // L: 2799
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2800
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2801
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2802
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var10; // L: 2803
						return 1; // L: 2804
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2806
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2807
						var4 = (GrandExchangeEvent)Client.grandExchangeEvents.events.get(var3); // L: 2808
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2809
						return 1; // L: 2810
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2812
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2813
						var4 = (GrandExchangeEvent)Client.grandExchangeEvents.events.get(var3); // L: 2814
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2815
						return 1; // L: 2816
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2818
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 2819
						var4 = (GrandExchangeEvent)Client.grandExchangeEvents.events.get(var3); // L: 2820
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2821
						return 1; // L: 2822
					} else {
						return 2; // L: 2824
					}
				}
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)Z",
		garbageValue = "-1842164438"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11045
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11046
				int var2 = method442(var0, var1); // L: 11047
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11048
				if (var0.cs1Comparisons[var1] == 2) { // L: 11049
					if (var2 >= var3) { // L: 11050
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11052
					if (var2 <= var3) { // L: 11053
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11055
					if (var3 == var2) { // L: 11056
						return false;
					}
				} else if (var3 != var2) { // L: 11058
					return false;
				}
			}

			return true; // L: 11060
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)I",
		garbageValue = "-2117288569"
	)
	static final int method442(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11064
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11066
				int var3 = 0; // L: 11067
				int var4 = 0; // L: 11068
				byte var5 = 0; // L: 11069

				while (true) {
					int var6 = var2[var4++]; // L: 11071
					int var7 = 0; // L: 11072
					byte var8 = 0; // L: 11073
					if (var6 == 0) { // L: 11074
						return var3;
					}

					if (var6 == 1) { // L: 11075
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11076
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11077
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11078
						var9 = var2[var4++] << 16; // L: 11079
						var9 += var2[var4++]; // L: 11080
						var10 = ChatChannel.getWidget(var9); // L: 11081
						var11 = var2[var4++]; // L: 11082
						if (var11 != -1 && (!UserComparator6.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11083
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11084
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11085
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11089
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11090
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11091
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11092
						var7 = class340.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11093
						for (var9 = 0; var9 < 25; ++var9) { // L: 11094
							if (Skills.Skills_enabled[var9]) { // L: 11095
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11098
						var9 = var2[var4++] << 16; // L: 11099
						var9 += var2[var4++]; // L: 11100
						var10 = ChatChannel.getWidget(var9); // L: 11101
						var11 = var2[var4++]; // L: 11102
						if (var11 != -1 && (!UserComparator6.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11103
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11104
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11105
									var7 = 999999999; // L: 11106
									break; // L: 11107
								}
							}
						}
					}

					if (var6 == 11) { // L: 11112
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 11113
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11114
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11115
						int var13 = var2[var4++]; // L: 11116
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11117
					}

					if (var6 == 14) { // L: 11119
						var9 = var2[var4++]; // L: 11120
						var7 = class273.getVarbit(var9); // L: 11121
					}

					if (var6 == 15) { // L: 11123
						var8 = 1;
					}

					if (var6 == 16) { // L: 11124
						var8 = 2;
					}

					if (var6 == 17) { // L: 11125
						var8 = 3;
					}

					if (var6 == 18) { // L: 11126
						var7 = (class340.localPlayer.x >> 7) + class131.baseX;
					}

					if (var6 == 19) { // L: 11127
						var7 = (class340.localPlayer.y >> 7) + TileItem.baseY;
					}

					if (var6 == 20) { // L: 11128
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11129
						if (var5 == 0) { // L: 11130
							var3 += var7;
						}

						if (var5 == 1) { // L: 11131
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11132
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11133
							var3 *= var7;
						}

						var5 = 0; // L: 11134
					} else {
						var5 = var8; // L: 11136
					}
				}
			} catch (Exception var14) { // L: 11139
				return -1; // L: 11140
			}
		} else {
			return -2;
		}
	}
}
