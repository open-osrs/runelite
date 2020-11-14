import java.util.Date;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ib")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1001154339
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2117538937
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1463205401
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -479037579
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1632634127
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("n")
	static boolean field3200;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -795437201
	)
	public static int field3190;
	@ObfuscatedName("j")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lid;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("d")
	public static byte field3207;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 473266479
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1034207799
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0; // L: 13
		NetCache_pendingPriorityWrites = new NodeHashTable(4096); // L: 15
		NetCache_pendingPriorityWritesCount = 0; // L: 16
		NetCache_pendingPriorityResponses = new NodeHashTable(32); // L: 17
		NetCache_pendingPriorityResponsesCount = 0; // L: 18
		NetCache_pendingWritesQueue = new DualNodeDeque(); // L: 19
		NetCache_pendingWrites = new NodeHashTable(4096); // L: 20
		NetCache_pendingWritesCount = 0; // L: 21
		NetCache_pendingResponses = new NodeHashTable(4096); // L: 22
		NetCache_pendingResponsesCount = 0; // L: 23
		NetCache_responseHeaderBuffer = new Buffer(8); // L: 26
		field3190 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field3207 = 0; // L: 33
		NetCache_crcMismatches = 0; // L: 34
		NetCache_ioExceptions = 0; // L: 35
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-979858945"
	)
	static int method4461(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 2575
			var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2576
			var9 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2577
			Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3 + var9; // L: 2578
			return 1; // L: 2579
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 2581
				UrlRequester.Interpreter_stringStackSize -= 2; // L: 2582
				var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize]; // L: 2583
				var4 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1]; // L: 2584
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3 + var4; // L: 2585
				return 1; // L: 2586
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 2588
				var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2589
				var9 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2590
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3 + class197.intToString(var9, true); // L: 2591
				return 1; // L: 2592
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 2594
				var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2595
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 2596
				return 1; // L: 2597
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 2599
					var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2600
					long var13 = ((long)var10 + 11745L) * 86400000L; // L: 2601
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 2602
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 2603
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 2604
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 2605
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 2606
					return 1; // L: 2607
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 2609
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 2617
						var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2618
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 2619
						return 1; // L: 2620
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 2622
						UrlRequester.Interpreter_stringStackSize -= 2; // L: 2623
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = EnumDefinition.method4714(DevicePcmPlayerProvider.compareStrings(Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1], FontName.clientLanguage)); // L: 2624
						return 1; // L: 2625
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 2627
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2628
							MilliClock.Interpreter_intStackSize -= 2; // L: 2629
							var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2630
							var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2631
							var11 = class8.archive13.takeFile(var5, 0); // L: 2632
							var12 = new Font(var11); // L: 2633
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 2634
							return 1; // L: 2635
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 2637
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2638
							MilliClock.Interpreter_intStackSize -= 2; // L: 2639
							var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2640
							var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2641
							var11 = class8.archive13.takeFile(var5, 0); // L: 2642
							var12 = new Font(var11); // L: 2643
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 2644
							return 1; // L: 2645
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 2647
							UrlRequester.Interpreter_stringStackSize -= 2; // L: 2648
							var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize]; // L: 2649
							var4 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1]; // L: 2650
							if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) { // L: 2651
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4; // L: 2652
							}

							return 1; // L: 2653
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 2655
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2656
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 2657
							return 1; // L: 2658
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 2660
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2661
							var9 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2662
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 2663
							return 1; // L: 2664
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 2666
							var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2667
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = PcmPlayer.isCharPrintable((char)var10) ? 1 : 0; // L: 2668
							return 1; // L: 2669
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 2671
							var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2672
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = class3.isAlphaNumeric((char)var10) ? 1 : 0; // L: 2673
							return 1; // L: 2674
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 2676
							var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2677
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.isCharAlphabetic((char)var10) ? 1 : 0; // L: 2678
							return 1; // L: 2679
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 2681
							var10 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2682
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = class1.isDigit((char)var10) ? 1 : 0; // L: 2683
							return 1; // L: 2684
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 2686
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2687
							if (var3 != null) { // L: 2688
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2689
							}

							return 1; // L: 2690
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 2692
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2693
							MilliClock.Interpreter_intStackSize -= 2; // L: 2694
							var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2695
							var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2696
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 2697
							return 1; // L: 2698
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 2700
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2701
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

							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var15.toString(); // L: 2710
							return 1; // L: 2711
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 2713
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2714
							var9 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2715
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 2716
							return 1; // L: 2717
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 2719
							UrlRequester.Interpreter_stringStackSize -= 2; // L: 2720
							var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize]; // L: 2721
							var4 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1]; // L: 2722
							var5 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2723
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 2724
							return 1; // L: 2725
						} else if (var0 == ScriptOpcodes.UPPERCASE) { // L: 2727
							var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 2728
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 2729
							return 1; // L: 2730
						} else {
							return 2; // L: 2732
						}
					}
				} else {
					UrlRequester.Interpreter_stringStackSize -= 2; // L: 2610
					var3 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize]; // L: 2611
					var4 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1]; // L: 2612
					if (PlayerType.localPlayer.appearance != null && PlayerType.localPlayer.appearance.isFemale) { // L: 2613
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3; // L: 2614
					}

					return 1; // L: 2615
				}
			}
		}
	}
}
