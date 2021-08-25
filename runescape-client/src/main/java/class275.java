import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class275 {
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	static IndexedSprite field3281;

	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("g")
	public static int method5066(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1975228173"
	)
	static final void method5067() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = class129.localPlayer.x;
			var1 = class129.localPlayer.y;
			if (WorldMapID.oculusOrbFocalPointX - var0 < -500 || WorldMapID.oculusOrbFocalPointX - var0 > 500 || WorldMapRectangle.oculusOrbFocalPointY - var1 < -500 || WorldMapRectangle.oculusOrbFocalPointY - var1 > 500) {
				WorldMapID.oculusOrbFocalPointX = var0;
				WorldMapRectangle.oculusOrbFocalPointY = var1;
			}

			if (var0 != WorldMapID.oculusOrbFocalPointX) {
				WorldMapID.oculusOrbFocalPointX += (var0 - WorldMapID.oculusOrbFocalPointX) / 16;
			}

			if (var1 != WorldMapRectangle.oculusOrbFocalPointY) {
				WorldMapRectangle.oculusOrbFocalPointY += (var1 - WorldMapRectangle.oculusOrbFocalPointY) / 16;
			}

			var2 = WorldMapID.oculusOrbFocalPointX >> 7;
			var3 = WorldMapRectangle.oculusOrbFocalPointY >> 7;
			var4 = GraphicsObject.getTileHeight(WorldMapID.oculusOrbFocalPointX, WorldMapRectangle.oculusOrbFocalPointY, class391.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = class391.Client_plane;
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}

			if (var6 < 32768) {
				var6 = 32768;
			}

			if (var6 > Client.field483) {
				Client.field483 += (var6 - Client.field483) / 24;
			} else if (var6 < Client.field483) {
				Client.field483 += (var6 - Client.field483) / 80;
			}

			ClanSettings.field1473 = GraphicsObject.getTileHeight(class129.localPlayer.x, class129.localPlayer.y, class391.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			if (Client.field741 && class129.localPlayer != null) {
				var0 = class129.localPlayer.pathX[0];
				var1 = class129.localPlayer.pathY[0];
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) {
					WorldMapID.oculusOrbFocalPointX = class129.localPlayer.x;
					var2 = GraphicsObject.getTileHeight(class129.localPlayer.x, class129.localPlayer.y, class391.Client_plane) - Client.camFollowHeight;
					if (var2 < ClanSettings.field1473) {
						ClanSettings.field1473 = var2;
					}

					WorldMapRectangle.oculusOrbFocalPointY = class129.localPlayer.y;
					Client.field741 = false;
				}
			}

			short var10 = -1;
			if (KeyHandler.KeyHandler_pressedKeys[33]) {
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}

			byte var11 = 0;
			if (KeyHandler.KeyHandler_pressedKeys[35]) {
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
				var11 = 1;
			}

			var2 = 0;
			if (var10 >= 0 || var11 != 0) {
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * 972759825 * -87413263 : Client.oculusOrbNormalSpeed * 2061027769 * -51221367;
				var2 *= 16;
				Client.field566 = var10;
				Client.field567 = var11;
			}

			if (Client.field565 < var2) {
				Client.field565 += var2 / 8;
				if (Client.field565 > var2) {
					Client.field565 = var2;
				}
			} else if (Client.field565 > var2) {
				Client.field565 = Client.field565 * 9 / 10;
			}

			if (Client.field565 > 0) {
				var3 = Client.field565 / 16;
				if (Client.field566 >= 0) {
					var0 = Client.field566 - Fonts.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					WorldMapID.oculusOrbFocalPointX += var4 * var3 / 65536;
					WorldMapRectangle.oculusOrbFocalPointY += var3 * var5 / 65536;
				}

				if (Client.field567 != 0) {
					ClanSettings.field1473 += var3 * Client.field567;
					if (ClanSettings.field1473 > 0) {
						ClanSettings.field1473 = 0;
					}
				}
			} else {
				Client.field566 = -1;
				Client.field567 = -1;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				class295.method5306();
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && Script.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * 1256288259 * -447169877;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x * -849531271 * -1434592311;
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}
}
