import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("gf")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("f")
	@Export("url")
	final URL url;
	@ObfuscatedName("e")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("v")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 96
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 100
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "669779460"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "841550711"
	)
	static final void method2520(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 48
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 49
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 50
					class43.field307[0][var5][var4] = 127; // L: 51
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4]; // L: 53
					}

					if (var4 == var1 && var4 > 0) { // L: 54
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 55
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 59

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1235169435"
	)
	public static long method2516(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 52
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-79"
	)
	static void method2519(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 85
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 86
				int var5 = 0; // L: 87
				if (var1 > var4.field937) { // L: 88
					var5 += var1 - var4.field937;
				} else if (var1 < var4.x) { // L: 89
					var5 += var4.x - var1;
				}

				if (var2 > var4.field944) { // L: 90
					var5 += var2 - var4.field944;
				} else if (var2 < var4.y) { // L: 91
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field939 && class4.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) { // L: 92
					var5 -= 64; // L: 103
					if (var5 < 0) { // L: 104
						var5 = 0;
					}

					int var6 = (var4.field939 - var5) * class4.clientPreferences.areaSoundEffectsVolume / var4.field939; // L: 105
					if (var4.stream1 == null) { // L: 106
						if (var4.soundEffectId >= 0) { // L: 107
							SoundEffect var7 = SoundEffect.readSoundEffect(class26.archive4, var4.soundEffectId, 0); // L: 108
							if (var7 != null) { // L: 109
								RawSound var8 = var7.toRawSound().resample(WorldMapAreaData.decimator); // L: 110
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 111
								var9.setNumLoops(-1); // L: 112
								UserComparator7.pcmStreamMixer.addSubStream(var9); // L: 113
								var4.stream1 = var9; // L: 114
							}
						}
					} else {
						var4.stream1.method936(var6); // L: 118
					}

					if (var4.stream2 == null) { // L: 119
						if (var4.soundEffectIds != null && (var4.field945 -= var3) <= 0) { // L: 120
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 121
							SoundEffect var12 = SoundEffect.readSoundEffect(class26.archive4, var4.soundEffectIds[var11], 0); // L: 122
							if (var12 != null) { // L: 123
								RawSound var13 = var12.toRawSound().resample(WorldMapAreaData.decimator); // L: 124
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 125
								var10.setNumLoops(0); // L: 126
								UserComparator7.pcmStreamMixer.addSubStream(var10); // L: 127
								var4.stream2 = var10; // L: 128
								var4.field945 = var4.field941 + (int)(Math.random() * (double)(var4.field943 - var4.field941)); // L: 129
							}
						}
					} else {
						var4.stream2.method936(var6); // L: 134
						if (!var4.stream2.hasNext()) { // L: 135
							var4.stream2 = null; // L: 136
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 93
						UserComparator7.pcmStreamMixer.removeSubStream(var4.stream1); // L: 94
						var4.stream1 = null; // L: 95
					}

					if (var4.stream2 != null) { // L: 97
						UserComparator7.pcmStreamMixer.removeSubStream(var4.stream2); // L: 98
						var4.stream2 = null; // L: 99
					}
				}
			}
		}

	} // L: 140

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(IZZZS)Ljf;",
		garbageValue = "-28511"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 2419
		if (JagexCache.JagexCache_dat2File != null) { // L: 2420
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class369.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, WorldMapID.masterDisk, var0, var1, var2, var3); // L: 2421
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)V",
		garbageValue = "1535496544"
	)
	static final void method2511(class226 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7025
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		TileItem var35;
		if (class226.field2687 == var0) { // L: 7026
			var2 = var1.method6643(); // L: 7027
			var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047; // L: 7028
			var4 = (var2 & 7) + class15.field128; // L: 7029
			var5 = var1.method6653(); // L: 7030
			var6 = var1.method6652(); // L: 7031
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7032
				var35 = new TileItem(); // L: 7033
				var35.id = var5; // L: 7034
				var35.quantity = var6; // L: 7035
				if (Client.groundItems[SoundSystem.Client_plane][var3][var4] == null) { // L: 7036
					Client.groundItems[SoundSystem.Client_plane][var3][var4] = new NodeDeque();
				}

				Client.groundItems[SoundSystem.Client_plane][var3][var4].addFirst(var35); // L: 7037
				class26.updateItemPile(var3, var4); // L: 7038
			}

		} else {
			int var7;
			if (class226.field2693 == var0) { // L: 7042
				var2 = var1.readUnsignedShort(); // L: 7043
				var3 = var1.method6652(); // L: 7044
				var4 = var1.method6653(); // L: 7045
				var5 = var1.method6643(); // L: 7046
				var6 = (var5 >> 4 & 7) + WorldMapSection0.field2047; // L: 7047
				var7 = (var5 & 7) + class15.field128; // L: 7048
				if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 7049
					NodeDeque var42 = Client.groundItems[SoundSystem.Client_plane][var6][var7]; // L: 7050
					if (var42 != null) { // L: 7051
						for (TileItem var36 = (TileItem)var42.last(); var36 != null; var36 = (TileItem)var42.previous()) { // L: 7052 7053 7058
							if ((var4 & 32767) == var36.id && var2 == var36.quantity) { // L: 7054
								var36.quantity = var3; // L: 7055
								break;
							}
						}

						class26.updateItemPile(var6, var7); // L: 7060
					}
				}

			} else {
				int var8;
				int var9;
				if (class226.field2683 == var0) { // L: 7065
					var2 = var1.method6642(); // L: 7066
					var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047; // L: 7067
					var4 = (var2 & 7) + class15.field128; // L: 7068
					var5 = var1.method6651(); // L: 7069
					var6 = var1.method6643(); // L: 7070
					var7 = var6 >> 2; // L: 7071
					var8 = var6 & 3; // L: 7072
					var9 = Client.field682[var7]; // L: 7073
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7074
						class375.updatePendingSpawn(SoundSystem.Client_plane, var3, var4, var9, var5, var7, var8, 0, -1); // L: 7075
					}

				} else if (class226.field2684 == var0) { // L: 7079
					var2 = var1.method6642(); // L: 7080
					var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047; // L: 7081
					var4 = (var2 & 7) + class15.field128; // L: 7082
					var5 = var1.method6653(); // L: 7083
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7084
						NodeDeque var34 = Client.groundItems[SoundSystem.Client_plane][var3][var4]; // L: 7085
						if (var34 != null) { // L: 7086
							for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) { // L: 7087 7088 7093
								if ((var5 & 32767) == var35.id) { // L: 7089
									var35.remove(); // L: 7090
									break;
								}
							}

							if (var34.last() == null) { // L: 7095
								Client.groundItems[SoundSystem.Client_plane][var3][var4] = null;
							}

							class26.updateItemPile(var3, var4); // L: 7096
						}
					}

				} else {
					int var11;
					if (class226.field2686 == var0) { // L: 7101
						var2 = var1.method6643(); // L: 7102
						var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047; // L: 7103
						var4 = (var2 & 7) + class15.field128; // L: 7104
						var5 = var1.readUnsignedByte(); // L: 7105
						var6 = var5 >> 2; // L: 7106
						var7 = var5 & 3; // L: 7107
						var8 = Client.field682[var6]; // L: 7108
						var9 = var1.method6652(); // L: 7109
						if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) { // L: 7110
							if (var8 == 0) { // L: 7111
								BoundaryObject var33 = DevicePcmPlayerProvider.scene.method4058(SoundSystem.Client_plane, var3, var4); // L: 7112
								if (var33 != null) { // L: 7113
									var11 = Message.Entity_unpackID(var33.tag); // L: 7114
									if (var6 == 2) { // L: 7115
										var33.renderable1 = new DynamicObject(var11, 2, var7 + 4, SoundSystem.Client_plane, var3, var4, var9, false, var33.renderable1); // L: 7116
										var33.renderable2 = new DynamicObject(var11, 2, var7 + 1 & 3, SoundSystem.Client_plane, var3, var4, var9, false, var33.renderable2); // L: 7117
									} else {
										var33.renderable1 = new DynamicObject(var11, var6, var7, SoundSystem.Client_plane, var3, var4, var9, false, var33.renderable1); // L: 7119
									}
								}
							}

							if (var8 == 1) { // L: 7122
								WallDecoration var43 = DevicePcmPlayerProvider.scene.method4059(SoundSystem.Client_plane, var3, var4); // L: 7123
								if (var43 != null) { // L: 7124
									var11 = Message.Entity_unpackID(var43.tag); // L: 7125
									if (var6 != 4 && var6 != 5) { // L: 7126
										if (var6 == 6) { // L: 7127
											var43.renderable1 = new DynamicObject(var11, 4, var7 + 4, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable1);
										} else if (var6 == 7) { // L: 7128
											var43.renderable1 = new DynamicObject(var11, 4, (var7 + 2 & 3) + 4, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable1);
										} else if (var6 == 8) { // L: 7129
											var43.renderable1 = new DynamicObject(var11, 4, var7 + 4, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable1); // L: 7130
											var43.renderable2 = new DynamicObject(var11, 4, (var7 + 2 & 3) + 4, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable2); // L: 7131
										}
									} else {
										var43.renderable1 = new DynamicObject(var11, 4, var7, SoundSystem.Client_plane, var3, var4, var9, false, var43.renderable1);
									}
								}
							}

							if (var8 == 2) { // L: 7135
								GameObject var44 = DevicePcmPlayerProvider.scene.method4094(SoundSystem.Client_plane, var3, var4); // L: 7136
								if (var6 == 11) { // L: 7137
									var6 = 10;
								}

								if (var44 != null) { // L: 7138
									var44.renderable = new DynamicObject(Message.Entity_unpackID(var44.tag), var6, var7, SoundSystem.Client_plane, var3, var4, var9, false, var44.renderable);
								}
							}

							if (var8 == 3) { // L: 7140
								FloorDecoration var45 = DevicePcmPlayerProvider.scene.getFloorDecoration(SoundSystem.Client_plane, var3, var4); // L: 7141
								if (var45 != null) {
									var45.renderable = new DynamicObject(Message.Entity_unpackID(var45.tag), 22, var7, SoundSystem.Client_plane, var3, var4, var9, false, var45.renderable); // L: 7142
								}
							}
						}

					} else {
						int var10;
						if (class226.field2688 == var0) { // L: 7147
							var2 = var1.method6642(); // L: 7148
							var3 = var1.readUnsignedByte(); // L: 7149
							var4 = (var3 >> 4 & 7) + WorldMapSection0.field2047; // L: 7150
							var5 = (var3 & 7) + class15.field128; // L: 7151
							var6 = var1.readUnsignedShort(); // L: 7152
							var7 = var1.method6643(); // L: 7153
							var8 = var7 >> 4 & 15; // L: 7154
							var9 = var7 & 7; // L: 7155
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7156
								var10 = var8 + 1; // L: 7157
								if (class262.localPlayer.pathX[0] >= var4 - var10 && class262.localPlayer.pathX[0] <= var4 + var10 && class262.localPlayer.pathY[0] >= var5 - var10 && class262.localPlayer.pathY[0] <= var10 + var5 && class4.clientPreferences.areaSoundEffectsVolume != 0 && var9 > 0 && Client.soundEffectCount < 50) { // L: 7158 7159
									Client.soundEffectIds[Client.soundEffectCount] = var6; // L: 7160
									Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9; // L: 7161
									Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 7162
									Client.soundEffects[Client.soundEffectCount] = null; // L: 7163
									Client.soundLocations[Client.soundEffectCount] = var8 + (var5 << 8) + (var4 << 16); // L: 7164
									++Client.soundEffectCount; // L: 7165
								}
							}
						}

						if (class226.field2690 == var0) { // L: 7170
							var2 = var1.method6643(); // L: 7171
							var3 = (var2 >> 4 & 7) + WorldMapSection0.field2047; // L: 7172
							var4 = (var2 & 7) + class15.field128; // L: 7173
							var5 = var1.readUnsignedByte(); // L: 7174
							var6 = var5 >> 2; // L: 7175
							var7 = var5 & 3; // L: 7176
							var8 = Client.field682[var6]; // L: 7177
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7178
								class375.updatePendingSpawn(SoundSystem.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1); // L: 7179
							}

						} else {
							int var12;
							int var14;
							if (class226.field2691 == var0) { // L: 7183
								var2 = var1.readUnsignedShort(); // L: 7184
								var3 = var1.readUnsignedShort(); // L: 7185
								var4 = var1.method6642(); // L: 7186
								var5 = (var4 >> 4 & 7) + WorldMapSection0.field2047; // L: 7187
								var6 = (var4 & 7) + class15.field128; // L: 7188
								byte var38 = var1.method6750(); // L: 7189
								byte var39 = var1.method6750(); // L: 7190
								var9 = var1.method6642(); // L: 7191
								var10 = var9 >> 2; // L: 7192
								var11 = var9 & 3; // L: 7193
								var12 = Client.field682[var10]; // L: 7194
								byte var13 = var1.readByte(); // L: 7195
								var14 = var1.method6653(); // L: 7196
								byte var15 = var1.readByte(); // L: 7197
								int var16 = var1.method6651(); // L: 7198
								Player var17;
								if (var3 == Client.localPlayerIndex) { // L: 7200
									var17 = class262.localPlayer;
								} else {
									var17 = Client.players[var3]; // L: 7201
								}

								if (var17 != null) { // L: 7202
									ObjectComposition var18 = Tiles.getObjectDefinition(var2); // L: 7203
									int var19;
									int var20;
									if (var11 != 1 && var11 != 3) { // L: 7206
										var19 = var18.sizeX; // L: 7211
										var20 = var18.sizeY; // L: 7212
									} else {
										var19 = var18.sizeY; // L: 7207
										var20 = var18.sizeX; // L: 7208
									}

									int var21 = var5 + (var19 >> 1); // L: 7214
									int var22 = var5 + (var19 + 1 >> 1); // L: 7215
									int var23 = var6 + (var20 >> 1); // L: 7216
									int var24 = var6 + (var20 + 1 >> 1); // L: 7217
									int[][] var25 = Tiles.Tiles_heights[SoundSystem.Client_plane]; // L: 7218
									int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2; // L: 7219
									int var27 = (var5 << 7) + (var19 << 6); // L: 7220
									int var28 = (var6 << 7) + (var20 << 6); // L: 7221
									Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28); // L: 7222
									if (var29 != null) { // L: 7223
										class375.updatePendingSpawn(SoundSystem.Client_plane, var5, var6, var12, -1, 0, 0, var14 + 1, var16 + 1); // L: 7224
										var17.animationCycleStart = var14 + Client.cycle; // L: 7225
										var17.animationCycleEnd = var16 + Client.cycle; // L: 7226
										var17.model0 = var29; // L: 7227
										var17.field1185 = var19 * 64 + var5 * 128; // L: 7228
										var17.field1197 = var20 * 64 + var6 * 128; // L: 7229
										var17.tileHeight2 = var26; // L: 7230
										byte var30;
										if (var13 > var15) { // L: 7231
											var30 = var13; // L: 7232
											var13 = var15; // L: 7233
											var15 = var30; // L: 7234
										}

										if (var39 > var38) { // L: 7236
											var30 = var39; // L: 7237
											var39 = var38; // L: 7238
											var38 = var30; // L: 7239
										}

										var17.minX = var13 + var5; // L: 7241
										var17.maxX = var15 + var5; // L: 7242
										var17.minY = var6 + var39; // L: 7243
										var17.maxY = var6 + var38; // L: 7244
									}
								}
							}

							if (class226.field2689 == var0) { // L: 7248
								var2 = var1.method6757(); // L: 7249
								byte var37 = var1.method6619(); // L: 7250
								var4 = var1.method6651(); // L: 7251
								var5 = var1.method6653(); // L: 7252
								var6 = var1.method6644(); // L: 7253
								var7 = var1.method6652(); // L: 7254
								var8 = var1.readUnsignedByte(); // L: 7255
								var9 = (var8 >> 4 & 7) + WorldMapSection0.field2047; // L: 7256
								var10 = (var8 & 7) + class15.field128; // L: 7257
								var11 = var1.method6643(); // L: 7258
								byte var40 = var1.readByte(); // L: 7259
								int var41 = var1.method6644() * 4; // L: 7260
								var14 = var1.method6643() * 4; // L: 7261
								var3 = var37 + var9; // L: 7262
								var12 = var40 + var10; // L: 7263
								if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var3 >= 0 && var12 >= 0 && var3 < 104 && var12 < 104 && var7 != 65535) { // L: 7264
									var9 = var9 * 128 + 64; // L: 7265
									var10 = var10 * 128 + 64; // L: 7266
									var3 = var3 * 128 + 64; // L: 7267
									var12 = var12 * 128 + 64; // L: 7268
									Projectile var32 = new Projectile(var7, SoundSystem.Client_plane, var9, var10, ItemContainer.getTileHeight(var9, var10, SoundSystem.Client_plane) - var14, var4 + Client.cycle, var5 + Client.cycle, var6, var11, var2, var41); // L: 7269
									var32.setDestination(var3, var12, ItemContainer.getTileHeight(var3, var12, SoundSystem.Client_plane) - var41, var4 + Client.cycle); // L: 7270
									Client.projectiles.addFirst(var32); // L: 7271
								}

							} else if (class226.field2692 == var0) { // L: 7275
								var2 = var1.method6651(); // L: 7276
								var3 = var1.method6642(); // L: 7277
								var4 = (var3 >> 4 & 7) + WorldMapSection0.field2047; // L: 7278
								var5 = (var3 & 7) + class15.field128; // L: 7279
								var6 = var1.method6643(); // L: 7280
								var7 = var1.method6652(); // L: 7281
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7282
									var4 = var4 * 128 + 64; // L: 7283
									var5 = var5 * 128 + 64; // L: 7284
									GraphicsObject var31 = new GraphicsObject(var7, SoundSystem.Client_plane, var4, var5, ItemContainer.getTileHeight(var4, var5, SoundSystem.Client_plane) - var6, var2, Client.cycle); // L: 7285
									Client.graphicsObjects.addFirst(var31); // L: 7286
								}

							}
						}
					}
				}
			}
		}
	} // L: 7040 7063 7077 7099 7145 7181 7273 7288 7290
}
