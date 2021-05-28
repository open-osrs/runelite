import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 952681323
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -509167035
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 950473561
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1257822241
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1720897143
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lhj;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("o")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1099123981
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 961427167
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("g")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("a")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("k")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1695083523
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1060231869
	)
	int field2254;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -726038297
	)
	int field2244;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1501732115
	)
	int field2235;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5]; // L: 17
		this.gameObjectEdgeMasks = new int[5]; // L: 18
		this.gameObjectsEdgeMask = 0; // L: 19
		this.originalPlane = this.plane = var1; // L: 31
		this.x = var2; // L: 32
		this.y = var3; // L: 33
	} // L: 34

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lha;I)V",
		garbageValue = "236848204"
	)
	static final void method3843(class225 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 6933
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class225.field2683 == var0) { // L: 6934
			var2 = var1.method6595(); // L: 6935
			var3 = (var2 >> 4 & 7) + Occluder.field2387; // L: 6936
			var4 = (var2 & 7) + class69.field596; // L: 6937
			var5 = var1.method6595(); // L: 6938
			var6 = var1.readUnsignedByte(); // L: 6939
			var7 = var6 >> 4 & 15; // L: 6940
			var8 = var6 & 7; // L: 6941
			var9 = var1.method6603(); // L: 6942
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 6943
				var10 = var7 + 1; // L: 6944
				if (class93.localPlayer.pathX[0] >= var3 - var10 && class93.localPlayer.pathX[0] <= var3 + var10 && class93.localPlayer.pathY[0] >= var4 - var10 && class93.localPlayer.pathY[0] <= var10 + var4 && ObjectComposition.clientPreferences.areaSoundEffectsVolume != 0 && var8 > 0 && Client.soundEffectCount < 50) { // L: 6945 6946
					Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 6947
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 6948
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5; // L: 6949
					Client.soundEffects[Client.soundEffectCount] = null; // L: 6950
					Client.soundLocations[Client.soundEffectCount] = var7 + (var4 << 8) + (var3 << 16); // L: 6951
					++Client.soundEffectCount; // L: 6952
				}
			}
		}

		if (class225.field2688 == var0) { // L: 6957
			var2 = var1.method6603(); // L: 6958
			var3 = var1.method6549(); // L: 6959
			var4 = var3 >> 2; // L: 6960
			var5 = var3 & 3; // L: 6961
			var6 = Client.field702[var4]; // L: 6962
			var7 = var1.method6595(); // L: 6963
			var8 = (var7 >> 4 & 7) + Occluder.field2387; // L: 6964
			var9 = (var7 & 7) + class69.field596; // L: 6965
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 6966
				DevicePcmPlayerProvider.updatePendingSpawn(class22.Client_plane, var8, var9, var6, var2, var4, var5, 0, -1); // L: 6967
			}

		} else if (class225.field2680 == var0) { // L: 6971
			var2 = var1.method6603(); // L: 6972
			var3 = var1.method6604(); // L: 6973
			var4 = var1.method6603(); // L: 6974
			var5 = var1.readUnsignedByte(); // L: 6975
			var6 = (var5 >> 4 & 7) + Occluder.field2387; // L: 6976
			var7 = (var5 & 7) + class69.field596; // L: 6977
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 6978
				NodeDeque var42 = Client.groundItems[class22.Client_plane][var6][var7]; // L: 6979
				if (var42 != null) { // L: 6980
					for (TileItem var36 = (TileItem)var42.last(); var36 != null; var36 = (TileItem)var42.previous()) { // L: 6981 6982 6987
						if ((var4 & 32767) == var36.id && var3 == var36.quantity) { // L: 6983
							var36.quantity = var2; // L: 6984
							break;
						}
					}

					ClanSettings.updateItemPile(var6, var7); // L: 6989
				}
			}

		} else {
			int var11;
			if (class225.field2684 == var0) { // L: 6994
				var2 = var1.method6671(); // L: 6995
				var3 = (var2 >> 4 & 7) + Occluder.field2387; // L: 6996
				var4 = (var2 & 7) + class69.field596; // L: 6997
				var5 = var1.method6605(); // L: 6998
				var6 = var1.method6549(); // L: 6999
				var7 = var6 >> 2; // L: 7000
				var8 = var6 & 3; // L: 7001
				var9 = Client.field702[var7]; // L: 7002
				if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) { // L: 7003
					if (var9 == 0) { // L: 7004
						BoundaryObject var35 = AbstractSocket.scene.method4089(class22.Client_plane, var3, var4); // L: 7005
						if (var35 != null) { // L: 7006
							var11 = class93.Entity_unpackID(var35.tag); // L: 7007
							if (var7 == 2) { // L: 7008
								var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, class22.Client_plane, var3, var4, var5, false, var35.renderable1); // L: 7009
								var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class22.Client_plane, var3, var4, var5, false, var35.renderable2); // L: 7010
							} else {
								var35.renderable1 = new DynamicObject(var11, var7, var8, class22.Client_plane, var3, var4, var5, false, var35.renderable1); // L: 7012
							}
						}
					}

					if (var9 == 1) { // L: 7015
						WallDecoration var43 = AbstractSocket.scene.method3948(class22.Client_plane, var3, var4); // L: 7016
						if (var43 != null) { // L: 7017
							var11 = class93.Entity_unpackID(var43.tag); // L: 7018
							if (var7 != 4 && var7 != 5) { // L: 7019
								if (var7 == 6) { // L: 7020
									var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, class22.Client_plane, var3, var4, var5, false, var43.renderable1);
								} else if (var7 == 7) { // L: 7021
									var43.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class22.Client_plane, var3, var4, var5, false, var43.renderable1);
								} else if (var7 == 8) { // L: 7022
									var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, class22.Client_plane, var3, var4, var5, false, var43.renderable1); // L: 7023
									var43.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class22.Client_plane, var3, var4, var5, false, var43.renderable2); // L: 7024
								}
							} else {
								var43.renderable1 = new DynamicObject(var11, 4, var8, class22.Client_plane, var3, var4, var5, false, var43.renderable1);
							}
						}
					}

					if (var9 == 2) { // L: 7028
						GameObject var44 = AbstractSocket.scene.method3926(class22.Client_plane, var3, var4); // L: 7029
						if (var7 == 11) { // L: 7030
							var7 = 10;
						}

						if (var44 != null) { // L: 7031
							var44.renderable = new DynamicObject(class93.Entity_unpackID(var44.tag), var7, var8, class22.Client_plane, var3, var4, var5, false, var44.renderable);
						}
					}

					if (var9 == 3) { // L: 7033
						FloorDecoration var45 = AbstractSocket.scene.getFloorDecoration(class22.Client_plane, var3, var4); // L: 7034
						if (var45 != null) { // L: 7035
							var45.renderable = new DynamicObject(class93.Entity_unpackID(var45.tag), 22, var8, class22.Client_plane, var3, var4, var5, false, var45.renderable);
						}
					}
				}

			} else if (class225.field2682 == var0) { // L: 7040
				var2 = var1.method6595(); // L: 7041
				var3 = var2 >> 2; // L: 7042
				var4 = var2 & 3; // L: 7043
				var5 = Client.field702[var3]; // L: 7044
				var6 = var1.method6595(); // L: 7045
				var7 = (var6 >> 4 & 7) + Occluder.field2387; // L: 7046
				var8 = (var6 & 7) + class69.field596; // L: 7047
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7048
					DevicePcmPlayerProvider.updatePendingSpawn(class22.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1); // L: 7049
				}

			} else {
				TileItem var32;
				if (class225.field2685 == var0) { // L: 7053
					var2 = var1.readUnsignedShort(); // L: 7054
					var3 = var1.method6595(); // L: 7055
					var4 = (var3 >> 4 & 7) + Occluder.field2387; // L: 7056
					var5 = (var3 & 7) + class69.field596; // L: 7057
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7058
						NodeDeque var34 = Client.groundItems[class22.Client_plane][var4][var5]; // L: 7059
						if (var34 != null) { // L: 7060
							for (var32 = (TileItem)var34.last(); var32 != null; var32 = (TileItem)var34.previous()) { // L: 7061 7062 7067
								if ((var2 & 32767) == var32.id) { // L: 7063
									var32.remove(); // L: 7064
									break;
								}
							}

							if (var34.last() == null) { // L: 7069
								Client.groundItems[class22.Client_plane][var4][var5] = null;
							}

							ClanSettings.updateItemPile(var4, var5); // L: 7070
						}
					}

				} else {
					int var12;
					int var13;
					int var14;
					if (class225.field2686 == var0) { // L: 7075
						var2 = var1.method6726(); // L: 7076
						var3 = var1.method6595() * 4; // L: 7077
						byte var38 = var1.method6559(); // L: 7078
						var5 = var1.method6671() * 4; // L: 7079
						var6 = var1.method6549(); // L: 7080
						var7 = (var6 >> 4 & 7) + Occluder.field2387; // L: 7081
						var8 = (var6 & 7) + class69.field596; // L: 7082
						var9 = var1.method6549(); // L: 7083
						var10 = var1.method6604(); // L: 7084
						byte var41 = var1.method6559(); // L: 7085
						var12 = var1.method6605(); // L: 7086
						var13 = var1.readUnsignedShort(); // L: 7087
						var14 = var1.method6595(); // L: 7088
						var11 = var41 + var7; // L: 7089
						var4 = var38 + var8; // L: 7090
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var11 >= 0 && var4 >= 0 && var11 < 104 && var4 < 104 && var13 != 65535) { // L: 7091
							var7 = var7 * 128 + 64; // L: 7092
							var8 = var8 * 128 + 64; // L: 7093
							var11 = var11 * 128 + 64; // L: 7094
							var4 = var4 * 128 + 64; // L: 7095
							Projectile var33 = new Projectile(var13, class22.Client_plane, var7, var8, class105.getTileHeight(var7, var8, class22.Client_plane) - var3, var12 + Client.cycle, var10 + Client.cycle, var9, var14, var2, var5); // L: 7096
							var33.setDestination(var11, var4, class105.getTileHeight(var11, var4, class22.Client_plane) - var5, var12 + Client.cycle); // L: 7097
							Client.projectiles.addFirst(var33); // L: 7098
						}

					} else {
						if (class225.field2681 == var0) { // L: 7102
							byte var37 = var1.readByte(); // L: 7103
							var3 = var1.method6604(); // L: 7104
							var4 = var1.method6603(); // L: 7105
							byte var39 = var1.method6597(); // L: 7106
							var6 = var1.readUnsignedShort(); // L: 7107
							var7 = var1.method6603(); // L: 7108
							byte var40 = var1.method6593(); // L: 7109
							var9 = var1.method6549(); // L: 7110
							var10 = (var9 >> 4 & 7) + Occluder.field2387; // L: 7111
							var11 = (var9 & 7) + class69.field596; // L: 7112
							var12 = var1.method6595(); // L: 7113
							var13 = var12 >> 2; // L: 7114
							var14 = var12 & 3; // L: 7115
							int var15 = Client.field702[var13]; // L: 7116
							byte var16 = var1.readByte(); // L: 7117
							Player var17;
							if (var6 == Client.localPlayerIndex) { // L: 7119
								var17 = class93.localPlayer;
							} else {
								var17 = Client.players[var6]; // L: 7120
							}

							if (var17 != null) { // L: 7121
								ObjectComposition var18 = class23.getObjectDefinition(var3); // L: 7122
								int var19;
								int var20;
								if (var14 != 1 && var14 != 3) { // L: 7125
									var19 = var18.sizeX; // L: 7130
									var20 = var18.sizeY; // L: 7131
								} else {
									var19 = var18.sizeY; // L: 7126
									var20 = var18.sizeX; // L: 7127
								}

								int var21 = var10 + (var19 >> 1); // L: 7133
								int var22 = var10 + (var19 + 1 >> 1); // L: 7134
								int var23 = var11 + (var20 >> 1); // L: 7135
								int var24 = var11 + (var20 + 1 >> 1); // L: 7136
								int[][] var25 = Tiles.Tiles_heights[class22.Client_plane]; // L: 7137
								int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2; // L: 7138
								int var27 = (var10 << 7) + (var19 << 6); // L: 7139
								int var28 = (var11 << 7) + (var20 << 6); // L: 7140
								Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28); // L: 7141
								if (var29 != null) { // L: 7142
									DevicePcmPlayerProvider.updatePendingSpawn(class22.Client_plane, var10, var11, var15, -1, 0, 0, var4 + 1, var7 + 1); // L: 7143
									var17.animationCycleStart = var4 + Client.cycle; // L: 7144
									var17.animationCycleEnd = var7 + Client.cycle; // L: 7145
									var17.model0 = var29; // L: 7146
									var17.field1202 = var19 * 64 + var10 * 128; // L: 7147
									var17.field1220 = var20 * 64 + var11 * 128; // L: 7148
									var17.tileHeight2 = var26; // L: 7149
									byte var30;
									if (var16 > var39) { // L: 7150
										var30 = var16; // L: 7151
										var16 = var39; // L: 7152
										var39 = var30; // L: 7153
									}

									if (var37 > var40) { // L: 7155
										var30 = var37; // L: 7156
										var37 = var40; // L: 7157
										var40 = var30; // L: 7158
									}

									var17.minX = var16 + var10; // L: 7160
									var17.maxX = var10 + var39; // L: 7161
									var17.minY = var11 + var37; // L: 7162
									var17.maxY = var11 + var40; // L: 7163
								}
							}
						}

						if (class225.field2687 == var0) { // L: 7167
							var2 = var1.method6605(); // L: 7168
							var3 = var1.readUnsignedShort(); // L: 7169
							var4 = var1.readUnsignedByte(); // L: 7170
							var5 = (var4 >> 4 & 7) + Occluder.field2387; // L: 7171
							var6 = (var4 & 7) + class69.field596; // L: 7172
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7173
								var32 = new TileItem(); // L: 7174
								var32.id = var3; // L: 7175
								var32.quantity = var2; // L: 7176
								if (Client.groundItems[class22.Client_plane][var5][var6] == null) { // L: 7177
									Client.groundItems[class22.Client_plane][var5][var6] = new NodeDeque();
								}

								Client.groundItems[class22.Client_plane][var5][var6].addFirst(var32); // L: 7178
								ClanSettings.updateItemPile(var5, var6); // L: 7179
							}

						} else if (class225.field2689 == var0) { // L: 7183
							var2 = var1.readUnsignedShort(); // L: 7184
							var3 = var1.method6595(); // L: 7185
							var4 = var1.method6595(); // L: 7186
							var5 = (var4 >> 4 & 7) + Occluder.field2387; // L: 7187
							var6 = (var4 & 7) + class69.field596; // L: 7188
							var7 = var1.method6605(); // L: 7189
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7190
								var5 = var5 * 128 + 64; // L: 7191
								var6 = var6 * 128 + 64; // L: 7192
								GraphicsObject var31 = new GraphicsObject(var2, class22.Client_plane, var5, var6, class105.getTileHeight(var5, var6, class22.Client_plane) - var3, var7, Client.cycle); // L: 7193
								Client.graphicsObjects.addFirst(var31); // L: 7194
							}

						}
					}
				}
			}
		}
	} // L: 6969 6992 7038 7051 7073 7100 7181 7196 7198
}
