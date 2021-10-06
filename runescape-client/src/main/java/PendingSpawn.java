import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static AbstractSocket field1101;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -64819785
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1686538883
	)
	@Export("type")
	int type;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1948405039
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1302314377
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -36721559
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1553617043
	)
	int field1095;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 531221351
	)
	int field1096;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 474756437
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1648049167
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -716448433
	)
	int field1104;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 161742555
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1575290553
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "14"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (class67.localPlayer.x >> 7 == Client.destinationX && class67.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		class326.method5929();
		class18.method280();
		UserComparator5.addNpcsToScene(true);
		class355.method6311();
		UserComparator5.addNpcsToScene(false);
		FriendsChat.method5993();
		class54.method1055();
		class130.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var14;
		int var15;
		int var16;
		int var18;
		if (!Client.isCameraLocked) {
			var4 = Client.camAngleX;
			if (Client.field565 / 256 > var4) {
				var4 = Client.field565 / 256;
			}

			if (Client.field739[4] && Client.field741[4] + 128 > var4) {
				var4 = Client.field741[4] + 128;
			}

			var5 = Client.camAngleY & 2047;
			var6 = class132.oculusOrbFocalPointX;
			var7 = class194.field2186;
			var8 = LoginScreenAnimation.oculusOrbFocalPointY;
			var9 = NetCache.method5335(var4);
			var11 = var3 - 334;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 100) {
				var11 = 100;
			}

			var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight;
			var10 = var12 * var9 / 256;
			var11 = 2048 - var4 & 2047;
			var12 = 2048 - var5 & 2047;
			int var13 = 0;
			var14 = 0;
			var15 = var10;
			int var17;
			if (var11 != 0) {
				var16 = Rasterizer3D.Rasterizer3D_sine[var11];
				var17 = Rasterizer3D.Rasterizer3D_cosine[var11];
				var18 = var17 * var14 - var10 * var16 >> 16;
				var15 = var10 * var17 + var14 * var16 >> 16;
				var14 = var18;
			}

			if (var12 != 0) {
				var16 = Rasterizer3D.Rasterizer3D_sine[var12];
				var17 = Rasterizer3D.Rasterizer3D_cosine[var12];
				var18 = var15 * var16 + var13 * var17 >> 16;
				var15 = var15 * var17 - var13 * var16 >> 16;
				var13 = var18;
			}

			Canvas.cameraX = var6 - var13;
			class14.cameraY = var7 - var14;
			VarpDefinition.cameraZ = var8 - var15;
			WorldMapIcon_1.cameraPitch = var4;
			HealthBarUpdate.cameraYaw = var5;
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class132.oculusOrbFocalPointX >> 7 != class67.localPlayer.x >> 7 || LoginScreenAnimation.oculusOrbFocalPointY >> 7 != class67.localPlayer.y >> 7)) {
				var16 = class67.localPlayer.plane;
				var17 = (class132.oculusOrbFocalPointX >> 7) + WorldMapSectionType.baseX;
				var18 = (LoginScreenAnimation.oculusOrbFocalPointY >> 7) + PlayerComposition.baseY;
				UrlRequest.method2386(var17, var18, var16, true);
			}
		}

		if (!Client.isCameraLocked) {
			var4 = class117.method2519();
		} else {
			if (WorldMapDecorationType.clientPreferences.roofsHidden) {
				var5 = VertexNormal.Client_plane;
			} else {
				var6 = MidiPcmStream.getTileHeight(Canvas.cameraX, VarpDefinition.cameraZ, VertexNormal.Client_plane);
				if (var6 - class14.cameraY < 800 && (Tiles.Tiles_renderFlags[VertexNormal.Client_plane][Canvas.cameraX >> 7][VarpDefinition.cameraZ >> 7] & 4) != 0) {
					var5 = VertexNormal.Client_plane;
				} else {
					var5 = 3;
				}
			}

			var4 = var5;
		}

		var5 = Canvas.cameraX;
		var6 = class14.cameraY;
		var7 = VarpDefinition.cameraZ;
		var8 = WorldMapIcon_1.cameraPitch;
		var9 = HealthBarUpdate.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field739[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field740[var10] * 2 + 1) - (double)Client.field740[var10] + Math.sin((double)Client.field743[var10] * ((double)Client.field742[var10] / 100.0D)) * (double)Client.field741[var10]);
				if (var10 == 0) {
					Canvas.cameraX += var11;
				}

				if (var10 == 1) {
					class14.cameraY += var11;
				}

				if (var10 == 2) {
					VarpDefinition.cameraZ += var11;
				}

				if (var10 == 3) {
					HealthBarUpdate.cameraYaw = var11 + HealthBarUpdate.cameraYaw & 2047;
				}

				if (var10 == 4) {
					WorldMapIcon_1.cameraPitch += var11;
					if (WorldMapIcon_1.cameraPitch < 128) {
						WorldMapIcon_1.cameraPitch = 128;
					}

					if (WorldMapIcon_1.cameraPitch > 383) {
						WorldMapIcon_1.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x;
		var11 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var10 = MouseHandler.MouseHandler_lastPressedX;
			var11 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
			class67.method1888(var10 - var0, var11 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		class356.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class356.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		PlayerComposition.scene.draw(Canvas.cameraX, class14.cameraY, VarpDefinition.cameraZ, WorldMapIcon_1.cameraPitch, HealthBarUpdate.cameraYaw, var4);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		class356.playPcmPlayers();
		PlayerComposition.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var31 = false;
		var14 = -1;
		var15 = -1;
		var16 = Players.Players_count;
		int[] var28 = Players.Players_indices;

		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) {
			Object var30;
			if (var18 < var16) {
				var30 = Client.players[var28[var18]];
				if (var28[var18] == Client.combatTargetPlayerIndex) {
					var31 = true;
					var14 = var18;
					continue;
				}

				if (var30 == class67.localPlayer) {
					var15 = var18;
					continue;
				}
			} else {
				var30 = Client.npcs[Client.npcIndices[var18 - var16]];
			}

			BufferedFile.drawActor2d((Actor)var30, var18, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var15 != -1) {
			BufferedFile.drawActor2d(class67.localPlayer, var15, var0, var1, var2, var3);
		}

		if (var31) {
			BufferedFile.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3);
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) {
			int var19 = Client.overheadTextXs[var18];
			int var20 = Client.overheadTextYs[var18];
			int var21 = Client.overheadTextXOffsets[var18];
			int var22 = Client.overheadTextAscents[var18];
			boolean var23 = true;

			while (var23) {
				var23 = false;

				for (int var29 = 0; var29 < var18; ++var29) {
					if (var20 + 2 > Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] && var20 - var22 < Client.overheadTextYs[var29] + 2 && var19 - var21 < Client.overheadTextXOffsets[var29] + Client.overheadTextXs[var29] && var21 + var19 > Client.overheadTextXs[var29] - Client.overheadTextXOffsets[var29] && Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] < var20) {
						var20 = Client.overheadTextYs[var29] - Client.overheadTextAscents[var29];
						var23 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18];
			Client.viewportTempY = Client.overheadTextYs[var18] = var20;
			String var24 = Client.overheadText[var18];
			if (Client.chatEffects == 0) {
				int var25 = 16776960;
				if (Client.overheadTextColors[var18] < 6) {
					var25 = Client.field554[Client.overheadTextColors[var18]];
				}

				if (Client.overheadTextColors[var18] == 6) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var18] == 7) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var18] == 8) {
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var18] == 9) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var18] == 10) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) {
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var18] == 11) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) {
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) {
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var18] == 0) {
					Interpreter.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) {
					Interpreter.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) {
					Interpreter.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) {
					Interpreter.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) {
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (Interpreter.fontBold12.stringWidth(var24) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					Interpreter.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var18] == 5) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					int var27 = 0;
					if (var26 < 25) {
						var27 = var26 - 25;
					} else if (var26 > 125) {
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - Interpreter.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					Interpreter.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				Interpreter.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		WorldMapScaleHandler.method4005(var0, var1);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field536);
		class11.method110(var0, var1, var2, var3);
		Canvas.cameraX = var5;
		class14.cameraY = var6;
		VarpDefinition.cameraZ = var7;
		WorldMapIcon_1.cameraPitch = var8;
		HealthBarUpdate.cameraYaw = var9;
		if (Client.isLoading) {
			byte var32 = 0;
			var14 = var32 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var14 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			ScriptFrame.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
