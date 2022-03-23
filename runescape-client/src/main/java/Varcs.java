import java.io.EOFException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("cm")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("h")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("g")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("l")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("n")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = 2946805821198805637L
	)
	long field1307;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = FloorOverlayDefinition.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
			VarcInt var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
				var4 = new VarcInt(); // L: 41
				if (var5 != null) {
					var4.method3386(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (FloorOverlayDefinition.archive2.method5829(15)) { // L: 50
			var2 = FloorOverlayDefinition.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "533278034"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) { // L: 59
			this.unwrittenChanges = true;
		}

	} // L: 60

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1614865457"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1697457193"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2144710049"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2070749528"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "554707928"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1036049158"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 93
			if (!this.intsPersistence[var1]) { // L: 94
				this.map.remove(var1); // L: 95
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 98
			this.strings[var1] = null; // L: 99
		}

	} // L: 101

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpr;",
		garbageValue = "-444552079"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return ReflectionCheck.getPreferencesFile("2", Login.field917.name, var1); // L: 104
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 108

		try {
			int var2 = 3; // L: 110
			int var3 = 0; // L: 111
			Iterator var4 = this.map.entrySet().iterator(); // L: 112

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 113
				int var6 = (Integer)var5.getKey(); // L: 115
				if (this.intsPersistence[var6]) { // L: 116
					Object var7 = var5.getValue(); // L: 117
					var2 += 3; // L: 118
					if (var7 instanceof Integer) { // L: 119
						var2 += 4;
					} else if (var7 instanceof String) { // L: 120
						var2 += ItemLayer.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 121
				}
			}

			Buffer var33 = new Buffer(var2); // L: 125
			var33.writeByte(2); // L: 126
			var33.writeShort(var3); // L: 127
			Iterator var34 = this.map.entrySet().iterator(); // L: 128

			label186:
			while (true) {
				Entry var21;
				int var22;
				do {
					if (!var34.hasNext()) {
						var1.write(var33.array, 0, var33.offset); // L: 192
						break label186;
					}

					var21 = (Entry)var34.next(); // L: 129
					var22 = (Integer)var21.getKey(); // L: 131
				} while(!this.intsPersistence[var22]); // L: 132

				var33.writeShort(var22); // L: 133
				Object var8 = var21.getValue(); // L: 134
				Class var10 = var8.getClass(); // L: 136
				class431[] var11 = new class431[]{class431.field4598, class431.field4595, class431.field4600}; // L: 141
				class431[] var12 = var11; // L: 143
				int var13 = 0;

				class431 var9;
				class431 var14;
				while (true) {
					if (var13 >= var12.length) {
						var9 = null; // L: 154
						break;
					}

					var14 = var12[var13]; // L: 145
					if (var10 == var14.field4599) { // L: 147
						var9 = var14; // L: 148
						break; // L: 149
					}

					++var13; // L: 144
				}

				var33.writeByte(var9.field4594); // L: 157
				Class var23 = var8.getClass(); // L: 160
				class431[] var15 = new class431[]{class431.field4598, class431.field4595, class431.field4600}; // L: 167
				class431[] var16 = var15; // L: 169
				int var17 = 0;

				while (true) {
					if (var17 >= var16.length) {
						var14 = null; // L: 180
						break;
					}

					class431 var18 = var16[var17]; // L: 171
					if (var23 == var18.field4599) { // L: 173
						var14 = var18; // L: 174
						break; // L: 175
					}

					++var17; // L: 170
				}

				if (var14 == null) { // L: 183
					throw new IllegalArgumentException();
				}

				class427 var35 = var14.field4596; // L: 184
				var35.vmethod7681(var8, var33); // L: 187
			}
		} catch (Exception var31) { // L: 194
		} finally {
			try {
				var1.close(); // L: 197
			} catch (Exception var30) { // L: 199
			}

		}

		this.unwrittenChanges = false; // L: 201
		this.field1307 = WorldMapSprite.method4989(); // L: 202
	} // L: 203

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2035245594"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 206

		label212: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 208

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 209 210 213
					var4 = var1.read(var2, var3, var2.length - var3); // L: 211
					if (var4 == -1) { // L: 212
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2); // L: 215
				if (var15.array.length - var15.offset >= 1) {
					int var16 = var15.readUnsignedByte(); // L: 217
					if (var16 < 0 || var16 > 2) {
						return; // L: 218
					}

					int var7;
					int var8;
					int var9;
					int var17;
					if (var16 >= 2) { // L: 219
						var17 = var15.readUnsignedShort(); // L: 220
						var7 = 0;

						while (true) {
							if (var7 >= var17) {
								break label212;
							}

							var8 = var15.readUnsignedShort(); // L: 222
							var9 = var15.readUnsignedByte(); // L: 223
							class431[] var10 = new class431[]{class431.field4598, class431.field4595, class431.field4600}; // L: 226
							class431 var11 = (class431)ChatChannel.findEnumerated(var10, var9); // L: 228
							Object var12 = var11.method7671(var15); // L: 229
							if (this.intsPersistence[var8]) { // L: 230
								this.map.put(var8, var12); // L: 231
							}

							++var7; // L: 221
						}
					} else {
						var17 = var15.readUnsignedShort(); // L: 236

						for (var7 = 0; var7 < var17; ++var7) { // L: 237
							var8 = var15.readUnsignedShort(); // L: 238
							var9 = var15.readInt(); // L: 239
							if (this.intsPersistence[var8]) { // L: 240
								this.map.put(var8, var9); // L: 241
							}
						}

						var7 = var15.readUnsignedShort(); // L: 244
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label212;
							}

							var15.readUnsignedShort(); // L: 246
							var15.readStringCp1252NullTerminated(); // L: 247
							++var8; // L: 245
						}
					}
				}
			} catch (Exception var26) { // L: 251
				break label212;
			} finally {
				try {
					var1.close(); // L: 254
				} catch (Exception var25) { // L: 256
				}

			}

			return; // L: 216
		}

		this.unwrittenChanges = false; // L: 258
	} // L: 259

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "673207891"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1307 < WorldMapSprite.method4989() - 60000L) { // L: 262
			this.write(); // L: 263
		}

	} // L: 265

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 268
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-899497514"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(class17.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-620948182"
	)
	static final void method2462(boolean var0) {
		if (var0) { // L: 2660
			Client.field516 = Login.field903 ? class124.field1509 : class124.field1511; // L: 2661
		} else {
			LinkedHashMap var1 = Interpreter.clientPreferences.parameters; // L: 2664
			String var3 = Login.Login_username; // L: 2666
			int var4 = var3.length(); // L: 2668
			int var5 = 0; // L: 2669

			for (int var6 = 0; var6 < var4; ++var6) { // L: 2670
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field516 = var1.containsKey(var5) ? class124.field1516 : class124.field1510; // L: 2673
		}

	} // L: 2675

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIIIIII)V",
		garbageValue = "-2083182413"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 10585
			Widget var9 = var0[var8]; // L: 10586
			if (var9 != null && var9.parentId == var1 && (var9.method5637() || WorldMapSection2.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 10587 10588 10589
				if (var9.isIf3) { // L: 10590
					if (class263.isComponentHidden(var9)) { // L: 10591
						continue;
					}
				} else if (var9.type == 0 && var9 != Player.mousedOverWidgetIf1 && class263.isComponentHidden(var9)) { // L: 10594
					continue;
				}

				if (var9.type == 11 && var9.method5694(UserComparator9.urlRequester)) { // L: 10596 10597
					class290.invalidateWidget(var9); // L: 10598
					GrandExchangeEvents.revalidateWidgetScroll(var9.children, var9, true); // L: 10599
					if (var9.field3408 != null) { // L: 10600
						ScriptEvent var10 = new ScriptEvent(); // L: 10601
						var10.widget = var9; // L: 10602
						var10.args = var9.field3408; // L: 10603
						Client.scriptEvents.addFirst(var10); // L: 10604
					}
				}

				int var26 = var9.x + var6; // L: 10608
				int var11 = var7 + var9.y; // L: 10609
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 10614
					var12 = var2; // L: 10615
					var13 = var3; // L: 10616
					var14 = var4; // L: 10617
					var15 = var5; // L: 10618
				} else {
					int var16;
					if (var9.type == 9) { // L: 10620
						var16 = var26; // L: 10621
						var17 = var11; // L: 10622
						var18 = var26 + var9.width; // L: 10623
						int var19 = var11 + var9.height; // L: 10624
						if (var18 < var26) { // L: 10625
							var16 = var18; // L: 10627
							var18 = var26; // L: 10628
						}

						if (var19 < var11) { // L: 10630
							var17 = var19; // L: 10632
							var19 = var11; // L: 10633
						}

						++var18; // L: 10635
						++var19; // L: 10636
						var12 = var16 > var2 ? var16 : var2; // L: 10637
						var13 = var17 > var3 ? var17 : var3; // L: 10638
						var14 = var18 < var4 ? var18 : var4; // L: 10639
						var15 = var19 < var5 ? var19 : var5; // L: 10640
					} else {
						var16 = var26 + var9.width; // L: 10643
						var17 = var11 + var9.height; // L: 10644
						var12 = var26 > var2 ? var26 : var2; // L: 10645
						var13 = var11 > var3 ? var11 : var3; // L: 10646
						var14 = var16 < var4 ? var16 : var4; // L: 10647
						var15 = var17 < var5 ? var17 : var5; // L: 10648
					}
				}

				if (var9 == Client.clickedWidget) { // L: 10650
					Client.field671 = true; // L: 10651
					Client.field596 = var26; // L: 10652
					Client.field673 = var11; // L: 10653
				}

				boolean var34 = false; // L: 10655
				if (var9.field3432) { // L: 10656
					switch(Client.field652) { // L: 10657
					case 0:
						var34 = true; // L: 10659
					case 1:
					default:
						break;
					case 2:
						if (Client.field653 == var9.id >>> 16) { // L: 10662
							var34 = true; // L: 10663
						}
						break;
					case 3:
						if (var9.id == Client.field653) { // L: 10667
							var34 = true; // L: 10668
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 10673
					if (var9.isIf3) { // L: 10674
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 10675
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10676
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10677
									if (var27.isMouseInputEvent) { // L: 10678
										var27.remove(); // L: 10679
										var27.widget.containsMouse = false; // L: 10680
									}
								}

								if (class136.widgetDragDuration == 0) { // L: 10683
									Client.clickedWidget = null; // L: 10684
									Client.clickedWidgetParent = null; // L: 10685
								}

								if (!Client.isMenuOpen) { // L: 10687
									VarpDefinition.addCancelMenuEntry(); // L: 10688
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10692 10693
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 10694
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 10695
									var27.remove(); // L: 10696
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 10702
					var18 = MouseHandler.MouseHandler_y; // L: 10703
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 10704
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 10705
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 10706
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 10708
					if (var9.contentType == 1337) { // L: 10709
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 10710
							class132.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 10713
						Script.checkIfMinimapClicked(var9, var26, var11); // L: 10714
					} else {
						if (var9.contentType == 1400) { // L: 10717
							ClanChannel.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 10718
						}

						if (!Client.isMenuOpen && var35) { // L: 10720
							if (var9.contentType == 1400) { // L: 10721
								ClanChannel.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 10722
							} else {
								WorldMapLabelSize.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 10725
							}
						}

						boolean var21;
						int var29;
						if (var34) { // L: 10728
							for (int var20 = 0; var20 < var9.field3422.length; ++var20) { // L: 10729
								var21 = false; // L: 10730
								boolean var28 = false; // L: 10731
								if (!var21 && var9.field3422[var20] != null) { // L: 10732
									for (var29 = 0; var29 < var9.field3422[var20].length; ++var29) { // L: 10733
										boolean var24 = false; // L: 10734
										if (var9.field3406 != null) { // L: 10735
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3422[var20][var29]]; // L: 10736
										}

										if (class273.method5267(var9.field3422[var20][var29]) || var24) { // L: 10738
											var21 = true; // L: 10739
											if (var9.field3406 != null && var9.field3406[var20] > Client.cycle) { // L: 10740
												break;
											}

											byte var33 = var9.field3423[var20][var29]; // L: 10741
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) { // L: 10742 10743 10744 10745 10746
												var28 = true; // L: 10748
												break;
											}
										}
									}
								}

								if (var28) { // L: 10754
									if (var20 < 10) { // L: 10755
										Message.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 10756
										class120.Widget_runOnTargetLeave(); // L: 10757
										ApproximateRouteStrategy.selectSpell(var9.id, var9.childIndex, WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var9)), var9.itemId); // L: 10758
										Client.selectedSpellActionName = InvDefinition.Widget_getSpellActionName(var9); // L: 10759
										if (Client.selectedSpellActionName == null) { // L: 10760
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + ChatChannel.colorStartTag(16777215); // L: 10761
									}

									var29 = var9.field3424[var20]; // L: 10763
									if (var9.field3406 == null) { // L: 10764
										var9.field3406 = new int[var9.field3422.length];
									}

									if (var9.field3425 == null) { // L: 10765
										var9.field3425 = new int[var9.field3422.length];
									}

									if (var29 != 0) { // L: 10766
										if (var9.field3406[var20] == 0) { // L: 10767
											var9.field3406[var20] = var29 + Client.cycle + var9.field3425[var20];
										} else {
											var9.field3406[var20] = var29 + Client.cycle; // L: 10768
										}
									} else {
										var9.field3406[var20] = Integer.MAX_VALUE; // L: 10770
									}
								}

								if (!var21 && var9.field3406 != null) { // L: 10772 10773
									var9.field3406[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 10777
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 10778
								var35 = true;
							} else {
								var35 = false; // L: 10779
							}

							boolean var36 = false; // L: 10780
							if ((MouseHandler.MouseHandler_currentButton == 1 || !UserComparator5.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 10781
								var36 = true;
							}

							var21 = false; // L: 10782
							if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator5.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 10783
								var21 = true;
							}

							int[] var22;
							if (var21) { // L: 10784
								PcmPlayer.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 10785
								if (var9.type == 11 && var9.method5623(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY)) { // L: 10786
									switch(var9.method5656()) { // L: 10787
									case 0:
										class11.openURL(var9.method5647(), true, false); // L: 10804
										break;
									case 1:
										if (class355.method6620(WorldMapSection2.getWidgetFlags(var9))) { // L: 10789
											var22 = var9.method5686(); // L: 10790
											if (var22 != null) { // L: 10791
												PacketBufferNode var23 = ItemContainer.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 10792
												var23.packetBuffer.writeIntME(var22[0]); // L: 10793
												var23.packetBuffer.method7795(var9.childIndex); // L: 10794
												var23.packetBuffer.method7806(var22[1]); // L: 10795
												var23.packetBuffer.method7746(var9.method5699()); // L: 10796
												var23.packetBuffer.method7806(var22[2]); // L: 10797
												var23.packetBuffer.writeInt(var9.id); // L: 10798
												Client.packetWriter.addNode(var23); // L: 10799
											}
										}
									}
								}
							}

							if (var9.contentType == 1400) { // L: 10809
								ClanChannel.worldMap.method7305(var17, var18, var35 & var36, var35 & var21); // L: 10810
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class162.method3276(WorldMapSection2.getWidgetFlags(var9))) { // L: 10812
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 10813
								Client.field668 = true; // L: 10814
								Client.field669 = var26; // L: 10815
								Client.field628 = var11; // L: 10816
							}

							if (var9.hasListener) { // L: 10818
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 10819
									var37 = new ScriptEvent(); // L: 10820
									var37.isMouseInputEvent = true; // L: 10821
									var37.widget = var9; // L: 10822
									var37.mouseY = Client.mouseWheelRotation; // L: 10823
									var37.args = var9.onScroll; // L: 10824
									Client.scriptEvents.addFirst(var37); // L: 10825
								}

								if (Client.clickedWidget != null || FloorDecoration.dragInventoryWidget != null || Client.isMenuOpen) { // L: 10827
									var21 = false; // L: 10828
									var36 = false; // L: 10829
									var35 = false; // L: 10830
								}

								if (!var9.isClicked && var21) { // L: 10832
									var9.isClicked = true; // L: 10833
									if (var9.onClick != null) { // L: 10834
										var37 = new ScriptEvent(); // L: 10835
										var37.isMouseInputEvent = true; // L: 10836
										var37.widget = var9; // L: 10837
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 10838
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 10839
										var37.args = var9.onClick; // L: 10840
										Client.scriptEvents.addFirst(var37); // L: 10841
									}
								}

								if (var9.isClicked && var36 && var9.onClickRepeat != null) { // L: 10844 10845
									var37 = new ScriptEvent(); // L: 10846
									var37.isMouseInputEvent = true; // L: 10847
									var37.widget = var9; // L: 10848
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 10849
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10850
									var37.args = var9.onClickRepeat; // L: 10851
									Client.scriptEvents.addFirst(var37); // L: 10852
								}

								if (var9.isClicked && !var36) { // L: 10855
									var9.isClicked = false; // L: 10856
									if (var9.onRelease != null) { // L: 10857
										var37 = new ScriptEvent(); // L: 10858
										var37.isMouseInputEvent = true; // L: 10859
										var37.widget = var9; // L: 10860
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 10861
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10862
										var37.args = var9.onRelease; // L: 10863
										Client.field695.addFirst(var37); // L: 10864
									}
								}

								if (var36 && var9.onHold != null) { // L: 10867 10868
									var37 = new ScriptEvent(); // L: 10869
									var37.isMouseInputEvent = true; // L: 10870
									var37.widget = var9; // L: 10871
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 10872
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10873
									var37.args = var9.onHold; // L: 10874
									Client.scriptEvents.addFirst(var37); // L: 10875
								}

								if (!var9.containsMouse && var35) { // L: 10878
									var9.containsMouse = true; // L: 10879
									if (var9.onMouseOver != null) { // L: 10880
										var37 = new ScriptEvent(); // L: 10881
										var37.isMouseInputEvent = true; // L: 10882
										var37.widget = var9; // L: 10883
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 10884
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10885
										var37.args = var9.onMouseOver; // L: 10886
										Client.scriptEvents.addFirst(var37); // L: 10887
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 10890 10891
									var37 = new ScriptEvent(); // L: 10892
									var37.isMouseInputEvent = true; // L: 10893
									var37.widget = var9; // L: 10894
									var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 10895
									var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10896
									var37.args = var9.onMouseRepeat; // L: 10897
									Client.scriptEvents.addFirst(var37); // L: 10898
								}

								if (var9.containsMouse && !var35) { // L: 10901
									var9.containsMouse = false; // L: 10902
									if (var9.onMouseLeave != null) { // L: 10903
										var37 = new ScriptEvent(); // L: 10904
										var37.isMouseInputEvent = true; // L: 10905
										var37.widget = var9; // L: 10906
										var37.mouseX = MouseHandler.MouseHandler_x - var26; // L: 10907
										var37.mouseY = MouseHandler.MouseHandler_y - var11; // L: 10908
										var37.args = var9.onMouseLeave; // L: 10909
										Client.field695.addFirst(var37); // L: 10910
									}
								}

								if (var9.onTimer != null) { // L: 10913
									var37 = new ScriptEvent(); // L: 10914
									var37.widget = var9; // L: 10915
									var37.args = var9.onTimer; // L: 10916
									Client.field694.addFirst(var37); // L: 10917
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3391) { // L: 10919
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3391 <= 32) { // L: 10920
										label827:
										for (var40 = var9.field3391; var40 < Client.changedVarpCount; ++var40) { // L: 10927
											var29 = Client.changedVarps[var40 & 31]; // L: 10928

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) { // L: 10929
												if (var29 == var9.varTransmitTriggers[var39]) { // L: 10930
													var25 = new ScriptEvent(); // L: 10931
													var25.widget = var9; // L: 10932
													var25.args = var9.onVarTransmit; // L: 10933
													Client.scriptEvents.addFirst(var25); // L: 10934
													break label827; // L: 10935
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 10921
										var37.widget = var9; // L: 10922
										var37.args = var9.onVarTransmit; // L: 10923
										Client.scriptEvents.addFirst(var37); // L: 10924
									}

									var9.field3391 = Client.changedVarpCount; // L: 10940
								}

								if (var9.onInvTransmit != null && Client.field746 > var9.field3355) { // L: 10942
									if (var9.invTransmitTriggers != null && Client.field746 - var9.field3355 <= 32) { // L: 10943
										label803:
										for (var40 = var9.field3355; var40 < Client.field746; ++var40) { // L: 10950
											var29 = Client.changedItemContainers[var40 & 31]; // L: 10951

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) { // L: 10952
												if (var29 == var9.invTransmitTriggers[var39]) { // L: 10953
													var25 = new ScriptEvent(); // L: 10954
													var25.widget = var9; // L: 10955
													var25.args = var9.onInvTransmit; // L: 10956
													Client.scriptEvents.addFirst(var25); // L: 10957
													break label803; // L: 10958
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 10944
										var37.widget = var9; // L: 10945
										var37.args = var9.onInvTransmit; // L: 10946
										Client.scriptEvents.addFirst(var37); // L: 10947
									}

									var9.field3355 = Client.field746; // L: 10963
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3387) { // L: 10965
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3387 <= 32) { // L: 10966
										label779:
										for (var40 = var9.field3387; var40 < Client.changedSkillsCount; ++var40) { // L: 10973
											var29 = Client.changedSkills[var40 & 31]; // L: 10974

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) { // L: 10975
												if (var29 == var9.statTransmitTriggers[var39]) { // L: 10976
													var25 = new ScriptEvent(); // L: 10977
													var25.widget = var9; // L: 10978
													var25.args = var9.onStatTransmit; // L: 10979
													Client.scriptEvents.addFirst(var25); // L: 10980
													break label779; // L: 10981
												}
											}
										}
									} else {
										var37 = new ScriptEvent(); // L: 10967
										var37.widget = var9; // L: 10968
										var37.args = var9.onStatTransmit; // L: 10969
										Client.scriptEvents.addFirst(var37); // L: 10970
									}

									var9.field3387 = Client.changedSkillsCount; // L: 10986
								}

								if (Client.chatCycle > var9.field3481 && var9.onChatTransmit != null) { // L: 10988
									var37 = new ScriptEvent(); // L: 10989
									var37.widget = var9; // L: 10990
									var37.args = var9.onChatTransmit; // L: 10991
									Client.scriptEvents.addFirst(var37); // L: 10992
								}

								if (Client.field685 > var9.field3481 && var9.onFriendTransmit != null) { // L: 10994
									var37 = new ScriptEvent(); // L: 10995
									var37.widget = var9; // L: 10996
									var37.args = var9.onFriendTransmit; // L: 10997
									Client.scriptEvents.addFirst(var37); // L: 10998
								}

								if (Client.field726 > var9.field3481 && var9.onClanTransmit != null) { // L: 11000
									var37 = new ScriptEvent(); // L: 11001
									var37.widget = var9; // L: 11002
									var37.args = var9.onClanTransmit; // L: 11003
									Client.scriptEvents.addFirst(var37); // L: 11004
								}

								if (Client.field687 > var9.field3481 && var9.field3395 != null) { // L: 11006
									var37 = new ScriptEvent(); // L: 11007
									var37.widget = var9; // L: 11008
									var37.args = var9.field3395; // L: 11009
									Client.scriptEvents.addFirst(var37); // L: 11010
								}

								if (Client.field749 > var9.field3481 && var9.field3461 != null) { // L: 11012
									var37 = new ScriptEvent(); // L: 11013
									var37.widget = var9; // L: 11014
									var37.args = var9.field3461; // L: 11015
									Client.scriptEvents.addFirst(var37); // L: 11016
								}

								if (Client.field689 > var9.field3481 && var9.onStockTransmit != null) { // L: 11018
									var37 = new ScriptEvent(); // L: 11019
									var37.widget = var9; // L: 11020
									var37.args = var9.onStockTransmit; // L: 11021
									Client.scriptEvents.addFirst(var37); // L: 11022
								}

								if (Client.field572 > var9.field3481 && var9.field3468 != null) { // L: 11024
									var37 = new ScriptEvent(); // L: 11025
									var37.widget = var9; // L: 11026
									var37.args = var9.field3468; // L: 11027
									Client.scriptEvents.addFirst(var37); // L: 11028
								}

								if (Client.field762 > var9.field3481 && var9.onMiscTransmit != null) { // L: 11030
									var37 = new ScriptEvent(); // L: 11031
									var37.widget = var9; // L: 11032
									var37.args = var9.onMiscTransmit; // L: 11033
									Client.scriptEvents.addFirst(var37); // L: 11034
								}

								var9.field3481 = Client.cycleCntr; // L: 11036
								if (var9.onKey != null) { // L: 11037
									for (var40 = 0; var40 < Client.field713; ++var40) { // L: 11038
										ScriptEvent var38 = new ScriptEvent(); // L: 11039
										var38.widget = var9; // L: 11040
										var38.keyTyped = Client.field568[var40]; // L: 11041
										var38.keyPressed = Client.field716[var40]; // L: 11042
										var38.args = var9.onKey; // L: 11043
										Client.scriptEvents.addFirst(var38); // L: 11044
									}
								}

								ScriptEvent var32;
								if (var9.field3457 != null) { // L: 11047
									var22 = class65.method1869(); // L: 11048

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11049
										var32 = new ScriptEvent(); // L: 11050
										var32.widget = var9; // L: 11051
										var32.keyTyped = var22[var29]; // L: 11052
										var32.args = var9.field3457; // L: 11053
										Client.scriptEvents.addFirst(var32); // L: 11054
									}
								}

								if (var9.field3458 != null) { // L: 11057
									var22 = class166.method3311(); // L: 11058

									for (var29 = 0; var29 < var22.length; ++var29) { // L: 11059
										var32 = new ScriptEvent(); // L: 11060
										var32.widget = var9; // L: 11061
										var32.keyTyped = var22[var29]; // L: 11062
										var32.args = var9.field3458; // L: 11063
										Client.scriptEvents.addFirst(var32); // L: 11064
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11069
							if (Client.clickedWidget != null || FloorDecoration.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11070
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11071
								if (var9.mouseOverRedirect >= 0) { // L: 11072
									Player.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Player.mousedOverWidgetIf1 = var9; // L: 11073
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11075
								class160.field1750 = var9; // L: 11076
							}

							if (var9.scrollHeight > var9.height) { // L: 11078
								BuddyRankComparator.method2624(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11080
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11081
							if (var9.children != null) { // L: 11082
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11083
							if (var30 != null) { // L: 11084
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11085
									for (ScriptEvent var31 = (ScriptEvent)Client.scriptEvents.last(); var31 != null; var31 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11086
										if (var31.isMouseInputEvent) { // L: 11087
											var31.remove(); // L: 11088
											var31.widget.containsMouse = false; // L: 11089
										}
									}

									if (class136.widgetDragDuration == 0) { // L: 11092
										Client.clickedWidget = null; // L: 11093
										Client.clickedWidgetParent = null; // L: 11094
									}

									if (!Client.isMenuOpen) { // L: 11096
										VarpDefinition.addCancelMenuEntry(); // L: 11097
									}
								}

								ItemComposition.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11); // L: 11100
							}
						}
					}
				}
			}
		}

	} // L: 11104
}
