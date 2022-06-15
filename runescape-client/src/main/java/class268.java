import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public final class class268 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -2565136781786077807L
	)
	static long field3170;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgg;Lgv;B)V",
		garbageValue = "78"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 294 295 296
			if (var0 < Tiles.Tiles_minPlane) { // L: 299
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class162.getObjectDefinition(var3); // L: 300
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 303
				var9 = var8.sizeX; // L: 308
				var10 = var8.sizeY; // L: 309
			} else {
				var9 = var8.sizeY; // L: 304
				var10 = var8.sizeX; // L: 305
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 315
				var11 = (var9 >> 1) + var1; // L: 316
				var12 = (var9 + 1 >> 1) + var1; // L: 317
			} else {
				var11 = var1; // L: 320
				var12 = var1 + 1; // L: 321
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 323
				var13 = (var10 >> 1) + var2; // L: 324
				var14 = var2 + (var10 + 1 >> 1); // L: 325
			} else {
				var13 = var2; // L: 328
				var14 = var2 + 1; // L: 329
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 331
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2; // L: 332
			int var17 = (var1 << 7) + (var9 << 6); // L: 333
			int var18 = (var2 << 7) + (var10 << 6); // L: 334
			long var19 = TaskHandler.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 335
			int var21 = var5 + (var4 << 6); // L: 336
			if (var8.int3 == 1) { // L: 337
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 338
				class6.method38(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 339
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 340
					if (var8.animationId == -1 && var8.transforms == null) { // L: 342
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 343
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 344
					if (var8.interactType == 1 && var7 != null) { // L: 345
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 348
					int[] var10000;
					if (var5 >= 12) { // L: 369
						if (var8.animationId == -1 && var8.transforms == null) { // L: 371
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 372
						}

						var6.method4188(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 373
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 374
							var10000 = class1.field2[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 375
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 378
						if (var8.animationId == -1 && var8.transforms == null) { // L: 380
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 381
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1007[var4], 0, var19, var21); // L: 382
						if (var4 == 0) { // L: 383
							if (var8.clipped) { // L: 384
								UserComparator6.field1415[var0][var1][var2] = 50; // L: 385
								UserComparator6.field1415[var0][var1][var2 + 1] = 50; // L: 386
							}

							if (var8.modelClipped) { // L: 388
								var10000 = class1.field2[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 390
							if (var8.clipped) { // L: 391
								UserComparator6.field1415[var0][var1][var2 + 1] = 50; // L: 392
								UserComparator6.field1415[var0][var1 + 1][var2 + 1] = 50; // L: 393
							}

							if (var8.modelClipped) { // L: 395
								var10000 = class1.field2[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) { // L: 397
							if (var8.clipped) { // L: 398
								UserComparator6.field1415[var0][var1 + 1][var2] = 50; // L: 399
								UserComparator6.field1415[var0][var1 + 1][var2 + 1] = 50; // L: 400
							}

							if (var8.modelClipped) { // L: 402
								var10000 = class1.field2[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 404
							if (var8.clipped) { // L: 405
								UserComparator6.field1415[var0][var1][var2] = 50; // L: 406
								UserComparator6.field1415[var0][var1 + 1][var2] = 50; // L: 407
							}

							if (var8.modelClipped) { // L: 409
								var10000 = class1.field2[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 411
							var7.method3878(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 412
							var6.method4171(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 415
						if (var8.animationId == -1 && var8.transforms == null) { // L: 417
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 418
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1011[var4], 0, var19, var21); // L: 419
						if (var8.clipped) { // L: 420
							if (var4 == 0) { // L: 421
								UserComparator6.field1415[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 422
								UserComparator6.field1415[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 423
								UserComparator6.field1415[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 424
								UserComparator6.field1415[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 426
							var7.method3878(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 429
							var22 = var4 + 1 & 3; // L: 430
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 433
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 434
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 435
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 438
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 439
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1007[var4], Tiles.field1007[var22], var19, var21); // L: 441
							if (var8.modelClipped) { // L: 442
								if (var4 == 0) { // L: 443
									var10000 = class1.field2[var0][var1]; // L: 444
									var10000[var2] |= 585;
									var10000 = class1.field2[var0][var1]; // L: 445
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 447
									var10000 = class1.field2[var0][var1]; // L: 448
									var10000[var2 + 1] |= 1170;
									var10000 = class1.field2[var0][var1 + 1]; // L: 449
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 451
									var10000 = class1.field2[var0][var1 + 1]; // L: 452
									var10000[var2] |= 585;
									var10000 = class1.field2[var0][var1]; // L: 453
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 455
									var10000 = class1.field2[var0][var1]; // L: 456
									var10000[var2] |= 1170;
									var10000 = class1.field2[var0][var1]; // L: 457
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 460
								var7.method3878(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 461
								var6.method4171(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 464
							if (var8.animationId == -1 && var8.transforms == null) { // L: 466
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 467
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1011[var4], 0, var19, var21); // L: 468
							if (var8.clipped) { // L: 469
								if (var4 == 0) { // L: 470
									UserComparator6.field1415[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 471
									UserComparator6.field1415[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 472
									UserComparator6.field1415[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 473
									UserComparator6.field1415[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 475
								var7.method3878(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 478
							if (var8.animationId == -1 && var8.transforms == null) { // L: 480
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 481
							}

							var6.method4188(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 482
							if (var8.interactType != 0 && var7 != null) { // L: 483
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 484
								var6.method4171(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 487
							if (var8.animationId == -1 && var8.transforms == null) { // L: 489
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 490
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1007[var4], 0, 0, 0, var19, var21); // L: 491
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 494
								var22 = 16; // L: 495
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 496
								if (var23 != 0L) { // L: 497
									var22 = class162.getObjectDefinition(Decimator.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 499
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 500
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1007[var4], 0, var22 * Tiles.field1003[var4], var22 * Tiles.field1005[var4], var19, var21); // L: 501
							} else if (var5 == 6) { // L: 504
								var22 = 8; // L: 505
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 506
								if (0L != var23) { // L: 507
									var22 = class162.getObjectDefinition(Decimator.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 509
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 510
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1006[var4], var22 * Tiles.field1002[var4], var19, var21); // L: 511
							} else if (var5 == 7) { // L: 514
								var28 = var4 + 2 & 3; // L: 516
								if (var8.animationId == -1 && var8.transforms == null) { // L: 517
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 518
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 519
							} else if (var5 == 8) { // L: 522
								var22 = 8; // L: 523
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 524
								if (0L != var23) { // L: 525
									var22 = class162.getObjectDefinition(Decimator.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 528
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 529
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 530
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 531
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 534
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 535
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1006[var4], var22 * Tiles.field1002[var4], var19, var21); // L: 537
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 350
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null); // L: 351
					}

					if (var29 != null && var6.method4188(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 352 353
						var28 = 15; // L: 354
						if (var29 instanceof Model) { // L: 355
							var28 = ((Model)var29).method4456() / 4; // L: 356
							if (var28 > 30) { // L: 357
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 359
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 360
								if (var28 > UserComparator6.field1415[var0][var31 + var1][var32 + var2]) { // L: 361
									UserComparator6.field1415[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 366
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 346 367 376 413 427 462 476 485 492 502 512 520 538 540

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-349041943"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9704
			if (Client.menuOptionsCount < 500) { // L: 9705
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9706
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9707
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9708
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9709
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9710
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9711
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9712
				++Client.menuOptionsCount; // L: 9713
			}

		}
	} // L: 9715
}
