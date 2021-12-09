import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lar;",
		garbageValue = "826234570"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "114"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "1"
	)
	static void method393(Component var0) {
		var0.setFocusTraversalKeysEnabled(false); // L: 155
		var0.addKeyListener(KeyHandler.KeyHandler_instance); // L: 156
		var0.addFocusListener(KeyHandler.KeyHandler_instance); // L: 157
	} // L: 158

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "30675574"
	)
	public static boolean method398(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false; // L: 241 242
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(ZLpj;I)V",
		garbageValue = "147077041"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 6145
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 6146
			int var2 = var1.method7499(); // L: 6147
			var3 = var1.method7401(); // L: 6148
			var4 = var1.readUnsignedShort(); // L: 6149
			WorldMapID.xteaKeys = new int[var4][4]; // L: 6150

			for (var5 = 0; var5 < var4; ++var5) { // L: 6151
				for (var6 = 0; var6 < 4; ++var6) { // L: 6152
					WorldMapID.xteaKeys[var5][var6] = var1.readInt(); // L: 6153
				}
			}

			class269.regions = new int[var4]; // L: 6156
			Tiles.regionMapArchiveIds = new int[var4]; // L: 6157
			class10.regionLandArchiveIds = new int[var4]; // L: 6158
			TileItem.regionLandArchives = new byte[var4][]; // L: 6159
			VarpDefinition.regionMapArchives = new byte[var4][]; // L: 6160
			boolean var16 = false; // L: 6161
			if (Client.field526) { // L: 6162
				if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) { // L: 6163
					var16 = true;
				}

				if (var3 / 8 == 48 && var2 / 8 == 148) { // L: 6164
					var16 = true;
				}
			}

			var4 = 0; // L: 6166

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 6167
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) { // L: 6168
					var8 = var7 + (var6 << 8); // L: 6169
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 6170
						class269.regions[var4] = var8; // L: 6171
						Tiles.regionMapArchiveIds[var4] = class140.archive5.getGroupId("m" + var6 + "_" + var7); // L: 6172
						class10.regionLandArchiveIds[var4] = class140.archive5.getGroupId("l" + var6 + "_" + var7); // L: 6173
						++var4; // L: 6174
					}
				}
			}

			ModelData0.method4320(var3, var2, true); // L: 6177
		} else {
			boolean var15 = var1.method7392() == 1; // L: 6180
			var3 = var1.readUnsignedShort(); // L: 6181
			var4 = var1.method7401(); // L: 6182
			var5 = var1.readUnsignedShort(); // L: 6183
			var1.importIndex(); // L: 6184

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 6185
				for (var7 = 0; var7 < 13; ++var7) { // L: 6186
					for (var8 = 0; var8 < 13; ++var8) { // L: 6187
						var9 = var1.readBits(1); // L: 6188
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 6189
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 6190
						}
					}
				}
			}

			var1.exportIndex(); // L: 6194
			WorldMapID.xteaKeys = new int[var5][4]; // L: 6195

			for (var6 = 0; var6 < var5; ++var6) { // L: 6196
				for (var7 = 0; var7 < 4; ++var7) { // L: 6197
					WorldMapID.xteaKeys[var6][var7] = var1.readInt(); // L: 6198
				}
			}

			class269.regions = new int[var5]; // L: 6201
			Tiles.regionMapArchiveIds = new int[var5]; // L: 6202
			class10.regionLandArchiveIds = new int[var5]; // L: 6203
			TileItem.regionLandArchives = new byte[var5][]; // L: 6204
			VarpDefinition.regionMapArchives = new byte[var5][]; // L: 6205
			var5 = 0; // L: 6206

			for (var6 = 0; var6 < 4; ++var6) { // L: 6207
				for (var7 = 0; var7 < 13; ++var7) { // L: 6208
					for (var8 = 0; var8 < 13; ++var8) { // L: 6209
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 6210
						if (var9 != -1) { // L: 6211
							int var10 = var9 >> 14 & 1023; // L: 6212
							int var11 = var9 >> 3 & 2047; // L: 6213
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 6214

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 6215
								if (class269.regions[var13] == var12) {
									var12 = -1; // L: 6216
									break; // L: 6217
								}
							}

							if (var12 != -1) { // L: 6219
								class269.regions[var5] = var12; // L: 6220
								var13 = var12 >> 8 & 255; // L: 6221
								int var14 = var12 & 255; // L: 6222
								Tiles.regionMapArchiveIds[var5] = class140.archive5.getGroupId("m" + var13 + "_" + var14); // L: 6223
								class10.regionLandArchiveIds[var5] = class140.archive5.getGroupId("l" + var13 + "_" + var14); // L: 6224
								++var5; // L: 6225
							}
						}
					}
				}
			}

			ModelData0.method4320(var4, var3, !var15); // L: 6231
		}

	} // L: 6233

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-149129568"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8027
			if (Client.isLowDetail && var0 != class20.Client_plane) { // L: 8028
				return;
			}

			long var7 = 0L; // L: 8029
			boolean var9 = true; // L: 8030
			boolean var10 = false; // L: 8031
			boolean var11 = false; // L: 8032
			if (var1 == 0) { // L: 8033
				var7 = class7.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8034
				var7 = class7.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8035
				var7 = class7.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8036
				var7 = class7.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 8037
				var12 = class7.scene.getObjectFlags(var0, var2, var3, var7); // L: 8038
				int var38 = PacketWriter.Entity_unpackID(var7); // L: 8039
				int var39 = var12 & 31; // L: 8040
				int var40 = var12 >> 6 & 3; // L: 8041
				ObjectComposition var13;
				if (var1 == 0) { // L: 8042
					class7.scene.removeBoundaryObject(var0, var2, var3); // L: 8043
					var13 = class148.getObjectDefinition(var38); // L: 8044
					if (var13.interactType != 0) { // L: 8045
						Client.collisionMaps[var0].method3693(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 8047
					class7.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8048
					class7.scene.removeGameObject(var0, var2, var3); // L: 8049
					var13 = class148.getObjectDefinition(var38); // L: 8050
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 8051
						return;
					}

					if (var13.interactType != 0) { // L: 8052
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 8054
					class7.scene.removeFloorDecoration(var0, var2, var3); // L: 8055
					var13 = class148.getObjectDefinition(var38); // L: 8056
					if (var13.interactType == 1) { // L: 8057
						Client.collisionMaps[var0].method3701(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8060
				var12 = var0; // L: 8061
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8062
					var12 = var0 + 1;
				}

				Scene var41 = class7.scene; // L: 8063
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 8064
				ObjectComposition var15 = class148.getObjectDefinition(var4); // L: 8066
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 8069
					var16 = var15.sizeX; // L: 8074
					var17 = var15.sizeY; // L: 8075
				} else {
					var16 = var15.sizeY; // L: 8070
					var17 = var15.sizeX; // L: 8071
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 8081
					var18 = (var16 >> 1) + var2; // L: 8082
					var19 = var2 + (var16 + 1 >> 1); // L: 8083
				} else {
					var18 = var2; // L: 8086
					var19 = var2 + 1; // L: 8087
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 8089
					var20 = var3 + (var17 >> 1); // L: 8090
					var21 = var3 + (var17 + 1 >> 1); // L: 8091
				} else {
					var20 = var3; // L: 8094
					var21 = var3 + 1; // L: 8095
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 8097
				int var23 = var22[var18][var20] + var22[var19][var20] + var22[var18][var21] + var22[var19][var21] >> 2; // L: 8098
				int var24 = (var2 << 7) + (var16 << 6); // L: 8099
				int var25 = (var3 << 7) + (var17 << 6); // L: 8100
				long var26 = SecureRandomFuture.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 8101
				int var28 = (var5 << 6) + var6; // L: 8102
				if (var15.int3 == 1) { // L: 8103
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 8104
					if (var15.animationId == -1 && var15.transforms == null) { // L: 8106
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8107
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 8108
					if (var15.interactType == 1) { // L: 8109
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8112
					if (var6 >= 12) { // L: 8120
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8122
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8123
						}

						var41.method3960(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 8124
						if (var15.interactType != 0) { // L: 8125
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 8128
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8130
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8131
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field969[var5], 0, var26, var28); // L: 8132
						if (var15.interactType != 0) { // L: 8133
							var14.method3721(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 8136
						if (var15.animationId == -1 && var15.transforms == null) { // L: 8138
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8139
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field970[var5], 0, var26, var28); // L: 8140
						if (var15.interactType != 0) { // L: 8141
							var14.method3721(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 8144
							var29 = var5 + 1 & 3; // L: 8145
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8148
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 8149
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 8150
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8153
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8154
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field969[var5], Tiles.field969[var29], var26, var28); // L: 8156
							if (var15.interactType != 0) { // L: 8157
								var14.method3721(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 8160
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8162
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8163
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field970[var5], 0, var26, var28); // L: 8164
							if (var15.interactType != 0) { // L: 8165
								var14.method3721(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 8168
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8170
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8171
							}

							var41.method3960(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 8172
							if (var15.interactType != 0) { // L: 8173
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 8176
							if (var15.animationId == -1 && var15.transforms == null) { // L: 8178
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8179
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field969[var5], 0, 0, 0, var26, var28); // L: 8180
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 8183
								var29 = 16; // L: 8184
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 8185
								if (var30 != 0L) { // L: 8186
									var29 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 8188
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8189
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field969[var5], 0, var29 * Tiles.field976[var5], var29 * Tiles.field966[var5], var26, var28); // L: 8190
							} else if (var6 == 6) { // L: 8193
								var29 = 8; // L: 8194
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 8195
								if (var30 != 0L) { // L: 8196
									var29 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 8198
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8199
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field973[var5], var29 * Tiles.field974[var5], var26, var28); // L: 8200
							} else if (var6 == 7) { // L: 8203
								int var35 = var5 + 2 & 3; // L: 8205
								if (var15.animationId == -1 && var15.transforms == null) { // L: 8206
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8207
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 8208
							} else if (var6 == 8) { // L: 8211
								var29 = 8; // L: 8212
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 8213
								if (0L != var30) { // L: 8214
									var29 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 8217
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 8218
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 8219
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 8220
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8223
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8224
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field973[var5], var29 * Tiles.field974[var5], var26, var28); // L: 8226
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 8114
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 8115
					}

					if (var36 != null) { // L: 8116
						var41.method3960(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 8117
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 8231
}
