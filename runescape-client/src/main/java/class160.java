import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class160 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	public UrlRequest field1783;
	@ObfuscatedName("q")
	public float[] field1782;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leq;)V"
	)
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1782 = new float[4]; // L: 308
	} // L: 310

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfa;",
		garbageValue = "31"
	)
	public static FloorUnderlayDefinition method3171(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 23
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Ldl;",
		garbageValue = "-638516469"
	)
	static class118 method3169(int var0) {
		class118 var1 = (class118)class291.findEnumerated(HealthBar.method2333(), var0); // L: 35
		if (var1 == null) {
			var1 = class118.field1498; // L: 36
		}

		return var1; // L: 37
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Lki;IIB)V",
		garbageValue = "43"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 11008
			Projectile.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 11009
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11012
			var3 = TriBool.Widget_getSpellActionName(var0); // L: 11013
			if (var3 != null) { // L: 11014
				Projectile.insertMenuItemNoShift(var3, class166.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 11015
			}
		}

		if (var0.buttonType == 3) { // L: 11019
			Projectile.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11020
		}

		if (var0.buttonType == 4) { // L: 11023
			Projectile.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 11024
		}

		if (var0.buttonType == 5) { // L: 11027
			Projectile.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 11028
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11031
			Projectile.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 11032
		}

		int var4;
		int var5;
		int var19;
		if (var0.type == 2) { // L: 11035
			var19 = 0; // L: 11036

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 11037
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 11038
					int var6 = (var0.paddingX + 32) * var5; // L: 11039
					int var7 = (var0.paddingY + 32) * var4; // L: 11040
					if (var19 < 20) { // L: 11041
						var6 += var0.inventoryXOffsets[var19]; // L: 11042
						var7 += var0.inventoryYOffsets[var19]; // L: 11043
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) { // L: 11045
						Client.dragItemSlotDestination = var19; // L: 11046
						class155.hoveredItemContainer = var0; // L: 11047
						if (var0.itemIds[var19] > 0) { // L: 11048
							label328: {
								ItemComposition var8 = FileSystem.ItemDefinition_get(var0.itemIds[var19] - 1); // L: 11049
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) { // L: 11051
									var10 = UrlRequester.getWidgetFlags(var0); // L: 11053
									var9 = (var10 >> 30 & 1) != 0; // L: 11055
									if (var9) { // L: 11057
										if (var0.id != class20.selectedItemWidget || var19 != PcmPlayer.selectedItemSlot) { // L: 11058
											Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(16748608) + var8.name, 31, var8.id, var19, var0.id); // L: 11059
										}
										break label328;
									}
								}

								if (Client.isSpellSelected) { // L: 11066
									var10 = UrlRequester.getWidgetFlags(var0); // L: 11068
									var9 = (var10 >> 30 & 1) != 0; // L: 11070
									if (var9) { // L: 11072
										if ((class113.selectedSpellFlags & 16) == 16) { // L: 11073
											Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(16748608) + var8.name, 32, var8.id, var19, var0.id); // L: 11074
										}
										break label328;
									}
								}

								String[] var22 = var8.inventoryActions; // L: 11080
								var10 = -1; // L: 11081
								boolean var11;
								if (Client.shiftClickDrop) { // L: 11082
									var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 11085
									if (var11) { // L: 11087
										var10 = var8.getShiftClickIndex(); // L: 11088
									}
								}

								int var12 = UrlRequester.getWidgetFlags(var0); // L: 11092
								var11 = (var12 >> 30 & 1) != 0; // L: 11094
								if (var11) { // L: 11096
									for (int var13 = 4; var13 >= 3; --var13) { // L: 11097
										if (var10 != var13) { // L: 11098
											class321.addWidgetItemMenuItem(var0, var8, var19, var13, false); // L: 11099
										}
									}
								}

								int var14 = UrlRequester.getWidgetFlags(var0); // L: 11103
								boolean var24 = (var14 >> 31 & 1) != 0; // L: 11105
								if (var24) { // L: 11107
									Projectile.insertMenuItemNoShift("Use", class166.colorStartTag(16748608) + var8.name, 38, var8.id, var19, var0.id); // L: 11108
								}

								int var16 = UrlRequester.getWidgetFlags(var0); // L: 11112
								boolean var15 = (var16 >> 30 & 1) != 0; // L: 11114
								int var17;
								if (var15) { // L: 11116
									for (var17 = 2; var17 >= 0; --var17) { // L: 11117
										if (var17 != var10) { // L: 11118
											class321.addWidgetItemMenuItem(var0, var8, var19, var17, false); // L: 11119
										}
									}

									if (var10 >= 0) { // L: 11121
										class321.addWidgetItemMenuItem(var0, var8, var19, var10, true); // L: 11122
									}
								}

								var22 = var0.itemActions; // L: 11125
								if (var22 != null) { // L: 11126
									for (var17 = 4; var17 >= 0; --var17) { // L: 11127
										if (var22[var17] != null) { // L: 11128
											byte var18 = 0; // L: 11129
											if (var17 == 0) { // L: 11130
												var18 = 39;
											}

											if (var17 == 1) { // L: 11131
												var18 = 40;
											}

											if (var17 == 2) { // L: 11132
												var18 = 41;
											}

											if (var17 == 3) { // L: 11133
												var18 = 42;
											}

											if (var17 == 4) { // L: 11134
												var18 = 43;
											}

											Projectile.insertMenuItemNoShift(var22[var17], class166.colorStartTag(16748608) + var8.name, var18, var8.id, var19, var0.id); // L: 11135
										}
									}
								}

								Projectile.insertMenuItemNoShift("Examine", class166.colorStartTag(16748608) + var8.name, 1005, var8.id, var19, var0.id); // L: 11140
							}
						}
					}

					++var19; // L: 11146
				}
			}
		}

		if (var0.isIf3) { // L: 11150
			if (Client.isSpellSelected) { // L: 11151
				var4 = UrlRequester.getWidgetFlags(var0); // L: 11153
				boolean var25 = (var4 >> 21 & 1) != 0; // L: 11155
				if (var25 && (class113.selectedSpellFlags & 32) == 32) { // L: 11157
					Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 11158
				}
			} else {
				for (var19 = 9; var19 >= 5; --var19) { // L: 11163
					String var21 = class193.method3801(var0, var19); // L: 11164
					if (var21 != null) { // L: 11165
						Projectile.insertMenuItemNoShift(var21, var0.dataText, 1007, var19 + 1, var0.childIndex, var0.id); // L: 11166
					}
				}

				var3 = TriBool.Widget_getSpellActionName(var0); // L: 11170
				if (var3 != null) { // L: 11171
					Projectile.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 11172
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 11175
					String var20 = class193.method3801(var0, var4); // L: 11176
					if (var20 != null) { // L: 11177
						class175.insertMenuItem(var20, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 11178
					}
				}

				var5 = UrlRequester.getWidgetFlags(var0); // L: 11183
				boolean var23 = (var5 & 1) != 0; // L: 11185
				if (var23) { // L: 11187
					Projectile.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11188
				}
			}
		}

	} // L: 11193
}
