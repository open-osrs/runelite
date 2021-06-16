import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class261 {
	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lex;",
		garbageValue = "-1540124861"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 19
			var1 = new InvDefinition(); // L: 20
			if (var2 != null) { // L: 21
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIB)V",
		garbageValue = "-13"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10173
			class22.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10174
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10177
			var3 = SecureRandomCallable.Widget_getSpellActionName(var0); // L: 10178
			if (var3 != null) { // L: 10179
				class22.insertMenuItemNoShift(var3, SecureRandomFuture.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10180
			}
		}

		if (var0.buttonType == 3) { // L: 10184
			class22.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10185
		}

		if (var0.buttonType == 4) { // L: 10188
			class22.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10189
		}

		if (var0.buttonType == 5) { // L: 10192
			class22.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10193
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10196
			class22.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10197
		}

		int var4;
		int var5;
		int var15;
		if (var0.type == 2) { // L: 10200
			var15 = 0; // L: 10201

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10202
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 10203
					int var18 = (var0.paddingX + 32) * var5; // L: 10204
					int var7 = (var0.paddingY + 32) * var4; // L: 10205
					if (var15 < 20) { // L: 10206
						var18 += var0.inventoryXOffsets[var15]; // L: 10207
						var7 += var0.inventoryYOffsets[var15]; // L: 10208
					}

					if (var1 >= var18 && var2 >= var7 && var1 < var18 + 32 && var2 < var7 + 32) { // L: 10210
						Client.dragItemSlotDestination = var15; // L: 10211
						UserComparator2.hoveredItemContainer = var0; // L: 10212
						if (var0.itemIds[var15] > 0) { // L: 10213
							ItemComposition var8 = class250.ItemDefinition_get(var0.itemIds[var15] - 1); // L: 10214
							if (Client.isItemSelected == 1 && class372.method6497(class22.getWidgetFlags(var0))) { // L: 10215
								if (var0.id != class246.selectedItemWidget || var15 != Timer.selectedItemSlot) { // L: 10216
									class22.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id); // L: 10217
								}
							} else if (Client.isSpellSelected && class372.method6497(class22.getWidgetFlags(var0))) { // L: 10221
								if ((LoginPacket.selectedSpellFlags & 16) == 16) { // L: 10222
									class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id); // L: 10223
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10228
								int var10 = -1; // L: 10229
								boolean var11;
								if (Client.shiftClickDrop) { // L: 10230
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10233
									if (var11) { // L: 10235
										var10 = var8.getShiftClickIndex(); // L: 10236
									}
								}

								if (class372.method6497(class22.getWidgetFlags(var0))) { // L: 10239
									for (int var20 = 4; var20 >= 3; --var20) { // L: 10240
										if (var10 != var20) { // L: 10241
											class14.addWidgetItemMenuItem(var0, var8, var15, var20, false); // L: 10242
										}
									}
								}

								int var12 = class22.getWidgetFlags(var0); // L: 10246
								var11 = (var12 >> 31 & 1) != 0; // L: 10248
								if (var11) { // L: 10250
									class22.insertMenuItemNoShift("Use", SecureRandomFuture.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id); // L: 10251
								}

								Object var10000 = null; // L: 10254
								int var13;
								if (class372.method6497(class22.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) { // L: 10255
										if (var13 != var10) { // L: 10256
											class14.addWidgetItemMenuItem(var0, var8, var15, var13, false); // L: 10257
										}
									}

									if (var10 >= 0) { // L: 10259
										class14.addWidgetItemMenuItem(var0, var8, var15, var10, true); // L: 10260
									}
								}

								var9 = var0.itemActions; // L: 10263
								if (var9 != null) { // L: 10264
									for (var13 = 4; var13 >= 0; --var13) { // L: 10265
										if (var9[var13] != null) { // L: 10266
											byte var14 = 0; // L: 10267
											if (var13 == 0) { // L: 10268
												var14 = 39;
											}

											if (var13 == 1) { // L: 10269
												var14 = 40;
											}

											if (var13 == 2) { // L: 10270
												var14 = 41;
											}

											if (var13 == 3) { // L: 10271
												var14 = 42;
											}

											if (var13 == 4) { // L: 10272
												var14 = 43;
											}

											class22.insertMenuItemNoShift(var9[var13], SecureRandomFuture.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id); // L: 10273
										}
									}
								}

								class22.insertMenuItemNoShift("Examine", SecureRandomFuture.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id); // L: 10278
							}
						}
					}

					++var15; // L: 10283
				}
			}
		}

		if (var0.isIf3) { // L: 10287
			if (Client.isSpellSelected) { // L: 10288
				var4 = class22.getWidgetFlags(var0); // L: 10290
				boolean var21 = (var4 >> 21 & 1) != 0; // L: 10292
				if (var21 && (LoginPacket.selectedSpellFlags & 32) == 32) { // L: 10294
					class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10295
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) { // L: 10300
					String var17;
					if (!class136.method2696(class22.getWidgetFlags(var0), var15) && var0.onOp == null) { // L: 10303
						var17 = null; // L: 10304
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) { // L: 10307
						var17 = var0.actions[var15]; // L: 10311
					} else {
						var17 = null; // L: 10308
					}

					if (var17 != null) { // L: 10314
						class22.insertMenuItemNoShift(var17, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id); // L: 10315
					}
				}

				var3 = SecureRandomCallable.Widget_getSpellActionName(var0); // L: 10319
				if (var3 != null) { // L: 10320
					class22.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10321
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10324
					String var16;
					if (!class136.method2696(class22.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 10327
						var16 = null; // L: 10328
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10331
						var16 = var0.actions[var4]; // L: 10335
					} else {
						var16 = null; // L: 10332
					}

					if (var16 != null) { // L: 10338
						PacketWriter.insertMenuItem(var16, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10339
					}
				}

				var5 = class22.getWidgetFlags(var0); // L: 10344
				boolean var19 = (var5 & 1) != 0; // L: 10346
				if (var19) { // L: 10348
					class22.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10349
				}
			}
		}

	} // L: 10354
}
