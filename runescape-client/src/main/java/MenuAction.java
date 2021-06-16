import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1773344917
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2064070335
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 519860607
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1059226483
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("j")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 11738

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILnt;S)Let;",
		garbageValue = "256"
	)
	public static class136 method2027(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class136 var5 = new class136(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1542 != null && var7.length == var5.field1542.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1542[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1541 != null && var7.length == var5.field1541.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1541[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIBZI)V",
		garbageValue = "-1474960108"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 110
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 111
		if (var8 == null) { // L: 112
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 113
			if (var8 == null) { // L: 114
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 115
				if (var8 != null) { // L: 116
					if (var5) { // L: 117
						var8.removeDual(); // L: 118
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 119
						--NetCache.NetCache_pendingWritesCount; // L: 120
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 121
					}

				} else {
					if (!var5) { // L: 125
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 126
						if (var8 != null) { // L: 127
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 129
					var8.archive = var0; // L: 130
					var8.crc = var3; // L: 131
					var8.padding = var4; // L: 132
					if (var5) { // L: 133
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 134
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 135
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 138
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 139
						++NetCache.NetCache_pendingWritesCount; // L: 140
					}

				}
			}
		}
	} // L: 142

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1466042172"
	)
	public static void method2028() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 122
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 123
	} // L: 124

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "871195420"
	)
	static final String method2026(int var0) {
		if (var0 < 100000) { // L: 425
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 426 427
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIIIIII)V",
		garbageValue = "1325285933"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10371
			Widget var9 = var0[var8]; // L: 10372
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class22.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 10373 10374 10375
				if (var9.isIf3) { // L: 10376
					if (class35.isComponentHidden(var9)) { // L: 10377
						continue;
					}
				} else if (var9.type == 0 && var9 != MusicPatchNode.mousedOverWidgetIf1 && class35.isComponentHidden(var9)) { // L: 10380
					continue;
				}

				int var10 = var9.x + var6; // L: 10382
				int var11 = var7 + var9.y; // L: 10383
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10388
					var12 = var2; // L: 10389
					var13 = var3; // L: 10390
					var14 = var4; // L: 10391
					var15 = var5; // L: 10392
				} else {
					int var16;
					if (var9.type == 9) { // L: 10394
						var16 = var10; // L: 10395
						var17 = var11; // L: 10396
						var18 = var10 + var9.width; // L: 10397
						int var19 = var11 + var9.height; // L: 10398
						if (var18 < var10) { // L: 10399
							var16 = var18; // L: 10401
							var18 = var10; // L: 10402
						}

						if (var19 < var11) { // L: 10404
							var17 = var19; // L: 10406
							var19 = var11; // L: 10407
						}

						++var18; // L: 10409
						++var19; // L: 10410
						var12 = var16 > var2 ? var16 : var2; // L: 10411
						var13 = var17 > var3 ? var17 : var3; // L: 10412
						var14 = var18 < var4 ? var18 : var4; // L: 10413
						var15 = var19 < var5 ? var19 : var5; // L: 10414
					} else {
						var16 = var10 + var9.width; // L: 10417
						var17 = var11 + var9.height; // L: 10418
						var12 = var10 > var2 ? var10 : var2; // L: 10419
						var13 = var11 > var3 ? var11 : var3; // L: 10420
						var14 = var16 < var4 ? var16 : var4; // L: 10421
						var15 = var17 < var5 ? var17 : var5; // L: 10422
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10424
					Client.field731 = true; // L: 10425
					Client.field804 = var10; // L: 10426
					Client.field805 = var11; // L: 10427
				}

				boolean var33 = false; // L: 10429
				if (var9.field3034) { // L: 10430
					switch(Client.field784) { // L: 10431
					case 0:
						var33 = true; // L: 10433
					case 1:
					default:
						break;
					case 2:
						if (Client.field694 == var9.id >>> 16) { // L: 10441
							var33 = true; // L: 10442
						}
						break;
					case 3:
						if (var9.id == Client.field694) { // L: 10436
							var33 = true; // L: 10437
						}
					}
				}

				if (var33 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10447
					if (var9.isIf3) { // L: 10448
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 10449
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10450
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10451
									if (var26.isMouseInputEvent) { // L: 10452
										var26.remove(); // L: 10453
										var26.widget.containsMouse = false; // L: 10454
									}
								}

								if (UserComparator7.widgetDragDuration == 0) { // L: 10457
									Client.clickedWidget = null; // L: 10458
									Client.clickedWidgetParent = null; // L: 10459
								}

								if (!Client.isMenuOpen) { // L: 10461
									Script.addCancelMenuEntry(); // L: 10462
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10466 10467
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10468
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10469
									var26.remove(); // L: 10470
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10476
					var18 = MouseHandler.MouseHandler_y; // L: 10477
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10478
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10479
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10480
					}

					boolean var34 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10482
					if (var9.contentType == 1337) { // L: 10483
						if (!Client.isLoading && !Client.isMenuOpen && var34) { // L: 10484
							class391.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10487
						AbstractWorldMapIcon.checkIfMinimapClicked(var9, var10, var11); // L: 10488
					} else {
						if (var9.contentType == 1400) { // L: 10491
							class80.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height); // L: 10492
						}

						if (!Client.isMenuOpen && var34) { // L: 10494
							if (var9.contentType == 1400) { // L: 10495
								class80.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10496
							} else {
								class261.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10499
							}
						}

						boolean var21;
						int var23;
						if (var33) { // L: 10502
							for (int var20 = 0; var20 < var9.field3035.length; ++var20) { // L: 10503
								var21 = false; // L: 10504
								boolean var27 = false; // L: 10505
								if (!var21 && var9.field3035[var20] != null) { // L: 10506
									for (var23 = 0; var23 < var9.field3035[var20].length; ++var23) { // L: 10507
										boolean var24 = false; // L: 10508
										if (var9.field3104 != null) { // L: 10509
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3035[var20][var23]]; // L: 10510
										}

										if (class22.method314(var9.field3035[var20][var23]) || var24) { // L: 10512
											var21 = true; // L: 10513
											if (var9.field3104 != null && var9.field3104[var20] > Client.cycle) { // L: 10514
												break;
											}

											byte var32 = var9.field3036[var20][var23]; // L: 10515
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10516 10517 10518 10519 10520
												var27 = true; // L: 10522
												break;
											}
										}
									}
								}

								if (var27) { // L: 10528
									if (var20 < 10) { // L: 10529
										MouseHandler.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10530
										class20.Widget_runOnTargetLeave(); // L: 10531
										ItemComposition.selectSpell(var9.id, var9.childIndex, ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var9)), var9.itemId); // L: 10532
										Client.selectedSpellActionName = SecureRandomCallable.Widget_getSpellActionName(var9); // L: 10533
										if (Client.selectedSpellActionName == null) { // L: 10534
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + SecureRandomFuture.colorStartTag(16777215); // L: 10535
									}

									var23 = var9.field3037[var20]; // L: 10537
									if (var9.field3104 == null) { // L: 10538
										var9.field3104 = new int[var9.field3035.length];
									}

									if (var9.field3038 == null) { // L: 10539
										var9.field3038 = new int[var9.field3035.length];
									}

									if (var23 != 0) { // L: 10540
										if (var9.field3104[var20] == 0) { // L: 10541
											var9.field3104[var20] = var23 + Client.cycle + var9.field3038[var20];
										} else {
											var9.field3104[var20] = var23 + Client.cycle; // L: 10542
										}
									} else {
										var9.field3104[var20] = Integer.MAX_VALUE; // L: 10544
									}
								}

								if (!var21 && var9.field3104 != null) { // L: 10546 10547
									var9.field3104[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10551
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10552
								var34 = true;
							} else {
								var34 = false; // L: 10553
							}

							boolean var35 = false; // L: 10554
							if ((MouseHandler.MouseHandler_currentButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) { // L: 10555
								var35 = true;
							}

							var21 = false; // L: 10556
							if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10557
								var21 = true;
							}

							if (var21) { // L: 10558
								ItemLayer.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10559
								class80.worldMap.method6133(var17, var18, var34 & var35, var34 & var21); // L: 10560
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && class5.method73(class22.getWidgetFlags(var9))) { // L: 10562
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10563
								Client.field821 = true; // L: 10564
								Client.field801 = var10; // L: 10565
								Client.field802 = var11; // L: 10566
							}

							if (var9.hasListener) { // L: 10568
								ScriptEvent var22;
								if (var34 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10569
									var22 = new ScriptEvent(); // L: 10570
									var22.isMouseInputEvent = true; // L: 10571
									var22.widget = var9; // L: 10572
									var22.mouseY = Client.mouseWheelRotation; // L: 10573
									var22.args = var9.onScroll; // L: 10574
									Client.scriptEvents.addFirst(var22); // L: 10575
								}

								if (Client.clickedWidget != null || VerticalAlignment.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10577
									var21 = false; // L: 10578
									var35 = false; // L: 10579
									var34 = false; // L: 10580
								}

								if (!var9.isClicked && var21) { // L: 10582
									var9.isClicked = true; // L: 10583
									if (var9.onClick != null) { // L: 10584
										var22 = new ScriptEvent(); // L: 10585
										var22.isMouseInputEvent = true; // L: 10586
										var22.widget = var9; // L: 10587
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10588
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10589
										var22.args = var9.onClick; // L: 10590
										Client.scriptEvents.addFirst(var22); // L: 10591
									}
								}

								if (var9.isClicked && var35 && var9.onClickRepeat != null) { // L: 10594 10595
									var22 = new ScriptEvent(); // L: 10596
									var22.isMouseInputEvent = true; // L: 10597
									var22.widget = var9; // L: 10598
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10599
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10600
									var22.args = var9.onClickRepeat; // L: 10601
									Client.scriptEvents.addFirst(var22); // L: 10602
								}

								if (var9.isClicked && !var35) { // L: 10605
									var9.isClicked = false; // L: 10606
									if (var9.onRelease != null) { // L: 10607
										var22 = new ScriptEvent(); // L: 10608
										var22.isMouseInputEvent = true; // L: 10609
										var22.widget = var9; // L: 10610
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10611
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10612
										var22.args = var9.onRelease; // L: 10613
										Client.field860.addFirst(var22); // L: 10614
									}
								}

								if (var35 && var9.onHold != null) { // L: 10617 10618
									var22 = new ScriptEvent(); // L: 10619
									var22.isMouseInputEvent = true; // L: 10620
									var22.widget = var9; // L: 10621
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10622
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10623
									var22.args = var9.onHold; // L: 10624
									Client.scriptEvents.addFirst(var22); // L: 10625
								}

								if (!var9.containsMouse && var34) { // L: 10628
									var9.containsMouse = true; // L: 10629
									if (var9.onMouseOver != null) { // L: 10630
										var22 = new ScriptEvent(); // L: 10631
										var22.isMouseInputEvent = true; // L: 10632
										var22.widget = var9; // L: 10633
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10634
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10635
										var22.args = var9.onMouseOver; // L: 10636
										Client.scriptEvents.addFirst(var22); // L: 10637
									}
								}

								if (var9.containsMouse && var34 && var9.onMouseRepeat != null) { // L: 10640 10641
									var22 = new ScriptEvent(); // L: 10642
									var22.isMouseInputEvent = true; // L: 10643
									var22.widget = var9; // L: 10644
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10645
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10646
									var22.args = var9.onMouseRepeat; // L: 10647
									Client.scriptEvents.addFirst(var22); // L: 10648
								}

								if (var9.containsMouse && !var34) { // L: 10651
									var9.containsMouse = false; // L: 10652
									if (var9.onMouseLeave != null) { // L: 10653
										var22 = new ScriptEvent(); // L: 10654
										var22.isMouseInputEvent = true; // L: 10655
										var22.widget = var9; // L: 10656
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10657
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10658
										var22.args = var9.onMouseLeave; // L: 10659
										Client.field860.addFirst(var22); // L: 10660
									}
								}

								if (var9.onTimer != null) { // L: 10663
									var22 = new ScriptEvent(); // L: 10664
									var22.widget = var9; // L: 10665
									var22.args = var9.onTimer; // L: 10666
									Client.field812.addFirst(var22); // L: 10667
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3089) { // L: 10669
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3089 <= 32) { // L: 10670
										label809:
										for (var37 = var9.field3089; var37 < Client.changedVarpCount; ++var37) { // L: 10677
											var23 = Client.changedVarps[var37 & 31]; // L: 10678

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) { // L: 10679
												if (var23 == var9.varTransmitTriggers[var36]) { // L: 10680
													var25 = new ScriptEvent(); // L: 10681
													var25.widget = var9; // L: 10682
													var25.args = var9.onVarTransmit; // L: 10683
													Client.scriptEvents.addFirst(var25); // L: 10684
													break label809; // L: 10685
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10671
										var22.widget = var9; // L: 10672
										var22.args = var9.onVarTransmit; // L: 10673
										Client.scriptEvents.addFirst(var22); // L: 10674
									}

									var9.field3089 = Client.changedVarpCount; // L: 10690
								}

								if (var9.onInvTransmit != null && Client.field711 > var9.field3100) { // L: 10692
									if (var9.invTransmitTriggers != null && Client.field711 - var9.field3100 <= 32) { // L: 10693
										label785:
										for (var37 = var9.field3100; var37 < Client.field711; ++var37) { // L: 10700
											var23 = Client.changedItemContainers[var37 & 31]; // L: 10701

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) { // L: 10702
												if (var23 == var9.invTransmitTriggers[var36]) { // L: 10703
													var25 = new ScriptEvent(); // L: 10704
													var25.widget = var9; // L: 10705
													var25.args = var9.onInvTransmit; // L: 10706
													Client.scriptEvents.addFirst(var25); // L: 10707
													break label785; // L: 10708
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10694
										var22.widget = var9; // L: 10695
										var22.args = var9.onInvTransmit; // L: 10696
										Client.scriptEvents.addFirst(var22); // L: 10697
									}

									var9.field3100 = Client.field711; // L: 10713
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2971) { // L: 10715
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2971 <= 32) { // L: 10716
										label761:
										for (var37 = var9.field2971; var37 < Client.changedSkillsCount; ++var37) { // L: 10723
											var23 = Client.changedSkills[var37 & 31]; // L: 10724

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) { // L: 10725
												if (var23 == var9.statTransmitTriggers[var36]) { // L: 10726
													var25 = new ScriptEvent(); // L: 10727
													var25.widget = var9; // L: 10728
													var25.args = var9.onStatTransmit; // L: 10729
													Client.scriptEvents.addFirst(var25); // L: 10730
													break label761; // L: 10731
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10717
										var22.widget = var9; // L: 10718
										var22.args = var9.onStatTransmit; // L: 10719
										Client.scriptEvents.addFirst(var22); // L: 10720
									}

									var9.field2971 = Client.changedSkillsCount; // L: 10736
								}

								if (Client.chatCycle > var9.field3098 && var9.onChatTransmit != null) { // L: 10738
									var22 = new ScriptEvent(); // L: 10739
									var22.widget = var9; // L: 10740
									var22.args = var9.onChatTransmit; // L: 10741
									Client.scriptEvents.addFirst(var22); // L: 10742
								}

								if (Client.field817 > var9.field3098 && var9.onFriendTransmit != null) { // L: 10744
									var22 = new ScriptEvent(); // L: 10745
									var22.widget = var9; // L: 10746
									var22.args = var9.onFriendTransmit; // L: 10747
									Client.scriptEvents.addFirst(var22); // L: 10748
								}

								if (Client.field882 > var9.field3098 && var9.onClanTransmit != null) { // L: 10750
									var22 = new ScriptEvent(); // L: 10751
									var22.widget = var9; // L: 10752
									var22.args = var9.onClanTransmit; // L: 10753
									Client.scriptEvents.addFirst(var22); // L: 10754
								}

								if (Client.field819 > var9.field3098 && var9.field3075 != null) { // L: 10756
									var22 = new ScriptEvent(); // L: 10757
									var22.widget = var9; // L: 10758
									var22.args = var9.field3075; // L: 10759
									Client.scriptEvents.addFirst(var22); // L: 10760
								}

								if (Client.field820 > var9.field3098 && var9.field3076 != null) { // L: 10762
									var22 = new ScriptEvent(); // L: 10763
									var22.widget = var9; // L: 10764
									var22.args = var9.field3076; // L: 10765
									Client.scriptEvents.addFirst(var22); // L: 10766
								}

								if (Client.field827 > var9.field3098 && var9.onStockTransmit != null) { // L: 10768
									var22 = new ScriptEvent(); // L: 10769
									var22.widget = var9; // L: 10770
									var22.args = var9.onStockTransmit; // L: 10771
									Client.scriptEvents.addFirst(var22); // L: 10772
								}

								if (Client.field822 > var9.field3098 && var9.field3082 != null) { // L: 10774
									var22 = new ScriptEvent(); // L: 10775
									var22.widget = var9; // L: 10776
									var22.args = var9.field3082; // L: 10777
									Client.scriptEvents.addFirst(var22); // L: 10778
								}

								if (Client.field823 > var9.field3098 && var9.onMiscTransmit != null) { // L: 10780
									var22 = new ScriptEvent(); // L: 10781
									var22.widget = var9; // L: 10782
									var22.args = var9.onMiscTransmit; // L: 10783
									Client.scriptEvents.addFirst(var22); // L: 10784
								}

								var9.field3098 = Client.cycleCntr; // L: 10786
								if (var9.onKey != null) { // L: 10787
									for (var37 = 0; var37 < Client.field847; ++var37) { // L: 10788
										ScriptEvent var31 = new ScriptEvent(); // L: 10789
										var31.widget = var9; // L: 10790
										var31.keyTyped = Client.field786[var37]; // L: 10791
										var31.keyPressed = Client.field848[var37]; // L: 10792
										var31.args = var9.onKey; // L: 10793
										Client.scriptEvents.addFirst(var31); // L: 10794
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3071 != null) { // L: 10797
									var38 = class171.method3615(); // L: 10798

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 10799
										var30 = new ScriptEvent(); // L: 10800
										var30.widget = var9; // L: 10801
										var30.keyTyped = var38[var23]; // L: 10802
										var30.args = var9.field3071; // L: 10803
										Client.scriptEvents.addFirst(var30); // L: 10804
									}
								}

								if (var9.field3000 != null) { // L: 10807
									var38 = Tiles.method2154(); // L: 10808

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 10809
										var30 = new ScriptEvent(); // L: 10810
										var30.widget = var9; // L: 10811
										var30.keyTyped = var38[var23]; // L: 10812
										var30.args = var9.field3000; // L: 10813
										Client.scriptEvents.addFirst(var30); // L: 10814
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 10819
							if (Client.clickedWidget != null || VerticalAlignment.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10820
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10821
								if (var9.mouseOverRedirect >= 0) { // L: 10822
									MusicPatchNode.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									MusicPatchNode.mousedOverWidgetIf1 = var9; // L: 10823
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10825
								class5.field42 = var9; // L: 10826
							}

							if (var9.scrollHeight > var9.height) { // L: 10828
								class18.method273(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 10830
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 10831
							if (var9.children != null) { // L: 10832
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 10833
							if (var28 != null) { // L: 10834
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 10835
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10836
										if (var29.isMouseInputEvent) { // L: 10837
											var29.remove(); // L: 10838
											var29.widget.containsMouse = false; // L: 10839
										}
									}

									if (UserComparator7.widgetDragDuration == 0) { // L: 10842
										Client.clickedWidget = null; // L: 10843
										Client.clickedWidgetParent = null; // L: 10844
									}

									if (!Client.isMenuOpen) { // L: 10846
										Script.addCancelMenuEntry(); // L: 10847
									}
								}

								PacketWriter.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 10850
							}
						}
					}
				}
			}
		}

	} // L: 10854
}
