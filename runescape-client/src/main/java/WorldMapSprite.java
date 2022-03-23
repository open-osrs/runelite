import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("o")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "373946087"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1898905069"
	)
	public static final synchronized long method4989() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class269.field3153) { // L: 15
			class269.field3154 += class269.field3153 - var0; // L: 16
		}

		class269.field3153 = var0; // L: 18
		return var0 + class269.field3154; // L: 19
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lcw;IIIB)V",
		garbageValue = "-125"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class19.localPlayer != var0) { // L: 9499
			if (Client.menuOptionsCount < 400) { // L: 9500
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9502
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9503
					var7 = var0.combatLevel; // L: 9505
					int var8 = class19.localPlayer.combatLevel; // L: 9506
					int var9 = var8 - var7; // L: 9508
					String var6;
					if (var9 < -9) { // L: 9509
						var6 = ChatChannel.colorStartTag(16711680); // L: 9510
					} else if (var9 < -6) { // L: 9513
						var6 = ChatChannel.colorStartTag(16723968); // L: 9514
					} else if (var9 < -3) { // L: 9517
						var6 = ChatChannel.colorStartTag(16740352); // L: 9518
					} else if (var9 < 0) { // L: 9521
						var6 = ChatChannel.colorStartTag(16756736); // L: 9522
					} else if (var9 > 9) { // L: 9525
						var6 = ChatChannel.colorStartTag(65280); // L: 9526
					} else if (var9 > 6) { // L: 9529
						var6 = ChatChannel.colorStartTag(4259584); // L: 9530
					} else if (var9 > 3) { // L: 9533
						var6 = ChatChannel.colorStartTag(8453888); // L: 9534
					} else if (var9 > 0) { // L: 9537
						var6 = ChatChannel.colorStartTag(12648192); // L: 9538
					} else {
						var6 = ChatChannel.colorStartTag(16776960); // L: 9541
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9543
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9545
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9546
					SecureRandomFuture.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ChatChannel.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9547
				} else if (Client.isSpellSelected) { // L: 9550
					if ((class154.selectedSpellFlags & 8) == 8) { // L: 9551
						SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ChatChannel.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9552
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9557
						if (Client.playerMenuActions[var10] != null) { // L: 9558
							short var11 = 0; // L: 9559
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9560
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9561
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class19.localPlayer.combatLevel) { // L: 9562
									var11 = 2000; // L: 9563
								}

								if (class19.localPlayer.team != 0 && var0.team != 0) { // L: 9565
									if (var0.team == class19.localPlayer.team) { // L: 9566
										var11 = 2000;
									} else {
										var11 = 0; // L: 9567
									}
								} else if (Client.playerAttackOption == AttackOption.field1279 && var0.isClanMember()) { // L: 9569
									var11 = 2000; // L: 9570
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9573
								var11 = 2000;
							}

							boolean var12 = false; // L: 9574
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9575
							SecureRandomFuture.insertMenuItemNoShift(Client.playerMenuActions[var10], ChatChannel.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9576
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9581
					if (Client.menuOpcodes[var10] == 23) { // L: 9582
						Client.menuTargets[var10] = ChatChannel.colorStartTag(16777215) + var4; // L: 9583
						break;
					}
				}

			}
		}
	} // L: 9587
}
