import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	field1267(2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	field1263(4);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1677551205
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12184
	} // L: 12185

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12189
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "489807425"
	)
	static void method2288() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)V",
		garbageValue = "1736201417"
	)
	static final void method2292(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 445
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 446
			Player var3 = Client.players[var2]; // L: 447
			int var4 = var0.readUnsignedByte(); // L: 448
			if ((var4 & 128) != 0) { // L: 449
				var4 += var0.readUnsignedByte() << 8;
			}

			byte var5 = class185.field2137.field2136; // L: 451
			if ((var4 & 2048) != 0) { // L: 452
				var3.field1153 = var0.method7400(); // L: 453
				var3.field1144 = var0.method7400(); // L: 454
				var3.field1147 = var0.readByte(); // L: 455
				var3.field1156 = var0.method7401(); // L: 456
				var3.field1157 = var0.method7408() + Client.cycle; // L: 457
				var3.field1158 = var0.readUnsignedShort() + Client.cycle; // L: 458
				var3.field1159 = var0.readUnsignedShort(); // L: 459
				if (var3.field1067) { // L: 460
					var3.field1153 += var3.tileX; // L: 461
					var3.field1144 += var3.tileY; // L: 462
					var3.field1147 += var3.tileX; // L: 463
					var3.field1156 += var3.tileY; // L: 464
					var3.pathLength = 0; // L: 465
				} else {
					var3.field1153 += var3.pathX[0]; // L: 468
					var3.field1144 += var3.pathY[0]; // L: 469
					var3.field1147 += var3.pathX[0]; // L: 470
					var3.field1156 += var3.pathY[0]; // L: 471
					var3.pathLength = 1; // L: 472
				}

				var3.field1176 = 0; // L: 474
			}

			if ((var4 & 16384) != 0) { // L: 476
				Players.field1277[var2] = (class185)class140.findEnumerated(class113.method2601(), var0.readByte()); // L: 477
			}

			int var6;
			int var9;
			int var10;
			int var13;
			if ((var4 & 32) != 0) { // L: 479
				var6 = var0.method7414(); // L: 480
				PlayerType var7 = (PlayerType)class140.findEnumerated(MidiPcmStream.PlayerType_values(), var0.method7398()); // L: 481
				boolean var8 = var0.method7398() == 1; // L: 482
				var9 = var0.readUnsignedByte(); // L: 483
				var10 = var0.offset; // L: 484
				if (var3.username != null && var3.appearance != null) { // L: 485
					boolean var11 = false; // L: 486
					if (var7.isUser && ClanSettings.friendSystem.isIgnored(var3.username)) { // L: 487 488
						var11 = true;
					}

					if (!var11 && Client.field658 == 0 && !var3.isHidden) { // L: 490
						Players.field1275.offset = 0; // L: 491
						var0.method7564(Players.field1275.array, 0, var9); // L: 492
						Players.field1275.offset = 0; // L: 493
						String var12 = AbstractFont.escapeBrackets(ModelData0.method4273(GrandExchangeOfferUnitPriceComparator.method5755(Players.field1275))); // L: 494
						var3.overheadText = var12.trim(); // L: 495
						var3.overheadTextColor = var6 >> 8; // L: 496
						var3.overheadTextEffect = var6 & 255; // L: 497
						var3.overheadTextCyclesRemaining = 150; // L: 498
						var3.isAutoChatting = var8; // L: 499
						var3.field1125 = var3 != WorldMapSprite.localPlayer && var7.isUser && "" != Client.field726 && var12.toLowerCase().indexOf(Client.field726) == -1; // L: 500
						if (var7.isPrivileged) { // L: 502
							var13 = var8 ? 91 : 1;
						} else {
							var13 = var8 ? 90 : 2; // L: 503
						}

						if (var7.modIcon != -1) { // L: 504
							LoginScreenAnimation.addGameMessage(var13, WorldMapSectionType.method4720(var7.modIcon) + var3.username.getName(), var12);
						} else {
							LoginScreenAnimation.addGameMessage(var13, var3.username.getName(), var12); // L: 505
						}
					}
				}

				var0.offset = var9 + var10; // L: 508
			}

			if ((var4 & 1024) != 0) { // L: 510
				var3.spotAnimation = var0.method7408(); // L: 511
				var6 = var0.readInt(); // L: 512
				var3.spotAnimationHeight = var6 >> 16; // L: 513
				var3.field1177 = (var6 & 65535) + Client.cycle; // L: 514
				var3.spotAnimationFrame = 0; // L: 515
				var3.spotAnimationFrameCycle = 0; // L: 516
				if (var3.field1177 > Client.cycle) { // L: 517
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 518
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 64) != 0) { // L: 520
				var3.targetIndex = var0.readUnsignedShort(); // L: 521
				if (var3.targetIndex == 65535) { // L: 522
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 8192) != 0) { // L: 524
				var3.field1162 = Client.cycle + var0.method7562(); // L: 525
				var3.field1163 = Client.cycle + var0.readUnsignedShort(); // L: 526
				var3.field1164 = var0.readByte(); // L: 527
				var3.field1155 = var0.readByte(); // L: 528
				var3.field1166 = var0.method7365(); // L: 529
				var3.field1167 = (byte)var0.method7398(); // L: 530
			}

			int var14;
			if ((var4 & 2) != 0) { // L: 532
				var6 = var0.readUnsignedByte(); // L: 533
				int var17;
				int var19;
				int var20;
				if (var6 > 0) { // L: 534
					for (var14 = 0; var14 < var6; ++var14) { // L: 535
						var9 = -1; // L: 537
						var10 = -1; // L: 538
						var20 = -1; // L: 539
						var19 = var0.readUShortSmart(); // L: 540
						if (var19 == 32767) { // L: 541
							var19 = var0.readUShortSmart(); // L: 542
							var10 = var0.readUShortSmart(); // L: 543
							var9 = var0.readUShortSmart(); // L: 544
							var20 = var0.readUShortSmart(); // L: 545
						} else if (var19 != 32766) { // L: 547
							var10 = var0.readUShortSmart(); // L: 548
						} else {
							var19 = -1; // L: 550
						}

						var17 = var0.readUShortSmart(); // L: 551
						var3.addHitSplat(var19, var10, var9, var20, Client.cycle, var17); // L: 552
					}
				}

				var14 = var0.method7467(); // L: 555
				if (var14 > 0) { // L: 556
					for (var19 = 0; var19 < var14; ++var19) { // L: 557
						var9 = var0.readUShortSmart(); // L: 558
						var10 = var0.readUShortSmart(); // L: 559
						if (var10 != 32767) { // L: 560
							var20 = var0.readUShortSmart(); // L: 561
							var17 = var0.method7467(); // L: 562
							var13 = var10 > 0 ? var0.method7399() : var17; // L: 563
							var3.addHealthBar(var9, Client.cycle, var10, var20, var17, var13); // L: 564
						} else {
							var3.removeHealthBar(var9); // L: 566
						}
					}
				}
			}

			if ((var4 & 8) != 0) { // L: 570
				var3.field1138 = var0.method7408(); // L: 571
				if (var3.pathLength == 0) { // L: 572
					var3.orientation = var3.field1138; // L: 573
					var3.field1138 = -1; // L: 574
				}
			}

			if ((var4 & 4) != 0) { // L: 577
				var6 = var0.readUnsignedShort(); // L: 578
				if (var6 == 65535) {
					var6 = -1; // L: 579
				}

				var14 = var0.readUnsignedByte(); // L: 580
				ItemContainer.performPlayerAnimation(var3, var6, var14); // L: 581
			}

			if ((var4 & 4096) != 0) { // L: 583
				var5 = var0.readByte(); // L: 584
			}

			if ((var4 & 512) != 0) { // L: 586
				for (var6 = 0; var6 < 3; ++var6) { // L: 587
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var4 & 1) != 0) { // L: 589
				var6 = var0.method7467(); // L: 590
				byte[] var18 = new byte[var6]; // L: 591
				Buffer var15 = new Buffer(var18); // L: 592
				var0.method7419(var18, 0, var6); // L: 593
				Players.field1278[var2] = var15; // L: 594
				var3.read(var15); // L: 595
			}

			if ((var4 & 16) != 0) { // L: 597
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 598
				if (var3.overheadText.charAt(0) == '~') { // L: 599
					var3.overheadText = var3.overheadText.substring(1); // L: 600
					LoginScreenAnimation.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 601
				} else if (var3 == WorldMapSprite.localPlayer) { // L: 603
					LoginScreenAnimation.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 604
				}

				var3.isAutoChatting = false; // L: 606
				var3.overheadTextColor = 0; // L: 607
				var3.overheadTextEffect = 0; // L: 608
				var3.overheadTextCyclesRemaining = 150; // L: 609
			}

			if (var3.field1067) { // L: 611
				if (var5 == 127) { // L: 612
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					class185 var16;
					if (var5 != class185.field2137.field2136) { // L: 615
						var16 = (class185)class140.findEnumerated(class113.method2601(), var5);
					} else {
						var16 = Players.field1277[var2]; // L: 616
					}

					var3.method2122(var3.tileX, var3.tileY, var16); // L: 617
				}
			}
		}

	} // L: 623

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1817008589"
	)
	static final void method2293() {
		Scene.Scene_isLowDetail = false; // L: 814
		Client.isLowDetail = false; // L: 815
	} // L: 816

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	static boolean method2294() {
		return (Client.drawPlayerNames & 2) != 0; // L: 4733
	}
}
