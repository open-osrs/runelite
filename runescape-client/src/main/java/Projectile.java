import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	static AbstractSocket field915;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2098760211
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -391632779
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 764309531
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -586694521
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1961022753
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -787475925
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 196209817
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 321994179
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 178012727
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -736390091
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1511364615
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("y")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("k")
	@Export("x")
	double x;
	@ObfuscatedName("t")
	@Export("y")
	double y;
	@ObfuscatedName("l")
	@Export("z")
	double z;
	@ObfuscatedName("u")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("n")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("z")
	@Export("speed")
	double speed;
	@ObfuscatedName("q")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("d")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1310821215
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1676153713
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1216775707
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1200268787
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0; // L: 32
		this.frameCycle = 0; // L: 33
		this.id = var1; // L: 36
		this.plane = var2; // L: 37
		this.sourceX = var3; // L: 38
		this.sourceY = var4; // L: 39
		this.sourceZ = var5; // L: 40
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8; // L: 43
		this.startHeight = var9; // L: 44
		this.targetIndex = var10; // L: 45
		this.endHeight = var11; // L: 46
		this.isMoving = false; // L: 47
		int var12 = BZip2State.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = MouseHandler.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2083342033"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9; // L: 58
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = BZip2State.SpotAnimationDefinition_get(this.id); // L: 92
		Model var2 = var1.getModel(this.frame); // L: 93
		if (var2 == null) { // L: 94
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 95
			return var2; // L: 96
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1939244665"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += (double)var1 * this.speedY; // L: 73
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + (double)var1 * this.speedZ; // L: 74
		this.speedZ += this.accelerationZ * (double)var1; // L: 75
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) { // L: 78
			this.frameCycle += var1; // L: 79

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 80
							return; // L: 89
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 81
						++this.frame; // L: 82
					} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 83

					this.frame -= this.sequenceDefinition.frameCount; // L: 84
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 85

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Loj;II)V",
		garbageValue = "1062614166"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 360
		if (var2) { // L: 361
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 362
		Player var4 = Client.players[var1]; // L: 363
		if (var3 == 0) { // L: 364
			if (var2) { // L: 365
				var4.field1067 = false; // L: 366
			} else if (Client.localPlayerIndex == var1) { // L: 369
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class19.baseX + var4.pathX[0] >> 13 << 14) + (DefaultsGroup.baseY + var4.pathY[0] >> 13); // L: 370
				if (var4.field1112 != -1) { // L: 371
					Players.Players_orientations[var1] = var4.field1112;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 372
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 373
				Client.players[var1] = null; // L: 374
				if (var0.readBits(1) != 0) { // L: 375
					WorldMapData_0.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 378
				var5 = var0.readBits(3); // L: 379
				var6 = var4.pathX[0]; // L: 380
				var7 = var4.pathY[0]; // L: 381
				if (var5 == 0) { // L: 382
					--var6; // L: 383
					--var7; // L: 384
				} else if (var5 == 1) { // L: 386
					--var7;
				} else if (var5 == 2) { // L: 387
					++var6; // L: 388
					--var7; // L: 389
				} else if (var5 == 3) { // L: 391
					--var6;
				} else if (var5 == 4) { // L: 392
					++var6;
				} else if (var5 == 5) { // L: 393
					--var6; // L: 394
					++var7; // L: 395
				} else if (var5 == 6) { // L: 397
					++var7;
				} else if (var5 == 7) { // L: 398
					++var6; // L: 399
					++var7; // L: 400
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 402
					var4.resetPath(var6, var7); // L: 403
					var4.field1067 = false; // L: 404
				} else if (var2) { // L: 406
					var4.field1067 = true; // L: 407
					var4.tileX = var6; // L: 408
					var4.tileY = var7; // L: 409
				} else {
					var4.field1067 = false; // L: 412
					var4.method2109(var6, var7, Players.field1241[var1]); // L: 413
				}

			} else if (var3 == 2) { // L: 417
				var5 = var0.readBits(4); // L: 418
				var6 = var4.pathX[0]; // L: 419
				var7 = var4.pathY[0]; // L: 420
				if (var5 == 0) { // L: 421
					var6 -= 2; // L: 422
					var7 -= 2; // L: 423
				} else if (var5 == 1) { // L: 425
					--var6; // L: 426
					var7 -= 2; // L: 427
				} else if (var5 == 2) { // L: 429
					var7 -= 2;
				} else if (var5 == 3) { // L: 430
					++var6; // L: 431
					var7 -= 2; // L: 432
				} else if (var5 == 4) { // L: 434
					var6 += 2; // L: 435
					var7 -= 2; // L: 436
				} else if (var5 == 5) { // L: 438
					var6 -= 2; // L: 439
					--var7; // L: 440
				} else if (var5 == 6) { // L: 442
					var6 += 2; // L: 443
					--var7; // L: 444
				} else if (var5 == 7) { // L: 446
					var6 -= 2;
				} else if (var5 == 8) { // L: 447
					var6 += 2;
				} else if (var5 == 9) { // L: 448
					var6 -= 2; // L: 449
					++var7; // L: 450
				} else if (var5 == 10) { // L: 452
					var6 += 2; // L: 453
					++var7; // L: 454
				} else if (var5 == 11) { // L: 456
					var6 -= 2; // L: 457
					var7 += 2; // L: 458
				} else if (var5 == 12) { // L: 460
					--var6; // L: 461
					var7 += 2; // L: 462
				} else if (var5 == 13) { // L: 464
					var7 += 2;
				} else if (var5 == 14) { // L: 465
					++var6; // L: 466
					var7 += 2; // L: 467
				} else if (var5 == 15) { // L: 469
					var6 += 2; // L: 470
					var7 += 2; // L: 471
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 473
					var4.resetPath(var6, var7); // L: 474
					var4.field1067 = false; // L: 475
				} else if (var2) { // L: 477
					var4.field1067 = true; // L: 478
					var4.tileX = var6; // L: 479
					var4.tileY = var7; // L: 480
				} else {
					var4.field1067 = false; // L: 483
					var4.method2109(var6, var7, Players.field1241[var1]); // L: 484
				}

			} else {
				var5 = var0.readBits(1); // L: 488
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 489
					var6 = var0.readBits(12); // L: 490
					var7 = var6 >> 10; // L: 491
					var8 = var6 >> 5 & 31; // L: 492
					if (var8 > 15) { // L: 493
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 494
					if (var9 > 15) { // L: 495
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 496
					var11 = var9 + var4.pathY[0]; // L: 497
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 498
						if (var2) { // L: 502
							var4.field1067 = true; // L: 503
							var4.tileX = var10; // L: 504
							var4.tileY = var11; // L: 505
						} else {
							var4.field1067 = false; // L: 508
							var4.method2109(var10, var11, Players.field1241[var1]); // L: 509
						}
					} else {
						var4.resetPath(var10, var11); // L: 499
						var4.field1067 = false; // L: 500
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 511
					if (Client.localPlayerIndex == var1) { // L: 512
						GrandExchangeOfferTotalQuantityComparator.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 515
					var7 = var6 >> 28; // L: 516
					var8 = var6 >> 14 & 16383; // L: 517
					var9 = var6 & 16383; // L: 518
					var10 = (var8 + class19.baseX + var4.pathX[0] & 16383) - class19.baseX; // L: 519
					var11 = (var9 + DefaultsGroup.baseY + var4.pathY[0] & 16383) - DefaultsGroup.baseY; // L: 520
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 521
						var4.resetPath(var10, var11); // L: 522
						var4.field1067 = false; // L: 523
					} else if (var2) { // L: 525
						var4.field1067 = true; // L: 526
						var4.tileX = var10; // L: 527
						var4.tileY = var11; // L: 528
					} else {
						var4.field1067 = false; // L: 531
						var4.method2109(var10, var11, Players.field1241[var1]); // L: 532
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 534
					if (Client.localPlayerIndex == var1) { // L: 535
						GrandExchangeOfferTotalQuantityComparator.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 367 376 415 486 513 536

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1509830378"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4666
		if (HealthBarDefinition.localPlayer.x >> 7 == Client.destinationX && HealthBarDefinition.localPlayer.y >> 7 == Client.destinationY) { // L: 4668
			Client.destinationX = 0; // L: 4669
		}

		VerticalAlignment.method3157(); // L: 4672
		VertexNormal.method4623(); // L: 4673
		ClanSettings.addNpcsToScene(true); // L: 4674
		BuddyRankComparator.method2500(); // L: 4675
		ClanSettings.addNpcsToScene(false); // L: 4676

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4678 4679 4696
			if (var4.plane == GrandExchangeOfferTotalQuantityComparator.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4680
				if (Client.cycle >= var4.cycleStart) { // L: 4681
					if (var4.targetIndex > 0) { // L: 4682
						NPC var31 = Client.npcs[var4.targetIndex - 1]; // L: 4683
						if (var31 != null && var31.x >= 0 && var31.x < 13312 && var31.y >= 0 && var31.y < 13312) { // L: 4684
							var4.setDestination(var31.x, var31.y, class392.getTileHeight(var31.x, var31.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4686
						var6 = -var4.targetIndex - 1; // L: 4688
						Player var34;
						if (var6 == Client.localPlayerIndex) { // L: 4689
							var34 = HealthBarDefinition.localPlayer;
						} else {
							var34 = Client.players[var6]; // L: 4690
						}

						if (var34 != null && var34.x >= 0 && var34.x < 13312 && var34.y >= 0 && var34.y < 13312) { // L: 4691
							var4.setDestination(var34.x, var34.y, class392.getTileHeight(var34.x, var34.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field531); // L: 4693
					GameBuild.scene.drawEntity(GrandExchangeOfferTotalQuantityComparator.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4694
				}
			} else {
				var4.remove();
			}
		}

		VarpDefinition.method3004(); // L: 4699
		SpriteMask.setViewportShape(var0, var1, var2, var3, true); // L: 4700
		var0 = Client.viewportOffsetX; // L: 4701
		var1 = Client.viewportOffsetY; // L: 4702
		var2 = Client.viewportWidth; // L: 4703
		var3 = Client.viewportHeight; // L: 4704
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4705
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4706
		int var5;
		int var7;
		int var8;
		int var11;
		int var28;
		if (!Client.isCameraLocked) { // L: 4707
			var28 = Client.camAngleX; // L: 4708
			if (Client.field556 / 256 > var28) { // L: 4709
				var28 = Client.field556 / 256;
			}

			if (Client.field718[4] && Client.field598[4] + 128 > var28) { // L: 4710
				var28 = Client.field598[4] + 128;
			}

			var5 = Client.camAngleY & 2047; // L: 4711
			var6 = class320.oculusOrbFocalPointX; // L: 4712
			var7 = DynamicObject.field942; // L: 4713
			var8 = class18.oculusOrbFocalPointY; // L: 4714
			var11 = var28 * 3 + 600; // L: 4719
			method1957(var6, var7, var8, var28, var5, var11, var3); // L: 4721
		}

		int var9;
		int var10;
		int var12;
		int var14;
		if (!Client.isCameraLocked) { // L: 4724
			if (class408.clientPreferences.roofsHidden) { // L: 4727
				var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 4728
			} else {
				label596: {
					var6 = 3; // L: 4731
					if (class121.cameraPitch < 310) { // L: 4732
						if (Client.oculusOrbState == 1) { // L: 4735
							var7 = class320.oculusOrbFocalPointX >> 7; // L: 4736
							var8 = class18.oculusOrbFocalPointY >> 7; // L: 4737
						} else {
							var7 = HealthBarDefinition.localPlayer.x >> 7; // L: 4740
							var8 = HealthBarDefinition.localPlayer.y >> 7; // L: 4741
						}

						var9 = WorldMapSectionType.cameraX >> 7; // L: 4743
						var10 = class65.cameraZ >> 7; // L: 4744
						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) { // L: 4745
							var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 4746
							break label596; // L: 4747
						}

						if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) { // L: 4749
							var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 4750
							break label596; // L: 4751
						}

						if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4753
							var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
						}

						if (var7 > var9) { // L: 4755
							var11 = var7 - var9;
						} else {
							var11 = var9 - var7; // L: 4756
						}

						if (var8 > var10) { // L: 4758
							var12 = var8 - var10;
						} else {
							var12 = var10 - var8; // L: 4759
						}

						int var13;
						if (var11 > var12) { // L: 4760
							var13 = var12 * 65536 / var11; // L: 4761
							var14 = 32768; // L: 4762

							while (var9 != var7) { // L: 4763
								if (var9 < var7) { // L: 4764
									++var9;
								} else if (var9 > var7) { // L: 4765
									--var9;
								}

								if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4766
									var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
								}

								var14 += var13; // L: 4767
								if (var14 >= 65536) { // L: 4768
									var14 -= 65536; // L: 4769
									if (var10 < var8) { // L: 4770
										++var10;
									} else if (var10 > var8) { // L: 4771
										--var10;
									}

									if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4772
										var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
									}
								}
							}
						} else if (var12 > 0) { // L: 4776
							var13 = var11 * 65536 / var12; // L: 4777
							var14 = 32768; // L: 4778

							while (var8 != var10) { // L: 4779
								if (var10 < var8) { // L: 4780
									++var10;
								} else if (var10 > var8) { // L: 4781
									--var10;
								}

								if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4782
									var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
								}

								var14 += var13; // L: 4783
								if (var14 >= 65536) { // L: 4784
									var14 -= 65536; // L: 4785
									if (var9 < var7) { // L: 4786
										++var9;
									} else if (var9 > var7) { // L: 4787
										--var9;
									}

									if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4788
										var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
									}
								}
							}
						}
					}

					if (HealthBarDefinition.localPlayer.x >= 0 && HealthBarDefinition.localPlayer.y >= 0 && HealthBarDefinition.localPlayer.x < 13312 && HealthBarDefinition.localPlayer.y < 13312) { // L: 4793
						if ((Tiles.Tiles_renderFlags[GrandExchangeOfferTotalQuantityComparator.Client_plane][HealthBarDefinition.localPlayer.x >> 7][HealthBarDefinition.localPlayer.y >> 7] & 4) != 0) { // L: 4797
							var6 = GrandExchangeOfferTotalQuantityComparator.Client_plane;
						}

						var5 = var6; // L: 4798
					} else {
						var5 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 4794
					}
				}
			}

			var28 = var5; // L: 4800
		} else {
			var28 = class28.method404(); // L: 4802
		}

		var5 = WorldMapSectionType.cameraX; // L: 4803
		var6 = class174.cameraY; // L: 4804
		var7 = class65.cameraZ; // L: 4805
		var8 = class121.cameraPitch; // L: 4806
		var9 = WorldMapRegion.cameraYaw; // L: 4807

		for (var10 = 0; var10 < 5; ++var10) { // L: 4808
			if (Client.field718[var10]) { // L: 4809
				var11 = (int)(Math.random() * (double)(Client.field719[var10] * 2 + 1) - (double)Client.field719[var10] + Math.sin((double)Client.field721[var10] / 100.0D * (double)Client.field722[var10]) * (double)Client.field598[var10]); // L: 4810
				if (var10 == 0) { // L: 4811
					WorldMapSectionType.cameraX += var11;
				}

				if (var10 == 1) { // L: 4812
					class174.cameraY += var11;
				}

				if (var10 == 2) { // L: 4813
					class65.cameraZ += var11;
				}

				if (var10 == 3) { // L: 4814
					WorldMapRegion.cameraYaw = var11 + WorldMapRegion.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 4815
					class121.cameraPitch += var11; // L: 4816
					if (class121.cameraPitch < 128) { // L: 4817
						class121.cameraPitch = 128;
					}

					if (class121.cameraPitch > 383) { // L: 4818
						class121.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 4822
		var11 = MouseHandler.MouseHandler_y; // L: 4823
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4824
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 4825
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 4826
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 4828
			class185.method3872(var10 - var0, var11 - var1); // L: 4829
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4833
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4834
		}

		class14.playPcmPlayers(); // L: 4837
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4838
		class14.playPcmPlayers(); // L: 4839
		var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 4840
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4841
		GameBuild.scene.draw(WorldMapSectionType.cameraX, class174.cameraY, class65.cameraZ, class121.cameraPitch, WorldMapRegion.cameraYaw, var28); // L: 4842
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 4843
		class14.playPcmPlayers(); // L: 4844
		GameBuild.scene.clearTempGameObjects(); // L: 4845
		Client.overheadTextCount = 0; // L: 4847
		boolean var32 = false; // L: 4848
		var14 = -1; // L: 4849
		int var15 = -1; // L: 4850
		int var16 = Players.Players_count; // L: 4851
		int[] var17 = Players.Players_indices; // L: 4852

		int var18;
		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) { // L: 4853
			Object var30;
			if (var18 < var16) { // L: 4855
				var30 = Client.players[var17[var18]]; // L: 4856
				if (var17[var18] == Client.combatTargetPlayerIndex) { // L: 4857
					var32 = true; // L: 4858
					var14 = var18; // L: 4859
					continue;
				}

				if (var30 == HealthBarDefinition.localPlayer) { // L: 4862
					var15 = var18; // L: 4863
					continue; // L: 4864
				}
			} else {
				var30 = Client.npcs[Client.npcIndices[var18 - var16]]; // L: 4867
			}

			LoginType.drawActor2d((Actor)var30, var18, var0, var1, var2, var3); // L: 4868
		}

		if (Client.renderSelf && var15 != -1) { // L: 4870
			LoginType.drawActor2d(HealthBarDefinition.localPlayer, var15, var0, var1, var2, var3); // L: 4871
		}

		if (var32) { // L: 4873
			LoginType.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3); // L: 4874
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) { // L: 4876
			int var19 = Client.overheadTextXs[var18]; // L: 4877
			int var20 = Client.overheadTextYs[var18]; // L: 4878
			int var21 = Client.overheadTextXOffsets[var18]; // L: 4879
			int var22 = Client.overheadTextAscents[var18]; // L: 4880
			boolean var23 = true; // L: 4881

			while (var23) {
				var23 = false; // L: 4883

				for (int var29 = 0; var29 < var18; ++var29) { // L: 4884
					if (var20 + 2 > Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] && var20 - var22 < Client.overheadTextYs[var29] + 2 && var19 - var21 < Client.overheadTextXOffsets[var29] + Client.overheadTextXs[var29] && var21 + var19 > Client.overheadTextXs[var29] - Client.overheadTextXOffsets[var29] && Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] < var20) { // L: 4885 4886
						var20 = Client.overheadTextYs[var29] - Client.overheadTextAscents[var29]; // L: 4887
						var23 = true; // L: 4888
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18]; // L: 4893
			Client.viewportTempY = Client.overheadTextYs[var18] = var20; // L: 4894
			String var24 = Client.overheadText[var18]; // L: 4895
			if (Client.chatEffects == 0) { // L: 4896
				int var25 = 16776960; // L: 4897
				if (Client.overheadTextColors[var18] < 6) { // L: 4898
					var25 = Client.field689[Client.overheadTextColors[var18]];
				}

				if (Client.overheadTextColors[var18] == 6) { // L: 4899
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var18] == 7) { // L: 4900
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var18] == 8) { // L: 4901
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var18] == 9) { // L: 4902
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4903
					if (var26 < 50) { // L: 4904
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) { // L: 4905
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) { // L: 4906
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var18] == 10) { // L: 4908
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4909
					if (var26 < 50) { // L: 4910
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) { // L: 4911
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) { // L: 4912
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var18] == 11) { // L: 4914
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4915
					if (var26 < 50) { // L: 4916
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) { // L: 4917
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) { // L: 4918
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var18] == 0) { // L: 4920
					Login.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) { // L: 4921
					Login.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) { // L: 4922
					Login.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) { // L: 4923
					Login.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) { // L: 4924
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (Login.fontBold12.stringWidth(var24) + 100) / 150; // L: 4925
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4926
					Login.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0); // L: 4927
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4928
				}

				if (Client.overheadTextEffects[var18] == 5) { // L: 4930
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4931
					int var27 = 0; // L: 4932
					if (var26 < 25) { // L: 4933
						var27 = var26 - 25;
					} else if (var26 > 125) { // L: 4934
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - Login.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4935
					Login.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0); // L: 4936
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4937
				}
			} else {
				Login.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4941
			}
		}

		if (Client.hintArrowType == 2) { // L: 4946
			DefaultsGroup.worldToScreen((Client.hintArrowX - class19.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - DefaultsGroup.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4947
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4948
				DevicePcmPlayerProvider.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field531); // L: 4950
		class393.method6885(var0, var1, var2, var3); // L: 4951
		WorldMapSectionType.cameraX = var5; // L: 4952
		class174.cameraY = var6; // L: 4953
		class65.cameraZ = var7; // L: 4954
		class121.cameraPitch = var8; // L: 4955
		WorldMapRegion.cameraYaw = var9; // L: 4956
		if (Client.isLoading) { // L: 4957
			byte var33 = 0; // L: 4960
			var14 = var33 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4961
			if (var14 == 0) { // L: 4965
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4967
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4968
			class91.drawLoadingMessage("Loading - please wait.", false); // L: 4969
		}

	} // L: 4971

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "2132181355"
	)
	static final void method1957(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = class150.method2971(var5, var6); // L: 5664
		int var7 = 2048 - var3 & 2047; // L: 5665
		int var8 = 2048 - var4 & 2047; // L: 5666
		int var9 = 0; // L: 5667
		int var10 = 0; // L: 5668
		int var11 = var5; // L: 5669
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5670
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5671
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5672
			var14 = var13 * var10 - var12 * var5 >> 16; // L: 5673
			var11 = var12 * var10 + var5 * var13 >> 16; // L: 5674
			var10 = var14; // L: 5675
		}

		if (var8 != 0) { // L: 5677
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5678
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5679
			var14 = var9 * var13 + var12 * var11 >> 16; // L: 5680
			var11 = var13 * var11 - var12 * var9 >> 16; // L: 5681
			var9 = var14; // L: 5682
		}

		WorldMapSectionType.cameraX = var0 - var9; // L: 5684
		class174.cameraY = var1 - var10; // L: 5685
		class65.cameraZ = var2 - var11; // L: 5686
		class121.cameraPitch = var3; // L: 5687
		WorldMapRegion.cameraYaw = var4; // L: 5688
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class320.oculusOrbFocalPointX >> 7 != HealthBarDefinition.localPlayer.x >> 7 || class18.oculusOrbFocalPointY >> 7 != HealthBarDefinition.localPlayer.y >> 7)) { // L: 5689 5690
			var12 = HealthBarDefinition.localPlayer.plane; // L: 5691
			var13 = (class320.oculusOrbFocalPointX >> 7) + class19.baseX; // L: 5692
			var14 = (class18.oculusOrbFocalPointY >> 7) + DefaultsGroup.baseY; // L: 5693
			InvDefinition.method2986(var13, var14, var12, true); // L: 5694
		}

	} // L: 5697
}
