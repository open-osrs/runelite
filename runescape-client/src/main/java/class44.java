import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class44 {
	@ObfuscatedName("h")
	@Export("applet")
	public static Applet applet;
	@ObfuscatedName("c")
	public static String field305;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 43770267
	)
	static int field310;

	static {
		applet = null; // L: 10
		field305 = ""; // L: 11
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-508196625"
	)
	public static void method494() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 69
	} // L: 70

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-916574148"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1507
		Login.Login_response2 = var1; // L: 1508
		Login.Login_response3 = var2; // L: 1509
	} // L: 1510

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1732436079"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4453
		UserComparator9.method2478(); // L: 4454
		if (Client.renderSelf) { // L: 4456
			class32.addPlayerToScene(class35.localPlayer, false); // L: 4457
		}

		class32.method367(); // L: 4460
		WorldMapLabel.addNpcsToScene(true); // L: 4461
		int var4 = Players.Players_count; // L: 4463
		int[] var5 = Players.Players_indices; // L: 4464

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4465
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4466
				class32.addPlayerToScene(Client.players[var5[var6]], true); // L: 4467
			}
		}

		WorldMapLabel.addNpcsToScene(false); // L: 4470
		class302.method5372(); // L: 4471
		Tiles.method2046(); // L: 4472
		VarbitComposition.setViewportShape(var0, var1, var2, var3, true); // L: 4473
		var0 = Client.viewportOffsetX; // L: 4474
		var1 = Client.viewportOffsetY; // L: 4475
		var2 = Client.viewportWidth; // L: 4476
		var3 = Client.viewportHeight; // L: 4477
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4478
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4479
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var14;
		int var18;
		if (!Client.isCameraLocked) { // L: 4480
			var4 = Client.camAngleX; // L: 4481
			if (Client.field702 / 256 > var4) { // L: 4482
				var4 = Client.field702 / 256;
			}

			if (Client.field846[4] && Client.field868[4] + 128 > var4) { // L: 4483
				var4 = Client.field868[4] + 128;
			}

			var18 = Client.camAngleY & 2047; // L: 4484
			var6 = HorizontalAlignment.oculusOrbFocalPointX; // L: 4485
			var7 = Decimator.field523; // L: 4486
			var8 = class280.oculusOrbFocalPointY; // L: 4487
			var9 = class21.method281(var4); // L: 4488
			var9 = PlayerComposition.method4640(var9, var3); // L: 4490
			var10 = 2048 - var4 & 2047; // L: 4491
			var11 = 2048 - var18 & 2047; // L: 4492
			var12 = 0; // L: 4493
			int var13 = 0; // L: 4494
			var14 = var9; // L: 4495
			int var15;
			int var16;
			int var17;
			if (var10 != 0) { // L: 4496
				var15 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4497
				var16 = Rasterizer3D.Rasterizer3D_cosine[var10]; // L: 4498
				var17 = var16 * var13 - var15 * var9 >> 16; // L: 4499
				var14 = var16 * var9 + var13 * var15 >> 16; // L: 4500
				var13 = var17; // L: 4501
			}

			if (var11 != 0) { // L: 4503
				var15 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4504
				var16 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4505
				var17 = var16 * var12 + var14 * var15 >> 16; // L: 4506
				var14 = var16 * var14 - var15 * var12 >> 16; // L: 4507
				var12 = var17; // L: 4508
			}

			class20.cameraX = var6 - var12; // L: 4510
			Skeleton.cameraY = var7 - var13; // L: 4511
			WorldMapDecoration.cameraZ = var8 - var14; // L: 4512
			class1.cameraPitch = var4; // L: 4513
			HealthBarDefinition.cameraYaw = var18; // L: 4514
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (HorizontalAlignment.oculusOrbFocalPointX >> 7 != class35.localPlayer.x >> 7 || class280.oculusOrbFocalPointY >> 7 != class35.localPlayer.y >> 7)) { // L: 4515 4516
				var15 = class35.localPlayer.plane; // L: 4517
				var16 = (HorizontalAlignment.oculusOrbFocalPointX >> 7) + JagexCache.baseX; // L: 4518
				var17 = (class280.oculusOrbFocalPointY >> 7) + Messages.baseY; // L: 4519
				ClientPreferences.method2239(var16, var17, var15, true); // L: 4520
			}
		}

		if (!Client.isCameraLocked) { // L: 4526
			var4 = Message.sceneRenderLevel();
		} else {
			var4 = FontName.sceneRenderLevelCameraLocked(); // L: 4527
		}

		var18 = class20.cameraX; // L: 4528
		var6 = Skeleton.cameraY; // L: 4529
		var7 = WorldMapDecoration.cameraZ; // L: 4530
		var8 = class1.cameraPitch; // L: 4531
		var9 = HealthBarDefinition.cameraYaw; // L: 4532

		for (var10 = 0; var10 < 5; ++var10) { // L: 4533
			if (Client.field846[var10]) { // L: 4534
				var11 = (int)(Math.random() * (double)(Client.field744[var10] * 2 + 1) - (double)Client.field744[var10] + Math.sin((double)Client.field870[var10] * ((double)Client.field869[var10] / 100.0D)) * (double)Client.field868[var10]); // L: 4535
				if (var10 == 0) { // L: 4536
					class20.cameraX += var11;
				}

				if (var10 == 1) { // L: 4537
					Skeleton.cameraY += var11;
				}

				if (var10 == 2) { // L: 4538
					WorldMapDecoration.cameraZ += var11;
				}

				if (var10 == 3) { // L: 4539
					HealthBarDefinition.cameraYaw = var11 + HealthBarDefinition.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 4540
					class1.cameraPitch += var11; // L: 4541
					if (class1.cameraPitch < 128) { // L: 4542
						class1.cameraPitch = 128;
					}

					if (class1.cameraPitch > 383) { // L: 4543
						class1.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 4547
		var11 = MouseHandler.MouseHandler_y; // L: 4548
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4549
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 4550
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 4551
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 4553
			Messages.method2374(var10 - var0, var11 - var1); // L: 4554
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4558
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4559
		}

		WorldMapIcon_1.playPcmPlayers(); // L: 4562
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4563
		WorldMapIcon_1.playPcmPlayers(); // L: 4564
		var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 4565
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4566
		class5.scene.draw(class20.cameraX, Skeleton.cameraY, WorldMapDecoration.cameraZ, class1.cameraPitch, HealthBarDefinition.cameraYaw, var4); // L: 4567
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 4568
		WorldMapIcon_1.playPcmPlayers(); // L: 4569
		class5.scene.clearTempGameObjects(); // L: 4570
		class20.method272(var0, var1, var2, var3); // L: 4571
		Tile.method3813(var0, var1); // L: 4572
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field768); // L: 4573
		InvDefinition.method2615(var0, var1, var2, var3); // L: 4574
		class20.cameraX = var18; // L: 4575
		Skeleton.cameraY = var6; // L: 4576
		WorldMapDecoration.cameraZ = var7; // L: 4577
		class1.cameraPitch = var8; // L: 4578
		HealthBarDefinition.cameraYaw = var9; // L: 4579
		if (Client.isLoading) { // L: 4580
			byte var19 = 0; // L: 4583
			var14 = var19 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4584
			if (var14 == 0) { // L: 4588
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4590
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4591
			class7.drawLoadingMessage("Loading - please wait.", false); // L: 4592
		}

	} // L: 4594

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-893753206"
	)
	static boolean method499(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30; // L: 9128
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIIIIIIS)V",
		garbageValue = "27179"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9505
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9506

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9507
			Widget var10 = var0[var9]; // L: 9508
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9509 9510
				int var11;
				if (var8 == -1) { // L: 9512
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9513
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9514
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9515
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9516
					var11 = ++Client.rootWidgetCount - 1; // L: 9517
				} else {
					var11 = var8; // L: 9519
				}

				var10.rootIndex = var11; // L: 9520
				var10.cycle = Client.cycle; // L: 9521
				if (!var10.isIf3 || !class11.isComponentHidden(var10)) { // L: 9522
					if (var10.contentType > 0) { // L: 9523
						VarcInt.method2656(var10);
					}

					int var12 = var10.x + var6; // L: 9524
					int var13 = var7 + var10.y; // L: 9525
					int var14 = var10.transparencyTop; // L: 9526
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9527
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9528
							Ignored.field3859 = var0; // L: 9529
							VarcInt.field1576 = var6; // L: 9530
							class230.field2812 = var7; // L: 9531
							continue; // L: 9532
						}

						if (Client.isDraggingWidget && Client.field794) { // L: 9534
							var15 = MouseHandler.MouseHandler_x; // L: 9535
							var16 = MouseHandler.MouseHandler_y; // L: 9536
							var15 -= Client.widgetClickX; // L: 9537
							var16 -= Client.widgetClickY; // L: 9538
							if (var15 < Client.field795) { // L: 9539
								var15 = Client.field795;
							}

							if (var15 + var10.width > Client.field795 + Client.clickedWidgetParent.width) { // L: 9540
								var15 = Client.field795 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field785) { // L: 9541
								var16 = Client.field785;
							}

							if (var16 + var10.height > Client.field785 + Client.clickedWidgetParent.height) { // L: 9542
								var16 = Client.field785 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9543
							var13 = var16; // L: 9544
						}

						if (!var10.isScrollBar) { // L: 9546
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9552
						var15 = var2; // L: 9553
						var16 = var3; // L: 9554
						var17 = var4; // L: 9555
						var18 = var5; // L: 9556
					} else if (var10.type == 9) { // L: 9558
						var19 = var12; // L: 9559
						var20 = var13; // L: 9560
						var21 = var12 + var10.width; // L: 9561
						var22 = var13 + var10.height; // L: 9562
						if (var21 < var12) { // L: 9563
							var19 = var21; // L: 9565
							var21 = var12; // L: 9566
						}

						if (var22 < var13) { // L: 9568
							var20 = var22; // L: 9570
							var22 = var13; // L: 9571
						}

						++var21; // L: 9573
						++var22; // L: 9574
						var15 = var19 > var2 ? var19 : var2; // L: 9575
						var16 = var20 > var3 ? var20 : var3; // L: 9576
						var17 = var21 < var4 ? var21 : var4; // L: 9577
						var18 = var22 < var5 ? var22 : var5; // L: 9578
					} else {
						var19 = var12 + var10.width; // L: 9581
						var20 = var13 + var10.height; // L: 9582
						var15 = var12 > var2 ? var12 : var2; // L: 9583
						var16 = var13 > var3 ? var13 : var3; // L: 9584
						var17 = var19 < var4 ? var19 : var4; // L: 9585
						var18 = var20 < var5 ? var20 : var5; // L: 9586
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9588
						if (var10.contentType != 0) { // L: 9589
							if (var10.contentType == 1336) { // L: 9590
								if (Client.displayFps) { // L: 9591
									var13 += 15; // L: 9592
									Message.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9593
									var13 += 15; // L: 9594
									Runtime var42 = Runtime.getRuntime(); // L: 9595
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9596
									var21 = 16776960; // L: 9597
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9598
										var21 = 16711680;
									}

									Message.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9599
									var13 += 15; // L: 9600
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9604
								Client.viewportX = var12; // L: 9605
								Client.viewportY = var13; // L: 9606
								drawEntities(var12, var13, var10.width, var10.height); // L: 9607
								Client.field825[var10.rootIndex] = true; // L: 9608
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9609
								continue; // L: 9610
							}

							if (var10.contentType == 1338) { // L: 9612
								PacketBufferNode.drawMinimap(var10, var12, var13, var11); // L: 9613
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9614
								continue; // L: 9615
							}

							if (var10.contentType == 1339) { // L: 9617
								WorldMapData_1.drawCompass(var10, var12, var13, var11); // L: 9618
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9619
								continue; // L: 9620
							}

							if (var10.contentType == 1400) { // L: 9622
								NetSocket.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9623
							}

							if (var10.contentType == 1401) { // L: 9625
								NetSocket.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9626
							}

							if (var10.contentType == 1402) { // L: 9628
								AttackOption.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9629
							}
						}

						if (var10.type == 0) { // L: 9632
							if (!var10.isIf3 && class11.isComponentHidden(var10) && var10 != SpriteMask.mousedOverWidgetIf1) { // L: 9633
								continue;
							}

							if (!var10.isIf3) { // L: 9634
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9635
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9636
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9638
							if (var10.children != null) { // L: 9639
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9640
							if (var30 != null) { // L: 9641
								ModeWhere.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9642
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9644
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9645
						}

						if (Client.isResizable || Client.field636[var11] || Client.gameDrawingMode > 1) { // L: 9647
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9648 9649
								WorldMapRectangle.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9651
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9654
									var19 = 0; // L: 9655

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9656
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9657
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9658
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 9659
											if (var19 < 20) { // L: 9660
												var22 += var10.inventoryXOffsets[var19]; // L: 9661
												var23 += var10.inventoryYOffsets[var19]; // L: 9662
											}

											if (var10.itemIds[var19] <= 0) { // L: 9664
												if (var10.inventorySprites != null && var19 < 20) { // L: 9709
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9710
													if (var46 != null) { // L: 9711
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2962) { // L: 9712
														VerticalAlignment.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9665
												boolean var38 = false; // L: 9666
												var26 = var10.itemIds[var19] - 1; // L: 9667
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class34.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9668
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == UserComparator8.selectedItemSlot && var10.id == class35.selectedItemWidget) { // L: 9670
														var35 = SecureRandomFuture.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = SecureRandomFuture.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9671
													}

													if (var35 != null) { // L: 9672
														if (var10 == class34.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9673
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9674
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9675
															if (var24 < 5 && var24 > -5) { // L: 9676
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9677
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9678
																var24 = 0; // L: 9679
																var25 = 0; // L: 9680
															}

															var35.drawTransAt(var24 + var22, var25 + var23, 128); // L: 9682
															if (var1 != -1) { // L: 9683
																Widget var28 = var0[var1 & 65535]; // L: 9684
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9685
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field768 / 3; // L: 9686
																	if (var29 > Client.field768 * 10) { // L: 9687
																		var29 = Client.field768 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9688
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9689
																	Client.draggedWidgetY += var29; // L: 9690
																	VerticalAlignment.invalidateWidget(var28); // L: 9691
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9693
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field768 / 3; // L: 9694
																	if (var29 > Client.field768 * 10) { // L: 9695
																		var29 = Client.field768 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9696
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9697
																	Client.draggedWidgetY -= var29; // L: 9698
																	VerticalAlignment.invalidateWidget(var28); // L: 9699
																}
															}
														} else if (var10 == Projectile.field1039 && var19 == Client.field633) { // L: 9703
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9704
														}
													} else {
														VerticalAlignment.invalidateWidget(var10); // L: 9706
													}
												}
											}

											++var19; // L: 9714
										}
									}
								} else if (var10.type == 3) { // L: 9719
									if (class373.runCs1(var10)) { // L: 9721
										var19 = var10.color2; // L: 9722
										if (var10 == SpriteMask.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9723
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9726
										if (var10 == SpriteMask.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9727
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9729
										switch(var10.fillMode.field4236) { // L: 9730
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9736
											break; // L: 9737
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9739
											break; // L: 9740
										default:
											if (var14 == 0) { // L: 9732
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9733
											}
										}
									} else if (var14 == 0) { // L: 9744
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9745
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9749
										var39 = var10.getFont(); // L: 9750
										if (var39 == null) { // L: 9751
											if (Widget.field2962) { // L: 9752
												VerticalAlignment.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9756
											if (class373.runCs1(var10)) { // L: 9757
												var20 = var10.color2; // L: 9758
												if (var10 == SpriteMask.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9759
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9760
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9763
												if (var10 == SpriteMask.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9764
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9766
												ItemComposition var45 = Strings.ItemDefinition_get(var10.itemId); // L: 9767
												var44 = var45.name; // L: 9768
												if (var44 == null) { // L: 9769
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9770
													var44 = HorizontalAlignment.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + Messages.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9772
												var44 = "Please wait..."; // L: 9773
												var20 = var10.color; // L: 9774
											}

											if (!var10.isIf3) { // L: 9776
												var44 = GrandExchangeOfferTotalQuantityComparator.method4979(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9777
										}
									} else if (var10.type == 5) { // L: 9780
										SpritePixels var40;
										if (!var10.isIf3) { // L: 9781
											var40 = var10.getSprite(class373.runCs1(var10)); // L: 9782
											if (var40 != null) { // L: 9783
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2962) { // L: 9784
												VerticalAlignment.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9788
												var40 = SecureRandomFuture.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 9789
											}

											if (var40 == null) { // L: 9790
												if (Widget.field2962) { // L: 9814
													VerticalAlignment.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9791
												var21 = var40.height; // L: 9792
												if (!var10.spriteTiling) { // L: 9793
													var22 = var10.width * 4096 / var20; // L: 9807
													if (var10.spriteAngle != 0) { // L: 9808
														var40.method6894(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9809
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9810
														var40.drawTransBgAt(var12, var13); // L: 9811
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9794
													var22 = (var20 - 1 + var10.width) / var20; // L: 9795
													var23 = (var21 - 1 + var10.height) / var21; // L: 9796

													for (var24 = 0; var24 < var22; ++var24) { // L: 9797
														for (var25 = 0; var25 < var23; ++var25) { // L: 9798
															if (var10.spriteAngle != 0) { // L: 9799
																var40.method6894(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9800
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 9801
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9804
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 9818
											boolean var36 = class373.runCs1(var10); // L: 9819
											if (var36) { // L: 9821
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 9822
											}

											Model var41 = null; // L: 9823
											var22 = 0; // L: 9824
											if (var10.itemId != -1) { // L: 9825
												var33 = Strings.ItemDefinition_get(var10.itemId); // L: 9826
												if (var33 != null) { // L: 9827
													var33 = var33.getCountObj(var10.itemQuantity); // L: 9828
													var41 = var33.getModel(1); // L: 9829
													if (var41 != null) { // L: 9830
														var41.calculateBoundsCylinder(); // L: 9831
														var22 = var41.height / 2; // L: 9832
													} else {
														VerticalAlignment.invalidateWidget(var10); // L: 9834
													}
												}
											} else if (var10.modelType == 5) { // L: 9837
												if (var10.modelId == 0) { // L: 9838
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class35.localPlayer.getModel(); // L: 9839
												}
											} else if (var20 == -1) { // L: 9841
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class35.localPlayer.appearance); // L: 9842
												if (var41 == null && Widget.field2962) { // L: 9843
													VerticalAlignment.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = Player.SequenceDefinition_get(var20); // L: 9846
												var41 = var10.getModel(var47, var10.modelFrame, var36, class35.localPlayer.appearance); // L: 9847
												if (var41 == null && Widget.field2962) { // L: 9848
													VerticalAlignment.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3818(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9850
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9851
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9852
											if (var41 != null) { // L: 9853
												if (!var10.isIf3) { // L: 9854
													var41.method4136(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9856
													if (var10.modelOrthog) { // L: 9857
														var41.method4137(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4136(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9858
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9861
										} else {
											if (var10.type == 7) { // L: 9864
												var39 = var10.getFont(); // L: 9865
												if (var39 == null) { // L: 9866
													if (Widget.field2962) { // L: 9867
														VerticalAlignment.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9870

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9871
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9872
														if (var10.itemIds[var20] > 0) { // L: 9873
															var33 = Strings.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9874
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9876
																var34 = HorizontalAlignment.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = HorizontalAlignment.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + Messages.formatItemStacks(var10.itemQuantities[var20]); // L: 9877
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 9878
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 9879
															if (var10.textXAlignment == 0) { // L: 9880
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9881
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9882
															}
														}

														++var20; // L: 9884
													}
												}
											}

											if (var10.type == 8 && var10 == class34.field241 && Client.field741 == Client.field811) { // L: 9888 9889
												var19 = 0; // L: 9890
												var20 = 0; // L: 9891
												Font var31 = Message.fontPlain12; // L: 9892
												String var32 = var10.text; // L: 9893

												String var43;
												for (var32 = GrandExchangeOfferTotalQuantityComparator.method4979(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 9895 9896 9908
													var24 = var32.indexOf("<br>"); // L: 9897
													if (var24 != -1) { // L: 9898
														var43 = var32.substring(0, var24); // L: 9899
														var32 = var32.substring(var24 + 4); // L: 9900
													} else {
														var43 = var32; // L: 9903
														var32 = ""; // L: 9904
													}

													var25 = var31.stringWidth(var43); // L: 9906
													if (var25 > var19) { // L: 9907
														var19 = var25;
													}
												}

												var19 += 6; // L: 9910
												var20 += 7; // L: 9911
												var24 = var12 + var10.width - 5 - var19; // L: 9912
												var25 = var13 + var10.height + 5; // L: 9913
												if (var24 < var12 + 5) { // L: 9914
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 9915
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 9916
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 9917
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 9918
												var32 = var10.text; // L: 9919
												var26 = var25 + var31.ascent + 2; // L: 9920

												for (var32 = GrandExchangeOfferTotalQuantityComparator.method4979(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 9921 9922 9933
													int var27 = var32.indexOf("<br>"); // L: 9923
													if (var27 != -1) { // L: 9924
														var43 = var32.substring(0, var27); // L: 9925
														var32 = var32.substring(var27 + 4); // L: 9926
													} else {
														var43 = var32; // L: 9929
														var32 = ""; // L: 9930
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 9932
												}
											}

											if (var10.type == 9) { // L: 9937
												if (var10.field2998) { // L: 9942
													var19 = var12; // L: 9943
													var20 = var13 + var10.height; // L: 9944
													var21 = var12 + var10.width; // L: 9945
													var22 = var13; // L: 9946
												} else {
													var19 = var12; // L: 9949
													var20 = var13; // L: 9950
													var21 = var12 + var10.width; // L: 9951
													var22 = var13 + var10.height; // L: 9952
												}

												if (var10.lineWid == 1) { // L: 9954
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 9955
												} else {
													Messages.method2378(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 9958
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 9963
}
