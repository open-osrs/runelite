import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("fz")
	static String field1200;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("i")
	int[] field1193;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1599270879
	)
	int field1194;
	@ObfuscatedName("v")
	int[] field1195;
	@ObfuscatedName("a")
	int[] field1196;
	@ObfuscatedName("y")
	int[] field1191;
	@ObfuscatedName("u")
	int[] field1208;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -156558015
	)
	int field1198;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1783303053
	)
	int field1197;
	@ObfuscatedName("x")
	int[] field1201;
	@ObfuscatedName("p")
	int[] field1202;
	@ObfuscatedName("n")
	int[] field1203;
	@ObfuscatedName("m")
	int[] field1204;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -233088909
	)
	int field1205;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1165677427
	)
	int field1206;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1265486129
	)
	int field1189;

	@ObfuscatedSignature(
		descriptor = "([Lpg;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1193 = new int[256]; // L: 13
		this.field1194 = 0; // L: 14
		this.field1198 = 0;
		this.field1197 = 0;
		this.field1205 = 0; // L: 25
		this.field1206 = 0; // L: 26
		this.field1189 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1819291611"
	)
	@Export("initColors")
	void initColors() {
		this.field1196 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1196[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1196[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1196[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1196[var1 + 192] = 16777215;
		}

		this.field1191 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1191[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1191[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1191[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1191[var1 + 192] = 16777215;
		}

		this.field1208 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1208[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1208[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1208[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1208[var1 + 192] = 16777215;
		}

		this.field1195 = new int[256]; // L: 50
		this.field1205 = 0; // L: 51
		this.field1203 = new int[32768];
		this.field1204 = new int[32768]; // L: 53
		this.method2204((IndexedSprite)null);
		this.field1201 = new int[32768]; // L: 55
		this.field1202 = new int[32768];
	} // L: 57

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1740106478"
	)
	void method2208() {
		this.field1196 = null; // L: 60
		this.field1191 = null; // L: 61
		this.field1208 = null; // L: 62
		this.field1195 = null; // L: 63
		this.field1203 = null; // L: 64
		this.field1204 = null; // L: 65
		this.field1201 = null; // L: 66
		this.field1202 = null; // L: 67
		this.field1205 = 0; // L: 68
		this.field1206 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1201 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1189 == 0) { // L: 76
			this.field1189 = var2; // L: 77
		}

		int var3 = var2 - this.field1189; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1189 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2187(var3); // L: 83
		}

		this.method2209(var1); // L: 85
	} // L: 86

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-55"
	)
	final void method2187(int var1) {
		this.field1205 += 128 * var1; // L: 89
		int var2;
		if (this.field1205 > this.field1203.length) { // L: 90
			this.field1205 -= this.field1203.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2204(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1201[var2 + var3] - this.field1203[var2 + this.field1205 & this.field1203.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1201[var2++] = var6; // L: 101
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
					this.field1201[var9 + var8] = 255;
				} else {
					this.field1201[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1198 > 0) { // L: 113
			this.field1198 -= var1 * 4;
		}

		if (this.field1197 > 0) { // L: 114
			this.field1197 -= var1 * 4;
		}

		if (this.field1198 == 0 && this.field1197 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1198 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1197 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1193[var7] = this.field1193[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1193[var7] = (int)(Math.sin((double)this.field1194 / 14.0D) * 16.0D + Math.sin((double)this.field1194 / 15.0D) * 14.0D + Math.sin((double)this.field1194 / 16.0D) * 12.0D); // L: 122
			++this.field1194; // L: 123
		}

		this.field1206 += var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1206 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1201[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1206 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1201[var14 + var13 + var7];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1201[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1202[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1202[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1202[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1201[var11 + var14] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-833857327"
	)
	final int method2188(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-814155741"
	)
	final void method2209(int var1) {
		int var2 = this.field1195.length; // L: 164
		if (this.field1198 > 0) { // L: 165
			this.method2206(this.field1198, this.field1191); // L: 166
		} else if (this.field1197 > 0) { // L: 168
			this.method2206(this.field1197, this.field1208); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1195[var3] = this.field1196[var3];
			}
		}

		this.method2192(var1); // L: 174
	} // L: 175

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "1008871550"
	)
	final void method2206(int var1, int[] var2) {
		int var3 = this.field1195.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1195[var4] = this.method2188(this.field1196[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1195[var4] = var2[var4]; // L: 181
			} else {
				this.field1195[var4] = this.method2188(var2[var4], this.field1196[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-119"
	)
	final void method2192(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1193[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= PcmPlayer.rasterProvider.width) { // L: 197
				var7 = PcmPlayer.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * PcmPlayer.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1201[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1195[var10]; // L: 208
					int var14 = PcmPlayer.rasterProvider.pixels[var8]; // L: 209
					PcmPlayer.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpg;I)V",
		garbageValue = "-895320228"
	)
	final void method2204(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1203.length; ++var2) { // L: 219
			this.field1203[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1203[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7); // L: 227
					this.field1204[var5] = (this.field1203[var5 + 128] + this.field1203[var5 - 128] + this.field1203[var5 + 1] + this.field1203[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1203;
			this.field1203 = this.field1204;
			this.field1204 = var8;
		}

		if (var1 != null) { // L: 235
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1203[var7] = 0;
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-205678556"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		GraphicsObject.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("l")
	public static boolean method2219(long var0) {
		boolean var2 = var0 != 0L; // L: 48
		if (var2) { // L: 49
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 52
			var2 = !var3; // L: 54
		}

		return var2; // L: 56
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-932017962"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lbi;Lbi;IZB)I",
		garbageValue = "37"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 221
			int var4 = var0.population; // L: 222
			int var5 = var1.population; // L: 223
			if (!var3) { // L: 224
				if (var4 == -1) { // L: 225
					var4 = 2001;
				}

				if (var5 == -1) { // L: 226
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 228
		} else if (var2 == 2) { // L: 230
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 231
			if (var0.activity.equals("-")) { // L: 232
				if (var1.activity.equals("-")) { // L: 233
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 234
				}
			} else if (var1.activity.equals("-")) { // L: 236
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 237
			}
		} else if (var2 == 4) { // L: 239
			return var0.method1662() ? (var1.method1662() ? 0 : 1) : (var1.method1662() ? -1 : 0);
		} else if (var2 == 5) { // L: 240
			return var0.method1649() ? (var1.method1649() ? 0 : 1) : (var1.method1649() ? -1 : 0);
		} else if (var2 == 6) { // L: 241
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 242
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 243
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lcq;IS)V",
		garbageValue = "-10156"
	)
	static final void method2214(Actor var0, int var1) {
		class148.worldToScreen(var0.x, var0.y, var1); // L: 5176
	} // L: 5177

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I)Z",
		garbageValue = "-293317117"
	)
	static final boolean method2218(Widget var0) {
		int var1 = var0.contentType; // L: 11722
		if (var1 == 205) { // L: 11723
			Client.logoutTimer = 250; // L: 11724
			return true; // L: 11725
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11727
				var2 = (var1 - 300) / 2; // L: 11728
				var3 = var1 & 1; // L: 11729
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11730
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11732
				var2 = (var1 - 314) / 2; // L: 11733
				var3 = var1 & 1; // L: 11734
				Client.playerAppearance.method5393(var2, var3 == 1); // L: 11735
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 11737
			}

			if (var1 == 325) { // L: 11738
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11739
				PacketBufferNode var4 = class135.getPacketBufferNode(ClientPacket.field2922, Client.packetWriter.isaacCipher); // L: 11741
				Client.playerAppearance.write(var4.packetBuffer); // L: 11742
				Client.packetWriter.addNode(var4); // L: 11743
				return true; // L: 11744
			} else {
				return false; // L: 11746
			}
		}
	}
}
