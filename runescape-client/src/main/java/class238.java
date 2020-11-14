import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class238 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static final class238 field3116;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static final class238 field3113;
	@ObfuscatedName("e")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -537874473
	)
	final int field3112;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 397493923
	)
	final int field3117;

	static {
		field3116 = new class238(51, 27, 800, 0, 16, 16); // L: 29
		field3113 = new class238(25, 28, 800, 656, 40, 40); // L: 30
	}

	class238(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3112 = var5; // L: 39
		this.field3117 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1821590309"
	)
	static final void method4271() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 95
			int var0 = Scene.Scene_cameraPitchSine; // L: 96
			int var1 = Scene.Scene_cameraPitchCosine; // L: 97
			int var2 = Scene.Scene_cameraYawSine; // L: 98
			int var3 = Scene.Scene_cameraYawCosine; // L: 99
			byte var4 = 50; // L: 100
			short var5 = 3500; // L: 101
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 102
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 103
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 104
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 105
			int var10 = Rasterizer3D.method3196(var7, var4, var1, var0); // L: 107
			int var11 = Rasterizer3D.method3161(var7, var4, var1, var0); // L: 108
			var7 = var10; // L: 109
			var10 = Rasterizer3D.method3196(var9, var5, var1, var0); // L: 110
			int var12 = Rasterizer3D.method3161(var9, var5, var1, var0); // L: 111
			var9 = var10; // L: 112
			var10 = Rasterizer3D.method3158(var6, var11, var3, var2); // L: 113
			var11 = Rasterizer3D.method3159(var6, var11, var3, var2); // L: 114
			var6 = var10; // L: 115
			var10 = Rasterizer3D.method3158(var8, var12, var3, var2); // L: 116
			var12 = Rasterizer3D.method3159(var8, var12, var3, var2); // L: 117
			ViewportMouse.field1770 = (var6 + var10) / 2; // L: 119
			WorldMapEvent.field377 = (var9 + var7) / 2; // L: 120
			ViewportMouse.field1768 = (var12 + var11) / 2; // L: 121
			ViewportMouse.field1771 = (var10 - var6) / 2; // L: 122
			GrandExchangeOfferTotalQuantityComparator.field81 = (var9 - var7) / 2; // L: 123
			SecureRandomCallable.field553 = (var12 - var11) / 2; // L: 124
			class1.field3 = Math.abs(ViewportMouse.field1771); // L: 125
			ItemContainer.field570 = Math.abs(GrandExchangeOfferTotalQuantityComparator.field81); // L: 126
			ViewportMouse.field1772 = Math.abs(SecureRandomCallable.field553); // L: 127
		}
	} // L: 128

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1256117842"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 550
		if (WorldMapSection2.garbageCollector == null || !WorldMapSection2.garbageCollector.isValid()) { // L: 551
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 553

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 554
					if (var2.isValid()) { // L: 556
						WorldMapSection2.garbageCollector = var2; // L: 557
						GameShell.garbageCollectorLastCheckTimeMs = -1L; // L: 558
						GameShell.garbageCollectorLastCollectionTime = -1L; // L: 559
					}
				}
			} catch (Throwable var11) { // L: 564
			}
		}

		if (WorldMapSection2.garbageCollector != null) { // L: 566
			long var9 = User.currentTimeMillis(); // L: 567
			long var3 = WorldMapSection2.garbageCollector.getCollectionTime(); // L: 568
			if (-1L != GameShell.garbageCollectorLastCollectionTime) { // L: 569
				long var5 = var3 - GameShell.garbageCollectorLastCollectionTime; // L: 570
				long var7 = var9 - GameShell.garbageCollectorLastCheckTimeMs; // L: 571
				if (0L != var7) { // L: 572
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameShell.garbageCollectorLastCollectionTime = var3; // L: 574
			GameShell.garbageCollectorLastCheckTimeMs = var9; // L: 575
		}

		return var0; // L: 577
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIB)V",
		garbageValue = "-13"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10117
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10118
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10121
			var3 = PendingSpawn.Widget_getSpellActionName(var0); // L: 10122
			if (var3 != null) { // L: 10123
				ModelData0.insertMenuItemNoShift(var3, Client.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10124
			}
		}

		if (var0.buttonType == 3) { // L: 10128
			ModelData0.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10129
		}

		if (var0.buttonType == 4) { // L: 10132
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10133
		}

		if (var0.buttonType == 5) { // L: 10136
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10137
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10140
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10141
		}

		int var4;
		int var6;
		int var7;
		int var19;
		if (var0.type == 2) { // L: 10144
			var19 = 0; // L: 10145

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10146
				for (int var21 = 0; var21 < var0.width; ++var21) { // L: 10147
					var6 = (var0.paddingX + 32) * var21; // L: 10148
					var7 = (var0.paddingY + 32) * var4; // L: 10149
					if (var19 < 20) { // L: 10150
						var6 += var0.inventoryXOffsets[var19]; // L: 10151
						var7 += var0.inventoryYOffsets[var19]; // L: 10152
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 10154
						Client.dragItemSlotDestination = var19; // L: 10155
						class217.hoveredItemContainer = var0; // L: 10156
						if (var0.itemIds[var19] > 0) { // L: 10157
							label386: {
								ItemDefinition var8 = AbstractWorldMapData.ItemDefinition_get(var0.itemIds[var19] - 1); // L: 10158
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) { // L: 10160
									var10 = WorldMapData_0.getWidgetFlags(var0); // L: 10162
									var9 = (var10 >> 30 & 1) != 0; // L: 10164
									if (var9) { // L: 10166
										if (var0.id != SpotAnimationDefinition.selectedItemWidget || var19 != InvDefinition.selectedItemSlot) { // L: 10167
											ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Client.colorStartTag(16748608) + var8.name, 31, var8.id, var19, var0.id); // L: 10168
										}
										break label386;
									}
								}

								if (Client.isSpellSelected) { // L: 10175
									var10 = WorldMapData_0.getWidgetFlags(var0); // L: 10177
									var9 = (var10 >> 30 & 1) != 0; // L: 10179
									if (var9) { // L: 10181
										if ((class105.selectedSpellFlags & 16) == 16) { // L: 10182
											ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(16748608) + var8.name, 32, var8.id, var19, var0.id); // L: 10183
										}
										break label386;
									}
								}

								String[] var23 = var8.inventoryActions; // L: 10189
								var10 = -1; // L: 10190
								boolean var11;
								if (Client.shiftClickDrop) { // L: 10191
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10194
									if (var11) { // L: 10196
										var10 = var8.getShiftClickIndex(); // L: 10197
									}
								}

								int var12 = WorldMapData_0.getWidgetFlags(var0); // L: 10201
								var11 = (var12 >> 30 & 1) != 0; // L: 10203
								if (var11) { // L: 10205
									for (int var13 = 4; var13 >= 3; --var13) { // L: 10206
										if (var13 != var10) { // L: 10207
											SecureRandomCallable.addWidgetItemMenuItem(var0, var8, var19, var13, false); // L: 10208
										}
									}
								}

								int var14 = WorldMapData_0.getWidgetFlags(var0); // L: 10212
								boolean var25 = (var14 >> 31 & 1) != 0; // L: 10214
								if (var25) { // L: 10216
									ModelData0.insertMenuItemNoShift("Use", Client.colorStartTag(16748608) + var8.name, 38, var8.id, var19, var0.id); // L: 10217
								}

								int var16 = WorldMapData_0.getWidgetFlags(var0); // L: 10221
								boolean var15 = (var16 >> 30 & 1) != 0; // L: 10223
								int var17;
								if (var15) { // L: 10225
									for (var17 = 2; var17 >= 0; --var17) { // L: 10226
										if (var10 != var17) { // L: 10227
											SecureRandomCallable.addWidgetItemMenuItem(var0, var8, var19, var17, false); // L: 10228
										}
									}

									if (var10 >= 0) { // L: 10230
										SecureRandomCallable.addWidgetItemMenuItem(var0, var8, var19, var10, true); // L: 10231
									}
								}

								var23 = var0.itemActions; // L: 10234
								if (var23 != null) { // L: 10235
									for (var17 = 4; var17 >= 0; --var17) { // L: 10236
										if (var23[var17] != null) { // L: 10237
											byte var18 = 0; // L: 10238
											if (var17 == 0) { // L: 10239
												var18 = 39;
											}

											if (var17 == 1) { // L: 10240
												var18 = 40;
											}

											if (var17 == 2) { // L: 10241
												var18 = 41;
											}

											if (var17 == 3) { // L: 10242
												var18 = 42;
											}

											if (var17 == 4) { // L: 10243
												var18 = 43;
											}

											ModelData0.insertMenuItemNoShift(var23[var17], Client.colorStartTag(16748608) + var8.name, var18, var8.id, var19, var0.id); // L: 10244
										}
									}
								}

								ModelData0.insertMenuItemNoShift("Examine", Client.colorStartTag(16748608) + var8.name, 1005, var8.id, var19, var0.id); // L: 10249
							}
						}
					}

					++var19; // L: 10255
				}
			}
		}

		if (var0.isIf3) { // L: 10259
			if (Client.isSpellSelected) { // L: 10260
				var4 = WorldMapData_0.getWidgetFlags(var0); // L: 10262
				boolean var26 = (var4 >> 21 & 1) != 0; // L: 10264
				if (var26 && (class105.selectedSpellFlags & 32) == 32) { // L: 10266
					ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10267
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) { // L: 10272
					var6 = WorldMapData_0.getWidgetFlags(var0); // L: 10276
					boolean var27 = (var6 >> var19 + 1 & 1) != 0; // L: 10278
					String var22;
					if (!var27 && var0.onOp == null) { // L: 10280
						var22 = null; // L: 10281
					} else if (var0.actions != null && var0.actions.length > var19 && var0.actions[var19] != null && var0.actions[var19].trim().length() != 0) { // L: 10284
						var22 = var0.actions[var19]; // L: 10288
					} else {
						var22 = null; // L: 10285
					}

					if (var22 != null) { // L: 10291
						ModelData0.insertMenuItemNoShift(var22, var0.dataText, 1007, var19 + 1, var0.childIndex, var0.id); // L: 10292
					}
				}

				var3 = PendingSpawn.Widget_getSpellActionName(var0); // L: 10296
				if (var3 != null) { // L: 10297
					ModelData0.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10298
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10301
					var7 = WorldMapData_0.getWidgetFlags(var0); // L: 10305
					boolean var24 = (var7 >> var4 + 1 & 1) != 0; // L: 10307
					String var5;
					if (!var24 && var0.onOp == null) { // L: 10309
						var5 = null; // L: 10310
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10313
						var5 = var0.actions[var4]; // L: 10317
					} else {
						var5 = null; // L: 10314
					}

					if (var5 != null) { // L: 10320
						KeyHandler.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10321
					}
				}

				if (class195.Widget_hasContinueOption(WorldMapData_0.getWidgetFlags(var0))) { // L: 10325
					ModelData0.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10326
				}
			}
		}

	} // L: 10331
}
