import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hz")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -460630695
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 308451519
	)
	@Export("element")
	int element;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1213792301
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1841576609
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;ILhc;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-58815243"
	)
	@Export("init")
	void init() {
		this.element = class116.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class19.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class19.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2078584239"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-2105037058"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "388705804"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgs;Lgf;I)V",
		garbageValue = "-1640512620"
	)
	static final void method4556(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 355 356 357
			if (var0 < Tiles.Tiles_minPlane) { // L: 360
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class116.getObjectDefinition(var3); // L: 361
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 364
				var9 = var8.sizeX; // L: 369
				var10 = var8.sizeY; // L: 370
			} else {
				var9 = var8.sizeY; // L: 365
				var10 = var8.sizeX; // L: 366
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 376
				var11 = (var9 >> 1) + var1; // L: 377
				var12 = (var9 + 1 >> 1) + var1; // L: 378
			} else {
				var11 = var1; // L: 381
				var12 = var1 + 1; // L: 382
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 384
				var13 = (var10 >> 1) + var2; // L: 385
				var14 = var2 + (var10 + 1 >> 1); // L: 386
			} else {
				var13 = var2; // L: 389
				var14 = var2 + 1; // L: 390
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 392
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2; // L: 393
			int var17 = (var1 << 7) + (var9 << 6); // L: 394
			int var18 = (var2 << 7) + (var10 << 6); // L: 395
			long var19 = MilliClock.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 396
			int var21 = var5 + (var4 << 6); // L: 397
			if (var8.int3 == 1) { // L: 398
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 399
				ObjectSound var22 = new ObjectSound(); // L: 400
				var22.plane = var0; // L: 401
				var22.x = var1 * 128; // L: 402
				var22.y = var2 * 128; // L: 403
				var23 = var8.sizeX; // L: 404
				var24 = var8.sizeY; // L: 405
				if (var4 == 1 || var4 == 3) { // L: 406
					var23 = var8.sizeY; // L: 407
					var24 = var8.sizeX; // L: 408
				}

				var22.maxX = (var23 + var1) * 128; // L: 410
				var22.maxY = (var24 + var2) * 128; // L: 411
				var22.soundEffectId = var8.ambientSoundId; // L: 412
				var22.field813 = var8.int7 * 128; // L: 413
				var22.field809 = var8.int5; // L: 414
				var22.field819 = var8.int6; // L: 415
				var22.soundEffectIds = var8.soundEffectIds; // L: 416
				if (var8.transforms != null) { // L: 417
					var22.obj = var8; // L: 418
					var22.set(); // L: 419
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 421
				if (var22.soundEffectIds != null) { // L: 422
					var22.field821 = var22.field809 + (int)(Math.random() * (double)(var22.field819 - var22.field809));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 424
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 425
					if (var8.animationId == -1 && var8.transforms == null) { // L: 427
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 428
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 429
					if (var8.interactType == 1 && var7 != null) { // L: 430
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 433
				int[] var10000;
				if (var5 >= 12) { // L: 454
					if (var8.animationId == -1 && var8.transforms == null) { // L: 456
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 457
					}

					var6.method4138(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 458
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 459
						var10000 = DirectByteArrayCopier.field3277[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 460
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 463
					if (var8.animationId == -1 && var8.transforms == null) { // L: 465
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 466
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field988[var4], 0, var19, var21); // L: 467
					if (var4 == 0) { // L: 468
						if (var8.clipped) { // L: 469
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2] = 50; // L: 470
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2 + 1] = 50; // L: 471
						}

						if (var8.modelClipped) { // L: 473
							var10000 = DirectByteArrayCopier.field3277[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 475
						if (var8.clipped) { // L: 476
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2 + 1] = 50; // L: 477
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2 + 1] = 50; // L: 478
						}

						if (var8.modelClipped) { // L: 480
							var10000 = DirectByteArrayCopier.field3277[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) { // L: 482
						if (var8.clipped) { // L: 483
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2] = 50; // L: 484
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2 + 1] = 50; // L: 485
						}

						if (var8.modelClipped) { // L: 487
							var10000 = DirectByteArrayCopier.field3277[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 489
						if (var8.clipped) { // L: 490
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2] = 50; // L: 491
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2] = 50; // L: 492
						}

						if (var8.modelClipped) { // L: 494
							var10000 = DirectByteArrayCopier.field3277[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 496
						var7.method3838(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 497
						var6.method4144(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 500
					if (var8.animationId == -1 && var8.transforms == null) { // L: 502
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 503
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field989[var4], 0, var19, var21); // L: 504
					if (var8.clipped) { // L: 505
						if (var4 == 0) { // L: 506
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 507
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 508
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 509
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 511
						var7.method3838(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 514
						var28 = var4 + 1 & 3; // L: 515
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 518
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 519
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 520
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 523
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 524
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field988[var4], Tiles.field988[var28], var19, var21); // L: 526
						if (var8.modelClipped) { // L: 527
							if (var4 == 0) { // L: 528
								var10000 = DirectByteArrayCopier.field3277[var0][var1]; // L: 529
								var10000[var2] |= 585;
								var10000 = DirectByteArrayCopier.field3277[var0][var1]; // L: 530
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) { // L: 532
								var10000 = DirectByteArrayCopier.field3277[var0][var1]; // L: 533
								var10000[1 + var2] |= 1170;
								var10000 = DirectByteArrayCopier.field3277[var0][var1 + 1]; // L: 534
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 536
								var10000 = DirectByteArrayCopier.field3277[var0][var1 + 1]; // L: 537
								var10000[var2] |= 585;
								var10000 = DirectByteArrayCopier.field3277[var0][var1]; // L: 538
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 540
								var10000 = DirectByteArrayCopier.field3277[var0][var1]; // L: 541
								var10000[var2] |= 1170;
								var10000 = DirectByteArrayCopier.field3277[var0][var1]; // L: 542
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 545
							var7.method3838(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 546
							var6.method4144(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 549
						if (var8.animationId == -1 && var8.transforms == null) { // L: 551
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 552
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field989[var4], 0, var19, var21); // L: 553
						if (var8.clipped) { // L: 554
							if (var4 == 0) { // L: 555
								GrandExchangeOfferNameComparator.field4010[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 556
								GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 557
								GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 558
								GrandExchangeOfferNameComparator.field4010[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 560
							var7.method3838(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 563
						if (var8.animationId == -1 && var8.transforms == null) { // L: 565
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 566
						}

						var6.method4138(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 567
						if (var8.interactType != 0 && var7 != null) { // L: 568
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 569
							var6.method4144(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 572
						if (var8.animationId == -1 && var8.transforms == null) { // L: 574
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 575
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field988[var4], 0, 0, 0, var19, var21); // L: 576
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 579
							var28 = 16; // L: 580
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 581
							if (0L != var29) { // L: 582
								var28 = class116.getObjectDefinition(class121.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 584
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 585
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field988[var4], 0, var28 * Tiles.field990[var4], var28 * Tiles.field991[var4], var19, var21); // L: 586
						} else if (var5 == 6) { // L: 589
							var28 = 8; // L: 590
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 591
							if (0L != var29) { // L: 592
								var28 = class116.getObjectDefinition(class121.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 594
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 595
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field1000[var4], var28 * Tiles.field993[var4], var19, var21); // L: 596
						} else if (var5 == 7) { // L: 599
							var23 = var4 + 2 & 3; // L: 601
							if (var8.animationId == -1 && var8.transforms == null) { // L: 602
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 603
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 604
						} else if (var5 == 8) { // L: 607
							var28 = 8; // L: 608
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 609
							if (0L != var29) { // L: 610
								var28 = class116.getObjectDefinition(class121.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 613
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 614
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 615
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 616
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 619
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 620
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field1000[var4], var28 * Tiles.field993[var4], var19, var21); // L: 622
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 435
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 436
				}

				if (var34 != null && var6.method4138(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 437 438
					var23 = 15; // L: 439
					if (var34 instanceof Model) { // L: 440
						var23 = ((Model)var34).method4360() / 4; // L: 441
						if (var23 > 30) { // L: 442
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 444
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 445
							if (var23 > GrandExchangeOfferNameComparator.field4010[var0][var24 + var1][var33 + var2]) { // L: 446
								GrandExchangeOfferNameComparator.field4010[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 451
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 431 452 461 498 512 547 561 570 577 587 597 605 623 625

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "694250385"
	)
	static int method4559(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3789
			class295.Interpreter_intStackSize -= 2; // L: 3790
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3791
			int var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3792
			if (!Client.isCameraLocked) { // L: 3793
				Client.camAngleX = var3; // L: 3794
				Client.camAngleY = var4; // L: 3795
			}

			return 1; // L: 3797
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3799
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3800
			return 1; // L: 3801
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3803
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3804
			return 1; // L: 3805
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3807
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3808
			if (var3 < 0) { // L: 3809
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3810
			return 1; // L: 3811
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3813
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3814
			return 1; // L: 3815
		} else {
			return 2; // L: 3817
		}
	}
}
