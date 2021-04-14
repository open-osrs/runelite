import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class12 extends class16 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("f")
	String field111;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1521537625
	)
	int field110;
	@ObfuscatedName("u")
	byte field109;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class12(class19 var1) {
		this.this$0 = var1;
		this.field111 = null; // L: 54
	} // L: 58

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 61
			--var1.offset; // L: 62
			var1.readLong(); // L: 63
		}

		this.field111 = var1.readStringCp1252NullTerminatedOrNull(); // L: 65
		this.field110 = var1.readUnsignedShort(); // L: 66
		this.field109 = var1.readByte(); // L: 67
		var1.readLong(); // L: 68
	} // L: 69

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		class9 var2 = new class9(); // L: 72
		var2.field65 = this.field111; // L: 73
		var2.field64 = this.field110; // L: 74
		var2.field66 = this.field109; // L: 75
		var1.method61(var2); // L: 76
	} // L: 77

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Low;",
		garbageValue = "-430901660"
	)
	static IndexedSprite method213(boolean var0, boolean var1) {
		return var0 ? (var1 ? VarcInt.field3429 : Skeleton.options_buttons_2Sprite) : (var1 ? UrlRequester.field1400 : TileItem.options_buttons_0Sprite); // L: 183
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-1693166177"
	)
	static int method209(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4167
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4171
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4175
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4179
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4183
							if (var0 != 7031 && var0 != 7032) { // L: 4187
								if (var0 == 7033) { // L: 4192
									--Interpreter.Interpreter_stringStackSize; // L: 4193
									return 1; // L: 4194
								} else if (var0 != 7036 && var0 != 7037) { // L: 4196
									if (var0 == 7038) { // L: 4200
										--class16.Interpreter_intStackSize; // L: 4201
										return 1; // L: 4202
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4204
										return 2; // L: 4208
									} else {
										--class16.Interpreter_intStackSize; // L: 4205
										return 1; // L: 4206
									}
								} else {
									class16.Interpreter_intStackSize -= 2; // L: 4197
									return 1; // L: 4198
								}
							} else {
								--Interpreter.Interpreter_stringStackSize; // L: 4188
								--class16.Interpreter_intStackSize; // L: 4189
								return 1; // L: 4190
							}
						} else {
							--class16.Interpreter_intStackSize; // L: 4184
							return 1; // L: 4185
						}
					} else {
						class16.Interpreter_intStackSize -= 2; // L: 4180
						return 1; // L: 4181
					}
				} else {
					class16.Interpreter_intStackSize -= 2; // L: 4176
					return 1; // L: 4177
				}
			} else {
				class16.Interpreter_intStackSize -= 3; // L: 4172
				return 1; // L: 4173
			}
		} else {
			class16.Interpreter_intStackSize -= 5; // L: 4168
			return 1; // L: 4169
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lhu;IIB)V",
		garbageValue = "1"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10208
			SpriteMask.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10209
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10212
			var3 = class11.Widget_getSpellActionName(var0); // L: 10213
			if (var3 != null) { // L: 10214
				SpriteMask.insertMenuItemNoShift(var3, DefaultsGroup.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10215
			}
		}

		if (var0.buttonType == 3) { // L: 10219
			SpriteMask.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10220
		}

		if (var0.buttonType == 4) { // L: 10223
			SpriteMask.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10224
		}

		if (var0.buttonType == 5) { // L: 10227
			SpriteMask.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10228
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10231
			SpriteMask.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10232
		}

		int var4;
		int var6;
		int var7;
		int var15;
		if (var0.type == 2) { // L: 10235
			var15 = 0; // L: 10236

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10237
				for (int var17 = 0; var17 < var0.width; ++var17) { // L: 10238
					var6 = (var0.paddingX + 32) * var17; // L: 10239
					var7 = (var0.paddingY + 32) * var4; // L: 10240
					if (var15 < 20) { // L: 10241
						var6 += var0.inventoryXOffsets[var15]; // L: 10242
						var7 += var0.inventoryYOffsets[var15]; // L: 10243
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 10245
						Client.dragItemSlotDestination = var15; // L: 10246
						ScriptFrame.hoveredItemContainer = var0; // L: 10247
						if (var0.itemIds[var15] > 0) { // L: 10248
							ItemComposition var8 = class23.ItemDefinition_get(var0.itemIds[var15] - 1); // L: 10249
							if (Client.isItemSelected == 1 && class221.method4200(DirectByteArrayCopier.getWidgetFlags(var0))) { // L: 10250
								if (var0.id != UserComparator6.selectedItemWidget || var15 != class208.selectedItemSlot) { // L: 10251
									SpriteMask.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + DefaultsGroup.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id); // L: 10252
								}
							} else if (Client.isSpellSelected && class221.method4200(DirectByteArrayCopier.getWidgetFlags(var0))) { // L: 10256
								if ((UserComparator10.selectedSpellFlags & 16) == 16) { // L: 10257
									SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + DefaultsGroup.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id); // L: 10258
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10263
								int var10 = -1; // L: 10264
								boolean var11;
								if (Client.shiftClickDrop) { // L: 10265
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10268
									if (var11) { // L: 10270
										var10 = var8.getShiftClickIndex(); // L: 10271
									}
								}

								if (class221.method4200(DirectByteArrayCopier.getWidgetFlags(var0))) { // L: 10274
									for (int var20 = 4; var20 >= 3; --var20) { // L: 10275
										if (var10 != var20) { // L: 10276
											World.addWidgetItemMenuItem(var0, var8, var15, var20, false); // L: 10277
										}
									}
								}

								int var12 = DirectByteArrayCopier.getWidgetFlags(var0); // L: 10281
								var11 = (var12 >> 31 & 1) != 0; // L: 10283
								if (var11) { // L: 10285
									SpriteMask.insertMenuItemNoShift("Use", DefaultsGroup.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id); // L: 10286
								}

								Object var10000 = null; // L: 10289
								int var13;
								if (class221.method4200(DirectByteArrayCopier.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) { // L: 10290
										if (var10 != var13) { // L: 10291
											World.addWidgetItemMenuItem(var0, var8, var15, var13, false); // L: 10292
										}
									}

									if (var10 >= 0) { // L: 10294
										World.addWidgetItemMenuItem(var0, var8, var15, var10, true); // L: 10295
									}
								}

								var9 = var0.itemActions; // L: 10298
								if (var9 != null) { // L: 10299
									for (var13 = 4; var13 >= 0; --var13) { // L: 10300
										if (var9[var13] != null) { // L: 10301
											byte var14 = 0; // L: 10302
											if (var13 == 0) { // L: 10303
												var14 = 39;
											}

											if (var13 == 1) { // L: 10304
												var14 = 40;
											}

											if (var13 == 2) { // L: 10305
												var14 = 41;
											}

											if (var13 == 3) { // L: 10306
												var14 = 42;
											}

											if (var13 == 4) { // L: 10307
												var14 = 43;
											}

											SpriteMask.insertMenuItemNoShift(var9[var13], DefaultsGroup.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id); // L: 10308
										}
									}
								}

								SpriteMask.insertMenuItemNoShift("Examine", DefaultsGroup.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id); // L: 10313
							}
						}
					}

					++var15; // L: 10318
				}
			}
		}

		if (var0.isIf3) { // L: 10322
			if (Client.isSpellSelected) { // L: 10323
				if (class223.method4239(DirectByteArrayCopier.getWidgetFlags(var0)) && (UserComparator10.selectedSpellFlags & 32) == 32) { // L: 10324
					SpriteMask.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10325
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) { // L: 10330
					var6 = DirectByteArrayCopier.getWidgetFlags(var0); // L: 10334
					boolean var21 = (var6 >> var15 + 1 & 1) != 0; // L: 10336
					String var18;
					if (!var21 && var0.onOp == null) { // L: 10338
						var18 = null; // L: 10339
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) { // L: 10342
						var18 = var0.actions[var15]; // L: 10346
					} else {
						var18 = null; // L: 10343
					}

					if (var18 != null) { // L: 10349
						SpriteMask.insertMenuItemNoShift(var18, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id); // L: 10350
					}
				}

				var3 = class11.Widget_getSpellActionName(var0); // L: 10354
				if (var3 != null) { // L: 10355
					SpriteMask.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10356
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10359
					var7 = DirectByteArrayCopier.getWidgetFlags(var0); // L: 10363
					boolean var19 = (var7 >> var4 + 1 & 1) != 0; // L: 10365
					String var5;
					if (!var19 && var0.onOp == null) { // L: 10367
						var5 = null; // L: 10368
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10371
						var5 = var0.actions[var4]; // L: 10375
					} else {
						var5 = null; // L: 10372
					}

					if (var5 != null) { // L: 10378
						AbstractByteArrayCopier.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10379
					}
				}

				if (WorldMapEvent.method3267(DirectByteArrayCopier.getWidgetFlags(var0))) { // L: 10383
					SpriteMask.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10384
				}
			}
		}

	} // L: 10389
}
