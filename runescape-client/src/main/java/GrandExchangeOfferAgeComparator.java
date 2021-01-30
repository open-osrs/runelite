import java.util.Comparator;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("g")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("crossSprites")
	static Sprite[] crossSprites;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(La;La;I)I",
		garbageValue = "-382122880"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1587665041"
	)
	static int method218(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 2633
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2634
			var9 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2635
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9; // L: 2636
			return 1; // L: 2637
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 2639
				Interpreter.Interpreter_stringStackSize -= 2; // L: 2640
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2641
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2642
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4; // L: 2643
				return 1; // L: 2644
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 2646
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2647
				var9 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2648
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + HealthBarDefinition.intToString(var9, true); // L: 2649
				return 1; // L: 2650
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 2652
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2653
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 2654
				return 1; // L: 2655
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 2657
					var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2658
					long var13 = ((long)var10 + 11745L) * 86400000L; // L: 2659
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 2660
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 2661
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 2662
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 2663
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 2664
					return 1; // L: 2665
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 2667
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 2675
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2676
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 2677
						return 1; // L: 2678
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 2680
						Interpreter.Interpreter_stringStackSize -= 2; // L: 2681
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = World.method1874(UrlRequester.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], WorldMapScaleHandler.clientLanguage)); // L: 2682
						return 1; // L: 2683
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 2685
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2686
							VarcInt.Interpreter_intStackSize -= 2; // L: 2687
							var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2688
							var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2689
							var11 = GrandExchangeOfferUnitPriceComparator.archive13.takeFile(var5, 0); // L: 2690
							var12 = new Font(var11); // L: 2691
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 2692
							return 1; // L: 2693
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 2695
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2696
							VarcInt.Interpreter_intStackSize -= 2; // L: 2697
							var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2698
							var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2699
							var11 = GrandExchangeOfferUnitPriceComparator.archive13.takeFile(var5, 0); // L: 2700
							var12 = new Font(var11); // L: 2701
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 2702
							return 1; // L: 2703
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 2705
							Interpreter.Interpreter_stringStackSize -= 2; // L: 2706
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2707
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2708
							if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) { // L: 2709
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 2710
							}

							return 1; // L: 2711
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 2713
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2714
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 2715
							return 1; // L: 2716
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 2718
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2719
							var9 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2720
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 2721
							return 1; // L: 2722
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 2724
							var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2725
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = TriBool.isCharPrintable((char)var10) ? 1 : 0; // L: 2726
							return 1; // L: 2727
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 2729
							var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2730
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = FriendLoginUpdate.isAlphaNumeric((char)var10) ? 1 : 0; // L: 2731
							return 1; // L: 2732
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 2734
							var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2735
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = NetCache.isCharAlphabetic((char)var10) ? 1 : 0; // L: 2736
							return 1; // L: 2737
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 2739
							var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2740
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class39.isDigit((char)var10) ? 1 : 0; // L: 2741
							return 1; // L: 2742
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 2744
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2745
							if (var3 != null) { // L: 2746
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2747
							}

							return 1; // L: 2748
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 2750
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2751
							VarcInt.Interpreter_intStackSize -= 2; // L: 2752
							var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2753
							var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2754
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 2755
							return 1; // L: 2756
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 2758
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2759
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 2760
							boolean var16 = false; // L: 2761

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 2762
								char var7 = var3.charAt(var6); // L: 2763
								if (var7 == '<') { // L: 2764
									var16 = true;
								} else if (var7 == '>') { // L: 2765
									var16 = false;
								} else if (!var16) { // L: 2766
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var15.toString(); // L: 2768
							return 1; // L: 2769
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 2771
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2772
							var9 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2773
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 2774
							return 1; // L: 2775
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 2777
							Interpreter.Interpreter_stringStackSize -= 2; // L: 2778
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2779
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2780
							var5 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2781
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 2782
							return 1; // L: 2783
						} else if (var0 == ScriptOpcodes.UPPERCASE) { // L: 2785
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2786
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 2787
							return 1; // L: 2788
						} else {
							return 2; // L: 2790
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2; // L: 2668
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2669
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2670
					if (PlayerAppearance.localPlayer.appearance != null && PlayerAppearance.localPlayer.appearance.isFemale) { // L: 2671
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 2672
					}

					return 1; // L: 2673
				}
			}
		}
	}
}
