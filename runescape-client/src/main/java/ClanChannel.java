import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("y")
	public static short[][] field1512;
	@ObfuscatedName("i")
	boolean field1510;
	@ObfuscatedName("w")
	boolean field1518;
	@ObfuscatedName("s")
	@Export("members")
	public List members;
	@ObfuscatedName("a")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -4755117634906331749L
	)
	long field1514;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	public byte field1516;
	@ObfuscatedName("p")
	public byte field1511;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1518 = true; // L: 13
		this.name = null; // L: 17
		this.method2806(var1); // L: 26
	} // L: 27

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "32"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method7579(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			class122.method2599(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "8"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1989668553"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-77"
	)
	public int method2809() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-328026821"
	)
	public int method2817(String var1) {
		if (!this.field1518) { // L: 60
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 61
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 62
				}
			}

			return -1; // L: 64
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "1502263315"
	)
	void method2806(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1510 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1518 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1514 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1511 = var1.readByte(); // L: 77
		this.field1516 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1510) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1518) { // L: 87
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 88
				var6.world = var1.readUnsignedShort(); // L: 89
				if (var3 >= 3) { // L: 90
					var1.readBoolean(); // L: 91
				}

				this.members.add(var5, var6); // L: 94
			}
		}

	} // L: 97

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-894225257"
	)
	public static int method2824(CharSequence var0) {
		int var1 = var0.length(); // L: 147
		int var2 = 0; // L: 148

		for (int var3 = 0; var3 < var1; ++var3) { // L: 149
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 150
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([Ljf;IIIIIIII)V",
		garbageValue = "-879561434"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10628
			Widget var9 = var0[var8]; // L: 10629
			if (var9 != null && var9.parentId == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasListener || PendingSpawn.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent || var9.contentType == 1338)) { // L: 10630 10631 10632
				if (var9.isIf3) { // L: 10633
					if (Varcs.isComponentHidden(var9)) { // L: 10634
						continue;
					}
				} else if (var9.type == 0 && var9 != WorldMapData_0.mousedOverWidgetIf1 && Varcs.isComponentHidden(var9)) { // L: 10637
					continue;
				}

				int var10 = var9.x + var6; // L: 10639
				int var11 = var7 + var9.y; // L: 10640
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10645
					var12 = var2; // L: 10646
					var13 = var3; // L: 10647
					var14 = var4; // L: 10648
					var15 = var5; // L: 10649
				} else {
					int var16;
					if (var9.type == 9) { // L: 10651
						var16 = var10; // L: 10652
						var17 = var11; // L: 10653
						var18 = var10 + var9.width; // L: 10654
						int var19 = var11 + var9.height; // L: 10655
						if (var18 < var10) { // L: 10656
							var16 = var18; // L: 10658
							var18 = var10; // L: 10659
						}

						if (var19 < var11) { // L: 10661
							var17 = var19; // L: 10663
							var19 = var11; // L: 10664
						}

						++var18; // L: 10666
						++var19; // L: 10667
						var12 = var16 > var2 ? var16 : var2; // L: 10668
						var13 = var17 > var3 ? var17 : var3; // L: 10669
						var14 = var18 < var4 ? var18 : var4; // L: 10670
						var15 = var19 < var5 ? var19 : var5; // L: 10671
					} else {
						var16 = var10 + var9.width; // L: 10674
						var17 = var11 + var9.height; // L: 10675
						var12 = var10 > var2 ? var10 : var2; // L: 10676
						var13 = var11 > var3 ? var11 : var3; // L: 10677
						var14 = var16 < var4 ? var16 : var4; // L: 10678
						var15 = var17 < var5 ? var17 : var5; // L: 10679
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10681
					Client.field680 = true; // L: 10682
					Client.field652 = var10; // L: 10683
					Client.field468 = var11; // L: 10684
				}

				boolean var33 = false; // L: 10686
				if (var9.field3125) { // L: 10687
					switch(Client.field479) { // L: 10688
					case 0:
						var33 = true; // L: 10695
					case 1:
					default:
						break;
					case 2:
						if (Client.field633 == var9.id >>> 16) { // L: 10698
							var33 = true; // L: 10699
						}
						break;
					case 3:
						if (var9.id == Client.field633) { // L: 10690
							var33 = true; // L: 10691
						}
					}
				}

				if (var33 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10704
					if (var9.isIf3) { // L: 10705
						ScriptEvent var26;
						if (var9.noClickThrough) { // L: 10706
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10707
								for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10708
									if (var26.isMouseInputEvent) { // L: 10709
										var26.remove(); // L: 10710
										var26.widget.containsMouse = false; // L: 10711
									}
								}

								if (class134.widgetDragDuration == 0) { // L: 10714
									Client.clickedWidget = null; // L: 10715
									Client.clickedWidgetParent = null; // L: 10716
								}

								if (!Client.isMenuOpen) { // L: 10718
									FriendSystem.addCancelMenuEntry(); // L: 10719
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10723 10724
							for (var26 = (ScriptEvent)Client.scriptEvents.last(); var26 != null; var26 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10725
								if (var26.isMouseInputEvent && var26.widget.onScroll == var26.args) { // L: 10726
									var26.remove(); // L: 10727
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10733
					var18 = MouseHandler.MouseHandler_y; // L: 10734
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10735
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10736
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10737
					}

					boolean var34 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10739
					if (var9.contentType == 1337) { // L: 10740
						if (!Client.isLoading && !Client.isMenuOpen && var34) { // L: 10741
							DevicePcmPlayerProvider.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10744
						class1.checkIfMinimapClicked(var9, var10, var11); // L: 10745
					} else {
						if (var9.contentType == 1400) { // L: 10748
							class133.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var34, var10, var11, var9.width, var9.height); // L: 10749
						}

						if (!Client.isMenuOpen && var34) { // L: 10751
							if (var9.contentType == 1400) { // L: 10752
								class133.worldMap.addElementMenuOptions(var10, var11, var9.width, var9.height, var17, var18); // L: 10753
							} else {
								class114.Widget_addToMenu(var9, var17 - var10, var18 - var11); // L: 10756
							}
						}

						boolean var21;
						int var23;
						if (var33) { // L: 10759
							for (int var20 = 0; var20 < var9.field3180.length; ++var20) { // L: 10760
								var21 = false; // L: 10761
								boolean var27 = false; // L: 10762
								if (!var21 && var9.field3180[var20] != null) { // L: 10763
									for (var23 = 0; var23 < var9.field3180[var20].length; ++var23) { // L: 10764
										boolean var24 = false; // L: 10765
										if (var9.field3194 != null) { // L: 10766
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3180[var20][var23]]; // L: 10767
										}

										if (InterfaceParent.method2080(var9.field3180[var20][var23]) || var24) { // L: 10769
											var21 = true; // L: 10770
											if (var9.field3194 != null && var9.field3194[var20] > Client.cycle) { // L: 10771
												break;
											}

											byte var32 = var9.field3105[var20][var23]; // L: 10772
											if (var32 == 0 || ((var32 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var32 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var32 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var32 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10773 10774 10775 10776 10777
												var27 = true; // L: 10779
												break;
											}
										}
									}
								}

								if (var27) { // L: 10785
									if (var20 < 10) { // L: 10786
										GrandExchangeEvents.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10787
										class262.Widget_runOnTargetLeave(); // L: 10788
										Decimator.selectSpell(var9.id, var9.childIndex, SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var9)), var9.itemId); // L: 10789
										Client.selectedSpellActionName = class20.Widget_getSpellActionName(var9); // L: 10790
										if (Client.selectedSpellActionName == null) { // L: 10791
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + MouseHandler.colorStartTag(16777215); // L: 10792
									}

									var23 = var9.field3128[var20]; // L: 10794
									if (var9.field3194 == null) { // L: 10795
										var9.field3194 = new int[var9.field3180.length];
									}

									if (var9.field3129 == null) { // L: 10796
										var9.field3129 = new int[var9.field3180.length];
									}

									if (var23 != 0) { // L: 10797
										if (var9.field3194[var20] == 0) { // L: 10798
											var9.field3194[var20] = var23 + Client.cycle + var9.field3129[var20];
										} else {
											var9.field3194[var20] = var23 + Client.cycle; // L: 10799
										}
									} else {
										var9.field3194[var20] = Integer.MAX_VALUE; // L: 10801
									}
								}

								if (!var21 && var9.field3194 != null) { // L: 10803 10804
									var9.field3194[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10808
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10809
								var34 = true;
							} else {
								var34 = false; // L: 10810
							}

							boolean var35 = false; // L: 10811
							if ((MouseHandler.MouseHandler_currentButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var34) { // L: 10812
								var35 = true;
							}

							var21 = false; // L: 10813
							if ((MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10814
								var21 = true;
							}

							if (var21) { // L: 10815
								UserComparator6.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var10, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.contentType == 1400) { // L: 10816
								class133.worldMap.method6625(var17, var18, var34 & var35, var34 & var21); // L: 10817
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var34 && PlayerComposition.method5067(PendingSpawn.getWidgetFlags(var9))) { // L: 10819
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10820
								Client.field648 = true; // L: 10821
								Client.field649 = var10; // L: 10822
								Client.field650 = var11; // L: 10823
							}

							if (var9.hasListener) { // L: 10825
								ScriptEvent var22;
								if (var34 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10826
									var22 = new ScriptEvent(); // L: 10827
									var22.isMouseInputEvent = true; // L: 10828
									var22.widget = var9; // L: 10829
									var22.mouseY = Client.mouseWheelRotation; // L: 10830
									var22.args = var9.onScroll; // L: 10831
									Client.scriptEvents.addFirst(var22); // L: 10832
								}

								if (Client.clickedWidget != null || class247.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10834
									var21 = false; // L: 10835
									var35 = false; // L: 10836
									var34 = false; // L: 10837
								}

								if (!var9.isClicked && var21) { // L: 10839
									var9.isClicked = true; // L: 10840
									if (var9.onClick != null) { // L: 10841
										var22 = new ScriptEvent(); // L: 10842
										var22.isMouseInputEvent = true; // L: 10843
										var22.widget = var9; // L: 10844
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var10; // L: 10845
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10846
										var22.args = var9.onClick; // L: 10847
										Client.scriptEvents.addFirst(var22); // L: 10848
									}
								}

								if (var9.isClicked && var35 && var9.onClickRepeat != null) { // L: 10851 10852
									var22 = new ScriptEvent(); // L: 10853
									var22.isMouseInputEvent = true; // L: 10854
									var22.widget = var9; // L: 10855
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10856
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10857
									var22.args = var9.onClickRepeat; // L: 10858
									Client.scriptEvents.addFirst(var22); // L: 10859
								}

								if (var9.isClicked && !var35) { // L: 10862
									var9.isClicked = false; // L: 10863
									if (var9.onRelease != null) { // L: 10864
										var22 = new ScriptEvent(); // L: 10865
										var22.isMouseInputEvent = true; // L: 10866
										var22.widget = var9; // L: 10867
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10868
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10869
										var22.args = var9.onRelease; // L: 10870
										Client.field675.addFirst(var22); // L: 10871
									}
								}

								if (var35 && var9.onHold != null) { // L: 10874 10875
									var22 = new ScriptEvent(); // L: 10876
									var22.isMouseInputEvent = true; // L: 10877
									var22.widget = var9; // L: 10878
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10879
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10880
									var22.args = var9.onHold; // L: 10881
									Client.scriptEvents.addFirst(var22); // L: 10882
								}

								if (!var9.containsMouse && var34) { // L: 10885
									var9.containsMouse = true; // L: 10886
									if (var9.onMouseOver != null) { // L: 10887
										var22 = new ScriptEvent(); // L: 10888
										var22.isMouseInputEvent = true; // L: 10889
										var22.widget = var9; // L: 10890
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10891
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10892
										var22.args = var9.onMouseOver; // L: 10893
										Client.scriptEvents.addFirst(var22); // L: 10894
									}
								}

								if (var9.containsMouse && var34 && var9.onMouseRepeat != null) { // L: 10897 10898
									var22 = new ScriptEvent(); // L: 10899
									var22.isMouseInputEvent = true; // L: 10900
									var22.widget = var9; // L: 10901
									var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10902
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10903
									var22.args = var9.onMouseRepeat; // L: 10904
									Client.scriptEvents.addFirst(var22); // L: 10905
								}

								if (var9.containsMouse && !var34) { // L: 10908
									var9.containsMouse = false; // L: 10909
									if (var9.onMouseLeave != null) { // L: 10910
										var22 = new ScriptEvent(); // L: 10911
										var22.isMouseInputEvent = true; // L: 10912
										var22.widget = var9; // L: 10913
										var22.mouseX = MouseHandler.MouseHandler_x - var10; // L: 10914
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10915
										var22.args = var9.onMouseLeave; // L: 10916
										Client.field675.addFirst(var22); // L: 10917
									}
								}

								if (var9.onTimer != null) { // L: 10920
									var22 = new ScriptEvent(); // L: 10921
									var22.widget = var9; // L: 10922
									var22.args = var9.onTimer; // L: 10923
									Client.field674.addFirst(var22); // L: 10924
								}

								ScriptEvent var25;
								int var36;
								int var37;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3189) { // L: 10926
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3189 <= 32) { // L: 10927
										label818:
										for (var37 = var9.field3189; var37 < Client.changedVarpCount; ++var37) { // L: 10934
											var23 = Client.changedVarps[var37 & 31]; // L: 10935

											for (var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) { // L: 10936
												if (var23 == var9.varTransmitTriggers[var36]) { // L: 10937
													var25 = new ScriptEvent(); // L: 10938
													var25.widget = var9; // L: 10939
													var25.args = var9.onVarTransmit; // L: 10940
													Client.scriptEvents.addFirst(var25); // L: 10941
													break label818; // L: 10942
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10928
										var22.widget = var9; // L: 10929
										var22.args = var9.onVarTransmit; // L: 10930
										Client.scriptEvents.addFirst(var22); // L: 10931
									}

									var9.field3189 = Client.changedVarpCount; // L: 10947
								}

								if (var9.onInvTransmit != null && Client.field659 > var9.field3073) { // L: 10949
									if (var9.invTransmitTriggers != null && Client.field659 - var9.field3073 <= 32) { // L: 10950
										label794:
										for (var37 = var9.field3073; var37 < Client.field659; ++var37) { // L: 10957
											var23 = Client.changedItemContainers[var37 & 31]; // L: 10958

											for (var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) { // L: 10959
												if (var23 == var9.invTransmitTriggers[var36]) { // L: 10960
													var25 = new ScriptEvent(); // L: 10961
													var25.widget = var9; // L: 10962
													var25.args = var9.onInvTransmit; // L: 10963
													Client.scriptEvents.addFirst(var25); // L: 10964
													break label794; // L: 10965
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10951
										var22.widget = var9; // L: 10952
										var22.args = var9.onInvTransmit; // L: 10953
										Client.scriptEvents.addFirst(var22); // L: 10954
									}

									var9.field3073 = Client.field659; // L: 10970
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3191) { // L: 10972
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3191 <= 32) { // L: 10973
										label770:
										for (var37 = var9.field3191; var37 < Client.changedSkillsCount; ++var37) { // L: 10980
											var23 = Client.changedSkills[var37 & 31]; // L: 10981

											for (var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) { // L: 10982
												if (var23 == var9.statTransmitTriggers[var36]) { // L: 10983
													var25 = new ScriptEvent(); // L: 10984
													var25.widget = var9; // L: 10985
													var25.args = var9.onStatTransmit; // L: 10986
													Client.scriptEvents.addFirst(var25); // L: 10987
													break label770; // L: 10988
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 10974
										var22.widget = var9; // L: 10975
										var22.args = var9.onStatTransmit; // L: 10976
										Client.scriptEvents.addFirst(var22); // L: 10977
									}

									var9.field3191 = Client.changedSkillsCount; // L: 10993
								}

								if (Client.chatCycle > var9.field3188 && var9.onChatTransmit != null) { // L: 10995
									var22 = new ScriptEvent(); // L: 10996
									var22.widget = var9; // L: 10997
									var22.args = var9.onChatTransmit; // L: 10998
									Client.scriptEvents.addFirst(var22); // L: 10999
								}

								if (Client.field679 > var9.field3188 && var9.onFriendTransmit != null) { // L: 11001
									var22 = new ScriptEvent(); // L: 11002
									var22.widget = var9; // L: 11003
									var22.args = var9.onFriendTransmit; // L: 11004
									Client.scriptEvents.addFirst(var22); // L: 11005
								}

								if (Client.field666 > var9.field3188 && var9.onClanTransmit != null) { // L: 11007
									var22 = new ScriptEvent(); // L: 11008
									var22.widget = var9; // L: 11009
									var22.args = var9.onClanTransmit; // L: 11010
									Client.scriptEvents.addFirst(var22); // L: 11011
								}

								if (Client.field681 > var9.field3188 && var9.field3056 != null) { // L: 11013
									var22 = new ScriptEvent(); // L: 11014
									var22.widget = var9; // L: 11015
									var22.args = var9.field3056; // L: 11016
									Client.scriptEvents.addFirst(var22); // L: 11017
								}

								if (Client.field724 > var9.field3188 && var9.field3166 != null) { // L: 11019
									var22 = new ScriptEvent(); // L: 11020
									var22.widget = var9; // L: 11021
									var22.args = var9.field3166; // L: 11022
									Client.scriptEvents.addFirst(var22); // L: 11023
								}

								if (Client.field536 > var9.field3188 && var9.onStockTransmit != null) { // L: 11025
									var22 = new ScriptEvent(); // L: 11026
									var22.widget = var9; // L: 11027
									var22.args = var9.onStockTransmit; // L: 11028
									Client.scriptEvents.addFirst(var22); // L: 11029
								}

								if (Client.field670 > var9.field3188 && var9.field3172 != null) { // L: 11031
									var22 = new ScriptEvent(); // L: 11032
									var22.widget = var9; // L: 11033
									var22.args = var9.field3172; // L: 11034
									Client.scriptEvents.addFirst(var22); // L: 11035
								}

								if (Client.field494 > var9.field3188 && var9.onMiscTransmit != null) { // L: 11037
									var22 = new ScriptEvent(); // L: 11038
									var22.widget = var9; // L: 11039
									var22.args = var9.onMiscTransmit; // L: 11040
									Client.scriptEvents.addFirst(var22); // L: 11041
								}

								var9.field3188 = Client.cycleCntr; // L: 11043
								if (var9.onKey != null) { // L: 11044
									for (var37 = 0; var37 < Client.field695; ++var37) { // L: 11045
										ScriptEvent var31 = new ScriptEvent(); // L: 11046
										var31.widget = var9; // L: 11047
										var31.keyTyped = Client.field697[var37]; // L: 11048
										var31.keyPressed = Client.field696[var37]; // L: 11049
										var31.args = var9.onKey; // L: 11050
										Client.scriptEvents.addFirst(var31); // L: 11051
									}
								}

								ScriptEvent var30;
								int[] var38;
								if (var9.field3161 != null) { // L: 11054
									var38 = class7.method57(); // L: 11055

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11056
										var30 = new ScriptEvent(); // L: 11057
										var30.widget = var9; // L: 11058
										var30.keyTyped = var38[var23]; // L: 11059
										var30.args = var9.field3161; // L: 11060
										Client.scriptEvents.addFirst(var30); // L: 11061
									}
								}

								if (var9.field3162 != null) { // L: 11064
									var38 = TaskHandler.method2879(); // L: 11065

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11066
										var30 = new ScriptEvent(); // L: 11067
										var30.widget = var9; // L: 11068
										var30.keyTyped = var38[var23]; // L: 11069
										var30.args = var9.field3162; // L: 11070
										Client.scriptEvents.addFirst(var30); // L: 11071
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11076
							if (Client.clickedWidget != null || class247.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11077
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11078
								if (var9.mouseOverRedirect >= 0) { // L: 11079
									WorldMapData_0.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									WorldMapData_0.mousedOverWidgetIf1 = var9; // L: 11080
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11082
								Skills.field3247 = var9; // L: 11083
							}

							if (var9.scrollHeight > var9.height) { // L: 11085
								class13.method177(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11087
							updateInterface(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY); // L: 11088
							if (var9.children != null) { // L: 11089
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11090
							if (var28 != null) { // L: 11091
								if (var28.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11092
									for (ScriptEvent var29 = (ScriptEvent)Client.scriptEvents.last(); var29 != null; var29 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11093
										if (var29.isMouseInputEvent) { // L: 11094
											var29.remove(); // L: 11095
											var29.widget.containsMouse = false; // L: 11096
										}
									}

									if (class134.widgetDragDuration == 0) { // L: 11099
										Client.clickedWidget = null; // L: 11100
										Client.clickedWidgetParent = null; // L: 11101
									}

									if (!Client.isMenuOpen) { // L: 11103
										FriendSystem.addCancelMenuEntry(); // L: 11104
									}
								}

								Messages.updateRootInterface(var28.group, var12, var13, var14, var15, var10, var11); // L: 11107
							}
						}
					}
				}
			}
		}

	} // L: 11111

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "76"
	)
	static final void method2825(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11409
		class408.clientPreferences.areaSoundEffectsVolume = var0; // L: 11410
		Login.savePreferences(); // L: 11411
	} // L: 11412
}
