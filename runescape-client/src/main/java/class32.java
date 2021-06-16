import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ap")
public final class class32 {
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 450314799
	)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "121"
	)
	public static boolean method384(int var0) {
		return var0 == WorldMapDecorationType.field3168.id; // L: 46
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-88"
	)
	static int method386(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2455
			if (WorldMapManager.guestClanSettings != null) { // L: 2456
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 2457
				DirectByteArrayCopier.field3128 = WorldMapManager.guestClanSettings; // L: 2458
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2460
			}

			return 1; // L: 2461
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2463
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2464
				if (Client.currentClanSettings[var3] != null) { // L: 2465
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 2466
					DirectByteArrayCopier.field3128 = Client.currentClanSettings[var3]; // L: 2467
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2469
				}

				return 1; // L: 2470
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2472
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field3128.name; // L: 2473
				return 1; // L: 2474
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2476
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.allowGuests ? 1 : 0; // L: 2477
				return 1; // L: 2478
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2480
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field87; // L: 2481
				return 1; // L: 2482
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2484
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field88; // L: 2485
				return 1; // L: 2486
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2488
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field93; // L: 2489
				return 1; // L: 2490
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2492
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field90; // L: 2493
				return 1; // L: 2494
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2496
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.memberCount; // L: 2497
				return 1; // L: 2498
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2500
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2501
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field3128.memberNames[var3]; // L: 2502
				return 1; // L: 2503
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2505
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2506
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.memberRanks[var3]; // L: 2507
				return 1; // L: 2508
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2510
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.bannedMemberCount; // L: 2511
				return 1; // L: 2512
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2514
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2515
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = DirectByteArrayCopier.field3128.bannedMemberNames[var3]; // L: 2516
				return 1; // L: 2517
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2519
					ChatChannel.Interpreter_intStackSize -= 3; // L: 2520
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2521
					var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2522
					var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2523
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.method170(var3, var6, var5); // L: 2524
					return 1; // L: 2525
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2527
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.currentOwner; // L: 2528
					return 1; // L: 2529
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2531
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field99; // L: 2532
					return 1; // L: 2533
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2535
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.method196(Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]); // L: 2536
					return 1; // L: 2537
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2539
					Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.getSortedMembers()[Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1]]; // L: 2540
					return 1; // L: 2541
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2543
					ChatChannel.Interpreter_intStackSize -= 2; // L: 2544
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2545
					var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2546
					WorldMapRegion.method3519(var6, var3); // L: 2547
					return 1; // L: 2548
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2550
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2551
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field96[var3]; // L: 2552
					return 1; // L: 2553
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2555
						ChatChannel.Interpreter_intStackSize -= 3; // L: 2556
						var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2557
						boolean var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1; // L: 2558
						var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2559
						GrandExchangeOfferAgeComparator.method5203(var5, var3, var4); // L: 2560
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2562
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2563
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DirectByteArrayCopier.field3128.field97[var3] ? 1 : 0; // L: 2564
						return 1; // L: 2565
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2567
						if (AttackOption.guestClanChannel != null) { // L: 2568
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 2569
							WorldMapIcon_0.field2031 = AttackOption.guestClanChannel; // L: 2570
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2572
						}

						return 1; // L: 2573
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2575
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2576
						if (Client.currentClanChannels[var3] != null) { // L: 2577
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 2578
							WorldMapIcon_0.field2031 = Client.currentClanChannels[var3]; // L: 2579
							class21.field171 = var3; // L: 2580
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2582
						}

						return 1; // L: 2583
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2585
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = WorldMapIcon_0.field2031.name; // L: 2586
						return 1; // L: 2587
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2589
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.field28; // L: 2590
						return 1; // L: 2591
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2593
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.field27; // L: 2594
						return 1; // L: 2595
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2597
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.method49(); // L: 2598
						return 1; // L: 2599
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2601
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2602
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ((ClanChannelMember)WorldMapIcon_0.field2031.members.get(var3)).name; // L: 2603
						return 1; // L: 2604
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2606
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2607
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapIcon_0.field2031.members.get(var3)).rank; // L: 2608
						return 1; // L: 2609
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2611
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2612
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapIcon_0.field2031.members.get(var3)).world; // L: 2613
						return 1; // L: 2614
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2616
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2617
						class29.method378(class21.field171, var3); // L: 2618
						return 1; // L: 2619
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2621
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.method38(Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]); // L: 2622
						return 1; // L: 2623
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2625
						Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1] = WorldMapIcon_0.field2031.getSortedMembers()[Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1]]; // L: 2626
						return 1; // L: 2627
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2629
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class10.field74 != null ? 1 : 0; // L: 2630
						return 1; // L: 2631
					} else {
						return 2; // L: 2633
					}
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-45"
	)
	public static int method387(String var0) {
		return var0.length() + 2; // L: 130
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIIILoa;Liq;B)V",
		garbageValue = "-104"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11423
			int var6 = Client.camAngleY & 2047; // L: 11424
			int var7 = var3 * var3 + var2 * var2; // L: 11425
			if (var7 <= 6400) { // L: 11426
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11427
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11428
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11429
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11430
				if (var7 > 2500) {
					var4.method7041(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11431
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11432
				}

			}
		}
	} // L: 11433
}
