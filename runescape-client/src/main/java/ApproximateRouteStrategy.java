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
		signature = "(IIILfz;I)Z",
		garbageValue = "-1966963917"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		signature = "(Lby;IIBI)V",
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
		signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
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
		signature = "(Ljz;IIII)V",
		garbageValue = "1974138271"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCDefinition npcDef, int npcIdx, int sceneX, int sceneY) {
		if (Client.menuOptionsCount < 400) {
			if (npcDef.transforms != null) {
				npcDef = npcDef.transform();
			}

			if (npcDef != null) {
				if (npcDef.isInteractable) {
					if (!npcDef.isFollower || Client.followerIndex == npcIdx) {
						String npcName = npcDef.name;
						if (npcDef.combatLevel != 0) {
							npcName = npcName + Canvas.getColorForCombatDifference(npcDef.combatLevel, class60.localPlayer.combatLevel) + " " + " (" + "level-" + npcDef.combatLevel + ")";
						}

						if (npcDef.isFollower && Client.followerOpsLowPriority) {
							ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(16776960) + npcName, 1003, npcIdx, sceneX, sceneY);
						}

						if (Client.isItemSelected == 1) {
							ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(16776960) + npcName, 7, npcIdx, sceneX, sceneY);
						} else if (Client.isSpellSelected) {
							if ((WorldMapSprite.selectedSpellFlags & 2) == 2) {
								ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(16776960) + npcName, 8, npcIdx, sceneX, sceneY);
							}
						} else {
							int flwrOffset = npcDef.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] actions = npcDef.actions;
							int i;
							int opcode;
							if (actions != null) {
								for (i = 4; i >= 0; --i) {
									if (actions[i] != null && !actions[i].equalsIgnoreCase("Attack")) {
										opcode = 0;
										if (i == 0) {
											opcode = flwrOffset + 9;
										}

										if (i == 1) {
											opcode = flwrOffset + 10;
										}

										if (i == 2) {
											opcode = flwrOffset + 11;
										}

										if (i == 3) {
											opcode = flwrOffset + 12;
										}

										if (i == 4) {
											opcode = flwrOffset + 13;
										}

										ScriptEvent.insertMenuItemNoShift(actions[i], ItemContainer.colorStartTag(16776960) + npcName, opcode, npcIdx, sceneX, sceneY);
									}
								}
							}

							if (actions != null) {
								for (i = 4; i >= 0; --i) {
									if (actions[i] != null && actions[i].equalsIgnoreCase("Attack")) {
										short atkOffset = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && npcDef.combatLevel > class60.localPlayer.combatLevel) {
												atkOffset = 2000;
											}

											opcode = 0;
											if (i == 0) {
												opcode = atkOffset + 9;
											}

											if (i == 1) {
												opcode = atkOffset + 10;
											}

											if (i == 2) {
												opcode = atkOffset + 11;
											}

											if (i == 3) {
												opcode = atkOffset + 12;
											}

											if (i == 4) {
												opcode = atkOffset + 13;
											}

											ScriptEvent.insertMenuItemNoShift(actions[i], ItemContainer.colorStartTag(16776960) + npcName, opcode, npcIdx, sceneX, sceneY);
										}
									}
								}
							}

							if (!npcDef.isFollower || !Client.followerOpsLowPriority) {
								ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(16776960) + npcName, 1003, npcIdx, sceneX, sceneY);
							}
						}

					}
				}
			}
		}
	}
}
