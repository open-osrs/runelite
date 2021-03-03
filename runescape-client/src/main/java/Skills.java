import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("v")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("d")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static GameBuild field2774;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lkd;ILbk;IB)V",
		garbageValue = "4"
	)
	static final void method4320(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = -1; // L: 455
		if ((var3 & 4096) != 0) { // L: 456
			var2.field992 = var0.method5721(); // L: 457
			var2.field952 = var0.readByte(); // L: 458
			var2.field996 = var0.method5747(); // L: 459
			var2.field998 = var0.method5747(); // L: 460
			var2.field999 = var0.readUnsignedShort() + Client.cycle; // L: 461
			var2.field1000 = var0.readUnsignedShort() + Client.cycle; // L: 462
			var2.field1001 = var0.readUnsignedShort(); // L: 463
			if (var2.field652) { // L: 464
				var2.field992 += var2.tileX; // L: 465
				var2.field952 += var2.tileY; // L: 466
				var2.field996 += var2.tileX; // L: 467
				var2.field998 += var2.tileY; // L: 468
				var2.pathLength = 0; // L: 469
			} else {
				var2.field992 += var2.pathX[0]; // L: 472
				var2.field952 += var2.pathY[0]; // L: 473
				var2.field996 += var2.pathX[0]; // L: 474
				var2.field998 += var2.pathY[0]; // L: 475
				var2.pathLength = 1; // L: 476
			}

			var2.field1012 = 0; // L: 478
		}

		int var5;
		if ((var3 & 1024) != 0) { // L: 480
			var2.spotAnimation = var0.method5729(); // L: 481
			var5 = var0.method5739(); // L: 482
			var2.field994 = var5 >> 16; // L: 483
			var2.field993 = (var5 & 65535) + Client.cycle; // L: 484
			var2.spotAnimationFrame = 0; // L: 485
			var2.spotAnimationFrameCycle = 0; // L: 486
			if (var2.field993 > Client.cycle) { // L: 487
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 488
				var2.spotAnimation = -1;
			}
		}

		int var8;
		int var9;
		int var12;
		if ((var3 & 32) != 0) { // L: 490
			var5 = var0.method5729(); // L: 491
			PlayerType var6 = (PlayerType)InterfaceParent.findEnumerated(class69.PlayerType_values(), var0.method5720()); // L: 492
			boolean var7 = var0.method5776() == 1; // L: 493
			var8 = var0.method5776(); // L: 494
			var9 = var0.offset; // L: 495
			if (var2.username != null && var2.appearance != null) { // L: 496
				boolean var10 = false; // L: 497
				if (var6.isUser && InterfaceParent.friendSystem.isIgnored(var2.username)) { // L: 498 499
					var10 = true;
				}

				if (!var10 && Client.field778 == 0 && !var2.isHidden) { // L: 501
					Players.field1279.offset = 0; // L: 502
					var0.method5740(Players.field1279.array, 0, var8); // L: 503
					Players.field1279.offset = 0; // L: 504
					String var11 = AbstractFont.escapeBrackets(UrlRequester.method3467(JagexCache.method3683(Players.field1279))); // L: 505
					var2.overheadText = var11.trim(); // L: 506
					var2.overheadTextColor = var5 >> 8; // L: 507
					var2.overheadTextEffect = var5 & 255; // L: 508
					var2.overheadTextCyclesRemaining = 150; // L: 509
					var2.isAutoChatting = var7; // L: 510
					var2.field968 = var2 != UserComparator9.localPlayer && var6.isUser && "" != Client.field882 && var11.toLowerCase().indexOf(Client.field882) == -1; // L: 511
					if (var6.isPrivileged) { // L: 513
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2; // L: 514
					}

					if (var6.modIcon != -1) { // L: 515
						AbstractWorldMapData.addGameMessage(var12, UserComparator10.method3580(var6.modIcon) + var2.username.getName(), var11);
					} else {
						AbstractWorldMapData.addGameMessage(var12, var2.username.getName(), var11); // L: 516
					}
				}
			}

			var0.offset = var9 + var8; // L: 519
		}

		if ((var3 & 256) != 0) { // L: 521
			for (var5 = 0; var5 < 3; ++var5) { // L: 522
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 2048) != 0) { // L: 524
			Players.field1274[var1] = var0.method5721(); // L: 525
		}

		if ((var3 & 8) != 0) { // L: 527
			var2.targetIndex = var0.readUnsignedShort(); // L: 528
			if (var2.targetIndex == 65535) { // L: 529
				var2.targetIndex = -1;
			}
		}

		int var13;
		if ((var3 & 128) != 0) { // L: 531
			var5 = var0.readUnsignedByte(); // L: 532
			int var15;
			int var17;
			int var19;
			if (var5 > 0) { // L: 533
				for (var13 = 0; var13 < var5; ++var13) { // L: 534
					var8 = -1; // L: 536
					var9 = -1; // L: 537
					var19 = -1; // L: 538
					var17 = var0.readUShortSmart(); // L: 539
					if (var17 == 32767) { // L: 540
						var17 = var0.readUShortSmart(); // L: 541
						var9 = var0.readUShortSmart(); // L: 542
						var8 = var0.readUShortSmart(); // L: 543
						var19 = var0.readUShortSmart(); // L: 544
					} else if (var17 != 32766) { // L: 546
						var9 = var0.readUShortSmart(); // L: 547
					} else {
						var17 = -1; // L: 549
					}

					var15 = var0.readUShortSmart(); // L: 550
					var2.addHitSplat(var17, var9, var8, var19, Client.cycle, var15); // L: 551
				}
			}

			var13 = var0.method5776(); // L: 554
			if (var13 > 0) { // L: 555
				for (var17 = 0; var17 < var13; ++var17) { // L: 556
					var8 = var0.readUShortSmart(); // L: 557
					var9 = var0.readUShortSmart(); // L: 558
					if (var9 != 32767) { // L: 559
						var19 = var0.readUShortSmart(); // L: 560
						var15 = var0.method5717(); // L: 561
						var12 = var9 > 0 ? var0.method5776() : var15; // L: 562
						var2.addHealthBar(var8, Client.cycle, var9, var19, var15, var12); // L: 563
					} else {
						var2.removeHealthBar(var8); // L: 565
					}
				}
			}
		}

		if ((var3 & 512) != 0) { // L: 569
			var4 = var0.method5721(); // L: 570
		}

		if ((var3 & 64) != 0) { // L: 572
			var5 = var0.readUnsignedShort(); // L: 573
			if (var5 == 65535) { // L: 574
				var5 = -1;
			}

			var13 = var0.method5720(); // L: 575
			UserComparator7.performPlayerAnimation(var2, var5, var13); // L: 576
		}

		if ((var3 & 1) != 0) { // L: 578
			var2.field981 = var0.method5729(); // L: 579
			if (var2.pathLength == 0) { // L: 580
				var2.orientation = var2.field981; // L: 581
				var2.field981 = -1; // L: 582
			}
		}

		if ((var3 & 16) != 0) { // L: 585
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 586
			if (var2.overheadText.charAt(0) == '~') { // L: 587
				var2.overheadText = var2.overheadText.substring(1); // L: 588
				AbstractWorldMapData.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 589
			} else if (var2 == UserComparator9.localPlayer) { // L: 591
				AbstractWorldMapData.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 592
			}

			var2.isAutoChatting = false; // L: 594
			var2.overheadTextColor = 0; // L: 595
			var2.overheadTextEffect = 0; // L: 596
			var2.overheadTextCyclesRemaining = 150; // L: 597
		}

		if ((var3 & 2) != 0) { // L: 599
			var5 = var0.method5776(); // L: 600
			byte[] var16 = new byte[var5]; // L: 601
			Buffer var14 = new Buffer(var16); // L: 602
			var0.method5740(var16, 0, var5); // L: 603
			Players.field1269[var1] = var14; // L: 604
			var2.read(var14); // L: 605
		}

		if (var2.field652) { // L: 607
			if (var4 == 127) { // L: 608
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				byte var18;
				if (var4 != -1) { // L: 611
					var18 = var4;
				} else {
					var18 = Players.field1274[var1]; // L: 612
				}

				var2.method1327(var2.tileX, var2.tileY, var18); // L: 613
			}
		}

	} // L: 617
}
