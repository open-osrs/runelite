import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class233 {
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lck;IIII)V",
		garbageValue = "-513750809"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class340.localPlayer != var0) { // L: 10310
			if (Client.menuOptionsCount < 400) { // L: 10311
				String var4;
				if (var0.skillLevel == 0) { // L: 10313
					var4 = var0.actions[0] + var0.username + var0.actions[1] + Tiles.method2108(var0.combatLevel, class340.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10314
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 10315
					class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10316
				} else if (Client.isSpellSelected) { // L: 10319
					if ((class91.selectedSpellFlags & 8) == 8) { // L: 10320
						class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10321
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 10326
						if (Client.playerMenuActions[var5] != null) { // L: 10327
							short var6 = 0; // L: 10328
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 10329
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10330
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class340.localPlayer.combatLevel) { // L: 10331
									var6 = 2000; // L: 10332
								}

								if (class340.localPlayer.team != 0 && var0.team != 0) { // L: 10334
									if (var0.team == class340.localPlayer.team) { // L: 10335
										var6 = 2000;
									} else {
										var6 = 0; // L: 10336
									}
								} else if (AttackOption.field1234 == Client.playerAttackOption && var0.isClanMember()) { // L: 10338
									var6 = 2000; // L: 10339
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 10342
								var6 = 2000;
							}

							boolean var7 = false; // L: 10343
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 10344
							class11.insertMenuItemNoShift(Client.playerMenuActions[var5], UserComparator5.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 10345
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 10350
					if (Client.menuOpcodes[var5] == 23) { // L: 10351
						Client.menuTargets[var5] = UserComparator5.colorStartTag(16777215) + var4; // L: 10352
						break;
					}
				}

			}
		}
	} // L: 10356
}
