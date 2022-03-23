import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("r")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("x")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("q")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("f")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1151186625
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
				if ((var0 & 1L) == 1L) { // L: 39
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				} else {
					var0 >>>= 1; // L: 40
				}
			}

			crc64Table[var2] = var0; // L: 42
		}

	} // L: 44

	public Buffer(int var1) {
		this.array = class355.ByteArrayPool_getArray(var1); // L: 56
		this.offset = 0; // L: 57
	} // L: 58

	public Buffer(byte[] var1) {
		this.array = var1; // L: 61
		this.offset = 0; // L: 62
	} // L: 63

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 66
			ServerPacket.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 67
	} // L: 68

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "367101248"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 71
	} // L: 72

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2088026667"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 75
		this.array[++this.offset - 1] = (byte)var1; // L: 76
	} // L: 77

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1525771312"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 80
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 81
		this.array[++this.offset - 1] = (byte)var1; // L: 82
	} // L: 83

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-45"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 86
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 87
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 88
		this.array[++this.offset - 1] = (byte)var1; // L: 89
	} // L: 90

	@ObfuscatedName("ap")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 93
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 94
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 98
	} // L: 99

	@ObfuscatedName("ai")
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-217562349"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 113
	} // L: 114

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "768"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 121
		if (var2 >= 0) { // L: 122
			throw new IllegalArgumentException("");
		} else {
			this.offset += NetSocket.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 123
			this.array[++this.offset - 1] = 0; // L: 124
		}
	} // L: 125

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-382951646"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 128
		if (var2 >= 0) { // L: 129
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 130
			this.offset += NetSocket.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 131
			this.array[++this.offset - 1] = 0; // L: 132
		}
	} // L: 133

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "1514369282"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 138
		int var4 = 0; // L: 139

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 140
			char var12 = var1.charAt(var5); // L: 141
			if (var12 <= 127) { // L: 142
				++var4;
			} else if (var12 <= 2047) { // L: 143
				var4 += 2;
			} else {
				var4 += 3; // L: 144
			}
		}

		this.array[++this.offset - 1] = 0; // L: 149
		this.writeVarInt(var4); // L: 150
		var4 = this.offset * 969660737; // L: 151
		byte[] var6 = this.array; // L: 153
		int var7 = this.offset; // L: 154
		int var8 = var1.length(); // L: 156
		int var9 = var7; // L: 157

		for (int var10 = 0; var10 < var8; ++var10) { // L: 158
			char var11 = var1.charAt(var10); // L: 159
			if (var11 <= 127) { // L: 160
				var6[var9++] = (byte)var11; // L: 161
			} else if (var11 <= 2047) { // L: 163
				var6[var9++] = (byte)(192 | var11 >> 6); // L: 164
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 165
			} else {
				var6[var9++] = (byte)(224 | var11 >> '\f'); // L: 168
				var6[var9++] = (byte)(128 | var11 >> 6 & 63); // L: 169
				var6[var9++] = (byte)(128 | var11 & '?'); // L: 170
			}
		}

		var5 = var9 - var7; // L: 173
		this.offset = (var4 + var5 * 969660737) * 1151186625; // L: 175
	} // L: 176

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "969660737"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) { // L: 179
			this.array[++this.offset - 1] = var1[var4];
		}

	} // L: 180

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "-195792372"
	)
	public void method7818(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 183
	} // L: 184

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 187
			throw new IllegalArgumentException(); // L: 188
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 190
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 191
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 192
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 193
		}
	} // L: 194

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "417023489"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 197
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 200
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 201
		} else {
			throw new IllegalArgumentException(); // L: 198
		}
	} // L: 202

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1390922400"
	)
	public void method7756(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 205
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 208
		} else {
			throw new IllegalArgumentException(); // L: 206
		}
	} // L: 209

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2016380670"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 212
			this.writeByte(var1); // L: 213
		} else if (var1 >= 0 && var1 < 32768) { // L: 216
			this.writeShort(var1 + 32768); // L: 217
		} else {
			throw new IllegalArgumentException(); // L: 220
		}
	} // L: 214 218

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1383153261"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 224
			if ((var1 & -16384) != 0) { // L: 225
				if ((var1 & -2097152) != 0) { // L: 226
					if ((var1 & -268435456) != 0) { // L: 227
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 228
				}

				this.writeByte(var1 >>> 14 | 128); // L: 230
			}

			this.writeByte(var1 >>> 7 | 128); // L: 232
		}

		this.writeByte(var1 & 127); // L: 234
	} // L: 235

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1033498878"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 238
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-1324632769"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 242
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1409564993"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 246
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 247
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "657531519"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 251
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 252
		if (var1 > 32767) { // L: 253
			var1 -= 65536;
		}

		return var1; // L: 254
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-107"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 258
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 259
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-109"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 263
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 264
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "789375778"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 268
		long var3 = (long)this.readInt() & 4294967295L; // L: 269
		return (var1 << 32) + var3; // L: 270
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1692337724"
	)
	public float method7965() {
		return Float.intBitsToFloat(this.readInt()); // L: 274
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-82477001"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 278
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-58"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 282
			++this.offset; // L: 283
			return null; // L: 284
		} else {
			return this.readStringCp1252NullTerminated(); // L: 286
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-75"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 290

		while (this.array[++this.offset - 1] != 0) { // L: 291
		}

		int var2 = this.offset - var1 - 1; // L: 292
		return var2 == 0 ? "" : class113.decodeStringCp1252(this.array, var1, var2); // L: 293 294
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-74"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 298
		if (var1 != 0) { // L: 299
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 300

			while (this.array[++this.offset - 1] != 0) { // L: 301
			}

			int var3 = this.offset - var2 - 1; // L: 302
			return var3 == 0 ? "" : class113.decodeStringCp1252(this.array, var2, var3); // L: 303 304
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "37"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 308
		if (var1 != 0) { // L: 309
			throw new IllegalStateException("");
		} else {
			int var2 = this.readVarInt(); // L: 310
			byte[] var4 = this.array; // L: 313
			int var5 = this.offset; // L: 314
			char[] var6 = new char[var2]; // L: 316
			int var7 = 0; // L: 317
			int var8 = var5; // L: 318

			int var11;
			for (int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) { // L: 319 320 351
				int var10 = var4[var8++] & 255; // L: 321
				if (var10 < 128) { // L: 323
					if (var10 == 0) { // L: 324
						var11 = 65533;
					} else {
						var11 = var10; // L: 325
					}
				} else if (var10 < 192) { // L: 327
					var11 = 65533;
				} else if (var10 < 224) { // L: 328
					if (var8 < var9 && (var4[var8] & 192) == 128) { // L: 329
						var11 = (var10 & 31) << 6 | var4[var8++] & 63; // L: 330
						if (var11 < 128) { // L: 331
							var11 = 65533;
						}
					} else {
						var11 = 65533; // L: 333
					}
				} else if (var10 < 240) { // L: 335
					if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) { // L: 336
						var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 337
						if (var11 < 2048) { // L: 338
							var11 = 65533;
						}
					} else {
						var11 = 65533; // L: 340
					}
				} else if (var10 < 248) { // L: 342
					if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) { // L: 343
						var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63; // L: 344
						if (var11 >= 65536 && var11 <= 1114111) { // L: 345
							var11 = 65533; // L: 346
						} else {
							var11 = 65533;
						}
					} else {
						var11 = 65533; // L: 348
					}
				} else {
					var11 = 65533; // L: 350
				}
			}

			String var3 = new String(var6, 0, var7); // L: 353
			this.offset += var2; // L: 356
			return var3; // L: 357
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1458631272"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 361
		}

	} // L: 362

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2097208875"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 365
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 366 367
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2140648366"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 371
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 372 373
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "257872718"
	)
	public int method7775() {
		int var1 = 0; // L: 377

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 378 379 381
			var1 += 32767; // L: 380
		}

		var1 += var2; // L: 383
		return var1; // L: 384
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1236920051"
	)
	public int method7776() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 388 389
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-465686583"
	)
	public int method7742() {
		if (this.array[this.offset] < 0) { // L: 393
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 394
			return var1 == 32767 ? -1 : var1; // L: 395
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "12345678"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 400

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 401 402 404
			var2 = (var2 | var1 & 127) << 7; // L: 403
		}

		return var2 | var1; // L: 406
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "111077489"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 410
		this.offset = 0; // L: 411

		for (int var3 = 0; var3 < var2; ++var3) { // L: 412
			int var4 = this.readInt(); // L: 413
			int var5 = this.readInt(); // L: 414
			int var6 = 0; // L: 415
			int var7 = -1640531527; // L: 416

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 417 418 421
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 419
				var6 += var7; // L: 420
			}

			this.offset -= 8; // L: 423
			this.writeInt(var4); // L: 424
			this.writeInt(var5); // L: 425
		}

	} // L: 427

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1617746307"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 430
		this.offset = 0; // L: 431

		for (int var3 = 0; var3 < var2; ++var3) { // L: 432
			int var4 = this.readInt(); // L: 433
			int var5 = this.readInt(); // L: 434
			int var6 = -957401312; // L: 435
			int var7 = -1640531527; // L: 436

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 437 438 441
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 439
				var6 -= var7; // L: 440
			}

			this.offset -= 8; // L: 443
			this.writeInt(var4); // L: 444
			this.writeInt(var5); // L: 445
		}

	} // L: 447

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-115673654"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 450
		this.offset = var2; // L: 451
		int var5 = (var3 - var2) / 8; // L: 452

		for (int var6 = 0; var6 < var5; ++var6) { // L: 453
			int var7 = this.readInt(); // L: 454
			int var8 = this.readInt(); // L: 455
			int var9 = 0; // L: 456
			int var10 = -1640531527; // L: 457

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 458 459 462
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 460
				var9 += var10; // L: 461
			}

			this.offset -= 8; // L: 464
			this.writeInt(var7); // L: 465
			this.writeInt(var8); // L: 466
		}

		this.offset = var4; // L: 468
	} // L: 469

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "([IIIS)V",
		garbageValue = "-3424"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 472
		this.offset = var2; // L: 473
		int var5 = (var3 - var2) / 8; // L: 474

		for (int var6 = 0; var6 < var5; ++var6) { // L: 475
			int var7 = this.readInt(); // L: 476
			int var8 = this.readInt(); // L: 477
			int var9 = -957401312; // L: 478
			int var10 = -1640531527; // L: 479

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 480 481 484
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 482
				var9 -= var10; // L: 483
			}

			this.offset -= 8; // L: 486
			this.writeInt(var7); // L: 487
			this.writeInt(var8); // L: 488
		}

		this.offset = var4; // L: 490
	} // L: 491

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-589616199"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 494
		this.offset = 0; // L: 495
		byte[] var4 = new byte[var3]; // L: 496
		this.readBytes(var4, 0, var3); // L: 497
		BigInteger var5 = new BigInteger(var4); // L: 498
		BigInteger var6 = var5.modPow(var1, var2); // L: 499
		byte[] var7 = var6.toByteArray(); // L: 500
		this.offset = 0; // L: 501
		this.writeShort(var7.length); // L: 502
		this.writeBytes(var7, 0, var7.length); // L: 503
	} // L: 504

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "81"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = class300.method5768(this.array, var1, this.offset); // L: 507
		this.writeInt(var2); // L: 508
		return var2; // L: 509
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "518058436"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 513
		int var1 = class300.method5768(this.array, 0, this.offset); // L: 514
		int var2 = this.readInt(); // L: 515
		return var2 == var1; // L: 516
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "482067645"
	)
	public void method7786(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 521
	} // L: 522

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1634404689"
	)
	public void method7787(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 525
	} // L: 526

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "113"
	)
	public void method7788(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 529
	} // L: 530

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1554649771"
	)
	public int method7789() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 533
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-243060031"
	)
	public int method7790() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 537
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1303302003"
	)
	public int method7927() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 541
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "7"
	)
	public byte method7792() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 545
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "1"
	)
	public byte method7955() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 549
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "121"
	)
	public byte method7925() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 553
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "578446044"
	)
	public void method7795(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 557
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 558
	} // L: 559

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1274838633"
	)
	public void method7796(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 562
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 563
	} // L: 564

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-10"
	)
	public void method7791(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 567
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 568
	} // L: 569

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-89"
	)
	public int method7798() {
		this.offset += 2; // L: 572
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 573
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-4458"
	)
	public int method7935() {
		this.offset += 2; // L: 577
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 578
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1088098149"
	)
	public int method7971() {
		this.offset += 2; // L: 582
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 583
	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-769215047"
	)
	public int method7769() {
		this.offset += 2; // L: 587
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 588
		if (var1 > 32767) { // L: 589
			var1 -= 65536;
		}

		return var1; // L: 590
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1347269170"
	)
	public int method7802() {
		this.offset += 2; // L: 594
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 595
		if (var1 > 32767) { // L: 596
			var1 -= 65536;
		}

		return var1; // L: 597
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-788053700"
	)
	public void method7803(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 601
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 602
		this.array[++this.offset - 1] = (byte)var1; // L: 603
	} // L: 604

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "690490648"
	)
	public int method7877() {
		this.offset += 3; // L: 607
		return (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 1] & 255) << 16); // L: 608
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-474982434"
	)
	public int method7805() {
		this.offset += 3; // L: 612
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 613
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1204851511"
	)
	public void method7806(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 617
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 618
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 619
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 620
	} // L: 621

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-646414330"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 624
		this.array[++this.offset - 1] = (byte)var1; // L: 625
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 626
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 627
	} // L: 628

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-6"
	)
	public void method7746(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 631
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 632
		this.array[++this.offset - 1] = (byte)var1; // L: 633
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 634
	} // L: 635

	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	public int method7889() {
		this.offset += 4; // L: 638
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 639
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-7883"
	)
	public int method7810() {
		this.offset += 4; // L: 643
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 644
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1708646906"
	)
	public int method7797() {
		this.offset += 4; // L: 648
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 649
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "464396885"
	)
	public void method7812(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 653
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 654
}
