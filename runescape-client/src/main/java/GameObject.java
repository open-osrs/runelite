import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1988306865
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1610249635
	)
	@Export("height")
	int height;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -422238423
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 189641591
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1450544677
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 876164639
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 691537969
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 574238181
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1114926277
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 936749737
	)
	int field2191;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -823788373
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = 1468949973913714587L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -49778541
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljs;",
		garbageValue = "53"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 19
			var1 = new InvDefinition(); // L: 20
			if (var2 != null) { // L: 21
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "([Lhu;IIIIIIII)V",
		garbageValue = "762293873"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10406
			Widget var9 = var0[var8]; // L: 10407
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || DirectByteArrayCopier.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 10408 10409 10410
				if (var9.isIf3) { // L: 10411
					if (WorldMapArea.isComponentHidden(var9)) { // L: 10412
						continue;
					}
				} else if (var9.type == 0 && var9 != Varps.mousedOverWidgetIf1 && WorldMapArea.isComponentHidden(var9)) { // L: 10415
					continue;
				}

				int var10 = var9.x + var6; // L: 10417
				int var11 = var7 + var9.y; // L: 10418
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10423
					var12 = var2; // L: 10424
					var13 = var3; // L: 10425
					var14 = var4; // L: 10426
					var15 = var5; // L: 10427
				} else {
					int var16;
					if (var9.type == 9) { // L: 10429
						var16 = var10; // L: 10430
						var17 = var11; // L: 10431
						var18 = var10 + var9.width; // L: 10432
						int var19 = var11 + var9.height; // L: 10433
						if (var18 < var10) { // L: 10434
							var16 = var18; // L: 10436
							var18 = var10; // L: 10437
						}

						if (var19 < var11) { // L: 10439
							var17 = var19; // L: 10441
							var19 = var11; // L: 10442
						}

						++var18; // L: 10444
						++var19; // L: 10445
						var12 = var16 > var2 ? var16 : var2; // L: 10446
						var13 = var17 > var3 ? var17 : var3; // L: 10447
						var14 = var18 < var4 ? var18 : var4; // L: 10448
						var15 = var19 < var5 ? var19 : var5; // L: 10449
					} else {
						var16 = var10 + var9.width; // L: 10452
						var17 = var11 + var9.height; // L: 10453
						var12 = var10 > var2 ? var10 : var2; // L: 10454
						var13 = var11 > var3 ? var11 : var3; // L: 10455
						var14 = var16 < var4 ? var16 : var4; // L: 10456
						var15 = var17 < var5 ? var17 : var5; // L: 10457
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10459
					Client.field783 = true; // L: 10460
					Client.field784 = var10; // L: 10461
					Client.field845 = var11; // L: 10462
				}

				boolean var32 = false; // L: 10464
				if (var9.field2698) { // L: 10465
					switch(Client.field764) { // L: 10466
					case 0:
						var32 = true; // L: 10473
					case 1:
					default:
						break;
					case 2:
						if (Client.field765 == var9.id >>> 16) { // L: 10468
							var32 = true; // L: 10469
						}
						break;
					case 3:
						if (var9.id == Client.field765) { // L: 10476
							var32 = true; // L: 10477
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10482
					if (var9.isIf3) { // L: 10483
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 10484
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10485
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10486
									if (var26.isMouseInputEvent) { // L: 10487
										var26.remove(); // L: 10488
										var26.widget.containsMouse = false; // L: 10489
									}
								}

								if (class34.widgetDragDuration == 0) { // L: 10492
									Client.clickedWidget = null; // L: 10493
									Client.clickedWidgetParent = null; // L: 10494
								}

								if (!Client.isMenuOpen) { // L: 10496
									VerticalAlignment.addCancelMenuEntry(); // L: 10497
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10501 10502
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10503
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10504
									var26.remove(); // L: 10505
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10511
					var18 = MouseHandler.MouseHandler_y; // L: 10512
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10513
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10514
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10515
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10517
					if (var9.contentType == 1337) { // L: 10518
						if (!Client.isLoading && !Client.isMenuOpen && var33) { // L: 10519
							BuddyRankComparator.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10522
						class14.checkIfMinimapClicked(var9, var10, var11); // L: 10523
					} else {
						if (var9.contentType == 1400) { // L: 10526
							UserComparator4.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height); // L: 10527
						}

						if (!Client.isMenuOpen && var33) { // L: 10529
							if (var9.contentType == 1400) { // L: 10530
								UserComparator4.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10531
							} else {
								class12.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10534
							}
						}

						boolean var21;
						int var23;
						if (var32) { // L: 10537
							for (int var20 = 0; var20 < var9.field2699.length; ++var20) { // L: 10538
								var21 = false; // L: 10539
								boolean var27 = false; // L: 10540
								if (!var21 && var9.field2699[var20] != null) { // L: 10541
									for (var23 = 0; var23 < var9.field2699[var20].length; ++var23) { // L: 10542
										boolean var24 = false; // L: 10543
										if (var9.field2653 != null) { // L: 10544
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2699[var20][var23]]; // L: 10545
										}

										if (BoundaryObject.method3787(var9.field2699[var20][var23]) || var24) { // L: 10547
											var21 = true; // L: 10548
											if (var9.field2653 != null && var9.field2653[var20] > Client.cycle) { // L: 10549
												break;
											}

											byte var31 = var9.field2747[var20][var23]; // L: 10550
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10551 10552 10553 10554 10555
												var27 = true; // L: 10557
												break;
											}
										}
									}
								}

								if (var27) { // L: 10563
									if (var20 < 10) { // L: 10564
										class376.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10565
										WorldMapID.Widget_runOnTargetLeave(); // L: 10566
										Strings.selectSpell(var9.id, var9.childIndex, class223.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var9)), var9.itemId); // L: 10567
										Client.selectedSpellActionName = class11.Widget_getSpellActionName(var9); // L: 10568
										if (Client.selectedSpellActionName == null) { // L: 10569
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + DefaultsGroup.colorStartTag(16777215); // L: 10570
									}

									var23 = var9.field2701[var20]; // L: 10572
									if (var9.field2653 == null) { // L: 10573
										var9.field2653 = new int[var9.field2699.length];
									}

									if (var9.field2692 == null) { // L: 10574
										var9.field2692 = new int[var9.field2699.length];
									}

									if (var23 != 0) { // L: 10575
										if (var9.field2653[var20] == 0) { // L: 10576
											var9.field2653[var20] = var23 + Client.cycle + var9.field2692[var20];
										} else {
											var9.field2653[var20] = var23 + Client.cycle; // L: 10577
										}
									} else {
										var9.field2653[var20] = Integer.MAX_VALUE; // L: 10579
									}
								}

								if (!var21 && var9.field2653 != null) { // L: 10581 10582
									var9.field2653[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10586
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10587
								var33 = true;
							} else {
								var33 = false; // L: 10588
							}

							boolean var34 = false; // L: 10589
							if ((MouseHandler.MouseHandler_currentButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) { // L: 10590
								var34 = true;
							}

							var21 = false; // L: 10591
							if ((MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10592
								var21 = true;
							}

							if (var21) { // L: 10593
								PcmPlayer.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10594
								UserComparator4.worldMap.method6197(var17, var18, var33 & var34, var33 & var21); // L: 10595
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && ObjectSound.method1797(DirectByteArrayCopier.getWidgetFlags(var9))) { // L: 10597
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10598
								Client.field780 = true; // L: 10599
								Client.field727 = var10; // L: 10600
								Client.field782 = var11; // L: 10601
							}

							if (var9.hasListener) { // L: 10603
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10604
									var22 = new ScriptEvent(); // L: 10605
									var22.isMouseInputEvent = true; // L: 10606
									var22.widget = var9; // L: 10607
									var22.mouseY = Client.mouseWheelRotation; // L: 10608
									var22.args = var9.onScroll; // L: 10609
									Client.scriptEvents.addFirst(var22); // L: 10610
								}

								if (Client.clickedWidget != null || ClientPacket.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10612
									var21 = false; // L: 10613
									var34 = false; // L: 10614
									var33 = false; // L: 10615
								}

								if (!var9.isClicked && var21) { // L: 10617
									var9.isClicked = true; // L: 10618
									if (var9.onClick != null) { // L: 10619
										var22 = new ScriptEvent(); // L: 10620
										var22.isMouseInputEvent = true; // L: 10621
										var22.widget = var9; // L: 10622
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10623
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10624
										var22.args = var9.onClick; // L: 10625
										Client.scriptEvents.addFirst(var22); // L: 10626
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) { // L: 10629 10630
									var22 = new ScriptEvent(); // L: 10631
									var22.isMouseInputEvent = true; // L: 10632
									var22.widget = var9; // L: 10633
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10634
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10635
									var22.args = var9.onClickRepeat; // L: 10636
									Client.scriptEvents.addFirst(var22); // L: 10637
								}

								if (var9.isClicked && !var34) { // L: 10640
									var9.isClicked = false; // L: 10641
									if (var9.onRelease != null) { // L: 10642
										var22 = new ScriptEvent(); // L: 10643
										var22.isMouseInputEvent = true; // L: 10644
										var22.widget = var9; // L: 10645
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10646
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10647
										var22.args = var9.onRelease; // L: 10648
										Client.field688.addFirst(var22); // L: 10649
									}
								}

								if (var34 && var9.onHold != null) { // L: 10652 10653
									var22 = new ScriptEvent(); // L: 10654
									var22.isMouseInputEvent = true; // L: 10655
									var22.widget = var9; // L: 10656
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10657
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10658
									var22.args = var9.onHold; // L: 10659
									Client.scriptEvents.addFirst(var22); // L: 10660
								}

								if (!var9.containsMouse && var33) { // L: 10663
									var9.containsMouse = true; // L: 10664
									if (var9.onMouseOver != null) { // L: 10665
										var22 = new ScriptEvent(); // L: 10666
										var22.isMouseInputEvent = true; // L: 10667
										var22.widget = var9; // L: 10668
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10669
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10670
										var22.args = var9.onMouseOver; // L: 10671
										Client.scriptEvents.addFirst(var22); // L: 10672
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) { // L: 10675 10676
									var22 = new ScriptEvent(); // L: 10677
									var22.isMouseInputEvent = true; // L: 10678
									var22.widget = var9; // L: 10679
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10680
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10681
									var22.args = var9.onMouseRepeat; // L: 10682
									Client.scriptEvents.addFirst(var22); // L: 10683
								}

								if (var9.containsMouse && !var33) { // L: 10686
									var9.containsMouse = false; // L: 10687
									if (var9.onMouseLeave != null) { // L: 10688
										var22 = new ScriptEvent(); // L: 10689
										var22.isMouseInputEvent = true; // L: 10690
										var22.widget = var9; // L: 10691
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10692
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10693
										var22.args = var9.onMouseLeave; // L: 10694
										Client.field688.addFirst(var22); // L: 10695
									}
								}

								if (var9.onTimer != null) { // L: 10698
									var22 = new ScriptEvent(); // L: 10699
									var22.widget = var9; // L: 10700
									var22.args = var9.onTimer; // L: 10701
									Client.field806.addFirst(var22); // L: 10702
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field2760) { // L: 10704
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field2760 <= 32) { // L: 10705
										label781:
										for (var36 = var9.field2760; var36 < Client.changedVarpCount; ++var36) { // L: 10712
											var23 = Client.changedVarps[var36 & 31]; // L: 10713

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) { // L: 10714
												if (var23 == var9.varTransmitTriggers[var35]) { // L: 10715
													var25 = new ScriptEvent(); // L: 10716
													var25.widget = var9; // L: 10717
													var25.args = var9.onVarTransmit; // L: 10718
													Client.scriptEvents.addFirst(var25); // L: 10719
													break label781; // L: 10720
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10706
										var22.widget = var9; // L: 10707
										var22.args = var9.onVarTransmit; // L: 10708
										Client.scriptEvents.addFirst(var22); // L: 10709
									}

									var9.field2760 = Client.changedVarpCount; // L: 10725
								}

								if (var9.onInvTransmit != null && Client.field791 > var9.field2748) { // L: 10727
									if (var9.invTransmitTriggers != null && Client.field791 - var9.field2748 <= 32) { // L: 10728
										label757:
										for (var36 = var9.field2748; var36 < Client.field791; ++var36) { // L: 10735
											var23 = Client.changedItemContainers[var36 & 31]; // L: 10736

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) { // L: 10737
												if (var23 == var9.invTransmitTriggers[var35]) { // L: 10738
													var25 = new ScriptEvent(); // L: 10739
													var25.widget = var9; // L: 10740
													var25.args = var9.onInvTransmit; // L: 10741
													Client.scriptEvents.addFirst(var25); // L: 10742
													break label757; // L: 10743
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10729
										var22.widget = var9; // L: 10730
										var22.args = var9.onInvTransmit; // L: 10731
										Client.scriptEvents.addFirst(var22); // L: 10732
									}

									var9.field2748 = Client.field791; // L: 10748
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2754) { // L: 10750
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2754 <= 32) { // L: 10751
										label733:
										for (var36 = var9.field2754; var36 < Client.changedSkillsCount; ++var36) { // L: 10758
											var23 = Client.changedSkills[var36 & 31]; // L: 10759

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) { // L: 10760
												if (var23 == var9.statTransmitTriggers[var35]) { // L: 10761
													var25 = new ScriptEvent(); // L: 10762
													var25.widget = var9; // L: 10763
													var25.args = var9.onStatTransmit; // L: 10764
													Client.scriptEvents.addFirst(var25); // L: 10765
													break label733; // L: 10766
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10752
										var22.widget = var9; // L: 10753
										var22.args = var9.onStatTransmit; // L: 10754
										Client.scriptEvents.addFirst(var22); // L: 10755
									}

									var9.field2754 = Client.changedSkillsCount; // L: 10771
								}

								if (Client.chatCycle > var9.field2759 && var9.onChatTransmit != null) { // L: 10773
									var22 = new ScriptEvent(); // L: 10774
									var22.widget = var9; // L: 10775
									var22.args = var9.onChatTransmit; // L: 10776
									Client.scriptEvents.addFirst(var22); // L: 10777
								}

								if (Client.field797 > var9.field2759 && var9.onFriendTransmit != null) { // L: 10779
									var22 = new ScriptEvent(); // L: 10780
									var22.widget = var9; // L: 10781
									var22.args = var9.onFriendTransmit; // L: 10782
									Client.scriptEvents.addFirst(var22); // L: 10783
								}

								if (Client.field798 > var9.field2759 && var9.onClanTransmit != null) { // L: 10785
									var22 = new ScriptEvent(); // L: 10786
									var22.widget = var9; // L: 10787
									var22.args = var9.onClanTransmit; // L: 10788
									Client.scriptEvents.addFirst(var22); // L: 10789
								}

								if (Client.field786 > var9.field2759 && var9.field2736 != null) { // L: 10791
									var22 = new ScriptEvent(); // L: 10792
									var22.widget = var9; // L: 10793
									var22.args = var9.field2736; // L: 10794
									Client.scriptEvents.addFirst(var22); // L: 10795
								}

								if (Client.field800 > var9.field2759 && var9.field2655 != null) { // L: 10797
									var22 = new ScriptEvent(); // L: 10798
									var22.widget = var9; // L: 10799
									var22.args = var9.field2655; // L: 10800
									Client.scriptEvents.addFirst(var22); // L: 10801
								}

								if (Client.field801 > var9.field2759 && var9.onStockTransmit != null) { // L: 10803
									var22 = new ScriptEvent(); // L: 10804
									var22.widget = var9; // L: 10805
									var22.args = var9.onStockTransmit; // L: 10806
									Client.scriptEvents.addFirst(var22); // L: 10807
								}

								if (Client.field802 > var9.field2759 && var9.field2743 != null) { // L: 10809
									var22 = new ScriptEvent(); // L: 10810
									var22.widget = var9; // L: 10811
									var22.args = var9.field2743; // L: 10812
									Client.scriptEvents.addFirst(var22); // L: 10813
								}

								if (Client.field803 > var9.field2759 && var9.onMiscTransmit != null) { // L: 10815
									var22 = new ScriptEvent(); // L: 10816
									var22.widget = var9; // L: 10817
									var22.args = var9.onMiscTransmit; // L: 10818
									Client.scriptEvents.addFirst(var22); // L: 10819
								}

								var9.field2759 = Client.cycleCntr; // L: 10821
								if (var9.onKey != null) { // L: 10822
									for (var36 = 0; var36 < Client.field827; ++var36) { // L: 10823
										ScriptEvent var30 = new ScriptEvent(); // L: 10824
										var30.widget = var9; // L: 10825
										var30.keyTyped = Client.field792[var36]; // L: 10826
										var30.keyPressed = Client.field828[var36]; // L: 10827
										var30.args = var9.onKey; // L: 10828
										Client.scriptEvents.addFirst(var30); // L: 10829
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 10834
							if (Client.clickedWidget != null || ClientPacket.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10835
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10836
								if (var9.mouseOverRedirect >= 0) { // L: 10837
									Varps.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Varps.mousedOverWidgetIf1 = var9; // L: 10838
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10840
								Player.field1192 = var9; // L: 10841
							}

							if (var9.scrollHeight > var9.height) { // L: 10843
								LoginType.method6344(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 10845
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 10846
							if (var9.children != null) { // L: 10847
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 10848
							if (var28 != null) { // L: 10849
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 10850
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10851
										if (var29.isMouseInputEvent) { // L: 10852
											var29.remove(); // L: 10853
											var29.widget.containsMouse = false; // L: 10854
										}
									}

									if (class34.widgetDragDuration == 0) { // L: 10857
										Client.clickedWidget = null; // L: 10858
										Client.clickedWidgetParent = null; // L: 10859
									}

									if (!Client.isMenuOpen) { // L: 10861
										VerticalAlignment.addCancelMenuEntry(); // L: 10862
									}
								}

								class5.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 10865
							}
						}
					}
				}
			}
		}

	} // L: 10869
}
