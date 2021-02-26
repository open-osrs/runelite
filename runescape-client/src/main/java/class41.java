import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class41 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lcq;Lcq;IZI)I",
		garbageValue = "-1892807226"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1880() ? (var1.method1880() ? 0 : 1) : (var1.method1880() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1878() ? (var1.method1878() ? 0 : 1) : (var1.method1878() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-20058245"
	)
	static void method650() {
		GrandExchangeOfferTotalQuantityComparator.method162(CollisionMap.menuWidth / 2 + ApproximateRouteStrategy.menuX, AbstractUserComparator.menuY); // L: 7981
	} // L: 7982

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "([Lhz;IIIIIIIII)V",
		garbageValue = "-1513061199"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9398
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9399

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9400
			Widget var10 = var0[var9]; // L: 9401
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9402 9403
				int var11;
				if (var8 == -1) { // L: 9405
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9406
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9407
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9408
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9409
					var11 = ++Client.rootWidgetCount - 1; // L: 9410
				} else {
					var11 = var8; // L: 9412
				}

				var10.rootIndex = var11; // L: 9413
				var10.cycle = Client.cycle; // L: 9414
				if (!var10.isIf3 || !DevicePcmPlayerProvider.isComponentHidden(var10)) { // L: 9415
					if (var10.contentType > 0) { // L: 9416
						WorldMapSection2.method401(var10);
					}

					int var12 = var10.x + var6; // L: 9417
					int var13 = var7 + var10.y; // L: 9418
					int var14 = var10.transparencyTop; // L: 9419
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9420
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9421
							WorldMapAreaData.field362 = var0; // L: 9422
							WorldMapIcon_1.field218 = var6; // L: 9423
							GrandExchangeOfferOwnWorldComparator.field656 = var7; // L: 9424
							continue; // L: 9425
						}

						if (Client.isDraggingWidget && Client.field912) { // L: 9427
							var15 = MouseHandler.MouseHandler_x; // L: 9428
							var16 = MouseHandler.MouseHandler_y; // L: 9429
							var15 -= Client.widgetClickX; // L: 9430
							var16 -= Client.widgetClickY; // L: 9431
							if (var15 < Client.field714) { // L: 9432
								var15 = Client.field714;
							}

							if (var15 + var10.width > Client.field714 + Client.clickedWidgetParent.width) { // L: 9433
								var15 = Client.field714 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field844) { // L: 9434
								var16 = Client.field844;
							}

							if (var16 + var10.height > Client.field844 + Client.clickedWidgetParent.height) { // L: 9435
								var16 = Client.field844 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9436
							var13 = var16; // L: 9437
						}

						if (!var10.isScrollBar) { // L: 9439
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9445
						var15 = var2; // L: 9446
						var16 = var3; // L: 9447
						var17 = var4; // L: 9448
						var18 = var5; // L: 9449
					} else if (var10.type == 9) { // L: 9451
						var19 = var12; // L: 9452
						var20 = var13; // L: 9453
						var21 = var12 + var10.width; // L: 9454
						var22 = var13 + var10.height; // L: 9455
						if (var21 < var12) { // L: 9456
							var19 = var21; // L: 9458
							var21 = var12; // L: 9459
						}

						if (var22 < var13) { // L: 9461
							var20 = var22; // L: 9463
							var22 = var13; // L: 9464
						}

						++var21; // L: 9466
						++var22; // L: 9467
						var15 = var19 > var2 ? var19 : var2; // L: 9468
						var16 = var20 > var3 ? var20 : var3; // L: 9469
						var17 = var21 < var4 ? var21 : var4; // L: 9470
						var18 = var22 < var5 ? var22 : var5; // L: 9471
					} else {
						var19 = var12 + var10.width; // L: 9474
						var20 = var13 + var10.height; // L: 9475
						var15 = var12 > var2 ? var12 : var2; // L: 9476
						var16 = var13 > var3 ? var13 : var3; // L: 9477
						var17 = var19 < var4 ? var19 : var4; // L: 9478
						var18 = var20 < var5 ? var20 : var5; // L: 9479
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9481
						if (var10.contentType != 0) { // L: 9482
							if (var10.contentType == 1336) { // L: 9483
								if (Client.displayFps) { // L: 9484
									var13 += 15; // L: 9485
									Login.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9486
									var13 += 15; // L: 9487
									Runtime var42 = Runtime.getRuntime(); // L: 9488
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9489
									var21 = 16776960; // L: 9490
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9491
										var21 = 16711680;
									}

									Login.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9492
									var13 += 15; // L: 9493
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9497
								Client.viewportX = var12; // L: 9498
								Client.viewportY = var13; // L: 9499
								class13.drawEntities(var12, var13, var10.width, var10.height); // L: 9500
								Client.field816[var10.rootIndex] = true; // L: 9501
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9502
								continue; // L: 9503
							}

							if (var10.contentType == 1338) { // L: 9505
								class204.drawMinimap(var10, var12, var13, var11); // L: 9506
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9507
								continue; // L: 9508
							}

							if (var10.contentType == 1339) { // L: 9510
								Message.drawCompass(var10, var12, var13, var11); // L: 9511
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9512
								continue; // L: 9513
							}

							if (var10.contentType == 1400) { // L: 9515
								SoundSystem.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9516
							}

							if (var10.contentType == 1401) { // L: 9518
								SoundSystem.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9519
							}

							if (var10.contentType == 1402) { // L: 9521
								class9.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9522
							}
						}

						if (var10.type == 0) { // L: 9525
							if (!var10.isIf3 && DevicePcmPlayerProvider.isComponentHidden(var10) && var10 != Canvas.mousedOverWidgetIf1) { // L: 9526
								continue;
							}

							if (!var10.isIf3) { // L: 9527
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9528
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9529
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9531
							if (var10.children != null) { // L: 9532
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9533
							if (var30 != null) { // L: 9534
								ViewportMouse.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9535
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9537
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9538
						}

						if (Client.isResizable || Client.field871[var11] || Client.gameDrawingMode > 1) { // L: 9540
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9541 9542
								WorldMapLabelSize.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9544
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9547
									var19 = 0; // L: 9548

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9549
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9550
											var22 = var21 * (var10.paddingX + 32) + var12; // L: 9551
											var23 = var20 * (var10.paddingY + 32) + var13; // L: 9552
											if (var19 < 20) { // L: 9553
												var22 += var10.inventoryXOffsets[var19]; // L: 9554
												var23 += var10.inventoryYOffsets[var19]; // L: 9555
											}

											if (var10.itemIds[var19] <= 0) { // L: 9557
												if (var10.inventorySprites != null && var19 < 20) { // L: 9602
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9603
													if (var46 != null) { // L: 9604
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2591) { // L: 9605
														IsaacCipher.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9558
												boolean var38 = false; // L: 9559
												var26 = var10.itemIds[var19] - 1; // L: 9560
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == JagexCache.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9561
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == class195.selectedItemSlot && var10.id == ClientPacket.selectedItemWidget) { // L: 9563
														var35 = TaskHandler.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = TaskHandler.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9564
													}

													if (var35 != null) { // L: 9565
														if (var10 == JagexCache.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9566
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9567
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9568
															if (var24 < 5 && var24 > -5) { // L: 9569
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9570
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9571
																var24 = 0; // L: 9572
																var25 = 0; // L: 9573
															}

															var35.drawTransAt(var22 + var24, var23 + var25, 128); // L: 9575
															if (var1 != -1) { // L: 9576
																Widget var28 = var0[var1 & 65535]; // L: 9577
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9578
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field808 / 3; // L: 9579
																	if (var29 > Client.field808 * 10) { // L: 9580
																		var29 = Client.field808 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9581
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9582
																	Client.draggedWidgetY += var29; // L: 9583
																	IsaacCipher.invalidateWidget(var28); // L: 9584
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9586
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field808 / 3; // L: 9587
																	if (var29 > Client.field808 * 10) { // L: 9588
																		var29 = Client.field808 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9589
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9590
																	Client.draggedWidgetY -= var29; // L: 9591
																	IsaacCipher.invalidateWidget(var28); // L: 9592
																}
															}
														} else if (var10 == WorldMapSprite.field260 && var19 == Client.field931) { // L: 9596
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9597
														}
													} else {
														IsaacCipher.invalidateWidget(var10); // L: 9599
													}
												}
											}

											++var19; // L: 9607
										}
									}
								} else if (var10.type == 3) { // L: 9612
									if (GrandExchangeOfferWorldComparator.runCs1(var10)) { // L: 9614
										var19 = var10.color2; // L: 9615
										if (var10 == Canvas.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9616
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9619
										if (var10 == Canvas.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9620
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9622
										switch(var10.fillMode.field3898) { // L: 9623
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9629
											break; // L: 9630
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9632
											break; // L: 9633
										default:
											if (var14 == 0) { // L: 9625
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9626
											}
										}
									} else if (var14 == 0) { // L: 9637
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9638
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9642
										var39 = var10.getFont(); // L: 9643
										if (var39 == null) { // L: 9644
											if (Widget.field2591) { // L: 9645
												IsaacCipher.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9649
											if (GrandExchangeOfferWorldComparator.runCs1(var10)) { // L: 9650
												var20 = var10.color2; // L: 9651
												if (var10 == Canvas.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9652
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9653
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9656
												if (var10 == Canvas.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9657
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9659
												ItemComposition var45 = class281.ItemDefinition_get(var10.itemId); // L: 9660
												var44 = var45.name; // L: 9661
												if (var44 == null) { // L: 9662
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9663
													var44 = FileSystem.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + WorldMapRectangle.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9665
												var44 = "Please wait..."; // L: 9666
												var20 = var10.color; // L: 9667
											}

											if (!var10.isIf3) { // L: 9669
												var44 = class9.method95(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9670
										}
									} else if (var10.type == 5) { // L: 9673
										SpritePixels var40;
										if (!var10.isIf3) { // L: 9674
											var40 = var10.getSprite(GrandExchangeOfferWorldComparator.runCs1(var10)); // L: 9675
											if (var40 != null) { // L: 9676
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2591) { // L: 9677
												IsaacCipher.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9681
												var40 = TaskHandler.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 9682
											}

											if (var40 == null) { // L: 9683
												if (Widget.field2591) { // L: 9707
													IsaacCipher.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9684
												var21 = var40.height; // L: 9685
												if (!var10.spriteTiling) { // L: 9686
													var22 = var10.width * 4096 / var20; // L: 9700
													if (var10.spriteAngle != 0) { // L: 9701
														var40.method6425(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9702
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9703
														var40.drawTransBgAt(var12, var13); // L: 9704
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9687
													var22 = (var20 - 1 + var10.width) / var20; // L: 9688
													var23 = (var21 - 1 + var10.height) / var21; // L: 9689

													for (var24 = 0; var24 < var22; ++var24) { // L: 9690
														for (var25 = 0; var25 < var23; ++var25) { // L: 9691
															if (var10.spriteAngle != 0) { // L: 9692
																var40.method6425(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9693
																var40.drawTransAt(var12 + var24 * var20, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var24 * var20, var13 + var21 * var25); // L: 9694
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9697
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 9711
											boolean var36 = GrandExchangeOfferWorldComparator.runCs1(var10); // L: 9712
											if (var36) { // L: 9714
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 9715
											}

											Model var41 = null; // L: 9716
											var22 = 0; // L: 9717
											if (var10.itemId != -1) { // L: 9718
												var33 = class281.ItemDefinition_get(var10.itemId); // L: 9719
												if (var33 != null) { // L: 9720
													var33 = var33.getCountObj(var10.itemQuantity); // L: 9721
													var41 = var33.getModel(1); // L: 9722
													if (var41 != null) { // L: 9723
														var41.calculateBoundsCylinder(); // L: 9724
														var22 = var41.height / 2; // L: 9725
													} else {
														IsaacCipher.invalidateWidget(var10); // L: 9727
													}
												}
											} else if (var10.modelType == 5) { // L: 9730
												if (var10.modelId == 0) { // L: 9731
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = UserComparator9.localPlayer.getModel(); // L: 9732
												}
											} else if (var20 == -1) { // L: 9734
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, UserComparator9.localPlayer.appearance); // L: 9735
												if (var41 == null && Widget.field2591) { // L: 9736
													IsaacCipher.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = InterfaceParent.SequenceDefinition_get(var20); // L: 9739
												var41 = var10.getModel(var47, var10.modelFrame, var36, UserComparator9.localPlayer.appearance); // L: 9740
												if (var41 == null && Widget.field2591) { // L: 9741
													IsaacCipher.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3169(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9743
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9744
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9745
											if (var41 != null) { // L: 9746
												if (!var10.isIf3) { // L: 9747
													var41.method3106(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9749
													if (var10.modelOrthog) { // L: 9750
														var41.method3053(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method3106(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9751
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9754
										} else {
											if (var10.type == 7) { // L: 9757
												var39 = var10.getFont(); // L: 9758
												if (var39 == null) { // L: 9759
													if (Widget.field2591) { // L: 9760
														IsaacCipher.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9763

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9764
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9765
														if (var10.itemIds[var20] > 0) { // L: 9766
															var33 = class281.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9767
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9769
																var34 = FileSystem.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = FileSystem.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + WorldMapRectangle.formatItemStacks(var10.itemQuantities[var20]); // L: 9770
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 9771
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 9772
															if (var10.textXAlignment == 0) { // L: 9773
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9774
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9775
															}
														}

														++var20; // L: 9777
													}
												}
											}

											if (var10.type == 8 && var10 == GrandExchangeOffer.field100 && Client.field815 == Client.field925) { // L: 9781 9782
												var19 = 0; // L: 9783
												var20 = 0; // L: 9784
												Font var31 = Login.fontPlain12; // L: 9785
												String var32 = var10.text; // L: 9786

												String var43;
												for (var32 = class9.method95(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 9788 9789 9801
													var24 = var32.indexOf("<br>"); // L: 9790
													if (var24 != -1) { // L: 9791
														var43 = var32.substring(0, var24); // L: 9792
														var32 = var32.substring(var24 + 4); // L: 9793
													} else {
														var43 = var32; // L: 9796
														var32 = ""; // L: 9797
													}

													var25 = var31.stringWidth(var43); // L: 9799
													if (var25 > var19) { // L: 9800
														var19 = var25;
													}
												}

												var19 += 6; // L: 9803
												var20 += 7; // L: 9804
												var24 = var12 + var10.width - 5 - var19; // L: 9805
												var25 = var13 + var10.height + 5; // L: 9806
												if (var24 < var12 + 5) { // L: 9807
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 9808
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 9809
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 9810
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 9811
												var32 = var10.text; // L: 9812
												var26 = var25 + var31.ascent + 2; // L: 9813

												for (var32 = class9.method95(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 9814 9815 9826
													int var27 = var32.indexOf("<br>"); // L: 9816
													if (var27 != -1) { // L: 9817
														var43 = var32.substring(0, var27); // L: 9818
														var32 = var32.substring(var27 + 4); // L: 9819
													} else {
														var43 = var32; // L: 9822
														var32 = ""; // L: 9823
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 9825
												}
											}

											if (var10.type == 9) { // L: 9830
												if (var10.field2627) { // L: 9835
													var19 = var12; // L: 9836
													var20 = var13 + var10.height; // L: 9837
													var21 = var12 + var10.width; // L: 9838
													var22 = var13; // L: 9839
												} else {
													var19 = var12; // L: 9842
													var20 = var13; // L: 9843
													var21 = var12 + var10.width; // L: 9844
													var22 = var13 + var10.height; // L: 9845
												}

												if (var10.lineWid == 1) { // L: 9847
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 9848
												} else {
													GrandExchangeOfferNameComparator.method199(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 9851
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

	} // L: 9856
}
