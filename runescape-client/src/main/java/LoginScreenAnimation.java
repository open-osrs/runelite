import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("k")
	int[] field1281;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1755494733
	)
	int field1294;
	@ObfuscatedName("h")
	int[] field1283;
	@ObfuscatedName("n")
	int[] field1282;
	@ObfuscatedName("l")
	int[] field1278;
	@ObfuscatedName("m")
	int[] field1286;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1742549311
	)
	int field1287;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -422706029
	)
	int field1288;
	@ObfuscatedName("j")
	int[] field1293;
	@ObfuscatedName("r")
	int[] field1290;
	@ObfuscatedName("q")
	int[] field1291;
	@ObfuscatedName("t")
	int[] field1292;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1149455035
	)
	int field1285;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1716591161
	)
	int field1295;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1587500061
	)
	int field1279;

	@ObfuscatedSignature(
		descriptor = "([Low;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1281 = new int[256]; // L: 13
		this.field1294 = 0; // L: 14
		this.field1287 = 0; // L: 19
		this.field1288 = 0; // L: 20
		this.field1285 = 0; // L: 25
		this.field1295 = 0; // L: 26
		this.field1279 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1543224256"
	)
	@Export("initColors")
	void initColors() {
		this.field1282 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1282[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1282[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1282[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1282[var1 + 192] = 16777215;
		}

		this.field1278 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1278[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1278[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1278[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1278[var1 + 192] = 16777215;
		}

		this.field1286 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1286[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1286[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1286[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1286[var1 + 192] = 16777215;
		}

		this.field1283 = new int[256]; // L: 50
		this.field1285 = 0; // L: 51
		this.field1291 = new int[32768]; // L: 52
		this.field1292 = new int[32768]; // L: 53
		this.method2211((IndexedSprite)null); // L: 54
		this.field1293 = new int[32768]; // L: 55
		this.field1290 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1034389776"
	)
	void method2192() {
		this.field1282 = null; // L: 60
		this.field1278 = null; // L: 61
		this.field1286 = null; // L: 62
		this.field1283 = null; // L: 63
		this.field1291 = null; // L: 64
		this.field1292 = null; // L: 65
		this.field1293 = null; // L: 66
		this.field1290 = null; // L: 67
		this.field1285 = 0; // L: 68
		this.field1295 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-71179079"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1293 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1279 == 0) { // L: 76
			this.field1279 = var2; // L: 77
		}

		int var3 = var2 - this.field1279; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1279 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2187(var3); // L: 83
		}

		this.method2210(var1); // L: 85
	} // L: 86

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-30"
	)
	final void method2187(int var1) {
		this.field1285 += 128 * var1; // L: 89
		int var2;
		if (this.field1285 > this.field1291.length) { // L: 90
			this.field1285 -= this.field1291.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2211(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1293[var3 + var2] - this.field1291[var2 + this.field1285 & this.field1291.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1293[var2++] = var6; // L: 101
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
					this.field1293[var8 + var9] = 255;
				} else {
					this.field1293[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1287 > 0) { // L: 113
			this.field1287 -= var1 * 4;
		}

		if (this.field1288 > 0) { // L: 114
			this.field1288 -= var1 * 4;
		}

		if (this.field1287 == 0 && this.field1288 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1287 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1288 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1281[var7] = this.field1281[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1281[var7] = (int)(Math.sin((double)this.field1294 / 14.0D) * 16.0D + Math.sin((double)this.field1294 / 15.0D) * 14.0D + Math.sin((double)this.field1294 / 16.0D) * 12.0D); // L: 122
			++this.field1294; // L: 123
		}

		this.field1295 += var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1295 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1293[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1295 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1293[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1293[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1290[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1290[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1290[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) { // L: 152
						this.field1293[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1592134518"
	)
	final int method2188(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) >> 8; // L: 160
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	final void method2210(int var1) {
		int var2 = this.field1283.length; // L: 164
		if (this.field1287 > 0) { // L: 165
			this.method2190(this.field1287, this.field1278); // L: 166
		} else if (this.field1288 > 0) { // L: 168
			this.method2190(this.field1288, this.field1286); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1283[var3] = this.field1282[var3];
			}
		}

		this.method2191(var1); // L: 174
	} // L: 175

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "-100"
	)
	final void method2190(int var1, int[] var2) {
		int var3 = this.field1283.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1283[var4] = this.method2188(this.field1282[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1283[var4] = var2[var4]; // L: 181
			} else {
				this.field1283[var4] = this.method2188(var2[var4], this.field1282[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	final void method2191(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1281[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= GameEngine.rasterProvider.width) { // L: 197
				var7 = GameEngine.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * GameEngine.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1293[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1283[var10]; // L: 208
					int var14 = GameEngine.rasterProvider.pixels[var8]; // L: 209
					GameEngine.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "742969714"
	)
	final void method2211(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1291.length; ++var2) { // L: 219
			this.field1291[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1291[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1292[var5] = (this.field1291[var5 + 128] + this.field1291[var5 - 128] + this.field1291[var5 + 1] + this.field1291[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1291; // L: 231
			this.field1291 = this.field1292; // L: 232
			this.field1292 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1291[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "932731"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 199
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 200
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 201
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-57"
	)
	static final void method2185(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class105.field1327 || Language.field3357 != var1) { // L: 4784
			class105.field1327 = var0; // L: 4787
			Language.field3357 = var1; // L: 4788
			class20.updateGameState(25); // L: 4789
			class2.drawLoadingMessage("Loading - please wait.", true); // L: 4790
			int var3 = ItemLayer.baseX; // L: 4791
			int var4 = Tile.baseY; // L: 4792
			ItemLayer.baseX = (var0 - 6) * 8; // L: 4793
			Tile.baseY = (var1 - 6) * 8; // L: 4794
			int var5 = ItemLayer.baseX - var3; // L: 4795
			int var6 = Tile.baseY - var4; // L: 4796
			var3 = ItemLayer.baseX; // L: 4797
			var4 = Tile.baseY; // L: 4798

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 4799
				NPC var19 = Client.npcs[var7]; // L: 4800
				if (var19 != null) { // L: 4801
					for (var9 = 0; var9 < 10; ++var9) { // L: 4802
						var10000 = var19.pathX; // L: 4803
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 4804
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 4806
					var19.y -= var6 * 128; // L: 4807
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 4810
				Player var22 = Client.players[var7]; // L: 4811
				if (var22 != null) { // L: 4812
					for (var9 = 0; var9 < 10; ++var9) { // L: 4813
						var10000 = var22.pathX; // L: 4814
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 4815
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 4817
					var22.y -= var6 * 128; // L: 4818
				}
			}

			byte var20 = 0; // L: 4821
			byte var8 = 104; // L: 4822
			byte var21 = 1; // L: 4823
			if (var5 < 0) { // L: 4824
				var20 = 103; // L: 4825
				var8 = -1; // L: 4826
				var21 = -1; // L: 4827
			}

			byte var10 = 0; // L: 4829
			byte var11 = 104; // L: 4830
			byte var12 = 1; // L: 4831
			if (var6 < 0) { // L: 4832
				var10 = 103; // L: 4833
				var11 = -1; // L: 4834
				var12 = -1; // L: 4835
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 4837
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 4838
					int var15 = var13 + var5; // L: 4839
					int var16 = var14 + var6; // L: 4840

					for (int var17 = 0; var17 < 4; ++var17) { // L: 4841
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 4842
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 4843
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 4847 4848 4852
				var18.x -= var5; // L: 4849
				var18.y -= var6; // L: 4850
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 4851
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 4854
				Client.destinationX -= var5; // L: 4855
				Client.destinationY -= var6; // L: 4856
			}

			Client.soundEffectCount = 0; // L: 4858
			Client.isCameraLocked = false; // L: 4859
			ModeWhere.cameraX -= var5 << 7; // L: 4860
			ReflectionCheck.cameraZ -= var6 << 7; // L: 4861
			class6.oculusOrbFocalPointX -= var5 << 7; // L: 4862
			Players.oculusOrbFocalPointY -= var6 << 7; // L: 4863
			Client.field833 = -1; // L: 4864
			Client.graphicsObjects.clear(); // L: 4865
			Client.projectiles.clear(); // L: 4866

			for (var14 = 0; var14 < 4; ++var14) { // L: 4867
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 4785 4868

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1808852837"
	)
	static final void method2198(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 7817
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 7818
				Client.field812[var4] = true;
			}
		}

	} // L: 7820
}
