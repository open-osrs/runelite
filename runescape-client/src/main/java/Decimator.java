import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class Decimator {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1258605941
	)
	static int field1491;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1300343433
	)
	int inputRate;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1507874041
	)
	int outputRate;
	@ObfuscatedName("o")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4; // L: 32
			var2 /= var4;
			this.inputRate = var1;
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = 6.0D + (double)var7 / (double)var1;
				int var11 = (int)Math.floor(var9 - 7.0D + 1.0D);
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(7.0D + var9);
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = ((double)var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
					var8[var11] = (int)Math.floor(var17 * 65536.0D + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-47"
	)
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1133574944"
	)
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "0"
	)
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					Throwable var4 = var1; // L: 36
					String var5;
					if (var1 instanceof RunException) { // L: 39
						RunException var6 = (RunException)var1; // L: 40
						var5 = var6.message + " | "; // L: 41
						var4 = var6.throwable; // L: 42
					} else {
						var5 = ""; // L: 44
					}

					StringWriter var18 = new StringWriter(); // L: 45
					PrintWriter var7 = new PrintWriter(var18); // L: 46
					var4.printStackTrace(var7); // L: 47
					var7.close(); // L: 48
					String var8 = var18.toString(); // L: 49
					BufferedReader var9 = new BufferedReader(new StringReader(var8)); // L: 50
					String var10 = var9.readLine(); // L: 51

					label61:
					while (true) {
						while (true) {
							String var11 = var9.readLine(); // L: 53
							if (var11 == null) { // L: 54
								var5 = var5 + "| " + var10; // L: 72
								var2 = var5; // L: 75
								break label61;
							}

							int var12 = var11.indexOf(40); // L: 55
							int var13 = var11.indexOf(41, var12 + 1); // L: 56
							if (var12 >= 0 && var13 >= 0) { // L: 57
								String var14 = var11.substring(var12 + 1, var13); // L: 58
								int var15 = var14.indexOf(".java:"); // L: 59
								if (var15 >= 0) { // L: 60
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5); // L: 61
									var5 = var5 + var14 + ' '; // L: 62
									continue; // L: 63
								}

								var11 = var11.substring(0, var12); // L: 65
							}

							var11 = var11.trim(); // L: 67
							var11 = var11.substring(var11.lastIndexOf(32) + 1); // L: 68
							var11 = var11.substring(var11.lastIndexOf(9) + 1); // L: 69
							var5 = var5 + var11 + ' '; // L: 70
						}
					}
				}

				if (var0 != null) { // L: 77
					if (var1 != null) { // L: 78
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 79
				}

				System.out.println("Error: " + var2); // L: 81
				var2 = var2.replace(':', '.'); // L: 82
				var2 = var2.replace('@', '_'); // L: 83
				var2 = var2.replace('&', '_'); // L: 84
				var2 = var2.replace('#', '_'); // L: 85
				if (RunException.RunException_applet == null) { // L: 86
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + ObjectDefinition.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + WorldMapID.clientType + "&e=" + var2); // L: 87
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 88
				var17.read(); // L: 89
				var17.close(); // L: 90
			} catch (Exception var16) { // L: 92
			}

		}
	} // L: 93

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lct;",
		garbageValue = "-1387826100"
	)
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return WorldMapEvent.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-65"
	)
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 119
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "([Lhq;IIIIIIIII)V",
		garbageValue = "1194287146"
	)
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 8669
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 8670

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 8671
			Widget var10 = var0[var9]; // L: 8672
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 8673 8674
				int var11;
				if (var8 == -1) { // L: 8676
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 8677
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 8678
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 8679
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 8680
					var11 = ++Client.rootWidgetCount - 1; // L: 8681
				} else {
					var11 = var8; // L: 8683
				}

				var10.rootIndex = var11; // L: 8684
				var10.cycle = Client.cycle; // L: 8685
				if (!var10.isIf3 || !GrandExchangeOfferUnitPriceComparator.isComponentHidden(var10)) { // L: 8686
					if (var10.contentType > 0) { // L: 8687
						Canvas.method903(var10);
					}

					int var12 = var10.x + var6; // L: 8688
					int var13 = var7 + var10.y; // L: 8689
					int var14 = var10.transparencyTop; // L: 8690
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 8691
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 8692
							GrandExchangeOfferNameComparator.field115 = var0; // L: 8693
							Client.field947 = var6; // L: 8694
							class219.field2547 = var7; // L: 8695
							continue; // L: 8696
						}

						if (Client.isDraggingWidget && Client.field799) { // L: 8698
							var15 = MouseHandler.MouseHandler_x; // L: 8699
							var16 = MouseHandler.MouseHandler_y; // L: 8700
							var15 -= Client.widgetClickX; // L: 8701
							var16 -= Client.widgetClickY; // L: 8702
							if (var15 < Client.field856) { // L: 8703
								var15 = Client.field856;
							}

							if (var15 + var10.width > Client.field856 + Client.clickedWidgetParent.width) { // L: 8704
								var15 = Client.field856 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field785) { // L: 8705
								var16 = Client.field785;
							}

							if (var16 + var10.height > Client.field785 + Client.clickedWidgetParent.height) { // L: 8706
								var16 = Client.field785 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 8707
							var13 = var16; // L: 8708
						}

						if (!var10.isScrollBar) { // L: 8710
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 8716
						var15 = var2; // L: 8717
						var16 = var3; // L: 8718
						var17 = var4; // L: 8719
						var18 = var5; // L: 8720
					} else if (var10.type == 9) { // L: 8722
						var19 = var12; // L: 8723
						var20 = var13; // L: 8724
						var21 = var12 + var10.width; // L: 8725
						var22 = var13 + var10.height; // L: 8726
						if (var21 < var12) { // L: 8727
							var19 = var21; // L: 8729
							var21 = var12; // L: 8730
						}

						if (var22 < var13) { // L: 8732
							var20 = var22; // L: 8734
							var22 = var13; // L: 8735
						}

						++var21; // L: 8737
						++var22; // L: 8738
						var15 = var19 > var2 ? var19 : var2; // L: 8739
						var16 = var20 > var3 ? var20 : var3; // L: 8740
						var17 = var21 < var4 ? var21 : var4; // L: 8741
						var18 = var22 < var5 ? var22 : var5; // L: 8742
					} else {
						var19 = var12 + var10.width; // L: 8745
						var20 = var13 + var10.height; // L: 8746
						var15 = var12 > var2 ? var12 : var2; // L: 8747
						var16 = var13 > var3 ? var13 : var3; // L: 8748
						var17 = var19 < var4 ? var19 : var4; // L: 8749
						var18 = var20 < var5 ? var20 : var5; // L: 8750
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 8752
						if (var10.contentType != 0) { // L: 8753
							if (var10.contentType == 1336) { // L: 8754
								if (Client.displayFps) { // L: 8755
									var13 += 15; // L: 8756
									ItemDefinition.fontPlain12.drawRightAligned("Fps:" + GameShell.fps, var12 + var10.width, var13, 16776960, -1); // L: 8757
									var13 += 15; // L: 8758
									Runtime var42 = Runtime.getRuntime(); // L: 8759
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 8760
									var21 = 16776960; // L: 8761
									if (var20 > 327680 && !Client.isLowDetail) { // L: 8762
										var21 = 16711680;
									}

									ItemDefinition.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 8763
									var13 += 15; // L: 8764
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 8768
								Client.viewportX = var12; // L: 8769
								Client.viewportY = var13; // L: 8770
								GrandExchangeOfferOwnWorldComparator.drawEntities(var12, var13, var10.width, var10.height); // L: 8771
								Client.field882[var10.rootIndex] = true; // L: 8772
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 8773
								continue; // L: 8774
							}

							if (var10.contentType == 1338) { // L: 8776
								AbstractUserComparator.drawMinimap(var10, var12, var13, var11); // L: 8777
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 8778
								continue; // L: 8779
							}

							if (var10.contentType == 1339) { // L: 8781
								class69.drawCompass(var10, var12, var13, var11); // L: 8782
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 8783
								continue; // L: 8784
							}

							if (var10.contentType == 1400) { // L: 8786
								Message.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 8787
							}

							if (var10.contentType == 1401) { // L: 8789
								Message.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 8790
							}

							if (var10.contentType == 1402) { // L: 8792
								Varcs.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 8793
							}
						}

						if (var10.type == 0) { // L: 8796
							if (!var10.isIf3 && GrandExchangeOfferUnitPriceComparator.isComponentHidden(var10) && var10 != TriBool.mousedOverWidgetIf1) { // L: 8797
								continue;
							}

							if (!var10.isIf3) { // L: 8798
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 8799
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 8800
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 8802
							if (var10.children != null) { // L: 8803
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 8804
							if (var30 != null) { // L: 8805
								PlayerAppearance.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 8806
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 8808
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 8809
						}

						if (Client.isResizable || Client.field884[var11] || Client.gameDrawingMode > 1) { // L: 8811
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 8812 8813
								Clock.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 8815
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 8818
									var19 = 0; // L: 8819

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 8820
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 8821
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 8822
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 8823
											if (var19 < 20) { // L: 8824
												var22 += var10.inventoryXOffsets[var19]; // L: 8825
												var23 += var10.inventoryYOffsets[var19]; // L: 8826
											}

											if (var10.itemIds[var19] <= 0) { // L: 8828
												if (var10.inventorySprites != null && var19 < 20) { // L: 8873
													Sprite var46 = var10.getInventorySprite(var19); // L: 8874
													if (var46 != null) { // L: 8875
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2611) { // L: 8876
														class52.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 8829
												boolean var38 = false; // L: 8830
												var26 = var10.itemIds[var19] - 1; // L: 8831
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == BuddyRankComparator.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 8832
													Sprite var35;
													if (Client.isItemSelected == 1 && var19 == GrandExchangeOfferUnitPriceComparator.selectedItemSlot && var10.id == class105.selectedItemWidget) { // L: 8834
														var35 = ChatChannel.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = ChatChannel.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 8835
													}

													if (var35 != null) { // L: 8836
														if (var10 == BuddyRankComparator.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 8837
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 8838
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 8839
															if (var24 < 5 && var24 > -5) { // L: 8840
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 8841
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 8842
																var24 = 0; // L: 8843
																var25 = 0; // L: 8844
															}

															var35.drawTransAt(var22 + var24, var23 + var25, 128); // L: 8846
															if (var1 != -1) { // L: 8847
																Widget var28 = var0[var1 & 65535]; // L: 8848
																int var29;
																if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 8849
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field737 / 3; // L: 8850
																	if (var29 > Client.field737 * 10) { // L: 8851
																		var29 = Client.field737 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 8852
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 8853
																	Client.draggedWidgetY += var29; // L: 8854
																	class52.invalidateWidget(var28); // L: 8855
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 8857
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field737 / 3; // L: 8858
																	if (var29 > Client.field737 * 10) { // L: 8859
																		var29 = Client.field737 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 8860
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 8861
																	Client.draggedWidgetY -= var29; // L: 8862
																	class52.invalidateWidget(var28); // L: 8863
																}
															}
														} else if (var10 == GrandExchangeEvent.field79 && var19 == Client.field944) { // L: 8867
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 8868
														}
													} else {
														class52.invalidateWidget(var10); // L: 8870
													}
												}
											}

											++var19; // L: 8878
										}
									}
								} else if (var10.type == 3) { // L: 8883
									if (MusicPatch.runCs1(var10)) { // L: 8885
										var19 = var10.color2; // L: 8886
										if (var10 == TriBool.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 8887
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 8890
										if (var10 == TriBool.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 8891
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 8893
										switch(var10.fillMode.id) { // L: 8894
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 8896
											break; // L: 8897
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 8903
											break; // L: 8904
										default:
											if (var14 == 0) { // L: 8899
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 8900
											}
										}
									} else if (var14 == 0) { // L: 8908
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 8909
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 8913
										var39 = var10.getFont(); // L: 8914
										if (var39 == null) { // L: 8915
											if (Widget.field2611) { // L: 8916
												class52.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 8920
											if (MusicPatch.runCs1(var10)) { // L: 8921
												var20 = var10.color2; // L: 8922
												if (var10 == TriBool.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 8923
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 8924
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 8927
												if (var10 == TriBool.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 8928
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 8930
												ItemDefinition var45 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var10.itemId); // L: 8931
												var44 = var45.name; // L: 8932
												if (var44 == null) { // L: 8933
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 8934
													var44 = WorldMapAreaData.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + class297.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 8936
												var44 = "Please wait..."; // L: 8937
												var20 = var10.color; // L: 8938
											}

											if (!var10.isIf3) { // L: 8940
												var44 = AbstractByteArrayCopier.method4028(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 8941
										}
									} else if (var10.type == 5) { // L: 8944
										Sprite var40;
										if (!var10.isIf3) { // L: 8945
											var40 = var10.getSprite(MusicPatch.runCs1(var10)); // L: 8946
											if (var40 != null) { // L: 8947
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2611) { // L: 8948
												class52.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 8952
												var40 = ChatChannel.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 8953
											}

											if (var40 == null) { // L: 8954
												if (Widget.field2611) { // L: 8978
													class52.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 8955
												var21 = var40.height; // L: 8956
												if (!var10.spriteTiling) { // L: 8957
													var22 = var10.width * 4096 / var20; // L: 8971
													if (var10.spriteAngle != 0) { // L: 8972
														var40.method6296(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 8973
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 8974
														var40.drawTransBgAt(var12, var13); // L: 8975
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 8958
													var22 = (var20 - 1 + var10.width) / var20; // L: 8959
													var23 = (var21 - 1 + var10.height) / var21; // L: 8960

													for (var24 = 0; var24 < var22; ++var24) { // L: 8961
														for (var25 = 0; var25 < var23; ++var25) { // L: 8962
															if (var10.spriteAngle != 0) { // L: 8963
																var40.method6296(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 8964
																var40.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 8965
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 8968
												}
											}
										}
									} else {
										ItemDefinition var33;
										if (var10.type == 6) { // L: 8982
											boolean var36 = MusicPatch.runCs1(var10); // L: 8983
											if (var36) { // L: 8985
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 8986
											}

											Model var41 = null; // L: 8987
											var22 = 0; // L: 8988
											if (var10.itemId != -1) { // L: 8989
												var33 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var10.itemId); // L: 8990
												if (var33 != null) { // L: 8991
													var33 = var33.getCountObj(var10.itemQuantity); // L: 8992
													var41 = var33.getModel(1); // L: 8993
													if (var41 != null) { // L: 8994
														var41.calculateBoundsCylinder(); // L: 8995
														var22 = var41.height / 2; // L: 8996
													} else {
														class52.invalidateWidget(var10); // L: 8998
													}
												}
											} else if (var10.modelType == 5) { // L: 9001
												if (var10.modelId == 0) { // L: 9002
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = WorldMapLabelSize.localPlayer.getModel(); // L: 9003
												}
											} else if (var20 == -1) { // L: 9005
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, WorldMapLabelSize.localPlayer.appearance); // L: 9006
												if (var41 == null && Widget.field2611) { // L: 9007
													class52.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = WorldMapRegion.SequenceDefinition_get(var20); // L: 9010
												var41 = var10.getModel(var47, var10.modelFrame, var36, WorldMapLabelSize.localPlayer.appearance); // L: 9011
												if (var41 == null && Widget.field2611) { // L: 9012
													class52.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3181(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9014
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9015
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9016
											if (var41 != null) { // L: 9017
												if (!var10.isIf3) { // L: 9018
													var41.method3003(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9020
													if (var10.modelOrthog) { // L: 9021
														var41.method3005(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method3003(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9022
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9025
										} else {
											if (var10.type == 7) { // L: 9028
												var39 = var10.getFont(); // L: 9029
												if (var39 == null) { // L: 9030
													if (Widget.field2611) { // L: 9031
														class52.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9034

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9035
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9036
														if (var10.itemIds[var20] > 0) { // L: 9037
															var33 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9038
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9040
																var34 = WorldMapAreaData.colorStartTag(16748608) + var33.name + "</col>"; // L: 9041
															} else {
																var34 = WorldMapAreaData.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + class297.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 9042
															var26 = var13 + (var10.paddingY + 12) * var21; // L: 9043
															if (var10.textXAlignment == 0) { // L: 9044
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9045
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9046
															}
														}

														++var20; // L: 9048
													}
												}
											}

											if (var10.type == 8 && var10 == Occluder.field1950 && Client.field828 == Client.field770) { // L: 9052 9053
												var19 = 0; // L: 9054
												var20 = 0; // L: 9055
												Font var31 = ItemDefinition.fontPlain12; // L: 9056
												String var32 = var10.text; // L: 9057

												String var43;
												for (var32 = AbstractByteArrayCopier.method4028(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 9059 9060 9072
													var24 = var32.indexOf("<br>"); // L: 9061
													if (var24 != -1) { // L: 9062
														var43 = var32.substring(0, var24); // L: 9063
														var32 = var32.substring(var24 + 4); // L: 9064
													} else {
														var43 = var32; // L: 9067
														var32 = ""; // L: 9068
													}

													var25 = var31.stringWidth(var43); // L: 9070
													if (var25 > var19) { // L: 9071
														var19 = var25;
													}
												}

												var19 += 6; // L: 9074
												var20 += 7; // L: 9075
												var24 = var12 + var10.width - 5 - var19; // L: 9076
												var25 = var13 + var10.height + 5; // L: 9077
												if (var24 < var12 + 5) { // L: 9078
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 9079
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 9080
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 9081
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 9082
												var32 = var10.text; // L: 9083
												var26 = var25 + var31.ascent + 2; // L: 9084

												for (var32 = AbstractByteArrayCopier.method4028(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 9085 9086 9097
													int var27 = var32.indexOf("<br>"); // L: 9087
													if (var27 != -1) { // L: 9088
														var43 = var32.substring(0, var27); // L: 9089
														var32 = var32.substring(var27 + 4); // L: 9090
													} else {
														var43 = var32; // L: 9093
														var32 = ""; // L: 9094
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 9096
												}
											}

											if (var10.type == 9) { // L: 9101
												if (var10.field2639) { // L: 9106
													var19 = var12; // L: 9107
													var20 = var13 + var10.height; // L: 9108
													var21 = var12 + var10.width; // L: 9109
													var22 = var13; // L: 9110
												} else {
													var19 = var12; // L: 9113
													var20 = var13; // L: 9114
													var21 = var12 + var10.width; // L: 9115
													var22 = var13 + var10.height; // L: 9116
												}

												if (var10.lineWid == 1) { // L: 9118
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 9119
												} else {
													ObjectSound.method1987(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 9122
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

	} // L: 9127
}
