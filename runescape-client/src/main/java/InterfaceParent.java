import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("sceneMinimapSprite")
	static Sprite sceneMinimapSprite;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1986621351
	)
	@Export("group")
	int group;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -41526563
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	boolean field596;

	InterfaceParent() {
		this.field596 = false; // L: 8
	} // L: 10

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-2067928817"
	)
	public static int method1272(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 38
			int var6 = var3; // L: 39
			var3 = var4; // L: 40
			var4 = var6; // L: 41
		}

		var2 &= 3; // L: 43
		if (var2 == 0) { // L: 44
			return var1;
		} else if (var2 == 1) { // L: 45
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 46
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1980231219"
	)
	public static void method1270() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 338

			for (int var0 = 0; var0 < class297.idxCount; ++var0) { // L: 339
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 340
			JagexCache.JagexCache_randomDat.close(); // L: 341
		} catch (Exception var2) { // L: 343
		}

	} // L: 344

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-425142787"
	)
	static int method1271(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field1129 - 7.0D) * 256.0D); // L: 3197
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-271325074"
	)
	static final void method1269() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3775
			var0 = PlayerType.localPlayer.x; // L: 3776
			var1 = PlayerType.localPlayer.y; // L: 3777
			if (TileItem.oculusOrbFocalPointX - var0 < -500 || TileItem.oculusOrbFocalPointX - var0 > 500 || Interpreter.oculusOrbFocalPointY - var1 < -500 || Interpreter.oculusOrbFocalPointY - var1 > 500) { // L: 3778
				TileItem.oculusOrbFocalPointX = var0; // L: 3779
				Interpreter.oculusOrbFocalPointY = var1; // L: 3780
			}

			if (var0 != TileItem.oculusOrbFocalPointX) { // L: 3782
				TileItem.oculusOrbFocalPointX += (var0 - TileItem.oculusOrbFocalPointX) / 16;
			}

			if (var1 != Interpreter.oculusOrbFocalPointY) { // L: 3783
				Interpreter.oculusOrbFocalPointY += (var1 - Interpreter.oculusOrbFocalPointY) / 16;
			}

			var2 = TileItem.oculusOrbFocalPointX >> 7; // L: 3784
			var3 = Interpreter.oculusOrbFocalPointY >> 7; // L: 3785
			var4 = GrandExchangeOfferWorldComparator.getTileHeight(TileItem.oculusOrbFocalPointX, Interpreter.oculusOrbFocalPointY, GrandExchangeOfferUnitPriceComparator.Client_plane); // L: 3786
			var5 = 0; // L: 3787
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3788
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3789
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3790
						int var8 = GrandExchangeOfferUnitPriceComparator.Client_plane; // L: 3791
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3792
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3793
						if (var9 > var5) { // L: 3794
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3798
			if (var6 > 98048) { // L: 3799
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3800
				var6 = 32768;
			}

			if (var6 > Client.field810) { // L: 3801
				Client.field810 += (var6 - Client.field810) / 24;
			} else if (var6 < Client.field810) { // L: 3802
				Client.field810 += (var6 - Client.field810) / 80;
			}

			Tiles.field542 = GrandExchangeOfferWorldComparator.getTileHeight(PlayerType.localPlayer.x, PlayerType.localPlayer.y, GrandExchangeOfferUnitPriceComparator.Client_plane) - Client.camFollowHeight; // L: 3803
		} else if (Client.oculusOrbState == 1) { // L: 3805
			if (Client.field725 && PlayerType.localPlayer != null) { // L: 3807
				var0 = PlayerType.localPlayer.pathX[0]; // L: 3808
				var1 = PlayerType.localPlayer.pathY[0]; // L: 3809
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) { // L: 3810
					TileItem.oculusOrbFocalPointX = PlayerType.localPlayer.x; // L: 3811
					var2 = GrandExchangeOfferWorldComparator.getTileHeight(PlayerType.localPlayer.x, PlayerType.localPlayer.y, GrandExchangeOfferUnitPriceComparator.Client_plane) - Client.camFollowHeight; // L: 3812
					if (var2 < Tiles.field542) { // L: 3813
						Tiles.field542 = var2;
					}

					Interpreter.oculusOrbFocalPointY = PlayerType.localPlayer.y; // L: 3814
					Client.field725 = false; // L: 3815
				}
			}

			short var10 = -1; // L: 3818
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3819
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3820
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3821
				if (var10 == 0) { // L: 3822
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3823
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3824
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3826
				if (var10 == 0) { // L: 3827
					var10 = 256;
				} else if (var10 == 1024) { // L: 3828
					var10 = 768;
				} else {
					var10 = 512; // L: 3829
				}
			}

			byte var11 = 0; // L: 3831
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3832
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3833
				var11 = 1;
			}

			var2 = 0; // L: 3834
			if (var10 >= 0 || var11 != 0) { // L: 3835
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * -285231223 * 1077669561 : Client.oculusOrbNormalSpeed * -1776720113 * 588425199; // L: 3836
				var2 *= 16; // L: 3837
				Client.field759 = var10; // L: 3838
				Client.field760 = var11; // L: 3839
			}

			if (Client.field692 < var2) { // L: 3841
				Client.field692 += var2 / 8; // L: 3842
				if (Client.field692 > var2) { // L: 3843
					Client.field692 = var2;
				}
			} else if (Client.field692 > var2) { // L: 3845
				Client.field692 = Client.field692 * 9 / 10;
			}

			if (Client.field692 > 0) { // L: 3846
				var3 = Client.field692 / 16; // L: 3847
				if (Client.field759 >= 0) { // L: 3848
					var0 = Client.field759 - ViewportMouse.cameraYaw & 2047; // L: 3849
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3850
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3851
					TileItem.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 3852
					Interpreter.oculusOrbFocalPointY += var5 * var3 / 65536; // L: 3853
				}

				if (Client.field760 != 0) { // L: 3855
					Tiles.field542 += var3 * Client.field760; // L: 3856
					if (Tiles.field542 > 0) { // L: 3857
						Tiles.field542 = 0;
					}
				}
			} else {
				Client.field759 = -1; // L: 3861
				Client.field760 = -1; // L: 3862
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3864
				LoginScreenAnimation.method1945(); // L: 3865
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && MusicPatchNode.mouseCam) { // L: 3868
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3869
			Client.camAngleDX = var0 * 2; // L: 3870
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * 990882725 * -581221331; // L: 3871
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3872
			Client.camAngleDY = var1 * 2; // L: 3873
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x * -2115208813 * 219319451; // L: 3874
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3877
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3878
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 3879
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3880
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3881
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 3882
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3883
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3884
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 3886
		Client.camAngleX += Client.camAngleDX / 2; // L: 3887
		if (Client.camAngleX < 128) { // L: 3888
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3889
			Client.camAngleX = 383;
		}

	} // L: 3890

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "218474433"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 9845

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 9846
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 9847
		}

		if (var1.length() > 9) { // L: 9849
			return " " + Client.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + Client.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + Client.colorStartTag(16776960) + var1 + "</col>"; // L: 9850 9851
		}
	}
}
