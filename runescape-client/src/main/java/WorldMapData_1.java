import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("gx")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -941461191
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1539271547
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1911855955
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1515866059
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkn;I)V",
		garbageValue = "-484373567"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field299.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort();
			super.regionYLow = var1.readUnsignedShort();
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method5843();
			super.fileId = var1.method5843();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkn;I)V",
		garbageValue = "-1774414997"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field185 = new byte[super.planes][64][64];
		super.field175 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class39.field293.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "4"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "259751183"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-810164078"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "196084572"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (var2.regionX == super.regionX && var2.regionY == super.regionY) {
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1959951733"
	)
	public static boolean method784(int var0) {
		return var0 >= WorldMapDecorationType.field2775.id && var0 <= WorldMapDecorationType.field2778.id;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "87"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			ScriptEvent.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < WorldMapSection2.method372(); ++var8) {
			long var9 = WorldMapLabel.method482(var8);
			if (var9 != var6) {
				var6 = var9;
				int var24 = SoundSystem.method2628(var8);
				long var14 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var13 = (int)(var14 >>> 7 & 127L);
				var13 = var13;
				int var25 = class171.method3571(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var16 = class2.method32(var8);
				if (var25 == 2 && UserComparator3.scene.getObjectFlags(TileItemPile.Client_plane, var24, var13, var9) >= 0) {
					ObjectDefinition var17 = Canvas.getObjectDefinition(var16);
					if (var17.transforms != null) {
						var17 = var17.transform();
					}

					if (var17 == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(65535) + var17.name, 1, var16, var24, var13);
					} else if (Client.isSpellSelected) {
						if ((WorldMapSprite.selectedSpellFlags & 4) == 4) {
							ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(65535) + var17.name, 2, var16, var24, var13);
						}
					} else {
						String[] var26 = var17.actions;
						if (var26 != null) {
							for (int var27 = 4; var27 >= 0; --var27) {
								if (var26[var27] != null) {
									short var20 = 0;
									if (var27 == 0) {
										var20 = 3;
									}

									if (var27 == 1) {
										var20 = 4;
									}

									if (var27 == 2) {
										var20 = 5;
									}

									if (var27 == 3) {
										var20 = 6;
									}

									if (var27 == 4) {
										var20 = 1001;
									}

									ScriptEvent.insertMenuItemNoShift(var26[var27], ItemContainer.colorStartTag(65535) + var17.name, var20, var16, var24, var13);
								}
							}
						}

						ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(65535) + var17.name, 1002, var17.id, var24, var13);
					}
				}

				int var18;
				NPC var19;
				Player var21;
				int[] var33;
				int var35;
				if (var25 == 1) {
					NPC var30 = Client.npcs[var16];
					if (var30 == null) {
						continue;
					}

					if (var30.definition.size == 1 && (var30.x & 127) == 64 && (var30.y & 127) == 64) {
						for (var18 = 0; var18 < Client.npcCount; ++var18) {
							var19 = Client.npcs[Client.npcIndices[var18]];
							if (var19 != null && var30 != var19 && var19.definition.size == 1 && var19.x == var30.x && var19.y == var30.y) {
								ApproximateRouteStrategy.addNpcToMenu(var19.definition, Client.npcIndices[var18], var24, var13);
							}
						}

						var18 = Players.Players_count;
						var33 = Players.Players_indices;

						for (var35 = 0; var35 < var18; ++var35) {
							var21 = Client.players[var33[var35]];
							if (var21 != null && var30.x == var21.x && var30.y == var21.y) {
								Player.addPlayerToMenu(var21, var33[var35], var24, var13);
							}
						}
					}

					ApproximateRouteStrategy.addNpcToMenu(var30.definition, var16, var24, var13);
				}

				if (var25 == 0) {
					Player var31 = Client.players[var16];
					if (var31 == null) {
						continue;
					}

					if ((var31.x & 127) == 64 && (var31.y & 127) == 64) {
						for (var18 = 0; var18 < Client.npcCount; ++var18) {
							var19 = Client.npcs[Client.npcIndices[var18]];
							if (var19 != null && var19.definition.size == 1 && var31.x == var19.x && var31.y == var19.y) {
								ApproximateRouteStrategy.addNpcToMenu(var19.definition, Client.npcIndices[var18], var24, var13);
							}
						}

						var18 = Players.Players_count;
						var33 = Players.Players_indices;

						for (var35 = 0; var35 < var18; ++var35) {
							var21 = Client.players[var33[var35]];
							if (var21 != null && var21 != var31 && var21.x == var31.x && var31.y == var21.y) {
								Player.addPlayerToMenu(var21, var33[var35], var24, var13);
							}
						}
					}

					if (var16 != Client.combatTargetPlayerIndex) {
						Player.addPlayerToMenu(var31, var16, var24, var13);
					} else {
						var4 = var9;
					}
				}

				if (var25 == 3) {
					NodeDeque var32 = Client.groundItems[TileItemPile.Client_plane][var24][var13];
					if (var32 != null) {
						for (TileItem var36 = (TileItem)var32.first(); var36 != null; var36 = (TileItem)var32.next()) {
							ItemDefinition var34 = KitDefinition.ItemDefinition_get(var36.id);
							if (Client.isItemSelected == 1) {
								ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(16748608) + var34.name, 16, var36.id, var24, var13);
							} else if (Client.isSpellSelected) {
								if ((WorldMapSprite.selectedSpellFlags & 1) == 1) {
									ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(16748608) + var34.name, 17, var36.id, var24, var13);
								}
							} else {
								String[] var28 = var34.groundActions;

								for (int var29 = 4; var29 >= 0; --var29) {
									if (var28 != null && var28[var29] != null) {
										byte var22 = 0;
										if (var29 == 0) {
											var22 = 18;
										}

										if (var29 == 1) {
											var22 = 19;
										}

										if (var29 == 2) {
											var22 = 20;
										}

										if (var29 == 3) {
											var22 = 21;
										}

										if (var29 == 4) {
											var22 = 22;
										}

										ScriptEvent.insertMenuItemNoShift(var28[var29], ItemContainer.colorStartTag(16748608) + var34.name, var22, var36.id, var24, var13);
									} else if (var29 == 2) {
										ScriptEvent.insertMenuItemNoShift("Take", ItemContainer.colorStartTag(16748608) + var34.name, 20, var36.id, var24, var13);
									}
								}

								ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(16748608) + var34.name, 1004, var36.id, var24, var13);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = class279.method5159(var4);
			int var23 = (int)(var4 >>> 7 & 127L);
			Player var11 = Client.players[Client.combatTargetPlayerIndex];
			Player.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var23);
		}

	}
}
