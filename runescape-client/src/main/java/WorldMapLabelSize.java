import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 20552781
	)
	final int field2655;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1586043627
	)
	final int field2659;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1941962617
	)
	final int field2660;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2655 = var1; // L: 15
		this.field2659 = var2; // L: 16
		this.field2660 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1896293500"
	)
	boolean method4532(float var1) {
		return var1 >= (float)this.field2660; // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "316575905"
	)
	static WorldMapLabelSize method4536(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field2659) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpy;II)V",
		garbageValue = "-2009640546"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 199
		if (var2) { // L: 200
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 201
		Player var4 = Client.players[var1]; // L: 202
		if (var3 == 0) { // L: 203
			if (var2) { // L: 204
				var4.field1109 = false; // L: 205
			} else if (Client.localPlayerIndex == var1) { // L: 208
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class250.baseY + var4.pathY[0] >> 13) + (ApproximateRouteStrategy.baseX + var4.pathX[0] >> 13 << 14); // L: 209
				if (var4.field1160 != -1) { // L: 210
					Players.Players_orientations[var1] = var4.field1160;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 211
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 212
				Client.players[var1] = null; // L: 213
				if (var0.readBits(1) != 0) { // L: 214
					class9.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 217
				var5 = var0.readBits(3); // L: 218
				var6 = var4.pathX[0]; // L: 219
				var7 = var4.pathY[0]; // L: 220
				if (var5 == 0) { // L: 221
					--var6; // L: 222
					--var7; // L: 223
				} else if (var5 == 1) { // L: 225
					--var7;
				} else if (var5 == 2) { // L: 226
					++var6; // L: 227
					--var7; // L: 228
				} else if (var5 == 3) { // L: 230
					--var6;
				} else if (var5 == 4) { // L: 231
					++var6;
				} else if (var5 == 5) { // L: 232
					--var6; // L: 233
					++var7; // L: 234
				} else if (var5 == 6) { // L: 236
					++var7;
				} else if (var5 == 7) { // L: 237
					++var6; // L: 238
					++var7; // L: 239
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 241
					var4.resetPath(var6, var7); // L: 242
					var4.field1109 = false; // L: 243
				} else if (var2) { // L: 245
					var4.field1109 = true; // L: 246
					var4.tileX = var6; // L: 247
					var4.tileY = var7; // L: 248
				} else {
					var4.field1109 = false; // L: 251
					var4.method2144(var6, var7, Players.field1285[var1]); // L: 252
				}

			} else if (var3 == 2) { // L: 256
				var5 = var0.readBits(4); // L: 257
				var6 = var4.pathX[0]; // L: 258
				var7 = var4.pathY[0]; // L: 259
				if (var5 == 0) { // L: 260
					var6 -= 2; // L: 261
					var7 -= 2; // L: 262
				} else if (var5 == 1) { // L: 264
					--var6; // L: 265
					var7 -= 2; // L: 266
				} else if (var5 == 2) { // L: 268
					var7 -= 2;
				} else if (var5 == 3) { // L: 269
					++var6; // L: 270
					var7 -= 2; // L: 271
				} else if (var5 == 4) { // L: 273
					var6 += 2; // L: 274
					var7 -= 2; // L: 275
				} else if (var5 == 5) { // L: 277
					var6 -= 2; // L: 278
					--var7; // L: 279
				} else if (var5 == 6) { // L: 281
					var6 += 2; // L: 282
					--var7; // L: 283
				} else if (var5 == 7) { // L: 285
					var6 -= 2;
				} else if (var5 == 8) { // L: 286
					var6 += 2;
				} else if (var5 == 9) { // L: 287
					var6 -= 2; // L: 288
					++var7; // L: 289
				} else if (var5 == 10) { // L: 291
					var6 += 2; // L: 292
					++var7; // L: 293
				} else if (var5 == 11) { // L: 295
					var6 -= 2; // L: 296
					var7 += 2; // L: 297
				} else if (var5 == 12) { // L: 299
					--var6; // L: 300
					var7 += 2; // L: 301
				} else if (var5 == 13) { // L: 303
					var7 += 2;
				} else if (var5 == 14) { // L: 304
					++var6; // L: 305
					var7 += 2; // L: 306
				} else if (var5 == 15) { // L: 308
					var6 += 2; // L: 309
					var7 += 2; // L: 310
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 312
					var4.resetPath(var6, var7); // L: 313
					var4.field1109 = false; // L: 314
				} else if (var2) { // L: 316
					var4.field1109 = true; // L: 317
					var4.tileX = var6; // L: 318
					var4.tileY = var7; // L: 319
				} else {
					var4.field1109 = false; // L: 322
					var4.method2144(var6, var7, Players.field1285[var1]); // L: 323
				}

			} else {
				var5 = var0.readBits(1); // L: 327
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 328
					var6 = var0.readBits(12); // L: 329
					var7 = var6 >> 10; // L: 330
					var8 = var6 >> 5 & 31; // L: 331
					if (var8 > 15) { // L: 332
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 333
					if (var9 > 15) { // L: 334
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 335
					var11 = var9 + var4.pathY[0]; // L: 336
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 337
						var4.resetPath(var10, var11); // L: 338
						var4.field1109 = false; // L: 339
					} else if (var2) { // L: 341
						var4.field1109 = true; // L: 342
						var4.tileX = var10; // L: 343
						var4.tileY = var11; // L: 344
					} else {
						var4.field1109 = false; // L: 347
						var4.method2144(var10, var11, Players.field1285[var1]); // L: 348
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 350
					if (Client.localPlayerIndex == var1) { // L: 351
						class160.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 354
					var7 = var6 >> 28; // L: 355
					var8 = var6 >> 14 & 16383; // L: 356
					var9 = var6 & 16383; // L: 357
					var10 = (var8 + ApproximateRouteStrategy.baseX + var4.pathX[0] & 16383) - ApproximateRouteStrategy.baseX; // L: 358
					var11 = (var9 + class250.baseY + var4.pathY[0] & 16383) - class250.baseY; // L: 359
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 360
						var4.resetPath(var10, var11); // L: 361
						var4.field1109 = false; // L: 362
					} else if (var2) { // L: 364
						var4.field1109 = true; // L: 365
						var4.tileX = var10; // L: 366
						var4.tileY = var11; // L: 367
					} else {
						var4.field1109 = false; // L: 370
						var4.method2144(var10, var11, Players.field1285[var1]); // L: 371
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 373
					if (Client.localPlayerIndex == var1) { // L: 374
						class160.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 206 215 254 325 352 375

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lco;IB)V",
		garbageValue = "-2"
	)
	static final void method4533(Actor var0, int var1) {
		class10.worldToScreen(var0.x, var0.y, var1); // L: 4976
	} // L: 4977

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIB)V",
		garbageValue = "-77"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10397
			SecureRandomFuture.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10398
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10401
			var3 = InvDefinition.Widget_getSpellActionName(var0); // L: 10402
			if (var3 != null) { // L: 10403
				SecureRandomFuture.insertMenuItemNoShift(var3, ChatChannel.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10404
			}
		}

		if (var0.buttonType == 3) { // L: 10408
			SecureRandomFuture.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10409
		}

		if (var0.buttonType == 4) { // L: 10412
			SecureRandomFuture.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10413
		}

		if (var0.buttonType == 5) { // L: 10416
			SecureRandomFuture.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10417
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10420
			SecureRandomFuture.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10421
		}

		int var4;
		int var13;
		if (var0.type == 2) { // L: 10424
			var13 = 0; // L: 10425

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10426
				for (int var15 = 0; var15 < var0.width; ++var15) { // L: 10427
					int var16 = (var0.paddingX + 32) * var15; // L: 10428
					int var7 = (var0.paddingY + 32) * var4; // L: 10429
					if (var13 < 20) { // L: 10430
						var16 += var0.inventoryXOffsets[var13]; // L: 10431
						var7 += var0.inventoryYOffsets[var13]; // L: 10432
					}

					if (var1 >= var16 && var2 >= var7 && var1 < var16 + 32 && var2 < var7 + 32) { // L: 10434
						Client.dragItemSlotDestination = var13; // L: 10435
						GrandExchangeEvent.hoveredItemContainer = var0; // L: 10436
						if (var0.itemIds[var13] > 0) { // L: 10437
							ItemComposition var8 = class67.ItemDefinition_get(var0.itemIds[var13] - 1); // L: 10438
							if (Client.isItemSelected == 1 && FriendSystem.method1658(WorldMapSection2.getWidgetFlags(var0))) { // L: 10439
								if (var0.id != PendingSpawn.selectedItemWidget || var13 != class19.selectedItemSlot) { // L: 10440
									SecureRandomFuture.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ChatChannel.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id); // L: 10441
								}
							} else if (Client.isSpellSelected && FriendSystem.method1658(WorldMapSection2.getWidgetFlags(var0))) { // L: 10445
								if ((class154.selectedSpellFlags & 16) == 16) { // L: 10446
									SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ChatChannel.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id); // L: 10447
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10452
								int var10 = -1; // L: 10453
								if (Client.shiftClickDrop) { // L: 10454
									boolean var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10457
									if (var11) { // L: 10459
										var10 = var8.getShiftClickIndex(); // L: 10460
									}
								}

								int var17;
								if (FriendSystem.method1658(WorldMapSection2.getWidgetFlags(var0))) { // L: 10463
									for (var17 = 4; var17 >= 3; --var17) { // L: 10464
										if (var10 != var17) { // L: 10465
											DirectByteArrayCopier.addWidgetItemMenuItem(var0, var8, var13, var17, false); // L: 10466
										}
									}
								}

								if (VarbitComposition.method3561(WorldMapSection2.getWidgetFlags(var0))) { // L: 10469
									SecureRandomFuture.insertMenuItemNoShift("Use", ChatChannel.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id); // L: 10470
								}

								if (FriendSystem.method1658(WorldMapSection2.getWidgetFlags(var0))) { // L: 10473
									for (var17 = 2; var17 >= 0; --var17) { // L: 10474
										if (var10 != var17) { // L: 10475
											DirectByteArrayCopier.addWidgetItemMenuItem(var0, var8, var13, var17, false); // L: 10476
										}
									}

									if (var10 >= 0) { // L: 10478
										DirectByteArrayCopier.addWidgetItemMenuItem(var0, var8, var13, var10, true); // L: 10479
									}
								}

								var9 = var0.itemActions; // L: 10482
								if (var9 != null) { // L: 10483
									for (var17 = 4; var17 >= 0; --var17) { // L: 10484
										if (var9[var17] != null) { // L: 10485
											byte var12 = 0; // L: 10486
											if (var17 == 0) { // L: 10487
												var12 = 39;
											}

											if (var17 == 1) { // L: 10488
												var12 = 40;
											}

											if (var17 == 2) { // L: 10489
												var12 = 41;
											}

											if (var17 == 3) { // L: 10490
												var12 = 42;
											}

											if (var17 == 4) { // L: 10491
												var12 = 43;
											}

											SecureRandomFuture.insertMenuItemNoShift(var9[var17], ChatChannel.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id); // L: 10492
										}
									}
								}

								SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id); // L: 10497
							}
						}
					}

					++var13; // L: 10502
				}
			}
		}

		if (var0.isIf3) { // L: 10506
			if (Client.isSpellSelected) { // L: 10507
				var4 = WorldMapSection2.getWidgetFlags(var0); // L: 10509
				boolean var18 = (var4 >> 21 & 1) != 0; // L: 10511
				if (var18 && (class154.selectedSpellFlags & 32) == 32) { // L: 10513
					SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10514
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) { // L: 10519
					String var14;
					if (!class142.method3004(WorldMapSection2.getWidgetFlags(var0), var13) && var0.onOp == null) { // L: 10522
						var14 = null; // L: 10523
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) { // L: 10526
						var14 = var0.actions[var13]; // L: 10530
					} else {
						var14 = null; // L: 10527
					}

					if (var14 != null) { // L: 10533
						SecureRandomFuture.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id); // L: 10534
					}
				}

				var3 = InvDefinition.Widget_getSpellActionName(var0); // L: 10538
				if (var3 != null) { // L: 10539
					SecureRandomFuture.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10540
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10543
					String var5;
					if (!class142.method3004(WorldMapSection2.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 10546
						var5 = null; // L: 10547
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10550
						var5 = var0.actions[var4]; // L: 10554
					} else {
						var5 = null; // L: 10551
					}

					if (var5 != null) { // L: 10557
						DynamicObject.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10558
					}
				}

				if (class431.method7673(WorldMapSection2.getWidgetFlags(var0))) { // L: 10562
					SecureRandomFuture.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10563
				}
			}
		}

	} // L: 10568

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIII)V",
		garbageValue = "-809248194"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		MouseHandler.playPcmPlayers(); // L: 11557
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11558
		if (var4 != null) { // L: 11559
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11560
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11561
				int var5 = Client.camAngleY & 2047; // L: 11562
				int var6 = class19.localPlayer.x / 32 + 48; // L: 11563
				int var7 = 464 - class19.localPlayer.y / 32; // L: 11564
				MusicPatchNode2.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11565

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11566
					var16 = Client.mapIconXs[var8] * 4 + 2 - class19.localPlayer.x / 32; // L: 11567
					var10 = Client.mapIconYs[var8] * 4 + 2 - class19.localPlayer.y / 32; // L: 11568
					Messages.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11569
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11571
					for (var16 = 0; var16 < 104; ++var16) { // L: 11572
						NodeDeque var14 = Client.groundItems[class160.Client_plane][var8][var16]; // L: 11573
						if (var14 != null) { // L: 11574
							var11 = var8 * 4 + 2 - class19.localPlayer.x / 32; // L: 11575
							var12 = var16 * 4 + 2 - class19.localPlayer.y / 32; // L: 11576
							Messages.drawSpriteOnMinimap(var1, var2, var11, var12, class142.mapDotSprites[0], var4); // L: 11577
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11581
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11582
					if (var9 != null && var9.isVisible()) { // L: 11583
						NPCComposition var18 = var9.definition; // L: 11584
						if (var18 != null && var18.transforms != null) { // L: 11585
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11586
							var11 = var9.x / 32 - class19.localPlayer.x / 32; // L: 11587
							var12 = var9.y / 32 - class19.localPlayer.y / 32; // L: 11588
							Messages.drawSpriteOnMinimap(var1, var2, var11, var12, class142.mapDotSprites[1], var4); // L: 11589
						}
					}
				}

				var8 = Players.Players_count; // L: 11593
				int[] var17 = Players.Players_indices; // L: 11594

				for (var10 = 0; var10 < var8; ++var10) { // L: 11595
					Player var15 = Client.players[var17[var10]]; // L: 11596
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class19.localPlayer) { // L: 11597
						var12 = var15.x / 32 - class19.localPlayer.x / 32; // L: 11598
						int var13 = var15.y / 32 - class19.localPlayer.y / 32; // L: 11599
						if (var15.isFriend()) { // L: 11600
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[3], var4);
						} else if (class19.localPlayer.team != 0 && var15.team != 0 && var15.team == class19.localPlayer.team) { // L: 11601
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 11602
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 11603
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[6], var4);
						} else {
							Messages.drawSpriteOnMinimap(var1, var2, var12, var13, class142.mapDotSprites[2], var4); // L: 11604
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11607
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11608
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11609
						if (var19 != null) { // L: 11610
							var11 = var19.x / 32 - class19.localPlayer.x / 32; // L: 11611
							var12 = var19.y / 32 - class19.localPlayer.y / 32; // L: 11612
							NetFileRequest.worldToMinimap(var1, var2, var11, var12, class17.mapMarkerSprites[1], var4); // L: 11613
						}
					}

					if (Client.hintArrowType == 2) { // L: 11616
						var10 = Client.hintArrowX * 4 - ApproximateRouteStrategy.baseX * 4 + 2 - class19.localPlayer.x / 32; // L: 11617
						var11 = Client.hintArrowY * 4 - class250.baseY * 4 + 2 - class19.localPlayer.y / 32; // L: 11618
						NetFileRequest.worldToMinimap(var1, var2, var10, var11, class17.mapMarkerSprites[1], var4); // L: 11619
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11621
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11622
						if (var20 != null) { // L: 11623
							var11 = var20.x / 32 - class19.localPlayer.x / 32; // L: 11624
							var12 = var20.y / 32 - class19.localPlayer.y / 32; // L: 11625
							NetFileRequest.worldToMinimap(var1, var2, var11, var12, class17.mapMarkerSprites[1], var4); // L: 11626
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11630
					var10 = Client.destinationX * 4 + 2 - class19.localPlayer.x / 32; // L: 11631
					var11 = Client.destinationY * 4 + 2 - class19.localPlayer.y / 32; // L: 11632
					Messages.drawSpriteOnMinimap(var1, var2, var10, var11, class17.mapMarkerSprites[0], var4); // L: 11633
				}

				if (!class19.localPlayer.isHidden) { // L: 11635
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11637
			}

			Client.field651[var3] = true; // L: 11638
		}
	} // L: 11639
}
