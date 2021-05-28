import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -313850043
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1167855135
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("p")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1447154143
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1593028731
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1490944887
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1914058459
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1757390819
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1776147055
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1239811963
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true;
		this.secondaryRgb = -1; // L: 15
	} // L: 23

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-593078672"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 37
			this.setHsl(this.secondaryRgb); // L: 38
			this.secondaryHue = this.hue; // L: 39
			this.secondarySaturation = this.saturation; // L: 40
			this.secondaryLightness = this.lightness; // L: 41
		}

		this.setHsl(this.primaryRgb); // L: 43
	} // L: 44

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1052896488"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 48
			if (var3 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var3, var2); // L: 50
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;III)V",
		garbageValue = "666748128"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 55
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 56
		} else if (var2 == 5) { // L: 57
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 58
		} else if (var2 == 8) { // L: 59
		}

	} // L: 61

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "273923551"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 64
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 65
		double var6 = (double)(var1 & 255) / 256.0D; // L: 66
		double var8 = var2; // L: 67
		if (var4 < var2) { // L: 68
			var8 = var4;
		}

		if (var6 < var8) { // L: 69
			var8 = var6;
		}

		double var10 = var2; // L: 70
		if (var4 > var2) { // L: 71
			var10 = var4;
		}

		if (var6 > var10) { // L: 72
			var10 = var6;
		}

		double var12 = 0.0D; // L: 73
		double var14 = 0.0D; // L: 74
		double var16 = (var10 + var8) / 2.0D; // L: 75
		if (var8 != var10) { // L: 76
			if (var16 < 0.5D) { // L: 77
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 78
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 79
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 80
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 81
			}
		}

		var12 /= 6.0D; // L: 83
		this.hue = (int)(256.0D * var12); // L: 84
		this.saturation = (int)(256.0D * var14); // L: 85
		this.lightness = (int)(256.0D * var16); // L: 86
		if (this.saturation < 0) { // L: 87
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 88
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 89
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 90
			this.lightness = 255;
		}

	} // L: 91

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)[Len;",
		garbageValue = "-10573"
	)
	static HorizontalAlignment[] method3103() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1628, HorizontalAlignment.field1624}; // L: 14
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lbm;S)V",
		garbageValue = "10038"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 263
		if (var0.sound != null) { // L: 264
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 265
		}

	} // L: 266

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "672313899"
	)
	static final void method3104() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3504
			var0 = class93.localPlayer.x; // L: 3505
			var1 = class93.localPlayer.y; // L: 3506
			if (RouteStrategy.oculusOrbFocalPointX - var0 < -500 || RouteStrategy.oculusOrbFocalPointX - var0 > 500 || ModelData0.oculusOrbFocalPointY - var1 < -500 || ModelData0.oculusOrbFocalPointY - var1 > 500) { // L: 3507
				RouteStrategy.oculusOrbFocalPointX = var0; // L: 3508
				ModelData0.oculusOrbFocalPointY = var1; // L: 3509
			}

			if (var0 != RouteStrategy.oculusOrbFocalPointX) { // L: 3511
				RouteStrategy.oculusOrbFocalPointX += (var0 - RouteStrategy.oculusOrbFocalPointX) / 16;
			}

			if (var1 != ModelData0.oculusOrbFocalPointY) { // L: 3512
				ModelData0.oculusOrbFocalPointY += (var1 - ModelData0.oculusOrbFocalPointY) / 16;
			}

			var2 = RouteStrategy.oculusOrbFocalPointX >> 7; // L: 3513
			var3 = ModelData0.oculusOrbFocalPointY >> 7; // L: 3514
			var4 = class105.getTileHeight(RouteStrategy.oculusOrbFocalPointX, ModelData0.oculusOrbFocalPointY, class22.Client_plane); // L: 3515
			var5 = 0; // L: 3516
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3517
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3518
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3519
						int var8 = class22.Client_plane; // L: 3520
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3521
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3522
						if (var9 > var5) { // L: 3523
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3527
			if (var6 > 98048) { // L: 3528
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3529
				var6 = 32768;
			}

			if (var6 > Client.field727) { // L: 3530
				Client.field727 += (var6 - Client.field727) / 24;
			} else if (var6 < Client.field727) { // L: 3531
				Client.field727 += (var6 - Client.field727) / 80;
			}

			class17.field148 = class105.getTileHeight(class93.localPlayer.x, class93.localPlayer.y, class22.Client_plane) - Client.camFollowHeight; // L: 3532
		} else if (Client.oculusOrbState == 1) { // L: 3534
			NPCComposition.method2791(); // L: 3535
			short var10 = -1; // L: 3536
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3537
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3538
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3539
				if (var10 == 0) { // L: 3540
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3541
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3542
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3544
				if (var10 == 0) { // L: 3545
					var10 = 256;
				} else if (var10 == 1024) { // L: 3546
					var10 = 768;
				} else {
					var10 = 512; // L: 3547
				}
			}

			byte var11 = 0; // L: 3549
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3550
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3551
				var11 = 1;
			}

			var2 = 0; // L: 3552
			if (var10 >= 0 || var11 != 0) { // L: 3553
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * 988767649 * 918404705 : Client.oculusOrbNormalSpeed * 615844635 * -503425261; // L: 3554
				var2 *= 16; // L: 3555
				Client.field732 = var10; // L: 3556
				Client.field720 = var11; // L: 3557
			}

			if (Client.field718 < var2) { // L: 3559
				Client.field718 += var2 / 8; // L: 3560
				if (Client.field718 > var2) { // L: 3561
					Client.field718 = var2;
				}
			} else if (Client.field718 > var2) { // L: 3563
				Client.field718 = Client.field718 * 9 / 10;
			}

			if (Client.field718 > 0) { // L: 3564
				var3 = Client.field718 / 16; // L: 3565
				if (Client.field732 >= 0) { // L: 3566
					var0 = Client.field732 - class376.cameraYaw & 2047; // L: 3567
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3568
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3569
					RouteStrategy.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 3570
					ModelData0.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 3571
				}

				if (Client.field720 != 0) { // L: 3573
					class17.field148 += var3 * Client.field720; // L: 3574
					if (class17.field148 > 0) { // L: 3575
						class17.field148 = 0;
					}
				}
			} else {
				Client.field732 = -1; // L: 3579
				Client.field720 = -1; // L: 3580
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3582
				MouseHandler.method634(); // L: 3583
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && Client.mouseCam) { // L: 3586
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3587
			Client.camAngleDX = var0 * 2; // L: 3588
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y * 1903378733 * -460999003; // L: 3589
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3590
			Client.camAngleDY = var1 * 2; // L: 3591
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x * -678881683 * -243899547; // L: 3592
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3595
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3596
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 3597
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3598
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3599
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 3600
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3601
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3602
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 3604
		Client.camAngleX += Client.camAngleDX / 2; // L: 3605
		if (Client.camAngleX < 128) { // L: 3606
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3607
			Client.camAngleX = 383;
		}

	} // L: 3608
}
