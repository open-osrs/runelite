import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("c")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("k")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("s")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("t")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("i")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("ga")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("z")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator(); // L: 11
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator(); // L: 41
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator(); // L: 54
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	} // L: 67

	@ObfuscatedSignature(
		descriptor = "(Lkf;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort(); // L: 82
		boolean var4 = var1.readUnsignedByte() == 1; // L: 83
		byte var5;
		if (var4) { // L: 85
			var5 = 1;
		} else {
			var5 = 0; // L: 86
		}

		int var6 = var1.readUnsignedShort(); // L: 87
		this.events = new ArrayList(var6); // L: 88

		for (int var7 = 0; var7 < var6; ++var7) { // L: 89
			this.events.add(new GrandExchangeEvent(var1, var5, var3)); // L: 90
		}

	} // L: 92

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZS)V",
		garbageValue = "6265"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "355141932"
	)
	public static void method150(int var0) {
		if (class206.musicPlayerStatus != 0) { // L: 44
			Tiles.musicTrackVolume = var0;
		} else {
			class206.midiPcmStream.setPcmStreamVolume(var0); // L: 45
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "176488379"
	)
	public static void method143() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "395740968"
	)
	static int method144(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 2575
			var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2576
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2577
			Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3 + var9; // L: 2578
			return 1; // L: 2579
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 2581
				Varps.Interpreter_stringStackSize -= 2; // L: 2582
				var3 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize]; // L: 2583
				var4 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize + 1]; // L: 2584
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3 + var4; // L: 2585
				return 1; // L: 2586
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 2588
				var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2589
				var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2590
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3 + ModeWhere.intToString(var9, true); // L: 2591
				return 1; // L: 2592
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 2594
				var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2595
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 2596
				return 1; // L: 2597
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 2599
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2600
					long var13 = 86400000L * (11745L + (long)var10); // L: 2601
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 2602
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 2603
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 2604
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 2605
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 2606
					return 1; // L: 2607
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 2609
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 2617
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2618
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 2619
						return 1; // L: 2620
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 2622
						Varps.Interpreter_stringStackSize -= 2; // L: 2623
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketWriter.method2360(GrandExchangeOffer.compareStrings(Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize + 1], class58.clientLanguage)); // L: 2624
						return 1; // L: 2625
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 2627
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2628
							Interpreter.Interpreter_intStackSize -= 2; // L: 2629
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2630
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2631
							var11 = TilePaint.archive13.takeFile(var5, 0); // L: 2632
							var12 = new Font(var11); // L: 2633
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 2634
							return 1; // L: 2635
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 2637
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2638
							Interpreter.Interpreter_intStackSize -= 2; // L: 2639
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2640
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2641
							var11 = TilePaint.archive13.takeFile(var5, 0); // L: 2642
							var12 = new Font(var11); // L: 2643
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 2644
							return 1; // L: 2645
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 2647
							Varps.Interpreter_stringStackSize -= 2; // L: 2648
							var3 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize]; // L: 2649
							var4 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize + 1]; // L: 2650
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2651
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4; // L: 2652
							}

							return 1; // L: 2653
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 2655
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2656
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 2657
							return 1; // L: 2658
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 2660
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2661
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2662
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 2663
							return 1; // L: 2664
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 2666
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2667
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarDefinition.isCharPrintable((char)var10) ? 1 : 0; // L: 2668
							return 1; // L: 2669
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 2671
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2672
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class204.isAlphaNumeric((char)var10) ? 1 : 0; // L: 2673
							return 1; // L: 2674
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 2676
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2677
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MilliClock.isCharAlphabetic((char)var10) ? 1 : 0; // L: 2678
							return 1; // L: 2679
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 2681
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2682
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class1.isDigit((char)var10) ? 1 : 0; // L: 2683
							return 1; // L: 2684
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 2686
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2687
							if (var3 != null) { // L: 2688
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2689
							}

							return 1; // L: 2690
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 2692
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2693
							Interpreter.Interpreter_intStackSize -= 2; // L: 2694
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2695
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2696
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 2697
							return 1; // L: 2698
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 2700
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2701
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 2702
							boolean var16 = false; // L: 2703

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 2704
								char var7 = var3.charAt(var6); // L: 2705
								if (var7 == '<') { // L: 2706
									var16 = true;
								} else if (var7 == '>') { // L: 2707
									var16 = false;
								} else if (!var16) { // L: 2708
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var15.toString(); // L: 2710
							return 1; // L: 2711
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 2713
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2714
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2715
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 2716
							return 1; // L: 2717
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 2719
							Varps.Interpreter_stringStackSize -= 2; // L: 2720
							var3 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize]; // L: 2721
							var4 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize + 1]; // L: 2722
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2723
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 2724
							return 1; // L: 2725
						} else if (var0 == ScriptOpcodes.UPPERCASE) { // L: 2727
							var3 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2728
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 2729
							return 1; // L: 2730
						} else {
							return 2; // L: 2732
						}
					}
				} else {
					Varps.Interpreter_stringStackSize -= 2; // L: 2610
					var3 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize]; // L: 2611
					var4 = Interpreter.Interpreter_stringStack[Varps.Interpreter_stringStackSize + 1]; // L: 2612
					if (WorldMapLabelSize.localPlayer.appearance != null && WorldMapLabelSize.localPlayer.appearance.isFemale) { // L: 2613
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3; // L: 2614
					}

					return 1; // L: 2615
				}
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ljx;IIII)V",
		garbageValue = "1036487158"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCDefinition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) { // L: 8457
			if (var0.transforms != null) { // L: 8458
				var0 = var0.transform();
			}

			if (var0 != null) { // L: 8459
				if (var0.isInteractable) { // L: 8460
					if (!var0.isFollower || Client.followerIndex == var1) { // L: 8461
						String var4 = var0.name; // L: 8462
						int var7;
						int var8;
						if (var0.combatLevel != 0) { // L: 8463
							var7 = var0.combatLevel; // L: 8466
							var8 = WorldMapLabelSize.localPlayer.combatLevel; // L: 8467
							int var9 = var8 - var7; // L: 8469
							String var6;
							if (var9 < -9) { // L: 8470
								var6 = WorldMapAreaData.colorStartTag(16711680); // L: 8471
							} else if (var9 < -6) { // L: 8474
								var6 = WorldMapAreaData.colorStartTag(16723968); // L: 8475
							} else if (var9 < -3) { // L: 8478
								var6 = WorldMapAreaData.colorStartTag(16740352); // L: 8479
							} else if (var9 < 0) { // L: 8482
								var6 = WorldMapAreaData.colorStartTag(16756736); // L: 8483
							} else if (var9 > 9) { // L: 8486
								var6 = WorldMapAreaData.colorStartTag(65280); // L: 8487
							} else if (var9 > 6) { // L: 8490
								var6 = WorldMapAreaData.colorStartTag(4259584); // L: 8491
							} else if (var9 > 3) { // L: 8494
								var6 = WorldMapAreaData.colorStartTag(8453888); // L: 8495
							} else if (var9 > 0) { // L: 8498
								var6 = WorldMapAreaData.colorStartTag(12648192); // L: 8499
							} else {
								var6 = WorldMapAreaData.colorStartTag(16776960); // L: 8502
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")"; // L: 8504
						}

						if (var0.isFollower && Client.followerOpsLowPriority) { // L: 8506
							StructDefinition.insertMenuItemNoShift("Examine", WorldMapAreaData.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 8507
						}

						if (Client.isItemSelected == 1) { // L: 8510
							StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16776960) + var4, 7, var1, var2, var3); // L: 8511
						} else if (Client.isSpellSelected) { // L: 8514
							if ((UserComparator8.selectedSpellFlags & 2) == 2) { // L: 8515
								StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16776960) + var4, 8, var1, var2, var3); // L: 8516
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 8521
							String[] var11 = var0.actions; // L: 8522
							if (var11 != null) { // L: 8523
								for (var7 = 4; var7 >= 0; --var7) { // L: 8524
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) { // L: 8525
										var8 = 0; // L: 8526
										if (var7 == 0) { // L: 8527
											var8 = var10 + 9;
										}

										if (var7 == 1) { // L: 8528
											var8 = var10 + 10;
										}

										if (var7 == 2) { // L: 8529
											var8 = var10 + 11;
										}

										if (var7 == 3) { // L: 8530
											var8 = var10 + 12;
										}

										if (var7 == 4) { // L: 8531
											var8 = var10 + 13;
										}

										StructDefinition.insertMenuItemNoShift(var11[var7], WorldMapAreaData.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 8532
									}
								}
							}

							if (var11 != null) { // L: 8537
								for (var7 = 4; var7 >= 0; --var7) { // L: 8538
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) { // L: 8539
										short var12 = 0; // L: 8540
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 8541
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > WorldMapLabelSize.localPlayer.combatLevel) { // L: 8542
												var12 = 2000; // L: 8543
											}

											var8 = 0; // L: 8545
											if (var7 == 0) { // L: 8546
												var8 = var12 + 9;
											}

											if (var7 == 1) { // L: 8547
												var8 = var12 + 10;
											}

											if (var7 == 2) { // L: 8548
												var8 = var12 + 11;
											}

											if (var7 == 3) { // L: 8549
												var8 = var12 + 12;
											}

											if (var7 == 4) { // L: 8550
												var8 = var12 + 13;
											}

											StructDefinition.insertMenuItemNoShift(var11[var7], WorldMapAreaData.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 8551
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) { // L: 8556
								StructDefinition.insertMenuItemNoShift("Examine", WorldMapAreaData.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 8557
							}
						}

					}
				}
			}
		}
	} // L: 8561

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-775294286"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 9631
	} // L: 9632
}
