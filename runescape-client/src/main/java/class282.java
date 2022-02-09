import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jt")
public class class282 {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "884747568"
	)
	static int method5358(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1182
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1183
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1184
			return 1; // L: 1185
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1187
			if (var3.itemId != -1) { // L: 1188
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1189
			}

			return 1; // L: 1190
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1192
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1193
			return 1; // L: 1194
		} else {
			return 2; // L: 1196
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-602520262"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class133.logOut(); // L: 2759
		switch(var0) { // L: 2760
		case 1:
			class374.method6776(); // L: 2763
			break;
		case 2:
			Player.method2159(24); // L: 2769
			UserComparator7.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2770
		}

	} // L: 2775

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-983073929"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4266
		if (WorldMapSprite.localPlayer.x >> 7 == Client.destinationX && WorldMapSprite.localPlayer.y >> 7 == Client.destinationY) { // L: 4268
			Client.destinationX = 0; // L: 4269
		}

		if (Client.renderSelf) { // L: 4273
			AbstractWorldMapData.addPlayerToScene(WorldMapSprite.localPlayer, false); // L: 4274
		}

		NetFileRequest.method5572(); // L: 4277
		PacketBufferNode.addNpcsToScene(true); // L: 4278
		int var4 = Players.Players_count; // L: 4280
		int[] var5 = Players.Players_indices; // L: 4281

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4282
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4283
				AbstractWorldMapData.addPlayerToScene(Client.players[var5[var6]], true); // L: 4284
			}
		}

		PacketBufferNode.addNpcsToScene(false); // L: 4287

		for (Projectile var36 = (Projectile)Client.projectiles.last(); var36 != null; var36 = (Projectile)Client.projectiles.previous()) { // L: 4289 4290 4307
			if (var36.plane == SoundSystem.Client_plane && Client.cycle <= var36.cycleEnd) { // L: 4291
				if (Client.cycle >= var36.cycleStart) { // L: 4292
					if (var36.targetIndex > 0) { // L: 4293
						NPC var40 = Client.npcs[var36.targetIndex - 1]; // L: 4294
						if (var40 != null && var40.x >= 0 && var40.x < 13312 && var40.y >= 0 && var40.y < 13312) { // L: 4295
							var36.setDestination(var40.x, var40.y, class92.getTileHeight(var40.x, var40.y, var36.plane) - var36.endHeight, Client.cycle);
						}
					}

					if (var36.targetIndex < 0) { // L: 4297
						var6 = -var36.targetIndex - 1; // L: 4299
						Player var41;
						if (var6 == Client.localPlayerIndex) { // L: 4300
							var41 = WorldMapSprite.localPlayer;
						} else {
							var41 = Client.players[var6]; // L: 4301
						}

						if (var41 != null && var41.x >= 0 && var41.x < 13312 && var41.y >= 0 && var41.y < 13312) { // L: 4302
							var36.setDestination(var41.x, var41.y, class92.getTileHeight(var41.x, var41.y, var36.plane) - var36.endHeight, Client.cycle);
						}
					}

					var36.advance(Client.field566); // L: 4304
					Decimator.scene.drawEntity(SoundSystem.Client_plane, (int)var36.x, (int)var36.y, (int)var36.z, 60, var36, var36.yaw, -1L, false); // L: 4305
				}
			} else {
				var36.remove();
			}
		}

		ClientPacket.method4978(); // L: 4310
		class124.setViewportShape(var0, var1, var2, var3, true); // L: 4311
		var0 = Client.viewportOffsetX; // L: 4312
		var1 = Client.viewportOffsetY; // L: 4313
		var2 = Client.viewportWidth; // L: 4314
		var3 = Client.viewportHeight; // L: 4315
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4316
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4317
		var4 = Client.camAngleX; // L: 4318
		if (Client.field590 / 256 > var4) { // L: 4319
			var4 = Client.field590 / 256;
		}

		if (Client.field753[4] && Client.field733[4] + 128 > var4) { // L: 4320
			var4 = Client.field733[4] + 128;
		}

		int var37 = Client.camAngleY & 2047; // L: 4321
		var6 = class29.oculusOrbFocalPointX; // L: 4322
		int var7 = SpriteMask.field3218; // L: 4323
		int var8 = class121.oculusOrbFocalPointY; // L: 4324
		int var11 = var4 * 3 + 600; // L: 4329
		InterfaceParent.method2084(var6, var7, var8, var4, var37, var11, var3); // L: 4331
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		if (!Client.isCameraLocked) { // L: 4333
			if (class424.clientPreferences.roofsHidden) { // L: 4336
				var13 = SoundSystem.Client_plane; // L: 4337
			} else {
				label630: {
					var14 = 3; // L: 4340
					if (class7.cameraPitch < 310) { // L: 4341
						if (Client.oculusOrbState == 1) { // L: 4344
							var15 = class29.oculusOrbFocalPointX >> 7; // L: 4345
							var16 = class121.oculusOrbFocalPointY >> 7; // L: 4346
						} else {
							var15 = WorldMapSprite.localPlayer.x >> 7; // L: 4349
							var16 = WorldMapSprite.localPlayer.y >> 7; // L: 4350
						}

						var17 = class414.cameraX >> 7; // L: 4352
						var18 = GrandExchangeOfferOwnWorldComparator.cameraZ >> 7; // L: 4353
						if (var17 < 0 || var18 < 0 || var17 >= 104 || var18 >= 104) { // L: 4354
							var13 = SoundSystem.Client_plane; // L: 4355
							break label630; // L: 4356
						}

						if (var15 < 0 || var16 < 0 || var15 >= 104 || var16 >= 104) { // L: 4358
							var13 = SoundSystem.Client_plane; // L: 4359
							break label630; // L: 4360
						}

						if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) { // L: 4362
							var14 = SoundSystem.Client_plane;
						}

						if (var15 > var17) { // L: 4364
							var19 = var15 - var17;
						} else {
							var19 = var17 - var15; // L: 4365
						}

						if (var16 > var18) { // L: 4367
							var20 = var16 - var18;
						} else {
							var20 = var18 - var16; // L: 4368
						}

						if (var19 > var20) { // L: 4369
							var21 = var20 * 65536 / var19; // L: 4370
							var22 = 32768; // L: 4371

							while (var17 != var15) { // L: 4372
								if (var17 < var15) { // L: 4373
									++var17;
								} else if (var17 > var15) { // L: 4374
									--var17;
								}

								if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) { // L: 4375
									var14 = SoundSystem.Client_plane;
								}

								var22 += var21; // L: 4376
								if (var22 >= 65536) { // L: 4377
									var22 -= 65536; // L: 4378
									if (var18 < var16) { // L: 4379
										++var18;
									} else if (var18 > var16) { // L: 4380
										--var18;
									}

									if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) { // L: 4381
										var14 = SoundSystem.Client_plane;
									}
								}
							}
						} else if (var20 > 0) { // L: 4385
							var21 = var19 * 65536 / var20; // L: 4386
							var22 = 32768; // L: 4387

							while (var18 != var16) { // L: 4388
								if (var18 < var16) { // L: 4389
									++var18;
								} else if (var18 > var16) { // L: 4390
									--var18;
								}

								if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) { // L: 4391
									var14 = SoundSystem.Client_plane;
								}

								var22 += var21; // L: 4392
								if (var22 >= 65536) { // L: 4393
									var22 -= 65536; // L: 4394
									if (var17 < var15) { // L: 4395
										++var17;
									} else if (var17 > var15) { // L: 4396
										--var17;
									}

									if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var17][var18] & 4) != 0) { // L: 4397
										var14 = SoundSystem.Client_plane;
									}
								}
							}
						}
					}

					if (WorldMapSprite.localPlayer.x >= 0 && WorldMapSprite.localPlayer.y >= 0 && WorldMapSprite.localPlayer.x < 13312 && WorldMapSprite.localPlayer.y < 13312) { // L: 4402
						if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][WorldMapSprite.localPlayer.x >> 7][WorldMapSprite.localPlayer.y >> 7] & 4) != 0) { // L: 4406
							var14 = SoundSystem.Client_plane;
						}

						var13 = var14; // L: 4407
					} else {
						var13 = SoundSystem.Client_plane; // L: 4403
					}
				}
			}

			var12 = var13; // L: 4409
		} else {
			if (class424.clientPreferences.roofsHidden) { // L: 4414
				var13 = SoundSystem.Client_plane; // L: 4415
			} else {
				var14 = class92.getTileHeight(class414.cameraX, GrandExchangeOfferOwnWorldComparator.cameraZ, SoundSystem.Client_plane); // L: 4418
				if (var14 - WorldMapDecoration.cameraY < 800 && (Tiles.Tiles_renderFlags[SoundSystem.Client_plane][class414.cameraX >> 7][GrandExchangeOfferOwnWorldComparator.cameraZ >> 7] & 4) != 0) { // L: 4419
					var13 = SoundSystem.Client_plane; // L: 4420
				} else {
					var13 = 3; // L: 4423
				}
			}

			var12 = var13; // L: 4425
		}

		var13 = class414.cameraX; // L: 4427
		var14 = WorldMapDecoration.cameraY; // L: 4428
		var15 = GrandExchangeOfferOwnWorldComparator.cameraZ; // L: 4429
		var16 = class7.cameraPitch; // L: 4430
		var17 = class7.cameraYaw; // L: 4431

		for (var18 = 0; var18 < 5; ++var18) { // L: 4432
			if (Client.field753[var18]) { // L: 4433
				var19 = (int)(Math.random() * (double)(Client.field754[var18] * 2 + 1) - (double)Client.field754[var18] + Math.sin((double)Client.field757[var18] * ((double)Client.field500[var18] / 100.0D)) * (double)Client.field733[var18]); // L: 4434
				if (var18 == 0) { // L: 4435
					class414.cameraX += var19;
				}

				if (var18 == 1) { // L: 4436
					WorldMapDecoration.cameraY += var19;
				}

				if (var18 == 2) { // L: 4437
					GrandExchangeOfferOwnWorldComparator.cameraZ += var19;
				}

				if (var18 == 3) { // L: 4438
					class7.cameraYaw = var19 + class7.cameraYaw & 2047;
				}

				if (var18 == 4) { // L: 4439
					class7.cameraPitch += var19; // L: 4440
					if (class7.cameraPitch < 128) { // L: 4441
						class7.cameraPitch = 128;
					}

					if (class7.cameraPitch > 383) { // L: 4442
						class7.cameraPitch = 383;
					}
				}
			}
		}

		var18 = MouseHandler.MouseHandler_x; // L: 4446
		var19 = MouseHandler.MouseHandler_y; // L: 4447
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4448
			var18 = MouseHandler.MouseHandler_lastPressedX; // L: 4449
			var19 = MouseHandler.MouseHandler_lastPressedY; // L: 4450
		}

		if (var18 >= var0 && var18 < var0 + var2 && var19 >= var1 && var19 < var3 + var1) { // L: 4452
			var20 = var18 - var0; // L: 4453
			var21 = var19 - var1; // L: 4454
			ViewportMouse.ViewportMouse_x = var20; // L: 4456
			ViewportMouse.ViewportMouse_y = var21; // L: 4457
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4458
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4459
			ViewportMouse.ViewportMouse_false0 = false; // L: 4460
		} else {
			class18.method260(); // L: 4464
		}

		class122.playPcmPlayers(); // L: 4466
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4467
		class122.playPcmPlayers(); // L: 4468
		var20 = Rasterizer3D.Rasterizer3D_zoom; // L: 4469
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4470
		Decimator.scene.draw(class414.cameraX, WorldMapDecoration.cameraY, GrandExchangeOfferOwnWorldComparator.cameraZ, class7.cameraPitch, class7.cameraYaw, var12); // L: 4471
		Rasterizer3D.Rasterizer3D_zoom = var20; // L: 4472
		class122.playPcmPlayers(); // L: 4473
		Decimator.scene.clearTempGameObjects(); // L: 4474
		Client.overheadTextCount = 0; // L: 4476
		boolean var42 = false; // L: 4477
		var22 = -1; // L: 4478
		int var23 = -1; // L: 4479
		int var24 = Players.Players_count; // L: 4480
		int[] var25 = Players.Players_indices; // L: 4481

		int var26;
		for (var26 = 0; var26 < var24 + Client.npcCount; ++var26) { // L: 4482
			Object var39;
			if (var26 < var24) { // L: 4484
				var39 = Client.players[var25[var26]]; // L: 4485
				if (var25[var26] == Client.combatTargetPlayerIndex) { // L: 4486
					var42 = true; // L: 4487
					var22 = var26; // L: 4488
					continue;
				}

				if (var39 == WorldMapSprite.localPlayer) { // L: 4491
					var23 = var26; // L: 4492
					continue; // L: 4493
				}
			} else {
				var39 = Client.npcs[Client.npcIndices[var26 - var24]]; // L: 4496
			}

			class19.drawActor2d((Actor)var39, var26, var0, var1, var2, var3); // L: 4497
		}

		if (Client.renderSelf && var23 != -1) { // L: 4499
			class19.drawActor2d(WorldMapSprite.localPlayer, var23, var0, var1, var2, var3); // L: 4500
		}

		if (var42) { // L: 4502
			class19.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var22, var0, var1, var2, var3); // L: 4503
		}

		for (var26 = 0; var26 < Client.overheadTextCount; ++var26) { // L: 4505
			int var27 = Client.overheadTextXs[var26]; // L: 4506
			int var28 = Client.overheadTextYs[var26]; // L: 4507
			int var29 = Client.overheadTextXOffsets[var26]; // L: 4508
			int var30 = Client.overheadTextAscents[var26]; // L: 4509
			boolean var31 = true; // L: 4510

			while (var31) {
				var31 = false; // L: 4512

				for (int var38 = 0; var38 < var26; ++var38) { // L: 4513
					if (var28 + 2 > Client.overheadTextYs[var38] - Client.overheadTextAscents[var38] && var28 - var30 < Client.overheadTextYs[var38] + 2 && var27 - var29 < Client.overheadTextXOffsets[var38] + Client.overheadTextXs[var38] && var27 + var29 > Client.overheadTextXs[var38] - Client.overheadTextXOffsets[var38] && Client.overheadTextYs[var38] - Client.overheadTextAscents[var38] < var28) { // L: 4514 4515
						var28 = Client.overheadTextYs[var38] - Client.overheadTextAscents[var38]; // L: 4516
						var31 = true; // L: 4517
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var26]; // L: 4522
			Client.viewportTempY = Client.overheadTextYs[var26] = var28; // L: 4523
			String var32 = Client.overheadText[var26]; // L: 4524
			if (Client.chatEffects == 0) { // L: 4525
				int var33 = 16776960; // L: 4526
				if (Client.overheadTextColors[var26] < 6) { // L: 4527
					var33 = Client.field723[Client.overheadTextColors[var26]];
				}

				if (Client.overheadTextColors[var26] == 6) { // L: 4528
					var33 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var26] == 7) { // L: 4529
					var33 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var26] == 8) { // L: 4530
					var33 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var34;
				if (Client.overheadTextColors[var26] == 9) { // L: 4531
					var34 = 150 - Client.overheadTextCyclesRemaining[var26]; // L: 4532
					if (var34 < 50) { // L: 4533
						var33 = var34 * 1280 + 16711680;
					} else if (var34 < 100) { // L: 4534
						var33 = 16776960 - (var34 - 50) * 327680;
					} else if (var34 < 150) { // L: 4535
						var33 = (var34 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var26] == 10) { // L: 4537
					var34 = 150 - Client.overheadTextCyclesRemaining[var26]; // L: 4538
					if (var34 < 50) { // L: 4539
						var33 = var34 * 5 + 16711680;
					} else if (var34 < 100) { // L: 4540
						var33 = 16711935 - (var34 - 50) * 327680;
					} else if (var34 < 150) { // L: 4541
						var33 = (var34 - 100) * 327680 + 255 - (var34 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var26] == 11) { // L: 4543
					var34 = 150 - Client.overheadTextCyclesRemaining[var26]; // L: 4544
					if (var34 < 50) { // L: 4545
						var33 = 16777215 - var34 * 327685;
					} else if (var34 < 100) { // L: 4546
						var33 = (var34 - 50) * 327685 + 65280;
					} else if (var34 < 150) { // L: 4547
						var33 = 16777215 - (var34 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var26] == 0) { // L: 4549
					class408.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0);
				}

				if (Client.overheadTextEffects[var26] == 1) { // L: 4550
					class408.fontBold12.drawCenteredWave(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var26] == 2) { // L: 4551
					class408.fontBold12.drawCenteredWave2(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var26] == 3) { // L: 4552
					class408.fontBold12.drawCenteredShake(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var26]);
				}

				if (Client.overheadTextEffects[var26] == 4) { // L: 4553
					var34 = (150 - Client.overheadTextCyclesRemaining[var26]) * (class408.fontBold12.stringWidth(var32) + 100) / 150; // L: 4554
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4555
					class408.fontBold12.draw(var32, var0 + Client.viewportTempX + 50 - var34, Client.viewportTempY + var1, var33, 0); // L: 4556
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4557
				}

				if (Client.overheadTextEffects[var26] == 5) { // L: 4559
					var34 = 150 - Client.overheadTextCyclesRemaining[var26]; // L: 4560
					int var35 = 0; // L: 4561
					if (var34 < 25) { // L: 4562
						var35 = var34 - 25;
					} else if (var34 > 125) { // L: 4563
						var35 = var34 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class408.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4564
					class408.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, var35 + Client.viewportTempY + var1, var33, 0); // L: 4565
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4566
				}
			} else {
				class408.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4570
			}
		}

		class371.method6674(var0, var1); // L: 4574
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field566); // L: 4575
		SoundCache.method785(); // L: 4577
		class414.cameraX = var13; // L: 4579
		WorldMapDecoration.cameraY = var14; // L: 4580
		GrandExchangeOfferOwnWorldComparator.cameraZ = var15; // L: 4581
		class7.cameraPitch = var16; // L: 4582
		class7.cameraYaw = var17; // L: 4583
		if (Client.isLoading) { // L: 4584
			byte var43 = 0; // L: 4587
			var22 = var43 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4588
			if (var22 == 0) { // L: 4592
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4594
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4595
			Calendar.drawLoadingMessage("Loading - please wait.", false); // L: 4596
		}

	} // L: 4598
}
