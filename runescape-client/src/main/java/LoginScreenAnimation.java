import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("z")
	int[] field1045;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1212643041
	)
	int field1046;
	@ObfuscatedName("q")
	int[] field1047;
	@ObfuscatedName("l")
	int[] field1048;
	@ObfuscatedName("s")
	int[] field1049;
	@ObfuscatedName("b")
	int[] field1057;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1072742705
	)
	int field1051;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1152282493
	)
	int field1052;
	@ObfuscatedName("k")
	int[] field1053;
	@ObfuscatedName("i")
	int[] field1054;
	@ObfuscatedName("x")
	int[] field1064;
	@ObfuscatedName("f")
	int[] field1056;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -812562451
	)
	int field1050;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1252461573
	)
	int field1058;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1614703881
	)
	int field1059;

	@ObfuscatedSignature(
		descriptor = "([Lly;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1045 = new int[256]; // L: 13
		this.field1046 = 0; // L: 14
		this.field1051 = 0; // L: 19
		this.field1052 = 0; // L: 20
		this.field1050 = 0; // L: 25
		this.field1058 = 0; // L: 26
		this.field1059 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16274"
	)
	@Export("initColors")
	void initColors() {
		this.field1048 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1048[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1048[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1048[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1048[var1 + 192] = 16777215;
		}

		this.field1049 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1049[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1049[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1049[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1049[var1 + 192] = 16777215;
		}

		this.field1057 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1057[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1057[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1057[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1057[var1 + 192] = 16777215;
		}

		this.field1047 = new int[256]; // L: 50
		this.field1050 = 0; // L: 51
		this.field1064 = new int[32768]; // L: 52
		this.field1056 = new int[32768]; // L: 53
		this.method1928((IndexedSprite)null); // L: 54
		this.field1053 = new int[32768]; // L: 55
		this.field1054 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "143600222"
	)
	void method1926() {
		this.field1048 = null; // L: 60
		this.field1049 = null;
		this.field1057 = null;
		this.field1047 = null; // L: 63
		this.field1064 = null; // L: 64
		this.field1056 = null; // L: 65
		this.field1053 = null; // L: 66
		this.field1054 = null; // L: 67
		this.field1050 = 0; // L: 68
		this.field1058 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "67"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1053 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1059 == 0) { // L: 76
			this.field1059 = var2; // L: 77
		}

		int var3 = var2 - this.field1059; // L: 79
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1059 = var2;
		if (var3 > 0) {
			this.method1930(var3);
		}

		this.method1959(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1510812052"
	)
	final void method1930(int var1) {
		this.field1050 += var1 * 128;
		int var2;
		if (this.field1050 > this.field1064.length) { // L: 90
			this.field1050 -= this.field1064.length; // L: 91
			var2 = (int)(Math.random() * 12.0D);
			this.method1928(this.sprites[var2]); // L: 93
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1053[var3 + var2] - this.field1064[var2 + this.field1050 & this.field1064.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1053[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15; // L: 104

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1053[var9 + var8] = 255;
				} else {
					this.field1053[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1051 > 0) { // L: 113
			this.field1051 -= var1 * 4;
		}

		if (this.field1052 > 0) { // L: 114
			this.field1052 -= var1 * 4;
		}

		if (this.field1051 == 0 && this.field1052 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1051 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1052 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1045[var7] = this.field1045[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1045[var7] = (int)(Math.sin((double)this.field1046 / 14.0D) * 16.0D + Math.sin((double)this.field1046 / 15.0D) * 14.0D + Math.sin((double)this.field1046 / 16.0D) * 12.0D); // L: 122
			++this.field1046; // L: 123
		}

		this.field1058 += var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1058 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1053[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1058 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1053[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1053[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1054[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1054[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1054[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) { // L: 152
						this.field1053[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "696665844"
	)
	final int method1931(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) >> 8; // L: 160
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-557955143"
	)
	final void method1959(int var1) {
		int var2 = this.field1047.length; // L: 164
		if (this.field1051 > 0) { // L: 165
			this.method1933(this.field1051, this.field1049); // L: 166
		} else if (this.field1052 > 0) { // L: 168
			this.method1933(this.field1052, this.field1057); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1047[var3] = this.field1048[var3];
			}
		}

		this.method1934(var1); // L: 174
	} // L: 175

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1988316375"
	)
	final void method1933(int var1, int[] var2) {
		int var3 = this.field1047.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1047[var4] = this.method1931(this.field1048[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1047[var4] = var2[var4]; // L: 181
			} else {
				this.field1047[var4] = this.method1931(var2[var4], this.field1048[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "25"
	)
	final void method1934(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1045[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= FileSystem.rasterProvider.width) { // L: 197
				var7 = FileSystem.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * FileSystem.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1053[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1047[var10]; // L: 208
					int var14 = FileSystem.rasterProvider.pixels[var8]; // L: 209
					FileSystem.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "1"
	)
	final void method1928(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1064.length; ++var2) { // L: 219
			this.field1064[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1064[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1056[var5] = (this.field1064[var5 - 128] + this.field1064[var5 + 1] + this.field1064[var5 + 128] + this.field1064[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1064; // L: 231
			this.field1064 = this.field1056; // L: 232
			this.field1056 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1064[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "742705358"
	)
	static char method1927(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 61 62
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-1637981491"
	)
	@Export("parseIntCustomRadix")
	public static int parseIntCustomRadix(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 80
			boolean var3 = false; // L: 81
			boolean var4 = false; // L: 82
			int var5 = 0; // L: 83
			int var6 = var0.length(); // L: 84

			for (int var7 = 0; var7 < var6; ++var7) { // L: 85
				char var8 = var0.charAt(var7); // L: 86
				if (var7 == 0) { // L: 87
					if (var8 == '-') { // L: 88
						var3 = true; // L: 89
						continue;
					}

					if (var8 == '+') { // L: 92
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 94
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 95
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 96
						throw new NumberFormatException(); // L: 97
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 98
					throw new NumberFormatException();
				}

				if (var3) { // L: 99
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 100
				if (var9 / var1 != var5) { // L: 101
					throw new NumberFormatException();
				}

				var5 = var9; // L: 102
				var4 = true; // L: 103
			}

			if (!var4) { // L: 105
				throw new NumberFormatException();
			} else {
				return var5; // L: 106
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
