import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "[Lht;"
	)
	static Widget[] field572;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1891201755
	)
	static int field570;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -390637403
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -966847555
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("b")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("l")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Lht;",
		garbageValue = "-398427140"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = UserComparator4.getWidget(var0); // L: 205
		if (var1 == -1) { // L: 206
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 207 208
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "535558525"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4450
		class200.method3804(); // L: 4451
		if (Client.renderSelf) { // L: 4453
			ArchiveLoader.addPlayerToScene(PlayerType.localPlayer, false); // L: 4454
		}

		Projectile.method2226(); // L: 4457
		GrandExchangeOfferNameComparator.addNpcsToScene(true); // L: 4458
		MusicPatchNode.method3973(); // L: 4459
		GrandExchangeOfferNameComparator.addNpcsToScene(false); // L: 4460
		Login.method2200(); // L: 4461
		MouseRecorder.method1285(); // L: 4462
		Coord.setViewportShape(var0, var1, var2, var3, true); // L: 4463
		var0 = Client.viewportOffsetX; // L: 4464
		var1 = Client.viewportOffsetY; // L: 4465
		var2 = Client.viewportWidth; // L: 4466
		var3 = Client.viewportHeight; // L: 4467
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4468
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4469
		int var4;
		int var5;
		if (!Client.isCameraLocked) { // L: 4470
			var4 = Client.camAngleX; // L: 4471
			if (Client.field810 / 256 > var4) { // L: 4472
				var4 = Client.field810 / 256;
			}

			if (Client.field926[4] && Client.field928[4] + 128 > var4) { // L: 4473
				var4 = Client.field928[4] + 128;
			}

			var5 = Client.camAngleY & 2047; // L: 4474
			class7.method112(TileItem.oculusOrbFocalPointX, Tiles.field542, Interpreter.oculusOrbFocalPointY, var4, var5, MilliClock.method3587(var4), var3); // L: 4475
		}

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (!Client.isCameraLocked) { // L: 4478
			if (GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden) { // L: 4481
				var5 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 4482
			} else {
				label544: {
					var6 = 3; // L: 4485
					if (World.cameraPitch < 310) { // L: 4486
						if (Client.oculusOrbState == 1) { // L: 4489
							var7 = TileItem.oculusOrbFocalPointX >> 7; // L: 4490
							var8 = Interpreter.oculusOrbFocalPointY >> 7; // L: 4491
						} else {
							var7 = PlayerType.localPlayer.x >> 7; // L: 4494
							var8 = PlayerType.localPlayer.y >> 7; // L: 4495
						}

						var9 = cameraX >> 7; // L: 4497
						var10 = WorldMapManager.cameraZ >> 7; // L: 4498
						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) { // L: 4499
							var5 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 4500
							break label544; // L: 4501
						}

						if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) { // L: 4503
							var5 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 4504
							break label544; // L: 4505
						}

						if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4507
							var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
						}

						if (var7 > var9) { // L: 4509
							var11 = var7 - var9;
						} else {
							var11 = var9 - var7; // L: 4510
						}

						if (var8 > var10) { // L: 4512
							var12 = var8 - var10;
						} else {
							var12 = var10 - var8; // L: 4513
						}

						if (var11 > var12) { // L: 4514
							var13 = var12 * 65536 / var11; // L: 4515
							var14 = 32768; // L: 4516

							while (var7 != var9) { // L: 4517
								if (var9 < var7) { // L: 4518
									++var9;
								} else if (var9 > var7) { // L: 4519
									--var9;
								}

								if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4520
									var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
								}

								var14 += var13; // L: 4521
								if (var14 >= 65536) { // L: 4522
									var14 -= 65536; // L: 4523
									if (var10 < var8) { // L: 4524
										++var10;
									} else if (var10 > var8) { // L: 4525
										--var10;
									}

									if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4526
										var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
									}
								}
							}
						} else if (var12 > 0) { // L: 4530
							var13 = var11 * 65536 / var12; // L: 4531
							var14 = 32768; // L: 4532

							while (var8 != var10) { // L: 4533
								if (var10 < var8) { // L: 4534
									++var10;
								} else if (var10 > var8) { // L: 4535
									--var10;
								}

								if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4536
									var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
								}

								var14 += var13; // L: 4537
								if (var14 >= 65536) { // L: 4538
									var14 -= 65536; // L: 4539
									if (var9 < var7) { // L: 4540
										++var9;
									} else if (var9 > var7) { // L: 4541
										--var9;
									}

									if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][var9][var10] & 4) != 0) { // L: 4542
										var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
									}
								}
							}
						}
					}

					if (PlayerType.localPlayer.x >= 0 && PlayerType.localPlayer.y >= 0 && PlayerType.localPlayer.x < 13312 && PlayerType.localPlayer.y < 13312) { // L: 4547
						if ((Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][PlayerType.localPlayer.x >> 7][PlayerType.localPlayer.y >> 7] & 4) != 0) { // L: 4551
							var6 = GrandExchangeOfferUnitPriceComparator.Client_plane;
						}

						var5 = var6; // L: 4552
					} else {
						var5 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 4548
					}
				}
			}

			var4 = var5; // L: 4554
		} else {
			if (GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden) { // L: 4559
				var5 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 4560
			} else {
				var6 = GrandExchangeOfferWorldComparator.getTileHeight(cameraX, WorldMapManager.cameraZ, GrandExchangeOfferUnitPriceComparator.Client_plane); // L: 4563
				if (var6 - ChatChannel.cameraY < 800 && (Tiles.Tiles_renderFlags[GrandExchangeOfferUnitPriceComparator.Client_plane][cameraX >> 7][WorldMapManager.cameraZ >> 7] & 4) != 0) { // L: 4564
					var5 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 4565
				} else {
					var5 = 3; // L: 4568
				}
			}

			var4 = var5; // L: 4570
		}

		var5 = cameraX; // L: 4572
		var6 = ChatChannel.cameraY; // L: 4573
		var7 = WorldMapManager.cameraZ; // L: 4574
		var8 = World.cameraPitch; // L: 4575
		var9 = ViewportMouse.cameraYaw; // L: 4576

		for (var10 = 0; var10 < 5; ++var10) { // L: 4577
			if (Client.field926[var10]) { // L: 4578
				var11 = (int)(Math.random() * (double)(Client.field927[var10] * 2 + 1) - (double)Client.field927[var10] + Math.sin((double)Client.field918[var10] * ((double)Client.field898[var10] / 100.0D)) * (double)Client.field928[var10]); // L: 4579
				if (var10 == 0) { // L: 4580
					cameraX += var11;
				}

				if (var10 == 1) { // L: 4581
					ChatChannel.cameraY += var11;
				}

				if (var10 == 2) { // L: 4582
					WorldMapManager.cameraZ += var11;
				}

				if (var10 == 3) { // L: 4583
					ViewportMouse.cameraYaw = var11 + ViewportMouse.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 4584
					World.cameraPitch += var11; // L: 4585
					if (World.cameraPitch < 128) { // L: 4586
						World.cameraPitch = 128;
					}

					if (World.cameraPitch > 383) { // L: 4587
						World.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 4591
		var11 = MouseHandler.MouseHandler_y; // L: 4592
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4593
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 4594
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 4595
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 4597
			var12 = var10 - var0; // L: 4598
			var13 = var11 - var1; // L: 4599
			ViewportMouse.ViewportMouse_x = var12; // L: 4601
			ViewportMouse.ViewportMouse_y = var13; // L: 4602
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4603
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4604
			ViewportMouse.ViewportMouse_false0 = false; // L: 4605
		} else {
			class23.method252(); // L: 4609
		}

		FriendSystem.playPcmPlayers(); // L: 4611
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4612
		FriendSystem.playPcmPlayers(); // L: 4613
		var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 4614
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4615
		ModeWhere.scene.draw(cameraX, ChatChannel.cameraY, WorldMapManager.cameraZ, World.cameraPitch, ViewportMouse.cameraYaw, var4); // L: 4616
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 4617
		FriendSystem.playPcmPlayers(); // L: 4618
		ModeWhere.scene.clearTempGameObjects(); // L: 4619
		Client.overheadTextCount = 0; // L: 4621
		boolean var30 = false; // L: 4622
		var14 = -1; // L: 4623
		int var15 = -1; // L: 4624
		int var16 = Players.Players_count; // L: 4625
		int[] var17 = Players.Players_indices; // L: 4626

		int var18;
		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) { // L: 4627
			Object var29;
			if (var18 < var16) { // L: 4629
				var29 = Client.players[var17[var18]]; // L: 4630
				if (var17[var18] == Client.combatTargetPlayerIndex) { // L: 4631
					var30 = true; // L: 4632
					var14 = var18; // L: 4633
					continue;
				}

				if (var29 == PlayerType.localPlayer) { // L: 4636
					var15 = var18; // L: 4637
					continue; // L: 4638
				}
			} else {
				var29 = Client.npcs[Client.npcIndices[var18 - var16]]; // L: 4641
			}

			class1.drawActor2d((Actor)var29, var18, var0, var1, var2, var3); // L: 4642
		}

		if (Client.renderSelf && var15 != -1) { // L: 4644
			class1.drawActor2d(PlayerType.localPlayer, var15, var0, var1, var2, var3); // L: 4645
		}

		if (var30) { // L: 4647
			class1.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3); // L: 4648
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) { // L: 4650
			int var19 = Client.overheadTextXs[var18]; // L: 4651
			int var20 = Client.overheadTextYs[var18]; // L: 4652
			int var21 = Client.overheadTextXOffsets[var18]; // L: 4653
			int var22 = Client.overheadTextAscents[var18]; // L: 4654
			boolean var23 = true; // L: 4655

			while (var23) {
				var23 = false; // L: 4657

				for (int var28 = 0; var28 < var18; ++var28) { // L: 4658
					if (var20 + 2 > Client.overheadTextYs[var28] - Client.overheadTextAscents[var28] && var20 - var22 < Client.overheadTextYs[var28] + 2 && var19 - var21 < Client.overheadTextXOffsets[var28] + Client.overheadTextXs[var28] && var19 + var21 > Client.overheadTextXs[var28] - Client.overheadTextXOffsets[var28] && Client.overheadTextYs[var28] - Client.overheadTextAscents[var28] < var20) { // L: 4659 4660
						var20 = Client.overheadTextYs[var28] - Client.overheadTextAscents[var28]; // L: 4661
						var23 = true; // L: 4662
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18]; // L: 4667
			Client.viewportTempY = Client.overheadTextYs[var18] = var20; // L: 4668
			String var24 = Client.overheadText[var18]; // L: 4669
			if (Client.chatEffects == 0) { // L: 4670
				int var25 = 16776960; // L: 4671
				if (Client.overheadTextColors[var18] < 6) { // L: 4672
					var25 = Client.field896[Client.overheadTextColors[var18]];
				}

				if (Client.overheadTextColors[var18] == 6) { // L: 4673
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var18] == 7) { // L: 4674
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var18] == 8) { // L: 4675
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var18] == 9) { // L: 4676
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4677
					if (var26 < 50) { // L: 4678
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) { // L: 4679
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) { // L: 4680
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var18] == 10) { // L: 4682
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4683
					if (var26 < 50) { // L: 4684
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) { // L: 4685
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) { // L: 4686
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var18] == 11) { // L: 4688
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4689
					if (var26 < 50) { // L: 4690
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) { // L: 4691
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) { // L: 4692
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var18] == 0) { // L: 4694
					ReflectionCheck.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) { // L: 4695
					ReflectionCheck.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) { // L: 4696
					ReflectionCheck.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) { // L: 4697
					ReflectionCheck.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) { // L: 4698
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (ReflectionCheck.fontBold12.stringWidth(var24) + 100) / 150; // L: 4699
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4700
					ReflectionCheck.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0); // L: 4701
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4702
				}

				if (Client.overheadTextEffects[var18] == 5) { // L: 4704
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4705
					int var27 = 0; // L: 4706
					if (var26 < 25) { // L: 4707
						var27 = var26 - 25;
					} else if (var26 > 125) { // L: 4708
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - ReflectionCheck.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4709
					ReflectionCheck.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0); // L: 4710
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4711
				}
			} else {
				ReflectionCheck.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4715
			}
		}

		if (Client.hintArrowType == 2) { // L: 4720
			class13.worldToScreen((Client.hintArrowX - FloorDecoration.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - WorldMapData_0.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4721
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4722
				class337.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field743); // L: 4724
		WorldMapScaleHandler.method864(var0, var1, var2, var3); // L: 4725
		cameraX = var5; // L: 4726
		ChatChannel.cameraY = var6; // L: 4727
		WorldMapManager.cameraZ = var7; // L: 4728
		World.cameraPitch = var8; // L: 4729
		ViewportMouse.cameraYaw = var9; // L: 4730
		if (Client.isLoading) { // L: 4731
			byte var31 = 0; // L: 4734
			var14 = var31 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4735
			if (var14 == 0) { // L: 4739
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4741
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4742
			AbstractWorldMapData.drawLoadingMessage("Loading - please wait.", false); // L: 4743
		}

	} // L: 4745
}
