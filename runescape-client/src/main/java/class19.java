import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class19 {
	@ObfuscatedName("o")
	Future field102;
	@ObfuscatedName("q")
	String field99;

	class19(Future var1) {
		this.field102 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method266(var1); // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1815687689"
	)
	void method266(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field99 = var1; // L: 19
		if (this.field102 != null) { // L: 20
			this.field102.cancel(true); // L: 21
			this.field102 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "124"
	)
	public final String method251() {
		return this.field99; // L: 27
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "945569393"
	)
	public boolean method250() {
		return this.field99 != null || this.field102 == null; // L: 31
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2011901158"
	)
	public final boolean method253() {
		return this.method250() ? true : this.field102.isDone(); // L: 35 36
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Ld;",
		garbageValue = "-37"
	)
	public final class21 method254() {
		if (this.method250()) { // L: 40
			return new class21(this.field99);
		} else if (!this.method253()) {
			return null; // L: 41
		} else {
			try {
				return (class21)this.field102.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method266(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "20278847"
	)
	public static boolean method257(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field132[var0] : false; // L: 237 238
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgm;Lgh;B)V",
		garbageValue = "14"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 345 346 347
			if (var0 < Tiles.Tiles_minPlane) { // L: 350
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class82.getObjectDefinition(var3); // L: 351
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 354
				var9 = var8.sizeX; // L: 359
				var10 = var8.sizeY; // L: 360
			} else {
				var9 = var8.sizeY; // L: 355
				var10 = var8.sizeX; // L: 356
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 366
				var11 = (var9 >> 1) + var1; // L: 367
				var12 = (var9 + 1 >> 1) + var1; // L: 368
			} else {
				var11 = var1; // L: 371
				var12 = var1 + 1; // L: 372
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 374
				var13 = (var10 >> 1) + var2; // L: 375
				var14 = var2 + (var10 + 1 >> 1); // L: 376
			} else {
				var13 = var2; // L: 379
				var14 = var2 + 1; // L: 380
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 382
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2; // L: 383
			int var17 = (var1 << 7) + (var9 << 6); // L: 384
			int var18 = (var2 << 7) + (var10 << 6); // L: 385
			long var19 = VarbitComposition.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 386
			int var21 = var5 + (var4 << 6); // L: 387
			if (var8.int3 == 1) { // L: 388
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 389
				ObjectSound var22 = new ObjectSound(); // L: 390
				var22.plane = var0; // L: 391
				var22.x = var1 * 128; // L: 392
				var22.y = var2 * 128; // L: 393
				var23 = var8.sizeX; // L: 394
				var24 = var8.sizeY; // L: 395
				if (var4 == 1 || var4 == 3) { // L: 396
					var23 = var8.sizeY; // L: 397
					var24 = var8.sizeX; // L: 398
				}

				var22.maxX = (var23 + var1) * 128; // L: 400
				var22.maxY = (var24 + var2) * 128; // L: 401
				var22.soundEffectId = var8.ambientSoundId; // L: 402
				var22.field817 = var8.int7 * 128; // L: 403
				var22.field813 = var8.int5; // L: 404
				var22.field808 = var8.int6; // L: 405
				var22.soundEffectIds = var8.soundEffectIds; // L: 406
				if (var8.transforms != null) { // L: 407
					var22.obj = var8; // L: 408
					var22.set(); // L: 409
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 411
				if (var22.soundEffectIds != null) { // L: 412
					var22.field810 = var22.field813 + (int)(Math.random() * (double)(var22.field808 - var22.field813));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 414
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 415
					if (var8.animationId == -1 && var8.transforms == null) { // L: 417
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 418
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 419
					if (var8.interactType == 1 && var7 != null) { // L: 420
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 423
				int[] var10000;
				if (var5 >= 12) { // L: 444
					if (var8.animationId == -1 && var8.transforms == null) { // L: 446
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 447
					}

					var6.method4176(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 448
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 449
						var10000 = VerticalAlignment.field1993[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 450
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 453
					if (var8.animationId == -1 && var8.transforms == null) { // L: 455
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 456
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field988[var4], 0, var19, var21); // L: 457
					if (var4 == 0) { // L: 458
						if (var8.clipped) { // L: 459
							NPC.field1259[var0][var1][var2] = 50; // L: 460
							NPC.field1259[var0][var1][var2 + 1] = 50; // L: 461
						}

						if (var8.modelClipped) { // L: 463
							var10000 = VerticalAlignment.field1993[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 465
						if (var8.clipped) { // L: 466
							NPC.field1259[var0][var1][var2 + 1] = 50; // L: 467
							NPC.field1259[var0][var1 + 1][var2 + 1] = 50; // L: 468
						}

						if (var8.modelClipped) { // L: 470
							var10000 = VerticalAlignment.field1993[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) { // L: 472
						if (var8.clipped) { // L: 473
							NPC.field1259[var0][var1 + 1][var2] = 50; // L: 474
							NPC.field1259[var0][var1 + 1][var2 + 1] = 50; // L: 475
						}

						if (var8.modelClipped) { // L: 477
							var10000 = VerticalAlignment.field1993[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 479
						if (var8.clipped) { // L: 480
							NPC.field1259[var0][var1][var2] = 50; // L: 481
							NPC.field1259[var0][var1 + 1][var2] = 50; // L: 482
						}

						if (var8.modelClipped) { // L: 484
							var10000 = VerticalAlignment.field1993[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 486
						var7.method3749(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 487
						var6.method4180(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 490
					if (var8.animationId == -1 && var8.transforms == null) { // L: 492
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 493
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field989[var4], 0, var19, var21); // L: 494
					if (var8.clipped) { // L: 495
						if (var4 == 0) { // L: 496
							NPC.field1259[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 497
							NPC.field1259[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 498
							NPC.field1259[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 499
							NPC.field1259[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 501
						var7.method3749(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 504
						var28 = var4 + 1 & 3; // L: 505
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 508
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 509
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 510
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 513
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 514
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field988[var4], Tiles.field988[var28], var19, var21); // L: 516
						if (var8.modelClipped) { // L: 517
							if (var4 == 0) { // L: 518
								var10000 = VerticalAlignment.field1993[var0][var1]; // L: 519
								var10000[var2] |= 585;
								var10000 = VerticalAlignment.field1993[var0][var1]; // L: 520
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) { // L: 522
								var10000 = VerticalAlignment.field1993[var0][var1]; // L: 523
								var10000[var2 + 1] |= 1170;
								var10000 = VerticalAlignment.field1993[var0][var1 + 1]; // L: 524
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 526
								var10000 = VerticalAlignment.field1993[var0][var1 + 1]; // L: 527
								var10000[var2] |= 585;
								var10000 = VerticalAlignment.field1993[var0][var1]; // L: 528
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 530
								var10000 = VerticalAlignment.field1993[var0][var1]; // L: 531
								var10000[var2] |= 1170;
								var10000 = VerticalAlignment.field1993[var0][var1]; // L: 532
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 535
							var7.method3749(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 536
							var6.method4180(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 539
						if (var8.animationId == -1 && var8.transforms == null) { // L: 541
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 542
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field989[var4], 0, var19, var21); // L: 543
						if (var8.clipped) { // L: 544
							if (var4 == 0) { // L: 545
								NPC.field1259[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 546
								NPC.field1259[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 547
								NPC.field1259[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 548
								NPC.field1259[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 550
							var7.method3749(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 553
						if (var8.animationId == -1 && var8.transforms == null) { // L: 555
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 556
						}

						var6.method4176(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 557
						if (var8.interactType != 0 && var7 != null) { // L: 558
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 559
							var6.method4180(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 562
						if (var8.animationId == -1 && var8.transforms == null) { // L: 564
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 565
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field988[var4], 0, 0, 0, var19, var21); // L: 566
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 569
							var28 = 16; // L: 570
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 571
							if (0L != var29) { // L: 572
								var28 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 574
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 575
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field988[var4], 0, var28 * Tiles.field990[var4], var28 * Tiles.field991[var4], var19, var21); // L: 576
						} else if (var5 == 6) { // L: 579
							var28 = 8; // L: 580
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 581
							if (var29 != 0L) { // L: 582
								var28 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 584
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 585
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field995[var4], var28 * Tiles.field993[var4], var19, var21); // L: 586
						} else if (var5 == 7) { // L: 589
							var23 = var4 + 2 & 3; // L: 591
							if (var8.animationId == -1 && var8.transforms == null) { // L: 592
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 593
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 594
						} else if (var5 == 8) { // L: 597
							var28 = 8; // L: 598
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 599
							if (0L != var29) { // L: 600
								var28 = class82.getObjectDefinition(NetSocket.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 603
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 604
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 605
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 606
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 609
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 610
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field995[var4], var28 * Tiles.field993[var4], var19, var21); // L: 612
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 425
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 426
				}

				if (var34 != null && var6.method4176(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 427 428
					var23 = 15; // L: 429
					if (var34 instanceof Model) { // L: 430
						var23 = ((Model)var34).method4277() / 4; // L: 431
						if (var23 > 30) { // L: 432
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 434
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 435
							if (var23 > NPC.field1259[var0][var24 + var1][var33 + var2]) { // L: 436
								NPC.field1259[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 441
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 421 442 451 488 502 537 551 560 567 577 587 595 613 615

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIIB)V",
		garbageValue = "-23"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		ArchiveLoader.playPcmPlayers(); // L: 12288
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12289
		if (var4 != null) { // L: 12290
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12291
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12292
				int var5 = Client.camAngleY & 2047; // L: 12293
				int var6 = ModelData0.localPlayer.x / 32 + 48; // L: 12294
				int var7 = 464 - ModelData0.localPlayer.y / 32; // L: 12295
				InterfaceParent.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12296

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12297
					var16 = Client.mapIconXs[var8] * 4 + 2 - ModelData0.localPlayer.x / 32; // L: 12298
					var10 = Client.mapIconYs[var8] * 4 + 2 - ModelData0.localPlayer.y / 32; // L: 12299
					PcmPlayer.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12300
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12302
					for (var16 = 0; var16 < 104; ++var16) { // L: 12303
						NodeDeque var14 = Client.groundItems[class128.Client_plane][var8][var16]; // L: 12304
						if (var14 != null) { // L: 12305
							var11 = var8 * 4 + 2 - ModelData0.localPlayer.x / 32; // L: 12306
							var12 = var16 * 4 + 2 - ModelData0.localPlayer.y / 32; // L: 12307
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var11, var12, WallDecoration.mapDotSprites[0], var4); // L: 12308
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12312
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12313
					if (var9 != null && var9.isVisible()) { // L: 12314
						NPCComposition var18 = var9.definition; // L: 12315
						if (var18 != null && var18.transforms != null) { // L: 12316
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12317
							var11 = var9.x / 32 - ModelData0.localPlayer.x / 32; // L: 12318
							var12 = var9.y / 32 - ModelData0.localPlayer.y / 32; // L: 12319
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var11, var12, WallDecoration.mapDotSprites[1], var4); // L: 12320
						}
					}
				}

				var8 = Players.Players_count; // L: 12324
				int[] var17 = Players.Players_indices; // L: 12325

				for (var10 = 0; var10 < var8; ++var10) { // L: 12326
					Player var15 = Client.players[var17[var10]]; // L: 12327
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != ModelData0.localPlayer) { // L: 12328
						var12 = var15.x / 32 - ModelData0.localPlayer.x / 32; // L: 12329
						int var13 = var15.y / 32 - ModelData0.localPlayer.y / 32; // L: 12330
						if (var15.isFriend()) { // L: 12331
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, WallDecoration.mapDotSprites[3], var4);
						} else if (ModelData0.localPlayer.team != 0 && var15.team != 0 && var15.team == ModelData0.localPlayer.team) { // L: 12332
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, WallDecoration.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 12333
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, WallDecoration.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 12334
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, WallDecoration.mapDotSprites[6], var4);
						} else {
							PcmPlayer.drawSpriteOnMinimap(var1, var2, var12, var13, WallDecoration.mapDotSprites[2], var4); // L: 12335
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12338
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 12339
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 12340
						if (var19 != null) { // L: 12341
							var11 = var19.x / 32 - ModelData0.localPlayer.x / 32; // L: 12342
							var12 = var19.y / 32 - ModelData0.localPlayer.y / 32; // L: 12343
							VarcInt.worldToMinimap(var1, var2, var11, var12, class146.mapMarkerSprites[1], var4); // L: 12344
						}
					}

					if (Client.hintArrowType == 2) { // L: 12347
						var10 = Client.hintArrowX * 4 - SecureRandomCallable.baseX * 4 + 2 - ModelData0.localPlayer.x / 32; // L: 12348
						var11 = Client.hintArrowY * 4 - GrandExchangeOfferOwnWorldComparator.baseY * 4 + 2 - ModelData0.localPlayer.y / 32; // L: 12349
						VarcInt.worldToMinimap(var1, var2, var10, var11, class146.mapMarkerSprites[1], var4); // L: 12350
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 12352
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 12353
						if (var20 != null) { // L: 12354
							var11 = var20.x / 32 - ModelData0.localPlayer.x / 32; // L: 12355
							var12 = var20.y / 32 - ModelData0.localPlayer.y / 32; // L: 12356
							VarcInt.worldToMinimap(var1, var2, var11, var12, class146.mapMarkerSprites[1], var4); // L: 12357
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12361
					var10 = Client.destinationX * 4 + 2 - ModelData0.localPlayer.x / 32; // L: 12362
					var11 = Client.destinationY * 4 + 2 - ModelData0.localPlayer.y / 32; // L: 12363
					PcmPlayer.drawSpriteOnMinimap(var1, var2, var10, var11, class146.mapMarkerSprites[0], var4); // L: 12364
				}

				if (!ModelData0.localPlayer.isHidden) { // L: 12366
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12368
			}

			Client.field704[var3] = true; // L: 12369
		}
	} // L: 12370

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1927350228"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (PcmPlayer.friendsChat != null) { // L: 12439
			PacketBufferNode var1 = WallDecoration.getPacketBufferNode(ClientPacket.field2983, Client.packetWriter.isaacCipher); // L: 12440
			var1.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var0)); // L: 12441
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12442
			Client.packetWriter.addNode(var1); // L: 12443
		}
	} // L: 12444
}
