import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kv")
public class class303 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-723609398"
	)
	static int method5451(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 2416
			Interpreter.Interpreter_intStackSize -= 2; // L: 2417
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2418
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2419
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9; // L: 2420
			return 1; // L: 2421
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2423
			Interpreter.Interpreter_intStackSize -= 2; // L: 2424
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2425
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2426
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4; // L: 2427
			return 1; // L: 2428
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2430
			Interpreter.Interpreter_intStackSize -= 2; // L: 2431
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2432
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2433
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var9; // L: 2434
			return 1; // L: 2435
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2437
			Interpreter.Interpreter_intStackSize -= 2; // L: 2438
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2439
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2440
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4; // L: 2441
			return 1; // L: 2442
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2444
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2445
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 2446
			return 1; // L: 2447
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2449
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2450
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 2451
			return 1; // L: 2452
		} else if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2454
			Interpreter.Interpreter_intStackSize -= 5; // L: 2455
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2456
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2457
			int var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2458
			int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2459
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 2460
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var11 - var10) * (var4 - var9) / (var6 - var10); // L: 2461
			return 1; // L: 2462
		} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2464
			Interpreter.Interpreter_intStackSize -= 2; // L: 2465
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2466
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2467
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 2468
			return 1; // L: 2469
		} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2471
			Interpreter.Interpreter_intStackSize -= 2; // L: 2472
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2473
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2474
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 2475
			return 1; // L: 2476
		} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2478
			Interpreter.Interpreter_intStackSize -= 2; // L: 2479
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2480
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2481
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 2482
			return 1; // L: 2483
		} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2485
			Interpreter.Interpreter_intStackSize -= 2; // L: 2486
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2487
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2488
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 2489
			return 1; // L: 2490
		} else if (var0 == ScriptOpcodes.MOD) { // L: 2492
			Interpreter.Interpreter_intStackSize -= 2; // L: 2493
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2494
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2495
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4; // L: 2496
			return 1; // L: 2497
		} else if (var0 == ScriptOpcodes.POW) { // L: 2499
			Interpreter.Interpreter_intStackSize -= 2; // L: 2500
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2501
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2502
			if (var9 == 0) { // L: 2503
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 2504
			}

			return 1; // L: 2505
		} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2507
			Interpreter.Interpreter_intStackSize -= 2; // L: 2508
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2509
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2510
			if (var9 == 0) { // L: 2511
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2512
				return 1; // L: 2513
			} else {
				switch(var4) { // L: 2515
				case 0:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2538
					break; // L: 2539
				case 1:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 2528
					break; // L: 2529
				case 2:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 2523
					break; // L: 2524
				case 3:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 2518
					break;
				case 4:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 2533
					break; // L: 2534
				default:
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 2543
				}

				return 1; // L: 2547
			}
		} else if (var0 == ScriptOpcodes.AND) { // L: 2549
			Interpreter.Interpreter_intStackSize -= 2; // L: 2550
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2551
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2552
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4; // L: 2553
			return 1; // L: 2554
		} else if (var0 == ScriptOpcodes.OR) { // L: 2556
			Interpreter.Interpreter_intStackSize -= 2; // L: 2557
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2558
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2559
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4; // L: 2560
			return 1; // L: 2561
		} else if (var0 == ScriptOpcodes.SCALE) { // L: 2563
			Interpreter.Interpreter_intStackSize -= 3; // L: 2564
			long var3 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2565
			long var5 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2566
			long var7 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2567
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var7 * var3 / var5); // L: 2568
			return 1; // L: 2569
		} else {
			return 2; // L: 2571
		}
	}
}
