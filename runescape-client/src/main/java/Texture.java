import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("d")
	@Export("Texture_animatedPixels")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("b")
	@Export("averageRGB")
	int averageRGB;
	@ObfuscatedName("n")
	boolean field2511;
	@ObfuscatedName("s")
	@Export("fileIds")
	int[] fileIds;
	@ObfuscatedName("l")
	int[] field2506;
	@ObfuscatedName("q")
	int[] field2507;
	@ObfuscatedName("o")
	int[] field2508;
	@ObfuscatedName("r")
	@Export("animationDirection")
	int animationDirection;
	@ObfuscatedName("p")
	@Export("animationSpeed")
	int animationSpeed;
	@ObfuscatedName("w")
	@Export("pixels")
	int[] pixels;
	@ObfuscatedName("k")
	@Export("isLoaded")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false; // L: 25
		this.averageRGB = var1.readUnsignedShort(); // L: 29
		this.field2511 = var1.readUnsignedByte() == 1; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 >= 1 && var2 <= 4) { // L: 32
			this.fileIds = new int[var2]; // L: 35

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 36
				this.fileIds[var3] = var1.readUnsignedShort();
			}

			if (var2 > 1) { // L: 37
				this.field2506 = new int[var2 - 1]; // L: 38

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 39
					this.field2506[var3] = var1.readUnsignedByte();
				}
			}

			if (var2 > 1) { // L: 41
				this.field2507 = new int[var2 - 1]; // L: 42

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 43
					this.field2507[var3] = var1.readUnsignedByte();
				}
			}

			this.field2508 = new int[var2]; // L: 45

			for (var3 = 0; var3 < var2; ++var3) { // L: 46
				this.field2508[var3] = var1.readInt();
			}

			this.animationDirection = var1.readUnsignedByte(); // L: 47
			this.animationSpeed = var1.readUnsignedByte(); // L: 48
			this.pixels = null; // L: 49
		} else {
			throw new RuntimeException(); // L: 33
		}
	} // L: 50

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(DILln;)Z"
	)
	@Export("load")
	boolean load(double var1, int var3, AbstractArchive var4) {
		int var5;
		for (var5 = 0; var5 < this.fileIds.length; ++var5) { // L: 53
			if (var4.getFileFlat(this.fileIds[var5]) == null) { // L: 54
				return false;
			}
		}

		var5 = var3 * var3; // L: 56
		this.pixels = new int[var5]; // L: 57

		for (int var6 = 0; var6 < this.fileIds.length; ++var6) { // L: 58
			int var8 = this.fileIds[var6]; // L: 60
			byte[] var10 = var4.takeFileFlat(var8); // L: 64
			boolean var9;
			if (var10 == null) { // L: 65
				var9 = false; // L: 66
			} else {
				WorldMapArea.SpriteBuffer_decode(var10); // L: 69
				var9 = true; // L: 70
			}

			IndexedSprite var7;
			if (!var9) { // L: 72
				var7 = null; // L: 73
			} else {
				var7 = HorizontalAlignment.method3492(); // L: 76
			}

			var7.normalize(); // L: 79
			var10 = var7.pixels; // L: 80
			int[] var11 = var7.palette; // L: 81
			int var12 = this.field2508[var6]; // L: 82
			if ((var12 & -16777216) == 16777216) { // L: 83
			}

			if ((var12 & -16777216) == 33554432) { // L: 84
			}

			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) { // L: 85
				var13 = var12 & 16711935; // L: 86
				var14 = var12 >> 8 & 255; // L: 87

				for (var15 = 0; var15 < var11.length; ++var15) { // L: 88
					var16 = var11[var15]; // L: 89
					if (var16 >> 8 == (var16 & 65535)) { // L: 90
						var16 &= 255; // L: 91
						var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280; // L: 92
					}
				}
			}

			for (var13 = 0; var13 < var11.length; ++var13) { // L: 96
				var11[var13] = Rasterizer3D.Rasterizer3D_brighten(var11[var13], var1);
			}

			if (var6 == 0) { // L: 98
				var13 = 0;
			} else {
				var13 = this.field2506[var6 - 1]; // L: 99
			}

			if (var13 == 0) { // L: 100
				if (var3 == var7.subWidth) { // L: 101
					for (var14 = 0; var14 < var5; ++var14) { // L: 102
						this.pixels[var14] = var11[var10[var14] & 255];
					}
				} else if (var7.subWidth == 64 && var3 == 128) { // L: 104
					var14 = 0; // L: 105

					for (var15 = 0; var15 < var3; ++var15) { // L: 106
						for (var16 = 0; var16 < var3; ++var16) { // L: 107
							this.pixels[var14++] = var11[var10[(var15 >> 1 << 6) + (var16 >> 1)] & 255];
						}
					}
				} else {
					if (var7.subWidth != 128 || var3 != 64) { // L: 110
						throw new RuntimeException(); // L: 117
					}

					var14 = 0; // L: 111

					for (var15 = 0; var15 < var3; ++var15) { // L: 112
						for (var16 = 0; var16 < var3; ++var16) { // L: 113
							this.pixels[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var13 == 1) { // L: 120
			}

			if (var13 == 2) { // L: 121
			}

			if (var13 == 3) { // L: 122
			}
		}

		return true; // L: 124
	}

	@ObfuscatedName("c")
	@Export("reset")
	void reset() {
		this.pixels = null; // L: 128
	} // L: 129

	@ObfuscatedName("i")
	@Export("animate")
	void animate(int var1) {
		if (this.pixels != null) { // L: 132
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.animationDirection == 1 || this.animationDirection == 3) { // L: 133
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 134
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 136
					var2 = 64;
				} else {
					var2 = 128; // L: 137
				}

				var3 = this.pixels.length; // L: 138
				var4 = var2 * this.animationSpeed * var1; // L: 139
				var5 = var3 - 1; // L: 140
				if (this.animationDirection == 1) { // L: 141
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) { // L: 142
					var7 = var6 + var4 & var5; // L: 143
					Texture_animatedPixels[var6] = this.pixels[var7]; // L: 144
				}

				var10 = this.pixels; // L: 146
				this.pixels = Texture_animatedPixels; // L: 147
				Texture_animatedPixels = var10; // L: 148
			}

			if (this.animationDirection == 2 || this.animationDirection == 4) { // L: 150
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 151
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 153
					var2 = 64;
				} else {
					var2 = 128; // L: 154
				}

				var3 = this.pixels.length; // L: 155
				var4 = this.animationSpeed * var1; // L: 156
				var5 = var2 - 1; // L: 157
				if (this.animationDirection == 2) { // L: 158
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) { // L: 159
					for (var7 = 0; var7 < var2; ++var7) { // L: 160
						int var8 = var6 + var7; // L: 161
						int var9 = var6 + (var7 + var4 & var5); // L: 162
						Texture_animatedPixels[var8] = this.pixels[var9]; // L: 163
					}
				}

				var10 = this.pixels; // L: 166
				this.pixels = Texture_animatedPixels; // L: 167
				Texture_animatedPixels = var10; // L: 168
			}

		}
	} // L: 170
}
