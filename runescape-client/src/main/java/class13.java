import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public final class class13 {
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1434868681"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 3970
		World.method1925(); // L: 3971
		if (Client.renderSelf) { // L: 3973
			WorldMapScaleHandler.addPlayerToScene(UserComparator9.localPlayer, false); // L: 3974
		}

		RouteStrategy.method3794(); // L: 3977
		GameEngine.addNpcsToScene(true); // L: 3978
		int var4 = Players.Players_count; // L: 3980
		int[] var5 = Players.Players_indices; // L: 3981

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 3982
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 3983
				WorldMapScaleHandler.addPlayerToScene(Client.players[var5[var6]], true); // L: 3984
			}
		}

		GameEngine.addNpcsToScene(false); // L: 3987
		Decimator.method2708(); // L: 3988
		DevicePcmPlayerProvider.method920(); // L: 3989
		MenuAction.setViewportShape(var0, var1, var2, var3, true); // L: 3990
		var0 = Client.viewportOffsetX; // L: 3991
		var1 = Client.viewportOffsetY; // L: 3992
		var2 = Client.viewportWidth; // L: 3993
		var3 = Client.viewportHeight; // L: 3994
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 3995
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 3996
		int var7;
		int var8;
		int var11;
		int var28;
		if (!Client.isCameraLocked) { // L: 3997
			var4 = Client.camAngleX; // L: 3998
			if (Client.field880 / 256 > var4) { // L: 3999
				var4 = Client.field880 / 256;
			}

			if (Client.field907[4] && Client.field909[4] + 128 > var4) { // L: 4000
				var4 = Client.field909[4] + 128;
			}

			var28 = Client.camAngleY & 2047; // L: 4001
			var6 = HealthBarUpdate.oculusOrbFocalPointX; // L: 4002
			var7 = ModelData0.field1882; // L: 4003
			var8 = ApproximateRouteStrategy.oculusOrbFocalPointY; // L: 4004
			var11 = var4 * 3 + 600; // L: 4009
			class258.method4685(var6, var7, var8, var4, var28, var11, var3); // L: 4011
		}

		if (!Client.isCameraLocked) { // L: 4014
			var4 = AbstractWorldMapIcon.method712();
		} else {
			var4 = class171.method3639(); // L: 4015
		}

		var28 = SecureRandomFuture.cameraX; // L: 4016
		var6 = ArchiveLoader.cameraY; // L: 4017
		var7 = ObjectSound.cameraZ; // L: 4018
		var8 = KeyHandler.cameraPitch; // L: 4019
		int var9 = class39.cameraYaw; // L: 4020

		int var10;
		for (var10 = 0; var10 < 5; ++var10) { // L: 4021
			if (Client.field907[var10]) { // L: 4022
				var11 = (int)(Math.random() * (double)(Client.field908[var10] * 2 + 1) - (double)Client.field908[var10] + Math.sin((double)Client.field799[var10] / 100.0D * (double)Client.field911[var10]) * (double)Client.field909[var10]); // L: 4023
				if (var10 == 0) { // L: 4024
					SecureRandomFuture.cameraX += var11;
				}

				if (var10 == 1) {
					ArchiveLoader.cameraY += var11; // L: 4025
				}

				if (var10 == 2) { // L: 4026
					ObjectSound.cameraZ += var11;
				}

				if (var10 == 3) { // L: 4027
					class39.cameraYaw = var11 + class39.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 4028
					KeyHandler.cameraPitch += var11; // L: 4029
					if (KeyHandler.cameraPitch < 128) { // L: 4030
						KeyHandler.cameraPitch = 128;
					}

					if (KeyHandler.cameraPitch > 383) { // L: 4031
						KeyHandler.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 4035
		var11 = MouseHandler.MouseHandler_y; // L: 4036
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4037
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 4038
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 4039
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 4041
			GrandExchangeOfferWorldComparator.method137(var10 - var0, var11 - var1); // L: 4042
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4046
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4047
		}

		UserComparator5.playPcmPlayers(); // L: 4050
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4051
		UserComparator5.playPcmPlayers(); // L: 4052
		int var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 4053
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4054
		MilliClock.scene.draw(SecureRandomFuture.cameraX, ArchiveLoader.cameraY, ObjectSound.cameraZ, KeyHandler.cameraPitch, class39.cameraYaw, var4); // L: 4055
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 4056
		UserComparator5.playPcmPlayers(); // L: 4057
		MilliClock.scene.clearTempGameObjects(); // L: 4058
		Client.overheadTextCount = 0; // L: 4060
		boolean var13 = false; // L: 4061
		int var14 = -1; // L: 4062
		int var15 = -1; // L: 4063
		int var16 = Players.Players_count; // L: 4064
		int[] var17 = Players.Players_indices; // L: 4065

		int var18;
		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) { // L: 4066
			Object var30;
			if (var18 < var16) { // L: 4068
				var30 = Client.players[var17[var18]]; // L: 4069
				if (var17[var18] == Client.combatTargetPlayerIndex) { // L: 4070
					var13 = true; // L: 4071
					var14 = var18; // L: 4072
					continue;
				}

				if (var30 == UserComparator9.localPlayer) { // L: 4075
					var15 = var18; // L: 4076
					continue; // L: 4077
				}
			} else {
				var30 = Client.npcs[Client.npcIndices[var18 - var16]]; // L: 4080
			}

			UserComparator5.drawActor2d((Actor)var30, var18, var0, var1, var2, var3); // L: 4081
		}

		if (Client.renderSelf && var15 != -1) { // L: 4083
			UserComparator5.drawActor2d(UserComparator9.localPlayer, var15, var0, var1, var2, var3); // L: 4084
		}

		if (var13) { // L: 4086
			UserComparator5.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3); // L: 4087
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) { // L: 4089
			int var19 = Client.overheadTextXs[var18]; // L: 4090
			int var20 = Client.overheadTextYs[var18]; // L: 4091
			int var21 = Client.overheadTextXOffsets[var18]; // L: 4092
			int var22 = Client.overheadTextAscents[var18]; // L: 4093
			boolean var23 = true; // L: 4094

			while (var23) {
				var23 = false; // L: 4096

				for (int var29 = 0; var29 < var18; ++var29) { // L: 4097
					if (var20 + 2 > Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] && var20 - var22 < Client.overheadTextYs[var29] + 2 && var19 - var21 < Client.overheadTextXs[var29] + Client.overheadTextXOffsets[var29] && var21 + var19 > Client.overheadTextXs[var29] - Client.overheadTextXOffsets[var29] && Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] < var20) { // L: 4098 4099
						var20 = Client.overheadTextYs[var29] - Client.overheadTextAscents[var29]; // L: 4100
						var23 = true; // L: 4101
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18]; // L: 4106
			Client.viewportTempY = Client.overheadTextYs[var18] = var20; // L: 4107
			String var24 = Client.overheadText[var18]; // L: 4108
			if (Client.chatEffects == 0) { // L: 4109
				int var25 = 16776960; // L: 4110
				if (Client.overheadTextColors[var18] < 6) { // L: 4111
					var25 = Client.field879[Client.overheadTextColors[var18]];
				}

				if (Client.overheadTextColors[var18] == 6) { // L: 4112
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var18] == 7) { // L: 4113
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var18] == 8) { // L: 4114
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var18] == 9) { // L: 4115
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4116
					if (var26 < 50) { // L: 4117
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) { // L: 4118
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) { // L: 4119
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var18] == 10) { // L: 4121
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4122
					if (var26 < 50) { // L: 4123
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) { // L: 4124
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) { // L: 4125
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var18] == 11) { // L: 4127
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4128
					if (var26 < 50) { // L: 4129
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) { // L: 4130
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) { // L: 4131
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var18] == 0) { // L: 4133
					ScriptEvent.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) { // L: 4134
					ScriptEvent.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) { // L: 4135
					ScriptEvent.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) { // L: 4136
					ScriptEvent.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) { // L: 4137
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (ScriptEvent.fontBold12.stringWidth(var24) + 100) / 150; // L: 4138
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4139
					ScriptEvent.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0); // L: 4140
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4141
				}

				if (Client.overheadTextEffects[var18] == 5) { // L: 4143
					var26 = 150 - Client.overheadTextCyclesRemaining[var18]; // L: 4144
					int var27 = 0; // L: 4145
					if (var26 < 25) { // L: 4146
						var27 = var26 - 25;
					} else if (var26 > 125) { // L: 4147
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - ScriptEvent.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4148
					ScriptEvent.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0); // L: 4149
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4150
				}
			} else {
				ScriptEvent.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4154
			}
		}

		if (Client.hintArrowType == 2) { // L: 4159
			ParamComposition.worldToScreen((Client.hintArrowX - GrandExchangeOfferNameComparator.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - NetCache.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4160
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4161
				headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field808); // L: 4163
		WorldMapSectionType.method318(var0, var1, var2, var3); // L: 4164
		SecureRandomFuture.cameraX = var28; // L: 4165
		ArchiveLoader.cameraY = var6; // L: 4166
		ObjectSound.cameraZ = var7; // L: 4167
		KeyHandler.cameraPitch = var8; // L: 4168
		class39.cameraYaw = var9; // L: 4169
		if (Client.isLoading) { // L: 4170
			byte var31 = 0; // L: 4173
			var14 = var31 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4174
			if (var14 == 0) { // L: 4178
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4180
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4181
			WorldMapIcon_1.drawLoadingMessage("Loading - please wait.", false); // L: 4182
		}

	} // L: 4184

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1775407691"
	)
	static void method122() {
		if (Client.field747 && UserComparator9.localPlayer != null) { // L: 11630
			int var0 = UserComparator9.localPlayer.pathX[0]; // L: 11631
			int var1 = UserComparator9.localPlayer.pathY[0]; // L: 11632
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 11633
				return;
			}

			HealthBarUpdate.oculusOrbFocalPointX = UserComparator9.localPlayer.x; // L: 11634
			int var2 = WorldMapRegion.getTileHeight(UserComparator9.localPlayer.x, UserComparator9.localPlayer.y, class90.Client_plane) - Client.camFollowHeight; // L: 11635
			if (var2 < ModelData0.field1882) { // L: 11636
				ModelData0.field1882 = var2;
			}

			ApproximateRouteStrategy.oculusOrbFocalPointY = UserComparator9.localPlayer.y; // L: 11637
			Client.field747 = false; // L: 11638
		}

	} // L: 11640
}