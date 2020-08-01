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
		descriptor = "(Lkn;I)V",
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
		descriptor = "(Lkn;I)V",
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
		descriptor = "(B)I",
		garbageValue = "4"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "259751183"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-810164078"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
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
		descriptor = "(II)Z",
		garbageValue = "1959951733"
	)
	public static boolean method784(int var0) {
		return var0 >= WorldMapDecorationType.field2775.id && var0 <= WorldMapDecorationType.field2778.id;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
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
		for (var8 = 0; var8 < WorldMapSection2.getEntityCountUnderMouse(); ++var8) {
			long entityTag_1 = WorldMapLabel.getEntityUnderMouse(var8);
			if (entityTag_1 != var6) {
				var6 = entityTag_1;
				int sceneX = SoundSystem.getSceneXForObjectUnderMouse(var8);
				long entityTag_2 = ViewportMouse.ViewportMouse_entityTags[var8];
				int sceneY = (int)(entityTag_2 >>> 7 & 0x7fL);
				sceneY = sceneY;
				int interactType = class171.Entity_unpackType(ViewportMouse.ViewportMouse_entityTags[var8]);
				int objectId = class2.getEntityIdUnderMouse(var8);
				if (interactType == 2 && UserComparator3.scene.getObjectFlags(TileItemPile.Client_plane, sceneX, sceneY, entityTag_1) >= 0) {
					ObjectDefinition objectDef = Canvas.getObjectDefinition(objectId);
					if (objectDef.transforms != null) {
						objectDef = objectDef.transform();
					}

					if (objectDef == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(65535) + objectDef.name, 1, objectId, sceneX, sceneY);
					} else if (Client.isSpellSelected) {
						if ((WorldMapSprite.selectedSpellFlags & 4) == 4) {
							ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(65535) + objectDef.name, 2, objectId, sceneX, sceneY);
						}
					} else {
						String[] actions = objectDef.actions;
						if (actions != null) {
							for (int actionIdx = 4; actionIdx >= 0; --actionIdx) {
								if (actions[actionIdx] != null) {
									short opcode = 0;
									if (actionIdx == 0) {
										opcode = 3;
									}

									if (actionIdx == 1) {
										opcode = 4;
									}

									if (actionIdx == 2) {
										opcode = 5;
									}

									if (actionIdx == 3) {
										opcode = 6;
									}

									if (actionIdx == 4) {
										opcode = 1001;
									}

									ScriptEvent.insertMenuItemNoShift(actions[actionIdx], ItemContainer.colorStartTag(65535) + objectDef.name, opcode, objectId, sceneX, sceneY);
								}
							}
						}

						ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(65535) + objectDef.name, 1002, objectDef.id, sceneX, sceneY);
					}
				}

				int var18;
				NPC var19;
				Player var21;
				int[] var33;
				int var35;
				if (interactType == 1) {
					NPC var30 = Client.npcs[objectId];
					if (var30 == null) {
						continue;
					}

					if (var30.definition.size == 1 && (var30.x & 127) == 64 && (var30.y & 127) == 64) {
						for (var18 = 0; var18 < Client.npcCount; ++var18) {
							var19 = Client.npcs[Client.npcIndices[var18]];
							if (var19 != null && var30 != var19 && var19.definition.size == 1 && var19.x == var30.x && var19.y == var30.y) {
								ApproximateRouteStrategy.addNpcToMenu(var19.definition, Client.npcIndices[var18], sceneX, sceneY);
							}
						}

						var18 = Players.Players_count;
						var33 = Players.Players_indices;

						for (var35 = 0; var35 < var18; ++var35) {
							var21 = Client.players[var33[var35]];
							if (var21 != null && var30.x == var21.x && var30.y == var21.y) {
								Player.addPlayerToMenu(var21, var33[var35], sceneX, sceneY);
							}
						}
					}

					ApproximateRouteStrategy.addNpcToMenu(var30.definition, objectId, sceneX, sceneY);
				}

				if (interactType == 0) {
					Player var31 = Client.players[objectId];
					if (var31 == null) {
						continue;
					}

					if ((var31.x & 127) == 64 && (var31.y & 127) == 64) {
						for (var18 = 0; var18 < Client.npcCount; ++var18) {
							var19 = Client.npcs[Client.npcIndices[var18]];
							if (var19 != null && var19.definition.size == 1 && var31.x == var19.x && var31.y == var19.y) {
								ApproximateRouteStrategy.addNpcToMenu(var19.definition, Client.npcIndices[var18], sceneX, sceneY);
							}
						}

						var18 = Players.Players_count;
						var33 = Players.Players_indices;

						for (var35 = 0; var35 < var18; ++var35) {
							var21 = Client.players[var33[var35]];
							if (var21 != null && var21 != var31 && var21.x == var31.x && var31.y == var21.y) {
								Player.addPlayerToMenu(var21, var33[var35], sceneX, sceneY);
							}
						}
					}

					if (objectId != Client.combatTargetPlayerIndex) {
						Player.addPlayerToMenu(var31, objectId, sceneX, sceneY);
					} else {
						var4 = entityTag_1;
					}
				}

				if (interactType == 3) {
					NodeDeque var32 = Client.groundItems[TileItemPile.Client_plane][sceneX][sceneY];
					if (var32 != null) {
						for (TileItem var36 = (TileItem)var32.first(); var36 != null; var36 = (TileItem)var32.next()) {
							ItemDefinition var34 = KitDefinition.ItemDefinition_get(var36.id);
							if (Client.isItemSelected == 1) {
								ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(16748608) + var34.name, 16, var36.id, sceneX, sceneY);
							} else if (Client.isSpellSelected) {
								if ((WorldMapSprite.selectedSpellFlags & 1) == 1) {
									ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(16748608) + var34.name, 17, var36.id, sceneX, sceneY);
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

										ScriptEvent.insertMenuItemNoShift(var28[var29], ItemContainer.colorStartTag(16748608) + var34.name, var22, var36.id, sceneX, sceneY);
									} else if (var29 == 2) {
										ScriptEvent.insertMenuItemNoShift("Take", ItemContainer.colorStartTag(16748608) + var34.name, 20, var36.id, sceneX, sceneY);
									}
								}

								ScriptEvent.insertMenuItemNoShift("Examine", ItemContainer.colorStartTag(16748608) + var34.name, 1004, var36.id, sceneX, sceneY);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = class279.Entity_unpackSceneX(var4);
			int pSceneY = (int)(var4 >>> 7 & 127L);
			Player var11 = Client.players[Client.combatTargetPlayerIndex];
			Player.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, pSceneY);
		}

	}
}
