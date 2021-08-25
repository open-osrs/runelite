import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ag")
	static String field1167;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("z")
	int[] field1159;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1523608843
	)
	int field1164;
	@ObfuscatedName("u")
	int[] field1165;
	@ObfuscatedName("e")
	int[] field1166;
	@ObfuscatedName("l")
	int[] field1175;
	@ObfuscatedName("y")
	int[] field1168;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1654092485
	)
	int field1169;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 183335521
	)
	int field1178;
	@ObfuscatedName("s")
	int[] field1171;
	@ObfuscatedName("h")
	int[] field1172;
	@ObfuscatedName("d")
	int[] field1173;
	@ObfuscatedName("q")
	int[] field1174;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1208104181
	)
	int field1163;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -183509873
	)
	int field1170;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1212021115
	)
	int field1176;

	@ObfuscatedSignature(
		descriptor = "([Loi;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1159 = new int[256];
		this.field1164 = 0;
		this.field1169 = 0;
		this.field1178 = 0;
		this.field1163 = 0;
		this.field1170 = 0;
		this.field1176 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	@Export("initColors")
	void initColors() {
		this.field1166 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1166[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1166[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1166[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1166[var1 + 192] = 16777215;
		}

		this.field1175 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1175[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1175[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1175[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1175[var1 + 192] = 16777215;
		}

		this.field1168 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1168[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1168[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1168[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1168[var1 + 192] = 16777215;
		}

		this.field1165 = new int[256];
		this.field1163 = 0;
		this.field1173 = new int[32768];
		this.field1174 = new int[32768];
		this.method2158((IndexedSprite)null);
		this.field1171 = new int[32768];
		this.field1172 = new int[32768];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1783591644"
	)
	void method2151() {
		this.field1166 = null;
		this.field1175 = null;
		this.field1168 = null;
		this.field1165 = null;
		this.field1173 = null;
		this.field1174 = null;
		this.field1171 = null;
		this.field1172 = null;
		this.field1163 = 0;
		this.field1170 = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-690579043"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1171 == null) {
			this.initColors();
		}

		if (this.field1176 == 0) {
			this.field1176 = var2;
		}

		int var3 = var2 - this.field1176;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1176 = var2;
		if (var3 > 0) {
			this.method2153(var3);
		}

		this.method2155(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1927235987"
	)
	final void method2153(int var1) {
		this.field1163 += 128 * var1;
		int var2;
		if (this.field1163 > this.field1173.length) {
			this.field1163 -= this.field1173.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2158(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1171[var3 + var2] - this.field1173[var2 + this.field1163 & this.field1173.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1171[var2++] = var6;
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
					this.field1171[var9 + var8] = 255;
				} else {
					this.field1171[var8 + var9] = 0;
				}
			}
		}

		if (this.field1169 > 0) {
			this.field1169 -= var1 * 4;
		}

		if (this.field1178 > 0) {
			this.field1178 -= var1 * 4;
		}

		if (this.field1169 == 0 && this.field1178 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1169 = 1024;
			}

			if (var7 == 1) {
				this.field1178 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1159[var7] = this.field1159[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1159[var7] = (int)(Math.sin((double)this.field1164 / 14.0D) * 16.0D + Math.sin((double)this.field1164 / 15.0D) * 14.0D + Math.sin((double)this.field1164 / 16.0D) * 12.0D);
			++this.field1164;
		}

		this.field1170 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1170 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1171[var12 + (var13 << 7)] = 192;
			}

			this.field1170 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1171[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1171[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1172[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1172[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1172[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1171[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1911312625"
	)
	final int method2165(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-57"
	)
	final void method2155(int var1) {
		int var2 = this.field1165.length;
		if (this.field1169 > 0) {
			this.method2171(this.field1169, this.field1175);
		} else if (this.field1178 > 0) {
			this.method2171(this.field1178, this.field1168);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1165[var3] = this.field1166[var3];
			}
		}

		this.method2174(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "51"
	)
	final void method2171(int var1, int[] var2) {
		int var3 = this.field1165.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1165[var4] = this.method2165(this.field1166[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1165[var4] = var2[var4];
			} else {
				this.field1165[var4] = this.method2165(var2[var4], this.field1166[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1491241203"
	)
	final void method2174(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1159[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class11.rasterProvider.width) {
				var7 = class11.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class11.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1171[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1165[var10];
					int var14 = class11.rasterProvider.pixels[var8];
					class11.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)V",
		garbageValue = "-1146332143"
	)
	final void method2158(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1173.length; ++var2) {
			this.field1173[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1173[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1174[var5] = (this.field1173[var5 + 1] + this.field1173[var5 - 128] + this.field1173[var5 + 128] + this.field1173[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1173;
			this.field1173 = this.field1174;
			this.field1174 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1173[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1178151637"
	)
	static void method2173() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}
}
