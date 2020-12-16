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
		field1252 = new byte[2048]; // L: 18
		field1253 = new byte[2048]; // L: 19
		field1254 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1264 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1916239177"
	)
	static void method2208() {
		Client.mouseLastLastPressedTimeMillis = -1L; // L: 2645
		SoundCache.mouseRecorder.index = 0; // L: 2646
		ScriptEvent.hasFocus = true; // L: 2647
		Client.hadFocus = true; // L: 2648
		Client.field817 = -1L; // L: 2649
		class105.reflectionChecks = new IterableNodeDeque(); // L: 2651
		Client.packetWriter.clearBuffer(); // L: 2653
		Client.packetWriter.packetBuffer.offset = 0; // L: 2654
		Client.packetWriter.serverPacket = null; // L: 2655
		Client.packetWriter.field1335 = null; // L: 2656
		Client.packetWriter.field1336 = null; // L: 2657
		Client.packetWriter.field1337 = null; // L: 2658
		Client.packetWriter.serverPacketLength = 0; // L: 2659
		Client.packetWriter.field1333 = 0; // L: 2660
		Client.rebootTimer = 0; // L: 2661
		Client.logoutTimer = 0; // L: 2662
		Client.hintArrowType = 0; // L: 2663
		Client.menuOptionsCount = 0; // L: 2665
		Client.isMenuOpen = false; // L: 2666
		ChatChannel.method2317(0); // L: 2668
		Tiles.method1203(); // L: 2669
		Client.isItemSelected = 0; // L: 2670
		Client.isSpellSelected = false; // L: 2671
		Client.soundEffectCount = 0; // L: 2672
		Client.camAngleY = 0; // L: 2673
		Client.oculusOrbState = 0; // L: 2674
		WorldMapIcon_0.field148 = null; // L: 2675
		Client.minimapState = 0; // L: 2676
		Client.field874 = -1; // L: 2677
		Client.destinationX = 0; // L: 2678
		Client.destinationY = 0; // L: 2679
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2680
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2681
		Client.npcCount = 0; // L: 2682
		Players_count = 0; // L: 2684

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2685
			field1254[var0] = null; // L: 2686
			field1253[var0] = 1; // L: 2687
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 2690
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) { // L: 2691
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2692
		Client.projectiles.clear(); // L: 2693
		Client.graphicsObjects.clear(); // L: 2694

		int var2;
		for (var0 = 0; var0 < 4; ++var0) { // L: 2695
			for (int var1 = 0; var1 < 104; ++var1) { // L: 2696
				for (var2 = 0; var2 < 104; ++var2) { // L: 2697
					Client.groundItems[var0][var1][var2] = null; // L: 2698
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2702
		MilliClock.friendSystem.clear(); // L: 2703

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) { // L: 2704
			VarpDefinition var4 = class219.VarpDefinition_get(var0); // L: 2705
			if (var4 != null) { // L: 2706
				Varps.Varps_temp[var0] = 0; // L: 2707
				Varps.Varps_main[var0] = 0; // L: 2708
			}
		}

		Varcs.varcs.clearTransient(); // L: 2711
		Client.followerIndex = -1; // L: 2712
		if (Client.rootInterface != -1) { // L: 2713
			var0 = Client.rootInterface; // L: 2714
			if (var0 != -1 && class195.Widget_loadedInterfaces[var0]) { // L: 2716 2717
				class58.Widget_archive.clearFilesGroup(var0); // L: 2718
				if (class9.Widget_interfaceComponents[var0] != null) { // L: 2719
					boolean var5 = true; // L: 2720

					for (var2 = 0; var2 < class9.Widget_interfaceComponents[var0].length; ++var2) { // L: 2721
						if (class9.Widget_interfaceComponents[var0][var2] != null) { // L: 2722
							if (class9.Widget_interfaceComponents[var0][var2].type != 2) { // L: 2723
								class9.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var5 = false; // L: 2724
							}
						}
					}

					if (var5) { // L: 2727
						class9.Widget_interfaceComponents[var0] = null;
					}

					class195.Widget_loadedInterfaces[var0] = false; // L: 2728
				}
			}
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2731
			MouseRecorder.closeInterface(var3, true); // L: 2732
		}

		Client.rootInterface = -1; // L: 2734
		Client.interfaceParents = new NodeHashTable(8); // L: 2735
		Client.meslayerContinueWidget = null; // L: 2736
		Client.menuOptionsCount = 0; // L: 2738
		Client.isMenuOpen = false; // L: 2739
		Client.playerComposition.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2741

		for (var0 = 0; var0 < 8; ++var0) { // L: 2742
			Client.playerMenuActions[var0] = null; // L: 2743
			Client.playerOptionsPriorities[var0] = false; // L: 2744
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2747
		Client.isLoading = true; // L: 2749

		for (var0 = 0; var0 < 100; ++var0) { // L: 2750
			Client.field901[var0] = true;
		}

		MouseRecorder.method1264(); // L: 2751
		WorldMapArea.clanChat = null; // L: 2752

		for (var0 = 0; var0 < 8; ++var0) { // L: 2753
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		AbstractUserComparator.grandExchangeEvents = null; // L: 2754
	} // L: 2755

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-871973097"
	)
	static final boolean method2225(int var0) {
		if (var0 < 0) { // L: 7460
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 7461
			if (var1 >= 2000) { // L: 7462
				var1 -= 2000;
			}

			return var1 == 1007; // L: 7463
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "([Lhe;IIIIIIII)V",
		garbageValue = "-2127436431"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 9910
			Widget var9 = var0[var8]; // L: 9911
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || FaceNormal.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 9912 9913 9914
				if (var9.isIf3) { // L: 9915
					if (DevicePcmPlayerProvider.isComponentHidden(var9)) { // L: 9916
						continue;
					}
				} else if (var9.type == 0 && var9 != EnumComposition.mousedOverWidgetIf1 && DevicePcmPlayerProvider.isComponentHidden(var9)) { // L: 9919
					continue;
				}

				int var10 = var9.x + var6; // L: 9921
				int var11 = var7 + var9.y; // L: 9922
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 9927
					var12 = var2; // L: 9928
					var13 = var3; // L: 9929
					var14 = var4; // L: 9930
					var15 = var5; // L: 9931
				} else {
					int var16;
					if (var9.type == 9) { // L: 9933
						var16 = var10; // L: 9934
						var17 = var11; // L: 9935
						var18 = var10 + var9.width; // L: 9936
						int var19 = var11 + var9.height; // L: 9937
						if (var18 < var10) { // L: 9938
							var16 = var18; // L: 9940
							var18 = var10; // L: 9941
						}

						if (var19 < var11) { // L: 9943
							var17 = var19; // L: 9945
							var19 = var11; // L: 9946
						}

						++var18; // L: 9948
						++var19; // L: 9949
						var12 = var16 > var2 ? var16 : var2; // L: 9950
						var13 = var17 > var3 ? var17 : var3; // L: 9951
						var14 = var18 < var4 ? var18 : var4; // L: 9952
						var15 = var19 < var5 ? var19 : var5; // L: 9953
					} else {
						var16 = var10 + var9.width; // L: 9956
						var17 = var11 + var9.height; // L: 9957
						var12 = var10 > var2 ? var10 : var2; // L: 9958
						var13 = var11 > var3 ? var11 : var3; // L: 9959
						var14 = var16 < var4 ? var16 : var4; // L: 9960
						var15 = var17 < var5 ? var17 : var5; // L: 9961
					}
				}

				if (var9 == Client.clickedWidget) { // L: 9963
					Client.field829 = true; // L: 9964
					Client.field853 = var10; // L: 9965
					Client.field862 = var11; // L: 9966
				}

				boolean var32 = false; // L: 9968
				if (var9.field2590) { // L: 9969
					switch(Client.field810) { // L: 9970
					case 0:
						var32 = true; // L: 9972
					case 1:
					default:
						break;
					case 2:
						if (Client.field811 == var9.id >>> 16) { // L: 9975
							var32 = true; // L: 9976
						}
						break;
					case 3:
						if (var9.id == Client.field811) { // L: 9980
							var32 = true; // L: 9981
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 9986
					if (var9.isIf3) { // L: 9987
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 9988
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 9989
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 9990
									if (var26.isMouseInputEvent) { // L: 9991
										var26.remove(); // L: 9992
										var26.widget.containsMouse = false; // L: 9993
									}
								}

								if (ScriptFrame.widgetDragDuration == 0) { // L: 9996
									Client.clickedWidget = null; // L: 9997
									Client.clickedWidgetParent = null; // L: 9998
								}

								if (!Client.isMenuOpen) { // L: 10000
									ApproximateRouteStrategy.addCancelMenuEntry(); // L: 10001
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10005 10006
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10007
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10008
									var26.remove(); // L: 10009
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10015
					var18 = MouseHandler.MouseHandler_y; // L: 10016
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10017
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10018
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10019
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10021
					if (var9.contentType == 1337) { // L: 10022
						if (!Client.isLoading && !Client.isMenuOpen && var33) { // L: 10023
							InvDefinition.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10026
						UserComparator5.checkIfMinimapClicked(var9, var10, var11); // L: 10027
					} else {
						if (var9.contentType == 1400) { // L: 10030
							WorldMapRectangle.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height); // L: 10031
						}

						if (!Client.isMenuOpen && var33) { // L: 10033
							if (var9.contentType == 1400) { // L: 10034
								WorldMapRectangle.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10035
							} else {
								WorldMapRegion.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10038
							}
						}

						boolean var21;
						int var23;
						if (var32) { // L: 10041
							for (int var20 = 0; var20 < var9.field2649.length; ++var20) { // L: 10042
								var21 = false; // L: 10043
								boolean var27 = false; // L: 10044
								if (!var21 && var9.field2649[var20] != null) { // L: 10045
									for (var23 = 0; var23 < var9.field2649[var20].length; ++var23) { // L: 10046
										boolean var24 = false; // L: 10047
										if (var9.field2684 != null) { // L: 10048
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2649[var20][var23]]; // L: 10049
										}

										if (Canvas.method911(var9.field2649[var20][var23]) || var24) { // L: 10051
											var21 = true; // L: 10052
											if (var9.field2684 != null && var9.field2684[var20] > Client.cycle) { // L: 10053
												break;
											}

											byte var31 = var9.field2637[var20][var23]; // L: 10054
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10055 10056 10057 10058 10059
												var27 = true; // L: 10061
												break;
											}
										}
									}
								}

								if (var27) { // L: 10067
									if (var20 < 10) { // L: 10068
										class3.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10069
										WorldMapManager.Widget_runOnTargetLeave(); // L: 10070
										class194.selectSpell(var9.id, var9.childIndex, ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var9)), var9.itemId); // L: 10071
										Client.selectedSpellActionName = StudioGame.Widget_getSpellActionName(var9); // L: 10072
										if (Client.selectedSpellActionName == null) { // L: 10073
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class23.colorStartTag(16777215); // L: 10074
									}

									var23 = var9.field2679[var20]; // L: 10076
									if (var9.field2684 == null) { // L: 10077
										var9.field2684 = new int[var9.field2649.length];
									}

									if (var9.field2664 == null) { // L: 10078
										var9.field2664 = new int[var9.field2649.length];
									}

									if (var23 != 0) { // L: 10079
										if (var9.field2684[var20] == 0) { // L: 10080
											var9.field2684[var20] = var23 + Client.cycle + var9.field2664[var20];
										} else {
											var9.field2684[var20] = var23 + Client.cycle; // L: 10081
										}
									} else {
										var9.field2684[var20] = Integer.MAX_VALUE; // L: 10083
									}
								}

								if (!var21 && var9.field2684 != null) { // L: 10085 10086
									var9.field2684[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10090
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10091
								var33 = true;
							} else {
								var33 = false; // L: 10092
							}

							boolean var34 = false; // L: 10093
							if ((MouseHandler.MouseHandler_currentButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) { // L: 10094
								var34 = true;
							}

							var21 = false; // L: 10095
							if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator9.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10096
								var21 = true;
							}

							if (var21) { // L: 10097
								class13.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10098
								WorldMapRectangle.worldMap.method6362(var17, var18, var33 & var34, var33 & var21); // L: 10099
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && SecureRandomCallable.method1216(FaceNormal.getWidgetFlags(var9))) { // L: 10101
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10102
								Client.field859 = true; // L: 10103
								Client.field827 = var10; // L: 10104
								Client.field716 = var11; // L: 10105
							}

							if (var9.hasListener) { // L: 10107
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10108
									var22 = new ScriptEvent(); // L: 10109
									var22.isMouseInputEvent = true; // L: 10110
									var22.widget = var9; // L: 10111
									var22.mouseY = Client.mouseWheelRotation; // L: 10112
									var22.args = var9.onScroll; // L: 10113
									Client.scriptEvents.addFirst(var22); // L: 10114
								}

								if (Client.clickedWidget != null || class171.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10116
									var21 = false; // L: 10117
									var34 = false; // L: 10118
									var33 = false; // L: 10119
								}

								if (!var9.isClicked && var21) { // L: 10121
									var9.isClicked = true; // L: 10122
									if (var9.onClick != null) { // L: 10123
										var22 = new ScriptEvent(); // L: 10124
										var22.isMouseInputEvent = true; // L: 10125
										var22.widget = var9; // L: 10126
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10127
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10128
										var22.args = var9.onClick; // L: 10129
										Client.scriptEvents.addFirst(var22); // L: 10130
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) { // L: 10133 10134
									var22 = new ScriptEvent(); // L: 10135
									var22.isMouseInputEvent = true; // L: 10136
									var22.widget = var9; // L: 10137
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10138
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10139
									var22.args = var9.onClickRepeat; // L: 10140
									Client.scriptEvents.addFirst(var22); // L: 10141
								}

								if (var9.isClicked && !var34) { // L: 10144
									var9.isClicked = false; // L: 10145
									if (var9.onRelease != null) { // L: 10146
										var22 = new ScriptEvent(); // L: 10147
										var22.isMouseInputEvent = true; // L: 10148
										var22.widget = var9; // L: 10149
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10150
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10151
										var22.args = var9.onRelease; // L: 10152
										Client.field849.addFirst(var22); // L: 10153
									}
								}

								if (var34 && var9.onHold != null) { // L: 10156 10157
									var22 = new ScriptEvent(); // L: 10158
									var22.isMouseInputEvent = true; // L: 10159
									var22.widget = var9; // L: 10160
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10161
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10162
									var22.args = var9.onHold; // L: 10163
									Client.scriptEvents.addFirst(var22); // L: 10164
								}

								if (!var9.containsMouse && var33) { // L: 10167
									var9.containsMouse = true; // L: 10168
									if (var9.onMouseOver != null) { // L: 10169
										var22 = new ScriptEvent(); // L: 10170
										var22.isMouseInputEvent = true; // L: 10171
										var22.widget = var9; // L: 10172
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10173
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10174
										var22.args = var9.onMouseOver; // L: 10175
										Client.scriptEvents.addFirst(var22); // L: 10176
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) { // L: 10179 10180
									var22 = new ScriptEvent(); // L: 10181
									var22.isMouseInputEvent = true; // L: 10182
									var22.widget = var9; // L: 10183
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10184
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10185
									var22.args = var9.onMouseRepeat; // L: 10186
									Client.scriptEvents.addFirst(var22); // L: 10187
								}

								if (var9.containsMouse && !var33) { // L: 10190
									var9.containsMouse = false; // L: 10191
									if (var9.onMouseLeave != null) { // L: 10192
										var22 = new ScriptEvent(); // L: 10193
										var22.isMouseInputEvent = true; // L: 10194
										var22.widget = var9; // L: 10195
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10196
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10197
										var22.args = var9.onMouseLeave; // L: 10198
										Client.field849.addFirst(var22); // L: 10199
									}
								}

								if (var9.onTimer != null) { // L: 10202
									var22 = new ScriptEvent(); // L: 10203
									var22.widget = var9; // L: 10204
									var22.args = var9.onTimer; // L: 10205
									Client.field715.addFirst(var22); // L: 10206
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.field835 > var9.field2645) { // L: 10208
									if (var9.varTransmitTriggers != null && Client.field835 - var9.field2645 <= 32) { // L: 10209
										label777:
										for (var36 = var9.field2645; var36 < Client.field835; ++var36) { // L: 10216
											var23 = Client.field834[var36 & 31]; // L: 10217

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) { // L: 10218
												if (var23 == var9.varTransmitTriggers[var35]) { // L: 10219
													var25 = new ScriptEvent(); // L: 10220
													var25.widget = var9; // L: 10221
													var25.args = var9.onVarTransmit; // L: 10222
													Client.scriptEvents.addFirst(var25); // L: 10223
													break label777; // L: 10224
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10210
										var22.widget = var9; // L: 10211
										var22.args = var9.onVarTransmit; // L: 10212
										Client.scriptEvents.addFirst(var22); // L: 10213
									}

									var9.field2645 = Client.field835; // L: 10229
								}

								if (var9.onInvTransmit != null && Client.field837 > var9.field2721) { // L: 10231
									if (var9.invTransmitTriggers != null && Client.field837 - var9.field2721 <= 32) { // L: 10232
										label753:
										for (var36 = var9.field2721; var36 < Client.field837; ++var36) { // L: 10239
											var23 = Client.changedItemContainers[var36 & 31]; // L: 10240

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) { // L: 10241
												if (var23 == var9.invTransmitTriggers[var35]) { // L: 10242
													var25 = new ScriptEvent(); // L: 10243
													var25.widget = var9; // L: 10244
													var25.args = var9.onInvTransmit; // L: 10245
													Client.scriptEvents.addFirst(var25); // L: 10246
													break label753; // L: 10247
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10233
										var22.widget = var9; // L: 10234
										var22.args = var9.onInvTransmit; // L: 10235
										Client.scriptEvents.addFirst(var22); // L: 10236
									}

									var9.field2721 = Client.field837; // L: 10252
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2725) { // L: 10254
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2725 <= 32) { // L: 10255
										label729:
										for (var36 = var9.field2725; var36 < Client.changedSkillsCount; ++var36) { // L: 10262
											var23 = Client.changedSkills[var36 & 31]; // L: 10263

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) { // L: 10264
												if (var23 == var9.statTransmitTriggers[var35]) { // L: 10265
													var25 = new ScriptEvent(); // L: 10266
													var25.widget = var9; // L: 10267
													var25.args = var9.onStatTransmit; // L: 10268
													Client.scriptEvents.addFirst(var25); // L: 10269
													break label729; // L: 10270
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10256
										var22.widget = var9; // L: 10257
										var22.args = var9.onStatTransmit; // L: 10258
										Client.scriptEvents.addFirst(var22); // L: 10259
									}

									var9.field2725 = Client.changedSkillsCount; // L: 10275
								}

								if (Client.chatCycle > var9.field2719 && var9.onChatTransmit != null) { // L: 10277
									var22 = new ScriptEvent(); // L: 10278
									var22.widget = var9; // L: 10279
									var22.args = var9.onChatTransmit; // L: 10280
									Client.scriptEvents.addFirst(var22); // L: 10281
								}

								if (Client.field879 > var9.field2719 && var9.onFriendTransmit != null) { // L: 10283
									var22 = new ScriptEvent(); // L: 10284
									var22.widget = var9; // L: 10285
									var22.args = var9.onFriendTransmit; // L: 10286
									Client.scriptEvents.addFirst(var22); // L: 10287
								}

								if (Client.field842 > var9.field2719 && var9.onClanTransmit != null) { // L: 10289
									var22 = new ScriptEvent(); // L: 10290
									var22.widget = var9; // L: 10291
									var22.args = var9.onClanTransmit; // L: 10292
									Client.scriptEvents.addFirst(var22); // L: 10293
								}

								if (Client.field685 > var9.field2719 && var9.onStockTransmit != null) { // L: 10295
									var22 = new ScriptEvent(); // L: 10296
									var22.widget = var9; // L: 10297
									var22.args = var9.onStockTransmit; // L: 10298
									Client.scriptEvents.addFirst(var22); // L: 10299
								}

								if (Client.field680 > var9.field2719 && var9.field2703 != null) { // L: 10301
									var22 = new ScriptEvent(); // L: 10302
									var22.widget = var9; // L: 10303
									var22.args = var9.field2703; // L: 10304
									Client.scriptEvents.addFirst(var22); // L: 10305
								}

								if (Client.field845 > var9.field2719 && var9.onMiscTransmit != null) { // L: 10307
									var22 = new ScriptEvent(); // L: 10308
									var22.widget = var9; // L: 10309
									var22.args = var9.onMiscTransmit; // L: 10310
									Client.scriptEvents.addFirst(var22); // L: 10311
								}

								var9.field2719 = Client.cycleCntr; // L: 10313
								if (var9.onKey != null) { // L: 10314
									for (var36 = 0; var36 < Client.field870; ++var36) { // L: 10315
										ScriptEvent var30 = new ScriptEvent(); // L: 10316
										var30.widget = var9; // L: 10317
										var30.keyTyped = Client.field693[var36]; // L: 10318
										var30.keyPressed = Client.field661[var36]; // L: 10319
										var30.args = var9.onKey; // L: 10320
										Client.scriptEvents.addFirst(var30); // L: 10321
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 10326
							if (Client.clickedWidget != null || class171.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10327
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10328
								if (var9.mouseOverRedirect >= 0) { // L: 10329
									EnumComposition.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									EnumComposition.mousedOverWidgetIf1 = var9; // L: 10330
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10332
								CollisionMap.field2092 = var9; // L: 10333
							}

							if (var9.scrollHeight > var9.height) { // L: 10335
								SequenceDefinition.method4797(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 10337
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 10338
							if (var9.children != null) { // L: 10339
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 10340
							if (var28 != null) { // L: 10341
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 10342
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10343
										if (var29.isMouseInputEvent) { // L: 10344
											var29.remove(); // L: 10345
											var29.widget.containsMouse = false; // L: 10346
										}
									}

									if (ScriptFrame.widgetDragDuration == 0) { // L: 10349
										Client.clickedWidget = null; // L: 10350
										Client.clickedWidgetParent = null; // L: 10351
									}

									if (!Client.isMenuOpen) { // L: 10353
										ApproximateRouteStrategy.addCancelMenuEntry(); // L: 10354
									}
								}

								class51.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 10357
							}
						}
					}
				}
			}
		}

	} // L: 10361
}
