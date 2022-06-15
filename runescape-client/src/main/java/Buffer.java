import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("i")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("t")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("w")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1883142675
	)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256]; // L: 16

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) { // L: 21
			int var4 = var1; // L: 22

			for (var2 = 0; var2 < 8; ++var2) { // L: 23
				if ((var4 & 1) == 1) { // L: 24
					var4 = var4 >>> 1 ^ -306674912;
				} else {
					var4 >>>= 1; // L: 25
				}
			}

			crc32Table[var1] = var4; // L: 27
		}

		crc64Table = new long[256]; // L: 31

		for (var2 = 0; var2 < 256; ++var2) { // L: 36
			long var0 = (long)var2; // L: 37

			for (int var3 = 0; var3 < 8; ++var3) { // L: 38
				if (1L == (var0 & 1L)) { // L: 39
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 40
				}
			}

			crc64Table[var2] = var0; // L: 42
		}

	} // L: 44

	public Buffer(int var1) {
		this.array = class292.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 61
		this.offset = 0; // L: 62
	} // L: 63

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 66
			class93.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 67
	} // L: 68

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "151339125"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1514673034"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 75
		this.array[++this.offset - 1] = (byte)var1; // L: 76
	} // L: 77

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "27"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 80
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 81
		this.array[++this.offset - 1] = (byte)var1; // L: 82
	} // L: 83

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1371008869"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 86
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 87
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 88
		this.array[++this.offset - 1] = (byte)var1; // L: 89
	} // L: 90

	@ObfuscatedName("be")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 98
	} // L: 99

	@ObfuscatedName("bz")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 107
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 108
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 109
	} // L: 110

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1418973998"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 113
	} // L: 114

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "115"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 121
		if (var2 >= 0) { // L: 122
			throw new IllegalArgumentException("");
		} else {
			this.offset += class165.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 123
			this.array[++this.offset - 1] = 0; // L: 124
		}
	} // L: 125

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1115427467"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 132
		if (var2 >= 0) { // L: 133
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 134
			this.offset += class165.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 135
			this.array[++this.offset - 1] = 0; // L: 136
		}
	} // L: 137

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "2028256801"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 142
		int var4 = 0; // L: 143

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 144
			char var12 = var1.charAt(var5); // L: 145
			if (var12 <= 127) { // L: 146
				++var4;
			} else if (var12 <= 2047) { // L: 147
				var4 += 2;
			} else {
				var4 += 3; // L: 148
			}
		}

		this.array[++this.offset - 1] = 0; // L: 153
		this.writeVarInt(var4); // L: 154
		var4 = this.offset * 1978245093; // L: 155
		byte[] var6 = this.array; // L: 157
		int var7 = this.offset; // L: 158
		int var8 = var1.length(); // L: 160
		int var9 = var7; // L: 161

		for (int var10 = 0; var10 < var8; ++var10) { // L: 162
			char var11 = var1.charAt(var10); // L: 163
			if (var11 <= 127) { // L: 164
				var6[var9++] = (byte)var11; // L: 165
			} else if (var11 <= 2047) { // L: 167
				var6[var9++] = (byte)(192 | var11 >> 6); // L: 168
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 169
			} else {
				var6[var9++] = (byte)(224 | var11 >> '\f'); // L: 172
				var6[var9++] = (byte)(128 | var11 >> 6 & 63); // L: 173
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 174
			}
		}

		var5 = var9 - var7; // L: 177
		this.offset = (var5 * 1978245093 + var4) * -1883142675; // L: 179
	} // L: 180

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "61"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 183
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 184

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-1400539464"
	)
	public void method7727(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 187
	} // L: 188

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-529420858"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 191
			throw new IllegalArgumentException(); // L: 192
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 194
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 195
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 196
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 197
		}
	} // L: 198

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "51"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 201
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 204
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 205
		} else {
			throw new IllegalArgumentException(); // L: 202
		}
	} // L: 206

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1130"
	)
	public void method7935(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 209
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 212
		} else {
			throw new IllegalArgumentException(); // L: 210
		}
	} // L: 213

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "70"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 216
			this.writeByte(var1); // L: 217
		} else if (var1 >= 0 && var1 < 32768) { // L: 220
			this.writeShort(var1 + 32768); // L: 221
		} else {
			throw new IllegalArgumentException(); // L: 224
		}
	} // L: 218 222

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1627850032"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 228
			if ((var1 & -16384) != 0) { // L: 229
				if ((var1 & -2097152) != 0) { // L: 230
					if ((var1 & -268435456) != 0) { // L: 231
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 232
				}

				this.writeByte(var1 >>> 14 | 128); // L: 234
			}

			this.writeByte(var1 >>> 7 | 128); // L: 236
		}

		this.writeByte(var1 & 127); // L: 238
	} // L: 239

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-201311106"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 242
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-71"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 246
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-46298821"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 250
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 251
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-249689915"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 255
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 256
		if (var1 > 32767) { // L: 257
			var1 -= 65536;
		}

		return var1; // L: 258
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 262
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 263
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-901053269"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 267
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 268
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2116235370"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 272
		long var3 = (long)this.readInt() & 4294967295L; // L: 273
		return (var1 << 32) + var3; // L: 274
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-50"
	)
	public float method7740() {
		return Float.intBitsToFloat(this.readInt()); // L: 278
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-538390978"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 282
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1745591116"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 286
			++this.offset; // L: 287
			return null; // L: 288
		} else {
			return this.readStringCp1252NullTerminated(); // L: 290
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "155229795"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 294

		while (this.array[++this.offset - 1] != 0) { // L: 295
		}

		int var2 = this.offset - var1 - 1; // L: 296
		return var2 == 0 ? "" : SceneTilePaint.decodeStringCp1252(this.array, var1, var2); // L: 297 298
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "6614"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 302
		if (var1 != 0) { // L: 303
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 304

			while (this.array[++this.offset - 1] != 0) { // L: 305
			}

			int var3 = this.offset - var2 - 1; // L: 306
			return var3 == 0 ? "" : SceneTilePaint.decodeStringCp1252(this.array, var2, var3); // L: 307 308
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "54"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 312
		if (var1 != 0) { // L: 313
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 314
			if (var2 + this.offset > this.array.length) { // L: 315
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 317
				int var5 = this.offset; // L: 318
				char[] var6 = new char[var2]; // L: 320
				int var7 = 0; // L: 321
				int var8 = var5; // L: 322

				int var11;
				for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) { // L: 323 324 355
					int var10 = var4[var8++] & 255; // L: 325
					if (var10 < 128) { // L: 327
						if (var10 == 0) { // L: 328
							var11 = 65533;
						} else {
							var11 = var10; // L: 329
						}
					} else if (var10 < 192) { // L: 331
						var11 = 65533;
					} else if (var10 < 224) { // L: 332
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 333
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 334
							if (var11 < 128) { // L: 335
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 337
						}
					} else if (var10 < 240) { // L: 339
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 340
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 341
							if (var11 < 2048) { // L: 342
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 344
						}
					} else if (var10 < 248) { // L: 346
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 347
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 348
							if (var11 >= 65536 && var11 <= 1114111) { // L: 349
								var11 = 65533; // L: 350
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 352
						}
					} else {
						var11 = 65533; // L: 354
					}
				}

				String var3 = new String(var6, 0, var7); // L: 357
				this.offset += var2; // L: 360
				return var3; // L: 361
			}
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-2142383702"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 365
		}

	} // L: 366

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 369
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 370 371
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2108856121"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 375
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 376 377
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2138528151"
	)
	public int method7749() {
		int var1 = this.array[this.offset] & 255; // L: 381
		return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - 32769; // L: 382 383
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	public int method7770() {
		int var1 = 0; // L: 387

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 388 389 391
			var1 += 32767; // L: 390
		}

		var1 += var2; // L: 393
		return var1; // L: 394
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1085782298"
	)
	public int method7715() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 398 399
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1323097871"
	)
	public int method7752() {
		if (this.array[this.offset] < 0) { // L: 403
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 404
			return var1 == 32767 ? -1 : var1; // L: 405
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "340244581"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 410

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 411 412 414
			var2 = (var2 | var1 & 127) << 7; // L: 413
		}

		return var2 | var1; // L: 416
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2025161944"
	)
	public int method7754() {
		int var2 = 0; // L: 421
		int var3 = 0; // L: 422

		int var1;
		do {
			var1 = this.readUnsignedByte(); // L: 424
			var2 |= (var1 & 127) << var3; // L: 425
			var3 += 7; // L: 426
		} while(var1 > 127); // L: 427

		return var2; // L: 428
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-479355866"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 432
		this.offset = 0; // L: 433

		for (int var3 = 0; var3 < var2; ++var3) { // L: 434
			int var4 = this.readInt(); // L: 435
			int var5 = this.readInt(); // L: 436
			int var6 = 0; // L: 437
			int var7 = -1640531527; // L: 438

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 439 440 443
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 441
				var6 += var7; // L: 442
			}

			this.offset -= 8; // L: 445
			this.writeInt(var4); // L: 446
			this.writeInt(var5); // L: 447
		}

	} // L: 449

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1150734409"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 452
		this.offset = 0; // L: 453

		for (int var3 = 0; var3 < var2; ++var3) { // L: 454
			int var4 = this.readInt(); // L: 455
			int var5 = this.readInt(); // L: 456
			int var6 = -957401312; // L: 457
			int var7 = -1640531527; // L: 458

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 459 460 463
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 461
				var6 -= var7; // L: 462
			}

			this.offset -= 8; // L: 465
			this.writeInt(var4); // L: 466
			this.writeInt(var5); // L: 467
		}

	} // L: 469

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-610547163"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 472
		this.offset = var2; // L: 473
		int var5 = (var3 - var2) / 8; // L: 474

		for (int var6 = 0; var6 < var5; ++var6) { // L: 475
			int var7 = this.readInt(); // L: 476
			int var8 = this.readInt(); // L: 477
			int var9 = 0; // L: 478
			int var10 = -1640531527; // L: 479

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 480 481 484
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 482
				var9 += var10; // L: 483
			}

			this.offset -= 8; // L: 486
			this.writeInt(var7); // L: 487
			this.writeInt(var8); // L: 488
		}

		this.offset = var4; // L: 490
	} // L: 491

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "271624033"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 494
		this.offset = var2; // L: 495
		int var5 = (var3 - var2) / 8; // L: 496

		for (int var6 = 0; var6 < var5; ++var6) { // L: 497
			int var7 = this.readInt(); // L: 498
			int var8 = this.readInt(); // L: 499
			int var9 = -957401312; // L: 500
			int var10 = -1640531527; // L: 501

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 502 503 506
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 504
				var9 -= var10; // L: 505
			}

			this.offset -= 8; // L: 508
			this.writeInt(var7); // L: 509
			this.writeInt(var8); // L: 510
		}

		this.offset = var4; // L: 512
	} // L: 513

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "2045732819"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 516
		this.offset = 0; // L: 517
		byte[] var4 = new byte[var3]; // L: 518
		this.readBytes(var4, 0, var3); // L: 519
		BigInteger var5 = new BigInteger(var4); // L: 520
		BigInteger var6 = var5.modPow(var1, var2); // L: 521
		byte[] var7 = var6.toByteArray(); // L: 522
		this.offset = 0; // L: 523
		this.writeShort(var7.length); // L: 524
		this.writeBytes(var7, 0, var7.length); // L: 525
	} // L: 526

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1915568779"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class93.method2404(this.array, var1, this.offset); // L: 529
		this.writeInt(var2); // L: 530
		return var2; // L: 531
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "822358683"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 535
		int var1 = class93.method2404(this.array, 0, this.offset); // L: 536
		int var2 = this.readInt(); // L: 537
		return var1 == var2; // L: 538
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "619719503"
	)
	public void method7762(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 543
	} // L: 544

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-473301254"
	)
	public void method7763(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 547
	} // L: 548

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "666329941"
	)
	public void method7764(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 551
	} // L: 552

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1632273244"
	)
	public int method7765() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 555
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1669846078"
	)
	public int method7766() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 559
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1192268151"
	)
	public int method7767() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 563
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1645158393"
	)
	public byte method7768() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 567
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1729941736"
	)
	public byte method7769() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 571
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "2111803583"
	)
	public byte method7952() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 575
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "9"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 579
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 580
	} // L: 581

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-13"
	)
	public void method7863(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 584
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 585
	} // L: 586

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "28"
	)
	public void method7929(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 589
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 590
	} // L: 591

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-62610324"
	)
	public int method7774() {
		this.offset += 2; // L: 594
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 595
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1993381368"
	)
	public int method7775() {
		this.offset += 2; // L: 599
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 600
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1071222046"
	)
	public int method7776() {
		this.offset += 2; // L: 604
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 605
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	public int method7777() {
		this.offset += 2; // L: 609
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 610
		if (var1 > 32767) { // L: 611
			var1 -= 65536;
		}

		return var1; // L: 612
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-123"
	)
	public int method7813() {
		this.offset += 2; // L: 616
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 617
		if (var1 > 32767) { // L: 618
			var1 -= 65536;
		}

		return var1; // L: 619
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "36"
	)
	public int method7779() {
		this.offset += 2; // L: 623
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 624
		if (var1 > 32767) { // L: 625
			var1 -= 65536;
		}

		return var1; // L: 626
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method7780() {
		this.offset += 3; // L: 630
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 631
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method7848() {
		this.offset += 3; // L: 635
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 636
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-9895"
	)
	public void method7760(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 640
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 641
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 642
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 643
	} // L: 644

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-408580075"
	)
	public void method7783(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 647
		this.array[++this.offset - 1] = (byte)var1; // L: 648
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 649
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 650
	} // L: 651

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-93"
	)
	public void method7784(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 654
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 655
		this.array[++this.offset - 1] = (byte)var1; // L: 656
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 657
	} // L: 658

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	public int method7785() {
		this.offset += 4; // L: 661
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 662
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2015577981"
	)
	public int method7786() {
		this.offset += 4; // L: 666
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 667
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1155925608"
	)
	public int method7787() {
		this.offset += 4; // L: 671
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 672
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-65"
	)
	public void method7828(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 676
		}

	} // L: 677
}
