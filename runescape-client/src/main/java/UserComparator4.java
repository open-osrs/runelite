import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmd;Lmd;I)I",
		garbageValue = "689643923"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "10562"
	)
	public static void method2434(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 42
			try {
				Buffer var1 = new Buffer(4); // L: 44
				var1.writeByte(var0 ? 2 : 3); // L: 45
				var1.writeMedium(0); // L: 46
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 47
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 51
				} catch (Exception var3) { // L: 53
				}

				++NetCache.NetCache_ioExceptions; // L: 54
				NetCache.NetCache_socket = null; // L: 55
			}

		}
	} // L: 57

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-63"
	)
	static final void method2443() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3676
			var0 = WorldMapSprite.localPlayer.x; // L: 3677
			var1 = WorldMapSprite.localPlayer.y; // L: 3678
			if (class29.oculusOrbFocalPointX - var0 < -500 || class29.oculusOrbFocalPointX - var0 > 500 || class121.oculusOrbFocalPointY - var1 < -500 || class121.oculusOrbFocalPointY - var1 > 500) { // L: 3679
				class29.oculusOrbFocalPointX = var0; // L: 3680
				class121.oculusOrbFocalPointY = var1; // L: 3681
			}

			if (var0 != class29.oculusOrbFocalPointX) { // L: 3683
				class29.oculusOrbFocalPointX += (var0 - class29.oculusOrbFocalPointX) / 16;
			}

			if (var1 != class121.oculusOrbFocalPointY) { // L: 3684
				class121.oculusOrbFocalPointY += (var1 - class121.oculusOrbFocalPointY) / 16;
			}

			var2 = class29.oculusOrbFocalPointX >> 7; // L: 3685
			var3 = class121.oculusOrbFocalPointY >> 7; // L: 3686
			var4 = class92.getTileHeight(class29.oculusOrbFocalPointX, class121.oculusOrbFocalPointY, SoundSystem.Client_plane); // L: 3687
			var5 = 0; // L: 3688
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3689
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3690
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3691
						int var8 = SoundSystem.Client_plane; // L: 3692
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3693
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3694
						if (var9 > var5) { // L: 3695
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3699
			if (var6 > 98048) { // L: 3700
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3701
				var6 = 32768;
			}

			if (var6 > Client.field590) { // L: 3702
				Client.field590 += (var6 - Client.field590) / 24;
			} else if (var6 < Client.field590) { // L: 3703
				Client.field590 += (var6 - Client.field590) / 80;
			}

			SpriteMask.field3218 = class92.getTileHeight(WorldMapSprite.localPlayer.x, WorldMapSprite.localPlayer.y, SoundSystem.Client_plane) - Client.camFollowHeight; // L: 3704
		} else if (Client.oculusOrbState == 1) { // L: 3706
			class16.method200(); // L: 3707
			short var10 = -1; // L: 3708
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3709
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3710
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3711
				if (var10 == 0) { // L: 3712
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3713
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3714
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3716
				if (var10 == 0) { // L: 3717
					var10 = 256;
				} else if (var10 == 1024) { // L: 3718
					var10 = 768;
				} else {
					var10 = 512; // L: 3719
				}
			}

			byte var11 = 0; // L: 3721
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3722
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3723
				var11 = 1;
			}

			var2 = 0; // L: 3724
			if (var10 >= 0 || var11 != 0) { // L: 3725
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * -1756488183 * 714395705 : Client.oculusOrbNormalSpeed * -1640452853 * 1261221539; // L: 3726
				var2 *= 16; // L: 3727
				Client.field497 = var10; // L: 3728
				Client.field583 = var11; // L: 3729
			}

			if (Client.field581 < var2) { // L: 3731
				Client.field581 += var2 / 8; // L: 3732
				if (Client.field581 > var2) { // L: 3733
					Client.field581 = var2;
				}
			} else if (Client.field581 > var2) { // L: 3735
				Client.field581 = Client.field581 * 9 / 10;
			}

			if (Client.field581 > 0) { // L: 3736
				var3 = Client.field581 / 16; // L: 3737
				if (Client.field497 >= 0) { // L: 3738
					var0 = Client.field497 - class7.cameraYaw & 2047; // L: 3739
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3740
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3741
					class29.oculusOrbFocalPointX += var3 * var4 / 65536; // L: 3742
					class121.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 3743
				}

				if (Client.field583 != 0) { // L: 3745
					SpriteMask.field3218 += var3 * Client.field583; // L: 3746
					if (SpriteMask.field3218 > 0) { // L: 3747
						SpriteMask.field3218 = 0;
					}
				}
			} else {
				Client.field497 = -1; // L: 3751
				Client.field583 = -1; // L: 3752
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3754
				Client.packetWriter.addNode(class135.getPacketBufferNode(ClientPacket.field2891, Client.packetWriter.isaacCipher)); // L: 3756
				Client.oculusOrbState = 0; // L: 3757
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class370.mouseCam) { // L: 3761
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3762
			Client.camAngleDX = var0 * 2; // L: 3763
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * 674458539 * 231487235; // L: 3764
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3765
			Client.camAngleDY = var1 * 2; // L: 3766
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x * -639406763 * 977348605; // L: 3767
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3770
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3771
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 3772
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3773
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3774
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 3775
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3776
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3777
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 3779
		Client.camAngleX += Client.camAngleDX / 2; // L: 3780
		if (Client.camAngleX < 128) { // L: 3781
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3782
			Client.camAngleX = 383;
		}

	} // L: 3783
}
