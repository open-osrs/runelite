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
		this.field778 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1072720259"
	)
	boolean method1728() {
		return this.field778 == 2; // L: 32
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1893042213"
	)
	final void method1764() {
		this.field778 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-532227317"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field778 = 2; // L: 41
		WorldMapSection1.method4831(); // L: 42
	} // L: 43

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4097 < Ignored.method6459() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					class194.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					class194.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	@Export("clear")
	final void clear() {
		this.field778 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpo;ZB)Z",
		garbageValue = "14"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(class340.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpo;B)Z",
		garbageValue = "0"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1825841589"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					ScriptEvent.method2152(); // L: 79
				} else {
					StringBuilder var10000;
					String var3;
					if (class340.localPlayer.username.equals(var2)) { // L: 82
						var10000 = null; // L: 84
						var3 = "You can't add yourself to your own friend list";
						class194.addGameMessage(30, "", var3); // L: 86
					} else if (this.isFriended(var2, false)) { // L: 91
						var10000 = (new StringBuilder()).append(var1); // L: 93
						Object var10001 = null;
						var3 = var10000.append(" is already on your friend list").toString();
						class194.addGameMessage(30, "", var3); // L: 95
					} else if (this.isIgnored(var2)) { // L: 100
						Client.method1662(var1); // L: 101
					} else {
						class10.method123(var1); // L: 104
					}
				}
			}
		}
	} // L: 80 89 98 102 105

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2001895195"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field594 != 1; // L: 130
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "879373364"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 137
			Username var2 = new Username(var1, this.loginType); // L: 138
			if (var2.hasCleanName()) { // L: 139
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) { // L: 140
					var10000 = null; // L: 142
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					class194.addGameMessage(30, "", var3); // L: 144
				} else if (class340.localPlayer.username.equals(var2)) { // L: 149
					Skills.method5487(); // L: 150
				} else {
					Object var10001;
					if (this.isIgnored(var2)) { // L: 153
						var10000 = (new StringBuilder()).append(var1); // L: 155
						var10001 = null;
						var3 = var10000.append(" is already on your ignore list").toString();
						class194.addGameMessage(30, "", var3); // L: 157
					} else if (this.isFriended(var2, false)) { // L: 162
						var10000 = new StringBuilder();
						var10001 = null; // L: 164
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var3 = var10000.append(" from your friend list first").toString();
						class194.addGameMessage(30, "", var3); // L: 166
					} else {
						class6.method55(var1); // L: 171
					}
				}
			}
		}
	} // L: 147 151 160 169 172

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "688284401"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field594 != 1; // L: 190
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "29"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 197
			Username var2 = new Username(var1, this.loginType); // L: 198
			if (var2.hasCleanName()) { // L: 199
				if (this.friendsList.removeByUsername(var2)) { // L: 200
					class409.method7267(); // L: 201
					PacketBufferNode var3 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2854, Client.packetWriter.isaacCipher); // L: 203
					var3.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var1)); // L: 204
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 205
					Client.packetWriter.addNode(var3); // L: 206
				}

				WorldMapSection1.method4831(); // L: 208
			}
		}
	} // L: 209

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1642682121"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 212
			Username var2 = new Username(var1, this.loginType); // L: 213
			if (var2.hasCleanName()) { // L: 214
				if (this.ignoreList.removeByUsername(var2)) { // L: 215
					class409.method7267(); // L: 216
					PacketBufferNode var3 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2805, Client.packetWriter.isaacCipher); // L: 218
					var3.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var1)); // L: 219
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 220
					Client.packetWriter.addNode(var3); // L: 221
				}

				Skeleton.FriendSystem_invalidateIgnoreds(); // L: 223
			}
		}
	} // L: 224

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpo;I)Z",
		garbageValue = "743208502"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 236
		return var2 != null && var2.hasWorld(); // L: 237
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	static final void method1791(boolean var0) {
		if (var0) { // L: 3658
			Client.field507 = Login.field882 ? class122.field1471 : class122.field1474; // L: 3659
		} else {
			LinkedHashMap var1 = SecureRandomFuture.clientPreferences.parameters; // L: 3662
			String var3 = Login.Login_username; // L: 3664
			int var4 = var3.length(); // L: 3666
			int var5 = 0; // L: 3667

			for (int var6 = 0; var6 < var4; ++var6) { // L: 3668
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field507 = var1.containsKey(var5) ? class122.field1476 : class122.field1473; // L: 3671
		}

	} // L: 3673

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2038294042"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10895

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10896
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10897
		}

		if (var1.length() > 9) { // L: 10899
			return " " + UserComparator5.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + UserComparator5.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + UserComparator5.colorStartTag(16776960) + var1 + "</col>"; // L: 10900 10901
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "([Ljm;IIIIIIII)V",
		garbageValue = "-415188399"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11386
			Widget var9 = var0[var8]; // L: 11387
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || class363.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 11388 11389 11390
				if (var9.isIf3) { // L: 11391
					if (StudioGame.isComponentHidden(var9)) { // L: 11392
						continue;
					}
				} else if (var9.type == 0 && var9 != class4.mousedOverWidgetIf1 && StudioGame.isComponentHidden(var9)) { // L: 11395
					continue;
				}

				int var10 = var9.x + var6; // L: 11397
				int var11 = var7 + var9.y; // L: 11398
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 11403
					var12 = var2; // L: 11404
					var13 = var3; // L: 11405
					var14 = var4; // L: 11406
					var15 = var5; // L: 11407
				} else {
					int var16;
					if (var9.type == 9) { // L: 11409
						var16 = var10; // L: 11410
						var17 = var11; // L: 11411
						var18 = var10 + var9.width; // L: 11412
						int var19 = var11 + var9.height; // L: 11413
						if (var18 < var10) { // L: 11414
							var16 = var18; // L: 11416
							var18 = var10; // L: 11417
						}

						if (var19 < var11) { // L: 11419
							var17 = var19; // L: 11421
							var19 = var11; // L: 11422
						}

						++var18; // L: 11424
						++var19; // L: 11425
						var12 = var16 > var2 ? var16 : var2; // L: 11426
						var13 = var17 > var3 ? var17 : var3; // L: 11427
						var14 = var18 < var4 ? var18 : var4; // L: 11428
						var15 = var19 < var5 ? var19 : var5; // L: 11429
					} else {
						var16 = var10 + var9.width; // L: 11432
						var17 = var11 + var9.height; // L: 11433
						var12 = var10 > var2 ? var10 : var2; // L: 11434
						var13 = var11 > var3 ? var11 : var3; // L: 11435
						var14 = var16 < var4 ? var16 : var4; // L: 11436
						var15 = var17 < var5 ? var17 : var5; // L: 11437
					}
				}

				if (var9 == Client.clickedWidget) { // L: 11439
					Client.field657 = true; // L: 11440
					Client.field658 = var10; // L: 11441
					Client.field660 = var11; // L: 11442
				}

				boolean var33 = false; // L: 11444
				if (var9.field3299) { // L: 11445
					switch(Client.field638) { // L: 11446
					case 0:
						var33 = true; // L: 11458
					case 1:
					default:
						break;
					case 2:
						if (Client.field639 == var9.id >>> 16) { // L: 11453
							var33 = true; // L: 11454
						}
						break;
					case 3:
						if (var9.id == Client.field639) { // L: 11448
							var33 = true; // L: 11449
						}
					}
				}

				if (var33 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11462
					if (var9.isIf3) { // L: 11463
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 11464
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11465
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11466
									if (var26.isMouseInputEvent) { // L: 11467
										var26.remove(); // L: 11468
										var26.widget.containsMouse = false; // L: 11469
									}
								}

								if (class87.widgetDragDuration == 0) { // L: 11472
									Client.clickedWidget = null; // L: 11473
									Client.clickedWidgetParent = null; // L: 11474
								}

								if (!Client.isMenuOpen) { // L: 11476
									WorldMapElement.addCancelMenuEntry(); // L: 11477
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11481 11482
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11483
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 11484
									var26.remove(); // L: 11485
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11491
					var18 = MouseHandler.MouseHandler_y; // L: 11492
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11493
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11494
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11495
					}

					boolean var34 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11497
					if (var9.contentType == 1337) { // L: 11498
						if (!Client.isLoading && !Client.isMenuOpen && var34) { // L: 11499
							FloorDecoration.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11502
						class312.checkIfMinimapClicked(var9, var10, var11); // L: 11503
					} else {
						if (var9.contentType == 1400) { // L: 11506
							Varcs.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height); // L: 11507
						}

						if (!Client.isMenuOpen && var34) { // L: 11509
							if (var9.contentType == 1400) { // L: 11510
								Varcs.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 11511
							} else {
								Client.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 11514
							}
						}

						boolean var21;
						int var23;
						if (var33) { // L: 11517
							for (int var20 = 0; var20 < var9.field3300.length; ++var20) { // L: 11518
								var21 = false; // L: 11519
								boolean var27 = false; // L: 11520
								if (!var21 && var9.field3300[var20] != null) { // L: 11521
									for (var23 = 0; var23 < var9.field3300[var20].length; ++var23) { // L: 11522
										boolean var24 = false; // L: 11523
										if (var9.field3368 != null) { // L: 11524
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3300[var20][var23]]; // L: 11525
										}

										if (BZip2State.method7571(var9.field3300[var20][var23]) || var24) { // L: 11527
											var21 = true; // L: 11528
											if (var9.field3368 != null && var9.field3368[var20] > Client.cycle) { // L: 11529
												break;
											}

											byte var32 = var9.field3301[var20][var23]; // L: 11530
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 11531 11532 11533 11534 11535
												var27 = true; // L: 11537
												break; // L: 11538
											}
										}
									}
								}

								if (var27) { // L: 11543
									if (var20 < 10) { // L: 11544
										SoundCache.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11545
										HealthBar.Widget_runOnTargetLeave(); // L: 11546
										UrlRequest.selectSpell(var9.id, var9.childIndex, class404.Widget_unpackTargetMask(class363.getWidgetFlags(var9)), var9.itemId); // L: 11547
										Client.selectedSpellActionName = SecureRandomFuture.Widget_getSpellActionName(var9); // L: 11548
										if (Client.selectedSpellActionName == null) { // L: 11549
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + UserComparator5.colorStartTag(16777215); // L: 11550
									}

									var23 = var9.field3302[var20]; // L: 11552
									if (var9.field3368 == null) { // L: 11553
										var9.field3368 = new int[var9.field3300.length];
									}

									if (var9.field3303 == null) { // L: 11554
										var9.field3303 = new int[var9.field3300.length];
									}

									if (var23 != 0) { // L: 11555
										if (var9.field3368[var20] == 0) { // L: 11556
											var9.field3368[var20] = var23 + Client.cycle + var9.field3303[var20];
										} else {
											var9.field3368[var20] = var23 + Client.cycle; // L: 11557
										}
									} else {
										var9.field3368[var20] = Integer.MAX_VALUE; // L: 11559
									}
								}

								if (!var21 && var9.field3368 != null) { // L: 11561 11562
									var9.field3368[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11566
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11567
								var34 = true;
							} else {
								var34 = false; // L: 11568
							}

							boolean var35 = false; // L: 11569
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) { // L: 11570
								var35 = true;
							}

							var21 = false; // L: 11571
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11572
								var21 = true;
							}

							if (var21) { // L: 11573
								class29.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 11574
								Varcs.worldMap.method7062(var17, var18, var34 & var35, var34 & var21); // L: 11575
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && class136.method2841(class363.getWidgetFlags(var9))) { // L: 11577
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11578
								Client.field531 = true; // L: 11579
								Client.field681 = var10; // L: 11580
								Client.field659 = var11; // L: 11581
							}

							if (var9.hasListener) { // L: 11583
								ScriptEvent var22;
								if (var34 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11584
									var22 = new ScriptEvent(); // L: 11585
									var22.isMouseInputEvent = true; // L: 11586
									var22.widget = var9; // L: 11587
									var22.mouseY = Client.mouseWheelRotation; // L: 11588
									var22.args = var9.onScroll; // L: 11589
									Client.scriptEvents.addFirst(var22); // L: 11590
								}

								if (Client.clickedWidget != null || class143.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11592
									var21 = false; // L: 11593
									var35 = false; // L: 11594
									var34 = false; // L: 11595
								}

								if (!var9.isClicked && var21) { // L: 11597
									var9.isClicked = true; // L: 11598
									if (var9.onClick != null) { // L: 11599
										var22 = new ScriptEvent(); // L: 11600
										var22.isMouseInputEvent = true; // L: 11601
										var22.widget = var9; // L: 11602
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 11603
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11604
										var22.args = var9.onClick; // L: 11605
										Client.scriptEvents.addFirst(var22); // L: 11606
									}
								}

								if (var9.isClicked && var35 && var9.onClickRepeat != null) { // L: 11609 11610
									var22 = new ScriptEvent(); // L: 11611
									var22.isMouseInputEvent = true; // L: 11612
									var22.widget = var9; // L: 11613
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 11614
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11615
									var22.args = var9.onClickRepeat; // L: 11616
									Client.scriptEvents.addFirst(var22); // L: 11617
								}

								if (var9.isClicked && !var35) { // L: 11620
									var9.isClicked = false; // L: 11621
									if (var9.onRelease != null) { // L: 11622
										var22 = new ScriptEvent(); // L: 11623
										var22.isMouseInputEvent = true; // L: 11624
										var22.widget = var9; // L: 11625
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 11626
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11627
										var22.args = var9.onRelease; // L: 11628
										Client.field579.addFirst(var22); // L: 11629
									}
								}

								if (var35 && var9.onHold != null) { // L: 11632 11633
									var22 = new ScriptEvent(); // L: 11634
									var22.isMouseInputEvent = true; // L: 11635
									var22.widget = var9; // L: 11636
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 11637
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11638
									var22.args = var9.onHold; // L: 11639
									Client.scriptEvents.addFirst(var22); // L: 11640
								}

								if (!var9.containsMouse && var34) { // L: 11643
									var9.containsMouse = true; // L: 11644
									if (var9.onMouseOver != null) { // L: 11645
										var22 = new ScriptEvent(); // L: 11646
										var22.isMouseInputEvent = true; // L: 11647
										var22.widget = var9; // L: 11648
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 11649
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11650
										var22.args = var9.onMouseOver; // L: 11651
										Client.scriptEvents.addFirst(var22); // L: 11652
									}
								}

								if (var9.containsMouse && var34 && var9.onMouseRepeat != null) { // L: 11655 11656
									var22 = new ScriptEvent(); // L: 11657
									var22.isMouseInputEvent = true; // L: 11658
									var22.widget = var9; // L: 11659
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 11660
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11661
									var22.args = var9.onMouseRepeat; // L: 11662
									Client.scriptEvents.addFirst(var22); // L: 11663
								}

								if (var9.containsMouse && !var34) { // L: 11666
									var9.containsMouse = false; // L: 11667
									if (var9.onMouseLeave != null) { // L: 11668
										var22 = new ScriptEvent(); // L: 11669
										var22.isMouseInputEvent = true; // L: 11670
										var22.widget = var9; // L: 11671
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 11672
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11673
										var22.args = var9.onMouseLeave; // L: 11674
										Client.field579.addFirst(var22); // L: 11675
									}
								}

								if (var9.onTimer != null) { // L: 11678
									var22 = new ScriptEvent(); // L: 11679
									var22.widget = var9; // L: 11680
									var22.args = var9.onTimer; // L: 11681
									Client.field680.addFirst(var22); // L: 11682
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3363) { // L: 11684
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3363 <= 32) { // L: 11685
										label809:
										for (var37 = var9.field3363; var37 < Client.changedVarpCount; ++var37) { // L: 11692
											var23 = Client.changedVarps[var37 & 31]; // L: 11693

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) { // L: 11694
												if (var23 == var9.varTransmitTriggers[var36]) { // L: 11695
													var25 = new ScriptEvent(); // L: 11696
													var25.widget = var9; // L: 11697
													var25.args = var9.onVarTransmit; // L: 11698
													Client.scriptEvents.addFirst(var25); // L: 11699
													break label809; // L: 11700
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11686
										var22.widget = var9; // L: 11687
										var22.args = var9.onVarTransmit; // L: 11688
										Client.scriptEvents.addFirst(var22); // L: 11689
									}

									var9.field3363 = Client.changedVarpCount; // L: 11705
								}

								if (var9.onInvTransmit != null && Client.field665 > var9.field3364) { // L: 11707
									if (var9.invTransmitTriggers != null && Client.field665 - var9.field3364 <= 32) { // L: 11708
										label785:
										for (var37 = var9.field3364; var37 < Client.field665; ++var37) { // L: 11715
											var23 = Client.changedItemContainers[var37 & 31]; // L: 11716

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) { // L: 11717
												if (var23 == var9.invTransmitTriggers[var36]) { // L: 11718
													var25 = new ScriptEvent(); // L: 11719
													var25.widget = var9; // L: 11720
													var25.args = var9.onInvTransmit; // L: 11721
													Client.scriptEvents.addFirst(var25); // L: 11722
													break label785; // L: 11723
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11709
										var22.widget = var9; // L: 11710
										var22.args = var9.onInvTransmit; // L: 11711
										Client.scriptEvents.addFirst(var22); // L: 11712
									}

									var9.field3364 = Client.field665; // L: 11728
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3365) { // L: 11730
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3365 <= 32) { // L: 11731
										label761:
										for (var37 = var9.field3365; var37 < Client.changedSkillsCount; ++var37) { // L: 11738
											var23 = Client.changedSkills[var37 & 31]; // L: 11739

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) { // L: 11740
												if (var23 == var9.statTransmitTriggers[var36]) { // L: 11741
													var25 = new ScriptEvent(); // L: 11742
													var25.widget = var9; // L: 11743
													var25.args = var9.onStatTransmit; // L: 11744
													Client.scriptEvents.addFirst(var25); // L: 11745
													break label761; // L: 11746
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11732
										var22.widget = var9; // L: 11733
										var22.args = var9.onStatTransmit; // L: 11734
										Client.scriptEvents.addFirst(var22); // L: 11735
									}

									var9.field3365 = Client.changedSkillsCount; // L: 11751
								}

								if (Client.chatCycle > var9.field3341 && var9.onChatTransmit != null) { // L: 11753
									var22 = new ScriptEvent(); // L: 11754
									var22.widget = var9; // L: 11755
									var22.args = var9.onChatTransmit; // L: 11756
									Client.scriptEvents.addFirst(var22); // L: 11757
								}

								if (Client.field671 > var9.field3341 && var9.onFriendTransmit != null) { // L: 11759
									var22 = new ScriptEvent(); // L: 11760
									var22.widget = var9; // L: 11761
									var22.args = var9.onFriendTransmit; // L: 11762
									Client.scriptEvents.addFirst(var22); // L: 11763
								}

								if (Client.field672 > var9.field3341 && var9.onClanTransmit != null) { // L: 11765
									var22 = new ScriptEvent(); // L: 11766
									var22.widget = var9; // L: 11767
									var22.args = var9.onClanTransmit; // L: 11768
									Client.scriptEvents.addFirst(var22); // L: 11769
								}

								if (Client.field673 > var9.field3341 && var9.field3217 != null) { // L: 11771
									var22 = new ScriptEvent(); // L: 11772
									var22.widget = var9; // L: 11773
									var22.args = var9.field3217; // L: 11774
									Client.scriptEvents.addFirst(var22); // L: 11775
								}

								if (Client.field583 > var9.field3341 && var9.field3340 != null) { // L: 11777
									var22 = new ScriptEvent(); // L: 11778
									var22.widget = var9; // L: 11779
									var22.args = var9.field3340; // L: 11780
									Client.scriptEvents.addFirst(var22); // L: 11781
								}

								if (Client.field675 > var9.field3341 && var9.onStockTransmit != null) { // L: 11783
									var22 = new ScriptEvent(); // L: 11784
									var22.widget = var9; // L: 11785
									var22.args = var9.onStockTransmit; // L: 11786
									Client.scriptEvents.addFirst(var22); // L: 11787
								}

								if (Client.field669 > var9.field3341 && var9.field3294 != null) { // L: 11789
									var22 = new ScriptEvent(); // L: 11790
									var22.widget = var9; // L: 11791
									var22.args = var9.field3294; // L: 11792
									Client.scriptEvents.addFirst(var22); // L: 11793
								}

								if (Client.field471 > var9.field3341 && var9.onMiscTransmit != null) { // L: 11795
									var22 = new ScriptEvent(); // L: 11796
									var22.widget = var9; // L: 11797
									var22.args = var9.onMiscTransmit; // L: 11798
									Client.scriptEvents.addFirst(var22); // L: 11799
								}

								var9.field3341 = Client.cycleCntr; // L: 11801
								if (var9.onKey != null) { // L: 11802
									for (var37 = 0; var37 < Client.field701; ++var37) { // L: 11803
										ScriptEvent var31 = new ScriptEvent(); // L: 11804
										var31.widget = var9; // L: 11805
										var31.keyTyped = Client.field522[var37]; // L: 11806
										var31.keyPressed = Client.field758[var37]; // L: 11807
										var31.args = var9.onKey; // L: 11808
										Client.scriptEvents.addFirst(var31); // L: 11809
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3335 != null) { // L: 11812
									var38 = class78.method2140(); // L: 11813

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11814
										var30 = new ScriptEvent(); // L: 11815
										var30.widget = var9; // L: 11816
										var30.keyTyped = var38[var23]; // L: 11817
										var30.args = var9.field3335; // L: 11818
										Client.scriptEvents.addFirst(var30); // L: 11819
									}
								}

								if (var9.field3336 != null) { // L: 11822
									var38 = Language.method5840(); // L: 11823

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11824
										var30 = new ScriptEvent(); // L: 11825
										var30.widget = var9; // L: 11826
										var30.keyTyped = var38[var23]; // L: 11827
										var30.args = var9.field3336; // L: 11828
										Client.scriptEvents.addFirst(var30); // L: 11829
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11834
							if (Client.clickedWidget != null || class143.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11835
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11836
								if (var9.mouseOverRedirect >= 0) { // L: 11837
									class4.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class4.mousedOverWidgetIf1 = var9; // L: 11838
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11840
								class281.field3375 = var9; // L: 11841
							}

							if (var9.scrollHeight > var9.height) { // L: 11843
								ClientPreferences.method2293(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11845
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 11846
							if (var9.children != null) { // L: 11847
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11848
							if (var28 != null) { // L: 11849
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11850
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11851
										if (var29.isMouseInputEvent) { // L: 11852
											var29.remove(); // L: 11853
											var29.widget.containsMouse = false; // L: 11854
										}
									}

									if (class87.widgetDragDuration == 0) { // L: 11857
										Client.clickedWidget = null; // L: 11858
										Client.clickedWidgetParent = null; // L: 11859
									}

									if (!Client.isMenuOpen) { // L: 11861
										WorldMapElement.addCancelMenuEntry(); // L: 11862
									}
								}

								class13.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 11865
							}
						}
					}
				}
			}
		}

	} // L: 11869
}
