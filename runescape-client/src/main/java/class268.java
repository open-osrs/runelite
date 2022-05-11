import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public final class class268 {
	@ObfuscatedName("l")
	static final HashMap field3208;
	@ObfuscatedName("a")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 685628771
	)
	static int field3212;

	static {
		field3208 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3208) { // L: 16
			TimeZone var2 = (TimeZone)field3208.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3208.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0); // L: 25
	} // L: 26

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-1479426402"
	)
	static void method5030(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 270
			Buffer var3 = new Buffer(500); // L: 271
			var3.writeByte(3); // L: 272
			var3.writeByte(var1 != null ? 1 : 0); // L: 273
			var3.writeCESU8(var0.getPath()); // L: 274
			if (var1 != null) {
				var3.writeCESU8(""); // L: 275
			}

			var2.write(var3.array, 0, var3.offset); // L: 276
			var2.close(); // L: 277
		} catch (IOException var4) { // L: 279
			var4.printStackTrace(); // L: 280
		}

	} // L: 282

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "1429154223"
	)
	static boolean method5028(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance(); // L: 999
		var1.set(1, var1.get(1) - 13); // L: 1000
		var1.set(5, var1.get(5) + 1); // L: 1001
		var1.set(11, 0); // L: 1002
		var1.set(12, 0); // L: 1003
		var1.set(13, 0); // L: 1004
		var1.set(14, 0); // L: 1005
		Date var2 = var1.getTime(); // L: 1006
		return var0.before(var2); // L: 1007
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lgm;[Lgh;B)V",
		garbageValue = "61"
	)
	static final void method5029(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 618
			for (var3 = 0; var3 < 104; ++var3) { // L: 619
				for (var4 = 0; var4 < 104; ++var4) { // L: 620
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 621
						var5 = var2; // L: 622
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 623
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 624
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 629
		if (Tiles.rndHue < -8) { // L: 630
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 631
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 632
		if (Tiles.rndLightness < -16) { // L: 633
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 634
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 635
			byte[][] var42 = NPC.field1259[var2]; // L: 636
			boolean var45 = true; // L: 637
			boolean var46 = true; // L: 638
			boolean var6 = true; // L: 639
			boolean var7 = true; // L: 640
			boolean var8 = true; // L: 641
			var9 = (int)Math.sqrt(5100.0D); // L: 642
			var10 = var9 * 768 >> 8; // L: 643

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 644
				for (var12 = 1; var12 < 103; ++var12) { // L: 645
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 646
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 647
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 648
					var16 = (var13 << 8) / var15; // L: 649
					var17 = 65536 / var15; // L: 650
					var18 = (var14 << 8) / var15; // L: 651
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 652
					var20 = (var42[var12][var11 + 1] >> 3) + (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11] >> 1); // L: 653
					Interpreter.field839[var12][var11] = var19 - var20; // L: 654
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 657
				class154.Tiles_hue[var11] = 0; // L: 658
				MusicPatch.Tiles_saturation[var11] = 0; // L: 659
				WallDecoration.Tiles_lightness[var11] = 0; // L: 660
				Tiles.Tiles_hueMultiplier[var11] = 0; // L: 661
				MenuAction.field866[var11] = 0; // L: 662
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 664
				for (var12 = 0; var12 < 104; ++var12) { // L: 665
					var13 = var11 + 5; // L: 666
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 667
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255; // L: 668
						if (var14 > 0) { // L: 669
							FloorUnderlayDefinition var43 = class160.method3171(var14 - 1); // L: 670
							var10000 = class154.Tiles_hue; // L: 671
							var10000[var12] += var43.hue;
							var10000 = MusicPatch.Tiles_saturation; // L: 672
							var10000[var12] += var43.saturation;
							var10000 = WallDecoration.Tiles_lightness; // L: 673
							var10000[var12] += var43.lightness;
							var10000 = Tiles.Tiles_hueMultiplier; // L: 674
							var10000[var12] += var43.hueMultiplier;
							var10002 = MenuAction.field866[var12]++; // L: 675
						}
					}

					var14 = var11 - 5; // L: 678
					if (var14 >= 0 && var14 < 104) { // L: 679
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255; // L: 680
						if (var15 > 0) { // L: 681
							FloorUnderlayDefinition var44 = class160.method3171(var15 - 1); // L: 682
							var10000 = class154.Tiles_hue; // L: 683
							var10000[var12] -= var44.hue;
							var10000 = MusicPatch.Tiles_saturation; // L: 684
							var10000[var12] -= var44.saturation;
							var10000 = WallDecoration.Tiles_lightness; // L: 685
							var10000[var12] -= var44.lightness;
							var10000 = Tiles.Tiles_hueMultiplier; // L: 686
							var10000[var12] -= var44.hueMultiplier;
							var10002 = MenuAction.field866[var12]--; // L: 687
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 691
					var12 = 0; // L: 692
					var13 = 0; // L: 693
					var14 = 0; // L: 694
					var15 = 0; // L: 695
					var16 = 0; // L: 696

					for (var17 = -5; var17 < 109; ++var17) { // L: 697
						var18 = var17 + 5; // L: 698
						if (var18 >= 0 && var18 < 104) { // L: 699
							var12 += class154.Tiles_hue[var18]; // L: 700
							var13 += MusicPatch.Tiles_saturation[var18]; // L: 701
							var14 += WallDecoration.Tiles_lightness[var18]; // L: 702
							var15 += Tiles.Tiles_hueMultiplier[var18]; // L: 703
							var16 += MenuAction.field866[var18]; // L: 704
						}

						var19 = var17 - 5; // L: 706
						if (var19 >= 0 && var19 < 104) { // L: 707
							var12 -= class154.Tiles_hue[var19]; // L: 708
							var13 -= MusicPatch.Tiles_saturation[var19]; // L: 709
							var14 -= WallDecoration.Tiles_lightness[var19]; // L: 710
							var15 -= Tiles.Tiles_hueMultiplier[var19]; // L: 711
							var16 -= MenuAction.field866[var19]; // L: 712
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 714 715 716 717
							if (var2 < Tiles.Tiles_minPlane) { // L: 720
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255; // L: 721
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255; // L: 722
							if (var20 > 0 || var21 > 0) { // L: 723
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 724
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 725
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 726
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 727
								int var26 = Interpreter.field839[var11][var17]; // L: 728
								int var27 = Interpreter.field839[var11 + 1][var17]; // L: 729
								int var28 = Interpreter.field839[var11 + 1][var17 + 1]; // L: 730
								int var29 = Interpreter.field839[var11][var17 + 1]; // L: 731
								int var30 = -1; // L: 732
								int var31 = -1; // L: 733
								int var32;
								int var33;
								if (var20 > 0) { // L: 734
									var32 = var12 * 256 / var15; // L: 735
									var33 = var13 / var16; // L: 736
									int var34 = var14 / var16; // L: 737
									var30 = ArchiveLoader.hslToRgb(var32, var33, var34); // L: 738
									var32 = var32 + Tiles.rndHue & 255; // L: 739
									var34 += Tiles.rndLightness; // L: 740
									if (var34 < 0) { // L: 741
										var34 = 0;
									} else if (var34 > 255) { // L: 742
										var34 = 255;
									}

									var31 = ArchiveLoader.hslToRgb(var32, var33, var34); // L: 743
								}

								if (var2 > 0) { // L: 745
									boolean var51 = true; // L: 746
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) { // L: 747
										var51 = false;
									}

									if (var21 > 0 && !Message.method1098(var21 - 1).hideUnderlay) { // L: 748
										var51 = false;
									}

									if (var51 && var23 == var22 && var24 == var22 && var25 == var22) { // L: 749 750
										var10000 = VerticalAlignment.field1993[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 753
								if (var31 != -1) { // L: 754
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[DevicePcmPlayerProvider.method340(var31, 96)];
								}

								if (var21 == 0) { // L: 755
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, DevicePcmPlayerProvider.method340(var30, var26), DevicePcmPlayerProvider.method340(var30, var27), DevicePcmPlayerProvider.method340(var30, var28), DevicePcmPlayerProvider.method340(var30, var29), 0, 0, 0, 0, var32, 0); // L: 756
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1; // L: 759
									byte var52 = RunException.field4812[var2][var11][var17]; // L: 760
									FloorOverlayDefinition var35 = Message.method1098(var21 - 1); // L: 761
									int var36 = var35.texture; // L: 762
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) { // L: 765
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36); // L: 766
										var37 = -1; // L: 767
									} else if (var35.primaryRgb == 16711935) { // L: 770
										var37 = -2; // L: 771
										var36 = -1; // L: 772
										var38 = -2; // L: 773
									} else {
										var37 = ArchiveLoader.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 776
										var39 = var35.hue + Tiles.rndHue & 255; // L: 777
										var40 = var35.lightness + Tiles.rndLightness; // L: 778
										if (var40 < 0) { // L: 779
											var40 = 0;
										} else if (var40 > 255) { // L: 780
											var40 = 255;
										}

										var38 = ArchiveLoader.hslToRgb(var39, var35.saturation, var40); // L: 781
									}

									var39 = 0; // L: 784
									if (var38 != -2) { // L: 785
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ParamComposition.method3505(var38, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 786
										var40 = var35.secondaryHue + Tiles.rndHue & 255; // L: 787
										int var41 = var35.secondaryLightness + Tiles.rndLightness; // L: 788
										if (var41 < 0) { // L: 789
											var41 = 0;
										} else if (var41 > 255) { // L: 790
											var41 = 255;
										}

										var38 = ArchiveLoader.hslToRgb(var40, var35.secondarySaturation, var41); // L: 791
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ParamComposition.method3505(var38, 96)]; // L: 792
									}

									var0.addTile(var2, var11, var17, var33, var52, var36, var22, var23, var24, var25, DevicePcmPlayerProvider.method340(var30, var26), DevicePcmPlayerProvider.method340(var30, var27), DevicePcmPlayerProvider.method340(var30, var28), DevicePcmPlayerProvider.method340(var30, var29), ParamComposition.method3505(var37, var26), ParamComposition.method3505(var37, var27), ParamComposition.method3505(var37, var28), ParamComposition.method3505(var37, var29), var32, var39); // L: 794
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 801
				for (var12 = 1; var12 < 103; ++var12) { // L: 802
					var0.setTileMinPlane(var2, var12, var11, VarbitComposition.method3489(var2, var12, var11)); // L: 803
				}
			}

			Tiles.Tiles_underlays[var2] = null; // L: 806
			Tiles.Tiles_overlays[var2] = null; // L: 807
			Tiles.Tiles_shapes[var2] = null; // L: 808
			RunException.field4812[var2] = null; // L: 809
			NPC.field1259[var2] = null; // L: 810
		}

		var0.method4057(-50, -10, -50); // L: 812

		for (var2 = 0; var2 < 104; ++var2) { // L: 813
			for (var3 = 0; var3 < 104; ++var3) { // L: 814
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 815
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 818
		var3 = 2; // L: 819
		var4 = 4; // L: 820

		for (var5 = 0; var5 < 4; ++var5) { // L: 821
			if (var5 > 0) { // L: 822
				var2 <<= 3; // L: 823
				var3 <<= 3; // L: 824
				var4 <<= 3; // L: 825
			}

			for (int var47 = 0; var47 <= var5; ++var47) { // L: 827
				for (int var48 = 0; var48 <= 104; ++var48) { // L: 828
					for (int var49 = 0; var49 <= 104; ++var49) { // L: 829
						short var50;
						if ((VerticalAlignment.field1993[var47][var49][var48] & var2) != 0) { // L: 830
							var9 = var48; // L: 831
							var10 = var48; // L: 832
							var11 = var47; // L: 833

							for (var12 = var47; var9 > 0 && (VerticalAlignment.field1993[var47][var49][var9 - 1] & var2) != 0; --var9) { // L: 834 835
							}

							while (var10 < 104 && (VerticalAlignment.field1993[var47][var49][var10 + 1] & var2) != 0) { // L: 836
								++var10;
							}

							label422:
							while (var11 > 0) { // L: 837
								for (var13 = var9; var13 <= var10; ++var13) { // L: 838
									if ((VerticalAlignment.field1993[var11 - 1][var49][var13] & var2) == 0) {
										break label422;
									}
								}

								--var11; // L: 839
							}

							label411:
							while (var12 < var5) { // L: 841
								for (var13 = var9; var13 <= var10; ++var13) { // L: 842
									if ((VerticalAlignment.field1993[var12 + 1][var49][var13] & var2) == 0) {
										break label411;
									}
								}

								++var12; // L: 843
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 845
							if (var13 >= 8) { // L: 846
								var50 = 240; // L: 847
								var15 = Tiles.Tiles_heights[var12][var49][var9] - var50; // L: 848
								var16 = Tiles.Tiles_heights[var11][var49][var9]; // L: 849
								Scene.Scene_addOccluder(var5, 1, var49 * 128, var49 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 850

								for (var17 = var11; var17 <= var12; ++var17) { // L: 851
									for (var18 = var9; var18 <= var10; ++var18) { // L: 852
										var10000 = VerticalAlignment.field1993[var17][var49];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((VerticalAlignment.field1993[var47][var49][var48] & var3) != 0) { // L: 856
							var9 = var49; // L: 857
							var10 = var49; // L: 858
							var11 = var47; // L: 859

							for (var12 = var47; var9 > 0 && (VerticalAlignment.field1993[var47][var9 - 1][var48] & var3) != 0; --var9) { // L: 860 861
							}

							while (var10 < 104 && (VerticalAlignment.field1993[var47][var10 + 1][var48] & var3) != 0) { // L: 862
								++var10;
							}

							label475:
							while (var11 > 0) { // L: 863
								for (var13 = var9; var13 <= var10; ++var13) { // L: 864
									if ((VerticalAlignment.field1993[var11 - 1][var13][var48] & var3) == 0) {
										break label475;
									}
								}

								--var11; // L: 865
							}

							label464:
							while (var12 < var5) { // L: 867
								for (var13 = var9; var13 <= var10; ++var13) { // L: 868
									if ((VerticalAlignment.field1993[var12 + 1][var13][var48] & var3) == 0) {
										break label464;
									}
								}

								++var12; // L: 869
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 871
							if (var13 >= 8) { // L: 872
								var50 = 240; // L: 873
								var15 = Tiles.Tiles_heights[var12][var9][var48] - var50; // L: 874
								var16 = Tiles.Tiles_heights[var11][var9][var48]; // L: 875
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var48 * 128, var48 * 128, var15, var16); // L: 876

								for (var17 = var11; var17 <= var12; ++var17) { // L: 877
									for (var18 = var9; var18 <= var10; ++var18) { // L: 878
										var10000 = VerticalAlignment.field1993[var17][var18];
										var10000[var48] &= ~var3;
									}
								}
							}
						}

						if ((VerticalAlignment.field1993[var47][var49][var48] & var4) != 0) { // L: 882
							var9 = var49; // L: 883
							var10 = var49; // L: 884
							var11 = var48; // L: 885

							for (var12 = var48; var11 > 0 && (VerticalAlignment.field1993[var47][var49][var11 - 1] & var4) != 0; --var11) { // L: 886 887
							}

							while (var12 < 104 && (VerticalAlignment.field1993[var47][var49][var12 + 1] & var4) != 0) { // L: 888
								++var12;
							}

							label528:
							while (var9 > 0) { // L: 889
								for (var13 = var11; var13 <= var12; ++var13) { // L: 890
									if ((VerticalAlignment.field1993[var47][var9 - 1][var13] & var4) == 0) {
										break label528;
									}
								}

								--var9; // L: 891
							}

							label517:
							while (var10 < 104) { // L: 893
								for (var13 = var11; var13 <= var12; ++var13) { // L: 894
									if ((VerticalAlignment.field1993[var47][var10 + 1][var13] & var4) == 0) {
										break label517;
									}
								}

								++var10; // L: 895
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 897
								var13 = Tiles.Tiles_heights[var47][var9][var11]; // L: 898
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 899

								for (var14 = var9; var14 <= var10; ++var14) { // L: 900
									for (var15 = var11; var15 <= var12; ++var15) { // L: 901
										var10000 = VerticalAlignment.field1993[var47][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 909
}
