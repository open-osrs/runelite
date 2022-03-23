import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1209798745
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lhx;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("cv")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lgs;[Lgf;I)V",
		garbageValue = "16777215"
	)
	static final void method4310(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 628
			for (var3 = 0; var3 < 104; ++var3) { // L: 629
				for (var4 = 0; var4 < 104; ++var4) { // L: 630
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 631
						var5 = var2; // L: 632
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 633
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 634
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 639
		if (Tiles.rndHue < -8) { // L: 640
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 641
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 642
		if (Tiles.rndLightness < -16) { // L: 643
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 644
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 645
			byte[][] var44 = GrandExchangeOfferNameComparator.field4010[var2]; // L: 646
			boolean var51 = true; // L: 647
			boolean var52 = true; // L: 648
			boolean var6 = true; // L: 649
			boolean var7 = true; // L: 650
			boolean var8 = true; // L: 651
			var9 = (int)Math.sqrt(5100.0D); // L: 652
			var10 = var9 * 768 >> 8; // L: 653

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 654
				for (var12 = 1; var12 < 103; ++var12) { // L: 655
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 656
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 657
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 658
					var16 = (var13 << 8) / var15; // L: 659
					var17 = 65536 / var15; // L: 660
					var18 = (var14 << 8) / var15; // L: 661
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 662
					var20 = (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11 + 1] >> 3) + (var44[var12][var11] >> 1); // L: 663
					Widget.field3495[var12][var11] = var19 - var20; // L: 664
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 667
				class4.Tiles_hue[var11] = 0; // L: 668
				Login.Tiles_saturation[var11] = 0; // L: 669
				WorldMapSectionType.Tiles_lightness[var11] = 0; // L: 670
				class300.Tiles_hueMultiplier[var11] = 0; // L: 671
				Tiles.field986[var11] = 0; // L: 672
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 674
				for (var12 = 0; var12 < 104; ++var12) { // L: 675
					var13 = var11 + 5; // L: 676
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 677
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255; // L: 678
						if (var14 > 0) { // L: 679
							FloorUnderlayDefinition var49 = class151.method3100(var14 - 1); // L: 680
							var10000 = class4.Tiles_hue; // L: 681
							var10000[var12] += var49.hue;
							var10000 = Login.Tiles_saturation; // L: 682
							var10000[var12] += var49.saturation;
							var10000 = WorldMapSectionType.Tiles_lightness; // L: 683
							var10000[var12] += var49.lightness;
							var10000 = class300.Tiles_hueMultiplier; // L: 684
							var10000[var12] += var49.hueMultiplier;
							var10002 = Tiles.field986[var12]++; // L: 685
						}
					}

					var14 = var11 - 5; // L: 688
					if (var14 >= 0 && var14 < 104) { // L: 689
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255; // L: 690
						if (var15 > 0) { // L: 691
							FloorUnderlayDefinition var50 = class151.method3100(var15 - 1); // L: 692
							var10000 = class4.Tiles_hue; // L: 693
							var10000[var12] -= var50.hue;
							var10000 = Login.Tiles_saturation; // L: 694
							var10000[var12] -= var50.saturation;
							var10000 = WorldMapSectionType.Tiles_lightness; // L: 695
							var10000[var12] -= var50.lightness;
							var10000 = class300.Tiles_hueMultiplier; // L: 696
							var10000[var12] -= var50.hueMultiplier;
							var10002 = Tiles.field986[var12]--; // L: 697
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 701
					var12 = 0; // L: 702
					var13 = 0; // L: 703
					var14 = 0; // L: 704
					var15 = 0; // L: 705
					var16 = 0; // L: 706

					for (var17 = -5; var17 < 109; ++var17) { // L: 707
						var18 = var17 + 5; // L: 708
						if (var18 >= 0 && var18 < 104) { // L: 709
							var12 += class4.Tiles_hue[var18]; // L: 710
							var13 += Login.Tiles_saturation[var18]; // L: 711
							var14 += WorldMapSectionType.Tiles_lightness[var18]; // L: 712
							var15 += class300.Tiles_hueMultiplier[var18]; // L: 713
							var16 += Tiles.field986[var18]; // L: 714
						}

						var19 = var17 - 5; // L: 716
						if (var19 >= 0 && var19 < 104) { // L: 717
							var12 -= class4.Tiles_hue[var19]; // L: 718
							var13 -= Login.Tiles_saturation[var19]; // L: 719
							var14 -= WorldMapSectionType.Tiles_lightness[var19]; // L: 720
							var15 -= class300.Tiles_hueMultiplier[var19]; // L: 721
							var16 -= Tiles.field986[var19]; // L: 722
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 724 725 726 727
							if (var2 < Tiles.Tiles_minPlane) { // L: 730
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255; // L: 731
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255; // L: 732
							if (var20 > 0 || var21 > 0) { // L: 733
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 734
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 735
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 736
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 737
								int var26 = Widget.field3495[var11][var17]; // L: 738
								int var27 = Widget.field3495[var11 + 1][var17]; // L: 739
								int var28 = Widget.field3495[var11 + 1][var17 + 1]; // L: 740
								int var29 = Widget.field3495[var11][var17 + 1]; // L: 741
								int var30 = -1; // L: 742
								int var31 = -1; // L: 743
								int var32;
								int var33;
								int var34;
								if (var20 > 0) { // L: 744
									var32 = var12 * 256 / var15; // L: 745
									var33 = var13 / var16; // L: 746
									var34 = var14 / var16; // L: 747
									var30 = SecureRandomCallable.hslToRgb(var32, var33, var34); // L: 748
									var32 = var32 + Tiles.rndHue & 255; // L: 749
									var34 += Tiles.rndLightness; // L: 750
									if (var34 < 0) { // L: 751
										var34 = 0;
									} else if (var34 > 255) { // L: 752
										var34 = 255;
									}

									var31 = SecureRandomCallable.hslToRgb(var32, var33, var34); // L: 753
								}

								FloorOverlayDefinition var35;
								if (var2 > 0) { // L: 755
									boolean var57 = true; // L: 756
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) { // L: 757
										var57 = false;
									}

									if (var21 > 0) { // L: 758
										var34 = var21 - 1; // L: 760
										var35 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var34); // L: 762
										FloorOverlayDefinition var46;
										if (var35 != null) { // L: 763
											var46 = var35; // L: 764
										} else {
											byte[] var36 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var34); // L: 767
											var35 = new FloorOverlayDefinition(); // L: 768
											if (var36 != null) { // L: 769
												var35.decode(new Buffer(var36), var34);
											}

											var35.postDecode(); // L: 770
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var35, (long)var34); // L: 771
											var46 = var35; // L: 772
										}

										if (!var46.hideUnderlay) { // L: 774
											var57 = false;
										}
									}

									if (var57 && var22 == var23 && var24 == var22 && var22 == var25) { // L: 776 777
										var10000 = DirectByteArrayCopier.field3277[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 780
								if (var31 != -1) { // L: 781
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapIcon_0.method4901(var31, 96)];
								}

								if (var21 == 0) { // L: 782
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, WorldMapIcon_0.method4901(var30, var26), WorldMapIcon_0.method4901(var30, var27), WorldMapIcon_0.method4901(var30, var28), WorldMapIcon_0.method4901(var30, var29), 0, 0, 0, 0, var32, 0); // L: 783
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1; // L: 786
									byte var58 = RunException.field4754[var2][var11][var17]; // L: 787
									int var47 = var21 - 1; // L: 789
									FloorOverlayDefinition var37 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var47); // L: 791
									if (var37 != null) { // L: 792
										var35 = var37; // L: 793
									} else {
										byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var47); // L: 796
										var37 = new FloorOverlayDefinition(); // L: 797
										if (var38 != null) { // L: 798
											var37.decode(new Buffer(var38), var47);
										}

										var37.postDecode(); // L: 799
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, (long)var47); // L: 800
										var35 = var37; // L: 801
									}

									int var48 = var35.texture; // L: 804
									int var39;
									int var40;
									int var41;
									int var42;
									if (var48 >= 0) { // L: 807
										var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var48); // L: 808
										var39 = -1; // L: 809
									} else if (var35.primaryRgb == 16711935) { // L: 812
										var39 = -2; // L: 813
										var48 = -1; // L: 814
										var40 = -2; // L: 815
									} else {
										var39 = SecureRandomCallable.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 818
										var41 = var35.hue + Tiles.rndHue & 255; // L: 819
										var42 = var35.lightness + Tiles.rndLightness; // L: 820
										if (var42 < 0) { // L: 821
											var42 = 0;
										} else if (var42 > 255) { // L: 822
											var42 = 255;
										}

										var40 = SecureRandomCallable.hslToRgb(var41, var35.saturation, var42); // L: 823
									}

									var41 = 0; // L: 826
									if (var40 != -2) { // L: 827
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[InvDefinition.method3334(var40, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 828
										var42 = var35.secondaryHue + Tiles.rndHue & 255; // L: 829
										int var43 = var35.secondaryLightness + Tiles.rndLightness; // L: 830
										if (var43 < 0) { // L: 831
											var43 = 0;
										} else if (var43 > 255) { // L: 832
											var43 = 255;
										}

										var40 = SecureRandomCallable.hslToRgb(var42, var35.secondarySaturation, var43); // L: 833
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[InvDefinition.method3334(var40, 96)]; // L: 834
									}

									var0.addTile(var2, var11, var17, var33, var58, var48, var22, var23, var24, var25, WorldMapIcon_0.method4901(var30, var26), WorldMapIcon_0.method4901(var30, var27), WorldMapIcon_0.method4901(var30, var28), WorldMapIcon_0.method4901(var30, var29), InvDefinition.method3334(var39, var26), InvDefinition.method3334(var39, var27), InvDefinition.method3334(var39, var28), InvDefinition.method3334(var39, var29), var32, var41); // L: 836
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 843
				for (var12 = 1; var12 < 103; ++var12) { // L: 844
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 851
						var17 = 0; // L: 852
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 855
						var17 = var2 - 1; // L: 856
					} else {
						var17 = var2; // L: 859
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 861
				}
			}

			Tiles.Tiles_underlays[var2] = null; // L: 864
			Tiles.Tiles_overlays[var2] = null; // L: 865
			Tiles.Tiles_shapes[var2] = null; // L: 866
			RunException.field4754[var2] = null; // L: 867
			GrandExchangeOfferNameComparator.field4010[var2] = null; // L: 868
		}

		var0.method4158(-50, -10, -50); // L: 870

		for (var2 = 0; var2 < 104; ++var2) { // L: 871
			for (var3 = 0; var3 < 104; ++var3) { // L: 872
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 873
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 876
		var3 = 2; // L: 877
		var4 = 4; // L: 878

		for (var5 = 0; var5 < 4; ++var5) { // L: 879
			if (var5 > 0) { // L: 880
				var2 <<= 3; // L: 881
				var3 <<= 3; // L: 882
				var4 <<= 3; // L: 883
			}

			for (int var53 = 0; var53 <= var5; ++var53) { // L: 885
				for (int var54 = 0; var54 <= 104; ++var54) { // L: 886
					for (int var55 = 0; var55 <= 104; ++var55) { // L: 887
						short var56;
						if ((DirectByteArrayCopier.field3277[var53][var55][var54] & var2) != 0) { // L: 888
							var9 = var54; // L: 889
							var10 = var54; // L: 890
							var11 = var53; // L: 891

							for (var12 = var53; var9 > 0 && (DirectByteArrayCopier.field3277[var53][var55][var9 - 1] & var2) != 0; --var9) { // L: 892 893
							}

							while (var10 < 104 && (DirectByteArrayCopier.field3277[var53][var55][var10 + 1] & var2) != 0) { // L: 894
								++var10;
							}

							label450:
							while (var11 > 0) { // L: 895
								for (var13 = var9; var13 <= var10; ++var13) { // L: 896
									if ((DirectByteArrayCopier.field3277[var11 - 1][var55][var13] & var2) == 0) {
										break label450;
									}
								}

								--var11; // L: 897
							}

							label439:
							while (var12 < var5) { // L: 899
								for (var13 = var9; var13 <= var10; ++var13) { // L: 900
									if ((DirectByteArrayCopier.field3277[var12 + 1][var55][var13] & var2) == 0) {
										break label439;
									}
								}

								++var12; // L: 901
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 903
							if (var13 >= 8) { // L: 904
								var56 = 240; // L: 905
								var15 = Tiles.Tiles_heights[var12][var55][var9] - var56; // L: 906
								var16 = Tiles.Tiles_heights[var11][var55][var9]; // L: 907
								Scene.Scene_addOccluder(var5, 1, var55 * 128, var55 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 908

								for (var17 = var11; var17 <= var12; ++var17) { // L: 909
									for (var18 = var9; var18 <= var10; ++var18) { // L: 910
										var10000 = DirectByteArrayCopier.field3277[var17][var55];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((DirectByteArrayCopier.field3277[var53][var55][var54] & var3) != 0) { // L: 914
							var9 = var55; // L: 915
							var10 = var55; // L: 916
							var11 = var53; // L: 917

							for (var12 = var53; var9 > 0 && (DirectByteArrayCopier.field3277[var53][var9 - 1][var54] & var3) != 0; --var9) { // L: 918 919
							}

							while (var10 < 104 && (DirectByteArrayCopier.field3277[var53][var10 + 1][var54] & var3) != 0) { // L: 920
								++var10;
							}

							label503:
							while (var11 > 0) { // L: 921
								for (var13 = var9; var13 <= var10; ++var13) { // L: 922
									if ((DirectByteArrayCopier.field3277[var11 - 1][var13][var54] & var3) == 0) {
										break label503;
									}
								}

								--var11; // L: 923
							}

							label492:
							while (var12 < var5) { // L: 925
								for (var13 = var9; var13 <= var10; ++var13) { // L: 926
									if ((DirectByteArrayCopier.field3277[var12 + 1][var13][var54] & var3) == 0) {
										break label492;
									}
								}

								++var12; // L: 927
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 929
							if (var13 >= 8) { // L: 930
								var56 = 240; // L: 931
								var15 = Tiles.Tiles_heights[var12][var9][var54] - var56; // L: 932
								var16 = Tiles.Tiles_heights[var11][var9][var54]; // L: 933
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var54 * 128, var54 * 128, var15, var16); // L: 934

								for (var17 = var11; var17 <= var12; ++var17) { // L: 935
									for (var18 = var9; var18 <= var10; ++var18) { // L: 936
										var10000 = DirectByteArrayCopier.field3277[var17][var18];
										var10000[var54] &= ~var3;
									}
								}
							}
						}

						if ((DirectByteArrayCopier.field3277[var53][var55][var54] & var4) != 0) { // L: 940
							var9 = var55; // L: 941
							var10 = var55; // L: 942
							var11 = var54; // L: 943

							for (var12 = var54; var11 > 0 && (DirectByteArrayCopier.field3277[var53][var55][var11 - 1] & var4) != 0; --var11) { // L: 944 945
							}

							while (var12 < 104 && (DirectByteArrayCopier.field3277[var53][var55][var12 + 1] & var4) != 0) { // L: 946
								++var12;
							}

							label556:
							while (var9 > 0) { // L: 947
								for (var13 = var11; var13 <= var12; ++var13) { // L: 948
									if ((DirectByteArrayCopier.field3277[var53][var9 - 1][var13] & var4) == 0) {
										break label556;
									}
								}

								--var9; // L: 949
							}

							label545:
							while (var10 < 104) { // L: 951
								for (var13 = var11; var13 <= var12; ++var13) { // L: 952
									if ((DirectByteArrayCopier.field3277[var53][var10 + 1][var13] & var4) == 0) {
										break label545;
									}
								}

								++var10; // L: 953
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 955
								var13 = Tiles.Tiles_heights[var53][var9][var11]; // L: 956
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 957

								for (var14 = var9; var14 <= var10; ++var14) { // L: 958
									for (var15 = var11; var15 <= var12; ++var15) { // L: 959
										var10000 = DirectByteArrayCopier.field3277[var53][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 967
}
