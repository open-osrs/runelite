import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class19 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 5670921231287266957L
	)
	long field166;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -3093921605955443203L
	)
	long field159;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	IterableNodeDeque field160;

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public class19(Buffer var1) {
		this.field159 = -1L; // L: 9
		this.field160 = new IterableNodeDeque(); // L: 10
		this.method262(var1); // L: 18
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-2004671532"
	)
	void method262(Buffer var1) {
		this.field166 = var1.readLong(); // L: 22
		this.field159 = var1.readLong(); // L: 23

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 24 25 35
			Object var3;
			if (var2 == 1) { // L: 27
				var3 = new class12(this);
			} else if (var2 == 4) {
				var3 = new class7(this); // L: 28
			} else if (var2 == 3) { // L: 29
				var3 = new class5(this);
			} else if (var2 == 2) { // L: 30
				var3 = new class20(this);
			} else {
				if (var2 != 5) { // L: 31
					throw new RuntimeException(""); // L: 32
				}

				var3 = new class25(this);
			}

			((class16)var3).vmethod326(var1); // L: 33
			this.field160.addFirst((Node)var3); // L: 34
		}

	} // L: 37

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;I)V",
		garbageValue = "1435583032"
	)
	public void method263(class3 var1) {
		if (this.field166 == var1.key && this.field159 == var1.field34) { // L: 40
			for (class16 var2 = (class16)this.field160.last(); var2 != null; var2 = (class16)this.field160.previous()) { // L: 41
				var2.vmethod314(var1); // L: 42
			}

			++var1.field34; // L: 44
		} else {
			throw new RuntimeException("");
		}
	} // L: 45

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lhh;B)V",
		garbageValue = "114"
	)
	static final void method267(class225 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7011
		int var3;
		int var4;
		int var6;
		int var7;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (class225.field2675 == var0) { // L: 7012
			byte var2 = var1.readByte(); // L: 7013
			var3 = var1.method6486(); // L: 7014
			var4 = var1.method6620(); // L: 7015
			byte var5 = var1.method6530(); // L: 7016
			var6 = var1.readUnsignedShort(); // L: 7017
			var7 = var1.method6620(); // L: 7018
			byte var8 = var1.method6480(); // L: 7019
			var9 = var1.method6478(); // L: 7020
			var10 = (var9 >> 4 & 7) + class7.field66; // L: 7021
			var11 = (var9 & 7) + VarpDefinition.field1542; // L: 7022
			var12 = var1.method6476(); // L: 7023
			var13 = var12 >> 2; // L: 7024
			var14 = var12 & 3; // L: 7025
			int var15 = Client.field677[var13]; // L: 7026
			byte var16 = var1.readByte(); // L: 7027
			Player var17;
			if (var6 == Client.localPlayerIndex) { // L: 7029
				var17 = class35.localPlayer;
			} else {
				var17 = Client.players[var6]; // L: 7030
			}

			if (var17 != null) { // L: 7031
				ObjectComposition var18 = AttackOption.getObjectDefinition(var3); // L: 7032
				int var19;
				int var20;
				if (var14 != 1 && var14 != 3) { // L: 7035
					var19 = var18.sizeX; // L: 7040
					var20 = var18.sizeY; // L: 7041
				} else {
					var19 = var18.sizeY; // L: 7036
					var20 = var18.sizeX; // L: 7037
				}

				int var21 = var10 + (var19 >> 1); // L: 7043
				int var22 = var10 + (var19 + 1 >> 1); // L: 7044
				int var23 = var11 + (var20 >> 1); // L: 7045
				int var24 = var11 + (var20 + 1 >> 1); // L: 7046
				int[][] var25 = Tiles.Tiles_heights[ParamComposition.Client_plane]; // L: 7047
				int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2; // L: 7048
				int var27 = (var10 << 7) + (var19 << 6); // L: 7049
				int var28 = (var11 << 7) + (var20 << 6); // L: 7050
				Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28); // L: 7051
				if (var29 != null) { // L: 7052
					class280.updatePendingSpawn(ParamComposition.Client_plane, var10, var11, var15, -1, 0, 0, var4 + 1, var7 + 1); // L: 7053
					var17.animationCycleStart = var4 + Client.cycle; // L: 7054
					var17.animationCycleEnd = var7 + Client.cycle; // L: 7055
					var17.model0 = var29; // L: 7056
					var17.field1174 = var19 * 64 + var10 * 128; // L: 7057
					var17.field1172 = var20 * 64 + var11 * 128; // L: 7058
					var17.tileHeight2 = var26; // L: 7059
					byte var30;
					if (var16 > var5) { // L: 7060
						var30 = var16; // L: 7061
						var16 = var5; // L: 7062
						var5 = var30; // L: 7063
					}

					if (var2 > var8) { // L: 7065
						var30 = var2; // L: 7066
						var2 = var8; // L: 7067
						var8 = var30; // L: 7068
					}

					var17.minX = var10 + var16; // L: 7070
					var17.maxX = var10 + var5; // L: 7071
					var17.minY = var11 + var2; // L: 7072
					var17.maxY = var11 + var8; // L: 7073
				}
			}
		}

		int var37;
		int var38;
		int var40;
		if (class225.field2681 == var0) { // L: 7077
			var37 = var1.method6620(); // L: 7078
			var3 = var1.method6478(); // L: 7079
			var4 = var3 >> 2; // L: 7080
			var38 = var3 & 3; // L: 7081
			var6 = Client.field677[var4]; // L: 7082
			var7 = var1.method6476(); // L: 7083
			var40 = (var7 >> 4 & 7) + class7.field66; // L: 7084
			var9 = (var7 & 7) + VarpDefinition.field1542; // L: 7085
			if (var40 >= 0 && var9 >= 0 && var40 < 104 && var9 < 104) { // L: 7086
				class280.updatePendingSpawn(ParamComposition.Client_plane, var40, var9, var6, var37, var4, var38, 0, -1); // L: 7087
			}

		} else if (class225.field2679 == var0) { // L: 7091
			var37 = var1.method6490(); // L: 7092
			var3 = var1.method6476() * 4; // L: 7093
			byte var39 = var1.method6526(); // L: 7094
			var38 = var1.method6477() * 4; // L: 7095
			var6 = var1.method6478(); // L: 7096
			var7 = (var6 >> 4 & 7) + class7.field66; // L: 7097
			var40 = (var6 & 7) + VarpDefinition.field1542; // L: 7098
			var9 = var1.method6478(); // L: 7099
			var10 = var1.method6486(); // L: 7100
			byte var41 = var1.method6526(); // L: 7101
			var12 = var1.method6648(); // L: 7102
			var13 = var1.readUnsignedShort(); // L: 7103
			var14 = var1.method6476(); // L: 7104
			var11 = var41 + var7; // L: 7105
			var4 = var39 + var40; // L: 7106
			if (var7 >= 0 && var40 >= 0 && var7 < 104 && var40 < 104 && var11 >= 0 && var4 >= 0 && var11 < 104 && var4 < 104 && var13 != 65535) { // L: 7107
				var7 = var7 * 128 + 64; // L: 7108
				var40 = var40 * 128 + 64; // L: 7109
				var11 = var11 * 128 + 64; // L: 7110
				var4 = var4 * 128 + 64; // L: 7111
				Projectile var36 = new Projectile(var13, ParamComposition.Client_plane, var7, var40, SceneTilePaint.getTileHeight(var7, var40, ParamComposition.Client_plane) - var3, var12 + Client.cycle, var10 + Client.cycle, var9, var14, var37, var38); // L: 7112
				var36.setDestination(var11, var4, SceneTilePaint.getTileHeight(var11, var4, ParamComposition.Client_plane) - var38, var12 + Client.cycle); // L: 7113
				Client.projectiles.addFirst(var36); // L: 7114
			}

		} else if (class225.field2674 == var0) { // L: 7118
			var37 = var1.method6620(); // L: 7119
			var3 = var1.method6486(); // L: 7120
			var4 = var1.method6620(); // L: 7121
			var38 = var1.readUnsignedByte(); // L: 7122
			var6 = (var38 >> 4 & 7) + class7.field66; // L: 7123
			var7 = (var38 & 7) + VarpDefinition.field1542; // L: 7124
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 7125
				NodeDeque var42 = Client.groundItems[ParamComposition.Client_plane][var6][var7]; // L: 7126
				if (var42 != null) { // L: 7127
					for (TileItem var35 = (TileItem)var42.last(); var35 != null; var35 = (TileItem)var42.previous()) { // L: 7128 7129 7134
						if ((var4 & 32767) == var35.id && var3 == var35.quantity) { // L: 7130
							var35.quantity = var37; // L: 7131
							break;
						}
					}

					Varcs.updateItemPile(var6, var7); // L: 7136
				}
			}

		} else {
			if (class225.field2678 == var0) { // L: 7141
				var37 = var1.method6476(); // L: 7142
				var3 = (var37 >> 4 & 7) + class7.field66; // L: 7143
				var4 = (var37 & 7) + VarpDefinition.field1542; // L: 7144
				var38 = var1.method6476(); // L: 7145
				var6 = var1.readUnsignedByte(); // L: 7146
				var7 = var6 >> 4 & 15; // L: 7147
				var40 = var6 & 7; // L: 7148
				var9 = var1.method6620(); // L: 7149
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7150
					var10 = var7 + 1; // L: 7151
					if (class35.localPlayer.pathX[0] >= var3 - var10 && class35.localPlayer.pathX[0] <= var3 + var10 && class35.localPlayer.pathY[0] >= var4 - var10 && class35.localPlayer.pathY[0] <= var10 + var4 && class12.clientPreferences.areaSoundEffectsVolume != 0 && var40 > 0 && Client.soundEffectCount < 50) { // L: 7152 7153
						Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 7154
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var40; // L: 7155
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var38; // L: 7156
						Client.soundEffects[Client.soundEffectCount] = null; // L: 7157
						Client.soundLocations[Client.soundEffectCount] = var7 + (var4 << 8) + (var3 << 16); // L: 7158
						++Client.soundEffectCount; // L: 7159
					}
				}
			}

			if (class225.field2680 == var0) { // L: 7164
				var37 = var1.method6477(); // L: 7165
				var3 = (var37 >> 4 & 7) + class7.field66; // L: 7166
				var4 = (var37 & 7) + VarpDefinition.field1542; // L: 7167
				var38 = var1.method6648(); // L: 7168
				var6 = var1.method6478(); // L: 7169
				var7 = var6 >> 2; // L: 7170
				var40 = var6 & 3; // L: 7171
				var9 = Client.field677[var7]; // L: 7172
				if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) { // L: 7173
					if (var9 == 0) { // L: 7174
						BoundaryObject var34 = class5.scene.method3960(ParamComposition.Client_plane, var3, var4); // L: 7175
						if (var34 != null) { // L: 7176
							var11 = class6.Entity_unpackID(var34.tag); // L: 7177
							if (var7 == 2) { // L: 7178
								var34.renderable1 = new DynamicObject(var11, 2, var40 + 4, ParamComposition.Client_plane, var3, var4, var38, false, var34.renderable1); // L: 7179
								var34.renderable2 = new DynamicObject(var11, 2, var40 + 1 & 3, ParamComposition.Client_plane, var3, var4, var38, false, var34.renderable2); // L: 7180
							} else {
								var34.renderable1 = new DynamicObject(var11, var7, var40, ParamComposition.Client_plane, var3, var4, var38, false, var34.renderable1); // L: 7182
							}
						}
					}

					if (var9 == 1) { // L: 7185
						WallDecoration var43 = class5.scene.method3924(ParamComposition.Client_plane, var3, var4); // L: 7186
						if (var43 != null) { // L: 7187
							var11 = class6.Entity_unpackID(var43.tag); // L: 7188
							if (var7 != 4 && var7 != 5) { // L: 7189
								if (var7 == 6) { // L: 7190
									var43.renderable1 = new DynamicObject(var11, 4, var40 + 4, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable1);
								} else if (var7 == 7) { // L: 7191
									var43.renderable1 = new DynamicObject(var11, 4, (var40 + 2 & 3) + 4, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable1);
								} else if (var7 == 8) { // L: 7192
									var43.renderable1 = new DynamicObject(var11, 4, var40 + 4, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable1); // L: 7193
									var43.renderable2 = new DynamicObject(var11, 4, (var40 + 2 & 3) + 4, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable2); // L: 7194
								}
							} else {
								var43.renderable1 = new DynamicObject(var11, 4, var40, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable1);
							}
						}
					}

					if (var9 == 2) { // L: 7198
						GameObject var44 = class5.scene.method3925(ParamComposition.Client_plane, var3, var4); // L: 7199
						if (var7 == 11) { // L: 7200
							var7 = 10;
						}

						if (var44 != null) { // L: 7201
							var44.renderable = new DynamicObject(class6.Entity_unpackID(var44.tag), var7, var40, ParamComposition.Client_plane, var3, var4, var38, false, var44.renderable);
						}
					}

					if (var9 == 3) { // L: 7203
						FloorDecoration var45 = class5.scene.getFloorDecoration(ParamComposition.Client_plane, var3, var4); // L: 7204
						if (var45 != null) { // L: 7205
							var45.renderable = new DynamicObject(class6.Entity_unpackID(var45.tag), 22, var40, ParamComposition.Client_plane, var3, var4, var38, false, var45.renderable);
						}
					}
				}

			} else {
				TileItem var32;
				if (class225.field2677 == var0) { // L: 7210
					var37 = var1.method6648(); // L: 7211
					var3 = var1.readUnsignedShort(); // L: 7212
					var4 = var1.readUnsignedByte(); // L: 7213
					var38 = (var4 >> 4 & 7) + class7.field66; // L: 7214
					var6 = (var4 & 7) + VarpDefinition.field1542; // L: 7215
					if (var38 >= 0 && var6 >= 0 && var38 < 104 && var6 < 104) { // L: 7216
						var32 = new TileItem(); // L: 7217
						var32.id = var3; // L: 7218
						var32.quantity = var37; // L: 7219
						if (Client.groundItems[ParamComposition.Client_plane][var38][var6] == null) { // L: 7220
							Client.groundItems[ParamComposition.Client_plane][var38][var6] = new NodeDeque();
						}

						Client.groundItems[ParamComposition.Client_plane][var38][var6].addFirst(var32); // L: 7221
						Varcs.updateItemPile(var38, var6); // L: 7222
					}

				} else if (class225.field2673 == var0) { // L: 7226
					var37 = var1.method6476(); // L: 7227
					var3 = var37 >> 2; // L: 7228
					var4 = var37 & 3; // L: 7229
					var38 = Client.field677[var3]; // L: 7230
					var6 = var1.method6476(); // L: 7231
					var7 = (var6 >> 4 & 7) + class7.field66; // L: 7232
					var40 = (var6 & 7) + VarpDefinition.field1542; // L: 7233
					if (var7 >= 0 && var40 >= 0 && var7 < 104 && var40 < 104) { // L: 7234
						class280.updatePendingSpawn(ParamComposition.Client_plane, var7, var40, var38, -1, var3, var4, 0, -1); // L: 7235
					}

				} else if (class225.field2682 == var0) { // L: 7239
					var37 = var1.readUnsignedShort(); // L: 7240
					var3 = var1.method6476(); // L: 7241
					var4 = var1.method6476(); // L: 7242
					var38 = (var4 >> 4 & 7) + class7.field66; // L: 7243
					var6 = (var4 & 7) + VarpDefinition.field1542; // L: 7244
					var7 = var1.method6648(); // L: 7245
					if (var38 >= 0 && var6 >= 0 && var38 < 104 && var6 < 104) { // L: 7246
						var38 = var38 * 128 + 64; // L: 7247
						var6 = var6 * 128 + 64; // L: 7248
						GraphicsObject var33 = new GraphicsObject(var37, ParamComposition.Client_plane, var38, var6, SceneTilePaint.getTileHeight(var38, var6, ParamComposition.Client_plane) - var3, var7, Client.cycle); // L: 7249
						Client.graphicsObjects.addFirst(var33); // L: 7250
					}

				} else if (class225.field2687 == var0) { // L: 7254
					var37 = var1.readUnsignedShort(); // L: 7255
					var3 = var1.method6476(); // L: 7256
					var4 = (var3 >> 4 & 7) + class7.field66; // L: 7257
					var38 = (var3 & 7) + VarpDefinition.field1542; // L: 7258
					if (var4 >= 0 && var38 >= 0 && var4 < 104 && var38 < 104) { // L: 7259
						NodeDeque var31 = Client.groundItems[ParamComposition.Client_plane][var4][var38]; // L: 7260
						if (var31 != null) { // L: 7261
							for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 7262 7263 7268
								if ((var37 & 32767) == var32.id) { // L: 7264
									var32.remove(); // L: 7265
									break;
								}
							}

							if (var31.last() == null) { // L: 7270
								Client.groundItems[ParamComposition.Client_plane][var4][var38] = null;
							}

							Varcs.updateItemPile(var4, var38); // L: 7271
						}
					}

				}
			}
		}
	} // L: 7089 7116 7139 7208 7224 7237 7252 7274 7276
}
