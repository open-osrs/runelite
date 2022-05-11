import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static StudioGame field473;
	@ObfuscatedName("fw")
	static String field471;

	ApproximateRouteStrategy() {
	} // L: 12776

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIILgh;I)Z",
		garbageValue = "-425355466"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12780
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lki;",
		garbageValue = "-103"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class92.getWidget(var0); // L: 239
		if (var1 == -1) { // L: 240
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 241 242
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-630623402"
	)
	public static void method1110() {
		class273.midiPcmStream.clear(); // L: 42
		class273.musicPlayerStatus = 1; // L: 43
		ClanChannelMember.musicTrackArchive = null; // L: 44
	} // L: 45

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcq;",
		garbageValue = "768338863"
	)
	static AttackOption[] method1108() {
		return new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.field1285, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1283, AttackOption.AttackOption_dependsOnCombatLevels}; // L: 12729
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lca;IIII)V",
		garbageValue = "611280226"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (ModelData0.localPlayer != var0) { // L: 10138
			if (Client.menuOptionsCount < 400) { // L: 10139
				String var4;
				if (var0.skillLevel == 0) { // L: 10141
					var4 = var0.actions[0] + var0.username + var0.actions[1] + IgnoreList.method6430(var0.combatLevel, ModelData0.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10142
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 10143
					Projectile.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class166.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10144
				} else if (Client.isSpellSelected) { // L: 10147
					if ((class113.selectedSpellFlags & 8) == 8) { // L: 10148
						Projectile.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class166.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10149
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 10154
						if (Client.playerMenuActions[var5] != null) { // L: 10155
							short var6 = 0; // L: 10156
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 10157
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10158
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > ModelData0.localPlayer.combatLevel) { // L: 10159
									var6 = 2000; // L: 10160
								}

								if (ModelData0.localPlayer.team != 0 && var0.team != 0) { // L: 10162
									if (var0.team == ModelData0.localPlayer.team) { // L: 10163
										var6 = 2000;
									} else {
										var6 = 0; // L: 10164
									}
								} else if (AttackOption.field1283 == Client.playerAttackOption && var0.isClanMember()) { // L: 10166
									var6 = 2000; // L: 10167
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 10170
								var6 = 2000;
							}

							boolean var7 = false; // L: 10171
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 10172
							Projectile.insertMenuItemNoShift(Client.playerMenuActions[var5], class166.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 10173
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 10178
					if (Client.menuOpcodes[var5] == 23) { // L: 10179
						Client.menuTargets[var5] = class166.colorStartTag(16777215) + var4; // L: 10180
						break;
					}
				}

			}
		}
	} // L: 10184
}
