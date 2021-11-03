import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("b")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("y")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("p")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1120023427
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
					var4 >>>= 1;
				}
			}

			crc32Table[var1] = var4;
		}

		crc64Table = new long[256];

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
		this.array = class194.ByteArrayPool_getArray(var1); // L: 69
		this.offset = 0; // L: 70
	} // L: 71

	public Buffer(byte[] var1) {
		this.array = var1; // L: 74
		this.offset = 0; // L: 75
	} // L: 76

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 79
			InvDefinition.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 80
	} // L: 81

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1682380921"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1867178833"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 88
		this.array[++this.offset - 1] = (byte)var1; // L: 89
	} // L: 90

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "52"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 93
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 94
		this.array[++this.offset - 1] = (byte)var1; // L: 95
	} // L: 96

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "28"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 99
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 100
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 101
		this.array[++this.offset - 1] = (byte)var1; // L: 102
	} // L: 103

	@ObfuscatedName("ap")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 107
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 108
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 109
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 110
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 111
	} // L: 112

	@ObfuscatedName("au")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 115
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 116
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 117
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 118
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 119
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 120
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 121
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 122
	} // L: 123

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "123"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 126
	} // L: 127

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1386368008"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 134
		if (var2 >= 0) { // L: 135
			throw new IllegalArgumentException("");
		} else {
			this.offset += class280.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 136
			this.array[++this.offset - 1] = 0; // L: 137
		}
	} // L: 138

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-474138065"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 141
		if (var2 >= 0) { // L: 142
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 143
			this.offset += class280.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 144
			this.array[++this.offset - 1] = 0; // L: 145
		}
	} // L: 146

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "916484170"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 151
		int var4 = 0; // L: 152

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 153
			char var12 = var1.charAt(var5); // L: 154
			if (var12 <= 127) { // L: 155
				++var4;
			} else if (var12 <= 2047) { // L: 156
				var4 += 2;
			} else {
				var4 += 3; // L: 157
			}
		}

		this.array[++this.offset - 1] = 0; // L: 162
		this.writeVarInt(var4); // L: 163
		var4 = this.offset * -288034005; // L: 164
		byte[] var6 = this.array; // L: 166
		int var7 = this.offset; // L: 167
		int var8 = var1.length(); // L: 169
		int var9 = var7; // L: 170

		for (int var10 = 0; var10 < var8; ++var10) { // L: 171
			char var11 = var1.charAt(var10); // L: 172
			if (var11 <= 127) { // L: 173
				var6[var9++] = (byte)var11; // L: 174
			} else if (var11 <= 2047) { // L: 176
				var6[var9++] = (byte)(192 | var11 >> 6); // L: 177
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 178
			} else {
				var6[var9++] = (byte)(224 | var11 >> '\f'); // L: 181
				var6[var9++] = (byte)(128 | var11 >> 6 & 63); // L: 182
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 183
			}
		}

		var5 = var9 - var7; // L: 186
		this.offset = (var5 * -288034005 + var4) * 1120023427; // L: 188
	} // L: 189

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1668528908"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 192
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 193

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1147634113"
	)
	public void method6960(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 196
	} // L: 197

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "8192"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 200
			throw new IllegalArgumentException(); // L: 201
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 203
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 204
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 205
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 206
		}
	} // L: 207

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1853887744"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 210
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 213
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 214
		} else {
			throw new IllegalArgumentException(); // L: 211
		}
	} // L: 215

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1322948126"
	)
	public void method6963(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 218
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 221
		} else {
			throw new IllegalArgumentException(); // L: 219
		}
	} // L: 222

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-642432279"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 225
			this.writeByte(var1); // L: 226
		} else if (var1 >= 0 && var1 < 32768) { // L: 229
			this.writeShort(var1 + 32768); // L: 230
		} else {
			throw new IllegalArgumentException(); // L: 233
		}
	} // L: 227 231

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1155174988"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 237
			if ((var1 & -16384) != 0) { // L: 238
				if ((var1 & -2097152) != 0) { // L: 239
					if ((var1 & -268435456) != 0) { // L: 240
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 241
				}

				this.writeByte(var1 >>> 14 | 128); // L: 243
			}

			this.writeByte(var1 >>> 7 | 128); // L: 245
		}

		this.writeByte(var1 & 127); // L: 247
	} // L: 248

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1818316420"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 251
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "567219171"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 255
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-156888586"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 259
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 260
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 264
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 265
		if (var1 > 32767) { // L: 266
			var1 -= 65536;
		}

		return var1; // L: 267
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 271
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 272
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-662873675"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 276
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 277
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1642712423"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 281
		long var3 = (long)this.readInt() & 4294967295L; // L: 282
		return var3 + (var1 << 32); // L: 283
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-99"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 287
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "92"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 291
			++this.offset; // L: 292
			return null; // L: 293
		} else {
			return this.readStringCp1252NullTerminated(); // L: 295
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2118366594"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 299

		while (this.array[++this.offset - 1] != 0) { // L: 300
		}

		int var2 = this.offset - var1 - 1; // L: 301
		return var2 == 0 ? "" : class264.decodeStringCp1252(this.array, var1, var2); // L: 302 303
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1836215149"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 307
		if (var1 != 0) { // L: 308
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 309

			while (this.array[++this.offset - 1] != 0) { // L: 310
			}

			int var3 = this.offset - var2 - 1; // L: 311
			return var3 == 0 ? "" : class264.decodeStringCp1252(this.array, var2, var3); // L: 312 313
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 317
		if (var1 != 0) { // L: 318
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 319
			if (var2 + this.offset > this.array.length) { // L: 320
				throw new IllegalStateException("");
			} else {
				byte[] var4 = this.array; // L: 322
				int var5 = this.offset; // L: 323
				char[] var6 = new char[var2]; // L: 325
				int var7 = 0; // L: 326
				int var8 = var5; // L: 327

				int var11;
				for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) { // L: 328 329 360
					int var10 = var4[var8++] & 255; // L: 330
					if (var10 < 128) { // L: 332
						if (var10 == 0) { // L: 333
							var11 = 65533;
						} else {
							var11 = var10; // L: 334
						}
					} else if (var10 < 192) { // L: 336
						var11 = 65533;
					} else if (var10 < 224) { // L: 337
						if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 338
							var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 339
							if (var11 < 128) { // L: 340
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 342
						}
					} else if (var10 < 240) { // L: 344
						if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 345
							var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 346
							if (var11 < 2048) { // L: 347
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 349
						}
					} else if (var10 < 248) { // L: 351
						if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 352
							var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 353
							if (var11 >= 65536 && var11 <= 1114111) { // L: 354
								var11 = 65533; // L: 355
							} else {
								var11 = 65533;
							}
						} else {
							var11 = 65533; // L: 357
						}
					} else {
						var11 = 65533; // L: 359
					}
				}

				String var3 = new String(var6, 0, var7); // L: 362
				this.offset += var2; // L: 365
				return var3; // L: 366
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "-19541"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 370
		}

	} // L: 371

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "67024683"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 374
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 375 376
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "58"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 380
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 381 382
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "160"
	)
	public int method6981() {
		int var1 = 0; // L: 386

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 387 388 390
			var1 += 32767; // L: 389
		}

		var1 += var2; // L: 392
		return var1; // L: 393
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1825334288"
	)
	public int method6982() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 397 398
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "74"
	)
	public int method6946() {
		if (this.array[this.offset] < 0) { // L: 402
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 403
			return var1 == 32767 ? -1 : var1; // L: 404
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1116819358"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 409

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 410 411 413
			var2 = (var2 | var1 & 127) << 7; // L: 412
		}

		return var2 | var1; // L: 415
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "0"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 419
		this.offset = 0; // L: 420

		for (int var3 = 0; var3 < var2; ++var3) { // L: 421
			int var4 = this.readInt(); // L: 422
			int var5 = this.readInt(); // L: 423
			int var6 = 0; // L: 424
			int var7 = -1640531527; // L: 425

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 426 427 430
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 428
				var6 += var7; // L: 429
			}

			this.offset -= 8; // L: 432
			this.writeInt(var4); // L: 433
			this.writeInt(var5); // L: 434
		}

	} // L: 436

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-72"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 439
		this.offset = 0; // L: 440

		for (int var3 = 0; var3 < var2; ++var3) { // L: 441
			int var4 = this.readInt(); // L: 442
			int var5 = this.readInt(); // L: 443
			int var6 = -957401312; // L: 444
			int var7 = -1640531527; // L: 445

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 446 447 450
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 448
				var6 -= var7; // L: 449
			}

			this.offset -= 8; // L: 452
			this.writeInt(var4); // L: 453
			this.writeInt(var5); // L: 454
		}

	} // L: 456

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1821183174"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 459
		this.offset = var2; // L: 460
		int var5 = (var3 - var2) / 8; // L: 461

		for (int var6 = 0; var6 < var5; ++var6) { // L: 462
			int var7 = this.readInt(); // L: 463
			int var8 = this.readInt(); // L: 464
			int var9 = 0; // L: 465
			int var10 = -1640531527; // L: 466

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 467 468 471
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 469
				var9 += var10; // L: 470
			}

			this.offset -= 8; // L: 473
			this.writeInt(var7); // L: 474
			this.writeInt(var8); // L: 475
		}

		this.offset = var4; // L: 477
	} // L: 478

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1004860310"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 481
		this.offset = var2; // L: 482
		int var5 = (var3 - var2) / 8; // L: 483

		for (int var6 = 0; var6 < var5; ++var6) { // L: 484
			int var7 = this.readInt(); // L: 485
			int var8 = this.readInt(); // L: 486
			int var9 = -957401312; // L: 487
			int var10 = -1640531527; // L: 488

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 489 490 493
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 491
				var9 -= var10; // L: 492
			}

			this.offset -= 8; // L: 495
			this.writeInt(var7); // L: 496
			this.writeInt(var8); // L: 497
		}

		this.offset = var4; // L: 499
	} // L: 500

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
		garbageValue = "-39"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 503
		this.offset = 0; // L: 504
		byte[] var4 = new byte[var3]; // L: 505
		this.readBytes(var4, 0, var3); // L: 506
		BigInteger var5 = new BigInteger(var4); // L: 507
		BigInteger var6 = var5.modPow(var1, var2); // L: 508
		byte[] var7 = var6.toByteArray(); // L: 509
		this.offset = 0; // L: 510
		this.writeShort(var7.length); // L: 511
		this.writeBytes(var7, 0, var7.length); // L: 512
	} // L: 513

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "651781584"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class117.method2565(this.array, var1, this.offset); // L: 516
		this.writeInt(var2); // L: 517
		return var2; // L: 518
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1732705730"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 522
		int var1 = class117.method2565(this.array, 0, this.offset); // L: 523
		int var2 = this.readInt(); // L: 524
		return var1 == var2; // L: 525
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-803217558"
	)
	public void method7171(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 530
	} // L: 531

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1557647527"
	)
	public void method6993(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 534
	} // L: 535

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "27"
	)
	public void method6947(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 538
	} // L: 539

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-933914321"
	)
	public int method6995() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 542
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1659267158"
	)
	public int method6996() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 546
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "299017"
	)
	public int method6997() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 550
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-466550700"
	)
	public byte method6973() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 554
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1366587411"
	)
	public byte method6999() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 558
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1916872137"
	)
	public byte method7128() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 562
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-355235162"
	)
	public void method7001(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 566
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 567
	} // L: 568

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method6962(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 571
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 572
	} // L: 573

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2013527897"
	)
	public void method7003(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 576
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 577
	} // L: 578

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "329550044"
	)
	public int method7004() {
		this.offset += 2; // L: 581
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 582
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1756257139"
	)
	public int method7120() {
		this.offset += 2; // L: 586
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 587
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	public int method7006() {
		this.offset += 2; // L: 591
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 592
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "123"
	)
	public int method7007() {
		this.offset += 2; // L: 596
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 597
		if (var1 > 32767) { // L: 598
			var1 -= 65536;
		}

		return var1; // L: 599
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2144664606"
	)
	public int method7008() {
		this.offset += 2; // L: 603
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 604
		if (var1 > 32767) { // L: 605
			var1 -= 65536;
		}

		return var1; // L: 606
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-410665583"
	)
	public void method7009(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 610
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 611
		this.array[++this.offset - 1] = (byte)var1; // L: 612
	} // L: 613

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	public void method7010(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 616
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 617
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 618
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 619
	} // L: 620

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1586586045"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 623
		this.array[++this.offset - 1] = (byte)var1; // L: 624
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 625
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 626
	} // L: 627

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1701296195"
	)
	public void method7126(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 630
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 631
		this.array[++this.offset - 1] = (byte)var1; // L: 632
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 633
	} // L: 634

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "268268119"
	)
	public int method7044() {
		this.offset += 4; // L: 637
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 638
	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1588382751"
	)
	public int method7021() {
		this.offset += 4; // L: 642
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 643
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-502850525"
	)
	public int method7015() {
		this.offset += 4; // L: 647
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 648
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "742968975"
	)
	public void method7131(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 652
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 653

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-86"
	)
	public void method7017(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = (byte)(this.array[++this.offset - 1] - 128); // L: 656
		}

	} // L: 657

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfn;",
		garbageValue = "-75"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}
}
