import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("q")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("i")
	int averageRGB;
	@ObfuscatedName("o")
	boolean field1647;
	@ObfuscatedName("x")
	int[] fileIds;
	@ObfuscatedName("w")
	int[] field1649;
	@ObfuscatedName("g")
	int[] field1650;
	@ObfuscatedName("m")
	int[] field1651;
	@ObfuscatedName("n")
	int animationDirection;
	@ObfuscatedName("d")
	int animationSpeed;
	@ObfuscatedName("h")
	int[] pixels;
	@ObfuscatedName("a")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Lkf;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false; // L: 25
		this.averageRGB = var1.readUnsignedShort(); // L: 29
		this.field1647 = var1.readUnsignedByte() == 1; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 >= 1 && var2 <= 4) { // L: 32
			this.fileIds = new int[var2]; // L: 35

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 36
				this.fileIds[var3] = var1.readUnsignedShort();
			}

			if (var2 > 1) { // L: 37
				this.field1649 = new int[var2 - 1]; // L: 38

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 39
					this.field1649[var3] = var1.readUnsignedByte();
				}
			}

			if (var2 > 1) { // L: 41
				this.field1650 = new int[var2 - 1]; // L: 42

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 43
					this.field1650[var3] = var1.readUnsignedByte();
				}
			}

			this.field1651 = new int[var2]; // L: 45

			for (var3 = 0; var3 < var2; ++var3) { // L: 46
				this.field1651[var3] = var1.readInt();
			}

			this.animationDirection = var1.readUnsignedByte(); // L: 47
			this.animationSpeed = var1.readUnsignedByte(); // L: 48
			this.pixels = null; // L: 49
		} else {
			throw new RuntimeException(); // L: 33
		}
	} // L: 50

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(DILic;)Z"
	)
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
			IndexedSprite var7;
			if (!class197.method3742(var4, var8)) { // L: 62
				var7 = null; // L: 63
			} else {
				var7 = InvDefinition.method4448(); // L: 66
			}

			var7.normalize(); // L: 69
			byte[] var10 = var7.pixels; // L: 70
			int[] var11 = var7.palette; // L: 71
			int var12 = this.field1651[var6]; // L: 72
			if ((var12 & -16777216) == 16777216) { // L: 73
			}

			if ((var12 & -16777216) == 33554432) { // L: 74
			}

			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) { // L: 75
				var13 = var12 & 16711935; // L: 76
				var14 = var12 >> 8 & 255; // L: 77

				for (var15 = 0; var15 < var11.length; ++var15) { // L: 78
					var16 = var11[var15]; // L: 79
					if (var16 >> 8 == (var16 & 65535)) { // L: 80
						var16 &= 255; // L: 81
						var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280; // L: 82
					}
				}
			}

			for (var13 = 0; var13 < var11.length; ++var13) { // L: 86
				var11[var13] = Rasterizer3D.Rasterizer3D_brighten(var11[var13], var1);
			}

			if (var6 == 0) { // L: 88
				var13 = 0;
			} else {
				var13 = this.field1649[var6 - 1]; // L: 89
			}

			if (var13 == 0) { // L: 90
				if (var3 == var7.subWidth) { // L: 91
					for (var14 = 0; var14 < var5; ++var14) { // L: 92
						this.pixels[var14] = var11[var10[var14] & 255];
					}
				} else if (var7.subWidth == 64 && var3 == 128) { // L: 94
					var14 = 0; // L: 95

					for (var15 = 0; var15 < var3; ++var15) { // L: 96
						for (var16 = 0; var16 < var3; ++var16) { // L: 97
							this.pixels[var14++] = var11[var10[(var15 >> 1 << 6) + (var16 >> 1)] & 255];
						}
					}
				} else {
					if (var7.subWidth != 128 || var3 != 64) { // L: 100
						throw new RuntimeException(); // L: 107
					}

					var14 = 0; // L: 101

					for (var15 = 0; var15 < var3; ++var15) { // L: 102
						for (var16 = 0; var16 < var3; ++var16) { // L: 103
							this.pixels[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var13 == 1) { // L: 110
			}

			if (var13 == 2) { // L: 111
			}

			if (var13 == 3) { // L: 112
			}
		}

		return true; // L: 114
	}

	@ObfuscatedName("k")
	void reset() {
		this.pixels = null; // L: 118
	} // L: 119

	@ObfuscatedName("s")
	void animate(int var1) {
		if (this.pixels != null) { // L: 122
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.animationDirection == 1 || this.animationDirection == 3) { // L: 123
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 124
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 126
					var2 = 64;
				} else {
					var2 = 128; // L: 127
				}

				var3 = this.pixels.length; // L: 128
				var4 = var2 * this.animationSpeed * var1; // L: 129
				var5 = var3 - 1; // L: 130
				if (this.animationDirection == 1) { // L: 131
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) { // L: 132
					var7 = var6 + var4 & var5; // L: 133
					Texture_animatedPixels[var6] = this.pixels[var7]; // L: 134
				}

				var10 = this.pixels; // L: 136
				this.pixels = Texture_animatedPixels; // L: 137
				Texture_animatedPixels = var10; // L: 138
			}

			if (this.animationDirection == 2 || this.animationDirection == 4) { // L: 140
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 141
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 143
					var2 = 64;
				} else {
					var2 = 128; // L: 144
				}

				var3 = this.pixels.length; // L: 145
				var4 = this.animationSpeed * var1; // L: 146
				var5 = var2 - 1; // L: 147
				if (this.animationDirection == 2) { // L: 148
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) { // L: 149
					for (var7 = 0; var7 < var2; ++var7) { // L: 150
						int var8 = var6 + var7; // L: 151
						int var9 = var6 + (var7 + var4 & var5); // L: 152
						Texture_animatedPixels[var8] = this.pixels[var9]; // L: 153
					}
				}

				var10 = this.pixels; // L: 156
				this.pixels = Texture_animatedPixels; // L: 157
				Texture_animatedPixels = var10; // L: 158
			}

		}
	} // L: 160
}
