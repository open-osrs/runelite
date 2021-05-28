import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class17 extends class14 {
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 769722653
	)
	static int field148;
	@ObfuscatedName("v")
	boolean field146;
	@ObfuscatedName("n")
	byte field143;
	@ObfuscatedName("f")
	byte field144;
	@ObfuscatedName("y")
	byte field145;
	@ObfuscatedName("p")
	byte field147;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class17(class2 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field146 = var1.readUnsignedByte() == 1; // L: 251
		this.field143 = var1.readByte(); // L: 252
		this.field144 = var1.readByte(); // L: 253
		this.field145 = var1.readByte(); // L: 254
		this.field147 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.allowGuests = this.field146; // L: 259
		var1.field103 = this.field143; // L: 260
		var1.field113 = this.field144; // L: 261
		var1.field98 = this.field145; // L: 262
		var1.field96 = this.field147; // L: 263
	} // L: 264

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Ley;",
		garbageValue = "113"
	)
	public static FloorUnderlayDefinition method204(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 27
			var1 = new FloorUnderlayDefinition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 30
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lgt;[Lfz;I)V",
		garbageValue = "-1580902995"
	)
	static final void method210(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 494
			for (var3 = 0; var3 < 104; ++var3) { // L: 495
				for (var4 = 0; var4 < 104; ++var4) { // L: 496
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 497
						var5 = var2; // L: 498
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 499
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 500
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.field1130 += (int)(Math.random() * 5.0D) - 2; // L: 505
		if (Tiles.field1130 < -8) { // L: 506
			Tiles.field1130 = -8;
		}

		if (Tiles.field1130 > 8) { // L: 507
			Tiles.field1130 = 8;
		}

		Tiles.field1131 += (int)(Math.random() * 5.0D) - 2; // L: 508
		if (Tiles.field1131 < -16) { // L: 509
			Tiles.field1131 = -16;
		}

		if (Tiles.field1131 > 16) { // L: 510
			Tiles.field1131 = 16;
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 511
			byte[][] var42 = class372.field4123[var2]; // L: 512
			var9 = (int)Math.sqrt(5100.0D); // L: 518
			var10 = var9 * 768 >> 8; // L: 519

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 520
				for (var12 = 1; var12 < 103; ++var12) { // L: 521
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 522
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 523
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 524
					var16 = (var13 << 8) / var15; // L: 525
					var17 = 65536 / var15; // L: 526
					var18 = (var14 << 8) / var15; // L: 527
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 528
					var20 = (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1); // L: 529
					class229.field2813[var12][var11] = var19 - var20; // L: 530
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 533
				ChatChannel.Tiles_hue[var11] = 0; // L: 534
				class23.Tiles_saturation[var11] = 0; // L: 535
				Tiles.Tiles_lightness[var11] = 0; // L: 536
				ParamComposition.Tiles_hueMultiplier[var11] = 0; // L: 537
				DefaultsGroup.field3894[var11] = 0; // L: 538
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 540
				for (var12 = 0; var12 < 104; ++var12) { // L: 541
					var13 = var11 + 5; // L: 542
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 543
						var14 = Tiles.field1120[var2][var13][var12] & 255; // L: 544
						if (var14 > 0) { // L: 545
							FloorUnderlayDefinition var44 = method204(var14 - 1); // L: 546
							var10000 = ChatChannel.Tiles_hue; // L: 547
							var10000[var12] += var44.hue;
							var10000 = class23.Tiles_saturation; // L: 548
							var10000[var12] += var44.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 549
							var10000[var12] += var44.lightness;
							var10000 = ParamComposition.Tiles_hueMultiplier; // L: 550
							var10000[var12] += var44.hueMultiplier;
							var10002 = DefaultsGroup.field3894[var12]++; // L: 551
						}
					}

					var14 = var11 - 5; // L: 554
					if (var14 >= 0 && var14 < 104) { // L: 555
						var15 = Tiles.field1120[var2][var14][var12] & 255; // L: 556
						if (var15 > 0) { // L: 557
							FloorUnderlayDefinition var45 = method204(var15 - 1); // L: 558
							var10000 = ChatChannel.Tiles_hue; // L: 559
							var10000[var12] -= var45.hue;
							var10000 = class23.Tiles_saturation; // L: 560
							var10000[var12] -= var45.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 561
							var10000[var12] -= var45.lightness;
							var10000 = ParamComposition.Tiles_hueMultiplier; // L: 562
							var10000[var12] -= var45.hueMultiplier;
							var10002 = DefaultsGroup.field3894[var12]--; // L: 563
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 567
					var12 = 0; // L: 568
					var13 = 0; // L: 569
					var14 = 0; // L: 570
					var15 = 0; // L: 571
					var16 = 0; // L: 572

					for (var17 = -5; var17 < 109; ++var17) { // L: 573
						var18 = var17 + 5; // L: 574
						if (var18 >= 0 && var18 < 104) { // L: 575
							var12 += ChatChannel.Tiles_hue[var18]; // L: 576
							var13 += class23.Tiles_saturation[var18]; // L: 577
							var14 += Tiles.Tiles_lightness[var18]; // L: 578
							var15 += ParamComposition.Tiles_hueMultiplier[var18]; // L: 579
							var16 += DefaultsGroup.field3894[var18]; // L: 580
						}

						var19 = var17 - 5; // L: 582
						if (var19 >= 0 && var19 < 104) { // L: 583
							var12 -= ChatChannel.Tiles_hue[var19]; // L: 584
							var13 -= class23.Tiles_saturation[var19]; // L: 585
							var14 -= Tiles.Tiles_lightness[var19]; // L: 586
							var15 -= ParamComposition.Tiles_hueMultiplier[var19]; // L: 587
							var16 -= DefaultsGroup.field3894[var19]; // L: 588
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 590 591 592 593
							if (var2 < Tiles.Tiles_minPlane) { // L: 596
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.field1120[var2][var11][var17] & 255; // L: 597
							int var21 = class253.field3130[var2][var11][var17] & 255; // L: 598
							if (var20 > 0 || var21 > 0) { // L: 599
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 600
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 601
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 602
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 603
								int var26 = class229.field2813[var11][var17]; // L: 604
								int var27 = class229.field2813[var11 + 1][var17]; // L: 605
								int var28 = class229.field2813[var11 + 1][var17 + 1]; // L: 606
								int var29 = class229.field2813[var11][var17 + 1]; // L: 607
								int var30 = -1; // L: 608
								int var31 = -1; // L: 609
								int var32;
								int var33;
								if (var20 > 0) { // L: 610
									var32 = var12 * 256 / var15; // L: 611
									var33 = var13 / var16; // L: 612
									int var34 = var14 / var16; // L: 613
									var30 = WorldMapElement.hslToRgb(var32, var33, var34); // L: 614
									var32 = var32 + Tiles.field1130 & 255; // L: 615
									var34 += Tiles.field1131; // L: 616
									if (var34 < 0) { // L: 617
										var34 = 0;
									} else if (var34 > 255) { // L: 618
										var34 = 255;
									}

									var31 = WorldMapElement.hslToRgb(var32, var33, var34); // L: 619
								}

								if (var2 > 0) { // L: 621
									boolean var47 = true; // L: 622
									if (var20 == 0 && class20.field182[var2][var11][var17] != 0) { // L: 623
										var47 = false;
									}

									if (var21 > 0 && !SoundSystem.method807(var21 - 1).hideUnderlay) { // L: 624
										var47 = false;
									}

									if (var47 && var22 == var23 && var24 == var22 && var25 == var22) { // L: 625 626
										var10000 = UrlRequester.field1419[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 629
								if (var31 != -1) { // L: 630
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[HealthBarDefinition.method2728(var31, 96)];
								}

								if (var21 == 0) { // L: 631
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, HealthBarDefinition.method2728(var30, var26), HealthBarDefinition.method2728(var30, var27), HealthBarDefinition.method2728(var30, var28), HealthBarDefinition.method2728(var30, var29), 0, 0, 0, 0, var32, 0); // L: 632
								} else {
									var33 = class20.field182[var2][var11][var17] + 1; // L: 635
									byte var48 = DirectByteArrayCopier.field3128[var2][var11][var17]; // L: 636
									FloorOverlayDefinition var35 = SoundSystem.method807(var21 - 1); // L: 637
									int var36 = var35.texture; // L: 638
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) { // L: 641
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36); // L: 642
										var37 = -1; // L: 643
									} else if (var35.primaryRgb == 16711935) { // L: 646
										var37 = -2; // L: 647
										var36 = -1; // L: 648
										var38 = -2; // L: 649
									} else {
										var37 = WorldMapElement.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 652
										var39 = var35.hue + Tiles.field1130 & 255; // L: 653
										var40 = var35.lightness + Tiles.field1131; // L: 654
										if (var40 < 0) { // L: 655
											var40 = 0;
										} else if (var40 > 255) { // L: 656
											var40 = 255;
										}

										var38 = WorldMapElement.hslToRgb(var39, var35.saturation, var40); // L: 657
									}

									var39 = 0; // L: 660
									if (var38 != -2) { // L: 661
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[class26.method272(var38, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 662
										var40 = var35.secondaryHue + Tiles.field1130 & 255; // L: 663
										int var41 = var35.secondaryLightness + Tiles.field1131; // L: 664
										if (var41 < 0) { // L: 665
											var41 = 0;
										} else if (var41 > 255) { // L: 666
											var41 = 255;
										}

										var38 = WorldMapElement.hslToRgb(var40, var35.secondarySaturation, var41); // L: 667
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[class26.method272(var38, 96)]; // L: 668
									}

									var0.addTile(var2, var11, var17, var33, var48, var36, var22, var23, var24, var25, HealthBarDefinition.method2728(var30, var26), HealthBarDefinition.method2728(var30, var27), HealthBarDefinition.method2728(var30, var28), HealthBarDefinition.method2728(var30, var29), class26.method272(var37, var26), class26.method272(var37, var27), class26.method272(var37, var28), class26.method272(var37, var29), var32, var39); // L: 670
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 677
				for (var12 = 1; var12 < 103; ++var12) { // L: 678
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 685
						var17 = 0; // L: 686
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 689
						var17 = var2 - 1; // L: 690
					} else {
						var17 = var2; // L: 693
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 695
				}
			}

			Tiles.field1120[var2] = null; // L: 698
			class253.field3130[var2] = null; // L: 699
			class20.field182[var2] = null; // L: 700
			DirectByteArrayCopier.field3128[var2] = null; // L: 701
			class372.field4123[var2] = null; // L: 702
		}

		var0.method3955(-50, -10, -50); // L: 704

		for (var2 = 0; var2 < 104; ++var2) { // L: 705
			for (var3 = 0; var3 < 104; ++var3) { // L: 706
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 707
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 710
		var3 = 2; // L: 711
		var4 = 4; // L: 712

		for (var5 = 0; var5 < 4; ++var5) { // L: 713
			if (var5 > 0) { // L: 714
				var2 <<= 3; // L: 715
				var3 <<= 3; // L: 716
				var4 <<= 3; // L: 717
			}

			for (int var6 = 0; var6 <= var5; ++var6) { // L: 719
				for (int var7 = 0; var7 <= 104; ++var7) { // L: 720
					for (int var8 = 0; var8 <= 104; ++var8) { // L: 721
						short var46;
						if ((UrlRequester.field1419[var6][var8][var7] & var2) != 0) { // L: 722
							var9 = var7; // L: 723
							var10 = var7; // L: 724
							var11 = var6; // L: 725

							for (var12 = var6; var9 > 0 && (UrlRequester.field1419[var6][var8][var9 - 1] & var2) != 0; --var9) { // L: 726 727
							}

							while (var10 < 104 && (UrlRequester.field1419[var6][var8][var10 + 1] & var2) != 0) { // L: 728
								++var10;
							}

							label438:
							while (var11 > 0) { // L: 729
								for (var13 = var9; var13 <= var10; ++var13) { // L: 730
									if ((UrlRequester.field1419[var11 - 1][var8][var13] & var2) == 0) {
										break label438;
									}
								}

								--var11; // L: 731
							}

							label427:
							while (var12 < var5) { // L: 733
								for (var13 = var9; var13 <= var10; ++var13) { // L: 734
									if ((UrlRequester.field1419[var12 + 1][var8][var13] & var2) == 0) {
										break label427;
									}
								}

								++var12; // L: 735
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 737
							if (var13 >= 8) { // L: 738
								var46 = 240; // L: 739
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var46; // L: 740
								var16 = Tiles.Tiles_heights[var11][var8][var9]; // L: 741
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 742

								for (var17 = var11; var17 <= var12; ++var17) { // L: 743
									for (var18 = var9; var18 <= var10; ++var18) { // L: 744
										var10000 = UrlRequester.field1419[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((UrlRequester.field1419[var6][var8][var7] & var3) != 0) { // L: 748
							var9 = var8; // L: 749
							var10 = var8; // L: 750
							var11 = var6; // L: 751

							for (var12 = var6; var9 > 0 && (UrlRequester.field1419[var6][var9 - 1][var7] & var3) != 0; --var9) { // L: 752 753
							}

							while (var10 < 104 && (UrlRequester.field1419[var6][var10 + 1][var7] & var3) != 0) { // L: 754
								++var10;
							}

							label491:
							while (var11 > 0) { // L: 755
								for (var13 = var9; var13 <= var10; ++var13) { // L: 756
									if ((UrlRequester.field1419[var11 - 1][var13][var7] & var3) == 0) {
										break label491;
									}
								}

								--var11; // L: 757
							}

							label480:
							while (var12 < var5) { // L: 759
								for (var13 = var9; var13 <= var10; ++var13) { // L: 760
									if ((UrlRequester.field1419[var12 + 1][var13][var7] & var3) == 0) {
										break label480;
									}
								}

								++var12; // L: 761
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 763
							if (var13 >= 8) { // L: 764
								var46 = 240; // L: 765
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var46; // L: 766
								var16 = Tiles.Tiles_heights[var11][var9][var7]; // L: 767
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16); // L: 768

								for (var17 = var11; var17 <= var12; ++var17) { // L: 769
									for (var18 = var9; var18 <= var10; ++var18) { // L: 770
										var10000 = UrlRequester.field1419[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((UrlRequester.field1419[var6][var8][var7] & var4) != 0) { // L: 774
							var9 = var8; // L: 775
							var10 = var8; // L: 776
							var11 = var7; // L: 777

							for (var12 = var7; var11 > 0 && (UrlRequester.field1419[var6][var8][var11 - 1] & var4) != 0; --var11) { // L: 778 779
							}

							while (var12 < 104 && (UrlRequester.field1419[var6][var8][var12 + 1] & var4) != 0) { // L: 780
								++var12;
							}

							label544:
							while (var9 > 0) { // L: 781
								for (var13 = var11; var13 <= var12; ++var13) { // L: 782
									if ((UrlRequester.field1419[var6][var9 - 1][var13] & var4) == 0) {
										break label544;
									}
								}

								--var9; // L: 783
							}

							label533:
							while (var10 < 104) { // L: 785
								for (var13 = var11; var13 <= var12; ++var13) { // L: 786
									if ((UrlRequester.field1419[var6][var10 + 1][var13] & var4) == 0) {
										break label533;
									}
								}

								++var10; // L: 787
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 789
								var13 = Tiles.Tiles_heights[var6][var9][var11]; // L: 790
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 791

								for (var14 = var9; var14 <= var10; ++var14) { // L: 792
									for (var15 = var11; var15 <= var12; ++var15) { // L: 793
										var10000 = UrlRequester.field1419[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 801

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1692198232"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 73
		if (var1 == null) { // L: 74
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 75 76
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "12"
	)
	static void method209(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1511

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1512
			int var4 = var3 * 32 + 15 + 128; // L: 1513
			int var5 = SecureRandomFuture.method1980(var4); // L: 1514
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1515
			var5 = WorldMapDecoration.method3627(var5, var1); // L: 1516
			var2[var3] = var6 * var5 >> 16; // L: 1517
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1519
	} // L: 1520

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcu;",
		garbageValue = "1899538302"
	)
	static final InterfaceParent method208(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11042
		var3.group = var1; // L: 11043
		var3.type = var2; // L: 11044
		Client.interfaceParents.put(var3, (long)var0); // L: 11045
		class21.Widget_resetModelFrames(var1); // L: 11046
		Widget var4 = Frames.getWidget(var0); // L: 11047
		WorldMapCacheName.invalidateWidget(var4); // L: 11048
		if (Client.meslayerContinueWidget != null) { // L: 11049
			WorldMapCacheName.invalidateWidget(Client.meslayerContinueWidget); // L: 11050
			Client.meslayerContinueWidget = null; // L: 11051
		}

		class7.method68(); // L: 11053
		class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11054
		FloorDecoration.runWidgetOnLoadListener(var1); // L: 11055
		if (Client.rootInterface != -1) { // L: 11056
			Login.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11057
	}
}
