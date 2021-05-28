import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("qo")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 222358093
	)
	int field2881;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lau;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("f")
	short[] field2878;
	@ObfuscatedName("y")
	byte[] field2879;
	@ObfuscatedName("p")
	byte[] field2880;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lhk;"
	)
	MusicPatchNode2[] field2876;
	@ObfuscatedName("r")
	byte[] field2882;
	@ObfuscatedName("b")
	int[] field2883;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128]; // L: 27
		this.field2878 = new short[128]; // L: 28
		this.field2879 = new byte[128]; // L: 29
		this.field2880 = new byte[128]; // L: 30
		this.field2876 = new MusicPatchNode2[128]; // L: 31
		this.field2882 = new byte[128]; // L: 32
		this.field2883 = new int[128]; // L: 33
		Buffer var2 = new Buffer(var1); // L: 34

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) { // L: 35 36
		}

		byte[] var4 = new byte[var3]; // L: 37

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 38
			var4[var5] = var2.readByte();
		}

		++var2.offset; // L: 39
		++var3; // L: 40
		var5 = var2.offset; // L: 41
		var2.offset += var3; // L: 42

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) { // L: 43 44
		}

		byte[] var7 = new byte[var6]; // L: 45

		int var8;
		for (var8 = 0; var8 < var6; ++var8) { // L: 46
			var7[var8] = var2.readByte();
		}

		++var2.offset; // L: 47
		++var6; // L: 48
		var8 = var2.offset; // L: 49
		var2.offset += var6; // L: 50

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) { // L: 51 52
		}

		byte[] var10 = new byte[var9]; // L: 53

		for (int var11 = 0; var11 < var9; ++var11) { // L: 54
			var10[var11] = var2.readByte();
		}

		++var2.offset; // L: 55
		++var9; // L: 56
		byte[] var38 = new byte[var9]; // L: 57
		int var12;
		int var14;
		if (var9 > 1) { // L: 59
			var38[1] = 1; // L: 60
			int var13 = 1; // L: 61
			var12 = 2; // L: 62

			for (var14 = 2; var14 < var9; ++var14) { // L: 63
				int var43 = var2.readUnsignedByte(); // L: 64
				if (var43 == 0) { // L: 65
					var13 = var12++;
				} else {
					if (var43 <= var13) { // L: 67
						--var43;
					}

					var13 = var43; // L: 68
				}

				var38[var14] = (byte)var13; // L: 70
			}
		} else {
			var12 = var9; // L: 73
		}

		MusicPatchNode2[] var39 = new MusicPatchNode2[var12]; // L: 74

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var39.length; ++var14) { // L: 75
			var15 = var39[var14] = new MusicPatchNode2(); // L: 76
			int var42 = var2.readUnsignedByte(); // L: 77
			if (var42 > 0) { // L: 78
				var15.field2825 = new byte[var42 * 2];
			}

			var42 = var2.readUnsignedByte(); // L: 79
			if (var42 > 0) { // L: 80
				var15.field2816 = new byte[var42 * 2 + 2]; // L: 81
				var15.field2816[1] = 64; // L: 82
			}
		}

		var14 = var2.readUnsignedByte(); // L: 85
		byte[] var44 = var14 > 0 ? new byte[var14 * 2] : null; // L: 86
		var14 = var2.readUnsignedByte(); // L: 87
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null; // L: 88

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) { // L: 89 90
		}

		byte[] var18 = new byte[var17]; // L: 91

		int var19;
		for (var19 = 0; var19 < var17; ++var19) { // L: 92
			var18[var19] = var2.readByte();
		}

		++var2.offset; // L: 93
		++var17; // L: 94
		var19 = 0; // L: 95

		int var20;
		for (var20 = 0; var20 < 128; ++var20) { // L: 96
			var19 += var2.readUnsignedByte(); // L: 97
			this.field2878[var20] = (short)var19; // L: 98
		}

		var19 = 0; // L: 100

		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) { // L: 101
			var19 += var2.readUnsignedByte(); // L: 102
			var50 = this.field2878; // L: 103
			var50[var20] = (short)(var50[var20] + (var19 << 8));
		}

		var20 = 0; // L: 105
		int var21 = 0; // L: 106
		int var22 = 0; // L: 107

		int var23;
		for (var23 = 0; var23 < 128; ++var23) { // L: 108
			if (var20 == 0) { // L: 109
				if (var21 < var18.length) { // L: 110
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 111
				}

				var22 = var2.readVarInt(); // L: 112
			}

			var50 = this.field2878; // L: 114
			var50[var23] = (short)(var50[var23] + ((var22 - 1 & 2) << 14));
			this.field2883[var23] = var22; // L: 115
			--var20; // L: 116
		}

		var20 = 0; // L: 118
		var21 = 0; // L: 119
		var23 = 0; // L: 120

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 121
			if (this.field2883[var24] != 0) { // L: 122
				if (var20 == 0) { // L: 123
					if (var21 < var4.length) { // L: 124
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 125
					}

					var23 = var2.array[var5++] - 1; // L: 126
				}

				this.field2882[var24] = (byte)var23; // L: 128
				--var20; // L: 129
			}
		}

		var20 = 0; // L: 131
		var21 = 0; // L: 132
		var24 = 0; // L: 133

		for (int var25 = 0; var25 < 128; ++var25) { // L: 134
			if (this.field2883[var25] != 0) { // L: 135
				if (var20 == 0) { // L: 136
					if (var21 < var7.length) {
						var20 = var7[var21++]; // L: 137
					} else {
						var20 = -1; // L: 138
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 139
				}

				this.field2880[var25] = (byte)var24; // L: 141
				--var20; // L: 142
			}
		}

		var20 = 0; // L: 144
		var21 = 0; // L: 145
		MusicPatchNode2 var40 = null; // L: 146

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 147
			if (this.field2883[var26] != 0) { // L: 148
				if (var20 == 0) { // L: 149
					var40 = var39[var38[var21]]; // L: 150
					if (var21 < var10.length) { // L: 151
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 152
					}
				}

				this.field2876[var26] = var40; // L: 154
				--var20; // L: 155
			}
		}

		var20 = 0; // L: 157
		var21 = 0; // L: 158
		var26 = 0; // L: 159

		int var27;
		for (var27 = 0; var27 < 128; ++var27) { // L: 160
			if (var20 == 0) { // L: 161
				if (var21 < var18.length) { // L: 162
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 163
				}

				if (this.field2883[var27] > 0) { // L: 164
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field2879[var27] = (byte)var26; // L: 166
			--var20; // L: 167
		}

		this.field2881 = var2.readUnsignedByte() + 1; // L: 169

		int var29;
		MusicPatchNode2 var41;
		for (var27 = 0; var27 < var12; ++var27) { // L: 170
			var41 = var39[var27]; // L: 171
			if (var41.field2825 != null) { // L: 172
				for (var29 = 1; var29 < var41.field2825.length; var29 += 2) { // L: 173
					var41.field2825[var29] = var2.readByte();
				}
			}

			if (var41.field2816 != null) { // L: 175
				for (var29 = 3; var29 < var41.field2816.length - 2; var29 += 2) { // L: 176
					var41.field2816[var29] = var2.readByte();
				}
			}
		}

		if (var44 != null) { // L: 179
			for (var27 = 1; var27 < var44.length; var27 += 2) { // L: 180
				var44[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 182
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 183
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 185
			var41 = var39[var27]; // L: 186
			if (var41.field2816 != null) { // L: 187
				var19 = 0; // L: 188

				for (var29 = 2; var29 < var41.field2816.length; var29 += 2) { // L: 189
					var19 = 1 + var19 + var2.readUnsignedByte(); // L: 190
					var41.field2816[var29] = (byte)var19; // L: 191
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 195
			var41 = var39[var27]; // L: 196
			if (var41.field2825 != null) { // L: 197
				var19 = 0; // L: 198

				for (var29 = 2; var29 < var41.field2825.length; var29 += 2) { // L: 199
					var19 = 1 + var19 + var2.readUnsignedByte(); // L: 200
					var41.field2825[var29] = (byte)var19; // L: 201
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		int var47;
		byte var49;
		if (var44 != null) { // L: 205
			var19 = var2.readUnsignedByte(); // L: 206
			var44[0] = (byte)var19; // L: 207

			for (var27 = 2; var27 < var44.length; var27 += 2) { // L: 208
				var19 = 1 + var19 + var2.readUnsignedByte(); // L: 209
				var44[var27] = (byte)var19; // L: 210
			}

			var49 = var44[0]; // L: 212
			byte var28 = var44[1]; // L: 213

			for (var29 = 0; var29 < var49; ++var29) { // L: 214
				this.field2879[var29] = (byte)(var28 * this.field2879[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var44.length; var29 += 2) { // L: 215 216 233
				var30 = var44[var29]; // L: 217
				byte var31 = var44[var29 + 1]; // L: 218
				var32 = var28 * (var30 - var49) + (var30 - var49) / 2; // L: 219

				for (var33 = var49; var33 < var30; ++var33) { // L: 220
					var35 = var30 - var49; // L: 222
					var36 = var32 >>> 31; // L: 224
					var34 = (var32 + var36) / var35 - var36; // L: 225
					this.field2879[var33] = (byte)(var34 * this.field2879[var33] + 32 >> 6); // L: 228
					var32 += var31 - var28; // L: 229
				}

				var49 = var30; // L: 231
				var28 = var31; // L: 232
			}

			for (var47 = var49; var47 < 128; ++var47) { // L: 235
				this.field2879[var47] = (byte)(var28 * this.field2879[var47] + 32 >> 6);
			}

			var15 = null; // L: 236
		}

		if (var16 != null) { // L: 238
			var19 = var2.readUnsignedByte(); // L: 239
			var16[0] = (byte)var19; // L: 240

			for (var27 = 2; var27 < var16.length; var27 += 2) { // L: 241
				var19 = 1 + var19 + var2.readUnsignedByte(); // L: 242
				var16[var27] = (byte)var19; // L: 243
			}

			var49 = var16[0]; // L: 245
			int var46 = var16[1] << 1; // L: 246

			for (var29 = 0; var29 < var49; ++var29) { // L: 247
				var47 = var46 + (this.field2880[var29] & 255); // L: 248
				if (var47 < 0) { // L: 249
					var47 = 0;
				}

				if (var47 > 128) { // L: 250
					var47 = 128;
				}

				this.field2880[var29] = (byte)var47; // L: 251
			}

			int var48;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 253 254 274
				var30 = var16[var29]; // L: 255
				var48 = var16[var29 + 1] << 1; // L: 256
				var32 = var46 * (var30 - var49) + (var30 - var49) / 2; // L: 257

				for (var33 = var49; var33 < var30; ++var33) { // L: 258
					var35 = var30 - var49; // L: 260
					var36 = var32 >>> 31; // L: 262
					var34 = (var32 + var36) / var35 - var36; // L: 263
					int var37 = var34 + (this.field2880[var33] & 255); // L: 266
					if (var37 < 0) { // L: 267
						var37 = 0;
					}

					if (var37 > 128) { // L: 268
						var37 = 128;
					}

					this.field2880[var33] = (byte)var37; // L: 269
					var32 += var48 - var46; // L: 270
				}

				var49 = var30; // L: 272
				var46 = var48; // L: 273
			}

			for (var47 = var49; var47 < 128; ++var47) { // L: 276
				var48 = var46 + (this.field2880[var47] & 255); // L: 277
				if (var48 < 0) { // L: 278
					var48 = 0;
				}

				if (var48 > 128) { // L: 279
					var48 = 128;
				}

				this.field2880[var47] = (byte)var48; // L: 280
			}

			Object var45 = null; // L: 282
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 284
			var39[var27].field2815 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 285
			var41 = var39[var27]; // L: 286
			if (var41.field2825 != null) { // L: 287
				var41.field2821 = var2.readUnsignedByte();
			}

			if (var41.field2816 != null) { // L: 288
				var41.field2819 = var2.readUnsignedByte();
			}

			if (var41.field2815 > 0) { // L: 289
				var41.field2820 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 291
			var39[var27].field2817 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 292
			var41 = var39[var27]; // L: 293
			if (var41.field2817 > 0) { // L: 294
				var41.field2822 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 296
			var41 = var39[var27]; // L: 297
			if (var41.field2822 > 0) { // L: 298
				var41.field2823 = var2.readUnsignedByte();
			}
		}

	} // L: 300

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lbu;[B[II)Z",
		garbageValue = "122660467"
	)
	boolean method4588(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true; // L: 303
		int var5 = 0; // L: 304
		RawSound var6 = null; // L: 305

		for (int var7 = 0; var7 < 128; ++var7) { // L: 306
			if (var2 == null || var2[var7] != 0) { // L: 307
				int var8 = this.field2883[var7]; // L: 308
				if (var8 != 0) { // L: 309
					if (var5 != var8) { // L: 310
						var5 = var8--; // L: 311 312
						if ((var8 & 1) == 0) { // L: 313
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3); // L: 314
						}

						if (var6 == null) {
							var4 = false; // L: 315
						}
					}

					if (var6 != null) { // L: 317
						this.rawSounds[var7] = var6; // L: 318
						this.field2883[var7] = 0; // L: 319
					}
				}
			}
		}

		return var4; // L: 323
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1514154807"
	)
	@Export("clear")
	void clear() {
		this.field2883 = null; // L: 327
	} // L: 328

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Ljava/lang/String;",
		garbageValue = "502303985"
	)
	public static String method4592(Buffer var0) {
		return ModelData0.method4261(var0, 32767); // L: 26
	}
}
