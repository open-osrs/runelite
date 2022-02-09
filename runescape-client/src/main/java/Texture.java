import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("x")
	@Export("Texture_animatedPixels")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("r")
	@Export("averageRGB")
	int averageRGB;
	@ObfuscatedName("o")
	boolean field2211;
	@ObfuscatedName("i")
	@Export("fileIds")
	int[] fileIds;
	@ObfuscatedName("w")
	int[] field2219;
	@ObfuscatedName("v")
	int[] field2214;
	@ObfuscatedName("a")
	int[] field2215;
	@ObfuscatedName("y")
	@Export("animationDirection")
	int animationDirection;
	@ObfuscatedName("u")
	@Export("animationSpeed")
	int animationSpeed;
	@ObfuscatedName("h")
	@Export("pixels")
	int[] pixels;
	@ObfuscatedName("q")
	@Export("isLoaded")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false; // L: 25
		this.averageRGB = var1.readUnsignedShort(); // L: 29
		this.field2211 = var1.readUnsignedByte() == 1; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 >= 1 && var2 <= 4) { // L: 32
			this.fileIds = new int[var2]; // L: 35

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 36
				this.fileIds[var3] = var1.readUnsignedShort();
			}

			if (var2 > 1) { // L: 37
				this.field2219 = new int[var2 - 1]; // L: 38

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 39
					this.field2219[var3] = var1.readUnsignedByte();
				}
			}

			if (var2 > 1) { // L: 41
				this.field2214 = new int[var2 - 1]; // L: 42

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 43
					this.field2214[var3] = var1.readUnsignedByte();
				}
			}

			this.field2215 = new int[var2]; // L: 45

			for (var3 = 0; var3 < var2; ++var3) { // L: 46
				this.field2215[var3] = var1.readInt();
			}

			this.animationDirection = var1.readUnsignedByte(); // L: 47
			this.animationSpeed = var1.readUnsignedByte(); // L: 48
			this.pixels = null; // L: 49
		} else {
			throw new RuntimeException(); // L: 33
		}
	} // L: 50

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(DILkq;)Z"
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
				class372.SpriteBuffer_decode(var10); // L: 69
				var9 = true; // L: 70
			}

			IndexedSprite var7;
			if (!var9) { // L: 72
				var7 = null; // L: 73
			} else {
				IndexedSprite var11 = new IndexedSprite(); // L: 78
				var11.width = class434.SpriteBuffer_spriteWidth; // L: 79
				var11.height = class434.SpriteBuffer_spriteHeight; // L: 80
				var11.xOffset = class434.SpriteBuffer_xOffsets[0]; // L: 81
				var11.yOffset = class434.SpriteBuffer_yOffsets[0]; // L: 82
				var11.subWidth = class434.SpriteBuffer_spriteWidths[0]; // L: 83
				var11.subHeight = Fonts.SpriteBuffer_spriteHeights[0]; // L: 84
				var11.palette = HealthBarUpdate.SpriteBuffer_spritePalette; // L: 85
				var11.pixels = WorldMapLabelSize.SpriteBuffer_pixels[0]; // L: 86
				Canvas.method365(); // L: 87
				var7 = var11; // L: 90
			}

			var7.normalize(); // L: 93
			var10 = var7.pixels; // L: 94
			int[] var18 = var7.palette; // L: 95
			int var12 = this.field2215[var6]; // L: 96
			if ((var12 & -16777216) == 16777216) { // L: 97
			}

			if ((var12 & -16777216) == 33554432) { // L: 98
			}

			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) { // L: 99
				var13 = var12 & 16711935; // L: 100
				var14 = var12 >> 8 & 255; // L: 101

				for (var15 = 0; var15 < var18.length; ++var15) { // L: 102
					var16 = var18[var15]; // L: 103
					if (var16 >> 8 == (var16 & 65535)) { // L: 104
						var16 &= 255; // L: 105
						var18[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280; // L: 106
					}
				}
			}

			for (var13 = 0; var13 < var18.length; ++var13) { // L: 110
				var18[var13] = Rasterizer3D.Rasterizer3D_brighten(var18[var13], var1);
			}

			if (var6 == 0) { // L: 112
				var13 = 0;
			} else {
				var13 = this.field2219[var6 - 1]; // L: 113
			}

			if (var13 == 0) { // L: 114
				if (var3 == var7.subWidth) { // L: 115
					for (var14 = 0; var14 < var5; ++var14) { // L: 116
						this.pixels[var14] = var18[var10[var14] & 255];
					}
				} else if (var7.subWidth == 64 && var3 == 128) { // L: 118
					var14 = 0; // L: 119

					for (var15 = 0; var15 < var3; ++var15) { // L: 120
						for (var16 = 0; var16 < var3; ++var16) { // L: 121
							this.pixels[var14++] = var18[var10[(var15 >> 1 << 6) + (var16 >> 1)] & 255];
						}
					}
				} else {
					if (var7.subWidth != 128 || var3 != 64) { // L: 124
						throw new RuntimeException(); // L: 131
					}

					var14 = 0; // L: 125

					for (var15 = 0; var15 < var3; ++var15) { // L: 126
						for (var16 = 0; var16 < var3; ++var16) { // L: 127
							this.pixels[var14++] = var18[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var13 == 1) { // L: 134
			}

			if (var13 == 2) { // L: 135
			}

			if (var13 == 3) { // L: 136
			}
		}

		return true; // L: 138
	}

	@ObfuscatedName("l")
	@Export("reset")
	void reset() {
		this.pixels = null; // L: 142
	} // L: 143

	@ObfuscatedName("s")
	@Export("animate")
	void animate(int var1) {
		if (this.pixels != null) { // L: 146
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.animationDirection == 1 || this.animationDirection == 3) { // L: 147
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 148
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 150
					var2 = 64;
				} else {
					var2 = 128; // L: 151
				}

				var3 = this.pixels.length; // L: 152
				var4 = var2 * this.animationSpeed * var1; // L: 153
				var5 = var3 - 1; // L: 154
				if (this.animationDirection == 1) { // L: 155
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) { // L: 156
					var7 = var6 + var4 & var5; // L: 157
					Texture_animatedPixels[var6] = this.pixels[var7]; // L: 158
				}

				var10 = this.pixels; // L: 160
				this.pixels = Texture_animatedPixels; // L: 161
				Texture_animatedPixels = var10; // L: 162
			}

			if (this.animationDirection == 2 || this.animationDirection == 4) { // L: 164
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 165
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 167
					var2 = 64;
				} else {
					var2 = 128; // L: 168
				}

				var3 = this.pixels.length; // L: 169
				var4 = this.animationSpeed * var1; // L: 170
				var5 = var2 - 1; // L: 171
				if (this.animationDirection == 2) { // L: 172
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) { // L: 173
					for (var7 = 0; var7 < var2; ++var7) { // L: 174
						int var8 = var6 + var7; // L: 175
						int var9 = var6 + (var7 + var4 & var5); // L: 176
						Texture_animatedPixels[var8] = this.pixels[var9]; // L: 177
					}
				}

				var10 = this.pixels; // L: 180
				this.pixels = Texture_animatedPixels; // L: 181
				Texture_animatedPixels = var10; // L: 182
			}

		}
	} // L: 184
}
