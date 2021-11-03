import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("hq")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("e")
	int[] field1160;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 61106321
	)
	int field1158;
	@ObfuscatedName("j")
	int[] field1159;
	@ObfuscatedName("b")
	int[] field1175;
	@ObfuscatedName("x")
	int[] field1171;
	@ObfuscatedName("y")
	int[] field1162;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1713557939
	)
	int field1163;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1441778183
	)
	int field1164;
	@ObfuscatedName("l")
	int[] field1157;
	@ObfuscatedName("u")
	int[] field1161;
	@ObfuscatedName("n")
	int[] field1166;
	@ObfuscatedName("z")
	int[] field1168;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1420414455
	)
	int field1169;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1836018091
	)
	int field1170;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1971523537
	)
	int field1172;

	@ObfuscatedSignature(
		descriptor = "([Loe;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1160 = new int[256];
		this.field1158 = 0; // L: 14
		this.field1163 = 0;
		this.field1164 = 0;
		this.field1169 = 0; // L: 25
		this.field1170 = 0; // L: 26
		this.field1172 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1711937490"
	)
	@Export("initColors")
	void initColors() {
		this.field1175 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1175[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1175[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1175[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1175[var1 + 192] = 16777215;
		}

		this.field1171 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1171[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1171[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1171[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1171[var1 + 192] = 16777215;
		}

		this.field1162 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1162[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1162[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1162[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1162[var1 + 192] = 16777215;
		}

		this.field1159 = new int[256];
		this.field1169 = 0;
		this.field1166 = new int[32768];
		this.field1168 = new int[32768];
		this.method2189((IndexedSprite)null);
		this.field1157 = new int[32768];
		this.field1161 = new int[32768];
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	void method2193() {
		this.field1175 = null;
		this.field1171 = null;
		this.field1162 = null;
		this.field1159 = null;
		this.field1166 = null;
		this.field1168 = null;
		this.field1157 = null; // L: 66
		this.field1161 = null;
		this.field1169 = 0;
		this.field1170 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1838202264"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1157 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1172 == 0) { // L: 76
			this.field1172 = var2; // L: 77
		}

		int var3 = var2 - this.field1172; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1172 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2190(var3); // L: 83
		}

		this.method2192(var1); // L: 85
	} // L: 86

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2115412398"
	)
	final void method2190(int var1) {
		this.field1169 += 128 * var1; // L: 89
		int var2;
		if (this.field1169 > this.field1166.length) { // L: 90
			this.field1169 -= this.field1166.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2189(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1157[var3 + var2] - this.field1166[var2 + this.field1169 & this.field1166.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1157[var2++] = var6; // L: 101
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
					this.field1157[var8 + var9] = 255;
				} else {
					this.field1157[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1163 > 0) { // L: 113
			this.field1163 -= var1 * 4;
		}

		if (this.field1164 > 0) { // L: 114
			this.field1164 -= var1 * 4;
		}

		if (this.field1163 == 0 && this.field1164 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1163 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1164 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1160[var7] = this.field1160[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1160[var7] = (int)(Math.sin((double)this.field1158 / 14.0D) * 16.0D + Math.sin((double)this.field1158 / 15.0D) * 14.0D + Math.sin((double)this.field1158 / 16.0D) * 12.0D); // L: 122
			++this.field1158; // L: 123
		}

		this.field1170 += var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1170 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1157[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1170 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1157[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1157[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1161[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1161[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1161[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) { // L: 152
						this.field1157[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1812147314"
	)
	final int method2221(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1372694811"
	)
	final void method2192(int var1) {
		int var2 = this.field1159.length; // L: 164
		if (this.field1163 > 0) { // L: 165
			this.method2195(this.field1163, this.field1171); // L: 166
		} else if (this.field1164 > 0) { // L: 168
			this.method2195(this.field1164, this.field1162); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1159[var3] = this.field1175[var3];
			}
		}

		this.method2194(var1); // L: 174
	} // L: 175

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-668681605"
	)
	final void method2195(int var1, int[] var2) {
		int var3 = this.field1159.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1159[var4] = this.method2221(this.field1175[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1159[var4] = var2[var4]; // L: 181
			} else {
				this.field1159[var4] = this.method2221(var2[var4], this.field1175[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1898388799"
	)
	final void method2194(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1160[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= Canvas.rasterProvider.width) { // L: 197
				var7 = Canvas.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * Canvas.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1157[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1159[var10]; // L: 208
					int var14 = Canvas.rasterProvider.pixels[var8]; // L: 209
					Canvas.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Loe;I)V",
		garbageValue = "-1097319599"
	)
	final void method2189(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1166.length; ++var2) { // L: 219
			this.field1166[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1166[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1168[var5] = (this.field1166[var5 - 128] + this.field1166[var5 + 1] + this.field1166[var5 + 128] + this.field1166[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1166; // L: 231
			this.field1166 = this.field1168; // L: 232
			this.field1168 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1166[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-30"
	)
	static int method2218(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 15
			var1 /= 2;
		}

		if (var2 > 192) { // L: 16
			var1 /= 2;
		}

		if (var2 > 217) { // L: 17
			var1 /= 2;
		}

		if (var2 > 243) { // L: 18
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 19
		return var3; // L: 20
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "1922464614"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = HealthBarDefinition.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - class19.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - DefaultsGroup.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		GrandExchangeOfferTotalQuantityComparator.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1242[var1] != null) { // L: 50
			var2.read(Players.field1242[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1244[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var7 != var1) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1244[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2058131323"
	)
	public static int method2220(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}
}
