import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("n")
	int[] field1033;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1976548071
	)
	int field1034;
	@ObfuscatedName("l")
	int[] field1035;
	@ObfuscatedName("z")
	int[] field1036;
	@ObfuscatedName("u")
	int[] field1037;
	@ObfuscatedName("e")
	int[] field1028;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1475345785
	)
	int field1040;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -432017653
	)
	int field1047;
	@ObfuscatedName("i")
	int[] field1041;
	@ObfuscatedName("f")
	int[] field1042;
	@ObfuscatedName("a")
	int[] field1043;
	@ObfuscatedName("b")
	int[] field1044;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 543060497
	)
	int field1045;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1839104549
	)
	int field1046;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2113799519
	)
	int field1032;

	@ObfuscatedSignature(
		descriptor = "([Llo;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1033 = new int[256]; // L: 13
		this.field1034 = 0; // L: 14
		this.field1040 = 0;
		this.field1047 = 0;
		this.field1045 = 0; // L: 25
		this.field1046 = 0; // L: 26
		this.field1032 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1184453059"
	)
	@Export("initColors")
	void initColors() {
		this.field1036 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1036[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1036[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1036[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1036[var1 + 192] = 16777215;
		}

		this.field1037 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1037[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1037[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1037[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1037[var1 + 192] = 16777215;
		}

		this.field1028 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1028[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1028[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1028[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1028[var1 + 192] = 16777215;
		}

		this.field1035 = new int[256]; // L: 50
		this.field1045 = 0; // L: 51
		this.field1043 = new int[32768];
		this.field1044 = new int[32768]; // L: 53
		this.method1901((IndexedSprite)null); // L: 54
		this.field1041 = new int[32768]; // L: 55
		this.field1042 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1726461364"
	)
	void method1877() {
		this.field1036 = null; // L: 60
		this.field1037 = null; // L: 61
		this.field1028 = null; // L: 62
		this.field1035 = null; // L: 63
		this.field1043 = null; // L: 64
		this.field1044 = null; // L: 65
		this.field1041 = null; // L: 66
		this.field1042 = null; // L: 67
		this.field1045 = 0; // L: 68
		this.field1046 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-387686576"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1041 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1032 == 0) { // L: 76
			this.field1032 = var2; // L: 77
		}

		int var3 = var2 - this.field1032; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1032 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method1879(var3); // L: 83
		}

		this.method1881(var1); // L: 85
	} // L: 86

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1542043970"
	)
	final void method1879(int var1) {
		this.field1045 += var1 * 128; // L: 89
		int var2;
		if (this.field1045 > this.field1043.length) { // L: 90
			this.field1045 -= this.field1043.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method1901(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1041[var2 + var3] - this.field1043[var2 + this.field1045 & this.field1043.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1041[var2++] = var6; // L: 101
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
					this.field1041[var9 + var8] = 255;
				} else {
					this.field1041[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1040 > 0) { // L: 113
			this.field1040 -= var1 * 4;
		}

		if (this.field1047 > 0) { // L: 114
			this.field1047 -= var1 * 4;
		}

		if (this.field1040 == 0 && this.field1047 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1040 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1047 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1033[var7] = this.field1033[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1033[var7] = (int)(Math.sin((double)this.field1034 / 14.0D) * 16.0D + Math.sin((double)this.field1034 / 15.0D) * 14.0D + Math.sin((double)this.field1034 / 16.0D) * 12.0D); // L: 122
			++this.field1034; // L: 123
		}

		this.field1046 += var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1046 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1041[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1046 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1041[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1041[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1042[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var7 + var13 < 256) { // L: 150
						var12 += this.field1042[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1042[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) { // L: 152
						this.field1041[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "27"
	)
	final int method1880(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) >> 8; // L: 160
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "19"
	)
	final void method1881(int var1) {
		int var2 = this.field1035.length; // L: 164
		if (this.field1040 > 0) { // L: 165
			this.method1905(this.field1040, this.field1037); // L: 166
		} else if (this.field1047 > 0) { // L: 168
			this.method1905(this.field1047, this.field1028); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1035[var3] = this.field1036[var3];
			}
		}

		this.method1902(var1); // L: 174
	} // L: 175

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "60"
	)
	final void method1905(int var1, int[] var2) {
		int var3 = this.field1035.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1035[var4] = this.method1880(this.field1036[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1035[var4] = var2[var4]; // L: 181
			} else {
				this.field1035[var4] = this.method1880(var2[var4], this.field1036[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1090951606"
	)
	final void method1902(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1033[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= WorldMapIcon_0.rasterProvider.width) { // L: 197
				var7 = WorldMapIcon_0.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * WorldMapIcon_0.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1041[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1035[var10]; // L: 208
					int var14 = WorldMapIcon_0.rasterProvider.pixels[var8]; // L: 209
					WorldMapIcon_0.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llo;I)V",
		garbageValue = "1524084760"
	)
	final void method1901(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1043.length; ++var2) { // L: 219
			this.field1043[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1043[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1044[var5] = (this.field1043[var5 - 128] + this.field1043[var5 + 1] + this.field1043[var5 + 128] + this.field1043[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1043; // L: 231
			this.field1043 = this.field1044; // L: 232
			this.field1044 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1043[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lix;",
		garbageValue = "-1374757475"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 19
			var1 = new InvDefinition(); // L: 20
			if (var2 != null) { // L: 21
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-124"
	)
	public static int method1904(int var0) {
		return ClientPacket.method3671(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 52
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1359894700"
	)
	static final void method1903() {
		if (Client.logoutTimer > 0) { // L: 2959
			WorldMapRectangle.logOut(); // L: 2960
		} else {
			Client.timer.method5018(); // L: 2963
			WorldMapCacheName.updateGameState(40); // L: 2964
			InterfaceParent.field562 = Client.packetWriter.getSocket(); // L: 2965
			Client.packetWriter.removeSocket(); // L: 2966
		}
	} // L: 2961 2967
}
