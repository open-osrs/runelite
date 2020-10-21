import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("BZip2Decompressor")
public final class BZip2Decompressor {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("BZip2Decompressor_state")
	static BZip2State BZip2Decompressor_state;

	static {
		BZip2Decompressor_state = new BZip2State(); // L: 13
	}

	@ObfuscatedName("f")
	@Export("BZip2Decompressor_decompress")
	public static int BZip2Decompressor_decompress(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized(BZip2Decompressor_state) { // L: 20
			BZip2Decompressor_state.inputArray = var2; // L: 21
			BZip2Decompressor_state.nextByte = var4; // L: 22
			BZip2Decompressor_state.outputArray = var0; // L: 23
			BZip2Decompressor_state.next_out = 0; // L: 24
			BZip2Decompressor_state.outputLength = var1; // L: 25
			BZip2Decompressor_state.bsLive = 0; // L: 26
			BZip2Decompressor_state.bsBuff = 0; // L: 27
			BZip2Decompressor_state.nextBit_unused = 0; // L: 28
			BZip2Decompressor_state.field3766 = 0; // L: 29
			BZip2Decompressor_decompress(BZip2Decompressor_state); // L: 30
			var1 -= BZip2Decompressor_state.outputLength; // L: 31
			BZip2Decompressor_state.inputArray = null; // L: 32
			BZip2Decompressor_state.outputArray = null; // L: 33
			return var1; // L: 34
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Llj;)V"
	)
	static void method5912(BZip2State var0) {
		byte var2 = var0.out_char; // L: 40
		int var3 = var0.su_rNToGo; // L: 41
		int var4 = var0.nblocks_used; // L: 42
		int var5 = var0.su_ch2; // L: 43
		int[] var6 = class217.BZip2Decompressor_block; // L: 44
		int var7 = var0.field3761; // L: 45
		byte[] var8 = var0.outputArray; // L: 46
		int var9 = var0.next_out; // L: 47
		int var10 = var0.outputLength; // L: 48
		int var12 = var0.field3791 + 1; // L: 50

		label70:
		while (true) {
			if (var3 > 0) { // L: 53
				while (true) {
					if (var10 == 0) { // L: 55
						break label70;
					}

					if (var3 == 1) { // L: 56
						if (var10 == 0) { // L: 62
							var3 = 1; // L: 63
							break label70;
						}

						var8[var9] = var2; // L: 66
						++var9; // L: 67
						--var10; // L: 68
						break;
					}

					var8[var9] = var2; // L: 57
					--var3; // L: 58
					++var9; // L: 59
					--var10; // L: 60
				}
			}

			while (var4 != var12) { // L: 71
				var2 = (byte)var5; // L: 75
				var7 = var6[var7]; // L: 76
				byte var1 = (byte)var7; // L: 77
				var7 >>= 8; // L: 78
				++var4; // L: 79
				if (var1 != var5) { // L: 80
					var5 = var1; // L: 81
					if (var10 == 0) { // L: 82
						var3 = 1; // L: 83
						break label70; // L: 84
					}

					var8[var9] = var2; // L: 86
					++var9; // L: 87
					--var10; // L: 88
				} else {
					if (var4 != var12) { // L: 91
						var3 = 2; // L: 103
						var7 = var6[var7]; // L: 104
						var1 = (byte)var7; // L: 105
						var7 >>= 8; // L: 106
						++var4; // L: 107
						if (var4 != var12) { // L: 108
							if (var1 != var5) { // L: 109
								var5 = var1; // L: 110
							} else {
								var3 = 3; // L: 113
								var7 = var6[var7]; // L: 114
								var1 = (byte)var7; // L: 115
								var7 >>= 8; // L: 116
								++var4; // L: 117
								if (var4 != var12) { // L: 118
									if (var1 != var5) { // L: 119
										var5 = var1; // L: 120
									} else {
										var7 = var6[var7]; // L: 123
										var1 = (byte)var7; // L: 124
										var7 >>= 8; // L: 125
										++var4; // L: 126
										var3 = (var1 & 255) + 4; // L: 127
										var7 = var6[var7]; // L: 128
										var5 = (byte)var7; // L: 129
										var7 >>= 8; // L: 130
										++var4; // L: 131
									}
								}
							}
						}
						continue label70;
					}

					if (var10 == 0) { // L: 92
						var3 = 1; // L: 93
						break label70; // L: 94
					}

					var8[var9] = var2; // L: 96
					++var9; // L: 97
					--var10; // L: 98
				}
			}

			var3 = 0; // L: 72
			break; // L: 73
		}

		int var13 = var0.field3766; // L: 133
		var0.field3766 += var10 - var10; // L: 134
		if (var0.field3766 < var13) { // L: 135
		}

		var0.out_char = var2; // L: 136
		var0.su_rNToGo = var3; // L: 137
		var0.nblocks_used = var4; // L: 138
		var0.su_ch2 = var5; // L: 139
		class217.BZip2Decompressor_block = var6; // L: 140
		var0.field3761 = var7; // L: 141
		var0.outputArray = var8; // L: 142
		var0.next_out = var9; // L: 143
		var0.outputLength = var10; // L: 144
	} // L: 145

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llj;)V"
	)
	@Export("BZip2Decompressor_decompress")
	static void BZip2Decompressor_decompress(BZip2State var0) {
		boolean var4 = false; // L: 151
		boolean var5 = false; // L: 152
		boolean var6 = false; // L: 153
		boolean var7 = false; // L: 154
		boolean var8 = false; // L: 155
		boolean var9 = false; // L: 156
		boolean var10 = false; // L: 157
		boolean var11 = false; // L: 158
		boolean var12 = false; // L: 159
		boolean var13 = false; // L: 160
		boolean var14 = false; // L: 161
		boolean var15 = false; // L: 162
		boolean var16 = false; // L: 163
		boolean var17 = false; // L: 164
		boolean var18 = false; // L: 165
		boolean var19 = false; // L: 166
		boolean var20 = false; // L: 167
		boolean var21 = false; // L: 168
		int var22 = 0; // L: 169
		int[] var23 = null; // L: 170
		int[] var24 = null; // L: 171
		int[] var25 = null; // L: 172
		var0.blockSize100k = -1050833919; // L: 173
		if (class217.BZip2Decompressor_block == null) { // L: 174
			class217.BZip2Decompressor_block = new int[var0.blockSize100k * -599652704];
		}

		boolean var26 = true; // L: 175

		while (true) {
			while (var26) {
				byte var1 = BZip2Decompressor_readNextByte(var0); // L: 177
				if (var1 == 23) { // L: 178
					return;
				}

				var1 = BZip2Decompressor_readNextByte(var0); // L: 179
				var1 = BZip2Decompressor_readNextByte(var0); // L: 180
				var1 = BZip2Decompressor_readNextByte(var0); // L: 181
				var1 = BZip2Decompressor_readNextByte(var0); // L: 182
				var1 = BZip2Decompressor_readNextByte(var0); // L: 183
				var1 = BZip2Decompressor_readNextByte(var0); // L: 184
				var1 = BZip2Decompressor_readNextByte(var0); // L: 185
				var1 = BZip2Decompressor_readNextByte(var0); // L: 186
				var1 = BZip2Decompressor_readNextByte(var0); // L: 187
				var1 = BZip2Decompressor_readNextBit(var0); // L: 188
				if (var1 != 0) { // L: 189
				}

				var0.originalPointer = 0; // L: 191
				var1 = BZip2Decompressor_readNextByte(var0); // L: 192
				var0.originalPointer = var0.originalPointer << 8 | var1 & 255; // L: 193
				var1 = BZip2Decompressor_readNextByte(var0); // L: 194
				var0.originalPointer = var0.originalPointer << 8 | var1 & 255; // L: 195
				var1 = BZip2Decompressor_readNextByte(var0); // L: 196
				var0.originalPointer = var0.originalPointer << 8 | var1 & 255; // L: 197

				int var36;
				for (var36 = 0; var36 < 16; ++var36) { // L: 198
					var1 = BZip2Decompressor_readNextBit(var0); // L: 199
					if (var1 == 1) { // L: 200
						var0.inUse16[var36] = true;
					} else {
						var0.inUse16[var36] = false; // L: 201
					}
				}

				for (var36 = 0; var36 < 256; ++var36) { // L: 203
					var0.inUse[var36] = false;
				}

				int var37;
				for (var36 = 0; var36 < 16; ++var36) { // L: 204
					if (var0.inUse16[var36]) { // L: 205
						for (var37 = 0; var37 < 16; ++var37) { // L: 206
							var1 = BZip2Decompressor_readNextBit(var0); // L: 207
							if (var1 == 1) { // L: 208
								var0.inUse[var37 + var36 * 16] = true;
							}
						}
					}
				}

				makeMaps(var0); // L: 212
				int var39 = var0.nInUse + 2; // L: 213
				int var40 = BZip2Decompressor_readBits(3, var0); // L: 214
				int var41 = BZip2Decompressor_readBits(15, var0); // L: 215

				for (var36 = 0; var36 < var41; ++var36) { // L: 216
					var37 = 0; // L: 217

					while (true) {
						var1 = BZip2Decompressor_readNextBit(var0); // L: 219
						if (var1 == 0) { // L: 220
							var0.selectorMtf[var36] = (byte)var37; // L: 223
							break;
						}

						++var37; // L: 221
					}
				}

				byte[] var27 = new byte[6]; // L: 226

				byte var29;
				for (var29 = 0; var29 < var40; var27[var29] = var29++) { // L: 229
				}

				for (var36 = 0; var36 < var41; ++var36) { // L: 230
					var29 = var0.selectorMtf[var36]; // L: 231

					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) { // L: 232 233 235
						var27[var29] = var27[var29 - 1]; // L: 234
					}

					var27[0] = var28; // L: 237
					var0.selector[var36] = var28; // L: 238
				}

				int var38;
				for (var38 = 0; var38 < var40; ++var38) { // L: 241
					int var50 = BZip2Decompressor_readBits(5, var0); // L: 242

					for (var36 = 0; var36 < var39; ++var36) { // L: 243
						while (true) {
							var1 = BZip2Decompressor_readNextBit(var0); // L: 245
							if (var1 == 0) { // L: 246
								var0.temp_charArray2d[var38][var36] = (byte)var50; // L: 251
								break;
							}

							var1 = BZip2Decompressor_readNextBit(var0); // L: 247
							if (var1 == 0) { // L: 248
								++var50;
							} else {
								--var50; // L: 249
							}
						}
					}
				}

				for (var38 = 0; var38 < var40; ++var38) { // L: 254
					byte var2 = 32; // L: 255
					byte var3 = 0; // L: 256

					for (var36 = 0; var36 < var39; ++var36) { // L: 257
						if (var0.temp_charArray2d[var38][var36] > var3) { // L: 258
							var3 = var0.temp_charArray2d[var38][var36];
						}

						if (var0.temp_charArray2d[var38][var36] < var2) { // L: 259
							var2 = var0.temp_charArray2d[var38][var36];
						}
					}

					BZip2Decompressor_createHuffmanTables(var0.limit[var38], var0.base[var38], var0.perm[var38], var0.temp_charArray2d[var38], var2, var3, var39); // L: 261
					var0.minLens[var38] = var2; // L: 262
				}

				int var42 = var0.nInUse + 1; // L: 264
				int var43 = -1; // L: 265
				byte var44 = 0; // L: 266

				for (var36 = 0; var36 <= 255; ++var36) { // L: 267
					var0.unzftab[var36] = 0;
				}

				int var56 = 4095; // L: 272

				int var35;
				int var55;
				for (var35 = 15; var35 >= 0; --var35) { // L: 273
					for (var55 = 15; var55 >= 0; --var55) { // L: 274
						var0.ll8[var56] = (byte)(var55 + var35 * 16); // L: 275
						--var56; // L: 276
					}

					var0.getAndMoveToFrontDecode_yy[var35] = var56 + 1; // L: 278
				}

				int var47 = 0; // L: 281
				byte var54;
				if (var44 == 0) { // L: 282
					++var43; // L: 283
					var44 = 50; // L: 284
					var54 = var0.selector[var43]; // L: 285
					var22 = var0.minLens[var54]; // L: 286
					var23 = var0.limit[var54]; // L: 287
					var25 = var0.perm[var54]; // L: 288
					var24 = var0.base[var54]; // L: 289
				}

				int var45 = var44 - 1; // L: 291
				int var51 = var22; // L: 292

				int var52;
				byte var53;
				for (var52 = BZip2Decompressor_readBits(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) { // L: 293 295 298
					++var51; // L: 296
					var53 = BZip2Decompressor_readNextBit(var0); // L: 297
				}

				int var46 = var25[var52 - var24[var51]]; // L: 300

				while (true) {
					int[] var10000;
					int var10002;
					while (var46 != var42) { // L: 302
						if (var46 != 0 && var46 != 1) { // L: 303
							int var33 = var46 - 1; // L: 349
							int var30;
							if (var33 < 16) { // L: 350
								var30 = var0.getAndMoveToFrontDecode_yy[0]; // L: 351

								for (var1 = var0.ll8[var30 + var33]; var33 > 3; var33 -= 4) { // L: 352 353 359
									int var34 = var30 + var33; // L: 354
									var0.ll8[var34] = var0.ll8[var34 - 1]; // L: 355
									var0.ll8[var34 - 1] = var0.ll8[var34 - 2]; // L: 356
									var0.ll8[var34 - 2] = var0.ll8[var34 - 3]; // L: 357
									var0.ll8[var34 - 3] = var0.ll8[var34 - 4]; // L: 358
								}

								while (var33 > 0) { // L: 361
									var0.ll8[var30 + var33] = var0.ll8[var30 + var33 - 1]; // L: 362
									--var33; // L: 363
								}

								var0.ll8[var30] = var1; // L: 365
							} else {
								int var31 = var33 / 16; // L: 368
								int var32 = var33 % 16; // L: 369
								var30 = var0.getAndMoveToFrontDecode_yy[var31] + var32; // L: 370

								for (var1 = var0.ll8[var30]; var30 > var0.getAndMoveToFrontDecode_yy[var31]; --var30) { // L: 371 372 374
									var0.ll8[var30] = var0.ll8[var30 - 1]; // L: 373
								}

								for (var10002 = var0.getAndMoveToFrontDecode_yy[var31]++; var31 > 0; --var31) { // L: 376 377 380
									var10002 = var0.getAndMoveToFrontDecode_yy[var31]--; // L: 378
									var0.ll8[var0.getAndMoveToFrontDecode_yy[var31]] = var0.ll8[var0.getAndMoveToFrontDecode_yy[var31 - 1] + 16 - 1]; // L: 379
								}

								var10002 = var0.getAndMoveToFrontDecode_yy[0]--; // L: 382
								var0.ll8[var0.getAndMoveToFrontDecode_yy[0]] = var1; // L: 383
								if (var0.getAndMoveToFrontDecode_yy[0] == 0) { // L: 384
									var56 = 4095; // L: 385

									for (var35 = 15; var35 >= 0; --var35) { // L: 386
										for (var55 = 15; var55 >= 0; --var55) { // L: 387
											var0.ll8[var56] = var0.ll8[var0.getAndMoveToFrontDecode_yy[var35] + var55]; // L: 388
											--var56; // L: 389
										}

										var0.getAndMoveToFrontDecode_yy[var35] = var56 + 1; // L: 391
									}
								}
							}

							var10002 = var0.unzftab[var0.seqToUnseq[var1 & 255] & 255]++; // L: 396
							class217.BZip2Decompressor_block[var47] = var0.seqToUnseq[var1 & 255] & 255; // L: 397
							++var47; // L: 398
							if (var45 == 0) { // L: 399
								++var43; // L: 400
								var45 = 50; // L: 401
								var54 = var0.selector[var43]; // L: 402
								var22 = var0.minLens[var54]; // L: 403
								var23 = var0.limit[var54]; // L: 404
								var25 = var0.perm[var54]; // L: 405
								var24 = var0.base[var54]; // L: 406
							}

							--var45; // L: 408
							var51 = var22; // L: 409

							for (var52 = BZip2Decompressor_readBits(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) { // L: 410 412 415
								++var51; // L: 413
								var53 = BZip2Decompressor_readNextBit(var0); // L: 414
							}

							var46 = var25[var52 - var24[var51]]; // L: 417
						} else {
							int var48 = -1; // L: 304
							int var49 = 1; // L: 305

							do {
								if (var46 == 0) { // L: 307
									var48 += var49;
								} else if (var46 == 1) { // L: 308
									var48 += var49 * 2;
								}

								var49 *= 2; // L: 309
								if (var45 == 0) { // L: 310
									++var43; // L: 311
									var45 = 50; // L: 312
									var54 = var0.selector[var43]; // L: 313
									var22 = var0.minLens[var54]; // L: 314
									var23 = var0.limit[var54]; // L: 315
									var25 = var0.perm[var54]; // L: 316
									var24 = var0.base[var54]; // L: 317
								}

								--var45; // L: 319
								var51 = var22; // L: 320

								for (var52 = BZip2Decompressor_readBits(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) { // L: 321 323 326
									++var51; // L: 324
									var53 = BZip2Decompressor_readNextBit(var0); // L: 325
								}

								var46 = var25[var52 - var24[var51]]; // L: 328
							} while(var46 == 0 || var46 == 1); // L: 329

							++var48; // L: 330
							var1 = var0.seqToUnseq[var0.ll8[var0.getAndMoveToFrontDecode_yy[0]] & 255]; // L: 331
							var10000 = var0.unzftab; // L: 332

							for (var10000[var1 & 255] += var48; var48 > 0; --var48) { // L: 333 336
								class217.BZip2Decompressor_block[var47] = var1 & 255; // L: 334
								++var47; // L: 335
							}
						}
					}

					var0.su_rNToGo = 0; // L: 421
					var0.out_char = 0; // L: 422
					var0.cftab[0] = 0; // L: 423

					for (var36 = 1; var36 <= 256; ++var36) { // L: 424
						var0.cftab[var36] = var0.unzftab[var36 - 1];
					}

					for (var36 = 1; var36 <= 256; ++var36) { // L: 425
						var10000 = var0.cftab;
						var10000[var36] += var0.cftab[var36 - 1];
					}

					for (var36 = 0; var36 < var47; ++var36) { // L: 426
						var1 = (byte)(class217.BZip2Decompressor_block[var36] & 255); // L: 427
						var10000 = class217.BZip2Decompressor_block; // L: 428
						int var10001 = var0.cftab[var1 & 255];
						var10000[var10001] |= var36 << 8;
						var10002 = var0.cftab[var1 & 255]++; // L: 429
					}

					var0.field3761 = class217.BZip2Decompressor_block[var0.originalPointer] >> 8; // L: 431
					var0.nblocks_used = 0; // L: 432
					var0.field3761 = class217.BZip2Decompressor_block[var0.field3761]; // L: 433
					var0.su_ch2 = (byte)(var0.field3761 & 255); // L: 434
					var0.field3761 >>= 8; // L: 436
					++var0.nblocks_used; // L: 437
					var0.field3791 = var47; // L: 438
					method5912(var0); // L: 439
					if (var0.field3791 + 1 == var0.nblocks_used && var0.su_rNToGo == 0) { // L: 440
						var26 = true;
						break;
					}

					var26 = false; // L: 441
					break;
				}
			}

			return; // L: 443
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Llj;)B"
	)
	@Export("BZip2Decompressor_readNextByte")
	static byte BZip2Decompressor_readNextByte(BZip2State var0) {
		return (byte)BZip2Decompressor_readBits(8, var0); // L: 447
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Llj;)B"
	)
	@Export("BZip2Decompressor_readNextBit")
	static byte BZip2Decompressor_readNextBit(BZip2State var0) {
		return (byte)BZip2Decompressor_readBits(1, var0); // L: 451
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILlj;)I"
	)
	@Export("BZip2Decompressor_readBits")
	static int BZip2Decompressor_readBits(int var0, BZip2State var1) {
		while (var1.bsLive < var0) { // L: 456
			var1.bsBuff = var1.bsBuff << 8 | var1.inputArray[var1.nextByte] & 255; // L: 462
			var1.bsLive += 8; // L: 463
			++var1.nextByte; // L: 464
			++var1.nextBit_unused; // L: 465
			if (var1.nextBit_unused == 0) { // L: 466
			}
		}

		int var2 = var1.bsBuff >> var1.bsLive - var0 & (1 << var0) - 1; // L: 458
		var1.bsLive -= var0; // L: 459
		return var2; // L: 460
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llj;)V"
	)
	@Export("makeMaps")
	static void makeMaps(BZip2State var0) {
		var0.nInUse = 0; // L: 472

		for (int var1 = 0; var1 < 256; ++var1) { // L: 473
			if (var0.inUse[var1]) { // L: 474
				var0.seqToUnseq[var0.nInUse] = (byte)var1; // L: 475
				++var0.nInUse; // L: 476
			}
		}

	} // L: 479

	@ObfuscatedName("c")
	@Export("BZip2Decompressor_createHuffmanTables")
	static void BZip2Decompressor_createHuffmanTables(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0; // L: 486

		int var8;
		for (var8 = var4; var8 <= var5; ++var8) { // L: 487
			for (int var9 = 0; var9 < var6; ++var9) { // L: 488
				if (var8 == var3[var9]) { // L: 489
					var2[var7] = var9; // L: 490
					++var7; // L: 491
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) { // L: 495
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; ++var8) { // L: 496
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) { // L: 497
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) { // L: 498
			var0[var8] = 0;
		}

		int var10 = 0; // L: 499

		for (var8 = var4; var8 <= var5; ++var8) { // L: 500
			var10 += var1[var8 + 1] - var1[var8]; // L: 501
			var0[var8] = var10 - 1; // L: 502
			var10 <<= 1; // L: 503
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8) { // L: 505
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8]; // L: 506
		}

	} // L: 508
}
