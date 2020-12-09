import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Players")
public class Players {
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -1480705449
	)
	static int field1267;
	@ObfuscatedName("x")
	static byte[] field1252;
	@ObfuscatedName("w")
	static byte[] field1253;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lkj;"
	)
	static Buffer[] field1254;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2141619955
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("n")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 377595229
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("l")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("z")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("u")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("e")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1362134323
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("c")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	static Buffer field1264;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 565306891
	)
	static int field1260;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -1518369629
	)
	@Export("port2")
	static int port2;

	static {
		field1252 = new byte[2048];
		field1253 = new byte[2048];
		field1254 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1264 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1916239177"
	)
	static void method2208() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		SoundCache.mouseRecorder.index = 0;
		ScriptEvent.hasFocus = true;
		Client.hadFocus = true;
		Client.field817 = -1L;
		class105.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1335 = null;
		Client.packetWriter.field1336 = null;
		Client.packetWriter.field1337 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1333 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		ChatChannel.method2317(0);
		Tiles.method1203();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		WorldMapIcon_0.field148 = null;
		Client.minimapState = 0;
		Client.field874 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		Players_count = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			field1254[var0] = null;
			field1253[var0] = 1;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		int var2;
		for (var0 = 0; var0 < 4; ++var0) {
			for (int var1 = 0; var1 < 104; ++var1) {
				for (var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var1][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		MilliClock.friendSystem.clear();

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) {
			VarpDefinition var4 = class219.VarpDefinition_get(var0);
			if (var4 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		Varcs.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			var0 = Client.rootInterface;
			if (var0 != -1 && class195.Widget_loadedInterfaces[var0]) {
				class58.Widget_archive.clearFilesGroup(var0);
				if (class9.Widget_interfaceComponents[var0] != null) {
					boolean var5 = true;

					for (var2 = 0; var2 < class9.Widget_interfaceComponents[var0].length; ++var2) {
						if (class9.Widget_interfaceComponents[var0][var2] != null) {
							if (class9.Widget_interfaceComponents[var0][var2].type != 2) {
								class9.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var5 = false;
							}
						}
					}

					if (var5) {
						class9.Widget_interfaceComponents[var0] = null;
					}

					class195.Widget_loadedInterfaces[var0] = false;
				}
			}
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
			MouseRecorder.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field901[var0] = true;
		}

		MouseRecorder.method1264();
		WorldMapArea.clanChat = null;

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		AbstractUserComparator.grandExchangeEvents = null;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-871973097"
	)
	static final boolean method2225(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "([Lhe;IIIIIIII)V",
		garbageValue = "-2127436431"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || FaceNormal.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (DevicePcmPlayerProvider.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != EnumDefinition.mousedOverWidgetIf1 && DevicePcmPlayerProvider.isComponentHidden(var9)) {
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
					Client.field829 = true;
					Client.field853 = var10;
					Client.field862 = var11;
				}

				boolean var32 = false;
				if (var9.field2590) {
					switch(Client.field810) {
					case 0:
						var32 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field811 == var9.id >>> 16) {
							var32 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field811) {
							var32 = true;
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) {
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

								if (ScriptFrame.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									ApproximateRouteStrategy.addCancelMenuEntry();
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

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var33) {
							InvDefinition.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						UserComparator5.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							WorldMapRectangle.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var33) {
							if (var9.contentType == 1400) {
								WorldMapRectangle.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								WorldMapRegion.Widget_addToMenu(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var32) {
							for (int var20 = 0; var20 < var9.field2649.length; ++var20) {
								var21 = false;
								boolean var27 = false;
								if (!var21 && var9.field2649[var20] != null) {
									for (var23 = 0; var23 < var9.field2649[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field2684 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2649[var20][var23]];
										}

										if (Canvas.method911(var9.field2649[var20][var23]) || var24) {
											var21 = true;
											if (var9.field2684 != null && var9.field2684[var20] > Client.cycle) {
												break;
											}

											byte var31 = var9.field2637[var20][var23];
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var27 = true;
												break;
											}
										}
									}
								}

								if (var27) {
									if (var20 < 10) {
										class3.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										WorldMapManager.Widget_runOnTargetLeave();
										class194.selectSpell(var9.id, var9.childIndex, ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = StudioGame.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class23.colorStartTag(16777215);
									}

									var23 = var9.field2679[var20];
									if (var9.field2684 == null) {
										var9.field2684 = new int[var9.field2649.length];
									}

									if (var9.field2664 == null) {
										var9.field2664 = new int[var9.field2649.length];
									}

									if (var23 != 0) {
										if (var9.field2684[var20] == 0) {
											var9.field2684[var20] = var23 + Client.cycle + var9.field2664[var20];
										} else {
											var9.field2684[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field2684[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field2684 != null) {
									var9.field2684[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) {
								var34 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class13.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								WorldMapRectangle.worldMap.method6362(var17, var18, var33 & var34, var33 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && SecureRandomCallable.method1216(FaceNormal.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field859 = true;
								Client.field827 = var10;
								Client.field716 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || class171.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var34 = false;
									var33 = false;
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

								if (var9.isClicked && var34 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.isClicked && !var34) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field849.addFirst(var22);
									}
								}

								if (var34 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.containsMouse && var33) {
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

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.isMouseInputEvent = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var10;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.containsMouse && !var33) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.isMouseInputEvent = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var10;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field849.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field715.addFirst(var22);
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.field835 > var9.field2645) {
									if (var9.varTransmitTriggers != null && Client.field835 - var9.field2645 <= 32) {
										label777:
										for (var36 = var9.field2645; var36 < Client.field835; ++var36) {
											var23 = Client.field834[var36 & 31];

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) {
												if (var23 == var9.varTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label777;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field2645 = Client.field835;
								}

								if (var9.onInvTransmit != null && Client.field837 > var9.field2721) {
									if (var9.invTransmitTriggers != null && Client.field837 - var9.field2721 <= 32) {
										label753:
										for (var36 = var9.field2721; var36 < Client.field837; ++var36) {
											var23 = Client.changedItemContainers[var36 & 31];

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) {
												if (var23 == var9.invTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label753;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field2721 = Client.field837;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2725) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2725 <= 32) {
										label729:
										for (var36 = var9.field2725; var36 < Client.changedSkillsCount; ++var36) {
											var23 = Client.changedSkills[var36 & 31];

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) {
												if (var23 == var9.statTransmitTriggers[var35]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label729;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field2725 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field2719 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field879 > var9.field2719 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field842 > var9.field2719 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field685 > var9.field2719 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field680 > var9.field2719 && var9.field2703 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field2703;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field845 > var9.field2719 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field2719 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var36 = 0; var36 < Client.field870; ++var36) {
										ScriptEvent var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = Client.field693[var36];
										var30.keyPressed = Client.field661[var36];
										var30.args = var9.onKey;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || class171.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									EnumDefinition.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									EnumDefinition.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								CollisionMap.field2092 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								SequenceDefinition.method4797(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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

									if (ScriptFrame.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										ApproximateRouteStrategy.addCancelMenuEntry();
									}
								}

								class51.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
