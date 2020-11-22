import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("br")
public class class69 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static IndexedSprite field583;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("pcmPlayerProvider")
	public static PlayerProvider pcmPlayerProvider;

	@ObfuscatedName("f")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class299.base37Table[(int)(var6 - 37L * var0)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-2072046578"
	)
	static int method1266(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 732
			var0 -= 1000; // L: 733
			var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 734
		} else {
			var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 736
		}

		GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 737
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 738
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 758
				var3.modelType = 2; // L: 759
				var3.modelId = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 760
				return 1; // L: 761
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 763
				var3.modelType = 3; // L: 764
				var3.modelId = PlayerType.localPlayer.appearance.getChatHeadId(); // L: 765
				return 1; // L: 766
			} else {
				return 2; // L: 768
			}
		} else {
			MilliClock.Interpreter_intStackSize -= 2; // L: 739
			int var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 740
			int var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 741
			var3.itemId = var4; // L: 742
			var3.itemQuantity = var5; // L: 743
			ItemDefinition var6 = AbstractWorldMapData.ItemDefinition_get(var4); // L: 744
			var3.modelAngleX = var6.xan2d; // L: 745
			var3.modelAngleY = var6.yan2d; // L: 746
			var3.modelAngleZ = var6.zan2d; // L: 747
			var3.modelOffsetX = var6.offsetX2d; // L: 748
			var3.modelOffsetY = var6.offsetY2d; // L: 749
			var3.modelZoom = var6.zoom2d; // L: 750
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 751
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 752
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 753
			}

			if (var3.field2678 > 0) { // L: 754
				var3.modelZoom = var3.modelZoom * 32 / var3.field2678;
			} else if (var3.rawWidth > 0) { // L: 755
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 756
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "319100634"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 8808
			Widget var0 = ItemContainer.getWidgetChild(class307.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 8809
			if (var0 != null && var0.onTargetLeave != null) { // L: 8810
				ScriptEvent var1 = new ScriptEvent(); // L: 8811
				var1.widget = var0; // L: 8812
				var1.args = var0.onTargetLeave; // L: 8813
				Entity.runScriptEvent(var1); // L: 8814
			}

			Client.isSpellSelected = false; // L: 8816
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0); // L: 8817
		}
	} // L: 8818

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "([Lht;IIIIIIIS)V",
		garbageValue = "482"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10348
			Widget var9 = var0[var8]; // L: 10349
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || WorldMapData_0.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 10350 10351 10352
				if (var9.isIf3) { // L: 10353
					if (VertexNormal.isComponentHidden(var9)) { // L: 10354
						continue;
					}
				} else if (var9.type == 0 && var9 != GrandExchangeEvent.mousedOverWidgetIf1 && VertexNormal.isComponentHidden(var9)) { // L: 10357
					continue;
				}

				int var10 = var9.x + var6; // L: 10359
				int var11 = var7 + var9.y; // L: 10360
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10365
					var12 = var2; // L: 10366
					var13 = var3; // L: 10367
					var14 = var4; // L: 10368
					var15 = var5; // L: 10369
				} else {
					int var16;
					if (var9.type == 9) { // L: 10371
						var16 = var10; // L: 10372
						var17 = var11; // L: 10373
						var18 = var10 + var9.width; // L: 10374
						int var19 = var11 + var9.height; // L: 10375
						if (var18 < var10) { // L: 10376
							var16 = var18; // L: 10378
							var18 = var10; // L: 10379
						}

						if (var19 < var11) { // L: 10381
							var17 = var19; // L: 10383
							var19 = var11; // L: 10384
						}

						++var18; // L: 10386
						++var19; // L: 10387
						var12 = var16 > var2 ? var16 : var2; // L: 10388
						var13 = var17 > var3 ? var17 : var3; // L: 10389
						var14 = var18 < var4 ? var18 : var4; // L: 10390
						var15 = var19 < var5 ? var19 : var5; // L: 10391
					} else {
						var16 = var10 + var9.width; // L: 10394
						var17 = var11 + var9.height; // L: 10395
						var12 = var10 > var2 ? var10 : var2; // L: 10396
						var13 = var11 > var3 ? var11 : var3; // L: 10397
						var14 = var16 < var4 ? var16 : var4; // L: 10398
						var15 = var17 < var5 ? var17 : var5; // L: 10399
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10401
					Client.field705 = true; // L: 10402
					Client.field931 = var10; // L: 10403
					Client.field701 = var11; // L: 10404
				}

				boolean var32 = false; // L: 10406
				if (var9.field2667) { // L: 10407
					switch(Client.field843) { // L: 10408
					case 0:
						var32 = true; // L: 10410
					case 1:
					default:
						break;
					case 2:
						if (Client.field844 == var9.id >>> 16) { // L: 10413
							var32 = true; // L: 10414
						}
						break;
					case 3:
						if (var9.id == Client.field844) { // L: 10418
							var32 = true; // L: 10419
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10424
					if (var9.isIf3) { // L: 10425
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 10426
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10427
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10428
									if (var26.isMouseInputEvent) { // L: 10429
										var26.remove(); // L: 10430
										var26.widget.containsMouse = false; // L: 10431
									}
								}

								if (GrandExchangeEvent.widgetDragDuration == 0) { // L: 10434
									Client.clickedWidget = null; // L: 10435
									Client.clickedWidgetParent = null; // L: 10436
								}

								if (!Client.isMenuOpen) { // L: 10438
									WorldMapSection2.addCancelMenuEntry(); // L: 10439
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10443 10444
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10445
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10446
									var26.remove(); // L: 10447
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10453
					var18 = MouseHandler.MouseHandler_y; // L: 10454
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10455
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10456
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10457
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10459
					if (var9.contentType == 1337) { // L: 10460
						if (!Client.isLoading && !Client.isMenuOpen && var33) { // L: 10461
							KeyHandler.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10464
						class9.checkIfMinimapClicked(var9, var10, var11); // L: 10465
					} else {
						if (var9.contentType == 1400) { // L: 10468
							KeyHandler.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height); // L: 10469
						}

						if (!Client.isMenuOpen && var33) { // L: 10471
							if (var9.contentType == 1400) { // L: 10472
								KeyHandler.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10473
							} else {
								class238.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10476
							}
						}

						boolean var21;
						int var23;
						if (var32) { // L: 10479
							for (int var20 = 0; var20 < var9.field2668.length; ++var20) { // L: 10480
								var21 = false; // L: 10481
								boolean var27 = false; // L: 10482
								if (!var21 && var9.field2668[var20] != null) { // L: 10483
									for (var23 = 0; var23 < var9.field2668[var20].length; ++var23) { // L: 10484
										boolean var24 = false; // L: 10485
										if (var9.field2594 != null) { // L: 10486
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2668[var20][var23]]; // L: 10487
										}

										if (TileItem.method2235(var9.field2668[var20][var23]) || var24) { // L: 10489
											var21 = true; // L: 10490
											if (var9.field2594 != null && var9.field2594[var20] > Client.cycle) { // L: 10491
												break;
											}

											byte var31 = var9.field2649[var20][var23]; // L: 10492
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10493 10494 10495 10496 10497
												var27 = true; // L: 10499
												break;
											}
										}
									}
								}

								if (var27) { // L: 10505
									if (var20 < 10) { // L: 10506
										Messages.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10507
										Widget_runOnTargetLeave(); // L: 10508
										class3.selectSpell(var9.id, var9.childIndex, JagexCache.Widget_unpackTargetMask(WorldMapData_0.getWidgetFlags(var9)), var9.itemId); // L: 10509
										Client.selectedSpellActionName = PendingSpawn.Widget_getSpellActionName(var9); // L: 10510
										if (Client.selectedSpellActionName == null) { // L: 10511
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + Client.colorStartTag(16777215); // L: 10512
									}

									var23 = var9.field2670[var20]; // L: 10514
									if (var9.field2594 == null) { // L: 10515
										var9.field2594 = new int[var9.field2668.length];
									}

									if (var9.field2671 == null) { // L: 10516
										var9.field2671 = new int[var9.field2668.length];
									}

									if (var23 != 0) { // L: 10517
										if (var9.field2594[var20] == 0) { // L: 10518
											var9.field2594[var20] = var23 + Client.cycle + var9.field2671[var20];
										} else {
											var9.field2594[var20] = var23 + Client.cycle; // L: 10519
										}
									} else {
										var9.field2594[var20] = Integer.MAX_VALUE; // L: 10521
									}
								}

								if (!var21 && var9.field2594 != null) { // L: 10523 10524
									var9.field2594[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10528
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10529
								var33 = true;
							} else {
								var33 = false; // L: 10530
							}

							boolean var34 = false; // L: 10531
							if ((MouseHandler.MouseHandler_currentButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) { // L: 10532
								var34 = true;
							}

							var21 = false; // L: 10533
							if ((MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10534
								var21 = true;
							}

							if (var21) { // L: 10535
								class228.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10536
								KeyHandler.worldMap.method6456(var17, var18, var33 & var34, var33 & var21); // L: 10537
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && MusicPatch.method4039(WorldMapData_0.getWidgetFlags(var9))) { // L: 10539
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10540
								Client.field859 = true; // L: 10541
								Client.field860 = var10; // L: 10542
								Client.field861 = var11; // L: 10543
							}

							if (var9.hasListener) { // L: 10545
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10546
									var22 = new ScriptEvent(); // L: 10547
									var22.isMouseInputEvent = true; // L: 10548
									var22.widget = var9; // L: 10549
									var22.mouseY = Client.mouseWheelRotation; // L: 10550
									var22.args = var9.onScroll; // L: 10551
									Client.scriptEvents.addFirst(var22); // L: 10552
								}

								if (Client.clickedWidget != null || GameBuild.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10554
									var21 = false; // L: 10555
									var34 = false; // L: 10556
									var33 = false; // L: 10557
								}

								if (!var9.isClicked && var21) { // L: 10559
									var9.isClicked = true; // L: 10560
									if (var9.onClick != null) { // L: 10561
										var22 = new ScriptEvent(); // L: 10562
										var22.isMouseInputEvent = true; // L: 10563
										var22.widget = var9; // L: 10564
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10565
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10566
										var22.args = var9.onClick; // L: 10567
										Client.scriptEvents.addFirst(var22); // L: 10568
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) { // L: 10571 10572
									var22 = new ScriptEvent(); // L: 10573
									var22.isMouseInputEvent = true; // L: 10574
									var22.widget = var9; // L: 10575
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10576
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10577
									var22.args = var9.onClickRepeat; // L: 10578
									Client.scriptEvents.addFirst(var22); // L: 10579
								}

								if (var9.isClicked && !var34) { // L: 10582
									var9.isClicked = false; // L: 10583
									if (var9.onRelease != null) { // L: 10584
										var22 = new ScriptEvent(); // L: 10585
										var22.isMouseInputEvent = true; // L: 10586
										var22.widget = var9; // L: 10587
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10588
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10589
										var22.args = var9.onRelease; // L: 10590
										Client.field939.addFirst(var22); // L: 10591
									}
								}

								if (var34 && var9.onHold != null) { // L: 10594 10595
									var22 = new ScriptEvent(); // L: 10596
									var22.isMouseInputEvent = true; // L: 10597
									var22.widget = var9; // L: 10598
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10599
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10600
									var22.args = var9.onHold; // L: 10601
									Client.scriptEvents.addFirst(var22); // L: 10602
								}

								if (!var9.containsMouse && var33) { // L: 10605
									var9.containsMouse = true; // L: 10606
									if (var9.onMouseOver != null) { // L: 10607
										var22 = new ScriptEvent(); // L: 10608
										var22.isMouseInputEvent = true; // L: 10609
										var22.widget = var9; // L: 10610
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10611
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10612
										var22.args = var9.onMouseOver; // L: 10613
										Client.scriptEvents.addFirst(var22); // L: 10614
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) { // L: 10617 10618
									var22 = new ScriptEvent(); // L: 10619
									var22.isMouseInputEvent = true; // L: 10620
									var22.widget = var9; // L: 10621
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10622
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10623
									var22.args = var9.onMouseRepeat; // L: 10624
									Client.scriptEvents.addFirst(var22); // L: 10625
								}

								if (var9.containsMouse && !var33) { // L: 10628
									var9.containsMouse = false; // L: 10629
									if (var9.onMouseLeave != null) { // L: 10630
										var22 = new ScriptEvent(); // L: 10631
										var22.isMouseInputEvent = true; // L: 10632
										var22.widget = var9; // L: 10633
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10634
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10635
										var22.args = var9.onMouseLeave; // L: 10636
										Client.field939.addFirst(var22); // L: 10637
									}
								}

								if (var9.onTimer != null) { // L: 10640
									var22 = new ScriptEvent(); // L: 10641
									var22.widget = var9; // L: 10642
									var22.args = var9.onTimer; // L: 10643
									Client.field881.addFirst(var22); // L: 10644
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.field868 > var9.field2727) { // L: 10646
									if (var9.varTransmitTriggers != null && Client.field868 - var9.field2727 <= 32) { // L: 10647
										label774:
										for (var36 = var9.field2727; var36 < Client.field868; ++var36) { // L: 10654
											var23 = Client.field867[var36 & 31]; // L: 10655

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) { // L: 10656
												if (var23 == var9.varTransmitTriggers[var35]) { // L: 10657
													var25 = new ScriptEvent(); // L: 10658
													var25.widget = var9; // L: 10659
													var25.args = var9.onVarTransmit; // L: 10660
													Client.scriptEvents.addFirst(var25); // L: 10661
													break label774; // L: 10662
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10648
										var22.widget = var9; // L: 10649
										var22.args = var9.onVarTransmit; // L: 10650
										Client.scriptEvents.addFirst(var22); // L: 10651
									}

									var9.field2727 = Client.field868; // L: 10667
								}

								if (var9.onInvTransmit != null && Client.field941 > var9.field2728) { // L: 10669
									if (var9.invTransmitTriggers != null && Client.field941 - var9.field2728 <= 32) { // L: 10670
										label750:
										for (var36 = var9.field2728; var36 < Client.field941; ++var36) { // L: 10677
											var23 = Client.changedItemContainers[var36 & 31]; // L: 10678

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) { // L: 10679
												if (var23 == var9.invTransmitTriggers[var35]) { // L: 10680
													var25 = new ScriptEvent(); // L: 10681
													var25.widget = var9; // L: 10682
													var25.args = var9.onInvTransmit; // L: 10683
													Client.scriptEvents.addFirst(var25); // L: 10684
													break label750; // L: 10685
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10671
										var22.widget = var9; // L: 10672
										var22.args = var9.onInvTransmit; // L: 10673
										Client.scriptEvents.addFirst(var22); // L: 10674
									}

									var9.field2728 = Client.field941; // L: 10690
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2729) { // L: 10692
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2729 <= 32) { // L: 10693
										label726:
										for (var36 = var9.field2729; var36 < Client.changedSkillsCount; ++var36) { // L: 10700
											var23 = Client.changedSkills[var36 & 31]; // L: 10701

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) { // L: 10702
												if (var23 == var9.statTransmitTriggers[var35]) { // L: 10703
													var25 = new ScriptEvent(); // L: 10704
													var25.widget = var9; // L: 10705
													var25.args = var9.onStatTransmit; // L: 10706
													Client.scriptEvents.addFirst(var25); // L: 10707
													break label726; // L: 10708
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10694
										var22.widget = var9; // L: 10695
										var22.args = var9.onStatTransmit; // L: 10696
										Client.scriptEvents.addFirst(var22); // L: 10697
									}

									var9.field2729 = Client.changedSkillsCount; // L: 10713
								}

								if (Client.chatCycle > var9.field2726 && var9.onChatTransmit != null) { // L: 10715
									var22 = new ScriptEvent(); // L: 10716
									var22.widget = var9; // L: 10717
									var22.args = var9.onChatTransmit; // L: 10718
									Client.scriptEvents.addFirst(var22); // L: 10719
								}

								if (Client.field874 > var9.field2726 && var9.onFriendTransmit != null) { // L: 10721
									var22 = new ScriptEvent(); // L: 10722
									var22.widget = var9; // L: 10723
									var22.args = var9.onFriendTransmit; // L: 10724
									Client.scriptEvents.addFirst(var22); // L: 10725
								}

								if (Client.field875 > var9.field2726 && var9.onClanTransmit != null) { // L: 10727
									var22 = new ScriptEvent(); // L: 10728
									var22.widget = var9; // L: 10729
									var22.args = var9.onClanTransmit; // L: 10730
									Client.scriptEvents.addFirst(var22); // L: 10731
								}

								if (Client.field885 > var9.field2726 && var9.onStockTransmit != null) { // L: 10733
									var22 = new ScriptEvent(); // L: 10734
									var22.widget = var9; // L: 10735
									var22.args = var9.onStockTransmit; // L: 10736
									Client.scriptEvents.addFirst(var22); // L: 10737
								}

								if (Client.field852 > var9.field2726 && var9.field2669 != null) { // L: 10739
									var22 = new ScriptEvent(); // L: 10740
									var22.widget = var9; // L: 10741
									var22.args = var9.field2669; // L: 10742
									Client.scriptEvents.addFirst(var22); // L: 10743
								}

								if (Client.field878 > var9.field2726 && var9.onMiscTransmit != null) { // L: 10745
									var22 = new ScriptEvent(); // L: 10746
									var22.widget = var9; // L: 10747
									var22.args = var9.onMiscTransmit; // L: 10748
									Client.scriptEvents.addFirst(var22); // L: 10749
								}

								var9.field2726 = Client.cycleCntr; // L: 10751
								if (var9.onKey != null) { // L: 10752
									for (var36 = 0; var36 < Client.field902; ++var36) { // L: 10753
										ScriptEvent var30 = new ScriptEvent(); // L: 10754
										var30.widget = var9; // L: 10755
										var30.keyTyped = Client.field904[var36]; // L: 10756
										var30.keyPressed = Client.field903[var36]; // L: 10757
										var30.args = var9.onKey; // L: 10758
										Client.scriptEvents.addFirst(var30); // L: 10759
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 10764
							if (Client.clickedWidget != null || GameBuild.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10765
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10766
								if (var9.mouseOverRedirect >= 0) { // L: 10767
									GrandExchangeEvent.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									GrandExchangeEvent.mousedOverWidgetIf1 = var9; // L: 10768
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10770
								GrandExchangeOfferOwnWorldComparator.field677 = var9; // L: 10771
							}

							if (var9.scrollHeight > var9.height) { // L: 10773
								PacketBufferNode.method3759(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 10775
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 10776
							if (var9.children != null) { // L: 10777
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 10778
							if (var28 != null) { // L: 10779
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 10780
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10781
										if (var29.isMouseInputEvent) { // L: 10782
											var29.remove(); // L: 10783
											var29.widget.containsMouse = false; // L: 10784
										}
									}

									if (GrandExchangeEvent.widgetDragDuration == 0) { // L: 10787
										Client.clickedWidget = null; // L: 10788
										Client.clickedWidgetParent = null; // L: 10789
									}

									if (!Client.isMenuOpen) { // L: 10791
										WorldMapSection2.addCancelMenuEntry(); // L: 10792
									}
								}

								DynamicObject.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 10795
							}
						}
					}
				}
			}
		}

	} // L: 10799
}
