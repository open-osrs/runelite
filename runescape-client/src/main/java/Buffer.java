import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("b")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("s")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("j")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -442398587
	)
	@Export("offset")
	public int offset;

	static {
		crc32Table = new int[256]; // L: 14

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) { // L: 19
			int var4 = var1; // L: 20

			for (var2 = 0; var2 < 8; ++var2) { // L: 21
				if ((var4 & 1) == 1) { // L: 22
					var4 = var4 >>> 1 ^ -306674912;
				} else {
					var4 >>>= 1; // L: 23
				}
			}

			crc32Table[var1] = var4; // L: 25
		}

		crc64Table = new long[256]; // L: 29

		for (var2 = 0; var2 < 256; ++var2) { // L: 34
			long var0 = (long)var2; // L: 35

			for (int var3 = 0; var3 < 8; ++var3) { // L: 36
				if (1L == (var0 & 1L)) { // L: 37
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 38
				}
			}

			crc64Table[var2] = var0; // L: 40
		}

	} // L: 42

	public Buffer(int var1) {
		this.array = class5.ByteArrayPool_getArray(var1); // L: 54
		this.offset = 0; // L: 55
	} // L: 56

	public Buffer(byte[] var1) {
		this.array = var1; // L: 59
		this.offset = 0; // L: 60
	} // L: 61

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 64
			ItemLayer.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 65
	} // L: 66

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "303066737"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 69
	} // L: 70

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1826329058"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 73
		this.array[++this.offset - 1] = (byte)var1; // L: 74
	} // L: 75

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1756916961"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 78
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1017867447"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 85
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 86
		this.array[++this.offset - 1] = (byte)var1; // L: 87
	} // L: 88

	@ObfuscatedName("am")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 91
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 92
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 96
	} // L: 97

	@ObfuscatedName("az")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 100
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 101
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 102
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 103
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 107
	} // L: 108

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-16479"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 111
	} // L: 112

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-427478981"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 119
		if (var2 >= 0) { // L: 120
			throw new IllegalArgumentException("");
		} else {
			this.offset += Player.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 121
			this.array[++this.offset - 1] = 0; // L: 122
		}
	} // L: 123

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-39"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 130
		if (var2 >= 0) { // L: 131
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 132
			this.offset += Player.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 133
			this.array[++this.offset - 1] = 0; // L: 134
		}
	} // L: 135

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "499802318"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 140
		int var4 = 0; // L: 141

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 142
			char var12 = var1.charAt(var5); // L: 143
			if (var12 <= 127) { // L: 144
				++var4;
			} else if (var12 <= 2047) { // L: 145
				var4 += 2;
			} else {
				var4 += 3; // L: 146
			}
		}

		this.array[++this.offset - 1] = 0; // L: 151
		this.writeVarInt(var4); // L: 152
		var4 = this.offset * -1025691571; // L: 153
		byte[] var6 = this.array; // L: 155
		int var7 = this.offset; // L: 156
		int var8 = var1.length(); // L: 158
		int var9 = var7; // L: 159

		for (int var10 = 0; var10 < var8; ++var10) { // L: 160
			char var11 = var1.charAt(var10); // L: 161
			if (var11 <= 127) { // L: 162
				var6[var9++] = (byte)var11; // L: 163
			} else if (var11 <= 2047) { // L: 165
				var6[var9++] = (byte)(192 | var11 >> 6); // L: 166
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 167
			} else {
				var6[var9++] = (byte)(224 | var11 >> '\f'); // L: 170
				var6[var9++] = (byte)(128 | var11 >> 6 & 63); // L: 171
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 172
			}
		}

		var5 = var9 - var7; // L: 175
		this.offset = (var4 + var5 * -1025691571) * -442398587; // L: 177
	} // L: 178

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1890718426"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4]; // L: 181
		}

	} // L: 182

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "8"
	)
	public void method6768(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 185
	} // L: 186

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-665940595"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 189
			throw new IllegalArgumentException(); // L: 190
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 192
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 193
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 194
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 195
		}
	} // L: 196

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 199
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 202
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 203
		} else {
			throw new IllegalArgumentException(); // L: 200
		}
	} // L: 204

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-576610400"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 207
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 210
		} else {
			throw new IllegalArgumentException(); // L: 208
		}
	} // L: 211

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1514054821"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 214
			this.writeByte(var1); // L: 215
		} else if (var1 >= 0 && var1 < 32768) { // L: 218
			this.writeShort(var1 + 32768); // L: 219
		} else {
			throw new IllegalArgumentException(); // L: 222
		}
	} // L: 216 220

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2063951954"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 226
			if ((var1 & -16384) != 0) { // L: 227
				if ((var1 & -2097152) != 0) { // L: 228
					if ((var1 & -268435456) != 0) { // L: 229
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 230
				}

				this.writeByte(var1 >>> 14 | 128); // L: 232
			}

			this.writeByte(var1 >>> 7 | 128); // L: 234
		}

		this.writeByte(var1 & 127); // L: 236
	} // L: 237

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-236245275"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 240
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-17"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 244
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-37"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 248
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 249
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1542485131"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 253
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 254
		if (var1 > 32767) { // L: 255
			var1 -= 65536;
		}

		return var1; // L: 256
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-108"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 260
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 261
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-62"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 265
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 266
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1938103618"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 270
		long var3 = (long)this.readInt() & 4294967295L; // L: 271
		return (var1 << 32) + var3; // L: 272
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "788058203"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 276
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-189323230"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 280
			++this.offset; // L: 281
			return null; // L: 282
		} else {
			return this.readStringCp1252NullTerminated(); // L: 284
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-391631059"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 288

		while (this.array[++this.offset - 1] != 0) { // L: 289
		}

		int var2 = this.offset - var1 - 1; // L: 290
		return var2 == 0 ? "" : class43.decodeStringCp1252(this.array, var1, var2); // L: 291 292
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "100"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 296
		if (var1 != 0) { // L: 297
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 298

			while (this.array[++this.offset - 1] != 0) { // L: 299
			}

			int var3 = this.offset - var2 - 1; // L: 300
			return var3 == 0 ? "" : class43.decodeStringCp1252(this.array, var2, var3); // L: 301 302
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "41"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 306
		if (var1 != 0) { // L: 307
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 308
			if (var2 + this.offset > this.array.length) { // L: 309
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 311
				int var5 = this.offset; // L: 312
				char[] var6 = new char[var2]; // L: 314
				int var7 = 0; // L: 315
				int var8 = var5; // L: 316

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 317 318 349
					int var10 = var4[var8++] & 255; // L: 319
					if (var10 < 128) { // L: 321
						if (var10 == 0) { // L: 322
							var11 = 65533;
						} else {
							var11 = var10; // L: 323
						}
					} else if (var10 < 192) { // L: 325
						var11 = 65533;
					} else if (var10 < 224) { // L: 326
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 327
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 328
							if (var11 < 128) { // L: 329
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 331
						}
					} else if (var10 < 240) { // L: 333
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 334
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 335
							if (var11 < 2048) { // L: 336
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 338
						}
					} else if (var10 < 248) { // L: 340
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 341
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 342
							if (var11 >= 65536 && var11 <= 1114111) { // L: 343
								var11 = 65533; // L: 344
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 346
						}
					} else {
						var11 = 65533; // L: 348
					}
				}

				String var3 = new String(var6, 0, var7); // L: 351
				this.offset += var2; // L: 354
				return var3; // L: 355
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1260377098"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 359
		}

	} // L: 360

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "88"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 363
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 364 365
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 369
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 370 371
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1225252005"
	)
	public int method6560() {
		int var1 = 0; // L: 375

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 376 377 379
			var1 += 32767; // L: 378
		}

		var1 += var2; // L: 381
		return var1; // L: 382
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1043655096"
	)
	public int method6569() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 386 387
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1957977001"
	)
	public int method6583() {
		if (this.array[this.offset] < 0) { // L: 391
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 392
			return var1 == 32767 ? -1 : var1; // L: 393
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-70655510"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 398

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 399 400 402
			var2 = (var2 | var1 & 127) << 7; // L: 401
		}

		return var2 | var1; // L: 404
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1937738349"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 408
		this.offset = 0; // L: 409

		for (int var3 = 0; var3 < var2; ++var3) { // L: 410
			int var4 = this.readInt(); // L: 411
			int var5 = this.readInt(); // L: 412
			int var6 = 0; // L: 413
			int var7 = -1640531527; // L: 414

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 415 416 419
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 417
				var6 += var7; // L: 418
			}

			this.offset -= 8; // L: 421
			this.writeInt(var4); // L: 422
			this.writeInt(var5); // L: 423
		}

	} // L: 425

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1314548709"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 428
		this.offset = 0; // L: 429

		for (int var3 = 0; var3 < var2; ++var3) { // L: 430
			int var4 = this.readInt(); // L: 431
			int var5 = this.readInt(); // L: 432
			int var6 = -957401312; // L: 433
			int var7 = -1640531527; // L: 434

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 435 436 439
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 437
				var6 -= var7; // L: 438
			}

			this.offset -= 8; // L: 441
			this.writeInt(var4); // L: 442
			this.writeInt(var5); // L: 443
		}

	} // L: 445

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-6"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 448
		this.offset = var2; // L: 449
		int var5 = (var3 - var2) / 8; // L: 450

		for (int var6 = 0; var6 < var5; ++var6) { // L: 451
			int var7 = this.readInt(); // L: 452
			int var8 = this.readInt(); // L: 453
			int var9 = 0; // L: 454
			int var10 = -1640531527; // L: 455

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 456 457 460
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 458
				var9 += var10; // L: 459
			}

			this.offset -= 8; // L: 462
			this.writeInt(var7); // L: 463
			this.writeInt(var8); // L: 464
		}

		this.offset = var4; // L: 466
	} // L: 467

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "141901592"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 470
		this.offset = var2; // L: 471
		int var5 = (var3 - var2) / 8; // L: 472

		for (int var6 = 0; var6 < var5; ++var6) { // L: 473
			int var7 = this.readInt(); // L: 474
			int var8 = this.readInt(); // L: 475
			int var9 = -957401312; // L: 476
			int var10 = -1640531527; // L: 477

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 478 479 482
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 480
				var9 -= var10; // L: 481
			}

			this.offset -= 8; // L: 484
			this.writeInt(var7); // L: 485
			this.writeInt(var8); // L: 486
		}

		this.offset = var4; // L: 488
	} // L: 489

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-1634492016"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 492
		this.offset = 0; // L: 493
		byte[] var4 = new byte[var3]; // L: 494
		this.readBytes(var4, 0, var3); // L: 495
		BigInteger var5 = new BigInteger(var4); // L: 496
		BigInteger var6 = var5.modPow(var1, var2); // L: 497
		byte[] var7 = var6.toByteArray(); // L: 498
		this.offset = 0; // L: 499
		this.writeShort(var7.length); // L: 500
		this.writeBytes(var7, 0, var7.length); // L: 501
	} // L: 502

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1065581057"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		byte[] var3 = this.array; // L: 506
		int var4 = this.offset; // L: 507
		int var5 = -1; // L: 509

		for (int var6 = var1; var6 < var4; ++var6) { // L: 510
			var5 = var5 >>> 8 ^ crc32Table[(var5 ^ var3[var6]) & 255]; // L: 511
		}

		var5 = ~var5; // L: 513
		this.writeInt(var5); // L: 517
		return var5; // L: 518
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1907450706"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 522
		int var1 = GrandExchangeOfferOwnWorldComparator.method1176(this.array, 0, this.offset); // L: 523
		int var2 = this.readInt(); // L: 524
		return var2 == var1; // L: 525
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	public void method6581(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 530
	} // L: 531

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1524887597"
	)
	public void method6584(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 534
	} // L: 535

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2052004397"
	)
	public void method6594(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 538
	} // L: 539

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "25540074"
	)
	public int method6595() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 542
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-834329867"
	)
	public int method6671() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 546
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1690497653"
	)
	public int method6549() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 550
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2114811487"
	)
	public byte method6597() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 554
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "0"
	)
	public byte method6593() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 558
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "15855750"
	)
	public byte method6559() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 562
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1659882221"
	)
	public void method6600(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 566
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 567
	} // L: 568

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2003773273"
	)
	public void method6619(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 571
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 572
	} // L: 573

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "58"
	)
	public void method6602(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 576
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 577
	} // L: 578

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "429131059"
	)
	public int method6603() {
		this.offset += 2; // L: 581
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 582
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "777271421"
	)
	public int method6604() {
		this.offset += 2; // L: 586
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 587
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1551850883"
	)
	public int method6605() {
		this.offset += 2; // L: 591
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 592
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-896578435"
	)
	public int method6621() {
		this.offset += 2; // L: 596
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 597
		if (var1 > 32767) { // L: 598
			var1 -= 65536;
		}

		return var1; // L: 599
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1905667053"
	)
	public int method6661() {
		this.offset += 2; // L: 603
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 604
		if (var1 > 32767) { // L: 605
			var1 -= 65536;
		}

		return var1; // L: 606
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-111"
	)
	public int method6726() {
		this.offset += 2; // L: 610
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 611
		if (var1 > 32767) { // L: 612
			var1 -= 65536;
		}

		return var1; // L: 613
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "643572871"
	)
	public void method6758(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 617
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 618
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 619
	} // L: 620

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1373250265"
	)
	public int method6610() {
		this.offset += 3; // L: 623
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 624
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1878732628"
	)
	public void method6611(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 628
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 629
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 630
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 631
	} // L: 632

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	public void method6612(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 635
		this.array[++this.offset - 1] = (byte)var1; // L: 636
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 637
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 638
	} // L: 639

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "410819013"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 642
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 643
		this.array[++this.offset - 1] = (byte)var1; // L: 644
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 645
	} // L: 646

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1347830086"
	)
	public int method6613() {
		this.offset += 4; // L: 649
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 650
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1599322510"
	)
	public int method6614() {
		this.offset += 4; // L: 654
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 655
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-248188143"
	)
	public int method6598() {
		this.offset += 4; // L: 659
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 660
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "21226"
	)
	public void method6677(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 664
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 665
}
