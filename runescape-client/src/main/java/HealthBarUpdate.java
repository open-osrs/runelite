import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -859723449
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 36021957
	)
	@Export("health")
	int health;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1070199867
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 687360175
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-629620630"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1591"
	)
	public static void method2197() {
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 57
	} // L: 58

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(B)Lmc;",
		garbageValue = "7"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class243.worldMap; // L: 686
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1808857292"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (MouseRecorder.pcmPlayer1 != null) { // L: 3353
			MouseRecorder.pcmPlayer1.run();
		}

		if (DesktopPlatformInfoProvider.pcmPlayer0 != null) { // L: 3354
			DesktopPlatformInfoProvider.pcmPlayer0.run();
		}

	} // L: 3355

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lio;III)V",
		garbageValue = "-190288118"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) { // L: 9993
			Occluder.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id); // L: 9994
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 9997
			var3 = BoundaryObject.Widget_getSpellActionName(var0); // L: 9998
			if (var3 != null) { // L: 9999
				Occluder.insertMenuItemNoShift(var3, class44.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id); // L: 10000
			}
		}

		if (var0.buttonType == 3) { // L: 10004
			Occluder.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10005
		}

		if (var0.buttonType == 4) { // L: 10008
			Occluder.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10009
		}

		if (var0.buttonType == 5) { // L: 10012
			Occluder.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10013
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10016
			Occluder.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10017
		}

		int var4;
		int var5;
		int var13;
		if (var0.type == 2) { // L: 10020
			var13 = 0; // L: 10021

			for (var4 = 0; var4 < var0.height; ++var4) { // L: 10022
				for (var5 = 0; var5 < var0.width; ++var5) { // L: 10023
					int var16 = (var0.paddingX + 32) * var5; // L: 10024
					int var7 = (var0.paddingY + 32) * var4; // L: 10025
					if (var13 < 20) { // L: 10026
						var16 += var0.inventoryXOffsets[var13]; // L: 10027
						var7 += var0.inventoryYOffsets[var13]; // L: 10028
					}

					if (var1 >= var16 && var2 >= var7 && var1 < var16 + 32 && var2 < var7 + 32) { // L: 10030
						Client.dragItemSlotDestination = var13; // L: 10031
						class18.hoveredItemContainer = var0; // L: 10032
						if (var0.itemIds[var13] > 0) { // L: 10033
							ItemComposition var8 = class260.ItemDefinition_get(var0.itemIds[var13] - 1); // L: 10034
							if (Client.isItemSelected == 1 && World.method1663(class21.getWidgetFlags(var0))) { // L: 10035
								if (var0.id != Player.selectedItemWidget || var13 != ClanChannelMember.selectedItemSlot) { // L: 10036
									Occluder.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class44.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id); // L: 10037
								}
							} else if (Client.isSpellSelected && World.method1663(class21.getWidgetFlags(var0))) { // L: 10041
								if ((class4.selectedSpellFlags & 16) == 16) { // L: 10042
									Occluder.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class44.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id); // L: 10043
								}
							} else {
								String[] var9 = var8.inventoryActions; // L: 10048
								int var10 = -1; // L: 10049
								if (Client.shiftClickDrop) { // L: 10050
									boolean var11 = Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10053
									if (var11) { // L: 10055
										var10 = var8.getShiftClickIndex(); // L: 10056
									}
								}

								int var18;
								if (World.method1663(class21.getWidgetFlags(var0))) { // L: 10059
									for (var18 = 4; var18 >= 3; --var18) { // L: 10060
										if (var10 != var18) { // L: 10061
											class125.addWidgetItemMenuItem(var0, var8, var13, var18, false); // L: 10062
										}
									}
								}

								if (StructComposition.method2908(class21.getWidgetFlags(var0))) { // L: 10065
									Occluder.insertMenuItemNoShift("Use", class44.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id); // L: 10066
								}

								if (World.method1663(class21.getWidgetFlags(var0))) { // L: 10069
									for (var18 = 2; var18 >= 0; --var18) { // L: 10070
										if (var18 != var10) { // L: 10071
											class125.addWidgetItemMenuItem(var0, var8, var13, var18, false); // L: 10072
										}
									}

									if (var10 >= 0) { // L: 10074
										class125.addWidgetItemMenuItem(var0, var8, var13, var10, true); // L: 10075
									}
								}

								var9 = var0.itemActions; // L: 10078
								if (var9 != null) { // L: 10079
									for (var18 = 4; var18 >= 0; --var18) { // L: 10080
										if (var9[var18] != null) { // L: 10081
											byte var12 = 0; // L: 10082
											if (var18 == 0) { // L: 10083
												var12 = 39;
											}

											if (var18 == 1) { // L: 10084
												var12 = 40;
											}

											if (var18 == 2) { // L: 10085
												var12 = 41;
											}

											if (var18 == 3) { // L: 10086
												var12 = 42;
											}

											if (var18 == 4) { // L: 10087
												var12 = 43;
											}

											Occluder.insertMenuItemNoShift(var9[var18], class44.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id); // L: 10088
										}
									}
								}

								Occluder.insertMenuItemNoShift("Examine", class44.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id); // L: 10093
							}
						}
					}

					++var13; // L: 10098
				}
			}
		}

		if (var0.isIf3) { // L: 10102
			if (Client.isSpellSelected) { // L: 10103
				var4 = class21.getWidgetFlags(var0); // L: 10105
				boolean var19 = (var4 >> 21 & 1) != 0; // L: 10107
				if (var19 && (class4.selectedSpellFlags & 32) == 32) { // L: 10109
					Occluder.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id); // L: 10110
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) { // L: 10115
					String var15;
					if (!TextureProvider.method4141(class21.getWidgetFlags(var0), var13) && var0.onOp == null) { // L: 10118
						var15 = null; // L: 10119
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) { // L: 10122
						var15 = var0.actions[var13]; // L: 10126
					} else {
						var15 = null; // L: 10123
					}

					if (var15 != null) { // L: 10129
						Occluder.insertMenuItemNoShift(var15, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id); // L: 10130
					}
				}

				var3 = BoundaryObject.Widget_getSpellActionName(var0); // L: 10134
				if (var3 != null) { // L: 10135
					Occluder.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id); // L: 10136
				}

				for (var4 = 4; var4 >= 0; --var4) { // L: 10139
					String var14;
					if (!TextureProvider.method4141(class21.getWidgetFlags(var0), var4) && var0.onOp == null) { // L: 10142
						var14 = null; // L: 10143
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) { // L: 10146
						var14 = var0.actions[var4]; // L: 10150
					} else {
						var14 = null; // L: 10147
					}

					if (var14 != null) { // L: 10153
						BoundaryObject.insertMenuItem(var14, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry); // L: 10154
					}
				}

				var5 = class21.getWidgetFlags(var0); // L: 10159
				boolean var17 = (var5 & 1) != 0; // L: 10161
				if (var17) { // L: 10163
					Occluder.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10164
				}
			}
		}

	} // L: 10169
}
