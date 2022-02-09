import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class145 extends class126 {
	@ObfuscatedName("w")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("bc")
	@Export("otp")
	static String otp;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 392490561
	)
	int field1651;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class145(class129 var1) {
		this.this$0 = var1;
		this.field1651 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		this.field1651 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2858(this.field1651); // L: 153
	} // L: 154

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lgn;[Lgi;B)V",
		garbageValue = "-83"
	)
	static final void method2976(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 595
			for (var3 = 0; var3 < 104; ++var3) { // L: 596
				for (var4 = 0; var4 < 104; ++var4) { // L: 597
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 598
						var5 = var2; // L: 599
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 600
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 601
							var1[var5].method3650(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 606
		if (Tiles.rndHue < -8) { // L: 607
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 608
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 609
		if (Tiles.rndLightness < -16) { // L: 610
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 611
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 612
			byte[][] var44 = class260.field3078[var2]; // L: 613
			boolean var53 = true; // L: 614
			boolean var54 = true; // L: 615
			boolean var6 = true; // L: 616
			boolean var7 = true; // L: 617
			boolean var8 = true; // L: 618
			var9 = (int)Math.sqrt(5100.0D); // L: 619
			var10 = var9 * 768 >> 8; // L: 620

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 621
				for (var12 = 1; var12 < 103; ++var12) { // L: 622
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 623
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 624
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 625
					var16 = (var13 << 8) / var15; // L: 626
					var17 = 65536 / var15; // L: 627
					var18 = (var14 << 8) / var15; // L: 628
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 629
					var20 = (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11 + 1] >> 3) + (var44[var12][var11] >> 1); // L: 630
					class19.field106[var12][var11] = var19 - var20; // L: 631
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 634
				class7.Tiles_hue[var11] = 0; // L: 635
				RouteStrategy.Tiles_saturation[var11] = 0; // L: 636
				AbstractByteArrayCopier.Tiles_lightness[var11] = 0; // L: 637
				class1.Tiles_hueMultiplier[var11] = 0; // L: 638
				VarcInt.field1789[var11] = 0; // L: 639
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 641
				for (var12 = 0; var12 < 104; ++var12) { // L: 642
					var13 = var11 + 5; // L: 643
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 644
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255; // L: 645
						if (var14 > 0) { // L: 646
							var16 = var14 - 1; // L: 648
							FloorUnderlayDefinition var48 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var16); // L: 650
							FloorUnderlayDefinition var50;
							if (var48 != null) { // L: 651
								var50 = var48; // L: 652
							} else {
								byte[] var49 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16); // L: 655
								var48 = new FloorUnderlayDefinition(); // L: 656
								if (var49 != null) { // L: 657
									var48.decode(new Buffer(var49), var16);
								}

								var48.postDecode(); // L: 658
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var48, (long)var16); // L: 659
								var50 = var48; // L: 660
							}

							var10000 = class7.Tiles_hue; // L: 663
							var10000[var12] += var50.hue;
							var10000 = RouteStrategy.Tiles_saturation; // L: 664
							var10000[var12] += var50.saturation;
							var10000 = AbstractByteArrayCopier.Tiles_lightness; // L: 665
							var10000[var12] += var50.lightness;
							var10000 = class1.Tiles_hueMultiplier; // L: 666
							var10000[var12] += var50.hueMultiplier;
							var10002 = VarcInt.field1789[var12]++; // L: 667
						}
					}

					var14 = var11 - 5; // L: 670
					if (var14 >= 0 && var14 < 104) { // L: 671
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255; // L: 672
						if (var15 > 0) { // L: 673
							var17 = var15 - 1; // L: 675
							FloorUnderlayDefinition var61 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17); // L: 677
							FloorUnderlayDefinition var52;
							if (var61 != null) { // L: 678
								var52 = var61; // L: 679
							} else {
								byte[] var51 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17); // L: 682
								var61 = new FloorUnderlayDefinition(); // L: 683
								if (var51 != null) { // L: 684
									var61.decode(new Buffer(var51), var17);
								}

								var61.postDecode(); // L: 685
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var61, (long)var17); // L: 686
								var52 = var61; // L: 687
							}

							var10000 = class7.Tiles_hue; // L: 690
							var10000[var12] -= var52.hue;
							var10000 = RouteStrategy.Tiles_saturation; // L: 691
							var10000[var12] -= var52.saturation;
							var10000 = AbstractByteArrayCopier.Tiles_lightness; // L: 692
							var10000[var12] -= var52.lightness;
							var10000 = class1.Tiles_hueMultiplier; // L: 693
							var10000[var12] -= var52.hueMultiplier;
							var10002 = VarcInt.field1789[var12]--; // L: 694
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 698
					var12 = 0; // L: 699
					var13 = 0; // L: 700
					var14 = 0; // L: 701
					var15 = 0; // L: 702
					var16 = 0; // L: 703

					for (var17 = -5; var17 < 109; ++var17) { // L: 704
						var18 = var17 + 5; // L: 705
						if (var18 >= 0 && var18 < 104) { // L: 706
							var12 += class7.Tiles_hue[var18]; // L: 707
							var13 += RouteStrategy.Tiles_saturation[var18]; // L: 708
							var14 += AbstractByteArrayCopier.Tiles_lightness[var18]; // L: 709
							var15 += class1.Tiles_hueMultiplier[var18]; // L: 710
							var16 += VarcInt.field1789[var18]; // L: 711
						}

						var19 = var17 - 5; // L: 713
						if (var19 >= 0 && var19 < 104) { // L: 714
							var12 -= class7.Tiles_hue[var19]; // L: 715
							var13 -= RouteStrategy.Tiles_saturation[var19]; // L: 716
							var14 -= AbstractByteArrayCopier.Tiles_lightness[var19]; // L: 717
							var15 -= class1.Tiles_hueMultiplier[var19]; // L: 718
							var16 -= VarcInt.field1789[var19]; // L: 719
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 721 722 723 724
							if (var2 < Tiles.Tiles_minPlane) { // L: 727
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255; // L: 728
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255; // L: 729
							if (var20 > 0 || var21 > 0) { // L: 730
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 731
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 732
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 733
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 734
								int var26 = class19.field106[var11][var17]; // L: 735
								int var27 = class19.field106[var11 + 1][var17]; // L: 736
								int var28 = class19.field106[var11 + 1][var17 + 1]; // L: 737
								int var29 = class19.field106[var11][var17 + 1]; // L: 738
								int var30 = -1; // L: 739
								int var31 = -1; // L: 740
								int var32;
								int var33;
								int var34;
								if (var20 > 0) { // L: 741
									var32 = var12 * 256 / var15; // L: 742
									var33 = var13 / var16; // L: 743
									var34 = var14 / var16; // L: 744
									var30 = KitDefinition.method3224(var32, var33, var34); // L: 745
									var32 = var32 + Tiles.rndHue & 255; // L: 746
									var34 += Tiles.rndLightness; // L: 747
									if (var34 < 0) { // L: 748
										var34 = 0;
									} else if (var34 > 255) { // L: 749
										var34 = 255;
									}

									var31 = KitDefinition.method3224(var32, var33, var34); // L: 750
								}

								FloorOverlayDefinition var35;
								if (var2 > 0) { // L: 752
									boolean var59 = true; // L: 753
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) { // L: 754
										var59 = false;
									}

									if (var21 > 0) { // L: 755
										var34 = var21 - 1; // L: 757
										var35 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var34); // L: 759
										FloorOverlayDefinition var45;
										if (var35 != null) { // L: 760
											var45 = var35; // L: 761
										} else {
											byte[] var36 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var34); // L: 764
											var35 = new FloorOverlayDefinition(); // L: 765
											if (var36 != null) { // L: 766
												var35.decode(new Buffer(var36), var34);
											}

											var35.postDecode(); // L: 767
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var35, (long)var34); // L: 768
											var45 = var35; // L: 769
										}

										if (!var45.hideUnderlay) { // L: 771
											var59 = false;
										}
									}

									if (var59 && var23 == var22 && var22 == var24 && var22 == var25) { // L: 773 774
										var10000 = class78.field1033[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 777
								if (var31 != -1) { // L: 778
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[ItemComposition.method3571(var31, 96)];
								}

								if (var21 == 0) { // L: 779
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, ItemComposition.method3571(var30, var26), ItemComposition.method3571(var30, var27), ItemComposition.method3571(var30, var28), ItemComposition.method3571(var30, var29), 0, 0, 0, 0, var32, 0); // L: 780
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1; // L: 783
									byte var60 = Tiles.field998[var2][var11][var17]; // L: 784
									int var46 = var21 - 1; // L: 786
									FloorOverlayDefinition var37 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var46); // L: 788
									if (var37 != null) { // L: 789
										var35 = var37; // L: 790
									} else {
										byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var46); // L: 793
										var37 = new FloorOverlayDefinition(); // L: 794
										if (var38 != null) { // L: 795
											var37.decode(new Buffer(var38), var46);
										}

										var37.postDecode(); // L: 796
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, (long)var46); // L: 797
										var35 = var37; // L: 798
									}

									int var47 = var35.texture; // L: 801
									int var39;
									int var40;
									int var41;
									int var42;
									if (var47 >= 0) { // L: 804
										var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var47); // L: 805
										var39 = -1; // L: 806
									} else if (var35.primaryRgb == 16711935) { // L: 809
										var39 = -2; // L: 810
										var47 = -1; // L: 811
										var40 = -2; // L: 812
									} else {
										var39 = KitDefinition.method3224(var35.hue, var35.saturation, var35.lightness); // L: 815
										var41 = var35.hue + Tiles.rndHue & 255; // L: 816
										var42 = var35.lightness + Tiles.rndLightness; // L: 817
										if (var42 < 0) { // L: 818
											var42 = 0;
										} else if (var42 > 255) { // L: 819
											var42 = 255;
										}

										var40 = KitDefinition.method3224(var41, var35.saturation, var42); // L: 820
									}

									var41 = 0; // L: 823
									if (var40 != -2) { // L: 824
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[IgnoreList.method6264(var40, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 825
										var42 = var35.secondaryHue + Tiles.rndHue & 255; // L: 826
										int var43 = var35.secondaryLightness + Tiles.rndLightness; // L: 827
										if (var43 < 0) { // L: 828
											var43 = 0;
										} else if (var43 > 255) { // L: 829
											var43 = 255;
										}

										var40 = KitDefinition.method3224(var42, var35.secondarySaturation, var43); // L: 830
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[IgnoreList.method6264(var40, 96)]; // L: 831
									}

									var0.addTile(var2, var11, var17, var33, var60, var47, var22, var23, var24, var25, ItemComposition.method3571(var30, var26), ItemComposition.method3571(var30, var27), ItemComposition.method3571(var30, var28), ItemComposition.method3571(var30, var29), IgnoreList.method6264(var39, var26), IgnoreList.method6264(var39, var27), IgnoreList.method6264(var39, var28), IgnoreList.method6264(var39, var29), var32, var41); // L: 833
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 840
				for (var12 = 1; var12 < 103; ++var12) { // L: 841
					var0.setTileMinPlane(var2, var12, var11, class293.method5482(var2, var12, var11)); // L: 842
				}
			}

			Tiles.Tiles_underlays[var2] = null; // L: 845
			Tiles.Tiles_overlays[var2] = null; // L: 846
			Tiles.Tiles_shapes[var2] = null; // L: 847
			Tiles.field998[var2] = null; // L: 848
			class260.field3078[var2] = null; // L: 849
		}

		var0.method3927(-50, -10, -50); // L: 851

		for (var2 = 0; var2 < 104; ++var2) { // L: 852
			for (var3 = 0; var3 < 104; ++var3) { // L: 853
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 854
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 857
		var3 = 2; // L: 858
		var4 = 4; // L: 859

		for (var5 = 0; var5 < 4; ++var5) { // L: 860
			if (var5 > 0) { // L: 861
				var2 <<= 3; // L: 862
				var3 <<= 3; // L: 863
				var4 <<= 3; // L: 864
			}

			for (int var55 = 0; var55 <= var5; ++var55) { // L: 866
				for (int var56 = 0; var56 <= 104; ++var56) { // L: 867
					for (int var57 = 0; var57 <= 104; ++var57) { // L: 868
						short var58;
						if ((class78.field1033[var55][var57][var56] & var2) != 0) { // L: 869
							var9 = var56; // L: 870
							var10 = var56; // L: 871
							var11 = var55; // L: 872

							for (var12 = var55; var9 > 0 && (class78.field1033[var55][var57][var9 - 1] & var2) != 0; --var9) { // L: 873 874
							}

							while (var10 < 104 && (class78.field1033[var55][var57][var10 + 1] & var2) != 0) { // L: 875
								++var10;
							}

							label473:
							while (var11 > 0) { // L: 876
								for (var13 = var9; var13 <= var10; ++var13) { // L: 877
									if ((class78.field1033[var11 - 1][var57][var13] & var2) == 0) {
										break label473;
									}
								}

								--var11; // L: 878
							}

							label462:
							while (var12 < var5) { // L: 880
								for (var13 = var9; var13 <= var10; ++var13) { // L: 881
									if ((class78.field1033[var12 + 1][var57][var13] & var2) == 0) {
										break label462;
									}
								}

								++var12; // L: 882
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 884
							if (var13 >= 8) { // L: 885
								var58 = 240; // L: 886
								var15 = Tiles.Tiles_heights[var12][var57][var9] - var58; // L: 887
								var16 = Tiles.Tiles_heights[var11][var57][var9]; // L: 888
								Scene.Scene_addOccluder(var5, 1, var57 * 128, var57 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 889

								for (var17 = var11; var17 <= var12; ++var17) { // L: 890
									for (var18 = var9; var18 <= var10; ++var18) { // L: 891
										var10000 = class78.field1033[var17][var57];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class78.field1033[var55][var57][var56] & var3) != 0) { // L: 895
							var9 = var57; // L: 896
							var10 = var57; // L: 897
							var11 = var55; // L: 898

							for (var12 = var55; var9 > 0 && (class78.field1033[var55][var9 - 1][var56] & var3) != 0; --var9) { // L: 899 900
							}

							while (var10 < 104 && (class78.field1033[var55][var10 + 1][var56] & var3) != 0) { // L: 901
								++var10;
							}

							label526:
							while (var11 > 0) { // L: 902
								for (var13 = var9; var13 <= var10; ++var13) { // L: 903
									if ((class78.field1033[var11 - 1][var13][var56] & var3) == 0) {
										break label526;
									}
								}

								--var11; // L: 904
							}

							label515:
							while (var12 < var5) { // L: 906
								for (var13 = var9; var13 <= var10; ++var13) { // L: 907
									if ((class78.field1033[var12 + 1][var13][var56] & var3) == 0) {
										break label515;
									}
								}

								++var12; // L: 908
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 910
							if (var13 >= 8) { // L: 911
								var58 = 240; // L: 912
								var15 = Tiles.Tiles_heights[var12][var9][var56] - var58; // L: 913
								var16 = Tiles.Tiles_heights[var11][var9][var56]; // L: 914
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var56 * 128, var56 * 128, var15, var16); // L: 915

								for (var17 = var11; var17 <= var12; ++var17) { // L: 916
									for (var18 = var9; var18 <= var10; ++var18) { // L: 917
										var10000 = class78.field1033[var17][var18];
										var10000[var56] &= ~var3;
									}
								}
							}
						}

						if ((class78.field1033[var55][var57][var56] & var4) != 0) { // L: 921
							var9 = var57; // L: 922
							var10 = var57; // L: 923
							var11 = var56; // L: 924

							for (var12 = var56; var11 > 0 && (class78.field1033[var55][var57][var11 - 1] & var4) != 0; --var11) { // L: 925 926
							}

							while (var12 < 104 && (class78.field1033[var55][var57][var12 + 1] & var4) != 0) { // L: 927
								++var12;
							}

							label579:
							while (var9 > 0) { // L: 928
								for (var13 = var11; var13 <= var12; ++var13) { // L: 929
									if ((class78.field1033[var55][var9 - 1][var13] & var4) == 0) {
										break label579;
									}
								}

								--var9; // L: 930
							}

							label568:
							while (var10 < 104) { // L: 932
								for (var13 = var11; var13 <= var12; ++var13) { // L: 933
									if ((class78.field1033[var55][var10 + 1][var13] & var4) == 0) {
										break label568;
									}
								}

								++var10; // L: 934
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 936
								var13 = Tiles.Tiles_heights[var55][var9][var11]; // L: 937
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 938

								for (var14 = var9; var14 <= var10; ++var14) { // L: 939
									for (var15 = var11; var15 <= var12; ++var15) { // L: 940
										var10000 = class78.field1033[var55][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 948
}
