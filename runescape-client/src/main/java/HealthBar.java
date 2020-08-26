import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("l")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lir;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-891370152"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) { // L: 27
				var5 = var7;
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Lca;",
		garbageValue = "-95"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method4945(); // L: 55
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lec;[Lft;I)V",
		garbageValue = "79338939"
	)
	static final void method2113(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 485
			for (var3 = 0; var3 < 104; ++var3) { // L: 486
				for (var4 = 0; var4 < 104; ++var4) { // L: 487
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 488
						var5 = var2; // L: 489
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 490
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 491
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.field535 += (int)(Math.random() * 5.0D) - 2; // L: 496
		if (Tiles.field535 < -8) { // L: 497
			Tiles.field535 = -8;
		}

		if (Tiles.field535 > 8) { // L: 498
			Tiles.field535 = 8;
		}

		Tiles.field520 += (int)(Math.random() * 5.0D) - 2; // L: 499
		if (Tiles.field520 < -16) { // L: 500
			Tiles.field520 = -16;
		}

		if (Tiles.field520 > 16) { // L: 501
			Tiles.field520 = 16;
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 502
			byte[][] var42 = class22.field122[var2]; // L: 503
			var9 = (int)Math.sqrt(5100.0D); // L: 509
			var10 = var9 * 768 >> 8; // L: 510

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 511
				for (var12 = 1; var12 < 103; ++var12) { // L: 512
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 513
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 514
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 515
					var16 = (var13 << 8) / var15; // L: 516
					var17 = 65536 / var15; // L: 517
					var18 = (var14 << 8) / var15; // L: 518
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 519
					var20 = (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1); // L: 520
					class39.field282[var12][var11] = var19 - var20; // L: 521
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 524
				Tiles.Tiles_hue[var11] = 0; // L: 525
				Tiles.Tiles_saturation[var11] = 0; // L: 526
				WorldMapRectangle.Tiles_lightness[var11] = 0; // L: 527
				WorldMapScaleHandler.Tiles_hueMultiplier[var11] = 0; // L: 528
				class60.field453[var11] = 0; // L: 529
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 531
				for (var12 = 0; var12 < 104; ++var12) { // L: 532
					var13 = var11 + 5; // L: 533
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 534
						var14 = Tiles.field528[var2][var13][var12] & 255; // L: 535
						if (var14 > 0) { // L: 536
							var16 = var14 - 1; // L: 538
							FloorUnderlayDefinition var44 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var16); // L: 540
							FloorUnderlayDefinition var46;
							if (var44 != null) { // L: 541
								var46 = var44; // L: 542
							} else {
								byte[] var45 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16); // L: 545
								var44 = new FloorUnderlayDefinition(); // L: 546
								if (var45 != null) { // L: 547
									var44.decode(new Buffer(var45), var16);
								}

								var44.postDecode(); // L: 548
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var44, (long)var16); // L: 549
								var46 = var44; // L: 550
							}

							var10000 = Tiles.Tiles_hue; // L: 553
							var10000[var12] += var46.hue;
							var10000 = Tiles.Tiles_saturation; // L: 554
							var10000[var12] += var46.saturation;
							var10000 = WorldMapRectangle.Tiles_lightness; // L: 555
							var10000[var12] += var46.lightness;
							var10000 = WorldMapScaleHandler.Tiles_hueMultiplier; // L: 556
							var10000[var12] += var46.hueMultiplier;
							var10002 = class60.field453[var12]++; // L: 557
						}
					}

					var14 = var11 - 5; // L: 560
					if (var14 >= 0 && var14 < 104) { // L: 561
						var15 = Tiles.field528[var2][var14][var12] & 255; // L: 562
						if (var15 > 0) { // L: 563
							var17 = var15 - 1; // L: 565
							FloorUnderlayDefinition var52 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17); // L: 567
							FloorUnderlayDefinition var48;
							if (var52 != null) { // L: 568
								var48 = var52; // L: 569
							} else {
								byte[] var47 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17); // L: 572
								var52 = new FloorUnderlayDefinition(); // L: 573
								if (var47 != null) { // L: 574
									var52.decode(new Buffer(var47), var17);
								}

								var52.postDecode(); // L: 575
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var52, (long)var17); // L: 576
								var48 = var52; // L: 577
							}

							var10000 = Tiles.Tiles_hue; // L: 580
							var10000[var12] -= var48.hue;
							var10000 = Tiles.Tiles_saturation; // L: 581
							var10000[var12] -= var48.saturation;
							var10000 = WorldMapRectangle.Tiles_lightness; // L: 582
							var10000[var12] -= var48.lightness;
							var10000 = WorldMapScaleHandler.Tiles_hueMultiplier; // L: 583
							var10000[var12] -= var48.hueMultiplier;
							var10002 = class60.field453[var12]--; // L: 584
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 588
					var12 = 0; // L: 589
					var13 = 0; // L: 590
					var14 = 0; // L: 591
					var15 = 0; // L: 592
					var16 = 0; // L: 593

					for (var17 = -5; var17 < 109; ++var17) { // L: 594
						var18 = var17 + 5; // L: 595
						if (var18 >= 0 && var18 < 104) { // L: 596
							var12 += Tiles.Tiles_hue[var18]; // L: 597
							var13 += Tiles.Tiles_saturation[var18]; // L: 598
							var14 += WorldMapRectangle.Tiles_lightness[var18]; // L: 599
							var15 += WorldMapScaleHandler.Tiles_hueMultiplier[var18]; // L: 600
							var16 += class60.field453[var18]; // L: 601
						}

						var19 = var17 - 5; // L: 603
						if (var19 >= 0 && var19 < 104) { // L: 604
							var12 -= Tiles.Tiles_hue[var19]; // L: 605
							var13 -= Tiles.Tiles_saturation[var19]; // L: 606
							var14 -= WorldMapRectangle.Tiles_lightness[var19]; // L: 607
							var15 -= WorldMapScaleHandler.Tiles_hueMultiplier[var19]; // L: 608
							var16 -= class60.field453[var19]; // L: 609
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 611 612 613 614
							if (var2 < Tiles.Tiles_minPlane) { // L: 617
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.field528[var2][var11][var17] & 255; // L: 618
							int var21 = Tiles.field521[var2][var11][var17] & 255; // L: 619
							if (var20 > 0 || var21 > 0) { // L: 620
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 621
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 622
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 623
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 624
								int var26 = class39.field282[var11][var17]; // L: 625
								int var27 = class39.field282[var11 + 1][var17]; // L: 626
								int var28 = class39.field282[var11 + 1][var17 + 1]; // L: 627
								int var29 = class39.field282[var11][var17 + 1]; // L: 628
								int var30 = -1; // L: 629
								int var31 = -1; // L: 630
								int var32;
								int var33;
								if (var20 > 0) { // L: 631
									var32 = var12 * 256 / var15; // L: 632
									var33 = var13 / var16; // L: 633
									int var34 = var14 / var16; // L: 634
									var30 = class60.hslToRgb(var32, var33, var34); // L: 635
									var32 = var32 + Tiles.field535 & 255; // L: 636
									var34 += Tiles.field520; // L: 637
									if (var34 < 0) { // L: 638
										var34 = 0;
									} else if (var34 > 255) { // L: 639
										var34 = 255;
									}

									var31 = class60.hslToRgb(var32, var33, var34); // L: 640
								}

								if (var2 > 0) { // L: 642
									boolean var50 = true; // L: 643
									if (var20 == 0 && class297.field3668[var2][var11][var17] != 0) { // L: 644
										var50 = false;
									}

									if (var21 > 0 && !SoundSystem.method2594(var21 - 1).hideUnderlay) { // L: 645
										var50 = false;
									}

									if (var50 && var23 == var22 && var22 == var24 && var22 == var25) { // L: 646 647
										var10000 = class204.field2421[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 650
								if (var31 != -1) { // L: 651
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[PendingSpawn.method1795(var31, 96)];
								}

								if (var21 == 0) { // L: 652
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, PendingSpawn.method1795(var30, var26), PendingSpawn.method1795(var30, var27), PendingSpawn.method1795(var30, var28), PendingSpawn.method1795(var30, var29), 0, 0, 0, 0, var32, 0); // L: 653
								} else {
									var33 = class297.field3668[var2][var11][var17] + 1; // L: 656
									byte var51 = class171.field2049[var2][var11][var17]; // L: 657
									FloorOverlayDefinition var35 = SoundSystem.method2594(var21 - 1); // L: 658
									int var36 = var35.texture; // L: 659
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) { // L: 662
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36); // L: 663
										var37 = -1; // L: 664
									} else if (var35.primaryRgb == 16711935) { // L: 667
										var37 = -2; // L: 668
										var36 = -1; // L: 669
										var38 = -2; // L: 670
									} else {
										var37 = class60.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 673
										var39 = var35.hue + Tiles.field535 & 255; // L: 674
										var40 = var35.lightness + Tiles.field520; // L: 675
										if (var40 < 0) { // L: 676
											var40 = 0;
										} else if (var40 > 255) { // L: 677
											var40 = 255;
										}

										var38 = class60.hslToRgb(var39, var35.saturation, var40); // L: 678
									}

									var39 = 0; // L: 681
									if (var38 != -2) { // L: 682
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[Coord.method4083(var38, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 683
										var40 = var35.secondaryHue + Tiles.field535 & 255; // L: 684
										int var41 = var35.secondaryLightness + Tiles.field520; // L: 685
										if (var41 < 0) { // L: 686
											var41 = 0;
										} else if (var41 > 255) { // L: 687
											var41 = 255;
										}

										var38 = class60.hslToRgb(var40, var35.secondarySaturation, var41); // L: 688
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[Coord.method4083(var38, 96)]; // L: 689
									}

									var0.addTile(var2, var11, var17, var33, var51, var36, var22, var23, var24, var25, PendingSpawn.method1795(var30, var26), PendingSpawn.method1795(var30, var27), PendingSpawn.method1795(var30, var28), PendingSpawn.method1795(var30, var29), Coord.method4083(var37, var26), Coord.method4083(var37, var27), Coord.method4083(var37, var28), Coord.method4083(var37, var29), var32, var39); // L: 691
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 698
				for (var12 = 1; var12 < 103; ++var12) { // L: 699
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 706
						var17 = 0; // L: 707
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 710
						var17 = var2 - 1; // L: 711
					} else {
						var17 = var2; // L: 714
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 716
				}
			}

			Tiles.field528[var2] = null; // L: 719
			Tiles.field521[var2] = null; // L: 720
			class297.field3668[var2] = null; // L: 721
			class171.field2049[var2] = null; // L: 722
			class22.field122[var2] = null; // L: 723
		}

		var0.method3219(-50, -10, -50); // L: 725

		for (var2 = 0; var2 < 104; ++var2) { // L: 726
			for (var3 = 0; var3 < 104; ++var3) { // L: 727
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 728
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 731
		var3 = 2; // L: 732
		var4 = 4; // L: 733

		for (var5 = 0; var5 < 4; ++var5) { // L: 734
			if (var5 > 0) { // L: 735
				var2 <<= 3; // L: 736
				var3 <<= 3; // L: 737
				var4 <<= 3; // L: 738
			}

			for (int var6 = 0; var6 <= var5; ++var6) { // L: 740
				for (int var7 = 0; var7 <= 104; ++var7) { // L: 741
					for (int var8 = 0; var8 <= 104; ++var8) { // L: 742
						short var49;
						if ((class204.field2421[var6][var8][var7] & var2) != 0) { // L: 743
							var9 = var7; // L: 744
							var10 = var7; // L: 745
							var11 = var6; // L: 746

							for (var12 = var6; var9 > 0 && (class204.field2421[var6][var8][var9 - 1] & var2) != 0; --var9) { // L: 747 748
							}

							while (var10 < 104 && (class204.field2421[var6][var8][var10 + 1] & var2) != 0) { // L: 749
								++var10;
							}

							label453:
							while (var11 > 0) { // L: 750
								for (var13 = var9; var13 <= var10; ++var13) { // L: 751
									if ((class204.field2421[var11 - 1][var8][var13] & var2) == 0) {
										break label453;
									}
								}

								--var11; // L: 752
							}

							label442:
							while (var12 < var5) { // L: 754
								for (var13 = var9; var13 <= var10; ++var13) { // L: 755
									if ((class204.field2421[var12 + 1][var8][var13] & var2) == 0) {
										break label442;
									}
								}

								++var12; // L: 756
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 758
							if (var13 >= 8) { // L: 759
								var49 = 240; // L: 760
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var49; // L: 761
								var16 = Tiles.Tiles_heights[var11][var8][var9]; // L: 762
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 763

								for (var17 = var11; var17 <= var12; ++var17) { // L: 764
									for (var18 = var9; var18 <= var10; ++var18) { // L: 765
										var10000 = class204.field2421[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class204.field2421[var6][var8][var7] & var3) != 0) { // L: 769
							var9 = var8; // L: 770
							var10 = var8; // L: 771
							var11 = var6; // L: 772

							for (var12 = var6; var9 > 0 && (class204.field2421[var6][var9 - 1][var7] & var3) != 0; --var9) { // L: 773 774
							}

							while (var10 < 104 && (class204.field2421[var6][var10 + 1][var7] & var3) != 0) { // L: 775
								++var10;
							}

							label506:
							while (var11 > 0) { // L: 776
								for (var13 = var9; var13 <= var10; ++var13) { // L: 777
									if ((class204.field2421[var11 - 1][var13][var7] & var3) == 0) {
										break label506;
									}
								}

								--var11; // L: 778
							}

							label495:
							while (var12 < var5) { // L: 780
								for (var13 = var9; var13 <= var10; ++var13) { // L: 781
									if ((class204.field2421[var12 + 1][var13][var7] & var3) == 0) {
										break label495;
									}
								}

								++var12; // L: 782
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 784
							if (var13 >= 8) { // L: 785
								var49 = 240; // L: 786
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var49; // L: 787
								var16 = Tiles.Tiles_heights[var11][var9][var7]; // L: 788
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16); // L: 789

								for (var17 = var11; var17 <= var12; ++var17) { // L: 790
									for (var18 = var9; var18 <= var10; ++var18) { // L: 791
										var10000 = class204.field2421[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((class204.field2421[var6][var8][var7] & var4) != 0) { // L: 795
							var9 = var8; // L: 796
							var10 = var8; // L: 797
							var11 = var7; // L: 798

							for (var12 = var7; var11 > 0 && (class204.field2421[var6][var8][var11 - 1] & var4) != 0; --var11) { // L: 799 800
							}

							while (var12 < 104 && (class204.field2421[var6][var8][var12 + 1] & var4) != 0) { // L: 801
								++var12;
							}

							label559:
							while (var9 > 0) { // L: 802
								for (var13 = var11; var13 <= var12; ++var13) { // L: 803
									if ((class204.field2421[var6][var9 - 1][var13] & var4) == 0) {
										break label559;
									}
								}

								--var9; // L: 804
							}

							label548:
							while (var10 < 104) { // L: 806
								for (var13 = var11; var13 <= var12; ++var13) { // L: 807
									if ((class204.field2421[var6][var10 + 1][var13] & var4) == 0) {
										break label548;
									}
								}

								++var10; // L: 808
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 810
								var13 = Tiles.Tiles_heights[var6][var9][var11]; // L: 811
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 812

								for (var14 = var9; var14 <= var10; ++var14) { // L: 813
									for (var15 = var11; var15 <= var12; ++var15) { // L: 814
										var10000 = class204.field2421[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 822

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2034460378"
	)
	@Export("Messages_getNextChatID")
	static int Messages_getNextChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 75
		if (var1 == null) { // L: 76
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 77 78
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZB)I",
		garbageValue = "-51"
	)
	static int method2112(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2269
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2270
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2271
			return 1; // L: 2272
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2274
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2275
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2276
			return 1; // L: 2277
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2279
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2280
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2281
			return 1; // L: 2282
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2284
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2285
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2286
			return 1; // L: 2287
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2289
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2290
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2291
			return 1; // L: 2292
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2294
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2295
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2296
			return 1; // L: 2297
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2299
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2300
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2301
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2302
				return 1; // L: 2303
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2305
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2306
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2307
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2308
				return 1; // L: 2309
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2311
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2312
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2313
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2314
				return 1; // L: 2315
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2317
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2318
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2319
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2320
				return 1; // L: 2321
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2323
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2324
					if (WorldMapSection1.grandExchangeEvents != null) { // L: 2325
						WorldMapSection1.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2326
					}

					return 1; // L: 2328
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2330
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2331
					if (WorldMapSection1.grandExchangeEvents != null) { // L: 2332
						WorldMapSection1.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2333
					}

					return 1; // L: 2335
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2337
					Interpreter.Interpreter_intStackSize -= 2; // L: 2338
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 2339
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 2340
					if (WorldMapSection1.grandExchangeEvents != null) { // L: 2341
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2342
						WorldMapSection1.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2343
					}

					return 1; // L: 2345
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2347
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2348
					if (WorldMapSection1.grandExchangeEvents != null) { // L: 2349
						WorldMapSection1.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2350
					}

					return 1; // L: 2352
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2354
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2355
					if (WorldMapSection1.grandExchangeEvents != null) { // L: 2356
						WorldMapSection1.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2357
					}

					return 1; // L: 2359
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2361
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection1.grandExchangeEvents == null ? 0 : WorldMapSection1.grandExchangeEvents.events.size(); // L: 2362
					return 1; // L: 2363
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2365
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2366
						var4 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3); // L: 2367
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 2368
						return 1; // L: 2369
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2371
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2372
						var4 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3); // L: 2373
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2374
						return 1; // L: 2375
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 2377
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2378
						var4 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3); // L: 2379
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 2380
						return 1; // L: 2381
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 2383
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2384
						var4 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3); // L: 2385
						long var5 = PacketWriter.currentTimeMillis() - ItemContainer.field553 - var4.age; // L: 2386
						int var7 = (int)(var5 / 3600000L); // L: 2387
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 2388
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 2389
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 2390
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var10; // L: 2391
						return 1; // L: 2392
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 2394
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2395
						var4 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3); // L: 2396
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 2397
						return 1; // L: 2398
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 2400
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2401
						var4 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3); // L: 2402
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 2403
						return 1; // L: 2404
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 2406
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2407
						var4 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3); // L: 2408
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 2409
						return 1; // L: 2410
					} else {
						return 2; // L: 2412
					}
				}
			}
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIILlp;Lhz;I)V",
		garbageValue = "728555201"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		if (var4 != null) { // L: 10662
			int var6 = Client.camAngleY & 2047; // L: 10663
			int var7 = var3 * var3 + var2 * var2; // L: 10664
			if (var7 <= 6400) { // L: 10665
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 10666
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 10667
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 10668
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 10669
				if (var7 > 2500) {
					var4.method6262(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 10670
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 10671
				}

			}
		}
	} // L: 10672
}
