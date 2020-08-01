import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class9 {
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 2090323123
	)
	static int field42;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "[Llz;"
	)
	@Export("mapMarkerSprites")
	static Sprite[] mapMarkerSprites;
	@ObfuscatedName("m")
	ExecutorService field45;
	@ObfuscatedName("o")
	Future field44;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	final Buffer field40;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	final class12 field41;

	@ObfuscatedSignature(
		descriptor = "(Lkn;Lc;)V"
	)
	public class9(Buffer var1, class12 var2) {
		this.field45 = Executors.newSingleThreadExecutor();
		this.field40 = var1;
		this.field41 = var2;
		this.method109();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1196678116"
	)
	public boolean method106() {
		return this.field44.isDone();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1944585860"
	)
	public void method107() {
		this.field45.shutdown();
		this.field45 = null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lkn;",
		garbageValue = "1647170417"
	)
	public Buffer method108() {
		try {
			return (Buffer)this.field44.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2093000238"
	)
	void method109() {
		this.field44 = this.field45.submit(new class8(this, this.field40, this.field41));
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lby;ZI)V",
		garbageValue = "928487649"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = class206.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = Language.getTileHeight(var0.x, var0.y, TileItemPile.Client_plane);
					var0.playerCycle = Client.cycle;
					UserComparator3.scene.addNullableObject(TileItemPile.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field648, var0.field649, var0.field650, var0.field651);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = Language.getTileHeight(var0.x, var0.y, TileItemPile.Client_plane);
					var0.playerCycle = Client.cycle;
					UserComparator3.scene.drawEntity(TileItemPile.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "([Lhd;IIIIIIII)V",
		garbageValue = "-1819097133"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || KeyHandler.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (Entity.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != WorldMapSection1.mousedOverWidgetIf1 && Entity.isComponentHidden(var9)) {
					continue;
				}

				int var10 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var18;
				int var26;
				if (var9.type == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					if (var9.type == 9) {
						var16 = var10;
						var26 = var11;
						var18 = var10 + var9.width;
						int var19 = var11 + var9.height;
						if (var18 < var10) {
							var16 = var18;
							var18 = var10;
						}

						if (var19 < var11) {
							var26 = var19;
							var19 = var11;
						}

						++var18;
						++var19;
						var12 = var16 > var2 ? var16 : var2;
						var13 = var26 > var3 ? var26 : var3;
						var14 = var18 < var4 ? var18 : var4;
						var15 = var19 < var5 ? var19 : var5;
					} else {
						var16 = var10 + var9.width;
						var26 = var11 + var9.height;
						var12 = var10 > var2 ? var10 : var2;
						var13 = var11 > var3 ? var11 : var3;
						var14 = var16 < var4 ? var16 : var4;
						var15 = var26 < var5 ? var26 : var5;
					}
				}

				if (var9 == Client.clickedWidget) {
					Client.field854 = true;
					Client.field855 = var10;
					Client.field856 = var11;
				}

				boolean var32 = false;
				if (var9.field2709) {
					switch(Client.field835) {
					case 0:
						var32 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field671 == var9.id >>> 16) {
							var32 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field671) {
							var32 = true;
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var17;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var17 = (ScriptEvent)Client.scriptEvents.last(); var17 != null; var17 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var17.isMouseInputEvent) {
										var17.remove();
										var17.widget.containsMouse = false;
									}
								}

								if (GrandExchangeOfferAgeComparator.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									FontName.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var17 = (ScriptEvent)Client.scriptEvents.last(); var17 != null; var17 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var17.isMouseInputEvent && var17.widget.onScroll == var17.args) {
									var17.remove();
								}
							}
						}
					}

					var26 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var26 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var33 = var26 >= var12 && var18 >= var13 && var26 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var33) {
							WorldMapData_1.addSceneMenuOptions(var26, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class1.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							class228.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var33) {
							if (var9.contentType == 1400) {
								class228.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var26, var18);
							} else {
								Message.Widget_addToMenu(var9, var26 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var32) {
							for (int var20 = 0; var20 < var9.field2647.length; ++var20) {
								var21 = false;
								boolean var22 = false;
								if (!var21 && var9.field2647[var20] != null) {
									for (var23 = 0; var23 < var9.field2647[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field2723 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2647[var20][var23]];
										}

										if (ArchiveDiskAction.method4302(var9.field2647[var20][var23]) || var24) {
											var21 = true;
											if (var9.field2723 != null && var9.field2723[var20] > Client.cycle) {
												break;
											}

											byte var31 = var9.field2678[var20][var23];
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var22 = true;
												break;
											}
										}
									}
								}

								if (var22) {
									if (var20 < 10) {
										class247.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										GrandExchangeOffer.Widget_runOnTargetLeave();
										AttackOption.selectSpell(var9.id, var9.childIndex, WorldMapID.Widget_unpackTargetMask(KeyHandler.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = WorldMapAreaData.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + ItemContainer.colorStartTag(16777215);
									}

									var23 = var9.field2679[var20];
									if (var9.field2723 == null) {
										var9.field2723 = new int[var9.field2647.length];
									}

									if (var9.field2680 == null) {
										var9.field2680 = new int[var9.field2647.length];
									}

									if (var23 != 0) {
										if (var9.field2723[var20] == 0) {
											var9.field2723[var20] = var23 + Client.cycle + var9.field2680[var20];
										} else {
											var9.field2723[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field2723[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field2723 != null) {
									var9.field2723[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var33 = true;
							} else {
								var33 = false;
							}

							boolean var34 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !ArchiveLoader.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) {
								var34 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !ArchiveLoader.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class60.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								class228.worldMap.method6693(var26, var18, var33 & var34, var33 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && WorldMapScaleHandler.method819(KeyHandler.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field692 = true;
								Client.field852 = var10;
								Client.field853 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var27;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var27 = new ScriptEvent();
									var27.isMouseInputEvent = true;
									var27.widget = var9;
									var27.mouseY = Client.mouseWheelRotation;
									var27.args = var9.onScroll;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.clickedWidget != null || KeyHandler.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var34 = false;
									var33 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var27 = new ScriptEvent();
										var27.isMouseInputEvent = true;
										var27.widget = var9;
										var27.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
										var27.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var27.args = var9.onClick;
										Client.scriptEvents.addFirst(var27);
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) {
									var27 = new ScriptEvent();
									var27.isMouseInputEvent = true;
									var27.widget = var9;
									var27.mouseX = MouseHandler.MouseHandler_x - var10;
									var27.mouseY = MouseHandler.MouseHandler_y - var11;
									var27.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var27);
								}

								if (var9.isClicked && !var34) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var27 = new ScriptEvent();
										var27.isMouseInputEvent = true;
										var27.widget = var9;
										var27.mouseX = MouseHandler.MouseHandler_x - var10;
										var27.mouseY = MouseHandler.MouseHandler_y - var11;
										var27.args = var9.onRelease;
										Client.field691.addFirst(var27);
									}
								}

								if (var34 && var9.onHold != null) {
									var27 = new ScriptEvent();
									var27.isMouseInputEvent = true;
									var27.widget = var9;
									var27.mouseX = MouseHandler.MouseHandler_x - var10;
									var27.mouseY = MouseHandler.MouseHandler_y - var11;
									var27.args = var9.onHold;
									Client.scriptEvents.addFirst(var27);
								}

								if (!var9.containsMouse && var33) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var27 = new ScriptEvent();
										var27.isMouseInputEvent = true;
										var27.widget = var9;
										var27.mouseX = MouseHandler.MouseHandler_x - var10;
										var27.mouseY = MouseHandler.MouseHandler_y - var11;
										var27.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var27);
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) {
									var27 = new ScriptEvent();
									var27.isMouseInputEvent = true;
									var27.widget = var9;
									var27.mouseX = MouseHandler.MouseHandler_x - var10;
									var27.mouseY = MouseHandler.MouseHandler_y - var11;
									var27.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var27);
								}

								if (var9.containsMouse && !var33) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var27 = new ScriptEvent();
										var27.isMouseInputEvent = true;
										var27.widget = var9;
										var27.mouseX = MouseHandler.MouseHandler_x - var10;
										var27.mouseY = MouseHandler.MouseHandler_y - var11;
										var27.args = var9.onMouseLeave;
										Client.field691.addFirst(var27);
									}
								}

								if (var9.onTimer != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onTimer;
									Client.field891.addFirst(var27);
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.field860 > var9.field2736) {
									if (var9.varTransmitTriggers != null && Client.field860 - var9.field2736 <= 32) {
										label877:
										for (var35 = var9.field2736; var35 < Client.field860; ++var35) {
											var23 = Client.field859[var35 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label877;
												}
											}
										}
									} else {
										var27 = new ScriptEvent();
										var27.widget = var9;
										var27.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var27);
									}

									var9.field2736 = Client.field860;
								}

								if (var9.onInvTransmit != null && Client.field878 > var9.field2643) {
									if (var9.invTransmitTriggers != null && Client.field878 - var9.field2643 <= 32) {
										label853:
										for (var35 = var9.field2643; var35 < Client.field878; ++var35) {
											var23 = Client.changedItemContainers[var35 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label853;
												}
											}
										}
									} else {
										var27 = new ScriptEvent();
										var27.widget = var9;
										var27.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var27);
									}

									var9.field2643 = Client.field878;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2721) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2721 <= 32) {
										label829:
										for (var35 = var9.field2721; var35 < Client.changedSkillsCount; ++var35) {
											var23 = Client.changedSkills[var35 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label829;
												}
											}
										}
									} else {
										var27 = new ScriptEvent();
										var27.widget = var9;
										var27.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var27);
									}

									var9.field2721 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field2735 && var9.onChatTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field866 > var9.field2735 && var9.onFriendTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field943 > var9.field2735 && var9.onClanTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field818 > var9.field2735 && var9.onStockTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field869 > var9.field2735 && var9.field2719 != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.field2719;
									Client.scriptEvents.addFirst(var27);
								}

								if (Client.field870 > var9.field2735 && var9.onMiscTransmit != null) {
									var27 = new ScriptEvent();
									var27.widget = var9;
									var27.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var27);
								}

								var9.field2735 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var35 = 0; var35 < Client.field894; ++var35) {
										ScriptEvent var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = Client.field896[var35];
										var30.keyPressed = Client.field920[var35];
										var30.args = var9.onKey;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || KeyHandler.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									WorldMapSection1.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									WorldMapSection1.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								SecureRandomCallable.field542 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								Coord.method4135(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var28 != null) {
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var29.isMouseInputEvent) {
											var29.remove();
											var29.widget.containsMouse = false;
										}
									}

									if (GrandExchangeOfferAgeComparator.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										FontName.addCancelMenuEntry();
									}
								}

								MusicPatchNode.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1962834261"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (ClientPreferences.clanChat != null) {
			PacketBufferNode var1 = UserComparator4.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
