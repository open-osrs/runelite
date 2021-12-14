import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ar")
	protected static String field3882;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;B)I",
		garbageValue = "75"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lcr;IIII)V",
		garbageValue = "1259918287"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition;
		if (Client.menuOptionsCount < 400) {
			if (var4.transforms != null) {
				var4 = var4.transform();
			}

			if (var4 != null) {
				if (var4.isInteractable) {
					if (!var4.isFollower || Client.followerIndex == var1) {
						String var5 = var4.name;
						int var6;
						if (var4.combatLevel != 0 && var0.field1119 != 0) {
							var6 = var0.field1119 != -1 ? var0.field1119 * 658677507 * 787891115 : var4.combatLevel * -73157727 * -2058162079;
							var5 = var5 + Tiles.method2108(var6, class340.localPlayer.combatLevel) + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							class11.insertMenuItemNoShift("Examine", UserComparator5.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((class91.selectedSpellFlags & 2) == 2) {
								class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var8;
							int var9;
							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var7[var8] != null && !var7[var8].equalsIgnoreCase("Attack")) {
										var9 = 0;
										if (var8 == 0) {
											var9 = var6 + 9;
										}

										if (var8 == 1) {
											var9 = var6 + 10;
										}

										if (var8 == 2) {
											var9 = var6 + 11;
										}

										if (var8 == 3) {
											var9 = var6 + 12;
										}

										if (var8 == 4) {
											var9 = var6 + 13;
										}

										class11.insertMenuItemNoShift(var7[var8], UserComparator5.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var8 = 4; var8 >= 0; --var8) {
									if (var7[var8] != null && var7[var8].equalsIgnoreCase("Attack")) {
										short var10 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class340.localPlayer.combatLevel) {
												var10 = 2000;
											}

											var9 = 0;
											if (var8 == 0) {
												var9 = var10 + 9;
											}

											if (var8 == 1) {
												var9 = var10 + 10;
											}

											if (var8 == 2) {
												var9 = var10 + 11;
											}

											if (var8 == 3) {
												var9 = var10 + 12;
											}

											if (var8 == 4) {
												var9 = var10 + 13;
											}

											class11.insertMenuItemNoShift(var7[var8], UserComparator5.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								class11.insertMenuItemNoShift("Examine", UserComparator5.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
