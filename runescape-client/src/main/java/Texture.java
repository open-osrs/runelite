import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("j")
	@Export("Texture_animatedPixels")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("b")
	@Export("averageRGB")
	int averageRGB;
	@ObfuscatedName("e")
	boolean field1849;
	@ObfuscatedName("k")
	@Export("fileIds")
	int[] fileIds;
	@ObfuscatedName("g")
	int[] field1851;
	@ObfuscatedName("h")
	int[] field1852;
	@ObfuscatedName("n")
	int[] field1844;
	@ObfuscatedName("l")
	@Export("animationDirection")
	int animationDirection;
	@ObfuscatedName("m")
	@Export("animationSpeed")
	int animationSpeed;
	@ObfuscatedName("d")
	@Export("pixels")
	int[] pixels;
	@ObfuscatedName("c")
	@Export("isLoaded")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Lnu;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false; // L: 25
		this.averageRGB = var1.readUnsignedShort(); // L: 29
		this.field1849 = var1.readUnsignedByte() == 1; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 >= 1 && var2 <= 4) { // L: 32
			this.fileIds = new int[var2]; // L: 35

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 36
				this.fileIds[var3] = var1.readUnsignedShort();
			}

			if (var2 > 1) { // L: 37
				this.field1851 = new int[var2 - 1]; // L: 38

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 39
					this.field1851[var3] = var1.readUnsignedByte();
				}
			}

			if (var2 > 1) { // L: 41
				this.field1852 = new int[var2 - 1]; // L: 42

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 43
					this.field1852[var3] = var1.readUnsignedByte();
				}
			}

			this.field1844 = new int[var2]; // L: 45

			for (var3 = 0; var3 < var2; ++var3) { // L: 46
				this.field1844[var3] = var1.readInt();
			}

			this.animationDirection = var1.readUnsignedByte(); // L: 47
			this.animationSpeed = var1.readUnsignedByte(); // L: 48
			this.pixels = null; // L: 49
		} else {
			throw new RuntimeException(); // L: 33
		}
	} // L: 50

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(DILir;)Z"
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
			IndexedSprite var7 = VertexNormal.method3783(var4, this.fileIds[var6]); // L: 59
			var7.normalize(); // L: 60
			byte[] var8 = var7.pixels; // L: 61
			int[] var9 = var7.palette; // L: 62
			int var10 = this.field1844[var6]; // L: 63
			if ((var10 & -16777216) == 16777216) { // L: 64
			}

			if ((var10 & -16777216) == 33554432) { // L: 65
			}

			int var11;
			int var12;
			int var13;
			int var14;
			if ((var10 & -16777216) == 50331648) { // L: 66
				var11 = var10 & 16711935; // L: 67
				var12 = var10 >> 8 & 255; // L: 68

				for (var13 = 0; var13 < var9.length; ++var13) { // L: 69
					var14 = var9[var13]; // L: 70
					if (var14 >> 8 == (var14 & 65535)) { // L: 71
						var14 &= 255; // L: 72
						var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & 65280; // L: 73
					}
				}
			}

			for (var11 = 0; var11 < var9.length; ++var11) { // L: 77
				var9[var11] = Rasterizer3D.Rasterizer3D_brighten(var9[var11], var1);
			}

			if (var6 == 0) { // L: 79
				var11 = 0;
			} else {
				var11 = this.field1851[var6 - 1]; // L: 80
			}

			if (var11 == 0) { // L: 81
				if (var3 == var7.subWidth) { // L: 82
					for (var12 = 0; var12 < var5; ++var12) { // L: 83
						this.pixels[var12] = var9[var8[var12] & 255];
					}
				} else if (var7.subWidth == 64 && var3 == 128) { // L: 85
					var12 = 0; // L: 86

					for (var13 = 0; var13 < var3; ++var13) { // L: 87
						for (var14 = 0; var14 < var3; ++var14) { // L: 88
							this.pixels[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
						}
					}
				} else {
					if (var7.subWidth != 128 || var3 != 64) { // L: 91
						throw new RuntimeException(); // L: 98
					}

					var12 = 0; // L: 92

					for (var13 = 0; var13 < var3; ++var13) { // L: 93
						for (var14 = 0; var14 < var3; ++var14) { // L: 94
							this.pixels[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var11 == 1) { // L: 101
			}

			if (var11 == 2) { // L: 102
			}

			if (var11 == 3) { // L: 103
			}
		}

		return true; // L: 105
	}

	@ObfuscatedName("o")
	@Export("reset")
	void reset() {
		this.pixels = null; // L: 109
	} // L: 110

	@ObfuscatedName("u")
	@Export("animate")
	void animate(int var1) {
		if (this.pixels != null) { // L: 113
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.animationDirection == 1 || this.animationDirection == 3) { // L: 114
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 115
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 117
					var2 = 64;
				} else {
					var2 = 128; // L: 118
				}

				var3 = this.pixels.length; // L: 119
				var4 = var2 * this.animationSpeed * var1; // L: 120
				var5 = var3 - 1; // L: 121
				if (this.animationDirection == 1) { // L: 122
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) { // L: 123
					var7 = var6 + var4 & var5; // L: 124
					Texture_animatedPixels[var6] = this.pixels[var7]; // L: 125
				}

				var10 = this.pixels; // L: 127
				this.pixels = Texture_animatedPixels; // L: 128
				Texture_animatedPixels = var10; // L: 129
			}

			if (this.animationDirection == 2 || this.animationDirection == 4) { // L: 131
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 132
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 134
					var2 = 64;
				} else {
					var2 = 128; // L: 135
				}

				var3 = this.pixels.length; // L: 136
				var4 = this.animationSpeed * var1; // L: 137
				var5 = var2 - 1; // L: 138
				if (this.animationDirection == 2) { // L: 139
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) { // L: 140
					for (var7 = 0; var7 < var2; ++var7) { // L: 141
						int var8 = var6 + var7; // L: 142
						int var9 = var6 + (var7 + var4 & var5); // L: 143
						Texture_animatedPixels[var8] = this.pixels[var9]; // L: 144
					}
				}

				var10 = this.pixels; // L: 147
				this.pixels = Texture_animatedPixels; // L: 148
				Texture_animatedPixels = var10; // L: 149
			}

		}
	} // L: 151
}
