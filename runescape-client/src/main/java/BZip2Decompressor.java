import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("BZip2Decompressor")
public final class BZip2Decompressor {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgt;"
	)
	@Export("BZip2Decompressor_state")
	static BZip2State BZip2Decompressor_state;

	@ObfuscatedName("m")
	@Export("BZip2Decompressor_decompress")
	public static int BZip2Decompressor_decompress(byte[] outArray, int outLength, byte[] inArray, int inLength, int var4) {
		BZip2State var5 = BZip2Decompressor_state;
		synchronized(BZip2Decompressor_state) {
			BZip2Decompressor_state.inputArray = inArray;
			BZip2Decompressor_state.nextByte = var4;
			BZip2Decompressor_state.outputArray = outArray;
			BZip2Decompressor_state.next_out = 0;
			BZip2Decompressor_state.outputLength = outLength;
			BZip2Decompressor_state.bsLive = 0;
			BZip2Decompressor_state.bsBuff = 0;
			BZip2Decompressor_state.nextBit_unused = 0;
			BZip2Decompressor_state.field68 = 0;
			BZip2Decompressor_decompress(BZip2Decompressor_state);
			outLength -= BZip2Decompressor_state.outputLength;
			BZip2Decompressor_state.inputArray = null;
			BZip2Decompressor_state.outputArray = null;
			return outLength;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lgt;)V"
	)
	static void method3705(BZip2State var0) {
		byte field69 = var0.out_char;
		int var2 = var0.su_rNToGo;
		int f78 = var0.nblocks_used;
		int f76 = var0.su_ch2;
		int[] block = WorldMapSection0.BZip2Decompressor_block;
		int f75 = var0.field75;
		byte[] outA = var0.outputArray;
		int f66 = var0.next_out;
		int outLength = var0.outputLength;
		int f93 = var0.groupPos + 1;

		label65:
		while (true) {
			if (var2 > 0) {
				while (true) {
					if (outLength == 0) {
						break label65;
					}

					if (var2 == 1) {
						if (outLength == 0) {
							var2 = 1;
							break label65;
						}

						outA[f66] = field69;
						++f66;
						--outLength;
						break;
					}

					outA[f66] = field69;
					--var2;
					++f66;
					--outLength;
				}
			}

			boolean var11 = true;

			byte var12;
			while (var11) {
				var11 = false;
				if (f78 == f93) {
					var2 = 0;
					break label65;
				}

				field69 = (byte)f76;
				f75 = block[f75];
				var12 = (byte)(f75 & 255);
				f75 >>= 8;
				++f78;
				if (var12 != f76) {
					f76 = var12;
					if (outLength == 0) {
						var2 = 1;
						break label65;
					}

					outA[f66] = field69;
					++f66;
					--outLength;
					var11 = true;
				} else if (f78 == f93) {
					if (outLength == 0) {
						var2 = 1;
						break label65;
					}

					outA[f66] = field69;
					++f66;
					--outLength;
					var11 = true;
				}
			}

			var2 = 2;
			f75 = block[f75];
			var12 = (byte)(f75 & 255);
			f75 >>= 8;
			++f78;
			if (f78 != f93) {
				if (var12 != f76) {
					f76 = var12;
				} else {
					var2 = 3;
					f75 = block[f75];
					var12 = (byte)(f75 & 255);
					f75 >>= 8;
					++f78;
					if (f78 != f93) {
						if (var12 != f76) {
							f76 = var12;
						} else {
							f75 = block[f75];
							var12 = (byte)(f75 & 255);
							f75 >>= 8;
							++f78;
							var2 = (var12 & 255) + 4;
							f75 = block[f75];
							f76 = (byte)(f75 & 255);
							f75 >>= 8;
							++f78;
						}
					}
				}
			}
		}

		int var13 = var0.field68;
		var0.field68 += outLength - outLength;
		if (var0.field68 < var13) {
		}

		var0.out_char = field69;
		var0.su_rNToGo = var2;
		var0.nblocks_used = f78;
		var0.su_ch2 = f76;
		WorldMapSection0.BZip2Decompressor_block = block;
		var0.field75 = f75;
		var0.outputArray = outA;
		var0.next_out = f66;
		var0.outputLength = outLength;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lgt;)V"
	)
	@Export("BZip2Decompressor_decompress")
	static void BZip2Decompressor_decompress(BZip2State state) {
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		int var19 = 0;
		int[] var20 = null;
		int[] var21 = null;
		int[] var22 = null;
		state.blockSize100k = 1;
		if (WorldMapSection0.BZip2Decompressor_block == null) {
			WorldMapSection0.BZip2Decompressor_block = new int[state.blockSize100k * 100000];
		}

		boolean var23 = true;

		while (true) {
			while (var23) {
				byte var24 = BZip2Decompressor_readNextByte(state);
				if (var24 == 0x17) {
					return;
				}

				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextByte(state);
				var24 = BZip2Decompressor_readNextBit(state);
				if (var24 != 0) {
				}

				state.originalPointer = 0;
				var24 = BZip2Decompressor_readNextByte(state);
				state.originalPointer = state.originalPointer << 8 | var24 & 255;
				var24 = BZip2Decompressor_readNextByte(state);
				state.originalPointer = state.originalPointer << 8 | var24 & 255;
				var24 = BZip2Decompressor_readNextByte(state);
				state.originalPointer = state.originalPointer << 8 | var24 & 255;

				int var25;
				for (var25 = 0; var25 < 16; ++var25) {
					var24 = BZip2Decompressor_readNextBit(state);
					if (var24 == 1) {
						state.inUse16[var25] = true;
					} else {
						state.inUse16[var25] = false;
					}
				}

				for (var25 = 0; var25 < 256; ++var25) {
					state.inUse[var25] = false;
				}

				int var26;
				for (var25 = 0; var25 < 16; ++var25) {
					if (state.inUse16[var25]) {
						for (var26 = 0; var26 < 16; ++var26) {
							var24 = BZip2Decompressor_readNextBit(state);
							if (var24 == 1) {
								state.inUse[var26 + var25 * 16] = true;
							}
						}
					}
				}

				makeMaps(state);
				int var27 = state.nInUse + 2;
				int var28 = BZip2Decompressor_readBits(3, state);
				int var29 = BZip2Decompressor_readBits(15, state);

				for (var25 = 0; var25 < var29; ++var25) {
					var26 = 0;

					while (true) {
						var24 = BZip2Decompressor_readNextBit(state);
						if (var24 == 0) {
							state.selectorMtf[var25] = (byte)var26;
							break;
						}

						++var26;
					}
				}

				byte[] var30 = new byte[6];

				byte var31;
				for (var31 = 0; var31 < var28; var30[var31] = var31++) {
				}

				for (var25 = 0; var25 < var29; ++var25) {
					var31 = state.selectorMtf[var25];

					byte var32;
					for (var32 = var30[var31]; var31 > 0; --var31) {
						var30[var31] = var30[var31 - 1];
					}

					var30[0] = var32;
					state.selector[var25] = var32;
				}

				int var33;
				int var52;
				for (var33 = 0; var33 < var28; ++var33) {
					var52 = BZip2Decompressor_readBits(5, state);

					for (var25 = 0; var25 < var27; ++var25) {
						while (true) {
							var24 = BZip2Decompressor_readNextBit(state);
							if (var24 == 0) {
								state.temp_charArray2d[var33][var25] = (byte)var52;
								break;
							}

							var24 = BZip2Decompressor_readNextBit(state);
							if (var24 == 0) {
								++var52;
							} else {
								--var52;
							}
						}
					}
				}

				for (var33 = 0; var33 < var28; ++var33) {
					byte var34 = 32;
					byte var35 = 0;

					for (var25 = 0; var25 < var27; ++var25) {
						if (state.temp_charArray2d[var33][var25] > var35) {
							var35 = state.temp_charArray2d[var33][var25];
						}

						if (state.temp_charArray2d[var33][var25] < var34) {
							var34 = state.temp_charArray2d[var33][var25];
						}
					}

					BZip2Decompressor_createHuffmanTables(state.limit[var33], state.base[var33], state.perm[var33], state.temp_charArray2d[var33], var34, var35, var27);
					state.minLens[var33] = var34;
				}

				var52 = state.nInUse + 1;
				int var53 = -1;
				byte var54 = 0;

				for (var25 = 0; var25 <= 255; ++var25) {
					state.unzftab[var25] = 0;
				}

				int var36 = 4095;

				int var37;
				int var38;
				for (var37 = 15; var37 >= 0; --var37) {
					for (var38 = 15; var38 >= 0; --var38) {
						state.ll8[var36] = (byte)(var38 + var37 * 16);
						--var36;
					}

					state.getAndMoveToFrontDecode_yy[var37] = var36 + 1;
				}

				int var39 = 0;
				byte var40;
				if (var54 == 0) {
					++var53;
					var54 = 50;
					var40 = state.selector[var53];
					var19 = state.minLens[var40];
					var20 = state.limit[var40];
					var22 = state.perm[var40];
					var21 = state.base[var40];
				}

				int groupPos = var54 - 1;
				int zn = var19;

				int var43;
				byte var44;
				for (var43 = BZip2Decompressor_readBits(var19, state); var43 > var20[zn]; var43 = var43 << 1 | var44) {
					++zn;
					var44 = BZip2Decompressor_readNextBit(state);
				}

				int nextSym = var22[var43 - var21[zn]];

				while (true) {
					int[] var46;
					int s;
					while (nextSym != var52) {
						int n;
						if (nextSym != 0 && nextSym != 1) {
							s = nextSym - 1;
							int var10003;
							int var50;
							if (s < 16) {
								n = state.getAndMoveToFrontDecode_yy[0];

								for (var24 = state.ll8[n + s]; s > 3; s -= 4) {
									var50 = n + s;
									state.ll8[var50] = state.ll8[var50 - 1];
									state.ll8[var50 - 1] = state.ll8[var50 - 2];
									state.ll8[var50 - 2] = state.ll8[var50 - 3];
									state.ll8[var50 - 3] = state.ll8[var50 - 4];
								}

								while (s > 0) {
									state.ll8[n + s] = state.ll8[n + s - 1];
									--s;
								}

								state.ll8[n] = var24;
							} else {
								var50 = s / 16;
								int var51 = s % 16;
								n = state.getAndMoveToFrontDecode_yy[var50] + var51;

								for (var24 = state.ll8[n]; n > state.getAndMoveToFrontDecode_yy[var50]; --n) {
									state.ll8[n] = state.ll8[n - 1];
								}

								for (var10003 = state.getAndMoveToFrontDecode_yy[var50]++; var50 > 0; --var50) {
									var10003 = state.getAndMoveToFrontDecode_yy[var50]--;
									state.ll8[state.getAndMoveToFrontDecode_yy[var50]] = state.ll8[state.getAndMoveToFrontDecode_yy[var50 - 1] + 16 - 1];
								}

								var10003 = state.getAndMoveToFrontDecode_yy[0]--;
								state.ll8[state.getAndMoveToFrontDecode_yy[0]] = var24;
								if (state.getAndMoveToFrontDecode_yy[0] == 0) {
									var36 = 4095;

									for (var37 = 15; var37 >= 0; --var37) {
										for (var38 = 15; var38 >= 0; --var38) {
											state.ll8[var36] = state.ll8[state.getAndMoveToFrontDecode_yy[var37] + var38];
											--var36;
										}

										state.getAndMoveToFrontDecode_yy[var37] = var36 + 1;
									}
								}
							}

							var10003 = state.unzftab[state.seqToUnseq[var24 & 255] & 255]++;
							WorldMapSection0.BZip2Decompressor_block[var39] = state.seqToUnseq[var24 & 255] & 255;
							++var39;
							if (groupPos == 0) {
								++var53;
								groupPos = 50;
								var40 = state.selector[var53];
								var19 = state.minLens[var40];
								var20 = state.limit[var40];
								var22 = state.perm[var40];
								var21 = state.base[var40];
							}

							--groupPos;
							zn = var19;

							for (var43 = BZip2Decompressor_readBits(var19, state); var43 > var20[zn]; var43 = var43 << 1 | var44) {
								++zn;
								var44 = BZip2Decompressor_readNextBit(state);
							}

							nextSym = var22[var43 - var21[zn]];
						} else {
							s = -1;
							n = 1;

							do {
								if (nextSym == 0) {
									s += n;
								} else if (nextSym == 1) {
									s += n * 2;
								}

								n *= 2;
								if (groupPos == 0) {
									++var53;
									groupPos = 50;
									var40 = state.selector[var53];
									var19 = state.minLens[var40];
									var20 = state.limit[var40];
									var22 = state.perm[var40];
									var21 = state.base[var40];
								}

								--groupPos;
								zn = var19;

								for (var43 = BZip2Decompressor_readBits(var19, state); var43 > var20[zn]; var43 = var43 << 1 | var44) {
									++zn;
									var44 = BZip2Decompressor_readNextBit(state);
								}

								nextSym = var22[var43 - var21[zn]];
							} while(nextSym == 0 || nextSym == 1);

							++s;
							var24 = state.seqToUnseq[state.ll8[state.getAndMoveToFrontDecode_yy[0]] & 255];
							var46 = state.unzftab;

							for (var46[var24 & 255] += s; s > 0; --s) {
								WorldMapSection0.BZip2Decompressor_block[var39] = var24 & 255;
								++var39;
							}
						}
					}

					state.su_rNToGo = 0;
					state.out_char = 0;
					state.cftab[0] = 0;

					for (var25 = 1; var25 <= 256; ++var25) {
						state.cftab[var25] = state.unzftab[var25 - 1];
					}

					for (var25 = 1; var25 <= 256; ++var25) {
						var46 = state.cftab;
						var46[var25] += state.cftab[var25 - 1];
					}

					for (var25 = 0; var25 < var39; ++var25) {
						var24 = (byte)(WorldMapSection0.BZip2Decompressor_block[var25] & 255);
						var46 = WorldMapSection0.BZip2Decompressor_block;
						s = state.cftab[var24 & 255];
						var46[s] |= var25 << 8;
						++state.cftab[var24 & 255];
					}

					state.field75 = WorldMapSection0.BZip2Decompressor_block[state.originalPointer] >> 8;
					state.nblocks_used = 0;
					state.field75 = WorldMapSection0.BZip2Decompressor_block[state.field75];
					state.su_ch2 = (byte)(state.field75 & 255);
					state.field75 >>= 8;
					++state.nblocks_used;
					state.groupPos = var39;
					method3705(state);
					if (state.groupPos + 1 == state.nblocks_used && state.su_rNToGo == 0) {
						var23 = true;
						break;
					}

					var23 = false;
					break;
				}
			}

			return;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Lgt;)B"
	)
	@Export("BZip2Decompressor_readNextByte")
	static byte BZip2Decompressor_readNextByte(BZip2State state) {
		return (byte) BZip2Decompressor_readBits(8, state);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lgt;)B"
	)
	@Export("BZip2Decompressor_readNextBit")
	static byte BZip2Decompressor_readNextBit(BZip2State state) {
		return (byte) BZip2Decompressor_readBits(1, state);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ILgt;)I"
	)
	@Export("BZip2Decompressor_readBits")
	static int BZip2Decompressor_readBits(int bits, BZip2State state) {
		while (state.bsLive < bits) {
			state.bsBuff = state.bsBuff << 8 | state.inputArray[state.nextByte] & 255;
			state.bsLive += 8;
			++state.nextByte;
			++state.nextBit_unused;
			if (state.nextBit_unused == 0) {
			}
		}

		int var2 = state.bsBuff >> state.bsLive - bits & (1 << bits) - 1;
		state.bsLive -= bits;
		return var2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lgt;)V"
	)
	@Export("makeMaps")
	static void makeMaps(BZip2State state) {
		state.nInUse = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (state.inUse[var1]) {
				state.seqToUnseq[state.nInUse] = (byte)var1;
				++state.nInUse;
			}
		}

	}

	@ObfuscatedName("l")
	@Export("BZip2Decompressor_createHuffmanTables")
	static void BZip2Decompressor_createHuffmanTables(int[] limit, int[] base, int[] perm, byte[] length, int minLen, int maxLen, int alphaSize) {
		int var7 = 0;

		int var8;
		int var9;
		for (var8 = minLen; var8 <= maxLen; ++var8) {
			for (var9 = 0; var9 < alphaSize; ++var9) {
				if (var8 == length[var9]) {
					perm[var7] = var9;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) {
			base[var8] = 0;
		}

		for (var8 = 0; var8 < alphaSize; ++var8) {
			++base[length[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) {
			base[var8] += base[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) {
			limit[var8] = 0;
		}

		var9 = 0;

		for (var8 = minLen; var8 <= maxLen; ++var8) {
			var9 += base[var8 + 1] - base[var8];
			limit[var8] = var9 - 1;
			var9 <<= 1;
		}

		for (var8 = minLen + 1; var8 <= maxLen; ++var8) {
			base[var8] = (limit[var8 - 1] + 1 << 1) - base[var8];
		}

	}

	static {
		BZip2Decompressor_state = new BZip2State();
	}
}
