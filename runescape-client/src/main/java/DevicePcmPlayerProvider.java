import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements PlayerProvider {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ao")
	@Export("null_string")
	protected static String null_string;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lbh;",
		garbageValue = "87"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 10
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIBI)V",
		garbageValue = "761999327"
	)
	static final void method470(Player var0, int var1, int var2, byte var3) {
		int var4 = var0.pathX[0]; // L: 7420
		int var5 = var0.pathY[0]; // L: 7421
		int var6 = var0.transformedSize(); // L: 7422
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 7423
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 7424
				int var8 = var0.transformedSize(); // L: 7426
				RouteStrategy var9 = Renderable.method3628(var1, var2); // L: 7427
				CollisionMap var10 = Client.collisionMaps[var0.plane]; // L: 7428
				int[] var11 = Client.field879; // L: 7429
				int[] var12 = Client.field726; // L: 7430

				int var13;
				int var14;
				for (var13 = 0; var13 < 128; ++var13) { // L: 7432
					for (var14 = 0; var14 < 128; ++var14) { // L: 7433
						class137.directions[var13][var14] = 0; // L: 7434
						class137.distances[var13][var14] = 99999999; // L: 7435
					}
				}

				int var15;
				int var16;
				byte var17;
				byte var18;
				int var19;
				int var20;
				byte var21;
				int var22;
				int[][] var23;
				int var24;
				int var25;
				int var26;
				int var27;
				boolean var33;
				boolean var34;
				int var35;
				int var36;
				int var38;
				if (var8 == 1) { // L: 7439
					var15 = var4; // L: 7442
					var16 = var5; // L: 7443
					var17 = 64; // L: 7444
					var18 = 64; // L: 7445
					var19 = var4 - var17; // L: 7446
					var20 = var5 - var18; // L: 7447
					class137.directions[var17][var18] = 99; // L: 7448
					class137.distances[var17][var18] = 0; // L: 7449
					var21 = 0; // L: 7450
					var22 = 0; // L: 7451
					class137.bufferX[var21] = var4; // L: 7452
					var38 = var21 + 1;
					class137.bufferY[var21] = var5; // L: 7453
					var23 = var10.flags; // L: 7454

					while (true) {
						if (var38 == var22) { // L: 7457
							Messages.field1377 = var15; // L: 7529
							CollisionMap.field1535 = var16; // L: 7530
							var34 = false; // L: 7531
							break;
						}

						var15 = class137.bufferX[var22]; // L: 7458
						var16 = class137.bufferY[var22]; // L: 7459
						var22 = var22 + 1 & 4095; // L: 7460
						var35 = var15 - var19; // L: 7461
						var36 = var16 - var20; // L: 7462
						var24 = var15 - var10.xInset; // L: 7463
						var25 = var16 - var10.yInset; // L: 7464
						if (var9.hasArrived(1, var15, var16, var10)) { // L: 7465
							Messages.field1377 = var15; // L: 7466
							CollisionMap.field1535 = var16; // L: 7467
							var34 = true; // L: 7468
							break;
						}

						var26 = class137.distances[var35][var36] + 1; // L: 7471
						if (var35 > 0 && class137.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136776) == 0) { // L: 7472
							class137.bufferX[var38] = var15 - 1; // L: 7473
							class137.bufferY[var38] = var16; // L: 7474
							var38 = var38 + 1 & 4095; // L: 7475
							class137.directions[var35 - 1][var36] = 2; // L: 7476
							class137.distances[var35 - 1][var36] = var26; // L: 7477
						}

						if (var35 < 127 && class137.directions[var35 + 1][var36] == 0 && (var23[var24 + 1][var25] & 19136896) == 0) { // L: 7479
							class137.bufferX[var38] = var15 + 1; // L: 7480
							class137.bufferY[var38] = var16; // L: 7481
							var38 = var38 + 1 & 4095; // L: 7482
							class137.directions[var35 + 1][var36] = 8; // L: 7483
							class137.distances[var35 + 1][var36] = var26; // L: 7484
						}

						if (var36 > 0 && class137.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136770) == 0) { // L: 7486
							class137.bufferX[var38] = var15; // L: 7487
							class137.bufferY[var38] = var16 - 1; // L: 7488
							var38 = var38 + 1 & 4095; // L: 7489
							class137.directions[var35][var36 - 1] = 1; // L: 7490
							class137.distances[var35][var36 - 1] = var26; // L: 7491
						}

						if (var36 < 127 && class137.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + 1] & 19136800) == 0) { // L: 7493
							class137.bufferX[var38] = var15; // L: 7494
							class137.bufferY[var38] = var16 + 1; // L: 7495
							var38 = var38 + 1 & 4095; // L: 7496
							class137.directions[var35][var36 + 1] = 4; // L: 7497
							class137.distances[var35][var36 + 1] = var26; // L: 7498
						}

						if (var35 > 0 && var36 > 0 && class137.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) { // L: 7500
							class137.bufferX[var38] = var15 - 1; // L: 7501
							class137.bufferY[var38] = var16 - 1; // L: 7502
							var38 = var38 + 1 & 4095; // L: 7503
							class137.directions[var35 - 1][var36 - 1] = 3; // L: 7504
							class137.distances[var35 - 1][var36 - 1] = var26; // L: 7505
						}

						if (var35 < 127 && var36 > 0 && class137.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) { // L: 7507
							class137.bufferX[var38] = var15 + 1; // L: 7508
							class137.bufferY[var38] = var16 - 1; // L: 7509
							var38 = var38 + 1 & 4095; // L: 7510
							class137.directions[var35 + 1][var36 - 1] = 9; // L: 7511
							class137.distances[var35 + 1][var36 - 1] = var26; // L: 7512
						}

						if (var35 > 0 && var36 < 127 && class137.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) { // L: 7514
							class137.bufferX[var38] = var15 - 1; // L: 7515
							class137.bufferY[var38] = var16 + 1; // L: 7516
							var38 = var38 + 1 & 4095; // L: 7517
							class137.directions[var35 - 1][var36 + 1] = 6; // L: 7518
							class137.distances[var35 - 1][var36 + 1] = var26; // L: 7519
						}

						if (var35 < 127 && var36 < 127 && class137.directions[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 1] & 19136992) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) { // L: 7521
							class137.bufferX[var38] = var15 + 1; // L: 7522
							class137.bufferY[var38] = var16 + 1; // L: 7523
							var38 = var38 + 1 & 4095; // L: 7524
							class137.directions[var35 + 1][var36 + 1] = 12; // L: 7525
							class137.distances[var35 + 1][var36 + 1] = var26; // L: 7526
						}
					}

					var33 = var34; // L: 7533
				} else if (var8 == 2) { // L: 7535
					var33 = Decimator.method1113(var4, var5, var9, var10);
				} else {
					var15 = var4; // L: 7539
					var16 = var5; // L: 7540
					var17 = 64; // L: 7541
					var18 = 64; // L: 7542
					var19 = var4 - var17; // L: 7543
					var20 = var5 - var18; // L: 7544
					class137.directions[var17][var18] = 99; // L: 7545
					class137.distances[var17][var18] = 0; // L: 7546
					var21 = 0; // L: 7547
					var22 = 0; // L: 7548
					class137.bufferX[var21] = var4; // L: 7549
					var38 = var21 + 1;
					class137.bufferY[var21] = var5; // L: 7550
					var23 = var10.flags; // L: 7551

					label624:
					while (true) {
						label622:
						while (true) {
							do {
								do {
									do {
										label599:
										do {
											if (var38 == var22) { // L: 7552
												Messages.field1377 = var15; // L: 7672
												CollisionMap.field1535 = var16; // L: 7673
												var34 = false; // L: 7674
												break label624;
											}

											var15 = class137.bufferX[var22]; // L: 7553
											var16 = class137.bufferY[var22]; // L: 7554
											var22 = var22 + 1 & 4095; // L: 7555
											var35 = var15 - var19; // L: 7556
											var36 = var16 - var20; // L: 7557
											var24 = var15 - var10.xInset; // L: 7558
											var25 = var16 - var10.yInset; // L: 7559
											if (var9.hasArrived(var8, var15, var16, var10)) { // L: 7560
												Messages.field1377 = var15; // L: 7561
												CollisionMap.field1535 = var16; // L: 7562
												var34 = true; // L: 7563
												break label624;
											}

											var26 = class137.distances[var35][var36] + 1; // L: 7566
											if (var35 > 0 && class137.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + var8 - 1] & 19136824) == 0) { // L: 7567 7568 7569 7570
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class137.bufferX[var38] = var15 - 1; // L: 7574
														class137.bufferY[var38] = var16; // L: 7575
														var38 = var38 + 1 & 4095; // L: 7576
														class137.directions[var35 - 1][var36] = 2; // L: 7577
														class137.distances[var35 - 1][var36] = var26; // L: 7578
														break;
													}

													if ((var23[var24 - 1][var25 + var27] & 19136830) != 0) { // L: 7572
														break;
													}

													++var27; // L: 7571
												}
											}

											if (var35 < 128 - var8 && class137.directions[var35 + 1][var36] == 0 && (var23[var8 + var24][var25] & 19136899) == 0 && (var23[var24 + var8][var25 + var8 - 1] & 19136992) == 0) { // L: 7580 7581 7582 7583
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class137.bufferX[var38] = var15 + 1; // L: 7587
														class137.bufferY[var38] = var16; // L: 7588
														var38 = var38 + 1 & 4095; // L: 7589
														class137.directions[var35 + 1][var36] = 8; // L: 7590
														class137.distances[var35 + 1][var36] = var26; // L: 7591
														break;
													}

													if ((var23[var8 + var24][var27 + var25] & 19136995) != 0) { // L: 7585
														break;
													}

													++var27; // L: 7584
												}
											}

											if (var36 > 0 && class137.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var8 + var24 - 1][var25 - 1] & 19136899) == 0) { // L: 7593 7594 7595 7596
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class137.bufferX[var38] = var15; // L: 7600
														class137.bufferY[var38] = var16 - 1; // L: 7601
														var38 = var38 + 1 & 4095; // L: 7602
														class137.directions[var35][var36 - 1] = 1; // L: 7603
														class137.distances[var35][var36 - 1] = var26; // L: 7604
														break;
													}

													if ((var23[var27 + var24][var25 - 1] & 19136911) != 0) { // L: 7598
														break;
													}

													++var27; // L: 7597
												}
											}

											if (var36 < 128 - var8 && class137.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + var8] & 19136824) == 0 && (var23[var8 + var24 - 1][var25 + var8] & 19136992) == 0) { // L: 7606 7607 7608 7609
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class137.bufferX[var38] = var15; // L: 7613
														class137.bufferY[var38] = var16 + 1; // L: 7614
														var38 = var38 + 1 & 4095; // L: 7615
														class137.directions[var35][var36 + 1] = 4; // L: 7616
														class137.distances[var35][var36 + 1] = var26; // L: 7617
														break;
													}

													if ((var23[var27 + var24][var25 + var8] & 19137016) != 0) { // L: 7611
														break;
													}

													++var27; // L: 7610
												}
											}

											if (var35 > 0 && var36 > 0 && class137.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) { // L: 7619 7620 7621
												var27 = 1;

												while (true) {
													if (var27 >= var8) {
														class137.bufferX[var38] = var15 - 1; // L: 7626
														class137.bufferY[var38] = var16 - 1; // L: 7627
														var38 = var38 + 1 & 4095; // L: 7628
														class137.directions[var35 - 1][var36 - 1] = 3; // L: 7629
														class137.distances[var35 - 1][var36 - 1] = var26; // L: 7630
														break;
													}

													if ((var23[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) { // L: 7623 7624
														break;
													}

													++var27; // L: 7622
												}
											}

											if (var35 < 128 - var8 && var36 > 0 && class137.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + var8][var25 - 1] & 19136899) == 0) { // L: 7632 7633 7634
												var27 = 1;

												while (true) {
													if (var27 >= var8) {
														class137.bufferX[var38] = var15 + 1; // L: 7639
														class137.bufferY[var38] = var16 - 1; // L: 7640
														var38 = var38 + 1 & 4095; // L: 7641
														class137.directions[var35 + 1][var36 - 1] = 9; // L: 7642
														class137.distances[var35 + 1][var36 - 1] = var26; // L: 7643
														break;
													}

													if ((var23[var8 + var24][var27 + (var25 - 1)] & 19136995) != 0 || (var23[var27 + var24][var25 - 1] & 19136911) != 0) { // L: 7636 7637
														break;
													}

													++var27; // L: 7635
												}
											}

											if (var35 > 0 && var36 < 128 - var8 && class137.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + var8] & 19136824) == 0) { // L: 7645 7646 7647
												for (var27 = 1; var27 < var8; ++var27) { // L: 7648
													if ((var23[var24 - 1][var27 + var25] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 + var8] & 19137016) != 0) { // L: 7649 7650
														continue label599;
													}
												}

												class137.bufferX[var38] = var15 - 1; // L: 7652
												class137.bufferY[var38] = var16 + 1; // L: 7653
												var38 = var38 + 1 & 4095; // L: 7654
												class137.directions[var35 - 1][var36 + 1] = 6; // L: 7655
												class137.distances[var35 - 1][var36 + 1] = var26; // L: 7656
											}
										} while(var35 >= 128 - var8); // L: 7658
									} while(var36 >= 128 - var8);
								} while(class137.directions[var35 + 1][var36 + 1] != 0); // L: 7659
							} while((var23[var24 + var8][var25 + var8] & 19136992) != 0); // L: 7660

							for (var27 = 1; var27 < var8; ++var27) { // L: 7661
								if ((var23[var24 + var27][var8 + var25] & 19137016) != 0 || (var23[var8 + var24][var27 + var25] & 19136995) != 0) { // L: 7662 7663
									continue label622;
								}
							}

							class137.bufferX[var38] = var15 + 1; // L: 7665
							class137.bufferY[var38] = var16 + 1; // L: 7666
							var38 = var38 + 1 & 4095; // L: 7667
							class137.directions[var35 + 1][var36 + 1] = 12; // L: 7668
							class137.distances[var35 + 1][var36 + 1] = var26; // L: 7669
						}
					}

					var33 = var34; // L: 7676
				}

				int var7;
				label672: {
					var14 = var4 - 64; // L: 7678
					var15 = var5 - 64; // L: 7679
					var16 = Messages.field1377; // L: 7680
					var35 = CollisionMap.field1535; // L: 7681
					if (!var33) { // L: 7682
						var36 = Integer.MAX_VALUE; // L: 7684
						var19 = Integer.MAX_VALUE; // L: 7685
						byte var37 = 10; // L: 7686
						var38 = var9.approxDestinationX; // L: 7687
						var22 = var9.approxDestinationY; // L: 7688
						int var32 = var9.approxDestinationSizeX; // L: 7689
						var24 = var9.approxDestinationSizeY; // L: 7690

						for (var25 = var38 - var37; var25 <= var38 + var37; ++var25) { // L: 7691
							for (var26 = var22 - var37; var26 <= var37 + var22; ++var26) { // L: 7692
								var27 = var25 - var14; // L: 7693
								int var28 = var26 - var15; // L: 7694
								if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class137.distances[var27][var28] < 100) { // L: 7695 7696
									int var29 = 0; // L: 7697
									if (var25 < var38) { // L: 7698
										var29 = var38 - var25;
									} else if (var25 > var38 + var32 - 1) { // L: 7699
										var29 = var25 - (var32 + var38 - 1);
									}

									int var30 = 0; // L: 7700
									if (var26 < var22) { // L: 7701
										var30 = var22 - var26;
									} else if (var26 > var24 + var22 - 1) { // L: 7702
										var30 = var26 - (var22 + var24 - 1);
									}

									int var31 = var29 * var29 + var30 * var30; // L: 7703
									if (var31 < var36 || var31 == var36 && class137.distances[var27][var28] < var19) { // L: 7704
										var36 = var31; // L: 7705
										var19 = class137.distances[var27][var28]; // L: 7706
										var16 = var25; // L: 7707
										var35 = var26; // L: 7708
									}
								}
							}
						}

						if (var36 == Integer.MAX_VALUE) { // L: 7714
							var7 = -1; // L: 7715
							break label672;
						}
					}

					if (var4 == var16 && var35 == var5) { // L: 7724
						var7 = 0; // L: 7725
					} else {
						var18 = 0; // L: 7728
						class137.bufferX[var18] = var16; // L: 7731
						var36 = var18 + 1;
						class137.bufferY[var18] = var35; // L: 7732

						for (var19 = var20 = class137.directions[var16 - var14][var35 - var15]; var16 != var4 || var35 != var5; var19 = class137.directions[var16 - var14][var35 - var15]) { // L: 7733 7734 7744
							if (var20 != var19) { // L: 7735
								var20 = var19; // L: 7736
								class137.bufferX[var36] = var16; // L: 7737
								class137.bufferY[var36++] = var35; // L: 7738
							}

							if ((var19 & 2) != 0) { // L: 7740
								++var16;
							} else if ((var19 & 8) != 0) { // L: 7741
								--var16;
							}

							if ((var19 & 1) != 0) { // L: 7742
								++var35;
							} else if ((var19 & 4) != 0) { // L: 7743
								--var35;
							}
						}

						var38 = 0; // L: 7746

						while (var36-- > 0) { // L: 7747
							var11[var38] = class137.bufferX[var36]; // L: 7748
							var12[var38++] = class137.bufferY[var36]; // L: 7749
							if (var38 >= var11.length) { // L: 7750
								break;
							}
						}

						var7 = var38; // L: 7752
					}
				}

				var13 = var7; // L: 7754
				if (var7 >= 1) { // L: 7755
					for (var14 = 0; var14 < var13 - 1; ++var14) { // L: 7756
						var0.method2142(Client.field879[var14], Client.field726[var14], var3);
					}

				}
			}
		}
	} // L: 7757
}
