import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = 1229054001
	)
	static int field102;
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -927718985
	)
	static int field103;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lx;Lx;B)I",
		garbageValue = "57"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lbk;IIII)V",
		garbageValue = "1420045659"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (UserComparator9.localPlayer != var0) { // L: 9293
			if (Client.menuOptionsCount < 400) { // L: 9294
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9296
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9297
					var7 = var0.combatLevel; // L: 9299
					int var8 = UserComparator9.localPlayer.combatLevel; // L: 9300
					int var9 = var8 - var7; // L: 9302
					String var6;
					if (var9 < -9) { // L: 9303
						var6 = FileSystem.colorStartTag(16711680); // L: 9304
					} else if (var9 < -6) { // L: 9307
						var6 = FileSystem.colorStartTag(16723968); // L: 9308
					} else if (var9 < -3) { // L: 9311
						var6 = FileSystem.colorStartTag(16740352); // L: 9312
					} else if (var9 < 0) { // L: 9315
						var6 = FileSystem.colorStartTag(16756736); // L: 9316
					} else if (var9 > 9) { // L: 9319
						var6 = FileSystem.colorStartTag(65280); // L: 9320
					} else if (var9 > 6) { // L: 9323
						var6 = FileSystem.colorStartTag(4259584); // L: 9324
					} else if (var9 > 3) { // L: 9327
						var6 = FileSystem.colorStartTag(8453888); // L: 9328
					} else if (var9 > 0) { // L: 9331
						var6 = FileSystem.colorStartTag(12648192); // L: 9332
					} else {
						var6 = FileSystem.colorStartTag(16776960); // L: 9335
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9337
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9339
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9340
					WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9341
				} else if (Client.isSpellSelected) { // L: 9344
					if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 8) == 8) { // L: 9345
						WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9346
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9351
						if (Client.playerMenuActions[var10] != null) { // L: 9352
							short var11 = 0; // L: 9353
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9354
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 9355
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > UserComparator9.localPlayer.combatLevel) { // L: 9356
									var11 = 2000; // L: 9357
								}

								if (UserComparator9.localPlayer.team != 0 && var0.team != 0) { // L: 9359
									if (var0.team == UserComparator9.localPlayer.team) { // L: 9360
										var11 = 2000;
									} else {
										var11 = 0; // L: 9361
									}
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9364
								var11 = 2000;
							}

							boolean var12 = false; // L: 9365
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9366
							WorldMapManager.insertMenuItemNoShift(Client.playerMenuActions[var10], FileSystem.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9367
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9372
					if (Client.menuOpcodes[var10] == 23) { // L: 9373
						Client.menuTargets[var10] = FileSystem.colorStartTag(16777215) + var4; // L: 9374
						break;
					}
				}

			}
		}
	} // L: 9378
}
