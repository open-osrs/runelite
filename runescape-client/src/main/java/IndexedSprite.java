import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("le")
@Implements("IndexedSprite")
public final class IndexedSprite extends Rasterizer2D {
	@ObfuscatedName("f")
	@Export("pixels")
	public byte[] pixels;
	@ObfuscatedName("b")
	@Export("palette")
	public int[] palette;
	@ObfuscatedName("l")
	@Export("subWidth")
	public int subWidth;
	@ObfuscatedName("m")
	@Export("subHeight")
	public int subHeight;
	@ObfuscatedName("z")
	@Export("xOffset")
	public int xOffset;
	@ObfuscatedName("q")
	@Export("yOffset")
	public int yOffset;
	@ObfuscatedName("k")
	@Export("width")
	public int width;
	@ObfuscatedName("c")
	@Export("height")
	public int height;

	IndexedSprite() {
	} // L: 15

	@ObfuscatedName("f")
	@Export("normalize")
	public void normalize() {
		if (this.subWidth != this.width || this.subHeight != this.height) { // L: 18
			byte[] var1 = new byte[this.width * this.height]; // L: 19
			int var2 = 0; // L: 20

			for (int var3 = 0; var3 < this.subHeight; ++var3) { // L: 21
				for (int var4 = 0; var4 < this.subWidth; ++var4) { // L: 22
					var1[var4 + (var3 + this.yOffset) * this.width + this.xOffset] = this.pixels[var2++]; // L: 23
				}
			}

			this.pixels = var1; // L: 26
			this.subWidth = this.width; // L: 27
			this.subHeight = this.height; // L: 28
			this.xOffset = 0; // L: 29
			this.yOffset = 0; // L: 30
		}
	} // L: 31

