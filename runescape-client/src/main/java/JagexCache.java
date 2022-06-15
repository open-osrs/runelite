import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fz")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("j")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("x")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("mouseWheel")
	static class158 mouseWheel;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "2126958696"
	)
	static int method3271(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 488
			class446.Interpreter_intStackSize -= 3; // L: 489
			var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 490
			var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 491
			int var11 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 492
			if (var4 == 0) { // L: 493
				throw new RuntimeException(); // L: 494
			} else {
				Widget var6 = class140.getWidget(var9); // L: 496
				if (var6.children == null) { // L: 497
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 498
					Widget[] var7 = new Widget[var11 + 1]; // L: 499

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 500
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 501
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 503
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 504
					var12.type = var4; // L: 505
					var12.parentId = var12.id = var6.id; // L: 506
					var12.childIndex = var11; // L: 507
					var12.isIf3 = true; // L: 508
					var6.children[var11] = var12; // L: 509
					if (var2) { // L: 510
						class124.scriptDotWidget = var12;
					} else {
						GrandExchangeOfferOwnWorldComparator.scriptActiveWidget = var12; // L: 511
					}

					ChatChannel.invalidateWidget(var6); // L: 512
					return 1; // L: 513
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 515
				var3 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 516
				Widget var10 = class140.getWidget(var3.id); // L: 517
				var10.children[var3.childIndex] = null; // L: 518
				ChatChannel.invalidateWidget(var10); // L: 519
				return 1; // L: 520
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 522
				var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 523
				var3.children = null; // L: 524
				ChatChannel.invalidateWidget(var3); // L: 525
				return 1; // L: 526
			} else if (var0 == 103) { // L: 528
				class446.Interpreter_intStackSize -= 3; // L: 529
				return 1; // L: 530
			} else if (var0 == 104) { // L: 532
				--class446.Interpreter_intStackSize; // L: 533
				return 1; // L: 534
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 536
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 549
					var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 550
					if (var3 != null) { // L: 551
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 552
						if (var2) { // L: 553
							class124.scriptDotWidget = var3;
						} else {
							GrandExchangeOfferOwnWorldComparator.scriptActiveWidget = var3; // L: 554
						}
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 556
					}

					return 1; // L: 557
				} else if (var0 == 202) { // L: 559
					Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] = 0; // L: 560
					return 1; // L: 561
				} else if (var0 == 203) { // L: 563
					Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize + 1] = 0; // L: 564
					return 1; // L: 565
				} else {
					return 2; // L: 567
				}
			} else {
				class446.Interpreter_intStackSize -= 2; // L: 537
				var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 538
				var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 539
				Widget var5 = ScriptFrame.getWidgetChild(var9, var4); // L: 540
				if (var5 != null && var4 != -1) { // L: 541
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 542
					if (var2) { // L: 543
						class124.scriptDotWidget = var5;
					} else {
						GrandExchangeOfferOwnWorldComparator.scriptActiveWidget = var5; // L: 544
					}
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 546
				}

				return 1; // L: 547
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "20332166"
	)
	public static int method3250(int var0) {
		return Decimator.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 81
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "34"
	)
	static int method3249(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2351
			if (Player.friendSystem.field802 == 0) { // L: 2352
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -2;
			} else if (Player.friendSystem.field802 == 1) { // L: 2353
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Player.friendSystem.friendsList.getSize(); // L: 2354
			}

			return 1; // L: 2355
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2358
				if (Player.friendSystem.method1634() && var3 >= 0 && var3 < Player.friendSystem.friendsList.getSize()) { // L: 2359
					Friend var8 = (Friend)Player.friendSystem.friendsList.get(var3); // L: 2360
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2361
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2362
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2365
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2366
				}

				return 1; // L: 2368
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2371
				if (Player.friendSystem.method1634() && var3 >= 0 && var3 < Player.friendSystem.friendsList.getSize()) { // L: 2372
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Buddy)Player.friendSystem.friendsList.get(var3)).world; // L: 2373
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2375
				}

				return 1; // L: 2376
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2379
				if (Player.friendSystem.method1634() && var3 >= 0 && var3 < Player.friendSystem.friendsList.getSize()) { // L: 2380
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Buddy)Player.friendSystem.friendsList.get(var3)).rank; // L: 2381
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2383
				}

				return 1; // L: 2384
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2387
					int var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2388
					DevicePcmPlayerProvider.method309(var5, var6); // L: 2389
					return 1; // L: 2390
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2393
					Player.friendSystem.addFriend(var5); // L: 2394
					return 1; // L: 2395
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2398
					Player.friendSystem.removeFriend(var5); // L: 2399
					return 1; // L: 2400
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2403
					Player.friendSystem.addIgnore(var5); // L: 2404
					return 1; // L: 2405
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2408
					Player.friendSystem.removeIgnore(var5); // L: 2409
					return 1; // L: 2410
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2413
					var5 = class92.method2388(var5); // L: 2414
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Player.friendSystem.isFriended(new Username(var5, HealthBarDefinition.loginType), false) ? 1 : 0; // L: 2415
					return 1; // L: 2416
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Huffman.friendsChat != null) { // L: 2419
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Huffman.friendsChat.name; // L: 2420
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2422
					}

					return 1; // L: 2423
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Huffman.friendsChat != null) { // L: 2426
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Huffman.friendsChat.getSize(); // L: 2427
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2429
					}

					return 1; // L: 2430
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2433
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize()) { // L: 2434
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Huffman.friendsChat.get(var3).getUsername().getName(); // L: 2435
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2437
					}

					return 1; // L: 2438
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2441
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize()) { // L: 2442
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Buddy)Huffman.friendsChat.get(var3)).getWorld(); // L: 2443
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2445
					}

					return 1; // L: 2446
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2449
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize()) { // L: 2450
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((Buddy)Huffman.friendsChat.get(var3)).rank; // L: 2451
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2453
					}

					return 1; // L: 2454
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Huffman.friendsChat != null ? Huffman.friendsChat.minKick : 0; // L: 2457
					return 1; // L: 2458
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2461
					ArchiveLoader.clanKickUser(var5); // L: 2462
					return 1; // L: 2463
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Huffman.friendsChat != null ? Huffman.friendsChat.rank * -1691262047 * -1648279455 : 0; // L: 2466
					return 1; // L: 2467
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2470
					Players.Clan_joinChat(var5); // L: 2471
					return 1; // L: 2472
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					UserComparator5.Clan_leaveChat(); // L: 2475
					return 1; // L: 2476
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!Player.friendSystem.method1634()) { // L: 2479
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Player.friendSystem.ignoreList.getSize(); // L: 2480
					}

					return 1; // L: 2481
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2484
					if (Player.friendSystem.method1634() && var3 >= 0 && var3 < Player.friendSystem.ignoreList.getSize()) { // L: 2485
						Ignored var4 = (Ignored)Player.friendSystem.ignoreList.get(var3); // L: 2486
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2487
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2488
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2491
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2492
					}

					return 1; // L: 2494
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 2497
					var5 = class92.method2388(var5); // L: 2498
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Player.friendSystem.isIgnored(new Username(var5, HealthBarDefinition.loginType)) ? 1 : 0; // L: 2499
					return 1; // L: 2500
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2503
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize() && Huffman.friendsChat.get(var3).getUsername().equals(class101.localPlayer.username)) { // L: 2504
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 2505
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2507
					}

					return 1; // L: 2508
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Huffman.friendsChat != null && Huffman.friendsChat.owner != null) { // L: 2511
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Huffman.friendsChat.owner; // L: 2512
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2514
					}

					return 1; // L: 2515
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2518
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize() && ((ClanMate)Huffman.friendsChat.get(var3)).isFriend()) { // L: 2519
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 2520
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2522
					}

					return 1; // L: 2523
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						Player.friendSystem.friendsList.removeComparator(); // L: 2534
						return 1; // L: 2535
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2538
							Player.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2539
							return 1; // L: 2540
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2543
							Player.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2544
							return 1; // L: 2545
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2548
							Player.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2549
							return 1; // L: 2550
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2553
							Player.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2554
							return 1; // L: 2555
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2558
							Player.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2559
							return 1; // L: 2560
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2563
							Player.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2564
							return 1; // L: 2565
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2568
							Player.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2569
							return 1; // L: 2570
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2573
							Player.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2574
							return 1; // L: 2575
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2578
							Player.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2579
							return 1; // L: 2580
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2583
							Player.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2584
							return 1; // L: 2585
						} else if (var0 == 3639) {
							Player.friendSystem.friendsList.sort(); // L: 2588
							return 1; // L: 2589
						} else if (var0 == 3640) {
							Player.friendSystem.ignoreList.removeComparator(); // L: 2592
							return 1; // L: 2593
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2596
							Player.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2597
							return 1; // L: 2598
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2601
							Player.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2602
							return 1; // L: 2603
						} else if (var0 == 3643) {
							Player.friendSystem.ignoreList.sort(); // L: 2606
							return 1; // L: 2607
						} else if (var0 == 3644) {
							if (Huffman.friendsChat != null) { // L: 2610
								Huffman.friendsChat.removeComparator(); // L: 2611
							}

							return 1; // L: 2613
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2616
							if (Huffman.friendsChat != null) { // L: 2617
								Huffman.friendsChat.addComparator(new UserComparator1(var7)); // L: 2618
							}

							return 1; // L: 2620
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2623
							if (Huffman.friendsChat != null) { // L: 2624
								Huffman.friendsChat.addComparator(new UserComparator2(var7)); // L: 2625
							}

							return 1; // L: 2627
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2630
							if (Huffman.friendsChat != null) { // L: 2631
								Huffman.friendsChat.addComparator(new UserComparator3(var7)); // L: 2632
							}

							return 1; // L: 2634
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2637
							if (Huffman.friendsChat != null) { // L: 2638
								Huffman.friendsChat.addComparator(new UserComparator4(var7)); // L: 2639
							}

							return 1; // L: 2641
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2644
							if (Huffman.friendsChat != null) { // L: 2645
								Huffman.friendsChat.addComparator(new UserComparator5(var7)); // L: 2646
							}

							return 1; // L: 2648
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2651
							if (Huffman.friendsChat != null) { // L: 2652
								Huffman.friendsChat.addComparator(new UserComparator6(var7)); // L: 2653
							}

							return 1; // L: 2655
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2658
							if (Huffman.friendsChat != null) { // L: 2659
								Huffman.friendsChat.addComparator(new UserComparator7(var7)); // L: 2660
							}

							return 1; // L: 2662
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2665
							if (Huffman.friendsChat != null) { // L: 2666
								Huffman.friendsChat.addComparator(new UserComparator8(var7)); // L: 2667
							}

							return 1; // L: 2669
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2672
							if (Huffman.friendsChat != null) { // L: 2673
								Huffman.friendsChat.addComparator(new UserComparator9(var7)); // L: 2674
							}

							return 1; // L: 2676
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2679
							if (Huffman.friendsChat != null) { // L: 2680
								Huffman.friendsChat.addComparator(new UserComparator10(var7)); // L: 2681
							}

							return 1; // L: 2683
						} else if (var0 == 3655) {
							if (Huffman.friendsChat != null) { // L: 2686
								Huffman.friendsChat.sort(); // L: 2687
							}

							return 1; // L: 2689
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2692
							Player.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2693
							return 1; // L: 2694
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 2697
							if (Huffman.friendsChat != null) { // L: 2698
								Huffman.friendsChat.addComparator(new BuddyRankComparator(var7)); // L: 2699
							}

							return 1; // L: 2701
						} else {
							return 2; // L: 2703
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2526
					if (Huffman.friendsChat != null && var3 < Huffman.friendsChat.getSize() && ((ClanMate)Huffman.friendsChat.get(var3)).isIgnored()) { // L: 2527
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1; // L: 2528
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2530
					}

					return 1; // L: 2531
				}
			}
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-13"
	)
	static final void method3262(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10562
		int var7 = var3 - var1; // L: 10563
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10564
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10565
		int var10 = var8; // L: 10566
		if (var8 < var9) { // L: 10567
			var10 = var9;
		}

		if (var10 != 0) { // L: 10568
			int var11 = (var6 << 16) / var10; // L: 10569
			int var12 = (var7 << 16) / var10; // L: 10570
			if (var12 <= var11) { // L: 10571
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10572
			}

			int var13 = var5 * var12 >> 17; // L: 10573
			int var14 = var5 * var12 + 1 >> 17; // L: 10574
			int var15 = var5 * var11 >> 17; // L: 10575
			int var16 = var5 * var11 + 1 >> 17; // L: 10576
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10577
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10578
			int var17 = var0 + var13; // L: 10579
			int var18 = var0 - var14; // L: 10580
			int var19 = var0 + var6 - var14; // L: 10581
			int var20 = var0 + var13 + var6; // L: 10582
			int var21 = var15 + var1; // L: 10583
			int var22 = var1 - var16; // L: 10584
			int var23 = var7 + var1 - var16; // L: 10585
			int var24 = var15 + var7 + var1; // L: 10586
			Rasterizer3D.method4030(var17, var18, var19); // L: 10587
			Rasterizer3D.method4116(var21, var22, var23, var17, var18, var19, var4); // L: 10588
			Rasterizer3D.method4030(var17, var19, var20); // L: 10589
			Rasterizer3D.method4116(var21, var23, var24, var17, var19, var20, var4); // L: 10590
		}
	} // L: 10591
}
