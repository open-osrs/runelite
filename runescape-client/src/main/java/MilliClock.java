import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("n")
	long[] field1581;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1926195219
	)
	int field1580;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1239703239
	)
	int field1582;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 1838045088116559801L
	)
	long field1584;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -434613237
	)
	int field1583;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1538511437
	)
	int field1585;

	public MilliClock() {
		this.field1581 = new long[10];
		this.field1580 = 256;
		this.field1582 = 1;
		this.field1583 = 0;
		this.field1584 = Occluder.method4335();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1581[var1] = this.field1584;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2146592699"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1581[var1] = 0L;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1080855684"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1580;
		int var4 = this.field1582;
		this.field1580 = 300;
		this.field1582 = 1;
		this.field1584 = Occluder.method4335();
		if (0L == this.field1581[this.field1585]) {
			this.field1580 = var3;
			this.field1582 = var4;
		} else if (this.field1584 > this.field1581[this.field1585]) {
			this.field1580 = (int)((long)(var1 * 2560) / (this.field1584 - this.field1581[this.field1585]));
		}

		if (this.field1580 < 25) {
			this.field1580 = 25;
		}

		if (this.field1580 > 256) {
			this.field1580 = 256;
			this.field1582 = (int)((long)var1 - (this.field1584 - this.field1581[this.field1585]) / 10L);
		}

		if (this.field1582 > var1) {
			this.field1582 = var1;
		}

		this.field1581[this.field1585] = this.field1584;
		this.field1585 = (this.field1585 + 1) % 10;
		int var5;
		if (this.field1582 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1581[var5]) {
					this.field1581[var5] += (long)this.field1582;
				}
			}
		}

		if (this.field1582 < var2) {
			this.field1582 = var2;
		}

		PlayerType.method5099((long)this.field1582);

		for (var5 = 0; this.field1583 < 256; this.field1583 += this.field1580) {
			++var5;
		}

		this.field1583 &= 255;
		return var5;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "473424280"
	)
	public static int method2795(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ljd;III)V",
		garbageValue = "1765298455"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = FileSystem.Widget_getSpellActionName(var0);
			if (var3 != null) {
				ModelData0.insertMenuItemNoShift(var3, class54.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			ModelData0.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			ModelData0.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var15;
		if (var0.type == 2) {
			var15 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var17 = 0; var17 < var0.width; ++var17) {
					int var6 = (var0.paddingX + 32) * var17;
					int var7 = (var0.paddingY + 32) * var4;
					if (var15 < 20) {
						var6 += var0.inventoryXOffsets[var15];
						var7 += var0.inventoryYOffsets[var15];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var15;
						GameBuild.hoveredItemContainer = var0;
						if (var0.itemIds[var15] > 0) {
							ItemComposition var8 = class65.ItemDefinition_get(var0.itemIds[var15] - 1);
							if (Client.isItemSelected == 1 && WorldMapEvent.method3947(Decimator.getWidgetFlags(var0))) {
								if (var0.id != Tiles.selectedItemWidget || var15 != DesktopPlatformInfoProvider.selectedItemSlot) {
									ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class54.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id);
								}
							} else {
								label316: {
									int var10;
									if (Client.isSpellSelected) {
										var10 = Decimator.getWidgetFlags(var0);
										boolean var9 = (var10 >> 30 & 1) != 0;
										if (var9) {
											if ((ScriptFrame.selectedSpellFlags & 16) == 16) {
												ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class54.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id);
											}
											break label316;
										}
									}

									String[] var18 = var8.inventoryActions;
									var10 = -1;
									boolean var11;
									if (Client.shiftClickDrop) {
										var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
										if (var11) {
											var10 = var8.getShiftClickIndex();
										}
									}

									if (WorldMapEvent.method3947(Decimator.getWidgetFlags(var0))) {
										for (int var19 = 4; var19 >= 3; --var19) {
											if (var19 != var10) {
												AbstractSocket.addWidgetItemMenuItem(var0, var8, var15, var19, false);
											}
										}
									}

									int var12 = Decimator.getWidgetFlags(var0);
									var11 = (var12 >> 31 & 1) != 0;
									if (var11) {
										ModelData0.insertMenuItemNoShift("Use", class54.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id);
									}

									Object var10000 = null;
									int var13;
									if (WorldMapEvent.method3947(Decimator.getWidgetFlags(var0))) {
										for (var13 = 2; var13 >= 0; --var13) {
											if (var10 != var13) {
												AbstractSocket.addWidgetItemMenuItem(var0, var8, var15, var13, false);
											}
										}

										if (var10 >= 0) {
											AbstractSocket.addWidgetItemMenuItem(var0, var8, var15, var10, true);
										}
									}

									var18 = var0.itemActions;
									if (var18 != null) {
										for (var13 = 4; var13 >= 0; --var13) {
											if (var18[var13] != null) {
												byte var14 = 0;
												if (var13 == 0) {
													var14 = 39;
												}

												if (var13 == 1) {
													var14 = 40;
												}

												if (var13 == 2) {
													var14 = 41;
												}

												if (var13 == 3) {
													var14 = 42;
												}

												if (var13 == 4) {
													var14 = 43;
												}

												ModelData0.insertMenuItemNoShift(var18[var13], class54.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id);
											}
										}
									}

									ModelData0.insertMenuItemNoShift("Examine", class54.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id);
								}
							}
						}
					}

					++var15;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = Decimator.getWidgetFlags(var0);
				boolean var20 = (var4 >> 21 & 1) != 0;
				if (var20 && (ScriptFrame.selectedSpellFlags & 32) == 32) {
					ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) {
					String var16 = class28.method405(var0, var15);
					if (var16 != null) {
						ModelData0.insertMenuItemNoShift(var16, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = FileSystem.Widget_getSpellActionName(var0);
				if (var3 != null) {
					ModelData0.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var5 = class28.method405(var0, var4);
					if (var5 != null) {
						GrandExchangeEvents.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				if (Varps.method4865(Decimator.getWidgetFlags(var0))) {
					ModelData0.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
