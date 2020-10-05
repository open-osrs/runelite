import java.awt.Component;
import java.util.Comparator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive SequenceDefinition_skeletonsArchive;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lf;Lf;B)I",
		garbageValue = "0"
	)
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1389394211"
	)
	static void method242(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "1274576828"
	)
	static final void method234(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 443
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 444
			Player var3 = Client.players[var2]; // L: 445
			int var4 = var0.readUnsignedByte(); // L: 446
			if ((var4 & 128) != 0) { // L: 447
				var4 += var0.readUnsignedByte() << 8;
			}

			byte var5 = -1; // L: 449
			if ((var4 & 2048) != 0) { // L: 450
				var3.field997 = var0.readByte(); // L: 451
				var3.field1016 = var0.method5730(); // L: 452
				var3.field1015 = var0.readByte(); // L: 453
				var3.field1017 = var0.readByte(); // L: 454
				var3.field1026 = var0.method5657() + Client.cycle; // L: 455
				var3.field1019 = var0.method5655() + Client.cycle; // L: 456
				var3.field1027 = var0.method5656(); // L: 457
				if (var3.field660) { // L: 458
					var3.field997 += var3.tileX; // L: 459
					var3.field1016 += var3.tileY; // L: 460
					var3.field1015 += var3.tileX; // L: 461
					var3.field1017 += var3.tileY; // L: 462
					var3.pathLength = 0; // L: 463
				} else {
					var3.field997 += var3.pathX[0]; // L: 466
					var3.field1016 += var3.pathY[0]; // L: 467
					var3.field1015 += var3.pathX[0]; // L: 468
					var3.field1017 += var3.pathY[0]; // L: 469
					var3.pathLength = 1; // L: 470
				}

				var3.field973 = 0; // L: 472
			}

			int var6;
			int var7;
			if ((var4 & 4) != 0) { // L: 474
				var6 = var0.method5656(); // L: 475
				if (var6 == 65535) { // L: 476
					var6 = -1;
				}

				var7 = var0.readUnsignedByte(); // L: 477
				GrandExchangeOfferNameComparator.performPlayerAnimation(var3, var6, var7); // L: 478
			}

			if ((var4 & 4096) != 0) { // L: 480
				var5 = var0.method5649(); // L: 481
			}

			int var9;
			int var10;
			int var13;
			if ((var4 & 64) != 0) { // L: 483
				var6 = var0.method5656(); // L: 484
				PlayerType var14 = (PlayerType)TextureProvider.findEnumerated(ApproximateRouteStrategy.PlayerType_values(), var0.method5639()); // L: 485
				boolean var8 = var0.method5612() == 1; // L: 486
				var9 = var0.method5639(); // L: 487
				var10 = var0.offset; // L: 488
				if (var3.username != null && var3.appearance != null) { // L: 489
					boolean var11 = false; // L: 490
					if (var14.isUser && class60.friendSystem.isIgnored(var3.username)) { // L: 491 492
						var11 = true;
					}

					if (!var11 && Client.field790 == 0 && !var3.isHidden) { // L: 494
						Players.field1287.offset = 0; // L: 495
						var0.method5697(Players.field1287.array, 0, var9); // L: 496
						Players.field1287.offset = 0; // L: 497
						String var12 = AbstractFont.escapeBrackets(Huffman.method4049(ScriptEvent.method1235(Players.field1287))); // L: 498
						var3.overheadText = var12.trim(); // L: 499
						var3.overheadTextColor = var6 >> 8; // L: 500
						var3.overheadTextEffect = var6 & 255; // L: 501
						var3.overheadTextCyclesRemaining = 150; // L: 502
						var3.isAutoChatting = var8; // L: 503
						var3.field986 = var3 != WorldMapLabelSize.localPlayer && var14.isUser && "" != Client.field913 && var12.toLowerCase().indexOf(Client.field913) == -1; // L: 504
						if (var14.isPrivileged) { // L: 506
							var13 = var8 ? 91 : 1;
						} else {
							var13 = var8 ? 90 : 2; // L: 507
						}

						if (var14.modIcon != -1) { // L: 508
							WorldMapRectangle.addGameMessage(var13, WorldMapScaleHandler.method824(var14.modIcon) + var3.username.getName(), var12);
						} else {
							WorldMapRectangle.addGameMessage(var13, var3.username.getName(), var12); // L: 509
						}
					}
				}

				var0.offset = var10 + var9; // L: 512
			}

			if ((var4 & 512) != 0) { // L: 514
				Players.field1284[var2] = var0.readByte(); // L: 515
			}

			if ((var4 & 16) != 0) { // L: 517
				var6 = var0.method5612(); // L: 518
				int var16;
				int var17;
				int var19;
				if (var6 > 0) { // L: 519
					for (var7 = 0; var7 < var6; ++var7) { // L: 520
						var9 = -1; // L: 522
						var10 = -1; // L: 523
						var19 = -1; // L: 524
						var17 = var0.readUShortSmart(); // L: 525
						if (var17 == 32767) { // L: 526
							var17 = var0.readUShortSmart(); // L: 527
							var10 = var0.readUShortSmart(); // L: 528
							var9 = var0.readUShortSmart(); // L: 529
							var19 = var0.readUShortSmart(); // L: 530
						} else if (var17 != 32766) { // L: 532
							var10 = var0.readUShortSmart(); // L: 533
						} else {
							var17 = -1; // L: 535
						}

						var16 = var0.readUShortSmart(); // L: 536
						var3.addHitSplat(var17, var10, var9, var19, Client.cycle, var16); // L: 537
					}
				}

				var7 = var0.method5646(); // L: 540
				if (var7 > 0) { // L: 541
					for (var17 = 0; var17 < var7; ++var17) { // L: 542
						var9 = var0.readUShortSmart(); // L: 543
						var10 = var0.readUShortSmart(); // L: 544
						if (var10 != 32767) { // L: 545
							var19 = var0.readUShortSmart(); // L: 546
							var16 = var0.readUnsignedByte(); // L: 547
							var13 = var10 > 0 ? var0.method5646() : var16; // L: 548
							var3.addHealthBar(var9, Client.cycle, var10, var19, var16, var13); // L: 549
						} else {
							var3.removeHealthBar(var9); // L: 551
						}
					}
				}
			}

			if ((var4 & 1024) != 0) { // L: 555
				var3.spotAnimation = var0.readUnsignedShort(); // L: 556
				var6 = var0.method5667(); // L: 557
				var3.field1003 = var6 >> 16; // L: 558
				var3.field1013 = (var6 & 65535) + Client.cycle; // L: 559
				var3.spotAnimationFrame = 0; // L: 560
				var3.spotAnimationFrameCycle = 0; // L: 561
				if (var3.field1013 > Client.cycle) { // L: 562
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 563
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 32) != 0) { // L: 565
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 566
				if (var3.overheadText.charAt(0) == '~') { // L: 567
					var3.overheadText = var3.overheadText.substring(1); // L: 568
					WorldMapRectangle.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 569
				} else if (var3 == WorldMapLabelSize.localPlayer) { // L: 571
					WorldMapRectangle.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 572
				}

				var3.isAutoChatting = false; // L: 574
				var3.overheadTextColor = 0; // L: 575
				var3.overheadTextEffect = 0; // L: 576
				var3.overheadTextCyclesRemaining = 150; // L: 577
			}

			if ((var4 & 1) != 0) { // L: 579
				var6 = var0.method5639(); // L: 580
				byte[] var20 = new byte[var6]; // L: 581
				Buffer var15 = new Buffer(var20); // L: 582
				var0.method5749(var20, 0, var6); // L: 583
				Players.field1277[var2] = var15; // L: 584
				var3.read(var15); // L: 585
			}

			if ((var4 & 8) != 0) { // L: 587
				var3.targetIndex = var0.method5657(); // L: 588
				if (var3.targetIndex == 65535) { // L: 589
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 2) != 0) { // L: 591
				var3.field1000 = var0.method5655(); // L: 592
				if (var3.pathLength == 0) { // L: 593
					var3.orientation = var3.field1000; // L: 594
					var3.field1000 = -1; // L: 595
				}
			}

			if ((var4 & 256) != 0) { // L: 598
				for (var6 = 0; var6 < 3; ++var6) { // L: 599
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if (var3.field660) { // L: 601
				if (var5 == 127) { // L: 602
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					byte var18;
					if (var5 != -1) { // L: 605
						var18 = var5;
					} else {
						var18 = Players.field1284[var2]; // L: 606
					}

					var3.method1286(var3.tileX, var3.tileY, var18); // L: 607
				}
			}
		}

	} // L: 613
}
