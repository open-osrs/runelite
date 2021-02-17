import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -449980577
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1553227533"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "127"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.size = var1.readUnsignedShort();
		}

	} // L: 37

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgs;",
		garbageValue = "-1827555647"
	)
	public static class194[] method4371() {
		return new class194[]{class194.field2348, class194.field2342, class194.field2344, class194.field2350, class194.field2346, class194.field2345, class194.field2343, class194.field2349, class194.field2347, class194.field2351}; // L: 17
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-982024968"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 8561
			WorldMapRegion.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 8562
		}

		long var4 = -1L; // L: 8565
		long var6 = -1L; // L: 8566
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 8571
			if (var8 >= var10) { // L: 8573
				if (var4 != -1L) { // L: 8706
					var8 = ClientPacket.method3671(var4); // L: 8707
					int var9 = (int)(var4 >>> 7 & 127L); // L: 8710
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 8713
					FloorDecoration.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 8714
				}

				return; // L: 8716
			}

			long var27 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 8576
			if (var27 != var6) { // L: 8579
				label336: {
					var6 = var27; // L: 8580
					int var15 = LoginScreenAnimation.method1904(var8); // L: 8581
					int var16 = Tiles.method1170(var8); // L: 8582
					int var17 = Widget.Entity_unpackSceneX(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 8585
					int var19 = Occluder.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 8590
					int var20 = var19; // L: 8592
					if (var17 == 2 && ArchiveLoader.scene.getObjectFlags(GameObject.Client_plane, var15, var16, var27) >= 0) { // L: 8593 8594
						ObjectComposition var21 = WorldMapDecoration.getObjectDefinition(var19); // L: 8595
						if (var21.transforms != null) { // L: 8596
							var21 = var21.transform();
						}

						if (var21 == null) { // L: 8597
							break label336;
						}

						if (Client.isItemSelected == 1) { // L: 8598
							WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(65535) + var21.name, 1, var19, var15, var16); // L: 8599
						} else if (Client.isSpellSelected) { // L: 8602
							if ((Player.selectedSpellFlags & 4) == 4) { // L: 8603
								WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(65535) + var21.name, 2, var19, var15, var16); // L: 8604
							}
						} else {
							String[] var22 = var21.actions; // L: 8609
							if (var22 != null) { // L: 8610
								for (int var23 = 4; var23 >= 0; --var23) { // L: 8611
									if (var22[var23] != null) { // L: 8612
										short var24 = 0; // L: 8613
										if (var23 == 0) { // L: 8614
											var24 = 3;
										}

										if (var23 == 1) { // L: 8615
											var24 = 4;
										}

										if (var23 == 2) { // L: 8616
											var24 = 5;
										}

										if (var23 == 3) { // L: 8617
											var24 = 6;
										}

										if (var23 == 4) { // L: 8618
											var24 = 1001;
										}

										WorldMapRegion.insertMenuItemNoShift(var22[var23], class23.colorStartTag(65535) + var21.name, var24, var20, var15, var16); // L: 8619
									}
								}
							}

							WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(65535) + var21.name, 1002, var21.id, var15, var16); // L: 8624
						}
					}

					Player var25;
					int var29;
					NPC var30;
					int var37;
					int[] var38;
					if (var17 == 1) { // L: 8629
						NPC var33 = Client.npcs[var20]; // L: 8630
						if (var33 == null) { // L: 8631
							break label336;
						}

						if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 8632
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 8633
								var30 = Client.npcs[Client.npcIndices[var29]]; // L: 8634
								if (var30 != null && var30 != var33 && var30.definition.size == 1 && var33.x == var30.x && var33.y == var30.y) { // L: 8635
									TileItem.addNpcToMenu(var30.definition, Client.npcIndices[var29], var15, var16);
								}
							}

							var29 = Players.Players_count; // L: 8637
							var38 = Players.Players_indices; // L: 8638

							for (var37 = 0; var37 < var29; ++var37) { // L: 8639
								var25 = Client.players[var38[var37]]; // L: 8640
								if (var25 != null && var33.x == var25.x && var25.y == var33.y) { // L: 8641
									FloorDecoration.addPlayerToMenu(var25, var38[var37], var15, var16);
								}
							}
						}

						TileItem.addNpcToMenu(var33.definition, var20, var15, var16); // L: 8644
					}

					if (var17 == 0) { // L: 8646
						Player var34 = Client.players[var20]; // L: 8647
						if (var34 == null) { // L: 8648
							break label336;
						}

						if ((var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 8649
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 8650
								var30 = Client.npcs[Client.npcIndices[var29]]; // L: 8651
								if (var30 != null && var30.definition.size == 1 && var30.x == var34.x && var34.y == var30.y) { // L: 8652
									TileItem.addNpcToMenu(var30.definition, Client.npcIndices[var29], var15, var16);
								}
							}

							var29 = Players.Players_count; // L: 8654
							var38 = Players.Players_indices; // L: 8655

							for (var37 = 0; var37 < var29; ++var37) { // L: 8656
								var25 = Client.players[var38[var37]]; // L: 8657
								if (var25 != null && var34 != var25 && var34.x == var25.x && var34.y == var25.y) { // L: 8658
									FloorDecoration.addPlayerToMenu(var25, var38[var37], var15, var16);
								}
							}
						}

						if (var20 != Client.combatTargetPlayerIndex) { // L: 8661
							FloorDecoration.addPlayerToMenu(var34, var20, var15, var16);
						} else {
							var4 = var27; // L: 8662
						}
					}

					if (var17 == 3) { // L: 8664
						NodeDeque var36 = Client.groundItems[GameObject.Client_plane][var15][var16]; // L: 8665
						if (var36 != null) { // L: 8666
							for (TileItem var35 = (TileItem)var36.first(); var35 != null; var35 = (TileItem)var36.next()) { // L: 8667 8668 8701
								ItemComposition var39 = SecureRandomCallable.ItemDefinition_get(var35.id); // L: 8669
								if (Client.isItemSelected == 1) { // L: 8670
									WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var16); // L: 8671
								} else if (Client.isSpellSelected) { // L: 8674
									if ((Player.selectedSpellFlags & 1) == 1) { // L: 8675
										WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var16); // L: 8676
									}
								} else {
									String[] var31 = var39.groundActions; // L: 8681

									for (int var32 = 4; var32 >= 0; --var32) { // L: 8682
										if (var31 != null && var31[var32] != null) { // L: 8683
											byte var26 = 0; // L: 8684
											if (var32 == 0) { // L: 8685
												var26 = 18;
											}

											if (var32 == 1) { // L: 8686
												var26 = 19;
											}

											if (var32 == 2) { // L: 8687
												var26 = 20;
											}

											if (var32 == 3) { // L: 8688
												var26 = 21;
											}

											if (var32 == 4) { // L: 8689
												var26 = 22;
											}

											WorldMapRegion.insertMenuItemNoShift(var31[var32], class23.colorStartTag(16748608) + var39.name, var26, var35.id, var15, var16); // L: 8690
										} else if (var32 == 2) { // L: 8693
											WorldMapRegion.insertMenuItemNoShift("Take", class23.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var16); // L: 8694
										}
									}

									WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var16); // L: 8698
								}
							}
						}
					}
				}
			}

			++var8; // L: 8567
		}
	}
}
