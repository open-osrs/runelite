import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class69 {
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("d")
	public static short[][] field568;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = 370652147
	)
	@Export("cameraPitch")
	static int cameraPitch;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-22894005"
	)
	static final boolean method1222(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 138
		Buffer var4 = new Buffer(var0); // L: 139
		int var5 = -1; // L: 140

		label71:
		while (true) {
			int var6 = var4.method6628(); // L: 142
			if (var6 == 0) { // L: 143
				return var3; // L: 174
			}

			var5 += var6; // L: 144
			int var7 = 0; // L: 145
			boolean var8 = false; // L: 146

			while (true) {
				int var9;
				while (!var8) { // L: 148
					var9 = var4.readUShortSmart(); // L: 154
					if (var9 == 0) { // L: 155
						continue label71;
					}

					var7 += var9 - 1; // L: 156
					int var10 = var7 & 63; // L: 157
					int var11 = var7 >> 6 & 63; // L: 158
					int var12 = var4.readUnsignedByte() >> 2; // L: 159
					int var13 = var11 + var1; // L: 160
					int var14 = var10 + var2; // L: 161
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 162
						ObjectComposition var15 = Tiles.getObjectDefinition(var5); // L: 163
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 164
							if (!var15.needsModelFiles()) { // L: 165
								++Client.field742; // L: 166
								var3 = false; // L: 167
							}

							var8 = true; // L: 169
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 149
				if (var9 == 0) { // L: 150
					break;
				}

				var4.readUnsignedByte(); // L: 151
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	public static void method1224() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	static void method1208() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lgp;[Lfl;B)V",
		garbageValue = "22"
	)
	static final void method1225(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 461
			for (var3 = 0; var3 < 104; ++var3) { // L: 462
				for (var4 = 0; var4 < 104; ++var4) { // L: 463
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 464
						var5 = var2; // L: 465
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 466
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 467
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.field1108 += (int)(Math.random() * 5.0D) - 2; // L: 472
		if (Tiles.field1108 < -8) { // L: 473
			Tiles.field1108 = -8;
		}

		if (Tiles.field1108 > 8) { // L: 474
			Tiles.field1108 = 8;
		}

		Tiles.field1109 += (int)(Math.random() * 5.0D) - 2; // L: 475
		if (Tiles.field1109 < -16) { // L: 476
			Tiles.field1109 = -16;
		}

		if (Tiles.field1109 > 16) { // L: 477
			Tiles.field1109 = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) { // L: 478
			byte[][] var42 = class43.field307[var2]; // L: 479
			var9 = (int)Math.sqrt(5100.0D); // L: 485
			var10 = var9 * 768 >> 8; // L: 486

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 487
				for (var12 = 1; var12 < 103; ++var12) { // L: 488
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 489
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 490
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 491
					var16 = (var13 << 8) / var15; // L: 492
					var17 = 65536 / var15; // L: 493
					var18 = (var14 << 8) / var15; // L: 494
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 495
					var20 = (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1); // L: 496
					NPC.field1328[var12][var11] = var19 - var20; // L: 497
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 500
				class230.Tiles_hue[var11] = 0; // L: 501
				Tiles.Tiles_saturation[var11] = 0; // L: 502
				AbstractByteArrayCopier.Tiles_lightness[var11] = 0; // L: 503
				WorldMapSectionType.Tiles_hueMultiplier[var11] = 0; // L: 504
				Tiles.field1095[var11] = 0; // L: 505
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 507
				for (var12 = 0; var12 < 104; ++var12) { // L: 508
					var13 = var11 + 5; // L: 509
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 510
						var14 = AccessFile.field4098[var2][var13][var12] & 255; // L: 511
						if (var14 > 0) { // L: 512
							var16 = var14 - 1; // L: 514
							FloorUnderlayDefinition var44 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var16); // L: 516
							FloorUnderlayDefinition var46;
							if (var44 != null) { // L: 517
								var46 = var44; // L: 518
							} else {
								byte[] var45 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16); // L: 521
								var44 = new FloorUnderlayDefinition(); // L: 522
								if (var45 != null) { // L: 523
									var44.decode(new Buffer(var45), var16);
								}

								var44.postDecode(); // L: 524
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var44, (long)var16); // L: 525
								var46 = var44; // L: 526
							}

							var10000 = class230.Tiles_hue; // L: 529
							var10000[var12] += var46.hue;
							var10000 = Tiles.Tiles_saturation; // L: 530
							var10000[var12] += var46.saturation;
							var10000 = AbstractByteArrayCopier.Tiles_lightness; // L: 531
							var10000[var12] += var46.lightness;
							var10000 = WorldMapSectionType.Tiles_hueMultiplier; // L: 532
							var10000[var12] += var46.hueMultiplier;
							var10002 = Tiles.field1095[var12]++; // L: 533
						}
					}

					var14 = var11 - 5; // L: 536
					if (var14 >= 0 && var14 < 104) { // L: 537
						var15 = AccessFile.field4098[var2][var14][var12] & 255; // L: 538
						if (var15 > 0) { // L: 539
							var17 = var15 - 1; // L: 541
							FloorUnderlayDefinition var52 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17); // L: 543
							FloorUnderlayDefinition var48;
							if (var52 != null) { // L: 544
								var48 = var52; // L: 545
							} else {
								byte[] var47 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17); // L: 548
								var52 = new FloorUnderlayDefinition(); // L: 549
								if (var47 != null) { // L: 550
									var52.decode(new Buffer(var47), var17);
								}

								var52.postDecode(); // L: 551
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var52, (long)var17); // L: 552
								var48 = var52; // L: 553
							}

							var10000 = class230.Tiles_hue; // L: 556
							var10000[var12] -= var48.hue;
							var10000 = Tiles.Tiles_saturation; // L: 557
							var10000[var12] -= var48.saturation;
							var10000 = AbstractByteArrayCopier.Tiles_lightness; // L: 558
							var10000[var12] -= var48.lightness;
							var10000 = WorldMapSectionType.Tiles_hueMultiplier; // L: 559
							var10000[var12] -= var48.hueMultiplier;
							var10002 = Tiles.field1095[var12]--; // L: 560
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 564
					var12 = 0; // L: 565
					var13 = 0; // L: 566
					var14 = 0; // L: 567
					var15 = 0; // L: 568
					var16 = 0; // L: 569

					for (var17 = -5; var17 < 109; ++var17) { // L: 570
						var18 = var17 + 5; // L: 571
						if (var18 >= 0 && var18 < 104) { // L: 572
							var12 += class230.Tiles_hue[var18]; // L: 573
							var13 += Tiles.Tiles_saturation[var18]; // L: 574
							var14 += AbstractByteArrayCopier.Tiles_lightness[var18]; // L: 575
							var15 += WorldMapSectionType.Tiles_hueMultiplier[var18]; // L: 576
							var16 += Tiles.field1095[var18]; // L: 577
						}

						var19 = var17 - 5; // L: 579
						if (var19 >= 0 && var19 < 104) { // L: 580
							var12 -= class230.Tiles_hue[var19]; // L: 581
							var13 -= Tiles.Tiles_saturation[var19]; // L: 582
							var14 -= AbstractByteArrayCopier.Tiles_lightness[var19]; // L: 583
							var15 -= WorldMapSectionType.Tiles_hueMultiplier[var19]; // L: 584
							var16 -= Tiles.field1095[var19]; // L: 585
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 587 588 589 590
							if (var2 < Tiles.Tiles_minPlane) { // L: 593
								Tiles.Tiles_minPlane = var2;
							}

							var20 = AccessFile.field4098[var2][var11][var17] & 255; // L: 594
							int var21 = Tiles.field1111[var2][var11][var17] & 255; // L: 595
							if (var20 > 0 || var21 > 0) { // L: 596
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 597
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 598
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 599
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 600
								int var26 = NPC.field1328[var11][var17]; // L: 601
								int var27 = NPC.field1328[var11 + 1][var17]; // L: 602
								int var28 = NPC.field1328[var11 + 1][var17 + 1]; // L: 603
								int var29 = NPC.field1328[var11][var17 + 1]; // L: 604
								int var30 = -1; // L: 605
								int var31 = -1; // L: 606
								int var32;
								int var33;
								if (var20 > 0) { // L: 607
									var32 = var12 * 256 / var15; // L: 608
									var33 = var13 / var16; // L: 609
									int var34 = var14 / var16; // L: 610
									var30 = class125.hslToRgb(var32, var33, var34); // L: 611
									var32 = var32 + Tiles.field1108 & 255; // L: 612
									var34 += Tiles.field1109; // L: 613
									if (var34 < 0) { // L: 614
										var34 = 0;
									} else if (var34 > 255) { // L: 615
										var34 = 255;
									}

									var31 = class125.hslToRgb(var32, var33, var34); // L: 616
								}

								if (var2 > 0) { // L: 618
									boolean var50 = true; // L: 619
									if (var20 == 0 && class22.field186[var2][var11][var17] != 0) { // L: 620
										var50 = false;
									}

									if (var21 > 0 && !WorldMapSectionType.method3677(var21 - 1).hideUnderlay) { // L: 621
										var50 = false;
									}

									if (var50 && var23 == var22 && var24 == var22 && var22 == var25) { // L: 622 623
										var10000 = Tiles.field1101[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 626
								if (var31 != -1) { // L: 627
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[class378.method6550(var31, 96)];
								}

								if (var21 == 0) { // L: 628
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class378.method6550(var30, var26), class378.method6550(var30, var27), class378.method6550(var30, var28), class378.method6550(var30, var29), 0, 0, 0, 0, var32, 0); // L: 629
								} else {
									var33 = class22.field186[var2][var11][var17] + 1; // L: 632
									byte var51 = class16.field132[var2][var11][var17]; // L: 633
									FloorOverlayDefinition var35 = WorldMapSectionType.method3677(var21 - 1); // L: 634
									int var36 = var35.texture; // L: 635
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) { // L: 638
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36); // L: 639
										var37 = -1; // L: 640
									} else if (var35.primaryRgb == 16711935) { // L: 643
										var37 = -2; // L: 644
										var36 = -1; // L: 645
										var38 = -2; // L: 646
									} else {
										var37 = class125.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 649
										var39 = var35.hue + Tiles.field1108 & 255; // L: 650
										var40 = var35.lightness + Tiles.field1109; // L: 651
										if (var40 < 0) { // L: 652
											var40 = 0;
										} else if (var40 > 255) { // L: 653
											var40 = 255;
										}

										var38 = class125.hslToRgb(var39, var35.saturation, var40); // L: 654
									}

									var39 = 0; // L: 657
									if (var38 != -2) { // L: 658
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapID.method3716(var38, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 659
										var40 = var35.secondaryHue + Tiles.field1108 & 255; // L: 660
										int var41 = var35.secondaryLightness + Tiles.field1109; // L: 661
										if (var41 < 0) { // L: 662
											var41 = 0;
										} else if (var41 > 255) { // L: 663
											var41 = 255;
										}

										var38 = class125.hslToRgb(var40, var35.secondarySaturation, var41); // L: 664
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapID.method3716(var38, 96)]; // L: 665
									}

									var0.addTile(var2, var11, var17, var33, var51, var36, var22, var23, var24, var25, class378.method6550(var30, var26), class378.method6550(var30, var27), class378.method6550(var30, var28), class378.method6550(var30, var29), WorldMapID.method3716(var37, var26), WorldMapID.method3716(var37, var27), WorldMapID.method3716(var37, var28), WorldMapID.method3716(var37, var29), var32, var39); // L: 667
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 674
				for (var12 = 1; var12 < 103; ++var12) { // L: 675
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 682
						var17 = 0; // L: 683
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 686
						var17 = var2 - 1; // L: 687
					} else {
						var17 = var2; // L: 690
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 692
				}
			}

			AccessFile.field4098[var2] = null;
			Tiles.field1111[var2] = null;
			class22.field186[var2] = null;
			class16.field132[var2] = null; // L: 698
			class43.field307[var2] = null;
		}

		var0.method4067(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) { // L: 703
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1;
		var3 = 2; // L: 708
		var4 = 4; // L: 709

		for (var5 = 0; var5 < 4; ++var5) { // L: 710
			if (var5 > 0) { // L: 711
				var2 <<= 3; // L: 712
				var3 <<= 3; // L: 713
				var4 <<= 3; // L: 714
			}

			for (int var6 = 0; var6 <= var5; ++var6) { // L: 716
				for (int var7 = 0; var7 <= 104; ++var7) { // L: 717
					for (int var8 = 0; var8 <= 104; ++var8) { // L: 718
						short var49;
						if ((Tiles.field1101[var6][var8][var7] & var2) != 0) { // L: 719
							var9 = var7; // L: 720
							var10 = var7; // L: 721
							var11 = var6; // L: 722

							for (var12 = var6; var9 > 0 && (Tiles.field1101[var6][var8][var9 - 1] & var2) != 0; --var9) { // L: 723 724
							}

							while (var10 < 104 && (Tiles.field1101[var6][var8][var10 + 1] & var2) != 0) { // L: 725
								++var10;
							}

							label456:
							while (var11 > 0) { // L: 726
								for (var13 = var9; var13 <= var10; ++var13) { // L: 727
									if ((Tiles.field1101[var11 - 1][var8][var13] & var2) == 0) {
										break label456;
									}
								}

								--var11; // L: 728
							}

							label445:
							while (var12 < var5) { // L: 730
								for (var13 = var9; var13 <= var10; ++var13) { // L: 731
									if ((Tiles.field1101[var12 + 1][var8][var13] & var2) == 0) {
										break label445;
									}
								}

								++var12; // L: 732
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 734
							if (var13 >= 8) { // L: 735
								var49 = 240; // L: 736
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var49; // L: 737
								var16 = Tiles.Tiles_heights[var11][var8][var9]; // L: 738
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 739

								for (var17 = var11; var17 <= var12; ++var17) { // L: 740
									for (var18 = var9; var18 <= var10; ++var18) { // L: 741
										var10000 = Tiles.field1101[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((Tiles.field1101[var6][var8][var7] & var3) != 0) { // L: 745
							var9 = var8; // L: 746
							var10 = var8; // L: 747
							var11 = var6; // L: 748

							for (var12 = var6; var9 > 0 && (Tiles.field1101[var6][var9 - 1][var7] & var3) != 0; --var9) { // L: 749 750
							}

							while (var10 < 104 && (Tiles.field1101[var6][var10 + 1][var7] & var3) != 0) { // L: 751
								++var10;
							}

							label509:
							while (var11 > 0) { // L: 752
								for (var13 = var9; var13 <= var10; ++var13) { // L: 753
									if ((Tiles.field1101[var11 - 1][var13][var7] & var3) == 0) {
										break label509;
									}
								}

								--var11; // L: 754
							}

							label498:
							while (var12 < var5) { // L: 756
								for (var13 = var9; var13 <= var10; ++var13) { // L: 757
									if ((Tiles.field1101[var12 + 1][var13][var7] & var3) == 0) {
										break label498;
									}
								}

								++var12; // L: 758
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 760
							if (var13 >= 8) { // L: 761
								var49 = 240; // L: 762
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var49; // L: 763
								var16 = Tiles.Tiles_heights[var11][var9][var7]; // L: 764
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16); // L: 765

								for (var17 = var11; var17 <= var12; ++var17) { // L: 766
									for (var18 = var9; var18 <= var10; ++var18) { // L: 767
										var10000 = Tiles.field1101[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((Tiles.field1101[var6][var8][var7] & var4) != 0) { // L: 771
							var9 = var8; // L: 772
							var10 = var8; // L: 773
							var11 = var7; // L: 774

							for (var12 = var7; var11 > 0 && (Tiles.field1101[var6][var8][var11 - 1] & var4) != 0; --var11) { // L: 775 776
							}

							while (var12 < 104 && (Tiles.field1101[var6][var8][var12 + 1] & var4) != 0) { // L: 777
								++var12;
							}

							label562:
							while (var9 > 0) { // L: 778
								for (var13 = var11; var13 <= var12; ++var13) { // L: 779
									if ((Tiles.field1101[var6][var9 - 1][var13] & var4) == 0) {
										break label562;
									}
								}

								--var9; // L: 780
							}

							label551:
							while (var10 < 104) { // L: 782
								for (var13 = var11; var13 <= var12; ++var13) { // L: 783
									if ((Tiles.field1101[var6][var10 + 1][var13] & var4) == 0) {
										break label551;
									}
								}

								++var10; // L: 784
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 786
								var13 = Tiles.Tiles_heights[var6][var9][var11]; // L: 787
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 788

								for (var14 = var9; var14 <= var10; ++var14) { // L: 789
									for (var15 = var11; var15 <= var12; ++var15) { // L: 790
										var10000 = Tiles.field1101[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 798

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "457904488"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 693
		Login.Login_response2 = "Enter your username/email & password."; // L: 694
		Login.Login_response3 = ""; // L: 695
		Login.loginIndex = 2; // L: 696
		if (var0) { // L: 697
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 699
			if (class4.clientPreferences.rememberedUsername != null) { // L: 700
				Login.Login_username = class4.clientPreferences.rememberedUsername; // L: 701
				Client.Login_isUsernameRemembered = true; // L: 702
			} else {
				Client.Login_isUsernameRemembered = false; // L: 704
			}
		}

		GameObject.method4433(); // L: 706
	} // L: 707

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgi;",
		garbageValue = "42"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 181
		if (var1 != null) { // L: 182
			return var1;
		} else {
			var1 = class15.method240(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 183
			if (var1 != null) { // L: 184
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 185
		}
	}
}
