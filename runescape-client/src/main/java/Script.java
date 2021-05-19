import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("qn")
	static boolean field1055;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("i")
	public static short[] field1064;
	@ObfuscatedName("d")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("c")
	String field1054;
	@ObfuscatedName("o")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("g")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("l")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1945602351
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2083195621
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1877567613
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1752633221
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lmo;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lmo;",
		garbageValue = "-56"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 154
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-55"
	)
	static int method2026() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1937
			int var0 = 0; // L: 1938

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1939
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1940
			}

			return var0 * 10000 / Client.field893; // L: 1942
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Ley;IIII)V",
		garbageValue = "-1875812955"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) { // L: 9290
			if (var0.transforms != null) { // L: 9291
				var0 = var0.transform();
			}

			if (var0 != null) { // L: 9292
				if (var0.isInteractable) { // L: 9293
					if (!var0.isFollower || Client.followerIndex == var1) { // L: 9294
						String var4 = var0.name; // L: 9295
						int var7;
						int var8;
						if (var0.combatLevel != 0) { // L: 9296
							var7 = var0.combatLevel; // L: 9299
							var8 = class35.localPlayer.combatLevel; // L: 9300
							int var9 = var8 - var7; // L: 9302
							String var6;
							if (var9 < -9) { // L: 9303
								var6 = HorizontalAlignment.colorStartTag(16711680); // L: 9304
							} else if (var9 < -6) { // L: 9307
								var6 = HorizontalAlignment.colorStartTag(16723968); // L: 9308
							} else if (var9 < -3) { // L: 9311
								var6 = HorizontalAlignment.colorStartTag(16740352); // L: 9312
							} else if (var9 < 0) { // L: 9315
								var6 = HorizontalAlignment.colorStartTag(16756736); // L: 9316
							} else if (var9 > 9) { // L: 9319
								var6 = HorizontalAlignment.colorStartTag(65280); // L: 9320
							} else if (var9 > 6) { // L: 9323
								var6 = HorizontalAlignment.colorStartTag(4259584); // L: 9324
							} else if (var9 > 3) { // L: 9327
								var6 = HorizontalAlignment.colorStartTag(8453888); // L: 9328
							} else if (var9 > 0) { // L: 9331
								var6 = HorizontalAlignment.colorStartTag(12648192); // L: 9332
							} else {
								var6 = HorizontalAlignment.colorStartTag(16776960); // L: 9335
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")"; // L: 9337
						}

						if (var0.isFollower && Client.followerOpsLowPriority) { // L: 9339
							InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9340
						}

						if (Client.isItemSelected == 1) { // L: 9343
							InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16776960) + var4, 7, var1, var2, var3); // L: 9344
						} else if (Client.isSpellSelected) { // L: 9347
							if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 2) == 2) { // L: 9348
								InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16776960) + var4, 8, var1, var2, var3); // L: 9349
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9354
							String[] var11 = var0.actions; // L: 9355
							if (var11 != null) { // L: 9356
								for (var7 = 4; var7 >= 0; --var7) { // L: 9357
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) { // L: 9358
										var8 = 0; // L: 9359
										if (var7 == 0) { // L: 9360
											var8 = var10 + 9;
										}

										if (var7 == 1) { // L: 9361
											var8 = var10 + 10;
										}

										if (var7 == 2) { // L: 9362
											var8 = var10 + 11;
										}

										if (var7 == 3) { // L: 9363
											var8 = var10 + 12;
										}

										if (var7 == 4) { // L: 9364
											var8 = var10 + 13;
										}

										InterfaceParent.insertMenuItemNoShift(var11[var7], HorizontalAlignment.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9365
									}
								}
							}

							if (var11 != null) { // L: 9370
								for (var7 = 4; var7 >= 0; --var7) { // L: 9371
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) { // L: 9372
										short var12 = 0; // L: 9373
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) { // L: 9374
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > class35.localPlayer.combatLevel) { // L: 9375
												var12 = 2000; // L: 9376
											}

											var8 = 0; // L: 9378
											if (var7 == 0) { // L: 9379
												var8 = var12 + 9;
											}

											if (var7 == 1) { // L: 9380
												var8 = var12 + 10;
											}

											if (var7 == 2) { // L: 9381
												var8 = var12 + 11;
											}

											if (var7 == 3) { // L: 9382
												var8 = var12 + 12;
											}

											if (var7 == 4) { // L: 9383
												var8 = var12 + 13;
											}

											InterfaceParent.insertMenuItemNoShift(var11[var7], HorizontalAlignment.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9384
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) { // L: 9389
								InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9390
							}
						}

					}
				}
			}
		}
	} // L: 9394

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1736303231"
	)
	static void method2014() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11083
			int var1 = var0.group; // L: 11084
			if (UserComparator8.loadInterface(var1)) { // L: 11085
				boolean var2 = true; // L: 11086
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 11087

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11088
					if (var3[var4] != null) { // L: 11089
						var2 = var3[var4].isIf3; // L: 11090
						break;
					}
				}

				if (!var2) { // L: 11094
					var4 = (int)var0.key; // L: 11095
					Widget var5 = DevicePcmPlayerProvider.getWidget(var4); // L: 11096
					if (var5 != null) { // L: 11097
						VerticalAlignment.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11101
}
