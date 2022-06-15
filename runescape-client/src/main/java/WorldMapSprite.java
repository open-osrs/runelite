import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("v")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "14"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1]; // L: 19
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Ljw;I)V",
		garbageValue = "-419484906"
	)
	static final void method4998(class262 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7489
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (class262.field3022 == var0) { // L: 7490
			var2 = var1.readUnsignedShort(); // L: 7491
			var3 = var1.method7767(); // L: 7492
			var4 = (var3 >> 4 & 7) + class10.field53; // L: 7493
			var5 = (var3 & 7) + class298.field3558; // L: 7494
			var6 = var1.method7767(); // L: 7495
			var7 = var1.readUnsignedShort(); // L: 7496
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7497
				var4 = var4 * 128 + 64; // L: 7498
				var5 = var5 * 128 + 64; // L: 7499
				GraphicsObject var45 = new GraphicsObject(var2, PacketWriter.Client_plane, var4, var5, SceneTilePaint.getTileHeight(var4, var5, PacketWriter.Client_plane) - var6, var7, Client.cycle); // L: 7500
				Client.graphicsObjects.addFirst(var45); // L: 7501
			}

		} else {
			int var8;
			if (class262.field3023 == var0) { // L: 7505
				var2 = var1.method7765(); // L: 7506
				var3 = var2 >> 2; // L: 7507
				var4 = var2 & 3; // L: 7508
				var5 = Client.field582[var3]; // L: 7509
				var6 = var1.method7765(); // L: 7510
				var7 = (var6 >> 4 & 7) + class10.field53; // L: 7511
				var8 = (var6 & 7) + class298.field3558; // L: 7512
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7513
					Canvas.updatePendingSpawn(PacketWriter.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1); // L: 7514
				}

			} else {
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				byte var14;
				if (class262.field3021 == var0) { // L: 7518
					var2 = var1.readUnsignedByte() * 4; // L: 7519
					var3 = var1.readUnsignedShort(); // L: 7520
					var4 = var1.readUnsignedShort(); // L: 7521
					var5 = var1.readUnsignedByte(); // L: 7522
					var6 = var1.method7813(); // L: 7523
					var7 = var1.method7767(); // L: 7524
					var8 = var1.method7765(); // L: 7525
					var9 = (var8 >> 4 & 7) + class10.field53; // L: 7526
					var10 = (var8 & 7) + class298.field3558; // L: 7527
					var11 = var1.method7765() * 4; // L: 7528
					byte var40 = var1.method7952(); // L: 7529
					var13 = var1.method7776(); // L: 7530
					var14 = var1.readByte(); // L: 7531
					int var41 = var14 + var9; // L: 7532
					var12 = var40 + var10; // L: 7533
					if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var41 >= 0 && var12 >= 0 && var41 < 104 && var12 < 104 && var4 != 65535) { // L: 7534
						var9 = var9 * 128 + 64; // L: 7535
						var10 = var10 * 128 + 64; // L: 7536
						var41 = var41 * 128 + 64; // L: 7537
						var12 = var12 * 128 + 64; // L: 7538
						Projectile var36 = new Projectile(var4, PacketWriter.Client_plane, var9, var10, SceneTilePaint.getTileHeight(var9, var10, PacketWriter.Client_plane) - var11, var13 + Client.cycle, var3 + Client.cycle, var7, var5, var6, var2); // L: 7539
						var36.setDestination(var41, var12, SceneTilePaint.getTileHeight(var41, var12, PacketWriter.Client_plane) - var2, var13 + Client.cycle); // L: 7540
						Client.projectiles.addFirst(var36); // L: 7541
					}

				} else {
					if (class262.field3020 == var0) { // L: 7545
						var2 = var1.method7765(); // L: 7546
						var3 = var2 >> 4 & 15; // L: 7547
						var4 = var2 & 7; // L: 7548
						var5 = var1.method7767(); // L: 7549
						var6 = var1.readUnsignedShort(); // L: 7550
						var7 = var1.readUnsignedByte(); // L: 7551
						var8 = (var7 >> 4 & 7) + class10.field53; // L: 7552
						var9 = (var7 & 7) + class298.field3558; // L: 7553
						if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 7554
							var10 = var3 + 1; // L: 7555
							if (class101.localPlayer.pathX[0] >= var8 - var10 && class101.localPlayer.pathX[0] <= var8 + var10 && class101.localPlayer.pathY[0] >= var9 - var10 && class101.localPlayer.pathY[0] <= var9 + var10 && class19.clientPreferences.method2262() != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 7556 7557
								Client.soundEffectIds[Client.soundEffectCount] = var6; // L: 7558
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 7559
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5; // L: 7560
								Client.soundEffects[Client.soundEffectCount] = null; // L: 7561
								Client.soundLocations[Client.soundEffectCount] = var3 + (var9 << 8) + (var8 << 16); // L: 7562
								++Client.soundEffectCount; // L: 7563
							}
						}
					}

					if (class262.field3017 == var0) { // L: 7568
						var2 = var1.readUnsignedByte(); // L: 7569
						var3 = (var2 >> 4 & 7) + class10.field53; // L: 7570
						var4 = (var2 & 7) + class298.field3558; // L: 7571
						var5 = var1.method7774(); // L: 7572
						var6 = var1.method7774(); // L: 7573
						var7 = var1.readUnsignedShort(); // L: 7574
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7575
							NodeDeque var34 = Client.groundItems[PacketWriter.Client_plane][var3][var4]; // L: 7576
							if (var34 != null) { // L: 7577
								for (TileItem var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) { // L: 7578 7579 7584
									if ((var6 & 32767) == var35.id && var5 == var35.quantity) { // L: 7580
										var35.quantity = var7; // L: 7581
										break;
									}
								}

								class133.updateItemPile(var3, var4); // L: 7586
							}
						}

					} else {
						TileItem var32;
						if (class262.field3019 == var0) { // L: 7591
							var2 = var1.readUnsignedShort(); // L: 7592
							var3 = var1.method7767(); // L: 7593
							var4 = (var3 >> 4 & 7) + class10.field53; // L: 7594
							var5 = (var3 & 7) + class298.field3558; // L: 7595
							var6 = var1.method7775(); // L: 7596
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7597
								var32 = new TileItem(); // L: 7598
								var32.id = var2; // L: 7599
								var32.quantity = var6; // L: 7600
								if (Client.groundItems[PacketWriter.Client_plane][var4][var5] == null) { // L: 7601
									Client.groundItems[PacketWriter.Client_plane][var4][var5] = new NodeDeque();
								}

								Client.groundItems[PacketWriter.Client_plane][var4][var5].addFirst(var32); // L: 7602
								class133.updateItemPile(var4, var5); // L: 7603
							}

						} else {
							if (class262.field3024 == var0) { // L: 7607
								var2 = var1.method7765(); // L: 7608
								var3 = (var2 >> 4 & 7) + class10.field53; // L: 7609
								var4 = (var2 & 7) + class298.field3558; // L: 7610
								byte var37 = var1.method7952(); // L: 7611
								var6 = var1.method7775(); // L: 7612
								byte var38 = var1.method7952(); // L: 7613
								byte var39 = var1.method7768(); // L: 7614
								var9 = var1.method7767(); // L: 7615
								var10 = var9 >> 2; // L: 7616
								var11 = var9 & 3; // L: 7617
								var12 = Client.field582[var10]; // L: 7618
								var13 = var1.method7776(); // L: 7619
								var14 = var1.method7769(); // L: 7620
								int var15 = var1.method7775(); // L: 7621
								int var16 = var1.readUnsignedShort(); // L: 7622
								Player var17;
								if (var15 == Client.localPlayerIndex) { // L: 7624
									var17 = class101.localPlayer;
								} else {
									var17 = Client.players[var15]; // L: 7625
								}

								if (var17 != null) { // L: 7626
									ObjectComposition var18 = class162.getObjectDefinition(var6); // L: 7627
									int var19;
									int var20;
									if (var11 != 1 && var11 != 3) { // L: 7630
										var19 = var18.sizeX; // L: 7635
										var20 = var18.sizeY; // L: 7636
									} else {
										var19 = var18.sizeY; // L: 7631
										var20 = var18.sizeX; // L: 7632
									}

									int var21 = var3 + (var19 >> 1); // L: 7638
									int var22 = var3 + (var19 + 1 >> 1); // L: 7639
									int var23 = var4 + (var20 >> 1); // L: 7640
									int var24 = var4 + (var20 + 1 >> 1); // L: 7641
									int[][] var25 = Tiles.Tiles_heights[PacketWriter.Client_plane]; // L: 7642
									int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 7643
									int var27 = (var3 << 7) + (var19 << 6); // L: 7644
									int var28 = (var4 << 7) + (var20 << 6); // L: 7645
									Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28); // L: 7646
									if (var29 != null) { // L: 7647
										Canvas.updatePendingSpawn(PacketWriter.Client_plane, var3, var4, var12, -1, 0, 0, var13 + 1, var16 + 1); // L: 7648
										var17.animationCycleStart = var13 + Client.cycle; // L: 7649
										var17.animationCycleEnd = var16 + Client.cycle; // L: 7650
										var17.model0 = var29; // L: 7651
										var17.field1095 = var19 * 64 + var3 * 128; // L: 7652
										var17.field1108 = var20 * 64 + var4 * 128; // L: 7653
										var17.tileHeight2 = var26; // L: 7654
										byte var30;
										if (var37 > var39) { // L: 7655
											var30 = var37; // L: 7656
											var37 = var39; // L: 7657
											var39 = var30; // L: 7658
										}

										if (var38 > var14) { // L: 7660
											var30 = var38; // L: 7661
											var38 = var14; // L: 7662
											var14 = var30; // L: 7663
										}

										var17.minX = var37 + var3; // L: 7665
										var17.maxX = var39 + var3; // L: 7666
										var17.minY = var4 + var38; // L: 7667
										var17.maxY = var4 + var14; // L: 7668
									}
								}
							}

							if (class262.field3015 == var0) { // L: 7672
								var2 = var1.method7765(); // L: 7673
								var3 = var2 >> 2; // L: 7674
								var4 = var2 & 3; // L: 7675
								var5 = Client.field582[var3]; // L: 7676
								var6 = var1.method7774(); // L: 7677
								var7 = var1.readUnsignedByte(); // L: 7678
								var8 = (var7 >> 4 & 7) + class10.field53; // L: 7679
								var9 = (var7 & 7) + class298.field3558; // L: 7680
								if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 7681
									if (var5 == 0) { // L: 7682
										BoundaryObject var33 = class356.scene.method4333(PacketWriter.Client_plane, var8, var9); // L: 7683
										if (var33 != null) { // L: 7684
											var11 = Decimator.Entity_unpackID(var33.tag); // L: 7685
											if (var3 == 2) { // L: 7686
												var33.renderable1 = new DynamicObject(var11, 2, var4 + 4, PacketWriter.Client_plane, var8, var9, var6, false, var33.renderable1); // L: 7687
												var33.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, PacketWriter.Client_plane, var8, var9, var6, false, var33.renderable2); // L: 7688
											} else {
												var33.renderable1 = new DynamicObject(var11, var3, var4, PacketWriter.Client_plane, var8, var9, var6, false, var33.renderable1); // L: 7690
											}
										}
									}

									if (var5 == 1) { // L: 7693
										WallDecoration var42 = class356.scene.method4178(PacketWriter.Client_plane, var8, var9); // L: 7694
										if (var42 != null) { // L: 7695
											var11 = Decimator.Entity_unpackID(var42.tag); // L: 7696
											if (var3 != 4 && var3 != 5) { // L: 7697
												if (var3 == 6) { // L: 7698
													var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable1);
												} else if (var3 == 7) { // L: 7699
													var42.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable1);
												} else if (var3 == 8) { // L: 7700
													var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable1); // L: 7701
													var42.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable2); // L: 7702
												}
											} else {
												var42.renderable1 = new DynamicObject(var11, 4, var4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable1);
											}
										}
									}

									if (var5 == 2) { // L: 7706
										GameObject var43 = class356.scene.getGameObject(PacketWriter.Client_plane, var8, var9); // L: 7707
										if (var3 == 11) { // L: 7708
											var3 = 10;
										}

										if (var43 != null) { // L: 7709
											var43.renderable = new DynamicObject(Decimator.Entity_unpackID(var43.tag), var3, var4, PacketWriter.Client_plane, var8, var9, var6, false, var43.renderable);
										}
									}

									if (var5 == 3) { // L: 7711
										FloorDecoration var44 = class356.scene.getFloorDecoration(PacketWriter.Client_plane, var8, var9); // L: 7712
										if (var44 != null) { // L: 7713
											var44.renderable = new DynamicObject(Decimator.Entity_unpackID(var44.tag), 22, var4, PacketWriter.Client_plane, var8, var9, var6, false, var44.renderable);
										}
									}
								}

							} else if (class262.field3018 == var0) { // L: 7718
								var2 = var1.method7766(); // L: 7719
								var3 = var2 >> 2; // L: 7720
								var4 = var2 & 3; // L: 7721
								var5 = Client.field582[var3]; // L: 7722
								var6 = var1.method7765(); // L: 7723
								var7 = (var6 >> 4 & 7) + class10.field53; // L: 7724
								var8 = (var6 & 7) + class298.field3558; // L: 7725
								var9 = var1.method7774(); // L: 7726
								if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7727
									Canvas.updatePendingSpawn(PacketWriter.Client_plane, var7, var8, var5, var9, var3, var4, 0, -1); // L: 7728
								}

							} else if (class262.field3016 == var0) { // L: 7732
								var2 = var1.readUnsignedShort(); // L: 7733
								var3 = var1.method7766(); // L: 7734
								var4 = (var3 >> 4 & 7) + class10.field53; // L: 7735
								var5 = (var3 & 7) + class298.field3558; // L: 7736
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7737
									NodeDeque var31 = Client.groundItems[PacketWriter.Client_plane][var4][var5]; // L: 7738
									if (var31 != null) { // L: 7739
										for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 7740 7741 7746
											if ((var2 & 32767) == var32.id) { // L: 7742
												var32.remove(); // L: 7743
												break;
											}
										}

										if (var31.last() == null) { // L: 7748
											Client.groundItems[PacketWriter.Client_plane][var4][var5] = null;
										}

										class133.updateItemPile(var4, var5); // L: 7749
									}
								}

							}
						}
					}
				}
			}
		}
	} // L: 7503 7516 7543 7589 7605 7716 7730 7752 7754

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1162269812"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10617

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10618
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10619
		}

		if (var1.length() > 9) { // L: 10621
			return " " + class122.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class122.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class122.colorStartTag(16776960) + var1 + "</col>"; // L: 10622 10623
		}
	}
}
