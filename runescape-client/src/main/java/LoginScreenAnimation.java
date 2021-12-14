import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("j")
	int[] field1177;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -296977857
	)
	int field1182;
	@ObfuscatedName("n")
	int[] field1170;
	@ObfuscatedName("r")
	int[] field1171;
	@ObfuscatedName("o")
	int[] field1174;
	@ObfuscatedName("v")
	int[] field1173;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 625554107
	)
	int field1175;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1584674653
	)
	int field1169;
	@ObfuscatedName("g")
	int[] field1176;
	@ObfuscatedName("e")
	int[] field1183;
	@ObfuscatedName("a")
	int[] field1178;
	@ObfuscatedName("u")
	int[] field1179;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1049118119
	)
	int field1168;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2026399881
	)
	int field1181;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -176413191
	)
	int field1164;

	@ObfuscatedSignature(
		descriptor = "([Lpa;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1177 = new int[256];
		this.field1182 = 0;
		this.field1175 = 0;
		this.field1169 = 0;
		this.field1168 = 0;
		this.field1181 = 0;
		this.field1164 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1897879869"
	)
	@Export("initColors")
	void initColors() {
		this.field1171 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1171[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1171[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1171[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1171[var1 + 192] = 16777215;
		}

		this.field1174 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1174[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1174[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1174[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1174[var1 + 192] = 16777215;
		}

		this.field1173 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1173[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1173[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1173[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1173[var1 + 192] = 16777215;
		}

		this.field1170 = new int[256];
		this.field1168 = 0;
		this.field1178 = new int[32768];
		this.field1179 = new int[32768];
		this.method2260((IndexedSprite)null);
		this.field1176 = new int[32768];
		this.field1183 = new int[32768];
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2280() {
		this.field1171 = null;
		this.field1174 = null;
		this.field1173 = null;
		this.field1170 = null;
		this.field1178 = null;
		this.field1179 = null;
		this.field1176 = null;
		this.field1183 = null;
		this.field1168 = 0;
		this.field1181 = 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1176 == null) {
			this.initColors();
		}

		if (this.field1164 == 0) {
			this.field1164 = var2;
		}

		int var3 = var2 - this.field1164;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1164 = var2;
		if (var3 > 0) {
			this.method2255(var3);
		}

		this.method2257(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-399944521"
	)
	final void method2255(int var1) {
		this.field1168 += var1 * 128;
		int var2;
		if (this.field1168 > this.field1178.length) {
			this.field1168 -= this.field1178.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2260(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1176[var3 + var2] - this.field1178[var2 + this.field1168 & this.field1178.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1176[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1176[var9 + var8] = 255;
				} else {
					this.field1176[var9 + var8] = 0;
				}
			}
		}

		if (this.field1175 > 0) {
			this.field1175 -= var1 * 4;
		}

		if (this.field1169 > 0) {
			this.field1169 -= var1 * 4;
		}

		if (this.field1175 == 0 && this.field1169 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1175 = 1024;
			}

			if (var7 == 1) {
				this.field1169 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1177[var7] = this.field1177[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1177[var7] = (int)(Math.sin((double)this.field1182 / 14.0D) * 16.0D + Math.sin((double)this.field1182 / 15.0D) * 14.0D + Math.sin((double)this.field1182 / 16.0D) * 12.0D);
			++this.field1182;
		}

		this.field1181 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1181 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1176[var12 + (var13 << 7)] = 192;
			}

			this.field1181 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1176[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1176[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1183[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1183[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1183[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1176[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "0"
	)
	final int method2256(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "88"
	)
	final void method2257(int var1) {
		int var2 = this.field1170.length;
		if (this.field1175 > 0) {
			this.method2258(this.field1175, this.field1174);
		} else if (this.field1169 > 0) {
			this.method2258(this.field1169, this.field1173);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1170[var3] = this.field1171[var3];
			}
		}

		this.method2276(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1795149133"
	)
	final void method2258(int var1, int[] var2) {
		int var3 = this.field1170.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1170[var4] = this.method2256(this.field1171[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1170[var4] = var2[var4];
			} else {
				this.field1170[var4] = this.method2256(var2[var4], this.field1171[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2135286460"
	)
	final void method2276(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1177[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class19.rasterProvider.width) {
				var7 = class19.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class19.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1176[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1170[var10];
					int var14 = class19.rasterProvider.pixels[var8];
					class19.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpa;I)V",
		garbageValue = "-2061300946"
	)
	final void method2260(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1178.length; ++var2) {
			this.field1178[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1178[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1179[var5] = (this.field1178[var5 + 1] + this.field1178[var5 - 128] + this.field1178[var5 + 128] + this.field1178[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1178;
			this.field1178 = this.field1179;
			this.field1179 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1178[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldh;",
		garbageValue = "1954568677"
	)
	static class114[] method2251() {
		return new class114[]{class114.field1390, class114.field1383, class114.field1384, class114.field1391, class114.field1386};
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-50914132"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		UrlRequest.method2496();
		class7.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		class260.musicPlayerStatus = 1;
		class124.musicTrackArchive = null;
		VarcInt.musicTrackGroupId = -1;
		class260.musicTrackFileId = -1;
		ChatChannel.musicTrackVolume = 0;
		DynamicObject.musicTrackBoolean = false;
		class260.pcmSampleLength = 2;
		Client.currentTrackGroupId = -1;
		Client.field743 = false;
		GrandExchangeEvent.method5760();
		VertexNormal.updateGameState(10);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "768"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (SecureRandomFuture.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
