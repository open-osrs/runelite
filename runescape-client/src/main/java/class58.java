import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class58 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1266469825
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1558646174"
	)
	static void method939() {
		Tiles.Tiles_minPlane = 99; // L: 48
		Tiles.field517 = new byte[4][104][104]; // L: 49
		class200.field2399 = new byte[4][104][104]; // L: 50
		Tiles.field530 = new byte[4][104][104]; // L: 51
		class1.field1 = new byte[4][104][104]; // L: 52
		class2.field12 = new int[4][105][105]; // L: 53
		TaskHandler.field2045 = new byte[4][105][105]; // L: 54
		WorldMapSprite.field257 = new int[105][105]; // L: 55
		GrandExchangeOfferAgeComparator.Tiles_hue = new int[104]; // L: 56
		Tiles.Tiles_saturation = new int[104]; // L: 57
		WorldMapLabel.Tiles_lightness = new int[104]; // L: 58
		TaskHandler.Tiles_hueMultiplier = new int[104]; // L: 59
		WorldMapID.field292 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1370072473"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (WorldMapSectionType.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3374
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3375
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3376
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3377
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3378
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3379
			++Client.soundEffectCount; // L: 3380
		}

	} // L: 3382

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Lhz;III)V",
		garbageValue = "797800521"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10183
			WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10184
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10187
			var3 = Player.Widget_getSpellActionName(var0); // L: 10188
			if (var3 != null) { // L: 10189
				WorldMapManager.insertMenuItemNoShift(var3, FileSystem.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10190
			}
		}

		if (var0.buttonType == 3) { // L: 10194
			WorldMapManager.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10195
		}

		if (var0.buttonType == 4) { // L: 10198
			WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10199
		}

		if (var0.buttonType == 5) { // L: 10202
			WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10203
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10206
			WorldMapManager.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10207
		}

		int var4;
		int var5;
		int var15;
		if (var0.type == 2) { // L: 10210
			var15 = 0; // L: 10211

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10212
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 10213
					int var18 = (var0.paddingX + 32) * var5; // L: 10214
					int var7 = (var0.paddingY + 32) * var4; // L: 10215
					if (var15 < 20) { // L: 10216
						var18 += var0.inventoryXOffsets[var15]; // L: 10217
						var7 += var0.inventoryYOffsets[var15]; // L: 10218
					}

					if (var1 >= var18 && var2 >= var7 && var1 < var18 + 32 && var2 < var7 + 32) { // L: 10220
						Client.dragItemSlotDestination = var15; // L: 10221
						HorizontalAlignment.hoveredItemContainer = var0; // L: 10222
						if (var0.itemIds[var15] > 0) { // L: 10223
							ItemComposition var8 = class281.ItemDefinition_get(var0.itemIds[var15] - 1); // L: 10224
							if (Client.isItemSelected == 1 && Login.method2244(class60.getWidgetFlags(var0))) { // L: 10225
								if (var0.id != ClientPacket.selectedItemWidget || var15 != class195.selectedItemSlot) { // L: 10226
									WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id); // L: 10227
								}
							} else if (Client.isSpellSelected && Login.method2244(class60.getWidgetFlags(var0))) { // L: 10231
								if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 16) == 16) { // L: 10232
									WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id); // L: 10233
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10238
								int var10 = -1; // L: 10239
								if (Client.shiftClickDrop && ModeWhere.method3875()) { // L: 10240
									var10 = var8.getShiftClickIndex(); // L: 10241
								}

								if (Login.method2244(class60.getWidgetFlags(var0))) { // L: 10243
									for (int var11 = 4; var11 >= 3; --var11) { // L: 10244
										if (var10 != var11) { // L: 10245
											class204.addWidgetItemMenuItem(var0, var8, var15, var11, false); // L: 10246
										}
									}
								}

								int var12 = class60.getWidgetFlags(var0); // L: 10250
								boolean var20 = (var12 >> 31 & 1) != 0; // L: 10252
								if (var20) { // L: 10254
									WorldMapManager.insertMenuItemNoShift("Use", FileSystem.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id); // L: 10255
								}

								Object var10000 = null; // L: 10258
								int var13;
								if (Login.method2244(class60.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) { // L: 10259
										if (var10 != var13) { // L: 10260
											class204.addWidgetItemMenuItem(var0, var8, var15, var13, false); // L: 10261
										}
									}

									if (var10 >= 0) { // L: 10263
										class204.addWidgetItemMenuItem(var0, var8, var15, var10, true); // L: 10264
									}
								}

								var9 = var0.itemActions; // L: 10267
								if (var9 != null) { // L: 10268
									for (var13 = 4; var13 >= 0; --var13) { // L: 10269
										if (var9[var13] != null) { // L: 10270
											byte var14 = 0; // L: 10271
											if (var13 == 0) { // L: 10272
												var14 = 39;
											}

											if (var13 == 1) { // L: 10273
												var14 = 40;
											}

											if (var13 == 2) { // L: 10274
												var14 = 41;
											}

											if (var13 == 3) { // L: 10275
												var14 = 42;
											}

											if (var13 == 4) { // L: 10276
												var14 = 43;
											}

											WorldMapManager.insertMenuItemNoShift(var9[var13], FileSystem.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id); // L: 10277
										}
									}
								}

								WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id); // L: 10282
							}
						}
					}

					++var15; // L: 10287
				}
			}
		}

		if (var0.isIf3) { // L: 10291
			if (Client.isSpellSelected) { // L: 10292
				var4 = class60.getWidgetFlags(var0); // L: 10294
				boolean var21 = (var4 >> 21 & 1) != 0; // L: 10296
				if (var21 && (GrandExchangeOfferNameComparator.selectedSpellFlags & 32) == 32) { // L: 10298
					WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10299
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) { // L: 10304
					String var17;
					if (!MidiPcmStream.method3972(class60.getWidgetFlags(var0), var15) && var0.onOp == null) { // L: 10307
						var17 = null; // L: 10308
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) { // L: 10311
						var17 = var0.actions[var15]; // L: 10315
					} else {
						var17 = null; // L: 10312
					}

					if (var17 != null) { // L: 10318
						WorldMapManager.insertMenuItemNoShift(var17, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id); // L: 10319
					}
				}

				var3 = Player.Widget_getSpellActionName(var0); // L: 10323
				if (var3 != null) { // L: 10324
					WorldMapManager.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10325
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10328
					String var16;
					if (!MidiPcmStream.method3972(class60.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 10331
						var16 = null; // L: 10332
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10335
						var16 = var0.actions[var4]; // L: 10339
					} else {
						var16 = null; // L: 10336
					}

					if (var16 != null) { // L: 10342
						WorldMapEvent.insertMenuItem(var16, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10343
					}
				}

				var5 = class60.getWidgetFlags(var0); // L: 10348
				boolean var19 = (var5 & 1) != 0; // L: 10350
				if (var19) { // L: 10352
					WorldMapManager.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10353
				}
			}
		}

	} // L: 10358
}
