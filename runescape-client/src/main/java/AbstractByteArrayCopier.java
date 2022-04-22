import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("je")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "2035077648"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1279201457"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "-58"
	)
	static int method5506(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2341
			if (Decimator.friendSystem.field805 == 0) { // L: 2342
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (Decimator.friendSystem.field805 == 1) { // L: 2343
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.friendSystem.friendsList.getSize(); // L: 2344
			}

			return 1; // L: 2345
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2348
				if (Decimator.friendSystem.method1681() && var3 >= 0 && var3 < Decimator.friendSystem.friendsList.getSize()) { // L: 2349
					Friend var8 = (Friend)Decimator.friendSystem.friendsList.get(var3); // L: 2350
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2351
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2352
				} else {
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 2355
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 2356
				}

				return 1; // L: 2358
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2361
				if (Decimator.friendSystem.method1681() && var3 >= 0 && var3 < Decimator.friendSystem.friendsList.getSize()) { // L: 2362
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Decimator.friendSystem.friendsList.get(var3)).world; // L: 2363
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2365
				}

				return 1; // L: 2366
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2369
				if (Decimator.friendSystem.method1681() && var3 >= 0 && var3 < Decimator.friendSystem.friendsList.getSize()) { // L: 2370
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Decimator.friendSystem.friendsList.get(var3)).rank; // L: 2371
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2373
				}

				return 1; // L: 2374
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2377
					int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2378
					WorldMapLabelSize.method3903(var5, var6); // L: 2379
					return 1; // L: 2380
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2383
					Decimator.friendSystem.addFriend(var5); // L: 2384
					return 1; // L: 2385
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2388
					Decimator.friendSystem.removeFriend(var5); // L: 2389
					return 1; // L: 2390
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2393
					Decimator.friendSystem.addIgnore(var5); // L: 2394
					return 1; // L: 2395
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2398
					Decimator.friendSystem.removeIgnore(var5); // L: 2399
					return 1; // L: 2400
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2403
					var5 = class160.method3280(var5); // L: 2404
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.friendSystem.isFriended(new Username(var5, class122.loginType), false) ? 1 : 0; // L: 2405
					return 1; // L: 2406
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (ClientPacket.friendsChat != null) { // L: 2409
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ClientPacket.friendsChat.name; // L: 2410
					} else {
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 2412
					}

					return 1; // L: 2413
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (ClientPacket.friendsChat != null) { // L: 2416
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.friendsChat.getSize(); // L: 2417
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2419
					}

					return 1; // L: 2420
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2423
					if (ClientPacket.friendsChat != null && var3 < ClientPacket.friendsChat.getSize()) { // L: 2424
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ClientPacket.friendsChat.get(var3).getUsername().getName(); // L: 2425
					} else {
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 2427
					}

					return 1; // L: 2428
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2431
					if (ClientPacket.friendsChat != null && var3 < ClientPacket.friendsChat.getSize()) { // L: 2432
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ClientPacket.friendsChat.get(var3)).getWorld(); // L: 2433
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2435
					}

					return 1; // L: 2436
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2439
					if (ClientPacket.friendsChat != null && var3 < ClientPacket.friendsChat.getSize()) { // L: 2440
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ClientPacket.friendsChat.get(var3)).rank; // L: 2441
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2443
					}

					return 1; // L: 2444
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.friendsChat != null ? ClientPacket.friendsChat.minKick : 0; // L: 2447
					return 1; // L: 2448
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2451
					MidiPcmStream.clanKickUser(var5); // L: 2452
					return 1; // L: 2453
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.friendsChat != null ? ClientPacket.friendsChat.rank * -1273194957 * 1318081787 : 0; // L: 2456
					return 1; // L: 2457
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2460
					WorldMapElement.Clan_joinChat(var5); // L: 2461
					return 1; // L: 2462
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapSprite.Clan_leaveChat(); // L: 2465
					return 1; // L: 2466
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!Decimator.friendSystem.method1681()) { // L: 2469
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.friendSystem.ignoreList.getSize(); // L: 2470
					}

					return 1; // L: 2471
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2474
					if (Decimator.friendSystem.method1681() && var3 >= 0 && var3 < Decimator.friendSystem.ignoreList.getSize()) { // L: 2475
						Ignored var4 = (Ignored)Decimator.friendSystem.ignoreList.get(var3); // L: 2476
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2477
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2478
					} else {
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 2481
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 2482
					}

					return 1; // L: 2484
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 2487
					var5 = class160.method3280(var5); // L: 2488
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.friendSystem.isIgnored(new Username(var5, class122.loginType)) ? 1 : 0; // L: 2489
					return 1; // L: 2490
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2493
					if (ClientPacket.friendsChat != null && var3 < ClientPacket.friendsChat.getSize() && ClientPacket.friendsChat.get(var3).getUsername().equals(GrandExchangeEvents.localPlayer.username)) { // L: 2494
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2495
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2497
					}

					return 1; // L: 2498
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (ClientPacket.friendsChat != null && ClientPacket.friendsChat.owner != null) { // L: 2501
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ClientPacket.friendsChat.owner; // L: 2502
					} else {
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 2504
					}

					return 1; // L: 2505
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2508
					if (ClientPacket.friendsChat != null && var3 < ClientPacket.friendsChat.getSize() && ((ClanMate)ClientPacket.friendsChat.get(var3)).isFriend()) { // L: 2509
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2510
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2512
					}

					return 1; // L: 2513
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						Decimator.friendSystem.friendsList.removeComparator(); // L: 2524
						return 1; // L: 2525
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2528
							Decimator.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2529
							return 1; // L: 2530
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2533
							Decimator.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2534
							return 1; // L: 2535
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2538
							Decimator.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2539
							return 1; // L: 2540
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2543
							Decimator.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2544
							return 1; // L: 2545
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2548
							Decimator.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2549
							return 1; // L: 2550
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2553
							Decimator.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2554
							return 1; // L: 2555
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2558
							Decimator.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2559
							return 1; // L: 2560
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2563
							Decimator.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2564
							return 1; // L: 2565
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2568
							Decimator.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2569
							return 1; // L: 2570
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2573
							Decimator.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2574
							return 1; // L: 2575
						} else if (var0 == 3639) {
							Decimator.friendSystem.friendsList.sort(); // L: 2578
							return 1; // L: 2579
						} else if (var0 == 3640) {
							Decimator.friendSystem.ignoreList.removeComparator(); // L: 2582
							return 1; // L: 2583
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2586
							Decimator.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2587
							return 1; // L: 2588
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2591
							Decimator.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2592
							return 1; // L: 2593
						} else if (var0 == 3643) {
							Decimator.friendSystem.ignoreList.sort(); // L: 2596
							return 1; // L: 2597
						} else if (var0 == 3644) {
							if (ClientPacket.friendsChat != null) { // L: 2600
								ClientPacket.friendsChat.removeComparator(); // L: 2601
							}

							return 1; // L: 2603
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2606
							if (ClientPacket.friendsChat != null) { // L: 2607
								ClientPacket.friendsChat.addComparator(new UserComparator1(var7)); // L: 2608
							}

							return 1; // L: 2610
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2613
							if (ClientPacket.friendsChat != null) { // L: 2614
								ClientPacket.friendsChat.addComparator(new UserComparator2(var7)); // L: 2615
							}

							return 1; // L: 2617
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2620
							if (ClientPacket.friendsChat != null) { // L: 2621
								ClientPacket.friendsChat.addComparator(new UserComparator3(var7)); // L: 2622
							}

							return 1; // L: 2624
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2627
							if (ClientPacket.friendsChat != null) { // L: 2628
								ClientPacket.friendsChat.addComparator(new UserComparator4(var7)); // L: 2629
							}

							return 1; // L: 2631
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2634
							if (ClientPacket.friendsChat != null) { // L: 2635
								ClientPacket.friendsChat.addComparator(new UserComparator5(var7)); // L: 2636
							}

							return 1; // L: 2638
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2641
							if (ClientPacket.friendsChat != null) { // L: 2642
								ClientPacket.friendsChat.addComparator(new UserComparator6(var7)); // L: 2643
							}

							return 1; // L: 2645
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2648
							if (ClientPacket.friendsChat != null) { // L: 2649
								ClientPacket.friendsChat.addComparator(new UserComparator7(var7)); // L: 2650
							}

							return 1; // L: 2652
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2655
							if (ClientPacket.friendsChat != null) { // L: 2656
								ClientPacket.friendsChat.addComparator(new UserComparator8(var7)); // L: 2657
							}

							return 1; // L: 2659
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2662
							if (ClientPacket.friendsChat != null) { // L: 2663
								ClientPacket.friendsChat.addComparator(new UserComparator9(var7)); // L: 2664
							}

							return 1; // L: 2666
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2669
							if (ClientPacket.friendsChat != null) { // L: 2670
								ClientPacket.friendsChat.addComparator(new UserComparator10(var7)); // L: 2671
							}

							return 1; // L: 2673
						} else if (var0 == 3655) {
							if (ClientPacket.friendsChat != null) { // L: 2676
								ClientPacket.friendsChat.sort(); // L: 2677
							}

							return 1; // L: 2679
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2682
							Decimator.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2683
							return 1; // L: 2684
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2687
							if (ClientPacket.friendsChat != null) { // L: 2688
								ClientPacket.friendsChat.addComparator(new BuddyRankComparator(var7)); // L: 2689
							}

							return 1; // L: 2691
						} else {
							return 2; // L: 2693
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2516
					if (ClientPacket.friendsChat != null && var3 < ClientPacket.friendsChat.getSize() && ((ClanMate)ClientPacket.friendsChat.get(var3)).isIgnored()) { // L: 2517
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2518
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2520
					}

					return 1; // L: 2521
				}
			}
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "([Lky;Lky;ZI)V",
		garbageValue = "1933510801"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * -188983191 * -885606439 : var1.width * -1328038141 * -1237179477; // L: 10789
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * 153385713 * -1426770415 : var1.height * 191855667 * -686825733; // L: 10790
		ModelData0.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10791
		if (var1.children != null) { // L: 10792
			ModelData0.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10793
		if (var5 != null) { // L: 10794
			int var6 = var5.group; // L: 10795
			if (class155.loadInterface(var6)) { // L: 10797
				ModelData0.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 10798
			}
		}

		if (var1.contentType == 1337) { // L: 10801
		}

	} // L: 10802
}
