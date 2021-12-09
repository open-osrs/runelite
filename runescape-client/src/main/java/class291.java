import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class291 {
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-109"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 5147
		ReflectionCheck.method664(); // L: 5148
		class9.method88(); // L: 5149
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 5151
			Buddy.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 5152
		}

		MouseHandler.addNpcsToScene(true); // L: 5155
		int var4 = Players.Players_count; // L: 5157
		int[] var5 = Players.Players_indices; // L: 5158

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 5159
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 5160
				Buddy.addPlayerToScene(Client.players[var5[var6]], true); // L: 5161
			}
		}

		MouseHandler.addNpcsToScene(false); // L: 5164

		for (Projectile var30 = (Projectile)Client.projectiles.last(); var30 != null; var30 = (Projectile)Client.projectiles.previous()) { // L: 5166 5167 5184
			if (var30.plane == class20.Client_plane && Client.cycle <= var30.cycleEnd) { // L: 5168
				if (Client.cycle >= var30.cycleStart) { // L: 5169
					if (var30.targetIndex > 0) { // L: 5170
						NPC var34 = Client.npcs[var30.targetIndex - 1]; // L: 5171
						if (var34 != null && var34.x >= 0 && var34.x < 13312 && var34.y >= 0 && var34.y < 13312) { // L: 5172
							var30.setDestination(var34.x, var34.y, FaceNormal.getTileHeight(var34.x, var34.y, var30.plane) - var30.endHeight, Client.cycle);
						}
					}

					if (var30.targetIndex < 0) { // L: 5174
						var6 = -var30.targetIndex - 1; // L: 5176
						Player var35;
						if (var6 == Client.localPlayerIndex) { // L: 5177
							var35 = class340.localPlayer;
						} else {
							var35 = Client.players[var6]; // L: 5178
						}

						if (var35 != null && var35.x >= 0 && var35.x < 13312 && var35.y >= 0 && var35.y < 13312) { // L: 5179
							var30.setDestination(var35.x, var35.y, FaceNormal.getTileHeight(var35.x, var35.y, var30.plane) - var30.endHeight, Client.cycle);
						}
					}

					var30.advance(Client.field538); // L: 5181
					class7.scene.drawEntity(class20.Client_plane, (int)var30.x, (int)var30.y, (int)var30.z, 60, var30, var30.yaw, -1L, false); // L: 5182
				}
			} else {
				var30.remove();
			}
		}

		class33.method656(); // L: 5187
		WorldMapDecoration.setViewportShape(var0, var1, var2, var3, true); // L: 5188
		var0 = Client.viewportOffsetX; // L: 5189
		var1 = Client.viewportOffsetY; // L: 5190
		var2 = Client.viewportWidth; // L: 5191
		var3 = Client.viewportHeight; // L: 5192
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5193
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 5194
		var4 = Client.camAngleX; // L: 5195
		if (Client.field562 / 256 > var4) { // L: 5196
			var4 = Client.field562 / 256;
		}

		if (Client.field725[4] && Client.field679[4] + 128 > var4) { // L: 5197
			var4 = Client.field679[4] + 128;
		}

		int var31 = Client.camAngleY & 2047; // L: 5198
		class6.method50(class7.oculusOrbFocalPointX, MouseHandler.field231, Actor.oculusOrbFocalPointY, var4, var31, class142.method2958(var4), var3); // L: 5199
		if (!Client.isCameraLocked) { // L: 5201
			var6 = AbstractWorldMapIcon.method4862();
		} else {
			var6 = UserComparator7.method2518(); // L: 5202
		}

		int var7 = UserComparator7.cameraX; // L: 5203
		int var8 = AbstractByteArrayCopier.cameraY; // L: 5204
		int var9 = UserComparator10.cameraZ; // L: 5205
		int var10 = UserComparator7.cameraPitch; // L: 5206
		int var11 = class379.cameraYaw; // L: 5207

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) { // L: 5208
			if (Client.field725[var12]) { // L: 5209
				var13 = (int)(Math.random() * (double)(Client.field726[var12] * 2 + 1) - (double)Client.field726[var12] + Math.sin((double)Client.field618[var12] / 100.0D * (double)Client.field729[var12]) * (double)Client.field679[var12]); // L: 5210
				if (var12 == 0) { // L: 5211
					UserComparator7.cameraX += var13;
				}

				if (var12 == 1) { // L: 5212
					AbstractByteArrayCopier.cameraY += var13;
				}

				if (var12 == 2) { // L: 5213
					UserComparator10.cameraZ += var13;
				}

				if (var12 == 3) { // L: 5214
					class379.cameraYaw = var13 + class379.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 5215
					UserComparator7.cameraPitch += var13; // L: 5216
					if (UserComparator7.cameraPitch < 128) { // L: 5217
						UserComparator7.cameraPitch = 128;
					}

					if (UserComparator7.cameraPitch > 383) { // L: 5218
						UserComparator7.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 5222
		var13 = MouseHandler.MouseHandler_y; // L: 5223
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 5224
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 5225
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 5226
		}

		int var14;
		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 5228
			var14 = var12 - var0; // L: 5229
			int var15 = var13 - var1; // L: 5230
			ViewportMouse.ViewportMouse_x = var14; // L: 5232
			ViewportMouse.ViewportMouse_y = var15; // L: 5233
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 5234
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 5235
			ViewportMouse.ViewportMouse_false0 = false; // L: 5236
		} else {
			class135.method2832(); // L: 5240
		}

		class148.playPcmPlayers(); // L: 5242
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5243
		class148.playPcmPlayers(); // L: 5244
		var14 = Rasterizer3D.Rasterizer3D_zoom; // L: 5245
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 5246
		class7.scene.draw(UserComparator7.cameraX, AbstractByteArrayCopier.cameraY, UserComparator10.cameraZ, UserComparator7.cameraPitch, class379.cameraYaw, var6); // L: 5247
		Rasterizer3D.Rasterizer3D_zoom = var14; // L: 5248
		class148.playPcmPlayers(); // L: 5249
		class7.scene.clearTempGameObjects(); // L: 5250
		Client.overheadTextCount = 0; // L: 5252
		boolean var36 = false; // L: 5253
		int var16 = -1; // L: 5254
		int var17 = -1; // L: 5255
		int var18 = Players.Players_count; // L: 5256
		int[] var19 = Players.Players_indices; // L: 5257

		int var20;
		for (var20 = 0; var20 < var18 + Client.npcCount; ++var20) { // L: 5258
			Object var33;
			if (var20 < var18) { // L: 5260
				var33 = Client.players[var19[var20]]; // L: 5261
				if (var19[var20] == Client.combatTargetPlayerIndex) { // L: 5262
					var36 = true; // L: 5263
					var16 = var20; // L: 5264
					continue;
				}

				if (var33 == class340.localPlayer) { // L: 5267
					var17 = var20; // L: 5268
					continue; // L: 5269
				}
			} else {
				var33 = Client.npcs[Client.npcIndices[var20 - var18]]; // L: 5272
			}

			class148.drawActor2d((Actor)var33, var20, var0, var1, var2, var3); // L: 5273
		}

		if (Client.renderSelf && var17 != -1) { // L: 5275
			class148.drawActor2d(class340.localPlayer, var17, var0, var1, var2, var3); // L: 5276
		}

		if (var36) { // L: 5278
			class148.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var16, var0, var1, var2, var3); // L: 5279
		}

		for (var20 = 0; var20 < Client.overheadTextCount; ++var20) { // L: 5281
			int var21 = Client.overheadTextXs[var20]; // L: 5282
			int var22 = Client.overheadTextYs[var20]; // L: 5283
			int var23 = Client.overheadTextXOffsets[var20]; // L: 5284
			int var24 = Client.overheadTextAscents[var20]; // L: 5285
			boolean var25 = true; // L: 5286

			while (var25) {
				var25 = false; // L: 5288

				for (int var32 = 0; var32 < var20; ++var32) { // L: 5289
					if (var22 + 2 > Client.overheadTextYs[var32] - Client.overheadTextAscents[var32] && var22 - var24 < Client.overheadTextYs[var32] + 2 && var21 - var23 < Client.overheadTextXOffsets[var32] + Client.overheadTextXs[var32] && var23 + var21 > Client.overheadTextXs[var32] - Client.overheadTextXOffsets[var32] && Client.overheadTextYs[var32] - Client.overheadTextAscents[var32] < var22) { // L: 5290 5291
						var22 = Client.overheadTextYs[var32] - Client.overheadTextAscents[var32]; // L: 5292
						var25 = true; // L: 5293
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var20]; // L: 5298
			Client.viewportTempY = Client.overheadTextYs[var20] = var22; // L: 5299
			String var26 = Client.overheadText[var20]; // L: 5300
			if (Client.chatEffects == 0) { // L: 5301
				int var27 = 16776960; // L: 5302
				if (Client.overheadTextColors[var20] < 6) { // L: 5303
					var27 = Client.field749[Client.overheadTextColors[var20]];
				}

				if (Client.overheadTextColors[var20] == 6) { // L: 5304
					var27 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var20] == 7) { // L: 5305
					var27 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var20] == 8) { // L: 5306
					var27 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var28;
				if (Client.overheadTextColors[var20] == 9) { // L: 5307
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 5308
					if (var28 < 50) { // L: 5309
						var27 = var28 * 1280 + 16711680;
					} else if (var28 < 100) { // L: 5310
						var27 = 16776960 - (var28 - 50) * 327680;
					} else if (var28 < 150) { // L: 5311
						var27 = (var28 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var20] == 10) { // L: 5313
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 5314
					if (var28 < 50) { // L: 5315
						var27 = var28 * 5 + 16711680;
					} else if (var28 < 100) { // L: 5316
						var27 = 16711935 - (var28 - 50) * 327680;
					} else if (var28 < 150) { // L: 5317
						var27 = (var28 - 100) * 327680 + 255 - (var28 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var20] == 11) { // L: 5319
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 5320
					if (var28 < 50) { // L: 5321
						var27 = 16777215 - var28 * 327685;
					} else if (var28 < 100) { // L: 5322
						var27 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) { // L: 5323
						var27 = 16777215 - (var28 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var20] == 0) { // L: 5325
					class136.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0);
				}

				if (Client.overheadTextEffects[var20] == 1) { // L: 5326
					class136.fontBold12.drawCenteredWave(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 2) { // L: 5327
					class136.fontBold12.drawCenteredWave2(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 3) { // L: 5328
					class136.fontBold12.drawCenteredShake(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var20]);
				}

				if (Client.overheadTextEffects[var20] == 4) { // L: 5329
					var28 = (150 - Client.overheadTextCyclesRemaining[var20]) * (class136.fontBold12.stringWidth(var26) + 100) / 150; // L: 5330
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5331
					class136.fontBold12.draw(var26, var0 + Client.viewportTempX + 50 - var28, Client.viewportTempY + var1, var27, 0); // L: 5332
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5333
				}

				if (Client.overheadTextEffects[var20] == 5) { // L: 5335
					var28 = 150 - Client.overheadTextCyclesRemaining[var20]; // L: 5336
					int var29 = 0; // L: 5337
					if (var28 < 25) { // L: 5338
						var29 = var28 - 25;
					} else if (var28 > 125) { // L: 5339
						var29 = var28 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class136.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5340
					class136.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, var29 + Client.viewportTempY + var1, var27, 0); // L: 5341
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5342
				}
			} else {
				class136.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5346
			}
		}

		ArchiveDiskAction.method5527(var0, var1); // L: 5350
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field538); // L: 5351
		class336.method6228(var0, var1, var2, var3); // L: 5352
		UserComparator7.cameraX = var7; // L: 5353
		AbstractByteArrayCopier.cameraY = var8; // L: 5354
		UserComparator10.cameraZ = var9; // L: 5355
		UserComparator7.cameraPitch = var10; // L: 5356
		class379.cameraYaw = var11; // L: 5357
		if (Client.isLoading && class14.method214(true, false) == 0) { // L: 5358
			Client.isLoading = false;
		}

		if (Client.isLoading) { // L: 5359
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5360
			ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait.", false); // L: 5361
		}

	} // L: 5363

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	static void method5502() {
		if (Client.oculusOrbState == 1) { // L: 12688
			Client.field612 = true; // L: 12689
		}

	} // L: 12691
}
