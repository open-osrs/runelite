import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("gx")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("o")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("c")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("e")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;IZI)V",
		garbageValue = "1129445653"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZI)V",
		garbageValue = "1182006206"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method6583(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IIIIIIB)V",
		garbageValue = "-20"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 126
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 127

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 129
				if (var7 == 0) { // L: 130
					if (var1 == 0) { // L: 131
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 132
						int var11 = var2 + var4 + 932731; // L: 135
						int var12 = var3 + var5 + 556238; // L: 136
						int var13 = Skeleton.method3920(var11 + 45365, var12 + 91923, 4) - 128 + (Skeleton.method3920(10294 + var11, 37821 + var12, 2) - 128 >> 1) + (Skeleton.method3920(var11, var12, 1) - 128 >> 2); // L: 138
						var13 = (int)((double)var13 * 0.3D) + 35; // L: 139
						if (var13 < 10) { // L: 140
							var13 = 10;
						} else if (var13 > 60) { // L: 141
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 144
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 146
					}
					break;
				}

				if (var7 == 1) { // L: 149
					int var8 = var0.readUnsignedByte(); // L: 150
					if (var8 == 1) { // L: 151
						var8 = 0;
					}

					if (var1 == 0) { // L: 152
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 153
					}
					break;
				}

				if (var7 <= 49) { // L: 156
					class253.field3130[var1][var2][var3] = var0.readByte(); // L: 157
					class20.field182[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 158
					DirectByteArrayCopier.field3128[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 159
				} else if (var7 <= 81) { // L: 162
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 163
				} else {
					Tiles.field1120[var1][var2][var3] = (byte)(var7 - 81); // L: 166
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 171
				if (var7 == 0) { // L: 172
					break;
				}

				if (var7 == 1) { // L: 173
					var0.readUnsignedByte(); // L: 174
					break;
				}

				if (var7 <= 49) { // L: 177
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 180

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method3708() {
		TextureProvider.method4142(false); // L: 5242
		Client.field694 = 0; // L: 5243
		boolean var0 = true; // L: 5244

		int var1;
		for (var1 = 0; var1 < class18.regionLandArchives.length; ++var1) { // L: 5245
			if (class16.regionMapArchiveIds[var1] != -1 && class18.regionLandArchives[var1] == null) { // L: 5246 5247
				class18.regionLandArchives[var1] = class247.archive5.takeFile(class16.regionMapArchiveIds[var1], 0); // L: 5248
				if (class18.regionLandArchives[var1] == null) { // L: 5249
					var0 = false; // L: 5250
					++Client.field694; // L: 5251
				}
			}

			if (class24.regionLandArchiveIds[var1] != -1 && class82.regionMapArchives[var1] == null) { // L: 5255 5256
				class82.regionMapArchives[var1] = class247.archive5.takeFileEncrypted(class24.regionLandArchiveIds[var1], 0, xteaKeys[var1]); // L: 5257
				if (class82.regionMapArchives[var1] == null) { // L: 5258
					var0 = false; // L: 5259
					++Client.field694; // L: 5260
				}
			}
		}

		if (!var0) { // L: 5265
			Client.field698 = 1; // L: 5266
		} else {
			Client.field696 = 0; // L: 5269
			var0 = true; // L: 5270

			int var3;
			int var4;
			int var9;
			int var10;
			int var11;
			int var14;
			int var15;
			int var16;
			int var17;
			Buffer var34;
			int var35;
			int var36;
			for (var1 = 0; var1 < class18.regionLandArchives.length; ++var1) { // L: 5271
				byte[] var39 = class82.regionMapArchives[var1]; // L: 5272
				if (var39 != null) { // L: 5273
					var3 = (PlayerComposition.regions[var1] >> 8) * 64 - VertexNormal.baseX; // L: 5274
					var4 = (PlayerComposition.regions[var1] & 255) * 64 - SoundSystem.baseY; // L: 5275
					if (Client.isInInstance) { // L: 5276
						var3 = 10; // L: 5277
						var4 = 10; // L: 5278
					}

					boolean var7 = true; // L: 5283
					var34 = new Buffer(var39); // L: 5284
					var9 = -1; // L: 5285

					label594:
					while (true) {
						var10 = var34.method6560(); // L: 5287
						if (var10 == 0) { // L: 5288
							var0 &= var7; // L: 5321
							break;
						}

						var9 += var10; // L: 5289
						var11 = 0; // L: 5290
						boolean var12 = false; // L: 5291

						while (true) {
							while (!var12) { // L: 5293
								var35 = var34.readUShortSmart(); // L: 5299
								if (var35 == 0) { // L: 5300
									continue label594;
								}

								var11 += var35 - 1; // L: 5301
								var14 = var11 & 63; // L: 5302
								var15 = var11 >> 6 & 63; // L: 5303
								var16 = var34.readUnsignedByte() >> 2; // L: 5304
								var17 = var15 + var3; // L: 5305
								var36 = var4 + var14; // L: 5306
								if (var17 > 0 && var36 > 0 && var17 < 103 && var36 < 103) { // L: 5307
									ObjectComposition var31 = class23.getObjectDefinition(var9); // L: 5308
									if (var16 != 22 || !Client.isLowDetail || var31.int1 != 0 || var31.interactType == 1 || var31.boolean2) { // L: 5309
										if (!var31.needsModelFiles()) { // L: 5310
											++Client.field696; // L: 5311
											var7 = false; // L: 5312
										}

										var12 = true; // L: 5314
									}
								}
							}

							var35 = var34.readUShortSmart(); // L: 5294
							if (var35 == 0) { // L: 5295
								break;
							}

							var34.readUnsignedByte(); // L: 5296
						}
					}
				}
			}

			if (!var0) { // L: 5324
				Client.field698 = 2; // L: 5325
			} else {
				if (Client.field698 != 0) { // L: 5328
					DirectByteArrayCopier.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				HealthBarUpdate.playPcmPlayers(); // L: 5329
				AbstractSocket.scene.clear(); // L: 5330

				for (var1 = 0; var1 < 4; ++var1) { // L: 5331
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5332
					for (var2 = 0; var2 < 104; ++var2) { // L: 5333
						for (var3 = 0; var3 < 104; ++var3) { // L: 5334
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5335
						}
					}
				}

				HealthBarUpdate.playPcmPlayers(); // L: 5339
				class34.method327(); // L: 5340
				var1 = class18.regionLandArchives.length; // L: 5341
				WorldMapSprite.method3631(); // L: 5342
				TextureProvider.method4142(true); // L: 5343
				int var5;
				int var19;
				int var20;
				int var21;
				int var42;
				if (!Client.isInInstance) { // L: 5344
					byte[] var38;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5345
						var3 = (PlayerComposition.regions[var2] >> 8) * 64 - VertexNormal.baseX; // L: 5346
						var4 = (PlayerComposition.regions[var2] & 255) * 64 - SoundSystem.baseY; // L: 5347
						var38 = class18.regionLandArchives[var2]; // L: 5348
						if (var38 != null) { // L: 5349
							HealthBarUpdate.playPcmPlayers(); // L: 5350
							WorldMapLabel.method3632(var38, var3, var4, GrandExchangeOfferOwnWorldComparator.field632 * 8 - 48, UserComparator4.field1427 * 8 - 48, Client.collisionMaps); // L: 5351
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5354
						var3 = (PlayerComposition.regions[var2] >> 8) * 64 - VertexNormal.baseX; // L: 5355
						var4 = (PlayerComposition.regions[var2] & 255) * 64 - SoundSystem.baseY; // L: 5356
						var38 = class18.regionLandArchives[var2]; // L: 5357
						if (var38 == null && UserComparator4.field1427 < 800) { // L: 5358
							HealthBarUpdate.playPcmPlayers(); // L: 5359
							ItemComposition.method3085(var3, var4, 64, 64); // L: 5360
						}
					}

					TextureProvider.method4142(true); // L: 5363

					for (var2 = 0; var2 < var1; ++var2) { // L: 5364
						byte[] var30 = class82.regionMapArchives[var2]; // L: 5365
						if (var30 != null) { // L: 5366
							var4 = (PlayerComposition.regions[var2] >> 8) * 64 - VertexNormal.baseX; // L: 5367
							var5 = (PlayerComposition.regions[var2] & 255) * 64 - SoundSystem.baseY; // L: 5368
							HealthBarUpdate.playPcmPlayers(); // L: 5369
							Scene var32 = AbstractSocket.scene; // L: 5370
							CollisionMap[] var33 = Client.collisionMaps; // L: 5371
							var34 = new Buffer(var30); // L: 5373
							var9 = -1; // L: 5374

							while (true) {
								var10 = var34.method6560(); // L: 5376
								if (var10 == 0) { // L: 5377
									break;
								}

								var9 += var10; // L: 5378
								var11 = 0; // L: 5379

								while (true) {
									var42 = var34.readUShortSmart(); // L: 5381
									if (var42 == 0) { // L: 5382
										break;
									}

									var11 += var42 - 1; // L: 5383
									var35 = var11 & 63; // L: 5384
									var14 = var11 >> 6 & 63; // L: 5385
									var15 = var11 >> 12; // L: 5386
									var16 = var34.readUnsignedByte(); // L: 5387
									var17 = var16 >> 2; // L: 5388
									var36 = var16 & 3; // L: 5389
									var19 = var4 + var14; // L: 5390
									var20 = var5 + var35; // L: 5391
									if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) { // L: 5392
										var21 = var15; // L: 5393
										if ((Tiles.Tiles_renderFlags[1][var19][var20] & 2) == 2) { // L: 5394
											var21 = var15 - 1;
										}

										CollisionMap var37 = null; // L: 5395
										if (var21 >= 0) { // L: 5396
											var37 = var33[var21];
										}

										ClanChannelMember.method89(var15, var19, var20, var9, var36, var17, var32, var37); // L: 5397
									}
								}
							}
						}
					}
				}

				int var6;
				int var8;
				int var41;
				if (Client.isInInstance) { // L: 5405
					for (var2 = 0; var2 < 4; ++var2) { // L: 5406
						HealthBarUpdate.playPcmPlayers(); // L: 5407

						for (var3 = 0; var3 < 13; ++var3) { // L: 5408
							for (var4 = 0; var4 < 13; ++var4) { // L: 5409
								boolean var40 = false; // L: 5410
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5411
								if (var6 != -1) { // L: 5412
									var41 = var6 >> 24 & 3; // L: 5413
									var8 = var6 >> 1 & 3; // L: 5414
									var9 = var6 >> 14 & 1023; // L: 5415
									var10 = var6 >> 3 & 2047; // L: 5416
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5417

									for (var42 = 0; var42 < PlayerComposition.regions.length; ++var42) { // L: 5418
										if (PlayerComposition.regions[var42] == var11 && class18.regionLandArchives[var42] != null) { // L: 5419
											byte[] var13 = class18.regionLandArchives[var42]; // L: 5420
											var14 = var3 * 8; // L: 5421
											var15 = var4 * 8; // L: 5422
											var16 = (var9 & 7) * 8; // L: 5423
											var17 = (var10 & 7) * 8; // L: 5424
											CollisionMap[] var18 = Client.collisionMaps; // L: 5425

											for (var19 = 0; var19 < 8; ++var19) { // L: 5427
												for (var20 = 0; var20 < 8; ++var20) { // L: 5428
													if (var14 + var19 > 0 && var14 + var19 < 103 && var15 + var20 > 0 && var20 + var15 < 103) { // L: 5429
														int[] var10000 = var18[var2].flags[var19 + var14];
														var10000[var20 + var15] &= -16777217;
													}
												}
											}

											Buffer var45 = new Buffer(var13); // L: 5432

											for (var20 = 0; var20 < 4; ++var20) { // L: 5433
												for (var21 = 0; var21 < 64; ++var21) { // L: 5434
													for (int var22 = 0; var22 < 64; ++var22) { // L: 5435
														if (var41 == var20 && var21 >= var16 && var21 < var16 + 8 && var22 >= var17 && var22 < var17 + 8) { // L: 5436
															int var27 = var21 & 7; // L: 5441
															int var28 = var22 & 7; // L: 5442
															int var29 = var8 & 3; // L: 5445
															int var26;
															if (var29 == 0) { // L: 5446
																var26 = var27; // L: 5447
															} else if (var29 == 1) { // L: 5450
																var26 = var28; // L: 5451
															} else if (var29 == 2) { // L: 5454
																var26 = 7 - var27; // L: 5455
															} else {
																var26 = 7 - var28; // L: 5458
															}

															loadTerrain(var45, var2, var26 + var14, var15 + ClanChannelMember.method86(var21 & 7, var22 & 7, var8), 0, 0, var8); // L: 5460
														} else {
															loadTerrain(var45, 0, -1, -1, 0, 0, 0); // L: 5462
														}
													}
												}
											}

											var40 = true; // L: 5467
											break;
										}
									}
								}

								if (!var40) { // L: 5472
									MouseRecorder.method2099(var2, var3 * 8, var4 * 8); // L: 5473
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5478
						for (var3 = 0; var3 < 13; ++var3) { // L: 5479
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5480
							if (var4 == -1) { // L: 5481
								ItemComposition.method3085(var2 * 8, var3 * 8, 8, 8); // L: 5482
							}
						}
					}

					TextureProvider.method4142(true); // L: 5486

					for (var2 = 0; var2 < 4; ++var2) { // L: 5487
						HealthBarUpdate.playPcmPlayers(); // L: 5488

						for (var3 = 0; var3 < 13; ++var3) { // L: 5489
							for (var4 = 0; var4 < 13; ++var4) { // L: 5490
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5491
								if (var5 != -1) { // L: 5492
									var6 = var5 >> 24 & 3; // L: 5493
									var41 = var5 >> 1 & 3; // L: 5494
									var8 = var5 >> 14 & 1023; // L: 5495
									var9 = var5 >> 3 & 2047; // L: 5496
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5497

									for (var11 = 0; var11 < PlayerComposition.regions.length; ++var11) { // L: 5498
										if (PlayerComposition.regions[var11] == var10 && class82.regionMapArchives[var11] != null) { // L: 5499
											FontName.method6296(class82.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var41, AbstractSocket.scene, Client.collisionMaps); // L: 5500
											break; // L: 5501
										}
									}
								}
							}
						}
					}
				}

				TextureProvider.method4142(true); // L: 5509
				HealthBarUpdate.playPcmPlayers(); // L: 5510
				class17.method210(AbstractSocket.scene, Client.collisionMaps); // L: 5511
				TextureProvider.method4142(true); // L: 5512
				var2 = Tiles.Tiles_minPlane; // L: 5513
				if (var2 > class22.Client_plane) { // L: 5514
					var2 = class22.Client_plane;
				}

				if (var2 < class22.Client_plane - 1) { // L: 5515
					var2 = class22.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5516
					AbstractSocket.scene.init(Tiles.Tiles_minPlane);
				} else {
					AbstractSocket.scene.init(0); // L: 5517
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5518
					for (var4 = 0; var4 < 104; ++var4) { // L: 5519
						ClanSettings.updateItemPile(var3, var4); // L: 5520
					}
				}

				HealthBarUpdate.playPcmPlayers(); // L: 5523

				for (PendingSpawn var43 = (PendingSpawn)Client.pendingSpawns.last(); var43 != null; var43 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5525 5526 5532
					if (var43.hitpoints == -1) { // L: 5527
						var43.delay = 0; // L: 5528
						UserComparator5.method2448(var43); // L: 5529
					} else {
						var43.remove(); // L: 5531
					}
				}

				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5535
				PacketBufferNode var44;
				if (class23.client.hasFrame()) { // L: 5536
					var44 = class21.getPacketBufferNode(ClientPacket.field2583, Client.packetWriter.isaacCipher); // L: 5538
					var44.packetBuffer.writeInt(1057001181); // L: 5539
					Client.packetWriter.addNode(var44); // L: 5540
				}

				if (!Client.isInInstance) { // L: 5542
					var3 = (GrandExchangeOfferOwnWorldComparator.field632 - 6) / 8; // L: 5543
					var4 = (GrandExchangeOfferOwnWorldComparator.field632 + 6) / 8; // L: 5544
					var5 = (UserComparator4.field1427 - 6) / 8; // L: 5545
					var6 = (UserComparator4.field1427 + 6) / 8; // L: 5546

					for (var41 = var3 - 1; var41 <= var4 + 1; ++var41) { // L: 5547
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5548
							if (var41 < var3 || var41 > var4 || var8 < var5 || var8 > var6) { // L: 5549
								class247.archive5.loadRegionFromName("m" + var41 + "_" + var8); // L: 5550
								class247.archive5.loadRegionFromName("l" + var41 + "_" + var8); // L: 5551
							}
						}
					}
				}

				class12.updateGameState(30); // L: 5555
				HealthBarUpdate.playPcmPlayers(); // L: 5556
				class34.method328(); // L: 5557
				var44 = class21.getPacketBufferNode(ClientPacket.field2669, Client.packetWriter.isaacCipher); // L: 5558
				Client.packetWriter.addNode(var44); // L: 5559
				GameEngine.clock.mark(); // L: 5561

				for (var4 = 0; var4 < 32; ++var4) { // L: 5562
					GameEngine.graphicsTickTimes[var4] = 0L;
				}

				for (var4 = 0; var4 < 32; ++var4) { // L: 5563
					GameEngine.clientTickTimes[var4] = 0L;
				}

				class260.gameCyclesToDo = 0; // L: 5564
			}
		}
	} // L: 5267 5326 5566
}
