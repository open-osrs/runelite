import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1861325243
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1924923823
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2119498473
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -7418429141280982005L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1944235645
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "28"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class11.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < class113.method2616(); ++var8) {
			long var23 = MenuAction.method1960(var8);
			if (var23 != var6) {
				var6 = var23;
				int var25 = FloorOverlayDefinition.method3618(var8);
				long var14 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var13 = (int)(var14 >>> 7 & 127L);
				var13 = var13;
				int var26 = class114.method2629(var8);
				int var15 = PacketWriter.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var16 = var15;
				if (var26 == 2 && class7.scene.getObjectFlags(class20.Client_plane, var25, var13, var23) >= 0) {
					ObjectComposition var17 = class148.getObjectDefinition(var15);
					if (var17.transforms != null) {
						var17 = var17.transform();
					}

					if (var17 == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(65535) + var17.name, 1, var15, var25, var13);
					} else if (Client.isSpellSelected) {
						if ((class91.selectedSpellFlags & 4) == 4) {
							class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(65535) + var17.name, 2, var15, var25, var13);
						}
					} else {
						String[] var18 = var17.actions;
						if (var18 != null) {
							for (int var19 = 4; var19 >= 0; --var19) {
								if (var18[var19] != null) {
									short var20 = 0;
									if (var19 == 0) {
										var20 = 3;
									}

									if (var19 == 1) {
										var20 = 4;
									}

									if (var19 == 2) {
										var20 = 5;
									}

									if (var19 == 3) {
										var20 = 6;
									}

									if (var19 == 4) {
										var20 = 1001;
									}

									class11.insertMenuItemNoShift(var18[var19], UserComparator5.colorStartTag(65535) + var17.name, var20, var16, var25, var13);
								}
							}
						}

						class11.insertMenuItemNoShift("Examine", UserComparator5.colorStartTag(65535) + var17.name, 1002, var17.id, var25, var13);
					}
				}

				Player var21;
				int var27;
				NPC var28;
				int var35;
				int[] var36;
				if (var26 == 1) {
					NPC var31 = Client.npcs[var16];
					if (var31 == null) {
						continue;
					}

					if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) {
						for (var27 = 0; var27 < Client.npcCount; ++var27) {
							var28 = Client.npcs[Client.npcIndices[var27]];
							if (var28 != null && var28 != var31 && var28.definition.size == 1 && var31.x == var28.x && var28.y == var31.y) {
								GrandExchangeOfferAgeComparator.addNpcToMenu(var28, Client.npcIndices[var27], var25, var13);
							}
						}

						var27 = Players.Players_count;
						var36 = Players.Players_indices;

						for (var35 = 0; var35 < var27; ++var35) {
							var21 = Client.players[var36[var35]];
							if (var21 != null && var31.x == var21.x && var21.y == var31.y) {
								class233.addPlayerToMenu(var21, var36[var35], var25, var13);
							}
						}
					}

					GrandExchangeOfferAgeComparator.addNpcToMenu(var31, var16, var25, var13);
				}

				if (var26 == 0) {
					Player var32 = Client.players[var16];
					if (var32 == null) {
						continue;
					}

					if ((var32.x & 127) == 64 && (var32.y & 127) == 64) {
						for (var27 = 0; var27 < Client.npcCount; ++var27) {
							var28 = Client.npcs[Client.npcIndices[var27]];
							if (var28 != null && var28.definition.size == 1 && var32.x == var28.x && var32.y == var28.y) {
								GrandExchangeOfferAgeComparator.addNpcToMenu(var28, Client.npcIndices[var27], var25, var13);
							}
						}

						var27 = Players.Players_count;
						var36 = Players.Players_indices;

						for (var35 = 0; var35 < var27; ++var35) {
							var21 = Client.players[var36[var35]];
							if (var21 != null && var32 != var21 && var21.x == var32.x && var21.y == var32.y) {
								class233.addPlayerToMenu(var21, var36[var35], var25, var13);
							}
						}
					}

					if (var16 != Client.combatTargetPlayerIndex) {
						class233.addPlayerToMenu(var32, var16, var25, var13);
					} else {
						var4 = var23;
					}
				}

				if (var26 == 3) {
					NodeDeque var34 = Client.groundItems[class20.Client_plane][var25][var13];
					if (var34 != null) {
						for (TileItem var33 = (TileItem)var34.first(); var33 != null; var33 = (TileItem)var34.next()) {
							ItemComposition var37 = UserComparator6.ItemDefinition_get(var33.id);
							if (Client.isItemSelected == 1) {
								class11.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + UserComparator5.colorStartTag(16748608) + var37.name, 16, var33.id, var25, var13);
							} else if (Client.isSpellSelected) {
								if ((class91.selectedSpellFlags & 1) == 1) {
									class11.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + UserComparator5.colorStartTag(16748608) + var37.name, 17, var33.id, var25, var13);
								}
							} else {
								String[] var29 = var37.groundActions;

								for (int var30 = 4; var30 >= 0; --var30) {
									if (var29 != null && var29[var30] != null) {
										byte var22 = 0;
										if (var30 == 0) {
											var22 = 18;
										}

										if (var30 == 1) {
											var22 = 19;
										}

										if (var30 == 2) {
											var22 = 20;
										}

										if (var30 == 3) {
											var22 = 21;
										}

										if (var30 == 4) {
											var22 = 22;
										}

										class11.insertMenuItemNoShift(var29[var30], UserComparator5.colorStartTag(16748608) + var37.name, var22, var33.id, var25, var13);
									} else if (var30 == 2) {
										class11.insertMenuItemNoShift("Take", UserComparator5.colorStartTag(16748608) + var37.name, 20, var33.id, var25, var13);
									}
								}

								class11.insertMenuItemNoShift("Examine", UserComparator5.colorStartTag(16748608) + var37.name, 1004, var33.id, var25, var13);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = MouseRecorder.method2159(var4);
			int var9 = (int)(var4 >>> 7 & 127L);
			Player var11 = Client.players[Client.combatTargetPlayerIndex];
			class233.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9);
		}

	}
}
