import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lar;",
		garbageValue = "826234570"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "114"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "1"
	)
	static void method393(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(KeyHandler.KeyHandler_instance);
		var0.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "30675574"
	)
	public static boolean method398(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(ZLpj;I)V",
		garbageValue = "147077041"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			int var2 = var1.method7499();
			var3 = var1.method7401();
			var4 = var1.readUnsignedShort();
			WorldMapID.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					WorldMapID.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class269.regions = new int[var4];
			Tiles.regionMapArchiveIds = new int[var4];
			class10.regionLandArchiveIds = new int[var4];
			TileItem.regionLandArchives = new byte[var4][];
			VarpDefinition.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if (Client.field526) {
				if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
					var16 = true;
				}

				if (var3 / 8 == 48 && var2 / 8 == 148) {
					var16 = true;
				}
			}

			var4 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						class269.regions[var4] = var8;
						Tiles.regionMapArchiveIds[var4] = class140.archive5.getGroupId("m" + var6 + "_" + var7);
						class10.regionLandArchiveIds[var4] = class140.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			ModelData0.method4320(var3, var2, true);
		} else {
			boolean var15 = var1.method7392() == 1;
			var3 = var1.readUnsignedShort();
			var4 = var1.method7401();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			WorldMapID.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					WorldMapID.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class269.regions = new int[var5];
			Tiles.regionMapArchiveIds = new int[var5];
			class10.regionLandArchiveIds = new int[var5];
			TileItem.regionLandArchives = new byte[var5][];
			VarpDefinition.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class269.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class269.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								Tiles.regionMapArchiveIds[var5] = class140.archive5.getGroupId("m" + var13 + "_" + var14);
								class10.regionLandArchiveIds[var5] = class140.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			ModelData0.method4320(var4, var3, !var15);
		}

	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-149129568"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != class20.Client_plane) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = class7.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = class7.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = class7.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = class7.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) {
				var12 = class7.scene.getObjectFlags(var0, var2, var3, var7);
				int var38 = PacketWriter.Entity_unpackID(var7);
				int var39 = var12 & 31;
				int var40 = var12 >> 6 & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					class7.scene.removeBoundaryObject(var0, var2, var3);
					var13 = class148.getObjectDefinition(var38);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3693(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) {
					class7.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					class7.scene.removeGameObject(var0, var2, var3);
					var13 = class148.getObjectDefinition(var38);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) {
					class7.scene.removeFloorDecoration(var0, var2, var3);
					var13 = class148.getObjectDefinition(var38);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3701(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}

				Scene var41 = class7.scene;
				CollisionMap var14 = Client.collisionMaps[var0];
				ObjectComposition var15 = class148.getObjectDefinition(var4);
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) {
					var16 = var15.sizeX;
					var17 = var15.sizeY;
				} else {
					var16 = var15.sizeY;
					var17 = var15.sizeX;
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) {
					var18 = (var16 >> 1) + var2;
					var19 = var2 + (var16 + 1 >> 1);
				} else {
					var18 = var2;
					var19 = var2 + 1;
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) {
					var20 = var3 + (var17 >> 1);
					var21 = var3 + (var17 + 1 >> 1);
				} else {
					var20 = var3;
					var21 = var3 + 1;
				}

				int[][] var22 = Tiles.Tiles_heights[var12];
				int var23 = var22[var18][var20] + var22[var19][var20] + var22[var18][var21] + var22[var19][var21] >> 2;
				int var24 = (var2 << 7) + (var16 << 6);
				int var25 = (var3 << 7) + (var17 << 6);
				long var26 = SecureRandomFuture.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
				int var28 = (var5 << 6) + var6;
				if (var15.int3 == 1) {
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) {
					if (var15.animationId == -1 && var15.transforms == null) {
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28);
					if (var15.interactType == 1) {
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
						}

						var41.method3960(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28);
						if (var15.interactType != 0) {
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field969[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3721(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field970[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3721(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) {
							var29 = var5 + 1 & 3;
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) {
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
								var31 = var15.getModel(2, var29, var22, var24, var23, var25);
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field969[var5], Tiles.field969[var29], var26, var28);
							if (var15.interactType != 0) {
								var14.method3721(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field970[var5], 0, var26, var28);
							if (var15.interactType != 0) {
								var14.method3721(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
							}

							var41.method3960(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28);
							if (var15.interactType != 0) {
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field969[var5], 0, 0, 0, var26, var28);
						} else {
							long var30;
							Object var32;
							if (var6 == 5) {
								var29 = 16;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (var30 != 0L) {
									var29 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field969[var5], 0, var29 * Tiles.field976[var5], var29 * Tiles.field966[var5], var26, var28);
							} else if (var6 == 6) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (var30 != 0L) {
									var29 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field973[var5], var29 * Tiles.field974[var5], var26, var28);
							} else if (var6 == 7) {
								int var35 = var5 + 2 & 3;
								if (var15.animationId == -1 && var15.transforms == null) {
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28);
							} else if (var6 == 8) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3;
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field973[var5], var29 * Tiles.field974[var5], var26, var28);
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) {
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null);
					}

					if (var36 != null) {
						var41.method3960(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) {
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	}
}
