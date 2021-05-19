import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class286 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class286 field3684;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class286 field3687;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class286 field3686;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1228453663
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;

	static {
		field3684 = new class286(); // L: 4
		field3687 = new class286(); // L: 5
		field3686 = new class286(); // L: 6
	}

	class286() {
	} // L: 8

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "4"
	)
	static int method5056(int var0, Script var1, boolean var2) {
		if (var0 == 3800) { // L: 2422
			if (class105.field1328 != null) { // L: 2423
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 2424
				ArchiveDiskActionHandler.field3575 = class105.field1328; // L: 2425
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2427
			}

			return 1; // L: 2428
		} else {
			int var3;
			if (var0 == 3801) { // L: 2430
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2431
				if (Client.field678[var3] != null) { // L: 2432
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 2433
					ArchiveDiskActionHandler.field3575 = Client.field678[var3]; // L: 2434
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2436
				}

				return 1; // L: 2437
			} else if (var0 == 3802) { // L: 2439
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.field3575.field91; // L: 2440
				return 1; // L: 2441
			} else if (var0 == 3803) { // L: 2443
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field93 ? 1 : 0; // L: 2444
				return 1; // L: 2445
			} else if (var0 == 3804) { // L: 2447
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field111; // L: 2448
				return 1; // L: 2449
			} else if (var0 == 3805) { // L: 2451
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field95; // L: 2452
				return 1; // L: 2453
			} else if (var0 == 3806) { // L: 2455
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field96; // L: 2456
				return 1; // L: 2457
			} else if (var0 == 3807) { // L: 2459
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field113; // L: 2460
				return 1; // L: 2461
			} else if (var0 == 3809) { // L: 2463
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field98; // L: 2464
				return 1; // L: 2465
			} else if (var0 == 3810) { // L: 2467
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2468
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.field3575.field109[var3]; // L: 2469
				return 1; // L: 2470
			} else if (var0 == 3811) { // L: 2472
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2473
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field100[var3]; // L: 2474
				return 1; // L: 2475
			} else if (var0 == 3812) { // L: 2477
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field107; // L: 2478
				return 1; // L: 2479
			} else if (var0 == 3813) { // L: 2481
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2482
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.field3575.field101[var3]; // L: 2483
				return 1; // L: 2484
			} else {
				int var5;
				int var6;
				if (var0 == 3814) { // L: 2486
					WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 2487
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2488
					var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2489
					var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 2490
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.method114(var3, var6, var5); // L: 2491
					return 1; // L: 2492
				} else if (var0 == 3815) { // L: 2494
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field105; // L: 2495
					return 1; // L: 2496
				} else if (var0 == 3816) { // L: 2498
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field106; // L: 2499
					return 1; // L: 2500
				} else if (var0 == 3817) { // L: 2502
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.method113(Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 2503
					return 1; // L: 2504
				} else if (var0 == 3818) { // L: 2506
					Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.method167()[Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1]]; // L: 2507
					return 1; // L: 2508
				} else if (var0 == 3819) { // L: 2510
					WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2511
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2512
					var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2513
					class310.method5485(var6, var3); // L: 2514
					return 1; // L: 2515
				} else if (var0 == 3820) { // L: 2517
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2518
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field94[var3]; // L: 2519
					return 1; // L: 2520
				} else {
					if (var0 == 3821) { // L: 2522
						WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 2523
						var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2524
						boolean var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1] == 1; // L: 2525
						var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 2526
						SoundCache.method869(var5, var3, var4); // L: 2527
					}

					if (var0 == 3822) { // L: 2529
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2530
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.field3575.field104[var3] ? 1 : 0; // L: 2531
						return 1; // L: 2532
					} else if (var0 == 3850) { // L: 2534
						if (Players.field1358 != null) { // L: 2535
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 2536
							Canvas.field292 = Players.field1358; // L: 2537
						} else {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2539
						}

						return 1; // L: 2540
					} else if (var0 == 3851) { // L: 2542
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2543
						if (Client.field847[var3] != null) { // L: 2544
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 2545
							Canvas.field292 = Client.field847[var3]; // L: 2546
							ModelData0.field2510 = var3; // L: 2547
						} else {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2549
						}

						return 1; // L: 2550
					} else if (var0 == 3852) { // L: 2552
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Canvas.field292.field38; // L: 2553
						return 1; // L: 2554
					} else if (var0 == 3853) { // L: 2556
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.field37; // L: 2557
						return 1; // L: 2558
					} else if (var0 == 3854) { // L: 2560
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.field36; // L: 2561
						return 1; // L: 2562
					} else if (var0 == 3855) { // L: 2564
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.method39(); // L: 2565
						return 1; // L: 2566
					} else if (var0 == 3856) { // L: 2568
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2569
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ((class9)Canvas.field292.field32.get(var3)).field73; // L: 2570
						return 1; // L: 2571
					} else if (var0 == 3857) { // L: 2573
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2574
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((class9)Canvas.field292.field32.get(var3)).field76; // L: 2575
						return 1; // L: 2576
					} else if (var0 == 3858) { // L: 2578
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2579
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((class9)Canvas.field292.field32.get(var3)).field80; // L: 2580
						return 1; // L: 2581
					} else if (var0 == 3859) { // L: 2583
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2584
						FriendLoginUpdate.method5553(ModelData0.field2510, var3); // L: 2585
						return 1; // L: 2586
					} else if (var0 == 3860) { // L: 2588
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.method34(Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 2589
						return 1; // L: 2590
					} else if (var0 == 3861) { // L: 2592
						Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1] = Canvas.field292.method31()[Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1]]; // L: 2593
						return 1; // L: 2594
					} else if (var0 == 3890) { // L: 2596
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ObjectSound.field935 != null ? 1 : 0; // L: 2597
						return 1; // L: 2598
					} else {
						return 2; // L: 2600
					}
				}
			}
		}
	}
}
