import java.util.Date;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive7;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2060258139
	)
	int minPlane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1398963829
	)
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 682976363
	)
	int regionStartX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 38335685
	)
	int regionStartY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1282107961
	)
	int regionEndX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -167107483
	)
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lar;B)V",
		garbageValue = "100"
	)
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 17
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 18
		}

		if (var1.regionLowY > this.regionEndY) { // L: 19
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 20
			var1.regionHighY = this.regionEndY;
		}

	} // L: 21

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-339896458"
	)
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2135820245"
	)
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1761492451"
	)
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 39 40
			return var4; // L: 41
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;",
		garbageValue = "-1553504587"
	)
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 45
			return null; // L: 46
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 48
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 49
			return new Coord(this.minPlane, var3, var4); // L: 50
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "2144381737"
	)
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 54
		this.planes = var1.readUnsignedByte(); // L: 55
		this.regionStartX = var1.readUnsignedShort(); // L: 56
		this.regionStartY = var1.readUnsignedShort(); // L: 57
		this.regionEndX = var1.readUnsignedShort(); // L: 58
		this.regionEndY = var1.readUnsignedShort(); // L: 59
		this.postRead(); // L: 60
	} // L: 61

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1994421574"
	)
	void postRead() {
	} // L: 63

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1982002808"
	)
	public static int getVarbit(int var0) {
		VarbitDefinition var1 = TaskHandler.method3567(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}

	@ObfuscatedName("z")
	public static String method650(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 30
		int var2 = Calendar.Calendar_calendar.get(7); // L: 31
		int var3 = Calendar.Calendar_calendar.get(5); // L: 32
		int var4 = Calendar.Calendar_calendar.get(2); // L: 33
		int var5 = Calendar.Calendar_calendar.get(1); // L: 34
		int var6 = Calendar.Calendar_calendar.get(11); // L: 35
		int var7 = Calendar.Calendar_calendar.get(12); // L: 36
		int var8 = Calendar.Calendar_calendar.get(13); // L: 37
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 38
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1996016917"
	)
	static final void method649() {
		Object var10000 = null; // L: 126
		String var0 = "You can't add yourself to your own friend list";
		WorldMapRectangle.addGameMessage(30, "", var0); // L: 128
	} // L: 130

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IIIIIIB)V",
		garbageValue = "21"
	)
	static final void method648(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field743) { // L: 9277
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 9278
		}

		Client.field743 = false; // L: 9279
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 9280
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 9281
				var0.scrollY -= 4; // L: 9282
				class52.invalidateWidget(var0); // L: 9283
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 9285
				var0.scrollY += 4; // L: 9286
				class52.invalidateWidget(var0); // L: 9287
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 9289
				var7 = var3 * (var3 - 32) / var4; // L: 9290
				if (var7 < 8) { // L: 9291
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 9292
				int var9 = var3 - 32 - var7; // L: 9293
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 9294
				class52.invalidateWidget(var0); // L: 9295
				Client.field743 = true; // L: 9296
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 9299
			var7 = var0.width; // L: 9300
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 9301
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 9302
				class52.invalidateWidget(var0); // L: 9303
			}
		}

	} // L: 9306

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "([Lhq;IIIIIIIB)V",
		garbageValue = "2"
	)
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 9649
			Widget var9 = var0[var8]; // L: 9650
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || WorldMapIcon_0.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 9651 9652 9653
				if (var9.isIf3) { // L: 9654
					if (GrandExchangeOfferUnitPriceComparator.isComponentHidden(var9)) { // L: 9655
						continue;
					}
				} else if (var9.type == 0 && var9 != TriBool.mousedOverWidgetIf1 && GrandExchangeOfferUnitPriceComparator.isComponentHidden(var9)) { // L: 9658
					continue;
				}

				int var10 = var9.x + var6; // L: 9660
				int var11 = var7 + var9.y; // L: 9661
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 9666
					var12 = var2; // L: 9667
					var13 = var3; // L: 9668
					var14 = var4; // L: 9669
					var15 = var5; // L: 9670
				} else {
					int var16;
					if (var9.type == 9) { // L: 9672
						var16 = var10; // L: 9673
						var17 = var11; // L: 9674
						var18 = var10 + var9.width; // L: 9675
						int var19 = var11 + var9.height; // L: 9676
						if (var18 < var10) { // L: 9677
							var16 = var18; // L: 9679
							var18 = var10; // L: 9680
						}

						if (var19 < var11) { // L: 9682
							var17 = var19; // L: 9684
							var19 = var11; // L: 9685
						}

						++var18; // L: 9687
						++var19; // L: 9688
						var12 = var16 > var2 ? var16 : var2; // L: 9689
						var13 = var17 > var3 ? var17 : var3; // L: 9690
						var14 = var18 < var4 ? var18 : var4; // L: 9691
						var15 = var19 < var5 ? var19 : var5; // L: 9692
					} else {
						var16 = var10 + var9.width; // L: 9695
						var17 = var11 + var9.height; // L: 9696
						var12 = var10 > var2 ? var10 : var2; // L: 9697
						var13 = var11 > var3 ? var11 : var3; // L: 9698
						var14 = var16 < var4 ? var16 : var4; // L: 9699
						var15 = var17 < var5 ? var17 : var5; // L: 9700
					}
				}

				if (var9 == Client.clickedWidget) { // L: 9702
					Client.field880 = true; // L: 9703
					Client.field859 = var10; // L: 9704
					Client.field795 = var11; // L: 9705
				}

				boolean var32 = false; // L: 9707
				if (var9.field2676) { // L: 9708
					switch(Client.field865) { // L: 9709
					case 0:
						var32 = true; // L: 9721
					case 1:
					default:
						break;
					case 2:
						if (Client.field840 == var9.id >>> 16) { // L: 9716
							var32 = true; // L: 9717
						}
						break;
					case 3:
						if (var9.id == Client.field840) { // L: 9711
							var32 = true; // L: 9712
						}
					}
				}

				if (var32 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 9725
					if (var9.isIf3) { // L: 9726
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 9727
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 9728
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 9729
									if (var26.isMouseInputEvent) { // L: 9730
										var26.remove(); // L: 9731
										var26.widget.containsMouse = false; // L: 9732
									}
								}

								if (BoundaryObject.widgetDragDuration == 0) { // L: 9735
									Client.clickedWidget = null; // L: 9736
									Client.clickedWidgetParent = null; // L: 9737
								}

								if (!Client.isMenuOpen) { // L: 9739
									WorldMapAreaData.addCancelMenuEntry(); // L: 9740
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 9744 9745
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 9746
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 9747
									var26.remove(); // L: 9748
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 9754
					var18 = MouseHandler.MouseHandler_y; // L: 9755
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 9756
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 9757
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 9758
					}

					boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 9760
					if (var9.contentType == 1337) { // L: 9761
						if (!Client.isLoading && !Client.isMenuOpen && var33) { // L: 9762
							JagexCache.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 9765
						GrandExchangeEvent.checkIfMinimapClicked(var9, var10, var11); // L: 9766
					} else {
						if (var9.contentType == 1400) { // L: 9769
							Message.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var33, var10, var11, var9.width, var9.height); // L: 9770
						}

						if (!Client.isMenuOpen && var33) { // L: 9772
							if (var9.contentType == 1400) { // L: 9773
								Message.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 9774
							} else {
								class1.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 9777
							}
						}

						boolean var21;
						int var23;
						if (var32) { // L: 9780
							for (int var20 = 0; var20 < var9.field2626.length; ++var20) { // L: 9781
								var21 = false; // L: 9782
								boolean var27 = false; // L: 9783
								if (!var21 && var9.field2626[var20] != null) { // L: 9784
									for (var23 = 0; var23 < var9.field2626[var20].length; ++var23) { // L: 9785
										boolean var24 = false; // L: 9786
										if (var9.field2661 != null) { // L: 9787
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field2626[var20][var23]]; // L: 9788
										}

										if (Buddy.method5277(var9.field2626[var20][var23]) || var24) { // L: 9790
											var21 = true; // L: 9791
											if (var9.field2661 != null && var9.field2661[var20] > Client.cycle) { // L: 9792
												break;
											}

											byte var31 = var9.field2719[var20][var23]; // L: 9793
											if (var31 == 0 || ((var31 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var31 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var31 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var31 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 9794 9795 9796 9797 9798
												var27 = true; // L: 9800
												break;
											}
										}
									}
								}

								if (var27) { // L: 9806
									if (var20 < 10) { // L: 9807
										UserComparator8.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 9808
										class22.Widget_runOnTargetLeave(); // L: 9809
										User.selectSpell(var9.id, var9.childIndex, GrandExchangeOfferTotalQuantityComparator.Widget_unpackTargetMask(WorldMapIcon_0.getWidgetFlags(var9)), var9.itemId); // L: 9810
										Client.selectedSpellActionName = SpriteMask.Widget_getSpellActionName(var9); // L: 9811
										if (Client.selectedSpellActionName == null) { // L: 9812
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + WorldMapAreaData.colorStartTag(16777215); // L: 9813
									}

									var23 = var9.field2682[var20]; // L: 9815
									if (var9.field2661 == null) { // L: 9816
										var9.field2661 = new int[var9.field2626.length];
									}

									if (var9.field2683 == null) { // L: 9817
										var9.field2683 = new int[var9.field2626.length];
									}

									if (var23 != 0) { // L: 9818
										if (var9.field2661[var20] == 0) { // L: 9819
											var9.field2661[var20] = var23 + Client.cycle + var9.field2683[var20];
										} else {
											var9.field2661[var20] = var23 + Client.cycle; // L: 9820
										}
									} else {
										var9.field2661[var20] = Integer.MAX_VALUE; // L: 9822
									}
								}

								if (!var21 && var9.field2661 != null) { // L: 9824 9825
									var9.field2661[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 9829
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 9830
								var33 = true;
							} else {
								var33 = false; // L: 9831
							}

							boolean var34 = false; // L: 9832
							if ((MouseHandler.MouseHandler_currentButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var33) { // L: 9833
								var34 = true;
							}

							var21 = false; // L: 9834
							if ((MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 9835
								var21 = true;
							}

							if (var21) { // L: 9836
								class13.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 9837
								Message.worldMap.method6430(var17, var18, var33 & var34, var33 & var21); // L: 9838
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var33 && Archive.method4386(WorldMapIcon_0.getWidgetFlags(var9))) { // L: 9840
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 9841
								Client.field799 = true; // L: 9842
								Client.field856 = var10; // L: 9843
								Client.field785 = var11; // L: 9844
							}

							if (var9.hasListener) { // L: 9846
								ScriptEvent var22;
								if (var33 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 9847
									var22 = new ScriptEvent(); // L: 9848
									var22.isMouseInputEvent = true; // L: 9849
									var22.widget = var9; // L: 9850
									var22.mouseY = Client.mouseWheelRotation; // L: 9851
									var22.args = var9.onScroll; // L: 9852
									Client.scriptEvents.addFirst(var22); // L: 9853
								}

								if (Client.clickedWidget != null || BuddyRankComparator.dragInventoryWidget != null || Client.isMenuOpen) { // L: 9855
									var21 = false; // L: 9856
									var34 = false; // L: 9857
									var33 = false; // L: 9858
								}

								if (!var9.isClicked && var21) { // L: 9860
									var9.isClicked = true; // L: 9861
									if (var9.onClick != null) { // L: 9862
										var22 = new ScriptEvent(); // L: 9863
										var22.isMouseInputEvent = true; // L: 9864
										var22.widget = var9; // L: 9865
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 9866
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 9867
										var22.args = var9.onClick; // L: 9868
										Client.scriptEvents.addFirst(var22); // L: 9869
									}
								}

								if (var9.isClicked && var34 && var9.onClickRepeat != null) { // L: 9872 9873
									var22 = new ScriptEvent(); // L: 9874
									var22.isMouseInputEvent = true; // L: 9875
									var22.widget = var9; // L: 9876
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 9877
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 9878
									var22.args = var9.onClickRepeat; // L: 9879
									Client.scriptEvents.addFirst(var22); // L: 9880
								}

								if (var9.isClicked && !var34) { // L: 9883
									var9.isClicked = false; // L: 9884
									if (var9.onRelease != null) { // L: 9885
										var22 = new ScriptEvent(); // L: 9886
										var22.isMouseInputEvent = true; // L: 9887
										var22.widget = var9; // L: 9888
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 9889
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 9890
										var22.args = var9.onRelease; // L: 9891
										Client.field912.addFirst(var22); // L: 9892
									}
								}

								if (var34 && var9.onHold != null) { // L: 9895 9896
									var22 = new ScriptEvent(); // L: 9897
									var22.isMouseInputEvent = true; // L: 9898
									var22.widget = var9; // L: 9899
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 9900
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 9901
									var22.args = var9.onHold; // L: 9902
									Client.scriptEvents.addFirst(var22); // L: 9903
								}

								if (!var9.containsMouse && var33) { // L: 9906
									var9.containsMouse = true; // L: 9907
									if (var9.onMouseOver != null) { // L: 9908
										var22 = new ScriptEvent(); // L: 9909
										var22.isMouseInputEvent = true; // L: 9910
										var22.widget = var9; // L: 9911
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 9912
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 9913
										var22.args = var9.onMouseOver; // L: 9914
										Client.scriptEvents.addFirst(var22); // L: 9915
									}
								}

								if (var9.containsMouse && var33 && var9.onMouseRepeat != null) { // L: 9918 9919
									var22 = new ScriptEvent(); // L: 9920
									var22.isMouseInputEvent = true; // L: 9921
									var22.widget = var9; // L: 9922
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 9923
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 9924
									var22.args = var9.onMouseRepeat; // L: 9925
									Client.scriptEvents.addFirst(var22); // L: 9926
								}

								if (var9.containsMouse && !var33) { // L: 9929
									var9.containsMouse = false; // L: 9930
									if (var9.onMouseLeave != null) { // L: 9931
										var22 = new ScriptEvent(); // L: 9932
										var22.isMouseInputEvent = true; // L: 9933
										var22.widget = var9; // L: 9934
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 9935
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 9936
										var22.args = var9.onMouseLeave; // L: 9937
										Client.field912.addFirst(var22); // L: 9938
									}
								}

								if (var9.onTimer != null) { // L: 9941
									var22 = new ScriptEvent(); // L: 9942
									var22.widget = var9; // L: 9943
									var22.args = var9.onTimer; // L: 9944
									Client.field877.addFirst(var22); // L: 9945
								}

								ScriptEvent var25;
								int var35;
								int var36;
								if (var9.onVarTransmit != null && Client.field864 > var9.field2618) { // L: 9947
									if (var9.varTransmitTriggers != null && Client.field864 - var9.field2618 <= 32) { // L: 9948
										label783:
										for (var36 = var9.field2618; var36 < Client.field864; ++var36) { // L: 9955
											var23 = Client.field863[var36 & 31]; // L: 9956

											for (var35 = 0; var35 < var9.varTransmitTriggers.length; ++var35) { // L: 9957
												if (var23 == var9.varTransmitTriggers[var35]) { // L: 9958
													var25 = new ScriptEvent(); // L: 9959
													var25.widget = var9; // L: 9960
													var25.args = var9.onVarTransmit; // L: 9961
													Client.scriptEvents.addFirst(var25); // L: 9962
													break label783; // L: 9963
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 9949
										var22.widget = var9; // L: 9950
										var22.args = var9.onVarTransmit; // L: 9951
										Client.scriptEvents.addFirst(var22); // L: 9952
									}

									var9.field2618 = Client.field864; // L: 9968
								}

								if (var9.onInvTransmit != null && Client.field903 > var9.field2727) { // L: 9970
									if (var9.invTransmitTriggers != null && Client.field903 - var9.field2727 <= 32) { // L: 9971
										label759:
										for (var36 = var9.field2727; var36 < Client.field903; ++var36) { // L: 9978
											var23 = Client.changedItemContainers[var36 & 31]; // L: 9979

											for (var35 = 0; var35 < var9.invTransmitTriggers.length; ++var35) { // L: 9980
												if (var23 == var9.invTransmitTriggers[var35]) { // L: 9981
													var25 = new ScriptEvent(); // L: 9982
													var25.widget = var9; // L: 9983
													var25.args = var9.onInvTransmit; // L: 9984
													Client.scriptEvents.addFirst(var25); // L: 9985
													break label759; // L: 9986
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 9972
										var22.widget = var9; // L: 9973
										var22.args = var9.onInvTransmit; // L: 9974
										Client.scriptEvents.addFirst(var22); // L: 9975
									}

									var9.field2727 = Client.field903; // L: 9991
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field2681) { // L: 9993
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field2681 <= 32) { // L: 9994
										label735:
										for (var36 = var9.field2681; var36 < Client.changedSkillsCount; ++var36) { // L: 10001
											var23 = Client.changedSkills[var36 & 31]; // L: 10002

											for (var35 = 0; var35 < var9.statTransmitTriggers.length; ++var35) { // L: 10003
												if (var23 == var9.statTransmitTriggers[var35]) { // L: 10004
													var25 = new ScriptEvent(); // L: 10005
													var25.widget = var9; // L: 10006
													var25.args = var9.onStatTransmit; // L: 10007
													Client.scriptEvents.addFirst(var25); // L: 10008
													break label735; // L: 10009
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 9995
										var22.widget = var9; // L: 9996
										var22.args = var9.onStatTransmit; // L: 9997
										Client.scriptEvents.addFirst(var22); // L: 9998
									}

									var9.field2681 = Client.changedSkillsCount; // L: 10014
								}

								if (Client.chatCycle > var9.field2664 && var9.onChatTransmit != null) { // L: 10016
									var22 = new ScriptEvent(); // L: 10017
									var22.widget = var9; // L: 10018
									var22.args = var9.onChatTransmit; // L: 10019
									Client.scriptEvents.addFirst(var22); // L: 10020
								}

								if (Client.field870 > var9.field2664 && var9.onFriendTransmit != null) { // L: 10022
									var22 = new ScriptEvent(); // L: 10023
									var22.widget = var9; // L: 10024
									var22.args = var9.onFriendTransmit; // L: 10025
									Client.scriptEvents.addFirst(var22); // L: 10026
								}

								if (Client.field871 > var9.field2664 && var9.onClanTransmit != null) { // L: 10028
									var22 = new ScriptEvent(); // L: 10029
									var22.widget = var9; // L: 10030
									var22.args = var9.onClanTransmit; // L: 10031
									Client.scriptEvents.addFirst(var22); // L: 10032
								}

								if (Client.field872 > var9.field2664 && var9.onStockTransmit != null) { // L: 10034
									var22 = new ScriptEvent(); // L: 10035
									var22.widget = var9; // L: 10036
									var22.args = var9.onStockTransmit; // L: 10037
									Client.scriptEvents.addFirst(var22); // L: 10038
								}

								if (Client.field873 > var9.field2664 && var9.field2722 != null) { // L: 10040
									var22 = new ScriptEvent(); // L: 10041
									var22.widget = var9; // L: 10042
									var22.args = var9.field2722; // L: 10043
									Client.scriptEvents.addFirst(var22); // L: 10044
								}

								if (Client.field775 > var9.field2664 && var9.onMiscTransmit != null) { // L: 10046
									var22 = new ScriptEvent(); // L: 10047
									var22.widget = var9; // L: 10048
									var22.args = var9.onMiscTransmit; // L: 10049
									Client.scriptEvents.addFirst(var22); // L: 10050
								}

								var9.field2664 = Client.cycleCntr; // L: 10052
								if (var9.onKey != null) { // L: 10053
									for (var36 = 0; var36 < Client.field898; ++var36) { // L: 10054
										ScriptEvent var30 = new ScriptEvent(); // L: 10055
										var30.widget = var9; // L: 10056
										var30.keyTyped = Client.field900[var36]; // L: 10057
										var30.keyPressed = Client.field899[var36]; // L: 10058
										var30.args = var9.onKey; // L: 10059
										Client.scriptEvents.addFirst(var30); // L: 10060
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 10065
							if (Client.clickedWidget != null || BuddyRankComparator.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10066
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10067
								if (var9.mouseOverRedirect >= 0) { // L: 10068
									TriBool.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									TriBool.mousedOverWidgetIf1 = var9; // L: 10069
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10071
								Occluder.field1950 = var9; // L: 10072
							}

							if (var9.scrollHeight > var9.height) { // L: 10074
								method648(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 10076
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 10077
							if (var9.children != null) { // L: 10078
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 10079
							if (var28 != null) { // L: 10080
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 10081
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10082
										if (var29.isMouseInputEvent) { // L: 10083
											var29.remove(); // L: 10084
											var29.widget.containsMouse = false; // L: 10085
										}
									}

									if (BoundaryObject.widgetDragDuration == 0) { // L: 10088
										Client.clickedWidget = null; // L: 10089
										Client.clickedWidgetParent = null; // L: 10090
									}

									if (!Client.isMenuOpen) { // L: 10092
										WorldMapAreaData.addCancelMenuEntry(); // L: 10093
									}
								}

								GameObject.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 10096
							}
						}
					}
				}
			}
		}

	} // L: 10100
}
