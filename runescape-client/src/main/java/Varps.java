import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("f")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("e")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("v")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1691710161"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 37
		boolean var3 = false; // L: 38
		int var4 = 0; // L: 39
		int var5 = var0.length(); // L: 40
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 70
				break;
			}

			label83: {
				char var7 = var0.charAt(var6); // L: 42
				if (var6 == 0) { // L: 43
					if (var7 == '-') { // L: 44
						var2 = true; // L: 45
						break label83;
					}

					if (var7 == '+') { // L: 48
						break label83;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 50
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 51
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 52
						var1 = false; // L: 54
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 57
					var1 = false; // L: 58
					break; // L: 59
				}

				if (var2) { // L: 61
					var9 = -var9;
				}

				int var8 = var9 + var4 * 10; // L: 62
				if (var4 != var8 / 10) { // L: 63
					var1 = false; // L: 64
					break; // L: 65
				}

				var4 = var8; // L: 67
				var3 = true; // L: 68
			}

			++var6; // L: 41
		}

		return var1; // L: 72
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1613057014"
	)
	static final void method4783() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3960
			var0 = class262.localPlayer.x; // L: 3961
			var1 = class262.localPlayer.y; // L: 3962
			if (FriendSystem.oculusOrbFocalPointX - var0 < -500 || FriendSystem.oculusOrbFocalPointX - var0 > 500 || VarbitComposition.oculusOrbFocalPointY - var1 < -500 || VarbitComposition.oculusOrbFocalPointY - var1 > 500) { // L: 3963
				FriendSystem.oculusOrbFocalPointX = var0; // L: 3964
				VarbitComposition.oculusOrbFocalPointY = var1; // L: 3965
			}

			if (var0 != FriendSystem.oculusOrbFocalPointX) { // L: 3967
				FriendSystem.oculusOrbFocalPointX += (var0 - FriendSystem.oculusOrbFocalPointX) / 16;
			}

			if (var1 != VarbitComposition.oculusOrbFocalPointY) { // L: 3968
				VarbitComposition.oculusOrbFocalPointY += (var1 - VarbitComposition.oculusOrbFocalPointY) / 16;
			}

			var2 = FriendSystem.oculusOrbFocalPointX >> 7; // L: 3969
			var3 = VarbitComposition.oculusOrbFocalPointY >> 7; // L: 3970
			var4 = ItemContainer.getTileHeight(FriendSystem.oculusOrbFocalPointX, VarbitComposition.oculusOrbFocalPointY, SoundSystem.Client_plane); // L: 3971
			var5 = 0; // L: 3972
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3973
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3974
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3975
						int var8 = SoundSystem.Client_plane; // L: 3976
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3977
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3978
						if (var9 > var5) { // L: 3979
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3983
			if (var6 > 98048) { // L: 3984
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3985
				var6 = 32768;
			}

			if (var6 > Client.field708) { // L: 3986
				Client.field708 += (var6 - Client.field708) / 24;
			} else if (var6 < Client.field708) { // L: 3987
				Client.field708 += (var6 - Client.field708) / 80;
			}

			class14.field124 = ItemContainer.getTileHeight(class262.localPlayer.x, class262.localPlayer.y, SoundSystem.Client_plane) - Client.camFollowHeight; // L: 3988
		} else if (Client.oculusOrbState == 1) { // L: 3990
			if (Client.field705 && class262.localPlayer != null) { // L: 3992
				var0 = class262.localPlayer.pathX[0]; // L: 3993
				var1 = class262.localPlayer.pathY[0]; // L: 3994
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) { // L: 3995
					FriendSystem.oculusOrbFocalPointX = class262.localPlayer.x; // L: 3996
					var2 = ItemContainer.getTileHeight(class262.localPlayer.x, class262.localPlayer.y, SoundSystem.Client_plane) - Client.camFollowHeight; // L: 3997
					if (var2 < class14.field124) { // L: 3998
						class14.field124 = var2;
					}

					VarbitComposition.oculusOrbFocalPointY = class262.localPlayer.y; // L: 3999
					Client.field705 = false; // L: 4000
				}
			}

			short var10 = -1; // L: 4003
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 4004
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 4005
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 4006
				if (var10 == 0) { // L: 4007
					var10 = 1792;
				} else if (var10 == 1024) { // L: 4008
					var10 = 1280;
				} else {
					var10 = 1536; // L: 4009
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 4011
				if (var10 == 0) { // L: 4012
					var10 = 256;
				} else if (var10 == 1024) { // L: 4013
					var10 = 768;
				} else {
					var10 = 512; // L: 4014
				}
			}

			byte var11 = 0; // L: 4016
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 4017
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 4018
				var11 = 1;
			}

			var2 = 0; // L: 4019
			if (var10 >= 0 || var11 != 0) { // L: 4020
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * 930603185 * -1091934127 : Client.oculusOrbNormalSpeed * 1556069133 * 1614384069; // L: 4021
				var2 *= 16; // L: 4022
				Client.field676 = var10; // L: 4023
				Client.field857 = var11; // L: 4024
			}

			if (Client.field699 < var2) { // L: 4026
				Client.field699 += var2 / 8; // L: 4027
				if (Client.field699 > var2) { // L: 4028
					Client.field699 = var2;
				}
			} else if (Client.field699 > var2) { // L: 4030
				Client.field699 = Client.field699 * 9 / 10;
			}

			if (Client.field699 > 0) { // L: 4031
				var3 = Client.field699 / 16; // L: 4032
				if (Client.field676 >= 0) { // L: 4033
					var0 = Client.field676 - class32.cameraYaw & 2047; // L: 4034
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 4035
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 4036
					FriendSystem.oculusOrbFocalPointX += var3 * var4 / 65536; // L: 4037
					VarbitComposition.oculusOrbFocalPointY += var5 * var3 / 65536; // L: 4038
				}

				if (Client.field857 != 0) { // L: 4040
					class14.field124 += var3 * Client.field857; // L: 4041
					if (class14.field124 > 0) { // L: 4042
						class14.field124 = 0;
					}
				}
			} else {
				Client.field676 = -1; // L: 4046
				Client.field857 = -1; // L: 4047
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 4049
				class35.method421(); // L: 4050
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && UserComparator3.mouseCam) { // L: 4053
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 4054
			Client.camAngleDX = var0 * 2; // L: 4055
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * -1895436129 * 1644112735; // L: 4056
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 4057
			Client.camAngleDY = var1 * 2; // L: 4058
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * -356572869 * 1657999347; // L: 4059
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 4062
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 4063
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 4064
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 4065
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 4066
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 4067
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 4068
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 4069
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 4071
		Client.camAngleX += Client.camAngleDX / 2; // L: 4072
		if (Client.camAngleX < 128) { // L: 4073
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 4074
			Client.camAngleX = 383;
		}

	} // L: 4075
}
