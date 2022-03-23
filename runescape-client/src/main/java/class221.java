import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class221 {
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = -1143760795
	)
	static int field2647;

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lji;I)V",
		garbageValue = "1145478954"
	)
	static final void method4531(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7067
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (class263.field3013 == var0) { // L: 7068
			var2 = var1.method7789() * 4; // L: 7069
			var3 = var1.method7935(); // L: 7070
			var4 = var1.method7802(); // L: 7071
			var5 = var1.method7790(); // L: 7072
			var6 = (var5 >> 4 & 7) + FriendSystem.field803; // L: 7073
			var7 = (var5 & 7) + class9.field34; // L: 7074
			var8 = var1.method7935(); // L: 7075
			byte var41 = var1.method7955(); // L: 7076
			var10 = var1.method7927(); // L: 7077
			byte var42 = var1.method7925(); // L: 7078
			var12 = var1.readUnsignedByte() * 4; // L: 7079
			var13 = var1.method7790(); // L: 7080
			var14 = var1.method7935(); // L: 7081
			var9 = var41 + var6; // L: 7082
			var11 = var42 + var7; // L: 7083
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 >= 0 && var11 >= 0 && var9 < 104 && var11 < 104 && var14 != 65535) { // L: 7084
				var6 = var6 * 128 + 64; // L: 7085
				var7 = var7 * 128 + 64; // L: 7086
				var9 = var9 * 128 + 64; // L: 7087
				var11 = var11 * 128 + 64; // L: 7088
				Projectile var36 = new Projectile(var14, class160.Client_plane, var6, var7, Archive.getTileHeight(var6, var7, class160.Client_plane) - var2, var3 + Client.cycle, var8 + Client.cycle, var10, var13, var4, var12); // L: 7089
				var36.setDestination(var9, var11, Archive.getTileHeight(var9, var11, class160.Client_plane) - var12, var3 + Client.cycle); // L: 7090
				Client.projectiles.addFirst(var36); // L: 7091
			}

		} else if (class263.field3011 == var0) { // L: 7095
			var2 = var1.method7927(); // L: 7096
			var3 = (var2 >> 4 & 7) + FriendSystem.field803; // L: 7097
			var4 = (var2 & 7) + class9.field34; // L: 7098
			var5 = var1.readUnsignedByte(); // L: 7099
			var6 = var5 >> 2; // L: 7100
			var7 = var5 & 3; // L: 7101
			var8 = Client.field711[var6]; // L: 7102
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7103
				class137.updatePendingSpawn(class160.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1); // L: 7104
			}

		} else if (class263.field3006 == var0) { // L: 7108
			var2 = var1.readUnsignedShort(); // L: 7109
			var3 = var1.readUnsignedByte(); // L: 7110
			var4 = (var3 >> 4 & 7) + FriendSystem.field803; // L: 7111
			var5 = (var3 & 7) + class9.field34; // L: 7112
			var6 = var1.method7798(); // L: 7113
			var7 = var1.method7798(); // L: 7114
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7115
				NodeDeque var43 = Client.groundItems[class160.Client_plane][var4][var5]; // L: 7116
				if (var43 != null) { // L: 7117
					for (TileItem var35 = (TileItem)var43.last(); var35 != null; var35 = (TileItem)var43.previous()) { // L: 7118 7119 7124
						if ((var2 & 32767) == var35.id && var6 == var35.quantity) { // L: 7120
							var35.quantity = var7; // L: 7121
							break;
						}
					}

					class162.updateItemPile(var4, var5); // L: 7126
				}
			}

		} else if (class263.field3004 == var0) { // L: 7131
			var2 = var1.method7935(); // L: 7132
			var3 = var1.method7790(); // L: 7133
			var4 = var3 >> 2; // L: 7134
			var5 = var3 & 3; // L: 7135
			var6 = Client.field711[var4]; // L: 7136
			var7 = var1.method7789(); // L: 7137
			var8 = (var7 >> 4 & 7) + FriendSystem.field803; // L: 7138
			var9 = (var7 & 7) + class9.field34; // L: 7139
			if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 7140
				if (var6 == 0) { // L: 7141
					BoundaryObject var34 = FriendSystem.scene.method4150(class160.Client_plane, var8, var9); // L: 7142
					if (var34 != null) { // L: 7143
						var11 = class121.Entity_unpackID(var34.tag); // L: 7144
						if (var4 == 2) { // L: 7145
							var34.renderable1 = new DynamicObject(var11, 2, var5 + 4, class160.Client_plane, var8, var9, var2, false, var34.renderable1); // L: 7146
							var34.renderable2 = new DynamicObject(var11, 2, var5 + 1 & 3, class160.Client_plane, var8, var9, var2, false, var34.renderable2); // L: 7147
						} else {
							var34.renderable1 = new DynamicObject(var11, var4, var5, class160.Client_plane, var8, var9, var2, false, var34.renderable1); // L: 7149
						}
					}
				}

				if (var6 == 1) { // L: 7152
					WallDecoration var44 = FriendSystem.scene.method4224(class160.Client_plane, var8, var9); // L: 7153
					if (var44 != null) { // L: 7154
						var11 = class121.Entity_unpackID(var44.tag); // L: 7155
						if (var4 != 4 && var4 != 5) { // L: 7156
							if (var4 == 6) { // L: 7157
								var44.renderable1 = new DynamicObject(var11, 4, var5 + 4, class160.Client_plane, var8, var9, var2, false, var44.renderable1);
							} else if (var4 == 7) { // L: 7158
								var44.renderable1 = new DynamicObject(var11, 4, (var5 + 2 & 3) + 4, class160.Client_plane, var8, var9, var2, false, var44.renderable1);
							} else if (var4 == 8) { // L: 7159
								var44.renderable1 = new DynamicObject(var11, 4, var5 + 4, class160.Client_plane, var8, var9, var2, false, var44.renderable1); // L: 7160
								var44.renderable2 = new DynamicObject(var11, 4, (var5 + 2 & 3) + 4, class160.Client_plane, var8, var9, var2, false, var44.renderable2); // L: 7161
							}
						} else {
							var44.renderable1 = new DynamicObject(var11, 4, var5, class160.Client_plane, var8, var9, var2, false, var44.renderable1);
						}
					}
				}

				if (var6 == 2) { // L: 7165
					GameObject var45 = FriendSystem.scene.getGameObject(class160.Client_plane, var8, var9); // L: 7166
					if (var4 == 11) { // L: 7167
						var4 = 10;
					}

					if (var45 != null) {
						var45.renderable = new DynamicObject(class121.Entity_unpackID(var45.tag), var4, var5, class160.Client_plane, var8, var9, var2, false, var45.renderable); // L: 7168
					}
				}

				if (var6 == 3) { // L: 7170
					FloorDecoration var46 = FriendSystem.scene.getFloorDecoration(class160.Client_plane, var8, var9); // L: 7171
					if (var46 != null) { // L: 7172
						var46.renderable = new DynamicObject(class121.Entity_unpackID(var46.tag), 22, var5, class160.Client_plane, var8, var9, var2, false, var46.renderable);
					}
				}
			}

		} else {
			if (class263.field3010 == var0) { // L: 7177
				var2 = var1.method7927(); // L: 7178
				var3 = var1.method7789(); // L: 7179
				var4 = (var3 >> 4 & 7) + FriendSystem.field803; // L: 7180
				var5 = (var3 & 7) + class9.field34; // L: 7181
				var6 = var1.method7927(); // L: 7182
				var7 = var6 >> 4 & 15; // L: 7183
				var8 = var6 & 7; // L: 7184
				var9 = var1.method7798(); // L: 7185
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7186
					var10 = var7 + 1; // L: 7187
					if (class19.localPlayer.pathX[0] >= var4 - var10 && class19.localPlayer.pathX[0] <= var10 + var4 && class19.localPlayer.pathY[0] >= var5 - var10 && class19.localPlayer.pathY[0] <= var10 + var5 && Interpreter.clientPreferences.method2286() != 0 && var8 > 0 && Client.soundEffectCount < 50) { // L: 7188 7189
						Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 7190
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 7191
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 7192
						Client.soundEffects[Client.soundEffectCount] = null; // L: 7193
						Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16); // L: 7194
						++Client.soundEffectCount; // L: 7195
					}
				}
			}

			TileItem var32;
			if (class263.field3007 == var0) { // L: 7200
				var2 = var1.method7935(); // L: 7201
				var3 = var1.readUnsignedByte(); // L: 7202
				var4 = (var3 >> 4 & 7) + FriendSystem.field803; // L: 7203
				var5 = (var3 & 7) + class9.field34; // L: 7204
				var6 = var1.method7935(); // L: 7205
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7206
					var32 = new TileItem(); // L: 7207
					var32.id = var2; // L: 7208
					var32.quantity = var6; // L: 7209
					if (Client.groundItems[class160.Client_plane][var4][var5] == null) { // L: 7210
						Client.groundItems[class160.Client_plane][var4][var5] = new NodeDeque();
					}

					Client.groundItems[class160.Client_plane][var4][var5].addFirst(var32); // L: 7211
					class162.updateItemPile(var4, var5); // L: 7212
				}

			} else {
				if (class263.field3009 == var0) { // L: 7216
					byte var37 = var1.readByte(); // L: 7217
					var3 = var1.readUnsignedShort(); // L: 7218
					byte var38 = var1.method7792(); // L: 7219
					byte var39 = var1.readByte(); // L: 7220
					var6 = var1.method7971(); // L: 7221
					byte var40 = var1.method7792(); // L: 7222
					var8 = var1.method7935(); // L: 7223
					var9 = var1.method7790(); // L: 7224
					var10 = var9 >> 2; // L: 7225
					var11 = var9 & 3; // L: 7226
					var12 = Client.field711[var10]; // L: 7227
					var13 = var1.method7790(); // L: 7228
					var14 = (var13 >> 4 & 7) + FriendSystem.field803; // L: 7229
					int var15 = (var13 & 7) + class9.field34; // L: 7230
					int var16 = var1.method7935(); // L: 7231
					Player var17;
					if (var3 == Client.localPlayerIndex) { // L: 7233
						var17 = class19.localPlayer;
					} else {
						var17 = Client.players[var3]; // L: 7234
					}

					if (var17 != null) { // L: 7235
						ObjectComposition var18 = class116.getObjectDefinition(var8); // L: 7236
						int var19;
						int var20;
						if (var11 != 1 && var11 != 3) { // L: 7239
							var19 = var18.sizeX; // L: 7244
							var20 = var18.sizeY; // L: 7245
						} else {
							var19 = var18.sizeY; // L: 7240
							var20 = var18.sizeX; // L: 7241
						}

						int var21 = var14 + (var19 >> 1); // L: 7247
						int var22 = var14 + (var19 + 1 >> 1); // L: 7248
						int var23 = var15 + (var20 >> 1); // L: 7249
						int var24 = var15 + (var20 + 1 >> 1); // L: 7250
						int[][] var25 = Tiles.Tiles_heights[class160.Client_plane]; // L: 7251
						int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 7252
						int var27 = (var14 << 7) + (var19 << 6); // L: 7253
						int var28 = (var15 << 7) + (var20 << 6); // L: 7254
						Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28); // L: 7255
						if (var29 != null) { // L: 7256
							class137.updatePendingSpawn(class160.Client_plane, var14, var15, var12, -1, 0, 0, var16 + 1, var6 + 1); // L: 7257
							var17.animationCycleStart = var16 + Client.cycle; // L: 7258
							var17.animationCycleEnd = var6 + Client.cycle; // L: 7259
							var17.model0 = var29; // L: 7260
							var17.field1084 = var19 * 64 + var14 * 128; // L: 7261
							var17.field1095 = var20 * 64 + var15 * 128; // L: 7262
							var17.tileHeight2 = var26; // L: 7263
							byte var30;
							if (var38 > var40) { // L: 7264
								var30 = var38; // L: 7265
								var38 = var40; // L: 7266
								var40 = var30; // L: 7267
							}

							if (var39 > var37) { // L: 7269
								var30 = var39; // L: 7270
								var39 = var37; // L: 7271
								var37 = var30; // L: 7272
							}

							var17.minX = var14 + var38; // L: 7274
							var17.maxX = var14 + var40; // L: 7275
							var17.minY = var39 + var15; // L: 7276
							var17.maxY = var15 + var37; // L: 7277
						}
					}
				}

				if (class263.field3005 == var0) { // L: 7281
					var2 = var1.method7790(); // L: 7282
					var3 = var1.readUnsignedShort(); // L: 7283
					var4 = var1.method7971(); // L: 7284
					var5 = var1.method7789(); // L: 7285
					var6 = (var5 >> 4 & 7) + FriendSystem.field803; // L: 7286
					var7 = (var5 & 7) + class9.field34; // L: 7287
					if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 7288
						var6 = var6 * 128 + 64; // L: 7289
						var7 = var7 * 128 + 64; // L: 7290
						GraphicsObject var33 = new GraphicsObject(var3, class160.Client_plane, var6, var7, Archive.getTileHeight(var6, var7, class160.Client_plane) - var2, var4, Client.cycle); // L: 7291
						Client.graphicsObjects.addFirst(var33); // L: 7292
					}

				} else if (class263.field3012 == var0) { // L: 7296
					var2 = var1.method7927(); // L: 7297
					var3 = (var2 >> 4 & 7) + FriendSystem.field803; // L: 7298
					var4 = (var2 & 7) + class9.field34; // L: 7299
					var5 = var1.method7927(); // L: 7300
					var6 = var5 >> 2; // L: 7301
					var7 = var5 & 3; // L: 7302
					var8 = Client.field711[var6]; // L: 7303
					var9 = var1.method7935(); // L: 7304
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7305
						class137.updatePendingSpawn(class160.Client_plane, var3, var4, var8, var9, var6, var7, 0, -1); // L: 7306
					}

				} else if (class263.field3008 == var0) { // L: 7310
					var2 = var1.method7789(); // L: 7311
					var3 = (var2 >> 4 & 7) + FriendSystem.field803; // L: 7312
					var4 = (var2 & 7) + class9.field34; // L: 7313
					var5 = var1.method7935(); // L: 7314
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7315
						NodeDeque var31 = Client.groundItems[class160.Client_plane][var3][var4]; // L: 7316
						if (var31 != null) { // L: 7317
							for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 7318 7319 7324
								if ((var5 & 32767) == var32.id) { // L: 7320
									var32.remove(); // L: 7321
									break;
								}
							}

							if (var31.last() == null) { // L: 7326
								Client.groundItems[class160.Client_plane][var3][var4] = null;
							}

							class162.updateItemPile(var3, var4); // L: 7327
						}
					}

				}
			}
		}
	} // L: 7093 7106 7129 7175 7214 7294 7308 7330 7332
}
