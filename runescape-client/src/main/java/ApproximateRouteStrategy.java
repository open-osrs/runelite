import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 955958433
	)
	static int field630;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -2033733379
	)
	@Export("menuHeight")
	static int menuHeight;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIILfz;I)Z",
		garbageValue = "-1966963917"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lby;IIBI)V",
		garbageValue = "-549376931"
	)
	static final void method1284(Player var0, int var1, int var2, byte var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var7 = Login.method2235(var4, var5, var0.transformedSize(), class52.method877(var1, var2), Client.collisionMaps[var0.plane], true, Client.field947, Client.field948);
				if (var7 >= 1) {
					for (int var8 = 0; var8 < var7 - 1; ++var8) {
						var0.method1302(Client.field947[var8], Client.field948[var8], var3);
					}

				}
			}
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
		garbageValue = "-63"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIII)V",
		garbageValue = "1974138271"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCDefinition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) {
			if (var0.transforms != null) {
				var0 = var0.transform();
			}

			if (var0 != null) {
				if (var0.isInteractable) {
					if (!var0.isFollower || Client.followerIndex == var1) {
						String var4 = var0.name;
						if (var0.combatLevel != 0) {
							var4 = var4 + Canvas.method924(var0.combatLevel, class60.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")";
						}

						if (var0.isFollower && Client.followerOpsLowPriority) {
							ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(16776960) + var4, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((WorldMapSprite.selectedSpellFlags & 2) == 2) {
								ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(16776960) + var4, 8, var1, var2, var3);
							}
						} else {
							int var5 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var6 = var0.actions;
							int var7;
							int var8;
							if (var6 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var6[var7] != null && !var6[var7].equalsIgnoreCase("Attack")) {
										var8 = 0;
										if (var7 == 0) {
											var8 = var5 + 9;
										}

										if (var7 == 1) {
											var8 = var5 + 10;
										}

										if (var7 == 2) {
											var8 = var5 + 11;
										}

										if (var7 == 3) {
											var8 = var5 + 12;
										}

										if (var7 == 4) {
											var8 = var5 + 13;
										}

										ScriptEvent.insertMenuItemNoShift(var6[var7], ItemContainer.colorStartTag(16776960) + var4, var8, var1, var2, var3);
									}
								}
							}

							if (var6 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var6[var7] != null && var6[var7].equalsIgnoreCase("Attack")) {
										short var9 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class60.localPlayer.combatLevel) {
												var9 = 2000;
											}

											var8 = 0;
											if (var7 == 0) {
												var8 = var9 + 9;
											}

											if (var7 == 1) {
												var8 = var9 + 10;
											}

											if (var7 == 2) {
												var8 = var9 + 11;
											}

											if (var7 == 3) {
												var8 = var9 + 12;
											}

											if (var7 == 4) {
												var8 = var9 + 13;
											}

											ScriptEvent.insertMenuItemNoShift(var6[var7], ItemContainer.colorStartTag(16776960) + var4, var8, var1, var2, var3);
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) {
								ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
