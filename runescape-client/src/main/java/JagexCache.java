import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fp")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = 1085994163
	)
	static int field2070;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -1320857685
	)
	static int field2056;
	@ObfuscatedName("c")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("y")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2009341667
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2115151197
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("p")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("m")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)Ljava/lang/String;",
		garbageValue = "2062963895"
	)
	public static String method3683(Buffer var0) {
		return WorldMapRegion.method642(var0, 32767); // L: 22
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-638014439"
	)
	static int method3686(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 2488
			Interpreter.Interpreter_intStackSize -= 2; // L: 2489
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2490
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2491
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var4; // L: 2492
			return 1; // L: 2493
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2495
			Interpreter.Interpreter_intStackSize -= 2; // L: 2496
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2497
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2498
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4; // L: 2499
			return 1; // L: 2500
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2502
			Interpreter.Interpreter_intStackSize -= 2; // L: 2503
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2504
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2505
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 * var4; // L: 2506
			return 1; // L: 2507
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2509
			Interpreter.Interpreter_intStackSize -= 2; // L: 2510
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2511
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2512
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4; // L: 2513
			return 1; // L: 2514
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2516
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2517
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 2518
			return 1; // L: 2519
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2521
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2522
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 2523
			return 1; // L: 2524
		} else if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2526
			Interpreter.Interpreter_intStackSize -= 5; // L: 2527
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2528
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2529
			int var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2530
			int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2531
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2532
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var11 - var10) / (var6 - var10); // L: 2533
			return 1; // L: 2534
		} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2536
			Interpreter.Interpreter_intStackSize -= 2; // L: 2537
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2538
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2539
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 2540
			return 1; // L: 2541
		} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2543
			Interpreter.Interpreter_intStackSize -= 2; // L: 2544
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2545
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2546
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 2547
			return 1; // L: 2548
		} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2550
			Interpreter.Interpreter_intStackSize -= 2; // L: 2551
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2552
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2553
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 2554
			return 1; // L: 2555
		} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2557
			Interpreter.Interpreter_intStackSize -= 2; // L: 2558
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2559
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2560
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 2561
			return 1; // L: 2562
		} else if (var0 == ScriptOpcodes.MOD) { // L: 2564
			Interpreter.Interpreter_intStackSize -= 2; // L: 2565
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2566
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2567
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4; // L: 2568
			return 1; // L: 2569
		} else if (var0 == ScriptOpcodes.POW) { // L: 2571
			Interpreter.Interpreter_intStackSize -= 2; // L: 2572
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2573
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2574
			if (var9 == 0) { // L: 2575
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 2576
			}

			return 1; // L: 2577
		} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2579
			Interpreter.Interpreter_intStackSize -= 2; // L: 2580
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2581
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2582
			if (var9 == 0) { // L: 2583
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2584
				return 1; // L: 2585
			} else {
				switch(var4) { // L: 2587
				case 0:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2605
					break; // L: 2606
				case 1:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 2610
					break; // L: 2611
				case 2:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 2595
					break; // L: 2596
				case 3:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 2600
					break; // L: 2601
				case 4:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 2615
					break;
				default:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 2590
				}

				return 1; // L: 2619
			}
		} else if (var0 == ScriptOpcodes.AND) { // L: 2621
			Interpreter.Interpreter_intStackSize -= 2; // L: 2622
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2623
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2624
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4; // L: 2625
			return 1; // L: 2626
		} else if (var0 == ScriptOpcodes.OR) { // L: 2628
			Interpreter.Interpreter_intStackSize -= 2; // L: 2629
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2630
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2631
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4; // L: 2632
			return 1; // L: 2633
		} else if (var0 == ScriptOpcodes.SCALE) { // L: 2635
			Interpreter.Interpreter_intStackSize -= 3; // L: 2636
			long var3 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2637
			long var5 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2638
			long var7 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2639
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var7 * var3 / var5); // L: 2640
			return 1; // L: 2641
		} else {
			return 2; // L: 2643
		}
	}
}