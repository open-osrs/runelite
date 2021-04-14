import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("o")
	String field1058;
	@ObfuscatedName("u")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("p")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("b")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1191660215
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -49303827
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 162609675
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1127748469
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lme;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lme;",
		garbageValue = "0"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 134
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1090805477"
	)
	static void method2010() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1768640956"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1012
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1013
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1014
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1015
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1016
		return var3; // L: 1017
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-710644137"
	)
	static int method1998(int var0, Script var1, boolean var2) {
		if (var0 == 3800) { // L: 2421
			if (ObjectSound.field928 != null) { // L: 2422
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 2423
				class19.field154 = ObjectSound.field928; // L: 2424
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2426
			}

			return 1; // L: 2427
		} else {
			int var3;
			if (var0 == 3801) { // L: 2429
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2430
				if (Client.field831[var3] != null) { // L: 2431
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 2432
					class19.field154 = Client.field831[var3]; // L: 2433
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2435
				}

				return 1; // L: 2436
			} else if (var0 == 3802) { // L: 2438
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class19.field154.field81; // L: 2439
				return 1; // L: 2440
			} else if (var0 == 3803) { // L: 2442
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field90 ? 1 : 0; // L: 2443
				return 1; // L: 2444
			} else if (var0 == 3804) { // L: 2446
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field84; // L: 2447
				return 1; // L: 2448
			} else if (var0 == 3805) { // L: 2450
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field83; // L: 2451
				return 1; // L: 2452
			} else if (var0 == 3806) { // L: 2454
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field86; // L: 2455
				return 1; // L: 2456
			} else if (var0 == 3807) { // L: 2458
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field87; // L: 2459
				return 1; // L: 2460
			} else if (var0 == 3809) { // L: 2462
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field88; // L: 2463
				return 1; // L: 2464
			} else if (var0 == 3810) { // L: 2466
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2467
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class19.field154.field99[var3]; // L: 2468
				return 1; // L: 2469
			} else if (var0 == 3811) { // L: 2471
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2472
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field76[var3]; // L: 2473
				return 1; // L: 2474
			} else if (var0 == 3812) { // L: 2476
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field97; // L: 2477
				return 1; // L: 2478
			} else if (var0 == 3813) { // L: 2480
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2481
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class19.field154.field105[var3]; // L: 2482
				return 1; // L: 2483
			} else {
				int var5;
				int var6;
				if (var0 == 3814) { // L: 2485
					class16.Interpreter_intStackSize -= 3; // L: 2486
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2487
					var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2488
					var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 2489
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.method143(var3, var6, var5); // L: 2490
					return 1; // L: 2491
				} else if (var0 == 3815) { // L: 2493
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field100; // L: 2494
					return 1; // L: 2495
				} else if (var0 == 3816) { // L: 2497
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field96; // L: 2498
					return 1; // L: 2499
				} else if (var0 == 3817) { // L: 2501
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.method142(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 2502
					return 1; // L: 2503
				} else if (var0 == 3818) { // L: 2505
					Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1] = class19.field154.method159()[Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1]]; // L: 2506
					return 1; // L: 2507
				} else if (var0 == 3819) { // L: 2509
					class16.Interpreter_intStackSize -= 2; // L: 2510
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2511
					var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2512
					ClientPacket.method3885(var6, var3); // L: 2513
					return 1; // L: 2514
				} else if (var0 == 3820) { // L: 2516
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2517
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field94[var3]; // L: 2518
					return 1; // L: 2519
				} else {
					if (var0 == 3821) { // L: 2521
						class16.Interpreter_intStackSize -= 3; // L: 2522
						var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2523
						boolean var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] == 1; // L: 2524
						var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 2525
						class4.method75(var5, var3, var4); // L: 2526
					}

					if (var0 == 3822) { // L: 2528
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2529
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.field154.field78[var3] ? 1 : 0; // L: 2530
						return 1; // L: 2531
					} else if (var0 == 3850) { // L: 2533
						if (IsaacCipher.field4266 != null) { // L: 2534
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 2535
							Interpreter.field941 = IsaacCipher.field4266; // L: 2536
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2538
						}

						return 1; // L: 2539
					} else if (var0 == 3851) { // L: 2541
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2542
						if (Client.field820[var3] != null) { // L: 2543
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1; // L: 2544
							Interpreter.field941 = Client.field820[var3]; // L: 2545
							class25.field197 = var3; // L: 2546
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2548
						}

						return 1; // L: 2549
					} else if (var0 == 3852) { // L: 2551
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.field941.field25; // L: 2552
						return 1; // L: 2553
					} else if (var0 == 3853) { // L: 2555
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.field941.field30; // L: 2556
						return 1; // L: 2557
					} else if (var0 == 3854) { // L: 2559
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.field941.field31; // L: 2560
						return 1; // L: 2561
					} else if (var0 == 3855) { // L: 2563
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.field941.method46(); // L: 2564
						return 1; // L: 2565
					} else if (var0 == 3856) { // L: 2567
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2568
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((class9)Interpreter.field941.field27.get(var3)).field65; // L: 2569
						return 1; // L: 2570
					} else if (var0 == 3857) { // L: 2572
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2573
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((class9)Interpreter.field941.field27.get(var3)).field66; // L: 2574
						return 1; // L: 2575
					} else if (var0 == 3858) { // L: 2577
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2578
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((class9)Interpreter.field941.field27.get(var3)).field64; // L: 2579
						return 1; // L: 2580
					} else if (var0 == 3859) { // L: 2582
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2583
						GraphicsObject.method1913(class25.field197, var3); // L: 2584
						return 1; // L: 2585
					} else if (var0 == 3860) { // L: 2587
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Interpreter.field941.method43(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 2588
						return 1; // L: 2589
					} else if (var0 == 3861) { // L: 2591
						Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1] = Interpreter.field941.method44()[Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize - 1]]; // L: 2592
						return 1; // L: 2593
					} else if (var0 == 3890) { // L: 2595
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Coord.field2591 != null ? 1 : 0; // L: 2596
						return 1; // L: 2597
					} else {
						return 2; // L: 2599
					}
				}
			}
		}
	}
}
