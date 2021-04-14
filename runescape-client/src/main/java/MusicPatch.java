import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("eq")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2108602457
	)
	int field2532;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lah;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("u")
	short[] field2533;
	@ObfuscatedName("p")
	byte[] field2534;
	@ObfuscatedName("b")
	byte[] field2539;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lha;"
	)
	MusicPatchNode2[] field2536;
	@ObfuscatedName("k")
	byte[] field2537;
	@ObfuscatedName("g")
	int[] field2538;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128]; // L: 21
		this.field2533 = new short[128]; // L: 22
		this.field2534 = new byte[128]; // L: 23
		this.field2539 = new byte[128]; // L: 24
		this.field2536 = new MusicPatchNode2[128]; // L: 25
		this.field2537 = new byte[128]; // L: 26
		this.field2538 = new int[128]; // L: 27
		Buffer var2 = new Buffer(var1); // L: 28

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) { // L: 29 30
		}

		byte[] var4 = new byte[var3]; // L: 31

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 32
			var4[var5] = var2.readByte();
		}

		++var2.offset; // L: 33
		++var3; // L: 34
		var5 = var2.offset; // L: 35
		var2.offset += var3; // L: 36

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) { // L: 37 38
		}

		byte[] var7 = new byte[var6]; // L: 39

		int var8;
		for (var8 = 0; var8 < var6; ++var8) { // L: 40
			var7[var8] = var2.readByte();
		}

		++var2.offset; // L: 41
		++var6; // L: 42
		var8 = var2.offset; // L: 43
		var2.offset += var6; // L: 44

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) { // L: 45 46
		}

		byte[] var10 = new byte[var9]; // L: 47

		for (int var11 = 0; var11 < var9; ++var11) { // L: 48
			var10[var11] = var2.readByte();
		}

		++var2.offset; // L: 49
		++var9; // L: 50
		byte[] var38 = new byte[var9]; // L: 51
		int var12;
		int var14;
		if (var9 > 1) { // L: 53
			var38[1] = 1; // L: 54
			int var13 = 1; // L: 55
			var12 = 2; // L: 56

			for (var14 = 2; var14 < var9; ++var14) { // L: 57
				int var43 = var2.readUnsignedByte(); // L: 58
				if (var43 == 0) { // L: 59
					var13 = var12++;
				} else {
					if (var43 <= var13) { // L: 61
						--var43;
					}

					var13 = var43; // L: 62
				}

				var38[var14] = (byte)var13; // L: 64
			}
		} else {
			var12 = var9; // L: 67
		}

		MusicPatchNode2[] var39 = new MusicPatchNode2[var12]; // L: 68

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var39.length; ++var14) { // L: 69
			var15 = var39[var14] = new MusicPatchNode2(); // L: 70
			int var42 = var2.readUnsignedByte(); // L: 71
			if (var42 > 0) { // L: 72
				var15.field2470 = new byte[var42 * 2];
			}

			var42 = var2.readUnsignedByte(); // L: 73
			if (var42 > 0) { // L: 74
				var15.field2467 = new byte[var42 * 2 + 2]; // L: 75
				var15.field2467[1] = 64; // L: 76
			}
		}

		var14 = var2.readUnsignedByte(); // L: 79
		byte[] var44 = var14 > 0 ? new byte[var14 * 2] : null; // L: 80
		var14 = var2.readUnsignedByte(); // L: 81
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null; // L: 82

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) { // L: 83 84
		}

		byte[] var18 = new byte[var17]; // L: 85

		int var19;
		for (var19 = 0; var19 < var17; ++var19) { // L: 86
			var18[var19] = var2.readByte();
		}

		++var2.offset; // L: 87
		++var17; // L: 88
		var19 = 0; // L: 89

		int var20;
		for (var20 = 0; var20 < 128; ++var20) { // L: 90
			var19 += var2.readUnsignedByte(); // L: 91
			this.field2533[var20] = (short)var19; // L: 92
		}

		var19 = 0; // L: 94

		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) { // L: 95
			var19 += var2.readUnsignedByte(); // L: 96
			var50 = this.field2533; // L: 97
			var50[var20] = (short)(var50[var20] + (var19 << 8));
		}

		var20 = 0; // L: 99
		int var21 = 0; // L: 100
		int var22 = 0; // L: 101

		int var23;
		for (var23 = 0; var23 < 128; ++var23) { // L: 102
			if (var20 == 0) { // L: 103
				if (var21 < var18.length) { // L: 104
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 105
				}

				var22 = var2.readVarInt(); // L: 106
			}

			var50 = this.field2533; // L: 108
			var50[var23] = (short)(var50[var23] + ((var22 - 1 & 2) << 14));
			this.field2538[var23] = var22; // L: 109
			--var20; // L: 110
		}

		var20 = 0; // L: 112
		var21 = 0; // L: 113
		var23 = 0; // L: 114

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 115
			if (this.field2538[var24] != 0) { // L: 116
				if (var20 == 0) { // L: 117
					if (var21 < var4.length) { // L: 118
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 119
					}

					var23 = var2.array[var5++] - 1; // L: 120
				}

				this.field2537[var24] = (byte)var23; // L: 122
				--var20; // L: 123
			}
		}

		var20 = 0; // L: 125
		var21 = 0; // L: 126
		var24 = 0; // L: 127

		for (int var25 = 0; var25 < 128; ++var25) { // L: 128
			if (this.field2538[var25] != 0) { // L: 129
				if (var20 == 0) { // L: 130
					if (var21 < var7.length) { // L: 131
						var20 = var7[var21++];
					} else {
						var20 = -1; // L: 132
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 133
				}

				this.field2539[var25] = (byte)var24; // L: 135
				--var20; // L: 136
			}
		}

		var20 = 0; // L: 138
		var21 = 0; // L: 139
		MusicPatchNode2 var40 = null; // L: 140

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 141
			if (this.field2538[var26] != 0) { // L: 142
				if (var20 == 0) { // L: 143
					var40 = var39[var38[var21]]; // L: 144
					if (var21 < var10.length) { // L: 145
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 146
					}
				}

				this.field2536[var26] = var40; // L: 148
				--var20; // L: 149
			}
		}

		var20 = 0; // L: 151
		var21 = 0; // L: 152
		var26 = 0; // L: 153

		int var27;
		for (var27 = 0; var27 < 128; ++var27) { // L: 154
			if (var20 == 0) { // L: 155
				if (var21 < var18.length) { // L: 156
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 157
				}

				if (this.field2538[var27] > 0) { // L: 158
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field2534[var27] = (byte)var26; // L: 160
			--var20; // L: 161
		}

		this.field2532 = var2.readUnsignedByte() + 1; // L: 163

		int var29;
		MusicPatchNode2 var41;
		for (var27 = 0; var27 < var12; ++var27) { // L: 164
			var41 = var39[var27]; // L: 165
			if (var41.field2470 != null) { // L: 166
				for (var29 = 1; var29 < var41.field2470.length; var29 += 2) { // L: 167
					var41.field2470[var29] = var2.readByte();
				}
			}

			if (var41.field2467 != null) { // L: 169
				for (var29 = 3; var29 < var41.field2467.length - 2; var29 += 2) { // L: 170
					var41.field2467[var29] = var2.readByte();
				}
			}
		}

		if (var44 != null) { // L: 173
			for (var27 = 1; var27 < var44.length; var27 += 2) { // L: 174
				var44[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 176
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 177
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 179
			var41 = var39[var27]; // L: 180
			if (var41.field2467 != null) { // L: 181
				var19 = 0; // L: 182

				for (var29 = 2; var29 < var41.field2467.length; var29 += 2) { // L: 183
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 184
					var41.field2467[var29] = (byte)var19; // L: 185
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 189
			var41 = var39[var27]; // L: 190
			if (var41.field2470 != null) { // L: 191
				var19 = 0; // L: 192

				for (var29 = 2; var29 < var41.field2470.length; var29 += 2) { // L: 193
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 194
					var41.field2470[var29] = (byte)var19; // L: 195
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
		if (var44 != null) { // L: 199
			var19 = var2.readUnsignedByte(); // L: 200
			var44[0] = (byte)var19; // L: 201

			for (var27 = 2; var27 < var44.length; var27 += 2) { // L: 202
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 203
				var44[var27] = (byte)var19; // L: 204
			}

			var49 = var44[0]; // L: 206
			byte var28 = var44[1]; // L: 207

			for (var29 = 0; var29 < var49; ++var29) { // L: 208
				this.field2534[var29] = (byte)(var28 * this.field2534[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var44.length; var29 += 2) { // L: 209 210 227
				var30 = var44[var29]; // L: 211
				byte var31 = var44[var29 + 1]; // L: 212
				var32 = var28 * (var30 - var49) + (var30 - var49) / 2; // L: 213

				for (var33 = var49; var33 < var30; ++var33) { // L: 214
					var35 = var30 - var49; // L: 216
					var36 = var32 >>> 31; // L: 218
					var34 = (var36 + var32) / var35 - var36; // L: 219
					this.field2534[var33] = (byte)(var34 * this.field2534[var33] + 32 >> 6); // L: 222
					var32 += var31 - var28; // L: 223
				}

				var49 = var30; // L: 225
				var28 = var31; // L: 226
			}

			for (var47 = var49; var47 < 128; ++var47) { // L: 229
				this.field2534[var47] = (byte)(var28 * this.field2534[var47] + 32 >> 6);
			}

			var15 = null; // L: 230
		}

		if (var16 != null) { // L: 232
			var19 = var2.readUnsignedByte(); // L: 233
			var16[0] = (byte)var19; // L: 234

			for (var27 = 2; var27 < var16.length; var27 += 2) { // L: 235
				var19 = 1 + var19 + var2.readUnsignedByte(); // L: 236
				var16[var27] = (byte)var19; // L: 237
			}

			var49 = var16[0]; // L: 239
			int var46 = var16[1] << 1; // L: 240

			for (var29 = 0; var29 < var49; ++var29) { // L: 241
				var47 = var46 + (this.field2539[var29] & 255); // L: 242
				if (var47 < 0) { // L: 243
					var47 = 0;
				}

				if (var47 > 128) { // L: 244
					var47 = 128;
				}

				this.field2539[var29] = (byte)var47; // L: 245
			}

			int var48;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 247 248 268
				var30 = var16[var29]; // L: 249
				var48 = var16[var29 + 1] << 1; // L: 250
				var32 = var46 * (var30 - var49) + (var30 - var49) / 2; // L: 251

				for (var33 = var49; var33 < var30; ++var33) { // L: 252
					var35 = var30 - var49; // L: 254
					var36 = var32 >>> 31; // L: 256
					var34 = (var32 + var36) / var35 - var36; // L: 257
					int var37 = var34 + (this.field2539[var33] & 255); // L: 260
					if (var37 < 0) { // L: 261
						var37 = 0;
					}

					if (var37 > 128) { // L: 262
						var37 = 128;
					}

					this.field2539[var33] = (byte)var37; // L: 263
					var32 += var48 - var46; // L: 264
				}

				var49 = var30; // L: 266
				var46 = var48; // L: 267
			}

			for (var47 = var49; var47 < 128; ++var47) { // L: 270
				var48 = var46 + (this.field2539[var47] & 255); // L: 271
				if (var48 < 0) { // L: 272
					var48 = 0;
				}

				if (var48 > 128) { // L: 273
					var48 = 128;
				}

				this.field2539[var47] = (byte)var48; // L: 274
			}

			Object var45 = null; // L: 276
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 278
			var39[var27].field2469 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 279
			var41 = var39[var27]; // L: 280
			if (var41.field2470 != null) { // L: 281
				var41.field2475 = var2.readUnsignedByte();
			}

			if (var41.field2467 != null) { // L: 282
				var41.field2476 = var2.readUnsignedByte();
			}

			if (var41.field2469 > 0) { // L: 283
				var41.field2472 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 285
			var39[var27].field2474 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 286
			var41 = var39[var27]; // L: 287
			if (var41.field2474 > 0) { // L: 288
				var41.field2473 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 290
			var41 = var39[var27]; // L: 291
			if (var41.field2473 > 0) { // L: 292
				var41.field2468 = var2.readUnsignedByte();
			}
		}

	} // L: 294

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lbi;[B[II)Z",
		garbageValue = "-1205073092"
	)
	boolean method4111(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true; // L: 297
		int var5 = 0; // L: 298
		RawSound var6 = null; // L: 299

		for (int var7 = 0; var7 < 128; ++var7) { // L: 300
			if (var2 == null || var2[var7] != 0) { // L: 301
				int var8 = this.field2538[var7]; // L: 302
				if (var8 != 0) { // L: 303
					if (var5 != var8) { // L: 304
						var5 = var8--; // L: 305 306
						if ((var8 & 1) == 0) { // L: 307
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3); // L: 308
						}

						if (var6 == null) { // L: 309
							var4 = false;
						}
					}

					if (var6 != null) { // L: 311
						this.rawSounds[var7] = var6; // L: 312
						this.field2538[var7] = 0; // L: 313
					}
				}
			}
		}

		return var4; // L: 317
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "424702467"
	)
	@Export("clear")
	void clear() {
		this.field2538 = null; // L: 321
	} // L: 322
}
