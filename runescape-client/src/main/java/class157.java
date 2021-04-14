import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class157 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	static final class157 field1732;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	static final class157 field1733;
	@ObfuscatedName("k")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2045645693
	)
	@Export("value")
	final int value;

	static {
		field1732 = new class157(0); // L: 4
		field1733 = new class157(1); // L: 5
	}

	class157(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILfu;[Lel;I)V",
		garbageValue = "-1535300065"
	)
	static final void method3114(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 252
		int var11 = -1; // L: 253

		while (true) {
			int var12 = var10.method6595(); // L: 255
			if (var12 == 0) { // L: 256
				return; // L: 339
			}

			var11 += var12; // L: 257
			int var13 = 0; // L: 258

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 260
				if (var14 == 0) { // L: 261
					break;
				}

				var13 += var14 - 1; // L: 262
				int var15 = var13 & 63; // L: 263
				int var16 = var13 >> 6 & 63; // L: 264
				int var17 = var13 >> 12; // L: 265
				int var18 = var10.readUnsignedByte(); // L: 266
				int var19 = var18 >> 2; // L: 267
				int var20 = var18 & 3; // L: 268
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 269
					ObjectComposition var21 = class19.getObjectDefinition(var11); // L: 270
					int var24 = var16 & 7; // L: 273
					int var25 = var15 & 7; // L: 274
					int var27 = var21.sizeX; // L: 276
					int var28 = var21.sizeY; // L: 277
					int var29;
					if ((var20 & 1) == 1) { // L: 279
						var29 = var27; // L: 280
						var27 = var28; // L: 281
						var28 = var29; // L: 282
					}

					int var26 = var7 & 3; // L: 284
					int var23;
					if (var26 == 0) { // L: 285
						var23 = var24; // L: 286
					} else if (var26 == 1) { // L: 289
						var23 = var25; // L: 290
					} else if (var26 == 2) { // L: 293
						var23 = 7 - var24 - (var27 - 1); // L: 294
					} else {
						var23 = 7 - var25 - (var28 - 1); // L: 297
					}

					var29 = var2 + var23; // L: 299
					int var32 = var16 & 7; // L: 302
					int var33 = var15 & 7; // L: 303
					int var35 = var21.sizeX; // L: 305
					int var36 = var21.sizeY; // L: 306
					int var37;
					if ((var20 & 1) == 1) { // L: 308
						var37 = var35; // L: 309
						var35 = var36; // L: 310
						var36 = var37; // L: 311
					}

					int var34 = var7 & 3; // L: 313
					int var31;
					if (var34 == 0) { // L: 314
						var31 = var33; // L: 315
					} else if (var34 == 1) { // L: 318
						var31 = 7 - var32 - (var35 - 1); // L: 319
					} else if (var34 == 2) { // L: 322
						var31 = 7 - var33 - (var36 - 1); // L: 323
					} else {
						var31 = var32; // L: 326
					}

					var37 = var31 + var3; // L: 328
					if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) { // L: 329
						int var38 = var1; // L: 330
						if ((Tiles.Tiles_renderFlags[1][var29][var37] & 2) == 2) { // L: 331
							var38 = var1 - 1;
						}

						CollisionMap var39 = null; // L: 332
						if (var38 >= 0) { // L: 333
							var39 = var9[var38];
						}

						method3115(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39); // L: 334
					}
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILfu;Lel;B)V",
		garbageValue = "26"
	)
	static final void method3115(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 342 343 344
			if (var0 < Tiles.Tiles_minPlane) { // L: 347
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class19.getObjectDefinition(var3); // L: 348
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 351
				var9 = var8.sizeX; // L: 356
				var10 = var8.sizeY; // L: 357
			} else {
				var9 = var8.sizeY; // L: 352
				var10 = var8.sizeX; // L: 353
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 363
				var11 = (var9 >> 1) + var1; // L: 364
				var12 = (var9 + 1 >> 1) + var1; // L: 365
			} else {
				var11 = var1; // L: 368
				var12 = var1 + 1; // L: 369
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 371
				var13 = (var10 >> 1) + var2; // L: 372
				var14 = var2 + (var10 + 1 >> 1); // L: 373
			} else {
				var13 = var2; // L: 376
				var14 = var2 + 1; // L: 377
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 379
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2; // L: 380
			int var17 = (var1 << 7) + (var9 << 6); // L: 381
			int var18 = (var2 << 7) + (var10 << 6); // L: 382
			long var19 = AttackOption.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 383
			int var21 = var5 + (var4 << 6); // L: 384
			if (var8.int3 == 1) { // L: 385
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 386
				ObjectSound var22 = new ObjectSound(); // L: 387
				var22.plane = var0; // L: 388
				var22.x = var1 * 128; // L: 389
				var22.y = var2 * 128; // L: 390
				var23 = var8.sizeX; // L: 391
				var24 = var8.sizeY; // L: 392
				if (var4 == 1 || var4 == 3) { // L: 393
					var23 = var8.sizeY; // L: 394
					var24 = var8.sizeX; // L: 395
				}

				var22.field916 = (var23 + var1) * 128; // L: 397
				var22.field917 = (var24 + var2) * 128; // L: 398
				var22.soundEffectId = var8.ambientSoundId; // L: 399
				var22.field918 = var8.int4 * 128; // L: 400
				var22.field921 = var8.int5; // L: 401
				var22.field922 = var8.int6; // L: 402
				var22.soundEffectIds = var8.soundEffectIds; // L: 403
				if (var8.transforms != null) { // L: 404
					var22.obj = var8; // L: 405
					var22.set(); // L: 406
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 408
				if (var22.soundEffectIds != null) { // L: 409
					var22.field924 = var22.field921 + (int)(Math.random() * (double)(var22.field922 - var22.field921));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 411
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 412
					if (var8.animationId == -1 && var8.transforms == null) { // L: 414
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 415
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 416
					if (var8.interactType == 1 && var7 != null) { // L: 417
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 420
				int[] var10000;
				if (var5 >= 12) { // L: 441
					if (var8.animationId == -1 && var8.transforms == null) { // L: 443
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 444
					}

					var6.method3445(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 445
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 446
						var10000 = MidiPcmStream.field2489[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 447
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 450
					if (var8.animationId == -1 && var8.transforms == null) { // L: 452
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 453
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1094[var4], 0, var19, var21); // L: 454
					if (var4 == 0) { // L: 455
						if (var8.clipped) { // L: 456
							SecureRandomCallable.field1106[var0][var1][var2] = 50; // L: 457
							SecureRandomCallable.field1106[var0][var1][var2 + 1] = 50; // L: 458
						}

						if (var8.modelClipped) { // L: 460
							var10000 = MidiPcmStream.field2489[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 462
						if (var8.clipped) { // L: 463
							SecureRandomCallable.field1106[var0][var1][var2 + 1] = 50; // L: 464
							SecureRandomCallable.field1106[var0][var1 + 1][var2 + 1] = 50; // L: 465
						}

						if (var8.modelClipped) { // L: 467
							var10000 = MidiPcmStream.field2489[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) { // L: 469
						if (var8.clipped) { // L: 470
							SecureRandomCallable.field1106[var0][var1 + 1][var2] = 50; // L: 471
							SecureRandomCallable.field1106[var0][var1 + 1][var2 + 1] = 50; // L: 472
						}

						if (var8.modelClipped) { // L: 474
							var10000 = MidiPcmStream.field2489[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 476
						if (var8.clipped) { // L: 477
							SecureRandomCallable.field1106[var0][var1][var2] = 50; // L: 478
							SecureRandomCallable.field1106[var0][var1 + 1][var2] = 50; // L: 479
						}

						if (var8.modelClipped) { // L: 481
							var10000 = MidiPcmStream.field2489[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 483
						var7.method2613(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 484
						var6.method3538(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 487
					if (var8.animationId == -1 && var8.transforms == null) { // L: 489
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 490
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1098[var4], 0, var19, var21); // L: 491
					if (var8.clipped) { // L: 492
						if (var4 == 0) { // L: 493
							SecureRandomCallable.field1106[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 494
							SecureRandomCallable.field1106[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 495
							SecureRandomCallable.field1106[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 496
							SecureRandomCallable.field1106[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 498
						var7.method2613(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 501
						var28 = var4 + 1 & 3; // L: 502
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 505
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 506
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 507
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 510
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 511
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field1094[var4], Tiles.field1094[var28], var19, var21); // L: 513
						if (var8.modelClipped) { // L: 514
							if (var4 == 0) { // L: 515
								var10000 = MidiPcmStream.field2489[var0][var1]; // L: 516
								var10000[var2] |= 585;
								var10000 = MidiPcmStream.field2489[var0][var1]; // L: 517
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) { // L: 519
								var10000 = MidiPcmStream.field2489[var0][var1]; // L: 520
								var10000[1 + var2] |= 1170;
								var10000 = MidiPcmStream.field2489[var0][var1 + 1]; // L: 521
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 523
								var10000 = MidiPcmStream.field2489[var0][var1 + 1]; // L: 524
								var10000[var2] |= 585;
								var10000 = MidiPcmStream.field2489[var0][var1]; // L: 525
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 527
								var10000 = MidiPcmStream.field2489[var0][var1]; // L: 528
								var10000[var2] |= 1170;
								var10000 = MidiPcmStream.field2489[var0][var1]; // L: 529
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 532
							var7.method2613(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 533
							var6.method3538(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 536
						if (var8.animationId == -1 && var8.transforms == null) { // L: 538
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 539
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1098[var4], 0, var19, var21); // L: 540
						if (var8.clipped) { // L: 541
							if (var4 == 0) { // L: 542
								SecureRandomCallable.field1106[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 543
								SecureRandomCallable.field1106[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 544
								SecureRandomCallable.field1106[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 545
								SecureRandomCallable.field1106[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 547
							var7.method2613(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 550
						if (var8.animationId == -1 && var8.transforms == null) { // L: 552
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 553
						}

						var6.method3445(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 554
						if (var8.interactType != 0 && var7 != null) { // L: 555
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 556
							var6.method3538(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 559
						if (var8.animationId == -1 && var8.transforms == null) { // L: 561
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 562
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1094[var4], 0, 0, 0, var19, var21); // L: 563
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 566
							var28 = 16; // L: 567
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 568
							if (0L != var29) { // L: 569
								var28 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 571
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 572
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1094[var4], 0, var28 * Tiles.field1097[var4], var28 * Tiles.field1100[var4], var19, var21); // L: 573
						} else if (var5 == 6) { // L: 576
							var28 = 8; // L: 577
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 578
							if (var29 != 0L) { // L: 579
								var28 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 581
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 582
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field1101[var4], var28 * Tiles.field1099[var4], var19, var21); // L: 583
						} else if (var5 == 7) { // L: 586
							var23 = var4 + 2 & 3; // L: 588
							if (var8.animationId == -1 && var8.transforms == null) { // L: 589
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 590
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 591
						} else if (var5 == 8) { // L: 594
							var28 = 8; // L: 595
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 596
							if (var29 != 0L) { // L: 597
								var28 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 600
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 601
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 602
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 603
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 606
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 607
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field1101[var4], var28 * Tiles.field1099[var4], var19, var21); // L: 609
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 422
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null); // L: 423
				}

				if (var34 != null && var6.method3445(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 424 425
					var23 = 15; // L: 426
					if (var34 instanceof Model) { // L: 427
						var23 = ((Model)var34).method3673() / 4; // L: 428
						if (var23 > 30) { // L: 429
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 431
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 432
							if (var23 > SecureRandomCallable.field1106[var0][var24 + var1][var33 + var2]) { // L: 433
								SecureRandomCallable.field1106[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 438
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 418 439 448 485 499 534 548 557 564 574 584 592 610 612

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method3113() {
		Object var10000 = null; // L: 175
		String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
		class69.addGameMessage(30, "", var0); // L: 177
	} // L: 179

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1812084217"
	)
	static final void method3112() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11498
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11499
			var1.clearIsInClanChat(); // L: 11500
		}

	} // L: 11502
}
