import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class231 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	static final class231 field2764;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	static final class231 field2765;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1261525221
	)
	@Export("value")
	final int value;

	static {
		field2764 = new class231(0); // L: 4
		field2765 = new class231(1); // L: 5
	}

	class231(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpy;",
		garbageValue = "6"
	)
	public static PrivateChatMode method4764(int var0) {
		PrivateChatMode[] var1 = class20.method287(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field4631) {
				return var3; // L: 24
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgn;Lgi;B)V",
		garbageValue = "-101"
	)
	static final void method4765(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 346 347 348
			if (var0 < Tiles.Tiles_minPlane) { // L: 351
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = ParamComposition.getObjectDefinition(var3); // L: 352
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 355
				var9 = var8.sizeX; // L: 360
				var10 = var8.sizeY; // L: 361
			} else {
				var9 = var8.sizeY; // L: 356
				var10 = var8.sizeX; // L: 357
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 367
				var11 = (var9 >> 1) + var1; // L: 368
				var12 = (var9 + 1 >> 1) + var1; // L: 369
			} else {
				var11 = var1; // L: 372
				var12 = var1 + 1; // L: 373
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 375
				var13 = (var10 >> 1) + var2; // L: 376
				var14 = var2 + (var10 + 1 >> 1); // L: 377
			} else {
				var13 = var2; // L: 380
				var14 = var2 + 1; // L: 381
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 383
			int var16 = var15[var12][var14] + var15[var12][var13] + var15[var11][var13] + var15[var11][var14] >> 2; // L: 384
			int var17 = (var1 << 7) + (var9 << 6); // L: 385
			int var18 = (var2 << 7) + (var10 << 6); // L: 386
			long var19 = ScriptEvent.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 387
			int var21 = var5 + (var4 << 6); // L: 388
			if (var8.int3 == 1) { // L: 389
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 390
				HitSplatDefinition.method3456(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 391
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 392
					if (var8.animationId == -1 && var8.transforms == null) { // L: 394
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 395
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 396
					if (var8.interactType == 1 && var7 != null) { // L: 397
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 400
					int[] var10000;
					if (var5 >= 12) { // L: 421
						if (var8.animationId == -1 && var8.transforms == null) { // L: 423
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 424
						}

						var6.method4027(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 425
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 426
							var10000 = class78.field1033[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 427
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 430
						if (var8.animationId == -1 && var8.transforms == null) { // L: 432
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 433
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field999[var4], 0, var19, var21); // L: 434
						if (var4 == 0) { // L: 435
							if (var8.clipped) { // L: 436
								class260.field3078[var0][var1][var2] = 50; // L: 437
								class260.field3078[var0][var1][var2 + 1] = 50; // L: 438
							}

							if (var8.modelClipped) { // L: 440
								var10000 = class78.field1033[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 442
							if (var8.clipped) { // L: 443
								class260.field3078[var0][var1][var2 + 1] = 50; // L: 444
								class260.field3078[var0][var1 + 1][var2 + 1] = 50; // L: 445
							}

							if (var8.modelClipped) { // L: 447
								var10000 = class78.field1033[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 449
							if (var8.clipped) { // L: 450
								class260.field3078[var0][var1 + 1][var2] = 50; // L: 451
								class260.field3078[var0][var1 + 1][var2 + 1] = 50; // L: 452
							}

							if (var8.modelClipped) { // L: 454
								var10000 = class78.field1033[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 456
							if (var8.clipped) { // L: 457
								class260.field3078[var0][var1][var2] = 50; // L: 458
								class260.field3078[var0][var1 + 1][var2] = 50; // L: 459
							}

							if (var8.modelClipped) { // L: 461
								var10000 = class78.field1033[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 463
							var7.method3651(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 464
							var6.method3912(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 467
						if (var8.animationId == -1 && var8.transforms == null) { // L: 469
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 470
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1000[var4], 0, var19, var21); // L: 471
						if (var8.clipped) { // L: 472
							if (var4 == 0) { // L: 473
								class260.field3078[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 474
								class260.field3078[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 475
								class260.field3078[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 476
								class260.field3078[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 478
							var7.method3651(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 481
							var22 = var4 + 1 & 3; // L: 482
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 485
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 486
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 487
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 490
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 491
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field999[var4], Tiles.field999[var22], var19, var21); // L: 493
							if (var8.modelClipped) { // L: 494
								if (var4 == 0) { // L: 495
									var10000 = class78.field1033[var0][var1]; // L: 496
									var10000[var2] |= 585;
									var10000 = class78.field1033[var0][var1]; // L: 497
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 499
									var10000 = class78.field1033[var0][var1]; // L: 500
									var10000[var2 + 1] |= 1170;
									var10000 = class78.field1033[var0][var1 + 1]; // L: 501
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 503
									var10000 = class78.field1033[var0][var1 + 1]; // L: 504
									var10000[var2] |= 585;
									var10000 = class78.field1033[var0][var1]; // L: 505
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 507
									var10000 = class78.field1033[var0][var1]; // L: 508
									var10000[var2] |= 1170;
									var10000 = class78.field1033[var0][var1]; // L: 509
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 512
								var7.method3651(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 513
								var6.method3912(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 516
							if (var8.animationId == -1 && var8.transforms == null) { // L: 518
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 519
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1000[var4], 0, var19, var21); // L: 520
							if (var8.clipped) { // L: 521
								if (var4 == 0) { // L: 522
									class260.field3078[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 523
									class260.field3078[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 524
									class260.field3078[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 525
									class260.field3078[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 527
								var7.method3651(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 530
							if (var8.animationId == -1 && var8.transforms == null) { // L: 532
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 533
							}

							var6.method4027(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 534
							if (var8.interactType != 0 && var7 != null) { // L: 535
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 536
								var6.method3912(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 539
							if (var8.animationId == -1 && var8.transforms == null) { // L: 541
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 542
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field999[var4], 0, 0, 0, var19, var21); // L: 543
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 546
								var22 = 16; // L: 547
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 548
								if (0L != var23) { // L: 549
									var22 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 551
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 552
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field999[var4], 0, var22 * Tiles.field1001[var4], var22 * Tiles.field1002[var4], var19, var21); // L: 553
							} else if (var5 == 6) { // L: 556
								var22 = 8; // L: 557
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 558
								if (0L != var23) { // L: 559
									var22 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 561
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 562
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1003[var4], var22 * Tiles.field1005[var4], var19, var21); // L: 563
							} else if (var5 == 7) { // L: 566
								var28 = var4 + 2 & 3; // L: 568
								if (var8.animationId == -1 && var8.transforms == null) { // L: 569
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 570
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 571
							} else if (var5 == 8) { // L: 574
								var22 = 8; // L: 575
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 576
								if (0L != var23) { // L: 577
									var22 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 580
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 581
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 582
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 583
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 586
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 587
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1003[var4], var22 * Tiles.field1005[var4], var19, var21); // L: 589
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 402
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 403
					}

					if (var29 != null && var6.method4027(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 404 405
						var28 = 15; // L: 406
						if (var29 instanceof Model) { // L: 407
							var28 = ((Model)var29).method4137() / 4; // L: 408
							if (var28 > 30) { // L: 409
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 411
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 412
								if (var28 > class260.field3078[var0][var31 + var1][var32 + var2]) { // L: 413
									class260.field3078[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 418
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 398 419 428 465 479 514 528 537 544 554 564 572 590 592

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-32113646"
	)
	static final String method4766(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 10416 10417
	}
}
