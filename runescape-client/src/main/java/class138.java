import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class138 extends class128 {
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1603030107
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1526195035
	)
	int field1580;
	@ObfuscatedName("c")
	String field1576;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class138(class131 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1580 = var1.readInt(); // L: 326
		this.field1576 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.method2971(this.field1580, this.field1576); // L: 331
	} // L: 332

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lky;IIS)V",
		garbageValue = "-3167"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 11027
			class21.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 11028
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11031
			var3 = class152.Widget_getSpellActionName(var0); // L: 11032
			if (var3 != null) { // L: 11033
				class21.insertMenuItemNoShift(var3, UserComparator9.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 11034
			}
		}

		if (var0.buttonType == 3) { // L: 11038
			class21.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11039
		}

		if (var0.buttonType == 4) { // L: 11042
			class21.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 11043
		}

		if (var0.buttonType == 5) { // L: 11046
			class21.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 11047
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11050
			class21.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 11051
		}

		int var4;
		int var5;
		int var13;
		if (var0.type == 2) { // L: 11054
			var13 = 0; // L: 11055

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 11056
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 11057
					int var6 = (var0.paddingX + 32) * var5; // L: 11058
					int var7 = (var0.paddingY + 32) * var4; // L: 11059
					if (var13 < 20) { // L: 11060
						var6 += var0.inventoryXOffsets[var13]; // L: 11061
						var7 += var0.inventoryYOffsets[var13]; // L: 11062
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 11064
						Client.dragItemSlotDestination = var13; // L: 11065
						GrandExchangeEvent.hoveredItemContainer = var0; // L: 11066
						if (var0.itemIds[var13] > 0) { // L: 11067
							ItemComposition var8 = class19.ItemDefinition_get(var0.itemIds[var13] - 1); // L: 11068
							if (Client.isItemSelected == 1 && class150.method3149(class326.getWidgetFlags(var0))) { // L: 11069
								if (var0.id != TaskHandler.selectedItemWidget || var13 != class432.selectedItemSlot) { // L: 11070
									class21.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator9.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id); // L: 11071
								}
							} else if (Client.isSpellSelected && class150.method3149(class326.getWidgetFlags(var0))) { // L: 11075
								if ((class17.selectedSpellFlags & 16) == 16) { // L: 11076
									class21.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator9.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id); // L: 11077
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 11082
								int var10 = -1; // L: 11083
								if (Client.shiftClickDrop && class168.method3351()) { // L: 11084
									var10 = var8.getShiftClickIndex(); // L: 11085
								}

								int var11;
								if (class150.method3149(class326.getWidgetFlags(var0))) { // L: 11087
									for (var11 = 4; var11 >= 3; --var11) { // L: 11088
										if (var10 != var11) { // L: 11089
											class65.addWidgetItemMenuItem(var0, var8, var13, var11, false); // L: 11090
										}
									}
								}

								if (UserComparator10.method2629(class326.getWidgetFlags(var0))) { // L: 11093
									class21.insertMenuItemNoShift("Use", UserComparator9.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id); // L: 11094
								}

								if (class150.method3149(class326.getWidgetFlags(var0))) { // L: 11097
									for (var11 = 2; var11 >= 0; --var11) { // L: 11098
										if (var11 != var10) { // L: 11099
											class65.addWidgetItemMenuItem(var0, var8, var13, var11, false); // L: 11100
										}
									}

									if (var10 >= 0) { // L: 11102
										class65.addWidgetItemMenuItem(var0, var8, var13, var10, true); // L: 11103
									}
								}

								var9 = var0.itemActions; // L: 11106
								if (var9 != null) { // L: 11107
									for (var11 = 4; var11 >= 0; --var11) { // L: 11108
										if (var9[var11] != null) { // L: 11109
											byte var12 = 0; // L: 11110
											if (var11 == 0) { // L: 11111
												var12 = 39;
											}

											if (var11 == 1) { // L: 11112
												var12 = 40;
											}

											if (var11 == 2) { // L: 11113
												var12 = 41;
											}

											if (var11 == 3) { // L: 11114
												var12 = 42;
											}

											if (var11 == 4) { // L: 11115
												var12 = 43;
											}

											class21.insertMenuItemNoShift(var9[var11], UserComparator9.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id); // L: 11116
										}
									}
								}

								class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id); // L: 11121
							}
						}
					}

					++var13; // L: 11126
				}
			}
		}

		if (var0.isIf3) { // L: 11130
			if (Client.isSpellSelected) { // L: 11131
				if (PacketWriter.method2498(class326.getWidgetFlags(var0)) && (class17.selectedSpellFlags & 32) == 32) { // L: 11132
					class21.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 11133
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) { // L: 11138
					String var15 = class358.method6583(var0, var13); // L: 11139
					if (var15 != null) { // L: 11140
						class21.insertMenuItemNoShift(var15, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id); // L: 11141
					}
				}

				var3 = class152.Widget_getSpellActionName(var0); // L: 11145
				if (var3 != null) { // L: 11146
					class21.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 11147
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 11150
					String var14 = class358.method6583(var0, var4); // L: 11151
					if (var14 != null) { // L: 11152
						class28.insertMenuItem(var14, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 11153
					}
				}

				var5 = class326.getWidgetFlags(var0); // L: 11158
				boolean var16 = (var5 & 1) != 0; // L: 11160
				if (var16) { // L: 11162
					class21.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11163
				}
			}
		}

	} // L: 11168
}
