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
		if (class340.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				if (var0.skillLevel == 0) {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + Tiles.method2108(var0.combatLevel, class340.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var5;
				if (Client.isItemSelected == 1) {
					class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((class91.selectedSpellFlags & 8) == 8) {
						class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) {
						if (Client.playerMenuActions[var5] != null) {
							short var6 = 0;
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class340.localPlayer.combatLevel) {
									var6 = 2000;
								}

								if (class340.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class340.localPlayer.team) {
										var6 = 2000;
									} else {
										var6 = 0;
									}
								} else if (AttackOption.field1234 == Client.playerAttackOption && var0.isClanMember()) {
									var6 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var5]) {
								var6 = 2000;
							}

							boolean var7 = false;
							int var8 = Client.playerMenuOpcodes[var5] + var6;
							class11.insertMenuItemNoShift(Client.playerMenuActions[var5], UserComparator5.colorStartTag(16777215) + var4, var8, var1, var2, var3);
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
					if (Client.menuOpcodes[var5] == 23) {
						Client.menuTargets[var5] = UserComparator5.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
