import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class118 implements class110 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1101501436"
	)
	static void method2686() {
		Tiles.Tiles_minPlane = 99; // L: 48
		Tiles.Tiles_underlays = new byte[4][104][104]; // L: 49
		Tiles.Tiles_overlays = new byte[4][104][104]; // L: 50
		Tiles.Tiles_shapes = new byte[4][104][104]; // L: 51
		WorldMapLabelSize.field2580 = new byte[4][104][104]; // L: 52
		ClanChannelMember.field1504 = new int[4][105][105]; // L: 53
		SoundCache.field321 = new byte[4][105][105]; // L: 54
		class194.field2280 = new int[105][105]; // L: 55
		Tiles.Tiles_hue = new int[104]; // L: 56
		User.Tiles_saturation = new int[104]; // L: 57
		Tiles.Tiles_lightness = new int[104]; // L: 58
		UserComparator5.Tiles_hueMultiplier = new int[104]; // L: 59
		VerticalAlignment.field1874 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfd;",
		garbageValue = "21"
	)
	public static HealthBarDefinition method2683(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cachedSprites.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferAgeComparator.HealthBarDefinition_archive.takeFile(33, var0); // L: 39
			var1 = new HealthBarDefinition(); // L: 40
			if (var2 != null) { // L: 41
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cachedSprites.put(var1, (long)var0); // L: 42
			return var1; // L: 43
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "582881016"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class334.World_worlds != null) { // L: 171
			class286.doWorldSorting(0, class334.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "28"
	)
	public static byte[] method2684() {
		byte[] var0 = new byte[24]; // L: 131

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 133
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 134

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 135 136 137
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 139
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 142
				var0[var2] = -1;
			}
		}

		return var0; // L: 144
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "([Ljm;IIIIIIIII)V",
		garbageValue = "2121973055"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10389
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10390

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10391
			Widget var10 = var0[var9]; // L: 10392
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10393 10394
				int var11;
				if (var8 == -1) { // L: 10396
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10397
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10398
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10399
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10400
					var11 = ++Client.rootWidgetCount - 1; // L: 10401
				} else {
					var11 = var8; // L: 10403
				}

				var10.rootIndex = var11; // L: 10404
				var10.cycle = Client.cycle; // L: 10405
				if (!var10.isIf3 || !StudioGame.isComponentHidden(var10)) { // L: 10406
					if (var10.contentType > 0) { // L: 10407
						AbstractWorldMapData.method4787(var10);
					}

					int var12 = var10.x + var6; // L: 10408
					int var13 = var7 + var10.y; // L: 10409
					int var14 = var10.transparencyTop; // L: 10410
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10411
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10412
							BufferedFile.field4430 = var0; // L: 10413
							HitSplatDefinition.field1945 = var6; // L: 10414
							class78.field1000 = var7; // L: 10415
							continue; // L: 10416
						}

						if (Client.isDraggingWidget && Client.field531) { // L: 10418
							var15 = MouseHandler.MouseHandler_x; // L: 10419
							var16 = MouseHandler.MouseHandler_y; // L: 10420
							var15 -= Client.widgetClickX; // L: 10421
							var16 -= Client.widgetClickY; // L: 10422
							if (var15 < Client.field681) { // L: 10423
								var15 = Client.field681;
							}

							if (var15 + var10.width > Client.field681 + Client.clickedWidgetParent.width) { // L: 10424
								var15 = Client.field681 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field659) { // L: 10425
								var16 = Client.field659;
							}

							if (var16 + var10.height > Client.field659 + Client.clickedWidgetParent.height) { // L: 10426
								var16 = Client.field659 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10427
							var13 = var16; // L: 10428
						}

						if (!var10.isScrollBar) { // L: 10430
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 10436
						var15 = var2; // L: 10437
						var16 = var3; // L: 10438
						var17 = var4; // L: 10439
						var18 = var5; // L: 10440
					} else if (var10.type == 9) { // L: 10442
						var19 = var12; // L: 10443
						var20 = var13; // L: 10444
						var21 = var12 + var10.width; // L: 10445
						var22 = var13 + var10.height; // L: 10446
						if (var21 < var12) { // L: 10447
							var19 = var21; // L: 10449
							var21 = var12; // L: 10450
						}

						if (var22 < var13) { // L: 10452
							var20 = var22; // L: 10454
							var22 = var13; // L: 10455
						}

						++var21; // L: 10457
						++var22; // L: 10458
						var15 = var19 > var2 ? var19 : var2; // L: 10459
						var16 = var20 > var3 ? var20 : var3; // L: 10460
						var17 = var21 < var4 ? var21 : var4; // L: 10461
						var18 = var22 < var5 ? var22 : var5; // L: 10462
					} else {
						var19 = var12 + var10.width; // L: 10465
						var20 = var13 + var10.height; // L: 10466
						var15 = var12 > var2 ? var12 : var2; // L: 10467
						var16 = var13 > var3 ? var13 : var3; // L: 10468
						var17 = var19 < var4 ? var19 : var4; // L: 10469
						var18 = var20 < var5 ? var20 : var5; // L: 10470
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10472
						if (var10.contentType != 0) { // L: 10473
							if (var10.contentType == 1336) { // L: 10474
								if (Client.displayFps) { // L: 10475
									var13 += 15; // L: 10476
									class114.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10477
									var13 += 15; // L: 10478
									Runtime var42 = Runtime.getRuntime(); // L: 10479
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 10480
									var21 = 16776960; // L: 10481
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10482
										var21 = 16711680;
									}

									class114.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10483
									var13 += 15; // L: 10484
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10488
								Client.viewportX = var12; // L: 10489
								Client.viewportY = var13; // L: 10490
								class291.drawEntities(var12, var13, var10.width, var10.height); // L: 10491
								Client.field504[var10.rootIndex] = true; // L: 10492
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10493
								continue; // L: 10494
							}

							if (var10.contentType == 1338) { // L: 10496
								class148.drawMinimap(var10, var12, var13, var11); // L: 10497
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10498
								continue; // L: 10499
							}

							if (var10.contentType == 1339) { // L: 10501
								User.drawCompass(var10, var12, var13, var11); // L: 10502
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10503
								continue; // L: 10504
							}

							if (var10.contentType == 1400) { // L: 10506
								Varcs.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10507
							}

							if (var10.contentType == 1401) { // L: 10509
								Varcs.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10510
							}

							if (var10.contentType == 1402) { // L: 10512
								Client.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10513
							}
						}

						if (var10.type == 0) { // L: 10516
							if (!var10.isIf3 && StudioGame.isComponentHidden(var10) && var10 != class4.mousedOverWidgetIf1) { // L: 10517
								continue;
							}

							if (!var10.isIf3) { // L: 10518
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10519
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10520
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10522
							if (var10.children != null) { // L: 10523
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10524
							if (var30 != null) { // L: 10525
								class12.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 10526
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10528
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10529
						}

						if (Client.isResizable || Client.field687[var11] || Client.gameDrawingMode > 1) { // L: 10531
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10532 10533
								class129.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10535
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 10538
									var19 = 0; // L: 10539

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 10540
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 10541
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 10542
											var23 = var20 * (var10.paddingY + 32) + var13; // L: 10543
											if (var19 < 20) { // L: 10544
												var22 += var10.inventoryXOffsets[var19]; // L: 10545
												var23 += var10.inventoryYOffsets[var19]; // L: 10546
											}

											if (var10.itemIds[var19] <= 0) { // L: 10548
												if (var10.inventorySprites != null && var19 < 20) { // L: 10593
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 10594
													if (var46 != null) { // L: 10595
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3223) { // L: 10596
														SecureRandomCallable.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 10549
												boolean var38 = false; // L: 10550
												var26 = var10.itemIds[var19] - 1; // L: 10551
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class143.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10552
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == Calendar.selectedItemSlot && var10.id == MidiPcmStream.selectedItemWidget) { // L: 10554
														var35 = EnumComposition.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = EnumComposition.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 10555
													}

													if (var35 != null) { // L: 10556
														if (var10 == class143.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10557
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 10558
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 10559
															if (var24 < 5 && var24 > -5) { // L: 10560
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 10561
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 10562
																var24 = 0; // L: 10563
																var25 = 0; // L: 10564
															}

															var35.drawTransAt(var22 + var24, var23 + var25, 128); // L: 10566
															if (var1 != -1) { // L: 10567
																Widget var28 = var0[var1 & 65535]; // L: 10568
																int var29;
																if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 10569
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field538 / 3; // L: 10570
																	if (var29 > Client.field538 * 10) { // L: 10571
																		var29 = Client.field538 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 10572
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 10573
																	Client.draggedWidgetY += var29; // L: 10574
																	SecureRandomCallable.invalidateWidget(var28); // L: 10575
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 10577
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field538 / 3; // L: 10578
																	if (var29 > Client.field538 * 10) { // L: 10579
																		var29 = Client.field538 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 10580
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 10581
																	Client.draggedWidgetY -= var29; // L: 10582
																	SecureRandomCallable.invalidateWidget(var28); // L: 10583
																}
															}
														} else if (var10 == WorldMapDecoration.field2722 && var19 == Client.field599) { // L: 10587
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 10588
														}
													} else {
														SecureRandomCallable.invalidateWidget(var10); // L: 10590
													}
												}
											}

											++var19; // L: 10598
										}
									}
								} else if (var10.type == 3) { // L: 10603
									if (class28.runCs1(var10)) { // L: 10605
										var19 = var10.color2; // L: 10606
										if (var10 == class4.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10607
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10610
										if (var10 == class4.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10611
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10613
										switch(var10.fillMode.field4554) { // L: 10614
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10616
											break; // L: 10617
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10623
											break; // L: 10624
										default:
											if (var14 == 0) { // L: 10619
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10620
											}
										}
									} else if (var14 == 0) { // L: 10628
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10629
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 10633
										var39 = var10.getFont(); // L: 10634
										if (var39 == null) { // L: 10635
											if (Widget.field3223) { // L: 10636
												SecureRandomCallable.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 10640
											if (class28.runCs1(var10)) { // L: 10641
												var20 = var10.color2; // L: 10642
												if (var10 == class4.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10643
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10644
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10647
												if (var10 == class4.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10648
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10650
												ItemComposition var45 = UserComparator6.ItemDefinition_get(var10.itemId); // L: 10651
												var44 = var45.name; // L: 10652
												if (var44 == null) { // L: 10653
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10654
													var44 = UserComparator5.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + FriendSystem.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10656
												var44 = "Please wait..."; // L: 10657
												var20 = var10.color; // L: 10658
											}

											if (!var10.isIf3) { // L: 10660
												var44 = class7.method60(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10661
										}
									} else if (var10.type == 5) { // L: 10664
										SpritePixels var40;
										if (!var10.isIf3) { // L: 10665
											var40 = var10.getSprite(class28.runCs1(var10)); // L: 10666
											if (var40 != null) { // L: 10667
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3223) { // L: 10668
												SecureRandomCallable.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10672
												var40 = EnumComposition.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 10673
											}

											if (var40 == null) { // L: 10674
												if (Widget.field3223) { // L: 10698
													SecureRandomCallable.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 10675
												var21 = var40.height; // L: 10676
												if (!var10.spriteTiling) { // L: 10677
													var22 = var10.width * 4096 / var20; // L: 10691
													if (var10.spriteAngle != 0) { // L: 10692
														var40.method7781(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10693
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10694
														var40.drawTransBgAt(var12, var13); // L: 10695
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10678
													var22 = (var20 - 1 + var10.width) / var20; // L: 10679
													var23 = (var21 - 1 + var10.height) / var21; // L: 10680

													for (var24 = 0; var24 < var22; ++var24) { // L: 10681
														for (var25 = 0; var25 < var23; ++var25) { // L: 10682
															if (var10.spriteAngle != 0) { // L: 10683
																var40.method7781(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10684
																var40.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var24 * var20, var13 + var21 * var25); // L: 10685
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10688
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10702
											boolean var36 = class28.runCs1(var10); // L: 10703
											if (var36) { // L: 10705
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10706
											}

											Model var41 = null; // L: 10707
											var22 = 0; // L: 10708
											if (var10.itemId != -1) { // L: 10709
												var33 = UserComparator6.ItemDefinition_get(var10.itemId); // L: 10710
												if (var33 != null) { // L: 10711
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10712
													var41 = var33.getModel(1); // L: 10713
													if (var41 != null) { // L: 10714
														var41.calculateBoundsCylinder(); // L: 10715
														var22 = var41.height / 2; // L: 10716
													} else {
														SecureRandomCallable.invalidateWidget(var10); // L: 10718
													}
												}
											} else if (var10.modelType == 5) { // L: 10721
												if (var10.modelId == 0) { // L: 10722
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class340.localPlayer.getModel(); // L: 10723
												}
											} else if (var20 == -1) { // L: 10725
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class340.localPlayer.appearance); // L: 10726
												if (var41 == null && Widget.field3223) { // L: 10727
													SecureRandomCallable.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = UserComparator5.SequenceDefinition_get(var20); // L: 10730
												var41 = var10.getModel(var47, var10.modelFrame, var36, class340.localPlayer.appearance); // L: 10731
												if (var41 == null && Widget.field3223) { // L: 10732
													SecureRandomCallable.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3913(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10734
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10735
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10736
											if (var41 != null) { // L: 10737
												if (!var10.isIf3) { // L: 10738
													var41.method4241(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10740
													if (var10.modelOrthog) { // L: 10741
														var41.method4211(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4241(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10742
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10745
										} else {
											if (var10.type == 7) { // L: 10748
												var39 = var10.getFont(); // L: 10749
												if (var39 == null) { // L: 10750
													if (Widget.field3223) { // L: 10751
														SecureRandomCallable.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10754

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10755
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10756
														if (var10.itemIds[var20] > 0) { // L: 10757
															var33 = UserComparator6.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 10758
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10760
																var34 = UserComparator5.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = UserComparator5.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + FriendSystem.formatItemStacks(var10.itemQuantities[var20]); // L: 10761
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 10762
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 10763
															if (var10.textXAlignment == 0) { // L: 10764
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10765
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10766
															}
														}

														++var20; // L: 10768
													}
												}
											}

											if (var10.type == 8 && var10 == class281.field3375 && Client.field628 == Client.field714) { // L: 10772 10773
												var19 = 0; // L: 10774
												var20 = 0; // L: 10775
												Font var31 = class114.fontPlain12; // L: 10776
												String var32 = var10.text; // L: 10777

												String var43;
												for (var32 = class7.method60(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10779 10780 10792
													var24 = var32.indexOf("<br>"); // L: 10781
													if (var24 != -1) { // L: 10782
														var43 = var32.substring(0, var24); // L: 10783
														var32 = var32.substring(var24 + 4); // L: 10784
													} else {
														var43 = var32; // L: 10787
														var32 = ""; // L: 10788
													}

													var25 = var31.stringWidth(var43); // L: 10790
													if (var25 > var19) { // L: 10791
														var19 = var25;
													}
												}

												var19 += 6; // L: 10794
												var20 += 7; // L: 10795
												var24 = var12 + var10.width - 5 - var19; // L: 10796
												var25 = var13 + var10.height + 5; // L: 10797
												if (var24 < var12 + 5) { // L: 10798
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10799
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10800
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10801
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10802
												var32 = var10.text; // L: 10803
												var26 = var25 + var31.ascent + 2; // L: 10804

												for (var32 = class7.method60(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10805 10806 10817
													int var27 = var32.indexOf("<br>"); // L: 10807
													if (var27 != -1) { // L: 10808
														var43 = var32.substring(0, var27); // L: 10809
														var32 = var32.substring(var27 + 4); // L: 10810
													} else {
														var43 = var32; // L: 10813
														var32 = ""; // L: 10814
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10816
												}
											}

											if (var10.type == 9) { // L: 10821
												if (var10.field3359) { // L: 10826
													var19 = var12; // L: 10827
													var20 = var13 + var10.height; // L: 10828
													var21 = var12 + var10.width; // L: 10829
													var22 = var13; // L: 10830
												} else {
													var19 = var12; // L: 10833
													var20 = var13; // L: 10834
													var21 = var12 + var10.width; // L: 10835
													var22 = var13 + var10.height; // L: 10836
												}

												if (var10.lineWid == 1) { // L: 10838
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10839
												} else {
													ScriptEvent.method2147(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10842
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

	} // L: 10847
}
