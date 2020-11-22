import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("c")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("t")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("q")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -218590717
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
		this.array = NetFileRequest.ByteArrayPool_getArray(var1); // L: 54
		this.offset = 0; // L: 55
	} // L: 56

	public Buffer(byte[] var1) {
		this.array = var1; // L: 59
		this.offset = 0; // L: 60
	} // L: 61

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 64
			WorldMapSectionType.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 65
	} // L: 66

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1071371737"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 69
	} // L: 70

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-952501591"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 73
		this.array[++this.offset - 1] = (byte)var1; // L: 74
	} // L: 75

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-867756497"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 78
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 85
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 86
		this.array[++this.offset - 1] = (byte)var1; // L: 87
	} // L: 88

	@ObfuscatedName("ap")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 91
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 92
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 96
	} // L: 97

	@ObfuscatedName("ad")
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1071731245"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 111
	} // L: 112

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1741941254"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 119
		if (var2 >= 0) { // L: 120
			throw new IllegalArgumentException("");
		} else {
			this.offset += Interpreter.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 121
			this.array[++this.offset - 1] = 0; // L: 122
		}
	} // L: 123

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-79"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 130
		if (var2 >= 0) { // L: 131
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 132
			this.offset += Interpreter.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 133
			this.array[++this.offset - 1] = 0; // L: 134
		}
	} // L: 135

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-462784795"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 140
		int var4 = 0; // L: 141

		for (int var5 = 0; var5 < var3; ++var5) { // L: 142
			char var6 = var1.charAt(var5); // L: 143
			if (var6 <= 127) { // L: 144
				++var4;
			} else if (var6 <= 2047) { // L: 145
				var4 += 2;
			} else {
				var4 += 3; // L: 146
			}
		}

		this.array[++this.offset - 1] = 0; // L: 151
		this.writeVarInt(var4); // L: 152
		this.offset += GrandExchangeOfferUnitPriceComparator.method219(this.array, this.offset, var1); // L: 153
	} // L: 154

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "23"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 157
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 158

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "1203499294"
	)
	public void method5713(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 161
	} // L: 162

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1554829948"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 165
			throw new IllegalArgumentException(); // L: 166
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 168
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 169
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 170
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 171
		}
	} // L: 172

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1476273531"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 175
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 178
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 179
		} else {
			throw new IllegalArgumentException(); // L: 176
		}
	} // L: 180

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1164604575"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 183
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 186
		} else {
			throw new IllegalArgumentException(); // L: 184
		}
	} // L: 187

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1693951904"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 190
			this.writeByte(var1); // L: 191
		} else if (var1 >= 0 && var1 < 32768) { // L: 194
			this.writeShort(var1 + 32768); // L: 195
		} else {
			throw new IllegalArgumentException(); // L: 198
		}
	} // L: 192 196

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "324704874"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 202
			if ((var1 & -16384) != 0) { // L: 203
				if ((var1 & -2097152) != 0) { // L: 204
					if ((var1 & -268435456) != 0) { // L: 205
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 206
				}

				this.writeByte(var1 >>> 14 | 128); // L: 208
			}

			this.writeByte(var1 >>> 7 | 128); // L: 210
		}

		this.writeByte(var1 & 127); // L: 212
	} // L: 213

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 216
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-165326456"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 220
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "101"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 224
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 225
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-17017"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 229
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 230
		if (var1 > 32767) { // L: 231
			var1 -= 65536;
		}

		return var1; // L: 232
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-24"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 236
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 237
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1099796533"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 241
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 242
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-4"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 246
		long var3 = (long)this.readInt() & 4294967295L; // L: 247
		return (var1 << 32) + var3; // L: 248
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1959182219"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 252
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1907625721"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 256
			++this.offset; // L: 257
			return null; // L: 258
		} else {
			return this.readStringCp1252NullTerminated(); // L: 260
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-387094332"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 264

		while (this.array[++this.offset - 1] != 0) { // L: 265
		}

		int var2 = this.offset - var1 - 1; // L: 266
		return var2 == 0 ? "" : class52.decodeStringCp1252(this.array, var1, var2); // L: 267 268
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1484768669"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 272
		if (var1 != 0) { // L: 273
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 274

			while (this.array[++this.offset - 1] != 0) { // L: 275
			}

			int var3 = this.offset - var2 - 1; // L: 276
			return var3 == 0 ? "" : class52.decodeStringCp1252(this.array, var2, var3); // L: 277 278
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "722269119"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 282
		if (var1 != 0) { // L: 283
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 284
			if (var2 + this.offset > this.array.length) { // L: 285
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 287
				int var5 = this.offset; // L: 288
				char[] var6 = new char[var2]; // L: 290
				int var7 = 0; // L: 291
				int var8 = var5; // L: 292

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 293 294 325
					int var10 = var4[var8++] & 255; // L: 295
					if (var10 < 128) { // L: 297
						if (var10 == 0) { // L: 298
							var11 = 65533;
						} else {
							var11 = var10; // L: 299
						}
					} else if (var10 < 192) { // L: 301
						var11 = 65533;
					} else if (var10 < 224) { // L: 302
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 303
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 304
							if (var11 < 128) { // L: 305
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 307
						}
					} else if (var10 < 240) { // L: 309
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 310
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 311
							if (var11 < 2048) { // L: 312
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 314
						}
					} else if (var10 < 248) { // L: 316
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 317
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 318
							if (var11 >= 65536 && var11 <= 1114111) { // L: 319
								var11 = 65533; // L: 320
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 322
						}
					} else {
						var11 = 65533; // L: 324
					}
				}

				String var3 = new String(var6, 0, var7); // L: 327
				this.offset += var2; // L: 330
				return var3; // L: 331
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "0"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 335
		}

	} // L: 336

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "202273494"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 339
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 340 341
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1537644945"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 345
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 346 347
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1848726522"
	)
	public int method5743() {
		int var1 = 0; // L: 351

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 352 353 355
			var1 += 32767; // L: 354
		}

		var1 += var2; // L: 357
		return var1; // L: 358
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-548217756"
	)
	public int method5653() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 362 363
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "25836"
	)
	public int method5851() {
		if (this.array[this.offset] < 0) { // L: 367
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 368
			return var1 == 32767 ? -1 : var1; // L: 369
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-436304655"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 374

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 375 376 378
			var2 = (var2 | var1 & 127) << 7; // L: 377
		}

		return var2 | var1; // L: 380
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-1102921575"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 384
		this.offset = 0; // L: 385

		for (int var3 = 0; var3 < var2; ++var3) { // L: 386
			int var4 = this.readInt(); // L: 387
			int var5 = this.readInt(); // L: 388
			int var6 = 0; // L: 389
			int var7 = -1640531527; // L: 390

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 391 392 395
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 393
				var6 += var7; // L: 394
			}

			this.offset -= 8; // L: 397
			this.writeInt(var4); // L: 398
			this.writeInt(var5); // L: 399
		}

	} // L: 401

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "([IS)V",
		garbageValue = "12847"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 404
		this.offset = 0; // L: 405

		for (int var3 = 0; var3 < var2; ++var3) { // L: 406
			int var4 = this.readInt(); // L: 407
			int var5 = this.readInt(); // L: 408
			int var6 = -957401312; // L: 409
			int var7 = -1640531527; // L: 410

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 411 412 415
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 413
				var6 -= var7; // L: 414
			}

			this.offset -= 8; // L: 417
			this.writeInt(var4); // L: 418
			this.writeInt(var5); // L: 419
		}

	} // L: 421

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "1759120286"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 424
		this.offset = var2; // L: 425
		int var5 = (var3 - var2) / 8; // L: 426

		for (int var6 = 0; var6 < var5; ++var6) { // L: 427
			int var7 = this.readInt(); // L: 428
			int var8 = this.readInt(); // L: 429
			int var9 = 0; // L: 430
			int var10 = -1640531527; // L: 431

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 432 433 436
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 434
				var9 += var10; // L: 435
			}

			this.offset -= 8; // L: 438
			this.writeInt(var7); // L: 439
			this.writeInt(var8); // L: 440
		}

		this.offset = var4; // L: 442
	} // L: 443

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1051721840"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 446
		this.offset = var2; // L: 447
		int var5 = (var3 - var2) / 8; // L: 448

		for (int var6 = 0; var6 < var5; ++var6) { // L: 449
			int var7 = this.readInt(); // L: 450
			int var8 = this.readInt(); // L: 451
			int var9 = -957401312; // L: 452
			int var10 = -1640531527; // L: 453

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 454 455 458
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 456
				var9 -= var10; // L: 457
			}

			this.offset -= 8; // L: 460
			this.writeInt(var7); // L: 461
			this.writeInt(var8); // L: 462
		}

		this.offset = var4; // L: 464
	} // L: 465

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "747250112"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 468
		this.offset = 0; // L: 469
		byte[] var4 = new byte[var3]; // L: 470
		this.readBytes(var4, 0, var3); // L: 471
		BigInteger var5 = new BigInteger(var4); // L: 472
		BigInteger var6 = var5.modPow(var1, var2); // L: 473
		byte[] var7 = var6.toByteArray(); // L: 474
		this.offset = 0; // L: 475
		this.writeShort(var7.length); // L: 476
		this.writeBytes(var7, 0, var7.length); // L: 477
	} // L: 478

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-78"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class4.method81(this.array, var1, this.offset); // L: 481
		this.writeInt(var2); // L: 482
		return var2; // L: 483
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "37281244"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 487
		int var1 = class4.method81(this.array, 0, this.offset); // L: 488
		int var2 = this.readInt(); // L: 489
		return var1 == var2; // L: 490
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "21"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 495
	} // L: 496

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1590454858"
	)
	public void method5664(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 499
	} // L: 500

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-52"
	)
	public void method5665(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 503
	} // L: 504

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-113"
	)
	public int method5619() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 507
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-328274489"
	)
	public int method5650() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 511
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2006554033"
	)
	public int method5668() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 515
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1685286261"
	)
	public byte method5669() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 519
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "56"
	)
	public byte method5688() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 523
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2075373507"
	)
	public byte method5837() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 527
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-8294"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 531
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 532
	} // L: 533

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-105"
	)
	public void method5673(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 536
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 537
	} // L: 538

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-987978019"
	)
	public void method5674(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 541
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 542
	} // L: 543

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	public int method5675() {
		this.offset += 2; // L: 546
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 547
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-7"
	)
	public int method5659() {
		this.offset += 2; // L: 551
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 552
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "537205076"
	)
	public int method5797() {
		this.offset += 2; // L: 556
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 557
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1902869409"
	)
	public int method5678() {
		this.offset += 2; // L: 561
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 562
		if (var1 > 32767) { // L: 563
			var1 -= 65536;
		}

		return var1; // L: 564
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2056151189"
	)
	public int method5679() {
		this.offset += 2; // L: 568
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 569
		if (var1 > 32767) { // L: 570
			var1 -= 65536;
		}

		return var1; // L: 571
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2146489503"
	)
	public void method5680(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 575
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 576
		this.array[++this.offset - 1] = (byte)var1; // L: 577
	} // L: 578

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-520916212"
	)
	public int method5852() {
		this.offset += 3; // L: 581
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 582
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1394035543"
	)
	public void method5682(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 586
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 587
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 588
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 589
	} // L: 590

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1286160069"
	)
	public void method5683(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 593
		this.array[++this.offset - 1] = (byte)var1; // L: 594
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 595
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 596
	} // L: 597

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "861596760"
	)
	public void method5684(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 600
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 601
		this.array[++this.offset - 1] = (byte)var1; // L: 602
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 603
	} // L: 604

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1015676655"
	)
	public int method5685() {
		this.offset += 4; // L: 607
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 608
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "703983648"
	)
	public int method5686() {
		this.offset += 4; // L: 612
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 613
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2147178655"
	)
	public int method5687() {
		this.offset += 4; // L: 617
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 618
	}

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "95"
	)
	public void method5833(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 622
		}

	} // L: 623

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "62"
	)
	public void method5689(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 626
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128);
		}

	} // L: 627
}
