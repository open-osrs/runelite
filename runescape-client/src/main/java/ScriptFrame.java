import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -364828753
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("f")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("y")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-128953674"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1213701936"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4046
		if (class93.localPlayer.x >> 7 == Client.destinationX && class93.localPlayer.y >> 7 == Client.destinationY) { // L: 4048
			Client.destinationX = 0; // L: 4049
		}

		Decimator.method1068(); // L: 4052
		GameObject.method4279(); // L: 4053
		GrandExchangeOfferOwnWorldComparator.addNpcsToScene(true); // L: 4054
		class373.method6474(); // L: 4055
		GrandExchangeOfferOwnWorldComparator.addNpcsToScene(false); // L: 4056

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4058 4059 4076
			if (var4.plane == class22.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4060
				if (Client.cycle >= var4.cycleStart) { // L: 4061
					if (var4.targetIndex > 0) { // L: 4062
						NPC var19 = Client.npcs[var4.targetIndex - 1]; // L: 4063
						if (var19 != null && var19.x >= 0 && var19.x < 13312 && var19.y >= 0 && var19.y < 13312) {
							var4.setDestination(var19.x, var19.y, class105.getTileHeight(var19.x, var19.y, var4.plane) - var4.endHeight, Client.cycle); // L: 4064
						}
					}

					if (var4.targetIndex < 0) { // L: 4066
						var6 = -var4.targetIndex - 1; // L: 4068
						Player var22;
						if (var6 == Client.localPlayerIndex) { // L: 4069
							var22 = class93.localPlayer;
						} else {
							var22 = Client.players[var6]; // L: 4070
						}

						if (var22 != null && var22.x >= 0 && var22.x < 13312 && var22.y >= 0 && var22.y < 13312) { // L: 4071
							var4.setDestination(var22.x, var22.y, class105.getTileHeight(var22.x, var22.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field913); // L: 4073
					AbstractSocket.scene.drawEntity(class22.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4074
				}
			} else {
				var4.remove();
			}
		}

		for (GraphicsObject var20 = (GraphicsObject)Client.graphicsObjects.last(); var20 != null; var20 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4080 4081 4088
			if (var20.plane == class22.Client_plane && !var20.isFinished) { // L: 4082
				if (Client.cycle >= var20.cycleStart) { // L: 4083
					var20.advance(Client.field913); // L: 4084
					if (var20.isFinished) { // L: 4085
						var20.remove();
					} else {
						AbstractSocket.scene.drawEntity(var20.plane, var20.x, var20.y, var20.height, 60, var20, 0, -1L, false); // L: 4086
					}
				}
			} else {
				var20.remove();
			}
		}

		UrlRequester.setViewportShape(var0, var1, var2, var3, true); // L: 4091
		var0 = Client.viewportOffsetX; // L: 4092
		var1 = Client.viewportOffsetY; // L: 4093
		var2 = Client.viewportWidth; // L: 4094
		var3 = Client.viewportHeight; // L: 4095
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4096
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4097
		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var18;
		if (!Client.isCameraLocked) { // L: 4098
			var18 = Client.camAngleX; // L: 4099
			if (Client.field727 / 256 > var18) { // L: 4100
				var18 = Client.field727 / 256;
			}

			if (Client.field693[4] && Client.field891[4] + 128 > var18) { // L: 4101
				var18 = Client.field891[4] + 128;
			}

			var5 = Client.camAngleY & 2047; // L: 4102
			var6 = RouteStrategy.oculusOrbFocalPointX; // L: 4103
			var7 = class17.field148; // L: 4104
			var8 = ModelData0.oculusOrbFocalPointY; // L: 4105
			var9 = SecureRandomFuture.method1980(var18); // L: 4106
			var9 = WorldMapDecoration.method3627(var9, var3); // L: 4108
			var10 = 2048 - var18 & 2047; // L: 4109
			var11 = 2048 - var5 & 2047; // L: 4110
			var12 = 0; // L: 4111
			var13 = 0; // L: 4112
			var14 = var9; // L: 4113
			int var15;
			int var16;
			int var17;
			if (var10 != 0) { // L: 4114
				var15 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4115
				var16 = Rasterizer3D.Rasterizer3D_cosine[var10]; // L: 4116
				var17 = var13 * var16 - var15 * var9 >> 16; // L: 4117
				var14 = var15 * var13 + var9 * var16 >> 16; // L: 4118
				var13 = var17; // L: 4119
			}

			if (var11 != 0) { // L: 4121
				var15 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4122
				var16 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4123
				var17 = var12 * var16 + var14 * var15 >> 16; // L: 4124
				var14 = var14 * var16 - var12 * var15 >> 16; // L: 4125
				var12 = var17; // L: 4126
			}

			MouseHandler.cameraX = var6 - var12; // L: 4128
			SecureRandomCallable.cameraY = var7 - var13; // L: 4129
			class105.cameraZ = var8 - var14; // L: 4130
			SpotAnimationDefinition.cameraPitch = var18; // L: 4131
			class376.cameraYaw = var5; // L: 4132
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (RouteStrategy.oculusOrbFocalPointX >> 7 != class93.localPlayer.x >> 7 || ModelData0.oculusOrbFocalPointY >> 7 != class93.localPlayer.y >> 7)) { // L: 4133 4134
				var15 = class93.localPlayer.plane; // L: 4135
				var16 = (RouteStrategy.oculusOrbFocalPointX >> 7) + VertexNormal.baseX; // L: 4136
				var17 = (ModelData0.oculusOrbFocalPointY >> 7) + SoundSystem.baseY; // L: 4137
				class4.method50(var16, var17, var15, true); // L: 4138
			}
		}

		if (!Client.isCameraLocked) { // L: 4144
			if (ObjectComposition.clientPreferences.roofsHidden) { // L: 4147
				var5 = class22.Client_plane; // L: 4148
			} else {
				label407: {
					var6 = 3; // L: 4151
					if (SpotAnimationDefinition.cameraPitch < 310) { // L: 4152
						label405: {
							if (Client.oculusOrbState == 1) { // L: 4155
								var7 = RouteStrategy.oculusOrbFocalPointX >> 7; // L: 4156
								var8 = ModelData0.oculusOrbFocalPointY >> 7; // L: 4157
							} else {
								var7 = class93.localPlayer.x >> 7; // L: 4160
								var8 = class93.localPlayer.y >> 7; // L: 4161
							}

							var9 = MouseHandler.cameraX >> 7; // L: 4163
							var10 = class105.cameraZ >> 7; // L: 4164
							if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 4165
								if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 4169
									if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) { // L: 4173
										var6 = class22.Client_plane;
									}

									if (var7 > var9) { // L: 4175
										var11 = var7 - var9;
									} else {
										var11 = var9 - var7; // L: 4176
									}

									if (var8 > var10) { // L: 4178
										var12 = var8 - var10;
									} else {
										var12 = var10 - var8; // L: 4179
									}

									if (var11 > var12) { // L: 4180
										var13 = var12 * 65536 / var11; // L: 4181
										var14 = 32768; // L: 4182

										while (true) {
											if (var7 == var9) { // L: 4183
												break label405;
											}

											if (var9 < var7) { // L: 4184
												++var9;
											} else if (var9 > var7) { // L: 4185
												--var9;
											}

											if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) { // L: 4186
												var6 = class22.Client_plane;
											}

											var14 += var13; // L: 4187
											if (var14 >= 65536) { // L: 4188
												var14 -= 65536; // L: 4189
												if (var10 < var8) { // L: 4190
													++var10;
												} else if (var10 > var8) { // L: 4191
													--var10;
												}

												if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) { // L: 4192
													var6 = class22.Client_plane;
												}
											}
										}
									} else {
										if (var12 > 0) { // L: 4196
											var13 = var11 * 65536 / var12; // L: 4197
											var14 = 32768; // L: 4198

											while (var10 != var8) { // L: 4199
												if (var10 < var8) { // L: 4200
													++var10;
												} else if (var10 > var8) { // L: 4201
													--var10;
												}

												if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) { // L: 4202
													var6 = class22.Client_plane;
												}

												var14 += var13; // L: 4203
												if (var14 >= 65536) { // L: 4204
													var14 -= 65536; // L: 4205
													if (var9 < var7) { // L: 4206
														++var9;
													} else if (var9 > var7) { // L: 4207
														--var9;
													}

													if ((Tiles.Tiles_renderFlags[class22.Client_plane][var9][var10] & 4) != 0) { // L: 4208
														var6 = class22.Client_plane;
													}
												}
											}
										}
										break label405;
									}
								}

								var5 = class22.Client_plane; // L: 4170
								break label407; // L: 4171
							}

							var5 = class22.Client_plane; // L: 4166
							break label407; // L: 4167
						}
					}

					if (class93.localPlayer.x >= 0 && class93.localPlayer.y >= 0 && class93.localPlayer.x < 13312 && class93.localPlayer.y < 13312) { // L: 4213
						if ((Tiles.Tiles_renderFlags[class22.Client_plane][class93.localPlayer.x >> 7][class93.localPlayer.y >> 7] & 4) != 0) { // L: 4217
							var6 = class22.Client_plane;
						}

						var5 = var6; // L: 4218
					} else {
						var5 = class22.Client_plane; // L: 4214
					}
				}
			}

			var18 = var5; // L: 4220
		} else {
			var18 = class32.method305(); // L: 4222
		}

		var5 = MouseHandler.cameraX; // L: 4223
		var6 = SecureRandomCallable.cameraY; // L: 4224
		var7 = class105.cameraZ; // L: 4225
		var8 = SpotAnimationDefinition.cameraPitch; // L: 4226
		var9 = class376.cameraYaw; // L: 4227

		for (var10 = 0; var10 < 5; ++var10) { // L: 4228
			if (Client.field693[var10]) { // L: 4229
				var11 = (int)(Math.random() * (double)(Client.field890[var10] * 2 + 1) - (double)Client.field890[var10] + Math.sin((double)Client.field893[var10] * ((double)Client.field892[var10] / 100.0D)) * (double)Client.field891[var10]); // L: 4230
				if (var10 == 0) { // L: 4231
					MouseHandler.cameraX += var11;
				}

				if (var10 == 1) { // L: 4232
					SecureRandomCallable.cameraY += var11;
				}

				if (var10 == 2) { // L: 4233
					class105.cameraZ += var11;
				}

				if (var10 == 3) { // L: 4234
					class376.cameraYaw = var11 + class376.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 4235
					SpotAnimationDefinition.cameraPitch += var11; // L: 4236
					if (SpotAnimationDefinition.cameraPitch < 128) { // L: 4237
						SpotAnimationDefinition.cameraPitch = 128;
					}

					if (SpotAnimationDefinition.cameraPitch > 383) { // L: 4238
						SpotAnimationDefinition.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 4242
		var11 = MouseHandler.MouseHandler_y; // L: 4243
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4244
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 4245
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 4246
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 4248
			class135.method2599(var10 - var0, var11 - var1); // L: 4249
		} else {
			class80.method1906(); // L: 4252
		}

		HealthBarUpdate.playPcmPlayers(); // L: 4254
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4255
		HealthBarUpdate.playPcmPlayers(); // L: 4256
		var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 4257
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4258
		AbstractSocket.scene.draw(MouseHandler.cameraX, SecureRandomCallable.cameraY, class105.cameraZ, SpotAnimationDefinition.cameraPitch, class376.cameraYaw, var18); // L: 4259
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 4260
		HealthBarUpdate.playPcmPlayers(); // L: 4261
		AbstractSocket.scene.clearTempGameObjects(); // L: 4262
		NetCache.method5025(var0, var1, var2, var3); // L: 4263
		ChatChannel.method2014(var0, var1); // L: 4264
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field913); // L: 4265
		class27.method283(var0, var1, var2, var3); // L: 4266
		MouseHandler.cameraX = var5; // L: 4267
		SecureRandomCallable.cameraY = var6; // L: 4268
		class105.cameraZ = var7; // L: 4269
		SpotAnimationDefinition.cameraPitch = var8; // L: 4270
		class376.cameraYaw = var9; // L: 4271
		if (Client.isLoading) { // L: 4272
			byte var21 = 0; // L: 4275
			var14 = var21 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4276
			if (var14 == 0) { // L: 4280
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4282
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4283
			DirectByteArrayCopier.drawLoadingMessage("Loading - please wait.", false); // L: 4284
		}

	} // L: 4286
}
