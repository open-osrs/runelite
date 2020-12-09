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
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1553227533"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "127"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgs;",
		garbageValue = "-1827555647"
	)
	public static class194[] method4371() {
		return new class194[]{class194.field2348, class194.field2342, class194.field2344, class194.field2350, class194.field2346, class194.field2345, class194.field2343, class194.field2349, class194.field2347, class194.field2351};
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-982024968"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			WorldMapRegion.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = ClientPacket.method3671(var4);
					int var9 = (int)(var4 >>> 7 & 127L);
					Player var11 = Client.players[Client.combatTargetPlayerIndex];
					FloorDecoration.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9);
				}

				return;
			}

			long var27 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var27 != var6) {
				label336: {
					var6 = var27;
					int var15 = LoginScreenAnimation.method1904(var8);
					int var16 = Tiles.method1170(var8);
					int var17 = Widget.Entity_unpackSceneX(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var19 = Occluder.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var20 = var19;
					if (var17 == 2 && ArchiveLoader.scene.getObjectFlags(GameObject.Client_plane, var15, var16, var27) >= 0) {
						ObjectDefinition var21 = WorldMapDecoration.getObjectDefinition(var19);
						if (var21.transforms != null) {
							var21 = var21.transform();
						}

						if (var21 == null) {
							break label336;
						}

						if (Client.isItemSelected == 1) {
							WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(65535) + var21.name, 1, var19, var15, var16);
						} else if (Client.isSpellSelected) {
							if ((Player.selectedSpellFlags & 4) == 4) {
								WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(65535) + var21.name, 2, var19, var15, var16);
							}
						} else {
							String[] var22 = var21.actions;
							if (var22 != null) {
								for (int var23 = 4; var23 >= 0; --var23) {
									if (var22[var23] != null) {
										short var24 = 0;
										if (var23 == 0) {
											var24 = 3;
										}

										if (var23 == 1) {
											var24 = 4;
										}

										if (var23 == 2) {
											var24 = 5;
										}

										if (var23 == 3) {
											var24 = 6;
										}

										if (var23 == 4) {
											var24 = 1001;
										}

										WorldMapRegion.insertMenuItemNoShift(var22[var23], class23.colorStartTag(65535) + var21.name, var24, var20, var15, var16);
									}
								}
							}

							WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(65535) + var21.name, 1002, var21.id, var15, var16);
						}
					}

					Player var25;
					int var29;
					NPC var30;
					int var37;
					int[] var38;
					if (var17 == 1) {
						NPC var33 = Client.npcs[var20];
						if (var33 == null) {
							break label336;
						}

						if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) {
							for (var29 = 0; var29 < Client.npcCount; ++var29) {
								var30 = Client.npcs[Client.npcIndices[var29]];
								if (var30 != null && var30 != var33 && var30.definition.size == 1 && var33.x == var30.x && var33.y == var30.y) {
									TileItem.addNpcToMenu(var30.definition, Client.npcIndices[var29], var15, var16);
								}
							}

							var29 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var37 = 0; var37 < var29; ++var37) {
								var25 = Client.players[var38[var37]];
								if (var25 != null && var33.x == var25.x && var25.y == var33.y) {
									FloorDecoration.addPlayerToMenu(var25, var38[var37], var15, var16);
								}
							}
						}

						TileItem.addNpcToMenu(var33.definition, var20, var15, var16);
					}

					if (var17 == 0) {
						Player var34 = Client.players[var20];
						if (var34 == null) {
							break label336;
						}

						if ((var34.x & 127) == 64 && (var34.y & 127) == 64) {
							for (var29 = 0; var29 < Client.npcCount; ++var29) {
								var30 = Client.npcs[Client.npcIndices[var29]];
								if (var30 != null && var30.definition.size == 1 && var30.x == var34.x && var34.y == var30.y) {
									TileItem.addNpcToMenu(var30.definition, Client.npcIndices[var29], var15, var16);
								}
							}

							var29 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var37 = 0; var37 < var29; ++var37) {
								var25 = Client.players[var38[var37]];
								if (var25 != null && var34 != var25 && var34.x == var25.x && var34.y == var25.y) {
									FloorDecoration.addPlayerToMenu(var25, var38[var37], var15, var16);
								}
							}
						}

						if (var20 != Client.combatTargetPlayerIndex) {
							FloorDecoration.addPlayerToMenu(var34, var20, var15, var16);
						} else {
							var4 = var27;
						}
					}

					if (var17 == 3) {
						NodeDeque var36 = Client.groundItems[GameObject.Client_plane][var15][var16];
						if (var36 != null) {
							for (TileItem var35 = (TileItem)var36.first(); var35 != null; var35 = (TileItem)var36.next()) {
								ItemDefinition var39 = SecureRandomCallable.ItemDefinition_get(var35.id);
								if (Client.isItemSelected == 1) {
									WorldMapRegion.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class23.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var16);
								} else if (Client.isSpellSelected) {
									if ((Player.selectedSpellFlags & 1) == 1) {
										WorldMapRegion.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class23.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var16);
									}
								} else {
									String[] var31 = var39.groundActions;

									for (int var32 = 4; var32 >= 0; --var32) {
										if (var31 != null && var31[var32] != null) {
											byte var26 = 0;
											if (var32 == 0) {
												var26 = 18;
											}

											if (var32 == 1) {
												var26 = 19;
											}

											if (var32 == 2) {
												var26 = 20;
											}

											if (var32 == 3) {
												var26 = 21;
											}

											if (var32 == 4) {
												var26 = 22;
											}

											WorldMapRegion.insertMenuItemNoShift(var31[var32], class23.colorStartTag(16748608) + var39.name, var26, var35.id, var15, var16);
										} else if (var32 == 2) {
											WorldMapRegion.insertMenuItemNoShift("Take", class23.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var16);
										}
									}

									WorldMapRegion.insertMenuItemNoShift("Examine", class23.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var16);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}
}
