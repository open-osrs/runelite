import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -793096347
	)
	int field2870;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lz;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("v")
	short[] field2868;
	@ObfuscatedName("j")
	byte[] field2873;
	@ObfuscatedName("l")
	byte[] field2867;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lhd;"
	)
	MusicPatchNode2[] field2871;
	@ObfuscatedName("w")
	byte[] field2872;
	@ObfuscatedName("f")
	int[] field2874;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128];
		this.field2868 = new short[128];
		this.field2873 = new byte[128];
		this.field2867 = new byte[128];
		this.field2871 = new MusicPatchNode2[128];
		this.field2872 = new byte[128];
		this.field2874 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var41 = var2.readUnsignedByte();
				if (var41 == 0) {
					var13 = var12++;
				} else {
					if (var41 <= var13) {
						--var41;
					}

					var13 = var41;
				}

				var36[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12];

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var15 = var37[var14] = new MusicPatchNode2();
			int var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field2808 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field2811 = new byte[var40 * 2 + 2];
				var15.field2811[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field2868[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var48 = this.field2868;
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.readVarInt();
			}

			var48 = this.field2868;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field2874[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field2874[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field2872[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field2874[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field2867[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var38 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field2874[var26] != 0) {
				if (var20 == 0) {
					var38 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field2871[var26] = var38;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field2874[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field2873[var27] = (byte)var26;
			--var20;
		}

		this.field2870 = var2.readUnsignedByte() + 1;

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field2808 != null) {
				for (var29 = 1; var29 < var39.field2808.length; var29 += 2) {
					var39.field2808[var29] = var2.readByte();
				}
			}

			if (var39.field2811 != null) {
				for (var29 = 3; var29 < var39.field2811.length - 2; var29 += 2) {
					var39.field2811[var29] = var2.readByte();
				}
			}
		}

		if (var42 != null) {
			for (var27 = 1; var27 < var42.length; var27 += 2) {
				var42[var27] = var2.readByte();
			}
		}

		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field2811 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var39.field2811.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var39.field2811[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field2808 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var39.field2808.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var39.field2808[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var42 != null) {
			var19 = var2.readUnsignedByte();
			var42[0] = (byte)var19;

			for (var27 = 2; var27 < var42.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var42[var27] = (byte)var19;
			}

			var47 = var42[0];
			byte var28 = var42[1];

			for (var29 = 0; var29 < var47; ++var29) {
				this.field2873[var29] = (byte)(var28 * this.field2873[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) {
				var30 = var42[var29];
				byte var31 = var42[var29 + 1];
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = Login.method1658(var32, var30 - var47);
					this.field2873[var33] = (byte)(var34 * this.field2873[var33] + 32 >> 6);
					var32 += var31 - var28;
				}

				var47 = var30;
				var28 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field2873[var45] = (byte)(var28 * this.field2873[var45] + 32 >> 6);
			}

			var15 = null;
		}

		if (var16 != null) {
			var19 = var2.readUnsignedByte();
			var16[0] = (byte)var19;

			for (var27 = 2; var27 < var16.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var16[var27] = (byte)var19;
			}

			var47 = var16[0];
			int var44 = var16[1] << 1;

			for (var29 = 0; var29 < var47; ++var29) {
				var45 = var44 + (this.field2867[var29] & 255);
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field2867[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var46 = var16[var29 + 1] << 1;
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = Login.method1658(var32, var30 - var47);
					int var35 = var34 + (this.field2867[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field2867[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = var44 + (this.field2867[var45] & 255);
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field2867[var45] = (byte)var46;
			}

			Object var43 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field2806 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field2808 != null) {
				var39.field2807 = var2.readUnsignedByte();
			}

			if (var39.field2811 != null) {
				var39.field2805 = var2.readUnsignedByte();
			}

			if (var39.field2806 > 0) {
				var39.field2809 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field2810 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field2810 > 0) {
				var39.field2804 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field2804 > 0) {
				var39.field2812 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lan;[B[II)Z",
		garbageValue = "782174668"
	)
	boolean method4635(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		RawSound var6 = null;

		for (int var7 = 0; var7 < 128; ++var7) {
			if (var2 == null || var2[var7] != 0) {
				int var8 = this.field2874[var7];
				if (var8 != 0) {
					if (var5 != var8) {
						var5 = var8--;
						if ((var8 & 1) == 0) {
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3);
						}

						if (var6 == null) {
							var4 = false;
						}
					}

					if (var6 != null) {
						this.rawSounds[var7] = var6;
						this.field2874[var7] = 0;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-57490262"
	)
	@Export("clear")
	void clear() {
		this.field2874 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;ZII)V",
		garbageValue = "100696029"
	)
	static void method4636(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = ClientPreferences.convertJpgToSprite(var4);
			Login.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				UserComparator4.logoSprite = class117.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				UserComparator4.logoSprite = class117.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				UserComparator4.logoSprite = class117.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			class304.titleboxSprite = class117.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = class117.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			int var7 = var1.getGroupId("runes");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var6 = FileSystem.method2628(var1, var7, var8);
			Login.runesSprite = var6;
			var8 = var1.getGroupId("title_mute");
			int var9 = var1.getFileId(var8, "");
			IndexedSprite[] var10 = FileSystem.method2628(var1, var8, var9);
			FileSystem.title_muteSprite = var10;
			GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite = class117.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			UserComparator5.field1239 = class117.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class172.options_buttons_2Sprite = class117.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			GraphicsDefaults.field3919 = class117.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			ClanSettings.field1386 = GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite.subWidth;
			World.field704 = GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite.subHeight;
			class6.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			class282.field3639 = 0;
			HorizontalAlignment.otp = "";
			Login.field820 = true;
			Login.worldSelectOpen = false;
			if (!Decimator.clientPreferences.titleMusicDisabled) {
				SpotAnimationDefinition.method2875(2, class108.archive6, "scape main", "", 255, false);
			} else {
				class234.musicPlayerStatus = 1;
				class234.musicTrackArchive = null;
				class234.musicTrackGroupId = -1;
				UserComparator6.musicTrackFileId = -1;
				HorizontalAlignment.musicTrackVolume = 0;
				EnumComposition.musicTrackBoolean = false;
				ClanChannel.pcmSampleLength = 2;
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var11 = new Buffer(4);
					var11.writeByte(3);
					var11.writeMedium(0);
					NetCache.NetCache_socket.write(var11.array, 0, 4);
				} catch (IOException var14) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var13) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (MouseRecorder.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			WorldMapSection2.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			UserComparator4.logoSprite.drawAt(Login.xPadding + 382 - UserComparator4.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
