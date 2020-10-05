import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1332454231
	)
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -955851785
	)
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "1437653896"
	)
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 == 0) { // L: 35
				return; // L: 38
			}

			this.decodeNext(var1, var2); // L: 36
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;IS)V",
		garbageValue = "24454"
	)
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lbf;ZI)V",
		garbageValue = "-1746985052"
	)
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4260
			var0.isUnanimated = false; // L: 4261
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4262 4263
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4265
			int var3 = var0.y >> 7; // L: 4266
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4267
				long var4 = class227.calculateTag(0, 0, 0, false, var0.index); // L: 4268
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4269
					var0.isUnanimated = false; // L: 4270
					var0.tileHeight = ArchiveLoader.getTileHeight(var0.x, var0.y, Huffman.Client_plane); // L: 4271
					var0.playerCycle = Client.cycle; // L: 4272
					ScriptEvent.scene.addNullableObject(Huffman.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field649, var0.field635, var0.field651, var0.field643); // L: 4273
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4276
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4277
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4278
					}

					var0.tileHeight = ArchiveLoader.getTileHeight(var0.x, var0.y, Huffman.Client_plane); // L: 4280
					var0.playerCycle = Client.cycle; // L: 4281
					ScriptEvent.scene.drawEntity(Huffman.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4282
				}
			}
		}

	} // L: 4286

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lbf;IIII)V",
		garbageValue = "-1811983965"
	)
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (WorldMapLabelSize.localPlayer != var0) { // L: 8564
			if (Client.menuOptionsCount < 400) { // L: 8565
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 8567
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 8568
					var7 = var0.combatLevel; // L: 8570
					int var8 = WorldMapLabelSize.localPlayer.combatLevel; // L: 8571
					int var9 = var8 - var7; // L: 8573
					String var6;
					if (var9 < -9) { // L: 8574
						var6 = WorldMapAreaData.colorStartTag(16711680); // L: 8575
					} else if (var9 < -6) { // L: 8578
						var6 = WorldMapAreaData.colorStartTag(16723968); // L: 8579
					} else if (var9 < -3) { // L: 8582
						var6 = WorldMapAreaData.colorStartTag(16740352); // L: 8583
					} else if (var9 < 0) { // L: 8586
						var6 = WorldMapAreaData.colorStartTag(16756736); // L: 8587
					} else if (var9 > 9) { // L: 8590
						var6 = WorldMapAreaData.colorStartTag(65280); // L: 8591
					} else if (var9 > 6) { // L: 8594
						var6 = WorldMapAreaData.colorStartTag(4259584); // L: 8595
					} else if (var9 > 3) { // L: 8598
						var6 = WorldMapAreaData.colorStartTag(8453888); // L: 8599
					} else if (var9 > 0) { // L: 8602
						var6 = WorldMapAreaData.colorStartTag(12648192); // L: 8603
					} else {
						var6 = WorldMapAreaData.colorStartTag(16776960); // L: 8606
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 8608
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 8610
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 8611
					StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 8612
				} else if (Client.isSpellSelected) { // L: 8615
					if ((UserComparator8.selectedSpellFlags & 8) == 8) { // L: 8616
						StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 8617
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 8622
						if (Client.playerMenuActions[var10] != null) { // L: 8623
							short var11 = 0; // L: 8624
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 8625
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 8626
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > WorldMapLabelSize.localPlayer.combatLevel) { // L: 8627
									var11 = 2000; // L: 8628
								}

								if (WorldMapLabelSize.localPlayer.team != 0 && var0.team != 0) { // L: 8630
									if (var0.team == WorldMapLabelSize.localPlayer.team) { // L: 8631
										var11 = 2000;
									} else {
										var11 = 0; // L: 8632
									}
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 8635
								var11 = 2000;
							}

							boolean var12 = false; // L: 8636
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 8637
							StructDefinition.insertMenuItemNoShift(Client.playerMenuActions[var10], WorldMapAreaData.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 8638
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 8643
					if (Client.menuOpcodes[var10] == 23) { // L: 8644
						Client.menuTargets[var10] = WorldMapAreaData.colorStartTag(16777215) + var4; // L: 8645
						break;
					}
				}

			}
		}
	} // L: 8649
}
