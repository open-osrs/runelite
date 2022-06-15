import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class29 {
	@ObfuscatedName("c")
	public static Applet field172;
	@ObfuscatedName("v")
	public static String field169;

	static {
		field172 = null; // L: 10
		field169 = ""; // L: 11
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	static void method357() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 298
			Login.currentLoginField = 1; // L: 299
		} else {
			Login.currentLoginField = 0; // L: 302
		}

	} // L: 304

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)I",
		garbageValue = "1519469620"
	)
	static int method363(Widget var0) {
		if (var0.type != 11) { // L: 1237
			--Interpreter.Interpreter_stringStackSize; // L: 1238
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 1239
			return 1; // L: 1240
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1242
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var0.method5625(var1); // L: 1243
			return 1; // L: 1244
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "([Lkb;IIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11050
			Widget var9 = var0[var8]; // L: 11051
			if (var9 != null && var9.parentId == var1 && (var9.method5618() || class124.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11052 11053 11054
				if (var9.isIf3) { // L: 11055
					if (Frames.isComponentHidden(var9)) { // L: 11056
						continue;
					}
				} else if (var9.type == 0 && var9 != Language.mousedOverWidgetIf1 && Frames.isComponentHidden(var9)) { // L: 11059
					continue;
				}

				if (var9.type == 11 && var9.method5628(class138.urlRequester)) { // L: 11061 11062
					if (var9.method5680()) { // L: 11063
						ChatChannel.invalidateWidget(var9); // L: 11064
						BufferedNetSocket.revalidateWidgetScroll(var9.children, var9, true); // L: 11065
					}

					if (var9.field3495 != null) { // L: 11067
						ScriptEvent var10 = new ScriptEvent(); // L: 11068
						var10.widget = var9; // L: 11069
						var10.args = var9.field3495; // L: 11070
						Client.scriptEvents.addFirst(var10); // L: 11071
					}
				}

				int var26 = var9.x + var6; // L: 11075
				int var11 = var7 + var9.y; // L: 11076
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 11081
					var12 = var2; // L: 11082
					var13 = var3; // L: 11083
					var14 = var4; // L: 11084
					var15 = var5; // L: 11085
				} else {
					int var16;
					if (var9.type == 9) { // L: 11087
						var16 = var26; // L: 11088
						var17 = var11; // L: 11089
						var18 = var26 + var9.width; // L: 11090
						int var19 = var11 + var9.height; // L: 11091
						if (var18 < var26) { // L: 11092
							var16 = var18; // L: 11094
							var18 = var26; // L: 11095
						}

						if (var19 < var11) { // L: 11097
							var17 = var19; // L: 11099
							var19 = var11; // L: 11100
						}

						++var18; // L: 11102
						++var19; // L: 11103
						var12 = var16 > var2 ? var16 : var2; // L: 11104
						var13 = var17 > var3 ? var17 : var3; // L: 11105
						var14 = var18 < var4 ? var18 : var4; // L: 11106
						var15 = var19 < var5 ? var19 : var5; // L: 11107
					} else {
						var16 = var26 + var9.width; // L: 11110
						var17 = var11 + var9.height; // L: 11111
						var12 = var26 > var2 ? var26 : var2; // L: 11112
						var13 = var11 > var3 ? var11 : var3; // L: 11113
						var14 = var16 < var4 ? var16 : var4; // L: 11114
						var15 = var17 < var5 ? var17 : var5; // L: 11115
					}
				}

				if (var9 == Client.clickedWidget) { // L: 11117
					Client.field675 = true; // L: 11118
					Client.field775 = var26; // L: 11119
					Client.field677 = var11; // L: 11120
				}

				boolean var34 = false; // L: 11122
				if (var9.field3498) { // L: 11123
					switch(Client.field656) { // L: 11124
					case 0:
						var34 = true; // L: 11126
					case 1:
					default:
						break;
					case 2:
						if (Client.field657 == var9.id >>> 16) { // L: 11134
							var34 = true; // L: 11135
						}
						break;
					case 3:
						if (var9.id == Client.field657) { // L: 11129
							var34 = true; // L: 11130
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11140
					if (var9.isIf3) { // L: 11141
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11142
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11143
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11144
									if (var27.isMouseInputEvent) { // L: 11145
										var27.remove(); // L: 11146
										var27.widget.containsMouse = false; // L: 11147
									}
								}

								if (Timer.widgetDragDuration == 0) { // L: 11150
									Client.clickedWidget = null; // L: 11151
									Client.clickedWidgetParent = null; // L: 11152
								}

								if (!Client.isMenuOpen) { // L: 11154
									InterfaceParent.addCancelMenuEntry(); // L: 11155
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11159 11160
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11161
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 11162
									var27.remove(); // L: 11163
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11169
					var18 = MouseHandler.MouseHandler_y; // L: 11170
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11171
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11172
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11173
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11175
					if (var9.contentType == 1337) { // L: 11176
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 11177
							class82.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11180
						MenuAction.checkIfMinimapClicked(var9, var26, var11); // L: 11181
					} else {
						if (var9.contentType == 1400) { // L: 11184
							class121.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11185
						}

						if (!Client.isMenuOpen && var35) { // L: 11187
							if (var9.contentType == 1400) { // L: 11188
								class121.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11189
							} else {
								class9.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 11192
							}
						}

						boolean var21;
						int var29;
						if (var34) { // L: 11195
							for (int var20 = 0; var20 < var9.field3448.length; ++var20) { // L: 11196
								var21 = false; // L: 11197
								boolean var28 = false; // L: 11198
								if (!var21 && var9.field3448[var20] != null) { // L: 11199
									for (var29 = 0; var29 < var9.field3448[var20].length; ++var29) { // L: 11200
										boolean var24 = false; // L: 11201
										if (var9.field3517 != null) { // L: 11202
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3448[var20][var29]]; // L: 11203
										}

										if (class161.method3289(var9.field3448[var20][var29]) || var24) { // L: 11205
											var21 = true; // L: 11206
											if (var9.field3517 != null && var9.field3517[var20] > Client.cycle) { // L: 11207
												break;
											}

											byte var33 = var9.field3406[var20][var29]; // L: 11208
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 11209 11210 11211 11212 11213
												var28 = true; // L: 11215
												break;
											}
										}
									}
								}

								if (var28) { // L: 11221
									if (var20 < 10) { // L: 11222
										TextureProvider.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11223
										WorldMapDecoration.Widget_runOnTargetLeave(); // L: 11224
										GrandExchangeOfferAgeComparator.selectSpell(var9.id, var9.childIndex, WorldMapID.Widget_unpackTargetMask(class124.getWidgetFlags(var9)), var9.itemId); // L: 11225
										Client.selectedSpellActionName = WorldMapIcon_0.Widget_getSpellActionName(var9); // L: 11226
										if (Client.selectedSpellActionName == null) { // L: 11227
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class122.colorStartTag(16777215); // L: 11228
									}

									var29 = var9.field3450[var20]; // L: 11230
									if (var9.field3517 == null) { // L: 11231
										var9.field3517 = new int[var9.field3448.length];
									}

									if (var9.field3451 == null) { // L: 11232
										var9.field3451 = new int[var9.field3448.length];
									}

									if (var29 != 0) { // L: 11233
										if (var9.field3517[var20] == 0) { // L: 11234
											var9.field3517[var20] = var29 + Client.cycle + var9.field3451[var20];
										} else {
											var9.field3517[var20] = var29 + Client.cycle; // L: 11235
										}
									} else {
										var9.field3517[var20] = Integer.MAX_VALUE; // L: 11237
									}
								}

								if (!var21 && var9.field3517 != null) { // L: 11239 11240
									var9.field3517[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11244
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11245
								var35 = true;
							} else {
								var35 = false; // L: 11246
							}

							boolean var36 = false; // L: 11247
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11248
								var36 = true;
							}

							var21 = false; // L: 11249
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11250
								var21 = true;
							}

							int[] var22;
							if (var21) { // L: 11251
								class161.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11252
								if (var9.type == 11 && var9.method5623(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, var6, var7)) { // L: 11253
									switch(var9.method5627()) { // L: 11254
									case 0:
										class258.openURL(var9.method5629(), true, false); // L: 11256
										break;
									case 1:
										if (WallDecoration.method4551(class124.getWidgetFlags(var9))) { // L: 11259
											var22 = var9.method5630(); // L: 11260
											if (var22 != null) { // L: 11261
												PacketBufferNode var23 = EnumComposition.getPacketBufferNode(ClientPacket.field3012, Client.packetWriter.isaacCipher); // L: 11262
												var23.packetBuffer.method7783(var22[0]); // L: 11263
												var23.packetBuffer.writeInt(var9.method5709()); // L: 11264
												var23.packetBuffer.method7929(var9.childIndex); // L: 11265
												var23.packetBuffer.writeInt(var22[1]); // L: 11266
												var23.packetBuffer.method7783(var22[2]); // L: 11267
												var23.packetBuffer.method7784(var9.id); // L: 11268
												Client.packetWriter.addNode(var23); // L: 11269
											}
										}
									}
								}
							}

							if (var9.contentType == 1400) { // L: 11276
								class121.worldMap.method7307(var17, var18, var35 & var36, var35 & var21); // L: 11277
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && WorldMapID.method5003(class124.getWidgetFlags(var9))) { // L: 11279
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11280
								Client.field767 = true; // L: 11281
								Client.field664 = var26; // L: 11282
								Client.field550 = var11; // L: 11283
							}

							if (var9.hasListener) { // L: 11285
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11286
									var37 = new ScriptEvent(); // L: 11287
									var37.isMouseInputEvent = true; // L: 11288
									var37.widget = var9; // L: 11289
									var37.mouseY = Client.mouseWheelRotation; // L: 11290
									var37.args = var9.onScroll; // L: 11291
									Client.scriptEvents.addFirst(var37); // L: 11292
								}

								if (Client.clickedWidget != null || Interpreter.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11294
									var21 = false; // L: 11295
									var36 = false; // L: 11296
									var35 = false; // L: 11297
								}

								if (!var9.isClicked && var21) { // L: 11299
									var9.isClicked = true; // L: 11300
									if (var9.onClick != null) { // L: 11301
										var37 = new ScriptEvent(); // L: 11302
										var37.isMouseInputEvent = true; // L: 11303
										var37.widget = var9; // L: 11304
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11305
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11306
										var37.args = var9.onClick; // L: 11307
										Client.scriptEvents.addFirst(var37); // L: 11308
									}
								}

								if (var9.isClicked && var36 && var9.onClickRepeat != null) { // L: 11311 11312
									var37 = new ScriptEvent(); // L: 11313
									var37.isMouseInputEvent = true; // L: 11314
									var37.widget = var9; // L: 11315
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11316
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11317
									var37.args = var9.onClickRepeat; // L: 11318
									Client.scriptEvents.addFirst(var37); // L: 11319
								}

								if (var9.isClicked && !var36) { // L: 11322
									var9.isClicked = false; // L: 11323
									if (var9.onRelease != null) { // L: 11324
										var37 = new ScriptEvent(); // L: 11325
										var37.isMouseInputEvent = true; // L: 11326
										var37.widget = var9; // L: 11327
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11328
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11329
										var37.args = var9.onRelease; // L: 11330
										Client.field699.addFirst(var37); // L: 11331
									}
								}

								if (var36 && var9.onHold != null) { // L: 11334 11335
									var37 = new ScriptEvent(); // L: 11336
									var37.isMouseInputEvent = true; // L: 11337
									var37.widget = var9; // L: 11338
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11339
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11340
									var37.args = var9.onHold; // L: 11341
									Client.scriptEvents.addFirst(var37); // L: 11342
								}

								if (!var9.containsMouse && var35) { // L: 11345
									var9.containsMouse = true; // L: 11346
									if (var9.onMouseOver != null) { // L: 11347
										var37 = new ScriptEvent(); // L: 11348
										var37.isMouseInputEvent = true; // L: 11349
										var37.widget = var9; // L: 11350
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11351
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11352
										var37.args = var9.onMouseOver; // L: 11353
										Client.scriptEvents.addFirst(var37); // L: 11354
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 11357 11358
									var37 = new ScriptEvent(); // L: 11359
									var37.isMouseInputEvent = true; // L: 11360
									var37.widget = var9; // L: 11361
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11362
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11363
									var37.args = var9.onMouseRepeat; // L: 11364
									Client.scriptEvents.addFirst(var37); // L: 11365
								}

								if (var9.containsMouse && !var35) { // L: 11368
									var9.containsMouse = false; // L: 11369
									if (var9.onMouseLeave != null) { // L: 11370
										var37 = new ScriptEvent(); // L: 11371
										var37.isMouseInputEvent = true; // L: 11372
										var37.widget = var9; // L: 11373
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11374
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11375
										var37.args = var9.onMouseLeave; // L: 11376
										Client.field699.addFirst(var37); // L: 11377
									}
								}

								if (var9.onTimer != null) { // L: 11380
									var37 = new ScriptEvent(); // L: 11381
									var37.widget = var9; // L: 11382
									var37.args = var9.onTimer; // L: 11383
									Client.field698.addFirst(var37); // L: 11384
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3512) { // L: 11386
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3512 <= 32) { // L: 11387
										label824:
										for (var40 = var9.field3512; var40 < Client.changedVarpCount; ++var40) { // L: 11394
											var29 = Client.changedVarps[var40 & 31]; // L: 11395

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) { // L: 11396
												if (var29 == var9.varTransmitTriggers[var39]) { // L: 11397
													var25 = new ScriptEvent(); // L: 11398
													var25.widget = var9; // L: 11399
													var25.args = var9.onVarTransmit; // L: 11400
													Client.scriptEvents.addFirst(var25); // L: 11401
													break label824; // L: 11402
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11388
										var37.widget = var9; // L: 11389
										var37.args = var9.onVarTransmit; // L: 11390
										Client.scriptEvents.addFirst(var37); // L: 11391
									}

									var9.field3512 = Client.changedVarpCount; // L: 11407
								}

								if (var9.onInvTransmit != null && Client.field683 > var9.field3367) { // L: 11409
									if (var9.invTransmitTriggers != null && Client.field683 - var9.field3367 <= 32) { // L: 11410
										label800:
										for (var40 = var9.field3367; var40 < Client.field683; ++var40) { // L: 11417
											var29 = Client.changedItemContainers[var40 & 31]; // L: 11418

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) { // L: 11419
												if (var29 == var9.invTransmitTriggers[var39]) { // L: 11420
													var25 = new ScriptEvent(); // L: 11421
													var25.widget = var9; // L: 11422
													var25.args = var9.onInvTransmit; // L: 11423
													Client.scriptEvents.addFirst(var25); // L: 11424
													break label800; // L: 11425
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11411
										var37.widget = var9; // L: 11412
										var37.args = var9.onInvTransmit; // L: 11413
										Client.scriptEvents.addFirst(var37); // L: 11414
									}

									var9.field3367 = Client.field683; // L: 11430
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3514) { // L: 11432
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3514 <= 32) { // L: 11433
										label776:
										for (var40 = var9.field3514; var40 < Client.changedSkillsCount; ++var40) { // L: 11440
											var29 = Client.changedSkills[var40 & 31]; // L: 11441

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) { // L: 11442
												if (var29 == var9.statTransmitTriggers[var39]) { // L: 11443
													var25 = new ScriptEvent(); // L: 11444
													var25.widget = var9; // L: 11445
													var25.args = var9.onStatTransmit; // L: 11446
													Client.scriptEvents.addFirst(var25); // L: 11447
													break label776; // L: 11448
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 11434
										var37.widget = var9; // L: 11435
										var37.args = var9.onStatTransmit; // L: 11436
										Client.scriptEvents.addFirst(var37); // L: 11437
									}

									var9.field3514 = Client.changedSkillsCount; // L: 11453
								}

								if (Client.chatCycle > var9.field3426 && var9.onChatTransmit != null) { // L: 11455
									var37 = new ScriptEvent(); // L: 11456
									var37.widget = var9; // L: 11457
									var37.args = var9.onChatTransmit; // L: 11458
									Client.scriptEvents.addFirst(var37); // L: 11459
								}

								if (Client.field689 > var9.field3426 && var9.onFriendTransmit != null) { // L: 11461
									var37 = new ScriptEvent(); // L: 11462
									var37.widget = var9; // L: 11463
									var37.args = var9.onFriendTransmit; // L: 11464
									Client.scriptEvents.addFirst(var37); // L: 11465
								}

								if (Client.field690 > var9.field3426 && var9.onClanTransmit != null) { // L: 11467
									var37 = new ScriptEvent(); // L: 11468
									var37.widget = var9; // L: 11469
									var37.args = var9.onClanTransmit; // L: 11470
									Client.scriptEvents.addFirst(var37); // L: 11471
								}

								if (Client.field525 > var9.field3426 && var9.field3365 != null) { // L: 11473
									var37 = new ScriptEvent(); // L: 11474
									var37.widget = var9; // L: 11475
									var37.args = var9.field3365; // L: 11476
									Client.scriptEvents.addFirst(var37); // L: 11477
								}

								if (Client.field692 > var9.field3426 && var9.field3353 != null) { // L: 11479
									var37 = new ScriptEvent(); // L: 11480
									var37.widget = var9; // L: 11481
									var37.args = var9.field3353; // L: 11482
									Client.scriptEvents.addFirst(var37); // L: 11483
								}

								if (Client.field480 > var9.field3426 && var9.onStockTransmit != null) { // L: 11485
									var37 = new ScriptEvent(); // L: 11486
									var37.widget = var9; // L: 11487
									var37.args = var9.onStockTransmit; // L: 11488
									Client.scriptEvents.addFirst(var37); // L: 11489
								}

								if (Client.field661 > var9.field3426 && var9.field3494 != null) { // L: 11491
									var37 = new ScriptEvent(); // L: 11492
									var37.widget = var9; // L: 11493
									var37.args = var9.field3494; // L: 11494
									Client.scriptEvents.addFirst(var37); // L: 11495
								}

								if (Client.field695 > var9.field3426 && var9.onMiscTransmit != null) { // L: 11497
									var37 = new ScriptEvent(); // L: 11498
									var37.widget = var9; // L: 11499
									var37.args = var9.onMiscTransmit; // L: 11500
									Client.scriptEvents.addFirst(var37); // L: 11501
								}

								var9.field3426 = Client.cycleCntr; // L: 11503
								if (var9.onKey != null) { // L: 11504
									for (var40 = 0; var40 < Client.field719; ++var40) { // L: 11505
										ScriptEvent var38 = new ScriptEvent(); // L: 11506
										var38.widget = var9; // L: 11507
										var38.keyTyped = Client.field721[var40]; // L: 11508
										var38.keyPressed = Client.field720[var40]; // L: 11509
										var38.args = var9.onKey; // L: 11510
										Client.scriptEvents.addFirst(var38); // L: 11511
									}
								}

								ScriptEvent var32;
								if (var9.field3516 != null) { // L: 11514
									var22 = SpriteMask.method5523(); // L: 11515

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11516
										var32 = new ScriptEvent(); // L: 11517
										var32.widget = var9; // L: 11518
										var32.keyTyped = var22[var29]; // L: 11519
										var32.args = var9.field3516; // L: 11520
										Client.scriptEvents.addFirst(var32); // L: 11521
									}
								}

								if (var9.field3513 != null) { // L: 11524
									var22 = class160.method3285(); // L: 11525

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11526
										var32 = new ScriptEvent(); // L: 11527
										var32.widget = var9; // L: 11528
										var32.keyTyped = var22[var29]; // L: 11529
										var32.args = var9.field3513; // L: 11530
										Client.scriptEvents.addFirst(var32); // L: 11531
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11536
							if (Client.clickedWidget != null || Interpreter.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11537
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11538
								if (var9.mouseOverRedirect >= 0) { // L: 11539
									Language.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Language.mousedOverWidgetIf1 = var9; // L: 11540
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11542
								SoundSystem.field313 = var9; // L: 11543
							}

							if (var9.scrollHeight > var9.height) { // L: 11545
								class269.method5224(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11547
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11548
							if (var9.children != null) { // L: 11549
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11550
							if (var30 != null) { // L: 11551
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11552
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11553
										if (var31.isMouseInputEvent) { // L: 11554
											var31.remove(); // L: 11555
											var31.widget.containsMouse = false; // L: 11556
										}
									}

									if (Timer.widgetDragDuration == 0) { // L: 11559
										Client.clickedWidget = null; // L: 11560
										Client.clickedWidgetParent = null; // L: 11561
									}

									if (!Client.isMenuOpen) { // L: 11563
										InterfaceParent.addCancelMenuEntry(); // L: 11564
									}
								}

								class16.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11); // L: 11567
							}
						}
					}
				}
			}
		}

	} // L: 11571
}
