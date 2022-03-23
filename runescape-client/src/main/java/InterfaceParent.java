import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1008979943
	)
	@Export("group")
	int group;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1548121
	)
	@Export("type")
	int type;
	@ObfuscatedName("h")
	boolean field1039;

	InterfaceParent() {
		this.field1039 = false; // L: 8
	} // L: 10

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Llq;III)Lql;",
		garbageValue = "-1036793338"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !GrandExchangeEvent.method6045(var0, var1, var2) ? null : ScriptFrame.method1084(); // L: 55 56
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1145
			if (Client.gameState == 0) { // L: 1146
				UserComparator10.client.method481();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1147
				UrlRequester.method2533(0); // L: 1148
				Client.field513 = 0; // L: 1149
				Client.field742 = 0; // L: 1150
				Client.timer.method6596(var0); // L: 1151
				if (var0 != 20) { // L: 1152
					Varcs.method2462(false);
				}
			}

			if (var0 != 20 && var0 != 40 && BuddyRankComparator.field1378 != null) { // L: 1154 1155
				BuddyRankComparator.field1378.close(); // L: 1156
				BuddyRankComparator.field1378 = null; // L: 1157
			}

			if (Client.gameState == 25) { // L: 1160
				Client.field545 = 0; // L: 1161
				Client.field541 = 0; // L: 1162
				Client.field558 = 1; // L: 1163
				Client.field543 = 0; // L: 1164
				Client.field679 = 1; // L: 1165
			}

			if (var0 != 5 && var0 != 10) { // L: 1167
				if (var0 == 20) { // L: 1175
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1176
					class321.method6031(World.archive10, WorldMapData_1.archive8, false, var3); // L: 1177
				} else if (var0 == 11) { // L: 1179
					class321.method6031(World.archive10, WorldMapData_1.archive8, false, 4); // L: 1180
				} else if (var0 == 50) { // L: 1182
					GrandExchangeEvent.setLoginResponseString("", "Updating date of birth...", ""); // L: 1183
					class321.method6031(World.archive10, WorldMapData_1.archive8, false, 7); // L: 1184
				} else {
					class20.method327(); // L: 1186
				}
			} else {
				boolean var1 = Interpreter.clientPreferences.method2268() >= Client.field484; // L: 1170
				int var2 = var1 ? 0 : 12; // L: 1172
				class321.method6031(World.archive10, WorldMapData_1.archive8, true, var2); // L: 1173
			}

			Client.gameState = var0; // L: 1187
		}
	} // L: 1188

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	static int method2103() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1368
			int var0 = 0; // L: 1369

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1370
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1371
			}

			return var0 * 10000 / Client.field767; // L: 1373
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1236451858"
	)
	static final void method2100(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 4876
		boolean var4 = false; // L: 4877
		int var5 = -1; // L: 4878
		int var6 = -1; // L: 4879
		int var7 = Players.Players_count; // L: 4880
		int[] var8 = Players.Players_indices; // L: 4881

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 4882
			Object var20;
			if (var9 < var7) { // L: 4884
				var20 = Client.players[var8[var9]]; // L: 4885
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 4886
					var4 = true; // L: 4887
					var5 = var9; // L: 4888
					continue;
				}

				if (var20 == class19.localPlayer) { // L: 4891
					var6 = var9; // L: 4892
					continue; // L: 4893
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 4896
			}

			class116.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 4897
		}

		if (Client.renderSelf && var6 != -1) { // L: 4899
			class116.drawActor2d(class19.localPlayer, var6, var0, var1, var2, var3); // L: 4900
		}

		if (var4) { // L: 4902
			class116.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 4903
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 4905
			int var10 = Client.overheadTextXs[var9]; // L: 4906
			int var11 = Client.overheadTextYs[var9]; // L: 4907
			int var12 = Client.overheadTextXOffsets[var9]; // L: 4908
			int var13 = Client.overheadTextAscents[var9]; // L: 4909
			boolean var14 = true; // L: 4910

			while (var14) {
				var14 = false; // L: 4912

				for (int var19 = 0; var19 < var9; ++var19) { // L: 4913
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXOffsets[var19] + Client.overheadTextXs[var19] && var10 + var12 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 4914 4915
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 4916
						var14 = true; // L: 4917
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 4922
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 4923
			String var15 = Client.overheadText[var9]; // L: 4924
			if (Client.chatEffects == 0) { // L: 4925
				int var16 = 16776960; // L: 4926
				if (Client.overheadTextColors[var9] < 6) { // L: 4927
					var16 = Client.field709[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 4928
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 4929
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 4930
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 4931
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4932
					if (var17 < 50) { // L: 4933
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 4934
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 4935
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 4937
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4938
					if (var17 < 50) { // L: 4939
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 4940
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 4941
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 4943
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4944
					if (var17 < 50) { // L: 4945
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 4946
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 4947
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 4949
					FloorOverlayDefinition.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 4950
					FloorOverlayDefinition.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 4951
					FloorOverlayDefinition.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 4952
					FloorOverlayDefinition.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 4953
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (FloorOverlayDefinition.fontBold12.stringWidth(var15) + 100) / 150; // L: 4954
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4955
					FloorOverlayDefinition.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 4956
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4957
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 4959
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4960
					int var18 = 0; // L: 4961
					if (var17 < 25) { // L: 4962
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 4963
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - FloorOverlayDefinition.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4964
					FloorOverlayDefinition.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 4965
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4966
				}
			} else {
				FloorOverlayDefinition.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4970
			}
		}

	} // L: 4973

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIIIIIII)V",
		garbageValue = "210982413"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9607
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9608

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9609
			Widget var10 = var0[var9]; // L: 9610
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9611 9612
				int var11;
				if (var8 == -1) { // L: 9614
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9615
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9616
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9617
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9618
					var11 = ++Client.rootWidgetCount - 1; // L: 9619
				} else {
					var11 = var8; // L: 9621
				}

				var10.rootIndex = var11; // L: 9622
				var10.cycle = Client.cycle; // L: 9623
				if (!var10.isIf3 || !class263.isComponentHidden(var10)) { // L: 9624
					if (var10.contentType > 0) { // L: 9625
						class120.method2755(var10);
					}

					int var12 = var10.x + var6; // L: 9626
					int var13 = var7 + var10.y; // L: 9627
					int var14 = var10.transparencyTop; // L: 9628
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9629
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9630
							ClanSettings.field1622 = var0; // L: 9631
							NPC.field1253 = var6; // L: 9632
							Projectile.field944 = var7; // L: 9633
							continue; // L: 9634
						}

						if (Client.isDraggingWidget && Client.field668) { // L: 9636
							var15 = MouseHandler.MouseHandler_x; // L: 9637
							var16 = MouseHandler.MouseHandler_y; // L: 9638
							var15 -= Client.widgetClickX; // L: 9639
							var16 -= Client.widgetClickY; // L: 9640
							if (var15 < Client.field669) { // L: 9641
								var15 = Client.field669;
							}

							if (var15 + var10.width > Client.field669 + Client.clickedWidgetParent.width) { // L: 9642
								var15 = Client.field669 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field628) { // L: 9643
								var16 = Client.field628;
							}

							if (var16 + var10.height > Client.field628 + Client.clickedWidgetParent.height) { // L: 9644
								var16 = Client.field628 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9645
							var13 = var16; // L: 9646
						}

						if (!var10.isScrollBar) { // L: 9648
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9654
						var15 = var2; // L: 9655
						var16 = var3; // L: 9656
						var17 = var4; // L: 9657
						var18 = var5; // L: 9658
					} else if (var10.type == 9) { // L: 9660
						var19 = var12; // L: 9661
						var20 = var13; // L: 9662
						var21 = var12 + var10.width; // L: 9663
						var22 = var13 + var10.height; // L: 9664
						if (var21 < var12) { // L: 9665
							var19 = var21; // L: 9667
							var21 = var12; // L: 9668
						}

						if (var22 < var13) { // L: 9670
							var20 = var22; // L: 9672
							var22 = var13; // L: 9673
						}

						++var21; // L: 9675
						++var22; // L: 9676
						var15 = var19 > var2 ? var19 : var2; // L: 9677
						var16 = var20 > var3 ? var20 : var3; // L: 9678
						var17 = var21 < var4 ? var21 : var4; // L: 9679
						var18 = var22 < var5 ? var22 : var5; // L: 9680
					} else {
						var19 = var12 + var10.width; // L: 9683
						var20 = var13 + var10.height; // L: 9684
						var15 = var12 > var2 ? var12 : var2; // L: 9685
						var16 = var13 > var3 ? var13 : var3; // L: 9686
						var17 = var19 < var4 ? var19 : var4; // L: 9687
						var18 = var20 < var5 ? var20 : var5; // L: 9688
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9690
						if (var10.contentType != 0) { // L: 9691
							if (var10.contentType == 1336) { // L: 9692
								if (Interpreter.clientPreferences.method2251()) { // L: 9693
									var13 += 15; // L: 9694
									ViewportMouse.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9695
									var13 += 15; // L: 9696
									Runtime var42 = Runtime.getRuntime(); // L: 9697
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9698
									var21 = 16776960; // L: 9699
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9700
										var21 = 16711680;
									}

									ViewportMouse.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9701
									var13 += 15; // L: 9702
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9706
								Client.viewportX = var12; // L: 9707
								Client.viewportY = var13; // L: 9708
								NPC.drawEntities(var12, var13, var10.width, var10.height); // L: 9709
								Client.field564[var10.rootIndex] = true; // L: 9710
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9711
								continue; // L: 9712
							}

							if (var10.contentType == 1338) { // L: 9714
								WorldMapLabelSize.drawMinimap(var10, var12, var13, var11); // L: 9715
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9716
								continue; // L: 9717
							}

							if (var10.contentType == 1339) { // L: 9719
								CollisionMap.drawCompass(var10, var12, var13, var11); // L: 9720
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9721
								continue; // L: 9722
							}

							if (var10.contentType == 1400) { // L: 9724
								ClanChannel.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9725
							}

							if (var10.contentType == 1401) { // L: 9727
								ClanChannel.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9728
							}

							if (var10.contentType == 1402) { // L: 9730
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9731
							}
						}

						if (var10.type == 0) { // L: 9734
							if (!var10.isIf3 && class263.isComponentHidden(var10) && var10 != Player.mousedOverWidgetIf1) { // L: 9735
								continue;
							}

							if (!var10.isIf3) { // L: 9736
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9737
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9738
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9740
							if (var10.children != null) { // L: 9741
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9742
							if (var30 != null) { // L: 9743
								class11.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9744
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9746
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9747
						} else if (var10.type == 11) { // L: 9749
							if (class263.isComponentHidden(var10) && var10 != Player.mousedOverWidgetIf1) { // L: 9750
								continue;
							}

							if (var10.children != null) { // L: 9751
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9752
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9753
						}

						if (Client.isResizable || Client.field576[var11] || Client.gameDrawingMode > 1) { // L: 9755
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9756 9757
								class193.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9759
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9762
									var19 = 0; // L: 9763

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9764
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9765
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9766
											var23 = var20 * (var10.paddingY + 32) + var13; // L: 9767
											if (var19 < 20) { // L: 9768
												var22 += var10.inventoryXOffsets[var19]; // L: 9769
												var23 += var10.inventoryYOffsets[var19]; // L: 9770
											}

											if (var10.itemIds[var19] <= 0) { // L: 9772
												if (var10.inventorySprites != null && var19 < 20) { // L: 9817
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9818
													if (var46 != null) { // L: 9819
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3368) { // L: 9820
														class290.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9773
												boolean var38 = false; // L: 9774
												var26 = var10.itemIds[var19] - 1; // L: 9775
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == FloorDecoration.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9776
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == class19.selectedItemSlot && var10.id == PendingSpawn.selectedItemWidget) { // L: 9778
														var35 = WorldMapCacheName.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = WorldMapCacheName.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9779
													}

													if (var35 != null) { // L: 9780
														if (var10 == FloorDecoration.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9781
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9782
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9783
															if (var24 < 5 && var24 > -5) { // L: 9784
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9785
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9786
																var24 = 0; // L: 9787
																var25 = 0; // L: 9788
															}

															var35.drawTransAt(var24 + var22, var25 + var23, 128); // L: 9790
															if (var1 != -1) { // L: 9791
																Widget var28 = var0[var1 & 65535]; // L: 9792
																int var29;
																if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9793
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field550 / 3; // L: 9794
																	if (var29 > Client.field550 * 10) { // L: 9795
																		var29 = Client.field550 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9796
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9797
																	Client.draggedWidgetY += var29; // L: 9798
																	class290.invalidateWidget(var28); // L: 9799
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9801
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field550 / 3; // L: 9802
																	if (var29 > Client.field550 * 10) { // L: 9803
																		var29 = Client.field550 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9804
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9805
																	Client.draggedWidgetY -= var29; // L: 9806
																	class290.invalidateWidget(var28); // L: 9807
																}
															}
														} else if (var10 == class12.field64 && var19 == Client.field741) { // L: 9811
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9812
														}
													} else {
														class290.invalidateWidget(var10); // L: 9814
													}
												}
											}

											++var19; // L: 9822
										}
									}
								} else if (var10.type == 3) { // L: 9827
									if (PacketWriter.runCs1(var10)) { // L: 9829
										var19 = var10.color2; // L: 9830
										if (var10 == Player.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9831
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9834
										if (var10 == Player.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9835
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9837
										switch(var10.fillMode.field4696) { // L: 9838
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9847
											break; // L: 9848
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9840
											break; // L: 9841
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19); // L: 9843
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9844
											}
										}
									} else if (var14 == 0) { // L: 9852
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9853
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9857
										var39 = var10.getFont(); // L: 9858
										if (var39 == null) { // L: 9859
											if (Widget.field3368) { // L: 9860
												class290.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9864
											if (PacketWriter.runCs1(var10)) { // L: 9865
												var20 = var10.color2; // L: 9866
												if (var10 == Player.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9867
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9868
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9871
												if (var10 == Player.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9872
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9874
												ItemComposition var45 = class67.ItemDefinition_get(var10.itemId); // L: 9875
												var44 = var45.name; // L: 9876
												if (var44 == null) { // L: 9877
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9878
													var44 = ChatChannel.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + GrandExchangeOfferTotalQuantityComparator.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9880
												var44 = "Please wait..."; // L: 9881
												var20 = var10.color; // L: 9882
											}

											if (!var10.isIf3) { // L: 9884
												var44 = class11.method114(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9885
										}
									} else if (var10.type == 5) { // L: 9888
										SpritePixels var40;
										if (!var10.isIf3) { // L: 9889
											var40 = var10.getSprite(PacketWriter.runCs1(var10), UserComparator9.urlRequester); // L: 9890
											if (var40 != null) { // L: 9891
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3368) { // L: 9892
												class290.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9896
												var40 = WorldMapCacheName.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, UserComparator9.urlRequester); // L: 9897
											}

											if (var40 == null) { // L: 9898
												if (Widget.field3368) { // L: 9922
													class290.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9899
												var21 = var40.height; // L: 9900
												if (!var10.spriteTiling) { // L: 9901
													var22 = var10.width * 4096 / var20; // L: 9915
													if (var10.spriteAngle != 0) { // L: 9916
														var40.method8207(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9917
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9918
														var40.drawTransBgAt(var12, var13); // L: 9919
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9902
													var22 = (var20 - 1 + var10.width) / var20; // L: 9903
													var23 = (var21 - 1 + var10.height) / var21; // L: 9904

													for (var24 = 0; var24 < var22; ++var24) { // L: 9905
														for (var25 = 0; var25 < var23; ++var25) { // L: 9906
															if (var10.spriteAngle != 0) { // L: 9907
																var40.method8207(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9908
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21); // L: 9909
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9912
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 9926
											boolean var36 = PacketWriter.runCs1(var10); // L: 9927
											if (var36) { // L: 9929
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 9930
											}

											Model var41 = null; // L: 9931
											var22 = 0; // L: 9932
											if (var10.itemId != -1) { // L: 9933
												var33 = class67.ItemDefinition_get(var10.itemId); // L: 9934
												if (var33 != null) { // L: 9935
													var33 = var33.getCountObj(var10.itemQuantity); // L: 9936
													var41 = var33.getModel(1); // L: 9937
													if (var41 != null) { // L: 9938
														var41.calculateBoundsCylinder(); // L: 9939
														var22 = var41.height / 2; // L: 9940
													} else {
														class290.invalidateWidget(var10); // L: 9942
													}
												}
											} else if (var10.modelType == 5) { // L: 9945
												if (var10.modelId == 0) { // L: 9946
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class19.localPlayer.getModel(); // L: 9947
												}
											} else if (var20 == -1) { // L: 9949
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class19.localPlayer.appearance); // L: 9950
												if (var41 == null && Widget.field3368) { // L: 9951
													class290.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = ItemContainer.SequenceDefinition_get(var20); // L: 9954
												var41 = var10.getModel(var47, var10.modelFrame, var36, class19.localPlayer.appearance); // L: 9955
												if (var41 == null && Widget.field3368) { // L: 9956
													class290.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3997(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9958
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9959
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9960
											if (var41 != null) { // L: 9961
												if (!var10.isIf3) { // L: 9962
													var41.method4376(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9964
													if (var10.modelOrthog) { // L: 9965
														var41.method4366(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4376(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9966
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9969
										} else {
											if (var10.type == 7) { // L: 9972
												var39 = var10.getFont(); // L: 9973
												if (var39 == null) { // L: 9974
													if (Widget.field3368) { // L: 9975
														class290.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9978

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9979
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9980
														if (var10.itemIds[var20] > 0) { // L: 9981
															var33 = class67.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9982
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9984
																var34 = ChatChannel.colorStartTag(16748608) + var33.name + "</col>"; // L: 9985
															} else {
																var34 = ChatChannel.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + GrandExchangeOfferTotalQuantityComparator.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 9986
															var26 = (var10.paddingY + 12) * var21 + var13; // L: 9987
															if (var10.textXAlignment == 0) { // L: 9988
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9989
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9990
															}
														}

														++var20; // L: 9992
													}
												}
											}

											if (var10.type == 8 && var10 == class160.field1750 && Client.field641 == Client.field642) { // L: 9996 9997
												var19 = 0; // L: 9998
												var20 = 0; // L: 9999
												Font var31 = ViewportMouse.fontPlain12; // L: 10000
												String var32 = var10.text; // L: 10001

												String var43;
												for (var32 = class11.method114(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10003 10004 10016
													var24 = var32.indexOf("<br>"); // L: 10005
													if (var24 != -1) { // L: 10006
														var43 = var32.substring(0, var24); // L: 10007
														var32 = var32.substring(var24 + 4); // L: 10008
													} else {
														var43 = var32; // L: 10011
														var32 = ""; // L: 10012
													}

													var25 = var31.stringWidth(var43); // L: 10014
													if (var25 > var19) { // L: 10015
														var19 = var25;
													}
												}

												var19 += 6; // L: 10018
												var20 += 7; // L: 10019
												var24 = var12 + var10.width - 5 - var19; // L: 10020
												var25 = var13 + var10.height + 5; // L: 10021
												if (var24 < var12 + 5) { // L: 10022
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10023
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10024
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10025
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10026
												var32 = var10.text; // L: 10027
												var26 = var25 + var31.ascent + 2; // L: 10028

												for (var32 = class11.method114(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10029 10030 10041
													int var27 = var32.indexOf("<br>"); // L: 10031
													if (var27 != -1) { // L: 10032
														var43 = var32.substring(0, var27); // L: 10033
														var32 = var32.substring(var27 + 4); // L: 10034
													} else {
														var43 = var32; // L: 10037
														var32 = ""; // L: 10038
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10040
												}
											}

											if (var10.type == 9) { // L: 10045
												if (var10.field3491) { // L: 10050
													var19 = var12; // L: 10051
													var20 = var13 + var10.height; // L: 10052
													var21 = var12 + var10.width; // L: 10053
													var22 = var13; // L: 10054
												} else {
													var19 = var12; // L: 10057
													var20 = var13; // L: 10058
													var21 = var12 + var10.width; // L: 10059
													var22 = var13 + var10.height; // L: 10060
												}

												if (var10.lineWid == 1) { // L: 10062
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10063
												} else {
													class127.method2827(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10066
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

	} // L: 10071
}