	@ObfuscatedName("b")
	@Export("shiftColors")
	public void shiftColors(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.palette.length; ++var4) { // L: 34
			int var5 = this.palette[var4] >> 16 & 255; // L: 35
			var5 += var1; // L: 36
			if (var5 < 0) { // L: 37
				var5 = 0;
			} else if (var5 > 255) { // L: 38
				var5 = 255;
			}

			int var6 = this.palette[var4] >> 8 & 255; // L: 39
			var6 += var2; // L: 40
			if (var6 < 0) { // L: 41
				var6 = 0;
			} else if (var6 > 255) { // L: 42
				var6 = 255;
			}

			int var7 = this.palette[var4] & 255; // L: 43
			var7 += var3; // L: 44
			if (var7 < 0) { // L: 45
				var7 = 0;
			} else if (var7 > 255) { // L: 46
				var7 = 255;
			}

			this.palette[var4] = var7 + (var6 << 8) + (var5 << 16); // L: 47
		}

	} // L: 49

	@ObfuscatedName("l")
	@Export("drawAt")
	public void drawAt(int var1, int var2) {
		var1 += this.xOffset; // L: 52
		var2 += this.yOffset; // L: 53
		int var3 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 54
		int var4 = 0; // L: 55
		int var5 = this.subHeight; // L: 56
		int var6 = this.subWidth; // L: 57
		int var7 = Rasterizer2D.Rasterizer2D_width - var6; // L: 58
		int var8 = 0; // L: 59
		int var9;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 60
			var9 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 61
			var5 -= var9; // L: 62
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 63
			var4 += var9 * var6; // L: 64
			var3 += var9 * Rasterizer2D.Rasterizer2D_width; // L: 65
		}

		if (var5 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 67
			var5 -= var5 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 68
			var9 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 69
			var6 -= var9; // L: 70
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 71
			var4 += var9; // L: 72
			var3 += var9; // L: 73
			var8 += var9; // L: 74
			var7 += var9; // L: 75
		}

		if (var6 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 77
			var9 = var6 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 78
			var6 -= var9; // L: 79
			var8 += var9; // L: 80
			var7 += var9; // L: 81
		}

		if (var6 > 0 && var5 > 0) { // L: 83
			IndexedSprite_two(Rasterizer2D.Rasterizer2D_pixels, this.pixels, this.palette, var4, var3, var6, var5, var7, var8); // L: 84
		}
	} // L: 85

	@ObfuscatedName("z")
	public void method6247(int var1, int var2, int var3, int var4) {
		int var5 = this.subWidth; // L: 116
		int var6 = this.subHeight; // L: 117
		int var7 = 0; // L: 118
		int var8 = 0; // L: 119
		int var9 = this.width; // L: 120
		int var10 = this.height; // L: 121
		int var11 = (var9 << 16) / var3; // L: 122
		int var12 = (var10 << 16) / var4; // L: 123
		int var13;
		if (this.xOffset > 0) { // L: 124
			var13 = (var11 + (this.xOffset << 16) - 1) / var11; // L: 125
			var1 += var13; // L: 126
			var7 += var13 * var11 - (this.xOffset << 16); // L: 127
		}

		if (this.yOffset > 0) { // L: 129
			var13 = (var12 + (this.yOffset << 16) - 1) / var12; // L: 130
			var2 += var13; // L: 131
			var8 += var13 * var12 - (this.yOffset << 16); // L: 132
		}

		if (var5 < var9) { // L: 134
			var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
		}

		if (var6 < var10) { // L: 135
			var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
		}

		var13 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 136
		int var14 = Rasterizer2D.Rasterizer2D_width - var3; // L: 137
		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 138
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		int var15;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 139
			var15 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 140
			var4 -= var15; // L: 141
			var13 += var15 * Rasterizer2D.Rasterizer2D_width; // L: 142
			var8 += var12 * var15; // L: 143
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 145
			var15 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 146
			var3 -= var15; // L: 147
			var14 += var15; // L: 148
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 150
			var15 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 151
			var3 -= var15; // L: 152
			var13 += var15; // L: 153
			var7 += var11 * var15; // L: 154
			var14 += var15; // L: 155
		}

		IndexedSprite_something(Rasterizer2D.Rasterizer2D_pixels, this.pixels, this.palette, var7, var8, var13, var14, var3, var4, var11, var12, var5); // L: 157
	} // L: 158

	@ObfuscatedName("m")
	@Export("IndexedSprite_two")
	static void IndexedSprite_two(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 88
		var5 = -(var5 & 3); // L: 89

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 90
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) { // L: 91
				var12 = var1[var3++]; // L: 92
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255]; // L: 93
				} else {
					++var4; // L: 94
				}

				var12 = var1[var3++]; // L: 95
				if (var12 != 0) { // L: 96
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4; // L: 97
				}

				var12 = var1[var3++]; // L: 98
				if (var12 != 0) { // L: 99
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4; // L: 100
				}

				var12 = var1[var3++]; // L: 101
				if (var12 != 0) { // L: 102
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4; // L: 103
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 105
				var12 = var1[var3++]; // L: 106
				if (var12 != 0) { // L: 107
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4; // L: 108
				}
			}

			var4 += var7; // L: 110
			var3 += var8; // L: 111
		}

	} // L: 113

	@ObfuscatedName("q")
	@Export("IndexedSprite_something")
	static void IndexedSprite_something(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3; // L: 161

		for (int var13 = -var8; var13 < 0; ++var13) { // L: 162
			int var14 = var11 * (var4 >> 16); // L: 163

			for (int var15 = -var7; var15 < 0; ++var15) { // L: 164
				byte var16 = var1[(var3 >> 16) + var14]; // L: 165
				if (var16 != 0) { // L: 166
					var0[var5++] = var2[var16 & 255];
				} else {
					++var5; // L: 167
				}

				var3 += var9; // L: 168
			}

			var4 += var10; // L: 170
			var3 = var12; // L: 171
			var5 += var6; // L: 172
		}

	} // L: 174
}
