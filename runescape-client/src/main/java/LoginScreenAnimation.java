import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ck")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("m")
	int[] field1300;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1518059987
	)
	int field1304;
	@ObfuscatedName("h")
	int[] field1294;
	@ObfuscatedName("d")
	int[] field1295;
	@ObfuscatedName("z")
	int[] field1296;
	@ObfuscatedName("b")
	int[] field1297;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1626037151
	)
	int field1298;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -970523767
	)
	int field1299;
	@ObfuscatedName("g")
	int[] field1305;
	@ObfuscatedName("t")
	int[] field1301;
	@ObfuscatedName("x")
	int[] field1302;
	@ObfuscatedName("u")
	int[] field1303;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1812898479
	)
	int field1290;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1570701257
	)
	int field1309;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1310128613
	)
	int field1306;

	@ObfuscatedSignature(
		descriptor = "([Lof;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1300 = new int[256]; // L: 13
		this.field1304 = 0; // L: 14
		this.field1298 = 0; // L: 19
		this.field1299 = 0; // L: 20
		this.field1290 = 0; // L: 25
		this.field1309 = 0; // L: 26
		this.field1306 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("initColors")
	void initColors() {
		this.field1295 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1295[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1295[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1295[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1295[var1 + 192] = 16777215;
		}

		this.field1296 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1296[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1296[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1296[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1296[var1 + 192] = 16777215;
		}

		this.field1297 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1297[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1297[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1297[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1297[var1 + 192] = 16777215;
		}

		this.field1294 = new int[256]; // L: 50
		this.field1290 = 0; // L: 51
		this.field1302 = new int[32768]; // L: 52
		this.field1303 = new int[32768]; // L: 53
		this.method2294((IndexedSprite)null); // L: 54
		this.field1305 = new int[32768]; // L: 55
		this.field1301 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1890255909"
	)
	void method2296() {
		this.field1295 = null; // L: 60
		this.field1296 = null; // L: 61
		this.field1297 = null; // L: 62
		this.field1294 = null; // L: 63
		this.field1302 = null; // L: 64
		this.field1303 = null; // L: 65
		this.field1305 = null; // L: 66
		this.field1301 = null; // L: 67
		this.field1290 = 0; // L: 68
		this.field1309 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "657526565"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1305 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1306 == 0) { // L: 76
			this.field1306 = var2; // L: 77
		}

		int var3 = var2 - this.field1306; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1306 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2293(var3); // L: 83
		}

		this.method2290(var1); // L: 85
	} // L: 86

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-960429455"
	)
	final void method2293(int var1) {
		this.field1290 += var1 * 128; // L: 89
		int var2;
		if (this.field1290 > this.field1302.length) { // L: 90
			this.field1290 -= this.field1302.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2294(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1305[var2 + var3] - this.field1302[var2 + this.field1290 & this.field1302.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1305[var2++] = var6; // L: 101
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
					this.field1305[var9 + var8] = 255;
				} else {
					this.field1305[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1298 > 0) { // L: 113
			this.field1298 -= var1 * 4;
		}

		if (this.field1299 > 0) { // L: 114
			this.field1299 -= var1 * 4;
		}

		if (this.field1298 == 0 && this.field1299 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1298 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1299 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1300[var7] = this.field1300[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1300[var7] = (int)(Math.sin((double)this.field1304 / 14.0D) * 16.0D + Math.sin((double)this.field1304 / 15.0D) * 14.0D + Math.sin((double)this.field1304 / 16.0D) * 12.0D); // L: 122
			++this.field1304; // L: 123
		}

		this.field1309 += var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1309 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1305[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1309 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1305[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1305[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1301[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var7 + var13 < 256) { // L: 150
						var12 += this.field1301[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1301[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) { // L: 152
						this.field1305[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1318648994"
	)
	final int method2297(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-739412709"
	)
	final void method2290(int var1) {
		int var2 = this.field1294.length; // L: 164
		if (this.field1298 > 0) { // L: 165
			this.method2291(this.field1298, this.field1296); // L: 166
		} else if (this.field1299 > 0) { // L: 168
			this.method2291(this.field1299, this.field1297); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1294[var3] = this.field1295[var3];
			}
		}

		this.method2292(var1); // L: 174
	} // L: 175

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1814814478"
	)
	final void method2291(int var1, int[] var2) {
		int var3 = this.field1294.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1294[var4] = this.method2297(this.field1295[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1294[var4] = var2[var4]; // L: 181
			} else {
				this.field1294[var4] = this.method2297(var2[var4], this.field1295[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	final void method2292(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1300[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= AbstractWorldMapData.rasterProvider.width) { // L: 197
				var7 = AbstractWorldMapData.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * AbstractWorldMapData.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1305[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1294[var10]; // L: 208
					int var14 = AbstractWorldMapData.rasterProvider.pixels[var8]; // L: 209
					AbstractWorldMapData.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)V",
		garbageValue = "-36"
	)
	final void method2294(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1302.length; ++var2) { // L: 219
			this.field1302[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1302[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1303[var5] = (this.field1302[var5 + 1] + this.field1302[var5 + 128] + this.field1302[var5 - 128] + this.field1302[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1302; // L: 231
			this.field1302 = this.field1303; // L: 232
			this.field1303 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1302[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;B)V",
		garbageValue = "4"
	)
	public static void method2312(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		HitSplatDefinition.field1741 = var1; // L: 47
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2; // L: 48
	} // L: 49

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1215148892"
	)
	static int method2314(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2086
			if (DevicePcmPlayerProvider.friendSystem.field928 == 0) { // L: 2087
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -2;
			} else if (DevicePcmPlayerProvider.friendSystem.field928 == 1) { // L: 2088
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendSystem.friendsList.getSize(); // L: 2089
			}

			return 1; // L: 2090
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2093
				if (DevicePcmPlayerProvider.friendSystem.method1804() && var3 >= 0 && var3 < DevicePcmPlayerProvider.friendSystem.friendsList.getSize()) { // L: 2094
					Friend var8 = (Friend)DevicePcmPlayerProvider.friendSystem.friendsList.get(var3); // L: 2095
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2096
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2097
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 2100
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 2101
				}

				return 1; // L: 2103
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2106
				if (DevicePcmPlayerProvider.friendSystem.method1804() && var3 >= 0 && var3 < DevicePcmPlayerProvider.friendSystem.friendsList.getSize()) { // L: 2107
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.friendSystem.friendsList.get(var3)).world; // L: 2108
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2110
				}

				return 1; // L: 2111
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2114
				if (DevicePcmPlayerProvider.friendSystem.method1804() && var3 >= 0 && var3 < DevicePcmPlayerProvider.friendSystem.friendsList.getSize()) { // L: 2115
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.friendSystem.friendsList.get(var3)).rank; // L: 2116
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2118
				}

				return 1; // L: 2119
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2122
					int var6 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2123
					class14.method229(var5, var6); // L: 2124
					return 1; // L: 2125
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2128
					DevicePcmPlayerProvider.friendSystem.addFriend(var5); // L: 2129
					return 1; // L: 2130
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2133
					DevicePcmPlayerProvider.friendSystem.removeFriend(var5); // L: 2134
					return 1; // L: 2135
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2138
					DevicePcmPlayerProvider.friendSystem.addIgnore(var5); // L: 2139
					return 1; // L: 2140
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2143
					DevicePcmPlayerProvider.friendSystem.removeIgnore(var5); // L: 2144
					return 1; // L: 2145
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2148
					var5 = ScriptFrame.method1232(var5); // L: 2149
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendSystem.isFriended(new Username(var5, loginType), false) ? 1 : 0; // L: 2150
					return 1; // L: 2151
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class289.friendsChat != null) { // L: 2154
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class289.friendsChat.name; // L: 2155
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 2157
					}

					return 1; // L: 2158
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class289.friendsChat != null) { // L: 2161
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class289.friendsChat.getSize(); // L: 2162
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2164
					}

					return 1; // L: 2165
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2168
					if (class289.friendsChat != null && var3 < class289.friendsChat.getSize()) { // L: 2169
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class289.friendsChat.get(var3).getUsername().getName(); // L: 2170
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 2172
					}

					return 1; // L: 2173
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2176
					if (class289.friendsChat != null && var3 < class289.friendsChat.getSize()) { // L: 2177
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((Buddy)class289.friendsChat.get(var3)).getWorld(); // L: 2178
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2180
					}

					return 1; // L: 2181
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2184
					if (class289.friendsChat != null && var3 < class289.friendsChat.getSize()) { // L: 2185
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ((Buddy)class289.friendsChat.get(var3)).rank; // L: 2186
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2188
					}

					return 1; // L: 2189
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class289.friendsChat != null ? class289.friendsChat.minKick : 0; // L: 2192
					return 1; // L: 2193
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2196
					class1.clanKickUser(var5); // L: 2197
					return 1; // L: 2198
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class289.friendsChat != null ? class289.friendsChat.rank * 1745656179 * 1281242043 : 0; // L: 2201
					return 1; // L: 2202
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2205
					Coord.Clan_joinChat(var5); // L: 2206
					return 1; // L: 2207
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapIcon_0.Clan_leaveChat(); // L: 2210
					return 1; // L: 2211
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!DevicePcmPlayerProvider.friendSystem.method1804()) { // L: 2214
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendSystem.ignoreList.getSize(); // L: 2215
					}

					return 1; // L: 2216
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2219
					if (DevicePcmPlayerProvider.friendSystem.method1804() && var3 >= 0 && var3 < DevicePcmPlayerProvider.friendSystem.ignoreList.getSize()) { // L: 2220
						Ignored var4 = (Ignored)DevicePcmPlayerProvider.friendSystem.ignoreList.get(var3); // L: 2221
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2222
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2223
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 2226
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 2227
					}

					return 1; // L: 2229
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2232
					var5 = ScriptFrame.method1232(var5); // L: 2233
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendSystem.isIgnored(new Username(var5, loginType)) ? 1 : 0; // L: 2234
					return 1; // L: 2235
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2238
					if (class289.friendsChat != null && var3 < class289.friendsChat.getSize() && class289.friendsChat.get(var3).getUsername().equals(class262.localPlayer.username)) { // L: 2239
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 2240
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2242
					}

					return 1; // L: 2243
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class289.friendsChat != null && class289.friendsChat.owner != null) { // L: 2246
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class289.friendsChat.owner; // L: 2247
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 2249
					}

					return 1; // L: 2250
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2253
					if (class289.friendsChat != null && var3 < class289.friendsChat.getSize() && ((ClanMate)class289.friendsChat.get(var3)).isFriend()) { // L: 2254
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 2255
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2257
					}

					return 1; // L: 2258
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						DevicePcmPlayerProvider.friendSystem.friendsList.removeComparator(); // L: 2269
						return 1; // L: 2270
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2273
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2274
							return 1; // L: 2275
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2278
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2279
							return 1; // L: 2280
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2283
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2284
							return 1; // L: 2285
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2288
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2289
							return 1; // L: 2290
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2293
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2294
							return 1; // L: 2295
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2298
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2299
							return 1; // L: 2300
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2303
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2304
							return 1; // L: 2305
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2308
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2309
							return 1; // L: 2310
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2313
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2314
							return 1; // L: 2315
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2318
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2319
							return 1; // L: 2320
						} else if (var0 == 3639) {
							DevicePcmPlayerProvider.friendSystem.friendsList.sort(); // L: 2323
							return 1; // L: 2324
						} else if (var0 == 3640) {
							DevicePcmPlayerProvider.friendSystem.ignoreList.removeComparator(); // L: 2327
							return 1; // L: 2328
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2331
							DevicePcmPlayerProvider.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2332
							return 1; // L: 2333
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2336
							DevicePcmPlayerProvider.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2337
							return 1; // L: 2338
						} else if (var0 == 3643) {
							DevicePcmPlayerProvider.friendSystem.ignoreList.sort(); // L: 2341
							return 1; // L: 2342
						} else if (var0 == 3644) {
							if (class289.friendsChat != null) { // L: 2345
								class289.friendsChat.removeComparator(); // L: 2346
							}

							return 1; // L: 2348
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2351
							if (class289.friendsChat != null) { // L: 2352
								class289.friendsChat.addComparator(new UserComparator1(var7)); // L: 2353
							}

							return 1; // L: 2355
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2358
							if (class289.friendsChat != null) { // L: 2359
								class289.friendsChat.addComparator(new UserComparator2(var7)); // L: 2360
							}

							return 1; // L: 2362
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2365
							if (class289.friendsChat != null) { // L: 2366
								class289.friendsChat.addComparator(new UserComparator3(var7)); // L: 2367
							}

							return 1; // L: 2369
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2372
							if (class289.friendsChat != null) { // L: 2373
								class289.friendsChat.addComparator(new UserComparator4(var7)); // L: 2374
							}

							return 1; // L: 2376
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2379
							if (class289.friendsChat != null) { // L: 2380
								class289.friendsChat.addComparator(new UserComparator5(var7)); // L: 2381
							}

							return 1; // L: 2383
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2386
							if (class289.friendsChat != null) { // L: 2387
								class289.friendsChat.addComparator(new UserComparator6(var7)); // L: 2388
							}

							return 1; // L: 2390
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2393
							if (class289.friendsChat != null) { // L: 2394
								class289.friendsChat.addComparator(new UserComparator7(var7)); // L: 2395
							}

							return 1; // L: 2397
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2400
							if (class289.friendsChat != null) { // L: 2401
								class289.friendsChat.addComparator(new UserComparator8(var7)); // L: 2402
							}

							return 1; // L: 2404
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2407
							if (class289.friendsChat != null) { // L: 2408
								class289.friendsChat.addComparator(new UserComparator9(var7)); // L: 2409
							}

							return 1; // L: 2411
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2414
							if (class289.friendsChat != null) { // L: 2415
								class289.friendsChat.addComparator(new UserComparator10(var7)); // L: 2416
							}

							return 1; // L: 2418
						} else if (var0 == 3655) {
							if (class289.friendsChat != null) { // L: 2421
								class289.friendsChat.sort(); // L: 2422
							}

							return 1; // L: 2424
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2427
							DevicePcmPlayerProvider.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2428
							return 1; // L: 2429
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 2432
							if (class289.friendsChat != null) { // L: 2433
								class289.friendsChat.addComparator(new BuddyRankComparator(var7)); // L: 2434
							}

							return 1; // L: 2436
						} else {
							return 2; // L: 2438
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2261
					if (class289.friendsChat != null && var3 < class289.friendsChat.getSize() && ((ClanMate)class289.friendsChat.get(var3)).isIgnored()) { // L: 2262
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 2263
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2265
					}

					return 1; // L: 2266
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1312324085"
	)
	static int method2285(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3515
			ChatChannel.Interpreter_intStackSize -= 2; // L: 3516
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3517
			int var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3518
			if (!Client.isCameraLocked) { // L: 3519
				Client.camAngleX = var3; // L: 3520
				Client.camAngleY = var4; // L: 3521
			}

			return 1; // L: 3523
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3525
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3526
			return 1; // L: 3527
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3529
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3530
			return 1; // L: 3531
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3533
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3534
			if (var3 < 0) { // L: 3535
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3536
			return 1; // L: 3537
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3539
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3540
			return 1; // L: 3541
		} else {
			return 2; // L: 3543
		}
	}
}
