import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("i")
	@Export("VorbisSample_bytes")
	static byte[] VorbisSample_bytes;
	@ObfuscatedName("w")
	@Export("VorbisSample_byteOffset")
	static int VorbisSample_byteOffset;
	@ObfuscatedName("v")
	@Export("VorbisSample_bitOffset")
	static int VorbisSample_bitOffset;
	@ObfuscatedName("a")
	@Export("VorbisSample_blockSize0")
	static int VorbisSample_blockSize0;
	@ObfuscatedName("y")
	@Export("VorbisSample_blockSize1")
	static int VorbisSample_blockSize1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lax;"
	)
	@Export("VorbisSample_codebooks")
	static VorbisCodebook[] VorbisSample_codebooks;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Las;"
	)
	@Export("VorbisSample_floors")
	static VorbisFloor[] VorbisSample_floors;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lat;"
	)
	@Export("VorbisSample_residues")
	static VorbisResidue[] VorbisSample_residues;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Law;"
	)
	@Export("VorbisSample_mappings")
	static VorbisMapping[] VorbisSample_mappings;
	@ObfuscatedName("p")
	@Export("VorbisSample_blockFlags")
	static boolean[] VorbisSample_blockFlags;
	@ObfuscatedName("n")
	@Export("VorbisSample_mapping")
	static int[] VorbisSample_mapping;
	@ObfuscatedName("m")
	static boolean field374;
	@ObfuscatedName("t")
	static float[] field394;
	@ObfuscatedName("k")
	static float[] field395;
	@ObfuscatedName("b")
	static float[] field396;
	@ObfuscatedName("z")
	static float[] field397;
	@ObfuscatedName("ap")
	static float[] field378;
	@ObfuscatedName("af")
	static float[] field372;
	@ObfuscatedName("ak")
	static float[] field400;
	@ObfuscatedName("av")
	static int[] field401;
	@ObfuscatedName("ar")
	static int[] field402;
	@ObfuscatedName("c")
	byte[][] field398;
	@ObfuscatedName("l")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("s")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("e")
	@Export("start")
	int start;
	@ObfuscatedName("r")
	@Export("end")
	int end;
	@ObfuscatedName("o")
	boolean field386;
	@ObfuscatedName("d")
	float[] field393;
	@ObfuscatedName("j")
	int field391;
	@ObfuscatedName("f")
	int field392;
	@ObfuscatedName("g")
	boolean field389;
	@ObfuscatedName("al")
	@Export("samples")
	byte[] samples;
	@ObfuscatedName("aa")
	int field404;
	@ObfuscatedName("ao")
	int field373;

	static {
		field374 = false; // L: 28
	}

	VorbisSample(byte[] var1) {
		this.read(var1); // L: 401
	} // L: 402

	@ObfuscatedName("r")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1); // L: 89
		this.sampleRate = var2.readInt(); // L: 90
		this.sampleCount = var2.readInt(); // L: 91
		this.start = var2.readInt(); // L: 92
		this.end = var2.readInt(); // L: 93
		if (this.end < 0) { // L: 94
			this.end = ~this.end; // L: 95
			this.field386 = true; // L: 96
		}

		int var3 = var2.readInt(); // L: 98
		this.field398 = new byte[var3][]; // L: 99

		for (int var4 = 0; var4 < var3; ++var4) { // L: 100
			int var5 = 0; // L: 101

			int var6;
			do {
				var6 = var2.readUnsignedByte(); // L: 103
				var5 += var6; // L: 104
			} while(var6 >= 255); // L: 105

			byte[] var7 = new byte[var5]; // L: 107
			var2.readBytes(var7, 0, var5); // L: 108
			this.field398[var4] = var7; // L: 109
		}

	} // L: 111

	@ObfuscatedName("i")
	float[] method1007(int var1) {
		VorbisSample_setData(this.field398[var1], 0); // L: 182
		readBit(); // L: 183
		int var2 = readBits(class111.iLog(VorbisSample_mapping.length - 1)); // L: 184
		boolean var3 = VorbisSample_blockFlags[var2]; // L: 185
		int var4 = var3 ? VorbisSample_blockSize1 : VorbisSample_blockSize0; // L: 186
		boolean var5 = false; // L: 187
		boolean var6 = false; // L: 188
		if (var3) { // L: 189
			var5 = readBit() != 0; // L: 190
			var6 = readBit() != 0; // L: 191
		}

		int var7 = var4 >> 1; // L: 193
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) { // L: 197
			var8 = (var4 >> 2) - (VorbisSample_blockSize0 >> 2); // L: 198
			var9 = (VorbisSample_blockSize0 >> 2) + (var4 >> 2); // L: 199
			var10 = VorbisSample_blockSize0 >> 1; // L: 200
		} else {
			var8 = 0; // L: 203
			var9 = var7; // L: 204
			var10 = var4 >> 1; // L: 205
		}

		int var11;
		int var12;
		int var13;
		if (var3 && !var6) { // L: 210
			var11 = var4 - (var4 >> 2) - (VorbisSample_blockSize0 >> 2); // L: 211
			var12 = (VorbisSample_blockSize0 >> 2) + (var4 - (var4 >> 2)); // L: 212
			var13 = VorbisSample_blockSize0 >> 1; // L: 213
		} else {
			var11 = var7; // L: 216
			var12 = var4; // L: 217
			var13 = var4 >> 1; // L: 218
		}

		VorbisMapping var14 = VorbisSample_mappings[VorbisSample_mapping[var2]]; // L: 220
		int var16 = var14.mappingMux; // L: 223
		int var17 = var14.submapFloor[var16]; // L: 224
		boolean var15 = !VorbisSample_floors[var17].readSubmapFloor(); // L: 225
		boolean var45 = var15; // L: 227

		for (var17 = 0; var17 < var14.submaps; ++var17) { // L: 228
			VorbisResidue var42 = VorbisSample_residues[var14.submapResidue[var17]]; // L: 229
			float[] var44 = field394; // L: 230
			var42.method801(var44, var4 >> 1, var45); // L: 231
		}

		int var18;
		if (!var15) { // L: 234
			var17 = var14.mappingMux; // L: 235
			var18 = var14.submapFloor[var17]; // L: 236
			VorbisSample_floors[var18].method706(field394, var4 >> 1); // L: 237
		}

		int var19;
		if (var15) { // L: 240
			for (var17 = var4 >> 1; var17 < var4; ++var17) { // L: 241
				field394[var17] = 0.0F;
			}
		} else {
			var17 = var4 >> 1; // L: 244
			var18 = var4 >> 2; // L: 245
			var19 = var4 >> 3; // L: 246
			float[] var20 = field394; // L: 247

			int var21;
			for (var21 = 0; var21 < var17; ++var21) { // L: 248
				var20[var21] *= 0.5F;
			}

			for (var21 = var17; var21 < var4; ++var21) { // L: 249
				var20[var21] = -var20[var4 - var21 - 1];
			}

			float[] var40 = var3 ? field378 : field395; // L: 250
			float[] var22 = var3 ? field372 : field396; // L: 251
			float[] var23 = var3 ? field400 : field397; // L: 252
			int[] var24 = var3 ? field402 : field401; // L: 253

			int var25;
			float var26;
			float var27;
			float var28;
			float var29;
			for (var25 = 0; var25 < var18; ++var25) { // L: 254
				var26 = var20[var25 * 4] - var20[var4 - var25 * 4 - 1]; // L: 255
				var27 = var20[var25 * 4 + 2] - var20[var4 - var25 * 4 - 3]; // L: 256
				var28 = var40[var25 * 2]; // L: 257
				var29 = var40[var25 * 2 + 1]; // L: 258
				var20[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29; // L: 259
				var20[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28; // L: 260
			}

			float var30;
			float var31;
			for (var25 = 0; var25 < var19; ++var25) { // L: 262
				var26 = var20[var17 + var25 * 4 + 3]; // L: 263
				var27 = var20[var17 + var25 * 4 + 1]; // L: 264
				var28 = var20[var25 * 4 + 3]; // L: 265
				var29 = var20[var25 * 4 + 1]; // L: 266
				var20[var17 + var25 * 4 + 3] = var26 + var28; // L: 267
				var20[var17 + var25 * 4 + 1] = var27 + var29; // L: 268
				var30 = var40[var17 - 4 - var25 * 4]; // L: 269
				var31 = var40[var17 - 3 - var25 * 4]; // L: 270
				var20[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31; // L: 271
				var20[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31; // L: 272
			}

			var25 = class111.iLog(var4 - 1); // L: 274

			int var46;
			int var47;
			int var48;
			int var49;
			for (var46 = 0; var46 < var25 - 3; ++var46) { // L: 275
				var47 = var4 >> var46 + 2; // L: 276
				var48 = 8 << var46; // L: 277

				for (var49 = 0; var49 < 2 << var46; ++var49) { // L: 278
					int var50 = var4 - var47 * var49 * 2; // L: 279
					int var51 = var4 - var47 * (var49 * 2 + 1); // L: 280

					for (int var32 = 0; var32 < var4 >> var46 + 4; ++var32) { // L: 281
						int var33 = var32 * 4; // L: 282
						float var34 = var20[var50 - 1 - var33]; // L: 283
						float var35 = var20[var50 - 3 - var33]; // L: 284
						float var36 = var20[var51 - 1 - var33]; // L: 285
						float var37 = var20[var51 - 3 - var33]; // L: 286
						var20[var50 - 1 - var33] = var34 + var36; // L: 287
						var20[var50 - 3 - var33] = var35 + var37; // L: 288
						float var38 = var40[var32 * var48]; // L: 289
						float var39 = var40[var32 * var48 + 1]; // L: 290
						var20[var51 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39; // L: 291
						var20[var51 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39; // L: 292
					}
				}
			}

			for (var46 = 1; var46 < var19 - 1; ++var46) { // L: 296
				var47 = var24[var46]; // L: 297
				if (var46 < var47) { // L: 298
					var48 = var46 * 8; // L: 299
					var49 = var47 * 8; // L: 300
					var30 = var20[var48 + 1]; // L: 302
					var20[var48 + 1] = var20[var49 + 1]; // L: 303
					var20[var49 + 1] = var30; // L: 304
					var30 = var20[var48 + 3]; // L: 305
					var20[var48 + 3] = var20[var49 + 3]; // L: 306
					var20[var49 + 3] = var30; // L: 307
					var30 = var20[var48 + 5]; // L: 308
					var20[var48 + 5] = var20[var49 + 5]; // L: 309
					var20[var49 + 5] = var30; // L: 310
					var30 = var20[var48 + 7]; // L: 311
					var20[var48 + 7] = var20[var49 + 7]; // L: 312
					var20[var49 + 7] = var30; // L: 313
				}
			}

			for (var46 = 0; var46 < var17; ++var46) { // L: 316
				var20[var46] = var20[var46 * 2 + 1];
			}

			for (var46 = 0; var46 < var19; ++var46) { // L: 317
				var20[var4 - 1 - var46 * 2] = var20[var46 * 4]; // L: 318
				var20[var4 - 2 - var46 * 2] = var20[var46 * 4 + 1]; // L: 319
				var20[var4 - var18 - 1 - var46 * 2] = var20[var46 * 4 + 2]; // L: 320
				var20[var4 - var18 - 2 - var46 * 2] = var20[var46 * 4 + 3]; // L: 321
			}

			for (var46 = 0; var46 < var19; ++var46) { // L: 323
				var27 = var23[var46 * 2]; // L: 324
				var28 = var23[var46 * 2 + 1]; // L: 325
				var29 = var20[var17 + var46 * 2]; // L: 326
				var30 = var20[var17 + var46 * 2 + 1]; // L: 327
				var31 = var20[var4 - 2 - var46 * 2]; // L: 328
				float var52 = var20[var4 - 1 - var46 * 2]; // L: 329
				float var53 = var28 * (var29 - var31) + var27 * (var30 + var52); // L: 330
				var20[var17 + var46 * 2] = (var29 + var31 + var53) * 0.5F; // L: 331
				var20[var4 - 2 - var46 * 2] = (var29 + var31 - var53) * 0.5F; // L: 332
				var53 = var28 * (var30 + var52) - var27 * (var29 - var31); // L: 333
				var20[var17 + var46 * 2 + 1] = (var30 - var52 + var53) * 0.5F; // L: 334
				var20[var4 - 1 - var46 * 2] = (-var30 + var52 + var53) * 0.5F; // L: 335
			}

			for (var46 = 0; var46 < var18; ++var46) { // L: 337
				var20[var46] = var20[var17 + var46 * 2] * var22[var46 * 2] + var20[var17 + var46 * 2 + 1] * var22[var46 * 2 + 1]; // L: 338
				var20[var17 - 1 - var46] = var20[var17 + var46 * 2] * var22[var46 * 2 + 1] - var20[var17 + var46 * 2 + 1] * var22[var46 * 2]; // L: 339
			}

			for (var46 = 0; var46 < var18; ++var46) { // L: 341
				var20[var46 + (var4 - var18)] = -var20[var46];
			}

			for (var46 = 0; var46 < var18; ++var46) { // L: 342
				var20[var46] = var20[var18 + var46];
			}

			for (var46 = 0; var46 < var18; ++var46) { // L: 343
				var20[var18 + var46] = -var20[var18 - var46 - 1];
			}

			for (var46 = 0; var46 < var18; ++var46) { // L: 344
				var20[var17 + var46] = var20[var4 - var46 - 1];
			}

			float[] var10000;
			for (var46 = var8; var46 < var9; ++var46) { // L: 345
				var27 = (float)Math.sin(((double)(var46 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D); // L: 346
				var10000 = field394; // L: 347
				var10000[var46] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
			}

			for (var46 = var11; var46 < var12; ++var46) { // L: 349
				var27 = (float)Math.sin(((double)(var46 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D); // L: 350
				var10000 = field394; // L: 351
				var10000[var46] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
			}
		}

		float[] var41 = null; // L: 354
		if (this.field391 > 0) { // L: 355
			var18 = var4 + this.field391 >> 2; // L: 356
			var41 = new float[var18]; // L: 357
			int var43;
			if (!this.field389) { // L: 358
				for (var19 = 0; var19 < this.field392; ++var19) { // L: 359
					var43 = var19 + (this.field391 >> 1); // L: 360
					var41[var19] += this.field393[var43]; // L: 361
				}
			}

			if (!var15) { // L: 364
				for (var19 = var8; var19 < var4 >> 1; ++var19) { // L: 365
					var43 = var41.length - (var4 >> 1) + var19; // L: 366
					var41[var43] += field394[var19]; // L: 367
				}
			}
		}

		float[] var54 = this.field393; // L: 371
		this.field393 = field394; // L: 372
		field394 = var54; // L: 373
		this.field391 = var4; // L: 374
		this.field392 = var12 - (var4 >> 1); // L: 375
		this.field389 = var15; // L: 376
		return var41; // L: 377
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([I)Lab;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) { // L: 405
			return null;
		} else {
			if (this.samples == null) { // L: 406
				this.field391 = 0; // L: 407
				this.field393 = new float[VorbisSample_blockSize1]; // L: 408
				this.samples = new byte[this.sampleCount]; // L: 409
				this.field404 = 0; // L: 410
				this.field373 = 0; // L: 411
			}

			for (; this.field373 < this.field398.length; ++this.field373) { // L: 413 428
				if (var1 != null && var1[0] <= 0) { // L: 414
					return null;
				}

				float[] var2 = this.method1007(this.field373); // L: 415
				if (var2 != null) { // L: 416
					int var3 = this.field404; // L: 417
					int var4 = var2.length; // L: 418
					if (var4 > this.sampleCount - var3) { // L: 419
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) { // L: 420
						int var6 = (int)(128.0F + var2[var5] * 128.0F); // L: 421
						if ((var6 & -256) != 0) { // L: 422
							var6 = ~var6 >> 31;
						}

						this.samples[var3++] = (byte)(var6 - 128); // L: 423
					}

					if (var1 != null) { // L: 425
						var1[0] -= var3 - this.field404;
					}

					this.field404 = var3; // L: 426
				}
			}

			this.field393 = null; // L: 430
			byte[] var7 = this.samples; // L: 431
			this.samples = null; // L: 432
			return new RawSound(this.sampleRate, var7, this.start, this.end, this.field386); // L: 433
		}
	}

	@ObfuscatedName("c")
	@Export("float32Unpack")
	static float float32Unpack(int var0) {
		int var1 = var0 & 2097151; // L: 47
		int var2 = var0 & Integer.MIN_VALUE; // L: 48
		int var3 = (var0 & 2145386496) >> 21; // L: 49
		if (var2 != 0) { // L: 50
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788))); // L: 51
	}

	@ObfuscatedName("l")
	@Export("VorbisSample_setData")
	static void VorbisSample_setData(byte[] var0, int var1) {
		VorbisSample_bytes = var0; // L: 55
		VorbisSample_byteOffset = var1; // L: 56
		VorbisSample_bitOffset = 0; // L: 57
	} // L: 58

	@ObfuscatedName("s")
	@Export("readBit")
	static int readBit() {
		int var0 = VorbisSample_bytes[VorbisSample_byteOffset] >> VorbisSample_bitOffset & 1; // L: 61
		++VorbisSample_bitOffset; // L: 62
		VorbisSample_byteOffset += VorbisSample_bitOffset >> 3; // L: 63
		VorbisSample_bitOffset &= 7; // L: 64
		return var0; // L: 65
	}

	@ObfuscatedName("e")
	@Export("readBits")
	static int readBits(int var0) {
		int var1 = 0; // L: 69

		int var2;
		int var3;
		for (var2 = 0; var0 >= 8 - VorbisSample_bitOffset; var0 -= var3) { // L: 70 71 78
			var3 = 8 - VorbisSample_bitOffset; // L: 72
			int var4 = (1 << var3) - 1; // L: 73
			var1 += (VorbisSample_bytes[VorbisSample_byteOffset] >> VorbisSample_bitOffset & var4) << var2; // L: 74
			VorbisSample_bitOffset = 0; // L: 75
			++VorbisSample_byteOffset; // L: 76
			var2 += var3; // L: 77
		}

		if (var0 > 0) { // L: 80
			var3 = (1 << var0) - 1; // L: 81
			var1 += (VorbisSample_bytes[VorbisSample_byteOffset] >> VorbisSample_bitOffset & var3) << var2; // L: 82
			VorbisSample_bitOffset += var0; // L: 83
		}

		return var1; // L: 85
	}

	@ObfuscatedName("o")
	static void method1005(byte[] var0) {
		VorbisSample_setData(var0, 0); // L: 114
		VorbisSample_blockSize0 = 1 << readBits(4); // L: 115
		VorbisSample_blockSize1 = 1 << readBits(4); // L: 116
		field394 = new float[VorbisSample_blockSize1]; // L: 117

		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		for (var1 = 0; var1 < 2; ++var1) { // L: 118
			var2 = var1 != 0 ? VorbisSample_blockSize1 : VorbisSample_blockSize0; // L: 119
			var3 = var2 >> 1; // L: 120
			var4 = var2 >> 2; // L: 121
			var5 = var2 >> 3; // L: 122
			float[] var12 = new float[var3]; // L: 123

			for (int var7 = 0; var7 < var4; ++var7) { // L: 124
				var12[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2); // L: 125
				var12[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2)); // L: 126
			}

			float[] var13 = new float[var3]; // L: 128

			for (int var8 = 0; var8 < var4; ++var8) { // L: 129
				var13[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2)); // L: 130
				var13[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2)); // L: 131
			}

			float[] var14 = new float[var4]; // L: 133

			for (int var9 = 0; var9 < var5; ++var9) { // L: 134
				var14[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2); // L: 135
				var14[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2)); // L: 136
			}

			int[] var15 = new int[var5]; // L: 138
			int var10 = class111.iLog(var5 - 1); // L: 139

			for (int var11 = 0; var11 < var5; ++var11) { // L: 140
				var15[var11] = ReflectionCheck.method630(var11, var10);
			}

			if (var1 != 0) { // L: 141
				field378 = var12; // L: 142
				field372 = var13; // L: 143
				field400 = var14; // L: 144
				field402 = var15; // L: 145
			} else {
				field395 = var12; // L: 148
				field396 = var13; // L: 149
				field397 = var14; // L: 150
				field401 = var15; // L: 151
			}
		}

		var1 = readBits(8) + 1; // L: 154
		VorbisSample_codebooks = new VorbisCodebook[var1]; // L: 155

		for (var2 = 0; var2 < var1; ++var2) { // L: 156
			VorbisSample_codebooks[var2] = new VorbisCodebook();
		}

		var2 = readBits(6) + 1; // L: 158

		for (var3 = 0; var3 < var2; ++var3) { // L: 159
			readBits(16);
		}

		var2 = readBits(6) + 1; // L: 161
		VorbisSample_floors = new VorbisFloor[var2]; // L: 162

		for (var3 = 0; var3 < var2; ++var3) { // L: 163
			VorbisSample_floors[var3] = new VorbisFloor();
		}

		var3 = readBits(6) + 1; // L: 164
		VorbisSample_residues = new VorbisResidue[var3]; // L: 165

		for (var4 = 0; var4 < var3; ++var4) { // L: 166
			VorbisSample_residues[var4] = new VorbisResidue();
		}

		var4 = readBits(6) + 1; // L: 167
		VorbisSample_mappings = new VorbisMapping[var4]; // L: 168

		for (var5 = 0; var5 < var4; ++var5) { // L: 169
			VorbisSample_mappings[var5] = new VorbisMapping();
		}

		var5 = readBits(6) + 1; // L: 170
		VorbisSample_blockFlags = new boolean[var5]; // L: 171
		VorbisSample_mapping = new int[var5]; // L: 172

		for (int var6 = 0; var6 < var5; ++var6) { // L: 173
			VorbisSample_blockFlags[var6] = readBit() != 0; // L: 174
			readBits(16); // L: 175
			readBits(16); // L: 176
			VorbisSample_mapping[var6] = readBits(8); // L: 177
		}

	} // L: 179

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkq;)Z"
	)
	static boolean method1028(AbstractArchive var0) {
		if (!field374) { // L: 381
			byte[] var1 = var0.takeFile(0, 0); // L: 382
			if (var1 == null) { // L: 383
				return false;
			}

			method1005(var1); // L: 384
			field374 = true; // L: 385
		}

		return true; // L: 387
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkq;II)Lah;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method1028(var0)) { // L: 391
			var0.tryLoadFile(var1, var2); // L: 392
			return null; // L: 393
		} else {
			byte[] var3 = var0.takeFile(var1, var2); // L: 395
			return var3 == null ? null : new VorbisSample(var3); // L: 396
		}
	}
}
