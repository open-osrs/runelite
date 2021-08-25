import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1383346713
	)
	public int field3943;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("m")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lpp;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3943 = (int)(Occluder.method4335() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "([Ljd;IIIIIIII)V",
		garbageValue = "1659556559"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || Decimator.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (PcmPlayer.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class301.mousedOverWidgetIf1 && PcmPlayer.isComponentHidden(var9)) {
					continue;
				}

				int var10 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
					if (var9.type == 9) {
						var16 = var10;
						var17 = var11;
						var18 = var10 + var9.width;
						int var19 = var11 + var9.height;
						if (var18 < var10) {
							var16 = var18;
							var18 = var10;
						}

						if (var19 < var11) {
							var17 = var19;
							var19 = var11;
						}

						++var18;
						++var19;
						var12 = var16 > var2 ? var16 : var2;
						var13 = var17 > var3 ? var17 : var3;
						var14 = var18 < var4 ? var18 : var4;
						var15 = var19 < var5 ? var19 : var5;
					} else {
						var16 = var10 + var9.width;
						var17 = var11 + var9.height;
						var12 = var10 > var2 ? var10 : var2;
						var13 = var11 > var3 ? var11 : var3;
						var14 = var16 < var4 ? var16 : var4;
						var15 = var17 < var5 ? var17 : var5;
					}
				}

				if (var9 == Client.clickedWidget) {
					Client.field669 = true;
					Client.field739 = var10;
					Client.field671 = var11;
				}

				boolean var33 = false;
				if (var9.field3119) {
					switch(Client.field650) {
					case 0:
						var33 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field543 == var9.id >>> 16) {
							var33 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field543) {
							var33 = true;
						}
					}
				}

				if (var33 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var26;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var26.isMouseInputEvent) {
										var26.remove();
										var26.widget.containsMouse = false;
									}
								}

								if (class125.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									Canvas.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) {
									var26.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var34 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var34) {
							class28.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						BuddyRankComparator.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							class65.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var34) {
							if (var9.contentType == 1400) {
								class65.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								MilliClock.Widget_addToMenu(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var33) {
							for (int var20 = 0; var20 < var9.field3100.length; ++var20) {
								var21 = false;
								boolean var27 = false;
								if (!var21 && var9.field3100[var20] != null) {
									for (var23 = 0; var23 < var9.field3100[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3188 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3100[var20][var23]];
										}

										if (ItemComposition.method3191(var9.field3100[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3188 != null && var9.field3188[var20] > Client.cycle) {
												break;
											}

											byte var32 = var9.field3121[var20][var23];
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var27 = true;
												break;
											}
										}
									}
								}

								if (var27) {
									if (var20 < 10) {
										MouseHandler.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										ReflectionCheck.Widget_runOnTargetLeave();
										DirectByteArrayCopier.selectSpell(var9.id, var9.childIndex, class138.Widget_unpackTargetMask(Decimator.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = FileSystem.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class54.colorStartTag(16777215);
									}

									var23 = var9.field3135[var20];
									if (var9.field3188 == null) {
										var9.field3188 = new int[var9.field3100.length];
									}

									if (var9.field3123 == null) {
										var9.field3123 = new int[var9.field3100.length];
									}

									if (var23 != 0) {
										if (var9.field3188[var20] == 0) {
											var9.field3188[var20] = var23 + Client.cycle + var9.field3123[var20];
										} else {
											var9.field3188[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3188[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3188 != null) {
									var9.field3188[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var34 = true;
							} else {
								var34 = false;
							}

							boolean var35 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Script.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) {
								var35 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Script.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								Canvas.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								class65.worldMap.method6365(var17, var18, var34 & var35, var34 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && class28.method402(Decimator.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field666 = true;
								Client.field623 = var10;
								Client.field658 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var34 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || Decimator.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var35 = false;
									var34 = false;
								}

								if (!var9.isClicked && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.isClicked && var35 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.isClicked && !var35) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field693.addFirst(var22);
									}
								}

								if (var35 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.containsMouse && var34) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.containsMouse && var34 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.containsMouse && !var34) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field693.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field745.addFirst(var22);
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3183) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3183 <= 32) {
										label810:
										for (var37 = var9.field3183; var37 < Client.changedVarpCount; ++var37) {
											var23 = Client.changedVarps[var37 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label810;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3183 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field677 > var9.field3184) {
									if (var9.invTransmitTriggers != null && Client.field677 - var9.field3184 <= 32) {
										label786:
										for (var37 = var9.field3184; var37 < Client.field677; ++var37) {
											var23 = Client.changedItemContainers[var37 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label786;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3184 = Client.field677;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3122) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3122 <= 32) {
										label762:
										for (var37 = var9.field3122; var37 < Client.changedSkillsCount; ++var37) {
											var23 = Client.changedSkills[var37 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label762;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3122 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3182 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field683 > var9.field3182 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field630 > var9.field3182 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field664 > var9.field3182 && var9.field3159 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3159;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field672 > var9.field3182 && var9.field3160 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3160;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field703 > var9.field3182 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field688 > var9.field3182 && var9.field3174 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3174;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field695 > var9.field3182 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3182 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var37 = 0; var37 < Client.field713; ++var37) {
										ScriptEvent var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = Client.field595[var37];
										var31.keyPressed = Client.field714[var37];
										var31.args = var9.onKey;
										Client.scriptEvents.addFirst(var31);
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3155 != null) {
									var38 = GrandExchangeOfferWorldComparator.method5320();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3155;
										Client.scriptEvents.addFirst(var30);
									}
								}

								if (var9.field3069 != null) {
									var38 = class351.method6227();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3069;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || Decimator.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									class301.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class301.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								BufferedFile.field4227 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class150.method2805(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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

									if (class125.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										Canvas.addCancelMenuEntry();
									}
								}

								class18.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
