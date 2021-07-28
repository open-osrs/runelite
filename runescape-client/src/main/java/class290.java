import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class290 {
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 137338765
	)
	@Export("currentPort")
	static int currentPort;

	static {
		new HashMap();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljy;III)Z",
		garbageValue = "-382888164"
	)
	static boolean method5208(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			Occluder.SpriteBuffer_decode(var3);
			return true;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lej;IIII)V",
		garbageValue = "-492352904"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) {
			if (var0.transforms != null) {
				var0 = var0.transform();
			}

			if (var0 != null) {
				if (var0.isInteractable) {
					if (!var0.isFollower || Client.followerIndex == var1) {
						String var4 = var0.name;
						int var7;
						int var8;
						if (var0.combatLevel != 0) {
							var7 = var0.combatLevel;
							var8 = MouseHandler.localPlayer.combatLevel;
							int var9 = var8 - var7;
							String var6;
							if (var9 < -9) {
								var6 = ScriptFrame.colorStartTag(16711680);
							} else if (var9 < -6) {
								var6 = ScriptFrame.colorStartTag(16723968);
							} else if (var9 < -3) {
								var6 = ScriptFrame.colorStartTag(16740352);
							} else if (var9 < 0) {
								var6 = ScriptFrame.colorStartTag(16756736);
							} else if (var9 > 9) {
								var6 = ScriptFrame.colorStartTag(65280);
							} else if (var9 > 6) {
								var6 = ScriptFrame.colorStartTag(4259584);
							} else if (var9 > 3) {
								var6 = ScriptFrame.colorStartTag(8453888);
							} else if (var9 > 0) {
								var6 = ScriptFrame.colorStartTag(12648192);
							} else {
								var6 = ScriptFrame.colorStartTag(16776960);
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")";
						}

						if (var0.isFollower && Client.followerOpsLowPriority) {
							class7.insertMenuItemNoShift("Examine", ScriptFrame.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							class7.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ScriptFrame.colorStartTag(16776960) + var4, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((ViewportMouse.selectedSpellFlags & 2) == 2) {
								class7.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ScriptFrame.colorStartTag(16776960) + var4, 8, var1, var2, var3);
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var11 = var0.actions;
							if (var11 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) {
										var8 = 0;
										if (var7 == 0) {
											var8 = var10 + 9;
										}

										if (var7 == 1) {
											var8 = var10 + 10;
										}

										if (var7 == 2) {
											var8 = var10 + 11;
										}

										if (var7 == 3) {
											var8 = var10 + 12;
										}

										if (var7 == 4) {
											var8 = var10 + 13;
										}

										class7.insertMenuItemNoShift(var11[var7], ScriptFrame.colorStartTag(16776960) + var4, var8, var1, var2, var3);
									}
								}
							}

							if (var11 != null) {
								for (var7 = 4; var7 >= 0; --var7) {
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > MouseHandler.localPlayer.combatLevel) {
												var12 = 2000;
											}

											var8 = 0;
											if (var7 == 0) {
												var8 = var12 + 9;
											}

											if (var7 == 1) {
												var8 = var12 + 10;
											}

											if (var7 == 2) {
												var8 = var12 + 11;
											}

											if (var7 == 3) {
												var8 = var12 + 12;
											}

											if (var7 == 4) {
												var8 = var12 + 13;
											}

											class7.insertMenuItemNoShift(var11[var7], ScriptFrame.colorStartTag(16776960) + var4, var8, var1, var2, var3);
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) {
								class7.insertMenuItemNoShift("Examine", ScriptFrame.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
