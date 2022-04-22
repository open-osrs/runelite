import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1328751771
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 741115861
	)
	public int field4314;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -104742867
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1903880711
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1153445431
	)
	public int field4322;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 693600925
	)
	public int field4318;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2085695885
	)
	public int field4319;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1059199103
	)
	public int field4320;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 218263637
	)
	public int field4321;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1626482123
	)
	public int field4315;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 922588741
	)
	public int field4323;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4314 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4322 = -1; // L: 11
		this.field4318 = -1; // L: 12
		this.field4319 = -1; // L: 13
		this.field4320 = -1; // L: 14
		this.field4321 = -1; // L: 15
		this.field4315 = -1; // L: 16
		this.field4323 = -1; // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)V",
		garbageValue = "-689748439"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4311.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 43
				break;
			case 2:
				this.compass = var3.method7692(); // L: 28
				this.field4314 = var3.method7692(); // L: 29
				this.mapScenes = var3.method7692(); // L: 30
				this.headIconsPk = var3.method7692(); // L: 31
				this.field4322 = var3.method7692(); // L: 32
				this.field4318 = var3.method7692(); // L: 33
				this.field4319 = var3.method7692(); // L: 34
				this.field4320 = var3.method7692(); // L: 35
				this.field4321 = var3.method7692(); // L: 36
				this.field4315 = var3.method7692(); // L: 37
				this.field4323 = var3.method7692(); // L: 38
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lhv;[Lgv;I)V",
		garbageValue = "200441934"
	)
	static final void method6939(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 581
			for (var3 = 0; var3 < 104; ++var3) { // L: 582
				for (var4 = 0; var4 < 104; ++var4) { // L: 583
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 584
						var5 = var2; // L: 585
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 586
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 587
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 592
		if (Tiles.rndHue < -8) { // L: 593
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 594
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 595
		if (Tiles.rndLightness < -16) { // L: 596
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 597
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 598
			byte[][] var42 = class392.field4374[var2]; // L: 599
			var9 = (int)Math.sqrt(5100.0D); // L: 605
			var10 = var9 * 768 >> 8; // L: 606

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 607
				for (var12 = 1; var12 < 103; ++var12) { // L: 608
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 609
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 610
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 611
					var16 = (var13 << 8) / var15; // L: 612
					var17 = 65536 / var15; // L: 613
					var18 = (var14 << 8) / var15; // L: 614
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 615
					var20 = (var42[var12][var11 + 1] >> 3) + (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11] >> 1); // L: 616
					Tiles.field998[var12][var11] = var19 - var20; // L: 617
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 620
				BufferedNetSocket.Tiles_hue[var11] = 0; // L: 621
				class116.Tiles_saturation[var11] = 0; // L: 622
				Tiles.Tiles_lightness[var11] = 0; // L: 623
				class357.Tiles_hueMultiplier[var11] = 0; // L: 624
				class361.field4213[var11] = 0; // L: 625
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 627
				for (var12 = 0; var12 < 104; ++var12) { // L: 628
					var13 = var11 + 5; // L: 629
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 630
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255; // L: 631
						if (var14 > 0) { // L: 632
							FloorUnderlayDefinition var44 = class123.method2806(var14 - 1); // L: 633
							var10000 = BufferedNetSocket.Tiles_hue; // L: 634
							var10000[var12] += var44.hue;
							var10000 = class116.Tiles_saturation; // L: 635
							var10000[var12] += var44.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 636
							var10000[var12] += var44.lightness;
							var10000 = class357.Tiles_hueMultiplier; // L: 637
							var10000[var12] += var44.hueMultiplier;
							var10002 = class361.field4213[var12]++; // L: 638
						}
					}

					var14 = var11 - 5; // L: 641
					if (var14 >= 0 && var14 < 104) { // L: 642
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255; // L: 643
						if (var15 > 0) { // L: 644
							FloorUnderlayDefinition var45 = class123.method2806(var15 - 1); // L: 645
							var10000 = BufferedNetSocket.Tiles_hue; // L: 646
							var10000[var12] -= var45.hue;
							var10000 = class116.Tiles_saturation; // L: 647
							var10000[var12] -= var45.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 648
							var10000[var12] -= var45.lightness;
							var10000 = class357.Tiles_hueMultiplier; // L: 649
							var10000[var12] -= var45.hueMultiplier;
							var10002 = class361.field4213[var12]--; // L: 650
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 654
					var12 = 0; // L: 655
					var13 = 0; // L: 656
					var14 = 0; // L: 657
					var15 = 0; // L: 658
					var16 = 0; // L: 659

					for (var17 = -5; var17 < 109; ++var17) { // L: 660
						var18 = var17 + 5; // L: 661
						if (var18 >= 0 && var18 < 104) { // L: 662
							var12 += BufferedNetSocket.Tiles_hue[var18]; // L: 663
							var13 += class116.Tiles_saturation[var18]; // L: 664
							var14 += Tiles.Tiles_lightness[var18]; // L: 665
							var15 += class357.Tiles_hueMultiplier[var18]; // L: 666
							var16 += class361.field4213[var18]; // L: 667
						}

						var19 = var17 - 5; // L: 669
						if (var19 >= 0 && var19 < 104) { // L: 670
							var12 -= BufferedNetSocket.Tiles_hue[var19]; // L: 671
							var13 -= class116.Tiles_saturation[var19]; // L: 672
							var14 -= Tiles.Tiles_lightness[var19]; // L: 673
							var15 -= class357.Tiles_hueMultiplier[var19]; // L: 674
							var16 -= class361.field4213[var19]; // L: 675
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 677 678 679 680
							if (var2 < Tiles.Tiles_minPlane) { // L: 683
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255; // L: 684
							int var21 = class14.Tiles_overlays[var2][var11][var17] & 255; // L: 685
							if (var20 > 0 || var21 > 0) { // L: 686
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 687
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 688
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 689
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 690
								int var26 = Tiles.field998[var11][var17]; // L: 691
								int var27 = Tiles.field998[var11 + 1][var17]; // L: 692
								int var28 = Tiles.field998[var11 + 1][var17 + 1]; // L: 693
								int var29 = Tiles.field998[var11][var17 + 1]; // L: 694
								int var30 = -1; // L: 695
								int var31 = -1; // L: 696
								int var32;
								int var33;
								if (var20 > 0) { // L: 697
									var32 = var12 * 256 / var15; // L: 698
									var33 = var13 / var16; // L: 699
									int var34 = var14 / var16; // L: 700
									var30 = class162.hslToRgb(var32, var33, var34); // L: 701
									var32 = var32 + Tiles.rndHue & 255; // L: 702
									var34 += Tiles.rndLightness; // L: 703
									if (var34 < 0) { // L: 704
										var34 = 0;
									} else if (var34 > 255) { // L: 705
										var34 = 255;
									}

									var31 = class162.hslToRgb(var32, var33, var34); // L: 706
								}

								if (var2 > 0) { // L: 708
									boolean var47 = true; // L: 709
									if (var20 == 0 && class147.Tiles_shapes[var2][var11][var17] != 0) { // L: 710
										var47 = false;
									}

									if (var21 > 0 && !Clock.method3349(var21 - 1).hideUnderlay) { // L: 711
										var47 = false;
									}

									if (var47 && var22 == var23 && var24 == var22 && var25 == var22) { // L: 712 713
										var10000 = class420.field4545[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 716
								if (var31 != -1) { // L: 717
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[SoundCache.method772(var31, 96)];
								}

								if (var21 == 0) { // L: 718
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, SoundCache.method772(var30, var26), SoundCache.method772(var30, var27), SoundCache.method772(var30, var28), SoundCache.method772(var30, var29), 0, 0, 0, 0, var32, 0); // L: 719
								} else {
									var33 = class147.Tiles_shapes[var2][var11][var17] + 1; // L: 722
									byte var48 = Tiles.field983[var2][var11][var17]; // L: 723
									FloorOverlayDefinition var35 = Clock.method3349(var21 - 1); // L: 724
									int var36 = var35.texture; // L: 725
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) { // L: 728
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36); // L: 729
										var37 = -1; // L: 730
									} else if (var35.primaryRgb == 16711935) { // L: 733
										var37 = -2; // L: 734
										var36 = -1; // L: 735
										var38 = -2; // L: 736
									} else {
										var37 = class162.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 739
										var39 = var35.hue + Tiles.rndHue & 255; // L: 740
										var40 = var35.lightness + Tiles.rndLightness; // L: 741
										if (var40 < 0) { // L: 742
											var40 = 0;
										} else if (var40 > 255) { // L: 743
											var40 = 255;
										}

										var38 = class162.hslToRgb(var39, var35.saturation, var40); // L: 744
									}

									var39 = 0; // L: 747
									if (var38 != -2) { // L: 748
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ClanSettings.method3028(var38, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 749
										var40 = var35.secondaryHue + Tiles.rndHue & 255; // L: 750
										int var41 = var35.secondaryLightness + Tiles.rndLightness; // L: 751
										if (var41 < 0) { // L: 752
											var41 = 0;
										} else if (var41 > 255) { // L: 753
											var41 = 255;
										}

										var38 = class162.hslToRgb(var40, var35.secondarySaturation, var41); // L: 754
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ClanSettings.method3028(var38, 96)]; // L: 755
									}

									var0.addTile(var2, var11, var17, var33, var48, var36, var22, var23, var24, var25, SoundCache.method772(var30, var26), SoundCache.method772(var30, var27), SoundCache.method772(var30, var28), SoundCache.method772(var30, var29), ClanSettings.method3028(var37, var26), ClanSettings.method3028(var37, var27), ClanSettings.method3028(var37, var28), ClanSettings.method3028(var37, var29), var32, var39); // L: 757
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 764
				for (var12 = 1; var12 < 103; ++var12) { // L: 765
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 772
						var17 = 0; // L: 773
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 776
						var17 = var2 - 1; // L: 777
					} else {
						var17 = var2; // L: 780
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 782
				}
			}

			Tiles.Tiles_underlays[var2] = null; // L: 785
			class14.Tiles_overlays[var2] = null; // L: 786
			class147.Tiles_shapes[var2] = null; // L: 787
			Tiles.field983[var2] = null; // L: 788
			class392.field4374[var2] = null; // L: 789
		}

		var0.method4762(-50, -10, -50); // L: 791

		for (var2 = 0; var2 < 104; ++var2) { // L: 792
			for (var3 = 0; var3 < 104; ++var3) { // L: 793
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 794
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 797
		var3 = 2; // L: 798
		var4 = 4; // L: 799

		for (var5 = 0; var5 < 4; ++var5) { // L: 800
			if (var5 > 0) { // L: 801
				var2 <<= 3; // L: 802
				var3 <<= 3; // L: 803
				var4 <<= 3; // L: 804
			}

			for (int var6 = 0; var6 <= var5; ++var6) { // L: 806
				for (int var7 = 0; var7 <= 104; ++var7) { // L: 807
					for (int var8 = 0; var8 <= 104; ++var8) { // L: 808
						short var46;
						if ((class420.field4545[var6][var8][var7] & var2) != 0) { // L: 809
							var9 = var7; // L: 810
							var10 = var7; // L: 811
							var11 = var6; // L: 812

							for (var12 = var6; var9 > 0 && (class420.field4545[var6][var8][var9 - 1] & var2) != 0; --var9) { // L: 813 814
							}

							while (var10 < 104 && (class420.field4545[var6][var8][var10 + 1] & var2) != 0) { // L: 815
								++var10;
							}

							label432:
							while (var11 > 0) { // L: 816
								for (var13 = var9; var13 <= var10; ++var13) { // L: 817
									if ((class420.field4545[var11 - 1][var8][var13] & var2) == 0) {
										break label432;
									}
								}

								--var11; // L: 818
							}

							label421:
							while (var12 < var5) { // L: 820
								for (var13 = var9; var13 <= var10; ++var13) { // L: 821
									if ((class420.field4545[var12 + 1][var8][var13] & var2) == 0) {
										break label421;
									}
								}

								++var12; // L: 822
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 824
							if (var13 >= 8) { // L: 825
								var46 = 240; // L: 826
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var46; // L: 827
								var16 = Tiles.Tiles_heights[var11][var8][var9]; // L: 828
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 829

								for (var17 = var11; var17 <= var12; ++var17) { // L: 830
									for (var18 = var9; var18 <= var10; ++var18) { // L: 831
										var10000 = class420.field4545[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class420.field4545[var6][var8][var7] & var3) != 0) { // L: 835
							var9 = var8; // L: 836
							var10 = var8; // L: 837
							var11 = var6; // L: 838

							for (var12 = var6; var9 > 0 && (class420.field4545[var6][var9 - 1][var7] & var3) != 0; --var9) { // L: 839 840
							}

							while (var10 < 104 && (class420.field4545[var6][var10 + 1][var7] & var3) != 0) { // L: 841
								++var10;
							}

							label485:
							while (var11 > 0) { // L: 842
								for (var13 = var9; var13 <= var10; ++var13) { // L: 843
									if ((class420.field4545[var11 - 1][var13][var7] & var3) == 0) {
										break label485;
									}
								}

								--var11; // L: 844
							}

							label474:
							while (var12 < var5) { // L: 846
								for (var13 = var9; var13 <= var10; ++var13) { // L: 847
									if ((class420.field4545[var12 + 1][var13][var7] & var3) == 0) {
										break label474;
									}
								}

								++var12; // L: 848
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 850
							if (var13 >= 8) { // L: 851
								var46 = 240; // L: 852
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var46; // L: 853
								var16 = Tiles.Tiles_heights[var11][var9][var7]; // L: 854
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16); // L: 855

								for (var17 = var11; var17 <= var12; ++var17) { // L: 856
									for (var18 = var9; var18 <= var10; ++var18) { // L: 857
										var10000 = class420.field4545[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((class420.field4545[var6][var8][var7] & var4) != 0) { // L: 861
							var9 = var8; // L: 862
							var10 = var8; // L: 863
							var11 = var7; // L: 864

							for (var12 = var7; var11 > 0 && (class420.field4545[var6][var8][var11 - 1] & var4) != 0; --var11) { // L: 865 866
							}

							while (var12 < 104 && (class420.field4545[var6][var8][var12 + 1] & var4) != 0) { // L: 867
								++var12;
							}

							label538:
							while (var9 > 0) { // L: 868
								for (var13 = var11; var13 <= var12; ++var13) { // L: 869
									if ((class420.field4545[var6][var9 - 1][var13] & var4) == 0) {
										break label538;
									}
								}

								--var9; // L: 870
							}

							label527:
							while (var10 < 104) { // L: 872
								for (var13 = var11; var13 <= var12; ++var13) { // L: 873
									if ((class420.field4545[var6][var10 + 1][var13] & var4) == 0) {
										break label527;
									}
								}

								++var10; // L: 874
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 876
								var13 = Tiles.Tiles_heights[var6][var9][var11]; // L: 877
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 878

								for (var14 = var9; var14 <= var10; ++var14) { // L: 879
									for (var15 = var11; var15 <= var12; ++var15) { // L: 880
										var10000 = class420.field4545[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 888
}
