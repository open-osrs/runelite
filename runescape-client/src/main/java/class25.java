import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class25 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIII)V",
		garbageValue = "456036327"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPCDefinition var0, int var1, int var2, int var3) {
		if (Client.menuOptionsCount < 400) { // L: 9127
			if (var0.transforms != null) { // L: 9128
				var0 = var0.transform();
			}

			if (var0 != null) { // L: 9129
				if (var0.isInteractable) { // L: 9130
					if (!var0.isFollower || Client.followerIndex == var1) { // L: 9131
						String var4 = var0.name; // L: 9132
						int var7;
						int var8;
						if (var0.combatLevel != 0) { // L: 9133
							var7 = var0.combatLevel; // L: 9136
							var8 = PlayerType.localPlayer.combatLevel; // L: 9137
							int var9 = var8 - var7; // L: 9139
							String var6;
							if (var9 < -9) { // L: 9140
								var6 = Client.colorStartTag(16711680); // L: 9141
							} else if (var9 < -6) { // L: 9144
								var6 = Client.colorStartTag(16723968); // L: 9145
							} else if (var9 < -3) { // L: 9148
								var6 = Client.colorStartTag(16740352); // L: 9149
							} else if (var9 < 0) { // L: 9152
								var6 = Client.colorStartTag(16756736); // L: 9153
							} else if (var9 > 9) { // L: 9156
								var6 = Client.colorStartTag(65280); // L: 9157
							} else if (var9 > 6) { // L: 9160
								var6 = Client.colorStartTag(4259584); // L: 9161
							} else if (var9 > 3) { // L: 9164
								var6 = Client.colorStartTag(8453888); // L: 9165
							} else if (var9 > 0) { // L: 9168
								var6 = Client.colorStartTag(12648192); // L: 9169
							} else {
								var6 = Client.colorStartTag(16776960); // L: 9172
							}

							var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")"; // L: 9174
						}

						if (var0.isFollower && Client.followerOpsLowPriority) { // L: 9176
							ModelData0.insertMenuItemNoShift("Examine", Client.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9177
						}

						if (Client.isItemSelected == 1) { // L: 9180
							ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Client.colorStartTag(16776960) + var4, 7, var1, var2, var3); // L: 9181
						} else if (Client.isSpellSelected) { // L: 9184
							if ((class105.selectedSpellFlags & 2) == 2) { // L: 9185
								ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(16776960) + var4, 8, var1, var2, var3); // L: 9186
							}
						} else {
							int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0; // L: 9191
							String[] var11 = var0.actions; // L: 9192
							if (var11 != null) { // L: 9193
								for (var7 = 4; var7 >= 0; --var7) { // L: 9194
									if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) { // L: 9195
										var8 = 0; // L: 9196
										if (var7 == 0) { // L: 9197
											var8 = var10 + 9;
										}

										if (var7 == 1) { // L: 9198
											var8 = var10 + 10;
										}

										if (var7 == 2) { // L: 9199
											var8 = var10 + 11;
										}

										if (var7 == 3) { // L: 9200
											var8 = var10 + 12;
										}

										if (var7 == 4) { // L: 9201
											var8 = var10 + 13;
										}

										ModelData0.insertMenuItemNoShift(var11[var7], Client.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9202
									}
								}
							}

							if (var11 != null) { // L: 9207
								for (var7 = 4; var7 >= 0; --var7) { // L: 9208
									if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) { // L: 9209
										short var12 = 0; // L: 9210
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) { // L: 9211
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > PlayerType.localPlayer.combatLevel) { // L: 9212
												var12 = 2000; // L: 9213
											}

											var8 = 0; // L: 9215
											if (var7 == 0) { // L: 9216
												var8 = var12 + 9;
											}

											if (var7 == 1) { // L: 9217
												var8 = var12 + 10;
											}

											if (var7 == 2) { // L: 9218
												var8 = var12 + 11;
											}

											if (var7 == 3) { // L: 9219
												var8 = var12 + 12;
											}

											if (var7 == 4) { // L: 9220
												var8 = var12 + 13;
											}

											ModelData0.insertMenuItemNoShift(var11[var7], Client.colorStartTag(16776960) + var4, var8, var1, var2, var3); // L: 9221
										}
									}
								}
							}

							if (!var0.isFollower || !Client.followerOpsLowPriority) { // L: 9226
								ModelData0.insertMenuItemNoShift("Examine", Client.colorStartTag(16776960) + var4, 1003, var1, var2, var3); // L: 9227
							}
						}

					}
				}
			}
		}
	} // L: 9231

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "([Lht;IB)V",
		garbageValue = "-44"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10814
			Widget var3 = var0[var2]; // L: 10815
			if (var3 != null) { // L: 10816
				if (var3.type == 0) { // L: 10817
					if (var3.children != null) { // L: 10818
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10819
					if (var4 != null) { // L: 10820
						WorldMapAreaData.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 10822
					var5 = new ScriptEvent(); // L: 10823
					var5.widget = var3; // L: 10824
					var5.args = var3.onDialogAbort; // L: 10825
					Entity.runScriptEvent(var5); // L: 10826
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 10828
					if (var3.childIndex >= 0) { // L: 10829
						Widget var6 = UserComparator4.getWidget(var3.id); // L: 10830
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 10831
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 10835
					var5.widget = var3; // L: 10836
					var5.args = var3.onSubChange; // L: 10837
					Entity.runScriptEvent(var5); // L: 10838
				}
			}
		}

	} // L: 10841
}
