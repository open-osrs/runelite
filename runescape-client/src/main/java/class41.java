import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ab")
public class class41 {
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 641219975
	)
	static int field302;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 725701035
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("gb")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-335068840"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class195.Widget_loadedInterfaces[var0]) { // L: 203
			return true;
		} else if (!class58.Widget_archive.tryLoadGroup(var0)) { // L: 204
			return false;
		} else {
			int var1 = class58.Widget_archive.getGroupFileCount(var0); // L: 205
			if (var1 == 0) { // L: 206
				class195.Widget_loadedInterfaces[var0] = true; // L: 207
				return true; // L: 208
			} else {
				if (class9.Widget_interfaceComponents[var0] == null) { // L: 210
					class9.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 211
					if (class9.Widget_interfaceComponents[var0][var2] == null) { // L: 212
						byte[] var3 = class58.Widget_archive.takeFile(var0, var2); // L: 213
						if (var3 != null) { // L: 214
							class9.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 215
							class9.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 216
							if (var3[0] == -1) { // L: 217
								class9.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class9.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 218
							}
						}
					}
				}

				class195.Widget_loadedInterfaces[var0] = true; // L: 222
				return true; // L: 223
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1680484143"
	)
	static int method602(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 2474
			VarcInt.Interpreter_intStackSize -= 2; // L: 2475
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2476
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2477
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4 + var9; // L: 2478
			return 1; // L: 2479
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2481
			VarcInt.Interpreter_intStackSize -= 2; // L: 2482
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2483
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2484
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 - var4; // L: 2485
			return 1; // L: 2486
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2488
			VarcInt.Interpreter_intStackSize -= 2; // L: 2489
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2490
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2491
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4 * var9; // L: 2492
			return 1; // L: 2493
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2495
			VarcInt.Interpreter_intStackSize -= 2; // L: 2496
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2497
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2498
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 / var4; // L: 2499
			return 1; // L: 2500
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2502
			var9 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2503
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 2504
			return 1; // L: 2505
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2507
			var9 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 2508
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 2509
			return 1; // L: 2510
		} else if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2512
			VarcInt.Interpreter_intStackSize -= 5; // L: 2513
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2514
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2515
			int var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 2516
			int var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3]; // L: 2517
			int var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 4]; // L: 2518
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var11 - var10) / (var6 - var10); // L: 2519
			return 1; // L: 2520
		} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2522
			VarcInt.Interpreter_intStackSize -= 2; // L: 2523
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2524
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2525
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 2526
			return 1; // L: 2527
		} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2529
			VarcInt.Interpreter_intStackSize -= 2; // L: 2530
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2531
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2532
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 2533
			return 1; // L: 2534
		} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2536
			VarcInt.Interpreter_intStackSize -= 2; // L: 2537
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2538
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2539
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 2540
			return 1; // L: 2541
		} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2543
			VarcInt.Interpreter_intStackSize -= 2; // L: 2544
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2545
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2546
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 2547
			return 1; // L: 2548
		} else if (var0 == ScriptOpcodes.MOD) { // L: 2550
			VarcInt.Interpreter_intStackSize -= 2; // L: 2551
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2552
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2553
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 % var4; // L: 2554
			return 1; // L: 2555
		} else if (var0 == ScriptOpcodes.POW) { // L: 2557
			VarcInt.Interpreter_intStackSize -= 2; // L: 2558
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2559
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2560
			if (var9 == 0) { // L: 2561
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 2562
			}

			return 1; // L: 2563
		} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2565
			VarcInt.Interpreter_intStackSize -= 2; // L: 2566
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2567
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2568
			if (var9 == 0) { // L: 2569
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 2570
				return 1; // L: 2571
			} else {
				switch(var4) { // L: 2573
				case 0:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2581
					break; // L: 2582
				case 1:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9; // L: 2601
					break;
				case 2:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 2591
					break; // L: 2592
				case 3:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 2576
					break;
				case 4:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 2596
					break; // L: 2597
				default:
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 2586
				}

				return 1; // L: 2605
			}
		} else if (var0 == ScriptOpcodes.AND) { // L: 2607
			VarcInt.Interpreter_intStackSize -= 2; // L: 2608
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2609
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2610
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 & var4; // L: 2611
			return 1; // L: 2612
		} else if (var0 == ScriptOpcodes.OR) { // L: 2614
			VarcInt.Interpreter_intStackSize -= 2; // L: 2615
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2616
			var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2617
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9 | var4; // L: 2618
			return 1; // L: 2619
		} else if (var0 == ScriptOpcodes.SCALE) { // L: 2621
			VarcInt.Interpreter_intStackSize -= 3; // L: 2622
			long var3 = (long)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 2623
			long var5 = (long)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 2624
			long var7 = (long)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 2625
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (int)(var3 * var7 / var5); // L: 2626
			return 1; // L: 2627
		} else {
			return 2; // L: 2629
		}
	}
}
