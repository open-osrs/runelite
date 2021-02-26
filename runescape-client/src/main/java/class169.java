import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public enum class169 implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field2013(3, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field2011(2, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field2012(1, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field2018(0, 3);

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -786899821
	)
	public final int field2014;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1802409949
	)
	@Export("id")
	final int id;

	class169(int var3, int var4) {
		this.field2014 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 21
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lie;",
		garbageValue = "-825659067"
	)
	static VerticalAlignment[] method3631() {
		return new VerticalAlignment[]{VerticalAlignment.field3236, VerticalAlignment.field3234, VerticalAlignment.VerticalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Ljs;IIII)V",
		garbageValue = "1515768650"
	)
	static void method3637(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && WorldMapSectionType.clientPreferences.areaSoundEffectsVolume != 0) { // L: 3356
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3357
				int var4 = var0.soundEffects[var1]; // L: 3358
				if (var4 != 0) { // L: 3359
					int var5 = var4 >> 8; // L: 3360
					int var6 = var4 >> 4 & 7; // L: 3361
					int var7 = var4 & 15; // L: 3362
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 3363
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 3364
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3365
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3366
					int var8 = (var2 - 64) / 128; // L: 3367
					int var9 = (var3 - 64) / 128; // L: 3368
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16); // L: 3369
					++Client.soundEffectCount; // L: 3370
				}
			}
		}
	} // L: 3371

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "([Lhz;IIIIIIII)V",
		garbageValue = "-1265489045"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10379
			Widget var9 = var0[var8]; // L: 10380
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class60.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 10381 10382 10383
				if (var9.isIf3) { // L: 10384
					if (DevicePcmPlayerProvider.isComponentHidden(var9)) { // L: 10385
						continue;
					}
				} else if (var9.type == 0 && var9 != Canvas.mousedOverWidgetIf1 && DevicePcmPlayerProvider.isComponentHidden(var9)) { // L: 10388
					continue;
				}

				int var10 = var9.x + var6; // L: 10390
				int var11 = var7 + var9.y; // L: 10391
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10396
					var12 = var2; // L: 10397
					var13 = var3; // L: 10398
					var14 = var4; // L: 10399
					var15 = var5; // L: 10400
				} else {
					int var16;
					if (var9.type == 9) { // L: 10402
						var16 = var10; // L: 10403
						var17 = var11; // L: 10404
						var18 = var10 + var9.width; // L: 10405
						int var19 = var11 + var9.height; // L: 10406
						if (var18 < var10) { // L: 10407
							var16 = var18; // L: 10409
							var18 = var10; // L: 10410
						}

						if (var19 < var11) { // L: 10412
							var17 = var19; // L: 10414
							var19 = var11; // L: 10415
						}

						++var18; // L: 10417
						++var19; // L: 10418
						var12 = var16 > var2 ? var16 : var2; // L: 10419
						var13 = var17 > var3 ? var17 : var3; // L: 10420
						var14 = var18 < var4 ? var18 : var4; // L: 10421
						var15 = var19 < var5 ? var19 : var5; // L: 10422
					} else {
						var16 = var10 + var9.width; // L: 10425
						var17 = var11 + var9.height; // L: 10426
						var12 = var10 > var2 ? var10 : var2; // L: 10427
						var13 = var11 > var3 ? var11 : var3; // L: 10428
						var14 = var16 < var4 ? var16 : var4; // L: 10429
						var15 = var17 < var5 ? var17 : var5; // L: 10430
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10432
					Client.field754 = true; // L: 10433
					Client.field784 = var10; // L: 10434
					Client.field847 = var11; // L: 10435
				}

				boolean var32 = false; // L: 10437
				if (var9.field2667) { // L: 10438
					switch(Client.field705) { // L: 10439
					case 0:
						var32 = true; // L: 10451
					case 1:
					default:
						break;
					case 2:
						if (Client.field699 == var9.id >>> 16) { // L: 10441
							var32 = true; // L: 10442
						}
						break;
					case 3:
						if (var9.id == Client.field699) { // L: 10446
							var32 = true; // L: 10447
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10455
					if (var9.isIf3) { // L: 10456
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 10457
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10458
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10459
									if (var26.isMouseInputEvent) { // L: 10460
										var26.remove(); // L: 10461
										var26.widget.containsMouse = false; // L: 10462
									}
								}

								if (PlayerComposition.widgetDragDuration == 0) { // L: 10465
									Client.clickedWidget = null; // L: 10466
									Client.clickedWidgetParent = null; // L: 10467
								}

								if (!Client.isMenuOpen) { // L: 10469
									Player.addCancelMenuEntry(); // L: 10470
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10474 10475
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10476
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10477
									var26.remove(); // L: 10478
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10484
					var18 = MouseHandler.MouseHandler_y; // L: 10485
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10486
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10487
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10488
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10490
					if (var9.contentType == 1337) { // L: 10491
						if (!Client.isLoading && !Client.isMenuOpen && var33) { // L: 10492
							Projectile.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10495
						SecureRandomCallable.checkIfMinimapClicked(var9, var10, var11); // L: 10496
					} else {
						if (var9.contentType == 1400) { // L: 10499
							SoundSystem.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height); // L: 10500
						}

						if (!Client.isMenuOpen && var33) { // L: 10502
							if (var9.contentType == 1400) { // L: 10503
								SoundSystem.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10504
							} else {
								class58.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10507
							}
						}

						boolean var21;
						int var23;
						if (var32) { // L: 10510
							for (int var20 = 0; var20 < var9.field2668.length; ++var20) { // L: 10511
								var21 = false; // L: 10512
								boolean var27 = false; // L: 10513
								if (!var21 && var9.field2668[var20] != null) { // L: 10514
									for (var23 = 0; var23 < var9.field2668[var20].length; ++var23) { // L: 10515
										boolean var24 = false; // L: 10516
										if (var9.field2660 != null) { // L: 10517
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2668[var20][var23]]; // L: 10518
										}

										if (WorldMapLabel.method503(var9.field2668[var20][var23]) || var24) { // L: 10520
											var21 = true; // L: 10521
											if (var9.field2660 != null && var9.field2660[var20] > Client.cycle) { // L: 10522
												break;
											}

											byte var31 = var9.field2669[var20][var23]; // L: 10523
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10524 10525 10526 10527 10528
												var27 = true; // L: 10530
												break;
											}
										}
									}
								}

								if (var27) { // L: 10536
									if (var20 < 10) { // L: 10537
										ApproximateRouteStrategy.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10538
										WorldMapSection2.Widget_runOnTargetLeave(); // L: 10539
										ArchiveDisk.selectSpell(var9.id, var9.childIndex, MusicPatch.Widget_unpackTargetMask(class60.getWidgetFlags(var9)), var9.itemId); // L: 10540
										Client.selectedSpellActionName = Player.Widget_getSpellActionName(var9); // L: 10541
										if (Client.selectedSpellActionName == null) { // L: 10542
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + FileSystem.colorStartTag(16777215); // L: 10543
									}

									var23 = var9.field2686[var20]; // L: 10545
									if (var9.field2660 == null) { // L: 10546
										var9.field2660 = new int[var9.field2668.length];
									}

									if (var9.field2599 == null) { // L: 10547
										var9.field2599 = new int[var9.field2668.length];
									}

									if (var23 != 0) { // L: 10548
										if (var9.field2660[var20] == 0) { // L: 10549
											var9.field2660[var20] = var23 + Client.cycle + var9.field2599[var20];
										} else {
											var9.field2660[var20] = var23 + Client.cycle; // L: 10550
										}
									} else {
										var9.field2660[var20] = Integer.MAX_VALUE; // L: 10552
									}
								}

								if (!var21 && var9.field2660 != null) { // L: 10554 10555
									var9.field2660[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10559
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10560
								var33 = true;
							} else {
								var33 = false; // L: 10561
							}

							boolean var34 = false; // L: 10562
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) { // L: 10563
								var34 = true;
							}

							var21 = false; // L: 10564
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10565
								var21 = true;
							}

							if (var21) { // L: 10566
								FriendSystem.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10567
								SoundSystem.worldMap.method6525(var17, var18, var33 & var34, var33 & var21); // L: 10568
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && CollisionMap.method3781(class60.getWidgetFlags(var9))) { // L: 10570
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10571
								Client.field912 = true; // L: 10572
								Client.field714 = var10; // L: 10573
								Client.field844 = var11; // L: 10574
							}

							if (var9.hasListener) { // L: 10576
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10577
									var22 = new ScriptEvent(); // L: 10578
									var22.isMouseInputEvent = true; // L: 10579
									var22.widget = var9; // L: 10580
									var22.mouseY = Client.mouseWheelRotation; // L: 10581
									var22.args = var9.onScroll; // L: 10582
									Client.scriptEvents.addFirst(var22); // L: 10583
								}

								if (Client.clickedWidget != null || JagexCache.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10585
									var21 = false; // L: 10586
									var34 = false; // L: 10587
									var33 = false; // L: 10588
								}

								if (!var9.isClicked && var21) { // L: 10590
									var9.isClicked = true; // L: 10591
									if (var9.onClick != null) { // L: 10592
										var22 = new ScriptEvent(); // L: 10593
										var22.isMouseInputEvent = true; // L: 10594
										var22.widget = var9; // L: 10595
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10596
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10597
										var22.args = var9.onClick; // L: 10598
										Client.scriptEvents.addFirst(var22); // L: 10599
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) { // L: 10602 10603
									var22 = new ScriptEvent(); // L: 10604
									var22.isMouseInputEvent = true; // L: 10605
									var22.widget = var9; // L: 10606
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10607
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10608
									var22.args = var9.onClickRepeat; // L: 10609
									Client.scriptEvents.addFirst(var22); // L: 10610
								}

								if (var9.isClicked && !var34) { // L: 10613
									var9.isClicked = false; // L: 10614
									if (var9.onRelease != null) { // L: 10615
										var22 = new ScriptEvent(); // L: 10616
										var22.isMouseInputEvent = true; // L: 10617
										var22.widget = var9; // L: 10618
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10619
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10620
										var22.args = var9.onRelease; // L: 10621
										Client.field865.addFirst(var22); // L: 10622
									}
								}

								if (var34 && var9.onHold != null) { // L: 10625 10626
									var22 = new ScriptEvent(); // L: 10627
									var22.isMouseInputEvent = true; // L: 10628
									var22.widget = var9; // L: 10629
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10630
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10631
									var22.args = var9.onHold; // L: 10632
									Client.scriptEvents.addFirst(var22); // L: 10633
								}

								if (!var9.containsMouse && var33) { // L: 10636
									var9.containsMouse = true; // L: 10637
									if (var9.onMouseOver != null) { // L: 10638
										var22 = new ScriptEvent(); // L: 10639
										var22.isMouseInputEvent = true; // L: 10640
										var22.widget = var9; // L: 10641
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10642
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10643
										var22.args = var9.onMouseOver; // L: 10644
										Client.scriptEvents.addFirst(var22); // L: 10645
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) { // L: 10648 10649
									var22 = new ScriptEvent(); // L: 10650
									var22.isMouseInputEvent = true; // L: 10651
									var22.widget = var9; // L: 10652
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10653
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10654
									var22.args = var9.onMouseRepeat; // L: 10655
									Client.scriptEvents.addFirst(var22); // L: 10656
								}

								if (var9.containsMouse && !var33) { // L: 10659
									var9.containsMouse = false; // L: 10660
									if (var9.onMouseLeave != null) { // L: 10661
										var22 = new ScriptEvent(); // L: 10662
										var22.isMouseInputEvent = true; // L: 10663
										var22.widget = var9; // L: 10664
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10665
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10666
										var22.args = var9.onMouseLeave; // L: 10667
										Client.field865.addFirst(var22); // L: 10668
									}
								}

								if (var9.onTimer != null) { // L: 10671
									var22 = new ScriptEvent(); // L: 10672
									var22.widget = var9; // L: 10673
									var22.args = var9.onTimer; // L: 10674
									Client.field660.addFirst(var22); // L: 10675
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field2727) { // L: 10677
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field2727 <= 32) { // L: 10678
										label763:
										for (var36 = var9.field2727; var36 < Client.changedVarpCount; ++var36) { // L: 10685
											var23 = Client.changedVarps[var36 & 31]; // L: 10686

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) { // L: 10687
												if (var23 == var9.varTransmitTriggers[var35]) { // L: 10688
													var25 = new ScriptEvent(); // L: 10689
													var25.widget = var9; // L: 10690
													var25.args = var9.onVarTransmit; // L: 10691
													Client.scriptEvents.addFirst(var25); // L: 10692
													break label763; // L: 10693
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10679
										var22.widget = var9; // L: 10680
										var22.args = var9.onVarTransmit; // L: 10681
										Client.scriptEvents.addFirst(var22); // L: 10682
									}

									var9.field2727 = Client.changedVarpCount; // L: 10698
								}

								if (var9.onInvTransmit != null && Client.field870 > var9.field2728) { // L: 10700
									if (var9.invTransmitTriggers != null && Client.field870 - var9.field2728 <= 32) { // L: 10701
										label739:
										for (var36 = var9.field2728; var36 < Client.field870; ++var36) { // L: 10708
											var23 = Client.changedItemContainers[var36 & 31]; // L: 10709

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) { // L: 10710
												if (var23 == var9.invTransmitTriggers[var35]) { // L: 10711
													var25 = new ScriptEvent(); // L: 10712
													var25.widget = var9; // L: 10713
													var25.args = var9.onInvTransmit; // L: 10714
													Client.scriptEvents.addFirst(var25); // L: 10715
													break label739; // L: 10716
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10702
										var22.widget = var9; // L: 10703
										var22.args = var9.onInvTransmit; // L: 10704
										Client.scriptEvents.addFirst(var22); // L: 10705
									}

									var9.field2728 = Client.field870; // L: 10721
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2729) { // L: 10723
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2729 <= 32) { // L: 10724
										label715:
										for (var36 = var9.field2729; var36 < Client.changedSkillsCount; ++var36) { // L: 10731
											var23 = Client.changedSkills[var36 & 31]; // L: 10732

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) { // L: 10733
												if (var23 == var9.statTransmitTriggers[var35]) { // L: 10734
													var25 = new ScriptEvent(); // L: 10735
													var25.widget = var9; // L: 10736
													var25.args = var9.onStatTransmit; // L: 10737
													Client.scriptEvents.addFirst(var25); // L: 10738
													break label715; // L: 10739
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10725
										var22.widget = var9; // L: 10726
										var22.args = var9.onStatTransmit; // L: 10727
										Client.scriptEvents.addFirst(var22); // L: 10728
									}

									var9.field2729 = Client.changedSkillsCount; // L: 10744
								}

								if (Client.chatCycle > var9.field2719 && var9.onChatTransmit != null) { // L: 10746
									var22 = new ScriptEvent(); // L: 10747
									var22.widget = var9; // L: 10748
									var22.args = var9.onChatTransmit; // L: 10749
									Client.scriptEvents.addFirst(var22); // L: 10750
								}

								if (Client.field857 > var9.field2719 && var9.onFriendTransmit != null) { // L: 10752
									var22 = new ScriptEvent(); // L: 10753
									var22.widget = var9; // L: 10754
									var22.args = var9.onFriendTransmit; // L: 10755
									Client.scriptEvents.addFirst(var22); // L: 10756
								}

								if (Client.field858 > var9.field2719 && var9.onClanTransmit != null) { // L: 10758
									var22 = new ScriptEvent(); // L: 10759
									var22.widget = var9; // L: 10760
									var22.args = var9.onClanTransmit; // L: 10761
									Client.scriptEvents.addFirst(var22); // L: 10762
								}

								if (Client.field710 > var9.field2719 && var9.onStockTransmit != null) { // L: 10764
									var22 = new ScriptEvent(); // L: 10765
									var22.widget = var9; // L: 10766
									var22.args = var9.onStockTransmit; // L: 10767
									Client.scriptEvents.addFirst(var22); // L: 10768
								}

								if (Client.field860 > var9.field2719 && var9.field2678 != null) { // L: 10770
									var22 = new ScriptEvent(); // L: 10771
									var22.widget = var9; // L: 10772
									var22.args = var9.field2678; // L: 10773
									Client.scriptEvents.addFirst(var22); // L: 10774
								}

								if (Client.field861 > var9.field2719 && var9.onMiscTransmit != null) { // L: 10776
									var22 = new ScriptEvent(); // L: 10777
									var22.widget = var9; // L: 10778
									var22.args = var9.onMiscTransmit; // L: 10779
									Client.scriptEvents.addFirst(var22); // L: 10780
								}

								var9.field2719 = Client.cycleCntr; // L: 10782
								if (var9.onKey != null) { // L: 10783
									for (var36 = 0; var36 < Client.field885; ++var36) { // L: 10784
										ScriptEvent var30 = new ScriptEvent(); // L: 10785
										var30.widget = var9; // L: 10786
										var30.keyTyped = Client.field738[var36]; // L: 10787
										var30.keyPressed = Client.field886[var36]; // L: 10788
										var30.args = var9.onKey; // L: 10789
										Client.scriptEvents.addFirst(var30); // L: 10790
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 10795
							if (Client.clickedWidget != null || JagexCache.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10796
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10797
								if (var9.mouseOverRedirect >= 0) { // L: 10798
									Canvas.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Canvas.mousedOverWidgetIf1 = var9; // L: 10799
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10801
								GrandExchangeOffer.field100 = var9; // L: 10802
							}

							if (var9.scrollHeight > var9.height) { // L: 10804
								PrivateChatMode.method6107(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 10806
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 10807
							if (var9.children != null) { // L: 10808
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 10809
							if (var28 != null) { // L: 10810
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 10811
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10812
										if (var29.isMouseInputEvent) { // L: 10813
											var29.remove(); // L: 10814
											var29.widget.containsMouse = false; // L: 10815
										}
									}

									if (PlayerComposition.widgetDragDuration == 0) { // L: 10818
										Client.clickedWidget = null; // L: 10819
										Client.clickedWidgetParent = null; // L: 10820
									}

									if (!Client.isMenuOpen) { // L: 10822
										Player.addCancelMenuEntry(); // L: 10823
									}
								}

								class22.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 10826
							}
						}
					}
				}
			}
		}

	} // L: 10830
}
