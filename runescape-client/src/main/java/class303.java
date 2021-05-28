import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public final class class303 {
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "([Lio;IIIIIIIII)V",
		garbageValue = "-1945038256"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9210
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9211

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9212
			Widget var10 = var0[var9]; // L: 9213
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9214 9215
				int var11;
				if (var8 == -1) { // L: 9217
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9218
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9219
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9220
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9221
					var11 = ++Client.rootWidgetCount - 1; // L: 9222
				} else {
					var11 = var8; // L: 9224
				}

				var10.rootIndex = var11; // L: 9225
				var10.cycle = Client.cycle; // L: 9226
				if (!var10.isIf3 || !HitSplatDefinition.isComponentHidden(var10)) { // L: 9227
					if (var10.contentType > 0) { // L: 9228
						class258.method4836(var10);
					}

					int var12 = var10.x + var6; // L: 9229
					int var13 = var7 + var10.y; // L: 9230
					int var14 = var10.transparencyTop; // L: 9231
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9232
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9233
							class4.field49 = var0; // L: 9234
							ClanChannel.field38 = var6; // L: 9235
							class82.field1020 = var7; // L: 9236
							continue;
						}

						if (Client.isDraggingWidget && Client.field819) { // L: 9239
							var15 = MouseHandler.MouseHandler_x; // L: 9240
							var16 = MouseHandler.MouseHandler_y; // L: 9241
							var15 -= Client.widgetClickX; // L: 9242
							var16 -= Client.widgetClickY; // L: 9243
							if (var15 < Client.field740) { // L: 9244
								var15 = Client.field740;
							}

							if (var15 + var10.width > Client.field740 + Client.clickedWidgetParent.width) { // L: 9245
								var15 = Client.field740 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field821) { // L: 9246
								var16 = Client.field821;
							}

							if (var16 + var10.height > Client.field821 + Client.clickedWidgetParent.height) { // L: 9247
								var16 = Client.field821 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9248
							var13 = var16; // L: 9249
						}

						if (!var10.isScrollBar) { // L: 9251
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9257
						var15 = var2; // L: 9258
						var16 = var3; // L: 9259
						var17 = var4; // L: 9260
						var18 = var5; // L: 9261
					} else if (var10.type == 9) { // L: 9263
						var19 = var12; // L: 9264
						var20 = var13; // L: 9265
						var21 = var12 + var10.width; // L: 9266
						var22 = var13 + var10.height; // L: 9267
						if (var21 < var12) { // L: 9268
							var19 = var21; // L: 9270
							var21 = var12; // L: 9271
						}

						if (var22 < var13) { // L: 9273
							var20 = var22; // L: 9275
							var22 = var13; // L: 9276
						}

						++var21; // L: 9278
						++var22; // L: 9279
						var15 = var19 > var2 ? var19 : var2; // L: 9280
						var16 = var20 > var3 ? var20 : var3; // L: 9281
						var17 = var21 < var4 ? var21 : var4; // L: 9282
						var18 = var22 < var5 ? var22 : var5; // L: 9283
					} else {
						var19 = var12 + var10.width; // L: 9286
						var20 = var13 + var10.height; // L: 9287
						var15 = var12 > var2 ? var12 : var2; // L: 9288
						var16 = var13 > var3 ? var13 : var3; // L: 9289
						var17 = var19 < var4 ? var19 : var4; // L: 9290
						var18 = var20 < var5 ? var20 : var5; // L: 9291
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9293
						if (var10.contentType != 0) { // L: 9294
							if (var10.contentType == 1336) { // L: 9295
								if (Client.displayFps) { // L: 9296
									var13 += 15; // L: 9297
									UserComparator3.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9298
									var13 += 15; // L: 9299
									Runtime var42 = Runtime.getRuntime(); // L: 9300
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9301
									var21 = 16776960; // L: 9302
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9303
										var21 = 16711680;
									}

									UserComparator3.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9304
									var13 += 15; // L: 9305
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9309
								Client.viewportX = var12; // L: 9310
								Client.viewportY = var13; // L: 9311
								ScriptFrame.drawEntities(var12, var13, var10.width, var10.height); // L: 9312
								Client.field719[var10.rootIndex] = true; // L: 9313
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9314
								continue; // L: 9315
							}

							if (var10.contentType == 1338) { // L: 9317
								ObjectSound.drawMinimap(var10, var12, var13, var11); // L: 9318
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9319
								continue; // L: 9320
							}

							if (var10.contentType == 1339) { // L: 9322
								class13.drawCompass(var10, var12, var13, var11); // L: 9323
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9324
								continue; // L: 9325
							}

							if (var10.contentType == 1400) { // L: 9327
								class243.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9328
							}

							if (var10.contentType == 1401) { // L: 9330
								class243.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9331
							}

							if (var10.contentType == 1402) { // L: 9333
								class24.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9334
							}
						}

						if (var10.type == 0) { // L: 9337
							if (!var10.isIf3 && HitSplatDefinition.isComponentHidden(var10) && var10 != World.mousedOverWidgetIf1) { // L: 9338
								continue;
							}

							if (!var10.isIf3) { // L: 9339
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9340
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9341
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9343
							if (var10.children != null) { // L: 9344
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9345
							if (var30 != null) { // L: 9346
								class225.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9347
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9349
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9350
						}

						if (Client.isResizable || Client.field860[var11] || Client.gameDrawingMode > 1) { // L: 9352
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9353 9354
								class32.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9356
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9359
									var19 = 0; // L: 9360

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9361
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9362
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9363
											var23 = var20 * (var10.paddingY + 32) + var13; // L: 9364
											if (var19 < 20) { // L: 9365
												var22 += var10.inventoryXOffsets[var19]; // L: 9366
												var23 += var10.inventoryYOffsets[var19]; // L: 9367
											}

											if (var10.itemIds[var19] <= 0) { // L: 9369
												if (var10.inventorySprites != null && var19 < 20) { // L: 9414
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9415
													if (var46 != null) { // L: 9416
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2956) { // L: 9417
														WorldMapCacheName.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9370
												boolean var38 = false; // L: 9371
												var26 = var10.itemIds[var19] - 1; // L: 9372
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == Script.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9373
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == ClanChannelMember.selectedItemSlot && var10.id == Player.selectedItemWidget) { // L: 9375
														var35 = ModelData0.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = ModelData0.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9376
													}

													if (var35 != null) { // L: 9377
														if (var10 == Script.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9378
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9379
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9380
															if (var24 < 5 && var24 > -5) { // L: 9381
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9382
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9383
																var24 = 0; // L: 9384
																var25 = 0; // L: 9385
															}

															var35.drawTransAt(var24 + var22, var23 + var25, 128); // L: 9387
															if (var1 != -1) { // L: 9388
																Widget var28 = var0[var1 & 65535]; // L: 9389
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9390
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field913 / 3; // L: 9391
																	if (var29 > Client.field913 * 10) { // L: 9392
																		var29 = Client.field913 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9393
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9394
																	Client.draggedWidgetY += var29; // L: 9395
																	WorldMapCacheName.invalidateWidget(var28); // L: 9396
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9398
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field913 / 3; // L: 9399
																	if (var29 > Client.field913 * 10) { // L: 9400
																		var29 = Client.field913 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9401
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9402
																	Client.draggedWidgetY -= var29; // L: 9403
																	WorldMapCacheName.invalidateWidget(var28); // L: 9404
																}
															}
														} else if (var10 == GrandExchangeEvents.field3626 && var19 == Client.field841) { // L: 9408
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9409
														}
													} else {
														WorldMapCacheName.invalidateWidget(var10); // L: 9411
													}
												}
											}

											++var19; // L: 9419
										}
									}
								} else if (var10.type == 3) { // L: 9424
									if (InvDefinition.runCs1(var10)) { // L: 9426
										var19 = var10.color2; // L: 9427
										if (var10 == World.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9428
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9431
										if (var10 == World.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9432
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9434
										switch(var10.fillMode.field4230) { // L: 9435
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9437
											break; // L: 9438
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9444
											break; // L: 9445
										default:
											if (var14 == 0) { // L: 9440
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9441
											}
										}
									} else if (var14 == 0) { // L: 9449
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9450
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9454
										var39 = var10.getFont(); // L: 9455
										if (var39 == null) { // L: 9456
											if (Widget.field2956) { // L: 9457
												WorldMapCacheName.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9461
											if (InvDefinition.runCs1(var10)) { // L: 9462
												var20 = var10.color2; // L: 9463
												if (var10 == World.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9464
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9465
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9468
												if (var10 == World.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9469
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9471
												ItemComposition var45 = class260.ItemDefinition_get(var10.itemId); // L: 9472
												var44 = var45.name; // L: 9473
												if (var44 == null) { // L: 9474
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9475
													var44 = class44.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + UserComparator3.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9477
												var44 = "Please wait..."; // L: 9478
												var20 = var10.color; // L: 9479
											}

											if (!var10.isIf3) { // L: 9481
												var44 = JagexCache.method2540(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9482
										}
									} else if (var10.type == 5) { // L: 9485
										SpritePixels var40;
										if (!var10.isIf3) { // L: 9486
											var40 = var10.getSprite(InvDefinition.runCs1(var10)); // L: 9487
											if (var40 != null) { // L: 9488
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2956) { // L: 9489
												WorldMapCacheName.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9493
												var40 = ModelData0.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 9494
											}

											if (var40 == null) { // L: 9495
												if (Widget.field2956) { // L: 9519
													WorldMapCacheName.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9496
												var21 = var40.height; // L: 9497
												if (!var10.spriteTiling) { // L: 9498
													var22 = var10.width * 4096 / var20; // L: 9512
													if (var10.spriteAngle != 0) { // L: 9513
														var40.method6991(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9514
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9515
														var40.drawTransBgAt(var12, var13); // L: 9516
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9499
													var22 = (var20 - 1 + var10.width) / var20; // L: 9500
													var23 = (var21 - 1 + var10.height) / var21; // L: 9501

													for (var24 = 0; var24 < var22; ++var24) { // L: 9502
														for (var25 = 0; var25 < var23; ++var25) { // L: 9503
															if (var10.spriteAngle != 0) { // L: 9504
																var40.method6991(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9505
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var24 * var20, var13 + var21 * var25); // L: 9506
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9509
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 9523
											boolean var36 = InvDefinition.runCs1(var10); // L: 9524
											if (var36) { // L: 9526
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 9527
											}

											Model var41 = null; // L: 9528
											var22 = 0; // L: 9529
											if (var10.itemId != -1) { // L: 9530
												var33 = class260.ItemDefinition_get(var10.itemId); // L: 9531
												if (var33 != null) { // L: 9532
													var33 = var33.getCountObj(var10.itemQuantity); // L: 9533
													var41 = var33.getModel(1); // L: 9534
													if (var41 != null) { // L: 9535
														var41.calculateBoundsCylinder(); // L: 9536
														var22 = var41.height / 2; // L: 9537
													} else {
														WorldMapCacheName.invalidateWidget(var10); // L: 9539
													}
												}
											} else if (var10.modelType == 5) { // L: 9542
												if (var10.modelId == 0) { // L: 9543
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class93.localPlayer.getModel(); // L: 9544
												}
											} else if (var20 == -1) { // L: 9546
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class93.localPlayer.appearance); // L: 9547
												if (var41 == null && Widget.field2956) { // L: 9548
													WorldMapCacheName.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = LoginScreenAnimation.SequenceDefinition_get(var20); // L: 9551
												var41 = var10.getModel(var47, var10.modelFrame, var36, class93.localPlayer.appearance); // L: 9552
												if (var41 == null && Widget.field2956) { // L: 9553
													WorldMapCacheName.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3848(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9555
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9556
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9557
											if (var41 != null) { // L: 9558
												if (!var10.isIf3) { // L: 9559
													var41.method4217(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9561
													if (var10.modelOrthog) { // L: 9562
														var41.method4209(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4217(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9563
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9566
										} else {
											if (var10.type == 7) { // L: 9569
												var39 = var10.getFont(); // L: 9570
												if (var39 == null) { // L: 9571
													if (Widget.field2956) { // L: 9572
														WorldMapCacheName.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9575

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9576
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9577
														if (var10.itemIds[var20] > 0) { // L: 9578
															var33 = class260.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9579
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9581
																var34 = class44.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = class44.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + UserComparator3.formatItemStacks(var10.itemQuantities[var20]); // L: 9582
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 9583
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 9584
															if (var10.textXAlignment == 0) { // L: 9585
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9586
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9587
															}
														}

														++var20; // L: 9589
													}
												}
											}

											if (var10.type == 8 && var10 == ReflectionCheck.field609 && Client.field833 == Client.field792) { // L: 9593 9594
												var19 = 0; // L: 9595
												var20 = 0; // L: 9596
												Font var31 = UserComparator3.fontPlain12; // L: 9597
												String var32 = var10.text; // L: 9598

												String var43;
												for (var32 = JagexCache.method2540(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 9600 9601 9613
													var24 = var32.indexOf("<br>"); // L: 9602
													if (var24 != -1) { // L: 9603
														var43 = var32.substring(0, var24); // L: 9604
														var32 = var32.substring(var24 + 4); // L: 9605
													} else {
														var43 = var32; // L: 9608
														var32 = ""; // L: 9609
													}

													var25 = var31.stringWidth(var43); // L: 9611
													if (var25 > var19) { // L: 9612
														var19 = var25;
													}
												}

												var19 += 6; // L: 9615
												var20 += 7; // L: 9616
												var24 = var12 + var10.width - 5 - var19; // L: 9617
												var25 = var13 + var10.height + 5; // L: 9618
												if (var24 < var12 + 5) { // L: 9619
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 9620
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 9621
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 9622
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 9623
												var32 = var10.text; // L: 9624
												var26 = var25 + var31.ascent + 2; // L: 9625

												for (var32 = JagexCache.method2540(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 9626 9627 9638
													int var27 = var32.indexOf("<br>"); // L: 9628
													if (var27 != -1) { // L: 9629
														var43 = var32.substring(0, var27); // L: 9630
														var32 = var32.substring(var27 + 4); // L: 9631
													} else {
														var43 = var32; // L: 9634
														var32 = ""; // L: 9635
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 9637
												}
											}

											if (var10.type == 9) { // L: 9642
												if (var10.field2992) { // L: 9647
													var19 = var12; // L: 9648
													var20 = var13 + var10.height; // L: 9649
													var21 = var12 + var10.width; // L: 9650
													var22 = var13; // L: 9651
												} else {
													var19 = var12; // L: 9654
													var20 = var13; // L: 9655
													var21 = var12 + var10.width; // L: 9656
													var22 = var13 + var10.height; // L: 9657
												}

												if (var10.lineWid == 1) { // L: 9659
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 9660
												} else {
													ClanChannel.method36(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 9663
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

	} // L: 9668
}
