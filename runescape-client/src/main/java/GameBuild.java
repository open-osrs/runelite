import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("o")
	@Export("name")
	public final String name;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1492187841
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Loj;II)V",
		garbageValue = "-1245191259"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		int var4;
		int var6;
		byte[] var10000;
		int var19;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var19 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1244[var19] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3; // L: 80
					var10000 = Players.field1244; // L: 81
					var10000[var19] = (byte)(var10000[var19] | 2);
				} else {
					var6 = var0.readBits(1); // L: 84
					if (var6 == 0) { // L: 85
						var3 = DynamicObject.method1998(var0); // L: 86
						var10000 = Players.field1244; // L: 87
						var10000[var19] = (byte)(var10000[var19] | 2);
					} else {
						Projectile.readPlayerUpdate(var0, var19); // L: 90
					}
				}
			}
		}

		var0.exportIndex(); // L: 93
		if (var3 != 0) { // L: 94
			throw new RuntimeException(); // L: 95
		} else {
			var0.importIndex(); // L: 97

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 98
				var19 = Players.Players_indices[var4]; // L: 99
				if ((Players.field1244[var19] & 1) != 0) { // L: 100
					if (var3 > 0) { // L: 101
						--var3; // L: 102
						var10000 = Players.field1244; // L: 103
						var10000[var19] = (byte)(var10000[var19] | 2);
					} else {
						var6 = var0.readBits(1); // L: 106
						if (var6 == 0) { // L: 107
							var3 = DynamicObject.method1998(var0); // L: 108
							var10000 = Players.field1244; // L: 109
							var10000[var19] = (byte)(var10000[var19] | 2);
						} else {
							Projectile.readPlayerUpdate(var0, var19); // L: 112
						}
					}
				}
			}

			var0.exportIndex(); // L: 115
			if (var3 != 0) { // L: 116
				throw new RuntimeException(); // L: 117
			} else {
				var0.importIndex(); // L: 119

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 120
					var19 = Players.Players_emptyIndices[var4]; // L: 121
					if ((Players.field1244[var19] & 1) != 0) { // L: 122
						if (var3 > 0) { // L: 123
							--var3; // L: 124
							var10000 = Players.field1244; // L: 125
							var10000[var19] = (byte)(var10000[var19] | 2);
						} else {
							var6 = var0.readBits(1); // L: 128
							if (var6 == 0) { // L: 129
								var3 = DynamicObject.method1998(var0); // L: 130
								var10000 = Players.field1244; // L: 131
								var10000[var19] = (byte)(var10000[var19] | 2);
							} else if (WorldMapData_0.updateExternalPlayer(var0, var19)) { // L: 134
								var10000 = Players.field1244;
								var10000[var19] = (byte)(var10000[var19] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 137
				if (var3 != 0) { // L: 138
					throw new RuntimeException(); // L: 139
				} else {
					var0.importIndex(); // L: 141

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 142
						var19 = Players.Players_emptyIndices[var4]; // L: 143
						if ((Players.field1244[var19] & 1) == 0) { // L: 144
							if (var3 > 0) { // L: 145
								--var3; // L: 146
								var10000 = Players.field1244; // L: 147
								var10000[var19] = (byte)(var10000[var19] | 2);
							} else {
								var6 = var0.readBits(1); // L: 150
								if (var6 == 0) { // L: 151
									var3 = DynamicObject.method1998(var0); // L: 152
									var10000 = Players.field1244; // L: 153
									var10000[var19] = (byte)(var10000[var19] | 2);
								} else if (WorldMapData_0.updateExternalPlayer(var0, var19)) { // L: 156
									var10000 = Players.field1244;
									var10000[var19] = (byte)(var10000[var19] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 159
					if (var3 != 0) { // L: 160
						throw new RuntimeException(); // L: 161
					} else {
						Players.Players_count = 0; // L: 163
						Players.Players_emptyIdxCount = 0; // L: 164

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) { // L: 165
							var10000 = Players.field1244; // L: 166
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4]; // L: 167
							if (var5 != null) { // L: 168
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 169
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 173
							var4 = Players.Players_pendingUpdateIndices[var3]; // L: 174
							var5 = Client.players[var4]; // L: 175
							var6 = var0.readUnsignedByte(); // L: 176
							if ((var6 & 128) != 0) { // L: 177
								var6 += var0.readUnsignedByte() << 8;
							}

							byte var7 = -1; // L: 179
							if ((var6 & 4) != 0) { // L: 180
								var5.targetIndex = var0.method7120(); // L: 181
								if (var5.targetIndex == 65535) { // L: 182
									var5.targetIndex = -1;
								}
							}

							if ((var6 & 32) != 0) { // L: 184
								var5.field1112 = var0.method7120(); // L: 185
								if (var5.pathLength == 0) { // L: 186
									var5.orientation = var5.field1112; // L: 187
									var5.field1112 = -1; // L: 188
								}
							}

							int var8;
							int var11;
							int var12;
							int var15;
							if ((var6 & 16) != 0) { // L: 191
								var8 = var0.method7120(); // L: 192
								PlayerType var9 = (PlayerType)UserComparator4.findEnumerated(VarbitComposition.PlayerType_values(), var0.method6996()); // L: 193
								boolean var10 = var0.readUnsignedByte() == 1; // L: 194
								var11 = var0.readUnsignedByte(); // L: 195
								var12 = var0.offset; // L: 196
								if (var5.username != null && var5.appearance != null) { // L: 197
									boolean var13 = false; // L: 198
									if (var9.isUser && class112.friendSystem.isIgnored(var5.username)) { // L: 199 200
										var13 = true;
									}

									if (!var13 && Client.field539 == 0 && !var5.isHidden) { // L: 202
										Players.field1240.offset = 0; // L: 203
										var0.method7017(Players.field1240.array, 0, var11); // L: 204
										Players.field1240.offset = 0; // L: 205
										String var14 = AbstractFont.escapeBrackets(class19.method277(MilliClock.method2955(Players.field1240))); // L: 206
										var5.overheadText = var14.trim(); // L: 207
										var5.overheadTextColor = var8 >> 8; // L: 208
										var5.overheadTextEffect = var8 & 255; // L: 209
										var5.overheadTextCyclesRemaining = 150; // L: 210
										var5.isAutoChatting = var10; // L: 211
										var5.field1099 = var5 != HealthBarDefinition.localPlayer && var9.isUser && "" != Client.field692 && var14.toLowerCase().indexOf(Client.field692) == -1; // L: 212
										if (var9.isPrivileged) { // L: 214
											var15 = var10 ? 91 : 1;
										} else {
											var15 = var10 ? 90 : 2; // L: 215
										}

										if (var9.modIcon != -1) { // L: 216
											class397.addGameMessage(var15, SpriteMask.method4998(var9.modIcon) + var5.username.getName(), var14);
										} else {
											class397.addGameMessage(var15, var5.username.getName(), var14); // L: 217
										}
									}
								}

								var0.offset = var11 + var12; // L: 220
							}

							if ((var6 & 64) != 0) { // L: 222
								var5.overheadText = var0.readStringCp1252NullTerminated(); // L: 223
								if (var5.overheadText.charAt(0) == '~') { // L: 224
									var5.overheadText = var5.overheadText.substring(1); // L: 225
									class397.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 226
								} else if (var5 == HealthBarDefinition.localPlayer) { // L: 228
									class397.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 229
								}

								var5.isAutoChatting = false; // L: 231
								var5.overheadTextColor = 0; // L: 232
								var5.overheadTextEffect = 0; // L: 233
								var5.overheadTextCyclesRemaining = 150; // L: 234
							}

							if ((var6 & 1) != 0) { // L: 236
								var8 = var0.readUnsignedByte(); // L: 237
								byte[] var20 = new byte[var8]; // L: 238
								Buffer var16 = new Buffer(var20); // L: 239
								var0.method7131(var20, 0, var8); // L: 240
								Players.field1242[var4] = var16; // L: 241
								var5.read(var16); // L: 242
							}

							if ((var6 & 1024) != 0) { // L: 244
								for (var8 = 0; var8 < 3; ++var8) { // L: 245
									var5.actions[var8] = var0.readStringCp1252NullTerminated();
								}
							}

							int var17;
							if ((var6 & 8) != 0) { // L: 247
								var8 = var0.method7120(); // L: 248
								if (var8 == 65535) { // L: 249
									var8 = -1;
								}

								var17 = var0.method6996(); // L: 250
								FaceNormal.performPlayerAnimation(var5, var8, var17); // L: 251
							}

							if ((var6 & 512) != 0) { // L: 253
								var5.field1083 = var0.method6973(); // L: 254
								var5.field1100 = var0.readByte(); // L: 255
								var5.field1128 = var0.readByte(); // L: 256
								var5.field1130 = var0.readByte(); // L: 257
								var5.field1131 = var0.method7004() + Client.cycle; // L: 258
								var5.field1132 = var0.method7120() + Client.cycle; // L: 259
								var5.field1133 = var0.readUnsignedShort(); // L: 260
								if (var5.field1067) { // L: 261
									var5.field1083 += var5.tileX; // L: 262
									var5.field1100 += var5.tileY; // L: 263
									var5.field1128 += var5.tileX; // L: 264
									var5.field1130 += var5.tileY; // L: 265
									var5.pathLength = 0; // L: 266
								} else {
									var5.field1083 += var5.pathX[0]; // L: 269
									var5.field1100 += var5.pathY[0]; // L: 270
									var5.field1128 += var5.pathX[0]; // L: 271
									var5.field1130 += var5.pathY[0]; // L: 272
									var5.pathLength = 1; // L: 273
								}

								var5.field1144 = 0; // L: 275
							}

							if ((var6 & 4096) != 0) { // L: 277
								var7 = var0.method6999(); // L: 278
							}

							if ((var6 & 256) != 0) { // L: 280
								var5.spotAnimation = var0.method7004(); // L: 281
								var8 = var0.readInt(); // L: 282
								var5.field1126 = var8 >> 16; // L: 283
								var5.field1125 = (var8 & 65535) + Client.cycle; // L: 284
								var5.spotAnimationFrame = 0; // L: 285
								var5.spotAnimationFrameCycle = 0; // L: 286
								if (var5.field1125 > Client.cycle) { // L: 287
									var5.spotAnimationFrame = -1;
								}

								if (var5.spotAnimation == 65535) { // L: 288
									var5.spotAnimation = -1;
								}
							}

							if ((var6 & 2048) != 0) { // L: 290
								Players.field1241[var4] = var0.method6999(); // L: 291
							}

							if ((var6 & 2) != 0) { // L: 293
								var8 = var0.method6997(); // L: 294
								int var18;
								int var21;
								int var23;
								if (var8 > 0) { // L: 295
									for (var17 = 0; var17 < var8; ++var17) { // L: 296
										var11 = -1; // L: 298
										var12 = -1; // L: 299
										var23 = -1; // L: 300
										var21 = var0.readUShortSmart(); // L: 301
										if (var21 == 32767) { // L: 302
											var21 = var0.readUShortSmart(); // L: 303
											var12 = var0.readUShortSmart(); // L: 304
											var11 = var0.readUShortSmart(); // L: 305
											var23 = var0.readUShortSmart(); // L: 306
										} else if (var21 != 32766) { // L: 308
											var12 = var0.readUShortSmart(); // L: 309
										} else {
											var21 = -1; // L: 311
										}

										var18 = var0.readUShortSmart(); // L: 312
										var5.addHitSplat(var21, var12, var11, var23, Client.cycle, var18); // L: 313
									}
								}

								var17 = var0.method6995(); // L: 316
								if (var17 > 0) { // L: 317
									for (var21 = 0; var21 < var17; ++var21) { // L: 318
										var11 = var0.readUShortSmart(); // L: 319
										var12 = var0.readUShortSmart(); // L: 320
										if (var12 != 32767) { // L: 321
											var23 = var0.readUShortSmart(); // L: 322
											var18 = var0.method6997(); // L: 323
											var15 = var12 > 0 ? var0.method6997() : var18; // L: 324
											var5.addHealthBar(var11, Client.cycle, var12, var23, var18, var15); // L: 325
										} else {
											var5.removeHealthBar(var11); // L: 327
										}
									}
								}
							}

							if (var5.field1067) { // L: 331
								if (var7 == 127) { // L: 332
									var5.resetPath(var5.tileX, var5.tileY);
								} else {
									byte var22;
									if (var7 != -1) { // L: 335
										var22 = var7;
									} else {
										var22 = Players.field1241[var4]; // L: 336
									}

									var5.method2109(var5.tileX, var5.tileY, var22); // L: 337
								}
							}
						}

						if (var0.offset - var2 != var1) { // L: 344
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 345
						}
					}
				}
			}
		}
	} // L: 347
}
