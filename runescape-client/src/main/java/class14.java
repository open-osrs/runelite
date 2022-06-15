import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class14 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2053769865
	)
	final int field81;
	@ObfuscatedName("v")
	final String field77;
	@ObfuscatedName("q")
	final ThreadFactory field78;
	@ObfuscatedName("f")
	final ThreadPoolExecutor field84;

	public class14(String var1, int var2, int var3) {
		this.field77 = var1; // L: 15
		this.field81 = var2; // L: 16
		this.field78 = new class16(this); // L: 17
		this.field84 = this.method149(var3); // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "8960"
	)
	final ThreadPoolExecutor method149(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field81), this.field78); // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ls;I)La;",
		garbageValue = "-1856685329"
	)
	public class19 method150(class10 var1) {
		if (this.field84.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field84.getCorePoolSize() + " Queue capacity " + this.field81); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field84.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "93427456"
	)
	public final void method151() {
		try {
			this.field84.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpq;II)V",
		garbageValue = "-80281997"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 410
		if (var2) { // L: 411
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 412
		Player var4 = Client.players[var1]; // L: 413
		if (var3 == 0) { // L: 414
			if (var2) { // L: 415
				var4.field1088 = false; // L: 416
			} else if (Client.localPlayerIndex == var1) { // L: 419
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class28.baseX + var4.pathX[0] >> 13 << 14) + (WorldMapLabelSize.baseY + var4.pathY[0] >> 13); // L: 420
				if (var4.field1165 != -1) { // L: 421
					Players.Players_orientations[var1] = var4.field1165;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 422
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 423
				Client.players[var1] = null; // L: 424
				if (var0.readBits(1) != 0) { // L: 425
					ModelData0.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 428
				var5 = var0.readBits(3); // L: 429
				var6 = var4.pathX[0]; // L: 430
				var7 = var4.pathY[0]; // L: 431
				if (var5 == 0) { // L: 432
					--var6; // L: 433
					--var7; // L: 434
				} else if (var5 == 1) { // L: 436
					--var7;
				} else if (var5 == 2) { // L: 437
					++var6; // L: 438
					--var7; // L: 439
				} else if (var5 == 3) { // L: 441
					--var6;
				} else if (var5 == 4) { // L: 442
					++var6;
				} else if (var5 == 5) { // L: 443
					--var6; // L: 444
					++var7; // L: 445
				} else if (var5 == 6) { // L: 447
					++var7;
				} else if (var5 == 7) { // L: 448
					++var6; // L: 449
					++var7; // L: 450
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 452
					var4.resetPath(var6, var7); // L: 453
					var4.field1088 = false; // L: 454
				} else if (var2) { // L: 456
					var4.field1088 = true; // L: 457
					var4.tileX = var6; // L: 458
					var4.tileY = var7; // L: 459
				} else {
					var4.field1088 = false; // L: 462
					var4.method2139(var6, var7, Players.field1304[var1]); // L: 463
				}

			} else if (var3 == 2) { // L: 467
				var5 = var0.readBits(4); // L: 468
				var6 = var4.pathX[0]; // L: 469
				var7 = var4.pathY[0]; // L: 470
				if (var5 == 0) { // L: 471
					var6 -= 2; // L: 472
					var7 -= 2; // L: 473
				} else if (var5 == 1) { // L: 475
					--var6; // L: 476
					var7 -= 2; // L: 477
				} else if (var5 == 2) { // L: 479
					var7 -= 2;
				} else if (var5 == 3) { // L: 480
					++var6; // L: 481
					var7 -= 2; // L: 482
				} else if (var5 == 4) { // L: 484
					var6 += 2; // L: 485
					var7 -= 2; // L: 486
				} else if (var5 == 5) { // L: 488
					var6 -= 2; // L: 489
					--var7; // L: 490
				} else if (var5 == 6) { // L: 492
					var6 += 2; // L: 493
					--var7; // L: 494
				} else if (var5 == 7) { // L: 496
					var6 -= 2;
				} else if (var5 == 8) { // L: 497
					var6 += 2;
				} else if (var5 == 9) { // L: 498
					var6 -= 2; // L: 499
					++var7; // L: 500
				} else if (var5 == 10) { // L: 502
					var6 += 2; // L: 503
					++var7; // L: 504
				} else if (var5 == 11) { // L: 506
					var6 -= 2; // L: 507
					var7 += 2; // L: 508
				} else if (var5 == 12) { // L: 510
					--var6; // L: 511
					var7 += 2; // L: 512
				} else if (var5 == 13) { // L: 514
					var7 += 2;
				} else if (var5 == 14) { // L: 515
					++var6; // L: 516
					var7 += 2; // L: 517
				} else if (var5 == 15) { // L: 519
					var6 += 2; // L: 520
					var7 += 2; // L: 521
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 523
					var4.resetPath(var6, var7); // L: 524
					var4.field1088 = false; // L: 525
				} else if (var2) { // L: 527
					var4.field1088 = true; // L: 528
					var4.tileX = var6; // L: 529
					var4.tileY = var7; // L: 530
				} else {
					var4.field1088 = false; // L: 533
					var4.method2139(var6, var7, Players.field1304[var1]); // L: 534
				}

			} else {
				var5 = var0.readBits(1); // L: 538
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 539
					var6 = var0.readBits(12); // L: 540
					var7 = var6 >> 10; // L: 541
					var8 = var6 >> 5 & 31; // L: 542
					if (var8 > 15) { // L: 543
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 544
					if (var9 > 15) { // L: 545
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 546
					var11 = var9 + var4.pathY[0]; // L: 547
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 548
						var4.resetPath(var10, var11); // L: 549
						var4.field1088 = false; // L: 550
					} else if (var2) { // L: 552
						var4.field1088 = true; // L: 553
						var4.tileX = var10; // L: 554
						var4.tileY = var11; // L: 555
					} else {
						var4.field1088 = false; // L: 558
						var4.method2139(var10, var11, Players.field1304[var1]); // L: 559
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 561
					if (Client.localPlayerIndex == var1) { // L: 562
						PacketWriter.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 565
					var7 = var6 >> 28; // L: 566
					var8 = var6 >> 14 & 16383; // L: 567
					var9 = var6 & 16383; // L: 568
					var10 = (var8 + class28.baseX + var4.pathX[0] & 16383) - class28.baseX; // L: 569
					var11 = (var9 + WorldMapLabelSize.baseY + var4.pathY[0] & 16383) - WorldMapLabelSize.baseY; // L: 570
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 571
						var4.resetPath(var10, var11); // L: 572
						var4.field1088 = false; // L: 573
					} else if (var2) { // L: 575
						var4.field1088 = true; // L: 576
						var4.tileX = var10; // L: 577
						var4.tileY = var11; // L: 578
					} else {
						var4.field1088 = false; // L: 581
						var4.method2139(var10, var11, Players.field1304[var1]); // L: 582
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 584
					if (Client.localPlayerIndex == var1) { // L: 585
						PacketWriter.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 417 426 465 536 563 586

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	public static void method148() {
		PlayerComposition.Widget_cachedSpriteMasks.clear(); // L: 279
	} // L: 280

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1085625206"
	)
	static final int method156(int var0, int var1) {
		int var2 = class154.method3169(45365 + var0, 91923 + var1, 4) - 128 + (class154.method3169(10294 + var0, 37821 + var1, 2) - 128 >> 1) + (class154.method3169(var0, var1, 1) - 128 >> 2); // L: 873
		var2 = (int)(0.3D * (double)var2) + 35; // L: 874
		if (var2 < 10) { // L: 875
			var2 = 10;
		} else if (var2 > 60) { // L: 876
			var2 = 60;
		}

		return var2; // L: 877
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-455048359"
	)
	static int method155(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4494
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4499
				if (var0 == 6750) { // L: 4503
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4504
					return 1; // L: 4505
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4507
					if (var0 == 6754) { // L: 4511
						int var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4512
						NPCComposition var4 = BuddyRankComparator.getNpcDefinition(var3); // L: 4513
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4514
						return 1; // L: 4515
					} else {
						return 2; // L: 4517
					}
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4508
					return 1; // L: 4509
				}
			} else {
				--class446.Interpreter_intStackSize; // L: 4500
				return 1; // L: 4501
			}
		} else {
			class446.Interpreter_intStackSize -= 2; // L: 4495
			--Interpreter.Interpreter_stringStackSize; // L: 4496
			return 1; // L: 4497
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "([Lkb;IIIIIIIII)V",
		garbageValue = "-2125768585"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10095
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10096

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10097
			Widget var10 = var0[var9]; // L: 10098
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10099 10100
				int var11;
				if (var8 == -1) { // L: 10102
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10103
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10104
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10105
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10106
					var11 = ++Client.rootWidgetCount - 1; // L: 10107
				} else {
					var11 = var8; // L: 10109
				}

				var10.rootIndex = var11; // L: 10110
				var10.cycle = Client.cycle; // L: 10111
				if (!var10.isIf3 || !Frames.isComponentHidden(var10)) { // L: 10112
					if (var10.contentType > 0) { // L: 10113
						WorldMapData_1.method4874(var10);
					}

					int var12 = var10.x + var6; // L: 10114
					int var13 = var7 + var10.y; // L: 10115
					int var14 = var10.transparencyTop; // L: 10116
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10117
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10118
							class12.field62 = var0; // L: 10119
							UserComparator5.field1389 = var6; // L: 10120
							SecureRandomFuture.field960 = var7; // L: 10121
							continue; // L: 10122
						}

						if (Client.isDraggingWidget && Client.field767) { // L: 10124
							var15 = MouseHandler.MouseHandler_x; // L: 10125
							var16 = MouseHandler.MouseHandler_y; // L: 10126
							var15 -= Client.widgetClickX; // L: 10127
							var16 -= Client.widgetClickY; // L: 10128
							if (var15 < Client.field664) { // L: 10129
								var15 = Client.field664;
							}

							if (var15 + var10.width > Client.field664 + Client.clickedWidgetParent.width) { // L: 10130
								var15 = Client.field664 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field550) { // L: 10131
								var16 = Client.field550;
							}

							if (var16 + var10.height > Client.field550 + Client.clickedWidgetParent.height) { // L: 10132
								var16 = Client.field550 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10133
							var13 = var16; // L: 10134
						}

						if (!var10.isScrollBar) { // L: 10136
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 10142
						var15 = var2; // L: 10143
						var16 = var3; // L: 10144
						var17 = var4; // L: 10145
						var18 = var5; // L: 10146
					} else if (var10.type == 9) { // L: 10148
						var19 = var12; // L: 10149
						var20 = var13; // L: 10150
						var21 = var12 + var10.width; // L: 10151
						var22 = var13 + var10.height; // L: 10152
						if (var21 < var12) { // L: 10153
							var19 = var21; // L: 10155
							var21 = var12; // L: 10156
						}

						if (var22 < var13) { // L: 10158
							var20 = var22; // L: 10160
							var22 = var13; // L: 10161
						}

						++var21; // L: 10163
						++var22; // L: 10164
						var15 = var19 > var2 ? var19 : var2; // L: 10165
						var16 = var20 > var3 ? var20 : var3; // L: 10166
						var17 = var21 < var4 ? var21 : var4; // L: 10167
						var18 = var22 < var5 ? var22 : var5; // L: 10168
					} else {
						var19 = var12 + var10.width; // L: 10171
						var20 = var13 + var10.height; // L: 10172
						var15 = var12 > var2 ? var12 : var2; // L: 10173
						var16 = var13 > var3 ? var13 : var3; // L: 10174
						var17 = var19 < var4 ? var19 : var4; // L: 10175
						var18 = var20 < var5 ? var20 : var5; // L: 10176
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10178
						if (var10.contentType != 0) { // L: 10179
							if (var10.contentType == 1336) { // L: 10180
								if (class19.clientPreferences.method2252()) { // L: 10181
									var13 += 15; // L: 10182
									DevicePcmPlayerProvider.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10183
									var13 += 15; // L: 10184
									Runtime var42 = Runtime.getRuntime(); // L: 10185
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 10186
									var21 = 16776960; // L: 10187
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10188
										var21 = 16711680;
									}

									DevicePcmPlayerProvider.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10189
									var13 += 15; // L: 10190
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10194
								Client.viewportX = var12; // L: 10195
								Client.viewportY = var13; // L: 10196
								ServerPacket.drawEntities(var12, var13, var10.width, var10.height); // L: 10197
								Client.field703[var10.rootIndex] = true; // L: 10198
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10199
								continue; // L: 10200
							}

							if (var10.contentType == 1338) { // L: 10202
								class120.drawMinimap(var10, var12, var13, var11); // L: 10203
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10204
								continue; // L: 10205
							}

							if (var10.contentType == 1339) { // L: 10207
								NPC.drawCompass(var10, var12, var13, var11); // L: 10208
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10209
								continue; // L: 10210
							}

							if (var10.contentType == 1400) { // L: 10212
								class121.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10213
							}

							if (var10.contentType == 1401) { // L: 10215
								class121.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10216
							}

							if (var10.contentType == 1402) { // L: 10218
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10219
							}
						}

						if (var10.type == 0) { // L: 10222
							if (!var10.isIf3 && Frames.isComponentHidden(var10) && var10 != Language.mousedOverWidgetIf1) { // L: 10223
								continue;
							}

							if (!var10.isIf3) { // L: 10224
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10225
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10226
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10228
							if (var10.children != null) { // L: 10229
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10230
							if (var30 != null) { // L: 10231
								class193.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 10232
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10234
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10235
						} else if (var10.type == 11) { // L: 10237
							if (Frames.isComponentHidden(var10) && var10 != Language.mousedOverWidgetIf1) { // L: 10238
								continue;
							}

							if (var10.children != null) { // L: 10239
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10240
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10241
						}

						if (Client.isResizable || Client.field751[var11] || Client.gameDrawingMode > 1) { // L: 10243
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10244 10245
								class201.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10247
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 10250
									var19 = 0; // L: 10251

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 10252
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 10253
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 10254
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 10255
											if (var19 < 20) { // L: 10256
												var22 += var10.inventoryXOffsets[var19]; // L: 10257
												var23 += var10.inventoryYOffsets[var19]; // L: 10258
											}

											if (var10.itemIds[var19] <= 0) { // L: 10260
												if (var10.inventorySprites != null && var19 < 20) { // L: 10305
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 10306
													if (var46 != null) { // L: 10307
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3366) { // L: 10308
														ChatChannel.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 10261
												boolean var38 = false; // L: 10262
												var26 = var10.itemIds[var19] - 1; // L: 10263
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == Interpreter.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10264
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == EnumComposition.selectedItemSlot && var10.id == ModeWhere.selectedItemWidget) { // L: 10266
														var35 = class346.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = class346.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 10267
													}

													if (var35 != null) { // L: 10268
														if (var10 == Interpreter.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 10269
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 10270
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 10271
															if (var24 < 5 && var24 > -5) { // L: 10272
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 10273
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 10274
																var24 = 0; // L: 10275
																var25 = 0; // L: 10276
															}

															var35.drawTransAt(var22 + var24, var25 + var23, 128); // L: 10278
															if (var1 != -1) { // L: 10279
																Widget var28 = var0[var1 & 65535]; // L: 10280
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 10281
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field555 / 3; // L: 10282
																	if (var29 > Client.field555 * 10) { // L: 10283
																		var29 = Client.field555 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 10284
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 10285
																	Client.draggedWidgetY += var29; // L: 10286
																	ChatChannel.invalidateWidget(var28); // L: 10287
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 10289
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field555 / 3; // L: 10290
																	if (var29 > Client.field555 * 10) { // L: 10291
																		var29 = Client.field555 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 10292
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 10293
																	Client.draggedWidgetY -= var29; // L: 10294
																	ChatChannel.invalidateWidget(var28); // L: 10295
																}
															}
														} else if (var10 == class1.field4 && var19 == Client.field600) { // L: 10299
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 10300
														}
													} else {
														ChatChannel.invalidateWidget(var10); // L: 10302
													}
												}
											}

											++var19; // L: 10310
										}
									}
								} else if (var10.type == 3) { // L: 10315
									if (ObjectSound.runCs1(var10)) { // L: 10317
										var19 = var10.color2; // L: 10318
										if (var10 == Language.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10319
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10322
										if (var10 == Language.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10323
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10325
										switch(var10.fillMode.field4781) { // L: 10326
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10331
											break; // L: 10332
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10328
											break; // L: 10329
										default:
											if (var14 == 0) { // L: 10334
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10335
											}
										}
									} else if (var14 == 0) { // L: 10340
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10341
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 10345
										var39 = var10.getFont(); // L: 10346
										if (var39 == null) { // L: 10347
											if (Widget.field3366) { // L: 10348
												ChatChannel.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 10352
											if (ObjectSound.runCs1(var10)) { // L: 10353
												var20 = var10.color2; // L: 10354
												if (var10 == Language.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10355
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10356
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10359
												if (var10 == Language.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10360
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10362
												ItemComposition var45 = EnumComposition.ItemDefinition_get(var10.itemId); // L: 10363
												var44 = var45.name; // L: 10364
												if (var44 == null) { // L: 10365
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10366
													var44 = class122.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + WorldMapSprite.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10368
												var44 = "Please wait..."; // L: 10369
												var20 = var10.color; // L: 10370
											}

											if (!var10.isIf3) { // L: 10372
												var44 = class10.method74(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10373
										}
									} else if (var10.type == 5) { // L: 10376
										SpritePixels var40;
										if (!var10.isIf3) { // L: 10377
											var40 = var10.getSprite(ObjectSound.runCs1(var10), class138.urlRequester); // L: 10378
											if (var40 != null) { // L: 10379
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3366) { // L: 10380
												ChatChannel.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10384
												var40 = class346.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, class138.urlRequester); // L: 10385
											}

											if (var40 == null) { // L: 10386
												if (Widget.field3366) { // L: 10410
													ChatChannel.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 10387
												var21 = var40.height; // L: 10388
												if (!var10.spriteTiling) { // L: 10389
													var22 = var10.width * 4096 / var20; // L: 10403
													if (var10.spriteAngle != 0) { // L: 10404
														var40.method8180(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10405
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10406
														var40.drawTransBgAt(var12, var13); // L: 10407
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10390
													var22 = (var20 - 1 + var10.width) / var20; // L: 10391
													var23 = (var21 - 1 + var10.height) / var21; // L: 10392

													for (var24 = 0; var24 < var22; ++var24) { // L: 10393
														for (var25 = 0; var25 < var23; ++var25) { // L: 10394
															if (var10.spriteAngle != 0) { // L: 10395
																var40.method8180(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10396
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 10397
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10400
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10414
											boolean var36 = ObjectSound.runCs1(var10); // L: 10415
											if (var36) { // L: 10417
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10418
											}

											Model var41 = null; // L: 10419
											var22 = 0; // L: 10420
											if (var10.itemId != -1) { // L: 10421
												var33 = EnumComposition.ItemDefinition_get(var10.itemId); // L: 10422
												if (var33 != null) { // L: 10423
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10424
													var41 = var33.getModel(1); // L: 10425
													if (var41 != null) { // L: 10426
														var41.calculateBoundsCylinder(); // L: 10427
														var22 = var41.height / 2; // L: 10428
													} else {
														ChatChannel.invalidateWidget(var10); // L: 10430
													}
												}
											} else if (var10.modelType == 5) { // L: 10433
												if (var10.modelId == 0) { // L: 10434
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class101.localPlayer.getModel(); // L: 10435
												}
											} else if (var20 == -1) { // L: 10437
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class101.localPlayer.appearance); // L: 10438
												if (var41 == null && Widget.field3366) { // L: 10439
													ChatChannel.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = ScriptFrame.SequenceDefinition_get(var20); // L: 10442
												var41 = var10.getModel(var47, var10.modelFrame, var36, class101.localPlayer.appearance); // L: 10443
												if (var41 == null && Widget.field3366) { // L: 10444
													ChatChannel.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4021(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10446
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10447
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10448
											if (var41 != null) { // L: 10449
												if (!var10.isIf3) { // L: 10450
													var41.method4442(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10452
													if (var10.modelOrthog) { // L: 10453
														var41.method4462(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4442(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10454
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10457
										} else {
											if (var10.type == 7) { // L: 10460
												var39 = var10.getFont(); // L: 10461
												if (var39 == null) { // L: 10462
													if (Widget.field3366) { // L: 10463
														ChatChannel.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10466

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10467
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10468
														if (var10.itemIds[var20] > 0) { // L: 10469
															var33 = EnumComposition.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 10470
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10472
																var34 = class122.colorStartTag(16748608) + var33.name + "</col>"; // L: 10473
															} else {
																var34 = class122.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + WorldMapSprite.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 10474
															var26 = var13 + (var10.paddingY + 12) * var21; // L: 10475
															if (var10.textXAlignment == 0) { // L: 10476
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10477
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10478
															}
														}

														++var20; // L: 10480
													}
												}
											}

											if (var10.type == 8 && var10 == SoundSystem.field313 && Client.field646 == Client.field638) { // L: 10484 10485
												var19 = 0; // L: 10486
												var20 = 0; // L: 10487
												Font var31 = DevicePcmPlayerProvider.fontPlain12; // L: 10488
												String var32 = var10.text; // L: 10489

												String var43;
												for (var32 = class10.method74(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10491 10492 10504
													var24 = var32.indexOf("<br>"); // L: 10493
													if (var24 != -1) { // L: 10494
														var43 = var32.substring(0, var24); // L: 10495
														var32 = var32.substring(var24 + 4); // L: 10496
													} else {
														var43 = var32; // L: 10499
														var32 = ""; // L: 10500
													}

													var25 = var31.stringWidth(var43); // L: 10502
													if (var25 > var19) { // L: 10503
														var19 = var25;
													}
												}

												var19 += 6; // L: 10506
												var20 += 7; // L: 10507
												var24 = var12 + var10.width - 5 - var19; // L: 10508
												var25 = var13 + var10.height + 5; // L: 10509
												if (var24 < var12 + 5) { // L: 10510
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10511
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10512
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10513
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10514
												var32 = var10.text; // L: 10515
												var26 = var25 + var31.ascent + 2; // L: 10516

												for (var32 = class10.method74(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10517 10518 10529
													int var27 = var32.indexOf("<br>"); // L: 10519
													if (var27 != -1) { // L: 10520
														var43 = var32.substring(0, var27); // L: 10521
														var32 = var32.substring(var27 + 4); // L: 10522
													} else {
														var43 = var32; // L: 10525
														var32 = ""; // L: 10526
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10528
												}
											}

											if (var10.type == 9) { // L: 10533
												if (var10.field3402) { // L: 10538
													var19 = var12; // L: 10539
													var20 = var13 + var10.height; // L: 10540
													var21 = var12 + var10.width; // L: 10541
													var22 = var13; // L: 10542
												} else {
													var19 = var12; // L: 10545
													var20 = var13; // L: 10546
													var21 = var12 + var10.width; // L: 10547
													var22 = var13 + var10.height; // L: 10548
												}

												if (var10.lineWid == 1) { // L: 10550
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10551
												} else {
													JagexCache.method3262(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10554
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

	} // L: 10559

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)Ljava/lang/String;",
		garbageValue = "-1990972086"
	)
	static String method157(Widget var0, int var1) {
		int var3 = class124.getWidgetFlags(var0); // L: 12310
		boolean var2 = (var3 >> var1 + 1 & 1) != 0; // L: 12312
		if (!var2 && var0.onOp == null) { // L: 12314
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 12315 12316 12318
		}
	}
}
