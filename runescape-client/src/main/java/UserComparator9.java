import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1946098059
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;B)I",
		garbageValue = "6"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lns;II)V",
		garbageValue = "798107312"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		AbstractArchive.method5160(var0); // L: 73

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 75
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 76
			Player var5 = Client.players[var4]; // L: 77
			int var6 = var0.readUnsignedByte(); // L: 78
			if ((var6 & 128) != 0) { // L: 79
				var6 += var0.readUnsignedByte() << 8;
			}

			method2561(var0, var4, var5, var6); // L: 80
		}

		if (var0.offset - var2 != var1) { // L: 83
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 84
		}
	} // L: 86

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lns;ILcj;II)V",
		garbageValue = "1472974577"
	)
	static final void method2561(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = -1; // L: 453
		int var5;
		if ((var3 & 4) != 0) { // L: 454
			var5 = var0.readUnsignedByte(); // L: 455
			byte[] var6 = new byte[var5]; // L: 456
			Buffer var7 = new Buffer(var6); // L: 457
			var0.method6821(var6, 0, var5); // L: 458
			Players.field1362[var1] = var7; // L: 459
			var2.read(var7); // L: 460
		}

		int var8;
		int var9;
		int var12;
		int var13;
		if ((var3 & 2) != 0) { // L: 462
			var5 = var0.readUnsignedByte(); // L: 463
			int var10;
			int var14;
			int var15;
			if (var5 > 0) { // L: 464
				for (var13 = 0; var13 < var5; ++var13) { // L: 465
					var8 = -1; // L: 467
					var9 = -1; // L: 468
					var10 = -1; // L: 469
					var14 = var0.readUShortSmart(); // L: 470
					if (var14 == 32767) { // L: 471
						var14 = var0.readUShortSmart(); // L: 472
						var9 = var0.readUShortSmart(); // L: 473
						var8 = var0.readUShortSmart(); // L: 474
						var10 = var0.readUShortSmart(); // L: 475
					} else if (var14 != 32766) { // L: 477
						var9 = var0.readUShortSmart(); // L: 478
					} else {
						var14 = -1; // L: 480
					}

					var15 = var0.readUShortSmart(); // L: 481
					var2.addHitSplat(var14, var9, var8, var10, Client.cycle, var15); // L: 482
				}
			}

			var13 = var0.method6643(); // L: 485
			if (var13 > 0) { // L: 486
				for (var14 = 0; var14 < var13; ++var14) { // L: 487
					var8 = var0.readUShortSmart(); // L: 488
					var9 = var0.readUShortSmart(); // L: 489
					if (var9 != 32767) { // L: 490
						var10 = var0.readUShortSmart(); // L: 491
						var15 = var0.method6643(); // L: 492
						var12 = var9 > 0 ? var0.readUnsignedByte() : var15; // L: 493
						var2.addHealthBar(var8, Client.cycle, var9, var10, var15, var12); // L: 494
					} else {
						var2.removeHealthBar(var8); // L: 496
					}
				}
			}
		}

		if ((var3 & 2048) != 0) { // L: 500
			for (var5 = 0; var5 < 3; ++var5) { // L: 501
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 512) != 0) { // L: 503
			var2.spotAnimation = var0.readUnsignedShort(); // L: 504
			var5 = var0.method6675(); // L: 505
			var2.field1263 = var5 >> 16; // L: 506
			var2.field1262 = (var5 & 65535) + Client.cycle; // L: 507
			var2.spotAnimationFrame = 0; // L: 508
			var2.spotAnimationFrameCycle = 0; // L: 509
			if (var2.field1262 > Client.cycle) { // L: 510
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 511
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 8) != 0) { // L: 513
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 514
			if (var2.overheadText.charAt(0) == '~') { // L: 515
				var2.overheadText = var2.overheadText.substring(1); // L: 516
				UserComparator10.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 517
			} else if (var2 == class262.localPlayer) { // L: 519
				UserComparator10.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 520
			}

			var2.isAutoChatting = false; // L: 522
			var2.overheadTextColor = 0; // L: 523
			var2.overheadTextEffect = 0; // L: 524
			var2.overheadTextCyclesRemaining = 150; // L: 525
		}

		if ((var3 & 64) != 0) { // L: 527
			var5 = var0.method6653(); // L: 528
			PlayerType var16 = (PlayerType)Clock.findEnumerated(class106.PlayerType_values(), var0.method6644()); // L: 529
			boolean var19 = var0.method6644() == 1; // L: 530
			var8 = var0.method6644(); // L: 531
			var9 = var0.offset; // L: 532
			if (var2.username != null && var2.appearance != null) { // L: 533
				boolean var18 = false; // L: 534
				if (var16.isUser && DevicePcmPlayerProvider.friendSystem.isIgnored(var2.username)) { // L: 535 536
					var18 = true;
				}

				if (!var18 && Client.field629 == 0 && !var2.isHidden) { // L: 538
					Players.field1373.offset = 0; // L: 539
					var0.method6821(Players.field1373.array, 0, var8); // L: 540
					Players.field1373.offset = 0; // L: 541
					String var11 = AbstractFont.escapeBrackets(GrandExchangeEvents.method5182(WorldMapIcon_1.method3304(Players.field1373))); // L: 542
					var2.overheadText = var11.trim(); // L: 543
					var2.overheadTextColor = var5 >> 8; // L: 544
					var2.overheadTextEffect = var5 & 255; // L: 545
					var2.overheadTextCyclesRemaining = 150; // L: 546
					var2.isAutoChatting = var19; // L: 547
					var2.field1253 = var2 != class262.localPlayer && var16.isUser && "" != Client.field642 && var11.toLowerCase().indexOf(Client.field642) == -1; // L: 548
					if (var16.isPrivileged) { // L: 550
						var12 = var19 ? 91 : 1;
					} else {
						var12 = var19 ? 90 : 2; // L: 551
					}

					if (var16.modIcon != -1) { // L: 552
						UserComparator10.addGameMessage(var12, MusicPatchPcmStream.method4743(var16.modIcon) + var2.username.getName(), var11);
					} else {
						UserComparator10.addGameMessage(var12, var2.username.getName(), var11); // L: 553
					}
				}
			}

			var0.offset = var8 + var9; // L: 556
		}

		if ((var3 & 16) != 0) { // L: 558
			var2.targetIndex = var0.method6652(); // L: 559
			if (var2.targetIndex == 65535) { // L: 560
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 4096) != 0) { // L: 562
			Players.field1361[var1] = var0.method6619(); // L: 563
		}

		if ((var3 & 32) != 0) { // L: 565
			var5 = var0.method6651(); // L: 566
			if (var5 == 65535) { // L: 567
				var5 = -1;
			}

			var13 = var0.readUnsignedByte(); // L: 568
			World.performPlayerAnimation(var2, var5, var13); // L: 569
		}

		if ((var3 & 8192) != 0) { // L: 571
			var2.field1264 = var0.readByte(); // L: 572
			var2.field1268 = var0.method6682(); // L: 573
			var2.field1265 = var0.readByte(); // L: 574
			var2.field1267 = var0.method6682(); // L: 575
			var2.field1276 = var0.method6653() + Client.cycle; // L: 576
			var2.field1269 = var0.method6652() + Client.cycle; // L: 577
			var2.field1270 = var0.method6653(); // L: 578
			if (var2.field1201) { // L: 579
				var2.field1264 += var2.tileX; // L: 580
				var2.field1268 += var2.tileY; // L: 581
				var2.field1265 += var2.tileX; // L: 582
				var2.field1267 += var2.tileY; // L: 583
				var2.pathLength = 0; // L: 584
			} else {
				var2.field1264 += var2.pathX[0]; // L: 587
				var2.field1268 += var2.pathY[0]; // L: 588
				var2.field1265 += var2.pathX[0]; // L: 589
				var2.field1267 += var2.pathY[0]; // L: 590
				var2.pathLength = 1; // L: 591
			}

			var2.field1281 = 0; // L: 593
		}

		if ((var3 & 256) != 0) { // L: 595
			var4 = var0.method6619(); // L: 596
		}

		if ((var3 & 1) != 0) { // L: 598
			var2.field1280 = var0.method6652(); // L: 599
			if (var2.pathLength == 0) { // L: 600
				var2.orientation = var2.field1280; // L: 601
				var2.field1280 = -1; // L: 602
			}
		}

		if (var2.field1201) { // L: 605
			if (var4 == 127) { // L: 606
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				byte var17;
				if (var4 != -1) { // L: 609
					var17 = var4;
				} else {
					var17 = Players.field1361[var1]; // L: 610
				}

				var2.method2217(var2.tileX, var2.tileY, var17); // L: 611
			}
		}

	} // L: 615

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1473289711"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4524
		if (class262.localPlayer.x >> 7 == Client.destinationX && class262.localPlayer.y >> 7 == Client.destinationY) { // L: 4526
			Client.destinationX = 0; // L: 4527
		}

		class15.method238(); // L: 4530
		MouseHandler.method741(); // L: 4531
		DevicePcmPlayerProvider.addNpcsToScene(true); // L: 4532
		int var4 = Players.Players_count; // L: 4534
		int[] var5 = Players.Players_indices; // L: 4535

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4536
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4537
				class160.addPlayerToScene(Client.players[var5[var6]], true); // L: 4538
			}
		}

		DevicePcmPlayerProvider.addNpcsToScene(false); // L: 4541
		MusicPatchPcmStream.method4762(); // L: 4542

		for (GraphicsObject var15 = (GraphicsObject)Client.graphicsObjects.last(); var15 != null; var15 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4544 4545 4552
			if (var15.plane == SoundSystem.Client_plane && !var15.isFinished) { // L: 4546
				if (Client.cycle >= var15.cycleStart) { // L: 4547
					var15.advance(Client.field683); // L: 4548
					if (var15.isFinished) { // L: 4549
						var15.remove();
					} else {
						DevicePcmPlayerProvider.scene.drawEntity(var15.plane, var15.x, var15.y, var15.height, 60, var15, 0, -1L, false); // L: 4550
					}
				}
			} else {
				var15.remove();
			}
		}

		Interpreter.setViewportShape(var0, var1, var2, var3, true); // L: 4555
		var0 = Client.viewportOffsetX; // L: 4556
		var1 = Client.viewportOffsetY; // L: 4557
		var2 = Client.viewportWidth; // L: 4558
		var3 = Client.viewportHeight; // L: 4559
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4560
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4561
		int var16;
		if (!Client.isCameraLocked) { // L: 4562
			var4 = Client.camAngleX; // L: 4563
			if (Client.field708 / 256 > var4) { // L: 4564
				var4 = Client.field708 / 256;
			}

			if (Client.field871[4] && Client.field873[4] + 128 > var4) { // L: 4565
				var4 = Client.field873[4] + 128;
			}

			var16 = Client.camAngleY & 2047; // L: 4566
			VerticalAlignment.method2889(FriendSystem.oculusOrbFocalPointX, class14.field124, VarbitComposition.oculusOrbFocalPointY, var4, var16, NetSocket.method2676(var4), var3); // L: 4567
		}

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		if (!Client.isCameraLocked) { // L: 4570
			if (class4.clientPreferences.roofsHidden) { // L: 4573
				var16 = SoundSystem.Client_plane; // L: 4574
			} else {
				label342: {
					var6 = 3; // L: 4577
					if (class69.cameraPitch < 310) { // L: 4578
						label340: {
							if (Client.oculusOrbState == 1) { // L: 4581
								var7 = FriendSystem.oculusOrbFocalPointX >> 7; // L: 4582
								var8 = VarbitComposition.oculusOrbFocalPointY >> 7; // L: 4583
							} else {
								var7 = class262.localPlayer.x >> 7; // L: 4586
								var8 = class262.localPlayer.y >> 7; // L: 4587
							}

							var9 = ObjectSound.cameraX >> 7; // L: 4589
							var10 = Canvas.cameraZ >> 7; // L: 4590
							if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 4591
								if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 4595
									if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) { // L: 4599
										var6 = SoundSystem.Client_plane;
									}

									if (var7 > var9) { // L: 4601
										var11 = var7 - var9;
									} else {
										var11 = var9 - var7; // L: 4602
									}

									if (var8 > var10) { // L: 4604
										var12 = var8 - var10;
									} else {
										var12 = var10 - var8; // L: 4605
									}

									int var13;
									int var14;
									if (var11 > var12) { // L: 4606
										var13 = var12 * 65536 / var11; // L: 4607
										var14 = 32768; // L: 4608

										while (true) {
											if (var7 == var9) { // L: 4609
												break label340;
											}

											if (var9 < var7) { // L: 4610
												++var9;
											} else if (var9 > var7) { // L: 4611
												--var9;
											}

											if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) { // L: 4612
												var6 = SoundSystem.Client_plane;
											}

											var14 += var13; // L: 4613
											if (var14 >= 65536) { // L: 4614
												var14 -= 65536; // L: 4615
												if (var10 < var8) { // L: 4616
													++var10;
												} else if (var10 > var8) { // L: 4617
													--var10;
												}

												if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) { // L: 4618
													var6 = SoundSystem.Client_plane;
												}
											}
										}
									} else {
										if (var12 > 0) { // L: 4622
											var13 = var11 * 65536 / var12; // L: 4623
											var14 = 32768; // L: 4624

											while (var8 != var10) { // L: 4625
												if (var10 < var8) { // L: 4626
													++var10;
												} else if (var10 > var8) { // L: 4627
													--var10;
												}

												if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) { // L: 4628
													var6 = SoundSystem.Client_plane;
												}

												var14 += var13; // L: 4629
												if (var14 >= 65536) { // L: 4630
													var14 -= 65536; // L: 4631
													if (var9 < var7) { // L: 4632
														++var9;
													} else if (var9 > var7) { // L: 4633
														--var9;
													}

													if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][var9][var10] & 4) != 0) { // L: 4634
														var6 = SoundSystem.Client_plane;
													}
												}
											}
										}
										break label340;
									}
								}

								var16 = SoundSystem.Client_plane; // L: 4596
								break label342; // L: 4597
							}

							var16 = SoundSystem.Client_plane; // L: 4592
							break label342; // L: 4593
						}
					}

					if (class262.localPlayer.x >= 0 && class262.localPlayer.y >= 0 && class262.localPlayer.x < 13312 && class262.localPlayer.y < 13312) { // L: 4639
						if ((Tiles.Tiles_renderFlags[SoundSystem.Client_plane][class262.localPlayer.x >> 7][class262.localPlayer.y >> 7] & 4) != 0) { // L: 4643
							var6 = SoundSystem.Client_plane;
						}

						var16 = var6; // L: 4644
					} else {
						var16 = SoundSystem.Client_plane; // L: 4640
					}
				}
			}

			var4 = var16; // L: 4646
		} else {
			var4 = class106.method2372(); // L: 4648
		}

		var16 = ObjectSound.cameraX; // L: 4649
		var6 = class160.cameraY; // L: 4650
		var7 = Canvas.cameraZ; // L: 4651
		var8 = class69.cameraPitch; // L: 4652
		var9 = class32.cameraYaw; // L: 4653

		for (var10 = 0; var10 < 5; ++var10) { // L: 4654
			if (Client.field871[var10]) { // L: 4655
				var11 = (int)(Math.random() * (double)(Client.field872[var10] * 2 + 1) - (double)Client.field872[var10] + Math.sin((double)Client.field875[var10] * ((double)Client.field867[var10] / 100.0D)) * (double)Client.field873[var10]); // L: 4656
				if (var10 == 0) { // L: 4657
					ObjectSound.cameraX += var11;
				}

				if (var10 == 1) { // L: 4658
					class160.cameraY += var11;
				}

				if (var10 == 2) { // L: 4659
					Canvas.cameraZ += var11;
				}

				if (var10 == 3) { // L: 4660
					class32.cameraYaw = var11 + class32.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 4661
					class69.cameraPitch += var11; // L: 4662
					if (class69.cameraPitch < 128) { // L: 4663
						class69.cameraPitch = 128;
					}

					if (class69.cameraPitch > 383) { // L: 4664
						class69.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 4668
		var11 = MouseHandler.MouseHandler_y; // L: 4669
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4670
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 4671
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 4672
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 4674
			class25.method339(var10 - var0, var11 - var1); // L: 4675
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4679
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4680
		}

		class233.playPcmPlayers(); // L: 4683
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4684
		class233.playPcmPlayers(); // L: 4685
		var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 4686
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4687
		DevicePcmPlayerProvider.scene.draw(ObjectSound.cameraX, class160.cameraY, Canvas.cameraZ, class69.cameraPitch, class32.cameraYaw, var4); // L: 4688
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 4689
		class233.playPcmPlayers(); // L: 4690
		DevicePcmPlayerProvider.scene.clearTempGameObjects(); // L: 4691
		WorldMapDecoration.method3710(var0, var1, var2, var3); // L: 4692
		if (Client.hintArrowType == 2) { // L: 4694
			ClanChannel.worldToScreen((Client.hintArrowX - class15.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - WorldMapSprite.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4695
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4696
				Skills.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field683); // L: 4698
		Buddy.method5892(); // L: 4700
		ObjectSound.cameraX = var16; // L: 4702
		class160.cameraY = var6; // L: 4703
		Canvas.cameraZ = var7; // L: 4704
		class69.cameraPitch = var8; // L: 4705
		class32.cameraYaw = var9; // L: 4706
		if (Client.isLoading && Archive.method5061(true, false) == 0) { // L: 4707
			Client.isLoading = false;
		}

		if (Client.isLoading) { // L: 4708
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4709
			class143.drawLoadingMessage("Loading - please wait.", false); // L: 4710
		}

	} // L: 4712
}
