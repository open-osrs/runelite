import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class134 extends class144 {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1975185263
	)
	int field1602;
	@ObfuscatedName("v")
	byte field1599;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -984007901
	)
	int field1600;
	@ObfuscatedName("f")
	String field1598;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;)V"
	)
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1602 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "355261812"
	)
	void vmethod3137(Buffer var1) {
		this.field1602 = var1.readUnsignedShort(); // L: 109
		this.field1599 = var1.readByte(); // L: 110
		this.field1600 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1598 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lex;I)V",
		garbageValue = "1368590037"
	)
	void vmethod3138(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1602); // L: 117
		var2.rank = this.field1599; // L: 118
		var2.world = this.field1600; // L: 119
		var2.username = new Username(this.field1598); // L: 120
	} // L: 121

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)Ljava/lang/String;",
		garbageValue = "499606325"
	)
	public static String method2904(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 63
			if (var2 > 32767) { // L: 64
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 65
			var0.offset += class281.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 66
			String var4 = SceneTilePaint.decodeStringCp1252(var3, 0, var2); // L: 67
			var1 = var4; // L: 68
		} catch (Exception var6) { // L: 70
			var1 = "Cabbage"; // L: 71
		}

		return var1; // L: 74
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "128188876"
	)
	public static int method2906(int var0) {
		return var0 >> 17 & 7; // L: 17
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lgg;[Lgv;I)V",
		garbageValue = "1741307207"
	)
	static final void method2905(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 543
			for (var3 = 0; var3 < 104; ++var3) { // L: 544
				for (var4 = 0; var4 < 104; ++var4) { // L: 545
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 546
						var5 = var2; // L: 547
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 548
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 549
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 554
		if (Tiles.rndHue < -8) { // L: 555
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 556
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 557
		if (Tiles.rndLightness < -16) { // L: 558
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 559
			Tiles.rndLightness = 16;
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 560
			byte[][] var42 = UserComparator6.field1415[var2]; // L: 561
			boolean var48 = true; // L: 562
			boolean var49 = true; // L: 563
			boolean var6 = true; // L: 564
			boolean var7 = true; // L: 565
			boolean var8 = true; // L: 566
			var9 = (int)Math.sqrt(5100.0D); // L: 567
			var10 = var9 * 768 >> 8; // L: 568

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 569
				for (var12 = 1; var12 < 103; ++var12) { // L: 570
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 571
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 572
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 573
					var16 = (var13 << 8) / var15; // L: 574
					var17 = 65536 / var15; // L: 575
					var18 = (var14 << 8) / var15; // L: 576
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 577
					var20 = (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1); // L: 578
					class430.field4651[var12][var11] = var19 - var20; // L: 579
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 582
				MusicPatchNode2.Tiles_hue[var11] = 0; // L: 583
				Tiles.Tiles_saturation[var11] = 0; // L: 584
				Varcs.Tiles_lightness[var11] = 0; // L: 585
				class465.Tiles_hueMultiplier[var11] = 0; // L: 586
				WorldMapScaleHandler.field2877[var11] = 0; // L: 587
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 589
				for (var12 = 0; var12 < 104; ++var12) { // L: 590
					var13 = var11 + 5; // L: 591
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 592
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255; // L: 593
						if (var14 > 0) { // L: 594
							var16 = var14 - 1; // L: 596
							FloorUnderlayDefinition var43 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var16); // L: 598
							FloorUnderlayDefinition var45;
							if (var43 != null) { // L: 599
								var45 = var43; // L: 600
							} else {
								byte[] var44 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16); // L: 603
								var43 = new FloorUnderlayDefinition(); // L: 604
								if (var44 != null) { // L: 605
									var43.decode(new Buffer(var44), var16);
								}

								var43.postDecode(); // L: 606
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var43, (long)var16); // L: 607
								var45 = var43; // L: 608
							}

							var10000 = MusicPatchNode2.Tiles_hue; // L: 611
							var10000[var12] += var45.hue;
							var10000 = Tiles.Tiles_saturation; // L: 612
							var10000[var12] += var45.saturation;
							var10000 = Varcs.Tiles_lightness; // L: 613
							var10000[var12] += var45.lightness;
							var10000 = class465.Tiles_hueMultiplier; // L: 614
							var10000[var12] += var45.hueMultiplier;
							var10002 = WorldMapScaleHandler.field2877[var12]++; // L: 615
						}
					}

					var14 = var11 - 5; // L: 618
					if (var14 >= 0 && var14 < 104) { // L: 619
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255; // L: 620
						if (var15 > 0) { // L: 621
							var17 = var15 - 1; // L: 623
							FloorUnderlayDefinition var56 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17); // L: 625
							FloorUnderlayDefinition var47;
							if (var56 != null) { // L: 626
								var47 = var56; // L: 627
							} else {
								byte[] var46 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17); // L: 630
								var56 = new FloorUnderlayDefinition(); // L: 631
								if (var46 != null) { // L: 632
									var56.decode(new Buffer(var46), var17);
								}

								var56.postDecode(); // L: 633
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var56, (long)var17); // L: 634
								var47 = var56; // L: 635
							}

							var10000 = MusicPatchNode2.Tiles_hue; // L: 638
							var10000[var12] -= var47.hue;
							var10000 = Tiles.Tiles_saturation; // L: 639
							var10000[var12] -= var47.saturation;
							var10000 = Varcs.Tiles_lightness; // L: 640
							var10000[var12] -= var47.lightness;
							var10000 = class465.Tiles_hueMultiplier; // L: 641
							var10000[var12] -= var47.hueMultiplier;
							var10002 = WorldMapScaleHandler.field2877[var12]--; // L: 642
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 646
					var12 = 0; // L: 647
					var13 = 0; // L: 648
					var14 = 0; // L: 649
					var15 = 0; // L: 650
					var16 = 0; // L: 651

					for (var17 = -5; var17 < 109; ++var17) { // L: 652
						var18 = var17 + 5; // L: 653
						if (var18 >= 0 && var18 < 104) { // L: 654
							var12 += MusicPatchNode2.Tiles_hue[var18]; // L: 655
							var13 += Tiles.Tiles_saturation[var18]; // L: 656
							var14 += Varcs.Tiles_lightness[var18]; // L: 657
							var15 += class465.Tiles_hueMultiplier[var18]; // L: 658
							var16 += WorldMapScaleHandler.field2877[var18]; // L: 659
						}

						var19 = var17 - 5; // L: 661
						if (var19 >= 0 && var19 < 104) { // L: 662
							var12 -= MusicPatchNode2.Tiles_hue[var19]; // L: 663
							var13 -= Tiles.Tiles_saturation[var19]; // L: 664
							var14 -= Varcs.Tiles_lightness[var19]; // L: 665
							var15 -= class465.Tiles_hueMultiplier[var19]; // L: 666
							var16 -= WorldMapScaleHandler.field2877[var19]; // L: 667
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 669 670 671 672
							if (var2 < Tiles.Tiles_minPlane) { // L: 675
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255; // L: 676
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255; // L: 677
							if (var20 > 0 || var21 > 0) { // L: 678
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 679
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 680
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 681
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 682
								int var26 = class430.field4651[var11][var17]; // L: 683
								int var27 = class430.field4651[var11 + 1][var17]; // L: 684
								int var28 = class430.field4651[var11 + 1][var17 + 1]; // L: 685
								int var29 = class430.field4651[var11][var17 + 1]; // L: 686
								int var30 = -1; // L: 687
								int var31 = -1; // L: 688
								int var32;
								int var33;
								if (var20 > 0) { // L: 689
									var32 = var12 * 256 / var15; // L: 690
									var33 = var13 / var16; // L: 691
									int var34 = var14 / var16; // L: 692
									var30 = class21.hslToRgb(var32, var33, var34); // L: 693
									var32 = var32 + Tiles.rndHue & 255; // L: 694
									var34 += Tiles.rndLightness; // L: 695
									if (var34 < 0) { // L: 696
										var34 = 0;
									} else if (var34 > 255) { // L: 697
										var34 = 255;
									}

									var31 = class21.hslToRgb(var32, var33, var34); // L: 698
								}

								if (var2 > 0) { // L: 700
									boolean var54 = true; // L: 701
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) { // L: 702
										var54 = false;
									}

									if (var21 > 0 && !class124.method2814(var21 - 1).hideUnderlay) { // L: 703
										var54 = false;
									}

									if (var54 && var22 == var23 && var22 == var24 && var25 == var22) { // L: 704 705
										var10000 = class1.field2[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 708
								if (var31 != -1) { // L: 709
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[class129.method2864(var31, 96)];
								}

								if (var21 == 0) { // L: 710
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class129.method2864(var30, var26), class129.method2864(var30, var27), class129.method2864(var30, var28), class129.method2864(var30, var29), 0, 0, 0, 0, var32, 0); // L: 711
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1; // L: 714
									byte var55 = Tiles.field996[var2][var11][var17]; // L: 715
									FloorOverlayDefinition var35 = class124.method2814(var21 - 1); // L: 716
									int var36 = var35.texture; // L: 717
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) { // L: 720
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36); // L: 721
										var37 = -1; // L: 722
									} else if (var35.primaryRgb == 16711935) { // L: 725
										var37 = -2; // L: 726
										var36 = -1; // L: 727
										var38 = -2; // L: 728
									} else {
										var37 = class21.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 731
										var39 = var35.hue + Tiles.rndHue & 255; // L: 732
										var40 = var35.lightness + Tiles.rndLightness; // L: 733
										if (var40 < 0) { // L: 734
											var40 = 0;
										} else if (var40 > 255) { // L: 735
											var40 = 255;
										}

										var38 = class21.hslToRgb(var39, var35.saturation, var40); // L: 736
									}

									var39 = 0; // L: 739
									if (var38 != -2) { // L: 740
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ModeWhere.method6079(var38, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 741
										var40 = var35.secondaryHue + Tiles.rndHue & 255; // L: 742
										int var41 = var35.secondaryLightness + Tiles.rndLightness; // L: 743
										if (var41 < 0) { // L: 744
											var41 = 0;
										} else if (var41 > 255) { // L: 745
											var41 = 255;
										}

										var38 = class21.hslToRgb(var40, var35.secondarySaturation, var41); // L: 746
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ModeWhere.method6079(var38, 96)]; // L: 747
									}

									var0.addTile(var2, var11, var17, var33, var55, var36, var22, var23, var24, var25, class129.method2864(var30, var26), class129.method2864(var30, var27), class129.method2864(var30, var28), class129.method2864(var30, var29), ModeWhere.method6079(var37, var26), ModeWhere.method6079(var37, var27), ModeWhere.method6079(var37, var28), ModeWhere.method6079(var37, var29), var32, var39); // L: 749
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 756
				for (var12 = 1; var12 < 103; ++var12) { // L: 757
					var0.setTileMinPlane(var2, var12, var11, Huffman.method5474(var2, var12, var11)); // L: 758
				}
			}

			Tiles.Tiles_underlays[var2] = null; // L: 761
			Tiles.Tiles_overlays[var2] = null; // L: 762
			Tiles.Tiles_shapes[var2] = null; // L: 763
			Tiles.field996[var2] = null; // L: 764
			UserComparator6.field1415[var2] = null; // L: 765
		}

		var0.method4186(-50, -10, -50); // L: 767

		for (var2 = 0; var2 < 104; ++var2) { // L: 768
			for (var3 = 0; var3 < 104; ++var3) { // L: 769
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 770
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 773
		var3 = 2; // L: 774
		var4 = 4; // L: 775

		for (var5 = 0; var5 < 4; ++var5) { // L: 776
			if (var5 > 0) { // L: 777
				var2 <<= 3; // L: 778
				var3 <<= 3; // L: 779
				var4 <<= 3; // L: 780
			}

			for (int var50 = 0; var50 <= var5; ++var50) { // L: 782
				for (int var51 = 0; var51 <= 104; ++var51) { // L: 783
					for (int var52 = 0; var52 <= 104; ++var52) { // L: 784
						short var53;
						if ((class1.field2[var50][var52][var51] & var2) != 0) { // L: 785
							var9 = var51; // L: 786
							var10 = var51; // L: 787
							var11 = var50; // L: 788

							for (var12 = var50; var9 > 0 && (class1.field2[var50][var52][var9 - 1] & var2) != 0; --var9) { // L: 789 790
							}

							while (var10 < 104 && (class1.field2[var50][var52][var10 + 1] & var2) != 0) { // L: 791
								++var10;
							}

							label441:
							while (var11 > 0) { // L: 792
								for (var13 = var9; var13 <= var10; ++var13) { // L: 793
									if ((class1.field2[var11 - 1][var52][var13] & var2) == 0) {
										break label441;
									}
								}

								--var11; // L: 794
							}

							label430:
							while (var12 < var5) { // L: 796
								for (var13 = var9; var13 <= var10; ++var13) { // L: 797
									if ((class1.field2[var12 + 1][var52][var13] & var2) == 0) {
										break label430;
									}
								}

								++var12; // L: 798
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 800
							if (var13 >= 8) { // L: 801
								var53 = 240; // L: 802
								var15 = Tiles.Tiles_heights[var12][var52][var9] - var53; // L: 803
								var16 = Tiles.Tiles_heights[var11][var52][var9]; // L: 804
								Scene.Scene_addOccluder(var5, 1, var52 * 128, var52 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 805

								for (var17 = var11; var17 <= var12; ++var17) { // L: 806
									for (var18 = var9; var18 <= var10; ++var18) { // L: 807
										var10000 = class1.field2[var17][var52];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class1.field2[var50][var52][var51] & var3) != 0) { // L: 811
							var9 = var52; // L: 812
							var10 = var52; // L: 813
							var11 = var50; // L: 814

							for (var12 = var50; var9 > 0 && (class1.field2[var50][var9 - 1][var51] & var3) != 0; --var9) { // L: 815 816
							}

							while (var10 < 104 && (class1.field2[var50][var10 + 1][var51] & var3) != 0) { // L: 817
								++var10;
							}

							label494:
							while (var11 > 0) { // L: 818
								for (var13 = var9; var13 <= var10; ++var13) { // L: 819
									if ((class1.field2[var11 - 1][var13][var51] & var3) == 0) {
										break label494;
									}
								}

								--var11; // L: 820
							}

							label483:
							while (var12 < var5) { // L: 822
								for (var13 = var9; var13 <= var10; ++var13) { // L: 823
									if ((class1.field2[var12 + 1][var13][var51] & var3) == 0) {
										break label483;
									}
								}

								++var12; // L: 824
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 826
							if (var13 >= 8) { // L: 827
								var53 = 240; // L: 828
								var15 = Tiles.Tiles_heights[var12][var9][var51] - var53; // L: 829
								var16 = Tiles.Tiles_heights[var11][var9][var51]; // L: 830
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var51 * 128, var51 * 128, var15, var16); // L: 831

								for (var17 = var11; var17 <= var12; ++var17) { // L: 832
									for (var18 = var9; var18 <= var10; ++var18) { // L: 833
										var10000 = class1.field2[var17][var18];
										var10000[var51] &= ~var3;
									}
								}
							}
						}

						if ((class1.field2[var50][var52][var51] & var4) != 0) { // L: 837
							var9 = var52; // L: 838
							var10 = var52; // L: 839
							var11 = var51; // L: 840

							for (var12 = var51; var11 > 0 && (class1.field2[var50][var52][var11 - 1] & var4) != 0; --var11) { // L: 841 842
							}

							while (var12 < 104 && (class1.field2[var50][var52][var12 + 1] & var4) != 0) { // L: 843
								++var12;
							}

							label547:
							while (var9 > 0) { // L: 844
								for (var13 = var11; var13 <= var12; ++var13) { // L: 845
									if ((class1.field2[var50][var9 - 1][var13] & var4) == 0) {
										break label547;
									}
								}

								--var9; // L: 846
							}

							label536:
							while (var10 < 104) { // L: 848
								for (var13 = var11; var13 <= var12; ++var13) { // L: 849
									if ((class1.field2[var50][var10 + 1][var13] & var4) == 0) {
										break label536;
									}
								}

								++var10; // L: 850
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 852
								var13 = Tiles.Tiles_heights[var50][var9][var11]; // L: 853
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 854

								for (var14 = var9; var14 <= var10; ++var14) { // L: 855
									for (var15 = var11; var15 <= var12; ++var15) { // L: 856
										var10000 = class1.field2[var50][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 864
}
