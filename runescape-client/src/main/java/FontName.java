import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("n")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkr;",
		garbageValue = "1"
	)
	public static FontName[] method5353() {
		return new FontName[]{FontName_plain11, FontName_bold12, FontName_verdana11, FontName_verdana13, FontName_verdana15, FontName_plain12}; // L: 16
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1883982153"
	)
	static final boolean method5355() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 95
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (FriendLoginUpdate.pcmPlayer1 != null) { // L: 3614
			FriendLoginUpdate.pcmPlayer1.run();
		}

		if (AbstractWorldMapData.pcmPlayer0 != null) { // L: 3615
			AbstractWorldMapData.pcmPlayer0.run();
		}

	} // L: 3616

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	static final void method5356(int var0) {
		if (var0 >= 0) { // L: 7470
			int var1 = Client.menuArguments1[var0]; // L: 7471
			int var2 = Client.menuArguments2[var0]; // L: 7472
			int var3 = Client.menuOpcodes[var0]; // L: 7473
			int var4 = Client.menuIdentifiers[var0]; // L: 7474
			String var5 = Client.menuActions[var0]; // L: 7475
			String var6 = Client.menuTargets[var0]; // L: 7476
			RouteStrategy.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7477
		}
	} // L: 7478

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "([Lhe;IIIIIIIIB)V",
		garbageValue = "105"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 8931
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 8932

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 8933
			Widget var10 = var0[var9]; // L: 8934
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 8935 8936
				int var11;
				if (var8 == -1) { // L: 8938
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 8939
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 8940
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 8941
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 8942
					var11 = ++Client.rootWidgetCount - 1; // L: 8943
				} else {
					var11 = var8; // L: 8945
				}

				var10.rootIndex = var11; // L: 8946
				var10.cycle = Client.cycle; // L: 8947
				if (!var10.isIf3 || !DevicePcmPlayerProvider.isComponentHidden(var10)) { // L: 8948
					if (var10.contentType > 0) { // L: 8949
						class279.method5006(var10);
					}

					int var12 = var10.x + var6; // L: 8950
					int var13 = var7 + var10.y; // L: 8951
					int var14 = var10.transparencyTop; // L: 8952
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 8953
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 8954
							class200.field2390 = var0; // L: 8955
							Client.field923 = var6; // L: 8956
							Renderable.field1893 = var7; // L: 8957
							continue; // L: 8958
						}

						if (Client.isDraggingWidget && Client.field859) { // L: 8960
							var15 = MouseHandler.MouseHandler_x; // L: 8961
							var16 = MouseHandler.MouseHandler_y; // L: 8962
							var15 -= Client.widgetClickX; // L: 8963
							var16 -= Client.widgetClickY; // L: 8964
							if (var15 < Client.field827) { // L: 8965
								var15 = Client.field827;
							}

							if (var15 + var10.width > Client.field827 + Client.clickedWidgetParent.width) { // L: 8966
								var15 = Client.field827 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field716) { // L: 8967
								var16 = Client.field716;
							}

							if (var16 + var10.height > Client.field716 + Client.clickedWidgetParent.height) { // L: 8968
								var16 = Client.field716 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 8969
							var13 = var16; // L: 8970
						}

						if (!var10.isScrollBar) { // L: 8972
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 8978
						var15 = var2; // L: 8979
						var16 = var3; // L: 8980
						var17 = var4; // L: 8981
						var18 = var5; // L: 8982
					} else if (var10.type == 9) { // L: 8984
						var19 = var12; // L: 8985
						var20 = var13; // L: 8986
						var21 = var12 + var10.width; // L: 8987
						var22 = var13 + var10.height; // L: 8988
						if (var21 < var12) { // L: 8989
							var19 = var21; // L: 8991
							var21 = var12; // L: 8992
						}

						if (var22 < var13) { // L: 8994
							var20 = var22; // L: 8996
							var22 = var13; // L: 8997
						}

						++var21; // L: 8999
						++var22; // L: 9000
						var15 = var19 > var2 ? var19 : var2; // L: 9001
						var16 = var20 > var3 ? var20 : var3; // L: 9002
						var17 = var21 < var4 ? var21 : var4; // L: 9003
						var18 = var22 < var5 ? var22 : var5; // L: 9004
					} else {
						var19 = var12 + var10.width; // L: 9007
						var20 = var13 + var10.height; // L: 9008
						var15 = var12 > var2 ? var12 : var2; // L: 9009
						var16 = var13 > var3 ? var13 : var3; // L: 9010
						var17 = var19 < var4 ? var19 : var4; // L: 9011
						var18 = var20 < var5 ? var20 : var5; // L: 9012
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9014
						if (var10.contentType != 0) { // L: 9015
							if (var10.contentType == 1336) { // L: 9016
								if (Client.displayFps) { // L: 9017
									var13 += 15; // L: 9018
									WorldMapLabelSize.fontPlain12.drawRightAligned("Fps:" + GameShell.fps, var12 + var10.width, var13, 16776960, -1); // L: 9019
									var13 += 15; // L: 9020
									Runtime var42 = Runtime.getRuntime(); // L: 9021
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9022
									var21 = 16776960; // L: 9023
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9024
										var21 = 16711680;
									}

									WorldMapLabelSize.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9025
									var13 += 15; // L: 9026
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9030
								Client.viewportX = var12; // L: 9031
								Client.viewportY = var13; // L: 9032
								SecureRandomFuture.drawEntities(var12, var13, var10.width, var10.height); // L: 9033
								Client.field901[var10.rootIndex] = true; // L: 9034
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9035
								continue; // L: 9036
							}

							if (var10.contentType == 1338) { // L: 9038
								DirectByteArrayCopier.drawMinimap(var10, var12, var13, var11); // L: 9039
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9040
								continue; // L: 9041
							}

							if (var10.contentType == 1339) { // L: 9043
								Varcs.drawCompass(var10, var12, var13, var11); // L: 9044
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9045
								continue; // L: 9046
							}

							if (var10.contentType == 1400) { // L: 9048
								WorldMapRectangle.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9049
							}

							if (var10.contentType == 1401) { // L: 9051
								WorldMapRectangle.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9052
							}

							if (var10.contentType == 1402) { // L: 9054
								class1.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9055
							}
						}

						if (var10.type == 0) { // L: 9058
							if (!var10.isIf3 && DevicePcmPlayerProvider.isComponentHidden(var10) && var10 != EnumDefinition.mousedOverWidgetIf1) { // L: 9059
								continue;
							}

							if (!var10.isIf3) { // L: 9060
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9061
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9062
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9064
							if (var10.children != null) { // L: 9065
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9066
							if (var30 != null) { // L: 9067
								KeyHandler.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9068
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9070
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9071
						}

						if (Client.isResizable || Client.field855[var11] || Client.gameDrawingMode > 1) { // L: 9073
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9074 9075
								class89.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9077
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9080
									var19 = 0; // L: 9081

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9082
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9083
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9084
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 9085
											if (var19 < 20) { // L: 9086
												var22 += var10.inventoryXOffsets[var19]; // L: 9087
												var23 += var10.inventoryYOffsets[var19]; // L: 9088
											}

											if (var10.itemIds[var19] <= 0) { // L: 9090
												if (var10.inventorySprites != null && var19 < 20) { // L: 9135
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9136
													if (var46 != null) { // L: 9137
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2603) { // L: 9138
														CollisionMap.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9091
												boolean var38 = false; // L: 9092
												var26 = var10.itemIds[var19] - 1; // L: 9093
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class171.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9094
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == ChatChannel.selectedItemSlot && var10.id == WorldMapLabelSize.selectedItemWidget) { // L: 9096
														var35 = WorldMapManager.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = WorldMapManager.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9097
													}

													if (var35 != null) { // L: 9098
														if (var10 == class171.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9099
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9100
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9101
															if (var24 < 5 && var24 > -5) { // L: 9102
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9103
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9104
																var24 = 0; // L: 9105
																var25 = 0; // L: 9106
															}

															var35.drawTransAt(var22 + var24, var23 + var25, 128); // L: 9108
															if (var1 != -1) { // L: 9109
																Widget var28 = var0[var1 & 65535]; // L: 9110
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9111
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field850 / 3; // L: 9112
																	if (var29 > Client.field850 * 10) { // L: 9113
																		var29 = Client.field850 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9114
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9115
																	Client.draggedWidgetY += var29; // L: 9116
																	CollisionMap.invalidateWidget(var28); // L: 9117
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9119
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field850 / 3; // L: 9120
																	if (var29 > Client.field850 * 10) { // L: 9121
																		var29 = Client.field850 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9122
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9123
																	Client.draggedWidgetY -= var29; // L: 9124
																	CollisionMap.invalidateWidget(var28); // L: 9125
																}
															}
														} else if (var10 == NPC.field1131 && var19 == Client.field881) { // L: 9129
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9130
														}
													} else {
														CollisionMap.invalidateWidget(var10); // L: 9132
													}
												}
											}

											++var19; // L: 9140
										}
									}
								} else if (var10.type == 3) { // L: 9145
									if (class8.runCs1(var10)) { // L: 9147
										var19 = var10.color2; // L: 9148
										if (var10 == EnumDefinition.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9149
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9152
										if (var10 == EnumDefinition.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9153
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9155
										switch(var10.fillMode.field3902) { // L: 9156
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9165
											break; // L: 9166
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9162
											break; // L: 9163
										default:
											if (var14 == 0) { // L: 9158
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9159
											}
										}
									} else if (var14 == 0) { // L: 9170
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9171
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9175
										var39 = var10.getFont(); // L: 9176
										if (var39 == null) { // L: 9177
											if (Widget.field2603) { // L: 9178
												CollisionMap.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9182
											if (class8.runCs1(var10)) { // L: 9183
												var20 = var10.color2; // L: 9184
												if (var10 == EnumDefinition.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9185
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9186
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9189
												if (var10 == EnumDefinition.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9190
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9192
												ItemComposition var45 = SecureRandomCallable.ItemDefinition_get(var10.itemId); // L: 9193
												var44 = var45.name; // L: 9194
												if (var44 == null) { // L: 9195
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9196
													var44 = class23.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + DevicePcmPlayerProvider.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9198
												var44 = "Please wait..."; // L: 9199
												var20 = var10.color; // L: 9200
											}

											if (!var10.isIf3) { // L: 9202
												var44 = class234.method4160(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9203
										}
									} else if (var10.type == 5) { // L: 9206
										SpritePixels var40;
										if (!var10.isIf3) { // L: 9207
											var40 = var10.getSprite(class8.runCs1(var10)); // L: 9208
											if (var40 != null) { // L: 9209
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2603) { // L: 9210
												CollisionMap.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9214
												var40 = WorldMapManager.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 9215
											}

											if (var40 == null) { // L: 9216
												if (Widget.field2603) { // L: 9240
													CollisionMap.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9217
												var21 = var40.height; // L: 9218
												if (!var10.spriteTiling) { // L: 9219
													var22 = var10.width * 4096 / var20; // L: 9233
													if (var10.spriteAngle != 0) { // L: 9234
														var40.method6190(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9235
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9236
														var40.drawTransBgAt(var12, var13); // L: 9237
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9220
													var22 = (var20 - 1 + var10.width) / var20; // L: 9221
													var23 = (var21 - 1 + var10.height) / var21; // L: 9222

													for (var24 = 0; var24 < var22; ++var24) { // L: 9223
														for (var25 = 0; var25 < var23; ++var25) { // L: 9224
															if (var10.spriteAngle != 0) { // L: 9225
																var40.method6190(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9226
																var40.drawTransAt(var12 + var24 * var20, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 9227
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9230
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 9244
											boolean var36 = class8.runCs1(var10); // L: 9245
											if (var36) { // L: 9247
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 9248
											}

											Model var41 = null; // L: 9249
											var22 = 0; // L: 9250
											if (var10.itemId != -1) { // L: 9251
												var33 = SecureRandomCallable.ItemDefinition_get(var10.itemId); // L: 9252
												if (var33 != null) { // L: 9253
													var33 = var33.getCountObj(var10.itemQuantity); // L: 9254
													var41 = var33.getModel(1); // L: 9255
													if (var41 != null) { // L: 9256
														var41.calculateBoundsCylinder(); // L: 9257
														var22 = var41.height / 2; // L: 9258
													} else {
														CollisionMap.invalidateWidget(var10); // L: 9260
													}
												}
											} else if (var10.modelType == 5) { // L: 9263
												if (var10.modelId == 0) { // L: 9264
													var41 = Client.playerComposition.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = PlayerComposition.localPlayer.getModel(); // L: 9265
												}
											} else if (var20 == -1) { // L: 9267
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, PlayerComposition.localPlayer.appearance); // L: 9268
												if (var41 == null && Widget.field2603) { // L: 9269
													CollisionMap.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = ParamDefinition.SequenceDefinition_get(var20); // L: 9272
												var41 = var10.getModel(var47, var10.modelFrame, var36, PlayerComposition.localPlayer.appearance); // L: 9273
												if (var41 == null && Widget.field2603) { // L: 9274
													CollisionMap.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3138(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9276
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9277
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9278
											if (var41 != null) { // L: 9279
												if (!var10.isIf3) { // L: 9280
													var41.method2966(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9282
													if (var10.modelOrthog) { // L: 9283
														var41.method2967(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method2966(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9284
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9287
										} else {
											if (var10.type == 7) { // L: 9290
												var39 = var10.getFont(); // L: 9291
												if (var39 == null) { // L: 9292
													if (Widget.field2603) { // L: 9293
														CollisionMap.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9296

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9297
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9298
														if (var10.itemIds[var20] > 0) { // L: 9299
															var33 = SecureRandomCallable.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9300
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9302
																var34 = class23.colorStartTag(16748608) + var33.name + "</col>"; // L: 9303
															} else {
																var34 = class23.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + DevicePcmPlayerProvider.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 9304
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 9305
															if (var10.textXAlignment == 0) { // L: 9306
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9307
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9308
															}
														}

														++var20; // L: 9310
													}
												}
											}

											if (var10.type == 8 && var10 == CollisionMap.field2092 && Client.field799 == Client.field751) { // L: 9314 9315
												var19 = 0; // L: 9316
												var20 = 0; // L: 9317
												Font var31 = WorldMapLabelSize.fontPlain12; // L: 9318
												String var32 = var10.text; // L: 9319

												String var43;
												for (var32 = class234.method4160(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 9321 9322 9334
													var24 = var32.indexOf("<br>"); // L: 9323
													if (var24 != -1) { // L: 9324
														var43 = var32.substring(0, var24); // L: 9325
														var32 = var32.substring(var24 + 4); // L: 9326
													} else {
														var43 = var32; // L: 9329
														var32 = ""; // L: 9330
													}

													var25 = var31.stringWidth(var43); // L: 9332
													if (var25 > var19) { // L: 9333
														var19 = var25;
													}
												}

												var19 += 6; // L: 9336
												var20 += 7; // L: 9337
												var24 = var12 + var10.width - 5 - var19; // L: 9338
												var25 = var13 + var10.height + 5; // L: 9339
												if (var24 < var12 + 5) { // L: 9340
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 9341
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 9342
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 9343
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 9344
												var32 = var10.text; // L: 9345
												var26 = var25 + var31.ascent + 2; // L: 9346

												for (var32 = class234.method4160(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 9347 9348 9359
													int var27 = var32.indexOf("<br>"); // L: 9349
													if (var27 != -1) { // L: 9350
														var43 = var32.substring(0, var27); // L: 9351
														var32 = var32.substring(var27 + 4); // L: 9352
													} else {
														var43 = var32; // L: 9355
														var32 = ""; // L: 9356
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 9358
												}
											}

											if (var10.type == 9) { // L: 9363
												if (var10.field2620) { // L: 9368
													var19 = var12; // L: 9369
													var20 = var13 + var10.height; // L: 9370
													var21 = var12 + var10.width; // L: 9371
													var22 = var13; // L: 9372
												} else {
													var19 = var12; // L: 9375
													var20 = var13; // L: 9376
													var21 = var12 + var10.width; // L: 9377
													var22 = var13 + var10.height; // L: 9378
												}

												if (var10.lineWid == 1) { // L: 9380
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 9381
												} else {
													class7.method87(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 9384
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

	} // L: 9389

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "17801"
	)
	static void method5354(int var0) {
		Client.oculusOrbState = var0; // L: 11182
	} // L: 11183
}
