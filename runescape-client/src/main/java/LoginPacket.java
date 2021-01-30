import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("LoginPacket")
public class LoginPacket implements class190 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final LoginPacket field2332;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	static final LoginPacket field2339;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final LoginPacket field2334;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final LoginPacket field2335;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final LoginPacket field2336;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	static final LoginPacket field2337;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 2303606948216471517L
	)
	static long field2341;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 783182641
	)
	@Export("id")
	public final int id;

	static {
		field2332 = new LoginPacket(14, 0); // L: 5
		field2339 = new LoginPacket(15, 4); // L: 6
		field2334 = new LoginPacket(16, -2); // L: 7
		field2335 = new LoginPacket(18, -2); // L: 8
		field2336 = new LoginPacket(19, -2); // L: 9
		field2337 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = ViewportMouse.method3062(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	} // L: 19

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1922563005"
	)
	static String method3674() {
		String var0;
		if (Timer.clientPreferences.hideUsername) { // L: 188
			String var2 = Login.Login_username; // L: 190
			int var4 = var2.length(); // L: 193
			char[] var5 = new char[var4]; // L: 195

			for (int var6 = 0; var6 < var4; ++var6) { // L: 196
				var5[var6] = '*';
			}

			String var3 = new String(var5); // L: 197
			var0 = var3; // L: 201
		} else {
			var0 = Login.Login_username; // L: 203
		}

		return var0; // L: 204
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leo;[Lfo;I)V",
		garbageValue = "1844671024"
	)
	static final void method3673(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 501
			for (var3 = 0; var3 < 104; ++var3) { // L: 502
				for (var4 = 0; var4 < 104; ++var4) { // L: 503
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 504
						var5 = var2; // L: 505
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 506
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 507
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.field516 += (int)(Math.random() * 5.0D) - 2; // L: 512
		if (Tiles.field516 < -8) { // L: 513
			Tiles.field516 = -8;
		}

		if (Tiles.field516 > 8) { // L: 514
			Tiles.field516 = 8;
		}

		Tiles.field510 += (int)(Math.random() * 5.0D) - 2; // L: 515
		if (Tiles.field510 < -16) { // L: 516
			Tiles.field510 = -16;
		}

		if (Tiles.field510 > 16) { // L: 517
			Tiles.field510 = 16;
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 518
			byte[][] var42 = Tiles.field511[var2]; // L: 519
			var9 = (int)Math.sqrt(5100.0D); // L: 525
			var10 = var9 * 768 >> 8; // L: 526

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 527
				for (var12 = 1; var12 < 103; ++var12) { // L: 528
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 529
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 530
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 531
					var16 = (var13 << 8) / var15; // L: 532
					var17 = 65536 / var15; // L: 533
					var18 = (var14 << 8) / var15; // L: 534
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 535
					var20 = (var42[var12][var11 + 1] >> 3) + (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11] >> 1); // L: 536
					class92.field1173[var12][var11] = var19 - var20; // L: 537
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 540
				VarbitDefinition.Tiles_hue[var11] = 0; // L: 541
				ArchiveDiskActionHandler.Tiles_saturation[var11] = 0; // L: 542
				class92.Tiles_lightness[var11] = 0; // L: 543
				UserComparator7.Tiles_hueMultiplier[var11] = 0; // L: 544
				Varcs.field1283[var11] = 0; // L: 545
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 547
				for (var12 = 0; var12 < 104; ++var12) { // L: 548
					var13 = var11 + 5; // L: 549
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 550
						var14 = Tiles.field514[var2][var13][var12] & 255; // L: 551
						if (var14 > 0) { // L: 552
							FloorUnderlayDefinition var44 = WorldMapElement.method4405(var14 - 1); // L: 553
							var10000 = VarbitDefinition.Tiles_hue; // L: 554
							var10000[var12] += var44.hue;
							var10000 = ArchiveDiskActionHandler.Tiles_saturation; // L: 555
							var10000[var12] += var44.saturation;
							var10000 = class92.Tiles_lightness; // L: 556
							var10000[var12] += var44.lightness;
							var10000 = UserComparator7.Tiles_hueMultiplier; // L: 557
							var10000[var12] += var44.hueMultiplier;
							var10002 = Varcs.field1283[var12]++; // L: 558
						}
					}

					var14 = var11 - 5; // L: 561
					if (var14 >= 0 && var14 < 104) { // L: 562
						var15 = Tiles.field514[var2][var14][var12] & 255; // L: 563
						if (var15 > 0) { // L: 564
							FloorUnderlayDefinition var45 = WorldMapElement.method4405(var15 - 1); // L: 565
							var10000 = VarbitDefinition.Tiles_hue; // L: 566
							var10000[var12] -= var45.hue;
							var10000 = ArchiveDiskActionHandler.Tiles_saturation; // L: 567
							var10000[var12] -= var45.saturation;
							var10000 = class92.Tiles_lightness; // L: 568
							var10000[var12] -= var45.lightness;
							var10000 = UserComparator7.Tiles_hueMultiplier; // L: 569
							var10000[var12] -= var45.hueMultiplier;
							var10002 = Varcs.field1283[var12]--; // L: 570
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 574
					var12 = 0; // L: 575
					var13 = 0; // L: 576
					var14 = 0; // L: 577
					var15 = 0; // L: 578
					var16 = 0; // L: 579

					for (var17 = -5; var17 < 109; ++var17) { // L: 580
						var18 = var17 + 5; // L: 581
						if (var18 >= 0 && var18 < 104) { // L: 582
							var12 += VarbitDefinition.Tiles_hue[var18]; // L: 583
							var13 += ArchiveDiskActionHandler.Tiles_saturation[var18]; // L: 584
							var14 += class92.Tiles_lightness[var18]; // L: 585
							var15 += UserComparator7.Tiles_hueMultiplier[var18]; // L: 586
							var16 += Varcs.field1283[var18]; // L: 587
						}

						var19 = var17 - 5; // L: 589
						if (var19 >= 0 && var19 < 104) { // L: 590
							var12 -= VarbitDefinition.Tiles_hue[var19]; // L: 591
							var13 -= ArchiveDiskActionHandler.Tiles_saturation[var19]; // L: 592
							var14 -= class92.Tiles_lightness[var19]; // L: 593
							var15 -= UserComparator7.Tiles_hueMultiplier[var19]; // L: 594
							var16 -= Varcs.field1283[var19]; // L: 595
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 597 598 599 600
							if (var2 < Tiles.Tiles_minPlane) { // L: 603
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.field514[var2][var11][var17] & 255; // L: 604
							int var21 = Tiles.field508[var2][var11][var17] & 255; // L: 605
							if (var20 > 0 || var21 > 0) { // L: 606
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 607
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 608
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 609
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 610
								int var26 = class92.field1173[var11][var17]; // L: 611
								int var27 = class92.field1173[var11 + 1][var17]; // L: 612
								int var28 = class92.field1173[var11 + 1][var17 + 1]; // L: 613
								int var29 = class92.field1173[var11][var17 + 1]; // L: 614
								int var30 = -1; // L: 615
								int var31 = -1; // L: 616
								int var32;
								int var33;
								if (var20 > 0) { // L: 617
									var32 = var12 * 256 / var15; // L: 618
									var33 = var13 / var16; // L: 619
									int var34 = var14 / var16; // L: 620
									var30 = WorldMapLabelSize.hslToRgb(var32, var33, var34); // L: 621
									var32 = var32 + Tiles.field516 & 255; // L: 622
									var34 += Tiles.field510; // L: 623
									if (var34 < 0) { // L: 624
										var34 = 0;
									} else if (var34 > 255) { // L: 625
										var34 = 255;
									}

									var31 = WorldMapLabelSize.hslToRgb(var32, var33, var34); // L: 626
								}

								if (var2 > 0) { // L: 628
									boolean var47 = true; // L: 629
									if (var20 == 0 && class9.field40[var2][var11][var17] != 0) { // L: 630
										var47 = false;
									}

									if (var21 > 0 && !RouteStrategy.method3648(var21 - 1).hideUnderlay) { // L: 631
										var47 = false;
									}

									if (var47 && var23 == var22 && var22 == var24 && var25 == var22) { // L: 632 633
										var10000 = GrandExchangeOfferWorldComparator.field52[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 636
								if (var31 != -1) { // L: 637
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[Tile.method2946(var31, 96)];
								}

								if (var21 == 0) { // L: 638
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, Tile.method2946(var30, var26), Tile.method2946(var30, var27), Tile.method2946(var30, var28), Tile.method2946(var30, var29), 0, 0, 0, 0, var32, 0); // L: 639
								} else {
									var33 = class9.field40[var2][var11][var17] + 1; // L: 642
									byte var48 = Username.field3663[var2][var11][var17]; // L: 643
									FloorOverlayDefinition var35 = RouteStrategy.method3648(var21 - 1); // L: 644
									int var36 = var35.texture; // L: 645
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) { // L: 648
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36); // L: 649
										var37 = -1; // L: 650
									} else if (var35.primaryRgb == 16711935) { // L: 653
										var37 = -2; // L: 654
										var36 = -1; // L: 655
										var38 = -2; // L: 656
									} else {
										var37 = WorldMapLabelSize.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 659
										var39 = var35.hue + Tiles.field516 & 255; // L: 660
										var40 = var35.lightness + Tiles.field510; // L: 661
										if (var40 < 0) { // L: 662
											var40 = 0;
										} else if (var40 > 255) { // L: 663
											var40 = 255;
										}

										var38 = WorldMapLabelSize.hslToRgb(var39, var35.saturation, var40); // L: 664
									}

									var39 = 0; // L: 667
									if (var38 != -2) { // L: 668
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[class9.method101(var38, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 669
										var40 = var35.secondaryHue + Tiles.field516 & 255; // L: 670
										int var41 = var35.secondaryLightness + Tiles.field510; // L: 671
										if (var41 < 0) { // L: 672
											var41 = 0;
										} else if (var41 > 255) { // L: 673
											var41 = 255;
										}

										var38 = WorldMapLabelSize.hslToRgb(var40, var35.secondarySaturation, var41); // L: 674
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[class9.method101(var38, 96)]; // L: 675
									}

									var0.addTile(var2, var11, var17, var33, var48, var36, var22, var23, var24, var25, Tile.method2946(var30, var26), Tile.method2946(var30, var27), Tile.method2946(var30, var28), Tile.method2946(var30, var29), class9.method101(var37, var26), class9.method101(var37, var27), class9.method101(var37, var28), class9.method101(var37, var29), var32, var39); // L: 677
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 684
				for (var12 = 1; var12 < 103; ++var12) { // L: 685
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 692
						var17 = 0; // L: 693
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 696
						var17 = var2 - 1; // L: 697
					} else {
						var17 = var2; // L: 700
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 702
				}
			}

			Tiles.field514[var2] = null; // L: 705
			Tiles.field508[var2] = null; // L: 706
			class9.field40[var2] = null; // L: 707
			Username.field3663[var2] = null; // L: 708
			Tiles.field511[var2] = null; // L: 709
		}

		var0.method3190(-50, -10, -50); // L: 711

		for (var2 = 0; var2 < 104; ++var2) { // L: 712
			for (var3 = 0; var3 < 104; ++var3) { // L: 713
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 714
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 717
		var3 = 2; // L: 718
		var4 = 4; // L: 719

		for (var5 = 0; var5 < 4; ++var5) { // L: 720
			if (var5 > 0) { // L: 721
				var2 <<= 3; // L: 722
				var3 <<= 3; // L: 723
				var4 <<= 3; // L: 724
			}

			for (int var6 = 0; var6 <= var5; ++var6) { // L: 726
				for (int var7 = 0; var7 <= 104; ++var7) { // L: 727
					for (int var8 = 0; var8 <= 104; ++var8) { // L: 728
						short var46;
						if ((GrandExchangeOfferWorldComparator.field52[var6][var8][var7] & var2) != 0) { // L: 729
							var9 = var7; // L: 730
							var10 = var7; // L: 731
							var11 = var6; // L: 732

							for (var12 = var6; var9 > 0 && (GrandExchangeOfferWorldComparator.field52[var6][var8][var9 - 1] & var2) != 0; --var9) { // L: 733 734
							}

							while (var10 < 104 && (GrandExchangeOfferWorldComparator.field52[var6][var8][var10 + 1] & var2) != 0) { // L: 735
								++var10;
							}

							label437:
							while (var11 > 0) { // L: 736
								for (var13 = var9; var13 <= var10; ++var13) { // L: 737
									if ((GrandExchangeOfferWorldComparator.field52[var11 - 1][var8][var13] & var2) == 0) {
										break label437;
									}
								}

								--var11; // L: 738
							}

							label426:
							while (var12 < var5) { // L: 740
								for (var13 = var9; var13 <= var10; ++var13) { // L: 741
									if ((GrandExchangeOfferWorldComparator.field52[var12 + 1][var8][var13] & var2) == 0) {
										break label426;
									}
								}

								++var12; // L: 742
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 744
							if (var13 >= 8) { // L: 745
								var46 = 240; // L: 746
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var46; // L: 747
								var16 = Tiles.Tiles_heights[var11][var8][var9]; // L: 748
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 749

								for (var17 = var11; var17 <= var12; ++var17) { // L: 750
									for (var18 = var9; var18 <= var10; ++var18) { // L: 751
										var10000 = GrandExchangeOfferWorldComparator.field52[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((GrandExchangeOfferWorldComparator.field52[var6][var8][var7] & var3) != 0) { // L: 755
							var9 = var8; // L: 756
							var10 = var8; // L: 757
							var11 = var6; // L: 758

							for (var12 = var6; var9 > 0 && (GrandExchangeOfferWorldComparator.field52[var6][var9 - 1][var7] & var3) != 0; --var9) { // L: 759 760
							}

							while (var10 < 104 && (GrandExchangeOfferWorldComparator.field52[var6][var10 + 1][var7] & var3) != 0) { // L: 761
								++var10;
							}

							label490:
							while (var11 > 0) { // L: 762
								for (var13 = var9; var13 <= var10; ++var13) { // L: 763
									if ((GrandExchangeOfferWorldComparator.field52[var11 - 1][var13][var7] & var3) == 0) {
										break label490;
									}
								}

								--var11; // L: 764
							}

							label479:
							while (var12 < var5) { // L: 766
								for (var13 = var9; var13 <= var10; ++var13) { // L: 767
									if ((GrandExchangeOfferWorldComparator.field52[var12 + 1][var13][var7] & var3) == 0) {
										break label479;
									}
								}

								++var12; // L: 768
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 770
							if (var13 >= 8) { // L: 771
								var46 = 240; // L: 772
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var46; // L: 773
								var16 = Tiles.Tiles_heights[var11][var9][var7]; // L: 774
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16); // L: 775

								for (var17 = var11; var17 <= var12; ++var17) { // L: 776
									for (var18 = var9; var18 <= var10; ++var18) { // L: 777
										var10000 = GrandExchangeOfferWorldComparator.field52[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((GrandExchangeOfferWorldComparator.field52[var6][var8][var7] & var4) != 0) { // L: 781
							var9 = var8; // L: 782
							var10 = var8; // L: 783
							var11 = var7; // L: 784

							for (var12 = var7; var11 > 0 && (GrandExchangeOfferWorldComparator.field52[var6][var8][var11 - 1] & var4) != 0; --var11) { // L: 785 786
							}

							while (var12 < 104 && (GrandExchangeOfferWorldComparator.field52[var6][var8][var12 + 1] & var4) != 0) { // L: 787
								++var12;
							}

							label543:
							while (var9 > 0) { // L: 788
								for (var13 = var11; var13 <= var12; ++var13) { // L: 789
									if ((GrandExchangeOfferWorldComparator.field52[var6][var9 - 1][var13] & var4) == 0) {
										break label543;
									}
								}

								--var9; // L: 790
							}

							label532:
							while (var10 < 104) { // L: 792
								for (var13 = var11; var13 <= var12; ++var13) { // L: 793
									if ((GrandExchangeOfferWorldComparator.field52[var6][var10 + 1][var13] & var4) == 0) {
										break label532;
									}
								}

								++var10; // L: 794
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 796
								var13 = Tiles.Tiles_heights[var6][var9][var11]; // L: 797
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 798

								for (var14 = var9; var14 <= var10; ++var14) { // L: 799
									for (var15 = var11; var15 <= var12; ++var15) { // L: 800
										var10000 = GrandExchangeOfferWorldComparator.field52[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 808

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "58"
	)
	static void method3672(int var0, int var1) {
		if (Timer.clientPreferences.musicVolume != 0 && var0 != -1) { // L: 3718
			Interpreter.method2082(ItemContainer.archive11, var0, 0, Timer.clientPreferences.musicVolume, false); // L: 3719
			Client.field883 = true; // L: 3720
		}

	} // L: 3722
}
