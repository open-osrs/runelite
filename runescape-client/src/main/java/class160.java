import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class160 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	public UrlRequest field1772;
	@ObfuscatedName("v")
	public float[] field1770;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1770 = new float[4]; // L: 326
	} // L: 328

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "112467614"
	)
	public static int[] method3285() {
		int[] var0 = new int[KeyHandler.field146]; // L: 265

		for (int var1 = 0; var1 < KeyHandler.field146; ++var1) { // L: 266
			var0[var1] = KeyHandler.field142[var1]; // L: 267
		}

		return var0; // L: 269
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lco;IIIB)V",
		garbageValue = "9"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition; // L: 9879
		if (Client.menuOptionsCount < 400) { // L: 9880
			if (var4.transforms != null) { // L: 9881
				var4 = var4.transform();
			}

			if (var4 != null) { // L: 9882
				if (var4.isInteractable) { // L: 9883
					if (!var4.isFollower || Client.followerIndex == var1) { // L: 9884
						String var5 = var0.method2360(); // L: 9885
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1204 != 0) { // L: 9886
							var6 = var0.field1204 != -1 ? var0.field1204 * -1036005949 * 71404267 : var4.combatLevel * -1544891593 * 471159431; // L: 9887
							var9 = class101.localPlayer.combatLevel; // L: 9890
							int var10 = var9 - var6; // L: 9892
							String var8;
							if (var10 < -9) { // L: 9893
								var8 = class122.colorStartTag(16711680); // L: 9894
							} else if (var10 < -6) { // L: 9897
								var8 = class122.colorStartTag(16723968); // L: 9898
							} else if (var10 < -3) { // L: 9901
								var8 = class122.colorStartTag(16740352); // L: 9902
							} else if (var10 < 0) { // L: 9905
								var8 = class122.colorStartTag(16756736); // L: 9906
							} else if (var10 > 9) { // L: 9909
								var8 = class122.colorStartTag(65280); // L: 9910
							} else if (var10 > 6) { // L: 9913
								var8 = class122.colorStartTag(4259584); // L: 9914
							} else if (var10 > 3) { // L: 9917
								var8 = class122.colorStartTag(8453888); // L: 9918
							} else if (var10 > 0) { // L: 9921
								var8 = class122.colorStartTag(12648192); // L: 9922
							} else {
								var8 = class122.colorStartTag(16776960); // L: 9925
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")"; // L: 9927
						}

						if (var4.isFollower && Client.followerOpsLowPriority) { // L: 9929
							class4.insertMenuItemNoShift("Examine", class122.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9930
						}

						if (Client.isItemSelected == 1) { // L: 9933
							class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(16776960) + var5, 7, var1, var2, var3); // L: 9934
						} else if (Client.isSpellSelected) { // L: 9937
							if ((HealthBar.selectedSpellFlags & 2) == 2) { // L: 9938
								class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(16776960) + var5, 8, var1, var2, var3); // L: 9939
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9944
							String[] var7 = var4.actions; // L: 9945
							int var11;
							if (var7 != null) { // L: 9946
								for (var11 = 4; var11 >= 0; --var11) { // L: 9947
									if (var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) { // L: 9948
										var9 = 0; // L: 9949
										if (var11 == 0) { // L: 9950
											var9 = var6 + 9;
										}

										if (var11 == 1) { // L: 9951
											var9 = var6 + 10;
										}

										if (var11 == 2) { // L: 9952
											var9 = var6 + 11;
										}

										if (var11 == 3) { // L: 9953
											var9 = var6 + 12;
										}

										if (var11 == 4) { // L: 9954
											var9 = var6 + 13;
										}

										class4.insertMenuItemNoShift(var7[var11], class122.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9955
									}
								}
							}

							if (var7 != null) { // L: 9960
								for (var11 = 4; var11 >= 0; --var11) { // L: 9961
									if (var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) { // L: 9962
										short var12 = 0; // L: 9963
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 9964
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class101.localPlayer.combatLevel) { // L: 9965
												var12 = 2000; // L: 9966
											}

											var9 = 0; // L: 9968
											if (var11 == 0) { // L: 9969
												var9 = var12 + 9;
											}

											if (var11 == 1) { // L: 9970
												var9 = var12 + 10;
											}

											if (var11 == 2) { // L: 9971
												var9 = var12 + 11;
											}

											if (var11 == 3) { // L: 9972
												var9 = var12 + 12;
											}

											if (var11 == 4) { // L: 9973
												var9 = var12 + 13;
											}

											class4.insertMenuItemNoShift(var7[var11], class122.colorStartTag(16776960) + var5, var9, var1, var2, var3); // L: 9974
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) { // L: 9979
								class4.insertMenuItemNoShift("Examine", class122.colorStartTag(16776960) + var5, 1003, var1, var2, var3); // L: 9980
							}
						}

					}
				}
			}
		}
	} // L: 9984
}
