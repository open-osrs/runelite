import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 574495061
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("f")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("j")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = World.getPreferencesFile("", class392.field4267.name, true);
			Buffer var1 = WorldMapDecorationType.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-15"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class262.fontPlain12.lineWidth(var0, 250);
			int var6 = class262.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215);
			class262.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var5 + var2;
			int var10 = var6 + var2 + var2;

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
					Client.field710[var11] = true;
				}
			}

			if (var1) {
				class244.rasterProvider.drawFull(0, 0);
			} else {
				class112.method2468(var3, var4, var5, var6);
			}

		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lci;IIIB)V",
		garbageValue = "-1"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class67.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = class67.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = FloorUnderlayDefinition.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = FloorUnderlayDefinition.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = FloorUnderlayDefinition.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = FloorUnderlayDefinition.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = FloorUnderlayDefinition.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = FloorUnderlayDefinition.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = FloorUnderlayDefinition.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = FloorUnderlayDefinition.colorStartTag(12648192);
					} else {
						var6 = FloorUnderlayDefinition.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					GameBuild.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((ObjectComposition.selectedSpellFlags & 8) == 8) {
						GameBuild.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FloorUnderlayDefinition.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class67.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (class67.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class67.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1237 && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							GameBuild.insertMenuItemNoShift(Client.playerMenuActions[var10], FloorUnderlayDefinition.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = FloorUnderlayDefinition.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
