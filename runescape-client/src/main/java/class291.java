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
		++Client.viewportDrawCount;
		ReflectionCheck.method664();
		class9.method88();
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			Buddy.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		MouseHandler.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				Buddy.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		MouseHandler.addNpcsToScene(false);

		for (Projectile var30 = (Projectile)Client.projectiles.last(); var30 != null; var30 = (Projectile)Client.projectiles.previous()) {
			if (var30.plane == class20.Client_plane && Client.cycle <= var30.cycleEnd) {
				if (Client.cycle >= var30.cycleStart) {
					if (var30.targetIndex > 0) {
						NPC var34 = Client.npcs[var30.targetIndex - 1];
						if (var34 != null && var34.x >= 0 && var34.x < 13312 && var34.y >= 0 && var34.y < 13312) {
							var30.setDestination(var34.x, var34.y, FaceNormal.getTileHeight(var34.x, var34.y, var30.plane) - var30.endHeight, Client.cycle);
						}
					}

					if (var30.targetIndex < 0) {
						var6 = -var30.targetIndex - 1;
						Player var35;
						if (var6 == Client.localPlayerIndex) {
							var35 = class340.localPlayer;
						} else {
							var35 = Client.players[var6];
						}

						if (var35 != null && var35.x >= 0 && var35.x < 13312 && var35.y >= 0 && var35.y < 13312) {
							var30.setDestination(var35.x, var35.y, FaceNormal.getTileHeight(var35.x, var35.y, var30.plane) - var30.endHeight, Client.cycle);
						}
					}

					var30.advance(Client.field538);
					class7.scene.drawEntity(class20.Client_plane, (int)var30.x, (int)var30.y, (int)var30.z, 60, var30, var30.yaw, -1L, false);
				}
			} else {
				var30.remove();
			}
		}

		class33.method656();
		WorldMapDecoration.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		var4 = Client.camAngleX;
		if (Client.field562 / 256 > var4) {
			var4 = Client.field562 / 256;
		}

		if (Client.field725[4] && Client.field679[4] + 128 > var4) {
			var4 = Client.field679[4] + 128;
		}

		int var31 = Client.camAngleY & 2047;
		class6.method50(class7.oculusOrbFocalPointX, MouseHandler.field231, Actor.oculusOrbFocalPointY, var4, var31, class142.method2958(var4), var3);
		if (!Client.isCameraLocked) {
			var6 = AbstractWorldMapIcon.method4862();
		} else {
			var6 = UserComparator7.method2518();
		}

		int var7 = UserComparator7.cameraX;
		int var8 = AbstractByteArrayCopier.cameraY;
		int var9 = UserComparator10.cameraZ;
		int var10 = UserComparator7.cameraPitch;
		int var11 = class379.cameraYaw;

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) {
			if (Client.field725[var12]) {
				var13 = (int)(Math.random() * (double)(Client.field726[var12] * 2 + 1) - (double)Client.field726[var12] + Math.sin((double)Client.field618[var12] / 100.0D * (double)Client.field729[var12]) * (double)Client.field679[var12]);
				if (var12 == 0) {
					UserComparator7.cameraX += var13;
				}

				if (var12 == 1) {
					AbstractByteArrayCopier.cameraY += var13;
				}

				if (var12 == 2) {
					UserComparator10.cameraZ += var13;
				}

				if (var12 == 3) {
					class379.cameraYaw = var13 + class379.cameraYaw & 2047;
				}

				if (var12 == 4) {
					UserComparator7.cameraPitch += var13;
					if (UserComparator7.cameraPitch < 128) {
						UserComparator7.cameraPitch = 128;
					}

					if (UserComparator7.cameraPitch > 383) {
						UserComparator7.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x;
		var13 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var12 = MouseHandler.MouseHandler_lastPressedX;
			var13 = MouseHandler.MouseHandler_lastPressedY;
		}

		int var14;
		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) {
			var14 = var12 - var0;
			int var15 = var13 - var1;
			ViewportMouse.ViewportMouse_x = var14;
			ViewportMouse.ViewportMouse_y = var15;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			class135.method2832();
		}

		class148.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class148.playPcmPlayers();
		var14 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		class7.scene.draw(UserComparator7.cameraX, AbstractByteArrayCopier.cameraY, UserComparator10.cameraZ, UserComparator7.cameraPitch, class379.cameraYaw, var6);
		Rasterizer3D.Rasterizer3D_zoom = var14;
		class148.playPcmPlayers();
		class7.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var36 = false;
		int var16 = -1;
		int var17 = -1;
		int var18 = Players.Players_count;
		int[] var19 = Players.Players_indices;

		int var20;
		for (var20 = 0; var20 < var18 + Client.npcCount; ++var20) {
			Object var33;
			if (var20 < var18) {
				var33 = Client.players[var19[var20]];
				if (var19[var20] == Client.combatTargetPlayerIndex) {
					var36 = true;
					var16 = var20;
					continue;
				}

				if (var33 == class340.localPlayer) {
					var17 = var20;
					continue;
				}
			} else {
				var33 = Client.npcs[Client.npcIndices[var20 - var18]];
			}

			class148.drawActor2d((Actor)var33, var20, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var17 != -1) {
			class148.drawActor2d(class340.localPlayer, var17, var0, var1, var2, var3);
		}

		if (var36) {
			class148.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var16, var0, var1, var2, var3);
		}

		for (var20 = 0; var20 < Client.overheadTextCount; ++var20) {
			int var21 = Client.overheadTextXs[var20];
			int var22 = Client.overheadTextYs[var20];
			int var23 = Client.overheadTextXOffsets[var20];
			int var24 = Client.overheadTextAscents[var20];
			boolean var25 = true;

			while (var25) {
				var25 = false;

				for (int var32 = 0; var32 < var20; ++var32) {
					if (var22 + 2 > Client.overheadTextYs[var32] - Client.overheadTextAscents[var32] && var22 - var24 < Client.overheadTextYs[var32] + 2 && var21 - var23 < Client.overheadTextXOffsets[var32] + Client.overheadTextXs[var32] && var23 + var21 > Client.overheadTextXs[var32] - Client.overheadTextXOffsets[var32] && Client.overheadTextYs[var32] - Client.overheadTextAscents[var32] < var22) {
						var22 = Client.overheadTextYs[var32] - Client.overheadTextAscents[var32];
						var25 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var20];
			Client.viewportTempY = Client.overheadTextYs[var20] = var22;
			String var26 = Client.overheadText[var20];
			if (Client.chatEffects == 0) {
				int var27 = 16776960;
				if (Client.overheadTextColors[var20] < 6) {
					var27 = Client.field749[Client.overheadTextColors[var20]];
				}

				if (Client.overheadTextColors[var20] == 6) {
					var27 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var20] == 7) {
					var27 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var20] == 8) {
					var27 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var28;
				if (Client.overheadTextColors[var20] == 9) {
					var28 = 150 - Client.overheadTextCyclesRemaining[var20];
					if (var28 < 50) {
						var27 = var28 * 1280 + 16711680;
					} else if (var28 < 100) {
						var27 = 16776960 - (var28 - 50) * 327680;
					} else if (var28 < 150) {
						var27 = (var28 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var20] == 10) {
					var28 = 150 - Client.overheadTextCyclesRemaining[var20];
					if (var28 < 50) {
						var27 = var28 * 5 + 16711680;
					} else if (var28 < 100) {
						var27 = 16711935 - (var28 - 50) * 327680;
					} else if (var28 < 150) {
						var27 = (var28 - 100) * 327680 + 255 - (var28 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var20] == 11) {
					var28 = 150 - Client.overheadTextCyclesRemaining[var20];
					if (var28 < 50) {
						var27 = 16777215 - var28 * 327685;
					} else if (var28 < 100) {
						var27 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) {
						var27 = 16777215 - (var28 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var20] == 0) {
					class136.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0);
				}

				if (Client.overheadTextEffects[var20] == 1) {
					class136.fontBold12.drawCenteredWave(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 2) {
					class136.fontBold12.drawCenteredWave2(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var20] == 3) {
					class136.fontBold12.drawCenteredShake(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, var27, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var20]);
				}

				if (Client.overheadTextEffects[var20] == 4) {
					var28 = (150 - Client.overheadTextCyclesRemaining[var20]) * (class136.fontBold12.stringWidth(var26) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class136.fontBold12.draw(var26, var0 + Client.viewportTempX + 50 - var28, Client.viewportTempY + var1, var27, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var20] == 5) {
					var28 = 150 - Client.overheadTextCyclesRemaining[var20];
					int var29 = 0;
					if (var28 < 25) {
						var29 = var28 - 25;
					} else if (var28 > 125) {
						var29 = var28 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class136.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class136.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, var29 + Client.viewportTempY + var1, var27, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class136.fontBold12.drawCentered(var26, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		ArchiveDiskAction.method5527(var0, var1);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field538);
		class336.method6228(var0, var1, var2, var3);
		UserComparator7.cameraX = var7;
		AbstractByteArrayCopier.cameraY = var8;
		UserComparator10.cameraZ = var9;
		UserComparator7.cameraPitch = var10;
		class379.cameraYaw = var11;
		if (Client.isLoading && class14.method214(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	static void method5502() {
		if (Client.oculusOrbState == 1) {
			Client.field612 = true;
		}

	}
}
