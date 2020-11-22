import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = -1592702363
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ag")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1035256329
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1164604575
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1479469189
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1113436687
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 175413889
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1951305335
	)
	int field963;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -572899859
	)
	int field959;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1254625591
	)
	@Export("id")
	int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -802321491
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1436097175
	)
	int field962;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -326130097
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1413090507
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljp;",
		garbageValue = "25"
	)
	public static FloorOverlayDefinition method1839(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) { // L: 30
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 31
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lig;",
		garbageValue = "88"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class25.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1776367578"
	)
	static final int method1841(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 450
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 451
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "-42"
	)
	static int method1840(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 2416
			MilliClock.Interpreter_intStackSize -= 2; // L: 2417
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2418
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2419
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 + var4; // L: 2420
			return 1; // L: 2421
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2423
			MilliClock.Interpreter_intStackSize -= 2; // L: 2424
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2425
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2426
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 - var4; // L: 2427
			return 1; // L: 2428
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2430
			MilliClock.Interpreter_intStackSize -= 2; // L: 2431
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2432
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2433
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4 * var9; // L: 2434
			return 1; // L: 2435
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2437
			MilliClock.Interpreter_intStackSize -= 2; // L: 2438
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2439
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2440
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 / var4; // L: 2441
			return 1; // L: 2442
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2444
			var9 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2445
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 2446
			return 1; // L: 2447
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2449
			var9 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 2450
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 2451
			return 1; // L: 2452
		} else if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2454
			MilliClock.Interpreter_intStackSize -= 5; // L: 2455
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2456
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2457
			int var10 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 2458
			int var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3]; // L: 2459
			int var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 4]; // L: 2460
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var11 - var10) / (var6 - var10); // L: 2461
			return 1; // L: 2462
		} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2464
			MilliClock.Interpreter_intStackSize -= 2; // L: 2465
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2466
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2467
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 2468
			return 1; // L: 2469
		} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2471
			MilliClock.Interpreter_intStackSize -= 2; // L: 2472
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2473
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2474
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 2475
			return 1; // L: 2476
		} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2478
			MilliClock.Interpreter_intStackSize -= 2; // L: 2479
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2480
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2481
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 2482
			return 1; // L: 2483
		} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2485
			MilliClock.Interpreter_intStackSize -= 2; // L: 2486
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2487
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2488
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 2489
			return 1; // L: 2490
		} else if (var0 == ScriptOpcodes.MOD) { // L: 2492
			MilliClock.Interpreter_intStackSize -= 2; // L: 2493
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2494
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2495
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 % var4; // L: 2496
			return 1; // L: 2497
		} else if (var0 == ScriptOpcodes.POW) { // L: 2499
			MilliClock.Interpreter_intStackSize -= 2; // L: 2500
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2501
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2502
			if (var9 == 0) { // L: 2503
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 2504
			}

			return 1; // L: 2505
		} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2507
			MilliClock.Interpreter_intStackSize -= 2; // L: 2508
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2509
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2510
			if (var9 == 0) { // L: 2511
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 2512
				return 1; // L: 2513
			} else {
				switch(var4) { // L: 2515
				case 0:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2538
					break; // L: 2539
				case 1:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9; // L: 2528
					break; // L: 2529
				case 2:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 2543
					break;
				case 3:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 2533
					break; // L: 2534
				case 4:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 2523
					break; // L: 2524
				default:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 2518
				}

				return 1; // L: 2547
			}
		} else if (var0 == ScriptOpcodes.AND) { // L: 2549
			MilliClock.Interpreter_intStackSize -= 2; // L: 2550
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2551
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2552
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 & var4; // L: 2553
			return 1; // L: 2554
		} else if (var0 == ScriptOpcodes.OR) { // L: 2556
			MilliClock.Interpreter_intStackSize -= 2; // L: 2557
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2558
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2559
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var9 | var4; // L: 2560
			return 1; // L: 2561
		} else if (var0 == ScriptOpcodes.SCALE) { // L: 2563
			MilliClock.Interpreter_intStackSize -= 3; // L: 2564
			long var3 = (long)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 2565
			long var5 = (long)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 2566
			long var7 = (long)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 2567
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)(var7 * var3 / var5); // L: 2568
			return 1; // L: 2569
		} else {
			return 2; // L: 2571
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)Ljava/lang/String;",
		garbageValue = "-42"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (JagexCache.Widget_unpackTargetMask(WorldMapData_0.getWidgetFlags(var0)) == 0) { // L: 11536
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11537 11538 11540
		}
	}
}
