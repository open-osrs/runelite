import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("i")
	byte[] field2916;
	@ObfuscatedName("w")
	byte[] field2914;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1643718021
	)
	int field2913;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 470925631
	)
	int field2918;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1577880969
	)
	int field2915;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1887609341
	)
	int field2912;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1787645677
	)
	int field2917;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -311548265
	)
	int field2911;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1107256975
	)
	int field2919;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "2086723943"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? GrandExchangeEvent.method5448(var0, 10, var1) : Integer.toString(var0); // L: 114 115
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1147573372"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7519
			if (Client.isLowDetail && var0 != GrandExchangeOfferTotalQuantityComparator.Client_plane) { // L: 7520
				return;
			}

			long var7 = 0L; // L: 7521
			boolean var9 = true; // L: 7522
			boolean var10 = false; // L: 7523
			boolean var11 = false; // L: 7524
			if (var1 == 0) { // L: 7525
				var7 = GameBuild.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7526
				var7 = GameBuild.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7527
				var7 = GameBuild.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7528
				var7 = GameBuild.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 7529
				var12 = GameBuild.scene.getObjectFlags(var0, var2, var3, var7); // L: 7530
				int var38 = class21.Entity_unpackID(var7); // L: 7531
				int var39 = var12 & 31; // L: 7532
				int var40 = var12 >> 6 & 3; // L: 7533
				ObjectComposition var13;
				if (var1 == 0) { // L: 7534
					GameBuild.scene.removeBoundaryObject(var0, var2, var3); // L: 7535
					var13 = KitDefinition.getObjectDefinition(var38); // L: 7536
					if (var13.interactType != 0) { // L: 7537
						Client.collisionMaps[var0].method3470(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7539
					GameBuild.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7540
					GameBuild.scene.removeGameObject(var0, var2, var3); // L: 7541
					var13 = KitDefinition.getObjectDefinition(var38); // L: 7542
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7543
						return;
					}

					if (var13.interactType != 0) { // L: 7544
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7546
					GameBuild.scene.removeFloorDecoration(var0, var2, var3); // L: 7547
					var13 = KitDefinition.getObjectDefinition(var38); // L: 7548
					if (var13.interactType == 1) { // L: 7549
						Client.collisionMaps[var0].method3479(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7552
				var12 = var0; // L: 7553
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7554
					var12 = var0 + 1;
				}

				Scene var41 = GameBuild.scene; // L: 7555
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 7556
				ObjectComposition var15 = KitDefinition.getObjectDefinition(var4); // L: 7558
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 7561
					var16 = var15.sizeX; // L: 7566
					var17 = var15.sizeY; // L: 7567
				} else {
					var16 = var15.sizeY; // L: 7562
					var17 = var15.sizeX; // L: 7563
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 7573
					var18 = (var16 >> 1) + var2; // L: 7574
					var19 = var2 + (var16 + 1 >> 1); // L: 7575
				} else {
					var18 = var2; // L: 7578
					var19 = var2 + 1; // L: 7579
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 7581
					var20 = var3 + (var17 >> 1); // L: 7582
					var21 = var3 + (var17 + 1 >> 1); // L: 7583
				} else {
					var20 = var3; // L: 7586
					var21 = var3 + 1; // L: 7587
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 7589
				int var23 = var22[var19][var21] + var22[var18][var20] + var22[var19][var20] + var22[var18][var21] >> 2; // L: 7590
				int var24 = (var2 << 7) + (var16 << 6); // L: 7591
				int var25 = (var3 << 7) + (var17 << 6); // L: 7592
				long var26 = PacketBuffer.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 7593
				int var28 = (var5 << 6) + var6; // L: 7594
				if (var15.int3 == 1) { // L: 7595
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 7596
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7598
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7599
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 7600
					if (var15.interactType == 1) { // L: 7601
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 7604
					if (var6 >= 12) { // L: 7612
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7614
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7615
						}

						var41.method4289(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7616
						if (var15.interactType != 0) { // L: 7617
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 7620
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7622
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7623
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field964[var5], 0, var26, var28); // L: 7624
						if (var15.interactType != 0) { // L: 7625
							var14.method3465(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 7628
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7630
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7631
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field967[var5], 0, var26, var28); // L: 7632
						if (var15.interactType != 0) { // L: 7633
							var14.method3465(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 7636
							var29 = var5 + 1 & 3; // L: 7637
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7640
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 7641
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 7642
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7645
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7646
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field964[var5], Tiles.field964[var29], var26, var28); // L: 7648
							if (var15.interactType != 0) { // L: 7649
								var14.method3465(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 7652
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7654
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7655
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field967[var5], 0, var26, var28); // L: 7656
							if (var15.interactType != 0) { // L: 7657
								var14.method3465(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 7660
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7662
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7663
							}

							var41.method4289(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7664
							if (var15.interactType != 0) { // L: 7665
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 7668
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7670
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7671
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field964[var5], 0, 0, 0, var26, var28); // L: 7672
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 7675
								var29 = 16; // L: 7676
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7677
								if (0L != var30) { // L: 7678
									var29 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7680
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7681
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field964[var5], 0, var29 * Tiles.field966[var5], var29 * Tiles.field960[var5], var26, var28); // L: 7682
							} else if (var6 == 6) { // L: 7685
								var29 = 8; // L: 7686
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7687
								if (0L != var30) { // L: 7688
									var29 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7690
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7691
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field957[var5], var29 * Tiles.field970[var5], var26, var28); // L: 7692
							} else if (var6 == 7) { // L: 7695
								int var35 = var5 + 2 & 3; // L: 7697
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7698
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7699
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 7700
							} else if (var6 == 8) { // L: 7703
								var29 = 8; // L: 7704
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7705
								if (var30 != 0L) { // L: 7706
									var29 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 7709
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7710
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 7711
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 7712
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7715
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7716
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field957[var5], var29 * Tiles.field970[var5], var26, var28); // L: 7718
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7606
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7607
					}

					if (var36 != null) { // L: 7608
						var41.method4289(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 7609
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 7723
}
