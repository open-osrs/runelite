import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ka")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("l")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("s")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-24"
	)
	static char method5473(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1901343962"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 141
		int var2 = 0; // L: 142

		for (int var3 = 0; var3 < var1; ++var3) { // L: 143
			var2 = (var2 << 5) - var2 + UserComparator8.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 144
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-887111276"
	)
	public static boolean method5475(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 37
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "158659145"
	)
	static final int method5471(int var0, int var1) {
		int var2 = class10.method103(var0 + 45365, var1 + 91923, 4) - 128 + (class10.method103(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (class10.method103(var0, var1, 1) - 128 >> 2); // L: 957
		var2 = (int)((double)var2 * 0.3D) + 35; // L: 958
		if (var2 < 10) { // L: 959
			var2 = 10;
		} else if (var2 > 60) { // L: 960
			var2 = 60;
		}

		return var2; // L: 961
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "656683502"
	)
	static int method5476(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3224
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3225
			Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = Client.ItemDefinition_get(var3).name; // L: 3226
			return 1; // L: 3227
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3229
				Interpreter.Interpreter_intStackSize -= 2; // L: 3230
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3231
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3232
				var5 = Client.ItemDefinition_get(var3); // L: 3233
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3234
				} else {
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3235
				}

				return 1; // L: 3236
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3238
				Interpreter.Interpreter_intStackSize -= 2; // L: 3239
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3240
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3241
				var5 = Client.ItemDefinition_get(var3); // L: 3242
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3243
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 3244
				}

				return 1; // L: 3245
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3247
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3248
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.ItemDefinition_get(var3).price; // L: 3249
				return 1; // L: 3250
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3252
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3253
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0; // L: 3254
				return 1; // L: 3255
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3257
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3258
					var7 = Client.ItemDefinition_get(var3); // L: 3259
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3260
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3261
					}

					return 1; // L: 3262
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3264
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3265
					var7 = Client.ItemDefinition_get(var3); // L: 3266
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3267
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3268
					}

					return 1; // L: 3269
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3271
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3272
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.ItemDefinition_get(var3).isMembersOnly ? 1 : 0; // L: 3273
					return 1; // L: 3274
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3276
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3277
					var7 = Client.ItemDefinition_get(var3); // L: 3278
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3279
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3280
					}

					return 1; // L: 3281
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3283
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3284
					var7 = Client.ItemDefinition_get(var3); // L: 3285
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3286
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3287
					}

					return 1; // L: 3288
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3290
					String var6 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 3291
					var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3292
					class16.findItemDefinitions(var6, var4 == 1); // L: 3293
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FloorDecoration.foundItemIdCount; // L: 3294
					return 1; // L: 3295
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3297
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3302
						RouteStrategy.foundItemIndex = 0; // L: 3303
						return 1; // L: 3304
					} else if (var0 == 4213) { // L: 3306
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3307
						var4 = Client.ItemDefinition_get(var3).getShiftClickIndex(); // L: 3308
						if (var4 == -1) { // L: 3309
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3310
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + 1; // L: 3313
						}

						return 1; // L: 3315
					} else {
						return 2; // L: 3317
					}
				} else {
					if (class133.foundItemIds != null && RouteStrategy.foundItemIndex < FloorDecoration.foundItemIdCount) { // L: 3298
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.foundItemIds[++RouteStrategy.foundItemIndex - 1] & '\uffff'; // L: 3299
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3300
				}
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "([Ljz;IIIIIIIII)V",
		garbageValue = "1177185555"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9758
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9759

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9760
			Widget var10 = var0[var9]; // L: 9761
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9762 9763
				int var11;
				if (var8 == -1) { // L: 9765
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9766
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9767
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9768
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9769
					var11 = ++Client.rootWidgetCount - 1; // L: 9770
				} else {
					var11 = var8; // L: 9772
				}

				var10.rootIndex = var11; // L: 9773
				var10.cycle = Client.cycle; // L: 9774
				if (!var10.isIf3 || !class260.isComponentHidden(var10)) { // L: 9775
					if (var10.contentType > 0) { // L: 9776
						class28.method406(var10);
					}

					int var12 = var10.x + var6; // L: 9777
					int var13 = var7 + var10.y; // L: 9778
					int var14 = var10.transparencyTop; // L: 9779
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9780
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9781
							WorldMapElement.field1784 = var0; // L: 9782
							WorldMapData_1.field2676 = var6; // L: 9783
							ParamComposition.field1938 = var7; // L: 9784
							continue; // L: 9785
						}

						if (Client.isDraggingWidget && Client.field682) { // L: 9787
							var15 = MouseHandler.MouseHandler_x; // L: 9788
							var16 = MouseHandler.MouseHandler_y; // L: 9789
							var15 -= Client.widgetClickX; // L: 9790
							var16 -= Client.widgetClickY; // L: 9791
							if (var15 < Client.field606) { // L: 9792
								var15 = Client.field606;
							}

							if (var15 + var10.width > Client.field606 + Client.clickedWidgetParent.width) { // L: 9793
								var15 = Client.field606 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field561) { // L: 9794
								var16 = Client.field561;
							}

							if (var16 + var10.height > Client.field561 + Client.clickedWidgetParent.height) { // L: 9795
								var16 = Client.field561 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9796
							var13 = var16; // L: 9797
						}

						if (!var10.isScrollBar) { // L: 9799
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9805
						var15 = var2; // L: 9806
						var16 = var3; // L: 9807
						var17 = var4; // L: 9808
						var18 = var5; // L: 9809
					} else if (var10.type == 9) { // L: 9811
						var19 = var12; // L: 9812
						var20 = var13; // L: 9813
						var21 = var12 + var10.width; // L: 9814
						var22 = var13 + var10.height; // L: 9815
						if (var21 < var12) { // L: 9816
							var19 = var21; // L: 9818
							var21 = var12; // L: 9819
						}

						if (var22 < var13) { // L: 9821
							var20 = var22; // L: 9823
							var22 = var13; // L: 9824
						}

						++var21; // L: 9826
						++var22; // L: 9827
						var15 = var19 > var2 ? var19 : var2; // L: 9828
						var16 = var20 > var3 ? var20 : var3; // L: 9829
						var17 = var21 < var4 ? var21 : var4; // L: 9830
						var18 = var22 < var5 ? var22 : var5; // L: 9831
					} else {
						var19 = var12 + var10.width; // L: 9834
						var20 = var13 + var10.height; // L: 9835
						var15 = var12 > var2 ? var12 : var2; // L: 9836
						var16 = var13 > var3 ? var13 : var3; // L: 9837
						var17 = var19 < var4 ? var19 : var4; // L: 9838
						var18 = var20 < var5 ? var20 : var5; // L: 9839
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9841
						if (var10.contentType != 0) { // L: 9842
							if (var10.contentType == 1336) { // L: 9843
								if (Client.displayFps) { // L: 9844
									var13 += 15; // L: 9845
									Players.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9846
									var13 += 15; // L: 9847
									Runtime var42 = Runtime.getRuntime(); // L: 9848
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9849
									var21 = 16776960; // L: 9850
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9851
										var21 = 16711680;
									}

									Players.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9852
									var13 += 15; // L: 9853
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9857
								Client.viewportX = var12; // L: 9858
								Client.viewportY = var13; // L: 9859
								class282.drawEntities(var12, var13, var10.width, var10.height); // L: 9860
								Client.field713[var10.rootIndex] = true; // L: 9861
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9862
								continue; // L: 9863
							}

							if (var10.contentType == 1338) { // L: 9865
								ReflectionCheck.drawMinimap(var10, var12, var13, var11); // L: 9866
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9867
								continue; // L: 9868
							}

							if (var10.contentType == 1339) { // L: 9870
								NPCComposition.drawCompass(var10, var12, var13, var11); // L: 9871
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9872
								continue; // L: 9873
							}

							if (var10.contentType == 1400) { // L: 9875
								Huffman.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9876
							}

							if (var10.contentType == 1401) { // L: 9878
								Huffman.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9879
							}

							if (var10.contentType == 1402) { // L: 9881
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9882
							}
						}

						if (var10.type == 0) { // L: 9885
							if (!var10.isIf3 && class260.isComponentHidden(var10) && var10 != class242.mousedOverWidgetIf1) { // L: 9886
								continue;
							}

							if (!var10.isIf3) { // L: 9887
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9888
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9889
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9891
							if (var10.children != null) { // L: 9892
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9893
							if (var30 != null) { // L: 9894
								UserComparator5.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9895
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9897
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9898
						}

						if (Client.isResizable || Client.field715[var11] || Client.gameDrawingMode > 1) { // L: 9900
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9901 9902
								Interpreter.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9904
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9907
									var19 = 0; // L: 9908

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9909
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9910
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9911
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 9912
											if (var19 < 20) { // L: 9913
												var22 += var10.inventoryXOffsets[var19]; // L: 9914
												var23 += var10.inventoryYOffsets[var19]; // L: 9915
											}

											if (var10.itemIds[var19] <= 0) { // L: 9917
												if (var10.inventorySprites != null && var19 < 20) { // L: 9962
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9963
													if (var46 != null) { // L: 9964
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3262) { // L: 9965
														class112.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9918
												boolean var38 = false; // L: 9919
												var26 = var10.itemIds[var19] - 1; // L: 9920
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class20.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9921
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == WorldMapAreaData.selectedItemSlot && var10.id == class133.selectedItemWidget) { // L: 9923
														var35 = class370.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = class370.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9924
													}

													if (var35 != null) { // L: 9925
														if (var10 == class20.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9926
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9927
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9928
															if (var24 < 5 && var24 > -5) { // L: 9929
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9930
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9931
																var24 = 0; // L: 9932
																var25 = 0; // L: 9933
															}

															var35.drawTransAt(var24 + var22, var23 + var25, 128); // L: 9935
															if (var1 != -1) { // L: 9936
																Widget var28 = var0[var1 & 65535]; // L: 9937
																int var29;
																if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9938
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field566 / 3; // L: 9939
																	if (var29 > Client.field566 * 10) { // L: 9940
																		var29 = Client.field566 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9941
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9942
																	Client.draggedWidgetY += var29; // L: 9943
																	class112.invalidateWidget(var28); // L: 9944
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9946
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field566 / 3; // L: 9947
																	if (var29 > Client.field566 * 10) { // L: 9948
																		var29 = Client.field566 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9949
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9950
																	Client.draggedWidgetY -= var29; // L: 9951
																	class112.invalidateWidget(var28); // L: 9952
																}
															}
														} else if (var10 == WorldMapSectionType.field2720 && var19 == Client.field611) { // L: 9956
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9957
														}
													} else {
														class112.invalidateWidget(var10); // L: 9959
													}
												}
											}

											++var19; // L: 9967
										}
									}
								} else if (var10.type == 3) { // L: 9972
									if (SceneTilePaint.runCs1(var10)) { // L: 9974
										var19 = var10.color2; // L: 9975
										if (var10 == class242.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9976
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9979
										if (var10 == class242.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9980
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9982
										switch(var10.fillMode.field4590) { // L: 9983
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9992
											break; // L: 9993
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9989
											break; // L: 9990
										default:
											if (var14 == 0) { // L: 9985
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9986
											}
										}
									} else if (var14 == 0) { // L: 9997
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9998
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 10002
										var39 = var10.getFont(); // L: 10003
										if (var39 == null) { // L: 10004
											if (Widget.field3262) { // L: 10005
												class112.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 10009
											if (SceneTilePaint.runCs1(var10)) { // L: 10010
												var20 = var10.color2; // L: 10011
												if (var10 == class242.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10012
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10013
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10016
												if (var10 == class242.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10017
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10019
												ItemComposition var45 = Client.ItemDefinition_get(var10.itemId); // L: 10020
												var44 = var45.name; // L: 10021
												if (var44 == null) { // L: 10022
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10023
													var44 = LoginScreenAnimation.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + Widget.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10025
												var44 = "Please wait..."; // L: 10026
												var20 = var10.color; // L: 10027
											}

											if (!var10.isIf3) { // L: 10029
												var44 = class124.method2725(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10030
										}
									} else if (var10.type == 5) { // L: 10033
										SpritePixels var40;
										if (!var10.isIf3) { // L: 10034
											var40 = var10.getSprite(SceneTilePaint.runCs1(var10)); // L: 10035
											if (var40 != null) { // L: 10036
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3262) { // L: 10037
												class112.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10041
												var40 = class370.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 10042
											}

											if (var40 == null) { // L: 10043
												if (Widget.field3262) { // L: 10067
													class112.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 10044
												var21 = var40.height; // L: 10045
												if (!var10.spriteTiling) { // L: 10046
													var22 = var10.width * 4096 / var20; // L: 10060
													if (var10.spriteAngle != 0) { // L: 10061
														var40.method7802(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10062
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10063
														var40.drawTransBgAt(var12, var13); // L: 10064
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10047
													var22 = (var20 - 1 + var10.width) / var20; // L: 10048
													var23 = (var21 - 1 + var10.height) / var21; // L: 10049

													for (var24 = 0; var24 < var22; ++var24) { // L: 10050
														for (var25 = 0; var25 < var23; ++var25) { // L: 10051
															if (var10.spriteAngle != 0) { // L: 10052
																var40.method7802(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10053
																var40.drawTransAt(var12 + var24 * var20, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 10054
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10057
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10071
											boolean var36 = SceneTilePaint.runCs1(var10); // L: 10072
											if (var36) { // L: 10074
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10075
											}

											Model var41 = null; // L: 10076
											var22 = 0; // L: 10077
											if (var10.itemId != -1) { // L: 10078
												var33 = Client.ItemDefinition_get(var10.itemId); // L: 10079
												if (var33 != null) { // L: 10080
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10081
													var41 = var33.getModel(1); // L: 10082
													if (var41 != null) { // L: 10083
														var41.calculateBoundsCylinder(); // L: 10084
														var22 = var41.height / 2; // L: 10085
													} else {
														class112.invalidateWidget(var10); // L: 10087
													}
												}
											} else if (var10.modelType == 5) { // L: 10090
												if (var10.modelId == 0) { // L: 10091
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = WorldMapSprite.localPlayer.getModel(); // L: 10092
												}
											} else if (var20 == -1) { // L: 10094
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, WorldMapSprite.localPlayer.appearance); // L: 10095
												if (var41 == null && Widget.field3262) { // L: 10096
													class112.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = class78.SequenceDefinition_get(var20); // L: 10099
												var41 = var10.getModel(var47, var10.modelFrame, var36, WorldMapSprite.localPlayer.appearance); // L: 10100
												if (var41 == null && Widget.field3262) { // L: 10101
													class112.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3787(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10103
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10104
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10105
											if (var41 != null) { // L: 10106
												if (!var10.isIf3) { // L: 10107
													var41.method4215(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10109
													if (var10.modelOrthog) { // L: 10110
														var41.method4154(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4215(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10111
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10114
										} else {
											if (var10.type == 7) { // L: 10117
												var39 = var10.getFont(); // L: 10118
												if (var39 == null) { // L: 10119
													if (Widget.field3262) { // L: 10120
														class112.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10123

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10124
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10125
														if (var10.itemIds[var20] > 0) { // L: 10126
															var33 = Client.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 10127
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10129
																var34 = LoginScreenAnimation.colorStartTag(16748608) + var33.name + "</col>"; // L: 10130
															} else {
																var34 = LoginScreenAnimation.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + Widget.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 10131
															var26 = var13 + (var10.paddingY + 12) * var21; // L: 10132
															if (var10.textXAlignment == 0) { // L: 10133
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10134
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10135
															}
														}

														++var20; // L: 10137
													}
												}
											}

											if (var10.type == 8 && var10 == class126.field1516 && Client.field734 == Client.field506) { // L: 10141 10142
												var19 = 0; // L: 10143
												var20 = 0; // L: 10144
												Font var31 = Players.fontPlain12; // L: 10145
												String var32 = var10.text; // L: 10146

												String var43;
												for (var32 = class124.method2725(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10148 10149 10161
													var24 = var32.indexOf("<br>"); // L: 10150
													if (var24 != -1) { // L: 10151
														var43 = var32.substring(0, var24); // L: 10152
														var32 = var32.substring(var24 + 4); // L: 10153
													} else {
														var43 = var32; // L: 10156
														var32 = ""; // L: 10157
													}

													var25 = var31.stringWidth(var43); // L: 10159
													if (var25 > var19) { // L: 10160
														var19 = var25;
													}
												}

												var19 += 6; // L: 10163
												var20 += 7; // L: 10164
												var24 = var12 + var10.width - 5 - var19; // L: 10165
												var25 = var13 + var10.height + 5; // L: 10166
												if (var24 < var12 + 5) { // L: 10167
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10168
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10169
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10170
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10171
												var32 = var10.text; // L: 10172
												var26 = var25 + var31.ascent + 2; // L: 10173

												for (var32 = class124.method2725(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10174 10175 10186
													int var27 = var32.indexOf("<br>"); // L: 10176
													if (var27 != -1) { // L: 10177
														var43 = var32.substring(0, var27); // L: 10178
														var32 = var32.substring(var27 + 4); // L: 10179
													} else {
														var43 = var32; // L: 10182
														var32 = ""; // L: 10183
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10185
												}
											}

											if (var10.type == 9) { // L: 10190
												if (var10.field3298) { // L: 10195
													var19 = var12; // L: 10196
													var20 = var13 + var10.height; // L: 10197
													var21 = var12 + var10.width; // L: 10198
													var22 = var13; // L: 10199
												} else {
													var19 = var12; // L: 10202
													var20 = var13; // L: 10203
													var21 = var12 + var10.width; // L: 10204
													var22 = var13 + var10.height; // L: 10205
												}

												if (var10.lineWid == 1) { // L: 10207
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10208
												} else {
													WorldMapLabel.method4763(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10211
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

	} // L: 10216
}
