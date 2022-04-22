import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -18460315
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("hx")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2056271889
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "856991189"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 29
			if (var2 == 0) { // L: 30
				return; // L: 33
			}

			this.decodeNext(var1, var2); // L: 31
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "2104717847"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "([Lky;IIIIIIII)V",
		garbageValue = "2009471440"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11189
			Widget var9 = var0[var8]; // L: 11190
			if (var9 != null && var9.parentId == var1 && (var9.method5617() || class326.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11191 11192 11193
				if (var9.isIf3) { // L: 11194
					if (class1.isComponentHidden(var9)) { // L: 11195
						continue;
					}
				} else if (var9.type == 0 && var9 != DevicePcmPlayerProvider.mousedOverWidgetIf1 && class1.isComponentHidden(var9)) { // L: 11198
					continue;
				}

				if (var9.type == 11 && var9.method5629(VerticalAlignment.urlRequester)) { // L: 11200 11201
					class346.invalidateWidget(var9); // L: 11202
					AbstractByteArrayCopier.revalidateWidgetScroll(var9.children, var9, true); // L: 11203
					if (var9.field3462 != null) { // L: 11204
						ScriptEvent var10 = new ScriptEvent(); // L: 11205
						var10.widget = var9; // L: 11206
						var10.args = var9.field3462; // L: 11207
						Client.scriptEvents.addFirst(var10); // L: 11208
					}
				}

				int var26 = var9.x + var6; // L: 11212
				int var11 = var7 + var9.y; // L: 11213
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 11218
					var12 = var2; // L: 11219
					var13 = var3; // L: 11220
					var14 = var4; // L: 11221
					var15 = var5; // L: 11222
				} else {
					int var16;
					if (var9.type == 9) { // L: 11224
						var16 = var26; // L: 11225
						var17 = var11; // L: 11226
						var18 = var26 + var9.width; // L: 11227
						int var19 = var11 + var9.height; // L: 11228
						if (var18 < var26) { // L: 11229
							var16 = var18; // L: 11231
							var18 = var26; // L: 11232
						}

						if (var19 < var11) { // L: 11234
							var17 = var19; // L: 11236
							var19 = var11; // L: 11237
						}

						++var18; // L: 11239
						++var19; // L: 11240
						var12 = var16 > var2 ? var16 : var2; // L: 11241
						var13 = var17 > var3 ? var17 : var3; // L: 11242
						var14 = var18 < var4 ? var18 : var4; // L: 11243
						var15 = var19 < var5 ? var19 : var5; // L: 11244
					} else {
						var16 = var26 + var9.width; // L: 11247
						var17 = var11 + var9.height; // L: 11248
						var12 = var26 > var2 ? var26 : var2; // L: 11249
						var13 = var11 > var3 ? var11 : var3; // L: 11250
						var14 = var16 < var4 ? var16 : var4; // L: 11251
						var15 = var17 < var5 ? var17 : var5; // L: 11252
					}
				}

				if (var9 == Client.clickedWidget) { // L: 11254
					Client.field687 = true; // L: 11255
					Client.field688 = var26; // L: 11256
					Client.field757 = var11; // L: 11257
				}

				boolean var34 = false; // L: 11259
				if (var9.field3414) { // L: 11260
					switch(Client.field668) { // L: 11261
					case 0:
						var34 = true; // L: 11268
					case 1:
					default:
						break;
					case 2:
						if (Client.field628 == var9.id >>> 16) { // L: 11271
							var34 = true; // L: 11272
						}
						break;
					case 3:
						if (var9.id == Client.field628) { // L: 11263
							var34 = true; // L: 11264
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11277
					if (var9.isIf3) { // L: 11278
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11279
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11280
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11281
									if (var27.isMouseInputEvent) { // L: 11282
										var27.remove(); // L: 11283
										var27.widget.containsMouse = false; // L: 11284
									}
								}

								if (class124.widgetDragDuration == 0) { // L: 11287
									Client.clickedWidget = null; // L: 11288
									Client.clickedWidgetParent = null; // L: 11289
								}

								if (!Client.isMenuOpen) { // L: 11291
									ByteArrayPool.addCancelMenuEntry(); // L: 11292
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11296 11297
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11298
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 11299
									var27.remove(); // L: 11300
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11306
					var18 = MouseHandler.MouseHandler_y; // L: 11307
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11308
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11309
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11310
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11312
					if (var9.contentType == 1337) { // L: 11313
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 11314
							ClanMate.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11317
						class14.checkIfMinimapClicked(var9, var26, var11); // L: 11318
					} else {
						if (var9.contentType == 1400) { // L: 11321
							ScriptFrame.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11322
						}

						if (!Client.isMenuOpen && var35) { // L: 11324
							if (var9.contentType == 1400) { // L: 11325
								ScriptFrame.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11326
							} else {
								class138.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 11329
							}
						}

						boolean var21;
						int var29;
						if (var34) { // L: 11332
							for (int var20 = 0; var20 < var9.field3415.length; ++var20) { // L: 11333
								var21 = false; // L: 11334
								boolean var28 = false; // L: 11335
								if (!var21 && var9.field3415[var20] != null) { // L: 11336
									for (var29 = 0; var29 < var9.field3415[var20].length; ++var29) { // L: 11337
										boolean var24 = false; // L: 11338
										if (var9.field3484 != null) { // L: 11339
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3415[var20][var29]]; // L: 11340
										}

										if (ArchiveLoader.method2062(var9.field3415[var20][var29]) || var24) { // L: 11342
											var21 = true; // L: 11343
											if (var9.field3484 != null && var9.field3484[var20] > Client.cycle) { // L: 11344
												break;
											}

											byte var33 = var9.field3485[var20][var29]; // L: 11345
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 11346 11347 11348 11349 11350
												var28 = true; // L: 11352
												break;
											}
										}
									}
								}

								if (var28) { // L: 11358
									if (var20 < 10) { // L: 11359
										WorldMapLabelSize.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11360
										FriendSystem.Widget_runOnTargetLeave(); // L: 11361
										Renderable.selectSpell(var9.id, var9.childIndex, WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var9)), var9.itemId); // L: 11362
										Client.selectedSpellActionName = class152.Widget_getSpellActionName(var9); // L: 11363
										if (Client.selectedSpellActionName == null) { // L: 11364
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + UserComparator9.colorStartTag(16777215); // L: 11365
									}

									var29 = var9.field3417[var20]; // L: 11367
									if (var9.field3484 == null) { // L: 11368
										var9.field3484 = new int[var9.field3415.length];
									}

									if (var9.field3418 == null) { // L: 11369
										var9.field3418 = new int[var9.field3415.length];
									}

									if (var29 != 0) { // L: 11370
										if (var9.field3484[var20] == 0) { // L: 11371
											var9.field3484[var20] = var29 + Client.cycle + var9.field3418[var20];
										} else {
											var9.field3484[var20] = var29 + Client.cycle; // L: 11372
										}
									} else {
										var9.field3484[var20] = Integer.MAX_VALUE; // L: 11374
									}
								}

								if (!var21 && var9.field3484 != null) { // L: 11376 11377
									var9.field3484[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11381
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11382
								var35 = true;
							} else {
								var35 = false; // L: 11383
							}

							boolean var36 = false; // L: 11384
							if ((MouseHandler.MouseHandler_currentButton == 1 || !GameBuild.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11385
								var36 = true;
							}

							var21 = false; // L: 11386
							if ((MouseHandler.MouseHandler_lastButton == 1 || !GameBuild.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11387
								var21 = true;
							}

							int[] var22;
							if (var21) { // L: 11388
								ParamComposition.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11389
								if (var9.type == 11 && var9.method5721(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY)) { // L: 11390
									switch(var9.method5625()) { // L: 11391
									case 0:
										class391.openURL(var9.method5627(), true, false); // L: 11393
										break;
									case 1:
										if (ParamComposition.method3596(class326.getWidgetFlags(var9))) { // L: 11396
											var22 = var9.method5628(); // L: 11397
											if (var22 != null) { // L: 11398
												PacketBufferNode var23 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher); // L: 11399
												var23.packetBuffer.writeIntME(var22[0]); // L: 11400
												var23.packetBuffer.method7710(var9.childIndex); // L: 11401
												var23.packetBuffer.method7721(var22[1]); // L: 11402
												var23.packetBuffer.method7723(var9.method5647()); // L: 11403
												var23.packetBuffer.method7721(var22[2]); // L: 11404
												var23.packetBuffer.writeInt(var9.id); // L: 11405
												Client.packetWriter.addNode(var23); // L: 11406
											}
										}
									}
								}
							}

							if (var9.contentType == 1400) { // L: 11413
								ScriptFrame.worldMap.method7217(var17, var18, var35 & var36, var35 & var21); // L: 11414
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && DirectByteArrayCopier.method5516(class326.getWidgetFlags(var9))) { // L: 11416
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11417
								Client.field696 = true; // L: 11418
								Client.field773 = var26; // L: 11419
								Client.field686 = var11; // L: 11420
							}

							if (var9.hasListener) { // L: 11422
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11423
									var37 = new ScriptEvent(); // L: 11424
									var37.isMouseInputEvent = true; // L: 11425
									var37.widget = var9; // L: 11426
									var37.mouseY = Client.mouseWheelRotation; // L: 11427
									var37.args = var9.onScroll; // L: 11428
									Client.scriptEvents.addFirst(var37); // L: 11429
								}

								if (Client.clickedWidget != null || class142.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11431
									var21 = false; // L: 11432
									var36 = false; // L: 11433
									var35 = false; // L: 11434
								}

								if (!var9.isClicked && var21) { // L: 11436
									var9.isClicked = true; // L: 11437
									if (var9.onClick != null) { // L: 11438
										var37 = new ScriptEvent(); // L: 11439
										var37.isMouseInputEvent = true; // L: 11440
										var37.widget = var9; // L: 11441
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11442
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11443
										var37.args = var9.onClick; // L: 11444
										Client.scriptEvents.addFirst(var37); // L: 11445
									}
								}

								if (var9.isClicked && var36 && var9.onClickRepeat != null) { // L: 11448 11449
									var37 = new ScriptEvent(); // L: 11450
									var37.isMouseInputEvent = true; // L: 11451
									var37.widget = var9; // L: 11452
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11453
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11454
									var37.args = var9.onClickRepeat; // L: 11455
									Client.scriptEvents.addFirst(var37); // L: 11456
								}

								if (var9.isClicked && !var36) { // L: 11459
									var9.isClicked = false; // L: 11460
									if (var9.onRelease != null) { // L: 11461
										var37 = new ScriptEvent(); // L: 11462
										var37.isMouseInputEvent = true; // L: 11463
										var37.widget = var9; // L: 11464
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11465
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11466
										var37.args = var9.onRelease; // L: 11467
										Client.field711.addFirst(var37); // L: 11468
									}
								}

								if (var36 && var9.onHold != null) { // L: 11471 11472
									var37 = new ScriptEvent(); // L: 11473
									var37.isMouseInputEvent = true; // L: 11474
									var37.widget = var9; // L: 11475
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11476
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11477
									var37.args = var9.onHold; // L: 11478
									Client.scriptEvents.addFirst(var37); // L: 11479
								}

								if (!var9.containsMouse && var35) { // L: 11482
									var9.containsMouse = true; // L: 11483
									if (var9.onMouseOver != null) { // L: 11484
										var37 = new ScriptEvent(); // L: 11485
										var37.isMouseInputEvent = true; // L: 11486
										var37.widget = var9; // L: 11487
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11488
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11489
										var37.args = var9.onMouseOver; // L: 11490
										Client.scriptEvents.addFirst(var37); // L: 11491
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 11494 11495
									var37 = new ScriptEvent(); // L: 11496
									var37.isMouseInputEvent = true; // L: 11497
									var37.widget = var9; // L: 11498
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11499
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11500
									var37.args = var9.onMouseRepeat; // L: 11501
									Client.scriptEvents.addFirst(var37); // L: 11502
								}

								if (var9.containsMouse && !var35) { // L: 11505
									var9.containsMouse = false; // L: 11506
									if (var9.onMouseLeave != null) { // L: 11507
										var37 = new ScriptEvent(); // L: 11508
										var37.isMouseInputEvent = true; // L: 11509
										var37.widget = var9; // L: 11510
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11511
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11512
										var37.args = var9.onMouseLeave; // L: 11513
										Client.field711.addFirst(var37); // L: 11514
									}
								}

								if (var9.onTimer != null) { // L: 11517
									var37 = new ScriptEvent(); // L: 11518
									var37.widget = var9; // L: 11519
									var37.args = var9.onTimer; // L: 11520
									Client.field710.addFirst(var37); // L: 11521
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3479) { // L: 11523
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3479 <= 32) { // L: 11524
										label825:
										for (var40 = var9.field3479; var40 < Client.changedVarpCount; ++var40) { // L: 11531
											var29 = Client.changedVarps[var40 & 31]; // L: 11532

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) { // L: 11533
												if (var29 == var9.varTransmitTriggers[var39]) { // L: 11534
													var25 = new ScriptEvent(); // L: 11535
													var25.widget = var9; // L: 11536
													var25.args = var9.onVarTransmit; // L: 11537
													Client.scriptEvents.addFirst(var25); // L: 11538
													break label825; // L: 11539
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11525
										var37.widget = var9; // L: 11526
										var37.args = var9.onVarTransmit; // L: 11527
										Client.scriptEvents.addFirst(var37); // L: 11528
									}

									var9.field3479 = Client.changedVarpCount; // L: 11544
								}

								if (var9.onInvTransmit != null && Client.field695 > var9.field3480) { // L: 11546
									if (var9.invTransmitTriggers != null && Client.field695 - var9.field3480 <= 32) { // L: 11547
										label801:
										for (var40 = var9.field3480; var40 < Client.field695; ++var40) { // L: 11554
											var29 = Client.changedItemContainers[var40 & 31]; // L: 11555

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) { // L: 11556
												if (var29 == var9.invTransmitTriggers[var39]) { // L: 11557
													var25 = new ScriptEvent(); // L: 11558
													var25.widget = var9; // L: 11559
													var25.args = var9.onInvTransmit; // L: 11560
													Client.scriptEvents.addFirst(var25); // L: 11561
													break label801; // L: 11562
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11548
										var37.widget = var9; // L: 11549
										var37.args = var9.onInvTransmit; // L: 11550
										Client.scriptEvents.addFirst(var37); // L: 11551
									}

									var9.field3480 = Client.field695; // L: 11567
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3433) { // L: 11569
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3433 <= 32) { // L: 11570
										label777:
										for (var40 = var9.field3433; var40 < Client.changedSkillsCount; ++var40) { // L: 11577
											var29 = Client.changedSkills[var40 & 31]; // L: 11578

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) { // L: 11579
												if (var29 == var9.statTransmitTriggers[var39]) { // L: 11580
													var25 = new ScriptEvent(); // L: 11581
													var25.widget = var9; // L: 11582
													var25.args = var9.onStatTransmit; // L: 11583
													Client.scriptEvents.addFirst(var25); // L: 11584
													break label777; // L: 11585
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11571
										var37.widget = var9; // L: 11572
										var37.args = var9.onStatTransmit; // L: 11573
										Client.scriptEvents.addFirst(var37); // L: 11574
									}

									var9.field3433 = Client.changedSkillsCount; // L: 11590
								}

								if (Client.chatCycle > var9.field3478 && var9.onChatTransmit != null) { // L: 11592
									var37 = new ScriptEvent(); // L: 11593
									var37.widget = var9; // L: 11594
									var37.args = var9.onChatTransmit; // L: 11595
									Client.scriptEvents.addFirst(var37); // L: 11596
								}

								if (Client.field701 > var9.field3478 && var9.onFriendTransmit != null) { // L: 11598
									var37 = new ScriptEvent(); // L: 11599
									var37.widget = var9; // L: 11600
									var37.args = var9.onFriendTransmit; // L: 11601
									Client.scriptEvents.addFirst(var37); // L: 11602
								}

								if (Client.field702 > var9.field3478 && var9.onClanTransmit != null) { // L: 11604
									var37 = new ScriptEvent(); // L: 11605
									var37.widget = var9; // L: 11606
									var37.args = var9.onClanTransmit; // L: 11607
									Client.scriptEvents.addFirst(var37); // L: 11608
								}

								if (Client.field703 > var9.field3478 && var9.field3454 != null) { // L: 11610
									var37 = new ScriptEvent(); // L: 11611
									var37.widget = var9; // L: 11612
									var37.args = var9.field3454; // L: 11613
									Client.scriptEvents.addFirst(var37); // L: 11614
								}

								if (Client.field755 > var9.field3478 && var9.field3455 != null) { // L: 11616
									var37 = new ScriptEvent(); // L: 11617
									var37.widget = var9; // L: 11618
									var37.args = var9.field3455; // L: 11619
									Client.scriptEvents.addFirst(var37); // L: 11620
								}

								if (Client.field705 > var9.field3478 && var9.onStockTransmit != null) { // L: 11622
									var37 = new ScriptEvent(); // L: 11623
									var37.widget = var9; // L: 11624
									var37.args = var9.onStockTransmit; // L: 11625
									Client.scriptEvents.addFirst(var37); // L: 11626
								}

								if (Client.field706 > var9.field3478 && var9.field3432 != null) { // L: 11628
									var37 = new ScriptEvent(); // L: 11629
									var37.widget = var9; // L: 11630
									var37.args = var9.field3432; // L: 11631
									Client.scriptEvents.addFirst(var37); // L: 11632
								}

								if (Client.field707 > var9.field3478 && var9.onMiscTransmit != null) { // L: 11634
									var37 = new ScriptEvent(); // L: 11635
									var37.widget = var9; // L: 11636
									var37.args = var9.onMiscTransmit; // L: 11637
									Client.scriptEvents.addFirst(var37); // L: 11638
								}

								var9.field3478 = Client.cycleCntr; // L: 11640
								if (var9.onKey != null) { // L: 11641
									for (var40 = 0; var40 < Client.field731; ++var40) { // L: 11642
										ScriptEvent var38 = new ScriptEvent(); // L: 11643
										var38.widget = var9; // L: 11644
										var38.keyTyped = Client.field733[var40]; // L: 11645
										var38.keyPressed = Client.field732[var40]; // L: 11646
										var38.args = var9.onKey; // L: 11647
										Client.scriptEvents.addFirst(var38); // L: 11648
									}
								}

								ScriptEvent var32;
								if (var9.field3416 != null) { // L: 11651
									var22 = FontName.method7414(); // L: 11652

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11653
										var32 = new ScriptEvent(); // L: 11654
										var32.widget = var9; // L: 11655
										var32.keyTyped = var22[var29]; // L: 11656
										var32.args = var9.field3416; // L: 11657
										Client.scriptEvents.addFirst(var32); // L: 11658
									}
								}

								if (var9.field3451 != null) { // L: 11661
									var22 = class118.method2748(); // L: 11662

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11663
										var32 = new ScriptEvent(); // L: 11664
										var32.widget = var9; // L: 11665
										var32.keyTyped = var22[var29]; // L: 11666
										var32.args = var9.field3451; // L: 11667
										Client.scriptEvents.addFirst(var32); // L: 11668
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11673
							if (Client.clickedWidget != null || class142.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11674
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11675
								if (var9.mouseOverRedirect >= 0) { // L: 11676
									DevicePcmPlayerProvider.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									DevicePcmPlayerProvider.mousedOverWidgetIf1 = var9; // L: 11677
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11679
								GrandExchangeOfferOwnWorldComparator.field486 = var9; // L: 11680
							}

							if (var9.scrollHeight > var9.height) { // L: 11682
								class129.method2861(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11684
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11685
							if (var9.children != null) { // L: 11686
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11687
							if (var30 != null) { // L: 11688
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11689
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11690
										if (var31.isMouseInputEvent) { // L: 11691
											var31.remove(); // L: 11692
											var31.widget.containsMouse = false; // L: 11693
										}
									}

									if (class124.widgetDragDuration == 0) { // L: 11696
										Client.clickedWidget = null; // L: 11697
										Client.clickedWidgetParent = null; // L: 11698
									}

									if (!Client.isMenuOpen) { // L: 11700
										ByteArrayPool.addCancelMenuEntry(); // L: 11701
									}
								}

								Language.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11); // L: 11704
							}
						}
					}
				}
			}
		}

	} // L: 11708
}
