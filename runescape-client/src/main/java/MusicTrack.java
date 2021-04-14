import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("MusicTrack")
public class MusicTrack extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("table")
	NodeHashTable table;
	@ObfuscatedName("o")
	@Export("midi")
	byte[] midi;

	@ObfuscatedSignature(
		descriptor = "(Lnu;)V"
	)
	MusicTrack(Buffer var1) {
		var1.offset = var1.array.length - 3; // L: 22
		int var2 = var1.readUnsignedByte(); // L: 23
		int var3 = var1.readUnsignedShort(); // L: 24
		int var4 = var2 * 10 + 14; // L: 25
		var1.offset = 0; // L: 26
		int var5 = 0; // L: 27
		int var6 = 0; // L: 28
		int var7 = 0; // L: 29
		int var8 = 0; // L: 30
		int var9 = 0; // L: 31
		int var10 = 0; // L: 32
		int var11 = 0; // L: 33
		int var12 = 0; // L: 34

		int var13;
		int var14;
		int var15;
		for (var13 = 0; var13 < var2; ++var13) { // L: 35
			var14 = -1; // L: 36

			while (true) {
				var15 = var1.readUnsignedByte(); // L: 38
				if (var15 != var14) { // L: 39
					++var4;
				}

				var14 = var15 & 15; // L: 40
				if (var15 == 7) { // L: 41
					break;
				}

				if (var15 == 23) { // L: 42
					++var5; // L: 43
				} else if (var14 == 0) { // L: 46
					++var7; // L: 47
				} else if (var14 == 1) { // L: 50
					++var8; // L: 51
				} else if (var14 == 2) { // L: 54
					++var6; // L: 55
				} else if (var14 == 3) { // L: 58
					++var9; // L: 59
				} else if (var14 == 4) { // L: 62
					++var10; // L: 63
				} else if (var14 == 5) { // L: 66
					++var11; // L: 67
				} else {
					if (var14 != 6) { // L: 70
						throw new RuntimeException(); // L: 74
					}

					++var12; // L: 71
				}
			}
		}

		var4 += var5 * 5; // L: 77
		var4 += (var7 + var8 + var6 + var9 + var11) * 2; // L: 78
		var4 = var4 + var10 + var12; // L: 79
		var13 = var1.offset; // L: 80
		var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12; // L: 81

		for (var15 = 0; var15 < var14; ++var15) { // L: 82
			var1.readVarInt();
		}

		var4 += var1.offset - var13; // L: 83
		var15 = var1.offset; // L: 84
		int var16 = 0; // L: 85
		int var17 = 0; // L: 86
		int var18 = 0; // L: 87
		int var19 = 0; // L: 88
		int var20 = 0; // L: 89
		int var21 = 0; // L: 90
		int var22 = 0; // L: 91
		int var23 = 0; // L: 92
		int var24 = 0; // L: 93
		int var25 = 0; // L: 94
		int var26 = 0; // L: 95
		int var27 = 0; // L: 96
		int var28 = 0; // L: 97

		int var29;
		for (var29 = 0; var29 < var6; ++var29) { // L: 98
			var28 = var28 + var1.readUnsignedByte() & 127; // L: 99
			if (var28 != 0 && var28 != 32) { // L: 100
				if (var28 == 1) { // L: 101
					++var16;
				} else if (var28 == 33) { // L: 102
					++var17;
				} else if (var28 == 7) { // L: 103
					++var18;
				} else if (var28 == 39) { // L: 104
					++var19;
				} else if (var28 == 10) { // L: 105
					++var20;
				} else if (var28 == 42) { // L: 106
					++var21;
				} else if (var28 == 99) { // L: 107
					++var22;
				} else if (var28 == 98) { // L: 108
					++var23;
				} else if (var28 == 101) { // L: 109
					++var24;
				} else if (var28 == 100) { // L: 110
					++var25;
				} else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) { // L: 111
					++var27; // L: 112
				} else {
					++var26;
				}
			} else {
				++var12;
			}
		}

		var29 = 0; // L: 114
		int var30 = var1.offset; // L: 115
		var1.offset += var26; // L: 116
		int var31 = var1.offset; // L: 117
		var1.offset += var11; // L: 118
		int var32 = var1.offset; // L: 119
		var1.offset += var10; // L: 120
		int var33 = var1.offset; // L: 121
		var1.offset += var9; // L: 122
		int var34 = var1.offset; // L: 123
		var1.offset += var16; // L: 124
		int var35 = var1.offset; // L: 125
		var1.offset += var18; // L: 126
		int var36 = var1.offset; // L: 127
		var1.offset += var20; // L: 128
		int var37 = var1.offset; // L: 129
		var1.offset += var7 + var8 + var11; // L: 130
		int var38 = var1.offset; // L: 131
		var1.offset += var7; // L: 132
		int var39 = var1.offset; // L: 133
		var1.offset += var27; // L: 134
		int var40 = var1.offset; // L: 135
		var1.offset += var8; // L: 136
		int var41 = var1.offset; // L: 137
		var1.offset += var17; // L: 138
		int var42 = var1.offset; // L: 139
		var1.offset += var19; // L: 140
		int var43 = var1.offset; // L: 141
		var1.offset += var21; // L: 142
		int var44 = var1.offset; // L: 143
		var1.offset += var12; // L: 144
		int var45 = var1.offset; // L: 145
		var1.offset += var9; // L: 146
		int var46 = var1.offset; // L: 147
		var1.offset += var22; // L: 148
		int var47 = var1.offset; // L: 149
		var1.offset += var23; // L: 150
		int var48 = var1.offset; // L: 151
		var1.offset += var24; // L: 152
		int var49 = var1.offset; // L: 153
		var1.offset += var25; // L: 154
		int var50 = var1.offset; // L: 155
		var1.offset += var5 * 3; // L: 156
		this.midi = new byte[var4]; // L: 157
		Buffer var51 = new Buffer(this.midi); // L: 158
		var51.writeInt(1297377380); // L: 159
		var51.writeInt(6); // L: 160
		var51.writeShort(var2 > 1 ? 1 : 0); // L: 161
		var51.writeShort(var2); // L: 162
		var51.writeShort(var3); // L: 163
		var1.offset = var13; // L: 164
		int var52 = 0; // L: 165
		int var53 = 0; // L: 166
		int var54 = 0; // L: 167
		int var55 = 0; // L: 168
		int var56 = 0; // L: 169
		int var57 = 0; // L: 170
		int var58 = 0; // L: 171
		int[] var59 = new int[128]; // L: 172
		var28 = 0; // L: 173

		label243:
		for (int var60 = 0; var60 < var2; ++var60) { // L: 174
			var51.writeInt(1297379947); // L: 175
			var51.offset += 4; // L: 176
			int var61 = var51.offset; // L: 177
			int var62 = -1; // L: 178

			while (true) {
				while (true) {
					int var63 = var1.readVarInt(); // L: 180
					var51.writeVarInt(var63); // L: 181
					int var64 = var1.array[var29++] & 255; // L: 182
					boolean var65 = var64 != var62; // L: 183
					var62 = var64 & 15; // L: 184
					if (var64 == 7) { // L: 185
						if (var65) { // L: 186
							var51.writeByte(255);
						}

						var51.writeByte(47); // L: 187
						var51.writeByte(0); // L: 188
						var51.writeLengthInt(var51.offset - var61); // L: 269
						continue label243;
					}

					if (var64 == 23) { // L: 191
						if (var65) { // L: 192
							var51.writeByte(255);
						}

						var51.writeByte(81); // L: 193
						var51.writeByte(3); // L: 194
						var51.writeByte(var1.array[var50++]); // L: 195
						var51.writeByte(var1.array[var50++]); // L: 196
						var51.writeByte(var1.array[var50++]); // L: 197
					} else {
						var52 ^= var64 >> 4; // L: 200
						if (var62 == 0) { // L: 201
							if (var65) { // L: 202
								var51.writeByte(var52 + 144);
							}

							var53 += var1.array[var37++]; // L: 203
							var54 += var1.array[var38++]; // L: 204
							var51.writeByte(var53 & 127); // L: 205
							var51.writeByte(var54 & 127); // L: 206
						} else if (var62 == 1) { // L: 209
							if (var65) { // L: 210
								var51.writeByte(var52 + 128);
							}

							var53 += var1.array[var37++]; // L: 211
							var55 += var1.array[var40++]; // L: 212
							var51.writeByte(var53 & 127); // L: 213
							var51.writeByte(var55 & 127); // L: 214
						} else if (var62 == 2) { // L: 217
							if (var65) { // L: 218
								var51.writeByte(var52 + 176);
							}

							var28 = var28 + var1.array[var15++] & 127; // L: 219
							var51.writeByte(var28); // L: 220
							byte var66;
							if (var28 != 0 && var28 != 32) { // L: 222
								if (var28 == 1) { // L: 223
									var66 = var1.array[var34++];
								} else if (var28 == 33) { // L: 224
									var66 = var1.array[var41++];
								} else if (var28 == 7) { // L: 225
									var66 = var1.array[var35++];
								} else if (var28 == 39) { // L: 226
									var66 = var1.array[var42++];
								} else if (var28 == 10) { // L: 227
									var66 = var1.array[var36++];
								} else if (var28 == 42) { // L: 228
									var66 = var1.array[var43++];
								} else if (var28 == 99) { // L: 229
									var66 = var1.array[var46++];
								} else if (var28 == 98) { // L: 230
									var66 = var1.array[var47++];
								} else if (var28 == 101) { // L: 231
									var66 = var1.array[var48++];
								} else if (var28 == 100) { // L: 232
									var66 = var1.array[var49++];
								} else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) { // L: 233
									var66 = var1.array[var39++]; // L: 234
								} else {
									var66 = var1.array[var30++];
								}
							} else {
								var66 = var1.array[var44++];
							}

							int var67 = var66 + var59[var28]; // L: 235
							var59[var28] = var67; // L: 236
							var51.writeByte(var67 & 127); // L: 237
						} else if (var62 == 3) { // L: 240
							if (var65) { // L: 241
								var51.writeByte(var52 + 224);
							}

							var56 += var1.array[var45++]; // L: 242
							var56 += var1.array[var33++] << 7; // L: 243
							var51.writeByte(var56 & 127); // L: 244
							var51.writeByte(var56 >> 7 & 127); // L: 245
						} else if (var62 == 4) { // L: 248
							if (var65) { // L: 249
								var51.writeByte(var52 + 208);
							}

							var57 += var1.array[var32++]; // L: 250
							var51.writeByte(var57 & 127); // L: 251
						} else if (var62 == 5) { // L: 254
							if (var65) { // L: 255
								var51.writeByte(var52 + 160);
							}

							var53 += var1.array[var37++]; // L: 256
							var58 += var1.array[var31++]; // L: 257
							var51.writeByte(var53 & 127); // L: 258
							var51.writeByte(var58 & 127); // L: 259
						} else {
							if (var62 != 6) { // L: 262
								throw new RuntimeException(); // L: 267
							}

							if (var65) { // L: 263
								var51.writeByte(var52 + 192);
							}

							var51.writeByte(var1.array[var44++]); // L: 264
						}
					}
				}
			}
		}

	} // L: 271

	@ObfuscatedName("o")
	void method4154() {
		if (this.table == null) { // L: 274
			this.table = new NodeHashTable(16); // L: 275
			int[] var1 = new int[16]; // L: 276
			int[] var2 = new int[16]; // L: 277
			var2[9] = 128; // L: 279
			var1[9] = 128; // L: 280
			MidiFileReader var4 = new MidiFileReader(this.midi); // L: 281
			int var5 = var4.trackCount(); // L: 282

			int var6;
			for (var6 = 0; var6 < var5; ++var6) { // L: 283
				var4.gotoTrack(var6); // L: 284
				var4.readTrackLength(var6); // L: 285
				var4.markTrackPosition(var6); // L: 286
			}

			label56:
			do {
				while (true) {
					var6 = var4.getPrioritizedTrack(); // L: 289
					int var7 = var4.trackLengths[var6]; // L: 290

					while (var7 == var4.trackLengths[var6]) { // L: 291
						var4.gotoTrack(var6); // L: 292
						int var8 = var4.readMessage(var6); // L: 293
						if (var8 == 1) { // L: 294
							var4.setTrackDone(); // L: 295
							var4.markTrackPosition(var6); // L: 296
							continue label56;
						}

						int var9 = var8 & 240; // L: 300
						int var10;
						int var11;
						int var12;
						if (var9 == 176) { // L: 301
							var10 = var8 & 15; // L: 302
							var11 = var8 >> 8 & 127; // L: 303
							var12 = var8 >> 16 & 127; // L: 304
							if (var11 == 0) { // L: 305
								var1[var10] = (var12 << 14) + (var1[var10] & -2080769);
							}

							if (var11 == 32) { // L: 306
								var1[var10] = (var1[var10] & -16257) + (var12 << 7);
							}
						}

						if (var9 == 192) { // L: 308
							var10 = var8 & 15; // L: 309
							var11 = var8 >> 8 & 127; // L: 310
							var2[var10] = var11 + var1[var10]; // L: 311
						}

						if (var9 == 144) { // L: 313
							var10 = var8 & 15; // L: 314
							var11 = var8 >> 8 & 127; // L: 315
							var12 = var8 >> 16 & 127; // L: 316
							if (var12 > 0) { // L: 317
								int var13 = var2[var10]; // L: 318
								ByteArrayNode var14 = (ByteArrayNode)this.table.get((long)var13); // L: 319
								if (var14 == null) { // L: 320
									var14 = new ByteArrayNode(new byte[128]); // L: 321
									this.table.put(var14, (long)var13); // L: 322
								}

								var14.byteArray[var11] = 1; // L: 324
							}
						}

						var4.readTrackLength(var6); // L: 327
						var4.markTrackPosition(var6); // L: 328
					}
				}
			} while(!var4.isDone()); // L: 297

		}
	} // L: 331

	@ObfuscatedName("u")
	@Export("clear")
	void clear() {
		this.table = null; // L: 334
	} // L: 335

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;II)Lho;"
	)
	@Export("readTrack")
	public static MusicTrack readTrack(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 16
		return var3 == null ? null : new MusicTrack(new Buffer(var3)); // L: 17
	}
}
