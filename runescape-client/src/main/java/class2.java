import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class2 {
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -2123526983
	)
	static int field15;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -96545822097112055L
	)
	long field24;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -480209285
	)
	int field17;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	IterableNodeDeque field22;

	@ObfuscatedSignature(
		descriptor = "(Lnu;)V"
	)
	public class2(Buffer var1) {
		this.field17 = -1; // L: 9
		this.field22 = new IterableNodeDeque(); // L: 10
		this.method28(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1544288881"
	)
	void method28(Buffer var1) {
		this.field24 = var1.readLong();
		this.field17 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 55
			Object var3;
			if (var2 == 3) {
				var3 = new class13(this);
			} else if (var2 == 1) {
				var3 = new class8(this);
			} else if (var2 == 13) {
				var3 = new class26(this);
			} else if (var2 == 4) {
				var3 = new class17(this);
			} else if (var2 == 6) {
				var3 = new class10(this);
			} else if (var2 == 5) {
				var3 = new class22(this);
			} else if (var2 == 2) {
				var3 = new class23(this);
			} else if (var2 == 7) {
				var3 = new class21(this);
			} else if (var2 == 14) {
				var3 = new class18(this);
			} else if (var2 == 8) {
				var3 = new class6(this);
			} else if (var2 == 9) {
				var3 = new class0(this);
			} else if (var2 == 10) {
				var3 = new class4(this);
			} else if (var2 == 11) {
				var3 = new class1(this);
			} else if (var2 == 12) {
				var3 = new class15(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class27(this);
			}

			((class14)var3).vmethod371(var1);
			this.field22.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "248854957"
	)
	public void method29(class11 var1) {
		if (var1.field79 == this.field24 && this.field17 == var1.field80) {
			for (class14 var2 = (class14)this.field22.last(); var2 != null; var2 = (class14)this.field22.previous()) { // L: 61
				var2.vmethod376(var1); // L: 62
			}

			++var1.field80; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Ljava/lang/String;I)I",
		garbageValue = "1745041839"
	)
	public static int method34(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		int var4 = var1.length(); // L: 21
		byte[] var5 = new byte[var4]; // L: 22

		for (int var6 = 0; var6 < var4; ++var6) { // L: 23
			char var7 = var1.charAt(var6); // L: 24
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 25
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 26
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 27
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 28
				var5[var6] = -125;
			} else if (var7 == 8222) {
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 30
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 31
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 32
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 33
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 34
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 35
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 36
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 37
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 38
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 39
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 40
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 41
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 42
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 43
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106; // L: 44
			} else if (var7 == 8212) { // L: 45
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 46
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 47
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 48
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 49
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 50
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 51
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 52
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 53
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 58
		var0.offset += class227.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 59
		return var0.offset - var2; // L: 60
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-878871415"
	)
	public static boolean method39(int var0) {
		return (var0 >> 28 & 1) != 0; // L: 29
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lhu;IIII)V",
		garbageValue = "835982981"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2701 == null) { // L: 987
			throw new RuntimeException(); // L: 988
		} else {
			var0.field2701[var1] = var2; // L: 990
			var0.field2692[var1] = var3; // L: 991
		}
	} // L: 992

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILhk;ZI)V",
		garbageValue = "-2112750284"
	)
	static void method37(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = Actor.getWorldMap().getMapArea(var0); // L: 4286
		int var4 = Varcs.localPlayer.plane; // L: 4287
		int var5 = (Varcs.localPlayer.x >> 7) + ItemLayer.baseX; // L: 4288
		int var6 = (Varcs.localPlayer.y >> 7) + Tile.baseY; // L: 4289
		Coord var7 = new Coord(var4, var5, var6); // L: 4290
		Actor.getWorldMap().method6264(var3, var7, var1, var2); // L: 4291
	} // L: 4292

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1663877987"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 3682
			byte var2 = 4; // L: 3683
			int var3 = var2 + 6; // L: 3684
			int var4 = var2 + 6; // L: 3685
			int var5 = class14.fontPlain12.lineWidth(var0, 250); // L: 3686
			int var6 = class14.fontPlain12.lineCount(var0, 250) * 13; // L: 3687
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 0); // L: 3688
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 16777215); // L: 3689
			class14.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 3690
			int var7 = var3 - var2; // L: 3691
			int var8 = var4 - var2; // L: 3692
			int var9 = var2 + var5 + var2; // L: 3693
			int var10 = var6 + var2 + var2; // L: 3694

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 3696
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 3697
					Client.field811[var11] = true;
				}
			}

			if (var1) { // L: 3700
				GameEngine.rasterProvider.drawFull(0, 0); // L: 3701
			} else {
				LoginScreenAnimation.method2198(var3, var4, var5, var6); // L: 3704
			}

		}
	} // L: 3706

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-841281323"
	)
	static final int method36() {
		if (Login.clientPreferences.roofsHidden) { // L: 3988
			return class26.Client_plane;
		} else {
			int var0 = 3; // L: 3989
			if (WorldMapArea.cameraPitch < 310) { // L: 3990
				label168: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) { // L: 3993
						var1 = class6.oculusOrbFocalPointX >> 7; // L: 3994
						var2 = Players.oculusOrbFocalPointY >> 7; // L: 3995
					} else {
						var1 = Varcs.localPlayer.x >> 7; // L: 3998
						var2 = Varcs.localPlayer.y >> 7; // L: 3999
					}

					int var3 = ModeWhere.cameraX >> 7; // L: 4001
					int var4 = ReflectionCheck.cameraZ >> 7; // L: 4002
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 4003
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 4004
							if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) { // L: 4005
								var0 = class26.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 4007
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 4008
							}

							int var6;
							if (var2 > var4) { // L: 4010
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 4011
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 4012
								var7 = var6 * 65536 / var5; // L: 4013
								var8 = 32768; // L: 4014

								while (true) {
									if (var1 == var3) { // L: 4015
										break label168;
									}

									if (var3 < var1) { // L: 4016
										++var3;
									} else if (var3 > var1) { // L: 4017
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) { // L: 4018
										var0 = class26.Client_plane;
									}

									var8 += var7; // L: 4019
									if (var8 >= 65536) { // L: 4020
										var8 -= 65536; // L: 4021
										if (var4 < var2) { // L: 4022
											++var4;
										} else if (var4 > var2) { // L: 4023
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) { // L: 4024
											var0 = class26.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 4028
									var7 = var5 * 65536 / var6; // L: 4029
									var8 = 32768; // L: 4030

									while (var2 != var4) { // L: 4031
										if (var4 < var2) { // L: 4032
											++var4;
										} else if (var4 > var2) { // L: 4033
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) { // L: 4034
											var0 = class26.Client_plane;
										}

										var8 += var7; // L: 4035
										if (var8 >= 65536) { // L: 4036
											var8 -= 65536; // L: 4037
											if (var3 < var1) { // L: 4038
												++var3;
											} else if (var3 > var1) { // L: 4039
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[class26.Client_plane][var3][var4] & 4) != 0) { // L: 4040
												var0 = class26.Client_plane;
											}
										}
									}
								}
								break label168;
							}
						}

						return class26.Client_plane;
					}

					return class26.Client_plane;
				}
			}

			if (Varcs.localPlayer.x >= 0 && Varcs.localPlayer.y >= 0 && Varcs.localPlayer.x < 13312 && Varcs.localPlayer.y < 13312) { // L: 4045
				if ((Tiles.Tiles_renderFlags[class26.Client_plane][Varcs.localPlayer.x >> 7][Varcs.localPlayer.y >> 7] & 4) != 0) { // L: 4046
					var0 = class26.Client_plane;
				}

				return var0; // L: 4047
			} else {
				return class26.Client_plane;
			}
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "([Lhu;IIIIIIIII)V",
		garbageValue = "1743057501"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9424
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9425

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9426
			Widget var10 = var0[var9]; // L: 9427
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9428 9429
				int var11;
				if (var8 == -1) { // L: 9431
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9432
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9433
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9434
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9435
					var11 = ++Client.rootWidgetCount - 1; // L: 9436
				} else {
					var11 = var8; // L: 9438
				}

				var10.rootIndex = var11; // L: 9439
				var10.cycle = Client.cycle; // L: 9440
				if (!var10.isIf3 || !WorldMapArea.isComponentHidden(var10)) { // L: 9441
					if (var10.contentType > 0) { // L: 9442
						ChatChannel.method2017(var10);
					}

					int var12 = var10.x + var6; // L: 9443
					int var13 = var7 + var10.y; // L: 9444
					int var14 = var10.transparencyTop; // L: 9445
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9446
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9447
							WallDecoration.field2179 = var0; // L: 9448
							class11.field106 = var6; // L: 9449
							class235.field2843 = var7; // L: 9450
							continue; // L: 9451
						}

						if (Client.isDraggingWidget && Client.field780) { // L: 9453
							var15 = MouseHandler.MouseHandler_x; // L: 9454
							var16 = MouseHandler.MouseHandler_y; // L: 9455
							var15 -= Client.widgetClickX; // L: 9456
							var16 -= Client.widgetClickY; // L: 9457
							if (var15 < Client.field727) { // L: 9458
								var15 = Client.field727;
							}

							if (var15 + var10.width > Client.field727 + Client.clickedWidgetParent.width) { // L: 9459
								var15 = Client.field727 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field782) { // L: 9460
								var16 = Client.field782;
							}

							if (var16 + var10.height > Client.field782 + Client.clickedWidgetParent.height) { // L: 9461
								var16 = Client.field782 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9462
							var13 = var16; // L: 9463
						}

						if (!var10.isScrollBar) { // L: 9465
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9471
						var15 = var2; // L: 9472
						var16 = var3; // L: 9473
						var17 = var4; // L: 9474
						var18 = var5; // L: 9475
					} else if (var10.type == 9) { // L: 9477
						var19 = var12; // L: 9478
						var20 = var13; // L: 9479
						var21 = var12 + var10.width; // L: 9480
						var22 = var13 + var10.height; // L: 9481
						if (var21 < var12) { // L: 9482
							var19 = var21; // L: 9484
							var21 = var12; // L: 9485
						}

						if (var22 < var13) { // L: 9487
							var20 = var22; // L: 9489
							var22 = var13; // L: 9490
						}

						++var21; // L: 9492
						++var22; // L: 9493
						var15 = var19 > var2 ? var19 : var2; // L: 9494
						var16 = var20 > var3 ? var20 : var3; // L: 9495
						var17 = var21 < var4 ? var21 : var4; // L: 9496
						var18 = var22 < var5 ? var22 : var5; // L: 9497
					} else {
						var19 = var12 + var10.width; // L: 9500
						var20 = var13 + var10.height; // L: 9501
						var15 = var12 > var2 ? var12 : var2; // L: 9502
						var16 = var13 > var3 ? var13 : var3; // L: 9503
						var17 = var19 < var4 ? var19 : var4; // L: 9504
						var18 = var20 < var5 ? var20 : var5; // L: 9505
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9507
						if (var10.contentType != 0) { // L: 9508
							if (var10.contentType == 1336) { // L: 9509
								if (Client.displayFps) { // L: 9510
									var13 += 15; // L: 9511
									class14.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9512
									var13 += 15; // L: 9513
									Runtime var42 = Runtime.getRuntime(); // L: 9514
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9515
									var21 = 16776960; // L: 9516
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9517
										var21 = 16711680;
									}

									class14.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9518
									var13 += 15; // L: 9519
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9523
								Client.viewportX = var12; // L: 9524
								Client.viewportY = var13; // L: 9525
								class24.drawEntities(var12, var13, var10.width, var10.height); // L: 9526
								Client.field811[var10.rootIndex] = true; // L: 9527
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9528
								continue; // L: 9529
							}

							if (var10.contentType == 1338) { // L: 9531
								class21.drawMinimap(var10, var12, var13, var11); // L: 9532
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9533
								continue; // L: 9534
							}

							if (var10.contentType == 1339) { // L: 9536
								class373.drawCompass(var10, var12, var13, var11); // L: 9537
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9538
								continue; // L: 9539
							}

							if (var10.contentType == 1400) { // L: 9541
								UserComparator4.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9542
							}

							if (var10.contentType == 1401) { // L: 9544
								UserComparator4.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9545
							}

							if (var10.contentType == 1402) { // L: 9547
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9548
							}
						}

						if (var10.type == 0) { // L: 9551
							if (!var10.isIf3 && WorldMapArea.isComponentHidden(var10) && var10 != Varps.mousedOverWidgetIf1) { // L: 9552
								continue;
							}

							if (!var10.isIf3) { // L: 9553
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9554
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9555
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9557
							if (var10.children != null) { // L: 9558
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9559
							if (var30 != null) { // L: 9560
								Skeleton.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9561
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9563
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9564
						}

						if (Client.isResizable || Client.field704[var11] || Client.gameDrawingMode > 1) { // L: 9566
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9567 9568
								class303.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9570
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9573
									var19 = 0; // L: 9574

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9575
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9576
											var22 = var21 * (var10.paddingX + 32) + var12; // L: 9577
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 9578
											if (var19 < 20) { // L: 9579
												var22 += var10.inventoryXOffsets[var19]; // L: 9580
												var23 += var10.inventoryYOffsets[var19]; // L: 9581
											}

											if (var10.itemIds[var19] <= 0) { // L: 9583
												if (var10.inventorySprites != null && var19 < 20) { // L: 9628
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9629
													if (var46 != null) { // L: 9630
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2622) { // L: 9631
														class29.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9584
												boolean var38 = false; // L: 9585
												var26 = var10.itemIds[var19] - 1; // L: 9586
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == ClientPacket.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9587
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == class208.selectedItemSlot && var10.id == UserComparator6.selectedItemWidget) { // L: 9589
														var35 = WorldMapManager.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = WorldMapManager.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9590
													}

													if (var35 != null) { // L: 9591
														if (var10 == ClientPacket.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9592
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9593
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9594
															if (var24 < 5 && var24 > -5) { // L: 9595
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9596
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9597
																var24 = 0; // L: 9598
																var25 = 0; // L: 9599
															}

															var35.drawTransAt(var22 + var24, var25 + var23, 128); // L: 9601
															if (var1 != -1) { // L: 9602
																Widget var28 = var0[var1 & 65535]; // L: 9603
																int var29;
																if (var25 + var23 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9604
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field799 / 3; // L: 9605
																	if (var29 > Client.field799 * 10) { // L: 9606
																		var29 = Client.field799 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9607
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9608
																	Client.draggedWidgetY += var29; // L: 9609
																	class29.invalidateWidget(var28); // L: 9610
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9612
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field799 / 3; // L: 9613
																	if (var29 > Client.field799 * 10) { // L: 9614
																		var29 = Client.field799 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9615
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9616
																	Client.draggedWidgetY -= var29; // L: 9617
																	class29.invalidateWidget(var28); // L: 9618
																}
															}
														} else if (var10 == PacketWriter.field1394 && var19 == Client.field709) { // L: 9622
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9623
														}
													} else {
														class29.invalidateWidget(var10); // L: 9625
													}
												}
											}

											++var19; // L: 9633
										}
									}
								} else if (var10.type == 3) { // L: 9638
									if (class159.runCs1(var10)) { // L: 9640
										var19 = var10.color2; // L: 9641
										if (var10 == Varps.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9642
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 9645
										if (var10 == Varps.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9646
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 9648
										switch(var10.fillMode.field4232) { // L: 9649
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 9655
											break; // L: 9656
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 9658
											break; // L: 9659
										default:
											if (var14 == 0) { // L: 9651
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9652
											}
										}
									} else if (var14 == 0) { // L: 9663
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 9664
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 9668
										var39 = var10.getFont(); // L: 9669
										if (var39 == null) { // L: 9670
											if (Widget.field2622) { // L: 9671
												class29.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 9675
											if (class159.runCs1(var10)) { // L: 9676
												var20 = var10.color2; // L: 9677
												if (var10 == Varps.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 9678
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 9679
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 9682
												if (var10 == Varps.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 9683
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 9685
												ItemComposition var45 = class23.ItemDefinition_get(var10.itemId); // L: 9686
												var44 = var45.name; // L: 9687
												if (var44 == null) { // L: 9688
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 9689
													var44 = DefaultsGroup.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + UserComparator5.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 9691
												var44 = "Please wait..."; // L: 9692
												var20 = var10.color; // L: 9693
											}

											if (!var10.isIf3) { // L: 9695
												var44 = class232.method4363(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 9696
										}
									} else if (var10.type == 5) { // L: 9699
										SpritePixels var40;
										if (!var10.isIf3) { // L: 9700
											var40 = var10.getSprite(class159.runCs1(var10)); // L: 9701
											if (var40 != null) { // L: 9702
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2622) { // L: 9703
												class29.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 9707
												var40 = WorldMapManager.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false); // L: 9708
											}

											if (var40 == null) { // L: 9709
												if (Widget.field2622) { // L: 9733
													class29.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 9710
												var21 = var40.height; // L: 9711
												if (!var10.spriteTiling) { // L: 9712
													var22 = var10.width * 4096 / var20; // L: 9726
													if (var10.spriteAngle != 0) { // L: 9727
														var40.method7000(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 9728
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 9729
														var40.drawTransBgAt(var12, var13); // L: 9730
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 9713
													var22 = (var20 - 1 + var10.width) / var20; // L: 9714
													var23 = (var21 - 1 + var10.height) / var21; // L: 9715

													for (var24 = 0; var24 < var22; ++var24) { // L: 9716
														for (var25 = 0; var25 < var23; ++var25) { // L: 9717
															if (var10.spriteAngle != 0) { // L: 9718
																var40.method7000(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 9719
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 9720
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9723
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 9737
											boolean var36 = class159.runCs1(var10); // L: 9738
											if (var36) { // L: 9740
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 9741
											}

											Model var41 = null; // L: 9742
											var22 = 0; // L: 9743
											if (var10.itemId != -1) { // L: 9744
												var33 = class23.ItemDefinition_get(var10.itemId); // L: 9745
												if (var33 != null) { // L: 9746
													var33 = var33.getCountObj(var10.itemQuantity); // L: 9747
													var41 = var33.getModel(1); // L: 9748
													if (var41 != null) { // L: 9749
														var41.calculateBoundsCylinder(); // L: 9750
														var22 = var41.height / 2; // L: 9751
													} else {
														class29.invalidateWidget(var10); // L: 9753
													}
												}
											} else if (var10.modelType == 5) { // L: 9756
												if (var10.modelId == 0) { // L: 9757
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = Varcs.localPlayer.getModel(); // L: 9758
												}
											} else if (var20 == -1) { // L: 9760
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, Varcs.localPlayer.appearance); // L: 9761
												if (var41 == null && Widget.field2622) { // L: 9762
													class29.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = class225.SequenceDefinition_get(var20); // L: 9765
												var41 = var10.getModel(var47, var10.modelFrame, var36, Varcs.localPlayer.appearance); // L: 9766
												if (var41 == null && Widget.field2622) { // L: 9767
													class29.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3411(var10.width / 2 + var12, var10.height / 2 + var13); // L: 9769
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9770
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 9771
											if (var41 != null) { // L: 9772
												if (!var10.isIf3) { // L: 9773
													var41.method3692(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 9775
													if (var10.modelOrthog) { // L: 9776
														var41.method3693(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method3692(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 9777
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 9780
										} else {
											if (var10.type == 7) { // L: 9783
												var39 = var10.getFont(); // L: 9784
												if (var39 == null) { // L: 9785
													if (Widget.field2622) { // L: 9786
														class29.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 9789

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 9790
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 9791
														if (var10.itemIds[var20] > 0) { // L: 9792
															var33 = class23.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 9793
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 9795
																var34 = DefaultsGroup.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = DefaultsGroup.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + UserComparator5.formatItemStacks(var10.itemQuantities[var20]); // L: 9796
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 9797
															var26 = var21 * (var10.paddingY + 12) + var13; // L: 9798
															if (var10.textXAlignment == 0) { // L: 9799
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 9800
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 9801
															}
														}

														++var20; // L: 9803
													}
												}
											}

											if (var10.type == 8 && var10 == Player.field1192 && Client.field753 == Client.field696) { // L: 9807 9808
												var19 = 0; // L: 9809
												var20 = 0; // L: 9810
												Font var31 = class14.fontPlain12; // L: 9811
												String var32 = var10.text; // L: 9812

												String var43;
												for (var32 = class232.method4363(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 9814 9815 9827
													var24 = var32.indexOf("<br>"); // L: 9816
													if (var24 != -1) { // L: 9817
														var43 = var32.substring(0, var24); // L: 9818
														var32 = var32.substring(var24 + 4); // L: 9819
													} else {
														var43 = var32; // L: 9822
														var32 = ""; // L: 9823
													}

													var25 = var31.stringWidth(var43); // L: 9825
													if (var25 > var19) { // L: 9826
														var19 = var25;
													}
												}

												var19 += 6; // L: 9829
												var20 += 7; // L: 9830
												var24 = var12 + var10.width - 5 - var19; // L: 9831
												var25 = var13 + var10.height + 5; // L: 9832
												if (var24 < var12 + 5) { // L: 9833
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 9834
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 9835
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 9836
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 9837
												var32 = var10.text; // L: 9838
												var26 = var25 + var31.ascent + 2; // L: 9839

												for (var32 = class232.method4363(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 9840 9841 9852
													int var27 = var32.indexOf("<br>"); // L: 9842
													if (var27 != -1) { // L: 9843
														var43 = var32.substring(0, var27); // L: 9844
														var32 = var32.substring(var27 + 4); // L: 9845
													} else {
														var43 = var32; // L: 9848
														var32 = ""; // L: 9849
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 9851
												}
											}

											if (var10.type == 9) { // L: 9856
												if (var10.field2727) { // L: 9861
													var19 = var12; // L: 9862
													var20 = var13 + var10.height; // L: 9863
													var21 = var12 + var10.width; // L: 9864
													var22 = var13; // L: 9865
												} else {
													var19 = var12; // L: 9868
													var20 = var13; // L: 9869
													var21 = var12 + var10.width; // L: 9870
													var22 = var13 + var10.height; // L: 9871
												}

												if (var10.lineWid == 1) { // L: 9873
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 9874
												} else {
													ByteArrayPool.method5575(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 9877
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

	} // L: 9882
}
