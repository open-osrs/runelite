import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("w")
	int[] field1091;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -58252943
	)
	int field1092;
	@ObfuscatedName("o")
	int[] field1101;
	@ObfuscatedName("x")
	int[] field1094;
	@ObfuscatedName("r")
	int[] field1095;
	@ObfuscatedName("p")
	int[] field1102;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -373755775
	)
	int field1097;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1720993539
	)
	int field1098;
	@ObfuscatedName("a")
	int[] field1099;
	@ObfuscatedName("q")
	int[] field1100;
	@ObfuscatedName("u")
	int[] field1104;
	@ObfuscatedName("e")
	int[] field1086;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -535955847
	)
	int field1093;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1553047481
	)
	int field1087;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 485898743
	)
	int field1105;

	@ObfuscatedSignature(
		descriptor = "([Lof;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1091 = new int[256];
		this.field1092 = 0;
		this.field1097 = 0;
		this.field1098 = 0;
		this.field1093 = 0;
		this.field1087 = 0;
		this.field1105 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1509815811"
	)
	@Export("initColors")
	void initColors() {
		this.field1094 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1094[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1094[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1094[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1094[var1 + 192] = 16777215;
		}

		this.field1095 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1095[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1095[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1095[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1095[var1 + 192] = 16777215;
		}

		this.field1102 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1102[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1102[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1102[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1102[var1 + 192] = 16777215;
		}

		this.field1101 = new int[256];
		this.field1093 = 0;
		this.field1104 = new int[32768];
		this.field1086 = new int[32768];
		this.method1904((IndexedSprite)null);
		this.field1099 = new int[32768];
		this.field1100 = new int[32768];
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-729695541"
	)
	void method1917() {
		this.field1094 = null;
		this.field1095 = null;
		this.field1102 = null;
		this.field1101 = null;
		this.field1104 = null;
		this.field1086 = null;
		this.field1099 = null;
		this.field1100 = null;
		this.field1093 = 0;
		this.field1087 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-981209872"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1099 == null) {
			this.initColors();
		}

		if (this.field1105 == 0) {
			this.field1105 = var2;
		}

		int var3 = var2 - this.field1105;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1105 = var2;
		if (var3 > 0) {
			this.method1899(var3);
		}

		this.method1901(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1945363897"
	)
	final void method1899(int var1) {
		this.field1093 += var1 * 128;
		int var2;
		if (this.field1093 > this.field1104.length) {
			this.field1093 -= this.field1104.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method1904(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1099[var3 + var2] - this.field1104[var2 + this.field1093 & this.field1104.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1099[var2++] = var6;
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
					this.field1099[var9 + var8] = 255;
				} else {
					this.field1099[var9 + var8] = 0;
				}
			}
		}

		if (this.field1097 > 0) {
			this.field1097 -= var1 * 4;
		}

		if (this.field1098 > 0) {
			this.field1098 -= var1 * 4;
		}

		if (this.field1097 == 0 && this.field1098 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1097 = 1024;
			}

			if (var7 == 1) {
				this.field1098 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1091[var7] = this.field1091[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1091[var7] = (int)(Math.sin((double)this.field1092 / 14.0D) * 16.0D + Math.sin((double)this.field1092 / 15.0D) * 14.0D + Math.sin((double)this.field1092 / 16.0D) * 12.0D);
			++this.field1092;
		}

		this.field1087 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1087 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1099[var12 + (var13 << 7)] = 192;
			}

			this.field1087 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1099[var14 + var13 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1099[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1100[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1100[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1100[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1099[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2051749409"
	)
	final int method1900(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "965888559"
	)
	final void method1901(int var1) {
		int var2 = this.field1101.length;
		if (this.field1097 > 0) {
			this.method1902(this.field1097, this.field1095);
		} else if (this.field1098 > 0) {
			this.method1902(this.field1098, this.field1102);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1101[var3] = this.field1094[var3];
			}
		}

		this.method1921(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I[IS)V",
		garbageValue = "9599"
	)
	final void method1902(int var1, int[] var2) {
		int var3 = this.field1101.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1101[var4] = this.method1900(this.field1094[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1101[var4] = var2[var4];
			} else {
				this.field1101[var4] = this.method1900(var2[var4], this.field1094[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1615497602"
	)
	final void method1921(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1091[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class263.rasterProvider.width) {
				var7 = class263.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class263.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1099[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1101[var10];
					int var14 = class263.rasterProvider.pixels[var8];
					class263.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-2013414147"
	)
	final void method1904(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1104.length; ++var2) {
			this.field1104[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1104[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1086[var5] = (this.field1104[var5 - 128] + this.field1104[var5 + 1] + this.field1104[var5 + 128] + this.field1104[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1104;
			this.field1104 = this.field1086;
			this.field1086 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1104[var7] = 0;
					}
				}
			}
		}

	}
}
