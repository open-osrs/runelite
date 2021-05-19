import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public final class class32 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1588023984"
	)
	public static void method365() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 404
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 405
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 406
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 407
	} // L: 408

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1988985171"
	)
	static void method367() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4664
			addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4665
		}

	} // L: 4667

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lcg;ZI)V",
		garbageValue = "1577475793"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4670
			var0.isUnanimated = false; // L: 4671
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4672 4673
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4675
			int var3 = var0.y >> 7; // L: 4676
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4677
				long var4 = class17.calculateTag(0, 0, 0, false, var0.index); // L: 4678
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4679
					var0.isUnanimated = false; // L: 4680
					var0.tileHeight = SceneTilePaint.getTileHeight(var0.x, var0.y, ParamComposition.Client_plane); // L: 4681
					var0.playerCycle = Client.cycle; // L: 4682
					class5.scene.addNullableObject(ParamComposition.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4683
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4686
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4687
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4688
					}

					var0.tileHeight = SceneTilePaint.getTileHeight(var0.x, var0.y, ParamComposition.Client_plane); // L: 4690
					var0.playerCycle = Client.cycle; // L: 4691
					class5.scene.drawEntity(ParamComposition.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4692
				}
			}
		}

	} // L: 4696

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Liv;Lez;IIZI)V",
		garbageValue = "-1962227486"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10260
		byte var6 = -1; // L: 10261
		String var7 = null; // L: 10262
		if (var5 != null && var5[var3] != null) { // L: 10263
			if (var3 == 0) { // L: 10264
				var6 = 33;
			} else if (var3 == 1) { // L: 10265
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 10266
			} else if (var3 == 3) { // L: 10267
				var6 = 36;
			} else {
				var6 = 37; // L: 10268
			}

			var7 = var5[var3]; // L: 10269
		} else if (var3 == 4) { // L: 10272
			var6 = 37; // L: 10273
			var7 = "Drop"; // L: 10274
		}

		if (var6 != -1 && var7 != null) { // L: 10277
			class311.insertMenuItem(var7, HorizontalAlignment.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 10278
		}

	} // L: 10280

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIIIIII)V",
		garbageValue = "-1124545705"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10469
			Widget var9 = var0[var8]; // L: 10470
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class26.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 10471 10472 10473
				if (var9.isIf3) { // L: 10474
					if (class11.isComponentHidden(var9)) { // L: 10475
						continue;
					}
				} else if (var9.type == 0 && var9 != SpriteMask.mousedOverWidgetIf1 && class11.isComponentHidden(var9)) { // L: 10478
					continue;
				}

				int var10 = var9.x + var6; // L: 10480
				int var11 = var7 + var9.y; // L: 10481
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10486
					var12 = var2; // L: 10487
					var13 = var3; // L: 10488
					var14 = var4; // L: 10489
					var15 = var5; // L: 10490
				} else {
					int var16;
					if (var9.type == 9) { // L: 10492
						var16 = var10; // L: 10493
						var17 = var11; // L: 10494
						var18 = var10 + var9.width; // L: 10495
						int var19 = var11 + var9.height; // L: 10496
						if (var18 < var10) { // L: 10497
							var16 = var18; // L: 10499
							var18 = var10; // L: 10500
						}

						if (var19 < var11) { // L: 10502
							var17 = var19; // L: 10504
							var19 = var11; // L: 10505
						}

						++var18; // L: 10507
						++var19; // L: 10508
						var12 = var16 > var2 ? var16 : var2; // L: 10509
						var13 = var17 > var3 ? var17 : var3; // L: 10510
						var14 = var18 < var4 ? var18 : var4; // L: 10511
						var15 = var19 < var5 ? var19 : var5; // L: 10512
					} else {
						var16 = var10 + var9.width; // L: 10515
						var17 = var11 + var9.height; // L: 10516
						var12 = var10 > var2 ? var10 : var2; // L: 10517
						var13 = var11 > var3 ? var11 : var3; // L: 10518
						var14 = var16 < var4 ? var16 : var4; // L: 10519
						var15 = var17 < var5 ? var17 : var5; // L: 10520
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10522
					Client.field797 = true; // L: 10523
					Client.field871 = var10; // L: 10524
					Client.field798 = var11; // L: 10525
				}

				boolean var32 = false; // L: 10527
				if (var9.field2985) { // L: 10528
					switch(Client.field778) { // L: 10529
					case 0:
						var32 = true; // L: 10536
					case 1:
					default:
						break;
					case 2:
						if (Client.field779 == var9.id >>> 16) { // L: 10539
							var32 = true; // L: 10540
						}
						break;
					case 3:
						if (var9.id == Client.field779) { // L: 10531
							var32 = true; // L: 10532
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10545
					if (var9.isIf3) { // L: 10546
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 10547
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10548
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10549
									if (var26.isMouseInputEvent) { // L: 10550
										var26.remove(); // L: 10551
										var26.widget.containsMouse = false; // L: 10552
									}
								}

								if (class288.widgetDragDuration == 0) { // L: 10555
									Client.clickedWidget = null; // L: 10556
									Client.clickedWidgetParent = null; // L: 10557
								}

								if (!Client.isMenuOpen) { // L: 10559
									WorldMapEvent.addCancelMenuEntry(); // L: 10560
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10564 10565
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10566
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10567
									var26.remove(); // L: 10568
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10574
					var18 = MouseHandler.MouseHandler_y; // L: 10575
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10576
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10577
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10578
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10580
					if (var9.contentType == 1337) { // L: 10581
						if (!Client.isLoading && !Client.isMenuOpen && var33) { // L: 10582
							ScriptEvent.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10585
						WorldMapCacheName.checkIfMinimapClicked(var9, var10, var11); // L: 10586
					} else {
						if (var9.contentType == 1400) { // L: 10589
							NetSocket.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height); // L: 10590
						}

						if (!Client.isMenuOpen && var33) { // L: 10592
							if (var9.contentType == 1400) { // L: 10593
								NetSocket.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10594
							} else {
								class2.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10597
							}
						}

						boolean var21;
						int var23;
						if (var32) { // L: 10600
							for (int var20 = 0; var20 < var9.field3039.length; ++var20) { // L: 10601
								var21 = false; // L: 10602
								boolean var27 = false; // L: 10603
								if (!var21 && var9.field3039[var20] != null) { // L: 10604
									for (var23 = 0; var23 < var9.field3039[var20].length; ++var23) { // L: 10605
										boolean var24 = false; // L: 10606
										if (var9.field3105 != null) { // L: 10607
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3039[var20][var23]]; // L: 10608
										}

										if (Canvas.method467(var9.field3039[var20][var23]) || var24) { // L: 10610
											var21 = true; // L: 10611
											if (var9.field3105 != null && var9.field3105[var20] > Client.cycle) { // L: 10612
												break;
											}

											byte var31 = var9.field2987[var20][var23]; // L: 10613
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10614 10615 10616 10617 10618
												var27 = true; // L: 10620
												break;
											}
										}
									}
								}

								if (var27) { // L: 10626
									if (var20 < 10) { // L: 10627
										class245.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10628
										class15.Widget_runOnTargetLeave(); // L: 10629
										GrandExchangeOffer.selectSpell(var9.id, var9.childIndex, AttackOption.Widget_unpackTargetMask(class26.getWidgetFlags(var9)), var9.itemId); // L: 10630
										Client.selectedSpellActionName = UserComparator9.Widget_getSpellActionName(var9); // L: 10631
										if (Client.selectedSpellActionName == null) { // L: 10632
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + HorizontalAlignment.colorStartTag(16777215); // L: 10633
									}

									var23 = var9.field3070[var20]; // L: 10635
									if (var9.field3105 == null) { // L: 10636
										var9.field3105 = new int[var9.field3039.length];
									}

									if (var9.field3090 == null) { // L: 10637
										var9.field3090 = new int[var9.field3039.length];
									}

									if (var23 != 0) { // L: 10638
										if (var9.field3105[var20] == 0) { // L: 10639
											var9.field3105[var20] = var23 + Client.cycle + var9.field3090[var20];
										} else {
											var9.field3105[var20] = var23 + Client.cycle; // L: 10640
										}
									} else {
										var9.field3105[var20] = Integer.MAX_VALUE; // L: 10642
									}
								}

								if (!var21 && var9.field3105 != null) { // L: 10644 10645
									var9.field3105[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10649
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10650
								var33 = true;
							} else {
								var33 = false; // L: 10651
							}

							boolean var34 = false; // L: 10652
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) { // L: 10653
								var34 = true;
							}

							var21 = false; // L: 10654
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10655
								var21 = true;
							}

							if (var21) { // L: 10656
								class214.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10657
								NetSocket.worldMap.method5953(var17, var18, var33 & var34, var33 & var21); // L: 10658
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && class2.method28(class26.getWidgetFlags(var9))) { // L: 10660
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10661
								Client.field794 = true; // L: 10662
								Client.field795 = var10; // L: 10663
								Client.field785 = var11; // L: 10664
							}

							if (var9.hasListener) { // L: 10666
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10667
									var22 = new ScriptEvent(); // L: 10668
									var22.isMouseInputEvent = true; // L: 10669
									var22.widget = var9; // L: 10670
									var22.mouseY = Client.mouseWheelRotation; // L: 10671
									var22.args = var9.onScroll; // L: 10672
									Client.scriptEvents.addFirst(var22); // L: 10673
								}

								if (Client.clickedWidget != null || class34.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10675
									var21 = false; // L: 10676
									var34 = false; // L: 10677
									var33 = false; // L: 10678
								}

								if (!var9.isClicked && var21) { // L: 10680
									var9.isClicked = true; // L: 10681
									if (var9.onClick != null) { // L: 10682
										var22 = new ScriptEvent(); // L: 10683
										var22.isMouseInputEvent = true; // L: 10684
										var22.widget = var9; // L: 10685
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10686
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10687
										var22.args = var9.onClick; // L: 10688
										Client.scriptEvents.addFirst(var22); // L: 10689
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) { // L: 10692 10693
									var22 = new ScriptEvent(); // L: 10694
									var22.isMouseInputEvent = true; // L: 10695
									var22.widget = var9; // L: 10696
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10697
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10698
									var22.args = var9.onClickRepeat; // L: 10699
									Client.scriptEvents.addFirst(var22); // L: 10700
								}

								if (var9.isClicked && !var34) { // L: 10703
									var9.isClicked = false; // L: 10704
									if (var9.onRelease != null) { // L: 10705
										var22 = new ScriptEvent(); // L: 10706
										var22.isMouseInputEvent = true; // L: 10707
										var22.widget = var9; // L: 10708
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10709
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10710
										var22.args = var9.onRelease; // L: 10711
										Client.field821.addFirst(var22); // L: 10712
									}
								}

								if (var34 && var9.onHold != null) { // L: 10715 10716
									var22 = new ScriptEvent(); // L: 10717
									var22.isMouseInputEvent = true; // L: 10718
									var22.widget = var9; // L: 10719
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10720
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10721
									var22.args = var9.onHold; // L: 10722
									Client.scriptEvents.addFirst(var22); // L: 10723
								}

								if (!var9.containsMouse && var33) { // L: 10726
									var9.containsMouse = true; // L: 10727
									if (var9.onMouseOver != null) { // L: 10728
										var22 = new ScriptEvent(); // L: 10729
										var22.isMouseInputEvent = true; // L: 10730
										var22.widget = var9; // L: 10731
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10732
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10733
										var22.args = var9.onMouseOver; // L: 10734
										Client.scriptEvents.addFirst(var22); // L: 10735
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) { // L: 10738 10739
									var22 = new ScriptEvent(); // L: 10740
									var22.isMouseInputEvent = true; // L: 10741
									var22.widget = var9; // L: 10742
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10743
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10744
									var22.args = var9.onMouseRepeat; // L: 10745
									Client.scriptEvents.addFirst(var22); // L: 10746
								}

								if (var9.containsMouse && !var33) { // L: 10749
									var9.containsMouse = false; // L: 10750
									if (var9.onMouseLeave != null) { // L: 10751
										var22 = new ScriptEvent(); // L: 10752
										var22.isMouseInputEvent = true; // L: 10753
										var22.widget = var9; // L: 10754
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10755
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10756
										var22.args = var9.onMouseLeave; // L: 10757
										Client.field821.addFirst(var22); // L: 10758
									}
								}

								if (var9.onTimer != null) { // L: 10761
									var22 = new ScriptEvent(); // L: 10762
									var22.widget = var9; // L: 10763
									var22.args = var9.onTimer; // L: 10764
									Client.field865.addFirst(var22); // L: 10765
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3100) { // L: 10767
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3100 <= 32) { // L: 10768
										label791:
										for (var36 = var9.field3100; var36 < Client.changedVarpCount; ++var36) { // L: 10775
											var23 = Client.changedVarps[var36 & 31]; // L: 10776

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) { // L: 10777
												if (var23 == var9.varTransmitTriggers[var35]) { // L: 10778
													var25 = new ScriptEvent(); // L: 10779
													var25.widget = var9; // L: 10780
													var25.args = var9.onVarTransmit; // L: 10781
													Client.scriptEvents.addFirst(var25); // L: 10782
													break label791; // L: 10783
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10769
										var22.widget = var9; // L: 10770
										var22.args = var9.onVarTransmit; // L: 10771
										Client.scriptEvents.addFirst(var22); // L: 10772
									}

									var9.field3100 = Client.changedVarpCount; // L: 10788
								}

								if (var9.onInvTransmit != null && Client.field805 > var9.field3101) { // L: 10790
									if (var9.invTransmitTriggers != null && Client.field805 - var9.field3101 <= 32) { // L: 10791
										label767:
										for (var36 = var9.field3101; var36 < Client.field805; ++var36) { // L: 10798
											var23 = Client.changedItemContainers[var36 & 31]; // L: 10799

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) { // L: 10800
												if (var23 == var9.invTransmitTriggers[var35]) { // L: 10801
													var25 = new ScriptEvent(); // L: 10802
													var25.widget = var9; // L: 10803
													var25.args = var9.onInvTransmit; // L: 10804
													Client.scriptEvents.addFirst(var25); // L: 10805
													break label767; // L: 10806
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10792
										var22.widget = var9; // L: 10793
										var22.args = var9.onInvTransmit; // L: 10794
										Client.scriptEvents.addFirst(var22); // L: 10795
									}

									var9.field3101 = Client.field805; // L: 10811
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3049) { // L: 10813
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3049 <= 32) { // L: 10814
										label743:
										for (var36 = var9.field3049; var36 < Client.changedSkillsCount; ++var36) { // L: 10821
											var23 = Client.changedSkills[var36 & 31]; // L: 10822

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) { // L: 10823
												if (var23 == var9.statTransmitTriggers[var35]) { // L: 10824
													var25 = new ScriptEvent(); // L: 10825
													var25.widget = var9; // L: 10826
													var25.args = var9.onStatTransmit; // L: 10827
													Client.scriptEvents.addFirst(var25); // L: 10828
													break label743; // L: 10829
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10815
										var22.widget = var9; // L: 10816
										var22.args = var9.onStatTransmit; // L: 10817
										Client.scriptEvents.addFirst(var22); // L: 10818
									}

									var9.field3049 = Client.changedSkillsCount; // L: 10834
								}

								if (Client.chatCycle > var9.field3015 && var9.onChatTransmit != null) { // L: 10836
									var22 = new ScriptEvent(); // L: 10837
									var22.widget = var9; // L: 10838
									var22.args = var9.onChatTransmit; // L: 10839
									Client.scriptEvents.addFirst(var22); // L: 10840
								}

								if (Client.field801 > var9.field3015 && var9.onFriendTransmit != null) { // L: 10842
									var22 = new ScriptEvent(); // L: 10843
									var22.widget = var9; // L: 10844
									var22.args = var9.onFriendTransmit; // L: 10845
									Client.scriptEvents.addFirst(var22); // L: 10846
								}

								if (Client.field698 > var9.field3015 && var9.onClanTransmit != null) { // L: 10848
									var22 = new ScriptEvent(); // L: 10849
									var22.widget = var9; // L: 10850
									var22.args = var9.onClanTransmit; // L: 10851
									Client.scriptEvents.addFirst(var22); // L: 10852
								}

								if (Client.field822 > var9.field3015 && var9.field3076 != null) { // L: 10854
									var22 = new ScriptEvent(); // L: 10855
									var22.widget = var9; // L: 10856
									var22.args = var9.field3076; // L: 10857
									Client.scriptEvents.addFirst(var22); // L: 10858
								}

								if (Client.field814 > var9.field3015 && var9.field2974 != null) { // L: 10860
									var22 = new ScriptEvent(); // L: 10861
									var22.widget = var9; // L: 10862
									var22.args = var9.field2974; // L: 10863
									Client.scriptEvents.addFirst(var22); // L: 10864
								}

								if (Client.field815 > var9.field3015 && var9.onStockTransmit != null) { // L: 10866
									var22 = new ScriptEvent(); // L: 10867
									var22.widget = var9; // L: 10868
									var22.args = var9.onStockTransmit; // L: 10869
									Client.scriptEvents.addFirst(var22); // L: 10870
								}

								if (Client.field816 > var9.field3015 && var9.field3004 != null) { // L: 10872
									var22 = new ScriptEvent(); // L: 10873
									var22.widget = var9; // L: 10874
									var22.args = var9.field3004; // L: 10875
									Client.scriptEvents.addFirst(var22); // L: 10876
								}

								if (Client.field731 > var9.field3015 && var9.onMiscTransmit != null) { // L: 10878
									var22 = new ScriptEvent(); // L: 10879
									var22.widget = var9; // L: 10880
									var22.args = var9.onMiscTransmit; // L: 10881
									Client.scriptEvents.addFirst(var22); // L: 10882
								}

								var9.field3015 = Client.cycleCntr; // L: 10884
								if (var9.onKey != null) { // L: 10885
									for (var36 = 0; var36 < Client.field842; ++var36) { // L: 10886
										ScriptEvent var30 = new ScriptEvent(); // L: 10887
										var30.widget = var9; // L: 10888
										var30.keyTyped = Client.field844[var36]; // L: 10889
										var30.keyPressed = Client.field746[var36]; // L: 10890
										var30.args = var9.onKey; // L: 10891
										Client.scriptEvents.addFirst(var30); // L: 10892
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 10897
							if (Client.clickedWidget != null || class34.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10898
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10899
								if (var9.mouseOverRedirect >= 0) { // L: 10900
									SpriteMask.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									SpriteMask.mousedOverWidgetIf1 = var9; // L: 10901
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10903
								class34.field241 = var9; // L: 10904
							}

							if (var9.scrollHeight > var9.height) { // L: 10906
								SpriteMask.method4580(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 10908
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 10909
							if (var9.children != null) { // L: 10910
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 10911
							if (var28 != null) { // L: 10912
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 10913
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10914
										if (var29.isMouseInputEvent) { // L: 10915
											var29.remove(); // L: 10916
											var29.widget.containsMouse = false; // L: 10917
										}
									}

									if (class288.widgetDragDuration == 0) { // L: 10920
										Client.clickedWidget = null; // L: 10921
										Client.clickedWidgetParent = null; // L: 10922
									}

									if (!Client.isMenuOpen) { // L: 10924
										WorldMapEvent.addCancelMenuEntry(); // L: 10925
									}
								}

								Clock.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 10928
							}
						}
					}
				}
			}
		}

	} // L: 10932
}
