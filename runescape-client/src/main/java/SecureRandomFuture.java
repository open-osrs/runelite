import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("j")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 366779581
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("h")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("v")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1052169316"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "63706826"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1655382452"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "109574038"
	)
	public static void method2205(boolean var0) {
		if (var0 != ItemComposition.ItemDefinition_inMembersWorld) { // L: 571
			TileItem.method2187(); // L: 572
			ItemComposition.ItemDefinition_inMembersWorld = var0; // L: 573
		}

	} // L: 575

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1070154541"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4304
		AttackOption.method2138(); // L: 4305
		class51.method832(); // L: 4306
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4308
			ClientPreferences.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4309
		}

		Skeleton.addNpcsToScene(true); // L: 4312
		WorldMapRectangle.method332(); // L: 4313
		Skeleton.addNpcsToScene(false); // L: 4314

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4316 4317 4334
			if (var4.plane == GameObject.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4318
				if (Client.cycle >= var4.cycleStart) { // L: 4319
					if (var4.targetIndex > 0) { // L: 4320
						NPC var33 = Client.npcs[var4.targetIndex - 1]; // L: 4321
						if (var33 != null && var33.x >= 0 && var33.x < 13312 && var33.y >= 0 && var33.y < 13312) { // L: 4322
							var4.setDestination(var33.x, var33.y, getTileHeight(var33.x, var33.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4324
						var6 = -var4.targetIndex - 1; // L: 4326
						Player var36;
						if (var6 == Client.localPlayerIndex) { // L: 4327
							var36 = PlayerComposition.localPlayer;
						} else {
							var36 = Client.players[var6]; // L: 4328
						}

						if (var36 != null && var36.x >= 0 && var36.x < 13312 && var36.y >= 0 && var36.y < 13312) { // L: 4329
							var4.setDestination(var36.x, var36.y, getTileHeight(var36.x, var36.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field850); // L: 4331
					ArchiveLoader.scene.drawEntity(GameObject.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4332
				}
			} else {
				var4.remove();
			}
		}

		WorldMapSprite.method467(); // L: 4337
		class25.setViewportShape(var0, var1, var2, var3, true); // L: 4338
		var0 = Client.viewportOffsetX; // L: 4339
		var1 = Client.viewportOffsetY; // L: 4340
		var2 = Client.viewportWidth; // L: 4341
		var3 = Client.viewportHeight; // L: 4342
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4343
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4344
		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var28;
		if (!Client.isCameraLocked) { // L: 4345
			var28 = Client.camAngleX; // L: 4346
			if (Client.field918 / 256 > var28) { // L: 4347
				var28 = Client.field918 / 256;
			}

			if (Client.field902[4] && Client.field893[4] + 128 > var28) { // L: 4348
				var28 = Client.field893[4] + 128;
			}

			var5 = Client.camAngleY & 2047; // L: 4349
			var6 = oculusOrbFocalPointX; // L: 4350
			var7 = PacketWriter.field1341; // L: 4351
			var8 = Decimator.oculusOrbFocalPointY; // L: 4352
			var9 = WorldMapManager.method704(var28); // L: 4353
			var9 = NetSocket.method3587(var9, var3); // L: 4355
			var10 = 2048 - var28 & 2047; // L: 4356
			var11 = 2048 - var5 & 2047; // L: 4357
			var12 = 0; // L: 4358
			var13 = 0; // L: 4359
			var14 = var9; // L: 4360
			int var17;
			if (var10 != 0) { // L: 4361
				var15 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4362
				var16 = Rasterizer3D.Rasterizer3D_cosine[var10]; // L: 4363
				var17 = var16 * var13 - var15 * var9 >> 16; // L: 4364
				var14 = var15 * var13 + var16 * var9 >> 16; // L: 4365
				var13 = var17; // L: 4366
			}

			if (var11 != 0) { // L: 4368
				var15 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4369
				var16 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4370
				var17 = var12 * var16 + var14 * var15 >> 16; // L: 4371
				var14 = var14 * var16 - var15 * var12 >> 16; // L: 4372
				var12 = var17; // L: 4373
			}

			Player.cameraX = var6 - var12; // L: 4375
			KeyHandler.cameraY = var7 - var13; // L: 4376
			class69.cameraZ = var8 - var14; // L: 4377
			Skeleton.cameraPitch = var28; // L: 4378
			AbstractArchive.cameraYaw = var5; // L: 4379
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (oculusOrbFocalPointX >> 7 != PlayerComposition.localPlayer.x >> 7 || Decimator.oculusOrbFocalPointY >> 7 != PlayerComposition.localPlayer.y >> 7)) { // L: 4380 4381
				var15 = PlayerComposition.localPlayer.plane; // L: 4382
				var16 = (oculusOrbFocalPointX >> 7) + NetFileRequest.baseX; // L: 4383
				var17 = (Decimator.oculusOrbFocalPointY >> 7) + class41.baseY; // L: 4384
				PacketBufferNode var18 = ItemContainer.getPacketBufferNode(ClientPacket.field2269, Client.packetWriter.isaacCipher); // L: 4387
				var18.packetBuffer.method5578(var16); // L: 4388
				var18.packetBuffer.method5587(Client.viewportColor); // L: 4389
				var18.packetBuffer.method5739(var17); // L: 4390
				var18.packetBuffer.writeByte(var15); // L: 4391
				Client.packetWriter.addNode(var18); // L: 4392
			}
		}

		if (!Client.isCameraLocked) { // L: 4399
			if (Timer.clientPreferences.roofsHidden) { // L: 4402
				var5 = GameObject.Client_plane; // L: 4403
			} else {
				label625: {
					var6 = 3; // L: 4406
					if (Skeleton.cameraPitch < 310) { // L: 4407
						if (Client.oculusOrbState == 1) { // L: 4410
							var7 = oculusOrbFocalPointX >> 7; // L: 4411
							var8 = Decimator.oculusOrbFocalPointY >> 7; // L: 4412
						} else {
							var7 = PlayerComposition.localPlayer.x >> 7; // L: 4415
							var8 = PlayerComposition.localPlayer.y >> 7; // L: 4416
						}

						var9 = Player.cameraX >> 7; // L: 4418
						var10 = class69.cameraZ >> 7; // L: 4419
						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) { // L: 4420
							var5 = GameObject.Client_plane; // L: 4421
							break label625; // L: 4422
						}

						if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) { // L: 4424
							var5 = GameObject.Client_plane; // L: 4425
							break label625; // L: 4426
						}

						if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) { // L: 4428
							var6 = GameObject.Client_plane;
						}

						if (var7 > var9) { // L: 4430
							var11 = var7 - var9;
						} else {
							var11 = var9 - var7; // L: 4431
						}

						if (var8 > var10) { // L: 4433
							var12 = var8 - var10;
						} else {
							var12 = var10 - var8; // L: 4434
						}

						if (var11 > var12) { // L: 4435
							var13 = var12 * 65536 / var11; // L: 4436
							var14 = 32768; // L: 4437

							while (var7 != var9) { // L: 4438
								if (var9 < var7) { // L: 4439
									++var9;
								} else if (var9 > var7) { // L: 4440
									--var9;
								}

								if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) { // L: 4441
									var6 = GameObject.Client_plane;
								}

								var14 += var13; // L: 4442
								if (var14 >= 65536) { // L: 4443
									var14 -= 65536; // L: 4444
									if (var10 < var8) { // L: 4445
										++var10;
									} else if (var10 > var8) { // L: 4446
										--var10;
									}

									if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) { // L: 4447
										var6 = GameObject.Client_plane;
									}
								}
							}
						} else if (var12 > 0) { // L: 4451
							var13 = var11 * 65536 / var12; // L: 4452
							var14 = 32768; // L: 4453

							while (var10 != var8) { // L: 4454
								if (var10 < var8) { // L: 4455
									++var10;
								} else if (var10 > var8) { // L: 4456
									--var10;
								}

								if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) { // L: 4457
									var6 = GameObject.Client_plane;
								}

								var14 += var13; // L: 4458
								if (var14 >= 65536) { // L: 4459
									var14 -= 65536; // L: 4460
									if (var9 < var7) { // L: 4461
										++var9;
									} else if (var9 > var7) { // L: 4462
										--var9;
									}

									if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) { // L: 4463
										var6 = GameObject.Client_plane;
									}
								}
							}
						}
					}

					if (PlayerComposition.localPlayer.x >= 0 && PlayerComposition.localPlayer.y >= 0 && PlayerComposition.localPlayer.x < 13312 && PlayerComposition.localPlayer.y < 13312) { // L: 4468
						if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][PlayerComposition.localPlayer.x >> 7][PlayerComposition.localPlayer.y >> 7] & 4) != 0) { // L: 4472
							var6 = GameObject.Client_plane;
						}

						var5 = var6; // L: 4473
					} else {
						var5 = GameObject.Client_plane; // L: 4469
					}
				}
			}

			var28 = var5; // L: 4475
		} else {
			var28 = WorldMapManager.method712(); // L: 4477
		}

		var5 = Player.cameraX; // L: 4478
		var6 = KeyHandler.cameraY; // L: 4479
		var7 = class69.cameraZ; // L: 4480
		var8 = Skeleton.cameraPitch; // L: 4481
		var9 = AbstractArchive.cameraYaw; // L: 4482

		for (var10 = 0; var10 < 5; ++var10) { // L: 4483
			if (Client.field902[var10]) { // L: 4484
				var11 = (int)(Math.random() * (double)(Client.field679[var10] * 2 + 1) - (double)Client.field679[var10] + Math.sin((double)Client.field705[var10] / 100.0D * (double)Client.field644[var10]) * (double)Client.field893[var10]); // L: 4485
				if (var10 == 0) { // L: 4486
					Player.cameraX += var11;
				}

				if (var10 == 1) { // L: 4487
					KeyHandler.cameraY += var11;
				}

				if (var10 == 2) { // L: 4488
					class69.cameraZ += var11;
				}

				if (var10 == 3) { // L: 4489
					AbstractArchive.cameraYaw = var11 + AbstractArchive.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 4490
					Skeleton.cameraPitch += var11; // L: 4491
					if (Skeleton.cameraPitch < 128) { // L: 4492
						Skeleton.cameraPitch = 128;
					}

					if (Skeleton.cameraPitch > 383) { // L: 4493
						Skeleton.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 4497
		var11 = MouseHandler.MouseHandler_y; // L: 4498
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4499
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 4500
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 4501
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 4503
			class3.method41(var10 - var0, var11 - var1); // L: 4504
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4508
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4509
		}

		FontName.playPcmPlayers(); // L: 4512
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4513
		FontName.playPcmPlayers(); // L: 4514
		var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 4515
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4516
		ArchiveLoader.scene.draw(Player.cameraX, KeyHandler.cameraY, class69.cameraZ, Skeleton.cameraPitch, AbstractArchive.cameraYaw, var28); // L: 4517
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 4518
		FontName.playPcmPlayers(); // L: 4519
		ArchiveLoader.scene.clearTempGameObjects(); // L: 4520
		Client.overheadTextCount = 0; // L: 4522
		boolean var34 = false; // L: 4523
		var14 = -1; // L: 4524
		var15 = -1; // L: 4525
		var16 = Players.Players_count; // L: 4526
		int[] var29 = Players.Players_indices; // L: 4527

		int var30;
		for (var30 = 0; var30 < var16 + Client.npcCount; ++var30) { // L: 4528
			Object var32;
			if (var30 < var16) { // L: 4530
				var32 = Client.players[var29[var30]]; // L: 4531
				if (var29[var30] == Client.combatTargetPlayerIndex) { // L: 4532
					var34 = true; // L: 4533
					var14 = var30; // L: 4534
					continue;
				}

				if (var32 == PlayerComposition.localPlayer) { // L: 4537
					var15 = var30; // L: 4538
					continue; // L: 4539
				}
			} else {
				var32 = Client.npcs[Client.npcIndices[var30 - var16]]; // L: 4542
			}

			AbstractWorldMapIcon.drawActor2d((Actor)var32, var30, var0, var1, var2, var3); // L: 4543
		}

		if (Client.renderSelf && var15 != -1) { // L: 4545
			AbstractWorldMapIcon.drawActor2d(PlayerComposition.localPlayer, var15, var0, var1, var2, var3); // L: 4546
		}

		if (var34) { // L: 4548
			AbstractWorldMapIcon.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3); // L: 4549
		}

		for (var30 = 0; var30 < Client.overheadTextCount; ++var30) { // L: 4551
			int var19 = Client.overheadTextXs[var30]; // L: 4552
			int var20 = Client.overheadTextYs[var30]; // L: 4553
			int var21 = Client.overheadTextXOffsets[var30]; // L: 4554
			int var22 = Client.overheadTextAscents[var30]; // L: 4555
			boolean var23 = true; // L: 4556

			while (var23) {
				var23 = false; // L: 4558

				for (int var31 = 0; var31 < var30; ++var31) { // L: 4559
					if (var20 + 2 > Client.overheadTextYs[var31] - Client.overheadTextAscents[var31] && var20 - var22 < Client.overheadTextYs[var31] + 2 && var19 - var21 < Client.overheadTextXOffsets[var31] + Client.overheadTextXs[var31] && var19 + var21 > Client.overheadTextXs[var31] - Client.overheadTextXOffsets[var31] && Client.overheadTextYs[var31] - Client.overheadTextAscents[var31] < var20) { // L: 4560 4561
						var20 = Client.overheadTextYs[var31] - Client.overheadTextAscents[var31]; // L: 4562
						var23 = true; // L: 4563
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var30]; // L: 4568
			Client.viewportTempY = Client.overheadTextYs[var30] = var20; // L: 4569
			String var24 = Client.overheadText[var30]; // L: 4570
			if (Client.chatEffects == 0) { // L: 4571
				int var25 = 16776960; // L: 4572
				if (Client.overheadTextColors[var30] < 6) { // L: 4573
					var25 = Client.field863[Client.overheadTextColors[var30]];
				}

				if (Client.overheadTextColors[var30] == 6) { // L: 4574
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var30] == 7) { // L: 4575
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var30] == 8) { // L: 4576
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var30] == 9) { // L: 4577
					var26 = 150 - Client.overheadTextCyclesRemaining[var30]; // L: 4578
					if (var26 < 50) { // L: 4579
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) { // L: 4580
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) { // L: 4581
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var30] == 10) { // L: 4583
					var26 = 150 - Client.overheadTextCyclesRemaining[var30]; // L: 4584
					if (var26 < 50) { // L: 4585
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) { // L: 4586
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) { // L: 4587
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var30] == 11) { // L: 4589
					var26 = 150 - Client.overheadTextCyclesRemaining[var30]; // L: 4590
					if (var26 < 50) { // L: 4591
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) { // L: 4592
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) { // L: 4593
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var30] == 0) { // L: 4595
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var30] == 1) { // L: 4596
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var30] == 2) { // L: 4597
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var30] == 3) { // L: 4598
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var30]);
				}

				if (Client.overheadTextEffects[var30] == 4) { // L: 4599
					var26 = (150 - Client.overheadTextCyclesRemaining[var30]) * (GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth(var24) + 100) / 150; // L: 4600
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4601
					GrandExchangeOfferTotalQuantityComparator.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0); // L: 4602
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4603
				}

				if (Client.overheadTextEffects[var30] == 5) { // L: 4605
					var26 = 150 - Client.overheadTextCyclesRemaining[var30]; // L: 4606
					int var27 = 0; // L: 4607
					if (var26 < 25) { // L: 4608
						var27 = var26 - 25;
					} else if (var26 > 125) { // L: 4609
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - GrandExchangeOfferTotalQuantityComparator.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4610
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0); // L: 4611
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4612
				}
			} else {
				GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4616
			}
		}

		if (Client.hintArrowType == 2) { // L: 4621
			GrandExchangeOffer.worldToScreen((Client.hintArrowX - NetFileRequest.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - class41.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4622
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4623
				AbstractWorldMapIcon.headIconHintSpritePixels[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field850); // L: 4625
		class231.method4153(); // L: 4627
		Player.cameraX = var5; // L: 4629
		KeyHandler.cameraY = var6; // L: 4630
		class69.cameraZ = var7; // L: 4631
		Skeleton.cameraPitch = var8; // L: 4632
		AbstractArchive.cameraYaw = var9; // L: 4633
		if (Client.isLoading) { // L: 4634
			byte var35 = 0; // L: 4637
			var14 = var35 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4638
			if (var14 == 0) { // L: 4642
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4644
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4645
			Varps.drawLoadingMessage("Loading - please wait.", false); // L: 4646
		}

	} // L: 4648

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1783095333"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5274
		int var4 = var1 >> 7; // L: 5275
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5276
			int var5 = var2; // L: 5277
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5278
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5279
			int var7 = var1 & 127; // L: 5280
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 5281
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5282
			return var8 * (128 - var7) + var9 * var7 >> 7; // L: 5283
		} else {
			return 0;
		}
	}
}
