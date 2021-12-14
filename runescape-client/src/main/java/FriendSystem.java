import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1452528577
	)
	int field778;

	@ObfuscatedSignature(
		descriptor = "(Low;)V"
	)
	FriendSystem(LoginType var1) {
		this.field778 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1072720259"
	)
	boolean method1728() {
		return this.field778 == 2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1893042213"
	)
	final void method1764() {
		this.field778 = 1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-532227317"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field778 = 2;
		WorldMapSection1.method4831();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4097 < Ignored.method6459() / 1000L - 5L) {
				if (var1.world > 0) {
					class194.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class194.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	@Export("clear")
	final void clear() {
		this.field778 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpo;ZB)Z",
		garbageValue = "14"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class340.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpo;B)Z",
		garbageValue = "0"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1825841589"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					ScriptEvent.method2152();
				} else {
					StringBuilder var10000;
					String var3;
					if (class340.localPlayer.username.equals(var2)) {
						var10000 = null;
						var3 = "You can't add yourself to your own friend list";
						class194.addGameMessage(30, "", var3);
					} else if (this.isFriended(var2, false)) {
						var10000 = (new StringBuilder()).append(var1);
						Object var10001 = null;
						var3 = var10000.append(" is already on your friend list").toString();
						class194.addGameMessage(30, "", var3);
					} else if (this.isIgnored(var2)) {
						Client.method1662(var1);
					} else {
						class10.method123(var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2001895195"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field594 != 1;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "879373364"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) {
					var10000 = null;
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					class194.addGameMessage(30, "", var3);
				} else if (class340.localPlayer.username.equals(var2)) {
					Skills.method5487();
				} else {
					Object var10001;
					if (this.isIgnored(var2)) {
						var10000 = (new StringBuilder()).append(var1);
						var10001 = null;
						var3 = var10000.append(" is already on your ignore list").toString();
						class194.addGameMessage(30, "", var3);
					} else if (this.isFriended(var2, false)) {
						var10000 = new StringBuilder();
						var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var3 = var10000.append(" from your friend list first").toString();
						class194.addGameMessage(30, "", var3);
					} else {
						class6.method55(var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "688284401"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field594 != 1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "29"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					class409.method7267();
					PacketBufferNode var3 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2854, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				WorldMapSection1.method4831();
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1642682121"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					class409.method7267();
					PacketBufferNode var3 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2805, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				Skeleton.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpo;I)Z",
		garbageValue = "743208502"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	static final void method1791(boolean var0) {
		if (var0) {
			Client.field507 = Login.field882 ? class122.field1471 : class122.field1474;
		} else {
			LinkedHashMap var1 = SecureRandomFuture.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field507 = var1.containsKey(var5) ? class122.field1476 : class122.field1473;
		}

	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2038294042"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + UserComparator5.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + UserComparator5.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + UserComparator5.colorStartTag(16776960) + var1 + "</col>";
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "([Ljm;IIIIIIII)V",
		garbageValue = "-415188399"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class363.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) {
				if (var9.isIf3) {
					if (StudioGame.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class4.mousedOverWidgetIf1 && StudioGame.isComponentHidden(var9)) {
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
					Client.field657 = true;
					Client.field658 = var10;
					Client.field660 = var11;
				}

				boolean var33 = false;
				if (var9.field3299) {
					switch(Client.field638) {
					case 0:
						var33 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field639 == var9.id >>> 16) {
							var33 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field639) {
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

								if (class87.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									WorldMapElement.addCancelMenuEntry();
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
							FloorDecoration.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class312.checkIfMinimapClicked(var9, var10, var11);
					} else {
						if (var9.contentType == 1400) {
							Varcs.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var34) {
							if (var9.contentType == 1400) {
								Varcs.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18);
							} else {
								Client.Widget_addToMenu(var9, var17 - var10, var18 - var11);
							}
						}

						boolean var21;
						int var23;
						if (var33) {
							for (int var20 = 0; var20 < var9.field3300.length; ++var20) {
								var21 = false;
								boolean var27 = false;
								if (!var21 && var9.field3300[var20] != null) {
									for (var23 = 0; var23 < var9.field3300[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3368 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3300[var20][var23]];
										}

										if (BZip2State.method7571(var9.field3300[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3368 != null && var9.field3368[var20] > Client.cycle) {
												break;
											}

											byte var32 = var9.field3301[var20][var23];
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var27 = true;
												break;
											}
										}
									}
								}

								if (var27) {
									if (var20 < 10) {
										SoundCache.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										HealthBar.Widget_runOnTargetLeave();
										UrlRequest.selectSpell(var9.id, var9.childIndex, class404.Widget_unpackTargetMask(class363.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = SecureRandomFuture.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + UserComparator5.colorStartTag(16777215);
									}

									var23 = var9.field3302[var20];
									if (var9.field3368 == null) {
										var9.field3368 = new int[var9.field3300.length];
									}

									if (var9.field3303 == null) {
										var9.field3303 = new int[var9.field3300.length];
									}

									if (var23 != 0) {
										if (var9.field3368[var20] == 0) {
											var9.field3368[var20] = var23 + Client.cycle + var9.field3303[var20];
										} else {
											var9.field3368[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3368[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3368 != null) {
									var9.field3368[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) {
								var35 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class29.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) {
								Varcs.worldMap.method7062(var17, var18, var34 & var35, var34 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && class136.method2841(class363.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field531 = true;
								Client.field681 = var10;
								Client.field659 = var11;
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

								if (Client.clickedWidget != null || class143.dragInventoryWidget != null || Client.isMenuOpen) {
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
										Client.field579.addFirst(var22);
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
										Client.field579.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field680.addFirst(var22);
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3363) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3363 <= 32) {
										label809:
										for (var37 = var9.field3363; var37 < Client.changedVarpCount; ++var37) {
											var23 = Client.changedVarps[var37 & 31];

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
												if (var23 == var9.varTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label809;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3363 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field665 > var9.field3364) {
									if (var9.invTransmitTriggers != null && Client.field665 - var9.field3364 <= 32) {
										label785:
										for (var37 = var9.field3364; var37 < Client.field665; ++var37) {
											var23 = Client.changedItemContainers[var37 & 31];

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
												if (var23 == var9.invTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label785;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3364 = Client.field665;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3365) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3365 <= 32) {
										label761:
										for (var37 = var9.field3365; var37 < Client.changedSkillsCount; ++var37) {
											var23 = Client.changedSkills[var37 & 31];

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
												if (var23 == var9.statTransmitTriggers[var36]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label761;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3365 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3341 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field671 > var9.field3341 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field672 > var9.field3341 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field673 > var9.field3341 && var9.field3217 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3217;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field583 > var9.field3341 && var9.field3340 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3340;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field675 > var9.field3341 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field669 > var9.field3341 && var9.field3294 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3294;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field471 > var9.field3341 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3341 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var37 = 0; var37 < Client.field701; ++var37) {
										ScriptEvent var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = Client.field522[var37];
										var31.keyPressed = Client.field758[var37];
										var31.args = var9.onKey;
										Client.scriptEvents.addFirst(var31);
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3335 != null) {
									var38 = class78.method2140();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3335;
										Client.scriptEvents.addFirst(var30);
									}
								}

								if (var9.field3336 != null) {
									var38 = Language.method5840();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var38[var23];
										var30.args = var9.field3336;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || class143.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									class4.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class4.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								class281.field3375 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								ClientPreferences.method2293(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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

									if (class87.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										WorldMapElement.addCancelMenuEntry();
									}
								}

								class13.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11);
							}
						}
					}
				}
			}
		}

	}
}
