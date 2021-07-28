import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("l")
	@Export("name")
	public final String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1793986525
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "824685565"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class7.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < NPC.method1960(); ++var8) {
			long var25 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var6 != var25) {
				var6 = var25;
				int var13 = Skeleton.method3973(var8);
				int var14 = GrandExchangeEvent.method5152(var8);
				int var15 = class266.method4916(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var17 = class78.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var18 = var17;
				if (var15 == 2 && WorldMapIcon_1.scene.getObjectFlags(GrandExchangeEvent.Client_plane, var13, var14, var25) >= 0) {
					ObjectComposition var19 = ClanChannel.getObjectDefinition(var17);
					if (var19.transforms != null) {
						var19 = var19.transform();
					}

					if (var19 == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						class7.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ScriptFrame.colorStartTag(65535) + var19.name, 1, var17, var13, var14);
					} else if (Client.isSpellSelected) {
						if ((ViewportMouse.selectedSpellFlags & 4) == 4) {
							class7.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ScriptFrame.colorStartTag(65535) + var19.name, 2, var17, var13, var14);
						}
					} else {
						String[] var20 = var19.actions;
						if (var20 != null) {
							for (int var21 = 4; var21 >= 0; --var21) {
								if (var20[var21] != null) {
									short var22 = 0;
									if (var21 == 0) {
										var22 = 3;
									}

									if (var21 == 1) {
										var22 = 4;
									}

									if (var21 == 2) {
										var22 = 5;
									}

									if (var21 == 3) {
										var22 = 6;
									}

									if (var21 == 4) {
										var22 = 1001;
									}

									class7.insertMenuItemNoShift(var20[var21], ScriptFrame.colorStartTag(65535) + var19.name, var22, var18, var13, var14);
								}
							}
						}

						class7.insertMenuItemNoShift("Examine", ScriptFrame.colorStartTag(65535) + var19.name, 1002, var19.id, var13, var14);
					}
				}

				Player var23;
				int var27;
				NPC var28;
				int var35;
				int[] var36;
				if (var15 == 1) {
					NPC var31 = Client.npcs[var18];
					if (var31 == null) {
						continue;
					}

					if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) {
						for (var27 = 0; var27 < Client.npcCount; ++var27) {
							var28 = Client.npcs[Client.npcIndices[var27]];
							if (var28 != null && var28 != var31 && var28.definition.size == 1 && var28.x == var31.x && var31.y == var28.y) {
								class290.addNpcToMenu(var28.definition, Client.npcIndices[var27], var13, var14);
							}
						}

						var27 = Players.Players_count;
						var36 = Players.Players_indices;

						for (var35 = 0; var35 < var27; ++var35) {
							var23 = Client.players[var36[var35]];
							if (var23 != null && var31.x == var23.x && var23.y == var31.y) {
								class1.addPlayerToMenu(var23, var36[var35], var13, var14);
							}
						}
					}

					class290.addNpcToMenu(var31.definition, var18, var13, var14);
				}

				if (var15 == 0) {
					Player var32 = Client.players[var18];
					if (var32 == null) {
						continue;
					}

					if ((var32.x & 127) == 64 && (var32.y & 127) == 64) {
						for (var27 = 0; var27 < Client.npcCount; ++var27) {
							var28 = Client.npcs[Client.npcIndices[var27]];
							if (var28 != null && var28.definition.size == 1 && var28.x == var32.x && var32.y == var28.y) {
								class290.addNpcToMenu(var28.definition, Client.npcIndices[var27], var13, var14);
							}
						}

						var27 = Players.Players_count;
						var36 = Players.Players_indices;

						for (var35 = 0; var35 < var27; ++var35) {
							var23 = Client.players[var36[var35]];
							if (var23 != null && var23 != var32 && var32.x == var23.x && var32.y == var23.y) {
								class1.addPlayerToMenu(var23, var36[var35], var13, var14);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) {
						class1.addPlayerToMenu(var32, var18, var13, var14);
					} else {
						var4 = var25;
					}
				}

				if (var15 == 3) {
					NodeDeque var34 = Client.groundItems[GrandExchangeEvent.Client_plane][var13][var14];
					if (var34 != null) {
						for (TileItem var33 = (TileItem)var34.first(); var33 != null; var33 = (TileItem)var34.next()) {
							ItemComposition var37 = KeyHandler.ItemDefinition_get(var33.id);
							if (Client.isItemSelected == 1) {
								class7.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ScriptFrame.colorStartTag(16748608) + var37.name, 16, var33.id, var13, var14);
							} else if (Client.isSpellSelected) {
								if ((ViewportMouse.selectedSpellFlags & 1) == 1) {
									class7.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ScriptFrame.colorStartTag(16748608) + var37.name, 17, var33.id, var13, var14);
								}
							} else {
								String[] var29 = var37.groundActions;

								for (int var30 = 4; var30 >= 0; --var30) {
									if (var29 != null && var29[var30] != null) {
										byte var24 = 0;
										if (var30 == 0) {
											var24 = 18;
										}

										if (var30 == 1) {
											var24 = 19;
										}

										if (var30 == 2) {
											var24 = 20;
										}

										if (var30 == 3) {
											var24 = 21;
										}

										if (var30 == 4) {
											var24 = 22;
										}

										class7.insertMenuItemNoShift(var29[var30], ScriptFrame.colorStartTag(16748608) + var37.name, var24, var33.id, var13, var14);
									} else if (var30 == 2) {
										class7.insertMenuItemNoShift("Take", ScriptFrame.colorStartTag(16748608) + var37.name, 20, var33.id, var13, var14);
									}
								}

								class7.insertMenuItemNoShift("Examine", ScriptFrame.colorStartTag(16748608) + var37.name, 1004, var33.id, var13, var14);
							}
						}
					}
				}
			}
		}

		if (var4 != -1L) {
			var8 = ApproximateRouteStrategy.method880(var4);
			int var9 = class79.method1990(var4);
			Player var10 = Client.players[Client.combatTargetPlayerIndex];
			class1.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9);
		}

	}
}
