import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class9 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	public static final class9 field36;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	public static final class9 field30;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	static final class9 field31;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	static final class9 field39;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	static final class9 field33;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -145879233
	)
	int field29;
	@ObfuscatedName("g")
	String field35;
	@ObfuscatedName("w")
	boolean field40;
	@ObfuscatedName("y")
	boolean field37;

	static {
		field36 = new class9(0, "POST", true, true); // L: 6
		field30 = new class9(1, "GET", true, false); // L: 7
		field31 = new class9(2, "PUT", false, true); // L: 8
		field39 = new class9(3, "PATCH", false, true); // L: 9
		field33 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field29 = var1; // L: 17
		this.field35 = var2; // L: 18
		this.field40 = var3; // L: 19
		this.field37 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field29; // L: 37
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1680698316"
	)
	boolean method61() {
		return this.field40; // L: 24
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "311"
	)
	public String method64() {
		return this.field35; // L: 28
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1657994418"
	)
	boolean method62() {
		return this.field37; // L: 32
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1270247165"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4367
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lkb;III)V",
		garbageValue = "2138979483"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 10891
			class4.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 10892
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10895
			var3 = WorldMapIcon_0.Widget_getSpellActionName(var0); // L: 10896
			if (var3 != null) { // L: 10897
				class4.insertMenuItemNoShift(var3, class122.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10898
			}
		}

		if (var0.buttonType == 3) { // L: 10902
			class4.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10903
		}

		if (var0.buttonType == 4) { // L: 10906
			class4.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10907
		}

		if (var0.buttonType == 5) { // L: 10910
			class4.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10911
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10914
			class4.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10915
		}

		int var4;
		int var13;
		if (var0.type == 2) { // L: 10918
			var13 = 0; // L: 10919

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10920
				for (int var15 = 0; var15 < var0.width; ++var15) { // L: 10921
					int var6 = (var0.paddingX + 32) * var15; // L: 10922
					int var7 = (var0.paddingY + 32) * var4; // L: 10923
					if (var13 < 20) { // L: 10924
						var6 += var0.inventoryXOffsets[var13]; // L: 10925
						var7 += var0.inventoryYOffsets[var13]; // L: 10926
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 10928
						Client.dragItemSlotDestination = var13; // L: 10929
						class161.hoveredItemContainer = var0; // L: 10930
						if (var0.itemIds[var13] > 0) { // L: 10931
							ItemComposition var8 = EnumComposition.ItemDefinition_get(var0.itemIds[var13] - 1); // L: 10932
							if (Client.isItemSelected == 1 && class120.method2759(class124.getWidgetFlags(var0))) { // L: 10933
								if (var0.id != ModeWhere.selectedItemWidget || var13 != EnumComposition.selectedItemSlot) { // L: 10934
									class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id); // L: 10935
								}
							} else if (Client.isSpellSelected && class120.method2759(class124.getWidgetFlags(var0))) { // L: 10939
								if ((HealthBar.selectedSpellFlags & 16) == 16) { // L: 10940
									class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id); // L: 10941
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10946
								int var10 = -1; // L: 10947
								if (Client.shiftClickDrop) { // L: 10948
									boolean var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10951
									if (var11) { // L: 10953
										var10 = var8.getShiftClickIndex(); // L: 10954
									}
								}

								int var16;
								if (class120.method2759(class124.getWidgetFlags(var0))) { // L: 10957
									for (var16 = 4; var16 >= 3; --var16) { // L: 10958
										if (var16 != var10) { // L: 10959
											class150.addWidgetItemMenuItem(var0, var8, var13, var16, false); // L: 10960
										}
									}
								}

								if (FontName.method7386(class124.getWidgetFlags(var0))) { // L: 10963
									class4.insertMenuItemNoShift("Use", class122.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id); // L: 10964
								}

								if (class120.method2759(class124.getWidgetFlags(var0))) { // L: 10967
									for (var16 = 2; var16 >= 0; --var16) { // L: 10968
										if (var10 != var16) { // L: 10969
											class150.addWidgetItemMenuItem(var0, var8, var13, var16, false); // L: 10970
										}
									}

									if (var10 >= 0) { // L: 10972
										class150.addWidgetItemMenuItem(var0, var8, var13, var10, true); // L: 10973
									}
								}

								var9 = var0.itemActions; // L: 10976
								if (var9 != null) { // L: 10977
									for (var16 = 4; var16 >= 0; --var16) { // L: 10978
										if (var9[var16] != null) { // L: 10979
											byte var12 = 0; // L: 10980
											if (var16 == 0) { // L: 10981
												var12 = 39;
											}

											if (var16 == 1) { // L: 10982
												var12 = 40;
											}

											if (var16 == 2) { // L: 10983
												var12 = 41;
											}

											if (var16 == 3) { // L: 10984
												var12 = 42;
											}

											if (var16 == 4) { // L: 10985
												var12 = 43;
											}

											class4.insertMenuItemNoShift(var9[var16], class122.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id); // L: 10986
										}
									}
								}

								class4.insertMenuItemNoShift("Examine", class122.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id); // L: 10991
							}
						}
					}

					++var13; // L: 10996
				}
			}
		}

		if (var0.isIf3) { // L: 11000
			if (Client.isSpellSelected) { // L: 11001
				if (class67.method1885(class124.getWidgetFlags(var0)) && (HealthBar.selectedSpellFlags & 32) == 32) { // L: 11002
					class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 11003
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) { // L: 11008
					String var14 = class14.method157(var0, var13); // L: 11009
					if (var14 != null) { // L: 11010
						class4.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id); // L: 11011
					}
				}

				var3 = WorldMapIcon_0.Widget_getSpellActionName(var0); // L: 11015
				if (var3 != null) { // L: 11016
					class4.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 11017
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 11020
					String var5 = class14.method157(var0, var4); // L: 11021
					if (var5 != null) { // L: 11022
						class268.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 11023
					}
				}

				if (FontName.method7385(class124.getWidgetFlags(var0))) { // L: 11027
					class4.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11028
				}
			}
		}

	} // L: 11033

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-112"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11036
	} // L: 11037
}
