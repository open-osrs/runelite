import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("je")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	field3494(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	field3490(1, 2);

	@ObfuscatedName("e")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1851733283
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1519018517
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-2086152614"
	)
	static int method4924(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 2647
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2648
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2649
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9; // L: 2650
			return 1; // L: 2651
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 2653
				Interpreter.Interpreter_stringStackSize -= 2; // L: 2654
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2655
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2656
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4; // L: 2657
				return 1; // L: 2658
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 2660
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2661
				var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2662
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + GrandExchangeOfferOwnWorldComparator.intToString(var9, true); // L: 2663
				return 1; // L: 2664
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 2666
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2667
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 2668
				return 1; // L: 2669
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 2671
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2672
					long var13 = ((long)var10 + 11745L) * 86400000L; // L: 2673
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 2674
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 2675
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 2676
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 2677
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 2678
					return 1; // L: 2679
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 2681
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 2689
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2690
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 2691
						return 1; // L: 2692
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 2694
						Interpreter.Interpreter_stringStackSize -= 2; // L: 2695
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ServerPacket.method3810(User.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], NPCComposition.clientLanguage)); // L: 2696
						return 1; // L: 2697
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 2699
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2700
							Interpreter.Interpreter_intStackSize -= 2; // L: 2701
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2702
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2703
							var11 = CollisionMap.archive13.takeFile(var5, 0); // L: 2704
							var12 = new Font(var11); // L: 2705
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 2706
							return 1; // L: 2707
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 2709
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2710
							Interpreter.Interpreter_intStackSize -= 2; // L: 2711
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2712
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2713
							var11 = CollisionMap.archive13.takeFile(var5, 0); // L: 2714
							var12 = new Font(var11); // L: 2715
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 2716
							return 1; // L: 2717
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 2719
							Interpreter.Interpreter_stringStackSize -= 2; // L: 2720
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2721
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2722
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2723
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 2724
							}

							return 1; // L: 2725
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 2727
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2728
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 2729
							return 1; // L: 2730
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 2732
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2733
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2734
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 2735
							return 1; // L: 2736
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 2738
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2739
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBar.isCharPrintable((char)var10) ? 1 : 0; // L: 2740
							return 1; // L: 2741
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 2743
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2744
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class225.isAlphaNumeric((char)var10) ? 1 : 0; // L: 2745
							return 1; // L: 2746
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 2748
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2749
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class69.isCharAlphabetic((char)var10) ? 1 : 0; // L: 2750
							return 1; // L: 2751
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 2753
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2754
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Strings.isDigit((char)var10) ? 1 : 0; // L: 2755
							return 1; // L: 2756
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 2758
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2759
							if (var3 != null) { // L: 2760
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2761
							}

							return 1; // L: 2762
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 2764
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2765
							Interpreter.Interpreter_intStackSize -= 2; // L: 2766
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2767
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2768
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 2769
							return 1; // L: 2770
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 2772
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2773
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 2774
							boolean var16 = false; // L: 2775

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 2776
								char var7 = var3.charAt(var6); // L: 2777
								if (var7 == '<') { // L: 2778
									var16 = true;
								} else if (var7 == '>') { // L: 2779
									var16 = false;
								} else if (!var16) { // L: 2780
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var15.toString(); // L: 2782
							return 1; // L: 2783
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 2785
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2786
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2787
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 2788
							return 1; // L: 2789
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 2791
							Interpreter.Interpreter_stringStackSize -= 2; // L: 2792
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2793
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2794
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2795
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 2796
							return 1; // L: 2797
						} else if (var0 == ScriptOpcodes.UPPERCASE) { // L: 2799
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2800
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 2801
							return 1; // L: 2802
						} else {
							return 2; // L: 2804
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2; // L: 2682
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 2683
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 2684
					if (UserComparator9.localPlayer.appearance != null && UserComparator9.localPlayer.appearance.isFemale) { // L: 2685
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 2686
					}

					return 1; // L: 2687
				}
			}
		}
	}
}
