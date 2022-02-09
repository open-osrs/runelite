import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class111 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 201695505
	)
	int field1377;
	@ObfuscatedName("l")
	float field1384;
	@ObfuscatedName("s")
	float field1379;
	@ObfuscatedName("e")
	float field1380;
	@ObfuscatedName("r")
	float field1381;
	@ObfuscatedName("o")
	float field1378;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	class111 field1383;

	class111() {
		this.field1379 = Float.MAX_VALUE; // L: 8
		this.field1380 = Float.MAX_VALUE; // L: 9
		this.field1381 = Float.MAX_VALUE; // L: 10
		this.field1378 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-2016120567"
	)
	void method2526(Buffer var1, int var2) {
		this.field1377 = var1.readShort(); // L: 17
		this.field1384 = var1.method7374(); // L: 18
		this.field1379 = var1.method7374(); // L: 19
		this.field1380 = var1.method7374(); // L: 20
		this.field1381 = var1.method7374(); // L: 21
		this.field1378 = var1.method7374(); // L: 22
	} // L: 23

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1284094423"
	)
	static void method2525() {
		Tiles.Tiles_underlays = null; // L: 64
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field998 = null;
		class78.field1033 = null; // L: 68
		class260.field3078 = null;
		class19.field106 = null;
		class7.Tiles_hue = null;
		RouteStrategy.Tiles_saturation = null; // L: 72
		AbstractByteArrayCopier.Tiles_lightness = null;
		class1.Tiles_hueMultiplier = null;
		VarcInt.field1789 = null;
	} // L: 76

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1072080196"
	)
	public static void method2528(int var0) {
		if (class265.musicPlayerStatus != 0) { // L: 44
			class167.musicTrackVolume = var0;
		} else {
			class265.midiPcmStream.setPcmStreamVolume(var0); // L: 45
		}

	} // L: 46

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1649782483"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 60
		if (var0 < 0 || var0 >= 65536) { // L: 61
			var0 >>>= 16; // L: 62
			var1 += 16; // L: 63
		}

		if (var0 >= 256) { // L: 65
			var0 >>>= 8; // L: 66
			var1 += 8; // L: 67
		}

		if (var0 >= 16) { // L: 69
			var0 >>>= 4; // L: 70
			var1 += 4; // L: 71
		}

		if (var0 >= 4) { // L: 73
			var0 >>>= 2; // L: 74
			var1 += 2; // L: 75
		}

		if (var0 >= 1) { // L: 77
			var0 >>>= 1; // L: 78
			++var1; // L: 79
		}

		return var0 + var1; // L: 81
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "223640438"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1096
			if (Client.gameState == 0) { // L: 1097
				class414.client.method449();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1098
				WorldMapLabelSize.method4321(0); // L: 1099
				Client.field530 = 0; // L: 1100
				Client.field531 = 0; // L: 1101
				Client.timer.method6232(var0); // L: 1102
				if (var0 != 20) { // L: 1103
					Friend.method6297(false);
				}
			}

			if (var0 != 20 && var0 != 40 && JagexCache.field1699 != null) { // L: 1105 1106
				JagexCache.field1699.close(); // L: 1107
				JagexCache.field1699 = null; // L: 1108
			}

			if (Client.gameState == 25) { // L: 1111
				Client.field621 = 0; // L: 1112
				Client.field498 = 0; // L: 1113
				Client.field558 = 1; // L: 1114
				Client.field559 = 0; // L: 1115
				Client.field560 = 1; // L: 1116
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1118
				if (var0 == 20) { // L: 1122
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1123
					HealthBarUpdate.method2182(Tile.archive10, Message.archive8, false, var1); // L: 1124
				} else if (var0 == 11) { // L: 1126
					HealthBarUpdate.method2182(Tile.archive10, Message.archive8, false, 4); // L: 1127
				} else if (var0 == 50) { // L: 1129
					UserComparator7.setLoginResponseString("", "Updating date of birth...", ""); // L: 1130
					HealthBarUpdate.method2182(Tile.archive10, Message.archive8, false, 7); // L: 1131
				} else {
					ModeWhere.method5819(); // L: 1133
				}
			} else {
				var1 = Skeleton.method3892() ? 0 : 12; // L: 1119
				HealthBarUpdate.method2182(Tile.archive10, Message.archive8, true, var1); // L: 1120
			}

			Client.gameState = var0; // L: 1134
		}
	} // L: 1135

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "([Ljz;IIIIIIIB)V",
		garbageValue = "66"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10729
			Widget var9 = var0[var8]; // L: 10730
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || Language.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 10731 10732 10733
				if (var9.isIf3) { // L: 10734
					if (class260.isComponentHidden(var9)) { // L: 10735
						continue;
					}
				} else if (var9.type == 0 && var9 != class242.mousedOverWidgetIf1 && class260.isComponentHidden(var9)) { // L: 10738
					continue;
				}

				int var10 = var9.x + var6; // L: 10740
				int var11 = var7 + var9.y; // L: 10741
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10746
					var12 = var2; // L: 10747
					var13 = var3; // L: 10748
					var14 = var4; // L: 10749
					var15 = var5; // L: 10750
				} else {
					int var16;
					if (var9.type == 9) { // L: 10752
						var16 = var10; // L: 10753
						var17 = var11; // L: 10754
						var18 = var10 + var9.width; // L: 10755
						int var19 = var11 + var9.height; // L: 10756
						if (var18 < var10) { // L: 10757
							var16 = var18; // L: 10759
							var18 = var10; // L: 10760
						}

						if (var19 < var11) { // L: 10762
							var17 = var19; // L: 10764
							var19 = var11; // L: 10765
						}

						++var18; // L: 10767
						++var19; // L: 10768
						var12 = var16 > var2 ? var16 : var2; // L: 10769
						var13 = var17 > var3 ? var17 : var3; // L: 10770
						var14 = var18 < var4 ? var18 : var4; // L: 10771
						var15 = var19 < var5 ? var19 : var5; // L: 10772
					} else {
						var16 = var10 + var9.width; // L: 10775
						var17 = var11 + var9.height; // L: 10776
						var12 = var10 > var2 ? var10 : var2; // L: 10777
						var13 = var11 > var3 ? var11 : var3; // L: 10778
						var14 = var16 < var4 ? var16 : var4; // L: 10779
						var15 = var17 < var5 ? var17 : var5; // L: 10780
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10782
					Client.field648 = true; // L: 10783
					Client.field686 = var10; // L: 10784
					Client.field687 = var11; // L: 10785
				}

				boolean var33 = false; // L: 10787
				if (var9.field3338) { // L: 10788
					switch(Client.field666) { // L: 10789
					case 0:
						var33 = true; // L: 10801
					case 1:
					default:
						break;
					case 2:
						if (Client.field667 == var9.id >>> 16) { // L: 10796
							var33 = true; // L: 10797
						}
						break;
					case 3:
						if (var9.id == Client.field667) { // L: 10791
							var33 = true; // L: 10792
						}
					}
				}

				if (var33 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10805
					if (var9.isIf3) { // L: 10806
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 10807
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10808
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10809
									if (var26.isMouseInputEvent) { // L: 10810
										var26.remove(); // L: 10811
										var26.widget.containsMouse = false; // L: 10812
									}
								}

								if (ByteArrayPool.widgetDragDuration == 0) { // L: 10815
									Client.clickedWidget = null; // L: 10816
									Client.clickedWidgetParent = null; // L: 10817
								}

								if (!Client.isMenuOpen) { // L: 10819
									class87.addCancelMenuEntry(); // L: 10820
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10824 10825
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10826
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10827
									var26.remove(); // L: 10828
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10834
					var18 = MouseHandler.MouseHandler_y; // L: 10835
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10836
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10837
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10838
					}

					boolean var34 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10840
					if (var9.contentType == 1337) { // L: 10841
						if (!Client.isLoading && !Client.isMenuOpen && var34) { // L: 10842
							NPC.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10845
						class91.checkIfMinimapClicked(var9, var10, var11); // L: 10846
					} else {
						if (var9.contentType == 1400) { // L: 10849
							Huffman.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height); // L: 10850
						}

						if (!Client.isMenuOpen && var34) { // L: 10852
							if (var9.contentType == 1400) { // L: 10853
								Huffman.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10854
							} else {
								GrandExchangeEvents.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10857
							}
						}

						boolean var21;
						int var23;
						if (var33) { // L: 10860
							for (int var20 = 0; var20 < var9.field3339.length; ++var20) { // L: 10861
								var21 = false; // L: 10862
								boolean var27 = false; // L: 10863
								if (!var21 && var9.field3339[var20] != null) { // L: 10864
									for (var23 = 0; var23 < var9.field3339[var20].length; ++var23) { // L: 10865
										boolean var24 = false; // L: 10866
										if (var9.field3254 != null) { // L: 10867
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3339[var20][var23]]; // L: 10868
										}

										if (class274.method5296(var9.field3339[var20][var23]) || var24) { // L: 10870
											var21 = true; // L: 10871
											if (var9.field3254 != null && var9.field3254[var20] > Client.cycle) { // L: 10872
												break;
											}

											byte var32 = var9.field3397[var20][var23]; // L: 10873
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10874 10875 10876 10877 10878
												var27 = true; // L: 10880
												break; // L: 10881
											}
										}
									}
								}

								if (var27) { // L: 10886
									if (var20 < 10) { // L: 10887
										GameEngine.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10888
										WorldMapRectangle.Widget_runOnTargetLeave(); // L: 10889
										PendingSpawn.selectSpell(var9.id, var9.childIndex, class135.Widget_unpackTargetMask(Language.getWidgetFlags(var9)), var9.itemId); // L: 10890
										Client.selectedSpellActionName = WorldMapEvent.Widget_getSpellActionName(var9); // L: 10891
										if (Client.selectedSpellActionName == null) { // L: 10892
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + LoginScreenAnimation.colorStartTag(16777215); // L: 10893
									}

									var23 = var9.field3341[var20]; // L: 10895
									if (var9.field3254 == null) { // L: 10896
										var9.field3254 = new int[var9.field3339.length];
									}

									if (var9.field3342 == null) { // L: 10897
										var9.field3342 = new int[var9.field3339.length];
									}

									if (var23 != 0) { // L: 10898
										if (var9.field3254[var20] == 0) { // L: 10899
											var9.field3254[var20] = var23 + Client.cycle + var9.field3342[var20];
										} else {
											var9.field3254[var20] = var23 + Client.cycle; // L: 10900
										}
									} else {
										var9.field3254[var20] = Integer.MAX_VALUE; // L: 10902
									}
								}

								if (!var21 && var9.field3254 != null) { // L: 10904 10905
									var9.field3254[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10909
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10910
								var34 = true;
							} else {
								var34 = false; // L: 10911
							}

							boolean var35 = false; // L: 10912
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class370.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) { // L: 10913
								var35 = true;
							}

							var21 = false; // L: 10914
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class370.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10915
								var21 = true;
							}

							if (var21) { // L: 10916
								class11.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10917
								Huffman.worldMap.method6886(var17, var18, var34 & var35, var34 & var21); // L: 10918
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && class10.method87(Language.getWidgetFlags(var9))) { // L: 10920
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10921
								Client.field682 = true; // L: 10922
								Client.field606 = var10; // L: 10923
								Client.field561 = var11; // L: 10924
							}

							if (var9.hasListener) { // L: 10926
								ScriptEvent var22;
								if (var34 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10927
									var22 = new ScriptEvent(); // L: 10928
									var22.isMouseInputEvent = true; // L: 10929
									var22.widget = var9; // L: 10930
									var22.mouseY = Client.mouseWheelRotation; // L: 10931
									var22.args = var9.onScroll; // L: 10932
									Client.scriptEvents.addFirst(var22); // L: 10933
								}

								if (Client.clickedWidget != null || class20.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10935
									var21 = false; // L: 10936
									var35 = false; // L: 10937
									var34 = false; // L: 10938
								}

								if (!var9.isClicked && var21) { // L: 10940
									var9.isClicked = true; // L: 10941
									if (var9.onClick != null) { // L: 10942
										var22 = new ScriptEvent(); // L: 10943
										var22.isMouseInputEvent = true; // L: 10944
										var22.widget = var9; // L: 10945
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10946
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10947
										var22.args = var9.onClick; // L: 10948
										Client.scriptEvents.addFirst(var22); // L: 10949
									}
								}

								if (var9.isClicked && var35 && var9.onClickRepeat != null) { // L: 10952 10953
									var22 = new ScriptEvent(); // L: 10954
									var22.isMouseInputEvent = true; // L: 10955
									var22.widget = var9; // L: 10956
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10957
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10958
									var22.args = var9.onClickRepeat; // L: 10959
									Client.scriptEvents.addFirst(var22); // L: 10960
								}

								if (var9.isClicked && !var35) { // L: 10963
									var9.isClicked = false; // L: 10964
									if (var9.onRelease != null) { // L: 10965
										var22 = new ScriptEvent(); // L: 10966
										var22.isMouseInputEvent = true; // L: 10967
										var22.widget = var9; // L: 10968
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10969
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10970
										var22.args = var9.onRelease; // L: 10971
										Client.field709.addFirst(var22); // L: 10972
									}
								}

								if (var35 && var9.onHold != null) { // L: 10975 10976
									var22 = new ScriptEvent(); // L: 10977
									var22.isMouseInputEvent = true; // L: 10978
									var22.widget = var9; // L: 10979
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10980
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10981
									var22.args = var9.onHold; // L: 10982
									Client.scriptEvents.addFirst(var22); // L: 10983
								}

								if (!var9.containsMouse && var34) { // L: 10986
									var9.containsMouse = true; // L: 10987
									if (var9.onMouseOver != null) { // L: 10988
										var22 = new ScriptEvent(); // L: 10989
										var22.isMouseInputEvent = true; // L: 10990
										var22.widget = var9; // L: 10991
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10992
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10993
										var22.args = var9.onMouseOver; // L: 10994
										Client.scriptEvents.addFirst(var22); // L: 10995
									}
								}

								if (var9.containsMouse && var34 && var9.onMouseRepeat != null) { // L: 10998 10999
									var22 = new ScriptEvent(); // L: 11000
									var22.isMouseInputEvent = true; // L: 11001
									var22.widget = var9; // L: 11002
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 11003
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11004
									var22.args = var9.onMouseRepeat; // L: 11005
									Client.scriptEvents.addFirst(var22); // L: 11006
								}

								if (var9.containsMouse && !var34) { // L: 11009
									var9.containsMouse = false; // L: 11010
									if (var9.onMouseLeave != null) { // L: 11011
										var22 = new ScriptEvent(); // L: 11012
										var22.isMouseInputEvent = true; // L: 11013
										var22.widget = var9; // L: 11014
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 11015
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11016
										var22.args = var9.onMouseLeave; // L: 11017
										Client.field709.addFirst(var22); // L: 11018
									}
								}

								if (var9.onTimer != null) { // L: 11021
									var22 = new ScriptEvent(); // L: 11022
									var22.widget = var9; // L: 11023
									var22.args = var9.onTimer; // L: 11024
									Client.field708.addFirst(var22); // L: 11025
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3402) { // L: 11027
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3402 <= 32) { // L: 11028
										label817:
										for (var37 = var9.field3402; var37 < Client.changedVarpCount; ++var37) { // L: 11035
											var23 = Client.changedVarps[var37 & 31]; // L: 11036

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) { // L: 11037
												if (var23 == var9.varTransmitTriggers[var36]) { // L: 11038
													var25 = new ScriptEvent(); // L: 11039
													var25.widget = var9; // L: 11040
													var25.args = var9.onVarTransmit; // L: 11041
													Client.scriptEvents.addFirst(var25); // L: 11042
													break label817; // L: 11043
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11029
										var22.widget = var9; // L: 11030
										var22.args = var9.onVarTransmit; // L: 11031
										Client.scriptEvents.addFirst(var22); // L: 11032
									}

									var9.field3402 = Client.changedVarpCount; // L: 11048
								}

								if (var9.onInvTransmit != null && Client.field494 > var9.field3403) { // L: 11050
									if (var9.invTransmitTriggers != null && Client.field494 - var9.field3403 <= 32) { // L: 11051
										label793:
										for (var37 = var9.field3403; var37 < Client.field494; ++var37) { // L: 11058
											var23 = Client.changedItemContainers[var37 & 31]; // L: 11059

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) { // L: 11060
												if (var23 == var9.invTransmitTriggers[var36]) { // L: 11061
													var25 = new ScriptEvent(); // L: 11062
													var25.widget = var9; // L: 11063
													var25.args = var9.onInvTransmit; // L: 11064
													Client.scriptEvents.addFirst(var25); // L: 11065
													break label793; // L: 11066
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11052
										var22.widget = var9; // L: 11053
										var22.args = var9.onInvTransmit; // L: 11054
										Client.scriptEvents.addFirst(var22); // L: 11055
									}

									var9.field3403 = Client.field494; // L: 11071
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3370) { // L: 11073
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3370 <= 32) { // L: 11074
										label769:
										for (var37 = var9.field3370; var37 < Client.changedSkillsCount; ++var37) { // L: 11081
											var23 = Client.changedSkills[var37 & 31]; // L: 11082

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) { // L: 11083
												if (var23 == var9.statTransmitTriggers[var36]) { // L: 11084
													var25 = new ScriptEvent(); // L: 11085
													var25.widget = var9; // L: 11086
													var25.args = var9.onStatTransmit; // L: 11087
													Client.scriptEvents.addFirst(var25); // L: 11088
													break label769; // L: 11089
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11075
										var22.widget = var9; // L: 11076
										var22.args = var9.onStatTransmit; // L: 11077
										Client.scriptEvents.addFirst(var22); // L: 11078
									}

									var9.field3370 = Client.changedSkillsCount; // L: 11094
								}

								if (Client.chatCycle > var9.field3401 && var9.onChatTransmit != null) { // L: 11096
									var22 = new ScriptEvent(); // L: 11097
									var22.widget = var9; // L: 11098
									var22.args = var9.onChatTransmit; // L: 11099
									Client.scriptEvents.addFirst(var22); // L: 11100
								}

								if (Client.field600 > var9.field3401 && var9.onFriendTransmit != null) { // L: 11102
									var22 = new ScriptEvent(); // L: 11103
									var22.widget = var9; // L: 11104
									var22.args = var9.onFriendTransmit; // L: 11105
									Client.scriptEvents.addFirst(var22); // L: 11106
								}

								if (Client.field664 > var9.field3401 && var9.onClanTransmit != null) { // L: 11108
									var22 = new ScriptEvent(); // L: 11109
									var22.widget = var9; // L: 11110
									var22.args = var9.onClanTransmit; // L: 11111
									Client.scriptEvents.addFirst(var22); // L: 11112
								}

								if (Client.field701 > var9.field3401 && var9.field3328 != null) { // L: 11114
									var22 = new ScriptEvent(); // L: 11115
									var22.widget = var9; // L: 11116
									var22.args = var9.field3328; // L: 11117
									Client.scriptEvents.addFirst(var22); // L: 11118
								}

								if (Client.field503 > var9.field3401 && var9.field3271 != null) { // L: 11120
									var22 = new ScriptEvent(); // L: 11121
									var22.widget = var9; // L: 11122
									var22.args = var9.field3271; // L: 11123
									Client.scriptEvents.addFirst(var22); // L: 11124
								}

								if (Client.field703 > var9.field3401 && var9.onStockTransmit != null) { // L: 11126
									var22 = new ScriptEvent(); // L: 11127
									var22.widget = var9; // L: 11128
									var22.args = var9.onStockTransmit; // L: 11129
									Client.scriptEvents.addFirst(var22); // L: 11130
								}

								if (Client.field652 > var9.field3401 && var9.field3385 != null) { // L: 11132
									var22 = new ScriptEvent(); // L: 11133
									var22.widget = var9; // L: 11134
									var22.args = var9.field3385; // L: 11135
									Client.scriptEvents.addFirst(var22); // L: 11136
								}

								if (Client.field705 > var9.field3401 && var9.onMiscTransmit != null) { // L: 11138
									var22 = new ScriptEvent(); // L: 11139
									var22.widget = var9; // L: 11140
									var22.args = var9.onMiscTransmit; // L: 11141
									Client.scriptEvents.addFirst(var22); // L: 11142
								}

								var9.field3401 = Client.cycleCntr; // L: 11144
								if (var9.onKey != null) { // L: 11145
									for (var37 = 0; var37 < Client.field729; ++var37) { // L: 11146
										ScriptEvent var31 = new ScriptEvent(); // L: 11147
										var31.widget = var9; // L: 11148
										var31.keyTyped = Client.field731[var37]; // L: 11149
										var31.keyPressed = Client.field684[var37]; // L: 11150
										var31.args = var9.onKey; // L: 11151
										Client.scriptEvents.addFirst(var31); // L: 11152
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3374 != null) { // L: 11155
									var38 = class123.method2720(); // L: 11156

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11157
										var30 = new ScriptEvent(); // L: 11158
										var30.widget = var9; // L: 11159
										var30.keyTyped = var38[var23]; // L: 11160
										var30.args = var9.field3374; // L: 11161
										Client.scriptEvents.addFirst(var30); // L: 11162
									}
								}

								if (var9.field3321 != null) { // L: 11165
									var38 = GameObject.method4297(); // L: 11166

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11167
										var30 = new ScriptEvent(); // L: 11168
										var30.widget = var9; // L: 11169
										var30.keyTyped = var38[var23]; // L: 11170
										var30.args = var9.field3321; // L: 11171
										Client.scriptEvents.addFirst(var30); // L: 11172
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11177
							if (Client.clickedWidget != null || class20.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11178
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11179
								if (var9.mouseOverRedirect >= 0) { // L: 11180
									class242.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class242.mousedOverWidgetIf1 = var9; // L: 11181
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11183
								class126.field1516 = var9; // L: 11184
							}

							if (var9.scrollHeight > var9.height) { // L: 11186
								PlatformInfo.method6860(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11188
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 11189
							if (var9.children != null) { // L: 11190
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11191
							if (var28 != null) { // L: 11192
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11193
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11194
										if (var29.isMouseInputEvent) { // L: 11195
											var29.remove(); // L: 11196
											var29.widget.containsMouse = false; // L: 11197
										}
									}

									if (ByteArrayPool.widgetDragDuration == 0) { // L: 11200
										Client.clickedWidget = null; // L: 11201
										Client.clickedWidgetParent = null; // L: 11202
									}

									if (!Client.isMenuOpen) { // L: 11204
										class87.addCancelMenuEntry(); // L: 11205
									}
								}

								class123.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 11208
							}
						}
					}
				}
			}
		}

	} // L: 11212
}
