import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -305616951
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1125441395
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("d")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("c")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 744
		this.height = var2; // L: 745
		this.xWidths = var3; // L: 746
		this.xStarts = var4; // L: 747
	} // L: 748

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-290220203"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 751
			int var3 = this.xStarts[var2]; // L: 752
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 753
				return true;
			}
		}

		return false; // L: 755
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "55"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7316
			if (Client.isLowDetail && var0 != class90.Client_plane) { // L: 7317
				return;
			}

			long var7 = 0L; // L: 7318
			boolean var9 = true; // L: 7319
			boolean var10 = false; // L: 7320
			boolean var11 = false; // L: 7321
			if (var1 == 0) { // L: 7322
				var7 = MilliClock.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7323
				var7 = MilliClock.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7324
				var7 = MilliClock.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7325
				var7 = MilliClock.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (0L != var7) { // L: 7326
				var12 = MilliClock.scene.getObjectFlags(var0, var2, var3, var7); // L: 7327
				int var38 = class25.Entity_unpackID(var7); // L: 7328
				int var39 = var12 & 31; // L: 7329
				int var40 = var12 >> 6 & 3; // L: 7330
				ObjectComposition var13;
				if (var1 == 0) { // L: 7331
					MilliClock.scene.removeBoundaryObject(var0, var2, var3); // L: 7332
					var13 = WorldMapAreaData.getObjectDefinition(var38); // L: 7333
					if (var13.interactType != 0) { // L: 7334
						Client.collisionMaps[var0].method3755(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7336
					MilliClock.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7337
					MilliClock.scene.removeGameObject(var0, var2, var3); // L: 7338
					var13 = WorldMapAreaData.getObjectDefinition(var38); // L: 7339
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7340
						return;
					}

					if (var13.interactType != 0) { // L: 7341
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7343
					MilliClock.scene.removeFloorDecoration(var0, var2, var3); // L: 7344
					var13 = WorldMapAreaData.getObjectDefinition(var38); // L: 7345
					if (var13.interactType == 1) { // L: 7346
						Client.collisionMaps[var0].method3758(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7349
				var12 = var0; // L: 7350
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7351
					var12 = var0 + 1;
				}

				Scene var41 = MilliClock.scene; // L: 7352
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 7353
				ObjectComposition var15 = WorldMapAreaData.getObjectDefinition(var4); // L: 7355
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 7358
					var16 = var15.sizeX; // L: 7363
					var17 = var15.sizeY; // L: 7364
				} else {
					var16 = var15.sizeY; // L: 7359
					var17 = var15.sizeX; // L: 7360
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 7370
					var18 = (var16 >> 1) + var2; // L: 7371
					var19 = var2 + (var16 + 1 >> 1); // L: 7372
				} else {
					var18 = var2; // L: 7375
					var19 = var2 + 1; // L: 7376
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 7378
					var20 = var3 + (var17 >> 1); // L: 7379
					var21 = var3 + (var17 + 1 >> 1); // L: 7380
				} else {
					var20 = var3; // L: 7383
					var21 = var3 + 1; // L: 7384
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 7386
				int var23 = var22[var19][var21] + var22[var18][var21] + var22[var19][var20] + var22[var18][var20] >> 2; // L: 7387
				int var24 = (var2 << 7) + (var16 << 6); // L: 7388
				int var25 = (var3 << 7) + (var17 << 6); // L: 7389
				long var26 = TextureProvider.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 7390
				int var28 = (var5 << 6) + var6; // L: 7391
				if (var15.int3 == 1) { // L: 7392
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 7393
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7395
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7396
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 7397
					if (var15.interactType == 1) { // L: 7398
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 7401
					if (var6 >= 12) { // L: 7409
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7411
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7412
						}

						var41.method3400(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7413
						if (var15.interactType != 0) { // L: 7414
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 7417
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7419
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7420
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field521[var5], 0, var26, var28); // L: 7421
						if (var15.interactType != 0) { // L: 7422
							var14.method3749(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 7425
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(1, var5, var22, var24, var23, var25); // L: 7427
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7428
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field514[var5], 0, var26, var28); // L: 7429
						if (var15.interactType != 0) { // L: 7430
							var14.method3749(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 7433
							var29 = var5 + 1 & 3; // L: 7434
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7437
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 7438
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 7439
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7442
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7443
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field521[var5], Tiles.field521[var29], var26, var28); // L: 7445
							if (var15.interactType != 0) { // L: 7446
								var14.method3749(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 7449
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7451
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7452
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field514[var5], 0, var26, var28); // L: 7453
							if (var15.interactType != 0) { // L: 7454
								var14.method3749(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 7457
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7459
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7460
							}

							var41.method3400(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7461
							if (var15.interactType != 0) { // L: 7462
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 7465
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7467
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7468
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field521[var5], 0, 0, 0, var26, var28); // L: 7469
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 7472
								var29 = 16; // L: 7473
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7474
								if (0L != var30) { // L: 7475
									var29 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7477
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7478
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field521[var5], 0, var29 * Tiles.field523[var5], var29 * Tiles.field527[var5], var26, var28); // L: 7479
							} else if (var6 == 6) { // L: 7482
								var29 = 8; // L: 7483
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7484
								if (var30 != 0L) { // L: 7485
									var29 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7487
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7488
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field525[var5], var29 * Tiles.field526[var5], var26, var28); // L: 7489
							} else if (var6 == 7) { // L: 7492
								int var35 = var5 + 2 & 3; // L: 7494
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7495
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7496
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 7497
							} else if (var6 == 8) { // L: 7500
								var29 = 8; // L: 7501
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7502
								if (var30 != 0L) { // L: 7503
									var29 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 7506
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7507
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 7508
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 7509
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7512
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7513
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field525[var5], var29 * Tiles.field526[var5], var26, var28); // L: 7515
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7403
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null); // L: 7404
					}

					if (var36 != null) { // L: 7405
						var41.method3400(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 7406
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 7520

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(ZLkd;B)V",
		garbageValue = "100"
	)
	static final void method4174(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7755
				int var2 = var1.readBits(15); // L: 7756
				if (var2 != 32767) { // L: 7757
					boolean var3 = false; // L: 7758
					if (Client.npcs[var2] == null) { // L: 7759
						Client.npcs[var2] = new NPC(); // L: 7760
						var3 = true; // L: 7761
					}

					NPC var4 = Client.npcs[var2]; // L: 7763
					Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7764
					var4.npcCycle = Client.cycle; // L: 7765
					int var5;
					if (var0) { // L: 7767
						var5 = var1.readBits(8); // L: 7768
						if (var5 > 127) { // L: 7769
							var5 -= 256;
						}
					} else {
						var5 = var1.readBits(5); // L: 7772
						if (var5 > 15) { // L: 7773
							var5 -= 32;
						}
					}

					var4.definition = class90.getNpcDefinition(var1.readBits(14)); // L: 7775
					int var6 = Client.defaultRotations[var1.readBits(3)]; // L: 7776
					if (var3) { // L: 7777
						var4.orientation = var4.rotation = var6;
					}

					int var7 = var1.readBits(1); // L: 7778
					if (var7 == 1) { // L: 7779
						Client.field697[++Client.field725 - 1] = var2;
					}

					int var8 = var1.readBits(1); // L: 7780
					int var9;
					if (var0) { // L: 7782
						var9 = var1.readBits(8); // L: 7783
						if (var9 > 127) { // L: 7784
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 7787
						if (var9 > 15) { // L: 7788
							var9 -= 32;
						}
					}

					var4.field1007 = var4.definition.size; // L: 7790
					var4.field1006 = var4.definition.rotation; // L: 7791
					if (var4.field1006 == 0) { // L: 7792
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence; // L: 7793
					var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7794
					var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7795
					var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7796
					var4.idleSequence = var4.definition.idleSequence; // L: 7797
					var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7798
					var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7799
					var4.method2181(UserComparator9.localPlayer.pathX[0] + var5, UserComparator9.localPlayer.pathY[0] + var9, var8 == 1); // L: 7800
					continue; // L: 7801
				}
			}

			var1.exportIndex(); // L: 7802
			return; // L: 7803
		}
	}
}
