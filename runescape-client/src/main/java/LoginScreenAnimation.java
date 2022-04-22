import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("s")
	int[] field1196;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1097615297
	)
	int field1197;
	@ObfuscatedName("q")
	int[] field1206;
	@ObfuscatedName("o")
	int[] field1199;
	@ObfuscatedName("r")
	int[] field1200;
	@ObfuscatedName("p")
	int[] field1207;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1370547723
	)
	int field1202;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 816290751
	)
	int field1201;
	@ObfuscatedName("d")
	int[] field1204;
	@ObfuscatedName("m")
	int[] field1198;
	@ObfuscatedName("u")
	int[] field1205;
	@ObfuscatedName("t")
	int[] field1191;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1422508409
	)
	int field1208;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1378268659
	)
	int field1209;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 131127333
	)
	int field1210;

	@ObfuscatedSignature(
		descriptor = "([Lqq;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1196 = new int[256]; // L: 13
		this.field1197 = 0; // L: 14
		this.field1202 = 0; // L: 19
		this.field1201 = 0; // L: 20
		this.field1208 = 0; // L: 25
		this.field1209 = 0; // L: 26
		this.field1210 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1658294303"
	)
	@Export("initColors")
	void initColors() {
		this.field1199 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1199[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1199[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1199[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1199[var1 + 192] = 16777215;
		}

		this.field1200 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1200[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1200[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1200[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1200[var1 + 192] = 16777215;
		}

		this.field1207 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1207[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1207[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1207[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1207[var1 + 192] = 16777215;
		}

		this.field1206 = new int[256]; // L: 50
		this.field1208 = 0; // L: 51
		this.field1205 = new int[32768]; // L: 52
		this.field1191 = new int[32768]; // L: 53
		this.method2200((IndexedSprite)null); // L: 54
		this.field1204 = new int[32768]; // L: 55
		this.field1198 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1316000316"
	)
	void method2193() {
		this.field1199 = null; // L: 60
		this.field1200 = null; // L: 61
		this.field1207 = null; // L: 62
		this.field1206 = null; // L: 63
		this.field1205 = null; // L: 64
		this.field1191 = null; // L: 65
		this.field1204 = null; // L: 66
		this.field1198 = null; // L: 67
		this.field1208 = 0; // L: 68
		this.field1209 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-168793986"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1204 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1210 == 0) { // L: 76
			this.field1210 = var2; // L: 77
		}

		int var3 = var2 - this.field1210; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1210 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2195(var3); // L: 83
		}

		this.method2222(var1); // L: 85
	} // L: 86

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	final void method2195(int var1) {
		this.field1208 += 128 * var1; // L: 89
		int var2;
		if (this.field1208 > this.field1205.length) { // L: 90
			this.field1208 -= this.field1205.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2200(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1204[var2 + var3] - this.field1205[var2 + this.field1208 & this.field1205.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1204[var2++] = var6; // L: 101
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15; // L: 104

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 105
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1204[var9 + var8] = 255;
				} else {
					this.field1204[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1202 > 0) { // L: 113
			this.field1202 -= var1 * 4;
		}

		if (this.field1201 > 0) { // L: 114
			this.field1201 -= var1 * 4;
		}

		if (this.field1202 == 0 && this.field1201 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1202 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1201 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1196[var7] = this.field1196[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1196[var7] = (int)(Math.sin((double)this.field1197 / 14.0D) * 16.0D + Math.sin((double)this.field1197 / 15.0D) * 14.0D + Math.sin((double)this.field1197 / 16.0D) * 12.0D); // L: 122
			++this.field1197; // L: 123
		}

		this.field1209 += var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1209 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1204[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1209 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1204[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1204[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1198[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1198[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1198[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) { // L: 152
						this.field1204[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "620136463"
	)
	final int method2196(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-46"
	)
	final void method2222(int var1) {
		int var2 = this.field1206.length; // L: 164
		if (this.field1202 > 0) { // L: 165
			this.method2198(this.field1202, this.field1200); // L: 166
		} else if (this.field1201 > 0) { // L: 168
			this.method2198(this.field1201, this.field1207); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1206[var3] = this.field1199[var3];
			}
		}

		this.method2199(var1); // L: 174
	} // L: 175

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-2116901787"
	)
	final void method2198(int var1, int[] var2) {
		int var3 = this.field1206.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1206[var4] = this.method2196(this.field1199[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1206[var4] = var2[var4]; // L: 181
			} else {
				this.field1206[var4] = this.method2196(var2[var4], this.field1199[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-922347681"
	)
	final void method2199(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1196[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= FontName.rasterProvider.width) { // L: 197
				var7 = FontName.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * FontName.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1204[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1206[var10]; // L: 208
					int var14 = FontName.rasterProvider.pixels[var8]; // L: 209
					FontName.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-36"
	)
	final void method2200(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1205.length; ++var2) { // L: 219
			this.field1205[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1205[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1191[var5] = (this.field1205[var5 + 1] + this.field1205[var5 + 128] + this.field1205[var5 - 128] + this.field1205[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1205; // L: 231
			this.field1205 = this.field1191; // L: 232
			this.field1191 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1205[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248
}
