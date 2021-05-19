import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("v")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("q")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("z")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1556710419
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
				if ((var0 & 1L) == 1L) { // L: 37
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 38
				}
			}

			crc64Table[var2] = var0; // L: 40
		}

	} // L: 42

	public Buffer(int var1) {
		this.array = WorldMapScaleHandler.ByteArrayPool_getArray(var1); // L: 54
		this.offset = 0; // L: 55
	} // L: 56

	public Buffer(byte[] var1) {
		this.array = var1; // L: 59
		this.offset = 0; // L: 60
	} // L: 61

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-680959814"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 64
			WorldMapSection0.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 65
	} // L: 66

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-6746"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 69
	} // L: 70

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 73
		this.array[++this.offset - 1] = (byte)var1; // L: 74
	} // L: 75

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-524333253"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 78
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-761674832"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 85
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 86
		this.array[++this.offset - 1] = (byte)var1; // L: 87
	} // L: 88

	@ObfuscatedName("ad")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 91
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 92
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 96
	} // L: 97

	@ObfuscatedName("ac")
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2114638693"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 111
	} // L: 112

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1155791680"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 119
		if (var2 >= 0) { // L: 120
			throw new IllegalArgumentException("");
		} else {
			this.offset += AbstractWorldMapIcon.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 121
			this.array[++this.offset - 1] = 0; // L: 122
		}
	} // L: 123

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-409538179"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 126
		if (var2 >= 0) { // L: 127
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 128
			this.offset += AbstractWorldMapIcon.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 129
			this.array[++this.offset - 1] = 0; // L: 130
		}
	} // L: 131

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)V",
		garbageValue = "13"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = class25.method313(var1); // L: 134
		this.array[++this.offset - 1] = 0; // L: 135
		this.writeVarInt(var2); // L: 136
		this.offset += ChatChannel.method2042(this.array, this.offset, var1); // L: 137
	} // L: 138

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1505516276"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 141
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 142

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "925576173"
	)
	public void method6441(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 145
	} // L: 146

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1000118777"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 149
			throw new IllegalArgumentException(); // L: 150
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 152
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 153
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 154
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 155
		}
	} // L: 156

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-122"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 159
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 162
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 163
		} else {
			throw new IllegalArgumentException(); // L: 160
		}
	} // L: 164

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2145686126"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 167
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 170
		} else {
			throw new IllegalArgumentException(); // L: 168
		}
	} // L: 171

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1925411229"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 174
			this.writeByte(var1); // L: 175
		} else if (var1 >= 0 && var1 < 32768) { // L: 178
			this.writeShort(var1 + 32768); // L: 179
		} else {
			throw new IllegalArgumentException(); // L: 182
		}
	} // L: 176 180

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 186
			if ((var1 & -16384) != 0) { // L: 187
				if ((var1 & -2097152) != 0) { // L: 188
					if ((var1 & -268435456) != 0) { // L: 189
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 190
				}

				this.writeByte(var1 >>> 14 | 128); // L: 192
			}

			this.writeByte(var1 >>> 7 | 128); // L: 194
		}

		this.writeByte(var1 & 127); // L: 196
	} // L: 197

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1358138020"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 200
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "12"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 204
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1575802030"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 208
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 209
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-119"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 213
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 214
		if (var1 > 32767) { // L: 215
			var1 -= 65536;
		}

		return var1; // L: 216
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1140346310"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 220
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 221
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-6"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 225
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 226
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "474358183"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 230
		long var3 = (long)this.readInt() & 4294967295L; // L: 231
		return (var1 << 32) + var3; // L: 232
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1218772276"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 236
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-960368875"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 240
			++this.offset; // L: 241
			return null; // L: 242
		} else {
			return this.readStringCp1252NullTerminated(); // L: 244
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "888129368"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 248

		while (this.array[++this.offset - 1] != 0) { // L: 249
		}

		int var2 = this.offset - var1 - 1; // L: 250
		return var2 == 0 ? "" : class17.decodeStringCp1252(this.array, var1, var2); // L: 251 252
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "3"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 256
		if (var1 != 0) { // L: 257
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 258

			while (this.array[++this.offset - 1] != 0) { // L: 259
			}

			int var3 = this.offset - var2 - 1; // L: 260
			return var3 == 0 ? "" : class17.decodeStringCp1252(this.array, var2, var3); // L: 261 262
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 266
		if (var1 != 0) { // L: 267
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 268
			if (var2 + this.offset > this.array.length) { // L: 269
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 271
				int var5 = this.offset; // L: 272
				char[] var6 = new char[var2]; // L: 274
				int var7 = 0; // L: 275
				int var8 = var5; // L: 276

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 277 278 309
					int var10 = var4[var8++] & 255; // L: 279
					if (var10 < 128) { // L: 281
						if (var10 == 0) { // L: 282
							var11 = 65533;
						} else {
							var11 = var10; // L: 283
						}
					} else if (var10 < 192) { // L: 285
						var11 = 65533;
					} else if (var10 < 224) { // L: 286
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 287
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 288
							if (var11 < 128) { // L: 289
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 291
						}
					} else if (var10 < 240) { // L: 293
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 294
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 295
							if (var11 < 2048) { // L: 296
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 298
						}
					} else if (var10 < 248) { // L: 300
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 301
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 302
							if (var11 >= 65536 && var11 <= 1114111) { // L: 303
								var11 = 65533; // L: 304
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 306
						}
					} else {
						var11 = 65533; // L: 308
					}
				}

				String var3 = new String(var6, 0, var7); // L: 311
				this.offset += var2; // L: 314
				return var3; // L: 315
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-105"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 319
		}

	} // L: 320

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2110023250"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 323
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 324 325
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-286680622"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 329
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 330 331
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1606093630"
	)
	public int method6462() {
		int var1 = 0; // L: 335

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 336 337 339
			var1 += 32767; // L: 338
		}

		var1 += var2; // L: 341
		return var1; // L: 342
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "15286"
	)
	public int method6463() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 346 347
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1285482969"
	)
	public int method6464() {
		if (this.array[this.offset] < 0) { // L: 351
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 352
			return var1 == 32767 ? -1 : var1; // L: 353
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-235714575"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 358

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 359 360 362
			var2 = (var2 | var1 & 127) << 7; // L: 361
		}

		return var2 | var1; // L: 364
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-11"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 368
		this.offset = 0; // L: 369

		for (int var3 = 0; var3 < var2; ++var3) { // L: 370
			int var4 = this.readInt(); // L: 371
			int var5 = this.readInt(); // L: 372
			int var6 = 0; // L: 373
			int var7 = -1640531527; // L: 374

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 375 376 379
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 377
				var6 += var7; // L: 378
			}

			this.offset -= 8; // L: 381
			this.writeInt(var4); // L: 382
			this.writeInt(var5); // L: 383
		}

	} // L: 385

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-2038500196"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 388
		this.offset = 0; // L: 389

		for (int var3 = 0; var3 < var2; ++var3) { // L: 390
			int var4 = this.readInt(); // L: 391
			int var5 = this.readInt(); // L: 392
			int var6 = -957401312; // L: 393
			int var7 = -1640531527; // L: 394

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 395 396 399
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 397
				var6 -= var7; // L: 398
			}

			this.offset -= 8; // L: 401
			this.writeInt(var4); // L: 402
			this.writeInt(var5); // L: 403
		}

	} // L: 405

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([IIIS)V",
		garbageValue = "4002"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 408
		this.offset = var2; // L: 409
		int var5 = (var3 - var2) / 8; // L: 410

		for (int var6 = 0; var6 < var5; ++var6) { // L: 411
			int var7 = this.readInt(); // L: 412
			int var8 = this.readInt(); // L: 413
			int var9 = 0; // L: 414
			int var10 = -1640531527; // L: 415

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 416 417 420
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 418
				var9 += var10; // L: 419
			}

			this.offset -= 8; // L: 422
			this.writeInt(var7); // L: 423
			this.writeInt(var8); // L: 424
		}

		this.offset = var4; // L: 426
	} // L: 427

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "669714061"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 430
		this.offset = var2; // L: 431
		int var5 = (var3 - var2) / 8; // L: 432

		for (int var6 = 0; var6 < var5; ++var6) { // L: 433
			int var7 = this.readInt(); // L: 434
			int var8 = this.readInt(); // L: 435
			int var9 = -957401312; // L: 436
			int var10 = -1640531527; // L: 437

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 438 439 442
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 440
				var9 -= var10; // L: 441
			}

			this.offset -= 8; // L: 444
			this.writeInt(var7); // L: 445
			this.writeInt(var8); // L: 446
		}

		this.offset = var4; // L: 448
	} // L: 449

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
		garbageValue = "-6"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 452
		this.offset = 0; // L: 453
		byte[] var4 = new byte[var3]; // L: 454
		this.readBytes(var4, 0, var3); // L: 455
		BigInteger var5 = new BigInteger(var4); // L: 456
		BigInteger var6 = var5.modPow(var1, var2); // L: 457
		byte[] var7 = var6.toByteArray(); // L: 458
		this.offset = 0; // L: 459
		this.writeShort(var7.length); // L: 460
		this.writeBytes(var7, 0, var7.length); // L: 461
	} // L: 462

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1537548493"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = GrandExchangeOffer.method5017(this.array, var1, this.offset); // L: 465
		this.writeInt(var2); // L: 466
		return var2; // L: 467
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-13"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 471
		int var1 = GrandExchangeOffer.method5017(this.array, 0, this.offset); // L: 472
		int var2 = this.readInt(); // L: 473
		return var1 == var2; // L: 474
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1867348974"
	)
	public void method6449(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 479
	} // L: 480

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method6610(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 483
	} // L: 484

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "101"
	)
	public void method6475(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 487
	} // L: 488

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method6476() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 491
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "707714285"
	)
	public int method6477() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 495
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1496339455"
	)
	public int method6478() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 499
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(S)B",
		garbageValue = "1486"
	)
	public byte method6530() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 503
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1088217006"
	)
	public byte method6480() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 507
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1755655115"
	)
	public byte method6526() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 511
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "299150194"
	)
	public void method6482(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 515
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 516
	} // L: 517

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "3134"
	)
	public void method6483(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 520
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 521
	} // L: 522

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-531554995"
	)
	public void method6484(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 525
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 526
	} // L: 527

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1561631359"
	)
	public int method6620() {
		this.offset += 2; // L: 530
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 531
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6486() {
		this.offset += 2; // L: 535
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 536
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "438565580"
	)
	public int method6648() {
		this.offset += 2; // L: 540
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 541
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-86"
	)
	public int method6488() {
		this.offset += 2; // L: 545
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 546
		if (var1 > 32767) { // L: 547
			var1 -= 65536;
		}

		return var1; // L: 548
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	public int method6489() {
		this.offset += 2; // L: 552
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 553
		if (var1 > 32767) { // L: 554
			var1 -= 65536;
		}

		return var1; // L: 555
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "454812532"
	)
	public int method6490() {
		this.offset += 2; // L: 559
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 560
		if (var1 > 32767) { // L: 561
			var1 -= 65536;
		}

		return var1; // L: 562
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1573116718"
	)
	public void method6491(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 566
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 567
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 568
	} // L: 569

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-323412798"
	)
	public int method6492() {
		this.offset += 3; // L: 572
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 573
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-438273456"
	)
	public void method6493(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 577
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 578
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 579
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 580
	} // L: 581

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1197714149"
	)
	public void method6445(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 584
		this.array[++this.offset - 1] = (byte)var1; // L: 585
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 586
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 587
	} // L: 588

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2058155655"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 591
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 592
		this.array[++this.offset - 1] = (byte)var1; // L: 593
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 594
	} // L: 595

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-612164560"
	)
	public int method6481() {
		this.offset += 4; // L: 598
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 599
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1200276089"
	)
	public int method6497() {
		this.offset += 4; // L: 603
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 604
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "248933529"
	)
	public int method6428() {
		this.offset += 4; // L: 608
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 609
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "558288726"
	)
	public void method6499(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 613
		}

	} // L: 614

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	static final void method6602() {
		if (Script.field1055) { // L: 3802
			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3804
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3805
				var1.method2130(); // L: 3806
			}

			Script.field1055 = false; // L: 3809
		}

	} // L: 3811
}
