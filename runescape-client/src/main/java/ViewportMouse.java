import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("o")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1945056399
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1225811149
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("k")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1930165541
	)
	static int field2635;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -783601851
	)
	static int field2630;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 608369071
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("t")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llp;III)Lqd;",
		garbageValue = "-1263011197"
	)
	static IndexedSprite method4372(AbstractArchive var0, int var1, int var2) {
		if (!User.method6514(var0, var1, var2)) { // L: 45
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite(); // L: 48
			var4.width = class453.SpriteBuffer_spriteWidth; // L: 49
			var4.height = class453.SpriteBuffer_spriteHeight; // L: 50
			var4.xOffset = class453.SpriteBuffer_xOffsets[0]; // L: 51
			var4.yOffset = class453.SpriteBuffer_yOffsets[0]; // L: 52
			var4.subWidth = ScriptFrame.SpriteBuffer_spriteWidths[0]; // L: 53
			var4.subHeight = class453.SpriteBuffer_spriteHeights[0]; // L: 54
			var4.palette = Decimator.SpriteBuffer_spritePalette; // L: 55
			var4.pixels = class127.SpriteBuffer_pixels[0]; // L: 56
			VarcInt.method3325(); // L: 57
			return var4; // L: 60
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "([Lki;IIIIIIIII)V",
		garbageValue = "497797747"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10217
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10218

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10219
			Widget var10 = var0[var9]; // L: 10220
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10221 10222
				int var11;
				if (var8 == -1) { // L: 10224
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10225
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10226
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10227
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10228
					var11 = ++Client.rootWidgetCount - 1; // L: 10229
				} else {
					var11 = var8; // L: 10231
				}

				var10.rootIndex = var11; // L: 10232
				var10.cycle = Client.cycle; // L: 10233
				if (!var10.isIf3 || !class434.isComponentHidden(var10)) { // L: 10234
					if (var10.contentType > 0) { // L: 10235
						WorldMapDecorationType.method5575(var10);
					}

					int var12 = var10.x + var6; // L: 10236
					int var13 = var7 + var10.y; // L: 10237
					int var14 = var10.transparencyTop; // L: 10238
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10239
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10240
							BuddyRankComparator.field1408 = var0; // L: 10241
							class151.field1729 = var6; // L: 10242
							class162.field1810 = var7; // L: 10243
							continue; // L: 10244
						}

						if (Client.isDraggingWidget && Client.field574) { // L: 10246
							var15 = MouseHandler.MouseHandler_x; // L: 10247
							var16 = MouseHandler.MouseHandler_y; // L: 10248
							var15 -= Client.widgetClickX; // L: 10249
							var16 -= Client.widgetClickY; // L: 10250
							if (var15 < Client.field747) { // L: 10251
								var15 = Client.field747;
							}

							if (var15 + var10.width > Client.field747 + Client.clickedWidgetParent.width) { // L: 10252
								var15 = Client.field747 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field674) { // L: 10253
								var16 = Client.field674;
							}

							if (var16 + var10.height > Client.field674 + Client.clickedWidgetParent.height) { // L: 10254
								var16 = Client.field674 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10255
							var13 = var16; // L: 10256
						}

						if (!var10.isScrollBar) { // L: 10258
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 10264
						var15 = var2; // L: 10265
						var16 = var3; // L: 10266
						var17 = var4; // L: 10267
						var18 = var5; // L: 10268
					} else if (var10.type == 9) { // L: 10270
						var19 = var12; // L: 10271
						var20 = var13; // L: 10272
						var21 = var12 + var10.width; // L: 10273
						var22 = var13 + var10.height; // L: 10274
						if (var21 < var12) { // L: 10275
							var19 = var21; // L: 10277
							var21 = var12; // L: 10278
						}

						if (var22 < var13) { // L: 10280
							var20 = var22; // L: 10282
							var22 = var13; // L: 10283
						}

						++var21; // L: 10285
						++var22; // L: 10286
						var15 = var19 > var2 ? var19 : var2; // L: 10287
						var16 = var20 > var3 ? var20 : var3; // L: 10288
						var17 = var21 < var4 ? var21 : var4; // L: 10289
						var18 = var22 < var5 ? var22 : var5; // L: 10290
					} else {
						var19 = var12 + var10.width; // L: 10293
						var20 = var13 + var10.height; // L: 10294
						var15 = var12 > var2 ? var12 : var2; // L: 10295
						var16 = var13 > var3 ? var13 : var3; // L: 10296
						var17 = var19 < var4 ? var19 : var4; // L: 10297
						var18 = var20 < var5 ? var20 : var5; // L: 10298
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10300
						if (var10.contentType != 0) { // L: 10301
							if (var10.contentType == 1336) { // L: 10302
								if (class12.clientPreferences.method2229()) { // L: 10303
									var13 += 15; // L: 10304
									class149.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10305
									var13 += 15; // L: 10306
									Runtime var42 = Runtime.getRuntime(); // L: 10307
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 10308
									var21 = 16776960; // L: 10309
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10310
										var21 = 16711680;
									}

									class149.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10311
									var13 += 15; // L: 10312
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10316
								Client.viewportX = var12; // L: 10317
								Client.viewportY = var13; // L: 10318
								ArchiveLoader.drawEntities(var12, var13, var10.width, var10.height); // L: 10319
								Client.field652[var10.rootIndex] = true; // L: 10320
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10321
								continue; // L: 10322
							}

							if (var10.contentType == 1338) { // L: 10324
								class19.drawMinimap(var10, var12, var13, var11); // L: 10325
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10326
								continue; // L: 10327
							}

							if (var10.contentType == 1339) { // L: 10329
								class18.drawCompass(var10, var12, var13, var11); // L: 10330
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10331
								continue; // L: 10332
							}

							if (var10.contentType == 1400) { // L: 10334
								ServerPacket.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10335
							}

							if (var10.contentType == 1401) { // L: 10337
								ServerPacket.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10338
							}

							if (var10.contentType == 1402) { // L: 10340
								class193.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10341
							}
						}

						if (var10.type == 0) { // L: 10344
							if (!var10.isIf3 && class434.isComponentHidden(var10) && var10 != class144.mousedOverWidgetIf1) { // L: 10345
								continue;
							}

							if (!var10.isIf3) { // L: 10346
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10347
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10348
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10350
							if (var10.children != null) { // L: 10351
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10352
							if (var30 != null) { // L: 10353
								class175.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 10354
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10356
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10357
						} else if (var10.type == 11) { // L: 10359
							if (class434.isComponentHidden(var10) && var10 != class144.mousedOverWidgetIf1) { // L: 10360
								continue;
							}

							if (var10.children != null) { // L: 10361
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10362
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10363
						}

						if (Client.isResizable || Client.field524[var11] || Client.gameDrawingMode > 1) { // L: 10365
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10366 10367
								JagexCache.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10369
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 10372
									var19 = 0; // L: 10373

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 10374
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 10375
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 10376
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 10377
											if (var19 < 20) { // L: 10378
												var22 += var10.inventoryXOffsets[var19]; // L: 10379
												var23 += var10.inventoryYOffsets[var19]; // L: 10380
											}

											if (var10.itemIds[var19] <= 0) { // L: 10382
												if (var10.inventorySprites != null && var19 < 20) { // L: 10427
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 10428
													if (var46 != null) { // L: 10429
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3407) { // L: 10430
														GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 10383
												boolean var38 = false; // L: 10384
												var26 = var10.itemIds[var19] - 1; // L: 10385
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == Canvas.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10386
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == PcmPlayer.selectedItemSlot && var10.id == class20.selectedItemWidget) { // L: 10388
														var35 = PacketWriter.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = PacketWriter.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 10389
													}

													if (var35 != null) { // L: 10390
														if (var10 == Canvas.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10391
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 10392
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 10393
															if (var24 < 5 && var24 > -5) { // L: 10394
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 10395
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 10396
																var24 = 0; // L: 10397
																var25 = 0; // L: 10398
															}

															var35.drawTransAt(var22 + var24, var25 + var23, 128); // L: 10400
															if (var1 != -1) { // L: 10401
																Widget var28 = var0[var1 & 65535]; // L: 10402
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 10403
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field727 / 3; // L: 10404
																	if (var29 > Client.field727 * 10) { // L: 10405
																		var29 = Client.field727 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 10406
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 10407
																	Client.draggedWidgetY += var29; // L: 10408
																	GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var28); // L: 10409
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 10411
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field727 / 3; // L: 10412
																	if (var29 > Client.field727 * 10) { // L: 10413
																		var29 = Client.field727 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 10414
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 10415
																	Client.draggedWidgetY -= var29; // L: 10416
																	GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var28); // L: 10417
																}
															}
														} else if (var10 == NPCComposition.field1991 && var19 == Client.field599) { // L: 10421
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 10422
														}
													} else {
														GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10); // L: 10424
													}
												}
											}

											++var19; // L: 10432
										}
									}
								} else if (var10.type == 3) { // L: 10437
									if (class401.runCs1(var10)) { // L: 10439
										var19 = var10.color2; // L: 10440
										if (var10 == class144.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10441
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10444
										if (var10 == class144.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10445
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10447
										switch(var10.fillMode.field4756) { // L: 10448
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10457
											break; // L: 10458
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10450
											break; // L: 10451
										default:
											if (var14 == 0) { // L: 10453
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10454
											}
										}
									} else if (var14 == 0) { // L: 10462
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10463
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 10467
										var39 = var10.getFont(); // L: 10468
										if (var39 == null) { // L: 10469
											if (Widget.field3407) { // L: 10470
												GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 10474
											if (class401.runCs1(var10)) { // L: 10475
												var20 = var10.color2; // L: 10476
												if (var10 == class144.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10477
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10478
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10481
												if (var10 == class144.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10482
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10484
												ItemComposition var45 = FileSystem.ItemDefinition_get(var10.itemId); // L: 10485
												var44 = var45.name; // L: 10486
												if (var44 == null) { // L: 10487
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10488
													var44 = class166.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + class427.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10490
												var44 = "Please wait..."; // L: 10491
												var20 = var10.color; // L: 10492
											}

											if (!var10.isIf3) { // L: 10494
												var44 = Clock.method3248(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10495
										}
									} else if (var10.type == 5) { // L: 10498
										SpritePixels var40;
										if (!var10.isIf3) { // L: 10499
											var40 = var10.getSprite(class401.runCs1(var10), UserComparator7.urlRequester); // L: 10500
											if (var40 != null) { // L: 10501
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3407) { // L: 10502
												GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10506
												var40 = PacketWriter.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, UserComparator7.urlRequester); // L: 10507
											}

											if (var40 == null) { // L: 10508
												if (Widget.field3407) { // L: 10532
													GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 10509
												var21 = var40.height; // L: 10510
												if (!var10.spriteTiling) { // L: 10511
													var22 = var10.width * 4096 / var20; // L: 10525
													if (var10.spriteAngle != 0) { // L: 10526
														var40.method7951(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10527
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10528
														var40.drawTransBgAt(var12, var13); // L: 10529
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10512
													var22 = (var20 - 1 + var10.width) / var20; // L: 10513
													var23 = (var21 - 1 + var10.height) / var21; // L: 10514

													for (var24 = 0; var24 < var22; ++var24) { // L: 10515
														for (var25 = 0; var25 < var23; ++var25) { // L: 10516
															if (var10.spriteAngle != 0) { // L: 10517
																var40.method7951(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10518
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 10519
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10522
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10536
											boolean var36 = class401.runCs1(var10); // L: 10537
											if (var36) { // L: 10539
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10540
											}

											Model var41 = null; // L: 10541
											var22 = 0; // L: 10542
											if (var10.itemId != -1) { // L: 10543
												var33 = FileSystem.ItemDefinition_get(var10.itemId); // L: 10544
												if (var33 != null) { // L: 10545
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10546
													var41 = var33.getModel(1); // L: 10547
													if (var41 != null) { // L: 10548
														var41.calculateBoundsCylinder(); // L: 10549
														var22 = var41.height / 2; // L: 10550
													} else {
														GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10); // L: 10552
													}
												}
											} else if (var10.modelType == 5) { // L: 10555
												if (var10.modelId == 0) { // L: 10556
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = ModelData0.localPlayer.getModel(); // L: 10557
												}
											} else if (var20 == -1) { // L: 10559
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, ModelData0.localPlayer.appearance); // L: 10560
												if (var41 == null && Widget.field3407) { // L: 10561
													GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = class114.SequenceDefinition_get(var20); // L: 10564
												var41 = var10.getModel(var47, var10.modelFrame, var36, ModelData0.localPlayer.appearance); // L: 10565
												if (var41 == null && Widget.field3407) { // L: 10566
													GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3939(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10568
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10569
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10570
											if (var41 != null) { // L: 10571
												if (!var10.isIf3) { // L: 10572
													var41.method4272(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10574
													if (var10.modelOrthog) { // L: 10575
														var41.method4273(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4272(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10576
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10579
										} else {
											if (var10.type == 7) { // L: 10582
												var39 = var10.getFont(); // L: 10583
												if (var39 == null) { // L: 10584
													if (Widget.field3407) { // L: 10585
														GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10588

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10589
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10590
														if (var10.itemIds[var20] > 0) { // L: 10591
															var33 = FileSystem.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 10592
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10594
																var34 = class166.colorStartTag(16748608) + var33.name + "</col>"; // L: 10595
															} else {
																var34 = class166.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + class427.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 10596
															var26 = var13 + (var10.paddingY + 12) * var21; // L: 10597
															if (var10.textXAlignment == 0) { // L: 10598
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10599
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10600
															}
														}

														++var20; // L: 10602
													}
												}
											}

											if (var10.type == 8 && var10 == class113.field1422 && Client.field645 == Client.field702) { // L: 10606 10607
												var19 = 0; // L: 10608
												var20 = 0; // L: 10609
												Font var31 = class149.fontPlain12; // L: 10610
												String var32 = var10.text; // L: 10611

												String var43;
												for (var32 = Clock.method3248(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10613 10614 10626
													var24 = var32.indexOf("<br>"); // L: 10615
													if (var24 != -1) { // L: 10616
														var43 = var32.substring(0, var24); // L: 10617
														var32 = var32.substring(var24 + 4); // L: 10618
													} else {
														var43 = var32; // L: 10621
														var32 = ""; // L: 10622
													}

													var25 = var31.stringWidth(var43); // L: 10624
													if (var25 > var19) { // L: 10625
														var19 = var25;
													}
												}

												var19 += 6; // L: 10628
												var20 += 7; // L: 10629
												var24 = var12 + var10.width - 5 - var19; // L: 10630
												var25 = var13 + var10.height + 5; // L: 10631
												if (var24 < var12 + 5) { // L: 10632
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10633
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10634
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10635
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10636
												var32 = var10.text; // L: 10637
												var26 = var25 + var31.ascent + 2; // L: 10638

												for (var32 = Clock.method3248(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10639 10640 10651
													int var27 = var32.indexOf("<br>"); // L: 10641
													if (var27 != -1) { // L: 10642
														var43 = var32.substring(0, var27); // L: 10643
														var32 = var32.substring(var27 + 4); // L: 10644
													} else {
														var43 = var32; // L: 10647
														var32 = ""; // L: 10648
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10650
												}
											}

											if (var10.type == 9) { // L: 10655
												if (var10.field3428) { // L: 10660
													var19 = var12; // L: 10661
													var20 = var13 + var10.height; // L: 10662
													var21 = var12 + var10.width; // L: 10663
													var22 = var13; // L: 10664
												} else {
													var19 = var12; // L: 10667
													var20 = var13; // L: 10668
													var21 = var12 + var10.width; // L: 10669
													var22 = var13 + var10.height; // L: 10670
												}

												if (var10.lineWid == 1) { // L: 10672
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10673
												} else {
													class433.method7433(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10676
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

	} // L: 10681

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-2073465048"
	)
	static void method4374(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12608
		if (Client.randomDatData == null) { // L: 12610
			Client.randomDatData = new byte[24];
		}

		class351.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12611
		if (JagexCache.JagexCache_randomDat != null) { // L: 12614
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12616
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 12617
			} catch (Exception var4) { // L: 12619
			}
		}

	} // L: 12622
}
