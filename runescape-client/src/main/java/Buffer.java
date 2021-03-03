import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("Buffer")
public class Buffer extends Node {
	@ObfuscatedName("e")
	@Export("crc32Table")
	static int[] crc32Table;
	@ObfuscatedName("l")
	@Export("crc64Table")
	static long[] crc64Table;
	@ObfuscatedName("h")
	@Export("array")
	public byte[] array;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1025364431
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
		this.array = class23.ByteArrayPool_getArray(var1); // L: 58
		this.offset = 0; // L: 59
	} // L: 60

	public Buffer(byte[] var1) {
		this.array = var1; // L: 63
		this.offset = 0; // L: 64
	} // L: 65

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1006665451"
	)
	@Export("releaseArray")
	public void releaseArray() {
		if (this.array != null) { // L: 68
			GrandExchangeOfferWorldComparator.ByteArrayPool_release(this.array);
		}

		this.array = null; // L: 69
	} // L: 70

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-725228990"
	)
	@Export("writeByte")
	public void writeByte(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 73
	} // L: 74

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-631854152"
	)
	@Export("writeShort")
	public void writeShort(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 77
		this.array[++this.offset - 1] = (byte)var1; // L: 78
	} // L: 79

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1328174191"
	)
	@Export("writeMedium")
	public void writeMedium(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 82
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 83
		this.array[++this.offset - 1] = (byte)var1; // L: 84
	} // L: 85

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1001765065"
	)
	@Export("writeInt")
	public void writeInt(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 88
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 89
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 90
		this.array[++this.offset - 1] = (byte)var1; // L: 91
	} // L: 92

	@ObfuscatedName("bj")
	@Export("writeLongMedium")
	public void writeLongMedium(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 95
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 96
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 97
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 98
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 99
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 100
	} // L: 101

	@ObfuscatedName("bn")
	@Export("writeLong")
	public void writeLong(long var1) {
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 56)); // L: 104
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 48)); // L: 105
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 40)); // L: 106
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 32)); // L: 107
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 24)); // L: 108
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 16)); // L: 109
		this.array[++this.offset - 1] = (byte)((int)(var1 >> 8)); // L: 110
		this.array[++this.offset - 1] = (byte)((int)var1); // L: 111
	} // L: 112

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "73"
	)
	@Export("writeBoolean")
	public void writeBoolean(boolean var1) {
		this.writeByte(var1 ? 1 : 0); // L: 115
	} // L: 116

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1281175721"
	)
	@Export("writeStringCp1252NullTerminated")
	public void writeStringCp1252NullTerminated(String var1) {
		int var2 = var1.indexOf(0); // L: 123
		if (var2 >= 0) { // L: 124
			throw new IllegalArgumentException("");
		} else {
			this.offset += ObjectComposition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 125
			this.array[++this.offset - 1] = 0; // L: 126
		}
	} // L: 127

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2045020739"
	)
	@Export("writeStringCp1252NullCircumfixed")
	public void writeStringCp1252NullCircumfixed(String var1) {
		int var2 = var1.indexOf(0); // L: 134
		if (var2 >= 0) { // L: 135
			throw new IllegalArgumentException("");
		} else {
			this.array[++this.offset - 1] = 0; // L: 136
			this.offset += ObjectComposition.encodeStringCp1252(var1, 0, var1.length(), this.array, this.offset); // L: 137
			this.array[++this.offset - 1] = 0; // L: 138
		}
	} // L: 139

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)V",
		garbageValue = "-507866074"
	)
	@Export("writeCESU8")
	public void writeCESU8(CharSequence var1) {
		int var3 = var1.length(); // L: 144
		int var4 = 0; // L: 145

		for (int var5 = 0; var5 < var3; ++var5) { // L: 146
			char var6 = var1.charAt(var5); // L: 147
			if (var6 <= 127) { // L: 148
				++var4;
			} else if (var6 <= 2047) { // L: 149
				var4 += 2;
			} else {
				var4 += 3; // L: 150
			}
		}

		this.array[++this.offset - 1] = 0; // L: 155
		this.writeVarInt(var4); // L: 156
		this.offset += class277.method5192(this.array, this.offset, var1); // L: 157
	} // L: 158

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-491759097"
	)
	@Export("writeBytes")
	public void writeBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			this.array[++this.offset - 1] = var1[var4]; // L: 161
		}

	} // L: 162

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-891045829"
	)
	public void method5683(Buffer var1) {
		this.writeBytes(var1.array, 0, var1.offset); // L: 165
	} // L: 166

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1107107708"
	)
	@Export("writeLengthInt")
	public void writeLengthInt(int var1) {
		if (var1 < 0) { // L: 169
			throw new IllegalArgumentException(); // L: 170
		} else {
			this.array[this.offset - var1 - 4] = (byte)(var1 >> 24); // L: 172
			this.array[this.offset - var1 - 3] = (byte)(var1 >> 16); // L: 173
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 174
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 175
		}
	} // L: 176

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1934189526"
	)
	@Export("writeLengthShort")
	public void writeLengthShort(int var1) {
		if (var1 >= 0 && var1 <= 65535) { // L: 179
			this.array[this.offset - var1 - 2] = (byte)(var1 >> 8); // L: 182
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 183
		} else {
			throw new IllegalArgumentException(); // L: 180
		}
	} // L: 184

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2132929022"
	)
	@Export("writeLengthByte")
	public void writeLengthByte(int var1) {
		if (var1 >= 0 && var1 <= 255) { // L: 187
			this.array[this.offset - var1 - 1] = (byte)var1; // L: 190
		} else {
			throw new IllegalArgumentException(); // L: 188
		}
	} // L: 191

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-415253670"
	)
	@Export("writeSmartByteShort")
	public void writeSmartByteShort(int var1) {
		if (var1 >= 0 && var1 < 128) { // L: 194
			this.writeByte(var1); // L: 195
		} else if (var1 >= 0 && var1 < 32768) { // L: 198
			this.writeShort(var1 + 32768); // L: 199
		} else {
			throw new IllegalArgumentException(); // L: 202
		}
	} // L: 196 200

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "7069"
	)
	@Export("writeVarInt")
	public void writeVarInt(int var1) {
		if ((var1 & -128) != 0) { // L: 206
			if ((var1 & -16384) != 0) { // L: 207
				if ((var1 & -2097152) != 0) { // L: 208
					if ((var1 & -268435456) != 0) { // L: 209
						this.writeByte(var1 >>> 28 | 128);
					}

					this.writeByte(var1 >>> 21 | 128); // L: 210
				}

				this.writeByte(var1 >>> 14 | 128); // L: 212
			}

			this.writeByte(var1 >>> 7 | 128); // L: 214
		}

		this.writeByte(var1 & 127); // L: 216
	} // L: 217

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1432126117"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() {
		return this.array[++this.offset - 1] & 255; // L: 220
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)B",
		garbageValue = "-16"
	)
	@Export("readByte")
	public byte readByte() {
		return this.array[++this.offset - 1]; // L: 224
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "225678000"
	)
	@Export("readUnsignedShort")
	public int readUnsignedShort() {
		this.offset += 2; // L: 228
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 229
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "912230375"
	)
	@Export("readShort")
	public int readShort() {
		this.offset += 2; // L: 233
		int var1 = (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 234
		if (var1 > 32767) { // L: 235
			var1 -= 65536;
		}

		return var1; // L: 236
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-105"
	)
	@Export("readMedium")
	public int readMedium() {
		this.offset += 3; // L: 240
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 241
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "95"
	)
	@Export("readInt")
	public int readInt() {
		this.offset += 4; // L: 245
		return ((this.array[this.offset - 3] & 255) << 16) + (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 2] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 24); // L: 246
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "68"
	)
	@Export("readLong")
	public long readLong() {
		long var1 = (long)this.readInt() & 4294967295L; // L: 250
		long var3 = (long)this.readInt() & 4294967295L; // L: 251
		return (var1 << 32) + var3; // L: 252
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1996547816"
	)
	@Export("readBoolean")
	public boolean readBoolean() {
		return (this.readUnsignedByte() & 1) == 1; // L: 256
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2074077507"
	)
	@Export("readStringCp1252NullTerminatedOrNull")
	public String readStringCp1252NullTerminatedOrNull() {
		if (this.array[this.offset] == 0) { // L: 260
			++this.offset; // L: 261
			return null; // L: 262
		} else {
			return this.readStringCp1252NullTerminated(); // L: 264
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2017763528"
	)
	@Export("readStringCp1252NullTerminated")
	public String readStringCp1252NullTerminated() {
		int var1 = this.offset; // L: 268

		while (this.array[++this.offset - 1] != 0) { // L: 269
		}

		int var2 = this.offset - var1 - 1; // L: 270
		return var2 == 0 ? "" : VertexNormal.decodeStringCp1252(this.array, var1, var2); // L: 271 272
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "586537561"
	)
	@Export("readStringCp1252NullCircumfixed")
	public String readStringCp1252NullCircumfixed() {
		byte var1 = this.array[++this.offset - 1]; // L: 276
		if (var1 != 0) { // L: 277
			throw new IllegalStateException("");
		} else {
			int var2 = this.offset; // L: 278

			while (this.array[++this.offset - 1] != 0) { // L: 279
			}

			int var3 = this.offset - var2 - 1; // L: 280
			return var3 == 0 ? "" : VertexNormal.decodeStringCp1252(this.array, var2, var3); // L: 281 282
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "8221"
	)
	@Export("readCESU8")
	public String readCESU8() {
		byte var1 = this.array[++this.offset - 1]; // L: 286
		if (var1 != 0) {
			throw new IllegalStateException(""); // L: 287
		} else {
			int var2 = this.readVarInt(); // L: 288
			String var3 = Strings.method4327(this.array, this.offset, var2); // L: 290
			this.offset += var2; // L: 291
			return var3; // L: 292
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-199927912"
	)
	@Export("readBytes")
	public void readBytes(byte[] var1, int var2, int var3) {
		for (int var4 = var2; var4 < var3 + var2; ++var4) {
			var1[var4] = this.array[++this.offset - 1]; // L: 296
		}

	} // L: 297

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1063921109"
	)
	@Export("readShortSmart")
	public int readShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 300
		return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - 49152; // L: 301 302
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "342141969"
	)
	@Export("readUShortSmart")
	public int readUShortSmart() {
		int var1 = this.array[this.offset] & 255; // L: 306
		return var1 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - 32768; // L: 307 308
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1617877263"
	)
	public int method5704() {
		int var1 = 0; // L: 312

		int var2;
		for (var2 = this.readUShortSmart(); var2 == 32767; var2 = this.readUShortSmart()) { // L: 313 314 316
			var1 += 32767; // L: 315
		}

		var1 += var2; // L: 318
		return var1; // L: 319
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	public int method5705() {
		return this.array[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort(); // L: 323 324
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1318332981"
	)
	public int method5833() {
		if (this.array[this.offset] < 0) { // L: 328
			return this.readInt() & Integer.MAX_VALUE;
		} else {
			int var1 = this.readUnsignedShort(); // L: 329
			return var1 == 32767 ? -1 : var1; // L: 330
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2047096049"
	)
	@Export("readVarInt")
	public int readVarInt() {
		byte var1 = this.array[++this.offset - 1]; // L: 335

		int var2;
		for (var2 = 0; var1 < 0; var1 = this.array[++this.offset - 1]) { // L: 336 337 339
			var2 = (var2 | var1 & 127) << 7; // L: 338
		}

		return var2 | var1; // L: 341
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-105213348"
	)
	@Export("xteaEncryptAll")
	public void xteaEncryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 345
		this.offset = 0; // L: 346

		for (int var3 = 0; var3 < var2; ++var3) { // L: 347
			int var4 = this.readInt(); // L: 348
			int var5 = this.readInt(); // L: 349
			int var6 = 0; // L: 350
			int var7 = -1640531527; // L: 351

			for (int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) { // L: 352 353 356
				var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]; // L: 354
				var6 += var7; // L: 355
			}

			this.offset -= 8; // L: 358
			this.writeInt(var4); // L: 359
			this.writeInt(var5); // L: 360
		}

	} // L: 362

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "2106116366"
	)
	@Export("xteaDecryptAll")
	public void xteaDecryptAll(int[] var1) {
		int var2 = this.offset / 8; // L: 365
		this.offset = 0; // L: 366

		for (int var3 = 0; var3 < var2; ++var3) { // L: 367
			int var4 = this.readInt(); // L: 368
			int var5 = this.readInt(); // L: 369
			int var6 = -957401312; // L: 370
			int var7 = -1640531527; // L: 371

			for (int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) { // L: 372 373 376
				var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6; // L: 374
				var6 -= var7; // L: 375
			}

			this.offset -= 8; // L: 378
			this.writeInt(var4); // L: 379
			this.writeInt(var5); // L: 380
		}

	} // L: 382

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "6"
	)
	@Export("xteaEncrypt")
	public void xteaEncrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 385
		this.offset = var2; // L: 386
		int var5 = (var3 - var2) / 8; // L: 387

		for (int var6 = 0; var6 < var5; ++var6) { // L: 388
			int var7 = this.readInt(); // L: 389
			int var8 = this.readInt(); // L: 390
			int var9 = 0; // L: 391
			int var10 = -1640531527; // L: 392

			for (int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) { // L: 393 394 397
				var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]; // L: 395
				var9 += var10; // L: 396
			}

			this.offset -= 8; // L: 399
			this.writeInt(var7); // L: 400
			this.writeInt(var8); // L: 401
		}

		this.offset = var4; // L: 403
	} // L: 404

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "([IIII)V",
		garbageValue = "-1639907144"
	)
	@Export("xteaDecrypt")
	public void xteaDecrypt(int[] var1, int var2, int var3) {
		int var4 = this.offset; // L: 407
		this.offset = var2; // L: 408
		int var5 = (var3 - var2) / 8; // L: 409

		for (int var6 = 0; var6 < var5; ++var6) { // L: 410
			int var7 = this.readInt(); // L: 411
			int var8 = this.readInt(); // L: 412
			int var9 = -957401312; // L: 413
			int var10 = -1640531527; // L: 414

			for (int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) { // L: 415 416 419
				var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9; // L: 417
				var9 -= var10; // L: 418
			}

			this.offset -= 8; // L: 421
			this.writeInt(var7); // L: 422
			this.writeInt(var8); // L: 423
		}

		this.offset = var4; // L: 425
	} // L: 426

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "-1400886376"
	)
	@Export("encryptRsa")
	public void encryptRsa(BigInteger var1, BigInteger var2) {
		int var3 = this.offset; // L: 429
		this.offset = 0; // L: 430
		byte[] var4 = new byte[var3]; // L: 431
		this.readBytes(var4, 0, var3); // L: 432
		BigInteger var5 = new BigInteger(var4); // L: 433
		BigInteger var6 = var5.modPow(var1, var2); // L: 434
		byte[] var7 = var6.toByteArray(); // L: 435
		this.offset = 0; // L: 436
		this.writeShort(var7.length); // L: 437
		this.writeBytes(var7, 0, var7.length); // L: 438
	} // L: 439

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1855873704"
	)
	@Export("writeCrc")
	public int writeCrc(int var1) {
		int var2 = Player.method1317(this.array, var1, this.offset); // L: 442
		this.writeInt(var2); // L: 443
		return var2; // L: 444
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "483943428"
	)
	@Export("checkCrc")
	public boolean checkCrc() {
		this.offset -= 4; // L: 448
		int var1 = Player.method1317(this.array, 0, this.offset); // L: 449
		int var2 = this.readInt(); // L: 450
		return var2 == var1; // L: 451
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "110714256"
	)
	public void method5883(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 456
	} // L: 457

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1893210682"
	)
	public void method5778(int var1) {
		this.array[++this.offset - 1] = (byte)(0 - var1); // L: 460
	} // L: 461

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-72732516"
	)
	public void method5931(int var1) {
		this.array[++this.offset - 1] = (byte)(128 - var1); // L: 464
	} // L: 465

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	public int method5776() {
		return this.array[++this.offset - 1] - 128 & 255; // L: 468
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1293461120"
	)
	public int method5717() {
		return 0 - this.array[++this.offset - 1] & 255; // L: 472
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1006009212"
	)
	public int method5720() {
		return 128 - this.array[++this.offset - 1] & 255; // L: 476
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-2124530748"
	)
	public byte method5721() {
		return (byte)(this.array[++this.offset - 1] - 128); // L: 480
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "1450651314"
	)
	public byte method5722() {
		return (byte)(0 - this.array[++this.offset - 1]); // L: 484
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)B",
		garbageValue = "-362009311"
	)
	public byte method5747() {
		return (byte)(128 - this.array[++this.offset - 1]); // L: 488
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1910800344"
	)
	@Export("writeShortLE")
	public void writeShortLE(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 492
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 493
	} // L: 494

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1801053391"
	)
	public void method5725(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 497
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 498
	} // L: 499

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("writeIntME")
	public void writeIntME(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 + 128); // L: 502
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 503
	} // L: 504

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2146834071"
	)
	public int method5727() {
		this.offset += 2; // L: 507
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 508
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-211808457"
	)
	public int method5728() {
		this.offset += 2; // L: 512
		return (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 513
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-25877"
	)
	public int method5729() {
		this.offset += 2; // L: 517
		return ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] - 128 & 255); // L: 518
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "114"
	)
	public int method5730() {
		this.offset += 2; // L: 522
		int var1 = ((this.array[this.offset - 1] & 255) << 8) + (this.array[this.offset - 2] & 255); // L: 523
		if (var1 > 32767) { // L: 524
			var1 -= 65536;
		}

		return var1; // L: 525
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "38246618"
	)
	public int method5731() {
		this.offset += 2; // L: 529
		int var1 = (this.array[this.offset - 1] - 128 & 255) + ((this.array[this.offset - 2] & 255) << 8); // L: 530
		if (var1 > 32767) { // L: 531
			var1 -= 65536;
		}

		return var1; // L: 532
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "166926488"
	)
	public void method5732(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 536
		this.array[++this.offset - 1] = (byte)var1; // L: 537
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 538
	} // L: 539

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-25"
	)
	public int method5788() {
		this.offset += 3; // L: 542
		return (this.array[this.offset - 1] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16); // L: 543
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "115"
	)
	public void method5781(int var1) {
		this.array[++this.offset - 1] = (byte)var1; // L: 547
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 548
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 549
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 550
	} // L: 551

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "99"
	)
	public void method5876(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 554
		this.array[++this.offset - 1] = (byte)var1; // L: 555
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 556
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 557
	} // L: 558

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2087038458"
	)
	public void method5736(int var1) {
		this.array[++this.offset - 1] = (byte)(var1 >> 16); // L: 561
		this.array[++this.offset - 1] = (byte)(var1 >> 24); // L: 562
		this.array[++this.offset - 1] = (byte)var1; // L: 563
		this.array[++this.offset - 1] = (byte)(var1 >> 8); // L: 564
	} // L: 565

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1781461165"
	)
	public int method5895() {
		this.offset += 4; // L: 568
		return (this.array[this.offset - 4] & 255) + ((this.array[this.offset - 3] & 255) << 8) + ((this.array[this.offset - 2] & 255) << 16) + ((this.array[this.offset - 1] & 255) << 24); // L: 569
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1616505089"
	)
	public int method5738() {
		this.offset += 4; // L: 573
		return ((this.array[this.offset - 2] & 255) << 24) + ((this.array[this.offset - 4] & 255) << 8) + (this.array[this.offset - 3] & 255) + ((this.array[this.offset - 1] & 255) << 16); // L: 574
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "331427137"
	)
	public int method5739() {
		this.offset += 4; // L: 578
		return ((this.array[this.offset - 1] & 255) << 8) + ((this.array[this.offset - 4] & 255) << 16) + (this.array[this.offset - 2] & 255) + ((this.array[this.offset - 3] & 255) << 24); // L: 579
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "2003375492"
	)
	public void method5740(byte[] var1, int var2, int var3) {
		for (int var4 = var3 + var2 - 1; var4 >= var2; --var4) { // L: 583
			var1[var4] = this.array[++this.offset - 1];
		}

	} // L: 584
}
