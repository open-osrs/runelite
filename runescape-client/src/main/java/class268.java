import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public final class class268 {
	@ObfuscatedName("i")
	static final HashMap field3142;

	static {
		field3142 = new HashMap(); // L: 10
		java.util.Calendar.getInstance(method5197("Europe/London")); // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-1547649433"
	)
	static TimeZone method5197(String var0) {
		synchronized(field3142) { // L: 21
			TimeZone var2 = (TimeZone)field3142.get(var0); // L: 22
			if (var2 == null) { // L: 23
				var2 = TimeZone.getTimeZone(var0); // L: 24
				field3142.put(var0, var2); // L: 25
			}

			return var2; // L: 27
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1355418320"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher); // L: 9681
		var2.packetBuffer.writeIntME(var0); // L: 9682
		var2.packetBuffer.method7710(var1); // L: 9683
		Client.packetWriter.addNode(var2); // L: 9684
	} // L: 9685

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "([Lky;IIIIIIIIB)V",
		garbageValue = "-98"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10231
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10232

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10233
			Widget var10 = var0[var9]; // L: 10234
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10235 10236
				int var11;
				if (var8 == -1) { // L: 10238
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10239
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10240
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10241
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10242
					var11 = ++Client.rootWidgetCount - 1; // L: 10243
				} else {
					var11 = var8; // L: 10245
				}

				var10.rootIndex = var11; // L: 10246
				var10.cycle = Client.cycle; // L: 10247
				if (!var10.isIf3 || !class1.isComponentHidden(var10)) { // L: 10248
					if (var10.contentType > 0) { // L: 10249
						class231.method4712(var10);
					}

					int var12 = var10.x + var6; // L: 10250
					int var13 = var7 + var10.y; // L: 10251
					int var14 = var10.transparencyTop; // L: 10252
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10253
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10254
							class307.field3585 = var0; // L: 10255
							class93.field1252 = var6; // L: 10256
							ItemContainer.field1013 = var7; // L: 10257
							continue; // L: 10258
						}

						if (Client.isDraggingWidget && Client.field696) { // L: 10260
							var15 = MouseHandler.MouseHandler_x; // L: 10261
							var16 = MouseHandler.MouseHandler_y; // L: 10262
							var15 -= Client.widgetClickX; // L: 10263
							var16 -= Client.widgetClickY; // L: 10264
							if (var15 < Client.field773) { // L: 10265
								var15 = Client.field773;
							}

							if (var15 + var10.width > Client.field773 + Client.clickedWidgetParent.width) { // L: 10266
								var15 = Client.field773 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field686) { // L: 10267
								var16 = Client.field686;
							}

							if (var16 + var10.height > Client.field686 + Client.clickedWidgetParent.height) { // L: 10268
								var16 = Client.field686 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10269
							var13 = var16; // L: 10270
						}

						if (!var10.isScrollBar) { // L: 10272
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 10278
						var15 = var2; // L: 10279
						var16 = var3; // L: 10280
						var17 = var4; // L: 10281
						var18 = var5; // L: 10282
					} else if (var10.type == 9) { // L: 10284
						var19 = var12; // L: 10285
						var20 = var13; // L: 10286
						var21 = var12 + var10.width; // L: 10287
						var22 = var13 + var10.height; // L: 10288
						if (var21 < var12) { // L: 10289
							var19 = var21; // L: 10291
							var21 = var12; // L: 10292
						}

						if (var22 < var13) { // L: 10294
							var20 = var22; // L: 10296
							var22 = var13; // L: 10297
						}

						++var21; // L: 10299
						++var22; // L: 10300
						var15 = var19 > var2 ? var19 : var2; // L: 10301
						var16 = var20 > var3 ? var20 : var3; // L: 10302
						var17 = var21 < var4 ? var21 : var4; // L: 10303
						var18 = var22 < var5 ? var22 : var5; // L: 10304
					} else {
						var19 = var12 + var10.width; // L: 10307
						var20 = var13 + var10.height; // L: 10308
						var15 = var12 > var2 ? var12 : var2; // L: 10309
						var16 = var13 > var3 ? var13 : var3; // L: 10310
						var17 = var19 < var4 ? var19 : var4; // L: 10311
						var18 = var20 < var5 ? var20 : var5; // L: 10312
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10314
						if (var10.contentType != 0) { // L: 10315
							if (var10.contentType == 1336) { // L: 10316
								if (class131.clientPreferences.method2236()) { // L: 10317
									var13 += 15; // L: 10318
									class13.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10319
									var13 += 15; // L: 10320
									Runtime var42 = Runtime.getRuntime(); // L: 10321
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 10322
									var21 = 16776960; // L: 10323
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10324
										var21 = 16711680;
									}

									class13.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10325
									var13 += 15; // L: 10326
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10330
								Client.viewportX = var12; // L: 10331
								Client.viewportY = var13; // L: 10332
								SequenceDefinition.drawEntities(var12, var13, var10.width, var10.height); // L: 10333
								Client.field715[var10.rootIndex] = true; // L: 10334
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10335
								continue; // L: 10336
							}

							if (var10.contentType == 1338) { // L: 10338
								ArchiveDiskActionHandler.drawMinimap(var10, var12, var13, var11); // L: 10339
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10340
								continue; // L: 10341
							}

							if (var10.contentType == 1339) { // L: 10343
								PacketWriter.drawCompass(var10, var12, var13, var11); // L: 10344
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10345
								continue; // L: 10346
							}

							if (var10.contentType == 1400) { // L: 10348
								ScriptFrame.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10349
							}

							if (var10.contentType == 1401) { // L: 10351
								ScriptFrame.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10352
							}

							if (var10.contentType == 1402) { // L: 10354
								class341.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10355
							}
						}

						if (var10.type == 0) { // L: 10358
							if (!var10.isIf3 && class1.isComponentHidden(var10) && var10 != DevicePcmPlayerProvider.mousedOverWidgetIf1) { // L: 10359
								continue;
							}

							if (!var10.isIf3) { // L: 10360
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10361
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10362
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10364
							if (var10.children != null) { // L: 10365
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10366
							if (var30 != null) { // L: 10367
								class131.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 10368
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10370
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10371
						} else if (var10.type == 11) { // L: 10373
							if (class1.isComponentHidden(var10) && var10 != DevicePcmPlayerProvider.mousedOverWidgetIf1) { // L: 10374
								continue;
							}

							if (var10.children != null) { // L: 10375
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10376
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10377
						}

						if (Client.isResizable || Client.field717[var11] || Client.gameDrawingMode > 1) { // L: 10379
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10380 10381
								SoundSystem.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10383
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 10386
									var19 = 0; // L: 10387

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 10388
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 10389
											var22 = var21 * (var10.paddingX + 32) + var12; // L: 10390
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 10391
											if (var19 < 20) { // L: 10392
												var22 += var10.inventoryXOffsets[var19]; // L: 10393
												var23 += var10.inventoryYOffsets[var19]; // L: 10394
											}

											if (var10.itemIds[var19] <= 0) { // L: 10396
												if (var10.inventorySprites != null && var19 < 20) { // L: 10441
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 10442
													if (var46 != null) { // L: 10443
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3411) { // L: 10444
														class346.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 10397
												boolean var38 = false; // L: 10398
												var26 = var10.itemIds[var19] - 1; // L: 10399
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class142.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10400
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == class432.selectedItemSlot && var10.id == TaskHandler.selectedItemWidget) { // L: 10402
														var35 = class135.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = class135.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 10403
													}

													if (var35 != null) { // L: 10404
														if (var10 == class142.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10405
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 10406
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 10407
															if (var24 < 5 && var24 > -5) { // L: 10408
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 10409
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 10410
																var24 = 0; // L: 10411
																var25 = 0; // L: 10412
															}

															var35.drawTransAt(var24 + var22, var23 + var25, 128); // L: 10414
															if (var1 != -1) { // L: 10415
																Widget var28 = var0[var1 & 65535]; // L: 10416
																int var29;
																if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 10417
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field556 / 3; // L: 10418
																	if (var29 > Client.field556 * 10) { // L: 10419
																		var29 = Client.field556 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 10420
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 10421
																	Client.draggedWidgetY += var29; // L: 10422
																	class346.invalidateWidget(var28); // L: 10423
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 10425
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field556 / 3; // L: 10426
																	if (var29 > Client.field556 * 10) { // L: 10427
																		var29 = Client.field556 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 10428
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 10429
																	Client.draggedWidgetY -= var29; // L: 10430
																	class346.invalidateWidget(var28); // L: 10431
																}
															}
														} else if (var10 == GrandExchangeOfferAgeComparator.field4011 && var19 == Client.field611) { // L: 10435
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 10436
														}
													} else {
														class346.invalidateWidget(var10); // L: 10438
													}
												}
											}

											++var19; // L: 10446
										}
									}
								} else if (var10.type == 3) { // L: 10451
									if (Skills.runCs1(var10)) { // L: 10453
										var19 = var10.color2; // L: 10454
										if (var10 == DevicePcmPlayerProvider.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10455
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10458
										if (var10 == DevicePcmPlayerProvider.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10459
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10461
										switch(var10.fillMode.field4699) { // L: 10462
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10471
											break; // L: 10472
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10464
											break; // L: 10465
										default:
											if (var14 == 0) { // L: 10467
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10468
											}
										}
									} else if (var14 == 0) { // L: 10476
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10477
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 10481
										var39 = var10.getFont(); // L: 10482
										if (var39 == null) { // L: 10483
											if (Widget.field3411) { // L: 10484
												class346.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 10488
											if (Skills.runCs1(var10)) { // L: 10489
												var20 = var10.color2; // L: 10490
												if (var10 == DevicePcmPlayerProvider.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10491
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10492
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10495
												if (var10 == DevicePcmPlayerProvider.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10496
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10498
												ItemComposition var45 = class19.ItemDefinition_get(var10.itemId); // L: 10499
												var44 = var45.name; // L: 10500
												if (var44 == null) { // L: 10501
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10502
													var44 = UserComparator9.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + ParamComposition.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10504
												var44 = "Please wait..."; // L: 10505
												var20 = var10.color; // L: 10506
											}

											if (!var10.isIf3) { // L: 10508
												var44 = class431.method7592(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10509
										}
									} else if (var10.type == 5) { // L: 10512
										SpritePixels var40;
										if (!var10.isIf3) { // L: 10513
											var40 = var10.getSprite(Skills.runCs1(var10), VerticalAlignment.urlRequester); // L: 10514
											if (var40 != null) { // L: 10515
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3411) { // L: 10516
												class346.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10520
												var40 = class135.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, VerticalAlignment.urlRequester); // L: 10521
											}

											if (var40 == null) { // L: 10522
												if (Widget.field3411) { // L: 10546
													class346.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 10523
												var21 = var40.height; // L: 10524
												if (!var10.spriteTiling) { // L: 10525
													var22 = var10.width * 4096 / var20; // L: 10539
													if (var10.spriteAngle != 0) { // L: 10540
														var40.method8106(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10541
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10542
														var40.drawTransBgAt(var12, var13); // L: 10543
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10526
													var22 = (var20 - 1 + var10.width) / var20; // L: 10527
													var23 = (var21 - 1 + var10.height) / var21; // L: 10528

													for (var24 = 0; var24 < var22; ++var24) { // L: 10529
														for (var25 = 0; var25 < var23; ++var25) { // L: 10530
															if (var10.spriteAngle != 0) { // L: 10531
																var40.method8106(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10532
																var40.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21); // L: 10533
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10536
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10550
											boolean var36 = Skills.runCs1(var10); // L: 10551
											if (var36) { // L: 10553
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10554
											}

											Model var41 = null; // L: 10555
											var22 = 0; // L: 10556
											if (var10.itemId != -1) { // L: 10557
												var33 = class19.ItemDefinition_get(var10.itemId); // L: 10558
												if (var33 != null) { // L: 10559
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10560
													var41 = var33.getModel(1); // L: 10561
													if (var41 != null) { // L: 10562
														var41.calculateBoundsCylinder(); // L: 10563
														var22 = var41.height / 2; // L: 10564
													} else {
														class346.invalidateWidget(var10); // L: 10566
													}
												}
											} else if (var10.modelType == 5) { // L: 10569
												if (var10.modelId == 0) { // L: 10570
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = GrandExchangeEvents.localPlayer.getModel(); // L: 10571
												}
											} else if (var20 == -1) { // L: 10573
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, GrandExchangeEvents.localPlayer.appearance); // L: 10574
												if (var41 == null && Widget.field3411) { // L: 10575
													class346.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = class163.SequenceDefinition_get(var20); // L: 10578
												var41 = var10.getModel(var47, var10.modelFrame, var36, GrandExchangeEvents.localPlayer.appearance); // L: 10579
												if (var41 == null && Widget.field3411) { // L: 10580
													class346.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4631(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10582
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10583
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10584
											if (var41 != null) { // L: 10585
												if (!var10.isIf3) { // L: 10586
													var41.method5003(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10588
													if (var10.modelOrthog) { // L: 10589
														var41.method5050(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method5003(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10590
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10593
										} else {
											if (var10.type == 7) { // L: 10596
												var39 = var10.getFont(); // L: 10597
												if (var39 == null) { // L: 10598
													if (Widget.field3411) { // L: 10599
														class346.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10602

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10603
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10604
														if (var10.itemIds[var20] > 0) { // L: 10605
															var33 = class19.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 10606
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10608
																var34 = UserComparator9.colorStartTag(16748608) + var33.name + "</col>"; // L: 10609
															} else {
																var34 = UserComparator9.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + ParamComposition.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 10610
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 10611
															if (var10.textXAlignment == 0) { // L: 10612
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10613
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10614
															}
														}

														++var20; // L: 10616
													}
												}
											}

											if (var10.type == 8 && var10 == GrandExchangeOfferOwnWorldComparator.field486 && Client.field657 == Client.field656) { // L: 10620 10621
												var19 = 0; // L: 10622
												var20 = 0; // L: 10623
												Font var31 = class13.fontPlain12; // L: 10624
												String var32 = var10.text; // L: 10625

												String var43;
												for (var32 = class431.method7592(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10627 10628 10640
													var24 = var32.indexOf("<br>"); // L: 10629
													if (var24 != -1) { // L: 10630
														var43 = var32.substring(0, var24); // L: 10631
														var32 = var32.substring(var24 + 4); // L: 10632
													} else {
														var43 = var32; // L: 10635
														var32 = ""; // L: 10636
													}

													var25 = var31.stringWidth(var43); // L: 10638
													if (var25 > var19) { // L: 10639
														var19 = var25;
													}
												}

												var19 += 6; // L: 10642
												var20 += 7; // L: 10643
												var24 = var12 + var10.width - 5 - var19; // L: 10644
												var25 = var13 + var10.height + 5; // L: 10645
												if (var24 < var12 + 5) { // L: 10646
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10647
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10648
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10649
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10650
												var32 = var10.text; // L: 10651
												var26 = var25 + var31.ascent + 2; // L: 10652

												for (var32 = class431.method7592(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10653 10654 10665
													int var27 = var32.indexOf("<br>"); // L: 10655
													if (var27 != -1) { // L: 10656
														var43 = var32.substring(0, var27); // L: 10657
														var32 = var32.substring(var27 + 4); // L: 10658
													} else {
														var43 = var32; // L: 10661
														var32 = ""; // L: 10662
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10664
												}
											}

											if (var10.type == 9) { // L: 10669
												if (var10.field3369) { // L: 10674
													var19 = var12; // L: 10675
													var20 = var13 + var10.height; // L: 10676
													var21 = var12 + var10.width; // L: 10677
													var22 = var13; // L: 10678
												} else {
													var19 = var12; // L: 10681
													var20 = var13; // L: 10682
													var21 = var12 + var10.width; // L: 10683
													var22 = var13 + var10.height; // L: 10684
												}

												if (var10.lineWid == 1) { // L: 10686
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10687
												} else {
													class9.method74(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10690
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

	} // L: 10695
}
