import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class92 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1870975217
	)
	int field1221;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -495972343
	)
	int field1225;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -291445799
	)
	int field1222;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1837112375
	)
	int field1223;

	class92(int var1, int var2, int var3, int var4) {
		this.field1221 = var1; // L: 10
		this.field1225 = var2; // L: 11
		this.field1222 = var3; // L: 12
		this.field1223 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-86"
	)
	int method2277() {
		return this.field1221; // L: 17
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "505053484"
	)
	int method2279() {
		return this.field1225; // L: 21
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-72606993"
	)
	int method2278() {
		return this.field1222; // L: 25
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-421666283"
	)
	int method2281() {
		return this.field1223; // L: 29
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lib;",
		garbageValue = "1939473389"
	)
	public static PacketBufferNode method2296() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILhf;Lfq;B)V",
		garbageValue = "1"
	)
	static final void method2276(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 289 290 291
			if (var0 < Tiles.Tiles_minPlane) { // L: 294
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = KitDefinition.getObjectDefinition(var3); // L: 295
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 298
				var9 = var8.sizeX; // L: 303
				var10 = var8.sizeY; // L: 304
			} else {
				var9 = var8.sizeY; // L: 299
				var10 = var8.sizeX; // L: 300
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 310
				var11 = (var9 >> 1) + var1; // L: 311
				var12 = (var9 + 1 >> 1) + var1; // L: 312
			} else {
				var11 = var1; // L: 315
				var12 = var1 + 1; // L: 316
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 318
				var13 = (var10 >> 1) + var2; // L: 319
				var14 = var2 + (var10 + 1 >> 1); // L: 320
			} else {
				var13 = var2; // L: 323
				var14 = var2 + 1; // L: 324
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 326
			int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 327
			int var17 = (var1 << 7) + (var9 << 6); // L: 328
			int var18 = (var2 << 7) + (var10 << 6); // L: 329
			long var19 = PacketBuffer.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 330
			int var21 = var5 + (var4 << 6); // L: 331
			if (var8.int3 == 1) { // L: 332
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 333
				class125.method2635(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 334
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 335
					if (var8.animationId == -1 && var8.transforms == null) { // L: 337
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 338
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 339
					if (var8.interactType == 1 && var7 != null) { // L: 340
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 343
					int[] var10000;
					if (var5 >= 12) { // L: 364
						if (var8.animationId == -1 && var8.transforms == null) { // L: 366
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 367
						}

						var6.method4289(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 368
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 369
							var10000 = Tiles.field962[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 370
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 373
						if (var8.animationId == -1 && var8.transforms == null) { // L: 375
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 376
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field964[var4], 0, var19, var21); // L: 377
						if (var4 == 0) { // L: 378
							if (var8.clipped) { // L: 379
								class54.field419[var0][var1][var2] = 50; // L: 380
								class54.field419[var0][var1][var2 + 1] = 50; // L: 381
							}

							if (var8.modelClipped) { // L: 383
								var10000 = Tiles.field962[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 385
							if (var8.clipped) { // L: 386
								class54.field419[var0][var1][var2 + 1] = 50; // L: 387
								class54.field419[var0][var1 + 1][var2 + 1] = 50; // L: 388
							}

							if (var8.modelClipped) { // L: 390
								var10000 = Tiles.field962[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 392
							if (var8.clipped) { // L: 393
								class54.field419[var0][var1 + 1][var2] = 50; // L: 394
								class54.field419[var0][var1 + 1][var2 + 1] = 50; // L: 395
							}

							if (var8.modelClipped) { // L: 397
								var10000 = Tiles.field962[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 399
							if (var8.clipped) { // L: 400
								class54.field419[var0][var1][var2] = 50; // L: 401
								class54.field419[var0][var1 + 1][var2] = 50; // L: 402
							}

							if (var8.modelClipped) { // L: 404
								var10000 = Tiles.field962[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 406
							var7.method3465(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 407
							var6.method4387(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 410
						if (var8.animationId == -1 && var8.transforms == null) { // L: 412
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 413
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field967[var4], 0, var19, var21); // L: 414
						if (var8.clipped) { // L: 415
							if (var4 == 0) { // L: 416
								class54.field419[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 417
								class54.field419[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 418
								class54.field419[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 419
								class54.field419[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 421
							var7.method3465(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 424
							var22 = var4 + 1 & 3; // L: 425
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 428
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 429
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 430
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 433
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 434
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field964[var4], Tiles.field964[var22], var19, var21); // L: 436
							if (var8.modelClipped) { // L: 437
								if (var4 == 0) { // L: 438
									var10000 = Tiles.field962[var0][var1]; // L: 439
									var10000[var2] |= 585;
									var10000 = Tiles.field962[var0][var1]; // L: 440
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 442
									var10000 = Tiles.field962[var0][var1]; // L: 443
									var10000[1 + var2] |= 1170;
									var10000 = Tiles.field962[var0][var1 + 1]; // L: 444
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 446
									var10000 = Tiles.field962[var0][var1 + 1]; // L: 447
									var10000[var2] |= 585;
									var10000 = Tiles.field962[var0][var1]; // L: 448
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 450
									var10000 = Tiles.field962[var0][var1]; // L: 451
									var10000[var2] |= 1170;
									var10000 = Tiles.field962[var0][var1]; // L: 452
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 455
								var7.method3465(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 456
								var6.method4387(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 459
							if (var8.animationId == -1 && var8.transforms == null) { // L: 461
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 462
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field967[var4], 0, var19, var21); // L: 463
							if (var8.clipped) { // L: 464
								if (var4 == 0) { // L: 465
									class54.field419[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 466
									class54.field419[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 467
									class54.field419[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 468
									class54.field419[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 470
								var7.method3465(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 473
							if (var8.animationId == -1 && var8.transforms == null) { // L: 475
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 476
							}

							var6.method4289(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 477
							if (var8.interactType != 0 && var7 != null) { // L: 478
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 479
								var6.method4387(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 482
							if (var8.animationId == -1 && var8.transforms == null) { // L: 484
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 485
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field964[var4], 0, 0, 0, var19, var21); // L: 486
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 489
								var22 = 16; // L: 490
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 491
								if (var23 != 0L) { // L: 492
									var22 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 494
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 495
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field964[var4], 0, var22 * Tiles.field966[var4], var22 * Tiles.field960[var4], var19, var21); // L: 496
							} else if (var5 == 6) { // L: 499
								var22 = 8; // L: 500
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 501
								if (var23 != 0L) { // L: 502
									var22 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 504
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 505
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field957[var4], var22 * Tiles.field970[var4], var19, var21); // L: 506
							} else if (var5 == 7) { // L: 509
								var28 = var4 + 2 & 3; // L: 511
								if (var8.animationId == -1 && var8.transforms == null) { // L: 512
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 513
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 514
							} else if (var5 == 8) { // L: 517
								var22 = 8; // L: 518
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 519
								if (var23 != 0L) { // L: 520
									var22 = KitDefinition.getObjectDefinition(class21.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 523
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 524
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 525
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 526
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 529
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 530
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field957[var4], var22 * Tiles.field970[var4], var19, var21); // L: 532
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 345
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 346
					}

					if (var29 != null && var6.method4289(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 347 348
						var28 = 15; // L: 349
						if (var29 instanceof Model) { // L: 350
							var28 = ((Model)var29).method4536() / 4; // L: 351
							if (var28 > 30) { // L: 352
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 354
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 355
								if (var28 > class54.field419[var0][var31 + var1][var32 + var2]) { // L: 356
									class54.field419[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 361
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 341 362 371 408 422 457 471 480 487 497 507 515 533 535

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "501467112"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2761, Client.packetWriter.isaacCipher); // L: 9149
		var2.packetBuffer.method7010(var0); // L: 9150
		var2.packetBuffer.writeShort(var1); // L: 9151
		Client.packetWriter.addNode(var2); // L: 9152
	} // L: 9153

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "2117649416"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		GameEngine.scrollBarSprites[0].drawAt(var0, var1); // L: 10326
		GameEngine.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10327
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field628); // L: 10328
		int var5 = var3 * (var3 - 32) / var4; // L: 10329
		if (var5 < 8) { // L: 10330
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10331
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field534); // L: 10332
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field506); // L: 10333
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field506); // L: 10334
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field506); // L: 10335
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field506); // L: 10336
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field535); // L: 10337
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field535); // L: 10338
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field535); // L: 10339
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field535); // L: 10340
	} // L: 10341
}
