import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("g")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("n")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("e")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1477627389
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
		this.array = WorldMapArea.ByteArrayPool_getArray(var1); // L: 54
		this.offset = 0; // L: 55
	} // L: 56

	public Buffer(byte[] var1) {
		this.array = var1; // L: 59
		this.offset = 0; // L: 60
	} // L: 61

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 64
			class14.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 65
	} // L: 66

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1298490112"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 69
	} // L: 70

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1931325141"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 73
		this.array[++this.offset - 1] = (byte)var1; // L: 74
	} // L: 75

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-8617"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 78
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 79
		this.array[++this.offset - 1] = (byte)var1; // L: 80
	} // L: 81

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1681728921"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 84
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 85
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 86
		this.array[++this.offset - 1] = (byte)var1; // L: 87
	} // L: 88

	@ObfuscatedName("az")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 91
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 92
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 96
	} // L: 97

	@ObfuscatedName("au")
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-997640464"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 111
	} // L: 112

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1857751198"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 119
		if (var2 >= 0) { // L: 120
			throw new IllegalArgumentException("");
		} else {
			this.offset += GameEngine.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 121
			this.array[++this.offset - 1] = 0; // L: 122
		}
	} // L: 123

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "604540330"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 130
		if (var2 >= 0) { // L: 131
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 132
			this.offset += GameEngine.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 133
			this.array[++this.offset - 1] = 0; // L: 134
		}
	} // L: 135

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-1755058719"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var2 = BufferedNetSocket.method5868(var1); // L: 138
		this.array[++this.offset - 1] = 0; // L: 139
		this.writeVarInt(var2); // L: 140
		this.offset += BufferedSource.method5917(this.array, this.offset, var1); // L: 141
	} // L: 142

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "31"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4]; // L: 145
		}

	} // L: 146

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnu;S)V",
		garbageValue = "128"
	)
	public void method6574(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 149
	} // L: 150

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-22"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 153
			throw new IllegalArgumentException(); // L: 154
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 156
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 157
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 158
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 159
		}
	} // L: 160

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-84"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 163
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 166
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 167
		} else {
			throw new IllegalArgumentException(); // L: 164
		}
	} // L: 168

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-46"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 171
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 174
		} else {
			throw new IllegalArgumentException(); // L: 172
		}
	} // L: 175

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "377594228"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 178
			this.writeByte(var1); // L: 179
		} else if (var1 >= 0 && var1 < 32768) { // L: 182
			this.writeShort(var1 + 32768); // L: 183
		} else {
			throw new IllegalArgumentException(); // L: 186
		}
	} // L: 180 184

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "880940812"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 190
			if ((var1 & -16384) != 0) { // L: 191
				if ((var1 & -2097152) != 0) { // L: 192
					if ((var1 & -268435456) != 0) { // L: 193
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 194
				}

				this.writeByte(var1 >>> 14 | 128); // L: 196
			}

			this.writeByte(var1 >>> 7 | 128); // L: 198
		}

		this.writeByte(var1 & 127); // L: 200
	} // L: 201

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2074552528"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 204
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(S)B",
		garbageValue = "30"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 208
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 212
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 213
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "903567991"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 217
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 218
		if (var1 > 32767) { // L: 219
			var1 -= 65536;
		}

		return var1; // L: 220
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-27"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 224
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 225
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-31"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 229
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 230
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1762871463"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 234
		long var3 = (long)this.readInt() & 4294967295L; // L: 235
		return var3 + (var1 << 32); // L: 236
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 240
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "19859"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 244
			++this.offset; // L: 245
			return null; // L: 246
		} else {
			return this.readStringCp1252NullTerminated(); // L: 248
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1561912666"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 252

		while (this.array[++this.offset - 1] != 0) { // L: 253
		}

		int var2 = this.offset - var1 - 1; // L: 254
		return var2 == 0 ? "" : class303.decodeStringCp1252(this.array, var1, var2); // L: 255 256
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "47"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 260
		if (var1 != 0) { // L: 261
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 262

			while (this.array[++this.offset - 1] != 0) { // L: 263
			}

			int var3 = this.offset - var2 - 1; // L: 264
			return var3 == 0 ? "" : class303.decodeStringCp1252(this.array, var2, var3); // L: 265 266
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1618486887"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 270
		if (var1 != 0) { // L: 271
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 272
			if (var2 + this.offset > this.array.length) { // L: 273
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 275
				int var5 = this.offset; // L: 276
				char[] var6 = new char[var2]; // L: 278
				int var7 = 0; // L: 279
				int var8 = var5; // L: 280

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 281 282 313
					int var10 = var4[var8++] & 255; // L: 283
					if (var10 < 128) { // L: 285
						if (var10 == 0) { // L: 286
							var11 = 65533;
						} else {
							var11 = var10; // L: 287
						}
					} else if (var10 < 192) { // L: 289
						var11 = 65533;
					} else if (var10 < 224) { // L: 290
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 291
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 292
							if (var11 < 128) { // L: 293
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 295
						}
					} else if (var10 < 240) { // L: 297
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 298
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 299
							if (var11 < 2048) { // L: 300
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 302
						}
					} else if (var10 < 248) { // L: 304
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 305
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 306
							if (var11 >= 65536 && var11 <= 1114111) { // L: 307
								var11 = 65533; // L: 308
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 310
						}
					} else {
						var11 = 65533; // L: 312
					}
				}

				String var3 = new String(var6, 0, var7); // L: 315
				this.offset += var2; // L: 318
				return var3; // L: 319
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1339327449"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 323
		}

	} // L: 324

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "137611702"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 327
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 328 329
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "86"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 333
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 334 335
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-56"
	)
	public int method6595() {
		int var1 = 0; // L: 339

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 340 341 343
			var1 += 32767; // L: 342
		}

		var1 += var2; // L: 345
		return var1; // L: 346
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-574632647"
	)
	public int method6596() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 350 351
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1199581115"
	)
	public int method6597() {
		if (this.array[this.offset] < 0) { // L: 355
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 356
			return var1 == 32767 ? -1 : var1; // L: 357
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-81"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 362

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 363 364 366
			var2 = (var2 | var1 & 127) << 7; // L: 365
		}

		return var2 | var1; // L: 368
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-160142401"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 372
		this.offset = 0; // L: 373

		for (int var3 = 0; var3 < var2; ++var3) { // L: 374
			int var4 = this.readInt(); // L: 375
			int var5 = this.readInt(); // L: 376
			int var6 = 0; // L: 377
			int var7 = -1640531527; // L: 378

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 379 380 383
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 381
				var6 += var7; // L: 382
			}

			this.offset -= 8; // L: 385
			this.writeInt(var4); // L: 386
			this.writeInt(var5); // L: 387
		}

	} // L: 389

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "472171978"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 392
		this.offset = 0; // L: 393

		for (int var3 = 0; var3 < var2; ++var3) { // L: 394
			int var4 = this.readInt(); // L: 395
			int var5 = this.readInt(); // L: 396
			int var6 = -957401312; // L: 397
			int var7 = -1640531527; // L: 398

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 399 400 403
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 401
				var6 -= var7; // L: 402
			}

			this.offset -= 8; // L: 405
			this.writeInt(var4); // L: 406
			this.writeInt(var5); // L: 407
		}

	} // L: 409

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "392525104"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 412
		this.offset = var2; // L: 413
		int var5 = (var3 - var2) / 8; // L: 414

		for (int var6 = 0; var6 < var5; ++var6) { // L: 415
			int var7 = this.readInt(); // L: 416
			int var8 = this.readInt(); // L: 417
			int var9 = 0; // L: 418
			int var10 = -1640531527; // L: 419

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 420 421 424
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 422
				var9 += var10; // L: 423
			}

			this.offset -= 8; // L: 426
			this.writeInt(var7); // L: 427
			this.writeInt(var8); // L: 428
		}

		this.offset = var4; // L: 430
	} // L: 431

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "74"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 434
		this.offset = var2; // L: 435
		int var5 = (var3 - var2) / 8; // L: 436

		for (int var6 = 0; var6 < var5; ++var6) { // L: 437
			int var7 = this.readInt(); // L: 438
			int var8 = this.readInt(); // L: 439
			int var9 = -957401312; // L: 440
			int var10 = -1640531527; // L: 441

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 442 443 446
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 444
				var9 -= var10; // L: 445
			}

			this.offset -= 8; // L: 448
			this.writeInt(var7); // L: 449
			this.writeInt(var8); // L: 450
		}

		this.offset = var4; // L: 452
	} // L: 453

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-1040044414"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 456
		this.offset = 0; // L: 457
		byte[] var4 = new byte[var3]; // L: 458
		this.readBytes(var4, 0, var3); // L: 459
		BigInteger var5 = new BigInteger(var4); // L: 460
		BigInteger var6 = var5.modPow(var1, var2); // L: 461
		byte[] var7 = var6.toByteArray(); // L: 462
		this.offset = 0; // L: 463
		this.writeShort(var7.length); // L: 464
		this.writeBytes(var7, 0, var7.length); // L: 465
	} // L: 466

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-83"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = AbstractWorldMapData.method3102(this.array, var1, this.offset); // L: 469
		this.writeInt(var2); // L: 470
		return var2; // L: 471
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "97"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 475
		int var1 = AbstractWorldMapData.method3102(this.array, 0, this.offset); // L: 476
		int var2 = this.readInt(); // L: 477
		return var1 == var2; // L: 478
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2063199020"
	)
	public void method6606(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 483
	} // L: 484

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "21419"
	)
	public void method6639(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 487
	} // L: 488

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 491
	} // L: 492

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-917854085"
	)
	public int method6609() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 495
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1498913775"
	)
	public int method6610() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 499
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1369113061"
	)
	public int method6623() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 503
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1650115963"
	)
	public byte method6584() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 507
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "3"
	)
	public byte method6612() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 511
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1758456111"
	)
	public byte method6678() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 515
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	public void method6614(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 519
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 520
	} // L: 521

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "960934308"
	)
	public void method6771(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 524
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 525
	} // L: 526

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-876556698"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 529
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 530
	} // L: 531

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2095394332"
	)
	public int method6617() {
		this.offset += 2; // L: 534
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 535
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-110506441"
	)
	public int method6748() {
		this.offset += 2; // L: 539
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 540
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "994048780"
	)
	public int method6766() {
		this.offset += 2; // L: 544
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 545
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-112"
	)
	public int method6718() {
		this.offset += 2; // L: 549
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 550
		if (var1 > 32767) { // L: 551
			var1 -= 65536;
		}

		return var1; // L: 552
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1560666274"
	)
	public int method6621() {
		this.offset += 2; // L: 556
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 557
		if (var1 > 32767) { // L: 558
			var1 -= 65536;
		}

		return var1; // L: 559
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1409751382"
	)
	public int method6622() {
		this.offset += 2; // L: 563
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 564
		if (var1 > 32767) { // L: 565
			var1 -= 65536;
		}

		return var1; // L: 566
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "95868174"
	)
	public int method6642() {
		this.offset += 3; // L: 570
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 2] & 255); // L: 571
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1036994244"
	)
	public void method6624(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 575
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 576
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 577
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 578
	} // L: 579

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "855566027"
	)
	public void method6625(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 582
		this.array[++this.offset - 1] = (byte)var1; // L: 583
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 584
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 585
	} // L: 586

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1886994070"
	)
	public void method6754(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 589
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 590
		this.array[++this.offset - 1] = (byte)var1; // L: 591
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 592
	} // L: 593

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	public int method6627() {
		this.offset += 4; // L: 596
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 597
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "81"
	)
	public int method6628() {
		this.offset += 4; // L: 601
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 602
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1473623071"
	)
	public int method6629() {
		this.offset += 4; // L: 606
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 607
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "1"
	)
	public void method6630(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 611
		}

	} // L: 612
}
